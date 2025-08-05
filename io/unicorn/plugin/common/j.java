package io.unicorn.plugin.common;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class j implements f<Object> {
    public static final j INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f24851a;
    private static final Charset b;

    /* loaded from: classes9.dex */
    static final class a extends ByteArrayOutputStream {
        static {
            kge.a(-1527215038);
        }

        a() {
        }

        byte[] a() {
            return this.buf;
        }
    }

    static {
        kge.a(-1202936332);
        kge.a(1699229335);
        INSTANCE = new j();
        f24851a = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        b = Charset.forName("UTF8");
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, double d) {
        a(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            b(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            c(byteArrayOutputStream, i);
        }
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f24851a) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            j >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) (j >>> 56));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 8));
        }
        byteArrayOutputStream.write((byte) j);
    }

    protected static final void a(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        a(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    protected static final int b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            return i < 254 ? i : i == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    protected static final void b(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f24851a) {
            byteArrayOutputStream.write(i);
            i >>>= 8;
        } else {
            byteArrayOutputStream.write(i >>> 8);
        }
        byteArrayOutputStream.write(i);
    }

    protected static final void c(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f24851a) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            i >>>= 24;
        } else {
            byteArrayOutputStream.write(i >>> 24);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 8);
        }
        byteArrayOutputStream.write(i);
    }

    protected static final byte[] c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[b(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static final void d(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected Object a(byte b2, ByteBuffer byteBuffer) {
        int b3;
        long[] jArr;
        int i = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(c(byteBuffer), b), 16);
            case 6:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(c(byteBuffer), b);
            case 8:
                return c(byteBuffer);
            case 9:
                int b4 = b(byteBuffer);
                int[] iArr = new int[b4];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (b4 * 4));
                return iArr;
            case 10:
                b3 = b(byteBuffer);
                long[] jArr2 = new long[b3];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr2);
                jArr = jArr2;
                break;
            case 11:
                b3 = b(byteBuffer);
                double[] dArr = new double[b3];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                jArr = dArr;
                break;
            case 12:
                int b5 = b(byteBuffer);
                ArrayList arrayList = new ArrayList(b5);
                while (i < b5) {
                    arrayList.add(d(byteBuffer));
                    i++;
                }
                return arrayList;
            case 13:
                int b6 = b(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i < b6) {
                    hashMap.put(d(byteBuffer), d(byteBuffer));
                    i++;
                }
                return hashMap;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        byteBuffer.position(byteBuffer.position() + (b3 * 8));
        return jArr;
    }

    @Override // io.unicorn.plugin.common.f
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object d = d(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return d;
    }

    @Override // io.unicorn.plugin.common.f
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        a(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    protected void a(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj == Boolean.TRUE) {
            byteArrayOutputStream.write(1);
        } else if (obj == Boolean.FALSE) {
            byteArrayOutputStream.write(2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                c(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                a(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                d(byteArrayOutputStream, 8);
                a(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (!(obj instanceof BigInteger)) {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            } else {
                byteArrayOutputStream.write(5);
                a(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(b));
            }
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(7);
            a(byteArrayOutputStream, ((String) obj).getBytes(b));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            a(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            a(byteArrayOutputStream, iArr.length);
            d(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i < length) {
                c(byteArrayOutputStream, iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            a(byteArrayOutputStream, jArr.length);
            d(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i < length2) {
                a(byteArrayOutputStream, jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            a(byteArrayOutputStream, dArr.length);
            d(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i < length3) {
                a(byteArrayOutputStream, dArr[i]);
                i++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            a(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                a(byteArrayOutputStream, obj2);
            }
        } else if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Unsupported value: " + obj);
        } else {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            a(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                a(byteArrayOutputStream, entry.getKey());
                a(byteArrayOutputStream, entry.getValue());
            }
        }
    }

    protected final Object d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return a(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }
}
