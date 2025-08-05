package com.taobao.android.layoutmanager.adapter.impl;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.dqi;
import tb.kge;
import tb.oec;
import tb.ogg;

/* loaded from: classes5.dex */
public class z implements BHRSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13163a;
    private g.c b;
    private String c;
    private BHRSolution d;
    private int e;
    private long f;

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Map<String, String> h(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3eb3e58", new Object[]{this, dqiVar});
        }
        return null;
    }

    static {
        kge.a(-1419853505);
        kge.a(1685160846);
        f13163a = false;
    }

    public void a(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16567517", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public z(String str, BHRSolution bHRSolution, int i) {
        this.c = str;
        this.d = bHRSolution;
        this.e = i;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (f13163a) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("scene");
            arrayList.add("actionName");
            arrayList.add("runnable");
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y().a("tnode_solution", "solution_status", null, arrayList, true);
            f13163a = true;
        }
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean f(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e31c865", new Object[]{this, dqiVar})).booleanValue();
        }
        BHRSolution bHRSolution = this.d;
        boolean f = bHRSolution != null ? bHRSolution.f(dqiVar) & true : true;
        if (this.e > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f > this.e) {
                ogg.c("TNode", "模型" + this.c + "准备执行，当前时间:" + currentTimeMillis);
                this.f = currentTimeMillis;
            } else {
                ogg.c("TNode", "模型" + this.c + "执行距离上次执行时间小于" + this.e + "  上次执行时间:" + this.f);
                f = false;
            }
            try {
                JSONObject a2 = dqiVar.a();
                HashMap hashMap = new HashMap();
                hashMap.put("scene", a2.getString("scene"));
                hashMap.put("actionName", a2.getString("actionName"));
                hashMap.put("runnable", String.valueOf(f));
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().y().a("tnode_solution", "solution_status", null, hashMap);
            } catch (Throwable th) {
                ogg.a("TNode", "solution statCommit: " + th.getMessage());
            }
        }
        return f;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public void a(dqi dqiVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a96d8b8", new Object[]{this, dqiVar, obj});
            return;
        }
        ogg.c("TNode", "模型" + this.c + "执行结果" + obj.toString());
        BHRSolution bHRSolution = this.d;
        if (bHRSolution != null) {
            bHRSolution.a(dqiVar, (dqi) obj);
        }
        g.c cVar = this.b;
        if (cVar == null || cVar.c == null) {
            return;
        }
        this.b.c.a(this.b, obj);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Object i(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("465affce", new Object[]{this, dqiVar});
        }
        BHRSolution bHRSolution = this.d;
        if (bHRSolution == null) {
            return null;
        }
        return bHRSolution.i(dqiVar);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        BHRSolution bHRSolution = this.d;
        if (bHRSolution == null) {
            return false;
        }
        return bHRSolution.a();
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        BHRSolution bHRSolution = this.d;
        if (bHRSolution == null) {
            return null;
        }
        return bHRSolution.b();
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        BHRSolution bHRSolution = this.d;
        if (bHRSolution == null) {
            return true;
        }
        return bHRSolution.c();
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public void a(dqi dqiVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ab0c5a", new Object[]{this, dqiVar, runnable});
            return;
        }
        BHRSolution bHRSolution = this.d;
        if (bHRSolution != null) {
            bHRSolution.a(dqiVar, runnable);
        } else {
            oec.a(runnable);
        }
    }
}
