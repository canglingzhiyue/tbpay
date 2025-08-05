package com.alibaba.ariver.kernel.api.bytedata;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public final class ByteOrderValues {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIG_ENDIAN = 1;
    public static final int LITTLE_ENDIAN = 2;

    static {
        kge.a(-498317969);
    }

    private ByteOrderValues() {
    }

    public static boolean getBoolean(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6d05e04", new Object[]{bArr})).booleanValue() : bArr[0] > 0;
    }

    public static void putBoolean(boolean z, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24fac7b", new Object[]{new Boolean(z), bArr});
        } else {
            bArr[0] = z ? (byte) 1 : (byte) 0;
        }
    }

    public static byte getByte(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8712678", new Object[]{bArr})).byteValue() : getByte(bArr, 1);
    }

    public static byte getByte(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45b41de3", new Object[]{bArr, new Integer(i)})).byteValue() : bArr[0];
    }

    public static void putByte(byte b, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5b9405", new Object[]{new Byte(b), bArr});
        } else {
            putByte(b, bArr, 1);
        }
    }

    public static void putByte(byte b, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e175f9e", new Object[]{new Byte(b), bArr, new Integer(i)});
        } else {
            bArr[0] = b;
        }
    }

    public static short getShort(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf8a71d1", new Object[]{bArr})).shortValue() : getShort(bArr, 1);
    }

    public static short getShort(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21c43bac", new Object[]{bArr, new Integer(i)})).shortValue();
        }
        if (i == 1) {
            return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
        }
        return (short) ((bArr[0] & 255) | ((bArr[1] & 255) << 8));
    }

    public static void putShort(short s, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f218e0", new Object[]{new Short(s), bArr});
        } else {
            putShort(s, bArr, 1);
        }
    }

    public static void putShort(short s, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96517623", new Object[]{new Short(s), bArr, new Integer(i)});
        } else if (i == 1) {
            bArr[0] = (byte) (s >> 8);
            bArr[1] = (byte) s;
        } else {
            bArr[0] = (byte) s;
            bArr[1] = (byte) (s >> 8);
        }
    }

    public static int getInt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb700d7a", new Object[]{bArr})).intValue() : getInt(bArr, 1);
    }

    public static int getInt(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b292164f", new Object[]{bArr, new Integer(i)})).intValue();
        }
        if (i == 1) {
            return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        return (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static void putInt(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5542c3", new Object[]{new Integer(i), bArr});
        } else {
            putInt(i, bArr, 1);
        }
    }

    public static void putInt(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5388a0", new Object[]{new Integer(i), bArr, new Integer(i2)});
        } else if (i2 == 1) {
            bArr[0] = (byte) (i >> 24);
            bArr[1] = (byte) (i >> 16);
            bArr[2] = (byte) (i >> 8);
            bArr[3] = (byte) i;
        } else {
            bArr[0] = (byte) i;
            bArr[1] = (byte) (i >> 8);
            bArr[2] = (byte) (i >> 16);
            bArr[3] = (byte) (i >> 24);
        }
    }

    public static float getFloat(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b1f27a4", new Object[]{bArr})).floatValue() : getFloat(bArr, 1);
    }

    public static float getFloat(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("38c641bf", new Object[]{bArr, new Integer(i)})).floatValue() : Float.intBitsToFloat(getInt(bArr, i));
    }

    public static void putFloat(float f, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3ced73", new Object[]{new Float(f), bArr});
        } else {
            putFloat(f, bArr, 1);
        }
    }

    public static void putFloat(float f, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496133f0", new Object[]{new Float(f), bArr, new Integer(i)});
        } else {
            putInt(Float.floatToIntBits(f), bArr, i);
        }
    }

    public static void putLong(long j, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba04a019", new Object[]{new Long(j), bArr});
        } else {
            putLong(j, bArr, 1);
        }
    }

    public static void putLong(long j, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("868fd60a", new Object[]{new Long(j), bArr, new Integer(i)});
        } else if (i == 1) {
            bArr[0] = (byte) (j >> 56);
            bArr[1] = (byte) (j >> 48);
            bArr[2] = (byte) (j >> 40);
            bArr[3] = (byte) (j >> 32);
            bArr[4] = (byte) (j >> 24);
            bArr[5] = (byte) (j >> 16);
            bArr[6] = (byte) (j >> 8);
            bArr[7] = (byte) j;
        } else {
            bArr[0] = (byte) j;
            bArr[1] = (byte) (j >> 8);
            bArr[2] = (byte) (j >> 16);
            bArr[3] = (byte) (j >> 24);
            bArr[4] = (byte) (j >> 32);
            bArr[5] = (byte) (j >> 40);
            bArr[6] = (byte) (j >> 48);
            bArr[7] = (byte) (j >> 56);
        }
    }

    public static long getLong(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8328a4f4", new Object[]{bArr})).longValue() : getLong(bArr, 1);
    }

    public static long getLong(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1ec6df7", new Object[]{bArr, new Integer(i)})).longValue();
        }
        if (i == 1) {
            return ((bArr[1] & 255) << 48) | ((bArr[0] & 255) << 56) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        }
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    public static double getDouble(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5bf52103", new Object[]{bArr})).doubleValue() : getDouble(bArr, 1);
    }

    public static double getDouble(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22af747c", new Object[]{bArr, new Integer(i)})).doubleValue() : Double.longBitsToDouble(getLong(bArr, i));
    }

    public static void putDouble(double d, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4e0bde", new Object[]{new Double(d), bArr});
        } else {
            putDouble(d, bArr, 1);
        }
    }

    public static void putDouble(double d, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc73e2e5", new Object[]{new Double(d), bArr, new Integer(i)});
        } else {
            putLong(Double.doubleToLongBits(d), bArr, i);
        }
    }
}
