package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;
import tb.sbw;
import tb.sbx;

/* loaded from: classes9.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ABNORMAL_CLOSE = 1006;
    public static final int BAD_GATEWAY = 1014;
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
    public static final int SERVICE_RESTART = 1012;
    public static final int TLS_ERROR = 1015;
    public static final int TOOBIG = 1009;
    public static final int TRY_AGAIN_LATER = 1013;
    public static final int UNEXPECTED_CONDITION = 1011;

    /* renamed from: a  reason: collision with root package name */
    private int f25080a;
    private String b;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1045431124:
                return super.d();
            case 92838762:
                super.c();
                return null;
            case 761580009:
                super.a((ByteBuffer) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public b() {
        super(Framedata.Opcode.CLOSING);
        a("");
        a(1000);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f25080a = i;
        if (i == 1015) {
            this.f25080a = 1005;
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

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f25080a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // org.java_websocket.framing.f
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "code: " + this.f25080a;
    }

    @Override // org.java_websocket.framing.d, org.java_websocket.framing.f
    public void c() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.f25080a == 1007 && this.b == null) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
        if (this.f25080a == 1005 && this.b.length() > 0) {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.f25080a;
        if (i > 1015 && i < 3000) {
            throw new InvalidDataException(1002, "Trying to send an illegal close code!");
        }
        int i2 = this.f25080a;
        if (i2 != 1006 && i2 != 1015 && i2 != 1005 && i2 <= 4999 && i2 >= 1000 && i2 != 1004) {
            return;
        }
        throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f25080a);
    }

    @Override // org.java_websocket.framing.f
    public void a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
            return;
        }
        this.f25080a = 1005;
        this.b = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f25080a = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.f25080a = 1002;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.f25080a = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.b = sbx.a(byteBuffer);
                    byteBuffer.position(position);
                } catch (IllegalArgumentException unused) {
                    throw new InvalidDataException(1007);
                }
            } catch (InvalidDataException unused2) {
                this.f25080a = 1007;
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
        byte[] a2 = sbx.a(this.b);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f25080a);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(a2.length + 2);
        allocate2.put(allocate);
        allocate2.put(a2);
        allocate2.rewind();
        super.a(allocate2);
    }

    @Override // org.java_websocket.framing.f, org.java_websocket.framing.Framedata
    public ByteBuffer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this});
        }
        if (this.f25080a == 1005) {
            return sbw.a();
        }
        return super.d();
    }
}
