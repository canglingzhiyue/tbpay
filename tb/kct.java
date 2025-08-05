package tb;

import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aws.a.a;
import com.taobao.aws.a.b;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class kct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f29964a;
    public static int b;
    private static volatile kct h;
    private kcw d;
    private ByteBuffer f;
    public int c = -1;
    private final Random g = new Random();
    private List<ByteBuffer> e = new ArrayList();

    static {
        kge.a(1589470799);
        f29964a = 1000;
        b = 64;
    }

    private kct() {
    }

    public static kct a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kct) ipChange.ipc$dispatch("f06ca82", new Object[0]);
        }
        if (h == null) {
            synchronized (kct.class) {
                if (h == null) {
                    h = new kct();
                }
            }
        }
        return h;
    }

    public ByteBuffer a(kcw kcwVar) throws RuntimeException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("6e9bef1a", new Object[]{this, kcwVar}) : b(kcwVar);
    }

    public int a(int i) throws b {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < 0) {
            throw new b(1002, "Negative count");
        }
        return i;
    }

    public kcw a(ByteBuffer byteBuffer) throws a, b {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            return (kcw) ipChange.ipc$dispatch("a5d36a3e", new Object[]{this, byteBuffer});
        }
        int remaining = byteBuffer.remaining();
        if (remaining < 2) {
            throw new a(2);
        }
        byte b2 = byteBuffer.get();
        boolean z = (b2 >> 8) != 0;
        boolean z2 = (b2 & 64) != 0;
        boolean z3 = (b2 & 32) != 0;
        boolean z4 = (b2 & 16) != 0;
        byte b3 = byteBuffer.get();
        boolean z5 = (b3 & Byte.MIN_VALUE) != 0;
        int i2 = (byte) (b3 & Byte.MAX_VALUE);
        int a2 = a((byte) (b2 & 15));
        if (i2 < 0 || i2 > 125) {
            if (a2 == 3 || a2 == 4 || a2 == 5) {
                throw new b(1002, "more than 125 octets");
            }
            if (i2 != 126) {
                i = 10;
                if (remaining < 10) {
                    throw new a(10);
                }
                byte[] bArr = new byte[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i3] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr).longValue();
                if (longValue > 2147483647L) {
                    throw new b(1009, WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
                }
                i2 = (int) longValue;
            } else if (remaining < 4) {
                throw new a(4);
            } else {
                i2 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i = 4;
            }
        }
        int i4 = i + (z5 ? 4 : 0) + i2;
        if (remaining < i4) {
            throw new a(i4);
        }
        ByteBuffer allocate = ByteBuffer.allocate(a(i2));
        if (z5) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i5 = 0; i5 < i2; i5++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr2[i5 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(byteBuffer.position() + allocate.limit());
        }
        kcx a3 = kcx.a(a2);
        a3.a(z);
        a3.b(z2);
        a3.c(z3);
        a3.d(z4);
        allocate.flip();
        a3.a(allocate);
        if (!a3.a()) {
            return null;
        }
        return a3;
    }

    public List<kcw> b(ByteBuffer byteBuffer) throws b {
        LinkedList linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8039043f", new Object[]{this, byteBuffer});
        }
        while (true) {
            linkedList = new LinkedList();
            if (this.f == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f.remaining();
                if (remaining2 > remaining) {
                    this.f.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                kcw a2 = a((ByteBuffer) this.f.duplicate().position(0));
                if (a2 != null) {
                    linkedList.add(a2);
                    this.f = null;
                }
            } catch (a e) {
                ByteBuffer allocate = ByteBuffer.allocate(a(e.getPreferredSize()));
                this.f.rewind();
                allocate.put(this.f);
                this.f = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                kcw a3 = a(byteBuffer);
                if (a3 != null) {
                    linkedList.add(a3);
                }
            } catch (a e2) {
                byteBuffer.reset();
                this.f = ByteBuffer.allocate(a(e2.getPreferredSize()));
                this.f.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public List<kcw> a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90524525", new Object[]{this, str, new Boolean(z)});
        }
        kdd kddVar = new kdd();
        kddVar.a(ByteBuffer.wrap(kdi.a(str)));
        kddVar.e(z);
        if (kddVar.a()) {
            return Collections.singletonList(kddVar);
        }
        return Collections.emptyList();
    }

    public void a(kde kdeVar, kcw kcwVar) throws b {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2145c91d", new Object[]{this, kdeVar, kcwVar});
            return;
        }
        int c = kcwVar.c();
        if (c == 5) {
            int i = 1005;
            if (kcwVar instanceof kcz) {
                kcz kczVar = (kcz) kcwVar;
                i = kczVar.h();
                str = kczVar.i();
            } else {
                str = "";
            }
            kdeVar.a(i, str, true);
        } else if (c == 3) {
            kdeVar.b(kcwVar);
        } else if (c == 4) {
            kdeVar.c(kcwVar);
        } else if (!kcwVar.b() || c == 0) {
            if (c != 0) {
                if (this.d != null) {
                    throw new b(1002, "Previous continuous frame sequence not completed.");
                }
                this.d = kcwVar;
                this.e.add(kcwVar.d());
            } else if (kcwVar.b()) {
                if (this.d == null) {
                    throw new b(1002, "Continuous frame sequence was not started.");
                }
                this.e.add(kcwVar.d());
                if (this.d.c() == 1) {
                    ((kcx) this.d).a(c());
                    if (((kcx) this.d).a()) {
                        kdeVar.d().a(kdeVar, kdi.a(this.d.d()));
                    }
                } else if (this.d.c() == 2) {
                    ((kcx) this.d).a(c());
                    if (((kcx) this.d).a()) {
                        kdeVar.d().a(kdeVar, this.d.d().array());
                    }
                }
                this.d = null;
                this.e.clear();
            } else if (this.d == null) {
                throw new b(1002, "Continuous frame sequence was not started.");
            }
            if (c == 1 && !kdi.b(kcwVar.d())) {
                throw new b(1007);
            }
            if (c != 0 || this.d == null) {
                return;
            }
            this.e.add(kcwVar.d());
        } else if (this.d != null) {
            throw new b(1002, "Continuous frame sequence not completed.");
        } else {
            if (c == 1) {
                kdeVar.d().a(kdeVar, kdi.a(kcwVar.d()));
            } else if (c == 2) {
                kdeVar.d().a(kdeVar, kcwVar.d().array());
            } else {
                throw new b(1002, "non control or continious frame expected");
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f = null;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : super.toString();
    }

    private ByteBuffer b(kcw kcwVar) throws RuntimeException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("ec73ab1b", new Object[]{this, kcwVar});
        }
        ByteBuffer d = kcwVar.d();
        int i2 = d.remaining() <= 125 ? 1 : d.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + 4 + d.remaining());
        allocate.put((byte) (((byte) (kcwVar.b() ? -128 : 0)) | b(kcwVar.c())));
        byte[] a2 = a(d.remaining(), i2);
        if (i2 == 1) {
            allocate.put((byte) (a2[0] | Byte.MIN_VALUE));
        } else if (i2 == 2) {
            allocate.put((byte) -2);
            allocate.put(a2);
        } else {
            allocate.put((byte) -1);
            allocate.put(a2);
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(this.g.nextInt());
        allocate.put(allocate2.array());
        while (d.hasRemaining()) {
            allocate.put((byte) (d.get() ^ allocate2.get(i % 4)));
            i++;
        }
        allocate.flip();
        return allocate;
    }

    private byte[] a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("26271e96", new Object[]{this, new Long(j), new Integer(i)});
        }
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    private byte b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c26", new Object[]{this, new Integer(i)})).byteValue();
        }
        if (i == 0) {
            return (byte) 0;
        }
        if (i == 1) {
            return (byte) 1;
        }
        if (i == 2) {
            return (byte) 2;
        }
        if (i == 5) {
            return (byte) 8;
        }
        if (i == 3) {
            return (byte) 9;
        }
        if (i == 4) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + i);
    }

    private int a(byte b2) throws b {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8217947", new Object[]{this, new Byte(b2)})).intValue();
        }
        if (b2 == 0) {
            return 0;
        }
        if (b2 == 1) {
            return 1;
        }
        if (b2 == 2) {
            return 2;
        }
        switch (b2) {
            case 8:
                return 5;
            case 9:
                return 3;
            case 10:
                return 4;
            default:
                throw new b(1002, "Unknown opCode " + ((int) b2));
        }
    }

    private ByteBuffer c() throws b {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("3d7fafab", new Object[]{this});
        }
        long j = 0;
        for (ByteBuffer byteBuffer : this.e) {
            j += byteBuffer.limit();
        }
        if (j > 2147483647L) {
            throw new b(1009, WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) j);
        for (ByteBuffer byteBuffer2 : this.e) {
            allocate.put(byteBuffer2);
        }
        allocate.flip();
        return allocate;
    }
}
