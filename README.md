# BashDSL

BashDSL simplifies the creation of well formed and documented shell scripts with a common behavior.

## Example

BashDSL:
```
script create-zip "creates a zip and sets paths within zip ${WORKSPACE}" {

	env WORKSPACE "The Jenkins workspace"

	argument "-o|--out" "Output zip file"

	argument "-d|--dir" "Directory to be zipped"

	{{{
		echo "Compressing files in ${DIR}"

		cd ${DIR}
		zip -r ${OUT} *
	}}}

}
```

will be translated to:

```
#!/bin/bash
#
# (c) michael.wellner@de.ibm.com 2016.
#
# This script creates a zip and sets paths within zip ${WORKSPACE}.
#
# The following environment variables are used by the script:
#
# * WORKSPACE - The Jenkins workspace.
#
# Usage:
# create-zip.sh [ -h | --help | OPTIONS ]
#
# Options:
#   -o|--out
#     Output zip file.
#   -d|--dir
#     Directory to be zipped.
#

# Fail if one of the commands fails
set -e

CURRENTDIR=`pwd`
BASEDIR=$(dirname $0)
OUT=
DIR=


main() {
  cd ${BASEDIR}
  read_variables "$@"
  check_required

  echo "Compressing files in ${DIR}"

  cd ${DIR}
  zip -r ${OUT} *
  cd ${CURRENTDIR}
}

check_required() {
  if [ -z "${WORKSPACE}" ]; then
    >&2 echo "Missing required environment variable: WORKSPACE."
    show_help_and_exit 1
  fi;
  if [ -z "${OUT}" ]; then
    >&2 echo "Missing required parameter: -o|--out."
    show_help_and_exit 1
  fi;
  if [ -z "${DIR}" ]; then
    >&2 echo "Missing required parameter: -d|--dir."
    show_help_and_exit 1
  fi;
}

read_variables() {
  while [[ $# -gt 0 ]]
  do
    key="$1"
    case $key in
      -o|--out)
        OUT="$2"
        shift # past argument
        shift # past argument
        ;;
      -d|--dir)
        DIR="$2"
        shift # past argument
        shift # past argument
        ;;
      -h|--help)
        show_help_and_exit 0;;
      *)
        >&2 echo "Unkown option $1 with value $2."
        echo
        show_help_and_exit 2
        ;;
    esac
  done
}

show_help_and_exit() {
  echo "This script creates a zip and sets paths within zip \${WORKSPACE}."
  echo ""
  echo "The following environment variables are used by the script:"
  echo ""
  echo "* WORKSPACE - The Jenkins workspace. "
  echo ""
  echo "Usage:"
  echo "create-zip.sh [ -h | --help | OPTIONS ]"
  echo ""
  echo "Options:"
  echo "  -o|--out"
  echo "    Output zip file."
  echo "  -d|--dir"
  echo "    Directory to be zipped."
  echo
  sleep 3

  cd ${CURRENTDIR}
  exit $1
}


main "$@"
```

optionally a `README.md` can be created too:

```
# create-zip.sh

This script creates a zip and sets paths within zip ${WORKSPACE}.

The following environment variables are used by the script:

* **WORKSPACE** - The Jenkins workspace.

Usage:

'''
release-create-zip.sh [ -h | --help | OPTIONS ]
'''

Options:
  * **-o|--out** - Output zip file.
  * **-d|--dir** - Directory to be zipped.
```
