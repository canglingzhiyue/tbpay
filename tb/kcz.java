package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aws.a.b;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class kcz extends kcu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ABNORMAL_CLOSE = 1006;
    public static final int BUGGYCLOSE = -2;
    public static final int EXTENSION = 1010;
    public static final int FLASHPOLICY = -3;
    public static final int GOING_AWAY = 1001;
    public static final int NEVER_CONNECTED = -1;
    public static final int NOCODE = 1005;
    public static final int NORMAL = 1000;
    public static final int NO_UTF8 = 1007;
    public static final int POLICY_VALIDATION = 1008;
    public static final int PROTOCOL_ERROR = 1002;
    public static final int REFUSE = 1003;
    public static final int TLS_ERROR = 1015;
    public static final int TOOBIG = 1009;
    public static final int UNEXPECTED_CONDITION = 1011;

    /* renamed from: a  reason: collision with root package name */
    private int f29966a;
    private String b;

    static {
        kge.a(-1526917021);
    }

    public static /* synthetic */ Object ipc$super(kcz kczVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1045431124) {
            if (hashCode == 90991724) {
                return new Boolean(super.a());
            }
            if (hashCode != 761580009) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.a((ByteBuffer) objArr[0]);
            return null;
        }
        return super.d();
    }

    public kcz() {
        super(5);
        a("");
        b(1000);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.f29966a = i;
        if (i == 1015) {
            this.f29966a = 1005;
            this.b = "";
        }
        j();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.b = str;
        j();
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f29966a;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "code: " + this.f29966a;
    }

    @Override // tb.kcu, tb.kcx
    public boolean a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!super.a() || (this.f29966a == 1007 && this.b == null)) {
            return false;
        }
        if (this.f29966a == 1005 && this.b.length() > 0) {
            return false;
        }
        int i2 = this.f29966a;
        return ((i2 > 1011 && i2 < 3000 && i2 != 1015) || (i = this.f29966a) == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) ? false : true;
    }

    @Override // tb.kcx
    public void a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
            return;
        }
        this.f29966a = 1005;
        this.b = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f29966a = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.f29966a = 1002;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.f29966a = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.b = kdi.a(byteBuffer);
                    byteBuffer.position(position);
                } catch (IllegalArgumentException unused) {
                    throw new b(1007);
                }
            } catch (b unused2) {
                this.f29966a = 1007;
                this.b = null;
            }
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        byte[] a2 = kdi.a(this.b);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f29966a);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(a2.length + 2);
        allocate2.put(allocate);
        allocate2.put(a2);
        allocate2.rewind();
        super.a(allocate2);
    }

    @Override // tb.kcx, tb.kcw
    public ByteBuffer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this});
        }
        if (this.f29966a == 1005) {
            return kdg.b();
        }
        return super.d();
    }
}
