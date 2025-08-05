package com.taobao.falco;

import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.n;
import com.taobao.analysis.v3.r;
import tb.iwb;
import tb.iwc;
import tb.iwd;
import tb.iwe;
import tb.qri;
import tb.qrj;
import tb.sgw;
import tb.sha;
import tb.shb;
import tb.spn;
import tb.tcc;
import tb.tcd;
import tb.tes;
import tb.tis;
import tb.tmt;

/* loaded from: classes7.dex */
public class FalcoEnvironment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REPORT_SCENE_NETWORK = "network";
    public static final String REPORT_SCENE_SYSLOAD = "sysload";
    public static final String REPORT_SCENE_VISIT = "visit";

    /* renamed from: a  reason: collision with root package name */
    private static volatile FalcoEnvironment f17105a;
    private final iwc b = new iwc(this);
    private final iwe c = new iwe(this);
    private final iwd d = new iwd(this);
    private volatile a e = new a("", "", "");
    private volatile boolean f;
    private n g;
    private boolean h;
    private sha i;

    /* renamed from: com.taobao.falco.FalcoEnvironment$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17106a = new int[Category.values().length];

        static {
            try {
                f17106a[Category.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17106a[Category.FLOW_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17106a[Category.SYSTEM_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum Category {
        SYSTEM_LOAD,
        FLOW_LINE,
        NETWORK
    }

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f17107a = tmt.a();
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    public static void a(FalcoEnvironment falcoEnvironment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b434fe", new Object[]{falcoEnvironment});
        } else {
            f17105a = falcoEnvironment;
        }
    }

    public static FalcoEnvironment a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FalcoEnvironment) ipChange.ipc$dispatch("cde7273e", new Object[0]) : f17105a;
    }

    public void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        IpChange ipChange = $ipChange;
        boolean z6 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f2526c", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
            return;
        }
        if (!z2 && !z3 && !z4) {
            z6 = false;
        }
        this.h = z6;
        r rVar = FalcoGlobalTracer.get();
        if (rVar != null) {
            this.g = rVar.a("falco_env", "env").a(System.currentTimeMillis()).e();
        } else {
            ALog.e("falco.env", "[init] tracer is null", null, new Object[0]);
        }
        this.b.a(z2);
        this.d.a(z3);
        this.c.a(z4, z5);
        if (!z) {
            return;
        }
        this.i = new sha(this);
        this.i.a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.h ? this.e.f17107a : "";
    }

    public tis c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tis) ipChange.ipc$dispatch("1e6e42fe", new Object[]{this}) : this.b.d();
    }

    public iwb d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iwb) ipChange.ipc$dispatch("261b1ac7", new Object[]{this}) : this.b.b();
    }

    public shb e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shb) ipChange.ipc$dispatch("2dd1138d", new Object[]{this}) : this.b.c();
    }

    public qri f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qri) ipChange.ipc$dispatch("3581f691", new Object[]{this}) : this.c.d();
    }

    public tcc g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcc) ipChange.ipc$dispatch("3d34c004", new Object[]{this}) : this.d.a();
    }

    public tcd h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcd) ipChange.ipc$dispatch("44e66582", new Object[]{this}) : this.d.b();
    }

    public tes i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tes) ipChange.ipc$dispatch("4c981434", new Object[]{this}) : this.c.c();
    }

    public qrj j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qrj) ipChange.ipc$dispatch("54488c2c", new Object[]{this}) : this.c.a();
    }

    public spn k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spn) ipChange.ipc$dispatch("5bfb1343", new Object[]{this}) : this.c.b();
    }

    public sgw l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sgw) ipChange.ipc$dispatch("63ac97f0", new Object[]{this}) : this.b.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        n nVar = this.g;
        if (nVar == null) {
            return;
        }
        nVar.a(str);
    }

    public void a(Category category, String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b954669a", new Object[]{this, category, str});
            return;
        }
        a aVar2 = this.e;
        int i = AnonymousClass1.f17106a[category.ordinal()];
        if (i == 1) {
            aVar = new a(aVar2.b, str, aVar2.d);
        } else if (i == 2) {
            aVar = new a(str, aVar2.c, aVar2.d);
        } else if (i != 3) {
            return;
        } else {
            aVar = new a(aVar2.b, aVar2.c, str);
        }
        this.e = aVar;
        if (!this.h) {
            return;
        }
        if (!this.f) {
            this.f = true;
            DimensionSet create = DimensionSet.create();
            create.addDimension("falcoId");
            create.addDimension("visitFalcoId");
            create.addDimension("networkFalcoId");
            create.addDimension("sysLoadFalcoId");
            AppMonitor.register("falco", "falco_global", MeasureSet.create(), create, true);
        }
        DimensionValueSet create2 = DimensionValueSet.create();
        create2.setValue("falcoId", aVar.f17107a);
        create2.setValue("visitFalcoId", aVar.b);
        create2.setValue("networkFalcoId", aVar.c);
        create2.setValue("sysLoadFalcoId", aVar.d);
        AppMonitor.Stat.commit("falco", "falco_global", create2, MeasureValueSet.create());
    }
}
