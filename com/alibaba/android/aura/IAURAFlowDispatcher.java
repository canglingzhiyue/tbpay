package com.alibaba.android.aura;

import java.io.Serializable;
import tb.aqq;

/* loaded from: classes2.dex */
public interface IAURAFlowDispatcher {
    <DATA extends Serializable> void executeFlow(com.alibaba.android.aura.nodemodel.workflow.a aVar, DATA data, aqq aqqVar);

    String getIdentifier(String str, String str2);

    void onCreate(q qVar, l lVar);

    void onDestroy();

    void preload(com.alibaba.android.aura.nodemodel.workflow.a aVar);

    void registerPluginCenter(IAURAPluginCenter... iAURAPluginCenterArr);

    void setCallback(aqq aqqVar);
}
