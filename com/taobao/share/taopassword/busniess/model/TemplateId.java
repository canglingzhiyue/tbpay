package com.taobao.share.taopassword.busniess.model;

/* loaded from: classes8.dex */
public enum TemplateId {
    ITEM("item"),
    SHOP("shop"),
    WEEX("weex"),
    COUPON("coupon"),
    COMMON("common");
    
    private String templateId;

    TemplateId(String str) {
        this.templateId = str;
    }

    public boolean equals(g gVar) {
        return this.templateId.equals(gVar.toString());
    }

    public boolean equals(String str) {
        return this.templateId.equals(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.templateId;
    }
}
