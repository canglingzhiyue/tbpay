package com.alibaba.android.umbrella.performance;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff23cbdf", new Object[]{aVar});
            return;
        }
        a();
        c.a().a(new ProcessEntity(aVar.b, aVar.h));
    }

    public static void b(a aVar) {
        ProcessEntity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fead65e0", new Object[]{aVar});
        } else if (i(aVar) || (a2 = c.a().a(aVar.b)) == null) {
        } else {
            if (aVar.j != null && aVar.j.size() > 0) {
                a2.addArgs(aVar.j);
            }
            if (d.PAGELOAD.equals(aVar.g)) {
                a2.addPageLoad(aVar.i);
            } else {
                a2.addProcess(aVar.g.a(), aVar.i);
            }
        }
    }

    public static void c(a aVar) {
        ProcessEntity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe36ffe1", new Object[]{aVar});
        } else if (i(aVar) || TextUtils.isEmpty(aVar.f) || (a2 = c.a().a(aVar.b)) == null) {
        } else {
            if (aVar.j != null && aVar.j.size() > 0) {
                a2.addArgs(aVar.j);
            }
            if (aVar.g == d.INIT) {
                a2.addInit(aVar.f, aVar.i);
            } else if (aVar.g == d.LIFECYCLE) {
                a2.addLifeCycle(aVar.f, aVar.i);
            } else if (aVar.g == d.NETWORK) {
                a2.addNetwork(aVar.f, aVar.i);
            } else if (aVar.g == d.DATAPARSE) {
                a2.addDataParse(aVar.f, aVar.i);
            } else if (aVar.g == d.SUB_CREATE_VIEW) {
                a2.addCreateView(aVar.f, aVar.i);
            } else if (aVar.g != d.SUB_BIND_VIEW) {
            } else {
                a2.addBindView(aVar.f, aVar.i);
            }
        }
    }

    public static void d(a aVar) {
        ProcessEntity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc099e2", new Object[]{aVar});
        } else if (j(aVar) || TextUtils.isEmpty(aVar.f) || (a2 = c.a().a(aVar.b)) == null) {
        } else {
            a2.addOtherProcess(aVar.f, aVar.i);
        }
    }

    public static void e(a aVar) {
        ProcessEntity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4a33e3", new Object[]{aVar});
        } else if (j(aVar) || (a2 = c.a().a(aVar.b)) == null || aVar.j == null || aVar.j.size() <= 0) {
        } else {
            a2.addArgs(aVar.j);
        }
    }

    public static void f(a aVar) {
        ProcessEntity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd3cde4", new Object[]{aVar});
        } else if (j(aVar) || (a2 = c.a().a(aVar.b)) == null) {
        } else {
            a2.setChildBizName(aVar.c);
        }
    }

    public static void g(a aVar) {
        ProcessEntity a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5d67e5", new Object[]{aVar});
        } else if (j(aVar) || (a2 = c.a().a(aVar.b)) == null) {
        } else {
            a2.addAbTest(aVar.d, aVar.e);
        }
    }

    public static void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe701e6", new Object[]{aVar});
            return;
        }
        ProcessEntity a2 = c.a().a(aVar.b);
        if (a2 == null) {
            return;
        }
        c.a().b(a2);
        if (a2.pageLoad <= 0) {
            return;
        }
        a(a2);
    }

    public static void a(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cc4f8e", new Object[]{processEntity});
        } else {
            PerformanceEngine.commitPerformancePage(processEntity);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Map<String, ProcessEntity> b = c.a().b();
        if (b == null && b.size() > 0) {
            return;
        }
        for (String str : b.keySet()) {
            ProcessEntity processEntity = b.get(str);
            if (processEntity == null) {
                b.remove(str);
            } else {
                b.remove(str);
                a(processEntity);
            }
        }
    }

    public static boolean i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb709beb", new Object[]{aVar})).booleanValue() : aVar == null || TextUtils.isEmpty(aVar.b) || aVar.g == null || TextUtils.isEmpty(aVar.g.a()) || !c.a().b(aVar.b);
    }

    public static boolean j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fafa35ec", new Object[]{aVar})).booleanValue() : aVar == null || TextUtils.isEmpty(aVar.b) || !c.a().b(aVar.b);
    }
}
