package com.taobao.share.taopassword.genpassword.model;

import com.alipay.mobile.verifyidentity.common.ModuleConstants;

/* loaded from: classes8.dex */
public enum TaoPasswordShareType {
    ShareTypeQQ("QQ"),
    ShareTypeWeixin("Weixin"),
    ShareTypeCopy("Copy"),
    ShareTypeSMS(ModuleConstants.VI_MODULE_NAME_SMS),
    ShareTypeOther("Other");
    
    private String value;

    TaoPasswordShareType(String str) {
        this.value = str;
    }

    public static TaoPasswordShareType getEnum(String str) {
        TaoPasswordShareType[] values;
        for (TaoPasswordShareType taoPasswordShareType : values()) {
            if (taoPasswordShareType.value.equals(str)) {
                return taoPasswordShareType;
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
