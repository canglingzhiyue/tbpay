package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class cao implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Boolean> b = new ConcurrentHashMap();
    private static Map<String, Long> c = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private Handler f26237a;

    public cao() {
        HandlerThread a2 = jbg.a("SplitLoader-report");
        a2.start();
        this.f26237a = new Handler(a2.getLooper());
        this.f26237a.postDelayed(new Runnable() { // from class: tb.cao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AppMonitor.register(j.MODULE, j.MODULE_POINT, MeasureSet.create().addMeasure("cost").addMeasure("retainSize").addMeasure("splitSize").addMeasure("launchTime").addMeasure("fullCost"), DimensionSet.create().addDimension("splitVersion").addDimension("splitName").addDimension("stage").addDimension("isFullNewInstall").addDimension("isFirstLaunch").addDimension("isFirstUpdate").addDimension("installedFrom").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
                }
            }
        }, 500L);
    }

    private String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{this, str, str2, new Boolean(z)});
        }
        return str + "-" + str2 + "-" + z;
    }

    @Override // com.alibaba.android.split.j
    public void a(String str, boolean z, String str2, long j, int i, String str3, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2115146f", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, new Long(j2)});
        } else {
            a(str, z, str2, j, i, str3, bif.a().a(str), bif.a().b(str), bic.a(), bhx.c(), bhx.a(), bhx.b());
        }
    }

    @Override // com.alibaba.android.split.j
    public void a(String str, boolean z, int i, long j, int i2, String str2, long j2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab2f75a", new Object[]{this, str, new Boolean(z), new Integer(i), new Long(j), new Integer(i2), str2, new Long(j2)});
            return;
        }
        if (i == 2) {
            str3 = "download";
        } else if (i == 4) {
            str3 = "install";
        } else if (i == 10 || i != 11) {
            str4 = "verify";
            a(str, z, str4, j, i2, str2, bif.a().a(str), bif.a().b(str), bic.a(), bhx.c(), bhx.a(), bhx.b());
        } else {
            str3 = "load";
        }
        str4 = str3;
        a(str, z, str4, j, i2, str2, bif.a().a(str), bif.a().b(str), bic.a(), bhx.c(), bhx.a(), bhx.b());
    }

    @Override // com.alibaba.android.split.j
    public void a(final String str, final boolean z, final String str2, final long j, final int i, final String str3, final String str4, final long j2, final long j3, final long j4, final boolean z2, final boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56227a5", new Object[]{this, str, new Boolean(z), str2, new Long(j), new Integer(i), str3, str4, new Long(j2), new Long(j3), new Long(j4), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (str2.equals(j.ARG_DEFFERED_INSTALL) || str2.equals(j.ARG_START_INSTALL)) {
            c.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        final long currentTimeMillis = c.containsKey(str) ? System.currentTimeMillis() - c.get(str).longValue() : 0L;
        if (b.containsKey(a(str, str2, z))) {
            return;
        }
        b.put(a(str, str2, z), true);
        this.f26237a.postDelayed(new Runnable() { // from class: tb.cao.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    AppMonitor.Stat.commit(j.MODULE, j.MODULE_POINT, DimensionValueSet.create().setValue("splitName", str).setValue("splitVersion", String.valueOf(str4)).setValue("stage", str2).setValue("success", String.valueOf(z)).setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str3).setValue("isFirstUpdate", String.valueOf(k.a().b().i())).setValue("installedFrom", k.a().b().s()).setValue("isFullNewInstall", String.valueOf(z2)).setValue("isFirstLaunch", String.valueOf(z3)), MeasureValueSet.create().setValue("cost", j).setValue("splitSize", j2).setValue("retainSize", j3).setValue("fullCost", currentTimeMillis).setValue("launchTime", j4));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 500L);
    }
}
