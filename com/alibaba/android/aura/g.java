package com.alibaba.android.aura;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.l;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.umf.constants.UMFConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aql;
import tb.aqq;
import tb.arc;
import tb.ard;
import tb.baw;
import tb.bbm;
import tb.kge;

/* loaded from: classes2.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2141a;
    private final q c;
    private final i d;
    private u e;
    private d f;
    private com.alibaba.android.aura.nodemodel.a g;
    private final com.alibaba.android.aura.a h;
    private aql i;
    private final Map<String, IAURAFlowDispatcher> j;
    private final List<IAURAPluginCenter> l;
    private final Map<String, IAURAFlowDispatcher> n;
    private final String b = g.class.getSimpleName();
    private final j m = new j();
    private final Map<String, Class<? extends IAURAFlowDispatcher>> k = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface a {
        void a(IAURAFlowDispatcher iAURAFlowDispatcher, com.alibaba.android.aura.nodemodel.workflow.a aVar, aqq aqqVar);

        void a(String str, String str2, String str3, aqq aqqVar);
    }

    public static /* synthetic */ List a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("563d798c", new Object[]{gVar}) : gVar.l;
    }

    public static /* synthetic */ void a(g gVar, String str, String str2, String str3, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0155a88", new Object[]{gVar, str, str2, str3, aqqVar});
        } else {
            gVar.a(str, str2, str3, aqqVar);
        }
    }

    public static /* synthetic */ String b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c14e84c4", new Object[]{gVar}) : gVar.b;
    }

    static {
        kge.a(1427095594);
        f2141a = true;
    }

    private g(q qVar) {
        a(this.k);
        this.c = qVar;
        this.l = new ArrayList();
        this.j = new HashMap();
        this.f = new d();
        this.h = new com.alibaba.android.aura.a(qVar, this.m);
        this.d = new i();
        this.n = new HashMap();
    }

    private void a(Map<String, Class<? extends IAURAFlowDispatcher>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        map.put("serial", r.class);
        map.put("subscribe", p.class);
    }

    public static g a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("10015298", new Object[]{qVar}) : new g(qVar);
    }

    public j b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("c46eeb1d", new Object[]{this}) : this.m;
    }

    public void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6fb48d", new Object[]{this, uVar});
        } else {
            this.e = uVar;
        }
    }

    public void a(com.alibaba.android.aura.nodemodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd046f49", new Object[]{this, aVar});
            return;
        }
        this.g = aVar;
        this.i = new aql(this.c, this.m, aVar);
        this.h.a(this.i);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        IAURAFlowDispatcher a2 = a("serial", str);
        if (a2 == null) {
            arc.a().a("preloadFlowDispatcher is null!", arc.a.a().a("AURA/performance").b());
            return;
        }
        this.n.put(str, a2);
        com.alibaba.android.aura.nodemodel.workflow.a a3 = this.g.a(str);
        if (a3 == null) {
            arc.a().a("flowNode is null!", arc.a.a().a("AURA/performance").b());
        } else {
            a2.preload(a3);
        }
    }

    public void a(IAURAPluginCenter... iAURAPluginCenterArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26a4b33", new Object[]{this, iAURAPluginCenterArr});
            return;
        }
        this.l.addAll(Arrays.asList(iAURAPluginCenterArr));
        this.h.a(iAURAPluginCenterArr);
    }

    public <DATA> void a(IAURAInputField<DATA> iAURAInputField) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb68a486", new Object[]{this, iAURAInputField});
        } else {
            this.f.a(iAURAInputField);
        }
    }

    private <DATA> void a(String str, DATA data, aqq aqqVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca76fb3", new Object[]{this, str, data, aqqVar, aVar});
        } else if (this.g == null) {
            aVar.a("-1000", "配置文件初始化错误", str, aqqVar);
        } else if (StringUtils.isEmpty(str)) {
            aVar.a(UMFConstants.ErrorCode.WORKFLOW_NOT_FOUND, "FlowCode为空", str, aqqVar);
        } else if (data == null) {
            aVar.a("-6000", "input不能为空", str, aqqVar);
        } else {
            com.alibaba.android.aura.nodemodel.workflow.a a2 = this.g.a(str);
            if (a2 == null) {
                aVar.a(UMFConstants.ErrorCode.WORKFLOW_CONTAIN_NO_EXECUTOR, "FlowCode[" + str + "]不为空，但是在配置里面找不到", str, aqqVar);
                return;
            }
            h hVar = new h(a2, aqqVar, this.d, this.h, this.f, this.c.e());
            String str2 = a2.b;
            if (StringUtils.isEmpty(str2)) {
                aVar.a("-2002", "FlowCode不为空，但是配置中flowType为空", str, hVar);
                return;
            }
            List<AURAExecuteNodeModel> list = a2.c;
            if (list == null || list.isEmpty()) {
                aVar.a("-2003", "FlowCode不为空，但是对应的配置没有Service节点", str, hVar);
                return;
            }
            IAURAFlowDispatcher iAURAFlowDispatcher = this.n.get(str);
            if (iAURAFlowDispatcher == null) {
                iAURAFlowDispatcher = a(str2, str);
            }
            if (iAURAFlowDispatcher == null) {
                aVar.a("-2004", "FlowCode不为空，但是Dispatcher找不到", str, hVar);
                return;
            }
            if (baw.a() && a2.d == null) {
                Context e = this.c.e();
                bbm.a(e, a2.a() + " 流程必须包含切面配置", 0);
            }
            aVar.a(iAURAFlowDispatcher, a2, hVar);
        }
    }

    public <DATA extends Serializable> void a(String str, final DATA data, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed83c955", new Object[]{this, str, data, aqqVar});
        } else {
            a(str, (String) data, a(aqqVar), new a() { // from class: com.alibaba.android.aura.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.aura.g.a
                public void a(IAURAFlowDispatcher iAURAFlowDispatcher, com.alibaba.android.aura.nodemodel.workflow.a aVar, aqq aqqVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8bf4246b", new Object[]{this, iAURAFlowDispatcher, aVar, aqqVar2});
                        return;
                    }
                    if (g.a(g.this) != null && !g.a(g.this).isEmpty()) {
                        Iterator it = g.a(g.this).iterator();
                        while (it.hasNext()) {
                            iAURAFlowDispatcher.registerPluginCenter((IAURAPluginCenter) it.next());
                        }
                    }
                    iAURAFlowDispatcher.setCallback(aqqVar2);
                    iAURAFlowDispatcher.executeFlow(aVar, data, aqqVar2);
                }

                @Override // com.alibaba.android.aura.g.a
                public void a(String str2, String str3, String str4, aqq aqqVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69fb66d5", new Object[]{this, str2, str3, str4, aqqVar2});
                    } else {
                        g.a(g.this, str2, str3, str4, aqqVar2);
                    }
                }
            });
        }
    }

    public boolean a(com.alibaba.android.aura.nodemodel.branch.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe2c1914", new Object[]{this, cVar})).booleanValue() : this.i.a(cVar);
    }

    private IAURAFlowDispatcher a(String str, String str2) {
        IAURAFlowDispatcher iAURAFlowDispatcher = this.j.get(str2);
        if (iAURAFlowDispatcher != null) {
            return iAURAFlowDispatcher;
        }
        IAURAFlowDispatcher iAURAFlowDispatcher2 = this.j.get(str);
        if (iAURAFlowDispatcher2 != null) {
            return iAURAFlowDispatcher2;
        }
        Class<? extends IAURAFlowDispatcher> cls = this.k.get(str);
        if (cls == null) {
            return null;
        }
        try {
            IAURAFlowDispatcher newInstance = cls.newInstance();
            newInstance.onCreate(this.c, new l.a().a(this.h).a(this.d).a(this.g).a(this.e).a(this.f).a(this.i).a(this.m).a());
            this.j.put(newInstance.getIdentifier(str, str2), newInstance);
            return newInstance;
        } catch (Throwable th) {
            ard a2 = arc.a();
            String str3 = this.b;
            a2.c(str3, "getFlowDispatcher", "创建Dispatcher失败|" + th.getMessage());
            return null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (IAURAFlowDispatcher iAURAFlowDispatcher : this.j.values()) {
            iAURAFlowDispatcher.onDestroy();
        }
        this.h.a();
        this.j.clear();
        this.k.clear();
        this.f = null;
        aql aqlVar = this.i;
        if (aqlVar != null) {
            aqlVar.a();
        }
        this.m.a();
        this.n.clear();
    }

    private aqq a(aqq aqqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aqq) ipChange.ipc$dispatch("7908af8e", new Object[]{this, aqqVar}) : aqqVar == null ? new aqq() { // from class: com.alibaba.android.aura.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                }
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                } else {
                    arc.a().c(g.b(g.this), "onError", bVar.toString());
                }
            }
        } : aqqVar;
    }

    private void a(String str, String str2, String str3, aqq aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fb66d5", new Object[]{this, str, str2, str3, aqqVar});
        } else if (aqqVar == null) {
        } else {
            b bVar = new b(0, "AURACoreDomain", str, str2);
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", this.c.d());
            hashMap.put("flowCode", str3);
            bVar.a(hashMap);
            aqqVar.a(bVar);
        }
    }
}
