package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.extension.page.af;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.d;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class teh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final teh INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, WeakReference<f>> f34056a;

    static {
        kge.a(2091570012);
        INSTANCE = new teh();
        f34056a = new ConcurrentHashMap<>();
    }

    private teh() {
    }

    @JvmStatic
    public static final f a(Activity activity, InstanceStartParams startParams, TMSContainerType containerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a71882bb", new Object[]{activity, startParams, containerType});
        }
        q.d(activity, "activity");
        q.d(startParams, "startParams");
        q.d(containerType, "containerType");
        d.a("TMSInstanceManager#createInstance", (Pair) null, (Pair) null, 6, (Object) null);
        try {
            f fVar = new f(activity, startParams, containerType);
            fVar.a(new thl(fVar));
            fVar.a(new af(fVar));
            String f = fVar.f();
            q.b(f, "instance.instanceId");
            f34056a.put(f, new WeakReference<>(fVar));
            return fVar;
        } finally {
            d.a("TMSInstanceManager#createInstance");
        }
    }

    @JvmStatic
    public static final f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6355fc29", new Object[]{str});
        }
        WeakReference<f> weakReference = f34056a.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    public static final void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{instance});
            return;
        }
        q.d(instance, "instance");
        f34056a.remove(instance.f());
    }
}
