# Adapted from linux-imx.inc, copyright (C) 2015, 2015 Celerity Embedded Design Services, LLC.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for CelerityEDS boards"

SRC_URI = "git://github.com/CelerityEDS/linux-imx.git;protocol=http;branch=${SRCBRANCH} \
           file://defconfig"

SRCBRANCH = "CelerityCOM_iMX6_3.10.17"
SRCREV = "8e8b18cb9fc4885d95cc4c271e0dc863d22aa93b"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(mx6)"
COMPATIBLE_MACHINE = "(celerity-imx6com)"
