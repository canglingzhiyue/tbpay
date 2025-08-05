package com.taobao.android.detail.sdk.model.node;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final NodeBundle f10300a;

    static {
        kge.a(1502232328);
    }

    public a(NodeBundle nodeBundle) {
        this.f10300a = nodeBundle;
        tpc.a("com.taobao.android.detail.sdk.model.node.NodeBundleWrapper");
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f10300a.trackParams;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        NodeBundle nodeBundle = this.f10300a;
        return (nodeBundle == null || nodeBundle.itemNode == null || this.f10300a.itemNode.itemId == null) ? "" : this.f10300a.itemNode.itemId;
    }
}
