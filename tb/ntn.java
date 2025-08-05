package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observer;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class ntn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ntn INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ntq f31754a;

    static {
        kge.a(1950716143);
        INSTANCE = new ntn();
        f31754a = new ntq("global");
    }

    private ntn() {
    }

    public final void a(String namespace, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d3436b", new Object[]{this, namespace, observer});
            return;
        }
        q.c(namespace, "namespace");
        q.c(observer, "observer");
        f31754a.a(namespace, observer);
    }

    public final void b(String namespace, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b14b22c", new Object[]{this, namespace, observer});
            return;
        }
        q.c(namespace, "namespace");
        q.c(observer, "observer");
        f31754a.b(namespace, observer);
    }

    public final boolean a(String namespace, String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4519965c", new Object[]{this, namespace, key, value})).booleanValue();
        }
        q.c(namespace, "namespace");
        q.c(key, "key");
        q.c(value, "value");
        return f31754a.a(namespace, key, value);
    }

    public final void a(String namespace, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, namespace, key});
            return;
        }
        q.c(namespace, "namespace");
        q.c(key, "key");
        f31754a.a(namespace, key);
    }

    public final void a(String namespace, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, namespace, new Integer(i)});
            return;
        }
        q.c(namespace, "namespace");
        f31754a.a(namespace, i);
    }
}
