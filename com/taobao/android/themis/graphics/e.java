package com.taobao.android.themis.graphics;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final e f15558a = new e();
    private static final boolean b;
    private static final Charset c;

    /* loaded from: classes6.dex */
    public static final class a extends ByteArrayOutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public byte[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.buf;
        }
    }

    static {
        b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        c = Charset.forName("UTF8");
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("dcd898a6", new Object[0]) : f15558a;
    }

    public ByteBuffer a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("f55ad4c9", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        a(aVar, jSONObject);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public JSONObject a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81999109", new Object[]{this, byteBuffer});
        }
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.rewind();
        byteBuffer.order(ByteOrder.nativeOrder());
        Object d = d(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        if (!(d instanceof JSONObject)) {
            throw new IllegalArgumentException("decode to JSON with failure");
        }
        return (JSONObject) d;
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4ade40", new Object[]{byteArrayOutputStream, new Integer(i)});
        } else if (i < 0) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis_gfx|writeSize", "write a negative size is not allowed!");
            throw new IllegalArgumentException("write a negative size is not allowed!");
        } else if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            b(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            c(byteArrayOutputStream, i);
        }
    }

    private static void b(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef2b1c1", new Object[]{byteArrayOutputStream, new Integer(i)});
        } else if (b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
        } else {
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i);
        }
    }

    private static void c(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29a8542", new Object[]{byteArrayOutputStream, new Integer(i)});
        } else if (b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
        } else {
            byteArrayOutputStream.write(i >>> 24);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i);
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4ae201", new Object[]{byteArrayOutputStream, new Long(j)});
        } else if (b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
        } else {
            byteArrayOutputStream.write((byte) (j >>> 56));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) j);
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4ad2fd", new Object[]{byteArrayOutputStream, new Float(f)});
        } else {
            c(byteArrayOutputStream, Float.floatToIntBits(f));
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4acb7b", new Object[]{byteArrayOutputStream, new Double(d)});
        } else {
            a(byteArrayOutputStream, Double.doubleToLongBits(d));
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be19712a", new Object[]{byteArrayOutputStream, bArr});
            return;
        }
        a(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    private static void d(ByteArrayOutputStream byteArrayOutputStream, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64258c3", new Object[]{byteArrayOutputStream, new Integer(i)});
            return;
        }
        int size = byteArrayOutputStream.size() % i;
        if (size == 0) {
            return;
        }
        for (int i2 = 0; i2 < i - size; i2++) {
            byteArrayOutputStream.write(0);
        }
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        IpChange ipChange = $ipChange;
        int i = 2;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177fc63f", new Object[]{this, byteArrayOutputStream, obj});
        } else if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i = 1;
            }
            byteArrayOutputStream.write(i);
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
            } else if (obj instanceof BigDecimal) {
                byteArrayOutputStream.write(6);
                d(byteArrayOutputStream, 8);
                a(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                a(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            a(byteArrayOutputStream, obj.toString().getBytes(c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            a(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            a(byteArrayOutputStream, iArr.length);
            d(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i2 < length) {
                c(byteArrayOutputStream, iArr[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            a(byteArrayOutputStream, jArr.length);
            d(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                a(byteArrayOutputStream, jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            a(byteArrayOutputStream, dArr.length);
            d(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                a(byteArrayOutputStream, dArr[i2]);
                i2++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            a(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                a(byteArrayOutputStream, obj2);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            a(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                a(byteArrayOutputStream, entry.getKey());
                a(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            a(byteArrayOutputStream, fArr.length);
            d(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i2 < length4) {
                a(byteArrayOutputStream, fArr[i2]);
                i2++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }

    private static int b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f3e1cfb", new Object[]{byteBuffer})).intValue();
        }
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i = byteBuffer.get() & 255;
        if (i < 254) {
            return i;
        }
        if (i == 254) {
            return byteBuffer.getChar();
        }
        return byteBuffer.getInt();
    }

    private static byte[] c(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f1d69596", new Object[]{byteBuffer});
        }
        byte[] bArr = new byte[b(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static void a(ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f34e63a", new Object[]{byteBuffer, new Integer(i)});
            return;
        }
        int position = byteBuffer.position() % i;
        if (position == 0) {
            return;
        }
        byteBuffer.position((byteBuffer.position() + i) - position);
    }

    private Object d(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("40a888ac", new Object[]{this, byteBuffer});
        }
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return a(byteBuffer.get(), byteBuffer);
    }

    public Object a(byte b2, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc543855", new Object[]{this, new Byte(b2), byteBuffer});
        }
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
                return new BigInteger(new String(c(byteBuffer), c), 16);
            case 6:
                a(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(c(byteBuffer), c);
            case 8:
                c(byteBuffer);
                throw new IllegalArgumentException("parse failure because of byte array is not valid for JSONObject");
            case 9:
                int b3 = b(byteBuffer);
                int[] iArr = new int[b3];
                a(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                JSONArray jSONArray = new JSONArray(b3);
                int length = iArr.length;
                while (i < length) {
                    jSONArray.add(Integer.valueOf(iArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (b3 * 4));
                return jSONArray;
            case 10:
                int b4 = b(byteBuffer);
                long[] jArr = new long[b4];
                a(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                JSONArray jSONArray2 = new JSONArray(b4);
                int length2 = jArr.length;
                while (i < length2) {
                    jSONArray2.add(Long.valueOf(jArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (b4 * 8));
                return jSONArray2;
            case 11:
                int b5 = b(byteBuffer);
                double[] dArr = new double[b5];
                a(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                JSONArray jSONArray3 = new JSONArray(b5);
                int length3 = dArr.length;
                while (i < length3) {
                    jSONArray3.add(Double.valueOf(dArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (b5 * 8));
                return jSONArray3;
            case 12:
                int b6 = b(byteBuffer);
                JSONArray jSONArray4 = new JSONArray(b6);
                while (i < b6) {
                    jSONArray4.add(d(byteBuffer));
                    i++;
                }
                return jSONArray4;
            case 13:
                int b7 = b(byteBuffer);
                JSONObject jSONObject = new JSONObject();
                while (i < b7) {
                    Object d = d(byteBuffer);
                    if (!(d instanceof CharSequence)) {
                        throw new IllegalStateException("parse failure because of map key is not a string!");
                    }
                    jSONObject.put((JSONObject) ((String) d), (String) d(byteBuffer));
                    i++;
                }
                return jSONObject;
            case 14:
                int b8 = b(byteBuffer);
                float[] fArr = new float[b8];
                a(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                JSONArray jSONArray5 = new JSONArray(b8);
                int length4 = fArr.length;
                while (i < length4) {
                    jSONArray5.add(Double.valueOf(fArr[i]));
                    i++;
                }
                byteBuffer.position(byteBuffer.position() + (b8 * 4));
                return jSONArray5;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }
}
