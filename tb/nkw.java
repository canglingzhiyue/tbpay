package tb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoExceptionReporter;
import com.taobao.application.common.a;
import com.taobao.falco.FalcoEnvironment;
import com.taobao.weex.ui.component.WXImage;
import tb.tpr;

/* loaded from: classes7.dex */
public class nkw implements FalcoExceptionReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31538a = false;
    private static volatile boolean b = false;
    private static volatile boolean c = true;
    private static volatile b d;
    private final b e = new b();

    public static /* synthetic */ b a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b21b66ee", new Object[]{bVar});
        }
        d = bVar;
        return bVar;
    }

    public static /* synthetic */ void a(nkw nkwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f664ee3e", new Object[]{nkwVar});
        } else {
            nkwVar.c();
        }
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        f31538a = z;
        if (!z) {
            ALog.e("falco.reporter", "[init] report not enabled", null, new Object[0]);
            return;
        }
        try {
            a aVar = new a();
            tpr.a().a((tpr.a) aVar);
            tpr.a().a((tpr.b) aVar);
        } catch (Throwable th) {
            ALog.e("falco.reporter", "[init] error", null, th, new Object[0]);
        }
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4fec5465", new Object[0]) : d;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("a2562627", new Object[]{this, new Integer(i)});
        }
        b.a(this.e, i);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("7d656e7e", new Object[]{this, str});
        }
        b.a(this.e, str);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("6eb6fdff", new Object[]{this, str});
        }
        b.b(this.e, str);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("60088d80", new Object[]{this, str});
        }
        b.c(this.e, str);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!f31538a) {
            ALog.e("falco.reporter", "[report] not enabled", null, new Object[0]);
        } else {
            dit.g(new Runnable() { // from class: tb.nkw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nkw.a(nkw.this);
                    }
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        b.d(this.e, SceneIdentifier.getCurrentPageNameWithFragment());
        b.e(this.e, c ? "launchLoad" : ept.PAGELOAD);
        FalcoEnvironment a2 = FalcoEnvironment.a();
        if (a2 != null) {
            String b2 = a2.b();
            tis c2 = a2.c();
            b.f(this.e, c2.b);
            b.g(this.e, c2.c);
            b.h(this.e, b2);
        }
        d = this.e;
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("falcoId", b.a(this.e));
        create.setValue("errorCode", b.b(this.e));
        create.setValue(WXImage.ERRORDESC, b.c(this.e));
        create.setValue("errorSignal", String.valueOf(b.d(this.e)));
        create.setValue("pageName", b.e(this.e));
        create.setValue("pageUrl", b.f(this.e));
        create.setValue(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_LOAD_TYPE, b.g(this.e));
        create.setValue("afcType", b.h(this.e));
        create.setValue("launchUrl", b.i(this.e));
        create.setValue("envFalcoId", b.j(this.e));
        AppMonitor.Stat.commit("falco", "falco_exception", create, MeasureValueSet.create());
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (b) {
        } else {
            b = true;
            DimensionSet create = DimensionSet.create();
            create.addDimension("falcoId");
            create.addDimension("errorCode");
            create.addDimension(WXImage.ERRORDESC);
            create.addDimension("errorSignal");
            create.addDimension("pageName");
            create.addDimension("pageUrl");
            create.addDimension(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_LOAD_TYPE);
            create.addDimension("afcType");
            create.addDimension("launchUrl");
            create.addDimension("envFalcoId");
            AppMonitor.register("falco", "falco_exception", MeasureSet.create(), create);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f31540a = tmt.a();
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";
        private String g = "";
        private String h = "";
        private String i = "";
        private int j = 1;

        public static /* synthetic */ int a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("74117b6", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.j = i;
            return i;
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22191960", new Object[]{bVar}) : bVar.f31540a;
        }

        public static /* synthetic */ String a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b60fccd6", new Object[]{bVar, str});
            }
            bVar.b = str;
            return str;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa49593f", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a7b972f5", new Object[]{bVar, str});
            }
            bVar.c = str;
            return str;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3279991e", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ String c(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("99631914", new Object[]{bVar, str});
            }
            bVar.e = str;
            return str;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd4a01f6", new Object[]{bVar})).intValue() : bVar.j;
        }

        public static /* synthetic */ String d(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8b0cbf33", new Object[]{bVar, str});
            }
            bVar.d = str;
            return str;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42da18dc", new Object[]{bVar}) : bVar.d;
        }

        public static /* synthetic */ String e(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7cb66552", new Object[]{bVar, str});
            }
            bVar.f = str;
            return str;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb0a58bb", new Object[]{bVar}) : bVar.e;
        }

        public static /* synthetic */ String f(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6e600b71", new Object[]{bVar, str});
            }
            bVar.g = str;
            return str;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("533a989a", new Object[]{bVar}) : bVar.f;
        }

        public static /* synthetic */ String g(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6009b190", new Object[]{bVar, str});
            }
            bVar.h = str;
            return str;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("db6ad879", new Object[]{bVar}) : bVar.g;
        }

        public static /* synthetic */ String h(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("51b357af", new Object[]{bVar, str});
            }
            bVar.i = str;
            return str;
        }

        public static /* synthetic */ String i(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("639b1858", new Object[]{bVar}) : bVar.h;
        }

        public static /* synthetic */ String j(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebcb5837", new Object[]{bVar}) : bVar.i;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.j;
        }
    }

    /* loaded from: classes7.dex */
    public static final class a implements a.c, tpr.a, tpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.tpr.b
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5d51079", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // tb.tpr.b
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a112a7bb", new Object[]{this, fragmentManager, fragment, bundle});
            }
        }

        @Override // tb.tpr.b
        public void c(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d7b3b7", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // tb.tpr.a
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // tb.tpr.a
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // tb.tpr.a
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        private a() {
        }

        @Override // com.taobao.application.common.IAppLaunchListener
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 != 1) {
            } else {
                nkw.b(true);
            }
        }

        @Override // tb.tpr.a
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            nkw.b(false);
            nkw.a((b) null);
        }

        @Override // tb.tpr.b
        public void b(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eed66218", new Object[]{this, fragmentManager, fragment});
                return;
            }
            nkw.b(false);
            nkw.a((b) null);
        }
    }
}
