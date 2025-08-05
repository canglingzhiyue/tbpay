package com.alipay.ma.decode;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public enum DecodeType {
    EAN13(1),
    EAN8(2),
    UPCA(4),
    UPCE(8),
    EAN14(128),
    CODE39(16),
    CODE93(256),
    CODE128(32),
    ITF(64),
    QRCODE(512),
    DMCODE(1024),
    PDF417(2048),
    GEN3(32768),
    NARROW(131072),
    HMCODE(262144),
    ARCODE(65536),
    WXTINYCODE(524288),
    ONECODE((((((((EAN13.codeType | EAN8.codeType) | UPCA.codeType) | UPCE.codeType) | CODE39.codeType) | CODE128.codeType) | ITF.codeType) | EAN14.codeType) | CODE93.codeType),
    FASTMAIL(CODE39.codeType | CODE128.codeType),
    PRODUCT(ONECODE.codeType),
    MEDICINE(ONECODE.codeType),
    EXPRESS(ONECODE.codeType),
    ALLQRCODE(QRCODE.codeType),
    ALLBARCODE(ONECODE.codeType),
    ALLLOTTERYCODE(DMCODE.codeType | PDF417.codeType),
    ALLCODE((((ONECODE.codeType | ALLQRCODE.codeType) | DMCODE.codeType) | ARCODE.codeType) | PDF417.codeType),
    DEFAULTCODE(((((ONECODE.codeType | ALLQRCODE.codeType) | ARCODE.codeType) | DMCODE.codeType) | PDF417.codeType) | HMCODE.codeType);
    
    int codeType;

    DecodeType(int i) {
        this.codeType = i;
    }

    public static int getCode(DecodeType decodeType, String str) {
        if (decodeType == null && str == null) {
            return DEFAULTCODE.getCodeType();
        }
        int codeType = decodeType != null ? decodeType.getCodeType() : 0;
        if (str == null) {
            return codeType;
        }
        if (str.contains("default")) {
            codeType |= DEFAULTCODE.getCodeType();
        }
        if (str.contains("barCode")) {
            codeType |= ALLBARCODE.getCodeType();
        }
        if (str.contains("qrCode")) {
            codeType |= ALLQRCODE.getCodeType();
        }
        if (str.contains("dmCode")) {
            codeType |= DMCODE.getCodeType();
        }
        if (str.contains("pdf417Code")) {
            codeType |= PDF417.getCodeType();
        }
        if (str.contains("narrowCode")) {
            codeType |= NARROW.getCodeType();
        }
        if (str.contains("hmCode")) {
            codeType |= HMCODE.getCodeType();
        }
        return str.contains("wxTinyCode") ? codeType | WXTINYCODE.getCodeType() : codeType;
    }

    public static DecodeType[] getCodeTypes(DecodeType decodeType, String str) {
        if (decodeType == null && str == null) {
            return new DecodeType[]{DEFAULTCODE};
        }
        ArrayList arrayList = new ArrayList();
        if (decodeType != null) {
            arrayList.add(decodeType);
        }
        if (str != null) {
            if (str.contains("default")) {
                arrayList.add(DEFAULTCODE);
            }
            if (str.contains("barCode")) {
                arrayList.add(ALLBARCODE);
            }
            if (str.contains("qrCode")) {
                arrayList.add(ALLQRCODE);
            }
            if (str.contains("dmCode")) {
                arrayList.add(DMCODE);
            }
            if (str.contains("pdf417Code")) {
                arrayList.add(PDF417);
            }
            if (str.contains("narrowCode")) {
                arrayList.add(NARROW);
            }
            if (str.contains("hmCode")) {
                arrayList.add(HMCODE);
            }
        }
        if (str.length() == 0) {
            arrayList.add(DEFAULTCODE);
        }
        return (DecodeType[]) arrayList.toArray(new DecodeType[arrayList.size()]);
    }

    public int getCodeType() {
        return this.codeType;
    }
}
