package com.alibaba.android.aura.nodemodel.workflow;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "code")

    /* renamed from: a  reason: collision with root package name */
    public String f2156a;
    @JSONField(name = "type")
    public String b;
    @JSONField(name = "nodes")
    public List<AURAExecuteNodeModel> c;
    @JSONField(name = "aspectExtensions")
    public Map<String, List<AURAExecuteNodeModel>> d;

    static {
        kge.a(1997778169);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2156a;
    }
}
