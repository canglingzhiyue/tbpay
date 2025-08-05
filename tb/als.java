package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public interface als {
    String a();

    als a(View view);

    als a(String str, Object obj);

    void a(Object obj);

    void a(WeakReference<View> weakReference);

    void a(Map<String, Object> map);

    void a(alt altVar);

    alt b();

    void b(String str);

    <T> T c(String str);

    WeakReference<View> c();

    Object d();

    Map<String, Object> e();

    alt f();

    View g();

    com.alibaba.ability.env.a h();

    String i();

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1467051536);
        }

        public static als a(als alsVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (als) ipChange.ipc$dispatch("4f5b80fc", new Object[]{alsVar, view});
            }
            if (view != null) {
                alsVar.a(new WeakReference<>(view));
            }
            return alsVar;
        }

        public static alt a(als alsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (alt) ipChange.ipc$dispatch("7c59c7cd", new Object[]{alsVar});
            }
            alt b = alsVar.b();
            if (b != null) {
                return b;
            }
            alr alrVar = new alr("unknown", null, 2, null);
            alsVar.a((alt) alrVar);
            return alrVar;
        }

        public static View b(als alsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("fcf6e8b3", new Object[]{alsVar});
            }
            WeakReference<View> c = alsVar.c();
            if (c == null) {
                return null;
            }
            return c.get();
        }

        public static als a(als alsVar, String key, Object data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (als) ipChange.ipc$dispatch("d0296dc8", new Object[]{alsVar, key, data});
            }
            q.d(key, "key");
            q.d(data, "data");
            if (alsVar.e() == null) {
                alsVar.a((Map<String, Object>) new LinkedHashMap());
            }
            Map<String, Object> e = alsVar.e();
            q.a(e);
            e.put(key, data);
            return alsVar;
        }

        public static <T> T a(als alsVar, String key) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("da715878", new Object[]{alsVar, key});
            }
            q.d(key, "key");
            Map<String, Object> e = alsVar.e();
            T t = e != null ? (T) e.get(key) : null;
            if (t instanceof Object) {
                return t;
            }
            return null;
        }
    }
}
