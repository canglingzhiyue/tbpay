package com.alibaba.security.client.smart.core.model.client;

import android.os.Build;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class DeviceInfo implements Serializable {
    public String netWorkType;
    public String osName = "Android";
    public String brand = Build.BRAND;
    public String model = Build.MODEL;
    public String osVersion = Build.VERSION.RELEASE;
}
