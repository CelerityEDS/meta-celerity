# Adapted from linux-wandboard.inc, copyright (C) 2015, 2015 Celerity Embedded Design Services, LLC.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux kernel for Celerity iMX6COM"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require recipes-kernel/linux/linux-imx.inc

# Put a local version until we have a true SRCREV to point to
SCMVERSION ?= "y"

SRCBRANCH ??= "master"
LOCALVERSION ?= "-${SRCBRANCH}"

# Allow override of CELERITY_GITHUB_MIRROR to make use of
# local repository easier
CELERITY_GITHUB_MIRROR ?= "git://github.com/CelerityEDS/linux-imx.git"

# SRC_URI for celerity kernel
SRC_URI = "${CELERITY_GITHUB_MIRROR};branch=${SRCBRANCH} \
           file://defconfig \
"
