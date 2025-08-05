package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.audio.a;

/* loaded from: classes9.dex */
public class tky extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.themis.kernel.adapter.a b;

    static {
        kge.a(-1543353831);
    }

    public tky(com.taobao.themis.kernel.adapter.a aVar) {
        this.b = aVar;
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b.a(str);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : this.b.a(i);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue() : this.b.a(z);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue() : this.b.b(z);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{this, new Boolean(z)})).booleanValue() : this.b.c(z);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue() : this.b.a(f);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{this, new Boolean(z)})).booleanValue() : this.b.d(z);
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b.b(i);
        }
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.c();
        }
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.d();
        }
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.b.e();
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : this.b.f();
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.b.g();
    }

    @Override // com.taobao.android.themis.graphics.audio.a
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.b.h();
    }
}
