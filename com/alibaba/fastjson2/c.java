package com.alibaba.fastjson2;

import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.e;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import tb.crd;
import tb.kge;

/* loaded from: classes2.dex */
class c extends JSONReader {
    protected int A;
    protected int B;
    protected int C;
    protected boolean D;
    protected int E;
    protected final InputStream F;
    protected byte[] G;
    protected char[] H;
    protected final JSONFactory.CacheItem I;
    protected final byte[] m;
    protected final int x;
    protected final int y;
    protected final int z;

    static {
        kge.a(-1796520258);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[LOOP:0: B:7:0x0032->B:23:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002b A[EDGE_INSN: B:26:0x002b->B:5:0x002b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005d -> B:5:0x002b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    c(com.alibaba.fastjson2.JSONReader.c r6, java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r5 = this;
            r7 = 0
            r5.<init>(r6, r7)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            int r6 = java.lang.System.identityHashCode(r6)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r7 = com.alibaba.fastjson2.JSONFactory.t
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6 = r6 & r7
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r7 = com.alibaba.fastjson2.JSONFactory.t
            r6 = r7[r6]
            r5.I = r6
            r5.m = r8
            r5.x = r10
            r6 = 0
            r5.F = r6
            r5.y = r9
            int r10 = r10 + r9
            r5.z = r10
            int r6 = r5.z
            r7 = 26
            if (r9 < r6) goto L2e
            r6 = r9
        L2b:
            r9 = 26
            goto L32
        L2e:
            int r6 = r9 + 1
            r9 = r8[r9]
        L32:
            if (r9 == 0) goto L5b
            r10 = 32
            if (r9 > r10) goto L48
            r0 = 1
            long r0 = r0 << r9
            r2 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r0 = r0 & r2
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L48
            goto L5b
        L48:
            if (r9 >= 0) goto L4e
            r5.D()
            return
        L4e:
            r5.c = r6
            char r6 = (char) r9
            r5.d = r6
            r6 = 47
            if (r9 != r6) goto L5a
            r5.W()
        L5a:
            return
        L5b:
            int r9 = r5.z
            if (r6 != r9) goto L60
            goto L2b
        L60:
            int r9 = r6 + 1
            r6 = r8[r6]
            r4 = r9
            r9 = r6
            r6 = r4
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.<init>(com.alibaba.fastjson2.JSONReader$c, java.lang.String, byte[], int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2, int i3) {
        if ((i2 & crd.DETECT_WIDTH) == 128) {
            return ((i & 31) << 6) | (i2 & 63);
        }
        throw new JSONException("malformed input around byte " + i3);
    }

    static void a(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if ((i2 >> 3) != -2) {
            throw new JSONException("malformed input around byte " + i);
        }
        int i4 = bArr[i + 1];
        int i5 = bArr[i + 2];
        int i6 = bArr[i + 3];
        int i7 = (((i2 << 18) ^ (i4 << 12)) ^ (i5 << 6)) ^ (3678080 ^ i6);
        if ((i4 & crd.DETECT_WIDTH) == 128 && (i5 & crd.DETECT_WIDTH) == 128 && (i6 & crd.DETECT_WIDTH) == 128 && i7 >= 65536 && i7 < 1114112) {
            cArr[i3] = (char) ((i7 >>> 10) + 55232);
            cArr[i3 + 1] = (char) ((i7 & 1023) + 56320);
            return;
        }
        throw new JSONException("malformed input around byte " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2, int i3, int i4) {
        if ((i2 & crd.DETECT_WIDTH) == 128 && (i3 & crd.DETECT_WIDTH) == 128) {
            return ((i & 15) << 12) | ((i2 & 63) << 6) | (i3 & 63);
        }
        throw new JSONException("malformed input around byte " + i4);
    }

    private void c(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr = this.m;
        int i5 = i & 255;
        switch (i5 >> 4) {
            case 12:
            case 13:
                int i6 = i2 + 1;
                int a2 = a(i5, bArr[i2], i6);
                i3 = i6;
                i4 = a2;
                break;
            case 14:
                i4 = b(i5, bArr[i2], bArr[i2 + 1], i2);
                i3 = i2 + 2;
                break;
            default:
                if ((i >> 3) != -2) {
                    throw new JSONException("malformed input around byte " + i2);
                }
                i4 = (((i << 18) ^ (bArr[i2] << 12)) ^ (bArr[i2 + 1] << 6)) ^ (bArr[i2 + 2] ^ 3678080);
                i3 = i2 + 3;
                break;
        }
        this.d = (char) i4;
        this.c = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[LOOP:0: B:15:0x002a->B:22:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003f -> B:13:0x0023). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() {
        /*
            r10 = this;
            byte[] r0 = r10.m
            int r1 = r10.c
            char r2 = r10.d
            r3 = 83
            if (r2 != r3) goto L51
            int r2 = r1 + 1
            int r3 = r10.z
            if (r2 >= r3) goto L51
            r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L51
            r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L51
            int r1 = r1 + 2
            r2 = 26
            if (r1 != r3) goto L26
            r3 = r1
        L23:
            r1 = 26
            goto L2a
        L26:
            int r3 = r1 + 1
            r1 = r0[r1]
        L2a:
            r4 = 32
            if (r1 > r4) goto L4a
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L4a
            int r1 = r10.z
            if (r3 != r1) goto L42
            goto L23
        L42:
            int r1 = r3 + 1
            r3 = r0[r3]
            r9 = r3
            r3 = r1
            r1 = r9
            goto L2a
        L4a:
            r10.c = r3
            char r0 = (char) r1
            r10.d = r0
            r0 = 1
            return r0
        L51:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[LOOP:0: B:25:0x004e->B:32:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0063 -> B:23:0x0047). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            r10 = this;
            byte[] r0 = r10.m
            int r1 = r10.c
            char r2 = r10.d
            r3 = 73
            if (r2 != r3) goto L75
            int r2 = r1 + 6
            int r3 = r10.z
            if (r2 >= r3) goto L75
            r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L75
            int r4 = r1 + 1
            r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L75
            int r4 = r1 + 2
            r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L75
            int r4 = r1 + 3
            r4 = r0[r4]
            if (r4 != r5) goto L75
            int r4 = r1 + 4
            r4 = r0[r4]
            if (r4 != r6) goto L75
            int r4 = r1 + 5
            r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L75
            r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L75
            int r1 = r1 + 7
            r2 = 26
            if (r1 != r3) goto L4a
            r3 = r1
        L47:
            r1 = 26
            goto L4e
        L4a:
            int r3 = r1 + 1
            r1 = r0[r1]
        L4e:
            r4 = 32
            if (r1 > r4) goto L6e
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L6e
            int r1 = r10.z
            if (r3 != r1) goto L66
            goto L47
        L66:
            int r1 = r3 + 1
            r3 = r0[r3]
            r9 = r3
            r3 = r1
            r1 = r9
            goto L4e
        L6e:
            r10.c = r3
            char r0 = (char) r1
            r10.d = r0
            r0 = 1
            return r0
        L75:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.B():boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[LOOP:0: B:7:0x0012->B:23:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x000b A[EDGE_INSN: B:26:0x000b->B:5:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003d -> B:5:0x000b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D() {
        /*
            r10 = this;
            byte[] r0 = r10.m
            int r1 = r10.c
            int r2 = r10.z
            r3 = 26
            if (r1 < r2) goto Le
            r2 = r1
        Lb:
            r1 = 26
            goto L12
        Le:
            int r2 = r1 + 1
            r1 = r0[r1]
        L12:
            if (r1 == 0) goto L3b
            r4 = 32
            if (r1 > r4) goto L28
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L28
            goto L3b
        L28:
            if (r1 >= 0) goto L2e
            r10.c(r1, r2)
            return
        L2e:
            r10.c = r2
            char r0 = (char) r1
            r10.d = r0
            r0 = 47
            if (r1 != r0) goto L3a
            r10.W()
        L3a:
            return
        L3b:
            int r1 = r10.z
            if (r2 != r1) goto L40
            goto Lb
        L40:
            int r1 = r2 + 1
            r2 = r0[r2]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x024e, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x014a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165 A[LOOP:2: B:70:0x0151->B:75:0x0165, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0162 -> B:68:0x014a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long E() {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.E():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b2, code lost:
        if (r3 == (-62)) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d2 A[LOOP:2: B:214:0x03bc->B:220:0x03d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x03cf -> B:212:0x03b5). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long G() {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.G():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long H() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.H():long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0089 -> B:41:0x008e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x009f -> B:38:0x0082). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String I() {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.I():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String J() {
        int i;
        byte[] bArr = this.m;
        int i2 = this.B - this.A;
        if (!this.f) {
            return this.D ? b(this.A, i2) : new String(bArr, this.A, i2, StandardCharsets.UTF_8);
        }
        char[] cArr = this.H;
        if (cArr == null) {
            cArr = JSONFactory.u.getAndSet(this.I, null);
            this.H = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[this.C];
            this.H = cArr;
        }
        int i3 = this.A;
        int i4 = 0;
        while (i3 < this.B) {
            int i5 = bArr[i3];
            if (i5 < 0) {
                int i6 = i5 & 255;
                switch (i6 >> 4) {
                    case 12:
                    case 13:
                        byte b = bArr[i3 + 1];
                        if ((b & 192) != 128) {
                            throw new JSONException("malformed input around byte " + i3);
                        }
                        i = ((i6 & 31) << 6) | (b & 63);
                        i3 += 2;
                        break;
                    case 14:
                        byte b2 = bArr[i3 + 1];
                        int i7 = i3 + 2;
                        byte b3 = bArr[i7];
                        if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                            throw new JSONException("malformed input around byte " + i7);
                        }
                        i = ((i6 & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63);
                        i3 += 3;
                        break;
                        break;
                    default:
                        throw new JSONException("malformed input around byte " + i3);
                }
                cArr[i4] = (char) i;
            } else {
                if (i5 == 92) {
                    i3++;
                    i5 = (char) bArr[i3];
                    if (i5 != 34 && i5 != 58 && i5 != 64 && i5 != 92) {
                        if (i5 == 117) {
                            i3 += 4;
                            i5 = a(bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3], bArr[i3]);
                        } else if (i5 == 120) {
                            i3 += 2;
                            i5 = a(bArr[i3 + 1], bArr[i3]);
                        } else if (i5 != 42 && i5 != 43) {
                            switch (i5) {
                                case 45:
                                case 46:
                                case 47:
                                    break;
                                default:
                                    switch (i5) {
                                        case 60:
                                        case 61:
                                        case 62:
                                            break;
                                        default:
                                            i5 = a(i5);
                                            break;
                                    }
                            }
                        }
                    }
                } else if (i5 == 34) {
                    return new String(cArr, 0, this.C);
                }
                cArr[i4] = (char) i5;
                i3++;
            }
            i4++;
        }
        return new String(cArr, 0, this.C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c8, code lost:
        if (r5 != 26) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ca, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02cc, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02ce, code lost:
        r27.B = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d0, code lost:
        if (r5 > 32) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e0, code lost:
        if (((1 << r5) & 4294981376L) == 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02e2, code lost:
        if (r2 != r3) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e4, code lost:
        r5 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e7, code lost:
        r5 = r4[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
        if (r8 != 26) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016a, code lost:
        r27.B = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016c, code lost:
        if (r8 > ' ') goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017d, code lost:
        if (((1 << r8) & 4294981376L) == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017f, code lost:
        if (r2 != r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0181, code lost:
        r5 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0184, code lost:
        r5 = (char) r4[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018c, code lost:
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018d, code lost:
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long L() {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.L():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0206, code lost:
        if (r2 != 83) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x0261 -> B:25:0x0050). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00c3 -> B:208:0x024e). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.N():void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005d -> B:18:0x0043). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0101 -> B:69:0x00dd). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] P() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.P():byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00c8 -> B:75:0x00ca). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x00df -> B:72:0x00c1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int R() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.R():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fe  */
    /* JADX WARN: Type inference failed for: r1v0, types: [char, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00d6 -> B:82:0x00d8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x00ef -> B:79:0x00cf). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer T() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.T():java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r1 == 10) goto L14;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            r12 = this;
            int r0 = r12.c
            int r1 = r0 + 1
            int r2 = r12.z
            if (r1 >= r2) goto L77
            byte[] r2 = r12.m
            r0 = r2[r0]
            r3 = 42
            r4 = 0
            r5 = 47
            r6 = 1
            if (r0 != r3) goto L16
            r0 = 1
            goto L19
        L16:
            if (r0 != r5) goto L76
            r0 = 0
        L19:
            int r7 = r1 + 1
            r1 = r2[r1]
        L1d:
            if (r0 == 0) goto L2f
            if (r1 != r3) goto L2d
            int r1 = r12.z
            if (r7 > r1) goto L2d
            r1 = r2[r7]
            if (r1 != r5) goto L2d
            int r7 = r7 + 1
        L2b:
            r1 = 1
            goto L34
        L2d:
            r1 = 0
            goto L34
        L2f:
            r8 = 10
            if (r1 != r8) goto L2d
            goto L2b
        L34:
            r8 = 26
            if (r1 == 0) goto L5f
            int r0 = r12.z
            if (r7 < r0) goto L3d
            goto L63
        L3d:
            r0 = r2[r7]
        L3f:
            r1 = 32
            if (r0 > r1) goto L5c
            r3 = 1
            long r3 = r3 << r0
            r9 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r9
            r9 = 0
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L5c
            int r7 = r7 + 1
            int r0 = r12.z
            if (r7 < r0) goto L59
            goto L5d
        L59:
            r0 = r2[r7]
            goto L3f
        L5c:
            r8 = r0
        L5d:
            int r7 = r7 + r6
            goto L63
        L5f:
            int r1 = r12.z
            if (r7 < r1) goto L6e
        L63:
            char r0 = (char) r8
            r12.d = r0
            r12.c = r7
            if (r8 != r5) goto L6d
            r12.W()
        L6d:
            return
        L6e:
            int r1 = r7 + 1
            r7 = r2[r7]
            r11 = r7
            r7 = r1
            r1 = r11
            goto L1d
        L76:
            return
        L77:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = r12.aR()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.W():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00d8 -> B:79:0x00dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00f2 -> B:76:0x00d1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Y() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.Y():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x00e7 -> B:84:0x00ec). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0101 -> B:81:0x00e0). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Long Z() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.Z():java.lang.Long");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[LOOP:1: B:20:0x003f->B:36:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0038 A[EDGE_INSN: B:44:0x0038->B:18:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0061 -> B:18:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(char r17) {
        /*
            r16 = this;
            r0 = r16
            byte[] r1 = r0.m
            int r2 = r0.c
            char r3 = r0.d
        L8:
            r4 = 0
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            r8 = 1
            r10 = 32
            r11 = 26
            if (r3 > r10) goto L2d
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L2d
            int r3 = r0.z
            if (r2 != r3) goto L25
            r3 = 26
            goto L8
        L25:
            int r3 = r2 + 1
            r2 = r1[r2]
            r15 = r3
            r3 = r2
            r2 = r15
            goto L8
        L2d:
            r12 = r17
            if (r3 == r12) goto L33
            r1 = 0
            return r1
        L33:
            int r3 = r0.z
            if (r2 != r3) goto L3b
            r3 = r2
        L38:
            r2 = 26
            goto L3f
        L3b:
            int r3 = r2 + 1
            r2 = r1[r2]
        L3f:
            if (r2 == 0) goto L5f
            if (r2 > r10) goto L4b
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L4b
            goto L5f
        L4b:
            r1 = 1
            if (r2 >= 0) goto L52
            r0.c(r2, r3)
            return r1
        L52:
            r0.c = r3
            char r3 = (char) r2
            r0.d = r3
            r3 = 47
            if (r2 != r3) goto L5e
            r16.W()
        L5e:
            return r1
        L5f:
            int r2 = r0.z
            if (r3 != r2) goto L64
            goto L38
        L64:
            int r2 = r3 + 1
            r3 = r1[r3]
            r15 = r3
            r3 = r2
            r2 = r15
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.a(char):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[LOOP:0: B:21:0x0033->B:28:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0048 -> B:19:0x002c). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(char r8, char r9, char r10, char r11, char r12) {
        /*
            r7 = this;
            char r0 = r7.d
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.m
            int r0 = r7.c
            int r2 = r0 + 4
            int r3 = r7.z
            if (r2 > r3) goto L7b
            r4 = r8[r0]
            if (r4 != r9) goto L7b
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 != r10) goto L7b
            int r9 = r0 + 2
            r9 = r8[r9]
            if (r9 != r11) goto L7b
            int r0 = r0 + 3
            r9 = r8[r0]
            if (r9 == r12) goto L27
            goto L7b
        L27:
            r9 = 26
            if (r2 != r3) goto L2f
            r10 = r2
        L2c:
            r11 = 26
            goto L33
        L2f:
            int r10 = r2 + 1
            r11 = r8[r2]
        L33:
            r12 = 32
            if (r11 > r12) goto L53
            r2 = 1
            long r2 = r2 << r11
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r2 = r2 & r4
            r4 = 0
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L53
            int r11 = r7.z
            if (r10 != r11) goto L4b
            goto L2c
        L4b:
            int r11 = r10 + 1
            r10 = r8[r10]
            r6 = r11
            r11 = r10
            r10 = r6
            goto L33
        L53:
            int r8 = r7.c
            int r8 = r8 + 5
            if (r10 != r8) goto L74
            if (r11 == r9) goto L74
            r8 = 40
            if (r11 == r8) goto L74
            r8 = 91
            if (r11 == r8) goto L74
            r8 = 93
            if (r11 == r8) goto L74
            r8 = 41
            if (r11 == r8) goto L74
            r8 = 58
            if (r11 == r8) goto L74
            r8 = 44
            if (r11 == r8) goto L74
            return r1
        L74:
            r7.c = r10
            char r8 = (char) r11
            r7.d = r8
            r8 = 1
            return r8
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.a(char, char, char, char, char):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[LOOP:0: B:13:0x0028->B:20:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003e -> B:11:0x0021). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aE() {
        /*
            r15 = this;
            byte[] r0 = r15.m
            int r1 = r15.c
            r2 = r0[r1]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L7e
            int r2 = r1 + 1
            r2 = r0[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L7e
            int r2 = r1 + 2
            r2 = r0[r2]
            if (r2 != r3) goto L7e
            int r1 = r1 + 3
            int r2 = r15.z
            r3 = 26
            if (r1 != r2) goto L24
            r2 = r1
        L21:
            r1 = 26
            goto L28
        L24:
            int r2 = r1 + 1
            r1 = r0[r1]
        L28:
            r4 = 0
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            r8 = 1
            r10 = 32
            if (r1 > r10) goto L49
            long r11 = r8 << r1
            long r11 = r11 & r6
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L49
            int r1 = r15.z
            if (r2 < r1) goto L41
            goto L21
        L41:
            int r1 = r2 + 1
            r2 = r0[r2]
            r14 = r2
            r2 = r1
            r1 = r14
            goto L28
        L49:
            r11 = 44
            if (r1 != r11) goto L4f
            r11 = 1
            goto L50
        L4f:
            r11 = 0
        L50:
            r15.e = r11
            if (r11 == 0) goto L78
            int r1 = r15.z
            if (r2 < r1) goto L5c
            r1 = r2
            r2 = 26
            goto L60
        L5c:
            int r1 = r2 + 1
            r2 = r0[r2]
        L60:
            r14 = r2
            r2 = r1
            r1 = r14
        L63:
            if (r1 > r10) goto L78
            long r11 = r8 << r1
            long r11 = r11 & r6
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L78
            int r1 = r15.z
            if (r2 < r1) goto L73
            r1 = 26
            goto L63
        L73:
            int r1 = r2 + 1
            r2 = r0[r2]
            goto L60
        L78:
            char r0 = (char) r1
            r15.d = r0
            r15.c = r2
            return
        L7e:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "json syntax error, not match null"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.aE():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean aF() {
        int i;
        char c;
        byte[] bArr = this.m;
        char c2 = this.d;
        int i2 = this.c;
        boolean z = false;
        if (c2 == 'n' && bArr[i2] == 117 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 108) {
            int i3 = i2 + 3;
            char c3 = i3 == this.z ? JSONLexer.EOI : (char) bArr[i3];
            int i4 = i2 + 4;
            while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
                if (i4 == this.z) {
                    c3 = JSONLexer.EOI;
                } else {
                    int i5 = i4 + 1;
                    char c4 = bArr[i4];
                    i4 = i5;
                    c3 = c4;
                }
            }
            if (c3 == ',') {
                z = true;
            }
            this.e = z;
            if (z) {
                if (i4 == this.z) {
                    i = i4;
                    c = JSONLexer.EOI;
                } else {
                    i = i4 + 1;
                    c = (char) bArr[i4];
                }
                loop1: while (true) {
                    char c5 = c;
                    i4 = i;
                    c3 = c5;
                    while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
                        if (i4 == this.z) {
                            c3 = JSONLexer.EOI;
                        }
                    }
                    i = i4 + 1;
                    c = bArr[i4];
                }
            }
            this.c = i4;
            this.d = c3;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r1);
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String aG() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.aG():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00f7 -> B:71:0x00db). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aL() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.aL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[LOOP:1: B:29:0x0052->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[LOOP:2: B:44:0x0083->B:50:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0066 -> B:27:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x008e -> B:42:0x007c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aS() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.d
            r2 = 0
            r4 = 1
            r5 = 34
            if (r1 == r5) goto L25
            r5 = 39
            if (r1 == r5) goto L25
            com.alibaba.fastjson2.JSONReader$c r1 = r0.f2934a
            long r5 = r1.p
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r7 = r1.mask
            long r5 = r5 & r7
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L20
            r17.L()
            return r4
        L20:
            com.alibaba.fastjson2.JSONException r1 = r17.aZ()
            throw r1
        L25:
            int r5 = r0.c
            byte[] r6 = r0.m
        L29:
            int r7 = r5 + 1
            r5 = r6[r5]
            r8 = 92
            if (r5 != r8) goto L42
            r5 = r6[r7]
            r8 = 117(0x75, float:1.64E-43)
            if (r5 != r8) goto L39
            r5 = 5
            goto L40
        L39:
            r8 = 120(0x78, float:1.68E-43)
            if (r5 != r8) goto L3f
            r5 = 3
            goto L40
        L3f:
            r5 = 1
        L40:
            int r5 = r5 + r7
            goto L29
        L42:
            if (r5 != r1) goto La6
            int r1 = r0.z
            r5 = 26
            if (r7 != r1) goto L4e
            r1 = r7
        L4b:
            r7 = 26
            goto L52
        L4e:
            int r1 = r7 + 1
            r7 = r6[r7]
        L52:
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r7 > r12) goto L73
            long r13 = r10 << r7
            long r13 = r13 & r8
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 == 0) goto L73
            int r7 = r0.z
            if (r1 != r7) goto L69
            goto L4b
        L69:
            int r7 = r1 + 1
            r1 = r6[r1]
            r16 = r7
            r7 = r1
            r1 = r16
            goto L52
        L73:
            r13 = 58
            if (r7 != r13) goto La1
            int r7 = r0.z
            if (r1 != r7) goto L7f
            r7 = r1
        L7c:
            r1 = 26
            goto L83
        L7f:
            int r7 = r1 + 1
            r1 = r6[r1]
        L83:
            if (r1 > r12) goto L9b
            long r13 = r10 << r1
            long r13 = r13 & r8
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 == 0) goto L9b
            int r1 = r0.z
            if (r7 != r1) goto L91
            goto L7c
        L91:
            int r1 = r7 + 1
            r7 = r6[r7]
            r16 = r7
            r7 = r1
            r1 = r16
            goto L83
        L9b:
            r0.c = r7
            char r1 = (char) r1
            r0.d = r1
            return r4
        La1:
            com.alibaba.fastjson2.JSONException r1 = i(r7)
            throw r1
        La6:
            r5 = r7
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.aS():boolean");
    }

    public final boolean aT() {
        return this.d == 'n' && this.c < this.z && this.m[this.c] == 117;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02b3, code lost:
        if (r26.j != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02b5, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b6, code lost:
        r14 = r3;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02cb, code lost:
        if (r26.j != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x031d, code lost:
        if (r13 != 'S') goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0035 -> B:15:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:12:0x002e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x032a -> B:223:0x032f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x0343 -> B:219:0x0323). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float aa() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.aa():float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0294, code lost:
        if (r25.j != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0296, code lost:
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0297, code lost:
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02b3, code lost:
        if (r25.j != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02c7, code lost:
        if (r25.j != false) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[LOOP:4: B:15:0x0036->B:21:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x002f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Type inference failed for: r0v60, types: [char] */
    /* JADX WARN: Type inference failed for: r3v0, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:13:0x002f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x0325 -> B:231:0x032a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x0340 -> B:227:0x031e). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double ac() {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.ac():double");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0318  */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.alibaba.fastjson2.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x02c2 -> B:198:0x02c5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x02d8 -> B:194:0x02bb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:215:0x02f4 -> B:216:0x02f5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x0308 -> B:213:0x02ed). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal ag() {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.ag():java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119 A[LOOP:5: B:63:0x0104->B:69:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0116 -> B:61:0x00fd). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.UUID ah() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.ah():java.util.UUID");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int ak() {
        if (this.d == '\"' || this.d == '\'') {
            char c = this.d;
            int i = 0;
            int i2 = this.c;
            byte[] bArr = this.m;
            int i3 = i2 + 8;
            if (i3 < this.z && i3 < bArr.length && bArr[i2] != c && bArr[i2 + 1] != c && bArr[i2 + 2] != c && bArr[i2 + 3] != c && bArr[i2 + 4] != c && bArr[i2 + 5] != c && bArr[i2 + 6] != c && bArr[i2 + 7] != c) {
                i = 8;
                i2 = i3;
            }
            while (i2 < this.z && bArr[i2] != c) {
                i2++;
                i++;
            }
            return i;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c am() {
        if (z()) {
            com.alibaba.fastjson2.time.c f = DateUtils.f(this.m, this.c);
            if (f == null) {
                return null;
            }
            this.c += 13;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return f;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c an() {
        if (z()) {
            com.alibaba.fastjson2.time.c g = DateUtils.g(this.m, this.c);
            if (g == null) {
                return null;
            }
            this.c += 15;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return g;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c ao() {
        if (z()) {
            com.alibaba.fastjson2.time.c h = DateUtils.h(this.m, this.c);
            if (h == null) {
                return null;
            }
            this.c += 17;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return h;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c ap() {
        if (z()) {
            com.alibaba.fastjson2.time.c i = DateUtils.i(this.m, this.c);
            if (i == null) {
                return null;
            }
            this.c += 18;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return i;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c aq() {
        if (z()) {
            com.alibaba.fastjson2.time.c j = DateUtils.j(this.m, this.c);
            this.c += 19;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return j;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c ar() {
        if (z()) {
            com.alibaba.fastjson2.time.c k = DateUtils.k(this.m, this.c);
            if (k == null) {
                return null;
            }
            this.c += 20;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return k;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c as() {
        if (z()) {
            com.alibaba.fastjson2.time.c l = DateUtils.l(this.m, this.c);
            if (l == null) {
                return null;
            }
            this.c += 21;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return l;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long at() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            boolean z = true;
            if (this.c + 18 >= this.z) {
                this.h = true;
                return 0L;
            }
            long b = DateUtils.b(this.m, this.c, this.f2934a.o);
            if (this.m[this.c + 19] != c) {
                throw new JSONException(d("illegal date input"));
            }
            this.c += 20;
            D();
            if (this.d != ',') {
                z = false;
            }
            this.e = z;
            if (z) {
                D();
            }
            return b;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final com.alibaba.fastjson2.time.b au() {
        if (z()) {
            try {
                com.alibaba.fastjson2.time.b b = DateUtils.b(this.m, this.c);
                this.c += 9;
                D();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    D();
                }
                return b;
            } catch (DateTimeException e) {
                throw new JSONException(d("read date error"), e);
            }
        }
        throw new JSONException("localDate only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final com.alibaba.fastjson2.time.b av() {
        if (z()) {
            try {
                com.alibaba.fastjson2.time.b c = DateUtils.c(this.m, this.c);
                this.c += 10;
                D();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    D();
                }
                return c;
            } catch (DateTimeException e) {
                throw new JSONException(d("read date error"), e);
            }
        }
        throw new JSONException("localDate only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final com.alibaba.fastjson2.time.b aw() {
        if (z()) {
            try {
                com.alibaba.fastjson2.time.b d = DateUtils.d(this.m, this.c);
                if (d == null) {
                    return null;
                }
                this.c += 11;
                D();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    D();
                }
                return d;
            } catch (DateTimeException e) {
                throw new JSONException(d("read date error"), e);
            }
        }
        throw new JSONException("localDate only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.b ax() {
        if (z()) {
            com.alibaba.fastjson2.time.b e = DateUtils.e(this.m, this.c);
            if (e == null) {
                return null;
            }
            this.c += 11;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return e;
        }
        throw new JSONException("localDate only support string input");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (r19.q < (-214748364)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
        if (r19.q < (-214748364)) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[LOOP:4: B:14:0x0045->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x003e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:12:0x003e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x02e1 -> B:201:0x02e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x02f7 -> B:198:0x02da). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ay() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.ay():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0194 A[LOOP:2: B:92:0x0180->B:98:0x0194, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0191 -> B:90:0x0179). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String az() {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.az():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c b(int i) {
        if (z()) {
            com.alibaba.fastjson2.time.c a2 = DateUtils.a(this.m, this.c, i);
            if (a2 == null) {
                return null;
            }
            boolean z = true;
            this.c += i + 1;
            D();
            if (this.d != ',') {
                z = false;
            }
            this.e = z;
            if (z) {
                D();
            }
            return a2;
        }
        throw new JSONException("date only support string input");
    }

    final String b(int i, int i2) {
        if (e.ANDROID_SDK_INT >= 34) {
            return new String(this.m, i, i2, StandardCharsets.ISO_8859_1);
        }
        char[] cArr = this.H;
        if (cArr == null) {
            cArr = JSONFactory.u.getAndSet(this.I, null);
            this.H = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
            this.H = cArr;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) (this.m[i + i3] & 255);
        }
        return new String(cArr, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.alibaba.fastjson2.time.f c(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.z()
            if (r0 == 0) goto L96
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto Lc
            return r1
        Lc:
            r0 = 30
            r2 = 29
            r3 = 90
            if (r6 != r0) goto L2c
            byte[] r0 = r5.m
            int r4 = r5.c
            int r4 = r4 + r2
            r0 = r0[r4]
            if (r0 != r3) goto L2c
            byte[] r0 = r5.m
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.p(r0, r2)
        L25:
            com.alibaba.fastjson2.time.e r2 = com.alibaba.fastjson2.time.e.c
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.time.f.a(r0, r2)
            goto L79
        L2c:
            r0 = 28
            if (r6 != r2) goto L42
            byte[] r2 = r5.m
            int r4 = r5.c
            int r4 = r4 + r0
            r2 = r2[r4]
            if (r2 != r3) goto L42
            byte[] r0 = r5.m
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.o(r0, r2)
            goto L25
        L42:
            r2 = 27
            if (r6 != r0) goto L58
            byte[] r0 = r5.m
            int r4 = r5.c
            int r4 = r4 + r2
            r0 = r0[r4]
            if (r0 != r3) goto L58
            byte[] r0 = r5.m
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.n(r0, r2)
            goto L25
        L58:
            if (r6 != r2) goto L6d
            byte[] r0 = r5.m
            int r2 = r5.c
            int r2 = r2 + 26
            r0 = r0[r2]
            if (r0 != r3) goto L6d
            byte[] r0 = r5.m
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.m(r0, r2)
            goto L25
        L6d:
            byte[] r0 = r5.m
            int r2 = r5.c
            com.alibaba.fastjson2.JSONReader$c r3 = r5.f2934a
            com.alibaba.fastjson2.time.e r3 = r3.o
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.util.DateUtils.a(r0, r2, r6, r3)
        L79:
            if (r0 != 0) goto L7c
            return r1
        L7c:
            int r1 = r5.c
            r2 = 1
            int r6 = r6 + r2
            int r1 = r1 + r6
            r5.c = r1
            r5.D()
            char r6 = r5.d
            r1 = 44
            if (r6 != r1) goto L8d
            goto L8e
        L8d:
            r2 = 0
        L8e:
            r5.e = r2
            if (r2 == 0) goto L95
            r5.D()
        L95:
            return r0
        L96:
            com.alibaba.fastjson2.JSONException r6 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "date only support string input"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.c(int):com.alibaba.fastjson2.time.f");
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        JSONFactory.CacheItem cacheItem = this.I;
        byte[] bArr = this.G;
        if (bArr != null && bArr.length < 1048576) {
            JSONFactory.v.lazySet(cacheItem, bArr);
        }
        char[] cArr = this.H;
        if (cArr != null && cArr.length < 1048576) {
            JSONFactory.u.lazySet(cacheItem, cArr);
        }
        InputStream inputStream = this.F;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String d(String str) {
        char c;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c = '\n';
            if (i >= this.c || i >= this.z) {
                break;
            }
            if (this.m[i] == 10) {
                i2++;
                i3 = 1;
            }
            i++;
            i3++;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && !str.isEmpty()) {
            sb.append(str);
            sb.append(", ");
        }
        sb.append("offset ");
        sb.append(this.c);
        sb.append(", character ");
        sb.append(this.d);
        sb.append(", line ");
        sb.append(i2);
        sb.append(", column ");
        sb.append(i3);
        sb.append(", fastjson-version ");
        sb.append(a.VERSION);
        if (i2 <= 1) {
            c = ' ';
        }
        sb.append(c);
        byte[] bArr = this.m;
        int i4 = this.y;
        int i5 = this.x;
        if (i5 >= 65535) {
            i5 = 65535;
        }
        sb.append(new String(bArr, i4, i5));
        return sb.toString();
    }

    protected void e() {
        String str;
        int i;
        char c = this.d;
        int i2 = this.c;
        this.g = false;
        byte[] bArr = this.m;
        int i3 = i2;
        int i4 = 0;
        boolean z = true;
        while (true) {
            byte b = bArr[i3];
            int i5 = 120;
            int i6 = 117;
            int i7 = 6;
            if (b == 92) {
                this.g = true;
                byte b2 = bArr[i3 + 1];
                if (b2 != 117) {
                    i7 = b2 == 120 ? 4 : 2;
                }
                i3 += i7;
            } else if (b < 0) {
                switch ((b & 255) >> 4) {
                    case 12:
                    case 13:
                        i3 += 2;
                        break;
                    case 14:
                        i3 += 3;
                        break;
                    default:
                        if ((b >> 3) != -2) {
                            throw new JSONException("malformed input around byte " + i3);
                        }
                        i3 += 4;
                        i4++;
                        break;
                }
                z = false;
            } else if (b == c) {
                if (this.g) {
                    char[] cArr = new char[i4];
                    i3 = i2;
                    int i8 = 0;
                    while (true) {
                        byte b3 = bArr[i3];
                        if (b3 == 92) {
                            int i9 = i3 + 1;
                            int i10 = bArr[i9];
                            if (i10 != 34 && i10 != 92) {
                                if (i10 == i6) {
                                    i9 += 4;
                                    i10 = a(bArr[i9 + 1], bArr[i9 + 2], bArr[i9 + 3], bArr[i9]);
                                } else if (i10 != i5) {
                                    i10 = a(i10);
                                } else {
                                    i9 += 2;
                                    i10 = a(bArr[i9 + 1], bArr[i9]);
                                }
                            }
                            cArr[i8] = (char) i10;
                            i3 = i9 + 1;
                        } else if (b3 == 34) {
                            str = new String(cArr);
                        } else if (b3 < 0) {
                            switch ((b3 & 255) >> 4) {
                                case 12:
                                case 13:
                                    int i11 = i3 + 1;
                                    cArr[i8] = (char) ((bArr[i11] & 63) | ((b3 & 31) << 6));
                                    i3 = i11 + 1;
                                    continue;
                                case 14:
                                    int i12 = i3 + 1;
                                    int i13 = i12 + 1;
                                    cArr[i8] = (char) (((bArr[i12] & 63) << 6) | ((b3 & 15) << 12) | (bArr[i13] & 63));
                                    i3 = i13 + 1;
                                    continue;
                                default:
                                    if ((b3 >> 3) != -2) {
                                        throw new JSONException("malformed input around byte " + i3);
                                    }
                                    int i14 = i3 + 1;
                                    int i15 = i14 + 1;
                                    byte b4 = bArr[i14];
                                    int i16 = i15 + 1;
                                    byte b5 = bArr[i15];
                                    i = i16 + 1;
                                    byte b6 = bArr[i16];
                                    int i17 = (((b3 << 18) ^ (b4 << 12)) ^ (b5 << 6)) ^ (b6 ^ 3678080);
                                    if ((b4 & 192) == 128 && (b5 & 192) == 128 && (b6 & 192) == 128 && i17 >= 65536 && i17 < 1114112) {
                                        int i18 = i8 + 1;
                                        cArr[i8] = (char) ((i17 >>> 10) + 55232);
                                        cArr[i18] = (char) ((i17 & 1023) + 56320);
                                        i8 = i18;
                                        i3 = i;
                                        continue;
                                    }
                                    break;
                            }
                        } else {
                            cArr[i8] = (char) b3;
                            i3++;
                        }
                        i8++;
                        i5 = 120;
                        i6 = 117;
                    }
                    throw new JSONException("malformed input around byte " + i);
                } else if (z) {
                    str = b(this.c, i3 - this.c);
                } else {
                    int i19 = this.c;
                    str = new String(bArr, i19, i3 - i19, StandardCharsets.UTF_8);
                }
                int i20 = i3 + 1;
                byte b7 = bArr[i20];
                while (b7 <= 32 && ((1 << b7) & 4294981376L) != 0) {
                    i20++;
                    b7 = bArr[i20];
                }
                this.e = b7 == 44;
                this.c = i20 + 1;
                if (b7 == 44) {
                    D();
                } else {
                    this.d = (char) b7;
                }
                this.s = str;
                return;
            } else {
                i3++;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[LOOP:2: B:25:0x0052->B:31:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1 A[LOOP:3: B:46:0x0093->B:52:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012b A[LOOP:1: B:90:0x011e->B:95:0x012b, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005d -> B:23:0x004d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x009e -> B:44:0x008e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0132 -> B:89:0x011d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date f() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.f():java.util.Date");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean g() {
        if (this.d == 'n' && this.c + 2 < this.z && this.m[this.c] == 117) {
            aE();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[LOOP:0: B:11:0x001a->B:28:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0013 A[EDGE_INSN: B:29:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0046 -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n() {
        /*
            r10 = this;
            char r0 = r10.d
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r10.m
            int r1 = r10.c
            int r2 = r10.z
            r3 = 26
            if (r1 != r2) goto L16
            r2 = r1
        L13:
            r1 = 26
            goto L1a
        L16:
            int r2 = r1 + 1
            r1 = r0[r1]
        L1a:
            if (r1 == 0) goto L44
            r4 = 32
            if (r1 > r4) goto L30
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            goto L44
        L30:
            r0 = 1
            if (r1 >= 0) goto L37
            r10.c(r1, r2)
            return r0
        L37:
            char r3 = (char) r1
            r10.d = r3
            r10.c = r2
            r2 = 47
            if (r1 != r2) goto L43
            r10.W()
        L43:
            return r0
        L44:
            int r1 = r10.z
            if (r2 != r1) goto L49
            goto L13
        L49:
            int r1 = r2 + 1
            r2 = r0[r2]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.n():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
        c(r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[LOOP:0: B:26:0x0044->B:33:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072 A[LOOP:1: B:43:0x007b->B:56:0x0072, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x005a -> B:24:0x003d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0079 -> B:43:0x007b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o() {
        /*
            r19 = this;
            r0 = r19
            char r1 = r0.d
            int r2 = r0.z
            int r3 = r0.c
            byte[] r4 = r0.m
            r5 = 0
            r6 = 1
            r7 = 110(0x6e, float:1.54E-43)
            if (r1 != r7) goto L29
            int r7 = r3 + 2
            if (r7 >= r2) goto L29
            r8 = r4[r3]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L29
            int r8 = r3 + 1
            r8 = r4[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L29
            r7 = r4[r7]
            if (r7 != r9) goto L29
            int r3 = r3 + 3
            goto L38
        L29:
            r7 = 34
            if (r1 == r7) goto L31
            r7 = 39
            if (r1 != r7) goto L9a
        L31:
            if (r3 >= r2) goto L9a
            r7 = r4[r3]
            if (r7 != r1) goto L9a
            int r3 = r3 + r6
        L38:
            r1 = 26
            if (r3 != r2) goto L40
            r7 = r3
        L3d:
            r3 = 26
            goto L44
        L40:
            int r7 = r3 + 1
            r3 = r4[r3]
        L44:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r3 < 0) goto L67
            if (r3 > r14) goto L67
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r17 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r17 == 0) goto L67
            if (r7 != r2) goto L5d
            goto L3d
        L5d:
            int r3 = r7 + 1
            r7 = r4[r7]
            r18 = r7
            r7 = r3
            r3 = r18
            goto L44
        L67:
            r15 = 44
            if (r3 != r15) goto L6c
            r5 = 1
        L6c:
            r0.e = r5
            if (r5 == 0) goto L7b
            if (r7 != r2) goto L75
        L72:
            r3 = 26
            goto L7b
        L75:
            int r3 = r7 + 1
            r5 = r4[r7]
        L79:
            r7 = r3
            r3 = r5
        L7b:
            if (r3 < 0) goto L8e
            if (r3 > r14) goto L8e
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r5 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r5 == 0) goto L8e
            if (r7 != r2) goto L89
            goto L72
        L89:
            int r3 = r7 + 1
            r5 = r4[r7]
            goto L79
        L8e:
            if (r3 >= 0) goto L94
            r0.c(r3, r7)
            return r6
        L94:
            r0.c = r7
            char r1 = (char) r3
            r0.d = r1
            return r6
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[LOOP:0: B:11:0x001c->B:42:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0015 A[EDGE_INSN: B:44:0x0015->B:9:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0077 -> B:9:0x0015). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.d
            byte[] r2 = r0.m
            int r3 = r0.c
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 == r4) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = r0.z
            r4 = 26
            if (r3 != r1) goto L18
            r1 = r3
        L15:
            r3 = 26
            goto L1c
        L18:
            int r1 = r3 + 1
            r3 = r2[r3]
        L1c:
            if (r3 == 0) goto L75
            r5 = 0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r11 = 32
            if (r3 > r11) goto L33
            long r12 = r9 << r3
            long r12 = r12 & r7
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L33
            goto L75
        L33:
            r12 = 44
            r13 = 1
            if (r3 != r12) goto L62
            r0.e = r13
            int r3 = r0.z
            if (r1 != r3) goto L42
            r3 = r1
            r1 = 26
            goto L46
        L42:
            int r3 = r1 + 1
            r1 = r2[r1]
        L46:
            r16 = r3
            r3 = r1
            r1 = r16
        L4b:
            if (r3 == 0) goto L56
            if (r3 > r11) goto L62
            long r14 = r9 << r3
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L62
        L56:
            int r3 = r0.z
            if (r1 != r3) goto L5d
            r3 = 26
            goto L4b
        L5d:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L46
        L62:
            if (r3 >= 0) goto L68
            r0.c(r3, r1)
            return r13
        L68:
            char r2 = (char) r3
            r0.d = r2
            r0.c = r1
            r1 = 47
            if (r3 != r1) goto L74
            r17.W()
        L74:
            return r13
        L75:
            int r3 = r0.z
            if (r1 != r3) goto L7a
            goto L15
        L7a:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.p():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[LOOP:0: B:11:0x001a->B:28:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0013 A[EDGE_INSN: B:29:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0046 -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            r10 = this;
            char r0 = r10.d
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r10.m
            int r1 = r10.c
            int r2 = r10.z
            r3 = 26
            if (r1 != r2) goto L16
            r2 = r1
        L13:
            r1 = 26
            goto L1a
        L16:
            int r2 = r1 + 1
            r1 = r0[r1]
        L1a:
            if (r1 == 0) goto L44
            r4 = 32
            if (r1 > r4) goto L30
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            goto L44
        L30:
            r0 = 1
            if (r1 >= 0) goto L37
            r10.c(r1, r2)
            return r0
        L37:
            char r3 = (char) r1
            r10.d = r3
            r10.c = r2
            r2 = 47
            if (r1 != r2) goto L43
            r10.W()
        L43:
            return r0
        L44:
            int r1 = r10.z
            if (r2 != r1) goto L49
            goto L13
        L49:
            int r1 = r2 + 1
            r2 = r0[r2]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.q():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[LOOP:0: B:11:0x001c->B:42:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0015 A[EDGE_INSN: B:44:0x0015->B:9:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0077 -> B:9:0x0015). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.d
            byte[] r2 = r0.m
            int r3 = r0.c
            r4 = 93
            if (r1 == r4) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = r0.z
            r4 = 26
            if (r3 != r1) goto L18
            r1 = r3
        L15:
            r3 = 26
            goto L1c
        L18:
            int r1 = r3 + 1
            r3 = r2[r3]
        L1c:
            if (r3 == 0) goto L75
            r5 = 0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r11 = 32
            if (r3 > r11) goto L33
            long r12 = r9 << r3
            long r12 = r12 & r7
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L33
            goto L75
        L33:
            r12 = 44
            r13 = 1
            if (r3 != r12) goto L62
            r0.e = r13
            int r3 = r0.z
            if (r1 != r3) goto L42
            r3 = r1
            r1 = 26
            goto L46
        L42:
            int r3 = r1 + 1
            r1 = r2[r1]
        L46:
            r16 = r3
            r3 = r1
            r1 = r16
        L4b:
            if (r3 == 0) goto L56
            if (r3 > r11) goto L62
            long r14 = r9 << r3
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L62
        L56:
            int r3 = r0.z
            if (r1 != r3) goto L5d
            r3 = 26
            goto L4b
        L5d:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L46
        L62:
            if (r3 >= 0) goto L68
            r0.c(r3, r1)
            return r13
        L68:
            char r2 = (char) r3
            r0.d = r2
            r0.c = r1
            r1 = 47
            if (r3 != r1) goto L74
            r17.W()
        L74:
            return r13
        L75:
            int r3 = r0.z
            if (r1 != r3) goto L7a
            goto L15
        L7a:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.r():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[LOOP:1: B:20:0x003d->B:36:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0036 A[EDGE_INSN: B:45:0x0036->B:18:0x0036 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x005f -> B:18:0x0036). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            r15 = this;
            byte[] r0 = r15.m
            int r1 = r15.c
            char r2 = r15.d
        L6:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2b
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L2b
            int r2 = r15.z
            if (r1 != r2) goto L23
            r2 = 26
            goto L6
        L23:
            int r2 = r1 + 1
            r1 = r0[r1]
            r14 = r2
            r2 = r1
            r1 = r14
            goto L6
        L2b:
            r11 = 44
            if (r2 == r11) goto L31
            r0 = 0
            return r0
        L31:
            int r2 = r15.z
            if (r1 != r2) goto L39
            r2 = r1
        L36:
            r1 = 26
            goto L3d
        L39:
            int r2 = r1 + 1
            r1 = r0[r1]
        L3d:
            if (r1 == 0) goto L5d
            if (r1 > r9) goto L49
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L49
            goto L5d
        L49:
            r0 = 1
            if (r1 >= 0) goto L50
            r15.c(r1, r2)
            return r0
        L50:
            r15.c = r2
            char r2 = (char) r1
            r15.d = r2
            r2 = 47
            if (r1 != r2) goto L5c
            r15.W()
        L5c:
            return r0
        L5d:
            int r1 = r15.z
            if (r2 != r1) goto L62
            goto L36
        L62:
            int r1 = r2 + 1
            r2 = r0[r2]
            r14 = r2
            r2 = r1
            r1 = r14
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.s():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        r2 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00af, code lost:
        if (r2 >= r17.z) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
        if (r1[r2] != 35) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b8, code lost:
        r17.E = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ba, code lost:
        return true;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u() {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.u():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[LOOP:1: B:22:0x0058->B:28:0x0066, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0063 -> B:20:0x0051). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String v() {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.c.v():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean w() {
        return this.d == '[';
    }
}
