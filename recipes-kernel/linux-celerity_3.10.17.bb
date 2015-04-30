# Adapted from linux-imx.inc, copyright (C) 2015, 2015 Celerity Embedded Design Services, LLC.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for CelerityEDS boards"

SRC_URI = "git://github.com/CelerityEDS/linux-imx.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.1.0+yocto"
SRCBRANCH = "CelerityCOM_iMX6_3.10.17"
SRCREV = "abb2a04f60b6f80a4896dadb3ea4d780144493b4"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(mx6)"
COMPATIBLE_MACHINE = "(celerity_iMX6COM)"