package org.ifaa.ifaf.enums;

/* loaded from: classes9.dex */
public enum EnumIfaaAuthType {
    FINGERPRINT((byte) 1),
    IRIS((byte) 2),
    FACE((byte) 4);
    
    private byte value;

    EnumIfaaAuthType(byte b) {
        this.value = b;
    }

    public byte getValue() {
        return this.value;
    }
}
