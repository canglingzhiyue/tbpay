package com.taobao.performance;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.nfc;
import tb.shc;

/* loaded from: classes7.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private shc f18679a;
    private long b = 0;
    private long c = 0;
    private String d;
    private String e;

    static {
        kge.a(-361084539);
    }

    public l() {
        try {
            this.f18679a = FalcoGlobalTracer.get().a(shc.MODULE, shc.SCENE_TAP).a(this.b).av_();
        } catch (Exception e) {
            com.taobao.tao.infoflow.multitab.g.a("MultiTabPerformance", "ApmPerfMonitor init error", e);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.g_(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.j("HomepageFragment_" + str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.f18679a == null || !TextUtils.isEmpty(this.d)) {
        } else {
            this.d = str;
            shc shcVar = this.f18679a;
            shcVar.l("HomepageFragment_" + str);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.f18679a == null || !TextUtils.isEmpty(this.e)) {
        } else {
            this.e = str;
            this.f18679a.h_(str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.j_(str);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.a(z);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.b(z);
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.b(Long.valueOf(j));
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null || this.c != 0) {
            return;
        }
        this.c = j;
        shcVar.c(Long.valueOf(j));
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.d(Long.valueOf(j));
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.e(Long.valueOf(j));
    }

    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.j(Long.valueOf(j));
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eab16", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.o(Long.valueOf(j));
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41383b5", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.p(Long.valueOf(j));
    }

    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85c54", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.q(Long.valueOf(j));
    }

    public void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d34f3", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.r(Long.valueOf(j));
    }

    public void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9320d92", new Object[]{this, new Long(j)});
            return;
        }
        shc shcVar = this.f18679a;
        if (shcVar == null) {
            return;
        }
        shcVar.s(Long.valueOf(j));
    }

    public shc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shc) ipChange.ipc$dispatch("16bc238f", new Object[]{this}) : this.f18679a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (c()) {
            this.f18679a.c();
            d();
        }
        this.c = 0L;
        this.e = "";
        this.d = "";
        this.b = 0L;
        this.f18679a = null;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        shc shcVar = this.f18679a;
        if (shcVar == null || shcVar.j() == null) {
            return false;
        }
        try {
            String str = (String) a("pageName", "");
            long longValue = ((Long) a("fcp", 0L)).longValue();
            long longValue2 = ((Long) a("pageCreateS", 0L)).longValue();
            long longValue3 = ((Long) a("pageCreateE", 0L)).longValue();
            com.taobao.tao.infoflow.multitab.g.a("MultiTabPerformance", "ApmPerfMonitor " + this.f18679a.a() + ",checkInvalid pageName：" + str + ",fcp:" + longValue + ",pageCreateS:" + longValue2 + ",pageCreateE:" + longValue3);
            if (!TextUtils.isEmpty(str) && longValue > 0) {
                if (this.b > 0 && longValue2 != 0 && longValue3 != 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.taobao.tao.infoflow.multitab.g.a("MultiTabPerformance", "ApmPerfMonitor checkInvalid error", e);
            return false;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String str = (String) a("pageName", "");
        String str2 = (String) a("transition", "");
        String str3 = (String) a("fromPageName", "");
        String str4 = (String) a("techStack", "");
        String str5 = (String) a("isFirstLoad", "0");
        String str6 = (String) a("isHitCache", "0");
        Long l = "0";
        long longValue = ((Long) a(IMultiTabPerformanceListener.ON_ROUTE_END, 0L)).longValue() - ((Long) a(IMultiTabPerformanceListener.ON_ROUTE_START, 0L)).longValue();
        long longValue2 = ((Long) a("pageCreateE", 0L)).longValue() - ((Long) a("pageCreateS", 0L)).longValue();
        long longValue3 = ((Long) a(IMultiTabPerformanceListener.ON_CONTAINER_INIT_END, 0L)).longValue() - ((Long) a(IMultiTabPerformanceListener.ON_CONTAINER_INIT_START, 0L)).longValue();
        long longValue4 = ((Long) a(IMultiTabPerformanceListener.ON_REQUEST_END, 0L)).longValue() - ((Long) a(IMultiTabPerformanceListener.ON_REQUEST_START, 0L)).longValue();
        long longValue5 = ((Long) a("fcp", 0L)).longValue();
        long longValue6 = ((Long) a(nfc.PHA_MONITOR_MEASURE_FSP, 0L)).longValue();
        concurrentHashMap.put("fromPageName", str3);
        concurrentHashMap.put("techStack", str4);
        concurrentHashMap.put("isFirstLoad", str5);
        concurrentHashMap.put("isHitCache", str6);
        concurrentHashMap.put("route", String.valueOf(longValue));
        concurrentHashMap.put(RenderTrackUtils.pageCreate, String.valueOf(longValue2));
        concurrentHashMap.put("bucketId", n.n().i());
        concurrentHashMap.put("containerInit", String.valueOf(longValue3 < 0 ? l : Long.valueOf(longValue3)));
        if (longValue4 >= 0) {
            l = Long.valueOf(longValue4);
        }
        concurrentHashMap.put("mainDocRequest", String.valueOf(l));
        concurrentHashMap.put("fcp", String.valueOf(longValue5));
        concurrentHashMap.put(nfc.PHA_MONITOR_MEASURE_FSP, String.valueOf(longValue6));
        com.taobao.tao.infoflow.multitab.g.a("MultiTabPerformance", "ApmPerfMonitor " + this.f18679a.a() + ",commit提交 -> fromPageName:" + str3 + ",pageName:" + str + ",transition:" + str2 + "，isFirstLoad:" + str5 + "，isHitCache:" + str6 + "，techStack:" + str4 + "，route:" + longValue + ",pageCreate:" + longValue2 + ",containerInit:" + longValue3 + ",mainDocRequest:" + longValue4 + ",fcp:" + longValue5 + ",fsp:" + longValue6);
        com.taobao.tao.infoflow.multitab.g.a(str, str2, concurrentHashMap);
    }

    private <T> T a(String str, T t) {
        Map<String, ?> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, t});
        }
        try {
            j = this.f18679a.j();
        } catch (Exception e) {
            com.taobao.tao.infoflow.multitab.g.a("MultiTabPerformance", "ApmPerfMonitor getSpanValue error", e);
        }
        if (j == null) {
            return t;
        }
        T t2 = (T) j.get(str);
        return t2 == null ? t : (!(t instanceof String) && !(t instanceof Long) && !(t instanceof Integer)) ? t : t2;
    }
}
