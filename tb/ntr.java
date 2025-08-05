package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class ntr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ntr INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final WeakHashMap<Activity, ntq> f31757a;

    static {
        kge.a(-113704125);
        INSTANCE = new ntr();
        f31757a = new WeakHashMap<>();
    }

    private ntr() {
    }

    public final void a(Activity activity, String namespace, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2d6f3d", new Object[]{this, activity, namespace, observer});
            return;
        }
        q.c(activity, "activity");
        q.c(namespace, "namespace");
        q.c(observer, "observer");
        a(activity).a(namespace, observer);
    }

    public final void b(Activity activity, String namespace, Observer observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bece73e", new Object[]{this, activity, namespace, observer});
            return;
        }
        q.c(activity, "activity");
        q.c(namespace, "namespace");
        q.c(observer, "observer");
        a(activity).b(namespace, observer);
    }

    public final boolean a(Activity activity, String namespace, String key, Object value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d15de2e", new Object[]{this, activity, namespace, key, value})).booleanValue();
        }
        q.c(activity, "activity");
        q.c(namespace, "namespace");
        q.c(key, "key");
        q.c(value, "value");
        return a(activity).a(namespace, key, value);
    }

    public final void a(Activity activity, String namespace, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{this, activity, namespace, key});
            return;
        }
        q.c(activity, "activity");
        q.c(namespace, "namespace");
        q.c(key, "key");
        a(activity).a(namespace, key);
    }

    public final void a(Activity activity, String namespace, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea7fe7f", new Object[]{this, activity, namespace, new Integer(i)});
            return;
        }
        q.c(activity, "activity");
        q.c(namespace, "namespace");
        a(activity).a(namespace, i);
    }

    private final ntq a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntq) ipChange.ipc$dispatch("2d8ed81", new Object[]{this, activity});
        }
        ntq ntqVar = f31757a.get(activity);
        if (ntqVar != null) {
            return ntqVar;
        }
        ntq ntqVar2 = new ntq("page");
        f31757a.put(activity, ntqVar2);
        return ntqVar2;
    }
}
