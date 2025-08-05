package com.alibaba.android.aura.nodemodel;

import com.alibaba.android.aura.nodemodel.subscriberelation.AURASubscribeRelationModel;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAPluginNodeModel implements Serializable {
    @JSONField(name = "bizCode")
    public String bizCode;
    @JSONField(name = "branches")
    public List<com.alibaba.android.aura.nodemodel.branch.a> branches;
    @JSONField(name = "flows")
    public List<com.alibaba.android.aura.nodemodel.workflow.a> flows;
    @JSONField(name = "name")
    public String name;
    public Map<String, AURASubscribeRelationModel> subscribeRelationModel;

    static {
        kge.a(-802943842);
        kge.a(1028243835);
    }
}
