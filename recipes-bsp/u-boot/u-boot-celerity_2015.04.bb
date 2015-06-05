# Celerity iMX6COM u-boot

require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot with support for Celerity Boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"
COMPATIBLE_MACHINE = "(celerity-imx6com)"

PROVIDES += "u-boot"

PV = "2015.04"

SRCREV = "e8d0511a63d99b4ef8696b80b3595b6648e09328"
SRCBRANCH = "COM_iMX6v2015.04"

SRC_URI = "git://github.com/CelerityEDS/u-boot.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

