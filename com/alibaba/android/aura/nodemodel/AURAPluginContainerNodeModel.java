package com.alibaba.android.aura.nodemodel;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.internal.util.b;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAPluginContainerNodeModel implements Serializable {
    @JSONField(name = b.TRACK_PAGE_COUNTER_TYPE_PLUGIN)
    public AURAPluginNodeModel plugin;

    static {
        kge.a(-1754851761);
        kge.a(1028243835);
    }
}
