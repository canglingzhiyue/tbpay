package com.taobao.infoflow.protocol.subservice;

import java.io.Serializable;
import tb.ljs;

/* loaded from: classes7.dex */
public interface ISubService extends Serializable {
    void onCreateService(ljs ljsVar);

    void onDestroyService();
}
