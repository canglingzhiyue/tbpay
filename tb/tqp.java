package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import kotlin.t;

/* loaded from: classes7.dex */
public final class tqp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_DATA_KEY = "search_door:data";
    public static final String CACHE_KEY = "search_door:cache";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f34288a = new ReentrantLock();
    private com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b b;

    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (tqp.a(tqp.this)) {
                String b = cuj.b(Globals.getApplication(), tqp.CACHE_DATA_KEY, "");
                if (!TextUtils.isEmpty(b)) {
                    tqp.a(tqp.this, new nqo("").a(JSON.parseObject(b)));
                }
                t tVar = t.INSTANCE;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34290a;

        public c(String str) {
            this.f34290a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cuj.a((Context) Globals.getApplication(), tqp.CACHE_KEY, true);
            cuj.a(Globals.getApplication(), tqp.CACHE_DATA_KEY, this.f34290a);
        }
    }

    static {
        kge.a(-138694064);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-749930088);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static final /* synthetic */ ReentrantLock a(tqp tqpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReentrantLock) ipChange.ipc$dispatch("80593fe7", new Object[]{tqpVar}) : tqpVar.f34288a;
    }

    public static final /* synthetic */ void a(tqp tqpVar, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338c98b1", new Object[]{tqpVar, bVar});
        } else {
            tqpVar.b = bVar;
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!b()) {
        } else {
            Coordinator.execute(new b());
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : cuj.b((Context) Globals.getApplication(), CACHE_KEY, false);
    }

    public final com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b c() {
        com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b) ipChange.ipc$dispatch("b80832b8", new Object[]{this});
        }
        synchronized (this.f34288a) {
            bVar = this.b;
        }
        return bVar;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            Coordinator.execute(new c(str));
        }
    }
}
