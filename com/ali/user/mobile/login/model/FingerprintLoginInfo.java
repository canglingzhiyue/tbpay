package com.ali.user.mobile.login.model;

import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class FingerprintLoginInfo {
    public boolean disable;
    public long lastUpdateTime;
    public String loginEntrance;
    public Map<String, Boolean> notLeads = new HashMap();
    public boolean open;
    public String showLoginId;
    public String token;
    public long tokenExpireTime;
    public long userId;

    static {
        kge.a(422177287);
    }
}
