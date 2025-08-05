package com.ali.user.mobile.rpc.login.model;

import com.ali.user.mobile.info.AppInfo;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class MemberRequestBase implements Serializable {
    public String appName;
    public String appVersion = AppInfo.getInstance().getAndroidAppVersion();
    public String deviceId;
    public Map<String, String> ext;
    public String locale;
    public String sdkVersion;
    public int site;
    public String ttid;
    public String utdid;

    static {
        kge.a(274686472);
        kge.a(1028243835);
    }
}
