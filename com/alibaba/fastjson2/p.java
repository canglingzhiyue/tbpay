package com.alibaba.fastjson2;

import anet.channel.util.ErrorConstant;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.writer.bg;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.fge;
import tb.kge;
import tb.mto;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p extends JSONWriter {
    static final BigInteger A;
    static final BigInteger B;
    static final BigInteger y;
    static final BigInteger z;
    protected long t;
    private final JSONFactory.CacheItem u;
    private byte[] v;
    private fge w;
    private int x;

    static {
        kge.a(2018165021);
        y = BigInteger.valueOf(-2147483648L);
        z = BigInteger.valueOf(2147483647L);
        A = BigInteger.valueOf(Long.MIN_VALUE);
        B = BigInteger.valueOf(Long.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(JSONWriter.a aVar, s sVar) {
        super(aVar, sVar, true, StandardCharsets.UTF_8);
        this.u = JSONFactory.t[System.identityHashCode(Thread.currentThread()) & (JSONFactory.t.length - 1)];
        byte[] andSet = JSONFactory.v.getAndSet(this.u, null);
        this.v = andSet == null ? new byte[8192] : andSet;
    }

    static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 16) - 60);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) i2;
    }

    private static void a(byte[] bArr, int i, long j) {
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
    }

    private static boolean a(BigInteger bigInteger) {
        return bigInteger.compareTo(y) >= 0 && bigInteger.compareTo(z) <= 0;
    }

    static void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) ((i2 >> 16) + 68);
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) i2;
    }

    private static boolean b(BigInteger bigInteger) {
        return bigInteger.compareTo(A) >= 0 && bigInteger.compareTo(B) <= 0;
    }

    public static int c(byte[] bArr, int i, int i2) {
        if (i2 >= -16 && i2 <= 47) {
            bArr[i] = (byte) i2;
            return 1;
        } else if (i2 >= -2048 && i2 <= 2047) {
            bArr[i] = (byte) ((i2 >> 8) + 56);
            bArr[i + 1] = (byte) i2;
            return 2;
        } else if (i2 >= -262144 && i2 <= 262143) {
            b(bArr, i, i2);
            return 3;
        } else {
            bArr[i] = 72;
            f(bArr, i + 1, i2);
            return 5;
        }
    }

    private static void d(byte[] bArr, int i, int i2) {
        bArr[i] = 121;
        bArr[i + 1] = (byte) ((i2 >> 8) + 56);
        bArr[i + 2] = (byte) i2;
    }

    static int e(int i) {
        if (i < -16 || i > 47) {
            if (i >= -2048 && i <= 2047) {
                return 2;
            }
            return (i < -262144 || i > 262143) ? 5 : 3;
        }
        return 1;
    }

    private static int e(byte[] bArr, int i, int i2) {
        if (i2 <= 262143) {
            bArr[i] = 121;
            b(bArr, i + 1, i2);
            return 4;
        }
        bArr[i] = 121;
        bArr[i + 1] = 72;
        bArr[i + 2] = (byte) (i2 >>> 24);
        bArr[i + 3] = (byte) (i2 >>> 16);
        bArr[i + 4] = (byte) (i2 >>> 8);
        bArr[i + 5] = (byte) i2;
        return 6;
    }

    private static void f(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
    }

    private boolean g(int i) {
        int i2 = this.m;
        int i3 = i2 + 2;
        if (i3 >= this.v.length) {
            f(i3);
        }
        this.v[i2] = -110;
        this.m = i2 + 1;
        d(-i);
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(byte b) {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    protected void a(char c) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(double d) {
        if (d == mto.a.GEO_NOT_SUPPORT) {
            f(this.m + 1);
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = -78;
        } else if (d == 1.0d) {
            f(this.m + 1);
            byte[] bArr2 = this.v;
            int i2 = this.m;
            this.m = i2 + 1;
            bArr2[i2] = -77;
        } else {
            if (d >= -2.147483648E9d && d <= 2.147483647E9d) {
                long j = (long) d;
                if (j == d) {
                    f(this.m + 1);
                    byte[] bArr3 = this.v;
                    int i3 = this.m;
                    this.m = i3 + 1;
                    bArr3[i3] = -76;
                    e(j);
                    return;
                }
            }
            int i4 = this.m;
            int i5 = i4 + 9;
            f(i5);
            byte[] bArr4 = this.v;
            bArr4[i4] = -75;
            long doubleToLongBits = Double.doubleToLongBits(d);
            bArr4[i4 + 1] = (byte) (doubleToLongBits >>> 56);
            bArr4[i4 + 2] = (byte) (doubleToLongBits >>> 48);
            bArr4[i4 + 3] = (byte) (doubleToLongBits >>> 40);
            bArr4[i4 + 4] = (byte) (doubleToLongBits >>> 32);
            bArr4[i4 + 5] = (byte) (doubleToLongBits >>> 24);
            bArr4[i4 + 6] = (byte) (doubleToLongBits >>> 16);
            bArr4[i4 + 7] = (byte) (doubleToLongBits >>> 8);
            bArr4[i4 + 8] = (byte) doubleToLongBits;
            this.m = i5;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(float f) {
        int i = this.m;
        int i2 = i + 5;
        if (i2 >= this.v.length) {
            f(i2);
        }
        byte[] bArr = this.v;
        int i3 = (int) f;
        if (i3 != f || f < -262144.0f || f > 262143.0f) {
            bArr[i] = -73;
            f(bArr, i + 1, Float.floatToIntBits(f));
        } else {
            bArr[i] = -74;
            i2 = i + c(bArr, i + 1, i3) + 1;
        }
        this.m = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i) {
        int i2 = this.m + 3;
        if (i2 >= this.v.length) {
            f(i2);
        }
        byte[] bArr = this.v;
        int i3 = this.m;
        this.m = i3 + 1;
        bArr[i3] = Byte.MAX_VALUE;
        if (i >= -16 && i <= 47) {
            byte[] bArr2 = this.v;
            int i4 = this.m;
            this.m = i4 + 1;
            bArr2[i4] = (byte) i;
        } else if (i < -2048 || i > 2047) {
            d(i);
        } else {
            byte[] bArr3 = this.v;
            int i5 = this.m;
            this.m = i5 + 1;
            bArr3[i5] = (byte) ((i >> 8) + 56);
            byte[] bArr4 = this.v;
            int i6 = this.m;
            this.m = i6 + 1;
            bArr4[i6] = (byte) i;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3) {
        int i4 = this.m;
        int i5 = i4 + 5;
        f(i5);
        byte[] bArr = this.v;
        bArr[i4] = -87;
        bArr[i4 + 1] = (byte) (i >>> 8);
        bArr[i4 + 2] = (byte) i;
        bArr[i4 + 3] = (byte) i2;
        bArr[i4 + 4] = (byte) i3;
        this.m = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.m;
        int i8 = i7 + 8;
        f(i8);
        byte[] bArr = this.v;
        bArr[i7] = -88;
        bArr[i7 + 1] = (byte) (i >>> 8);
        bArr[i7 + 2] = (byte) i;
        bArr[i7 + 3] = (byte) i2;
        bArr[i7 + 4] = (byte) i3;
        bArr[i7 + 5] = (byte) i4;
        bArr[i7 + 6] = (byte) i5;
        bArr[i7 + 7] = (byte) i6;
        this.m = i8;
        d(0);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(long j, int i) {
        f(this.m + 1);
        byte[] bArr = this.v;
        int i2 = this.m;
        this.m = i2 + 1;
        bArr[i2] = -82;
        e(j);
        d(i);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            n();
            return;
        }
        h();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            f((Object) entry.getKey());
            f(entry.getValue());
        }
        i();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(com.alibaba.fastjson2.time.c cVar) {
        if (cVar == null) {
            n();
            return;
        }
        int i = this.m;
        int i2 = i + 8;
        f(i2);
        byte[] bArr = this.v;
        bArr[i] = -88;
        int i3 = cVar.f3021a.f3020a;
        bArr[i + 1] = (byte) (i3 >>> 8);
        bArr[i + 2] = (byte) i3;
        bArr[i + 3] = (byte) cVar.f3021a.b;
        bArr[i + 4] = (byte) cVar.f3021a.c;
        bArr[i + 5] = cVar.b.f3022a;
        bArr[i + 6] = cVar.b.b;
        bArr[i + 7] = cVar.b.c;
        this.m = i2;
        d(cVar.b.d);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(Enum r7) {
        if (r7 == null) {
            n();
        } else if ((this.b.k & JSONWriter.Feature.WriteEnumUsingToString.mask) != 0) {
            d(r7.toString());
        } else if ((this.b.k & JSONWriter.Feature.WriteEnumsUsingName.mask) != 0) {
            d(r7.name());
        } else {
            int ordinal = r7.ordinal();
            if (ordinal > 47) {
                d(ordinal);
                return;
            }
            if (this.m == this.v.length) {
                f(this.m + 1);
            }
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = (byte) ordinal;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(String str) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        if (bigDecimal == null) {
            n();
            return;
        }
        int scale = bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        if (scale == 0 && b(unscaledValue)) {
            f(this.m + 1);
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = -72;
            e(unscaledValue.longValue());
            return;
        }
        f(this.m + 1);
        byte[] bArr2 = this.v;
        int i2 = this.m;
        this.m = i2 + 1;
        bArr2[i2] = -71;
        d(scale);
        if (a(unscaledValue)) {
            d(unscaledValue.intValue());
        } else if (b(unscaledValue)) {
            e(unscaledValue.longValue());
        } else {
            a(unscaledValue, 0L);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            n();
        } else if (b(bigInteger)) {
            if (this.m == this.v.length) {
                f(this.m + 1);
            }
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = -70;
            e(bigInteger.longValue());
        } else {
            byte[] byteArray = bigInteger.toByteArray();
            f(this.m + 5 + byteArray.length);
            byte[] bArr2 = this.v;
            int i2 = this.m;
            this.m = i2 + 1;
            bArr2[i2] = -69;
            d(byteArray.length);
            System.arraycopy(byteArray, 0, this.v, this.m, byteArray.length);
            this.m += byteArray.length;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(List<String> list) {
        if (list == null) {
            p();
            return;
        }
        int size = list.size();
        c(size);
        for (int i = 0; i < size; i++) {
            d(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(Map map) {
        if (map == null) {
            n();
            return;
        }
        h();
        for (Map.Entry entry : map.entrySet()) {
            f(entry.getKey());
            f(entry.getValue());
        }
        i();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(UUID uuid) {
        if (uuid == null) {
            n();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.m;
        int i2 = i + 18;
        f(i2);
        byte[] bArr = this.v;
        bArr[i] = -111;
        bArr[i + 1] = 16;
        bArr[i + 2] = (byte) (mostSignificantBits >>> 56);
        bArr[i + 3] = (byte) (mostSignificantBits >>> 48);
        bArr[i + 4] = (byte) (mostSignificantBits >>> 40);
        bArr[i + 5] = (byte) (mostSignificantBits >>> 32);
        bArr[i + 6] = (byte) (mostSignificantBits >>> 24);
        bArr[i + 7] = (byte) (mostSignificantBits >>> 16);
        bArr[i + 8] = (byte) (mostSignificantBits >>> 8);
        bArr[i + 9] = (byte) mostSignificantBits;
        bArr[i + 10] = (byte) (leastSignificantBits >>> 56);
        bArr[i + 11] = (byte) (leastSignificantBits >>> 48);
        bArr[i + 12] = (byte) (leastSignificantBits >>> 40);
        bArr[i + 13] = (byte) (leastSignificantBits >>> 32);
        bArr[i + 14] = (byte) (leastSignificantBits >>> 24);
        bArr[i + 15] = (byte) (leastSignificantBits >>> 16);
        bArr[i + 16] = (byte) (leastSignificantBits >>> 8);
        bArr[i + 17] = (byte) leastSignificantBits;
        this.m = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(short s) {
        int i = this.m;
        int i2 = i + 3;
        if (i2 >= this.v.length) {
            f(i2);
        }
        byte[] bArr = this.v;
        bArr[i] = -68;
        bArr[i + 1] = (byte) (s >>> 8);
        bArr[i + 2] = (byte) s;
        this.m = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(byte[] bArr) {
        if (bArr == null) {
            n();
            return;
        }
        f(this.m + 6 + bArr.length);
        byte[] bArr2 = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr2[i] = -111;
        d(bArr.length);
        System.arraycopy(bArr, 0, this.v, this.m, bArr.length);
        this.m += bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(byte[] r13, long r14) {
        /*
            r12 = this;
            int r0 = r12.m
            int r1 = r13.length
            int r1 = r1 + r0
            int r1 = r1 + 2
            byte[] r2 = r12.v
            int r2 = r2.length
            if (r1 < r2) goto Le
            r12.f(r1)
        Le:
            byte[] r1 = r12.v
            com.alibaba.fastjson2.s r2 = r12.g
            r3 = 47
            r4 = -16
            r5 = 127(0x7f, float:1.78E-43)
            r6 = 1
            if (r2 == 0) goto L24
            com.alibaba.fastjson2.s r2 = r12.g
            int r2 = r2.a(r14)
            r7 = -1
            if (r2 != r7) goto L85
        L24:
            com.alibaba.fastjson2.JSONWriter$a r2 = r12.b
            long r7 = r2.k
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol
            long r9 = r2.mask
            long r7 = r7 & r9
            r9 = 0
            r2 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L3d
            int r14 = r13.length
            java.lang.System.arraycopy(r13, r2, r1, r0, r14)
            int r13 = r13.length
            int r0 = r0 + r13
            r12.m = r0
            return
        L3d:
            tb.fge r7 = r12.w
            if (r7 == 0) goto L53
            int r8 = r12.x
            int r14 = r7.b(r14, r8)
            int r15 = r12.x
            if (r14 == r15) goto L4e
            r8 = r14
            r14 = 1
            goto L64
        L4e:
            int r15 = r15 + r6
            r12.x = r15
            r8 = r14
            goto L63
        L53:
            tb.fge r7 = new tb.fge
            r7.<init>()
            r12.w = r7
            int r8 = r12.x
            int r9 = r8 + 1
            r12.x = r9
            r7.a(r14, r8)
        L63:
            r14 = 0
        L64:
            if (r14 != 0) goto L84
            int r14 = r0 + 1
            r1[r0] = r5
            int r15 = r13.length
            java.lang.System.arraycopy(r13, r2, r1, r14, r15)
            int r13 = r13.length
            int r14 = r14 + r13
            r12.m = r14
            if (r8 < r4) goto L80
            if (r8 > r3) goto L80
            int r13 = r12.m
            int r14 = r13 + 1
            r12.m = r14
            byte r14 = (byte) r8
            r1[r13] = r14
            return
        L80:
            r12.d(r8)
            return
        L84:
            int r2 = -r8
        L85:
            int r13 = r0 + 1
            r1[r0] = r5
            int r14 = -r2
            if (r14 < r4) goto L95
            if (r14 > r3) goto L95
            byte r14 = (byte) r14
            r1[r13] = r14
            int r13 = r13 + r6
            r12.m = r13
            return
        L95:
            r12.m = r13
            r12.d(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.p.a(byte[], long):void");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(char[] cArr, int i, int i2, boolean z2) {
        boolean z3;
        if (cArr == null) {
            n();
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                z3 = true;
                break;
            } else if (cArr[i3 + i] > 255) {
                z3 = false;
                break;
            } else {
                i3++;
            }
        }
        if (!z3) {
            d(new String(cArr, i, i2));
            return;
        }
        if (i2 <= 47) {
            byte[] bArr = this.v;
            int i4 = this.m;
            this.m = i4 + 1;
            bArr[i4] = (byte) (i2 + 73);
        } else {
            byte[] bArr2 = this.v;
            int i5 = this.m;
            this.m = i5 + 1;
            bArr2[i5] = 121;
            d(i2);
        }
        for (int i6 = 0; i6 < i2; i6++) {
            byte[] bArr3 = this.v;
            int i7 = this.m;
            this.m = i7 + 1;
            bArr3[i7] = (byte) cArr[i + i6];
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(double[] dArr) {
        if (dArr == null) {
            n();
            return;
        }
        c(dArr.length);
        for (double d : dArr) {
            a(d);
        }
        k();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(float[] fArr) {
        if (fArr == null) {
            n();
            return;
        }
        c(fArr.length);
        for (float f : fArr) {
            a(f);
        }
        k();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int[] iArr) {
        if (iArr == null) {
            p();
            return;
        }
        int length = iArr.length;
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        if (length <= 15) {
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = (byte) (length + ErrorConstant.ERROR_GET_PROCESS_NULL);
        } else {
            byte[] bArr2 = this.v;
            int i2 = this.m;
            this.m = i2 + 1;
            bArr2[i2] = -92;
            d(length);
        }
        int i3 = this.m;
        int length2 = (iArr.length * 5) + i3;
        if (length2 - this.v.length > 0) {
            f(length2);
        }
        byte[] bArr3 = this.v;
        for (int i4 : iArr) {
            if (i4 >= -16 && i4 <= 47) {
                bArr3[i3] = (byte) i4;
                i3++;
            } else if (i4 >= -2048 && i4 <= 2047) {
                int i5 = i3 + 1;
                bArr3[i3] = (byte) ((i4 >> 8) + 56);
                i3 = i5 + 1;
                bArr3[i5] = (byte) i4;
            } else if (i4 < -262144 || i4 > 262143) {
                bArr3[i3] = 72;
                f(bArr3, i3 + 1, i4);
                i3 += 5;
            } else {
                b(bArr3, i3, i4);
                i3 += 3;
            }
        }
        this.m = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(long[] jArr) {
        int c;
        if (jArr == null) {
            p();
            return;
        }
        int length = jArr.length;
        int i = this.m;
        int length2 = (jArr.length * 9) + i + 5;
        if (length2 >= this.v.length) {
            f(length2);
        }
        byte[] bArr = this.v;
        if (length <= 15) {
            c = i + 1;
            bArr[i] = (byte) (length + ErrorConstant.ERROR_GET_PROCESS_NULL);
        } else {
            bArr[i] = -92;
            c = i + c(bArr, i + 1, length) + 1;
        }
        for (long j : jArr) {
            if (j >= -16 && j <= 47) {
                bArr[c] = (byte) j;
                c++;
            } else if (j >= -2048 && j <= 2047) {
                bArr[c] = (byte) ((j >> 8) - 48);
                bArr[c + 1] = (byte) j;
                c += 2;
            } else if (j >= -262144 && j <= 262143) {
                a(bArr, c, (int) j);
                c += 3;
            } else if (j < -2147483648L || j > 2147483647L) {
                bArr[c] = -66;
                a(bArr, c + 1, j);
                c += 9;
            } else {
                bArr[c] = -65;
                f(bArr, c + 1, (int) j);
                c += 5;
            }
        }
        this.m = c;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(String[] strArr) {
        if (strArr == null) {
            p();
            return;
        }
        c(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                if (b(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                    str = "";
                } else {
                    n();
                }
            }
            d(str);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(boolean[] zArr) {
        if (zArr == null) {
            n();
            return;
        }
        c(zArr.length);
        for (boolean z2 : zArr) {
            b(z2);
        }
        k();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(byte b) {
        int i = this.m;
        int i2 = i + 2;
        if (i2 - this.v.length > 0) {
            f(i2);
        }
        byte[] bArr = this.v;
        bArr[i] = -67;
        bArr[i + 1] = b;
        this.m = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(char c) {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = -112;
        d((int) c);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(int i, int i2, int i3) {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.m;
        int i8 = i7 + 8;
        f(i8);
        byte[] bArr = this.v;
        bArr[i7] = -88;
        bArr[i7 + 1] = (byte) (i >>> 8);
        bArr[i7 + 2] = (byte) i;
        bArr[i7 + 3] = (byte) i2;
        bArr[i7 + 4] = (byte) i3;
        bArr[i7 + 5] = (byte) i4;
        bArr[i7 + 6] = (byte) i5;
        bArr[i7 + 7] = (byte) i6;
        this.m = i8;
        d(0);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(String str) {
        d(str);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(List list) {
        if (list == null) {
            p();
            return;
        }
        int size = list.size();
        c(size);
        for (int i = 0; i < size; i++) {
            f(list.get(i));
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(boolean z2) {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = z2 ? (byte) -79 : (byte) -80;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    public void b(char[] cArr) {
        boolean z2;
        int c;
        int i;
        boolean z3;
        if (cArr == null) {
            n();
            return;
        }
        int i2 = this.m;
        int length = cArr.length;
        int i3 = 0;
        if (cArr.length < 47) {
            int i4 = i2 + 1;
            int i5 = i4 + length;
            if (i5 - this.v.length > 0) {
                f(i5);
            }
            this.v[i2] = (byte) (length + 73);
            int i6 = 0;
            while (true) {
                if (i6 >= cArr.length) {
                    z3 = true;
                    break;
                }
                char c2 = cArr[i6];
                if (c2 > 255) {
                    z3 = false;
                    break;
                }
                this.v[i4] = (byte) c2;
                i6++;
                i4++;
            }
            if (z3) {
                this.m = i4;
                return;
            } else {
                z2 = z3;
                i2 = this.m;
            }
        } else {
            z2 = true;
        }
        int length2 = cArr.length & (-4);
        int i7 = 0;
        while (i7 < length2) {
            char c3 = cArr[i7];
            char c4 = cArr[i7 + 1];
            char c5 = cArr[i7 + 2];
            char c6 = cArr[i7 + 3];
            if (c3 > 255 || c4 > 255 || c5 > 255 || c6 > 255) {
                z2 = false;
                break;
            }
            i7 += 4;
        }
        if (z2) {
            while (true) {
                if (i7 >= cArr.length) {
                    break;
                } else if (cArr[i7] > 255) {
                    z2 = false;
                    break;
                } else {
                    i7++;
                }
            }
        }
        int i8 = (z2 ? length : length * 3) + i2 + 5 + 1;
        if (i8 - this.v.length > 0) {
            f(i8);
        }
        if (z2) {
            if (length <= 47) {
                i = i2 + 1;
                this.v[i2] = (byte) (length + 73);
            } else if (length <= 2047) {
                d(this.v, i2, length);
                i = i2 + 3;
            } else {
                i = i2 + e(this.v, i2, length);
            }
            while (i3 < cArr.length) {
                this.v[i] = (byte) cArr[i3];
                i3++;
                i++;
            }
        } else {
            int length3 = cArr.length * 3;
            int e = e(length3);
            f(length3 + i2 + e + 1);
            int i9 = i2 + e + 1;
            int a2 = ((com.alibaba.fastjson2.util.d.a(cArr, 0, cArr.length, this.v, i9) - i2) - e) - 1;
            int e2 = e(a2);
            if (e != e2) {
                byte[] bArr = this.v;
                System.arraycopy(bArr, i9, bArr, e2 + i2 + 1, a2);
            }
            byte[] bArr2 = this.v;
            int i10 = i2 + 1;
            bArr2[i2] = 122;
            if (a2 >= -16 && a2 <= 47) {
                c = i10 + 1;
                bArr2[i10] = (byte) a2;
            } else if (a2 < -2048 || a2 > 2047) {
                c = c(this.v, i10, a2) + i10;
            } else {
                byte[] bArr3 = this.v;
                bArr3[i10] = (byte) ((a2 >> 8) + 56);
                bArr3[i10 + 1] = (byte) a2;
                c = i10 + 2;
            }
            i = c + a2;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(char[] cArr, int i, int i2) {
        boolean z2;
        if (cArr == null) {
            n();
            return;
        }
        if (i2 < 47) {
            int i3 = this.m;
            int i4 = this.m + 1 + i2;
            if (i4 - this.v.length > 0) {
                f(i4);
            }
            byte[] bArr = this.v;
            int i5 = this.m;
            this.m = i5 + 1;
            bArr[i5] = (byte) (i2 + 73);
            int i6 = i;
            while (true) {
                if (i6 >= i2) {
                    z2 = true;
                    break;
                }
                char c = cArr[i6];
                if (c > 255) {
                    z2 = false;
                    break;
                }
                byte[] bArr2 = this.v;
                int i7 = this.m;
                this.m = i7 + 1;
                bArr2[i7] = (byte) c;
                i6++;
            }
            if (z2) {
                return;
            }
            this.m = i3;
        } else {
            z2 = true;
        }
        int length = cArr.length & (-4);
        while (i < length) {
            char c2 = cArr[i];
            char c3 = cArr[i + 1];
            char c4 = cArr[i + 2];
            char c5 = cArr[i + 3];
            if (c2 > 255 || c3 > 255 || c4 > 255 || c5 > 255) {
                z2 = false;
                break;
            }
            i += 4;
        }
        if (z2) {
            while (true) {
                if (i >= cArr.length) {
                    break;
                } else if (cArr[i] > 255) {
                    z2 = false;
                    break;
                } else {
                    i++;
                }
            }
        }
        int i8 = (z2 ? i2 : i2 * 3) + this.m + 5 + 1;
        if (i8 - this.v.length > 0) {
            f(i8);
        }
        if (z2) {
            if (i2 <= 47) {
                byte[] bArr3 = this.v;
                int i9 = this.m;
                this.m = i9 + 1;
                bArr3[i9] = (byte) (i2 + 73);
            } else if (i2 <= 2047) {
                byte[] bArr4 = this.v;
                int i10 = this.m;
                this.m = i10 + 1;
                bArr4[i10] = 121;
                byte[] bArr5 = this.v;
                int i11 = this.m;
                this.m = i11 + 1;
                bArr5[i11] = (byte) ((i2 >> 8) + 56);
                byte[] bArr6 = this.v;
                int i12 = this.m;
                this.m = i12 + 1;
                bArr6[i12] = (byte) i2;
            } else {
                byte[] bArr7 = this.v;
                int i13 = this.m;
                this.m = i13 + 1;
                bArr7[i13] = 121;
                d(i2);
            }
            for (char c6 : cArr) {
                byte[] bArr8 = this.v;
                int i14 = this.m;
                this.m = i14 + 1;
                bArr8[i14] = (byte) c6;
            }
            return;
        }
        int length2 = cArr.length * 3;
        int e = e(length2);
        f(this.m + length2 + e + 1);
        int a2 = ((com.alibaba.fastjson2.util.d.a(cArr, 0, cArr.length, this.v, (this.m + e) + 1) - this.m) - e) - 1;
        int e2 = e(a2);
        if (e != e2) {
            System.arraycopy(this.v, this.m + e + 1, this.v, this.m + e2 + 1, a2);
        }
        byte[] bArr9 = this.v;
        int i15 = this.m;
        this.m = i15 + 1;
        bArr9[i15] = 122;
        if (a2 >= -16 && a2 <= 47) {
            byte[] bArr10 = this.v;
            int i16 = this.m;
            this.m = i16 + 1;
            bArr10[i16] = (byte) a2;
        } else if (a2 < -2048 || a2 > 2047) {
            d(a2);
        } else {
            byte[] bArr11 = this.v;
            int i17 = this.m;
            this.m = i17 + 1;
            bArr11[i17] = (byte) ((a2 >> 8) + 56);
            byte[] bArr12 = this.v;
            int i18 = this.m;
            this.m = i18 + 1;
            bArr12[i18] = (byte) a2;
        }
        this.m += a2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public boolean b(byte[] bArr, long j) {
        int i;
        boolean z2;
        int a2;
        if (this.g == null || (a2 = this.g.a(j)) == -1) {
            if (this.t == j) {
                z2 = true;
                i = 0;
            } else {
                fge fgeVar = this.w;
                if (fgeVar != null) {
                    int b = fgeVar.b(j, this.x);
                    int i2 = this.x;
                    if (b != i2) {
                        i = b;
                        z2 = true;
                    } else {
                        this.x = i2 + 1;
                        i = b;
                    }
                } else {
                    i = this.x;
                    this.x = i + 1;
                    if (i == 0) {
                        this.t = j;
                    }
                    if (i != 0 || (this.b.k & JSONWriter.Feature.WriteNameAsSymbol.mask) != 0) {
                        this.w = new fge(j, i);
                    }
                }
                z2 = false;
            }
            if (z2) {
                g(-i);
                return false;
            }
            int i3 = this.m;
            int length = i3 + 2 + bArr.length;
            if (length > this.v.length) {
                f(length);
            }
            byte[] bArr2 = this.v;
            int i4 = i3 + 1;
            bArr2[i3] = -110;
            System.arraycopy(bArr, 0, bArr2, i4, bArr.length);
            int length2 = i4 + bArr.length;
            if (i < -16 || i > 47) {
                this.m = length2;
                d(i);
            } else {
                bArr2[length2] = (byte) i;
                this.m = length2 + 1;
            }
            return false;
        }
        return g(a2);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(int i) {
        int i2 = this.m;
        if (i2 == this.v.length) {
            f(i2 + 1);
        }
        byte[] bArr = this.v;
        boolean z2 = i <= 15;
        bArr[i2] = z2 ? (byte) (i + ErrorConstant.ERROR_GET_PROCESS_NULL) : (byte) -92;
        this.m = i2 + 1;
        if (!z2) {
            d(i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(String str) {
        int a2;
        fge fgeVar;
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = -110;
        long b = com.alibaba.fastjson2.util.c.b(str);
        if (this.g != null) {
            a2 = this.g.a(b);
            if (a2 == -1 && (fgeVar = this.w) != null) {
                a2 = fgeVar.a(b);
            }
        } else {
            fge fgeVar2 = this.w;
            a2 = fgeVar2 != null ? fgeVar2.a(b) : -1;
        }
        if (a2 != -1) {
            if (this.m == this.v.length) {
                f(this.m + 1);
            }
            d(a2);
            return;
        }
        if (this.w == null) {
            this.w = new fge();
        }
        fge fgeVar3 = this.w;
        int i2 = this.x;
        this.x = i2 + 1;
        fgeVar3.a(b, i2);
        d(str);
        d(i2);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(byte[] bArr) {
        a(bArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.v;
        if (bArr.length < 1048576) {
            JSONFactory.v.lazySet(this.u, bArr);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(int i) {
        int i2 = 5;
        int i3 = this.m + 5;
        if (i3 >= this.v.length) {
            f(i3);
        }
        byte[] bArr = this.v;
        int i4 = this.m;
        if (i >= -16 && i <= 47) {
            bArr[i4] = (byte) i;
            i2 = 1;
        } else if (i >= -2048 && i <= 2047) {
            bArr[i4] = (byte) ((i >> 8) + 56);
            bArr[i4 + 1] = (byte) i;
            i2 = 2;
        } else if (i < -262144 || i > 262143) {
            bArr[i4] = 72;
            f(bArr, i4 + 1, i);
        } else {
            b(bArr, i4, i);
            i2 = 3;
        }
        this.m += i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(String str) {
        if (str == null) {
            n();
        } else {
            b(str.toCharArray());
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(byte[] bArr) {
        int length = this.m + bArr.length;
        if (length - this.v.length > 0) {
            f(length);
        }
        System.arraycopy(bArr, 0, this.v, this.m, bArr.length);
        this.m += bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(long j) {
        int i = 9;
        int i2 = this.m + 9;
        if (i2 > this.v.length) {
            f(i2);
        }
        byte[] bArr = this.v;
        int i3 = this.m;
        if (j >= -8 && j <= 15) {
            bArr[i3] = (byte) ((j - (-8)) - 40);
            i = 1;
        } else if (j >= -2048 && j <= 2047) {
            bArr[i3] = (byte) ((j >> 8) - 48);
            bArr[i3 + 1] = (byte) j;
            i = 2;
        } else if (j >= -262144 && j <= 262143) {
            a(bArr, i3, (int) j);
            i = 3;
        } else if (j < -2147483648L || j > 2147483647L) {
            bArr[i3] = -66;
            a(bArr, i3 + 1, j);
        } else {
            bArr[i3] = -65;
            f(bArr, i3 + 1, (int) j);
            i = 5;
        }
        this.m = i3 + i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(String str) {
        int a2;
        if (str == null) {
            n();
        } else if (this.g == null || (a2 = this.g.a(str)) < 0) {
            d(str);
        } else {
            a(Byte.MAX_VALUE);
            d(-a2);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(byte[] bArr) {
        d(bArr);
    }

    void f(int i) {
        byte[] bArr = this.v;
        if (i >= bArr.length) {
            int length = bArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i > this.j) {
                throw new OutOfMemoryError();
            }
            this.v = Arrays.copyOf(this.v, i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f(long j) {
        int i = this.m;
        int i2 = i + 9;
        if (i2 >= this.v.length) {
            f(i2);
        }
        byte[] bArr = this.v;
        if (j % 1000 == 0) {
            long j2 = j / 1000;
            if (j2 >= -2147483648L && j2 <= 2147483647L) {
                int i3 = (int) j2;
                bArr[i] = -84;
                bArr[i + 1] = (byte) (i3 >>> 24);
                bArr[i + 2] = (byte) (i3 >>> 16);
                bArr[i + 3] = (byte) (i3 >>> 8);
                bArr[i + 4] = (byte) i3;
                this.m = i + 5;
                return;
            } else if (j2 % 60 == 0) {
                long j3 = j2 / 60;
                if (j3 >= -2147483648L && j3 <= 2147483647L) {
                    int i4 = (int) j3;
                    bArr[i] = -83;
                    bArr[i + 1] = (byte) (i4 >>> 24);
                    bArr[i + 2] = (byte) (i4 >>> 16);
                    bArr[i + 3] = (byte) (i4 >>> 8);
                    bArr[i + 4] = (byte) i4;
                    this.m = i + 5;
                    return;
                }
            }
        }
        bArr[i] = -85;
        bArr[i + 1] = (byte) (j >>> 56);
        bArr[i + 2] = (byte) (j >>> 48);
        bArr[i + 3] = (byte) (j >>> 40);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 5] = (byte) (j >>> 24);
        bArr[i + 6] = (byte) (j >>> 16);
        bArr[i + 7] = (byte) (j >>> 8);
        bArr[i + 8] = (byte) j;
        this.m = i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f(Object obj) {
        if (obj == null) {
            n();
            return;
        }
        boolean z2 = (this.b.k & JSONWriter.Feature.FieldBased.mask) != 0;
        Class<?> cls = obj.getClass();
        bg b = this.b.f2940a.b(cls, cls, z2);
        if (d()) {
            b.c(this, obj, null, null, 0L);
        } else {
            b.b(this, obj, null, null, 0L);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f(String str) {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = -109;
        if (str == this.q) {
            d("#-1");
        } else {
            d(str);
        }
        this.q = str;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void h() {
        this.l++;
        int i = this.m;
        if (i == this.v.length) {
            f(i + 1);
        }
        this.v[i] = -90;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void i() {
        this.l--;
        int i = this.m;
        if (i == this.v.length) {
            f(i + 1);
        }
        this.v[i] = -91;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void j() {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void k() {
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l() {
        throw new JSONException("unsupported operation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void n() {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = -81;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void o() {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = -81;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void p() {
        if (this.m == this.v.length) {
            f(this.m + 1);
        }
        if ((this.b.k & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) != 0) {
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = -108;
            return;
        }
        byte[] bArr2 = this.v;
        int i2 = this.m;
        this.m = i2 + 1;
        bArr2[i2] = -81;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] s() {
        return Arrays.copyOf(this.v, this.m);
    }

    public String toString() {
        if (this.v.length == 0) {
            return "<empty>";
        }
        JSONReader a2 = JSONReader.a(s());
        JSONWriter g = JSONWriter.g();
        try {
            g.f(a2.aM());
            return g.toString();
        } catch (Exception unused) {
            return b.CC.a(this.v[0]) + ", bytes length " + this.m;
        }
    }
}
