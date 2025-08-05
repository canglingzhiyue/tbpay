package tb;

import android.view.View;
import com.alibaba.ability.env.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.als;

/* loaded from: classes2.dex */
public final class alq implements als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f25426a;
    private String b;
    private alt c;
    private WeakReference<View> d;
    private Object e;
    private Map<String, Object> f;
    private final a g;

    static {
        kge.a(-97541747);
        kge.a(-1914505594);
    }

    public alq() {
        this.g = new a();
    }

    @Override // tb.als
    public als a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (als) ipChange.ipc$dispatch("396b6334", new Object[]{this, view}) : als.a.a(this, view);
    }

    @Override // tb.als
    public als a(String key, Object data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (als) ipChange.ipc$dispatch("2f834290", new Object[]{this, key, data});
        }
        q.d(key, "key");
        q.d(data, "data");
        return als.a.a(this, key, data);
    }

    @Override // tb.als
    public <T> T c(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c56c56fe", new Object[]{this, key});
        }
        q.d(key, "key");
        return (T) als.a.a(this, key);
    }

    @Override // tb.als
    public alt f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alt) ipChange.ipc$dispatch("357a9b70", new Object[]{this}) : als.a.a(this);
    }

    @Override // tb.als
    public View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : als.a.b(this);
    }

    public alq(alt altVar) {
        this();
        a(altVar);
    }

    @Override // tb.als
    public a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b40644e7", new Object[]{this}) : this.g;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f25426a = str;
        }
    }

    @Override // tb.als
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.f25426a;
    }

    @Override // tb.als
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // tb.als
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.als
    public void a(alt altVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e042a88f", new Object[]{this, altVar});
        } else {
            this.c = altVar;
        }
    }

    @Override // tb.als
    public alt b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alt) ipChange.ipc$dispatch("16b405f4", new Object[]{this}) : this.c;
    }

    @Override // tb.als
    public void a(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
        } else {
            this.d = weakReference;
        }
    }

    @Override // tb.als
    public WeakReference<View> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("944e2538", new Object[]{this}) : this.d;
    }

    @Override // tb.als
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    @Override // tb.als
    public Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : this.e;
    }

    @Override // tb.als
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f = map;
        }
    }

    @Override // tb.als
    public Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.f;
    }
}
