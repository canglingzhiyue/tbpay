package com.alibaba.idst.nls.nlsclientsdk.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteOrder;
import tb.kge;

/* loaded from: classes2.dex */
public class BytesTransUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BytesTransUtil instance;
    private String TAG = "BytesTransUtil";

    static {
        kge.a(-1636197789);
        instance = null;
    }

    private BytesTransUtil() {
    }

    public static BytesTransUtil getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BytesTransUtil) ipChange.ipc$dispatch("43e7f540", new Object[0]);
        }
        if (instance == null) {
            instance = new BytesTransUtil();
        }
        return instance;
    }

    public boolean getByteOrderEndian() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8b8f736", new Object[]{this})).booleanValue() : ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public byte[] getBytes(short s, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("57d63f9a", new Object[]{this, new Short(s), new Boolean(z)});
        }
        byte[] bArr = new byte[2];
        if (z) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                bArr[length] = (byte) s;
                s = (short) (s >> 8);
            }
        } else {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) s;
                s = (short) (s >> 8);
            }
        }
        return bArr;
    }

    public byte[] getBytes(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("57495490", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        byte[] bArr = new byte[4];
        if (z) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                bArr[length] = (byte) i;
                i >>= 8;
            }
        } else {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = (byte) i;
                i >>= 8;
            }
        }
        return bArr;
    }

    public byte[] getBytes(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("57576c11", new Object[]{this, new Long(j), new Boolean(z)});
        }
        byte[] bArr = new byte[8];
        if (z) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                bArr[length] = (byte) (j & 255);
                j >>= 8;
            }
        } else {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (j & 255);
                j >>= 8;
            }
        }
        return bArr;
    }

    public short getShort(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21c47b7d", new Object[]{this, bArr, new Boolean(z)})).shortValue();
        }
        if (bArr == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        if (bArr.length > 2) {
            throw new IllegalArgumentException("byte array size > 2 !");
        }
        if (z) {
            short s = 0;
            while (i < bArr.length) {
                s = (short) (((short) (s << 8)) | (bArr[i] & 255));
                i++;
            }
            return s;
        }
        for (int length = bArr.length - 1; length >= 0; length--) {
            i = (short) (((short) (i << 8)) | (bArr[length] & 255));
        }
        return i == 1 ? (short) 1 : (short) 0;
    }

    public int getInt(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2925620", new Object[]{this, bArr, new Boolean(z)})).intValue();
        }
        if (bArr == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        if (bArr.length > 4) {
            throw new IllegalArgumentException("byte array size > 4 !");
        }
        if (z) {
            int i2 = 0;
            while (i < bArr.length) {
                i2 = (i2 << 8) | (bArr[i] & 255);
                i++;
            }
            return i2;
        }
        for (int length = bArr.length - 1; length >= 0; length--) {
            i = (i << 8) | (bArr[length] & 255);
        }
        return i;
    }

    public long getLong(byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1ecadc8", new Object[]{this, bArr, new Boolean(z)})).longValue();
        }
        if (bArr == null) {
            throw new IllegalArgumentException("byte array is null!");
        }
        if (bArr.length > 8) {
            throw new IllegalArgumentException("byte array size > 8 !");
        }
        long j = 0;
        if (z) {
            for (byte b : bArr) {
                j = (j << 8) | (b & 255);
            }
        } else {
            for (int length = bArr.length - 1; length >= 0; length--) {
                j = (bArr[length] & 255) | (j << 8);
            }
        }
        return j;
    }

    public byte[] getBytes(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8f3337f6", new Object[]{this, new Integer(i)}) : getBytes(i, getByteOrderEndian());
    }

    public byte[] getBytes(short s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8f37c3ac", new Object[]{this, new Short(s)}) : getBytes(s, getByteOrderEndian());
    }

    public byte[] getBytes(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8f33ac55", new Object[]{this, new Long(j)}) : getBytes(j, getByteOrderEndian());
    }

    public int getInt(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb700d7a", new Object[]{this, bArr})).intValue() : getInt(bArr, getByteOrderEndian());
    }

    public short getShort(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf8a71d1", new Object[]{this, bArr})).shortValue() : getShort(bArr, getByteOrderEndian());
    }

    public long getLong(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8328a4f4", new Object[]{this, bArr})).longValue() : getLong(bArr, getByteOrderEndian());
    }

    public short[] Bytes2Shorts(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("65b771c2", new Object[]{this, bArr});
        }
        short[] sArr = new short[bArr.length / 2];
        for (int i = 0; i < sArr.length; i++) {
            byte[] bArr2 = new byte[2];
            for (int i2 = 0; i2 < 2; i2++) {
                bArr2[i2] = bArr[(i * 2) + i2];
            }
            sArr[i] = getShort(bArr2);
        }
        return sArr;
    }

    public byte[] Shorts2Bytes(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("badf29ae", new Object[]{this, sArr});
        }
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i < sArr.length; i++) {
            byte[] bytes = getBytes(sArr[i]);
            for (int i2 = 0; i2 < 2; i2++) {
                bArr[(i * 2) + i2] = bytes[i2];
            }
        }
        return bArr;
    }

    public int[] Bytes2Ints(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f3e88c6b", new Object[]{this, bArr});
        }
        int[] iArr = new int[bArr.length / 4];
        for (int i = 0; i < iArr.length; i++) {
            byte[] bArr2 = new byte[4];
            for (int i2 = 0; i2 < 4; i2++) {
                bArr2[i2] = bArr[(i * 4) + i2];
            }
            iArr[i] = getInt(bArr2);
        }
        return iArr;
    }

    public byte[] Ints2Bytes(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b1daa42b", new Object[]{this, iArr});
        }
        byte[] bArr = new byte[iArr.length * 4];
        for (int i = 0; i < iArr.length; i++) {
            byte[] bytes = getBytes(iArr[i]);
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[(i * 4) + i2] = bytes[i2];
            }
        }
        return bArr;
    }

    public long[] Bytes2Longs(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("6faf0ca7", new Object[]{this, bArr});
        }
        long[] jArr = new long[bArr.length / 8];
        for (int i = 0; i < jArr.length; i++) {
            byte[] bArr2 = new byte[8];
            for (int i2 = 0; i2 < 8; i2++) {
                bArr2[i2] = bArr[(i * 8) + i2];
            }
            jArr[i] = getLong(bArr2);
        }
        return jArr;
    }

    public byte[] Longs2Bytes(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("763cc897", new Object[]{this, jArr});
        }
        byte[] bArr = new byte[jArr.length * 8];
        for (int i = 0; i < jArr.length; i++) {
            byte[] bytes = getBytes(jArr[i]);
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[(i * 8) + i2] = bytes[i2];
            }
        }
        return bArr;
    }
}
