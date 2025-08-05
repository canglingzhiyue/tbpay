package com.taobao.prefork;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.f;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.utils.m;
import com.taobao.homepage.utils.n;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.prefork.b;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ksr;
import tb.opf;
import tb.oqc;
import tb.ovr;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ViewFactory";
    private static volatile b b;
    private static a c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object<com.taobao.android.dinamic.view.b>> f18942a = new ConcurrentHashMap();

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    public static /* synthetic */ a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b5d76677", new Object[0]) : c;
    }

    public static /* synthetic */ b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ddcf28f3", new Object[0]) : b;
    }

    static {
        kge.a(-954144696);
        b = new b();
        try {
            f.a(new f.a() { // from class: com.taobao.prefork.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.f.a
                public void a(Context context, Configuration configuration) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("17021990", new Object[]{this, context, configuration});
                        return;
                    }
                    if (b.e() != null) {
                        try {
                            b.e().interrupt();
                        } catch (Throwable unused) {
                        }
                    }
                    if (b.f() == null) {
                        return;
                    }
                    try {
                        b.f().b();
                    } catch (Throwable unused2) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d4908958", new Object[0]);
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f18942a.clear();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a aVar = new a("async-render-thread");
        c = aVar;
        aVar.start();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b();
        b = null;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        DTemplateManager.a("homepage").a(64);
        DTemplateManager.a("guess").a(64);
        ovr.d().a(64);
    }

    public void a(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be04981", new Object[]{this, application, str});
        } else if (l.e(application)) {
        } else {
            b(str);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-10976217);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fff79575", new Object[]{aVar});
            } else {
                aVar.b();
            }
        }

        public a(String str) {
            super(str);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                Process.setThreadPriority(0);
            } catch (Throwable unused) {
            }
            DTemplateManager.a("homepage").a(64);
            DTemplateManager.a("guess").a(64);
            ovr.d().a(64);
            if (n.o() || n.g()) {
                b();
                return;
            }
            final String l = oqc.a().l();
            final String m = oqc.a().m();
            com.taobao.tao.recommend3.tracelog.b.a(m).a("loadPreRenderCache", 3);
            d.f(l).a(new ArrayList<String>(1) { // from class: com.taobao.prefork.ViewFactory$CreateViewThread$1
                {
                    b.a.this = this;
                    add(l);
                    add(m);
                }
            }, new opf() { // from class: com.taobao.prefork.b.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.opf
                public void a(List<String> list, List<String> list2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
                        return;
                    }
                    com.taobao.tao.recommend3.tracelog.b.a(m).b("loadPreRenderCache");
                    if (list == null || list.size() <= 0) {
                        return;
                    }
                    a.a(a.this);
                }
            });
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            e.e(m.TAG, "preRenderTemplates searchBar");
            b.a(oqc.a().l());
            b.a(oqc.a().m());
            e.e("ViewFactory", "finish preRender");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.taobao.tao.recommend3.tracelog.b.a().a("ViewFactory", 3);
            e.e("ViewFactory", "CreateViewThread run");
            try {
                Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(Looper.getMainLooper());
                if (obj instanceof ThreadLocal) {
                    ((ThreadLocal) obj).set(Looper.getMainLooper());
                }
                e.e("ViewFactory", "myLooper:" + Looper.myLooper());
                try {
                    a();
                } catch (Exception e) {
                    e.a("ViewFactory", "runInner", e);
                }
                com.taobao.tao.recommend3.tracelog.b.a().b("ViewFactory");
            } catch (Exception unused) {
                e.e("ViewFactory", "设置MainLooper失败，异步创建view中止");
                ksr.a("设置MainLooper失败", "GUESS_YOU_LIKE");
            }
        }
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        AwesomeGetContainerData b2 = d.f(str).b(str);
        if (b2 == null || b2.base == null || !b2.base.isCacheData) {
            return;
        }
        List<SectionModel> totalData = b2.getTotalData();
        if (!totalData.isEmpty()) {
            m.a(str, totalData, "loadCache", 0);
            return;
        }
        e.e("GlobalTrace", "preRenderCards failed, data is empty, cid=" + str);
    }
}
