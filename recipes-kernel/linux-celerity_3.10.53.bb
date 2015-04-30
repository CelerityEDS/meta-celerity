# adapted from linux-wandboard.inc, copyright (C) 2015, 2015 Celerity Embedded Design Services, LLC.
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-celerity.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# Celerity branch - based on 3.10.53_1.1.0_ga from Freescale git

SRCBRANCH = "celerity_imx_3.10.53_1.1.0_ga"
SRCREV = "todo"
LOCALVERSION = "_1.1.0_ga-celerity"

COMPATIBLE_MACHINE = "(iMX6COM)"
