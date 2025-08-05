package com.alibaba.security.client.smart.core.model.client;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class ClientInfo implements Serializable {
    public AppInfo appInfo;
    public DeviceInfo deviceInfo;
    public long ts = System.currentTimeMillis();
    public String sdkType = "internal";
}
