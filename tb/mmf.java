package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.weex_framework.util.a;
import com.taobao.login4android.activity.LoginProxyActivity;
import com.taobao.metrickit.context.MetricContext;
import tb.mly;

/* loaded from: classes7.dex */
public class mmf extends mmc<mki, mkj> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(mmf mmfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mmf(MetricContext metricContext, mly mlyVar, mki mkiVar) {
        super(metricContext, mlyVar, mkiVar);
    }

    @Override // tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 0, 1, 2};
    }

    @Override // tb.mmc
    public void a(mkj mkjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4aa2ccc", new Object[]{this, mkjVar});
            return;
        }
        if (mkjVar.a() == 23 || mkjVar.a() == 24) {
            a(mkjVar, e().a("alarm"));
        }
        if (mkjVar.a() == 18) {
            b(mkjVar, e().a("wakeLock"));
        }
        if (mkjVar.a() == 19) {
            c(mkjVar, e().a("wakeLock"));
        }
        if (mkjVar.a() == 20) {
            d(mkjVar, e().a("wakeLock"));
        }
        if (mkjVar.a() == 21) {
            e(mkjVar, e().a("sensor"));
        }
        if (mkjVar.a() == 22) {
            f(mkjVar, e().a("sensor"));
        }
        if (mkjVar.a() == 25) {
            g(mkjVar, e().a("bluetooth").a("normal"));
        }
        if (mkjVar.a() == 26) {
            h(mkjVar, e().a("bluetooth").a("normal"));
        }
        if (mkjVar.a() == 27) {
            i(mkjVar, e().a("bluetooth").a("le"));
        }
        if (mkjVar.a() == 28) {
            j(mkjVar, e().a("bluetooth").a("le"));
        }
        if (mkjVar.a() == 31) {
            i(mkjVar, e().a("bluetooth").a("le"));
        }
        if (mkjVar.a() == 32) {
            j(mkjVar, e().a("bluetooth").a("le"));
        }
        if (mkjVar.a() == 29) {
            k(mkjVar, e().a("location"));
        }
        if (mkjVar.a() == 30) {
            l(mkjVar, e().a("location"));
        }
        if (mkjVar.a() == 0) {
            a(e().a("wakeLock"));
            a(e().a("sensor"));
            a(e().a("bluetooth").a("le"));
            a(e().a("location"));
        }
        if (mkjVar.a() == 1) {
            b(e().a("wakeLock"));
            b(e().a("sensor"));
            b(e().a("bluetooth").a("le"));
            b(e().a("location"));
        }
        if (mkjVar.a() == 2) {
            c(e().a("wakeLock"));
            c(e().a("sensor"));
            c(e().a("bluetooth").a("le"));
            c(e().a("location"));
        }
        mly.a c = e().c();
        if (!c.b()) {
            return;
        }
        c.a();
    }

    private void a(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f83242", new Object[]{this, mkjVar, mlyVar});
        } else {
            mlyVar.a(mkjVar.a("uniqueKey")).c().a("type", mkjVar.a("type", -1)).a("nowInThisType", mkjVar.a("nowInThisType", -1L)).a("triggerAtMillis", mkjVar.a("triggerAtMillis", -1L)).a("intervalMillis", mkjVar.a("intervalMillis", -1L)).a("startTime", mkjVar.a("startTime", -1L)).a(LoginProxyActivity.ACTION_TYPE_OPERATION, mkjVar.a(LoginProxyActivity.ACTION_TYPE_OPERATION)).a("tag", mkjVar.a("tag")).a("method", mkjVar.a("method")).a(DataReceiveMonitor.CB_LISTENER, mkjVar.a(DataReceiveMonitor.CB_LISTENER)).a("targetHandler", mkjVar.a("targetHandler"));
        }
    }

    private void b(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a19127c3", new Object[]{this, mkjVar, mlyVar});
        } else {
            mlyVar.a(mkjVar.a("uniqueKey")).c().a("tag", mkjVar.a("tag")).a("levelAndFlags", mkjVar.a("levelAndFlags", -1));
        }
    }

    private void c(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2a1d44", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        String a2 = mkjVar.a("uniqueKey");
        long a3 = mkjVar.a("timeout", -1L);
        long a4 = mkjVar.a("startTime", SystemClock.uptimeMillis());
        mly a5 = mlyVar.a(a2);
        mly.a c = a5.c();
        if (a5.a("timeout", -1L) == -1 && a3 != -1) {
            c.a("timeout", a3);
        }
        a(a5, a4);
    }

    private void d(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac312c5", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        int a2 = mkjVar.a("flags", 0);
        float a3 = mkjVar.a("power", -1.0f);
        mly a4 = mlyVar.a(mkjVar.a("uniqueKey"));
        mly.a c = a4.c();
        if (a4.a("flags", 0) == 0 && a2 != 0) {
            c.a("flags", a2);
        }
        if (a4.a("power", -1.0f) < 0.0f && a3 > 0.0f) {
            c.a("power", a3);
        }
        b(a4, mkjVar.a("endTime", SystemClock.uptimeMillis()));
    }

    private void e(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75c0846", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        String a2 = mkjVar.a("handler");
        mly a3 = mlyVar.a(mkjVar.a("uniqueKey"));
        String a4 = mlyVar.a("sensorType", (String) null);
        String a5 = mkjVar.a("sensorType");
        mly.a c = a3.c();
        c.a(DataReceiveMonitor.CB_LISTENER, mkjVar.a(DataReceiveMonitor.CB_LISTENER)).a("delay", mkjVar.a("delayUs", -1)).a("maxReportLatencyUs", mkjVar.a("maxReportLatencyUs", 0));
        if (StringUtils.isEmpty(a4)) {
            c.a("sensorType", a5);
        } else if (!a4.contains(a5)) {
            c.a("sensorType", a4 + "|" + a5);
        }
        if (!StringUtils.isEmpty(a2)) {
            c.a("handler", a2);
        }
        a(a3, mkjVar.a("startTime", SystemClock.uptimeMillis()));
    }

    private void f(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f4fdc7", new Object[]{this, mkjVar, mlyVar});
        } else {
            b(mlyVar.a(mkjVar.a("uniqueKey")), mkjVar.a("endTime", SystemClock.uptimeMillis()));
        }
    }

    private void g(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08df348", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        mly a2 = mlyVar.a(mkjVar.a(a.ATOM_caller));
        String a3 = a2.a("status", "inited");
        long a4 = a2.a("duration", 0L);
        long a5 = a2.a("startTime", -1L);
        if ("inited".equals(a3) || DXRecyclerLayout.LOAD_MORE_STOPED.equals(a3) || ("started".equals(a3) && SystemClock.uptimeMillis() - a5 > 12000)) {
            a2.c().a("startTime", mkjVar.a("startTime", SystemClock.uptimeMillis())).a("duration", a4 + 12000).a("status", "started");
        }
        if (!"started".equals(a3) || SystemClock.uptimeMillis() - a5 > 12000) {
            return;
        }
        a2.c().a("startTime", mkjVar.a("startTime", SystemClock.uptimeMillis())).a("duration", (a4 - 12000) + (SystemClock.uptimeMillis() - a5));
    }

    private void h(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed26e8c9", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        mly a2 = mlyVar.a(mkjVar.a(a.ATOM_caller));
        String a3 = a2.a("status", "inited");
        long a4 = a2.a("duration", 0L);
        long a5 = a2.a("startTime", -1L);
        if (!"started".equals(a3) || SystemClock.uptimeMillis() - a5 > 12000) {
            return;
        }
        a2.c().a("startTime", mkjVar.a("startTime", SystemClock.uptimeMillis())).a("duration", (a4 - 12000) + (SystemClock.uptimeMillis() - a5)).a("status", DXRecyclerLayout.LOAD_MORE_STOPED);
    }

    private void i(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bfde4a", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        mly a2 = mlyVar.a(mkjVar.a("uniqueKey"));
        a2.c().a("callback", mkjVar.a("callback")).b("serviceUuids", mkjVar.a("serviceUuids")).b("filters", mkjVar.a("filters")).b("callbackIntent", mkjVar.a("callbackIntent"));
        if (mkjVar.b("scanMode")) {
            a2.c().a("scanMode", mkjVar.a("scanMode", 0)).a(InputFrame3.CALLBACK_TYPE, mkjVar.a(InputFrame3.CALLBACK_TYPE, 1)).a("reportDelayMillis", mkjVar.a("reportDelayMillis", 0L)).a("legacy", mkjVar.a("legacy", true)).a("phy", mkjVar.a("phy", 255));
        }
        a(a2, mkjVar.a("startTine", SystemClock.uptimeMillis()));
    }

    private void j(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658d3cb", new Object[]{this, mkjVar, mlyVar});
        } else {
            b(mlyVar.a(mkjVar.a("uniqueKey")), mkjVar.a("endTime", SystemClock.uptimeMillis()));
        }
    }

    private void k(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f1c94c", new Object[]{this, mkjVar, mlyVar});
            return;
        }
        mly a2 = mlyVar.a(mkjVar.a("uniqueKey"));
        a2.c().b("provider", mkjVar.a("provider")).a("minTimeMs", mkjVar.a("minTimeMs", -1L)).a("minDistanceM", mkjVar.a("minDistanceM", -1.0f)).b(DataReceiveMonitor.CB_LISTENER, mkjVar.a(DataReceiveMonitor.CB_LISTENER)).b("thread", mkjVar.a("thread")).b("criteria", mkjVar.a("criteria")).b("pendingIntent", mkjVar.a("pendingIntent"));
        a(a2, mkjVar.a("startTine", SystemClock.uptimeMillis()));
    }

    private void l(mkj mkjVar, mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f8abecd", new Object[]{this, mkjVar, mlyVar});
        } else {
            b(mlyVar.a(mkjVar.a("uniqueKey")), mkjVar.a("endTime", SystemClock.uptimeMillis()));
        }
    }

    private void a(mly mlyVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3241ca6", new Object[]{this, mlyVar, new Long(j)});
            return;
        }
        mly.a c = mlyVar.c();
        String a2 = mlyVar.a("status", "inited");
        if ("started".equals(a2)) {
            long a3 = mlyVar.a("startTime", j);
            String str = d().isInBackground() ? "bgDuration" : "fgDuration";
            c.a("startTime", j).a(str, (j - a3) + mlyVar.a(str, 0L));
        }
        if ("inited".equals(a2) || DXRecyclerLayout.LOAD_MORE_STOPED.equals(a2)) {
            int a4 = mlyVar.a("bgStartCount", 0);
            mly.a a5 = c.a("startTime", j).a("startCount");
            if (d().isInBackground()) {
                a4++;
            }
            a5.a("bgStartCount", a4);
        }
        c.a("status", "started");
    }

    private void b(mly mlyVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8501e645", new Object[]{this, mlyVar, new Long(j)});
            return;
        }
        mly.a c = mlyVar.c();
        String a2 = mlyVar.a("status", "inited");
        "inited".equals(a2);
        if ("started".equals(a2)) {
            String str = d().isInBackground() ? "bgDuration" : "fgDuration";
            c.a("endTime", j).a(str, (j - mlyVar.a("startTime", j)) + mlyVar.a(str, 0L)).a("endCount");
        }
        if (DXRecyclerLayout.LOAD_MORE_STOPED.equals(a2)) {
            c.a("endTime", j);
        }
        c.a("status", DXRecyclerLayout.LOAD_MORE_STOPED);
    }

    private void a(mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4bf15de", new Object[]{this, mlyVar});
            return;
        }
        for (String str : mlyVar.a()) {
            mly a2 = mlyVar.a(str);
            if ("started".equals(a2.a("status", "inited"))) {
                a2.c().a("bgDuration", (SystemClock.uptimeMillis() - a2.a("startTime", SystemClock.uptimeMillis())) + a2.a("bgDuration", 0L)).a("startTime", SystemClock.uptimeMillis());
            }
        }
    }

    private void b(mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3421c5f", new Object[]{this, mlyVar});
            return;
        }
        for (String str : mlyVar.a()) {
            mly a2 = mlyVar.a(str);
            if ("started".equals(a2.a("status", "inited"))) {
                a2.c().a("fgDuration", (SystemClock.uptimeMillis() - a2.a("startTime", SystemClock.uptimeMillis())) + a2.a("fgDuration", 0L)).a("startTime", SystemClock.uptimeMillis());
            }
        }
    }

    private void c(mly mlyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c522e0", new Object[]{this, mlyVar});
            return;
        }
        for (String str : mlyVar.a()) {
            mly a2 = mlyVar.a(str);
            if ("started".equals(a2.a("status", "inited"))) {
                a2.c().a("bgNotCancelCount");
            }
        }
    }
}
