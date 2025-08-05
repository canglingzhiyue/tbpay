package com.alibaba.android.aura.nodemodel;

import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bau;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, com.alibaba.android.aura.nodemodel.workflow.a> f2152a = new HashMap();
    private final Map<String, com.alibaba.android.aura.nodemodel.branch.a> b = new HashMap();

    static {
        kge.a(-537932742);
    }

    public static a a(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("20a0b4de", new Object[]{aURAPluginNodeModel}) : new a(aURAPluginNodeModel);
    }

    private a(AURAPluginNodeModel aURAPluginNodeModel) {
        b(aURAPluginNodeModel);
    }

    private void b(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9a013a", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        List<com.alibaba.android.aura.nodemodel.workflow.a> list = aURAPluginNodeModel.flows;
        if (!bau.a(list)) {
            for (com.alibaba.android.aura.nodemodel.workflow.a aVar : list) {
                this.f2152a.put(aVar.f2156a, aVar);
            }
        }
        List<com.alibaba.android.aura.nodemodel.branch.a> list2 = aURAPluginNodeModel.branches;
        if (bau.a(list2)) {
            return;
        }
        for (com.alibaba.android.aura.nodemodel.branch.a aVar2 : list2) {
            this.b.put(aVar2.f2153a, aVar2);
        }
    }

    public List<AURAExecuteNodeModel> a(com.alibaba.android.aura.nodemodel.workflow.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e2cb7cd2", new Object[]{this, aVar}) : aVar.c;
    }

    public com.alibaba.android.aura.nodemodel.workflow.a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.aura.nodemodel.workflow.a) ipChange.ipc$dispatch("5db82f9f", new Object[]{this, str}) : this.f2152a.get(str);
    }

    public com.alibaba.android.aura.nodemodel.branch.a b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.aura.nodemodel.branch.a) ipChange.ipc$dispatch("bfb63fdd", new Object[]{this, str}) : this.b.get(str);
    }
}
