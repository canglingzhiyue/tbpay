package tb;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.home.component.utils.m;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.monitor.procedure.s;
import java.util.HashMap;
import tb.lks;

/* loaded from: classes7.dex */
public class krv implements lqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_DRAW_COLD_START_DATA = "startDrawColdStartData";
    public static final String STAGE_START_COLD_START_TASK = "startColdStartTask";
    private static long c;
    private static long d;
    private static boolean i;
    private static boolean j;
    private final IMainFeedsViewService<?> e;
    private final IContainerDataService<?> f;
    private lks.b g;

    /* renamed from: a  reason: collision with root package name */
    private long f30283a = -1;
    private long b = -1;
    private boolean h = false;

    public static /* synthetic */ long a(krv krvVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("436a734f", new Object[]{krvVar, new Long(j2)})).longValue();
        }
        krvVar.f30283a = j2;
        return j2;
    }

    public static /* synthetic */ IMainFeedsViewService a(krv krvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMainFeedsViewService) ipChange.ipc$dispatch("761a6db1", new Object[]{krvVar}) : krvVar.e;
    }

    public static /* synthetic */ boolean a(krv krvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("436aaf6f", new Object[]{krvVar, new Boolean(z)})).booleanValue();
        }
        krvVar.h = z;
        return z;
    }

    public static /* synthetic */ long b(krv krvVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25483cee", new Object[]{krvVar, new Long(j2)})).longValue();
        }
        krvVar.b = j2;
        return j2;
    }

    public static /* synthetic */ boolean b(krv krvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e02b9b0e", new Object[]{krvVar})).booleanValue() : krvVar.h;
    }

    public static /* synthetic */ boolean c(krv krvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ceaea18f", new Object[]{krvVar})).booleanValue() : krvVar.i();
    }

    public static /* synthetic */ long d(krv krvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd31a800", new Object[]{krvVar})).longValue() : krvVar.f30283a;
    }

    public static /* synthetic */ long e(krv krvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abb4ae81", new Object[]{krvVar})).longValue() : krvVar.b;
    }

    public static /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : c;
    }

    public static /* synthetic */ long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[0])).longValue() : d;
    }

    static {
        kge.a(-2018904573);
        kge.a(819756510);
        c = -1L;
        d = -1L;
        i = false;
        j = false;
    }

    public krv(ljs ljsVar) {
        this.e = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.f = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    @Override // tb.lqm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // tb.lqm
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.g = e();
            this.e.mo1084getLifeCycleRegister().a(this.g);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.e;
        if (iMainFeedsViewService == null || this.g == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.g);
    }

    private lks.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lks.b) ipChange.ipc$dispatch("f21a2e88", new Object[]{this}) : new lks.b() { // from class: tb.krv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lks.b
            public void dM_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32a48a9d", new Object[]{this});
                }
            }

            @Override // tb.lks.b
            public void dT_() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e9676f6", new Object[]{this});
                } else if (thd.a(krv.a(krv.this))) {
                    krv.a(krv.this, SystemClock.uptimeMillis());
                } else if (krv.b(krv.this) || !krv.c(krv.this)) {
                } else {
                    krv.a(krv.this, true);
                    krv.b(krv.this, SystemClock.uptimeMillis());
                    s.f18233a.d().a("homeSecondRefreshEnd", Long.valueOf(krv.e(krv.this)));
                    s.f18233a.d().a("homeSecondRefreshEnd", krv.e(krv.this));
                    final HashMap hashMap = new HashMap(16);
                    if (krv.d(krv.this) > 0 && krv.e(krv.this) > 0) {
                        hashMap.put("coldStartTotalDuration", String.valueOf(krv.e(krv.this) - krv.d(krv.this)));
                    }
                    if (krv.d(krv.this) > 0 && krv.f() > 0) {
                        hashMap.put("coldStartTaskDispatchDuration", String.valueOf(krv.f() - krv.d(krv.this)));
                    }
                    if (krv.g() > 0 && krv.e(krv.this) > 0) {
                        hashMap.put("coldStartOnScreenDuration", String.valueOf(krv.e(krv.this) - krv.g()));
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        long startUptimeMillis = Process.getStartUptimeMillis();
                        if (krv.e(krv.this) > 0 && startUptimeMillis > 0) {
                            hashMap.put("coldStartProcessTotalDuration", String.valueOf(krv.e(krv.this) - startUptimeMillis));
                        }
                    }
                    hashMap.put("level", ldc.a());
                    ljd.a().a(new Runnable() { // from class: tb.krv.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            m.a().a("homeSecondRefresh", "home_mtop_cos_time", "1.0", "Page_Home_Mtop", "", hashMap);
                            if (!jqm.a()) {
                                return;
                            }
                            ldl.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "page_home_second_refresh", "", "", hashMap.toString());
                        }
                    });
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private boolean i() {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.f;
        return (iContainerDataService == null || iContainerDataService.getContainerData() == null || (base = this.f.getContainerData().getBase()) == null || base.mo1280getPageParams() == null || base.mo1280getPageParams().getPageNum() != 0) ? false : true;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null) {
        } else {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1493206719) {
                if (hashCode == 1912296834 && str.equals(STAGE_DRAW_COLD_START_DATA)) {
                    c2 = 1;
                }
            } else if (str.equals(STAGE_START_COLD_START_TASK)) {
                c2 = 0;
            }
            if (c2 == 0) {
                if (i) {
                    return;
                }
                i = true;
                c = SystemClock.uptimeMillis();
            } else if (c2 != 1 || j) {
            } else {
                j = true;
                d = SystemClock.uptimeMillis();
            }
        }
    }
}
