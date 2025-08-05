package com.alibaba.ut.abtest.internal.util.hash;

import com.alibaba.ut.abtest.internal.util.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.nio.charset.Charset;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class Murmur3_32HashFunction extends com.alibaba.ut.abtest.internal.util.hash.a implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    public static final c GOOD_FAST_HASH_32;
    public static final Charset UTF_8;
    private static final long serialVersionUID = 0;
    private final int seed;

    private static long charToThreeUtf8Bytes(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45c2b29d", new Object[]{new Character(c)})).longValue() : (((c & riy.CONDITION_IF) | 128) << 16) | (((c >>> '\f') | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8);
    }

    private static long charToTwoUtf8Bytes(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf2fae8b", new Object[]{new Character(c)})).longValue() : (((c & riy.CONDITION_IF) | 128) << 8) | (((c >>> 6) | 960) & 255);
    }

    private static long codePointToFourUtf8Bytes(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8687c4fa", new Object[]{new Integer(i)})).longValue() : ((240 | (i >>> 18)) & 255) | ((((i >>> 12) & 63) | 128) << 8) | ((((i >>> 6) & 63) | 128) << 16) | (((i & 63) | 128) << 24);
    }

    public static /* synthetic */ int access$000(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ddeb5a5f", new Object[]{new Integer(i)})).intValue() : mixK1(i);
    }

    public static /* synthetic */ int access$100(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73c4d50b", new Object[]{new Integer(i), new Integer(i2)})).intValue() : mixH1(i, i2);
    }

    public static /* synthetic */ int access$200(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa1a2a76", new Object[]{bArr, new Integer(i)})).intValue() : getIntLittleEndian(bArr, i);
    }

    public static /* synthetic */ long access$300(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("158eca77", new Object[]{new Character(c)})).longValue() : charToTwoUtf8Bytes(c);
    }

    public static /* synthetic */ long access$400(char c) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d6ff756", new Object[]{new Character(c)})).longValue() : charToThreeUtf8Bytes(c);
    }

    public static /* synthetic */ long access$500(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5513abb", new Object[]{new Integer(i)})).longValue() : codePointToFourUtf8Bytes(i);
    }

    public static /* synthetic */ HashCode access$600(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashCode) ipChange.ipc$dispatch("26b7059a", new Object[]{new Integer(i), new Integer(i2)}) : fmix(i, i2);
    }

    static {
        kge.a(-801782038);
        kge.a(1028243835);
        GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(e.f4199a);
        UTF_8 = Charset.forName("UTF-8");
    }

    public Murmur3_32HashFunction(int i) {
        this.seed = i;
    }

    @Override // com.alibaba.ut.abtest.internal.util.hash.c
    public d newHasher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f020ff58", new Object[]{this}) : new a(this.seed);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Hashing.murmur3_32(" + this.seed + riy.BRACKET_END_STR;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : (obj instanceof Murmur3_32HashFunction) && this.seed == ((Murmur3_32HashFunction) obj).seed;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : getClass().hashCode() ^ this.seed;
    }

    @Override // com.alibaba.ut.abtest.internal.util.hash.a, com.alibaba.ut.abtest.internal.util.hash.c
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("ac2330f5", new Object[]{this, charSequence, charset});
        }
        if (UTF_8.equals(charset)) {
            int length = charSequence.length();
            int i2 = this.seed;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 4;
                if (i5 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i3);
                char charAt2 = charSequence.charAt(i3 + 1);
                char charAt3 = charSequence.charAt(i3 + 2);
                char charAt4 = charSequence.charAt(i3 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                i2 = mixH1(i2, mixK1((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i4 += 4;
                i3 = i5;
            }
            long j = 0;
            while (i3 < length) {
                char charAt5 = charSequence.charAt(i3);
                if (charAt5 < 128) {
                    j |= charAt5 << i;
                    i += 8;
                    i4++;
                } else if (charAt5 < 2048) {
                    j |= charToTwoUtf8Bytes(charAt5) << i;
                    i += 16;
                    i4 += 2;
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    j |= charToThreeUtf8Bytes(charAt5) << i;
                    i += 24;
                    i4 += 3;
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i3);
                    if (codePointAt == charAt5) {
                        return hashBytes(charSequence.toString().getBytes(charset));
                    }
                    i3++;
                    j |= codePointToFourUtf8Bytes(codePointAt) << i;
                    i4 += 4;
                }
                if (i >= 32) {
                    i2 = mixH1(i2, mixK1((int) j));
                    j >>>= 32;
                    i -= 32;
                }
                i3++;
            }
            return fmix(mixK1((int) j) ^ i2, i4);
        }
        return hashBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.alibaba.ut.abtest.internal.util.hash.a
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("4d663968", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        j.a(i, i + i2, bArr.length);
        int i4 = this.seed;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 4;
            if (i6 > i2) {
                break;
            }
            i4 = mixH1(i4, mixK1(getIntLittleEndian(bArr, i5 + i)));
            i5 = i6;
        }
        int i7 = 0;
        while (i5 < i2) {
            i3 ^= g.a(bArr[i + i5]) << i7;
            i5++;
            i7 += 8;
        }
        return fmix(mixK1(i3) ^ i4, i2);
    }

    private static int getIntLittleEndian(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fad0385e", new Object[]{bArr, new Integer(i)})).intValue() : f.a(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    private static int mixK1(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a900bed", new Object[]{new Integer(i)})).intValue() : Integer.rotateLeft(i * C1, 15) * C2;
    }

    private static int mixH1(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfce5f9f", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    private static HashCode fmix(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("9e18385a", new Object[]{new Integer(i), new Integer(i2)});
        }
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i5 ^ (i5 >>> 16));
    }

    /* loaded from: classes3.dex */
    public static final class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f4198a;
        private long b;
        private int c;
        private int d = 0;
        private boolean e = false;

        static {
            kge.a(-259271072);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1266182400) {
                return super.a((CharSequence) objArr[0], (Charset) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(int i) {
            this.f4198a = i;
        }

        private void a(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            long j2 = this.b;
            int i2 = this.c;
            this.b = ((j & 4294967295L) << i2) | j2;
            this.c = i2 + (i << 3);
            this.d += i;
            if (this.c < 32) {
                return;
            }
            this.f4198a = Murmur3_32HashFunction.access$100(this.f4198a, Murmur3_32HashFunction.access$000((int) this.b));
            this.b >>>= 32;
            this.c -= 32;
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.d
        public d a(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1b0bb5c6", new Object[]{this, new Byte(b)});
            }
            a(1, b & 255);
            return this;
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.b, com.alibaba.ut.abtest.internal.util.hash.d
        public d a(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1d3e586b", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            }
            j.a(i, i + i2, bArr.length);
            while (true) {
                int i4 = i3 + 4;
                if (i4 > i2) {
                    break;
                }
                a(4, Murmur3_32HashFunction.access$200(bArr, i3 + i));
                i3 = i4;
            }
            while (i3 < i2) {
                a(bArr[i + i3]);
                i3++;
            }
            return this;
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.b, com.alibaba.ut.abtest.internal.util.hash.d
        public d a(CharSequence charSequence, Charset charset) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("b4879700", new Object[]{this, charSequence, charset});
            }
            if (Murmur3_32HashFunction.UTF_8.equals(charset)) {
                int length = charSequence.length();
                while (true) {
                    int i2 = i + 4;
                    if (i2 > length) {
                        break;
                    }
                    char charAt = charSequence.charAt(i);
                    char charAt2 = charSequence.charAt(i + 1);
                    char charAt3 = charSequence.charAt(i + 2);
                    char charAt4 = charSequence.charAt(i + 3);
                    if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                        break;
                    }
                    a(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                    i = i2;
                }
                while (i < length) {
                    char charAt5 = charSequence.charAt(i);
                    if (charAt5 < 128) {
                        a(1, charAt5);
                    } else if (charAt5 < 2048) {
                        a(2, Murmur3_32HashFunction.access$300(charAt5));
                    } else if (charAt5 < 55296 || charAt5 > 57343) {
                        a(3, Murmur3_32HashFunction.access$400(charAt5));
                    } else {
                        int codePointAt = Character.codePointAt(charSequence, i);
                        if (codePointAt == charAt5) {
                            a(charSequence.subSequence(i, length).toString().getBytes(charset));
                            return this;
                        }
                        i++;
                        a(4, Murmur3_32HashFunction.access$500(codePointAt));
                    }
                    i++;
                }
                return this;
            }
            return super.a(charSequence, charset);
        }

        @Override // com.alibaba.ut.abtest.internal.util.hash.d
        public HashCode a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashCode) ipChange.ipc$dispatch("b7172925", new Object[]{this});
            }
            j.a(!this.e);
            this.e = true;
            this.f4198a ^= Murmur3_32HashFunction.access$000((int) this.b);
            return Murmur3_32HashFunction.access$600(this.f4198a, this.d);
        }
    }
}
