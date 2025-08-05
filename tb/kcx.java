package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class kcx implements kcw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BINARY = 2;
    public static final int CLOSING = 5;
    public static final int CONTINUOUS = 0;
    public static final int PING = 3;
    public static final int PONG = 4;
    public static final int TEXT = 1;
    private int b;
    private ByteBuffer c = kdg.b();

    /* renamed from: a  reason: collision with root package name */
    private boolean f29965a = true;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    static {
        kge.a(-1526917980);
        kge.a(-1526917981);
    }

    public abstract boolean a();

    public kcx(int i) {
        this.b = i;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // tb.kcw
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f29965a;
    }

    @Override // tb.kcw
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    @Override // tb.kcw
    public ByteBuffer d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this}) : this.c;
    }

    public void a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
        } else {
            this.c = byteBuffer;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f29965a = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public static kcx a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcx) ipChange.ipc$dispatch("e663b46b", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return new kda();
        }
        if (i == 1) {
            return new kdd();
        }
        if (i == 2) {
            return new kcy();
        }
        if (i == 3) {
            return new kdb();
        }
        if (i == 4) {
            return new kdc();
        }
        if (i == 5) {
            return new kcz();
        }
        throw new IllegalArgumentException("Supplied opCode is invalid");
    }
}
