package com.ali.user.mobile.login;

/* loaded from: classes2.dex */
public enum AccountType {
    TAOBAO_ACCOUNT("taobao");
    
    private String type;

    AccountType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }
}
