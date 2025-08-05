package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes2.dex */
public class amj<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Class<? extends amk<T>>> f25447a = new LinkedHashMap();
    private Map<String, Map<String, T>> b = new LinkedHashMap();

    static {
        kge.a(387941050);
    }

    public final T a(String key, String category) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c254b136", new Object[]{this, key, category});
        }
        q.d(key, "key");
        q.d(category, "category");
        return c(category).get(key);
    }

    public final void a(String key, String category, T value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{this, key, category, value});
            return;
        }
        q.d(key, "key");
        q.d(category, "category");
        q.d(value, "value");
        Map<String, T> c = c(category);
        c.put(key, value);
        this.b.put(category, c);
    }

    public final void a(String category, Class<? extends amk<T>> mapBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, category, mapBuilder});
            return;
        }
        q.d(category, "category");
        q.d(mapBuilder, "mapBuilder");
        this.f25447a.put(category, mapBuilder);
    }

    private final Map<String, T> c(String str) {
        Class<? extends amk<T>> cls;
        if (!this.b.containsKey(str) && (cls = this.f25447a.get(str)) != null) {
            try {
                this.b.put(str, ai.c(cls.newInstance().a()));
                t tVar = t.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.e("NsCenter", "ms map build exp : " + e));
            }
        }
        Map<String, T> map = this.b.get(str);
        return map == null ? new LinkedHashMap() : map;
    }

    public final List<Pair<String, T>> a(String category) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, category});
        }
        q.d(category, "category");
        return ai.e(c(category));
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = new LinkedHashMap();
        }
    }

    public final void b(String category) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, category});
            return;
        }
        q.d(category, "category");
        this.b.remove(category);
    }
}
