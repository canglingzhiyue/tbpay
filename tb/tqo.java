package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.android.weex_framework.module.builtin.storage.b;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class tqo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String HIDE_DISCOVERY = "hideSearchDiscovery";
    public static final String HIDE_SPOT_KEY = "hideWidgetNew";
    public static final int HOT_SPOT_MAX_SIZE = 20;
    public static final int HOT_SPOT_TAB_MAX_SIZE = 5;
    private static com.taobao.search.searchdoor.e p;
    private static AtomicBoolean q;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<View> f34279a;
    private final ArrayList<View> b;
    private View c;
    private AtomicBoolean d;
    private AtomicBoolean e;
    private final com.taobao.android.weex_framework.module.builtin.storage.a f;
    private boolean g;
    private boolean h;
    private final LinearLayout i;
    private final LayoutInflater j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final ExecutorService n;
    private final WeakReference<Activity> o;

    /* loaded from: classes7.dex */
    public static final class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // com.taobao.android.virtual_thread.face.h
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "HotSpotsItemPool";
        }
    }

    /* loaded from: classes7.dex */
    public static final class d extends i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LayoutInflater b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ boolean d;

        /* loaded from: classes7.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f34285a;
            public final /* synthetic */ d b;
            public final /* synthetic */ Activity c;

            public a(View view, d dVar, Activity activity) {
                this.f34285a = view;
                this.b = dVar;
                this.c = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    tqo.a(tqo.this, this.f34285a);
                }
            }
        }

        public d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            this.b = layoutInflater;
            this.c = viewGroup;
            this.d = z;
        }

        @Override // com.taobao.android.searchbaseframe.util.i
        public void a() {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (tqo.a(tqo.this).get() || (activity = (Activity) tqo.b(tqo.this).get()) == null) {
            } else {
                q.a((Object) activity, "context.get() ?: return");
                Activity activity2 = activity;
                LayoutInflater inl = this.b.cloneInContext(activity2);
                com.taobao.search.searchdoor.e h = tqo.h();
                if (h == null) {
                    q.a();
                }
                q.a((Object) inl, "inl");
                activity.runOnUiThread(new a(h.loadGuessView(activity2, inl, this.c, this.d), this, activity));
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class e extends i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ LayoutInflater b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ boolean d;

        /* loaded from: classes7.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f34287a;
            public final /* synthetic */ Activity b;
            public final /* synthetic */ e c;

            public a(View view, Activity activity, e eVar) {
                this.f34287a = view;
                this.b = activity;
                this.c = eVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    tqo.c(tqo.this).add(this.f34287a);
                }
            }
        }

        public e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            this.b = layoutInflater;
            this.c = viewGroup;
            this.d = z;
        }

        @Override // com.taobao.android.searchbaseframe.util.i
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            for (int i = 0; i < 5; i++) {
                if (!tqo.a(tqo.this).get()) {
                    Activity activity = (Activity) tqo.b(tqo.this).get();
                    if (activity == null) {
                        return;
                    }
                    q.a((Object) activity, "context.get() ?: return");
                    com.taobao.search.searchdoor.e h = tqo.h();
                    if (h == null) {
                        q.a();
                    }
                    activity.runOnUiThread(new a(h.loadHotSpotTab(activity, this.b, this.c, this.d), activity, this));
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class f implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class g implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final g INSTANCE = new g();

        @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(839825686);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public tqo(WeakReference<Activity> context) {
        q.c(context, "context");
        this.o = context;
        this.f34279a = new ArrayList<>(20);
        this.b = new ArrayList<>(5);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new com.taobao.android.weex_framework.module.builtin.storage.a(Globals.getApplication());
        this.i = new LinearLayout(this.o.get());
        this.j = LayoutInflater.from(this.o.get());
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(1, b.INSTANCE);
        q.a((Object) newFixedThreadPool, "VExecutors.newFixedThrea… ) { \"HotSpotsItemPool\" }");
        this.n = newFixedThreadPool;
        ExecutorService executorService = this.n;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) (!(executorService instanceof ThreadPoolExecutor) ? null : executorService);
        if (threadPoolExecutor != null) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        }
        this.f.a(HIDE_SPOT_KEY, new b.a() { // from class: tb.tqo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
            public final void a(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                tqo tqoVar = tqo.this;
                String str = null;
                if (!(map instanceof JSONObject)) {
                    map = null;
                }
                JSONObject jSONObject = (JSONObject) map;
                if (jSONObject != null) {
                    str = jSONObject.getString("data");
                }
                tqo.b(tqoVar, q.a((Object) str, (Object) "true"));
            }
        });
        this.f.a(HIDE_DISCOVERY, new b.a() { // from class: tb.tqo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
            public final void a(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                tqo tqoVar = tqo.this;
                String str = null;
                if (!(map instanceof JSONObject)) {
                    map = null;
                }
                JSONObject jSONObject = (JSONObject) map;
                if (jSONObject != null) {
                    str = jSONObject.getString("data");
                }
                tqo.c(tqoVar, q.a((Object) str, (Object) "true"));
            }
        });
        j();
    }

    public static final /* synthetic */ AtomicBoolean a(tqo tqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("724bf9c6", new Object[]{tqoVar}) : tqoVar.d;
    }

    public static final /* synthetic */ void a(com.taobao.search.searchdoor.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a8ad37", new Object[]{eVar});
        } else {
            p = eVar;
        }
    }

    public static final /* synthetic */ void a(tqo tqoVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7530c", new Object[]{tqoVar, view});
        } else {
            tqoVar.c = view;
        }
    }

    public static final /* synthetic */ void a(tqo tqoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d6b478e", new Object[]{tqoVar, new Boolean(z)});
        } else {
            tqoVar.d(z);
        }
    }

    public static final /* synthetic */ WeakReference b(tqo tqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("5d6fded5", new Object[]{tqoVar}) : tqoVar.o;
    }

    public static final /* synthetic */ void b(tqo tqoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff49112d", new Object[]{tqoVar, new Boolean(z)});
        } else {
            tqoVar.g = z;
        }
    }

    public static final /* synthetic */ ArrayList c(tqo tqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("4b7508e2", new Object[]{tqoVar}) : tqoVar.b;
    }

    public static final /* synthetic */ void c(tqo tqoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e126dacc", new Object[]{tqoVar, new Boolean(z)});
        } else {
            tqoVar.h = z;
        }
    }

    public static final /* synthetic */ AtomicBoolean d(tqo tqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("ee48f989", new Object[]{tqoVar}) : tqoVar.e;
    }

    public static final /* synthetic */ boolean e(tqo tqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("baff060e", new Object[]{tqoVar})).booleanValue() : tqoVar.k;
    }

    public static final /* synthetic */ void f(tqo tqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9820c8b", new Object[]{tqoVar});
        } else {
            tqoVar.j();
        }
    }

    public static final /* synthetic */ com.taobao.search.searchdoor.e h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.searchdoor.e) ipChange.ipc$dispatch("623f70d6", new Object[0]) : p;
    }

    public static final /* synthetic */ AtomicBoolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f5c311b0", new Object[0]) : q;
    }

    static {
        kge.a(402724686);
        Companion = new a(null);
        q = new AtomicBoolean(false);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.l || this.d.get()) {
        } else {
            this.l = true;
            this.k = z;
            if (q.get()) {
                d(z);
            }
            this.e.set(true);
        }
    }

    private final void a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae82f4fb", new Object[]{this, layoutInflater, viewGroup, new Boolean(z)});
        } else {
            this.n.execute(new d(layoutInflater, viewGroup, z));
        }
    }

    private final void b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf38c1bc", new Object[]{this, layoutInflater, viewGroup, new Boolean(z)});
        } else {
            this.n.execute(new e(layoutInflater, viewGroup, z));
        }
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (p != null) {
        } else {
            try {
                com.alibaba.flexa.compat.c.a("com.taobao.search.sf.remote.ActivateViewLoader", new c());
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes7.dex */
        public static final class a<TResult> implements com.alibaba.android.split.core.tasks.e<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public final void a(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
                } else {
                    tqo.f(tqo.this);
                }
            }
        }

        public c() {
        }

        @Override // com.alibaba.flexa.compat.c.a
        public void onClassLoaded(Class<?> aClass) {
            q.c(aClass, "aClass");
            Object newInstance = aClass.newInstance();
            if (!(newInstance instanceof com.taobao.search.searchdoor.e)) {
                newInstance = null;
            }
            com.taobao.search.searchdoor.e eVar = (com.taobao.search.searchdoor.e) newInstance;
            if (eVar == null) {
                return;
            }
            tqo.a(eVar);
            if (!tqo.a(tqo.this).get() && tqo.d(tqo.this).get()) {
                tqo tqoVar = tqo.this;
                tqo.a(tqoVar, tqo.e(tqoVar));
            }
            tqo.i().set(true);
        }

        @Override // com.alibaba.flexa.compat.c.a
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                com.alibaba.android.split.core.splitinstall.h.a(Globals.getApplication()).a(j.a().a("tbsearch_remote").a()).a(new a());
            }
        }
    }

    private final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            LayoutInflater inflater = this.j;
            q.a((Object) inflater, "inflater");
            a(inflater, this.i, z);
            LayoutInflater inflater2 = this.j;
            q.a((Object) inflater2, "inflater");
            b(inflater2, this.i, z);
        } catch (Exception unused) {
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f.a(HIDE_SPOT_KEY, String.valueOf(z), g.INSTANCE);
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.g;
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f.a(HIDE_DISCOVERY, String.valueOf(z), f.INSTANCE);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.h;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.m) {
        } else {
            this.m = true;
            this.n.shutdownNow();
            this.f.a();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d.get()) {
        } else {
            this.d.set(true);
        }
    }

    public final ArrayList<View> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("bbce4046", new Object[]{this}) : this.f34279a;
    }

    public final ArrayList<View> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("3ffe8d47", new Object[]{this}) : this.b;
    }

    public final View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : this.c;
    }
}
