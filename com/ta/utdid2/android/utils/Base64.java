package com.ta.utdid2.android.utils;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import tb.gbx;
import tb.kge;
import tb.tof;

/* loaded from: classes4.dex */
public class Base64 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f8137a;
        public int b;

        static {
            kge.a(1937628919);
        }
    }

    static {
        kge.a(-467996394);
    }

    public static byte[] decode(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("f7ebf079", new Object[]{str, new Integer(i)}) : decode(str.getBytes(), i);
    }

    public static byte[] decode(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("565cfa36", new Object[]{bArr, new Integer(i)}) : decode(bArr, 0, bArr.length, i);
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("34c1b396", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        b bVar = new b(i3, new byte[(i2 * 3) / 4]);
        if (!bVar.a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (bVar.b == bVar.f8137a.length) {
            return bVar.f8137a;
        }
        byte[] bArr2 = new byte[bVar.b];
        System.arraycopy(bVar.f8137a, 0, bArr2, 0, bVar.b);
        return bArr2;
    }

    /* loaded from: classes4.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final int[] c;
        private static final int[] d;
        private int e;
        private int f;
        private final int[] g;

        static {
            kge.a(-1353838954);
            c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            d = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        }

        public b(int i, byte[] bArr) {
            this.f8137a = bArr;
            this.g = (i & 8) == 0 ? c : d;
            this.e = 0;
            this.f = 0;
        }

        public boolean a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = i;
            IpChange ipChange = $ipChange;
            int i4 = 4;
            int i5 = 1;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b1ecf4e9", new Object[]{this, bArr, new Integer(i3), new Integer(i2), new Boolean(z)})).booleanValue();
            }
            int i6 = this.e;
            if (i6 == 6) {
                return false;
            }
            int i7 = i2 + i3;
            int i8 = this.f;
            byte[] bArr2 = this.f8137a;
            int[] iArr = this.g;
            int i9 = 0;
            while (i3 < i7) {
                if (i6 == 0) {
                    while (true) {
                        int i10 = i3 + 4;
                        if (i10 > i7 || (i8 = iArr[bArr[i3 + 3] & 255] | (iArr[bArr[i3 + 1] & 255] << 12) | (iArr[bArr[i3] & 255] << 18) | (iArr[bArr[i3 + 2] & 255] << 6)) < 0) {
                            break;
                        }
                        bArr2[i9 + 2] = (byte) i8;
                        bArr2[i9 + 1] = (byte) (i8 >> 8);
                        bArr2[i9] = (byte) (i8 >> 16);
                        i9 += 3;
                        i3 = i10;
                    }
                    if (i3 >= i7) {
                        break;
                    }
                }
                int i11 = i3 + 1;
                int i12 = iArr[bArr[i3] & 255];
                if (i6 != 0) {
                    if (i6 == i5) {
                        if (i12 < 0) {
                            if (i12 != -1) {
                                this.e = 6;
                                return false;
                            }
                        }
                        i8 = (i8 << 6) | i12;
                        i6++;
                    } else if (i6 == 2) {
                        if (i12 < 0) {
                            if (i12 == -2) {
                                bArr2[i9] = (byte) (i8 >> 4);
                                i9++;
                                i3 = i11;
                                i6 = 4;
                                i4 = 4;
                                i5 = 1;
                            } else if (i12 != -1) {
                                this.e = 6;
                                return false;
                            }
                        }
                        i8 = (i8 << 6) | i12;
                        i6++;
                    } else if (i6 == 3) {
                        if (i12 >= 0) {
                            i8 = (i8 << 6) | i12;
                            bArr2[i9 + 2] = (byte) i8;
                            bArr2[i9 + 1] = (byte) (i8 >> 8);
                            bArr2[i9] = (byte) (i8 >> 16);
                            i9 += 3;
                            i3 = i11;
                            i6 = 0;
                        } else if (i12 == -2) {
                            bArr2[i9 + 1] = (byte) (i8 >> 2);
                            bArr2[i9] = (byte) (i8 >> 10);
                            i9 += 2;
                            i3 = i11;
                            i6 = 5;
                        } else if (i12 != -1) {
                            this.e = 6;
                            return false;
                        }
                        i4 = 4;
                        i5 = 1;
                    } else if (i6 == i4) {
                        if (i12 != -2) {
                            if (i12 != -1) {
                                this.e = 6;
                                return false;
                            }
                        }
                        i6++;
                    } else if (i6 == 5 && i12 != -1) {
                        this.e = 6;
                        return false;
                    }
                } else if (i12 >= 0) {
                    i6++;
                    i8 = i12;
                } else if (i12 != -1) {
                    this.e = 6;
                    return false;
                }
                i3 = i11;
                i4 = 4;
                i5 = 1;
            }
            if (!z) {
                this.e = i6;
                this.f = i8;
                this.b = i9;
                return true;
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    this.e = 6;
                    return false;
                } else if (i6 == 2) {
                    bArr2[i9] = (byte) (i8 >> 4);
                    i9++;
                } else if (i6 == 3) {
                    int i13 = i9 + 1;
                    bArr2[i9] = (byte) (i8 >> 10);
                    i9 = i13 + 1;
                    bArr2[i13] = (byte) (i8 >> 2);
                } else if (i6 == 4) {
                    this.e = 6;
                    return false;
                }
            }
            this.e = i6;
            this.b = i9;
            return true;
        }
    }

    public static String encodeToString(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("966d2cad", new Object[]{bArr, new Integer(i)});
        }
        try {
            return new String(encode(bArr, i), EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String encodeToString(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfb1c90d", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        try {
            return new String(encode(bArr, i, i2, i3), EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] encode(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("9ad5fe5e", new Object[]{bArr, new Integer(i)}) : encode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        int i4 = 2;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3f0a4dbe", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        c cVar = new c(i3, null);
        int i5 = (i2 / 3) << 2;
        if (cVar.d) {
            if (i2 % 3 > 0) {
                i5 += 4;
            }
        } else {
            int i6 = i2 % 3;
            if (i6 != 0) {
                if (i6 == 1) {
                    i5 += 2;
                } else if (i6 == 2) {
                    i5 += 3;
                }
            }
        }
        if (cVar.e && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.f) {
                i4 = 1;
            }
            i5 += i7 * i4;
        }
        cVar.f8137a = new byte[i5];
        cVar.a(bArr, i, i2, true);
        return cVar.f8137a;
    }

    /* loaded from: classes4.dex */
    public static class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int LINE_GROUPS = 19;
        public static final /* synthetic */ boolean g;
        private static final byte[] h;
        private static final byte[] i;
        public int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte[] j;
        private int k;
        private final byte[] l;

        static {
            kge.a(-208672914);
            g = !Base64.class.desiredAssertionStatus();
            h = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 43, gbx.OP_MINIFY_CALL_FUNC};
            i = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, gbx.OP_CALL_FUNC, 95};
        }

        public c(int i2, byte[] bArr) {
            this.f8137a = bArr;
            boolean z = true;
            this.d = (i2 & 1) == 0;
            this.e = (i2 & 2) == 0;
            this.f = (i2 & 4) == 0 ? false : z;
            this.l = (i2 & 8) == 0 ? h : i;
            this.j = new byte[2];
            this.c = 0;
            this.k = this.e ? 19 : -1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
            if (r18.f == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
            r11 = r7 + 1;
            r5[r7] = 13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
            r11 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
            r7 = r11 + 1;
            r5[r11] = 10;
            r12 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:109:0x011a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0112 -> B:27:0x00be). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instructions count: 579
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.android.utils.Base64.c.a(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }
}
