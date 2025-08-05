package com.alipay.mobile.security.bio.config;

/* loaded from: classes3.dex */
public enum BisRuntimeInfoEnum {
    ASSETS_READY("bEva", 0),
    PROTOCOL_FORMAT("fmt", 1),
    LOCAL_FACE_COMPARE("locFace", 10),
    LOCAL_TEE_FACE("locTEEFace", 11),
    LOCAL_TEE_NO_PAY("locTEENonPayFace", 12),
    LOCAL_REE_PAY("locREEPayFace", 13),
    LOCAL_REE_NO_PAY("locREENonPayFace", 14),
    PROTOCOL_THIN("thinProtocol", 15);
    
    private String mProduct;
    private int mProductID;

    BisRuntimeInfoEnum(String str, int i) {
        this.mProduct = str;
        this.mProductID = i;
    }

    public String getProduct() {
        return this.mProduct;
    }

    public int getProductID() {
        return this.mProductID;
    }

    public void setProduct(String str) {
        this.mProduct = str;
    }

    public void setProductID(int i) {
        this.mProductID = i;
    }
}
