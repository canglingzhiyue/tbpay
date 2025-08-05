package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.i;
import com.taobao.android.autosize.TBDeviceInfo;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.falco.FalcoEnvironment;
import com.taobao.flowcustoms.afc.utils.g;
import java.util.Map;

/* loaded from: classes7.dex */
public class iwc implements a.b, a.c, g.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FalcoEnvironment f29354a;
    private volatile a b;
    private volatile boolean c;
    private boolean d;

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29359a;
        public final sgw b;
        public final iwb c;
        public final shb d;
        public final tis e;

        public a(String str, sgw sgwVar, iwb iwbVar, shb shbVar, tis tisVar) {
            this.f29359a = str;
            this.b = sgwVar;
            this.c = iwbVar;
            this.d = shbVar;
            this.e = tisVar;
        }

        public a(sgw sgwVar, iwb iwbVar, shb shbVar, tis tisVar) {
            this(tmt.a(), sgwVar, iwbVar, shbVar, tisVar);
        }
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? "UNKNOWN" : mpa.HOT : mpa.COLD;
    }

    public static /* synthetic */ void a(iwc iwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7cb5c3", new Object[]{iwcVar});
        } else {
            iwcVar.e();
        }
    }

    public static /* synthetic */ void a(iwc iwcVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4234b163", new Object[]{iwcVar, new Integer(i), new Integer(i2)});
        } else {
            iwcVar.b(i, i2);
        }
    }

    public static /* synthetic */ void a(iwc iwcVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11a7961", new Object[]{iwcVar, new Long(j)});
        } else {
            iwcVar.a(j);
        }
    }

    public static /* synthetic */ void a(iwc iwcVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6508762", new Object[]{iwcVar, map});
        } else {
            iwcVar.b(map);
        }
    }

    public iwc(FalcoEnvironment falcoEnvironment) {
        sgw sgwVar = new sgw();
        sgwVar.c = Build.MODEL;
        sgwVar.d = Build.BRAND;
        shb shbVar = new shb();
        shbVar.f33577a = mpa.COLD;
        shbVar.e = 1;
        shbVar.f = 0;
        this.f29354a = falcoEnvironment;
        this.b = new a(sgwVar, new iwb(), shbVar, new tis());
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        dit.g(new Runnable() { // from class: tb.iwc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    iwc.a(iwc.this);
                }
            }
        });
        c.a((a.c) this);
        c.a((IApmEventListener) this);
        g.a(this);
    }

    public sgw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sgw) ipChange.ipc$dispatch("f0a7cdb", new Object[]{this}) : this.b.b;
    }

    public iwb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iwb) ipChange.ipc$dispatch("16b7d009", new Object[]{this}) : this.b.c;
    }

    public shb c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shb) ipChange.ipc$dispatch("1e6dc8cf", new Object[]{this}) : this.b.d;
    }

    public tis d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tis) ipChange.ipc$dispatch("261fe85d", new Object[]{this}) : this.b.e;
    }

    @Override // com.taobao.flowcustoms.afc.utils.g.a
    public void a(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
            ALog.e("falco.env", "[onFlowEnter] params is null", null, new Object[0]);
        } else {
            dit.g(new Runnable() { // from class: tb.iwc.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwc.a(iwc.this, map);
                    }
                }
            });
        }
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i != 1) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            dit.g(new Runnable() { // from class: tb.iwc.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwc.a(iwc.this, currentTimeMillis);
                    }
                }
            });
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 != 1) {
        } else {
            dit.g(new Runnable() { // from class: tb.iwc.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwc.a(iwc.this, i, i2);
                    }
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = this.b;
        tis tisVar = aVar.e;
        sgw sgwVar = aVar.b;
        sgw sgwVar2 = new sgw();
        sgwVar2.f33565a = f();
        sgwVar2.b = g();
        sgwVar2.c = sgwVar.c;
        sgwVar2.d = sgwVar.d;
        shb shbVar = new shb();
        shbVar.f33577a = mpa.COLD;
        shbVar.b = SceneIdentifier.getProcessStartTime();
        shbVar.d = i();
        shbVar.e = 1;
        shbVar.f = SceneIdentifier.isAppBackground() ? 1 : 0;
        a aVar2 = new a(sgwVar2, h(), shbVar, tisVar);
        a(aVar2, "");
        FalcoEnvironment falcoEnvironment = this.f29354a;
        falcoEnvironment.a("DevicePortrait Init|" + aVar2.b);
        FalcoEnvironment falcoEnvironment2 = this.f29354a;
        falcoEnvironment2.a("ProcessVisit Init|" + aVar2.c);
        FalcoEnvironment falcoEnvironment3 = this.f29354a;
        falcoEnvironment3.a("LaunchVisit Init|" + aVar2.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.iwc.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r11
            r2 = 1
            r1[r2] = r12
            java.lang.String r12 = "41e3e87c"
            r0.ipc$dispatch(r12, r1)
            return
        L15:
            r0 = 0
            java.lang.String r1 = "afc_id"
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = "source_url"
            java.lang.Object r12 = r12.get(r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L78
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L2f
            r3 = r0
            goto L35
        L2f:
            java.lang.String r3 = "\\^"
            java.lang.String[] r3 = r1.split(r3)     // Catch: java.lang.Throwable -> L78
        L35:
            tb.tis r10 = new tb.tis     // Catch: java.lang.Throwable -> L78
            r10.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = ""
            if (r1 != 0) goto L3f
            r1 = r4
        L3f:
            r10.f34135a = r1     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L4a
            int r1 = r3.length     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L47
            goto L4a
        L47:
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L78
            goto L4b
        L4a:
            r1 = r4
        L4b:
            r10.b = r1     // Catch: java.lang.Throwable -> L78
            if (r12 != 0) goto L50
            r12 = r4
        L50:
            r10.c = r12     // Catch: java.lang.Throwable -> L78
            tb.iwc$a r12 = r11.b     // Catch: java.lang.Throwable -> L78
            tb.iwc$a r1 = new tb.iwc$a     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = r12.f29359a     // Catch: java.lang.Throwable -> L78
            tb.sgw r6 = r12.b     // Catch: java.lang.Throwable -> L78
            tb.iwb r7 = r12.c     // Catch: java.lang.Throwable -> L78
            tb.shb r8 = r12.d     // Catch: java.lang.Throwable -> L78
            r4 = r1
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r12.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = "FlowSession Update|"
            r12.append(r3)     // Catch: java.lang.Throwable -> L78
            r12.append(r10)     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L78
            r11.a(r1, r12)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r12 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "falco.env"
            java.lang.String r3 = "[doUpdateFlowSession] error."
            anet.channel.util.ALog.e(r2, r3, r0, r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iwc.b(java.util.Map):void");
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.b;
        String a2 = a(i);
        long processStartTime = mpa.COLD.equals(a2) ? SceneIdentifier.getProcessStartTime() : System.currentTimeMillis();
        shb shbVar = new shb();
        shbVar.f33577a = a2;
        shbVar.b = processStartTime;
        shbVar.d = i();
        shbVar.e = mpa.COLD.equals(a2) ? 1 : 0;
        shbVar.f = SceneIdentifier.isAppBackground() ? 1 : 0;
        sgw sgwVar = aVar.b;
        if (TextUtils.isEmpty(sgwVar.f33565a) || TextUtils.isEmpty(sgwVar.b)) {
            sgw sgwVar2 = new sgw();
            sgwVar2.f33565a = TextUtils.isEmpty(sgwVar.f33565a) ? f() : sgwVar.f33565a;
            sgwVar2.b = TextUtils.isEmpty(sgwVar.b) ? g() : sgwVar.b;
            sgwVar2.c = sgwVar.c;
            sgwVar2.d = sgwVar.d;
            sgwVar = sgwVar2;
        }
        iwb iwbVar = aVar.c;
        if (iwbVar.f29353a < 0) {
            iwbVar = h();
        }
        a aVar2 = new a(sgwVar, iwbVar, shbVar, aVar.e);
        a(aVar2, "LaunchVisit Update|" + shbVar);
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        a aVar = this.b;
        shb shbVar = aVar.d;
        shb shbVar2 = new shb();
        shbVar2.f33577a = shbVar.f33577a;
        shbVar2.b = shbVar.b;
        shbVar2.c = j;
        shbVar2.d = shbVar.d;
        shbVar2.e = shbVar.e;
        shbVar2.f = 1;
        a aVar2 = new a(aVar.b, aVar.c, shbVar2, aVar.e);
        a(aVar2, "LaunchVisit Update|launchLeave=" + shbVar2.c);
    }

    private void a(a aVar, String str) {
        String str2;
        String str3;
        iwc iwcVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82ab570", new Object[]{iwcVar, aVar, str});
            return;
        }
        iwcVar.b = aVar;
        if (iwcVar.d) {
            if (!iwcVar.c) {
                iwcVar.c = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("processId");
                create.addMeasure("processStart");
                create.addMeasure("launchStart");
                create.addMeasure("launchLeave");
                create.addMeasure("isFirstLaunch");
                create.addMeasure("launchStatus");
                str2 = "processId";
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("falcoId");
                create2.addDimension("afcId");
                create2.addDimension("afcType");
                create2.addDimension("processName");
                create2.addDimension("launchType");
                create2.addDimension("launchUrl");
                create2.addDimension("installation");
                str3 = "installation";
                AppMonitor.register("falco", "falco_visit", create, create2, true);
            } else {
                str2 = "processId";
                str3 = "installation";
            }
            MeasureValueSet create3 = MeasureValueSet.create();
            create3.setValue(str2, aVar.c.f29353a);
            create3.setValue("processStart", aVar.c.c);
            create3.setValue("launchStart", aVar.d.b);
            create3.setValue("launchLeave", aVar.d.c);
            create3.setValue("isFirstLaunch", aVar.d.e);
            create3.setValue("launchStatus", aVar.d.f);
            DimensionValueSet create4 = DimensionValueSet.create();
            create4.setValue("falcoId", aVar.f29359a);
            create4.setValue("afcId", aVar.e.f34135a);
            create4.setValue("afcType", aVar.e.b);
            create4.setValue("processName", aVar.c.b);
            create4.setValue("launchType", aVar.d.f33577a);
            create4.setValue("launchUrl", aVar.e.c);
            create4.setValue(str3, aVar.d.d);
            AppMonitor.Stat.commit("falco", "falco_visit", create4, create3);
            iwcVar = this;
            iwcVar.f29354a.a(FalcoEnvironment.Category.FLOW_LINE, aVar.f29359a);
        }
        iwcVar.f29354a.a(str);
    }

    private static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        Context a2 = i.a();
        if (a2 == null) {
            return "";
        }
        int a3 = TBDeviceInfo.a(a2);
        return (a3 == 0 || a3 == 1 || a3 == 2) ? "phone" : a3 != 3 ? "" : "pad";
    }

    private static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[0]);
        }
        int deviceLevel = SceneIdentifier.getDeviceLevel();
        return deviceLevel != 1 ? deviceLevel != 2 ? deviceLevel != 3 ? "" : "low" : "middle" : "high";
    }

    private static iwb h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iwb) ipChange.ipc$dispatch("44e1b043", new Object[0]);
        }
        String b = tmt.b(i.a());
        iwb iwbVar = new iwb();
        iwbVar.f29353a = SceneIdentifier.getProcessId();
        if (b == null) {
            b = "";
        }
        iwbVar.b = b;
        iwbVar.c = SceneIdentifier.getProcessStartTime();
        return iwbVar;
    }

    private static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        return c.a().a("isFullNewInstall", false) ? "NEW" : c.a().a("isFirstLaunch", false) ? "UPDATE" : "NONE";
    }
}
