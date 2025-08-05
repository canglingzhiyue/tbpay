package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.perf.c;
import com.taobao.android.detail.core.perf.d;
import com.taobao.android.detail.core.performance.g;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.preload.b;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.o;
import com.taobao.monitor.procedure.s;
import java.util.Map;

/* loaded from: classes4.dex */
public class els {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f27410a;

    static {
        kge.a(601111090);
    }

    public els() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.render.component.TTDetailHeaderPicPerformance");
    }

    public void a(final View view, final DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821334b1", new Object[]{this, view, detailCoreActivity});
            return;
        }
        try {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.els.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    View view3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    i.d(j.a("TTDetailHeaderPicPerformance"), "详情3.0头图 onLayoutChange");
                    if (view2 == null || (view3 = view) == null) {
                        return;
                    }
                    view3.removeOnLayoutChangeListener(this);
                    els.this.a(detailCoreActivity);
                }
            });
            c(detailCoreActivity);
        } catch (Exception e) {
            i.a(j.a("TTDetailHeaderPicPerformance"), "onLayoutChange error", e);
        }
    }

    public void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{this, detailCoreActivity});
            return;
        }
        ebx ebxVar = detailCoreActivity.f9411a;
        if (ebxVar == null) {
            return;
        }
        long j = ebxVar.w;
        long uptimeMillis = SystemClock.uptimeMillis();
        ebxVar.G = uptimeMillis;
        if (detailCoreActivity.m()) {
            c.a(detailCoreActivity, "cache_aura_visible", j, uptimeMillis);
            h.i(detailCoreActivity, uptimeMillis - j);
            ecg.a(detailCoreActivity, ebxVar.f27180a, ebxVar.q, b.a(ebxVar.q));
            this.f27410a = uptimeMillis;
            return;
        }
        String str = ebxVar.q;
        String a2 = b.a(ebxVar.q);
        Map<String, String> a3 = d.a(detailCoreActivity, str, a2);
        String b = b(detailCoreActivity);
        c.a(detailCoreActivity, b, "ProductDetail_FirstScreen", j, uptimeMillis, a3);
        a(detailCoreActivity, b, j, uptimeMillis);
        h.a(j);
        h.b(detailCoreActivity);
        ecg.d(detailCoreActivity, ebxVar.f27180a, str, a2);
        long j2 = this.f27410a;
        if (j2 <= 0) {
            return;
        }
        c.a(detailCoreActivity, "aura_visibleIntervals", j2, SystemClock.uptimeMillis());
        h.c(detailCoreActivity, SystemClock.uptimeMillis() - this.f27410a);
        this.f27410a = 0L;
    }

    private void c(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39317cb1", new Object[]{this, detailCoreActivity});
        } else {
            h.a(detailCoreActivity.m() ? "cache_aura_visible_old" : "aura_visible_old");
        }
    }

    private void a(DetailCoreActivity detailCoreActivity, String str, long j, long j2) {
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b40d33d", new Object[]{this, detailCoreActivity, str, new Long(j), new Long(j2)});
            return;
        }
        dya y = detailCoreActivity.y();
        if (y == null || !y.c()) {
            return;
        }
        long j4 = j2 - j;
        if (detailCoreActivity.getIntent() != null) {
            String stringExtra = detailCoreActivity.getIntent().getStringExtra(dyo.STREAM_FLAG);
            j3 = o.a(stringExtra);
            long f = o.f(stringExtra);
            if (f != 0) {
                h.r(detailCoreActivity, f);
            }
        } else {
            j3 = 0;
        }
        long j5 = j2 - j3;
        long H = j2 - y.H();
        if (TextUtils.equals(str, "aura_preload_visible")) {
            h.b(detailCoreActivity, j4, j5, H);
        } else if (TextUtils.equals(str, "aura_visible")) {
            h.a(detailCoreActivity, j4, j5, H);
        }
        try {
            s.f18233a.d().a(str, j2);
        } catch (Exception e) {
            i.a("TTDetailHeaderPicPerformance", "拉端埋点异常", e);
        }
        long d = y.d();
        if (d == 0) {
            return;
        }
        h.a(detailCoreActivity, j2 - d);
    }

    private String b(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("21858b0e", new Object[]{this, detailCoreActivity}) : g.a(detailCoreActivity) ? "aura_preload_visible" : "aura_visible";
    }
}
