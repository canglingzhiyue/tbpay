package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class atz implements aua {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AURARenderComponent c;

    /* renamed from: a  reason: collision with root package name */
    private int f25603a = 0;
    private int b = 0;
    private int e = 0;
    private int f = 1;
    private final List<AURARenderComponent> d = new ArrayList();

    static {
        kge.a(49351688);
        kge.a(411964200);
    }

    public abstract boolean a(atz atzVar);

    @Override // tb.aua
    public abstract String g();

    public abstract c h();

    public atz(AURARenderComponent aURARenderComponent) {
        this.c = aURARenderComponent;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.e = i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.f = i;
    }

    public final void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else if (this.d.contains(aURARenderComponent)) {
        } else {
            this.d.add(aURARenderComponent);
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d.size();
    }

    public final AURARenderComponent f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("cc352fa1", new Object[]{this, new Integer(i)});
        }
        if (i < this.d.size() && i >= 0) {
            return this.d.get(i);
        }
        return null;
    }

    public final AURARenderComponent d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("4aa17516", new Object[]{this});
        }
        if (c() != 0) {
            return this.d.get(0);
        }
        return null;
    }

    public final AURARenderComponent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("2662f0d7", new Object[]{this});
        }
        int c = c();
        if (c != 0) {
            return this.d.get(c - 1);
        }
        return null;
    }

    public final AURARenderComponent f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("2246c98", new Object[]{this}) : this.c;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.b > 0;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.f25603a = i;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.f25603a;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.b;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.b += i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.b = i;
    }

    private Map<String, Object> b(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b401f2e7", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && (aURARenderComponentLayout = aURARenderComponentData.layout) != null) {
            return aURARenderComponentLayout.style;
        }
        return null;
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        Map<String, Object> b = b(this.c);
        if (b == null) {
            return str2;
        }
        Object obj = b.get(str);
        if (obj instanceof String) {
            String str3 = (String) obj;
            return TextUtils.isEmpty(str3) ? str2 : str3;
        }
        return String.valueOf(obj);
    }

    @Override // tb.aua
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.d.clear();
        this.f25603a = 0;
        this.b = 0;
        this.e = 0;
        this.f = 1;
    }
}
