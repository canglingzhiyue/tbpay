package org.ifaa.ifaf.enums;

/* loaded from: classes9.dex */
public enum EnumIfaaSignAlgorithm {
    SIGN_ALG_ECDSA_SHA256_RAW((byte) 1),
    SIGN_ALG_ECDSA_SHA256_DER((byte) 2),
    SIGN_ALG_RSA_SHA256_RAW((byte) 3),
    SIGN_ALG_RSA_SHA256_DER((byte) 4),
    SIGN_ALG_SHA256_PKCS7((byte) 5);
    
    private byte value;

    EnumIfaaSignAlgorithm(byte b) {
        this.value = b;
    }

    public byte getValue() {
        return this.value;
    }
}
