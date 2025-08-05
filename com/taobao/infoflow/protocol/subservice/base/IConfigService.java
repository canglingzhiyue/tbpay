package com.taobao.infoflow.protocol.subservice.base;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes.dex */
public interface IConfigService extends ISubService {
    public static final String SERVICE_NAME = "ConfigService";

    boolean getBooleanValue(String str, boolean z);

    String getConfig(String str, String str2, String str3);

    float getFloatValue(String str, float f);

    int getIntValue(String str, int i);

    String getString(String str, String str2);
}
