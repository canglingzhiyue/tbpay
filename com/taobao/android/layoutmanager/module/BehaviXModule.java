package com.taobao.android.layoutmanager.module;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.b;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.layoutmanager.adapter.impl.l;
import com.taobao.android.layoutmanager.adapter.impl.z;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import java.util.HashMap;
import java.util.Map;
import tb.dqi;
import tb.kge;
import tb.oec;
import tb.ogg;

@CleanAnnotation(name = "clean")
/* loaded from: classes5.dex */
public class BehaviXModule implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<ab, l> f13230a;

    public static void a(ab abVar, String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b6bbda", new Object[]{abVar, str, bHRSolution});
            return;
        }
        l lVar = f13230a.get(abVar);
        if (lVar == null) {
            lVar = new l();
            f13230a.put(abVar, lVar);
        }
        lVar.a(str, bHRSolution);
    }

    static {
        kge.a(2105832113);
        kge.a(-818961104);
        kge.a(1094383823);
        f13230a = new HashMap<>();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void a(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766e62f6", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().commitEnter(a2.c, a2.f, abVar.g() != null ? abVar.g() : abVar.l(), a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void b(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09deb15", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().commitLeave(a2.c, a2.f, a2.k, abVar.g() != null ? abVar.g() : abVar.l(), a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void c(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acd7334", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().commitTap(a2.c, a2.d, a2.e, a2.f, a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void d(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4fcfb53", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().trackScrollStart(a2.c, a2.d, a2.h, a2.i, a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void e(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2c8372", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().trackScrollEnd(a2.c, a2.d, a2.h, a2.i, a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void f(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895c0b91", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().trackAppear(a2.c, a2.d, a2.f, a2.j, a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void g(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38b93b0", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().trackDisAppear(a2.c, a2.d, a2.f, a2.j, a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void h(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbb1bcf", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        b.a().commitRequest(a2.c, a2.d, a2.k, a2.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void i(ab abVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eaa3ee", new Object[]{this, abVar, map});
            return;
        }
        a a2 = a.a(abVar, map);
        try {
            b.a().registerConfig(a2.b, a2.f13232a);
        } catch (Exception e) {
            ogg.b("fail registerConfig:" + e.getMessage());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e
    public void a(final g.c cVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bdb58e", new Object[]{this, cVar, map});
            return;
        }
        com.taobao.android.behavir.a a2 = b.a();
        String a3 = oec.a(map.get("solutionName"), (String) null);
        int a4 = oec.a(map.get(RateNode.TAG), 0);
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        l lVar = f13230a.get(cVar.f19938a);
        if (lVar == null) {
            lVar = new l();
            f13230a.put(cVar.f19938a, lVar);
        }
        BHRSolution a5 = lVar.a(a3);
        if (a5 == null) {
            z zVar = new z(a3, null, a4) { // from class: com.taobao.android.layoutmanager.module.BehaviXModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.layoutmanager.adapter.impl.z, com.taobao.android.behavir.solution.BHRSolution
                public void a(dqi dqiVar, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a96d8b8", new Object[]{this, dqiVar, obj});
                    } else if (cVar.c == null) {
                    } else {
                        cVar.c.a(cVar, obj);
                    }
                }
            };
            lVar.a(a3, zVar);
            a2.registerSolution(a3, zVar);
            return;
        }
        if (!(a5 instanceof z)) {
            a5 = new z(a3, a5, a4);
        }
        lVar.a(a3, a5);
        ((z) a5).a(cVar);
        a2.registerSolution(a3, a5);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f13232a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String[] g;
        public int h;
        public int i;
        public View j;
        public String k;

        static {
            kge.a(228009744);
        }

        public static a a(ab abVar, Map map) {
            aa a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c7805b9", new Object[]{abVar, map});
            }
            a aVar = new a();
            String[] strArr = null;
            aVar.f13232a = oec.a(map.get("bizName"), (String) null);
            aVar.b = oec.a(map.get(e.BIZ_CONFIG), (String) null);
            aVar.c = oec.a(map.get("scene"), (String) null);
            aVar.f = oec.a(map.get("bizId"), (String) null);
            aVar.d = oec.a(map.get("actionName"), (String) null);
            aVar.e = oec.a(map.get(e.ACTION_ARGS), (String) null);
            aVar.h = oec.a(map.get(e.OFFSETX), 0);
            aVar.i = oec.a(map.get(e.OFFSETY), 0);
            aVar.k = oec.a(map.get(e.REQUEST_ID), (String) null);
            Object obj = map.get(e.BIZ_ARGS);
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                strArr = new String[map2.size()];
                int i = 0;
                for (Map.Entry entry : map2.entrySet()) {
                    strArr[i] = ((String) entry.getKey()) + "=" + entry.getValue();
                    i++;
                }
            }
            aVar.g = strArr;
            int a3 = oec.a(map.get("target"), 0);
            if (a3 > 0 && (a2 = abVar.a(a3)) != null) {
                aVar.j = a2.x();
            }
            return aVar;
        }
    }

    public static void commitEnter(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14094d97", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().a(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void commitLeave(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3459b98", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().b(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void commitTap(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd8e9ec", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().c(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void trackScrollStart(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e8b94e", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().d(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void trackScrollEnd(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea939ff5", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().e(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void trackAppear(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5b9498", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().f(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void trackDisAppear(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd91ba0", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().g(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void commitRequest(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6015900", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().h(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void registerConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5026233", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().i(cVar.f19938a, (Map) cVar.b);
        }
    }

    public static void onSolution(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521af1e0", new Object[]{cVar});
        } else if (!(cVar.b instanceof Map)) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().c().a(cVar, (Map) cVar.b);
        }
    }

    public static void clean(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f1097", new Object[]{abVar});
            return;
        }
        l remove = f13230a.remove(abVar);
        if (remove == null) {
            return;
        }
        HashMap<String, BHRSolution> a2 = remove.a();
        if (a2 != null) {
            com.taobao.android.behavir.a a3 = b.a();
            for (Map.Entry<String, BHRSolution> entry : a2.entrySet()) {
                a3.unRegisterSolution(entry.getKey(), entry.getValue());
            }
        }
        remove.b();
    }
}
