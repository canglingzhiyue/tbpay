package com.ut.share.business;

import tb.qnt;

/* loaded from: classes9.dex */
public enum WWMessageType {
    WWMessageTypeDefault("Default"),
    WWMessageTypeText(qnt.TYPE_TEXT),
    WWMessageTypeDetail("Detail"),
    WWMessageTypeShop("Shop"),
    WWMessageTypeImage(qnt.TYPE_IMAGE),
    WWMessageTypeWeitaoQR("WeitaoQR"),
    WWMessageTypeWeitaoAccount("WeitaoAccount"),
    WWMessageTypeWeitao("Weitao");
    
    private String value;

    WWMessageType(String str) {
        this.value = str;
    }

    public static WWMessageType getEnum(String str) {
        WWMessageType[] values;
        for (WWMessageType wWMessageType : values()) {
            if (wWMessageType.value.equals(str)) {
                return wWMessageType;
            }
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
