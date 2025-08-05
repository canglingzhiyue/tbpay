package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.taobao.tao.shop.common.ShopConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.crd;
import tb.gbx;
import tb.kge;
import tb.riy;
import tb.tof;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends JSONWriter {
    static final byte[] t;
    final JSONFactory.CacheItem u;
    protected byte[] v;

    static {
        kge.a(1866545774);
        t = "{\"$ref\":".getBytes(StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(JSONWriter.a aVar) {
        super(aVar, null, false, StandardCharsets.UTF_8);
        this.u = JSONFactory.t[System.identityHashCode(Thread.currentThread()) & (JSONFactory.t.length - 1)];
        byte[] andSet = JSONFactory.v.getAndSet(this.u, null);
        this.v = andSet == null ? new byte[8192] : andSet;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    protected final void a(char c) {
        int i = this.m;
        if (i == this.v.length) {
            e(i + 1);
        }
        this.v[i] = (byte) c;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(double d) {
        int i;
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int i3 = i2 + 26;
        if (i3 >= this.v.length) {
            e(i3);
        }
        byte[] bArr = this.v;
        if (z) {
            bArr[i2] = 34;
            i2++;
        }
        int a2 = i2 + com.alibaba.fastjson2.util.a.a(d, bArr, i2, true);
        if (z) {
            i = a2 + 1;
            bArr[a2] = 34;
        } else {
            i = a2;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(float f) {
        int i;
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int i3 = i2 + 17;
        if (i3 >= this.v.length) {
            e(i3);
        }
        if (z) {
            this.v[i2] = 34;
            i2++;
        }
        int a2 = i2 + com.alibaba.fastjson2.util.a.a(f, this.v, i2, true);
        if (z) {
            i = a2 + 1;
            this.v[a2] = 34;
        } else {
            i = a2;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3) {
        int i4 = this.m;
        int i5 = i4 + 10;
        if (i5 >= this.v.length) {
            e(i5);
        }
        byte[] bArr = this.v;
        bArr[i4] = (byte) this.i;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i6 = i / 1000;
        int i7 = com.alibaba.fastjson2.util.d.DIGITS_K[i - (i6 * 1000)];
        bArr[i4 + 1] = (byte) (i6 + 48);
        bArr[i4 + 2] = (byte) (i7 >> 16);
        bArr[i4 + 3] = (byte) (i7 >> 8);
        bArr[i4 + 4] = (byte) i7;
        int i8 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        bArr[i4 + 5] = (byte) (i8 >> 8);
        bArr[i4 + 6] = (byte) i8;
        int i9 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        bArr[i4 + 7] = (byte) (i9 >> 8);
        bArr[i4 + 8] = (byte) i9;
        bArr[i4 + 9] = (byte) this.i;
        this.m = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.m;
        int i8 = i7 + 16;
        if (i8 >= this.v.length) {
            e(i8);
        }
        byte[] bArr = this.v;
        bArr[i7] = (byte) this.i;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i9 = i / 1000;
        int i10 = com.alibaba.fastjson2.util.d.DIGITS_K[i - (i9 * 1000)];
        bArr[i7 + 1] = (byte) (i9 + 48);
        bArr[i7 + 2] = (byte) (i10 >> 16);
        bArr[i7 + 3] = (byte) (i10 >> 8);
        bArr[i7 + 4] = (byte) i10;
        int i11 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        bArr[i7 + 5] = (byte) (i11 >> 8);
        bArr[i7 + 6] = (byte) i11;
        int i12 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        bArr[i7 + 7] = (byte) (i12 >> 8);
        bArr[i7 + 8] = (byte) i12;
        int i13 = com.alibaba.fastjson2.util.d.DIGITS_K[i4];
        bArr[i7 + 9] = (byte) (i13 >> 8);
        bArr[i7 + 10] = (byte) i13;
        int i14 = com.alibaba.fastjson2.util.d.DIGITS_K[i5];
        bArr[i7 + 11] = (byte) (i14 >> 8);
        bArr[i7 + 12] = (byte) i14;
        int i15 = com.alibaba.fastjson2.util.d.DIGITS_K[i6];
        bArr[i7 + 13] = (byte) (i15 >> 8);
        bArr[i7 + 14] = (byte) i15;
        bArr[i7 + 15] = (byte) this.i;
        this.m = i8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = this.m + 25 + (z ? i8 == 0 ? 1 : 6 : 0);
        if (i9 >= this.v.length) {
            e(i9);
        }
        byte[] bArr = this.v;
        int i10 = this.m;
        bArr[i10] = (byte) this.i;
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i10 + 1, i);
        byte b = gbx.OP_CALL_FUNC;
        bArr[a2] = gbx.OP_CALL_FUNC;
        int i11 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        bArr[a2 + 1] = (byte) (i11 >> 8);
        bArr[a2 + 2] = (byte) i11;
        bArr[a2 + 3] = gbx.OP_CALL_FUNC;
        int i12 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        bArr[a2 + 4] = (byte) (i12 >> 8);
        bArr[a2 + 5] = (byte) i12;
        bArr[a2 + 6] = (byte) (z ? 84 : 32);
        int i13 = com.alibaba.fastjson2.util.d.DIGITS_K[i4];
        bArr[a2 + 7] = (byte) (i13 >> 8);
        bArr[a2 + 8] = (byte) i13;
        bArr[a2 + 9] = 58;
        int i14 = com.alibaba.fastjson2.util.d.DIGITS_K[i5];
        bArr[a2 + 10] = (byte) (i14 >> 8);
        bArr[a2 + 11] = (byte) i14;
        bArr[a2 + 12] = 58;
        int i15 = com.alibaba.fastjson2.util.d.DIGITS_K[i6];
        bArr[a2 + 13] = (byte) (i15 >> 8);
        bArr[a2 + 14] = (byte) i15;
        int i16 = a2 + 15;
        if (i7 > 0) {
            int i17 = i16 + 1;
            bArr[i16] = gbx.OP_ASSIGN;
            int i18 = i7 / 10;
            int i19 = i18 / 10;
            if (i7 - (i18 * 10) != 0) {
                int i20 = com.alibaba.fastjson2.util.d.DIGITS_K[i7];
                bArr[i17] = (byte) (i20 >> 16);
                bArr[i17 + 1] = (byte) (i20 >> 8);
                bArr[i17 + 2] = (byte) i20;
                i16 = i17 + 3;
            } else if (i18 - (i19 * 10) != 0) {
                int i21 = com.alibaba.fastjson2.util.d.DIGITS_K[i18];
                bArr[i17] = (byte) (i21 >> 8);
                bArr[i17 + 1] = (byte) i21;
                i16 = i17 + 2;
            } else {
                i16 = i17 + 1;
                bArr[i17] = (byte) (i19 + 48);
            }
        }
        if (z) {
            int i22 = i8 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
            if (i8 == 0) {
                bArr[i16] = 90;
                i16++;
            } else {
                int abs = Math.abs(i22);
                if (i22 >= 0) {
                    b = 43;
                }
                bArr[i16] = b;
                int i23 = com.alibaba.fastjson2.util.d.DIGITS_K[abs];
                bArr[i16 + 1] = (byte) (i23 >> 8);
                bArr[i16 + 2] = (byte) i23;
                bArr[i16 + 3] = 58;
                int i24 = (i8 - (i22 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
                if (i24 < 0) {
                    i24 = -i24;
                }
                int i25 = com.alibaba.fastjson2.util.d.DIGITS_K[i24];
                bArr[i16 + 4] = (byte) (i25 >> 8);
                bArr[i16 + 5] = (byte) i25;
                i16 += 6;
            }
        }
        bArr[i16] = (byte) this.i;
        this.m = i16 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            n();
        } else if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & this.b.k) != 0) {
            this.b.a(jSONObject.getClass()).a(this, jSONObject, null, null, 0L);
        } else {
            if (this.m == this.v.length) {
                e(this.m + 1);
            }
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = 123;
            boolean z = true;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (!z) {
                    if (this.m == this.v.length) {
                        e(this.m + 1);
                    }
                    if (value != null && (this.b.k & JSONWriter.Feature.WriteMapNullValue.mask) == 0) {
                        byte[] bArr2 = this.v;
                        int i2 = this.m;
                        this.m = i2 + 1;
                        bArr2[i2] = gbx.OP_IS_NOT;
                    }
                }
                if (value != null || (this.b.k & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                    z = false;
                    String key = entry.getKey();
                    if (key instanceof String) {
                        d(key);
                    } else {
                        f((Object) key);
                    }
                    if (this.m == this.v.length) {
                        e(this.m + 1);
                    }
                    byte[] bArr3 = this.v;
                    int i3 = this.m;
                    this.m = i3 + 1;
                    bArr3[i3] = 58;
                    if (value == null) {
                        n();
                    } else {
                        Class<?> cls = value.getClass();
                        if (cls == String.class) {
                            d((String) value);
                        } else if (cls == Integer.class) {
                            d(((Integer) value).intValue());
                        } else if (cls == Long.class) {
                            e(((Long) value).longValue());
                        } else if (cls == Boolean.class) {
                            b(((Boolean) value).booleanValue());
                        } else if (cls == BigDecimal.class) {
                            a((BigDecimal) value, 0L, (DecimalFormat) null);
                        } else if (cls == JSONArray.class) {
                            b((List) ((JSONArray) value));
                        } else if (cls == JSONObject.class) {
                            a((JSONObject) value);
                        } else {
                            this.b.a(cls, cls).a(this, value, null, null, 0L);
                        }
                    }
                }
            }
            if (this.m == this.v.length) {
                e(this.m + 1);
            }
            byte[] bArr4 = this.v;
            int i4 = this.m;
            this.m = i4 + 1;
            bArr4[i4] = 125;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(com.alibaba.fastjson2.time.c cVar) {
        int i = this.m;
        int i2 = i + 38;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        int i3 = i + 1;
        bArr[i] = (byte) this.i;
        com.alibaba.fastjson2.time.b bVar = cVar.f3021a;
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i3, bVar.f3020a, bVar.b, bVar.c);
        bArr[a2] = 32;
        int a3 = com.alibaba.fastjson2.util.d.a(bArr, a2 + 1, cVar.b);
        bArr[a3] = (byte) this.i;
        this.m = a3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(String str) {
        int i;
        int i2;
        char[] charArray = str.toCharArray();
        int i3 = this.m;
        int length = (charArray.length * 3) + i3;
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        for (char c : charArray) {
            if (c <= 0 || c > 127) {
                if (c > 2047) {
                    bArr[i3] = (byte) (((c >> '\f') & 15) | 224);
                    bArr[i3 + 1] = (byte) (((c >> 6) & 63) | 128);
                    i = i3 + 2;
                } else {
                    bArr[i3] = (byte) (((c >> 6) & 31) | crd.DETECT_WIDTH);
                    i = i3 + 1;
                }
                i2 = i + 1;
                bArr[i] = (byte) ((c & riy.CONDITION_IF) | 128);
            } else {
                i2 = i3 + 1;
                bArr[i3] = (byte) c;
            }
            i3 = i2;
        }
        this.m = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(BigDecimal bigDecimal, long j, DecimalFormat decimalFormat) {
        int i;
        if (bigDecimal == null) {
            q();
        } else if (decimalFormat != null) {
            a(decimalFormat.format(bigDecimal));
        } else {
            long j2 = j | this.b.k;
            int precision = bigDecimal.precision();
            boolean z = true;
            boolean z2 = (((JSONWriter.Feature.WriteNonStringValueAsString.mask & j2) > 0L ? 1 : ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j2) == 0L ? 0 : -1)) != 0) || ((JSONWriter.Feature.BrowserCompatible.mask & j2) != 0 && precision >= 16 && (bigDecimal.compareTo(JSONFactory.k) < 0 || bigDecimal.compareTo(JSONFactory.l) > 0));
            int i2 = this.m;
            int scale = precision + i2 + bigDecimal.scale() + 7;
            if (scale >= this.v.length) {
                e(scale);
            }
            byte[] bArr = this.v;
            if (z2) {
                bArr[i2] = 34;
                i2++;
            }
            if ((j2 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) == 0) {
                z = false;
            }
            String plainString = z ? bigDecimal.toPlainString() : bigDecimal.toString();
            plainString.getBytes(0, plainString.length(), bArr, i2);
            int length = i2 + plainString.length();
            if (z2) {
                i = length + 1;
                bArr[length] = 34;
            } else {
                i = length;
            }
            this.m = i;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(BigInteger bigInteger, long j) {
        if (bigInteger == null) {
            q();
            return;
        }
        String bigInteger2 = bigInteger.toString(10);
        if (((j | this.b.k) & JSONWriter.Feature.BrowserCompatible.mask) != 0 && (bigInteger.compareTo(JSONFactory.m) < 0 || bigInteger.compareTo(JSONFactory.n) > 0)) {
            d(bigInteger2);
            return;
        }
        int length = bigInteger2.length();
        int i = this.m + length;
        if (i >= this.v.length) {
            e(i);
        }
        bigInteger2.getBytes(0, length, this.v, this.m);
        this.m += length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(UUID uuid) {
        if (uuid == null) {
            n();
            return;
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        int i = this.m + 38;
        if (i >= this.v.length) {
            e(i);
        }
        char[] cArr = JSONFactory.z;
        byte[] bArr = this.v;
        int i2 = this.m;
        bArr[i2] = 34;
        char c = cArr[((int) (mostSignificantBits >> 56)) & 255];
        char c2 = cArr[((int) (mostSignificantBits >> 48)) & 255];
        char c3 = cArr[((int) (mostSignificantBits >> 40)) & 255];
        char c4 = cArr[((int) (mostSignificantBits >> 32)) & 255];
        int i3 = (int) mostSignificantBits;
        char c5 = cArr[i3 >>> 24];
        char c6 = cArr[(i3 >> 16) & 255];
        char c7 = cArr[(i3 >> 8) & 255];
        char c8 = cArr[i3 & 255];
        char c9 = cArr[((int) (leastSignificantBits >> 56)) & 255];
        char c10 = cArr[((int) (leastSignificantBits >> 48)) & 255];
        char c11 = cArr[((int) (leastSignificantBits >> 40)) & 255];
        char c12 = cArr[((int) (leastSignificantBits >> 32)) & 255];
        int i4 = (int) leastSignificantBits;
        char c13 = cArr[i4 >>> 24];
        char c14 = cArr[(i4 >> 16) & 255];
        char c15 = cArr[(i4 >> 8) & 255];
        char c16 = cArr[i4 & 255];
        bArr[i2 + 1] = (byte) (c >> '\b');
        bArr[i2 + 2] = (byte) c;
        bArr[i2 + 3] = (byte) (c2 >> '\b');
        bArr[i2 + 4] = (byte) c2;
        bArr[i2 + 5] = (byte) (c3 >> '\b');
        bArr[i2 + 6] = (byte) c3;
        bArr[i2 + 7] = (byte) (c4 >> '\b');
        bArr[i2 + 8] = (byte) c4;
        bArr[i2 + 9] = gbx.OP_CALL_FUNC;
        bArr[i2 + 10] = (byte) (c5 >> '\b');
        bArr[i2 + 11] = (byte) c5;
        bArr[i2 + 12] = (byte) (c6 >> '\b');
        bArr[i2 + 13] = (byte) c6;
        bArr[i2 + 14] = gbx.OP_CALL_FUNC;
        bArr[i2 + 15] = (byte) (c7 >> '\b');
        bArr[i2 + 16] = (byte) c7;
        bArr[i2 + 17] = (byte) (c8 >> '\b');
        bArr[i2 + 18] = (byte) c8;
        bArr[i2 + 19] = gbx.OP_CALL_FUNC;
        bArr[i2 + 20] = (byte) (c9 >> '\b');
        bArr[i2 + 21] = (byte) c9;
        bArr[i2 + 22] = (byte) (c10 >> '\b');
        bArr[i2 + 23] = (byte) c10;
        bArr[i2 + 24] = gbx.OP_CALL_FUNC;
        bArr[i2 + 25] = (byte) (c11 >> '\b');
        bArr[i2 + 26] = (byte) c11;
        bArr[i2 + 27] = (byte) (c12 >> '\b');
        bArr[i2 + 28] = (byte) c12;
        bArr[i2 + 29] = (byte) (c13 >> '\b');
        bArr[i2 + 30] = (byte) c13;
        bArr[i2 + 31] = (byte) (c14 >> '\b');
        bArr[i2 + 32] = (byte) c14;
        bArr[i2 + 33] = (byte) (c15 >> '\b');
        bArr[i2 + 34] = (byte) c15;
        bArr[i2 + 35] = (byte) (c16 >> '\b');
        bArr[i2 + 36] = (byte) c16;
        bArr[i2 + 37] = 34;
        this.m += 38;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(short s) {
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.m;
        int i2 = i + 7;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        if (z) {
            bArr[i] = (byte) this.i;
            i++;
        }
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i, (int) s);
        if (z) {
            bArr[a2] = (byte) this.i;
            a2++;
        }
        this.m = a2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(char[] cArr) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r15 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r12 = r4 + 1;
        r1[r4] = (byte) r11.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        r11.m = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
        return;
     */
    @Override // com.alibaba.fastjson2.JSONWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(char[] r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.r.a(char[], int, int, boolean):void");
    }

    protected final void a(char[] cArr, int i, boolean z, boolean z2, int i2) {
        int i3;
        int i4;
        int i5;
        int length = this.m + ((cArr.length - i2) * 6) + 2;
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        int i6 = this.m;
        while (i2 < i) {
            char c = cArr[i2];
            if (c <= 127) {
                if (c != '(' && c != ')' && c != '<' && c != '>') {
                    if (c != '\\') {
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = 48;
                                bArr[i6 + 5] = (byte) (c + '0');
                                i6 += 6;
                                break;
                            case '\b':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 98;
                                break;
                            case '\t':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 116;
                                break;
                            case '\n':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 110;
                                break;
                            case 11:
                            case 14:
                            case 15:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = 48;
                                bArr[i6 + 5] = (byte) ((c - '\n') + 97);
                                i6 += 6;
                                break;
                            case '\f':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 102;
                                break;
                            case '\r':
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 114;
                                break;
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = tof.LF_LINK;
                                bArr[i6 + 5] = (byte) ((c - 16) + 48);
                                i6 += 6;
                                break;
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                bArr[i6] = 92;
                                bArr[i6 + 1] = 117;
                                bArr[i6 + 2] = 48;
                                bArr[i6 + 3] = 48;
                                bArr[i6 + 4] = tof.LF_LINK;
                                bArr[i6 + 5] = (byte) ((c - 26) + 97);
                                i6 += 6;
                                break;
                            default:
                                if (c != this.i) {
                                    i5 = i6 + 1;
                                    bArr[i6] = (byte) c;
                                    i6 = i5;
                                    break;
                                } else {
                                    bArr[i6] = 92;
                                    bArr[i6 + 1] = (byte) this.i;
                                    break;
                                }
                        }
                    } else {
                        bArr[i6] = 92;
                        bArr[i6 + 1] = 92;
                    }
                    i6 += 2;
                } else if (z) {
                    bArr[i6] = 92;
                    bArr[i6 + 1] = 117;
                    bArr[i6 + 2] = 48;
                    bArr[i6 + 3] = 48;
                    bArr[i6 + 4] = (byte) f2939a[(c >>> 4) & 15];
                    bArr[i6 + 5] = (byte) f2939a[c & 15];
                    i6 += 6;
                } else {
                    i5 = i6 + 1;
                    bArr[i6] = (byte) c;
                    i6 = i5;
                }
            } else if (z2) {
                bArr[i6] = 92;
                bArr[i6 + 1] = 117;
                bArr[i6 + 2] = (byte) f2939a[(c >>> '\f') & 15];
                bArr[i6 + 3] = (byte) f2939a[(c >>> '\b') & 15];
                bArr[i6 + 4] = (byte) f2939a[(c >>> 4) & 15];
                bArr[i6 + 5] = (byte) f2939a[c & 15];
                i6 += 6;
            } else if (c >= 55296 && c < 57344) {
                if (c < 56320) {
                    if (cArr.length - i2 < 2) {
                        i4 = -1;
                    } else {
                        char c2 = cArr[i2 + 1];
                        if (c2 < 56320 || c2 >= 57344) {
                            i3 = i6 + 1;
                            bArr[i6] = 63;
                        } else {
                            i4 = ((c << '\n') + c2) - 56613888;
                        }
                    }
                    if (i4 < 0) {
                        i3 = i6 + 1;
                        bArr[i6] = 63;
                    } else {
                        bArr[i6] = (byte) ((i4 >> 18) | 240);
                        bArr[i6 + 1] = (byte) (((i4 >> 12) & 63) | 128);
                        bArr[i6 + 2] = (byte) ((63 & (i4 >> 6)) | 128);
                        bArr[i6 + 3] = (byte) ((i4 & 63) | 128);
                        i6 += 4;
                        i2++;
                    }
                } else {
                    i3 = i6 + 1;
                    bArr[i6] = 63;
                }
                i6 = i3;
            } else if (c > 2047) {
                bArr[i6] = (byte) (((c >> '\f') & 15) | 224);
                bArr[i6 + 1] = (byte) ((63 & (c >> 6)) | 128);
                bArr[i6 + 2] = (byte) ((c & riy.CONDITION_IF) | 128);
                i6 += 3;
            } else {
                bArr[i6] = (byte) (((c >> 6) & 31) | crd.DETECT_WIDTH);
                bArr[i6 + 1] = (byte) ((c & riy.CONDITION_IF) | 128);
                i6 += 2;
            }
            i2++;
        }
        this.m = i6;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(double[] dArr) {
        int i;
        if (dArr == null) {
            n();
            return;
        }
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int length = (dArr.length * 27) + i2 + 1;
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        int i3 = i2 + 1;
        bArr[i2] = 91;
        for (int i4 = 0; i4 < dArr.length; i4++) {
            if (i4 != 0) {
                i = i3 + 1;
                bArr[i3] = gbx.OP_IS_NOT;
            } else {
                i = i3;
            }
            if (z) {
                bArr[i] = 34;
                i++;
            }
            int a2 = i + com.alibaba.fastjson2.util.a.a(dArr[i4], bArr, i, true);
            if (z) {
                bArr[a2] = 34;
                i3 = a2 + 1;
            } else {
                i3 = a2;
            }
        }
        bArr[i3] = 93;
        this.m = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(float[] fArr) {
        int i;
        if (fArr == null) {
            p();
            return;
        }
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int length = (fArr.length * (z ? 16 : 18)) + i2 + 1;
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        int i3 = i2 + 1;
        bArr[i2] = 91;
        for (int i4 = 0; i4 < fArr.length; i4++) {
            if (i4 != 0) {
                i = i3 + 1;
                bArr[i3] = gbx.OP_IS_NOT;
            } else {
                i = i3;
            }
            if (z) {
                bArr[i] = 34;
                i++;
            }
            int a2 = i + com.alibaba.fastjson2.util.a.a(fArr[i4], bArr, i, true);
            if (z) {
                bArr[a2] = 34;
                i3 = a2 + 1;
            } else {
                i3 = a2;
            }
        }
        bArr[i3] = 93;
        this.m = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int[] iArr) {
        int i;
        if (iArr == null) {
            n();
            return;
        }
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int length = (iArr.length * 13) + i2 + 2;
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        int i3 = i2 + 1;
        bArr[i2] = 91;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i4 != 0) {
                i = i3 + 1;
                bArr[i3] = gbx.OP_IS_NOT;
            } else {
                i = i3;
            }
            if (z) {
                bArr[i] = (byte) this.i;
                i++;
            }
            int a2 = com.alibaba.fastjson2.util.d.a(bArr, i, iArr[i4]);
            if (z) {
                i3 = a2 + 1;
                bArr[a2] = (byte) this.i;
            } else {
                i3 = a2;
            }
        }
        bArr[i3] = 93;
        this.m = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(long[] jArr) {
        if (jArr == null) {
            n();
            return;
        }
        long j = this.b.k;
        boolean z = (JSONWriter.Feature.BrowserCompatible.mask & j) != 0;
        boolean z2 = (j & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        int i = this.m;
        int length = i + 2 + (jArr.length * 23);
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        int i2 = i + 1;
        bArr[i] = 91;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if (i3 != 0) {
                bArr[i2] = gbx.OP_IS_NOT;
                i2++;
            }
            long j2 = jArr[i3];
            boolean z3 = z2 || (z && j2 <= 9007199254740991L && j2 >= -9007199254740991L);
            if (z3) {
                bArr[i2] = (byte) this.i;
                i2++;
            }
            i2 = com.alibaba.fastjson2.util.d.a(bArr, i2, j2);
            if (z3) {
                bArr[i2] = (byte) this.i;
                i2++;
            }
        }
        bArr[i2] = 93;
        this.m = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(String[] strArr) {
        if (strArr == null) {
            p();
            return;
        }
        j();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                l();
            }
            String str = strArr[i];
            if (str == null) {
                if (b(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                    str = "";
                } else {
                    n();
                }
            }
            d(str);
        }
        k();
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(byte b) {
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.m;
        int i2 = i + 5;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        if (z) {
            bArr[i] = (byte) this.i;
            i++;
        }
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i, (int) b);
        if (z) {
            bArr[a2] = (byte) this.i;
            a2++;
        }
        this.m = a2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(char c) {
        int i;
        int i2 = this.m;
        int i3 = i2 + 8;
        if (i3 >= this.v.length) {
            e(i3);
        }
        byte[] bArr = this.v;
        int i4 = i2 + 1;
        bArr[i2] = (byte) this.i;
        if (c > 127) {
            if (c >= 55296 && c < 57344) {
                throw new JSONException("illegal char " + c);
            } else if (c <= 2047) {
                bArr[i4] = (byte) (((c >> 6) & 31) | crd.DETECT_WIDTH);
                bArr[i4 + 1] = (byte) ((c & riy.CONDITION_IF) | 128);
                i = i4 + 2;
                bArr[i] = (byte) this.i;
                this.m = i + 1;
            } else {
                bArr[i4] = (byte) (((c >> '\f') & 15) | 224);
                bArr[i4 + 1] = (byte) (((c >> 6) & 63) | 128);
                bArr[i4 + 2] = (byte) ((c & riy.CONDITION_IF) | 128);
                i = i4 + 3;
                bArr[i] = (byte) this.i;
                this.m = i + 1;
            }
        }
        if (c != '\\') {
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 117;
                    bArr[i4 + 2] = 48;
                    bArr[i4 + 3] = 48;
                    bArr[i4 + 4] = 48;
                    bArr[i4 + 5] = (byte) (c + '0');
                    i = i4 + 6;
                    break;
                case '\b':
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 98;
                    break;
                case '\t':
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 116;
                    break;
                case '\n':
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 110;
                    break;
                case 11:
                case 14:
                case 15:
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 117;
                    bArr[i4 + 2] = 48;
                    bArr[i4 + 3] = 48;
                    bArr[i4 + 4] = 48;
                    bArr[i4 + 5] = (byte) ((c - '\n') + 97);
                    i = i4 + 6;
                    break;
                case '\f':
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 102;
                    break;
                case '\r':
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 114;
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 117;
                    bArr[i4 + 2] = 48;
                    bArr[i4 + 3] = 48;
                    bArr[i4 + 4] = tof.LF_LINK;
                    bArr[i4 + 5] = (byte) ((c - 16) + 48);
                    i = i4 + 6;
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    bArr[i4] = 92;
                    bArr[i4 + 1] = 117;
                    bArr[i4 + 2] = 48;
                    bArr[i4 + 3] = 48;
                    bArr[i4 + 4] = tof.LF_LINK;
                    bArr[i4 + 5] = (byte) ((c - 26) + 97);
                    i = i4 + 6;
                    break;
                default:
                    if (c != this.i) {
                        bArr[i4] = (byte) c;
                        i = i4 + 1;
                        break;
                    } else {
                        bArr[i4] = 92;
                        bArr[i4 + 1] = (byte) this.i;
                        break;
                    }
            }
            bArr[i] = (byte) this.i;
            this.m = i + 1;
        }
        bArr[i4] = 92;
        bArr[i4 + 1] = 92;
        i = i4 + 2;
        bArr[i] = (byte) this.i;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(int i, int i2, int i3) {
        int i4 = this.m;
        int i5 = i4 + 13;
        if (i5 >= this.v.length) {
            e(i5);
        }
        byte[] bArr = this.v;
        bArr[i4] = (byte) this.i;
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i4 + 1, i, i2, i3);
        bArr[a2] = (byte) this.i;
        this.m = a2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.m;
        int i8 = i7 + 21;
        if (i8 >= this.v.length) {
            e(i8);
        }
        byte[] bArr = this.v;
        bArr[i7] = (byte) this.i;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i9 = i / 1000;
        int i10 = com.alibaba.fastjson2.util.d.DIGITS_K[i - (i9 * 1000)];
        bArr[i7 + 1] = (byte) (i9 + 48);
        bArr[i7 + 2] = (byte) (i10 >> 16);
        bArr[i7 + 3] = (byte) (i10 >> 8);
        bArr[i7 + 4] = (byte) i10;
        bArr[i7 + 5] = gbx.OP_CALL_FUNC;
        int i11 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        bArr[i7 + 6] = (byte) (i11 >> 8);
        bArr[i7 + 7] = (byte) i11;
        bArr[i7 + 8] = gbx.OP_CALL_FUNC;
        int i12 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        bArr[i7 + 9] = (byte) (i12 >> 8);
        bArr[i7 + 10] = (byte) i12;
        bArr[i7 + 11] = 32;
        int i13 = com.alibaba.fastjson2.util.d.DIGITS_K[i4];
        bArr[i7 + 12] = (byte) (i13 >> 8);
        bArr[i7 + 13] = (byte) i13;
        bArr[i7 + 14] = 58;
        int i14 = com.alibaba.fastjson2.util.d.DIGITS_K[i5];
        bArr[i7 + 15] = (byte) (i14 >> 8);
        bArr[i7 + 16] = (byte) i14;
        bArr[i7 + 17] = 58;
        int i15 = com.alibaba.fastjson2.util.d.DIGITS_K[i6];
        bArr[i7 + 18] = (byte) (i15 >> 8);
        bArr[i7 + 19] = (byte) i15;
        bArr[i7 + 20] = (byte) this.i;
        this.m = i8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(List list) {
        if (list == null) {
            p();
        } else if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & this.b.k) != 0) {
            this.b.a(list.getClass()).a(this, list, null, null, 0L);
        } else {
            if (this.m == this.v.length) {
                e(this.m + 1);
            }
            byte[] bArr = this.v;
            int i = this.m;
            this.m = i + 1;
            bArr[i] = 91;
            int size = list.size();
            boolean z = true;
            int i2 = 0;
            while (i2 < size) {
                if (!z) {
                    if (this.m == this.v.length) {
                        e(this.m + 1);
                    }
                    byte[] bArr2 = this.v;
                    int i3 = this.m;
                    this.m = i3 + 1;
                    bArr2[i3] = gbx.OP_IS_NOT;
                }
                Object obj = list.get(i2);
                if (obj == null) {
                    n();
                } else {
                    Class<?> cls = obj.getClass();
                    if (cls == String.class) {
                        d((String) obj);
                    } else if (cls == Integer.class) {
                        d(((Integer) obj).intValue());
                    } else if (cls == Long.class) {
                        e(((Long) obj).longValue());
                    } else if (cls == Boolean.class) {
                        b(((Boolean) obj).booleanValue());
                    } else if (cls == BigDecimal.class) {
                        a((BigDecimal) obj, 0L, (DecimalFormat) null);
                    } else if (cls == JSONArray.class) {
                        b((List) ((JSONArray) obj));
                    } else if (cls == JSONObject.class) {
                        a((JSONObject) obj);
                    } else {
                        this.b.a(cls, cls).a(this, obj, null, null, 0L);
                    }
                }
                i2++;
                z = false;
            }
            if (this.m == this.v.length) {
                e(this.m + 1);
            }
            byte[] bArr3 = this.v;
            int i4 = this.m;
            this.m = i4 + 1;
            bArr3[i4] = 93;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(byte[] bArr) {
        int i = this.m;
        e(((((bArr.length - 1) / 3) + 1) << 2) + i + 2);
        byte[] bArr2 = this.v;
        int i2 = i + 1;
        bArr2[i] = (byte) this.i;
        int length = (bArr.length / 3) * 3;
        int i3 = 0;
        int i4 = i2;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8) | (bArr[i7] & 255);
            bArr2[i4] = (byte) JSONFactory.o[(i8 >>> 18) & 63];
            bArr2[i4 + 1] = (byte) JSONFactory.o[(i8 >>> 12) & 63];
            bArr2[i4 + 2] = (byte) JSONFactory.o[(i8 >>> 6) & 63];
            bArr2[i4 + 3] = (byte) JSONFactory.o[i8 & 63];
            i4 += 4;
            i5 = i7 + 1;
        }
        int length2 = bArr.length - length;
        if (length2 > 0) {
            int i9 = (bArr[length] & 255) << 10;
            if (length2 == 2) {
                i3 = (bArr[bArr.length - 1] & 255) << 2;
            }
            int i10 = i9 | i3;
            bArr2[i4] = (byte) JSONFactory.o[i10 >> 12];
            bArr2[i4 + 1] = (byte) JSONFactory.o[(i10 >>> 6) & 63];
            bArr2[i4 + 2] = length2 == 2 ? (byte) JSONFactory.o[i10 & 63] : (byte) 61;
            bArr2[i4 + 3] = 61;
            i4 += 4;
        }
        bArr2[i4] = (byte) this.i;
        this.m = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(char[] cArr, int i, int i2) {
        if (cArr == null) {
            if (b(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                d("");
                return;
            } else {
                n();
                return;
            }
        }
        int i3 = i + i2;
        boolean z = (this.b.k & JSONWriter.Feature.BrowserSecure.mask) != 0;
        boolean z2 = (this.b.k & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i4 = this.m;
        int i5 = i2 * 3;
        int i6 = i4 + i5 + 2;
        if (z2 || z) {
            i6 += i5;
        }
        if (i6 >= this.v.length) {
            e(i6);
        }
        byte[] bArr = this.v;
        int i7 = i4 + 1;
        bArr[i4] = (byte) this.i;
        int i8 = i;
        while (i8 < i3) {
            char c = cArr[i8];
            if (c == this.i || c == '\\' || c < ' ' || c > 127 || (z && (c == '<' || c == '>' || c == '(' || c == ')'))) {
                break;
            }
            bArr[i7] = (byte) c;
            i8++;
            i7++;
        }
        this.m = i7;
        int i9 = i7 + ((i3 - i8) * 6) + 2;
        if (i9 >= this.v.length) {
            e(i9);
        }
        if (i8 < i3) {
            a(cArr, i3, z, z2, i8);
        }
        byte[] bArr2 = this.v;
        int i10 = this.m;
        this.m = i10 + 1;
        bArr2[i10] = (byte) this.i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(char c) {
        if (c > 128) {
            throw new JSONException("not support " + c);
        }
        if (this.m == this.v.length) {
            e(this.m + 1);
        }
        byte[] bArr = this.v;
        int i = this.m;
        this.m = i + 1;
        bArr[i] = (byte) c;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(byte[] bArr) {
        if (bArr == null) {
            n();
            return;
        }
        int i = this.m;
        e((bArr.length << 1) + 3 + i + 2);
        byte[] bArr2 = this.v;
        bArr2[i] = 120;
        bArr2[i + 1] = 39;
        int i2 = i + 2;
        for (byte b : bArr) {
            int i3 = b & 255;
            int i4 = i3 >> 4;
            int i5 = i3 & 15;
            int i6 = 48;
            bArr2[i2] = (byte) (i4 + (i4 < 10 ? 48 : 55));
            int i7 = i2 + 1;
            if (i5 >= 10) {
                i6 = 55;
            }
            bArr2[i7] = (byte) (i5 + i6);
            i2 += 2;
        }
        bArr2[i2] = 39;
        this.m = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.v;
        if (bArr.length > 1048576) {
            return;
        }
        JSONFactory.v.lazySet(this.u, bArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(int i) {
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int i3 = i2 + 13;
        if (i3 >= this.v.length) {
            e(i3);
        }
        byte[] bArr = this.v;
        if (z) {
            bArr[i2] = (byte) this.i;
            i2++;
        }
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i2, i);
        if (z) {
            bArr[a2] = (byte) this.i;
            a2++;
        }
        this.m = a2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(String str) {
        char c;
        if (str == null) {
            o();
            return;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        boolean z = (this.b.k & JSONWriter.Feature.BrowserSecure.mask) != 0;
        boolean z2 = (this.b.k & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        int i2 = this.m;
        int length = (charArray.length * 3) + i2 + 2;
        if (z2 || z) {
            length += charArray.length * 3;
        }
        if (length >= this.v.length) {
            e(length);
        }
        byte[] bArr = this.v;
        int i3 = i2 + 1;
        bArr[i2] = (byte) this.i;
        while (i < charArray.length && (c = charArray[i]) != this.i && c != '\\' && c >= ' ' && c <= 127 && (!z || (c != '<' && c != '>' && c != '(' && c != ')'))) {
            bArr[i3] = (byte) c;
            i++;
            i3++;
        }
        if (i == charArray.length) {
            bArr[i3] = (byte) this.i;
            this.m = i3 + 1;
            return;
        }
        this.m = i3;
        if (i < charArray.length) {
            a(charArray, charArray.length, z, z2, i);
        }
        byte[] bArr2 = this.v;
        int i4 = this.m;
        this.m = i4 + 1;
        bArr2[i4] = (byte) this.i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(byte[] bArr) {
        int length = this.m + bArr.length;
        if (length >= this.v.length) {
            e(length);
        }
        System.arraycopy(bArr, 0, this.v, this.m, bArr.length);
        this.m += bArr.length;
    }

    final void e(int i) {
        byte[] bArr = this.v;
        if (i >= bArr.length) {
            int length = bArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - this.j > 0) {
                throw new OutOfMemoryError();
            }
            this.v = Arrays.copyOf(this.v, i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(long j) {
        int i;
        long j2 = this.b.k;
        boolean z = ((JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask) & j2) != 0 || ((JSONWriter.Feature.BrowserCompatible.mask & j2) != 0 && (j > 9007199254740991L || j < -9007199254740991L));
        int i2 = this.m;
        int i3 = i2 + 23;
        if (i3 >= this.v.length) {
            e(i3);
        }
        byte[] bArr = this.v;
        if (z) {
            bArr[i2] = (byte) this.i;
            i2++;
        }
        int a2 = com.alibaba.fastjson2.util.d.a(bArr, i2, j);
        if (z) {
            i = a2 + 1;
            bArr[a2] = (byte) this.i;
        } else if ((JSONWriter.Feature.WriteClassName.mask & j2) == 0 || (j2 & JSONWriter.Feature.NotWriteNumberClassName.mask) != 0 || j < -2147483648L || j > 2147483647L) {
            i = a2;
        } else {
            i = a2 + 1;
            bArr[a2] = 76;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(byte[] bArr) {
        int i;
        int i2 = this.m;
        int length = bArr.length + i2 + 2 + this.s;
        if (length >= this.v.length) {
            e(length);
        }
        if (this.k) {
            this.k = false;
            i = i2;
        } else {
            byte[] bArr2 = this.v;
            i = i2 + 1;
            bArr2[i2] = gbx.OP_IS_NOT;
            if (this.r) {
                bArr2[i] = 10;
                i++;
                int i3 = 0;
                while (i3 < this.s) {
                    bArr2[i] = 9;
                    i3++;
                    i++;
                }
            }
        }
        System.arraycopy(bArr, 0, this.v, i, bArr.length);
        this.m = i + bArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f(String str) {
        this.q = str;
        d(t);
        d(str);
        int i = this.m;
        if (i == this.v.length) {
            e(i + 1);
        }
        this.v[i] = 125;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void h() {
        this.l++;
        this.k = true;
        int i = this.m;
        int i2 = (this.r ? this.s + 3 : 1) + i;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        int i3 = i + 1;
        bArr[i] = 123;
        if (this.r) {
            this.s++;
            int i4 = i3 + 1;
            bArr[i3] = 10;
            int i5 = 0;
            while (true) {
                i3 = i4;
                if (i5 >= this.s) {
                    break;
                }
                i4 = i3 + 1;
                bArr[i3] = 9;
                i5++;
            }
        }
        this.m = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void i() {
        this.l--;
        int i = this.m;
        int i2 = (this.r ? this.s + 3 : 1) + i;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        if (this.r) {
            this.s--;
            int i3 = i + 1;
            bArr[i] = 10;
            int i4 = 0;
            while (i4 < this.s) {
                bArr[i3] = 9;
                i4++;
                i3++;
            }
            i = i3;
        }
        bArr[i] = 125;
        this.m = i + 1;
        this.k = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void j() {
        this.l++;
        int i = this.m;
        int i2 = (this.r ? this.s + 3 : 1) + i;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        int i3 = i + 1;
        bArr[i] = 91;
        if (this.r) {
            this.s++;
            int i4 = i3 + 1;
            bArr[i3] = 10;
            int i5 = 0;
            while (true) {
                i3 = i4;
                if (i5 >= this.s) {
                    break;
                }
                i4 = i3 + 1;
                bArr[i3] = 9;
                i5++;
            }
        }
        this.m = i3;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void k() {
        this.l--;
        int i = this.m;
        int i2 = (this.r ? this.s + 3 : 1) + i;
        if (i2 >= this.v.length) {
            e(i2);
        }
        byte[] bArr = this.v;
        if (this.r) {
            this.s--;
            int i3 = i + 1;
            bArr[i] = 10;
            int i4 = 0;
            while (i4 < this.s) {
                bArr[i3] = 9;
                i4++;
                i3++;
            }
            i = i3;
        }
        bArr[i] = 93;
        this.m = i + 1;
        this.k = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l() {
        int i = 0;
        this.k = false;
        int i2 = this.m;
        int i3 = (this.r ? this.s + 3 : 1) + i2;
        if (i3 >= this.v.length) {
            e(i3);
        }
        byte[] bArr = this.v;
        int i4 = i2 + 1;
        bArr[i2] = gbx.OP_IS_NOT;
        if (this.r) {
            int i5 = i4 + 1;
            bArr[i4] = 10;
            while (true) {
                i4 = i5;
                if (i >= this.s) {
                    break;
                }
                i5 = i4 + 1;
                bArr[i4] = 9;
                i++;
            }
        }
        this.m = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m() {
        int i = this.m;
        if (i == this.v.length) {
            e(i + 1);
        }
        this.v[i] = 58;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] s() {
        return Arrays.copyOf(this.v, this.m);
    }

    public String toString() {
        return new String(this.v, 0, this.m, StandardCharsets.UTF_8);
    }
}
