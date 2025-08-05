package org.ifaa.ifaf.enums;

/* loaded from: classes9.dex */
public enum EnumIfaaOperationType {
    REQUEST("Request"),
    RESPONSE("Response");
    
    private String value;

    EnumIfaaOperationType(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
