package com.taobao.login4android.biz.autologin;

import com.ali.user.mobile.model.LoginBaseParam;
import tb.kge;

/* loaded from: classes7.dex */
public class AutoLoginParam extends LoginBaseParam {
    public String apiRefer;
    public boolean isFromChangeAccount;
    public boolean isOldLogin;
    public boolean needBroadcast;
    public boolean restoreSession;
    public String userId;

    static {
        kge.a(328019298);
    }
}
