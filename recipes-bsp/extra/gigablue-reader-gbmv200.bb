SUMMARY = "libreader for Gigablue Model ${MACHINE}"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "libsdl"

COMPATIBLE_MACHINE = "gbtrio4k"

SRCDATE = "20190603"

PV = "${SRCDATE}"

SRC_URI = "http://source.mynonpublic.com/gigablue/mv200/gbmv200-libreader-${SRCDATE}.tar.gz"

SRC_URI[md5sum] = "705406661ff0ae56b0d2a00bebfa5428"
SRC_URI[sha256sum] = "087b0b463428f039b5f39f07502b2954da37081686d4aef503de9325adc0e623"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/libreader ${D}/${bindir}
}

do_package_qa() {
}

FILES_${PN}  = "${bindir}/libreader"
