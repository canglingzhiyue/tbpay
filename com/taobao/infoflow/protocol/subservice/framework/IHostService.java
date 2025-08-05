package com.taobao.infoflow.protocol.subservice.framework;

import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.lju;

/* loaded from: classes.dex */
public interface IHostService extends ISubService {
    public static final String SERVICE_NAME = "HostService";

    lju getInvokeCallback();
}
