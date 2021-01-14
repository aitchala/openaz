SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "C Foreign Function Interface for Python. Interact with almost any C code from Python, based on C-like declarations that you can often copy-paste from header files or documentation."
HOMEPAGE = "http://cffi.readthedocs.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

SRC_URI[md5sum] = "652203cf99faa254efff7fab23c2f3a2"
SRC_URI[sha256sum] = "599a1e8ff057ac530c9ad1778293c665cb81a791421f46922d80a86473c13346"

DEPENDS += "libffi ${PYTHON_PN}-pycparser"

inherit pypi setuptools

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-subprocess \
"

RDEPENDS_${PN}_class-target = " \
    ${PYTHON_PN}-ctypes \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-pycparser \
    ${PYTHON_PN}-shell \
"

BBCLASSEXTEND = "native nativesdk"
