package org.ifaa.ifaf.enums;

/* loaded from: classes9.dex */
public enum EnumIfaaPubKeyEncodeAlgorithm {
    KEY_ENCODE_ALG_ECC_NISTP256R1_X962_RAW((byte) 1),
    KEY_ENCODE_ALG_ECC_NISTP256R1_X962_DER((byte) 2),
    KEY_ENCODE_ALG_RSA_2048_PSS_RAW((byte) 3),
    KEY_ENCODE_ALG_RSA_2048_PSS_DER((byte) 4),
    KEY_ENCODE_ALG_RSA_2048_PSS_IFAA((byte) 5);
    
    private byte value;

    EnumIfaaPubKeyEncodeAlgorithm(byte b) {
        this.value = b;
    }

    public byte getValue() {
        return this.value;
    }
}
