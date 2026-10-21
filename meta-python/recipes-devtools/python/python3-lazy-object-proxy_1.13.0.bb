# FIXME: the LIC_FILES_CHKSUM values have been updated by 'devtool upgrade'.
# The following is the difference between the old and the new license text.
# Please update the LICENSE value if needed, and summarize the changes in
# the commit message via 'License-Update:' tag.
# (example: 'License-Update: copyright years updated.')
#
# The changes:
#
# --- LICENSE
# +++ LICENSE
# @@ -1,6 +1,6 @@
#  BSD 2-Clause License
#  
# -Copyright (c) 2014-2025, Ionel Cristian Mărieș. All rights reserved.
# +Copyright (c) 2014-2026, Ionel Cristian Mărieș. All rights reserved.
#  
#  Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
#  following conditions are met:
# 
#

SUMMARY = "A fast and thorough lazy object proxy"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"
LICENSE = "BSD-2-Clause"
SECTION = "devel/python"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d907de309286ace60c424a81666867d"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI[sha256sum] = "ce34046cb021d69c72d05ddb83821ecfd4d2d0a5d43a93c5cd01c9e34779cf14"

inherit pypi python_setuptools_build_meta

do_install:append() {
	# contain moddate, makes is non-reproducible
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/lazy_object_proxy/__pycache__/*.cpython-*.pyc
}
