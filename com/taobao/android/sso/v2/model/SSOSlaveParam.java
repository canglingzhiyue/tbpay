package com.taobao.android.sso.v2.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.TreeMap;
import tb.kge;

/* loaded from: classes6.dex */
public class SSOSlaveParam {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_APPKEY = "slaveAppKey";
    public static final String KEY_SSO_VERSION = "ssoVersion";
    public static final String KEY_TARGET_URL = "targetUrl";
    public static final String KEY_TIMESTAMP = "t";
    public static final String KEY_UUIDKEY = "euuid";
    public String appKey;
    public String sign;
    public String ssoVersion;
    public long t;
    public String targetUrl;
    public String uuidKey;

    static {
        kge.a(2001880287);
    }

    public TreeMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeMap) ipChange.ipc$dispatch("66432adb", new Object[]{this});
        }
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put(KEY_APPKEY, this.appKey);
        treeMap.put("ssoVersion", this.ssoVersion);
        treeMap.put("t", String.valueOf(this.t));
        treeMap.put(KEY_UUIDKEY, this.uuidKey);
        treeMap.put("targetUrl", this.targetUrl);
        return treeMap;
    }
}
