package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* loaded from: classes2.dex */
public class brx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26075a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private jnq<DXTemplateItem> f;

    static {
        kge.a(949251936);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f26075a;
    }

    public brx a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brx) ipChange.ipc$dispatch("1f405872", new Object[]{this, new Boolean(z)});
        }
        this.f26075a = z;
        return this;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    public brx b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brx) ipChange.ipc$dispatch("dc35ef3", new Object[]{this, new Boolean(z)});
        }
        this.b = z;
        return this;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c;
    }

    public brx c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brx) ipChange.ipc$dispatch("fc466574", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.d;
    }

    public brx d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brx) ipChange.ipc$dispatch("eac96bf5", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public jnq<DXTemplateItem> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnq) ipChange.ipc$dispatch("3d305f4b", new Object[]{this}) : this.f;
    }

    public void a(jnq<DXTemplateItem> jnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb9180b", new Object[]{this, jnqVar});
        } else {
            this.f = jnqVar;
        }
    }
}
