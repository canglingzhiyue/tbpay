package tb;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.model.theme.a;
import com.taobao.android.detail.wrapper.ext.provider.core.TBAppProvider;
import com.taobao.android.detail.wrapper.ext.provider.core.TBNavProvider;
import com.taobao.android.detail.wrapper.ext.provider.core.TBShareProvider;
import com.taobao.android.detail.wrapper.ext.provider.core.d;
import com.taobao.android.detail.wrapper.ext.provider.core.f;
import com.taobao.android.detail.wrapper.ext.provider.core.g;
import com.taobao.android.detail.wrapper.ext.provider.core.h;
import com.taobao.android.detail.wrapper.ext.provider.core.i;
import com.taobao.android.detail.wrapper.ext.provider.core.j;
import com.taobao.android.detail.wrapper.ext.provider.option.TBTrackProvider;
import com.taobao.android.detail.wrapper.ext.provider.option.b;
import com.taobao.android.detail.wrapper.ext.provider.option.c;
import com.taobao.android.e;
import com.taobao.android.k;
import com.taobao.android.o;
import com.taobao.android.t;
import com.taobao.android.u;
import com.taobao.tao.Globals;
import java.util.Map;

/* loaded from: classes5.dex */
public class fac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static d f27709a;
    private static boolean b;

    static {
        kge.a(-1845835410);
        f27709a = null;
        b = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.TBDetailInitializer");
        if (b) {
            return;
        }
        c();
        ecq.a();
        b = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.fac$1] */
    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        a aVar = new a();
        aVar.f9541a = "theme1";
        dzi.a(aVar);
        rlz.a(Globals.getApplication());
        new AsyncTask<Void, Void, Void>() { // from class: tb.fac.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                rlz.a().b("template_alias_theme.json");
                try {
                    eoy.f27501a = (Map) JSON.parseObject(rml.a(Globals.getApplication(), "template_alias_theme.json"), Map.class);
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        rlz.a().a("theme1");
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        epj.a(new TBAppProvider());
        epj.a(new TBNavProvider(t.a()));
        epj.a(new TBShareProvider());
        epj.a(new TBTrackProvider(u.a()));
        epj.a(new b(e.a()));
        epj.a(new i());
        epj.a(new h(k.a().a(Globals.getApplication())));
        epj.a(new j(o.a()));
        epj.a(new com.taobao.android.detail.wrapper.ext.provider.option.d());
        epj.a(new g());
        epj.a(new com.taobao.android.detail.wrapper.ext.provider.option.a());
        epj.a(new c());
        long currentTimeMillis2 = System.currentTimeMillis();
        String a2 = com.taobao.android.detail.core.performance.j.a("TBDetailInitializer");
        com.taobao.android.detail.core.utils.i.d(a2, "initDetailAdapters 1:" + (currentTimeMillis2 - currentTimeMillis) + "ms");
        ehk.a(new com.taobao.android.detail.wrapper.ext.provider.core.e());
        ehk.a(new f());
        ehk.a(new com.taobao.android.detail.wrapper.ext.provider.core.a());
        ehk.a(new com.taobao.android.detail.wrapper.ext.provider.core.b());
        ehk.a(new com.taobao.android.detail.wrapper.ext.provider.core.k());
        d();
        b();
        String a3 = com.taobao.android.detail.core.performance.j.a("TBDetailInitializer");
        com.taobao.android.detail.core.utils.i.d(a3, "initDetailAdapters 2:" + (System.currentTimeMillis() - currentTimeMillis2) + "ms");
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            f27709a = new d();
        }
    }
}
