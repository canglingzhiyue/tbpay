package com.alibaba.android.umf.node.model.v2;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.internal.util.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFPluginContainerNode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = b.TRACK_PAGE_COUNTER_TYPE_PLUGIN)
    public UMFPluginNode plugin;

    static {
        kge.a(1908192004);
        kge.a(1028243835);
    }

    public void onFinishParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb246688", new Object[]{this});
            return;
        }
        UMFPluginNode uMFPluginNode = this.plugin;
        if (uMFPluginNode == null) {
            return;
        }
        uMFPluginNode.onFinishParse();
    }
}
