package tb;

/* loaded from: classes4.dex */
public class cvg extends cvh {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f26548a;
    private static final byte[] i;
    private static final byte[] j;
    private static final byte[] k;
    private final byte[] l;
    private final byte[] m;
    private final byte[] n;
    private final int o;
    private final int p;
    private int q;

    static {
        kge.a(1704133077);
        f26548a = new byte[]{13, 10};
        i = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 43, gbx.OP_MINIFY_CALL_FUNC};
        j = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, gbx.OP_CALL_FUNC, 95};
        k = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, gbx.OP_IS_NOT, gbx.OP_CALL_FUNC, gbx.OP_ASSIGN, gbx.OP_MINIFY_CALL_FUNC, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR};
    }

    public cvg() {
        this(0);
    }

    public cvg(int i2) {
        this(i2, f26548a);
    }

    public cvg(int i2, byte[] bArr) {
        this(i2, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cvg(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L5
            r1 = 0
            goto L6
        L5:
            int r1 = r6.length
        L6:
            r2 = 4
            r3 = 3
            r4.<init>(r3, r2, r5, r1)
            byte[] r1 = tb.cvg.k
            r4.m = r1
            r1 = 0
            if (r6 == 0) goto L4a
            boolean r3 = r4.b(r6)
            if (r3 != 0) goto L2a
            if (r5 <= 0) goto L4a
            int r5 = r6.length
            int r5 = r5 + r2
            r4.p = r5
            int r5 = r6.length
            byte[] r5 = new byte[r5]
            r4.n = r5
            byte[] r5 = r4.n
            int r1 = r6.length
            java.lang.System.arraycopy(r6, r0, r5, r0, r1)
            goto L4e
        L2a:
            java.lang.String r5 = tb.saf.a(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L4a:
            r4.p = r2
            r4.n = r1
        L4e:
            int r5 = r4.p
            int r5 = r5 + (-1)
            r4.o = r5
            if (r7 == 0) goto L59
            byte[] r5 = tb.cvg.j
            goto L5b
        L59:
            byte[] r5 = tb.cvg.i
        L5b:
            r4.l = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cvg.<init>(int, byte[], boolean):void");
    }

    public static byte[] a(String str) {
        return new cvg().b(str);
    }

    @Override // tb.cvh
    void a(byte[] bArr, int i2, int i3) {
        byte b;
        if (this.f) {
            return;
        }
        if (i3 < 0) {
            this.f = true;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            a(this.o);
            int i5 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 == 61) {
                this.f = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = k;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    this.h = (this.h + 1) % 4;
                    this.q = (this.q << 6) + b;
                    if (this.h == 0) {
                        byte[] bArr3 = this.d;
                        int i6 = this.e;
                        this.e = i6 + 1;
                        bArr3[i6] = (byte) (this.q >> 16);
                        byte[] bArr4 = this.d;
                        int i7 = this.e;
                        this.e = i7 + 1;
                        bArr4[i7] = (byte) (this.q >> 8);
                        byte[] bArr5 = this.d;
                        int i8 = this.e;
                        this.e = i8 + 1;
                        bArr5[i8] = (byte) this.q;
                    }
                }
            }
            i4++;
            i2 = i5;
        }
        if (!this.f || this.h == 0) {
            return;
        }
        a(this.o);
        int i9 = this.h;
        if (i9 == 2) {
            this.q >>= 4;
            byte[] bArr6 = this.d;
            int i10 = this.e;
            this.e = i10 + 1;
            bArr6[i10] = (byte) this.q;
        } else if (i9 != 3) {
        } else {
            this.q >>= 2;
            byte[] bArr7 = this.d;
            int i11 = this.e;
            this.e = i11 + 1;
            bArr7[i11] = (byte) (this.q >> 8);
            byte[] bArr8 = this.d;
            int i12 = this.e;
            this.e = i12 + 1;
            bArr8[i12] = (byte) this.q;
        }
    }

    @Override // tb.cvh
    protected boolean a(byte b) {
        if (b >= 0) {
            byte[] bArr = this.m;
            return b < bArr.length && bArr[b] != -1;
        }
        return false;
    }
}
