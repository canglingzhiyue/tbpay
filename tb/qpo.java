package tb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.register.c;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.basic.a;
import com.taobao.themis.kernel.basic.b;
import com.taobao.themis.kernel.utils.t;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qpn;

/* loaded from: classes9.dex */
public class qpo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSInitializer";

    /* renamed from: a  reason: collision with root package name */
    public static String f33023a;
    public static AtomicBoolean b;
    private static AtomicBoolean c;

    static {
        kge.a(-1034017519);
        f33023a = "tms_manifest";
        b = new AtomicBoolean(false);
        c = new AtomicBoolean(false);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        qpn b2 = b(context);
        e(context);
        b(b2);
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        t.a(context);
        e(context);
    }

    private static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else if (c.get()) {
        } else {
            a(b(context));
        }
    }

    private static qpn b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null && applicationInfo.metaData.containsKey(f33023a)) {
                return (qpn) Class.forName(applicationInfo.metaData.getString(f33023a)).newInstance();
            }
            return null;
        } catch (Throwable th) {
            TMSLogger.b("TMSInitializer!", "findManifestClass exception ", th);
            return null;
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            b(b(context));
        }
    }

    private static void a(qpn qpnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc5d649", new Object[]{qpnVar});
        } else if (qpnVar == null) {
            TMSLogger.d(TAG, "registerAdapters but mainManifest is null!");
        } else {
            List<qpn.f> adapters = qpnVar.getAdapters();
            if (adapters == null || adapters.isEmpty()) {
                TMSLogger.d(TAG, "registerAdapters but adapterList is empty!");
                return;
            }
            for (qpn.f fVar : adapters) {
                if (fVar instanceof qpn.d) {
                    qpn.d dVar = (qpn.d) fVar;
                    qpt.a((Class<? super a>) dVar.f33022a, dVar.b);
                } else if (fVar instanceof qpn.c) {
                    qpn.c cVar = (qpn.c) fVar;
                    qpt.a((Class) cVar.f33021a, (b) cVar.b);
                }
            }
            c.set(true);
        }
    }

    private static void b(qpn qpnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea48dcca", new Object[]{qpnVar});
        } else if (qpnVar == null) {
            TMSLogger.d(TAG, "registerAbilities but mainManifest is null!");
        } else {
            List<qpn.e> abilities = qpnVar.getAbilities();
            if (abilities == null || abilities.isEmpty()) {
                TMSLogger.d(TAG, "registerAbilities but abilityList is empty!");
                return;
            }
            for (qpn.e eVar : abilities) {
                if (eVar instanceof qpn.b) {
                    qpn.b bVar = (qpn.b) eVar;
                    c.a(bVar.b, bVar.f33020a);
                } else if (eVar instanceof qpn.a) {
                    qpn.a aVar = (qpn.a) eVar;
                    c.a(aVar.b, aVar.c, aVar.f33019a);
                }
            }
            b.set(true);
        }
    }
}
