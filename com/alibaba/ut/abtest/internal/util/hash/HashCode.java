package com.alibaba.ut.abtest.internal.util.hash;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public abstract class HashCode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final char[] hexDigits;

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract int bits();

    public abstract boolean equalsSameBits(HashCode hashCode);

    public abstract long padToLong();

    public byte[] getBytesInternal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("2d740be4", new Object[]{this}) : asBytes();
    }

    public static HashCode fromInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashCode) ipChange.ipc$dispatch("c75a6994", new Object[]{new Integer(i)}) : new IntHashCode(i);
    }

    /* loaded from: classes.dex */
    public static final class IntHashCode extends HashCode implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final long serialVersionUID = 0;
        public final int hash;

        static {
            kge.a(1410605786);
            kge.a(1028243835);
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.HashCode
        public int bits() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("42fdb680", new Object[]{this})).intValue();
            }
            return 32;
        }

        public IntHashCode(int i) {
            this.hash = i;
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.HashCode
        public byte[] asBytes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("9409a97d", new Object[]{this});
            }
            int i = this.hash;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.HashCode
        public int asInt() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("afe95c57", new Object[]{this})).intValue() : this.hash;
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.HashCode
        public long padToLong() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66e0a585", new Object[]{this})).longValue() : h.a(this.hash);
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.HashCode
        public boolean equalsSameBits(HashCode hashCode) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbd884df", new Object[]{this, hashCode})).booleanValue() : this.hash == hashCode.asInt();
        }
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof HashCode) {
            HashCode hashCode = (HashCode) obj;
            if (bits() == hashCode.bits() && equalsSameBits(hashCode)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        int i = bytesInternal[0] & 255;
        for (int i2 = 1; i2 < bytesInternal.length; i2++) {
            i |= (bytesInternal[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        byte[] bytesInternal = getBytesInternal();
        StringBuilder sb = new StringBuilder(bytesInternal.length * 2);
        for (byte b : bytesInternal) {
            sb.append(hexDigits[(b >> 4) & 15]);
            sb.append(hexDigits[b & 15]);
        }
        return sb.toString();
    }

    static {
        kge.a(-1814626700);
        hexDigits = "0123456789abcdef".toCharArray();
    }
}
