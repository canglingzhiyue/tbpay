package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface IFloatViewDetectService extends ISubService {
    public static final String SERVICE_NAME = "FloatViewDetectService";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface FloatViewType {
    }

    /* loaded from: classes7.dex */
    public interface a {
    }

    void addFloatViewShowListener(a aVar);

    void removeFloatViewShowListener(a aVar);

    String triggerDetect();
}
