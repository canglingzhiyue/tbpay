package org.ifaa.ifaf.enums;

/* loaded from: classes9.dex */
public enum EnumIfaaOperation {
    REGISTER("Reg"),
    AUTHENTICATION("Auth"),
    DEREGISTER("DeReg");
    
    private String value;

    EnumIfaaOperation(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
