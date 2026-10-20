# FIXME: the LIC_FILES_CHKSUM values have been updated by 'devtool upgrade'.
# The following is the difference between the old and the new license text.
# Please update the LICENSE value if needed, and summarize the changes in
# the commit message via 'License-Update:' tag.
# (example: 'License-Update: copyright years updated.')
#
# The changes:
#
# --- PKG-INFO
# +++ PKG-INFO
# @@ -1 +1 @@
# -License: Apache License 2.0
# +Project-URL: Documentation, https://grpc.github.io/grpc/python/grpc_channelz.html
# 
#

DESCRIPTION = "Google gRPC channelz"
HOMEPAGE = "https://www.grpc.io/"
SECTION = "devel/python"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8fd338a7c86e84d15fb83217e2288451"

inherit pypi setuptools3

DEPENDS += "python3-grpcio"

SRC_URI[sha256sum] = "84220ef2e7ec0a3792a151b6ffbc70691bf0f09cd009fe734f2946b917565694"

RDEPENDS:${PN} = "python3-grpcio"

BBCLASSEXTEND = "native nativesdk"
