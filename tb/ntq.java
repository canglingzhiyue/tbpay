package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.muise.r;
import java.util.HashMap;
import java.util.Observer;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class ntq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String SCOPE_GLOBAL = "global";
    public static final String SCOPE_PAGE = "page";

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, r> f31756a;
    private final String b;

    static {
        kge.a(-199965614);
        Companion = new a(null);
    }

    public ntq(String mScope) {
        q.c(mScope, "mScope");
        this.b = mScope;
        this.f31756a = new HashMap<>();
    }

    public final void a(String namespace, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d3436b", new Object[]{this, namespace, observer});
            return;
        }
        q.c(namespace, "namespace");
        q.c(observer, "observer");
        r rVar = this.f31756a.get(namespace);
        if (rVar == null) {
            rVar = new r(namespace, this.b);
            this.f31756a.put(namespace, rVar);
        }
        rVar.addObserver(observer);
        observer.update(rVar, rVar.a("SUCCESS"));
    }

    public final void b(String namespace, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b14b22c", new Object[]{this, namespace, observer});
            return;
        }
        q.c(namespace, "namespace");
        q.c(observer, "observer");
        r rVar = this.f31756a.get(namespace);
        if (rVar == null) {
            return;
        }
        q.a((Object) rVar, "mValues[namespace] ?: return");
        rVar.deleteObserver(observer);
    }

    public final boolean a(String namespace, String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4519965c", new Object[]{this, namespace, key, value})).booleanValue();
        }
        q.c(namespace, "namespace");
        q.c(key, "key");
        q.c(value, "value");
        r rVar = this.f31756a.get(namespace);
        if (rVar == null) {
            rVar = new r(namespace, this.b);
            this.f31756a.put(namespace, rVar);
        }
        return rVar.a(key, value);
    }

    public final void a(String namespace, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, namespace, key});
            return;
        }
        q.c(namespace, "namespace");
        q.c(key, "key");
        r rVar = this.f31756a.get(namespace);
        if (rVar == null) {
            return;
        }
        q.a((Object) rVar, "mValues[namespace] ?: return");
        rVar.b(key);
    }

    public final void a(String namespace, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, namespace, new Integer(i)});
            return;
        }
        q.c(namespace, "namespace");
        r rVar = this.f31756a.get(namespace);
        if (rVar == null) {
            rVar = new r(namespace, this.b);
            this.f31756a.put(namespace, rVar);
        }
        rVar.a(i);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(851505434);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
