package com.ali.user.mobile.rpc.login.model;

import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LogoutRequest implements Serializable {
    public String apdid;
    public String appKey;
    public Map<String, Object> attributes;
    public String autoLoginToken;
    public String deviceId;
    public String sid;
    public String ttid;
    public String umidToken;
    public String userId;
    public String utdid;

    static {
        kge.a(576344487);
        kge.a(1028243835);
    }
}
