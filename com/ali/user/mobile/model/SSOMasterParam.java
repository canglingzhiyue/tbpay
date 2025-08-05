package com.ali.user.mobile.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.TreeMap;
import tb.kge;

/* loaded from: classes2.dex */
public class SSOMasterParam {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAO_KEY_APPKEY = "masterAppKey";
    public static final String TAO_KEY_SSO_TOKEN = "ssoToken";
    public static final String TAO_KEY_SSO_VERSION = "ssoVersion";
    public static final String TAO_KEY_TIMESTAMP = "t";
    public static final String TAO_KEY_USER_ID = "userId";
    public String appKey;
    public String sign;
    public String ssoToken;
    public String ssoVersion;
    public long t;
    public String userId;
    public String uuidKey;

    static {
        kge.a(-1971081558);
    }

    public TreeMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeMap) ipChange.ipc$dispatch("66432adb", new Object[]{this});
        }
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put(TAO_KEY_APPKEY, this.appKey);
        treeMap.put("ssoVersion", this.ssoVersion);
        treeMap.put("t", String.valueOf(this.t));
        treeMap.put("userId", this.userId);
        treeMap.put("ssoToken", this.ssoToken);
        return treeMap;
    }
}
