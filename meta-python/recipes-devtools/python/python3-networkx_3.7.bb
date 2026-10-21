# FIXME: the LIC_FILES_CHKSUM values have been updated by 'devtool upgrade'.
# The following is the difference between the old and the new license text.
# Please update the LICENSE value if needed, and summarize the changes in
# the commit message via 'License-Update:' tag.
# (example: 'License-Update: copyright years updated.')
#
# The changes:
#
# --- LICENSE.txt
# +++ LICENSE.txt
# @@ -2,7 +2,7 @@
#  
#  ::
#  
# -   Copyright (c) 2004-2025, NetworkX Developers
# +   Copyright (c) 2004-2026, NetworkX Developers
#     Aric Hagberg <hagberg@lanl.gov>
#     Dan Schult <dschult@colgate.edu>
#     Pieter Swart <swart@lanl.gov>
# 
#

DESCRIPTION = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "http://networkx.github.io/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4ccf59069a708419c8b37163831a4228"

SRC_URI[sha256sum] = "fd77a511bd90f39f3d016351345b52cf5319b813bdca01de3f755d3cca62e96a"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += "\
                   python3-decorator \
                   python3-netclient \
                   python3-compression \
                   python3-numbers \
                   python3-pickle \
                   python3-html \
                   python3-xml \
                   python3-json \
                   python3-profile \
                   python3-threading \
                   "

BBCLASSEXTEND = "native nativesdk"
