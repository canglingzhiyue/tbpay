package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import tb.sbw;

/* loaded from: classes9.dex */
public abstract class f implements Framedata {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Framedata.Opcode b;
    private ByteBuffer c = sbw.a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f25081a = true;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    public abstract void c() throws InvalidDataException;

    public f(Framedata.Opcode opcode) {
        this.b = opcode;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f25081a;
    }

    @Override // org.java_websocket.framing.Framedata
    public Framedata.Opcode i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Framedata.Opcode) ipChange.ipc$dispatch("fe9fbc7", new Object[]{this}) : this.b;
    }

    @Override // org.java_websocket.framing.Framedata
    public ByteBuffer d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this}) : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(i());
        sb.append(", fin:");
        sb.append(e());
        sb.append(", rsv1:");
        sb.append(f());
        sb.append(", rsv2:");
        sb.append(g());
        sb.append(", rsv3:");
        sb.append(h());
        sb.append(", payloadlength:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        sb.append(this.c.remaining() > 1000 ? "(too big to display)" : new String(this.c.array()));
        sb.append('}');
        return sb.toString();
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
            this.f25081a = z;
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

    public static f a(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a9617e5f", new Object[]{opcode});
        }
        if (opcode == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (opcode) {
            case PING:
                return new g();
            case PONG:
                return new h();
            case TEXT:
                return new i();
            case BINARY:
                return new a();
            case CLOSING:
                return new b();
            case CONTINUOUS:
                return new c();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f25081a != fVar.f25081a || this.d != fVar.d || this.e != fVar.e || this.f != fVar.f || this.g != fVar.g || this.b != fVar.b) {
                return false;
            }
            ByteBuffer byteBuffer = this.c;
            if (byteBuffer != null) {
                return byteBuffer.equals(fVar.c);
            }
            if (fVar.c == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = (((this.f25081a ? 1 : 0) * 31) + this.b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            i = byteBuffer.hashCode();
        }
        return ((((((((hashCode + i) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
