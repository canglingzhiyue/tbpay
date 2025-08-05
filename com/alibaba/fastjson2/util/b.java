package com.alibaba.fastjson2.util;

import java.util.Arrays;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    static final /* synthetic */ boolean b;
    private static final int[] c;
    private static final b[] d;

    /* renamed from: a  reason: collision with root package name */
    boolean f3032a;
    private int[] e;
    private int f;
    private int g;

    static {
        kge.a(-864437177);
        b = !b.class.desiredAssertionStatus();
        c = new int[]{1, 5, 25, 125, 625, 3125, 15625, 78125, 390625, 1953125, 9765625, 48828125, 244140625, 1220703125};
        d = new b[340];
        int i = 0;
        while (true) {
            int[] iArr = c;
            if (i >= iArr.length) {
                break;
            }
            b bVar = new b(new int[]{iArr[i]}, 0);
            bVar.f3032a = true;
            d[i] = bVar;
            i++;
        }
        b bVar2 = d[i - 1];
        while (i < 340) {
            b[] bVarArr = d;
            bVar2 = bVar2.c(5);
            bVarArr[i] = bVar2;
            bVar2.f3032a = true;
            i++;
        }
    }

    public b(long j, char[] cArr, int i, int i2) {
        this.e = new int[Math.max((i2 + 8) / 9, 2)];
        int[] iArr = this.e;
        int i3 = 0;
        iArr[0] = (int) j;
        iArr[1] = (int) (j >>> 32);
        this.f = 0;
        this.g = 2;
        int i4 = i2 - 5;
        while (i < i4) {
            int i5 = i + 5;
            int i6 = cArr[i] - '0';
            i++;
            while (i < i5) {
                i6 = ((i6 * 10) + cArr[i]) - 48;
                i++;
            }
            c(100000, i6);
        }
        int i7 = 1;
        while (i < i2) {
            i3 = ((i3 * 10) + cArr[i]) - 48;
            i7 *= 10;
            i++;
        }
        if (i7 != 1) {
            c(i7, i3);
        }
        a();
    }

    private b(int[] iArr, int i) {
        this.e = iArr;
        this.f = i;
        this.g = iArr.length;
        a();
    }

    private static int a(int[] iArr, int i) {
        while (i > 0) {
            i--;
            if (iArr[i] != 0) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (r19 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r19 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        r9 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.util.b a(long r16, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.b.a(long, int, int):com.alibaba.fastjson2.util.b");
    }

    private void a() {
        int i = this.g;
        if (i > 0) {
            int i2 = i - 1;
            if (this.e[i2] != 0) {
                return;
            }
            while (i2 > 0 && this.e[i2 - 1] == 0) {
                i2--;
            }
            this.g = i2;
            if (i2 != 0) {
                return;
            }
            this.f = 0;
        }
    }

    private static void a(int[] iArr, int i, int i2, int[] iArr2) {
        long j = i2 & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = ((iArr[i3] & 4294967295L) * j) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        iArr2[i] = (int) j2;
    }

    private static void a(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4) {
        while (i > 0) {
            int i5 = iArr[i - 1];
            iArr2[i] = (i4 << i2) | (i5 >>> i3);
            i--;
            i4 = i5;
        }
        iArr2[0] = i4 << i2;
    }

    private static void a(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3) {
        int i3;
        for (int i4 = 0; i4 < i; i4++) {
            long j = iArr[i4] & 4294967295L;
            long j2 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                long j3 = j2 + (iArr3[i3] & 4294967295L) + ((iArr2[i5] & 4294967295L) * j);
                iArr3[i4 + i5] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr3[i4 + i2] = (int) j2;
        }
    }

    private static b b(int i) {
        return i < 340 ? d[i] : d(i);
    }

    private b c(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return this;
        }
        int[] iArr = new int[i2 + 1];
        a(this.e, i2, i, iArr);
        return new b(iArr, this.f);
    }

    private void c(int i, int i2) {
        int i3;
        long j = i & 4294967295L;
        int[] iArr = this.e;
        long j2 = ((iArr[0] & 4294967295L) * j) + (i2 & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j2 >>> 32;
        int i4 = 1;
        while (true) {
            i3 = this.g;
            if (i4 >= i3) {
                break;
            }
            int[] iArr2 = this.e;
            long j4 = j3 + ((iArr2[i4] & 4294967295L) * j);
            iArr2[i4] = (int) j4;
            j3 = j4 >>> 32;
            i4++;
        }
        if (j3 != 0) {
            int[] iArr3 = this.e;
            this.g = i3 + 1;
            iArr3[i3] = (int) j3;
        }
    }

    private static b d(int i) {
        if (i < 340) {
            return d[i];
        }
        int i2 = i >> 1;
        int i3 = i - i2;
        b d2 = d(i2);
        int[] iArr = c;
        if (i3 < iArr.length) {
            return d2.c(iArr[i3]);
        }
        b d3 = d(i3);
        int i4 = d2.g;
        if (i4 == 0) {
            return d2;
        }
        if (d2.f + i4 == 1) {
            return d3.c(d2.e[0]);
        }
        int i5 = d3.g;
        if (i5 == 0) {
            return d3;
        }
        if (d3.f + i5 == 1) {
            return d2.c(d3.e[0]);
        }
        int[] iArr2 = new int[i4 + i5];
        a(d2.e, i4, d3.e, i5, iArr2);
        return new b(iArr2, d2.f + d3.f);
    }

    public int a(b bVar) {
        int i = this.g;
        int i2 = this.f + i;
        int i3 = bVar.g;
        int i4 = bVar.f + i3;
        if (i2 > i4) {
            return 1;
        }
        if (i2 < i4) {
            return -1;
        }
        while (i > 0 && i3 > 0) {
            i--;
            int i5 = this.e[i];
            i3--;
            int i6 = bVar.e[i3];
            if (i5 != i6) {
                return (((long) i5) & 4294967295L) < (((long) i6) & 4294967295L) ? -1 : 1;
            }
        }
        if (i > 0) {
            return a(this.e, i);
        }
        if (i3 <= 0) {
            return 0;
        }
        return -a(bVar.e, i3);
    }

    public b a(int i) {
        int[] iArr;
        int i2;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = this.e;
        int i3 = this.g;
        int i4 = this.f;
        if (i != 0 && i3 != 0) {
            int i5 = i >> 5;
            int i6 = i & 31;
            if (this.f3032a) {
                if (i6 == 0) {
                    return new b(Arrays.copyOf(iArr4, i3), i4 + i5);
                }
                int i7 = 32 - i6;
                int i8 = i3 - 1;
                int i9 = iArr4[i8];
                int i10 = i9 >>> i7;
                if (i10 != 0) {
                    iArr3 = new int[i3 + 1];
                    iArr3[i3] = i10;
                } else {
                    iArr3 = new int[i3];
                }
                a(iArr4, i8, iArr3, i6, i7, i9);
                return new b(iArr3, i4 + i5);
            }
            if (i6 != 0) {
                int i11 = 32 - i6;
                int i12 = 0;
                if ((iArr4[0] << i6) == 0) {
                    int i13 = iArr4[0];
                    while (i12 < i3 - 1) {
                        int i14 = i12 + 1;
                        int i15 = iArr4[i14];
                        iArr4[i12] = (i13 >>> i11) | (i15 << i6);
                        i12 = i14;
                        i13 = i15;
                    }
                    int i16 = i13 >>> i11;
                    iArr4[i12] = i16;
                    if (i16 == 0) {
                        i3--;
                    }
                    i4++;
                } else {
                    int i17 = i3 - 1;
                    int i18 = iArr4[i17];
                    int i19 = i18 >>> i11;
                    if (i19 != 0) {
                        if (i3 == iArr4.length) {
                            iArr2 = new int[i3 + 1];
                            this.e = iArr2;
                        } else {
                            iArr2 = iArr4;
                        }
                        i2 = i3 + 1;
                        iArr2[i3] = i19;
                        iArr = iArr2;
                    } else {
                        iArr = iArr4;
                        i2 = i3;
                    }
                    a(iArr4, i17, iArr, i6, i11, i18);
                    i3 = i2;
                }
            }
            this.g = i3;
            this.f = i4 + i5;
        }
        return this;
    }

    public b a(int i, int i2) {
        b bVar;
        if (this.g == 0) {
            return this;
        }
        if (i != 0) {
            int i3 = i2 != 0 ? 1 : 0;
            int[] iArr = c;
            if (i < iArr.length) {
                int i4 = this.g;
                int[] iArr2 = new int[i4 + 1 + i3];
                a(this.e, i4, iArr[i], iArr2);
                bVar = new b(iArr2, this.f);
            } else {
                b b2 = b(i);
                int i5 = this.g;
                int i6 = b2.g;
                int[] iArr3 = new int[i5 + i6 + b2.f + i3];
                a(this.e, i5, b2.e, i6, iArr3);
                bVar = new b(iArr3, this.f + b2.f);
            }
        } else {
            bVar = this;
        }
        return bVar.a(i2);
    }

    public int b(int i, int i2) {
        if (i == 0) {
            int i3 = i2 >> 5;
            int i4 = i2 & 31;
            int i5 = this.g;
            int i6 = this.f + i5;
            int i7 = i3 + 1;
            if (i6 > i7) {
                return 1;
            }
            if (i6 < i7) {
                return -1;
            }
            int[] iArr = this.e;
            int i8 = iArr[i5 - 1];
            int i9 = 1 << i4;
            return i8 != i9 ? (((long) i8) & 4294967295L) < (((long) i9) & 4294967295L) ? -1 : 1 : a(iArr, i5 - 1);
        }
        return a(b(i).a(i2));
    }

    public b b(b bVar) {
        int i;
        b bVar2 = this.f3032a ? new b((int[]) this.e.clone(), this.f) : this;
        int i2 = bVar.f - bVar2.f;
        int[] iArr = bVar.e;
        int[] iArr2 = bVar2.e;
        int i3 = bVar.g;
        int i4 = bVar2.g;
        int i5 = 0;
        if (i2 < 0) {
            int i6 = i4 - i2;
            if (i6 < iArr2.length) {
                int i7 = -i2;
                System.arraycopy(iArr2, 0, iArr2, i7, i4);
                Arrays.fill(iArr2, 0, i7, 0);
            } else {
                int[] iArr3 = new int[i6];
                System.arraycopy(iArr2, 0, iArr3, -i2, i4);
                bVar2.e = iArr3;
                iArr2 = iArr3;
            }
            bVar2.f = bVar.f;
            bVar2.g = i6;
            i4 = i6;
            i2 = 0;
        }
        long j = 0;
        while (i5 < i3 && i2 < i4) {
            long j2 = ((iArr2[i2] & 4294967295L) - (iArr[i5] & 4294967295L)) + j;
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
            i5++;
            i2++;
            bVar2 = bVar2;
        }
        b bVar3 = bVar2;
        while (true) {
            i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i == 0 || i2 >= i4) {
                break;
            }
            long j3 = (iArr2[i2] & 4294967295L) + j;
            iArr2[i2] = (int) j3;
            j = j3 >> 32;
            i2++;
        }
        if (b || i == 0) {
            bVar3.a();
            return bVar3;
        }
        throw new AssertionError(j);
    }

    public b c(b bVar) {
        b bVar2 = bVar;
        if (bVar2.f3032a) {
            bVar2 = new b((int[]) bVar2.e.clone(), bVar2.f);
        }
        int i = this.f - bVar2.f;
        int[] iArr = bVar2.e;
        int[] iArr2 = this.e;
        int i2 = bVar2.g;
        int i3 = this.g;
        if (i < 0) {
            if (i3 < iArr.length) {
                int i4 = -i;
                System.arraycopy(iArr, 0, iArr, i4, i2);
                Arrays.fill(iArr, 0, i4, 0);
            } else {
                int[] iArr3 = new int[i3];
                System.arraycopy(iArr, 0, iArr3, -i, i2);
                bVar2.e = iArr3;
                iArr = iArr3;
            }
            bVar2.f = this.f;
            i = 0;
        } else {
            int i5 = i3 + i;
            if (i5 >= iArr.length) {
                iArr = Arrays.copyOf(iArr, i5);
                bVar2.e = iArr;
            }
        }
        int i6 = 0;
        long j = 0;
        while (i6 < i) {
            long j2 = (-(iArr[i6] & 4294967295L)) + j;
            iArr[i6] = (int) j2;
            j = j2 >> 32;
            i6++;
        }
        int i7 = 0;
        while (i7 < i3) {
            long j3 = ((iArr2[i7] & 4294967295L) - (iArr[i6] & 4294967295L)) + j;
            iArr[i6] = (int) j3;
            j = j3 >> 32;
            i6++;
            i7++;
            bVar2 = bVar2;
        }
        b bVar3 = bVar2;
        if (b || j == 0) {
            bVar3.g = i6;
            bVar3.a();
            return bVar3;
        }
        throw new AssertionError(j);
    }
}
