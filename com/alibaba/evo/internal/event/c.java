package com.alibaba.evo.internal.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.alibaba.ut.abtest.internal.util.s;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bwq;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public class c implements com.alibaba.ut.abtest.event.b<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1323169139);
        kge.a(1000651436);
    }

    public static /* synthetic */ void a(c cVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460591c9", new Object[]{cVar, dVar});
        } else {
            cVar.a(dVar);
        }
    }

    @Override // com.alibaba.ut.abtest.event.b
    public void onEvent(com.alibaba.ut.abtest.event.a<d> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f15b7a0", new Object[]{this, aVar});
            return;
        }
        h.a("ExperimentDataV5EventListener", "onEvent, eventContext=" + aVar.c());
        if (aVar == null || aVar.b() == null) {
            h.e("ExperimentDataV5EventListener", "【实验数据V5】数据内容为空，停止处理！");
            return;
        }
        final d b = aVar.b();
        if (b.f2929a == cex.a().i().c()) {
            h.f("ExperimentDataV5EventListener", "【实验数据V5】数据文件未发现新版本, 本地版本=" + cex.a().i().c());
            return;
        }
        h.f("ExperimentDataV5EventListener", "【实验数据V5】数据文件发现新版本。最新版本=" + b.f2929a + ", 本地版本=" + cex.a().i().c());
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(aVar.c());
        com.alibaba.ut.abtest.internal.util.b.b(com.alibaba.ut.abtest.internal.util.b.EXPERIMENT_DATA_REACH_TYPE, sb.toString());
        try {
            if (cex.a().f() != null && cex.a().f() == UTABMethod.Push) {
                if (StringUtils.equals("accs_sync_grey", "" + aVar.c())) {
                    a(b);
                    return;
                }
                long h = cex.a().j().h();
                if (h != 0 && cex.a().i().c() != 0) {
                    if (p.b(1002)) {
                        h.f("ExperimentDataV5EventListener", "【实验数据V5】数据文件下载任务已等待执行，取消本次下载。");
                        return;
                    }
                    int a2 = s.a((int) h);
                    h.f("ExperimentDataV5EventListener", "【实验数据V5】数据文件下载任务" + a2 + "毫秒后开始执行。");
                    p.a(1002, new Runnable() { // from class: com.alibaba.evo.internal.event.c.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.a(c.this, b);
                            }
                        }
                    }, (long) a2);
                    return;
                }
                a(b);
                return;
            }
            a(b);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ExperimentDataV5EventListener.onEvent", th);
            a(b);
        }
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c26d68", new Object[]{this, dVar});
            return;
        }
        long a2 = bwq.a().a(dVar.b, dVar.c, dVar.f2929a);
        if (a2 > 0) {
            return;
        }
        h.f("ExperimentDataV5EventListener", "【实验数据V5】数据文件下载任务添加失败，任务ID：" + a2);
    }
}
