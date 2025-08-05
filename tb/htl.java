package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.b;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public final class htl implements itk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28776a;
    private final d b;
    private final b c;
    private final View d;
    private final boolean e;

    static {
        kge.a(568679138);
        kge.a(-1925021278);
    }

    @Override // tb.itj
    public void a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, metaLayout});
        }
    }

    @Override // tb.itk
    public boolean bw_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10839e35", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itj
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public htl(View content, boolean z) {
        q.c(content, "content");
        this.d = content;
        this.e = z;
        this.f28776a = true;
        this.b = new d(d.HALF_STICKY.b - 1, 1001, 2000);
        this.c = new b(this.d, this.b);
    }

    public final View h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this}) : this.d;
    }

    @Override // tb.itj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c.a(i);
        }
    }

    @Override // tb.itj
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c.b(i);
        }
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (this.e || e() == 0) {
            return 0;
        }
        int a2 = this.c.a(i, i2, i3);
        if (b() <= (-e())) {
            z = false;
        }
        if (z != this.f28776a) {
            this.f28776a = z;
            View d = d();
            if (!z) {
                i4 = 8;
            }
            d.setVisibility(i4);
        }
        return a2;
    }

    @Override // tb.itj
    public d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8db2ad19", new Object[]{this});
        }
        d a2 = this.c.a();
        q.a((Object) a2, "behavior.priority");
        return a2;
    }

    @Override // tb.itj
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c.b();
    }

    @Override // tb.itk
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        View d = this.c.d();
        q.a((Object) d, "behavior.view");
        return d;
    }

    @Override // tb.itk
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.c.e();
    }

    @Override // tb.itk
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c.f();
    }

    @Override // tb.itk
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.c.g();
    }
}
