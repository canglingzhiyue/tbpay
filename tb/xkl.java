package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.xkl;

/* loaded from: classes7.dex */
public class xkl<T, F> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final int f34351a;
    private LinkedHashMap<T, F> b;

    public static /* synthetic */ int a(xkl xklVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7706452", new Object[]{xklVar})).intValue() : xklVar.f34351a;
    }

    public xkl(int i, int i2) {
        this.f34351a = Math.max(3, i2);
        this.b = new LinkedHashMap<T, F>(i, 0.75f, true) { // from class: com.taobao.detail.rate.vivid.utils.RateLRUCache$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<T, F> entry) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > xkl.a(xkl.this);
            }
        };
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.b.remove(t);
        }
    }

    public F b(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (F) ipChange.ipc$dispatch("eeb6464d", new Object[]{this, t}) : this.b.get(t);
    }

    public void a(T t, F f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a7920", new Object[]{this, t, f});
        } else {
            this.b.put(t, f);
        }
    }
}
