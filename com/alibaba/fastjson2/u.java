package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.e;
import java.nio.charset.StandardCharsets;
import tb.crd;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class u extends JSONReader {
    protected int A;
    protected int B;
    protected int C;
    protected boolean D;
    protected int E;
    protected int F;
    protected boolean G;
    protected byte[] H;
    protected int I;
    protected final JSONFactory.CacheItem K;
    protected char[] m;
    protected int x;
    protected int z;

    static {
        kge.a(-603516337);
    }

    public u(JSONReader.c cVar, boolean z) {
        super(cVar, z);
        this.K = JSONFactory.t[System.identityHashCode(Thread.currentThread()) & (JSONFactory.t.length - 1)];
        this.H = JSONFactory.v.getAndSet(this.K, null);
        if (this.H == null) {
            this.H = new byte[cVar.m];
        }
    }

    static int a(int i, int i2, int i3) {
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

    static int b(int i, int i2, int i3, int i4) {
        if ((i2 & crd.DETECT_WIDTH) == 128 && (i3 & crd.DETECT_WIDTH) == 128) {
            return ((i & 15) << 12) | ((i2 & 63) << 6) | (i3 & 63);
        }
        throw new JSONException("malformed input around byte " + i4);
    }

    private byte[] b(int i, int i2) {
        int i3;
        if (!this.G && ((i3 = this.F) == 0 || i + i2 >= i3 - 1)) {
            aT();
        }
        return this.H;
    }

    private byte d(int i) {
        int i2;
        if (!this.G && ((i2 = this.F) == 0 || i >= i2 - 1)) {
            aT();
        }
        return this.H[i];
    }

    private boolean e(int i) {
        return !this.G || i < this.x;
    }

    private boolean f(int i) {
        return this.G && i >= this.z;
    }

    private void g(int i, int i2) {
        int i3;
        int i4;
        int i5 = i & 255;
        switch (i5 >> 4) {
            case 12:
            case 13:
                int i6 = i2 + 1;
                int a2 = a(i5, d(i2), i6);
                i3 = i6;
                i4 = a2;
                break;
            case 14:
                i4 = b(i5, d(i2), d(i2 + 1), i2);
                i3 = i2 + 2;
                break;
            default:
                if ((i >> 3) != -2) {
                    throw new JSONException("malformed input around byte " + i2);
                }
                i4 = (((i << 18) ^ (d(i2) << 12)) ^ (d(i2 + 1) << 6)) ^ (3678080 ^ d(i2 + 2));
                i3 = i2 + 3;
                break;
        }
        this.d = (char) i4;
        this.c = i3;
    }

    private boolean g(int i) {
        return this.G && i == this.z;
    }

    private boolean h(int i) {
        return this.G && i > this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[LOOP:0: B:15:0x0034->B:22:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:13:0x002b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A() {
        /*
            r9 = this;
            int r0 = r9.c
            char r1 = r9.d
            r2 = 83
            if (r1 != r2) goto L5f
            int r1 = r0 + 1
            boolean r2 = r9.f(r1)
            if (r2 != 0) goto L5f
            byte r2 = r9.d(r0)
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L5f
            byte r1 = r9.d(r1)
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L5f
            int r0 = r0 + 2
            boolean r1 = r9.g(r0)
            r2 = 26
            if (r1 == 0) goto L2e
            r1 = r0
        L2b:
            r0 = 26
            goto L34
        L2e:
            int r1 = r0 + 1
            byte r0 = r9.d(r0)
        L34:
            r3 = 32
            if (r0 > r3) goto L58
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L58
            boolean r0 = r9.g(r1)
            if (r0 == 0) goto L4e
            goto L2b
        L4e:
            int r0 = r1 + 1
            byte r1 = r9.d(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L34
        L58:
            r9.c = r1
            char r0 = (char) r0
            r9.d = r0
            r0 = 1
            return r0
        L5f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[LOOP:0: B:25:0x0062->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0079 -> B:23:0x0059). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            r9 = this;
            int r0 = r9.c
            char r1 = r9.d
            r2 = 73
            if (r1 != r2) goto L8d
            int r1 = r0 + 6
            boolean r2 = r9.f(r1)
            if (r2 != 0) goto L8d
            byte r2 = r9.d(r0)
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 != r3) goto L8d
            int r2 = r0 + 1
            byte r2 = r9.d(r2)
            r4 = 102(0x66, float:1.43E-43)
            if (r2 != r4) goto L8d
            int r2 = r0 + 2
            byte r2 = r9.d(r2)
            r4 = 105(0x69, float:1.47E-43)
            if (r2 != r4) goto L8d
            int r2 = r0 + 3
            byte r2 = r9.d(r2)
            if (r2 != r3) goto L8d
            int r2 = r0 + 4
            byte r2 = r9.d(r2)
            if (r2 != r4) goto L8d
            int r2 = r0 + 5
            byte r2 = r9.d(r2)
            r3 = 116(0x74, float:1.63E-43)
            if (r2 != r3) goto L8d
            byte r1 = r9.d(r1)
            r2 = 121(0x79, float:1.7E-43)
            if (r1 != r2) goto L8d
            int r0 = r0 + 7
            boolean r1 = r9.g(r0)
            r2 = 26
            if (r1 == 0) goto L5c
            r1 = r0
        L59:
            r0 = 26
            goto L62
        L5c:
            int r1 = r0 + 1
            byte r0 = r9.d(r0)
        L62:
            r3 = 32
            if (r0 > r3) goto L86
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L86
            boolean r0 = r9.g(r1)
            if (r0 == 0) goto L7c
            goto L59
        L7c:
            int r0 = r1 + 1
            byte r1 = r9.d(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L62
        L86:
            r9.c = r1
            char r0 = (char) r0
            r9.d = r0
            r0 = 1
            return r0
        L8d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.B():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[LOOP:0: B:7:0x0014->B:23:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x000b A[EDGE_INSN: B:24:0x000b->B:5:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:5:0x000b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D() {
        /*
            r9 = this;
            int r0 = r9.c
            boolean r1 = r9.f(r0)
            r2 = 26
            if (r1 == 0) goto Le
            r1 = r0
        Lb:
            r0 = 26
            goto L14
        Le:
            int r1 = r0 + 1
            byte r0 = r9.d(r0)
        L14:
            if (r0 == 0) goto L3d
            r3 = 32
            if (r0 > r3) goto L2a
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L2a
            goto L3d
        L2a:
            if (r0 >= 0) goto L30
            r9.g(r0, r1)
            return
        L30:
            r9.c = r1
            char r1 = (char) r0
            r9.d = r1
            r1 = 47
            if (r0 != r1) goto L3c
            r9.W()
        L3c:
            return
        L3d:
            boolean r0 = r9.g(r1)
            if (r0 == 0) goto L44
            goto Lb
        L44:
            int r0 = r1 + 1
            byte r1 = r9.d(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0288, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x016b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c A[LOOP:2: B:70:0x0174->B:76:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c4 A[LOOP:3: B:87:0x01ad->B:92:0x01c4, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0189 -> B:68:0x016b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01c7 -> B:86:0x01ab). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long E() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.E():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02a8, code lost:
        if (r5 == (-62)) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03db A[LOOP:2: B:214:0x03c3->B:220:0x03db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0413 A[LOOP:3: B:228:0x03fb->B:234:0x0413, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:218:0x03d8 -> B:212:0x03ba). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x0410 -> B:226:0x03f2). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long G() {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.G():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long H() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.H():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (g(r3) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r1 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        r1 = r3 + 1;
        r3 = d(r3);
        r3 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r1 > 32) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
        if (((1 << r1) & 4294981376L) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
        if (g(r3) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r22.c = r3;
        r22.d = (char) r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x008d -> B:40:0x0098). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ad -> B:38:0x008a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String I() {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.I():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String J() {
        int i;
        int i2 = this.B - this.A;
        if (!this.f) {
            return this.D ? c(this.A, i2) : new String(b(this.A, i2), this.A, i2, StandardCharsets.UTF_8);
        }
        char[] cArr = this.m;
        if (cArr == null) {
            cArr = JSONFactory.u.getAndSet(this.K, null);
            this.m = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[this.C];
            this.m = cArr;
        }
        int i3 = this.A;
        int i4 = 0;
        while (i3 < this.B) {
            int d = d(i3);
            if (d < 0) {
                int i5 = d & 255;
                switch (i5 >> 4) {
                    case 12:
                    case 13:
                        byte d2 = d(i3 + 1);
                        if ((d2 & 192) != 128) {
                            throw new JSONException("malformed input around byte " + i3);
                        }
                        i = ((i5 & 31) << 6) | (d2 & 63);
                        i3 += 2;
                        break;
                    case 14:
                        byte d3 = d(i3 + 1);
                        int i6 = i3 + 2;
                        byte d4 = d(i6);
                        if ((d3 & 192) != 128 || (d4 & 192) != 128) {
                            throw new JSONException("malformed input around byte " + i6);
                        }
                        i = ((i5 & 15) << 12) | ((d3 & 63) << 6) | (d4 & 63);
                        i3 += 3;
                        break;
                    default:
                        throw new JSONException("malformed input around byte " + i3);
                }
                cArr[i4] = (char) i;
            } else {
                if (d == 92) {
                    i3++;
                    d = (char) d(i3);
                    if (d != 34 && d != 58 && d != 64 && d != 92) {
                        if (d == 117) {
                            i3 += 4;
                            d = a(d(i3 + 1), d(i3 + 2), d(i3 + 3), d(i3));
                        } else if (d == 120) {
                            i3 += 2;
                            d = a(d(i3 + 1), d(i3));
                        } else if (d != 42 && d != 43) {
                            switch (d) {
                                case 45:
                                case 46:
                                case 47:
                                    break;
                                default:
                                    switch (d) {
                                        case 60:
                                        case 61:
                                        case 62:
                                            break;
                                        default:
                                            d = a(d);
                                            break;
                                    }
                            }
                        }
                    }
                } else if (d == 34) {
                    return new String(cArr, 0, this.C);
                }
                cArr[i4] = (char) d;
                i3++;
            }
            i4++;
        }
        return new String(cArr, 0, this.C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0315, code lost:
        if (r3 != 26) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0317, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0319, code lost:
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x031b, code lost:
        r22.B = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x031d, code lost:
        if (r3 > 32) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x032d, code lost:
        if (((1 << r3) & 4294981376L) == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0333, code lost:
        if (g(r2) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0335, code lost:
        r3 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0338, code lost:
        r3 = d(r2);
        r2 = r2 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [char] */
    /* JADX WARN: Type inference failed for: r2v43, types: [char] */
    /* JADX WARN: Type inference failed for: r3v0, types: [char] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long L() {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.L():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x024e, code lost:
        if (g(r1) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0252, code lost:
        r0 = r1 + 1;
        r1 = d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0290, code lost:
        if (g(r2) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02ab, code lost:
        if (g(r1) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (g(r0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        r0 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        r1 = r0 + 1;
        r0 = d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
        if (g(r0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
        if (g(r2) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cb, code lost:
        r0 = r2 + 1;
        r1 = d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
        r14 = r1;
        r1 = r0;
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
        if (g(r2) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013d, code lost:
        if (g(r2) != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02d9 A[LOOP:1: B:227:0x02c0->B:233:0x02d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:219:0x02ab -> B:25:0x004e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x02dc -> B:226:0x02bd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00d1 -> B:214:0x0294). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00f9 A[EDGE_INSN: B:104:0x00f9->B:69:0x00f9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0124 A[LOOP:3: B:71:0x0102->B:83:0x0124, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0065 -> B:18:0x0047). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0121 -> B:69:0x00f9). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] P() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.P():byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
        if (g(r11) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d2, code lost:
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d5, code lost:
        r4 = d(r11);
        r11 = r11 + 1;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f6, code lost:
        if (g(r11) != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a A[LOOP:1: B:92:0x010b->B:97:0x011a, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x00d5 -> B:77:0x00dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00f6 -> B:75:0x00d2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x011d -> B:91:0x0109). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int R() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.R():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00db, code lost:
        if (g(r11) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00dd, code lost:
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
        r3 = d(r11);
        r11 = r11 + 1;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
        if (g(r11) != false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125 A[LOOP:1: B:96:0x0116->B:101:0x0125, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [char, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0128 -> B:95:0x0114). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x00e0 -> B:81:0x00e8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0101 -> B:79:0x00dd). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer T() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.T():java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r1 == 10) goto L14;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() {
        /*
            r11 = this;
            int r0 = r11.c
            int r1 = r0 + 1
            boolean r2 = r11.f(r1)
            if (r2 != 0) goto L86
            byte r0 = r11.d(r0)
            r2 = 42
            r3 = 0
            r4 = 47
            r5 = 1
            if (r0 != r2) goto L18
            r0 = 1
            goto L1b
        L18:
            if (r0 != r4) goto L85
            r0 = 0
        L1b:
            int r6 = r1 + 1
            byte r1 = r11.d(r1)
        L21:
            if (r0 == 0) goto L37
            if (r1 != r2) goto L35
            boolean r1 = r11.h(r6)
            if (r1 != 0) goto L35
            byte r1 = r11.d(r6)
            if (r1 != r4) goto L35
            int r6 = r6 + 1
        L33:
            r1 = 1
            goto L3c
        L35:
            r1 = 0
            goto L3c
        L37:
            r7 = 10
            if (r1 != r7) goto L35
            goto L33
        L3c:
            r7 = 26
            if (r1 == 0) goto L6a
            boolean r0 = r11.f(r6)
            if (r0 == 0) goto L47
            goto L70
        L47:
            byte r0 = r11.d(r6)
            r1 = 32
            if (r0 > r1) goto L67
            r1 = 1
            long r1 = r1 << r0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r1 = r1 & r8
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L67
            int r6 = r6 + 1
            boolean r0 = r11.f(r6)
            if (r0 == 0) goto L47
            goto L68
        L67:
            r7 = r0
        L68:
            int r6 = r6 + r5
            goto L70
        L6a:
            boolean r1 = r11.f(r6)
            if (r1 == 0) goto L7b
        L70:
            char r0 = (char) r7
            r11.d = r0
            r11.c = r6
            if (r7 != r4) goto L7a
            r11.W()
        L7a:
            return
        L7b:
            int r1 = r6 + 1
            byte r6 = r11.d(r6)
            r10 = r6
            r6 = r1
            r1 = r10
            goto L21
        L85:
            return
        L86:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = r11.aR()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.W():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dd, code lost:
        if (g(r1) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00df, code lost:
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e2, code lost:
        r2 = d(r1);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0104, code lost:
        if (g(r1) != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v17, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x00e2 -> B:78:0x00ed). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0104 -> B:76:0x00df). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Y() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.Y():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ec, code lost:
        if (g(r1) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ee, code lost:
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f1, code lost:
        r2 = d(r1);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0113, code lost:
        if (g(r1) != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v17, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00f1 -> B:83:0x00fc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0113 -> B:81:0x00ee). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Long Z() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.Z():java.lang.Long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[LOOP:1: B:19:0x0041->B:35:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0038 A[EDGE_INSN: B:44:0x0038->B:17:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0065 -> B:17:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(char r15) {
        /*
            r14 = this;
            int r0 = r14.c
            char r1 = r14.d
        L4:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            r9 = 26
            if (r1 > r8) goto L2d
            long r10 = r6 << r1
            long r10 = r10 & r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L2d
            boolean r1 = r14.g(r0)
            if (r1 == 0) goto L23
            r1 = 26
            goto L4
        L23:
            int r1 = r0 + 1
            byte r0 = r14.d(r0)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L4
        L2d:
            if (r1 == r15) goto L31
            r15 = 0
            return r15
        L31:
            boolean r15 = r14.g(r0)
            if (r15 == 0) goto L3b
            r15 = r0
        L38:
            r0 = 26
            goto L41
        L3b:
            int r15 = r0 + 1
            byte r0 = r14.d(r0)
        L41:
            if (r0 == 0) goto L61
            if (r0 > r8) goto L4d
            long r10 = r6 << r0
            long r10 = r10 & r4
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L4d
            goto L61
        L4d:
            r1 = 1
            if (r0 >= 0) goto L54
            r14.g(r0, r15)
            return r1
        L54:
            r14.c = r15
            char r15 = (char) r0
            r14.d = r15
            r15 = 47
            if (r0 != r15) goto L60
            r14.W()
        L60:
            return r1
        L61:
            boolean r0 = r14.g(r15)
            if (r0 == 0) goto L68
            goto L38
        L68:
            int r0 = r15 + 1
            byte r15 = r14.d(r15)
            r13 = r0
            r0 = r15
            r15 = r13
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.a(char):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[LOOP:0: B:21:0x0041->B:28:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:19:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(char r6, char r7, char r8, char r9, char r10) {
        /*
            r5 = this;
            char r0 = r5.d
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            int r6 = r5.c
            int r0 = r6 + 4
            boolean r2 = r5.h(r0)
            if (r2 != 0) goto L8d
            byte r2 = r5.d(r6)
            if (r2 != r7) goto L8d
            int r7 = r6 + 1
            byte r7 = r5.d(r7)
            if (r7 != r8) goto L8d
            int r7 = r6 + 2
            byte r7 = r5.d(r7)
            if (r7 != r9) goto L8d
            int r6 = r6 + 3
            byte r6 = r5.d(r6)
            if (r6 == r10) goto L2f
            goto L8d
        L2f:
            boolean r6 = r5.g(r0)
            r7 = 26
            if (r6 == 0) goto L3b
            r6 = r0
        L38:
            r8 = 26
            goto L41
        L3b:
            int r6 = r0 + 1
            byte r8 = r5.d(r0)
        L41:
            r9 = 32
            if (r8 > r9) goto L65
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r9 = r9 & r2
            r2 = 0
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L65
            boolean r8 = r5.g(r6)
            if (r8 == 0) goto L5b
            goto L38
        L5b:
            int r8 = r6 + 1
            byte r6 = r5.d(r6)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L41
        L65:
            int r9 = r5.c
            int r9 = r9 + 5
            if (r6 != r9) goto L86
            if (r8 == r7) goto L86
            r7 = 40
            if (r8 == r7) goto L86
            r7 = 91
            if (r8 == r7) goto L86
            r7 = 93
            if (r8 == r7) goto L86
            r7 = 41
            if (r8 == r7) goto L86
            r7 = 58
            if (r8 == r7) goto L86
            r7 = 44
            if (r8 == r7) goto L86
            return r1
        L86:
            r5.c = r6
            char r6 = (char) r8
            r5.d = r6
            r6 = 1
            return r6
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.a(char, char, char, char, char):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[LOOP:0: B:13:0x0030->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[LOOP:1: B:31:0x006c->B:36:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:11:0x0027). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x007e -> B:30:0x0069). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aE() {
        /*
            r14 = this;
            int r0 = r14.c
            byte r1 = r14.d(r0)
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L8b
            int r1 = r0 + 1
            byte r1 = r14.d(r1)
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L8b
            int r1 = r0 + 2
            byte r1 = r14.d(r1)
            if (r1 != r2) goto L8b
            int r0 = r0 + 3
            boolean r1 = r14.g(r0)
            r2 = 26
            if (r1 == 0) goto L2a
            r1 = r0
        L27:
            r0 = 26
            goto L30
        L2a:
            int r1 = r0 + 1
            byte r0 = r14.d(r0)
        L30:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            if (r0 > r9) goto L55
            long r10 = r7 << r0
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L55
            boolean r0 = r14.f(r1)
            if (r0 == 0) goto L4b
            goto L27
        L4b:
            int r0 = r1 + 1
            byte r1 = r14.d(r1)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L30
        L55:
            r10 = 44
            if (r0 != r10) goto L5b
            r10 = 1
            goto L5c
        L5b:
            r10 = 0
        L5c:
            r14.e = r10
            if (r10 == 0) goto L85
            boolean r0 = r14.f(r1)
            if (r0 == 0) goto L7e
            r0 = r1
            r1 = 26
        L69:
            r13 = r1
            r1 = r0
            r0 = r13
        L6c:
            if (r0 > r9) goto L85
            long r10 = r7 << r0
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L85
            boolean r0 = r14.f(r1)
            if (r0 == 0) goto L7e
            r0 = 26
            goto L6c
        L7e:
            int r0 = r1 + 1
            byte r1 = r14.d(r1)
            goto L69
        L85:
            char r0 = (char) r0
            r14.d = r0
            r14.c = r1
            return
        L8b:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "json syntax error, not match null"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.aE():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean aF() {
        int i;
        byte b;
        char c = this.d;
        int i2 = this.c;
        boolean z = false;
        if (c == 'n' && d(i2) == 117 && d(i2 + 1) == 108 && d(i2 + 2) == 108) {
            int i3 = i2 + 3;
            byte d = g(i3) ? (byte) 26 : (char) d(i3);
            int i4 = i2 + 4;
            while (d <= 32 && ((1 << d) & 4294981376L) != 0) {
                if (g(i4)) {
                    d = 26;
                } else {
                    int i5 = i4 + 1;
                    byte d2 = d(i4);
                    i4 = i5;
                    d = d2;
                }
            }
            if (d == 44) {
                z = true;
            }
            this.e = z;
            if (z) {
                if (g(i4)) {
                    i = i4;
                    b = 26;
                } else {
                    i = i4 + 1;
                    b = (char) d(i4);
                }
                loop1: while (true) {
                    byte b2 = b;
                    i4 = i;
                    d = b2;
                    while (d <= 32 && ((1 << d) & 4294981376L) != 0) {
                        if (g(i4)) {
                            d = 26;
                        }
                    }
                    i = i4 + 1;
                    b = d(i4);
                }
            }
            this.c = i4;
            this.d = (char) d;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r5);
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String aG() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.aG():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122 A[LOOP:0: B:73:0x0109->B:80:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150 A[LOOP:1: B:90:0x0141->B:95:0x0150, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x011f -> B:71:0x00ff). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0153 -> B:89:0x0140). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aL() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.aL():boolean");
    }

    public void aS() {
        D();
        if (this.d == '/') {
            W();
        }
    }

    protected abstract void aT();

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013e, code lost:
        throw new com.alibaba.fastjson2.JSONException("malformed input around byte " + r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void aV() {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.aV():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f A[LOOP:1: B:29:0x0056->B:36:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d A[LOOP:2: B:44:0x008d->B:50:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x006c -> B:27:0x004d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x009a -> B:42:0x0084). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aW() {
        /*
            r15 = this;
            char r0 = r15.d
            r1 = 0
            r3 = 1
            r4 = 34
            if (r0 == r4) goto L23
            r4 = 39
            if (r0 == r4) goto L23
            com.alibaba.fastjson2.JSONReader$c r0 = r15.f2934a
            long r4 = r0.p
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r6 = r0.mask
            long r4 = r4 & r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L1e
            r15.L()
            return r3
        L1e:
            com.alibaba.fastjson2.JSONException r0 = r15.aZ()
            throw r0
        L23:
            int r4 = r15.c
        L25:
            int r5 = r4 + 1
            byte r4 = r15.d(r4)
            r6 = 92
            if (r4 != r6) goto L42
            byte r4 = r15.d(r5)
            r6 = 117(0x75, float:1.64E-43)
            if (r4 != r6) goto L39
            r4 = 5
            goto L40
        L39:
            r6 = 120(0x78, float:1.68E-43)
            if (r4 != r6) goto L3f
            r4 = 3
            goto L40
        L3f:
            r4 = 1
        L40:
            int r4 = r4 + r5
            goto L25
        L42:
            if (r4 != r0) goto Lb2
            boolean r0 = r15.g(r5)
            r4 = 26
            if (r0 == 0) goto L50
            r0 = r5
        L4d:
            r5 = 26
            goto L56
        L50:
            int r0 = r5 + 1
            byte r5 = r15.d(r5)
        L56:
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            r8 = 1
            r10 = 32
            if (r5 > r10) goto L79
            long r11 = r8 << r5
            long r11 = r11 & r6
            int r13 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r13 == 0) goto L79
            boolean r5 = r15.g(r0)
            if (r5 == 0) goto L6f
            goto L4d
        L6f:
            int r5 = r0 + 1
            byte r0 = r15.d(r0)
            r14 = r5
            r5 = r0
            r0 = r14
            goto L56
        L79:
            r11 = 58
            if (r5 != r11) goto Lad
            boolean r5 = r15.g(r0)
            if (r5 == 0) goto L87
            r5 = r0
        L84:
            r0 = 26
            goto L8d
        L87:
            int r5 = r0 + 1
            byte r0 = r15.d(r0)
        L8d:
            if (r0 > r10) goto La7
            long r11 = r8 << r0
            long r11 = r11 & r6
            int r13 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r13 == 0) goto La7
            boolean r0 = r15.g(r5)
            if (r0 == 0) goto L9d
            goto L84
        L9d:
            int r0 = r5 + 1
            byte r5 = r15.d(r5)
            r14 = r5
            r5 = r0
            r0 = r14
            goto L8d
        La7:
            r15.c = r5
            char r0 = (char) r0
            r15.d = r0
            return r3
        Lad:
            com.alibaba.fastjson2.JSONException r0 = i(r5)
            throw r0
        Lb2:
            r4 = r5
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.aW():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d2, code lost:
        if (g(r2) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d4, code lost:
        r12 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d8, code lost:
        r12 = d(r2);
        r2 = r2 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024f, code lost:
        if (g(r2) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02f0, code lost:
        if (r26.j != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f2, code lost:
        r0 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f3, code lost:
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0307, code lost:
        if (r26.j != false) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[LOOP:5: B:15:0x0039->B:21:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x035a A[LOOP:2: B:216:0x0364->B:248:0x035a, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x035d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v36, types: [char] */
    /* JADX WARN: Type inference failed for: r2v0, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0046 -> B:13:0x0030). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:215:0x035d -> B:216:0x0364). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float aa() {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.aa():float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01af, code lost:
        r13 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b3, code lost:
        r13 = d(r2);
        r2 = r2 + 1;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (g(r15) != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0228, code lost:
        if (g(r2) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        r2 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        r2 = d(r15);
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r2 > 32) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (((1 << r2) & 4294981376L) == 0) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d5, code lost:
        if (r24.j != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02d7, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02d8, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02eb, code lost:
        if (r24.j != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (g(r15) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        r24.d = (char) r2;
        r24.c = r15;
        s();
        r24.h = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0350, code lost:
        if (g(r2) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0352, code lost:
        r13 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        return tb.mto.a.GEO_NOT_SUPPORT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0355, code lost:
        r13 = d(r2);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0378, code lost:
        if (g(r2) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ad, code lost:
        if (g(r2) != false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[LOOP:0: B:32:0x007a->B:43:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Type inference failed for: r13v34, types: [char] */
    /* JADX WARN: Type inference failed for: r2v0, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x003b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0049 -> B:12:0x0031). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0355 -> B:222:0x0360). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x0378 -> B:219:0x0352). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double ac() {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.ac():double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x02d8, code lost:
        if (r4 == 83) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02de, code lost:
        if (f(r15) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02e0, code lost:
        r4 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02e3, code lost:
        r3 = d(r15);
        r15 = r15 + 1;
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0302, code lost:
        if (g(r15) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0152, code lost:
        if (r8 == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
        r3 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0156, code lost:
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0157, code lost:
        r27.l = (short) r3;
        r27.k = 2;
        r4 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x032f A[LOOP:2: B:213:0x0318->B:219:0x032f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090 A[LOOP:0: B:26:0x005b->B:40:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x02e3 -> B:196:0x02ed). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x0302 -> B:193:0x02e0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0332 -> B:212:0x0317). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.math.BigDecimal ag() {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.ag():java.math.BigDecimal");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c A[LOOP:5: B:63:0x0126->B:69:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0139 -> B:61:0x011d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.UUID ah() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.ah():java.util.UUID");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int ak() {
        if (this.d == '\"' || this.d == '\'') {
            char c = this.d;
            int i = 0;
            int i2 = this.c;
            int i3 = i2 + 8;
            if (!f(i3) && e(i3) && d(i2) != c && d(i2 + 1) != c && d(i2 + 2) != c && d(i2 + 3) != c && d(i2 + 4) != c && d(i2 + 5) != c && d(i2 + 6) != c && d(i2 + 7) != c) {
                i = 8;
                i2 = i3;
            }
            while (!f(i2) && d(i2) != c) {
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
            com.alibaba.fastjson2.time.c f = DateUtils.f(b(this.c, 12), this.c);
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
            com.alibaba.fastjson2.time.c g = DateUtils.g(b(this.c, 14), this.c);
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
            com.alibaba.fastjson2.time.c h = DateUtils.h(b(this.c, 16), this.c);
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
            com.alibaba.fastjson2.time.c i = DateUtils.i(b(this.c, 17), this.c);
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
            com.alibaba.fastjson2.time.c j = DateUtils.j(b(this.c, 18), this.c);
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
            com.alibaba.fastjson2.time.c k = DateUtils.k(b(this.c, 19), this.c);
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
            com.alibaba.fastjson2.time.c l = DateUtils.l(b(this.c, 20), this.c);
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
            if (f(this.c + 18)) {
                this.h = true;
                return 0L;
            }
            long b = DateUtils.b(b(this.c, 19), this.c, this.f2934a.o);
            if (d(this.c + 19) != c) {
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
                com.alibaba.fastjson2.time.b b = DateUtils.b(b(this.c, 8), this.c);
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
                com.alibaba.fastjson2.time.b c = DateUtils.c(b(this.c, 9), this.c);
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
                com.alibaba.fastjson2.time.b d = DateUtils.d(b(this.c, 10), this.c);
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
            com.alibaba.fastjson2.time.b e = DateUtils.e(b(this.c, 11), this.c);
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

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0221, code lost:
        if (g(r5) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0223, code lost:
        r15 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0226, code lost:
        r12 = d(r5);
        r5 = r5 + 1;
        r15 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025b, code lost:
        if (g(r5) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0329, code lost:
        if (g(r5) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x032b, code lost:
        r15 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x032e, code lost:
        r12 = d(r5);
        r5 = r5 + 1;
        r15 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x034e, code lost:
        if (g(r5) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if (r17.q < (-214748364)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
        if (r17.q < (-214748364)) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[LOOP:4: B:15:0x0049->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec A[LOOP:0: B:42:0x00bc->B:55:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /* JADX WARN: Type inference failed for: r8v3, types: [char] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:13:0x0040). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x032e -> B:207:0x0336). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:212:0x034e -> B:205:0x032b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ay() {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.ay():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3 A[LOOP:2: B:95:0x01ab->B:102:0x01c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fa A[LOOP:3: B:112:0x01e3->B:118:0x01fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01c0 -> B:93:0x01a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01fd -> B:111:0x01e1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String az() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.az():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c b(int i) {
        if (z()) {
            com.alibaba.fastjson2.time.c a2 = DateUtils.a(b(this.c, i), this.c, i);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.alibaba.fastjson2.time.f c(int r5) {
        /*
            r4 = this;
            boolean r0 = r4.z()
            if (r0 == 0) goto Lab
            r0 = 19
            r1 = 0
            if (r5 >= r0) goto Lc
            return r1
        Lc:
            r0 = 30
            r2 = 29
            r3 = 90
            if (r5 != r0) goto L30
            int r0 = r4.c
            int r0 = r0 + r2
            byte r0 = r4.d(r0)
            if (r0 != r3) goto L30
            int r0 = r4.c
            byte[] r0 = r4.b(r0, r2)
            int r2 = r4.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.p(r0, r2)
        L29:
            com.alibaba.fastjson2.time.e r2 = com.alibaba.fastjson2.time.e.c
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.time.f.a(r0, r2)
            goto L8e
        L30:
            r0 = 28
            if (r5 != r2) goto L4a
            int r2 = r4.c
            int r2 = r2 + r0
            byte r2 = r4.d(r2)
            if (r2 != r3) goto L4a
            int r2 = r4.c
            byte[] r0 = r4.b(r2, r0)
            int r2 = r4.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.o(r0, r2)
            goto L29
        L4a:
            r2 = 27
            if (r5 != r0) goto L64
            int r0 = r4.c
            int r0 = r0 + r2
            byte r0 = r4.d(r0)
            if (r0 != r3) goto L64
            int r0 = r4.c
            byte[] r0 = r4.b(r0, r2)
            int r2 = r4.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.n(r0, r2)
            goto L29
        L64:
            if (r5 != r2) goto L7e
            int r0 = r4.c
            r2 = 26
            int r0 = r0 + r2
            byte r0 = r4.d(r0)
            if (r0 != r3) goto L7e
            int r0 = r4.c
            byte[] r0 = r4.b(r0, r2)
            int r2 = r4.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.m(r0, r2)
            goto L29
        L7e:
            int r0 = r4.c
            byte[] r0 = r4.b(r0, r5)
            int r2 = r4.c
            com.alibaba.fastjson2.JSONReader$c r3 = r4.f2934a
            com.alibaba.fastjson2.time.e r3 = r3.o
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.util.DateUtils.a(r0, r2, r5, r3)
        L8e:
            if (r0 != 0) goto L91
            return r1
        L91:
            int r1 = r4.c
            r2 = 1
            int r5 = r5 + r2
            int r1 = r1 + r5
            r4.c = r1
            r4.D()
            char r5 = r4.d
            r1 = 44
            if (r5 != r1) goto La2
            goto La3
        La2:
            r2 = 0
        La3:
            r4.e = r2
            if (r2 == 0) goto Laa
            r4.D()
        Laa:
            return r0
        Lab:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "date only support string input"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.c(int):com.alibaba.fastjson2.time.f");
    }

    final String c(int i, int i2) {
        if (e.ANDROID_SDK_INT >= 34) {
            return new String(b(i, i2), i, i2, StandardCharsets.ISO_8859_1);
        }
        char[] cArr = this.m;
        if (cArr == null) {
            cArr = JSONFactory.u.getAndSet(this.K, null);
            this.m = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
            this.m = cArr;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) (d(i + i3) & 255);
        }
        return new String(cArr, 0, i2);
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JSONFactory.CacheItem cacheItem = this.K;
        byte[] bArr = this.H;
        if (bArr != null && bArr.length < 1048576) {
            JSONFactory.v.lazySet(cacheItem, bArr);
        }
        char[] cArr = this.m;
        if (cArr == null || cArr.length >= 1048576) {
            return;
        }
        JSONFactory.u.lazySet(cacheItem, cArr);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final String d(String str) {
        char c;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c = '\n';
            if (i >= this.c || f(i)) {
                break;
            }
            if (d(i) == 10) {
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
        return sb.toString();
    }

    public final boolean e() {
        return this.d == 'n' && !f(this.c) && d(this.c) == 117;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[LOOP:2: B:25:0x006c->B:31:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[LOOP:3: B:46:0x00bf->B:52:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175 A[LOOP:1: B:89:0x0166->B:94:0x0175, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0079 -> B:23:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00cc -> B:44:0x00b8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0178 -> B:88:0x0161). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date f() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.f():java.util.Date");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean g() {
        if (this.d == 'n' && !f(this.c + 2) && d(this.c) == 117) {
            aE();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[LOOP:0: B:11:0x001c->B:28:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0013 A[EDGE_INSN: B:30:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x004a -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n() {
        /*
            r9 = this;
            char r0 = r9.d
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r9.c
            boolean r1 = r9.g(r0)
            r2 = 26
            if (r1 == 0) goto L16
            r1 = r0
        L13:
            r0 = 26
            goto L1c
        L16:
            int r1 = r0 + 1
            byte r0 = r9.d(r0)
        L1c:
            if (r0 == 0) goto L46
            r3 = 32
            if (r0 > r3) goto L32
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L32
            goto L46
        L32:
            r2 = 1
            if (r0 >= 0) goto L39
            r9.g(r0, r1)
            return r2
        L39:
            char r3 = (char) r0
            r9.d = r3
            r9.c = r1
            r1 = 47
            if (r0 != r1) goto L45
            r9.W()
        L45:
            return r2
        L46:
            boolean r0 = r9.g(r1)
            if (r0 == 0) goto L4d
            goto L13
        L4d:
            int r0 = r1 + 1
            byte r1 = r9.d(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.n():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
        g(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[LOOP:0: B:27:0x0057->B:35:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f A[LOOP:1: B:45:0x009d->B:58:0x008f, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:25:0x004d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0092 -> B:45:0x009d). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.d
            int r2 = r0.c
            r3 = 0
            r4 = 1
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 != r5) goto L2f
            int r5 = r2 + 2
            boolean r6 = r0.f(r5)
            if (r6 != 0) goto L2f
            byte r6 = r0.d(r2)
            r7 = 117(0x75, float:1.64E-43)
            if (r6 != r7) goto L2f
            int r6 = r2 + 1
            byte r6 = r0.d(r6)
            r7 = 108(0x6c, float:1.51E-43)
            if (r6 != r7) goto L2f
            byte r5 = r0.d(r5)
            if (r5 != r7) goto L2f
            int r2 = r2 + 3
            goto L44
        L2f:
            r5 = 34
            if (r1 == r5) goto L37
            r5 = 39
            if (r1 != r5) goto Lbb
        L37:
            boolean r5 = r0.f(r2)
            if (r5 != 0) goto Lbb
            byte r5 = r0.d(r2)
            if (r5 != r1) goto Lbb
            int r2 = r2 + r4
        L44:
            boolean r1 = r0.g(r2)
            r5 = 26
            if (r1 == 0) goto L50
            r1 = r2
        L4d:
            r2 = 26
            goto L57
        L50:
            int r1 = r2 + 1
            byte r2 = r0.d(r2)
            char r2 = (char) r2
        L57:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r2 < 0) goto L80
            if (r2 > r12) goto L80
            long r13 = r10 << r2
            long r13 = r13 & r8
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 == 0) goto L80
            boolean r2 = r0.g(r1)
            if (r2 == 0) goto L74
            goto L4d
        L74:
            int r2 = r1 + 1
            byte r1 = r0.d(r1)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L57
        L80:
            r13 = 44
            if (r2 != r13) goto L85
            r3 = 1
        L85:
            r0.e = r3
            if (r3 == 0) goto L9d
            boolean r2 = r0.g(r1)
            if (r2 == 0) goto L92
        L8f:
            r2 = 26
            goto L9d
        L92:
            int r2 = r1 + 1
            byte r1 = r0.d(r1)
            r16 = r2
            r2 = r1
            r1 = r16
        L9d:
            if (r2 < 0) goto Laf
            if (r2 > r12) goto Laf
            long r13 = r10 << r2
            long r13 = r13 & r8
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto Laf
            boolean r2 = r0.g(r1)
            if (r2 == 0) goto L92
            goto L8f
        Laf:
            if (r2 >= 0) goto Lb5
            r0.g(r2, r1)
            return r4
        Lb5:
            r0.c = r1
            char r1 = (char) r2
            r0.d = r1
            return r4
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057 A[LOOP:1: B:23:0x0046->B:29:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b A[LOOP:0: B:11:0x001c->B:41:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0013 A[EDGE_INSN: B:43:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a A[EDGE_INSN: B:46:0x005a->B:30:0x005a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x005a -> B:22:0x0043). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0078 -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() {
        /*
            r15 = this;
            char r0 = r15.d
            int r1 = r15.c
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 == r2) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = r15.g(r1)
            r2 = 26
            if (r0 == 0) goto L16
            r0 = r1
        L13:
            r1 = 26
            goto L1c
        L16:
            int r0 = r1 + 1
            byte r1 = r15.d(r1)
        L1c:
            if (r1 == 0) goto L74
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            if (r1 > r9) goto L33
            long r10 = r7 << r1
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L33
            goto L74
        L33:
            r10 = 44
            r11 = 1
            if (r1 != r10) goto L61
            r15.e = r11
            boolean r1 = r15.g(r0)
            if (r1 == 0) goto L5a
            r1 = r0
            r0 = 26
        L43:
            r14 = r1
            r1 = r0
            r0 = r14
        L46:
            if (r1 == 0) goto L51
            if (r1 > r9) goto L61
            long r12 = r7 << r1
            long r12 = r12 & r5
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto L61
        L51:
            boolean r1 = r15.g(r0)
            if (r1 == 0) goto L5a
            r1 = 26
            goto L46
        L5a:
            int r1 = r0 + 1
            byte r0 = r15.d(r0)
            goto L43
        L61:
            if (r1 >= 0) goto L67
            r15.g(r1, r0)
            return r11
        L67:
            char r2 = (char) r1
            r15.d = r2
            r15.c = r0
            r0 = 47
            if (r1 != r0) goto L73
            r15.W()
        L73:
            return r11
        L74:
            boolean r1 = r15.g(r0)
            if (r1 == 0) goto L7b
            goto L13
        L7b:
            int r1 = r0 + 1
            byte r0 = r15.d(r0)
            r14 = r1
            r1 = r0
            r0 = r14
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.p():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[LOOP:0: B:11:0x001c->B:28:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0013 A[EDGE_INSN: B:30:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x004a -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            r9 = this;
            char r0 = r9.d
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r9.c
            boolean r1 = r9.g(r0)
            r2 = 26
            if (r1 == 0) goto L16
            r1 = r0
        L13:
            r0 = 26
            goto L1c
        L16:
            int r1 = r0 + 1
            byte r0 = r9.d(r0)
        L1c:
            if (r0 == 0) goto L46
            r3 = 32
            if (r0 > r3) goto L32
            r3 = 1
            long r3 = r3 << r0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r3 = r3 & r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L32
            goto L46
        L32:
            r2 = 1
            if (r0 >= 0) goto L39
            r9.g(r0, r1)
            return r2
        L39:
            char r3 = (char) r0
            r9.d = r3
            r9.c = r1
            r1 = 47
            if (r0 != r1) goto L45
            r9.W()
        L45:
            return r2
        L46:
            boolean r0 = r9.g(r1)
            if (r0 == 0) goto L4d
            goto L13
        L4d:
            int r0 = r1 + 1
            byte r1 = r9.d(r1)
            r8 = r1
            r1 = r0
            r0 = r8
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.q():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057 A[LOOP:1: B:23:0x0046->B:29:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b A[LOOP:0: B:11:0x001c->B:41:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0013 A[EDGE_INSN: B:43:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a A[EDGE_INSN: B:46:0x005a->B:30:0x005a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x005a -> B:22:0x0043). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0078 -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r() {
        /*
            r15 = this;
            char r0 = r15.d
            int r1 = r15.c
            r2 = 93
            if (r0 == r2) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = r15.g(r1)
            r2 = 26
            if (r0 == 0) goto L16
            r0 = r1
        L13:
            r1 = 26
            goto L1c
        L16:
            int r0 = r1 + 1
            byte r1 = r15.d(r1)
        L1c:
            if (r1 == 0) goto L74
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            if (r1 > r9) goto L33
            long r10 = r7 << r1
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L33
            goto L74
        L33:
            r10 = 44
            r11 = 1
            if (r1 != r10) goto L61
            r15.e = r11
            boolean r1 = r15.g(r0)
            if (r1 == 0) goto L5a
            r1 = r0
            r0 = 26
        L43:
            r14 = r1
            r1 = r0
            r0 = r14
        L46:
            if (r1 == 0) goto L51
            if (r1 > r9) goto L61
            long r12 = r7 << r1
            long r12 = r12 & r5
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto L61
        L51:
            boolean r1 = r15.g(r0)
            if (r1 == 0) goto L5a
            r1 = 26
            goto L46
        L5a:
            int r1 = r0 + 1
            byte r0 = r15.d(r0)
            goto L43
        L61:
            if (r1 >= 0) goto L67
            r15.g(r1, r0)
            return r11
        L67:
            char r2 = (char) r1
            r15.d = r2
            r15.c = r0
            r0 = 47
            if (r1 != r0) goto L73
            r15.W()
        L73:
            return r11
        L74:
            boolean r1 = r15.g(r0)
            if (r1 == 0) goto L7b
            goto L13
        L7b:
            int r1 = r0 + 1
            byte r0 = r15.d(r0)
            r14 = r1
            r1 = r0
            r0 = r14
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.r():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[LOOP:1: B:20:0x0043->B:36:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003a A[EDGE_INSN: B:45:0x003a->B:18:0x003a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:18:0x003a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            r14 = this;
            int r0 = r14.c
            char r1 = r14.d
        L4:
            r2 = 0
            r4 = 4294981376(0x100003700, double:2.1220027474E-314)
            r6 = 1
            r8 = 32
            r9 = 26
            if (r1 > r8) goto L2d
            long r10 = r6 << r1
            long r10 = r10 & r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L2d
            boolean r1 = r14.g(r0)
            if (r1 == 0) goto L23
            r1 = 26
            goto L4
        L23:
            int r1 = r0 + 1
            byte r0 = r14.d(r0)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L4
        L2d:
            r10 = 44
            if (r1 == r10) goto L33
            r0 = 0
            return r0
        L33:
            boolean r1 = r14.g(r0)
            if (r1 == 0) goto L3d
            r1 = r0
        L3a:
            r0 = 26
            goto L43
        L3d:
            int r1 = r0 + 1
            byte r0 = r14.d(r0)
        L43:
            if (r0 == 0) goto L63
            if (r0 > r8) goto L4f
            long r10 = r6 << r0
            long r10 = r10 & r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 == 0) goto L4f
            goto L63
        L4f:
            r2 = 1
            if (r0 >= 0) goto L56
            r14.g(r0, r1)
            return r2
        L56:
            r14.c = r1
            char r1 = (char) r0
            r14.d = r1
            r1 = 47
            if (r0 != r1) goto L62
            r14.W()
        L62:
            return r2
        L63:
            boolean r0 = r14.g(r1)
            if (r0 == 0) goto L6a
            goto L3a
        L6a:
            int r0 = r1 + 1
            byte r1 = r14.d(r1)
            r13 = r1
            r1 = r0
            r0 = r13
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.s():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
        r0 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
        if (f(r0) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
        if (d(r0) != 35) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        r15.E = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
        return true;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u() {
        /*
            r15 = this;
            char r0 = r15.d
            int r1 = r15.c
            r2 = 0
            r3 = 123(0x7b, float:1.72E-43)
            if (r0 == r3) goto La
            return r2
        La:
            boolean r0 = r15.g(r1)
            if (r0 == 0) goto L11
            return r2
        L11:
            byte r0 = r15.d(r1)
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            if (r0 < 0) goto L34
            if (r0 > r9) goto L34
            long r10 = r7 << r0
            long r10 = r10 & r5
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L34
            int r1 = r1 + 1
            boolean r0 = r15.f(r1)
            if (r0 == 0) goto L11
            return r2
        L34:
            r10 = 34
            if (r0 == r10) goto L3c
            r10 = 39
            if (r0 != r10) goto Ld2
        L3c:
            int r10 = r15.c
            int r10 = r10 + 5
            boolean r10 = r15.f(r10)
            if (r10 != 0) goto Ld2
            int r10 = r1 + 1
            byte r10 = r15.d(r10)
            r11 = 36
            if (r10 != r11) goto Ld2
            int r10 = r1 + 2
            byte r10 = r15.d(r10)
            r11 = 114(0x72, float:1.6E-43)
            if (r10 != r11) goto Ld2
            int r10 = r1 + 3
            byte r10 = r15.d(r10)
            r11 = 101(0x65, float:1.42E-43)
            if (r10 != r11) goto Ld2
            int r10 = r1 + 4
            byte r10 = r15.d(r10)
            r11 = 102(0x66, float:1.43E-43)
            if (r10 != r11) goto Ld2
            int r10 = r1 + 5
            byte r10 = r15.d(r10)
            if (r10 != r0) goto Ld2
            int r1 = r1 + 6
            boolean r10 = r15.f(r1)
            if (r10 == 0) goto L7f
            goto Ld2
        L7f:
            byte r10 = r15.d(r1)
            if (r10 < 0) goto L97
            if (r10 > r9) goto L97
            long r11 = r7 << r10
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L97
            int r1 = r1 + 1
            boolean r10 = r15.f(r1)
            if (r10 == 0) goto L7f
            return r2
        L97:
            r11 = 58
            if (r10 != r11) goto Ld2
            r10 = 1
            int r1 = r1 + r10
            boolean r11 = r15.f(r1)
            if (r11 == 0) goto La4
            goto Ld2
        La4:
            byte r11 = r15.d(r1)
            if (r11 < 0) goto Lbc
            if (r11 > r9) goto Lbc
            long r12 = r7 << r11
            long r12 = r12 & r5
            int r14 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r14 == 0) goto Lbc
            int r1 = r1 + 1
            boolean r11 = r15.f(r1)
            if (r11 == 0) goto La4
            return r2
        Lbc:
            if (r11 != r0) goto Ld2
            int r0 = r1 + 1
            boolean r3 = r15.f(r0)
            if (r3 != 0) goto Lcf
            byte r0 = r15.d(r0)
            r3 = 35
            if (r0 != r3) goto Lcf
            goto Ld2
        Lcf:
            r15.E = r1
            return r10
        Ld2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.u():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[LOOP:1: B:22:0x0060->B:28:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[LOOP:2: B:39:0x0091->B:44:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006d -> B:20:0x0057). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a3 -> B:38:0x008e). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String v() {
        /*
            r15 = this;
            int r0 = r15.E
            boolean r0 = r15.g(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r15.E
            r15.c = r0
            int r0 = r15.c
            int r1 = r0 + 1
            r15.c = r1
            byte r0 = r15.d(r0)
            char r0 = (char) r0
            r15.d = r0
            java.lang.String r0 = r15.az()
            char r1 = r15.d
            int r2 = r15.c
        L23:
            r3 = 0
            r5 = 4294981376(0x100003700, double:2.1220027474E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r1 > r9) goto L4c
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L4c
            boolean r1 = r15.g(r2)
            if (r1 == 0) goto L42
            r1 = 26
            goto L23
        L42:
            int r1 = r2 + 1
            byte r2 = r15.d(r2)
            r14 = r2
            r2 = r1
            r1 = r14
            goto L23
        L4c:
            r11 = 125(0x7d, float:1.75E-43)
            if (r1 != r11) goto Lb0
            boolean r1 = r15.g(r2)
            if (r1 == 0) goto L5a
            r1 = r2
        L57:
            r2 = 26
            goto L60
        L5a:
            int r1 = r2 + 1
            byte r2 = r15.d(r2)
        L60:
            if (r2 > r9) goto L7a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L7a
            boolean r2 = r15.g(r1)
            if (r2 == 0) goto L70
            goto L57
        L70:
            int r2 = r1 + 1
            byte r1 = r15.d(r1)
            r14 = r2
            r2 = r1
            r1 = r14
            goto L60
        L7a:
            r11 = 44
            if (r2 != r11) goto L80
            r11 = 1
            goto L81
        L80:
            r11 = 0
        L81:
            r15.e = r11
            if (r11 == 0) goto Laa
            boolean r2 = r15.g(r1)
            if (r2 == 0) goto La3
            r2 = r1
            r1 = 26
        L8e:
            r14 = r2
            r2 = r1
            r1 = r14
        L91:
            if (r2 > r9) goto Laa
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto Laa
            boolean r2 = r15.g(r1)
            if (r2 == 0) goto La3
            r2 = 26
            goto L91
        La3:
            int r2 = r1 + 1
            byte r1 = r15.d(r1)
            goto L8e
        Laa:
            char r2 = (char) r2
            r15.d = r2
            r15.c = r1
            return r0
        Lb0:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "illegal reference : "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.u.v():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean w() {
        return this.d == '[';
    }
}
