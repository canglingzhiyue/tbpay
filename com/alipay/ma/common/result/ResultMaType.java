package com.alipay.ma.common.result;

import com.alipay.ma.decode.DecodeType;

/* loaded from: classes3.dex */
public enum ResultMaType {
    PRODUCT(0, DecodeType.ONECODE.getCodeType()),
    QR(1, DecodeType.QRCODE.getCodeType()),
    GEN3(32768, DecodeType.GEN3.getCodeType()),
    MEDICINE(2, DecodeType.ONECODE.getCodeType()),
    EXPRESS(2, DecodeType.ONECODE.getCodeType()),
    TB_ANTI_FAKE(1, DecodeType.QRCODE.getCodeType()),
    DM(1024, DecodeType.DMCODE.getCodeType()),
    PDF417(2048, DecodeType.PDF417.getCodeType()),
    NARROW(131072, DecodeType.NARROW.getCodeType()),
    ARCODE(65536, DecodeType.ARCODE.getCodeType()),
    HMCODE(262144, DecodeType.HMCODE.getCodeType()),
    WXTINYCODE(524288, DecodeType.WXTINYCODE.getCodeType());
    
    public static final int AR_CODE = 65536;
    public static final int BAR_CODE = 0;
    public static final int DM_CODE = 1024;
    public static final int EXPRESS_CODE = 2;
    public static final int GEN3_CODE = 32768;
    public static final int HM_CODE = 262144;
    public static final int NARROW_CODE = 131072;
    public static final int PDF417_CODE = 2048;
    public static final int QR_CODE = 1;
    public static final int WXTINY_CODE = 524288;
    private int discernType;
    private int type;

    ResultMaType(int i, int i2) {
        this.type = i;
        this.discernType = i2;
    }

    public int getDiscernType() {
        return this.discernType;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }
}
