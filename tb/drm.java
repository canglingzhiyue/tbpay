package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class drm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26925a = false;
    public static final ConcurrentHashMap<String, drk<?>> b = new ConcurrentHashMap<>();

    public static <T> Pair<Boolean, T> a(String str) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str});
        }
        e eVar = new e();
        if (f26925a) {
            drk<?> drkVar = b.get(str);
            if (drkVar != null) {
                Pair<Boolean, T> pair2 = (Pair<Boolean, T>) drkVar.a(eVar);
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                e.b(eVar, timeUnit, "Cache", "auto got " + str + " :");
                return pair2;
            }
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            e.c(eVar, timeUnit2, "Cache", "auto missing " + str + " :");
            return new Pair<>(Boolean.FALSE, null);
        }
        ConcurrentHashMap<String, drk<?>> concurrentHashMap = b;
        synchronized (concurrentHashMap) {
            drk<?> drkVar2 = concurrentHashMap.get(str);
            if (drkVar2 != null) {
                Pair<Boolean, ?> a2 = drkVar2.a(eVar);
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                e.b(eVar, timeUnit3, "Cache", "auto got " + str + " :");
                pair = a2;
            } else {
                TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                e.c(eVar, timeUnit4, "Cache", "auto missing " + str + " :");
                pair = new Pair(Boolean.FALSE, null);
            }
        }
        return pair;
    }

    public static <T> T b(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6e4e661f", new Object[]{str});
        }
        Pair a2 = a(str);
        if (!((Boolean) a2.first).booleanValue()) {
            return null;
        }
        return (T) a2.second;
    }

    public static <V> void a(drl<V> drlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b21c7a", new Object[]{drlVar});
        } else if (f26925a) {
            drk<?> a2 = drk.a((drl) drlVar);
            if (b.putIfAbsent(drlVar.f26924a, a2) != null) {
                return;
            }
            a2.b();
            cun.b("Cache", "ValueCache: +" + a2);
        } else {
            ConcurrentHashMap<String, drk<?>> concurrentHashMap = b;
            synchronized (concurrentHashMap) {
                if (concurrentHashMap.get(drlVar.f26924a) == null) {
                    drk<?> a3 = drk.a((drl) drlVar);
                    concurrentHashMap.put(a3.c, a3);
                    a3.b();
                    cun.b("Cache", "ValueCache: +" + a3);
                }
            }
        }
    }
}
