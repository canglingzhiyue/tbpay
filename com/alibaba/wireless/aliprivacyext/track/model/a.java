package com.alibaba.wireless.aliprivacyext.track.model;

import android.content.Context;
import android.os.Build;
import com.alibaba.wireless.aliprivacyext.f;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements Serializable {
    public String appName;
    public String appPackName;
    public String appVersion;
    public String cpuArch;
    public String mobileModel = Build.MODEL;
    public String manufacturer = Build.MANUFACTURER;
    public String osName = "Android";
    public String osVersion = Build.VERSION.RELEASE;
    public String sdkVersion = "0.10.1";
    public String sdkName = "AliPrivacySDK";

    public a(Context context) {
        this.cpuArch = Build.VERSION.SDK_INT >= 21 ? Arrays.toString(Build.SUPPORTED_ABIS) : Build.CPU_ABI;
        if (context != null) {
            this.appName = f.a(context);
            this.appVersion = f.b(context);
            this.appPackName = context.getPackageName();
        }
    }
}
