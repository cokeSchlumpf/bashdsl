#!/bin/bash
#
# (c) michael.wellner@de.ibm.com 2015.
#
# This script downloads a file from a remote host using scp with ssh-key identification.
# 
# Usage:
# artifact-download [ -h | --help | OPTIONS ]
# 
# Options:
#   -h|--host
#     Source system's hostname.
#   -u|--user
#     Source systems's username to login.
#   -s|--src
#     Path to file on source system.
#   -p|--port
#     Optional. Default: 22.
#     SSH Port.
#   -d|--dest
#     Optional. Default: ${WORKSPACE}.
#     Path to file on this system.
#   -i|--id
#     Optional. Default: ~/.ssh/id_rsa.
#     Private SSH key identification file.
#

HOST=
USER=
SRC=
PORT=
DEST=
ID=

main() {
  read_variables $@
  check_required
  init_defaults
  
  BASENAME=\"${WORKSPACE:-\"/tmp\"}/`basename ${SRC_PATH}`\"
  
  # We do not use directly transfer from SRC to DEST due to the missing option of two src and host port with scp.
  scp \
    -i ~/.ssh/id_rsa \
    -P ${SRC_PORT} \
    -o StrictHostKeyChecking=no \
    -o UserKnownHostsFile=/dev/null \
    ${SRC_USER}@${SRC}:${SRC_PATH} ${BASENAME} \
      && echo \"Executing command ${COMMAND}\" \
      && eval \"${COMMAND}\" \
      && scp \
        -i ~/.ssh/id_rsa \
        -P ${DEST_PORT} \
        -o StrictHostKeyChecking=no \
        -o UserKnownHostsFile=/dev/null \
        ${BASENAME} ${DEST_USER}@${DEST}:${DEST_PATH} \
        && rm -rf ${BASENAME}
}

check_required() {
  if [ -z "${HOST}"]; then
    >&2 echo "Missing required parameter: -h|--host."
    show_help_and_exit 1
  fi;
  if [ -z "${USER}"]; then
    >&2 echo "Missing required parameter: -u|--user."
    show_help_and_exit 1
  fi;
  if [ -z "${SRC}"]; then
    >&2 echo "Missing required parameter: -s|--src."
    show_help_and_exit 1
  fi;
}

init_defaults() {
	if [ -z "${PORT}"]; then
	  PORT="22"
	fi;
	if [ -z "${DEST}"]; then
	  DEST="${WORKSPACE}"
	fi;
	if [ -z "${ID}"]; then
	  ID="~/.ssh/id_rsa"
	fi;
}

read_variables() {
  while [[ $# > 0 ]]
  do
    key="$1"
    case $key in
      -h|--host)
        HOST="$2";;
      -u|--user)
        USER="$2";;
      -s|--src)
        SRC="$2";;
      -p|--port)
        PORT="$2";;
      -d|--dest)
        DEST="$2";;
      -i|--id)
        ID="$2";;
      -h|--help)
        show_help_and_exit 0;;
      *)
        >&2 echo "Unkown option $1 with value $2."
        echo
        show_help_and_exit 2
        ;;
    esac
    shift # past argument
    shift # past argument
  done
}

show_help_and_exit() {
  echo "This script downloads a file from a remote host using scp with ssh-key identification."
  echo ""
  echo "Usage:"
  echo "artifact-download [ -h | --help | OPTIONS ]"
  echo ""
  echo "Options:"
  echo "  -h|--host"
  echo "    Source system's hostname."
  echo "  -u|--user"
  echo "    Source systems's username to login."
  echo "  -s|--src"
  echo "    Path to file on source system."
  echo "  -p|--port"
  echo "    Optional. Default: 22."
  echo "    SSH Port."
  echo "  -d|--dest"
  echo "    Optional. Default: ${WORKSPACE}."
  echo "    Path to file on this system."
  echo "  -i|--id"
  echo "    Optional. Default: ~/.ssh/id_rsa."
  echo "    Private SSH key identification file."
  echo
  sleep 3
  exit $1
}

main $@
