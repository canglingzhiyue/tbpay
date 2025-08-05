package com.ali.user.mobile.rpc.login.model;

import tb.kge;

/* loaded from: classes2.dex */
public class PasswordLoginRequest extends LoginRequestBase {
    public String loginId;
    public String password;
    public boolean pwdEncrypted = false;
    public String loginType = "taobao";

    static {
        kge.a(1214230239);
    }
}
