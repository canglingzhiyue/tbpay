package com.alibaba.android.umf.node.service.parse.state;

import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.bqq;
import tb.bqr;
import tb.bqs;
import tb.bqt;
import tb.bqu;
import tb.bqv;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends bqv<com.alibaba.android.umf.node.service.parse.state.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends bqs>> f2855a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(TreeNode<RenderComponent> treeNode);
    }

    static {
        kge.a(-1453550615);
        HashMap hashMap = new HashMap();
        f2855a = hashMap;
        hashMap.put("insert", bqq.class);
        f2855a.put("merge", bqr.class);
        f2855a.put("replace", bqt.class);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a41e4ba", new Object[0]);
        }
        b bVar = new b();
        bVar.b(com.alibaba.android.umf.node.service.parse.state.a.a());
        return bVar;
    }

    public void a(String str, bqu bquVar, a aVar) throws Throwable {
        Class<? extends bqs> cls = f2855a.get(str);
        if (cls != null) {
            b(cls.newInstance().a(bquVar, b(), aVar));
        } else {
            arc.a().b("MainStore", "dispatch", "不识别的操作类型");
        }
    }
}
