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
import tb.kge;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q extends JSONWriter {
    static final char[] t;
    protected char[] u;
    final JSONFactory.CacheItem v;

    static {
        kge.a(2028343983);
        t = "{\"$ref\":".toCharArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(JSONWriter.a aVar) {
        super(aVar, null, false, StandardCharsets.UTF_16);
        this.v = JSONFactory.t[System.identityHashCode(Thread.currentThread()) & (JSONFactory.t.length - 1)];
        char[] andSet = JSONFactory.u.getAndSet(this.v, null);
        this.u = andSet == null ? new char[8192] : andSet;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    protected final void a(char c) {
        int i = this.m;
        if (i == this.u.length) {
            e(i + 1);
        }
        this.u[i] = c;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(double d) {
        int i;
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int i3 = i2 + 24;
        if (z) {
            i3 += 2;
        }
        if (i3 >= this.u.length) {
            e(i3);
        }
        char[] cArr = this.u;
        if (z) {
            cArr[i2] = '\"';
            i2++;
        }
        int a2 = i2 + com.alibaba.fastjson2.util.a.a(d, cArr, i2, true);
        if (z) {
            i = a2 + 1;
            cArr[a2] = '\"';
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
        int i3 = i2 + 15;
        if (z) {
            i3 += 2;
        }
        e(i3);
        char[] cArr = this.u;
        if (z) {
            cArr[i2] = '\"';
            i2++;
        }
        int a2 = i2 + com.alibaba.fastjson2.util.a.a(f, cArr, i2, true);
        if (z) {
            i = a2 + 1;
            cArr[a2] = '\"';
        } else {
            i = a2;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3) {
        int i4 = this.m;
        int i5 = i4 + 10;
        if (i5 >= this.u.length) {
            e(i5);
        }
        char[] cArr = this.u;
        cArr[i4] = this.i;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i6 = i / 1000;
        int i7 = com.alibaba.fastjson2.util.d.DIGITS_K[i - (i6 * 1000)];
        cArr[i4 + 1] = (char) ((byte) (i6 + 48));
        cArr[i4 + 2] = (char) ((byte) (i7 >> 16));
        cArr[i4 + 3] = (char) ((byte) (i7 >> 8));
        cArr[i4 + 4] = (char) ((byte) i7);
        int i8 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        cArr[i4 + 5] = (char) ((byte) (i8 >> 8));
        cArr[i4 + 6] = (char) ((byte) i8);
        int i9 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        cArr[i4 + 7] = (char) ((byte) (i9 >> 8));
        cArr[i4 + 8] = (char) ((byte) i9);
        cArr[i4 + 9] = this.i;
        this.m = i5;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.m;
        int i8 = i7 + 16;
        if (i8 >= this.u.length) {
            e(i8);
        }
        char[] cArr = this.u;
        cArr[i7] = this.i;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i9 = i / 1000;
        int i10 = com.alibaba.fastjson2.util.d.DIGITS_K[i - (i9 * 1000)];
        cArr[i7 + 1] = (char) ((byte) (i9 + 48));
        cArr[i7 + 2] = (char) ((byte) (i10 >> 16));
        cArr[i7 + 3] = (char) ((byte) (i10 >> 8));
        cArr[i7 + 4] = (char) ((byte) i10);
        int i11 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        cArr[i7 + 5] = (char) ((byte) (i11 >> 8));
        cArr[i7 + 6] = (char) ((byte) i11);
        int i12 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        cArr[i7 + 7] = (char) ((byte) (i12 >> 8));
        cArr[i7 + 8] = (char) ((byte) i12);
        int i13 = com.alibaba.fastjson2.util.d.DIGITS_K[i4];
        cArr[i7 + 9] = (char) ((byte) (i13 >> 8));
        cArr[i7 + 10] = (char) ((byte) i13);
        int i14 = com.alibaba.fastjson2.util.d.DIGITS_K[i5];
        cArr[i7 + 11] = (char) ((byte) (i14 >> 8));
        cArr[i7 + 12] = (char) ((byte) i14);
        int i15 = com.alibaba.fastjson2.util.d.DIGITS_K[i6];
        cArr[i7 + 13] = (char) ((byte) (i15 >> 8));
        cArr[i7 + 14] = (char) ((byte) i15);
        cArr[i7 + 15] = this.i;
        this.m = i8;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = z ? i8 == 0 ? 1 : 6 : 0;
        int i10 = this.m;
        int i11 = i10 + 25 + i9;
        if (i10 + i11 >= this.u.length) {
            e(i11);
        }
        char[] cArr = this.u;
        cArr[i10] = this.i;
        int b = com.alibaba.fastjson2.util.d.b(cArr, i10 + 1, i);
        char c = '-';
        cArr[b] = '-';
        int i12 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        cArr[b + 1] = (char) ((byte) (i12 >> 8));
        cArr[b + 2] = (char) ((byte) i12);
        cArr[b + 3] = '-';
        int i13 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        cArr[b + 4] = (char) ((byte) (i13 >> 8));
        cArr[b + 5] = (char) ((byte) i13);
        cArr[b + 6] = (char) ((byte) (z ? 84 : 32));
        int i14 = com.alibaba.fastjson2.util.d.DIGITS_K[i4];
        cArr[b + 7] = (char) ((byte) (i14 >> 8));
        cArr[b + 8] = (char) ((byte) i14);
        cArr[b + 9] = riy.CONDITION_IF_MIDDLE;
        int i15 = com.alibaba.fastjson2.util.d.DIGITS_K[i5];
        cArr[b + 10] = (char) ((byte) (i15 >> 8));
        cArr[b + 11] = (char) ((byte) i15);
        cArr[b + 12] = riy.CONDITION_IF_MIDDLE;
        int i16 = com.alibaba.fastjson2.util.d.DIGITS_K[i6];
        cArr[b + 13] = (char) ((byte) (i16 >> 8));
        cArr[b + 14] = (char) ((byte) i16);
        int i17 = b + 15;
        if (i7 > 0) {
            int i18 = i17 + 1;
            cArr[i17] = '.';
            int i19 = i7 / 10;
            int i20 = i19 / 10;
            if (i7 - (i19 * 10) != 0) {
                int i21 = com.alibaba.fastjson2.util.d.DIGITS_K[i7];
                cArr[i18] = (char) ((byte) (i21 >> 16));
                cArr[i18 + 1] = (char) ((byte) (i21 >> 8));
                cArr[i18 + 2] = (char) ((byte) i21);
                i17 = i18 + 3;
            } else if (i19 - (i20 * 10) != 0) {
                int i22 = com.alibaba.fastjson2.util.d.DIGITS_K[i19];
                cArr[i18] = (char) ((byte) (i22 >> 8));
                cArr[i18 + 1] = (char) ((byte) i22);
                i17 = i18 + 2;
            } else {
                i17 = i18 + 1;
                cArr[i18] = (char) ((byte) (i20 + 48));
            }
        }
        if (z) {
            int i23 = i8 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
            if (i8 == 0) {
                cArr[i17] = 'Z';
                i17++;
            } else {
                int abs = Math.abs(i23);
                if (i23 >= 0) {
                    c = '+';
                }
                cArr[i17] = c;
                int i24 = com.alibaba.fastjson2.util.d.DIGITS_K[abs];
                cArr[i17 + 1] = (char) ((byte) (i24 >> 8));
                cArr[i17 + 2] = (char) ((byte) i24);
                cArr[i17 + 3] = riy.CONDITION_IF_MIDDLE;
                int i25 = (i8 - (i23 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
                if (i25 < 0) {
                    i25 = -i25;
                }
                int i26 = com.alibaba.fastjson2.util.d.DIGITS_K[i25];
                cArr[i17 + 4] = (char) ((byte) (i26 >> 8));
                cArr[i17 + 5] = (char) ((byte) i26);
                i17 += 6;
            }
        }
        cArr[i17] = this.i;
        this.m = i17 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            n();
        } else if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & this.b.k) != 0) {
            this.b.a(jSONObject.getClass()).a(this, jSONObject, null, null, 0L);
        } else {
            if (this.m == this.u.length) {
                e(this.m + 1);
            }
            char[] cArr = this.u;
            int i = this.m;
            this.m = i + 1;
            cArr[i] = '{';
            boolean z = true;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value != null || (this.b.k & JSONWriter.Feature.WriteMapNullValue.mask) != 0) {
                    if (!z) {
                        if (this.m == this.u.length) {
                            e(this.m + 1);
                        }
                        char[] cArr2 = this.u;
                        int i2 = this.m;
                        this.m = i2 + 1;
                        cArr2[i2] = ',';
                    }
                    z = false;
                    String key = entry.getKey();
                    if (key instanceof String) {
                        d(key);
                    } else {
                        f((Object) key);
                    }
                    if (this.m == this.u.length) {
                        e(this.m + 1);
                    }
                    char[] cArr3 = this.u;
                    int i3 = this.m;
                    this.m = i3 + 1;
                    cArr3[i3] = riy.CONDITION_IF_MIDDLE;
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
            if (this.m == this.u.length) {
                e(this.m + 1);
            }
            char[] cArr4 = this.u;
            int i4 = this.m;
            this.m = i4 + 1;
            cArr4[i4] = '}';
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(com.alibaba.fastjson2.time.c cVar) {
        int i = this.m;
        int i2 = i + 38;
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        int i3 = i + 1;
        cArr[i] = this.i;
        com.alibaba.fastjson2.time.b bVar = cVar.f3021a;
        int a2 = com.alibaba.fastjson2.util.d.a(cArr, i3, bVar.f3020a, bVar.b, bVar.c);
        cArr[a2] = ' ';
        int a3 = com.alibaba.fastjson2.util.d.a(cArr, a2 + 1, cVar.b);
        cArr[a3] = this.i;
        this.m = a3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(String str) {
        e(this.m + str.length());
        str.getChars(0, str.length(), this.u, this.m);
        this.m += str.length();
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
            if (scale >= this.u.length) {
                e(scale);
            }
            char[] cArr = this.u;
            if (z2) {
                cArr[i2] = '\"';
                i2++;
            }
            if ((j2 & JSONWriter.Feature.WriteBigDecimalAsPlain.mask) == 0) {
                z = false;
            }
            String plainString = z ? bigDecimal.toPlainString() : bigDecimal.toString();
            plainString.getChars(0, plainString.length(), cArr, i2);
            int length = i2 + plainString.length();
            if (z2) {
                i = length + 1;
                cArr[length] = '\"';
            } else {
                i = length;
            }
            this.m = i;
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(BigInteger bigInteger, long j) {
        int i;
        if (bigInteger == null) {
            q();
            return;
        }
        String bigInteger2 = bigInteger.toString(10);
        long j2 = j | this.b.k;
        boolean z = true;
        boolean z2 = (JSONWriter.Feature.BrowserCompatible.mask & j2) != 0 && (bigInteger.compareTo(JSONFactory.m) < 0 || bigInteger.compareTo(JSONFactory.n) > 0);
        boolean z3 = (j2 & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        if (!z2 && !z3) {
            z = false;
        }
        int length = bigInteger2.length();
        e(this.m + length + 2);
        char[] cArr = this.u;
        int i2 = this.m;
        if (z) {
            int i3 = i2 + 1;
            cArr[i2] = '\"';
            bigInteger2.getChars(0, length, cArr, i3);
            int i4 = i3 + length;
            i = i4 + 1;
            cArr[i4] = '\"';
        } else {
            bigInteger2.getChars(0, length, cArr, i2);
            i = length + i2;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(List<String> list) {
        if (this.m == this.u.length) {
            e(this.m + 1);
        }
        char[] cArr = this.u;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = '[';
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                if (this.m == this.u.length) {
                    e(this.m + 1);
                }
                char[] cArr2 = this.u;
                int i3 = this.m;
                this.m = i3 + 1;
                cArr2[i3] = ',';
            }
            d(list.get(i2));
        }
        if (this.m == this.u.length) {
            e(this.m + 1);
        }
        char[] cArr3 = this.u;
        int i4 = this.m;
        this.m = i4 + 1;
        cArr3[i4] = ']';
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
        if (i >= this.u.length) {
            e(i);
        }
        char[] cArr = JSONFactory.z;
        char[] cArr2 = this.u;
        int i2 = this.m;
        cArr2[i2] = '\"';
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
        cArr2[i2 + 1] = (char) ((byte) (c >> '\b'));
        cArr2[i2 + 2] = (char) ((byte) c);
        cArr2[i2 + 3] = (char) ((byte) (c2 >> '\b'));
        cArr2[i2 + 4] = (char) ((byte) c2);
        cArr2[i2 + 5] = (char) ((byte) (c3 >> '\b'));
        cArr2[i2 + 6] = (char) ((byte) c3);
        cArr2[i2 + 7] = (char) ((byte) (c4 >> '\b'));
        cArr2[i2 + 8] = (char) ((byte) c4);
        cArr2[i2 + 9] = '-';
        cArr2[i2 + 10] = (char) ((byte) (c5 >> '\b'));
        cArr2[i2 + 11] = (char) ((byte) c5);
        cArr2[i2 + 12] = (char) ((byte) (c6 >> '\b'));
        cArr2[i2 + 13] = (char) ((byte) c6);
        cArr2[i2 + 14] = '-';
        cArr2[i2 + 15] = (char) ((byte) (c7 >> '\b'));
        cArr2[i2 + 16] = (char) ((byte) c7);
        cArr2[i2 + 17] = (char) ((byte) (c8 >> '\b'));
        cArr2[i2 + 18] = (char) ((byte) c8);
        cArr2[i2 + 19] = '-';
        cArr2[i2 + 20] = (char) ((byte) (c9 >> '\b'));
        cArr2[i2 + 21] = (char) ((byte) c9);
        cArr2[i2 + 22] = (char) ((byte) (c10 >> '\b'));
        cArr2[i2 + 23] = (char) ((byte) c10);
        cArr2[i2 + 24] = '-';
        cArr2[i2 + 25] = (char) ((byte) (c11 >> '\b'));
        cArr2[i2 + 26] = (char) ((byte) c11);
        cArr2[i2 + 27] = (char) ((byte) (c12 >> '\b'));
        cArr2[i2 + 28] = (char) ((byte) c12);
        cArr2[i2 + 29] = (char) ((byte) (c13 >> '\b'));
        cArr2[i2 + 30] = (char) ((byte) c13);
        cArr2[i2 + 31] = (char) ((byte) (c14 >> '\b'));
        cArr2[i2 + 32] = (char) ((byte) c14);
        cArr2[i2 + 33] = (char) ((byte) (c15 >> '\b'));
        cArr2[i2 + 34] = (char) ((byte) c15);
        cArr2[i2 + 35] = (char) ((byte) (c16 >> '\b'));
        cArr2[i2 + 36] = (char) ((byte) c16);
        cArr2[i2 + 37] = '\"';
        this.m += 38;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(short s) {
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i = this.m;
        int i2 = i + 7;
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        if (z) {
            cArr[i] = this.i;
            i++;
        }
        int b = com.alibaba.fastjson2.util.d.b(cArr, i, s);
        if (z) {
            cArr[b] = this.i;
            b++;
        }
        this.m = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(char[] cArr) {
        int i;
        int i2 = this.m;
        int length = cArr.length + i2 + 2 + this.s;
        if (length >= this.u.length) {
            e(length);
        }
        if (this.k) {
            this.k = false;
            i = i2;
        } else {
            char[] cArr2 = this.u;
            i = i2 + 1;
            cArr2[i2] = ',';
            if (this.r) {
                cArr2[i] = '\n';
                i++;
                int i3 = 0;
                while (i3 < this.s) {
                    cArr2[i] = '\t';
                    i3++;
                    i++;
                }
            }
        }
        System.arraycopy(cArr, 0, this.u, i, cArr.length);
        this.m = i + cArr.length;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(char[] cArr, int i, int i2) {
        int i3 = this.m + i2;
        if (i3 >= this.u.length) {
            e(i3);
        }
        System.arraycopy(cArr, i, this.u, this.m, i2);
        this.m += i2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void a(char[] cArr, int i, int i2, boolean z) {
        int i3;
        int i4;
        boolean z2 = (this.b.k & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        char c = this.i;
        int i5 = this.m;
        int i6 = (z ? i5 + 2 : i5) + (z2 ? i2 * 6 : i2 << 1);
        if (i6 - this.u.length > 0) {
            e(i6);
        }
        char[] cArr2 = this.u;
        if (z) {
            cArr2[i5] = c;
            i5++;
        }
        while (i < i2) {
            char c2 = cArr[i];
            if (c2 == '\"' || c2 == '\'') {
                if (c2 == c) {
                    cArr2[i5] = '\\';
                    i5++;
                }
                i4 = i5 + 1;
                cArr2[i5] = c2;
            } else {
                if (c2 != '\\') {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'u';
                            cArr2[i5 + 2] = '0';
                            cArr2[i5 + 3] = '0';
                            cArr2[i5 + 4] = '0';
                            cArr2[i5 + 5] = (char) (c2 + '0');
                            i5 += 6;
                            break;
                        case '\b':
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'b';
                            break;
                        case '\t':
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 't';
                            break;
                        case '\n':
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'n';
                            break;
                        case 11:
                        case 14:
                        case 15:
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'u';
                            cArr2[i5 + 2] = '0';
                            cArr2[i5 + 3] = '0';
                            cArr2[i5 + 4] = '0';
                            cArr2[i5 + 5] = (char) ((c2 - '\n') + 97);
                            i5 += 6;
                            break;
                        case '\f':
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'f';
                            break;
                        case '\r':
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'r';
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
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'u';
                            cArr2[i5 + 2] = '0';
                            cArr2[i5 + 3] = '0';
                            cArr2[i5 + 4] = '1';
                            cArr2[i5 + 5] = (char) ((c2 - 16) + 48);
                            i5 += 6;
                            break;
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            cArr2[i5] = '\\';
                            cArr2[i5 + 1] = 'u';
                            cArr2[i5 + 2] = '0';
                            cArr2[i5 + 3] = '0';
                            cArr2[i5 + 4] = '1';
                            cArr2[i5 + 5] = (char) ((c2 - 26) + 97);
                            i5 += 6;
                            break;
                        default:
                            if (z2 && c2 > 127) {
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = 'u';
                                cArr2[i5 + 2] = f2939a[(c2 >>> '\f') & 15];
                                cArr2[i5 + 3] = f2939a[(c2 >>> '\b') & 15];
                                cArr2[i5 + 4] = f2939a[(c2 >>> 4) & 15];
                                cArr2[i5 + 5] = f2939a[c2 & 15];
                                i5 += 6;
                                break;
                            } else {
                                i4 = i5 + 1;
                                cArr2[i5] = c2;
                                break;
                            }
                            break;
                    }
                    i++;
                } else {
                    cArr2[i5] = '\\';
                    cArr2[i5 + 1] = c2;
                }
                i5 += 2;
                i++;
            }
            i5 = i4;
            i++;
        }
        if (z) {
            i3 = i5 + 1;
            cArr2[i5] = c;
        } else {
            i3 = i5;
        }
        this.m = i3;
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
        if (length >= this.u.length) {
            e(length);
        }
        char[] cArr = this.u;
        int i3 = i2 + 1;
        cArr[i2] = '[';
        for (int i4 = 0; i4 < dArr.length; i4++) {
            if (i4 != 0) {
                i = i3 + 1;
                cArr[i3] = ',';
            } else {
                i = i3;
            }
            if (z) {
                cArr[i] = '\"';
                i++;
            }
            int a2 = i + com.alibaba.fastjson2.util.a.a(dArr[i4], cArr, i, true);
            if (z) {
                cArr[a2] = '\"';
                i3 = a2 + 1;
            } else {
                i3 = a2;
            }
        }
        cArr[i3] = ']';
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
        if (length >= this.u.length) {
            e(length);
        }
        char[] cArr = this.u;
        int i3 = i2 + 1;
        cArr[i2] = '[';
        for (int i4 = 0; i4 < fArr.length; i4++) {
            if (i4 != 0) {
                i = i3 + 1;
                cArr[i3] = ',';
            } else {
                i = i3;
            }
            if (z) {
                cArr[i] = '\"';
                i++;
            }
            int a2 = i + com.alibaba.fastjson2.util.a.a(fArr[i4], cArr, i, true);
            if (z) {
                cArr[a2] = '\"';
                i3 = a2 + 1;
            } else {
                i3 = a2;
            }
        }
        cArr[i3] = ']';
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
        if (length >= this.u.length) {
            e(length);
        }
        char[] cArr = this.u;
        int i3 = i2 + 1;
        cArr[i2] = '[';
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i4 != 0) {
                i = i3 + 1;
                cArr[i3] = ',';
            } else {
                i = i3;
            }
            if (z) {
                cArr[i] = this.i;
                i++;
            }
            int b = com.alibaba.fastjson2.util.d.b(cArr, i, iArr[i4]);
            if (z) {
                i3 = b + 1;
                cArr[b] = this.i;
            } else {
                i3 = b;
            }
        }
        cArr[i3] = ']';
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
        if (length >= this.u.length) {
            e(length);
        }
        char[] cArr = this.u;
        int i2 = i + 1;
        cArr[i] = '[';
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if (i3 != 0) {
                cArr[i2] = ',';
                i2++;
            }
            long j2 = jArr[i3];
            boolean z3 = z2 || (z && j2 <= 9007199254740991L && j2 >= -9007199254740991L);
            if (z3) {
                cArr[i2] = this.i;
                i2++;
            }
            i2 = com.alibaba.fastjson2.util.d.a(cArr, i2, j2);
            if (z3) {
                cArr[i2] = this.i;
                i2++;
            }
        }
        cArr[i2] = ']';
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
        int i2 = i + 7;
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        if (z) {
            cArr[i] = this.i;
            i++;
        }
        int b2 = com.alibaba.fastjson2.util.d.b(cArr, i, b);
        if (z) {
            cArr[b2] = this.i;
            b2++;
        }
        this.m = b2;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(char c) {
        int i;
        int i2;
        int i3 = this.m;
        int i4 = i3 + 8;
        if (i4 >= this.u.length) {
            e(i4);
        }
        char[] cArr = this.u;
        int i5 = i3 + 1;
        cArr[i3] = this.i;
        if (c == '\"' || c == '\'') {
            if (c == this.i) {
                i = i5 + 1;
                cArr[i5] = '\\';
            } else {
                i = i5;
            }
            cArr[i] = c;
            i2 = i + 1;
        } else {
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
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'u';
                        cArr[i5 + 2] = '0';
                        cArr[i5 + 3] = '0';
                        cArr[i5 + 4] = '0';
                        cArr[i5 + 5] = (char) (c + '0');
                        i2 = i5 + 6;
                        break;
                    case '\b':
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'b';
                        break;
                    case '\t':
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 't';
                        break;
                    case '\n':
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'n';
                        break;
                    case 11:
                    case 14:
                    case 15:
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'u';
                        cArr[i5 + 2] = '0';
                        cArr[i5 + 3] = '0';
                        cArr[i5 + 4] = '0';
                        cArr[i5 + 5] = (char) ((c - '\n') + 97);
                        i2 = i5 + 6;
                        break;
                    case '\f':
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'f';
                        break;
                    case '\r':
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'r';
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
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'u';
                        cArr[i5 + 2] = '0';
                        cArr[i5 + 3] = '0';
                        cArr[i5 + 4] = '1';
                        cArr[i5 + 5] = (char) ((c - 16) + 48);
                        i2 = i5 + 6;
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        cArr[i5] = '\\';
                        cArr[i5 + 1] = 'u';
                        cArr[i5 + 2] = '0';
                        cArr[i5 + 3] = '0';
                        cArr[i5 + 4] = '1';
                        cArr[i5 + 5] = (char) ((c - 26) + 97);
                        i2 = i5 + 6;
                        break;
                    default:
                        i2 = i5 + 1;
                        cArr[i5] = c;
                        break;
                }
            } else {
                cArr[i5] = '\\';
                cArr[i5 + 1] = c;
            }
            i2 = i5 + 2;
        }
        cArr[i2] = this.i;
        this.m = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(int i, int i2, int i3) {
        int i4 = this.m;
        int i5 = i4 + 13;
        if (i5 >= this.u.length) {
            e(i5);
        }
        char[] cArr = this.u;
        cArr[i4] = this.i;
        int a2 = com.alibaba.fastjson2.util.d.a(cArr, i4 + 1, i, i2, i3);
        cArr[a2] = this.i;
        this.m = a2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(int i, int i2, int i3, int i4, int i5, int i6) {
        e(this.m + 21);
        char[] cArr = this.u;
        int i7 = this.m;
        cArr[i7] = this.i;
        if (i < 0 || i > 9999) {
            throw new IllegalArgumentException("Only 4 digits numbers are supported. Provided: " + i);
        }
        int i8 = i / 1000;
        int i9 = com.alibaba.fastjson2.util.d.DIGITS_K[i - (i8 * 1000)];
        cArr[i7 + 1] = (char) ((byte) (i8 + 48));
        cArr[i7 + 2] = (char) ((byte) (i9 >> 16));
        cArr[i7 + 3] = (char) ((byte) (i9 >> 8));
        cArr[i7 + 4] = (char) ((byte) i9);
        cArr[i7 + 5] = '-';
        int i10 = com.alibaba.fastjson2.util.d.DIGITS_K[i2];
        cArr[i7 + 6] = (char) ((byte) (i10 >> 8));
        cArr[i7 + 7] = (char) ((byte) i10);
        cArr[i7 + 8] = '-';
        int i11 = com.alibaba.fastjson2.util.d.DIGITS_K[i3];
        cArr[i7 + 9] = (char) ((byte) (i11 >> 8));
        cArr[i7 + 10] = (char) ((byte) i11);
        cArr[i7 + 11] = ' ';
        int i12 = com.alibaba.fastjson2.util.d.DIGITS_K[i4];
        cArr[i7 + 12] = (char) ((byte) (i12 >> 8));
        cArr[i7 + 13] = (char) ((byte) i12);
        cArr[i7 + 14] = riy.CONDITION_IF_MIDDLE;
        int i13 = com.alibaba.fastjson2.util.d.DIGITS_K[i5];
        cArr[i7 + 15] = (char) ((byte) (i13 >> 8));
        cArr[i7 + 16] = (char) ((byte) i13);
        cArr[i7 + 17] = riy.CONDITION_IF_MIDDLE;
        int i14 = com.alibaba.fastjson2.util.d.DIGITS_K[i6];
        cArr[i7 + 18] = (char) ((byte) (i14 >> 8));
        cArr[i7 + 19] = (char) ((byte) i14);
        cArr[i7 + 20] = (char) ((byte) this.i);
        this.m = i7 + 21;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(List list) {
        if (list == null) {
            p();
        } else if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & this.b.k) != 0) {
            this.b.a(list.getClass()).a(this, list, null, null, 0L);
        } else {
            if (this.m == this.u.length) {
                e(this.m + 1);
            }
            char[] cArr = this.u;
            int i = this.m;
            this.m = i + 1;
            cArr[i] = '[';
            int size = list.size();
            boolean z = true;
            int i2 = 0;
            while (i2 < size) {
                if (!z) {
                    if (this.m == this.u.length) {
                        e(this.m + 1);
                    }
                    char[] cArr2 = this.u;
                    int i3 = this.m;
                    this.m = i3 + 1;
                    cArr2[i3] = ',';
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
            if (this.m == this.u.length) {
                e(this.m + 1);
            }
            char[] cArr3 = this.u;
            int i4 = this.m;
            this.m = i4 + 1;
            cArr3[i4] = ']';
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(byte[] bArr) {
        if (bArr == null) {
            p();
            return;
        }
        int i = this.m;
        e(((((bArr.length - 1) / 3) + 1) << 2) + i + 2);
        char[] cArr = this.u;
        int i2 = i + 1;
        cArr[i] = this.i;
        int length = (bArr.length / 3) * 3;
        int i3 = 0;
        int i4 = i2;
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8) | (bArr[i7] & 255);
            cArr[i4] = JSONFactory.o[(i8 >>> 18) & 63];
            cArr[i4 + 1] = JSONFactory.o[(i8 >>> 12) & 63];
            cArr[i4 + 2] = JSONFactory.o[(i8 >>> 6) & 63];
            cArr[i4 + 3] = JSONFactory.o[i8 & 63];
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
            cArr[i4] = JSONFactory.o[i10 >> 12];
            cArr[i4 + 1] = JSONFactory.o[(i10 >>> 6) & 63];
            cArr[i4 + 2] = length2 == 2 ? JSONFactory.o[i10 & 63] : '=';
            cArr[i4 + 3] = '=';
            i4 += 4;
        }
        cArr[i4] = this.i;
        this.m = i4 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void b(char[] cArr, int i, int i2) {
        if (cArr == null) {
            o();
            return;
        }
        boolean z = (this.b.k & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        for (int i3 = i; i3 < i2; i3++) {
            char c = cArr[i3];
            if (c == '\\' || c == this.i || c < ' ') {
                z = true;
                break;
            }
        }
        if (z) {
            g(new String(cArr, i, i2));
            return;
        }
        int i4 = this.m + i2 + 2;
        if (i4 >= this.u.length) {
            e(i4);
        }
        char[] cArr2 = this.u;
        int i5 = this.m;
        this.m = i5 + 1;
        cArr2[i5] = this.i;
        System.arraycopy(cArr, i, this.u, this.m, i2);
        this.m += i2;
        char[] cArr3 = this.u;
        int i6 = this.m;
        this.m = i6 + 1;
        cArr3[i6] = this.i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(char c) {
        if (this.m == this.u.length) {
            e(this.m + 1);
        }
        char[] cArr = this.u;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = c;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void c(byte[] bArr) {
        if (bArr == null) {
            n();
            return;
        }
        int i = this.m;
        e((bArr.length << 1) + 3 + i + 2);
        char[] cArr = this.u;
        cArr[i] = 'x';
        cArr[i + 1] = '\'';
        int i2 = i + 2;
        for (byte b : bArr) {
            int i3 = b & 255;
            int i4 = i3 >> 4;
            int i5 = i3 & 15;
            int i6 = 48;
            cArr[i2] = (char) (i4 + (i4 < 10 ? 48 : 55));
            int i7 = i2 + 1;
            if (i5 >= 10) {
                i6 = 55;
            }
            cArr[i7] = (char) (i5 + i6);
            i2 += 2;
        }
        cArr[i2] = '\'';
        this.m = i2 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.u;
        if (cArr.length > 1048576) {
            return;
        }
        JSONFactory.u.lazySet(this.v, cArr);
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(int i) {
        boolean z = (this.b.k & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0;
        int i2 = this.m;
        int i3 = i2 + 13;
        if (i3 >= this.u.length) {
            e(i3);
        }
        char[] cArr = this.u;
        if (z) {
            cArr[i2] = this.i;
            i2++;
        }
        int b = com.alibaba.fastjson2.util.d.b(cArr, i2, i);
        if (z) {
            cArr[b] = this.i;
            b++;
        }
        this.m = b;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(String str) {
        boolean z;
        if (str == null) {
            o();
            return;
        }
        boolean z2 = (this.b.k & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        boolean z3 = (this.b.k & JSONWriter.Feature.BrowserSecure.mask) != 0;
        char c = this.i;
        int length = str.length();
        int i = this.m + length + 2;
        if (i >= this.u.length) {
            e(i);
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == c || charAt < ' ' || ((z3 && (charAt == '<' || charAt == '>' || charAt == '(' || charAt == ')')) || (z2 && charAt > 127))) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            g(str);
            return;
        }
        int i3 = this.m;
        char[] cArr = this.u;
        int i4 = i3 + 1;
        cArr[i3] = c;
        str.getChars(0, length, cArr, i4);
        int i5 = i4 + length;
        cArr[i5] = c;
        this.m = i5 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void d(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    final void e(int i) {
        char[] cArr = this.u;
        if (i - cArr.length > 0) {
            int length = cArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if (i - this.j > 0) {
                throw new OutOfMemoryError();
            }
            this.u = Arrays.copyOf(this.u, i);
        }
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(long j) {
        int i;
        long j2 = this.b.k;
        boolean z = ((JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask) & j2) != 0 || ((JSONWriter.Feature.BrowserCompatible.mask & j2) != 0 && (j > 9007199254740991L || j < -9007199254740991L));
        int i2 = this.m;
        int i3 = i2 + 23;
        if (i3 >= this.u.length) {
            e(i3);
        }
        char[] cArr = this.u;
        if (z) {
            cArr[i2] = this.i;
            i2++;
        }
        int a2 = com.alibaba.fastjson2.util.d.a(cArr, i2, j);
        if (z) {
            i = a2 + 1;
            cArr[a2] = this.i;
        } else if ((JSONWriter.Feature.WriteClassName.mask & j2) == 0 || (j2 & JSONWriter.Feature.NotWriteNumberClassName.mask) != 0 || j < -2147483648L || j > 2147483647L) {
            i = a2;
        } else {
            i = a2 + 1;
            cArr[a2] = com.taobao.tao.image.d.LEVEL_L;
        }
        this.m = i;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void e(byte[] bArr) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void f(String str) {
        this.q = str;
        char[] cArr = t;
        a(cArr, 0, cArr.length);
        d(str);
        int i = this.m;
        if (i == this.u.length) {
            e(i + 1);
        }
        this.u[i] = '}';
        this.m = i + 1;
    }

    protected final void g(String str) {
        int i;
        int length = str.length();
        char c = this.i;
        boolean z = (this.b.k & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        boolean z2 = (this.b.k & JSONWriter.Feature.BrowserSecure.mask) != 0;
        int i2 = this.m;
        e((length * 6) + i2 + 2);
        char[] cArr = this.u;
        int i3 = i2 + 1;
        cArr[i2] = c;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt != '\"') {
                if (charAt != '<' && charAt != '>') {
                    if (charAt != '\\') {
                        switch (charAt) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '0';
                                cArr[i3 + 5] = (char) (charAt + '0');
                                i3 += 6;
                            case '\b':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'b';
                                break;
                            case '\t':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 't';
                                break;
                            case '\n':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'n';
                                break;
                            case 11:
                            case 14:
                            case 15:
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '0';
                                cArr[i3 + 5] = (char) ((charAt - '\n') + 97);
                                i3 += 6;
                            case '\f':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'f';
                                break;
                            case '\r':
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'r';
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
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '1';
                                cArr[i3 + 5] = (char) ((charAt - 16) + 48);
                                i3 += 6;
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                cArr[i3] = '\\';
                                cArr[i3 + 1] = 'u';
                                cArr[i3 + 2] = '0';
                                cArr[i3 + 3] = '0';
                                cArr[i3 + 4] = '1';
                                cArr[i3 + 5] = (char) ((charAt - 26) + 97);
                                i3 += 6;
                            default:
                                switch (charAt) {
                                    case '\'':
                                        break;
                                    case '(':
                                    case ')':
                                        break;
                                    default:
                                        if (!z || charAt <= 127) {
                                            i = i3 + 1;
                                            cArr[i3] = charAt;
                                            i3 = i;
                                        } else {
                                            cArr[i3] = '\\';
                                            cArr[i3 + 1] = 'u';
                                            cArr[i3 + 2] = f2939a[(charAt >>> '\f') & 15];
                                            cArr[i3 + 3] = f2939a[(charAt >>> '\b') & 15];
                                            cArr[i3 + 4] = f2939a[(charAt >>> 4) & 15];
                                            cArr[i3 + 5] = f2939a[charAt & 15];
                                            i3 += 6;
                                        }
                                        break;
                                }
                        }
                    } else {
                        cArr[i3] = '\\';
                        cArr[i3 + 1] = charAt;
                    }
                    i3 += 2;
                }
                if (z2) {
                    cArr[i3] = '\\';
                    cArr[i3 + 1] = 'u';
                    cArr[i3 + 2] = '0';
                    cArr[i3 + 3] = '0';
                    cArr[i3 + 4] = f2939a[(charAt >>> 4) & 15];
                    cArr[i3 + 5] = f2939a[charAt & 15];
                    i3 += 6;
                } else {
                    i = i3 + 1;
                    cArr[i3] = charAt;
                    i3 = i;
                }
            }
            if (charAt == c) {
                cArr[i3] = '\\';
                i3++;
            }
            i = i3 + 1;
            cArr[i3] = charAt;
            i3 = i;
        }
        cArr[i3] = c;
        this.m = i3 + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void h() {
        this.l++;
        this.k = true;
        int i = this.m;
        int i2 = (this.r ? this.s + 3 : 1) + i;
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        int i3 = i + 1;
        cArr[i] = '{';
        if (this.r) {
            this.s++;
            int i4 = i3 + 1;
            cArr[i3] = '\n';
            int i5 = 0;
            while (true) {
                i3 = i4;
                if (i5 >= this.s) {
                    break;
                }
                i4 = i3 + 1;
                cArr[i3] = '\t';
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
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        if (this.r) {
            this.s--;
            int i3 = i + 1;
            cArr[i] = '\n';
            int i4 = 0;
            while (i4 < this.s) {
                cArr[i3] = '\t';
                i4++;
                i3++;
            }
            i = i3;
        }
        cArr[i] = '}';
        this.m = i + 1;
        this.k = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void j() {
        this.l++;
        int i = this.m;
        int i2 = (this.r ? this.s + 3 : 1) + i;
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        int i3 = i + 1;
        cArr[i] = '[';
        if (this.r) {
            this.s++;
            int i4 = i3 + 1;
            cArr[i3] = '\n';
            int i5 = 0;
            while (true) {
                i3 = i4;
                if (i5 >= this.s) {
                    break;
                }
                i4 = i3 + 1;
                cArr[i3] = '\t';
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
        if (i2 >= this.u.length) {
            e(i2);
        }
        char[] cArr = this.u;
        if (this.r) {
            this.s--;
            int i3 = i + 1;
            cArr[i] = '\n';
            int i4 = 0;
            while (i4 < this.s) {
                cArr[i3] = '\t';
                i4++;
                i3++;
            }
            i = i3;
        }
        cArr[i] = ']';
        this.m = i + 1;
        this.k = false;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void l() {
        int i = 0;
        this.k = false;
        int i2 = this.m;
        int i3 = (this.r ? this.s + 3 : 1) + i2;
        if (i3 >= this.u.length) {
            e(i3);
        }
        char[] cArr = this.u;
        int i4 = i2 + 1;
        cArr[i2] = ',';
        if (this.r) {
            int i5 = i4 + 1;
            cArr[i4] = '\n';
            while (true) {
                i4 = i5;
                if (i >= this.s) {
                    break;
                }
                i5 = i4 + 1;
                cArr[i4] = '\t';
                i++;
            }
        }
        this.m = i4;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void m() {
        int i = this.m;
        if (i == this.u.length) {
            e(i + 1);
        }
        this.u[i] = riy.CONDITION_IF_MIDDLE;
        this.m = i + 1;
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] s() {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.m) {
                z = true;
                break;
            } else if (this.u[i] >= 128) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            byte[] bArr = new byte[this.m * 3];
            return Arrays.copyOf(bArr, com.alibaba.fastjson2.util.d.a(this.u, 0, this.m, bArr, 0));
        }
        byte[] bArr2 = new byte[this.m];
        for (int i2 = 0; i2 < this.m; i2++) {
            bArr2[i2] = (byte) this.u[i2];
        }
        return bArr2;
    }

    public String toString() {
        return new String(this.u, 0, this.m);
    }
}
