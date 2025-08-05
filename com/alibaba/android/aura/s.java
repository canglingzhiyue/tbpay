package com.alibaba.android.aura;

import java.io.Serializable;
import tb.aqq;

/* loaded from: classes2.dex */
public interface s {
    void a();

    <DATA extends Serializable> void a(String str, DATA data, aqq aqqVar);

    boolean a(com.alibaba.android.aura.nodemodel.branch.c cVar);

    <DATA> s b(IAURAInputField<DATA> iAURAInputField);

    s b(IAURAPluginCenter... iAURAPluginCenterArr);

    q c();
}
