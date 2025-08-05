package com.alibaba.fastjson2;

import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.util.DateUtils;
import java.io.Closeable;
import java.io.IOException;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o extends JSONReader {
    protected final int A;
    protected final int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private Closeable G;
    private int H;
    protected final String x;
    protected final char[] y;
    protected final int z;

    static {
        kge.a(142446687);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(JSONReader.c cVar, String str, int i, int i2) {
        super(cVar, false);
        this.H = -1;
        this.H = System.identityHashCode(Thread.currentThread()) & (JSONFactory.t.length - 1);
        JSONFactory.CacheItem cacheItem = JSONFactory.t[this.H];
        char[] andSet = JSONFactory.u.getAndSet(cacheItem, null);
        if (andSet == null || andSet.length < i2) {
            if (andSet != null) {
                JSONFactory.u.lazySet(cacheItem, andSet);
            }
            andSet = new char[Math.max(i2, 8192)];
        }
        str.getChars(i, i + i2, andSet, 0);
        this.x = i != 0 ? null : str;
        this.y = andSet;
        this.c = 0;
        this.z = i2;
        this.A = 0;
        this.B = this.z;
        if (this.c >= this.B) {
            this.d = JSONLexer.EOI;
            return;
        }
        char c = andSet[this.c];
        while (true) {
            this.d = c;
            if (this.d > ' ' || ((1 << this.d) & 4294981376L) == 0) {
                break;
            }
            this.c++;
            if (this.c >= this.z) {
                this.d = JSONLexer.EOI;
                return;
            }
            c = andSet[this.c];
        }
        this.c++;
        if (this.d == 65534 || this.d == 65279) {
            D();
        }
        if (this.d != '/') {
            return;
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(JSONReader.c cVar, String str, char[] cArr, int i, int i2) {
        super(cVar, false);
        this.H = -1;
        this.x = str;
        this.y = cArr;
        this.c = i;
        this.z = i2;
        this.A = i;
        this.B = i + i2;
        if (this.c >= this.B) {
            this.d = JSONLexer.EOI;
            return;
        }
        char c = cArr[this.c];
        while (true) {
            this.d = c;
            if (this.d > ' ' || ((1 << this.d) & 4294981376L) == 0) {
                break;
            }
            this.c++;
            if (this.c >= i2) {
                this.d = JSONLexer.EOI;
                return;
            }
            c = cArr[this.c];
        }
        this.c++;
        if (this.d == 65534 || this.d == 65279) {
            D();
        }
        if (this.d != '/') {
            return;
        }
        W();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        r2 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r2 > ' ') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (((1 << r2) & 4294981376L) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        r1 = r4 + 1;
        r2 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r2 != ',') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        r17.e = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
        if (r12 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
        if (r4 < r17.B) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
        r17.d = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
        r17.c = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
        r2 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
        if (r2 > ' ') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (((1 << r2) & 4294981376L) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r4 < r17.B) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
        r2 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
        r17.d = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0072 -> B:24:0x004c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void aU() {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.d
            int r2 = r0.c
            char[] r3 = r0.y
            int r4 = r2 + 1
            char r2 = r3[r2]
        Lc:
            r5 = 92
            if (r2 != r5) goto L40
            int r2 = r0.B
            if (r4 >= r2) goto L34
            int r2 = r4 + 1
            char r4 = r3[r4]
            if (r4 == r5) goto L2f
            r5 = 34
            if (r4 != r5) goto L1f
            goto L2f
        L1f:
            r5 = 117(0x75, float:1.64E-43)
            if (r4 != r5) goto L2a
            int r2 = r2 + 4
            int r4 = r2 + 1
            char r2 = r3[r2]
            goto Lc
        L2a:
            char r4 = r0.a(r4)
            goto L56
        L2f:
            int r4 = r2 + 1
            char r2 = r3[r2]
            goto Lc
        L34:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "illegal string, end"
            java.lang.String r2 = r0.d(r2)
            r1.<init>(r2)
            throw r1
        L40:
            r5 = 26
            if (r2 != r1) goto L4e
            int r1 = r0.B
            if (r4 >= r1) goto L5c
            int r1 = r4 + 1
            char r2 = r3[r4]
        L4c:
            r4 = r1
            goto L5e
        L4e:
            int r2 = r0.B
            if (r4 >= r2) goto L5c
            int r2 = r4 + 1
            char r4 = r3[r4]
        L56:
            r16 = r4
            r4 = r2
            r2 = r16
            goto Lc
        L5c:
            r2 = 26
        L5e:
            r6 = 0
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r1 = 32
            if (r2 > r1) goto L77
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 == 0) goto L77
            int r1 = r4 + 1
            char r2 = r3[r4]
            goto L4c
        L77:
            r12 = 44
            r13 = 1
            if (r2 != r12) goto L7e
            r12 = 1
            goto L7f
        L7e:
            r12 = 0
        L7f:
            r0.e = r12
            if (r12 == 0) goto La2
            int r2 = r0.B
            if (r4 < r2) goto L8c
        L87:
            r0.d = r5
        L89:
            r0.c = r4
            return
        L8c:
            char r2 = r3[r4]
        L8e:
            if (r2 > r1) goto La1
            long r14 = r10 << r2
            long r14 = r14 & r8
            int r12 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r12 == 0) goto La1
            int r4 = r4 + 1
            int r2 = r0.B
            if (r4 < r2) goto L9e
            goto L87
        L9e:
            char r2 = r3[r4]
            goto L8e
        La1:
            int r4 = r4 + r13
        La2:
            r0.d = r2
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.aU():void");
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
    public boolean A() {
        /*
            r10 = this;
            char[] r0 = r10.y
            int r1 = r10.c
            char r2 = r10.d
            r3 = 83
            if (r2 != r3) goto L50
            int r2 = r1 + 1
            int r3 = r10.B
            if (r2 >= r3) goto L50
            char r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L50
            char r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L50
            int r1 = r1 + 2
            r2 = 26
            if (r1 != r3) goto L26
            r3 = r1
        L23:
            r1 = 26
            goto L2a
        L26:
            int r3 = r1 + 1
            char r1 = r0[r1]
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
            int r1 = r10.B
            if (r3 != r1) goto L42
            goto L23
        L42:
            int r1 = r3 + 1
            char r3 = r0[r3]
            r9 = r3
            r3 = r1
            r1 = r9
            goto L2a
        L4a:
            r10.c = r3
            r10.d = r1
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.A():boolean");
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
    public boolean B() {
        /*
            r10 = this;
            char[] r0 = r10.y
            int r1 = r10.c
            char r2 = r10.d
            r3 = 73
            if (r2 != r3) goto L74
            int r2 = r1 + 6
            int r3 = r10.B
            if (r2 >= r3) goto L74
            char r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L74
            int r4 = r1 + 1
            char r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 2
            char r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 3
            char r4 = r0[r4]
            if (r4 != r5) goto L74
            int r4 = r1 + 4
            char r4 = r0[r4]
            if (r4 != r6) goto L74
            int r4 = r1 + 5
            char r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L74
            char r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L74
            int r1 = r1 + 7
            r2 = 26
            if (r1 != r3) goto L4a
            r3 = r1
        L47:
            r1 = 26
            goto L4e
        L4a:
            int r3 = r1 + 1
            char r1 = r0[r1]
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
            int r1 = r10.B
            if (r3 != r1) goto L66
            goto L47
        L66:
            int r1 = r3 + 1
            char r3 = r0[r3]
            r9 = r3
            r3 = r1
            r1 = r9
            goto L4e
        L6e:
            r10.c = r3
            r10.d = r1
            r0 = 1
            return r0
        L74:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.B():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[LOOP:0: B:7:0x0012->B:20:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x000b A[EDGE_INSN: B:22:0x000b->B:5:0x000b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0036 -> B:5:0x000b). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D() {
        /*
            r10 = this;
            int r0 = r10.c
            char[] r1 = r10.y
            int r2 = r10.B
            r3 = 26
            if (r0 < r2) goto Le
            r2 = r0
        Lb:
            r0 = 26
            goto L12
        Le:
            int r2 = r0 + 1
            char r0 = r1[r0]
        L12:
            if (r0 == 0) goto L34
            r4 = 32
            if (r0 > r4) goto L28
            r4 = 1
            long r4 = r4 << r0
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L28
            goto L34
        L28:
            r10.c = r2
            r10.d = r0
            r1 = 47
            if (r0 != r1) goto L33
            r10.W()
        L33:
            return
        L34:
            int r0 = r10.B
            if (r2 != r0) goto L39
            goto Lb
        L39:
            int r0 = r2 + 1
            char r2 = r1[r2]
            r9 = r2
            r2 = r0
            r0 = r9
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.D():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long E() {
        long j;
        char a2;
        long j2;
        long j3;
        char c = this.d;
        if (c == '\"' || c == '\'') {
            char[] cArr = this.y;
            this.f = false;
            int i = this.c;
            this.C = i;
            int i2 = this.B;
            long j4 = 0;
            int i3 = 0;
            while (true) {
                if (i < i2) {
                    char c2 = cArr[i];
                    if (c2 != c) {
                        if (c2 == '\\') {
                            this.f = true;
                            i++;
                            char c3 = cArr[i];
                            if (c3 == 'u') {
                                i += 4;
                                c2 = a(cArr[i + 1], cArr[i + 2], cArr[i + 3], cArr[i]);
                            } else if (c3 != 'x') {
                                c2 = a((int) c3);
                            } else {
                                i += 2;
                                c2 = a(cArr[i + 1], cArr[i]);
                            }
                        }
                        if (c2 <= 255 && i3 < 8 && (i3 != 0 || c2 != 0)) {
                            switch (i3) {
                                case 0:
                                    j4 = (byte) c2;
                                    continue;
                                    i++;
                                    i3++;
                                case 1:
                                    j2 = ((byte) c2) << 8;
                                    j3 = 255;
                                    break;
                                case 2:
                                    j2 = ((byte) c2) << 16;
                                    j3 = 65535;
                                    break;
                                case 3:
                                    j2 = ((byte) c2) << 24;
                                    j3 = 16777215;
                                    break;
                                case 4:
                                    j2 = ((byte) c2) << 32;
                                    j3 = 4294967295L;
                                    break;
                                case 5:
                                    j2 = ((byte) c2) << 40;
                                    j3 = 1099511627775L;
                                    break;
                                case 6:
                                    j2 = ((byte) c2) << 48;
                                    j3 = 281474976710655L;
                                    break;
                                case 7:
                                    j2 = ((byte) c2) << 56;
                                    j3 = 72057594037927935L;
                                    break;
                                default:
                                    i++;
                                    i3++;
                            }
                            j4 = j2 + (j4 & j3);
                            i++;
                            i3++;
                        }
                    } else if (i3 != 0) {
                        this.E = i3;
                        this.D = i;
                        i++;
                    }
                }
            }
            i = this.C;
            j4 = 0;
            if (j4 == 0) {
                j4 = -3750763034362895579L;
                int i4 = 0;
                while (true) {
                    char c4 = cArr[i];
                    if (c4 == '\\') {
                        this.f = true;
                        int i5 = i + 1;
                        char c5 = cArr[i5];
                        if (c5 == 'u') {
                            i5 += 4;
                            a2 = a(cArr[i5 + 1], cArr[i5 + 2], cArr[i5 + 3], cArr[i5]);
                        } else if (c5 != 'x') {
                            a2 = a((int) c5);
                        } else {
                            i5 += 2;
                            a2 = a(cArr[i5 + 1], cArr[i5]);
                        }
                        i = i5 + 1;
                        j4 = (a2 ^ j4) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
                        j = 0;
                    } else if (c4 == '\"') {
                        this.E = i4;
                        this.D = i;
                        this.s = null;
                        i++;
                    } else {
                        j = 0;
                        i++;
                        j4 = (c4 ^ j4) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
                    }
                    i4++;
                }
            }
            char c6 = i == i2 ? JSONLexer.EOI : cArr[i];
            while (c6 <= ' ' && ((1 << c6) & 4294981376L) != 0) {
                i++;
                c6 = cArr[i];
            }
            boolean z = c6 == ',';
            this.e = z;
            if (z) {
                i++;
                c6 = i == i2 ? JSONLexer.EOI : cArr[i];
                while (c6 <= ' ' && ((1 << c6) & 4294981376L) != 0) {
                    i++;
                    c6 = cArr[i];
                }
            }
            this.c = i + 1;
            this.d = c6;
            return j4;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042c A[LOOP:2: B:217:0x0416->B:223:0x042c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x040f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x0429 -> B:215:0x040f). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long G() {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.G():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0137, code lost:
        if (r7 > 'Z') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0139, code lost:
        r7 = (char) (r7 + ' ');
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long H() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.H():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String I() {
        char[] cArr;
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        o oVar;
        char[] cArr2;
        int i2;
        String str;
        char c = this.d;
        if (c != '\"' && c != '\'') {
            if ((this.f2934a.p & JSONReader.Feature.AllowUnQuotedFieldNames.mask) != 0 && j(c)) {
                return M();
            }
            return null;
        }
        char[] cArr3 = this.y;
        this.f = false;
        int i3 = this.c;
        this.C = i3;
        int i4 = this.B;
        int i5 = this.C;
        int i6 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            char c2 = cArr3[i3];
            if (c2 == '\\') {
                this.f = true;
                int i7 = i3 + 1;
                char c3 = cArr3[i7];
                if (c3 == 'u') {
                    i7 += 4;
                } else if (c3 == 'x') {
                    i7 += 2;
                }
                i3 = i7 + 1;
            } else if (c2 == c) {
                this.E = i6;
                this.D = i3;
                int i8 = i3 + 1;
                char c4 = i8 < i4 ? cArr3[i8] : JSONLexer.EOI;
                while (c4 <= ' ' && ((1 << c4) & 4294981376L) != 0) {
                    i8++;
                    c4 = cArr3[i8];
                }
                if (c4 != ':') {
                    throw new JSONException("syntax error : " + i8);
                }
                i3 = i8 + 1;
                char c5 = i3 == i4 ? JSONLexer.EOI : cArr3[i3];
                while (c5 <= ' ' && ((1 << c5) & 4294981376L) != 0) {
                    i3++;
                    c5 = cArr3[i3];
                }
                this.c = i3 + 1;
                this.d = c5;
            } else {
                i3++;
            }
            i6++;
        }
        if (this.D < i5) {
            throw new JSONException("syntax error : " + i3);
        } else if (this.f) {
            return J();
        } else {
            switch (this.E) {
                case 1:
                    cArr = cArr3;
                    i = i5;
                    char c6 = cArr[i];
                    if ((c6 & 255) == c6) {
                        j = c6;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                case 2:
                    cArr = cArr3;
                    i = i5;
                    char c7 = cArr[i];
                    char c8 = cArr[i + 1];
                    if ((c7 & 255) == c7 && (c8 & 255) == c8) {
                        j = (c8 << '\b') + c7;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 3:
                    cArr = cArr3;
                    i = i5;
                    char c9 = cArr[i];
                    char c10 = cArr[i + 1];
                    char c11 = cArr[i + 2];
                    if ((c9 & 255) == c9 && (c10 & 255) == c10 && (c11 & 255) == c11) {
                        j = (c11 << 16) + (c10 << '\b') + c9;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 4:
                    cArr = cArr3;
                    i = i5;
                    char c12 = cArr[i];
                    char c13 = cArr[i + 1];
                    char c14 = cArr[i + 2];
                    char c15 = cArr[i + 3];
                    if ((c12 & 255) == c12 && (c13 & 255) == c13 && (c14 & 255) == c14 && (c15 & 255) == c15) {
                        j = (c15 << 24) + (c14 << 16) + (c13 << '\b') + c12;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 5:
                    cArr = cArr3;
                    i = i5;
                    char c16 = cArr[i];
                    char c17 = cArr[i + 1];
                    char c18 = cArr[i + 2];
                    char c19 = cArr[i + 3];
                    char c20 = cArr[i + 4];
                    if ((c16 & 255) == c16 && (c17 & 255) == c17 && (c18 & 255) == c18 && (c19 & 255) == c19 && (c20 & 255) == c20) {
                        j = (c20 << 32) + (c19 << 24) + (c18 << 16) + (c17 << 8) + c16;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 6:
                    cArr = cArr3;
                    i = i5;
                    char c21 = cArr[i];
                    char c22 = cArr[i + 1];
                    char c23 = cArr[i + 2];
                    char c24 = cArr[i + 3];
                    char c25 = cArr[i + 4];
                    char c26 = cArr[i + 5];
                    if ((c21 & 255) == c21 && (c22 & 255) == c22 && (c23 & 255) == c23 && (c24 & 255) == c24 && (c25 & 255) == c25 && (c26 & 255) == c26) {
                        j = (c26 << 40) + (c25 << 32) + (c24 << 24) + (c23 << 16) + (c22 << 8) + c21;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 7:
                    cArr = cArr3;
                    i = i5;
                    char c27 = cArr[i];
                    char c28 = cArr[i + 1];
                    char c29 = cArr[i + 2];
                    char c30 = cArr[i + 3];
                    char c31 = cArr[i + 4];
                    char c32 = cArr[i + 5];
                    char c33 = cArr[i + 6];
                    if ((c27 & 255) == c27 && (c28 & 255) == c28 && (c29 & 255) == c29 && (c30 & 255) == c30 && (c31 & 255) == c31 && (c32 & 255) == c32 && (c33 & 255) == c33) {
                        j = (c33 << 48) + (c32 << 40) + (c31 << 32) + (c30 << 24) + (c29 << 16) + (c28 << 8) + c27;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 8:
                    cArr = cArr3;
                    i = i5;
                    char c34 = cArr[i];
                    char c35 = cArr[i + 1];
                    char c36 = cArr[i + 2];
                    char c37 = cArr[i + 3];
                    char c38 = cArr[i + 4];
                    char c39 = cArr[i + 5];
                    char c40 = cArr[i + 6];
                    char c41 = cArr[i + 7];
                    if ((c34 & 255) == c34 && (c35 & 255) == c35 && (c36 & 255) == c36 && (c37 & 255) == c37 && (c38 & 255) == c38 && (c39 & 255) == c39 && (c40 & 255) == c40 && (c41 & 255) == c41) {
                        j = (c41 << 56) + (c40 << 48) + (c39 << 40) + (c38 << 32) + (c37 << 24) + (c36 << 16) + (c35 << 8) + c34;
                        j2 = j;
                        j3 = -1;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 9:
                    cArr = cArr3;
                    i = i5;
                    char c42 = cArr[i];
                    char c43 = cArr[i + 1];
                    char c44 = cArr[i + 2];
                    char c45 = cArr[i + 3];
                    char c46 = cArr[i + 4];
                    char c47 = cArr[i + 5];
                    char c48 = cArr[i + 6];
                    char c49 = cArr[i + 7];
                    char c50 = cArr[i + 8];
                    if ((c42 & 255) == c42 && (c43 & 255) == c43 && (c44 & 255) == c44 && (c45 & 255) == c45 && (c46 & 255) == c46 && (c47 & 255) == c47 && (c48 & 255) == c48 && (c49 & 255) == c49 && (c50 & 255) == c50) {
                        j2 = c42;
                        j3 = c43 + (c50 << 56) + (c49 << 48) + (c48 << 40) + (c47 << 32) + (c46 << 24) + (c45 << 16) + (c44 << 8);
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 10:
                    cArr = cArr3;
                    i = i5;
                    char c51 = cArr[i];
                    char c52 = cArr[i + 1];
                    char c53 = cArr[i + 2];
                    char c54 = cArr[i + 3];
                    char c55 = cArr[i + 4];
                    char c56 = cArr[i + 5];
                    char c57 = cArr[i + 6];
                    char c58 = cArr[i + 7];
                    char c59 = cArr[i + 8];
                    char c60 = cArr[i + 9];
                    if ((c51 & 255) == c51 && (c52 & 255) == c52 && (c53 & 255) == c53 && (c54 & 255) == c54 && (c55 & 255) == c55 && (c56 & 255) == c56 && (c57 & 255) == c57 && (c58 & 255) == c58 && (c59 & 255) == c59 && (c60 & 255) == c60) {
                        j4 = (c52 << '\b') + c51;
                        j3 = (c60 << 56) + (c59 << 48) + (c58 << 40) + (c57 << 32) + (c56 << 24) + (c55 << 16) + (c54 << 8) + c53;
                        j2 = j4;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 11:
                    cArr = cArr3;
                    i = i5;
                    char c61 = cArr[i];
                    char c62 = cArr[i + 1];
                    char c63 = cArr[i + 2];
                    char c64 = cArr[i + 3];
                    char c65 = cArr[i + 4];
                    char c66 = cArr[i + 5];
                    char c67 = cArr[i + 6];
                    char c68 = cArr[i + 7];
                    char c69 = cArr[i + 8];
                    char c70 = cArr[i + 9];
                    char c71 = cArr[i + 10];
                    if ((c61 & 255) == c61 && (c62 & 255) == c62 && (c63 & 255) == c63 && (c64 & 255) == c64 && (c65 & 255) == c65 && (c66 & 255) == c66 && (c67 & 255) == c67 && (c68 & 255) == c68 && (c69 & 255) == c69 && (c70 & 255) == c70 && (c71 & 255) == c71) {
                        j4 = (c63 << 16) + (c62 << '\b') + c61;
                        j3 = (c71 << 56) + (c70 << 48) + (c69 << 40) + (c68 << 32) + (c67 << 24) + (c66 << 16) + (c65 << 8) + c64;
                        j2 = j4;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 12:
                    cArr = cArr3;
                    i = i5;
                    char c72 = cArr[i];
                    char c73 = cArr[i + 1];
                    char c74 = cArr[i + 2];
                    char c75 = cArr[i + 3];
                    char c76 = cArr[i + 4];
                    char c77 = cArr[i + 5];
                    char c78 = cArr[i + 6];
                    char c79 = cArr[i + 7];
                    char c80 = cArr[i + 8];
                    char c81 = cArr[i + 9];
                    char c82 = cArr[i + 10];
                    char c83 = cArr[i + 11];
                    if ((c72 & 255) == c72 && (c73 & 255) == c73 && (c74 & 255) == c74 && (c75 & 255) == c75 && (c76 & 255) == c76 && (c77 & 255) == c77 && (c78 & 255) == c78 && (c79 & 255) == c79 && (c80 & 255) == c80 && (c81 & 255) == c81 && (c82 & 255) == c82 && (c83 & 255) == c83) {
                        j4 = (c75 << 24) + (c74 << 16) + (c73 << '\b') + c72;
                        j3 = (c83 << 56) + (c82 << 48) + (c81 << 40) + (c80 << 32) + (c79 << 24) + (c78 << 16) + (c77 << 8) + c76;
                        j2 = j4;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 13:
                    cArr = cArr3;
                    i = i5;
                    char c84 = cArr[i];
                    char c85 = cArr[i + 1];
                    char c86 = cArr[i + 2];
                    char c87 = cArr[i + 3];
                    char c88 = cArr[i + 4];
                    char c89 = cArr[i + 5];
                    char c90 = cArr[i + 6];
                    char c91 = cArr[i + 7];
                    char c92 = cArr[i + 8];
                    char c93 = cArr[i + 9];
                    char c94 = cArr[i + 10];
                    char c95 = cArr[i + 11];
                    char c96 = cArr[i + 12];
                    if ((c84 & 255) == c84 && (c85 & 255) == c85 && (c86 & 255) == c86 && (c87 & 255) == c87 && (c88 & 255) == c88 && (c89 & 255) == c89 && (c90 & 255) == c90 && (c91 & 255) == c91 && (c92 & 255) == c92 && (c93 & 255) == c93 && (c94 & 255) == c94 && (c95 & 255) == c95 && (c96 & 255) == c96) {
                        j5 = (c88 << 32) + (c87 << 24) + (c86 << 16) + (c85 << 8) + c84;
                        j6 = (c96 << 56) + (c95 << 48) + (c94 << 40) + (c93 << 32) + (c92 << 24) + (c91 << 16) + (c90 << 8);
                        j7 = c89;
                        j3 = j6 + j7;
                        j2 = j5;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 14:
                    cArr = cArr3;
                    i = i5;
                    char c97 = cArr[i];
                    char c98 = cArr[i + 1];
                    char c99 = cArr[i + 2];
                    char c100 = cArr[i + 3];
                    char c101 = cArr[i + 4];
                    char c102 = cArr[i + 5];
                    char c103 = cArr[i + 6];
                    char c104 = cArr[i + 7];
                    char c105 = cArr[i + 8];
                    char c106 = cArr[i + 9];
                    char c107 = cArr[i + 10];
                    char c108 = cArr[i + 11];
                    char c109 = cArr[i + 12];
                    char c110 = cArr[i + 13];
                    if ((c97 & 255) == c97 && (c98 & 255) == c98 && (c99 & 255) == c99 && (c100 & 255) == c100 && (c101 & 255) == c101 && (c102 & 255) == c102 && (c103 & 255) == c103 && (c104 & 255) == c104 && (c105 & 255) == c105 && (c106 & 255) == c106 && (c107 & 255) == c107 && (c108 & 255) == c108 && (c109 & 255) == c109 && (c110 & 255) == c110) {
                        j5 = (c102 << 40) + (c101 << 32) + (c100 << 24) + (c99 << 16) + (c98 << 8) + c97;
                        j6 = (c110 << 56) + (c109 << 48) + (c108 << 40) + (c107 << 32) + (c106 << 24) + (c105 << 16) + (c104 << 8);
                        j7 = c103;
                        j3 = j6 + j7;
                        j2 = j5;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 15:
                    cArr = cArr3;
                    i = i5;
                    char c111 = cArr[i];
                    char c112 = cArr[i + 1];
                    char c113 = cArr[i + 2];
                    char c114 = cArr[i + 3];
                    char c115 = cArr[i + 4];
                    char c116 = cArr[i + 5];
                    char c117 = cArr[i + 6];
                    char c118 = cArr[i + 7];
                    char c119 = cArr[i + 8];
                    char c120 = cArr[i + 9];
                    char c121 = cArr[i + 10];
                    char c122 = cArr[i + 11];
                    char c123 = cArr[i + 12];
                    char c124 = cArr[i + 13];
                    char c125 = cArr[i + 14];
                    if ((c111 & 255) == c111 && (c112 & 255) == c112 && (c113 & 255) == c113 && (c114 & 255) == c114 && (c115 & 255) == c115 && (c116 & 255) == c116 && (c117 & 255) == c117 && (c118 & 255) == c118 && (c119 & 255) == c119 && (c120 & 255) == c120 && (c121 & 255) == c121 && (c122 & 255) == c122 && (c123 & 255) == c123 && (c124 & 255) == c124 && (c125 & 255) == c125) {
                        j5 = (c117 << 48) + (c116 << 40) + (c115 << 32) + (c114 << 24) + (c113 << 16) + (c112 << 8) + c111;
                        j6 = (c125 << 56) + (c124 << 48) + (c123 << 40) + (c122 << 32) + (c121 << 24) + (c120 << 16) + (c119 << 8);
                        j7 = c118;
                        j3 = j6 + j7;
                        j2 = j5;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                case 16:
                    char c126 = cArr3[i5];
                    char c127 = cArr3[i5 + 1];
                    char c128 = cArr3[i5 + 2];
                    char c129 = cArr3[i5 + 3];
                    char c130 = cArr3[i5 + 4];
                    char c131 = cArr3[i5 + 5];
                    char c132 = cArr3[i5 + 6];
                    char c133 = cArr3[i5 + 7];
                    char c134 = cArr3[i5 + 8];
                    char c135 = cArr3[i5 + 9];
                    char c136 = cArr3[i5 + 10];
                    char c137 = cArr3[i5 + 11];
                    char c138 = cArr3[i5 + 12];
                    char c139 = cArr3[i5 + 13];
                    char c140 = cArr3[i5 + 14];
                    i = i5;
                    char c141 = cArr3[i5 + 15];
                    cArr = cArr3;
                    if ((c126 & 255) == c126 && (c127 & 255) == c127 && (c128 & 255) == c128 && (c129 & 255) == c129 && (c130 & 255) == c130 && (c131 & 255) == c131 && (c132 & 255) == c132 && (c133 & 255) == c133 && (c134 & 255) == c134 && (c135 & 255) == c135 && (c136 & 255) == c136 && (c137 & 255) == c137 && (c138 & 255) == c138 && (c139 & 255) == c139 && (c140 & 255) == c140 && (c141 & 255) == c141) {
                        j5 = c126 + (c133 << 56) + (c132 << 48) + (c131 << 40) + (c130 << 32) + (c129 << 24) + (c128 << 16) + (c127 << 8);
                        j3 = (c141 << 56) + (c140 << 48) + (c139 << 40) + (c138 << 32) + (c137 << 24) + (c136 << 16) + (c135 << 8) + c134;
                        j2 = j5;
                        break;
                    }
                    j2 = -1;
                    j3 = -1;
                    break;
                default:
                    cArr = cArr3;
                    i = i5;
                    j2 = -1;
                    j3 = -1;
                    break;
            }
            if (j2 == -1) {
                oVar = this;
                cArr2 = cArr;
                i2 = i;
            } else if (j3 != -1) {
                long j8 = j2 ^ j3;
                int length = (JSONFactory.j.length - 1) & ((int) (j8 ^ (j8 >>> 32)));
                JSONFactory.a aVar = JSONFactory.j[length];
                if (aVar == null) {
                    String str2 = this.x;
                    if (str2 != null) {
                        str = str2.substring(i, this.D);
                    } else {
                        int i9 = i;
                        str = new String(cArr, i9, this.D - i9);
                    }
                    JSONFactory.j[length] = new JSONFactory.a(str, j2, j3);
                    return str;
                }
                oVar = this;
                cArr2 = cArr;
                i2 = i;
                if (aVar.b == j2 && aVar.c == j3) {
                    return aVar.f2932a;
                }
            } else {
                oVar = this;
                cArr2 = cArr;
                i2 = i;
                int length2 = (JSONFactory.i.length - 1) & ((int) ((j2 >>> 32) ^ j2));
                com.alibaba.fastjson2.util.i iVar = JSONFactory.i[length2];
                if (iVar == null) {
                    String str3 = oVar.x;
                    String substring = str3 != null ? str3.substring(i2, oVar.D) : new String(cArr2, i2, oVar.D - i2);
                    JSONFactory.i[length2] = new com.alibaba.fastjson2.util.i(substring, j2);
                    return substring;
                } else if (iVar.b == j2) {
                    return iVar.f3036a;
                }
            }
            String str4 = oVar.x;
            return str4 != null ? str4.substring(i2, oVar.D) : new String(cArr2, i2, oVar.D - i2);
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String J() {
        if (!this.f) {
            String str = this.x;
            if (str != null) {
                return str.substring(this.C, this.D);
            }
            char[] cArr = this.y;
            int i = this.C;
            return new String(cArr, i, this.D - i);
        }
        char[] cArr2 = new char[this.E];
        char[] cArr3 = this.y;
        int i2 = this.C;
        int i3 = 0;
        while (i2 < this.D) {
            char c = cArr3[i2];
            if (c == '\\') {
                i2++;
                c = cArr3[i2];
                if (c != '\"' && c != ':' && c != '@' && c != '\\') {
                    if (c == 'u') {
                        i2 += 4;
                        c = a(cArr3[i2 + 1], cArr3[i2 + 2], cArr3[i2 + 3], cArr3[i2]);
                    } else if (c != 'x') {
                        switch (c) {
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                switch (c) {
                                    case '<':
                                    case '=':
                                    case '>':
                                        continue;
                                    default:
                                        c = a((int) c);
                                        continue;
                                }
                        }
                    } else {
                        i2 += 2;
                        c = a(cArr3[i2 + 1], cArr3[i2]);
                    }
                }
            } else if (c == '\"') {
                return new String(cArr2);
            }
            cArr2[i3] = c;
            i2++;
            i3++;
        }
        return new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long L() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.L():long");
    }

    /* JADX WARN: Path cross not found for [B:6:0x001e, B:78:0x00eb], limit reached: 232 */
    /* JADX WARN: Path cross not found for [B:8:0x0024, B:63:0x00c3], limit reached: 232 */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00aa -> B:190:0x0213). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00b2 -> B:190:0x0213). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.N():void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x004b -> B:18:0x0031). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00ee -> B:69:0x00cb). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] P() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.P():byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00c8 -> B:75:0x00ca). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x00df -> B:72:0x00c1). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int R() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.R():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00d5 -> B:82:0x00d7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x00ee -> B:79:0x00ce). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer T() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.T():java.lang.Integer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r1 == '\n') goto L14;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W() {
        /*
            r12 = this;
            int r0 = r12.c
            int r1 = r0 + 1
            int r2 = r12.B
            if (r1 >= r2) goto L76
            char[] r2 = r12.y
            char r0 = r2[r0]
            r3 = 42
            r4 = 0
            r5 = 47
            r6 = 1
            if (r0 != r3) goto L16
            r0 = 1
            goto L19
        L16:
            if (r0 != r5) goto L75
            r0 = 0
        L19:
            int r7 = r1 + 1
            char r1 = r2[r1]
        L1d:
            if (r0 == 0) goto L2f
            if (r1 != r3) goto L2d
            int r1 = r12.B
            if (r7 > r1) goto L2d
            char r1 = r2[r7]
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
            int r0 = r12.B
            if (r7 < r0) goto L3d
            goto L63
        L3d:
            char r0 = r2[r7]
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
            int r0 = r12.B
            if (r7 < r0) goto L59
            goto L5d
        L59:
            char r0 = r2[r7]
            goto L3f
        L5c:
            r8 = r0
        L5d:
            int r7 = r7 + r6
            goto L63
        L5f:
            int r1 = r12.B
            if (r7 < r1) goto L6d
        L63:
            r12.d = r8
            r12.c = r7
            if (r8 != r5) goto L6c
            r12.W()
        L6c:
            return
        L6d:
            int r1 = r7 + 1
            char r7 = r2[r7]
            r11 = r7
            r7 = r1
            r1 = r11
            goto L1d
        L75:
            return
        L76:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = r12.aR()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.W():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132 A[RETURN] */
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
    public long Y() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.Y():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
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
    public java.lang.Long Z() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.Z():java.lang.Long");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d A[LOOP:1: B:20:0x003f->B:33:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0038 A[EDGE_INSN: B:43:0x0038->B:18:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x005a -> B:18:0x0038). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(char r17) {
        /*
            r16 = this;
            r0 = r16
            char[] r1 = r0.y
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
            int r3 = r0.B
            if (r2 != r3) goto L25
            r3 = 26
            goto L8
        L25:
            int r3 = r2 + 1
            char r2 = r1[r2]
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
            int r3 = r0.B
            if (r2 != r3) goto L3b
            r3 = r2
        L38:
            r2 = 26
            goto L3f
        L3b:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L3f:
            if (r2 == 0) goto L58
            if (r2 > r10) goto L4b
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 == 0) goto L4b
            goto L58
        L4b:
            r0.c = r3
            r0.d = r2
            r1 = 47
            if (r2 != r1) goto L56
            r16.W()
        L56:
            r1 = 1
            return r1
        L58:
            int r2 = r0.B
            if (r3 != r2) goto L5d
            goto L38
        L5d:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r15 = r3
            r3 = r2
            r2 = r15
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.a(char):boolean");
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
    public boolean a(char r8, char r9, char r10, char r11, char r12) {
        /*
            r7 = this;
            char r0 = r7.d
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            char[] r8 = r7.y
            int r0 = r7.c
            int r2 = r0 + 4
            int r3 = r7.B
            if (r2 > r3) goto L7a
            char r4 = r8[r0]
            if (r4 != r9) goto L7a
            int r9 = r0 + 1
            char r9 = r8[r9]
            if (r9 != r10) goto L7a
            int r9 = r0 + 2
            char r9 = r8[r9]
            if (r9 != r11) goto L7a
            int r0 = r0 + 3
            char r9 = r8[r0]
            if (r9 == r12) goto L27
            goto L7a
        L27:
            r9 = 26
            if (r2 != r3) goto L2f
            r10 = r2
        L2c:
            r11 = 26
            goto L33
        L2f:
            int r10 = r2 + 1
            char r11 = r8[r2]
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
            int r11 = r7.B
            if (r10 != r11) goto L4b
            goto L2c
        L4b:
            int r11 = r10 + 1
            char r10 = r8[r10]
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
            r7.d = r11
            r8 = 1
            return r8
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.a(char, char, char, char, char):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void aE() {
        int i;
        char c;
        char[] cArr = this.y;
        int i2 = this.c;
        if (cArr[i2] != 'u' || cArr[i2 + 1] != 'l' || cArr[i2 + 2] != 'l') {
            throw new JSONException("json syntax error, not match null, offset " + i2);
        }
        int i3 = i2 + 3;
        char c2 = i3 == this.B ? JSONLexer.EOI : cArr[i3];
        int i4 = i2 + 4;
        while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
            if (i4 == this.B) {
                c2 = JSONLexer.EOI;
            } else {
                c2 = cArr[i4];
                i4++;
            }
        }
        boolean z = c2 == ',';
        this.e = z;
        if (z) {
            if (i4 == this.B) {
                i = i4;
                c = JSONLexer.EOI;
            } else {
                i = i4 + 1;
                c = cArr[i4];
            }
            loop1: while (true) {
                int i5 = i;
                c2 = c;
                i4 = i5;
                while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                    if (i4 == this.B) {
                        c2 = JSONLexer.EOI;
                    }
                }
                i = i4 + 1;
                c = cArr[i4];
            }
        }
        this.d = c2;
        this.c = i4;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean aF() {
        int i;
        char c;
        char[] cArr = this.y;
        int i2 = this.c;
        boolean z = false;
        if (this.d == 'n' && cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l') {
            int i3 = i2 + 3;
            char c2 = i3 == this.B ? JSONLexer.EOI : cArr[i3];
            int i4 = i2 + 4;
            while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                if (i4 == this.B) {
                    c2 = JSONLexer.EOI;
                } else {
                    c2 = cArr[i4];
                    i4++;
                }
            }
            if (c2 == ',') {
                z = true;
            }
            this.e = z;
            if (z) {
                if (i4 == this.B) {
                    i = i4;
                    c = JSONLexer.EOI;
                } else {
                    i = i4 + 1;
                    c = cArr[i4];
                }
                loop1: while (true) {
                    int i5 = i;
                    c2 = c;
                    i4 = i5;
                    while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                        if (i4 == this.B) {
                            c2 = JSONLexer.EOI;
                        }
                    }
                    i = i4 + 1;
                    c = cArr[i4];
                }
            }
            this.d = c2;
            this.c = i4;
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String aG() {
        if (this.s != null) {
            return this.s;
        }
        int i = this.D - this.C;
        if (!this.f) {
            return new String(this.y, this.C, i);
        }
        char[] cArr = new char[this.E];
        int i2 = this.C;
        int i3 = 0;
        while (true) {
            char[] cArr2 = this.y;
            char c = cArr2[i2];
            if (c == '\\') {
                i2++;
                c = cArr2[i2];
                if (c != '\"' && c != '\\') {
                    if (c == 'u') {
                        int i4 = i2 + 1;
                        char c2 = cArr2[i4];
                        int i5 = i4 + 1;
                        char c3 = cArr2[i5];
                        int i6 = i5 + 1;
                        char c4 = cArr2[i6];
                        i2 = i6 + 1;
                        c = a(c2, c3, c4, cArr2[i2]);
                    } else if (c != 'x') {
                        c = a((int) c);
                    } else {
                        int i7 = i2 + 1;
                        char c5 = cArr2[i7];
                        i2 = i7 + 1;
                        c = a(c5, cArr2[i2]);
                    }
                }
            } else if (c == '\"') {
                String str = new String(cArr);
                this.s = str;
                return str;
            }
            cArr[i3] = c;
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f9 A[LOOP:0: B:73:0x00e2->B:80:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00f6 -> B:71:0x00db). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean aL() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.aL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[LOOP:1: B:29:0x0052->B:36:0x0069, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[LOOP:2: B:44:0x0083->B:50:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0066 -> B:27:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x008e -> B:42:0x007c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean aS() {
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
            char[] r6 = r0.y
        L29:
            int r7 = r5 + 1
            char r5 = r6[r5]
            r8 = 92
            if (r5 != r8) goto L42
            char r5 = r6[r7]
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
            if (r5 != r1) goto La5
            int r1 = r0.B
            r5 = 26
            if (r7 != r1) goto L4e
            r1 = r7
        L4b:
            r7 = 26
            goto L52
        L4e:
            int r1 = r7 + 1
            char r7 = r6[r7]
        L52:
            r8 = 4294981376(0x100003700, double:2.1220027474E-314)
            r10 = 1
            r12 = 32
            if (r7 > r12) goto L73
            long r13 = r10 << r7
            long r13 = r13 & r8
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 == 0) goto L73
            int r7 = r0.B
            if (r1 != r7) goto L69
            goto L4b
        L69:
            int r7 = r1 + 1
            char r1 = r6[r1]
            r16 = r7
            r7 = r1
            r1 = r16
            goto L52
        L73:
            r13 = 58
            if (r7 != r13) goto La0
            int r7 = r0.B
            if (r1 != r7) goto L7f
            r7 = r1
        L7c:
            r1 = 26
            goto L83
        L7f:
            int r7 = r1 + 1
            char r1 = r6[r1]
        L83:
            if (r1 > r12) goto L9b
            long r13 = r10 << r1
            long r13 = r13 & r8
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 == 0) goto L9b
            int r1 = r0.B
            if (r7 != r1) goto L91
            goto L7c
        L91:
            int r1 = r7 + 1
            char r7 = r6[r7]
            r16 = r7
            r7 = r1
            r1 = r16
            goto L83
        L9b:
            r0.c = r7
            r0.d = r1
            return r4
        La0:
            com.alibaba.fastjson2.JSONException r1 = i(r7)
            throw r1
        La5:
            r5 = r7
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.aS():boolean");
    }

    protected void aT() {
        String str;
        char c = this.d;
        int i = this.c;
        boolean z = false;
        this.g = false;
        int i2 = i;
        int i3 = 0;
        while (true) {
            char[] cArr = this.y;
            char c2 = cArr[i2];
            if (c2 == '\\') {
                this.g = true;
                int i4 = i2 + 1;
                char c3 = cArr[i4];
                if (c3 == 'u') {
                    i4 += 4;
                } else if (c3 == 'x') {
                    i4 += 2;
                }
                i2 = i4 + 1;
            } else if (c2 == c) {
                break;
            } else {
                i2++;
            }
            i3++;
        }
        if (this.g) {
            char[] cArr2 = new char[i3];
            i2 = i;
            int i5 = 0;
            while (true) {
                char[] cArr3 = this.y;
                char c4 = cArr3[i2];
                if (c4 != '\\') {
                    if (c4 == '\"') {
                        break;
                    }
                } else {
                    i2++;
                    c4 = cArr3[i2];
                    if (c4 != '\"' && c4 != '\\') {
                        if (c4 == 'u') {
                            int i6 = i2 + 1;
                            char c5 = cArr3[i6];
                            int i7 = i6 + 1;
                            char c6 = cArr3[i7];
                            int i8 = i7 + 1;
                            char c7 = cArr3[i8];
                            i2 = i8 + 1;
                            c4 = a(c5, c6, c7, cArr3[i2]);
                        } else if (c4 != 'x') {
                            c4 = a((int) c4);
                        } else {
                            int i9 = i2 + 1;
                            char c8 = cArr3[i9];
                            i2 = i9 + 1;
                            c4 = a(c8, cArr3[i2]);
                        }
                    }
                }
                cArr2[i5] = c4;
                i2++;
                i5++;
            }
            str = new String(cArr2);
        } else {
            str = new String(this.y, this.c, i2 - this.c);
        }
        int i10 = i2 + 1;
        char c9 = i10 == this.B ? JSONLexer.EOI : this.y[i10];
        while (c9 <= ' ' && ((1 << c9) & 4294981376L) != 0) {
            i10++;
            c9 = this.y[i10];
        }
        if (c9 == ',') {
            z = true;
        }
        this.e = z;
        if (z) {
            this.c = i10 + 1;
            char[] cArr4 = this.y;
            int i11 = this.c;
            this.c = i11 + 1;
            char c10 = cArr4[i11];
            loop3: while (true) {
                this.d = c10;
                while (this.d <= ' ' && ((1 << this.d) & 4294981376L) != 0) {
                    if (this.c >= this.B) {
                        this.d = JSONLexer.EOI;
                    }
                }
                char[] cArr5 = this.y;
                int i12 = this.c;
                this.c = i12 + 1;
                c10 = cArr5[i12];
            }
        } else {
            this.c = i10 + 1;
            this.d = c9;
        }
        this.s = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02af, code lost:
        if (r26.j != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02b1, code lost:
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b2, code lost:
        r14 = r3;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02c7, code lost:
        if (r26.j != false) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0035 -> B:15:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:12:0x002e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x0326 -> B:223:0x032b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x033f -> B:219:0x031f). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float aa() {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.aa():float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0290, code lost:
        if (r25.j != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0292, code lost:
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0293, code lost:
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02af, code lost:
        if (r25.j != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02c3, code lost:
        if (r25.j != false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[LOOP:4: B:15:0x0036->B:21:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x002f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:13:0x002f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:229:0x0321 -> B:231:0x0326). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x033c -> B:227:0x031a). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double ac() {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.ac():double");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0316  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x02c1 -> B:198:0x02c4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x02d7 -> B:194:0x02ba). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:215:0x02f3 -> B:216:0x02f4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x0307 -> B:213:0x02ec). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.math.BigDecimal ag() {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.ag():java.math.BigDecimal");
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
    public java.util.UUID ah() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.ah():java.util.UUID");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int ak() {
        if (this.d == '\"' || this.d == '\'') {
            char c = this.d;
            int i = 0;
            int i2 = this.c;
            char[] cArr = this.y;
            int i3 = i2 + 8;
            if (i3 < this.B && i3 < cArr.length && cArr[i2] != c && cArr[i2 + 1] != c && cArr[i2 + 2] != c && cArr[i2 + 3] != c && cArr[i2 + 4] != c && cArr[i2 + 5] != c && cArr[i2 + 6] != c && cArr[i2 + 7] != c) {
                i = 8;
                i2 = i3;
            }
            while (i2 < this.B && cArr[i2] != c) {
                i2++;
                i++;
            }
            return i;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected com.alibaba.fastjson2.time.c am() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c e = DateUtils.e(this.y, this.c);
            if (e == null) {
                return null;
            }
            this.c += 13;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return e;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected com.alibaba.fastjson2.time.c an() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c f = DateUtils.f(this.y, this.c);
            if (f == null) {
                return null;
            }
            this.c += 15;
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
    protected com.alibaba.fastjson2.time.c ao() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c g = DateUtils.g(this.y, this.c);
            if (g == null) {
                return null;
            }
            this.c += 17;
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
    protected com.alibaba.fastjson2.time.c ap() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c h = DateUtils.h(this.y, this.c);
            if (h == null) {
                return null;
            }
            this.c += 18;
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
    protected com.alibaba.fastjson2.time.c aq() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c i = DateUtils.i(this.y, this.c);
            this.c += 19;
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
    protected com.alibaba.fastjson2.time.c ar() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c j = DateUtils.j(this.y, this.c);
            if (j == null) {
                return null;
            }
            this.c += 20;
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
    protected com.alibaba.fastjson2.time.c as() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c k = DateUtils.k(this.y, this.c);
            if (k == null) {
                return null;
            }
            this.c += 21;
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
    public long at() {
        char c = this.d;
        if (c == '\"' || c == '\'') {
            boolean z = true;
            if (this.c + 18 >= this.B) {
                this.h = true;
                return 0L;
            }
            long b = DateUtils.b(this.y, this.c, this.f2934a.o);
            if (this.y[this.c + 19] != c) {
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
    public com.alibaba.fastjson2.time.b au() {
        if (this.d == '\"' || this.d == '\'') {
            try {
                com.alibaba.fastjson2.time.b a2 = DateUtils.a(this.y, this.c);
                this.c += 9;
                D();
                boolean z = this.d == ',';
                this.e = z;
                if (z) {
                    D();
                }
                return a2;
            } catch (DateTimeException e) {
                throw new JSONException(d("read date error"), e);
            }
        }
        throw new JSONException("localDate only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.time.b av() {
        if (this.d == '\"' || this.d == '\'') {
            try {
                com.alibaba.fastjson2.time.b b = DateUtils.b(this.y, this.c);
                this.c += 10;
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
    public com.alibaba.fastjson2.time.b aw() {
        if (this.d == '\"' || this.d == '\'') {
            try {
                com.alibaba.fastjson2.time.b c = DateUtils.c(this.y, this.c);
                if (c == null) {
                    return null;
                }
                this.c += 11;
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
    public com.alibaba.fastjson2.time.b ax() {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.b d = DateUtils.d(this.y, this.c);
            if (d == null) {
                return null;
            }
            this.c += 12;
            D();
            boolean z = this.d == ',';
            this.e = z;
            if (z) {
                D();
            }
            return d;
        }
        throw new JSONException("localDate only support string input");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b9, code lost:
        if (r10 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bb, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bc, code lost:
        r19.l = (short) r8;
        r19.k = 2;
        r15 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r19.q < (-214748364)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
        if (r19.q < (-214748364)) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[LOOP:4: B:14:0x0044->B:19:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x003d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:12:0x003d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x02db -> B:201:0x02dd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:205:0x02f1 -> B:198:0x02d4). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ay() {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.ay():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String az() {
        String str;
        int i;
        char[] cArr = this.y;
        if (this.d == '\"' || this.d == '\'') {
            char c = this.d;
            int i2 = this.c;
            boolean z = false;
            int i3 = i2;
            int i4 = 0;
            boolean z2 = false;
            while (i3 < this.B) {
                char c2 = cArr[i3];
                if (c2 == '\\') {
                    int i5 = i3 + 1;
                    char c3 = cArr[i5];
                    if (c3 == 'u') {
                        i5 += 4;
                    } else if (c3 == 'x') {
                        i5 += 2;
                    }
                    i3 = i5 + 1;
                    z2 = true;
                } else if (c2 == c) {
                    if (z2) {
                        char[] cArr2 = new char[i4];
                        int i6 = 0;
                        while (true) {
                            char c4 = cArr[i2];
                            if (c4 != '\\') {
                                if (c4 == c) {
                                    break;
                                }
                            } else {
                                i2++;
                                c4 = cArr[i2];
                                if (c4 != '\"' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c4 = '\b';
                                    } else if (c4 == 'f') {
                                        c4 = '\f';
                                    } else if (c4 == 'n') {
                                        c4 = '\n';
                                    } else if (c4 == 'r') {
                                        c4 = '\r';
                                    } else if (c4 == 'x') {
                                        i2 += 2;
                                        c4 = a(cArr[i2 + 1], cArr[i2]);
                                    } else if (c4 == 't') {
                                        c4 = '\t';
                                    } else if (c4 != 'u') {
                                        c4 = a((int) c4);
                                    } else {
                                        i2 += 4;
                                        c4 = a(cArr[i2 + 1], cArr[i2 + 2], cArr[i2 + 3], cArr[i2]);
                                    }
                                }
                            }
                            cArr2[i6] = c4;
                            i2++;
                            i6++;
                        }
                        str = new String(cArr2);
                        i3 = i2;
                    } else {
                        String str2 = this.x;
                        if (str2 != null) {
                            str = str2.substring(this.c, i3);
                        } else {
                            int i7 = this.c;
                            str = new String(cArr, i7, i3 - i7);
                        }
                    }
                    if ((this.f2934a.p & JSONReader.Feature.TrimString.mask) != 0) {
                        str = str.trim();
                    }
                    int i8 = i3 + 1;
                    int i9 = this.B;
                    char c5 = JSONLexer.EOI;
                    if (i8 != i9) {
                        i = i8 + 1;
                        char c6 = cArr[i8];
                        while (c6 <= ' ' && ((1 << c6) & 4294981376L) != 0) {
                            if (i != this.B) {
                                c6 = cArr[i];
                                i++;
                            }
                        }
                        if (c6 == ',') {
                            z = true;
                        }
                        this.e = z;
                        if (!z) {
                            c5 = c6;
                        } else if (i != this.B) {
                            int i10 = i + 1;
                            char c7 = cArr[i];
                            while (c7 <= ' ' && ((1 << c7) & 4294981376L) != 0) {
                                if (i10 == this.B) {
                                    break;
                                }
                                int i11 = i10 + 1;
                                char c8 = cArr[i10];
                                i10 = i11;
                                c7 = c8;
                            }
                            c5 = c7;
                            i = i10;
                        }
                        this.d = c5;
                        this.c = i;
                        return str;
                    }
                    i = i8;
                    this.d = JSONLexer.EOI;
                    this.e = false;
                    this.c = i;
                    return str;
                } else {
                    i3++;
                }
                i4++;
            }
            throw new JSONException(d("invalid escape character EOI"));
        }
        return bd();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected com.alibaba.fastjson2.time.c b(int i) {
        if (this.d == '\"' || this.d == '\'') {
            com.alibaba.fastjson2.time.c b = DateUtils.b(this.y, this.c, i);
            if (b == null) {
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
            return b;
        }
        throw new JSONException("date only support string input");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.alibaba.fastjson2.time.f c(int r6) {
        /*
            r5 = this;
            char r0 = r5.d
            r1 = 34
            if (r0 == r1) goto L15
            char r0 = r5.d
            r1 = 39
            if (r0 != r1) goto Ld
            goto L15
        Ld:
            com.alibaba.fastjson2.JSONException r6 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "date only support string input"
            r6.<init>(r0)
            throw r6
        L15:
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto L1b
            return r1
        L1b:
            r0 = 30
            r2 = 29
            r3 = 90
            if (r6 != r0) goto L3b
            char[] r0 = r5.y
            int r4 = r5.c
            int r4 = r4 + r2
            char r0 = r0[r4]
            if (r0 != r3) goto L3b
            char[] r0 = r5.y
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.o(r0, r2)
        L34:
            com.alibaba.fastjson2.time.e r2 = com.alibaba.fastjson2.time.e.c
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.time.f.a(r0, r2)
            goto L88
        L3b:
            r0 = 28
            if (r6 != r2) goto L51
            char[] r2 = r5.y
            int r4 = r5.c
            int r4 = r4 + r0
            char r2 = r2[r4]
            if (r2 != r3) goto L51
            char[] r0 = r5.y
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.n(r0, r2)
            goto L34
        L51:
            r2 = 27
            if (r6 != r0) goto L67
            char[] r0 = r5.y
            int r4 = r5.c
            int r4 = r4 + r2
            char r0 = r0[r4]
            if (r0 != r3) goto L67
            char[] r0 = r5.y
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.m(r0, r2)
            goto L34
        L67:
            if (r6 != r2) goto L7c
            char[] r0 = r5.y
            int r2 = r5.c
            int r2 = r2 + 26
            char r0 = r0[r2]
            if (r0 != r3) goto L7c
            char[] r0 = r5.y
            int r2 = r5.c
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.l(r0, r2)
            goto L34
        L7c:
            char[] r0 = r5.y
            int r2 = r5.c
            com.alibaba.fastjson2.JSONReader$c r3 = r5.f2934a
            com.alibaba.fastjson2.time.e r3 = r3.o
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.util.DateUtils.b(r0, r2, r6, r3)
        L88:
            if (r0 != 0) goto L8b
            return r1
        L8b:
            int r1 = r5.c
            r2 = 1
            int r6 = r6 + r2
            int r1 = r1 + r6
            r5.c = r1
            r5.D()
            char r6 = r5.d
            r1 = 44
            if (r6 != r1) goto L9c
            goto L9d
        L9c:
            r2 = 0
        L9d:
            r5.e = r2
            if (r2 == 0) goto La4
            r5.D()
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.c(int):com.alibaba.fastjson2.time.f");
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.H != -1 && this.y.length < 1048576) {
            JSONFactory.u.lazySet(JSONFactory.t[this.H], this.y);
        }
        Closeable closeable = this.G;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String d(String str) {
        char c;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c = '\n';
            if (!(i < this.c) || !(i < this.B)) {
                break;
            }
            if (this.y[i] == '\n') {
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
        char[] cArr = this.y;
        int i4 = this.A;
        int i5 = this.z;
        if (i5 >= 65535) {
            i5 = 65535;
        }
        sb.append(cArr, i4, i5);
        return sb.toString();
    }

    public boolean e() {
        return this.d == 'n' && this.c < this.B && this.y[this.c] == 'u';
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[LOOP:2: B:25:0x0050->B:31:0x0060, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1 A[LOOP:3: B:46:0x0093->B:52:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a A[LOOP:1: B:90:0x011d->B:95:0x012a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x005d -> B:25:0x0050). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x009e -> B:44:0x008e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0131 -> B:89:0x011c). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date f() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.f():java.util.Date");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean g() {
        if (this.d == 'n' && this.c + 2 < this.B && this.y[this.c] == 'u') {
            aE();
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[LOOP:0: B:11:0x001a->B:25:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0013 A[EDGE_INSN: B:28:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x003f -> B:9:0x0013). Please submit an issue!!! */
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
            char[] r0 = r10.y
            int r1 = r10.c
            int r2 = r10.B
            r3 = 26
            if (r1 != r2) goto L16
            r2 = r1
        L13:
            r1 = 26
            goto L1a
        L16:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L1a:
            if (r1 == 0) goto L3d
            r4 = 32
            if (r1 > r4) goto L30
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            goto L3d
        L30:
            r10.d = r1
            r10.c = r2
            r0 = 47
            if (r1 != r0) goto L3b
            r10.W()
        L3b:
            r0 = 1
            return r0
        L3d:
            int r1 = r10.B
            if (r2 != r1) goto L42
            goto L13
        L42:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.n():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[LOOP:0: B:26:0x0044->B:32:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070 A[LOOP:1: B:42:0x0079->B:51:0x0070, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0058 -> B:24:0x003d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0077 -> B:42:0x0079). Please submit an issue!!! */
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
            int r2 = r0.B
            int r3 = r0.c
            char[] r4 = r0.y
            r5 = 0
            r6 = 1
            r7 = 110(0x6e, float:1.54E-43)
            if (r1 != r7) goto L29
            int r7 = r3 + 2
            if (r7 >= r2) goto L29
            char r8 = r4[r3]
            r9 = 117(0x75, float:1.64E-43)
            if (r8 != r9) goto L29
            int r8 = r3 + 1
            char r8 = r4[r8]
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 != r9) goto L29
            char r7 = r4[r7]
            if (r7 != r9) goto L29
            int r3 = r3 + 3
            goto L38
        L29:
            r7 = 34
            if (r1 == r7) goto L31
            r7 = 39
            if (r1 != r7) goto L8f
        L31:
            if (r3 >= r2) goto L8f
            char r7 = r4[r3]
            if (r7 != r1) goto L8f
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
            char r3 = r4[r3]
        L44:
            r8 = 0
            r10 = 4294981376(0x100003700, double:2.1220027474E-314)
            r12 = 1
            r14 = 32
            if (r3 > r14) goto L65
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r17 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r17 == 0) goto L65
            if (r7 != r2) goto L5b
            goto L3d
        L5b:
            int r3 = r7 + 1
            char r7 = r4[r7]
            r18 = r7
            r7 = r3
            r3 = r18
            goto L44
        L65:
            r15 = 44
            if (r3 != r15) goto L6a
            r5 = 1
        L6a:
            r0.e = r5
            if (r5 == 0) goto L79
            if (r7 != r2) goto L73
        L70:
            r3 = 26
            goto L79
        L73:
            int r3 = r7 + 1
            char r5 = r4[r7]
        L77:
            r7 = r3
            r3 = r5
        L79:
            if (r3 > r14) goto L8a
            long r15 = r12 << r3
            long r15 = r15 & r10
            int r5 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r5 == 0) goto L8a
            if (r7 != r2) goto L85
            goto L70
        L85:
            int r3 = r7 + 1
            char r5 = r4[r7]
            goto L77
        L8a:
            r0.c = r7
            r0.d = r3
            return r6
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.o():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[LOOP:0: B:11:0x001c->B:39:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0015 A[EDGE_INSN: B:40:0x0015->B:9:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0070 -> B:9:0x0015). Please submit an issue!!! */
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
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.c
            char[] r2 = r0.y
            int r3 = r0.B
            r4 = 26
            if (r1 != r3) goto L18
            r3 = r1
        L15:
            r1 = 26
            goto L1c
        L18:
            int r3 = r1 + 1
            char r1 = r2[r1]
        L1c:
            if (r1 == 0) goto L6e
            r5 = 0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r11 = 32
            if (r1 > r11) goto L33
            long r12 = r9 << r1
            long r12 = r12 & r7
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L33
            goto L6e
        L33:
            r12 = 44
            r13 = 1
            if (r1 != r12) goto L62
            r0.e = r13
            int r1 = r0.B
            if (r3 != r1) goto L42
            r1 = r3
            r3 = 26
            goto L46
        L42:
            int r1 = r3 + 1
            char r3 = r2[r3]
        L46:
            r16 = r3
            r3 = r1
            r1 = r16
        L4b:
            if (r1 == 0) goto L56
            if (r1 > r11) goto L62
            long r14 = r9 << r1
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L62
        L56:
            int r1 = r0.B
            if (r3 != r1) goto L5d
            r1 = 26
            goto L4b
        L5d:
            int r1 = r3 + 1
            char r3 = r2[r3]
            goto L46
        L62:
            r0.d = r1
            r0.c = r3
            r2 = 47
            if (r1 != r2) goto L6d
            r17.W()
        L6d:
            return r13
        L6e:
            int r1 = r0.B
            if (r3 != r1) goto L73
            goto L15
        L73:
            int r1 = r3 + 1
            char r3 = r2[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.p():boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[LOOP:0: B:11:0x001a->B:25:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0013 A[EDGE_INSN: B:28:0x0013->B:9:0x0013 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x003f -> B:9:0x0013). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q() {
        /*
            r10 = this;
            char r0 = r10.d
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            char[] r0 = r10.y
            int r1 = r10.c
            int r2 = r10.B
            r3 = 26
            if (r1 != r2) goto L16
            r2 = r1
        L13:
            r1 = 26
            goto L1a
        L16:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L1a:
            if (r1 == 0) goto L3d
            r4 = 32
            if (r1 > r4) goto L30
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981376(0x100003700, double:2.1220027474E-314)
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            goto L3d
        L30:
            r10.d = r1
            r10.c = r2
            r0 = 47
            if (r1 != r0) goto L3b
            r10.W()
        L3b:
            r0 = 1
            return r0
        L3d:
            int r1 = r10.B
            if (r2 != r1) goto L42
            goto L13
        L42:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.q():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[LOOP:0: B:11:0x001c->B:39:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0015 A[EDGE_INSN: B:40:0x0015->B:9:0x0015 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0070 -> B:9:0x0015). Please submit an issue!!! */
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
            r2 = 93
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.c
            char[] r2 = r0.y
            int r3 = r0.B
            r4 = 26
            if (r1 != r3) goto L18
            r3 = r1
        L15:
            r1 = 26
            goto L1c
        L18:
            int r3 = r1 + 1
            char r1 = r2[r1]
        L1c:
            if (r1 == 0) goto L6e
            r5 = 0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r11 = 32
            if (r1 > r11) goto L33
            long r12 = r9 << r1
            long r12 = r12 & r7
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L33
            goto L6e
        L33:
            r12 = 44
            r13 = 1
            if (r1 != r12) goto L62
            r0.e = r13
            int r1 = r0.B
            if (r3 != r1) goto L42
            r1 = r3
            r3 = 26
            goto L46
        L42:
            int r1 = r3 + 1
            char r3 = r2[r3]
        L46:
            r16 = r3
            r3 = r1
            r1 = r16
        L4b:
            if (r1 == 0) goto L56
            if (r1 > r11) goto L62
            long r14 = r9 << r1
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L62
        L56:
            int r1 = r0.B
            if (r3 != r1) goto L5d
            r1 = 26
            goto L4b
        L5d:
            int r1 = r3 + 1
            char r3 = r2[r3]
            goto L46
        L62:
            r0.d = r1
            r0.c = r3
            r2 = 47
            if (r1 != r2) goto L6d
            r17.W()
        L6d:
            return r13
        L6e:
            int r1 = r0.B
            if (r3 != r1) goto L73
            goto L15
        L73:
            int r1 = r3 + 1
            char r3 = r2[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.r():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[LOOP:1: B:20:0x003d->B:33:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0036 A[EDGE_INSN: B:42:0x0036->B:18:0x0036 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0058 -> B:18:0x0036). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean s() {
        /*
            r15 = this;
            char[] r0 = r15.y
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
            int r2 = r15.B
            if (r1 != r2) goto L23
            r2 = 26
            goto L6
        L23:
            int r2 = r1 + 1
            char r1 = r0[r1]
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
            int r2 = r15.B
            if (r1 != r2) goto L39
            r2 = r1
        L36:
            r1 = 26
            goto L3d
        L39:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L3d:
            if (r1 == 0) goto L56
            if (r1 > r9) goto L49
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 == 0) goto L49
            goto L56
        L49:
            r15.c = r2
            r15.d = r1
            r0 = 47
            if (r1 != r0) goto L54
            r15.W()
        L54:
            r0 = 1
            return r0
        L56:
            int r1 = r15.B
            if (r2 != r1) goto L5b
            goto L36
        L5b:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r14 = r2
            r2 = r1
            r1 = r14
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.s():boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean u() {
        int i;
        int i2;
        int i3;
        char[] cArr = this.y;
        char c = this.d;
        int i4 = this.c;
        if (c == '{' && i4 != this.B) {
            char c2 = cArr[i4];
            while (c2 <= ' ' && ((1 << c2) & 4294981376L) != 0) {
                i4++;
                if (i4 >= this.B) {
                    return false;
                }
                c2 = cArr[i4];
            }
            if (c2 == '\"' || c2 == '\'') {
                int i5 = this.c + 5;
                int i6 = this.B;
                if (i5 < i6 && cArr[i4 + 1] == '$' && cArr[i4 + 2] == 'r' && cArr[i4 + 3] == 'e' && cArr[i4 + 4] == 'f' && cArr[i4 + 5] == c2 && (i = i4 + 6) < i6) {
                    char c3 = cArr[i];
                    while (c3 <= ' ' && ((1 << c3) & 4294981376L) != 0) {
                        i++;
                        if (i >= this.B) {
                            return false;
                        }
                        c3 = cArr[i];
                    }
                    if (c3 == ':' && (i2 = i + 1) < this.B) {
                        char c4 = cArr[i2];
                        while (c4 <= ' ' && ((1 << c4) & 4294981376L) != 0) {
                            i2++;
                            if (i2 >= this.B) {
                                return false;
                            }
                            c4 = cArr[i2];
                        }
                        if (c4 == c2 && ((i3 = i2 + 1) >= this.B || cArr[i3] != '#')) {
                            this.F = i2;
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[LOOP:1: B:22:0x0057->B:28:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0062 -> B:20:0x0050). Please submit an issue!!! */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String v() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.F
            int r2 = r0.B
            if (r1 != r2) goto La
            r1 = 0
            return r1
        La:
            char[] r2 = r0.y
            r0.c = r1
            int r1 = r0.c
            int r3 = r1 + 1
            r0.c = r3
            char r1 = r2[r1]
            r0.d = r1
            java.lang.String r1 = r17.az()
            char r3 = r0.d
            int r4 = r0.c
        L20:
            r5 = 0
            r7 = 4294981376(0x100003700, double:2.1220027474E-314)
            r9 = 1
            r11 = 32
            r12 = 26
            if (r3 > r11) goto L47
            long r13 = r9 << r3
            long r13 = r13 & r7
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 == 0) goto L47
            int r3 = r0.B
            if (r4 != r3) goto L3d
            r3 = 26
            goto L20
        L3d:
            int r3 = r4 + 1
            char r4 = r2[r4]
            r16 = r4
            r4 = r3
            r3 = r16
            goto L20
        L47:
            r13 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto La5
            int r3 = r0.B
            if (r4 != r3) goto L53
            r3 = r4
        L50:
            r4 = 26
            goto L57
        L53:
            int r3 = r4 + 1
            char r4 = r2[r4]
        L57:
            if (r4 > r11) goto L6f
            long r13 = r9 << r4
            long r13 = r13 & r7
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 == 0) goto L6f
            int r4 = r0.B
            if (r3 != r4) goto L65
            goto L50
        L65:
            int r4 = r3 + 1
            char r3 = r2[r3]
            r16 = r4
            r4 = r3
            r3 = r16
            goto L57
        L6f:
            r13 = 44
            if (r4 != r13) goto L75
            r13 = 1
            goto L76
        L75:
            r13 = 0
        L76:
            r0.e = r13
            if (r13 == 0) goto La0
            int r4 = r0.B
            if (r3 != r4) goto L82
            r4 = r3
            r3 = 26
            goto L86
        L82:
            int r4 = r3 + 1
            char r3 = r2[r3]
        L86:
            r16 = r4
            r4 = r3
            r3 = r16
        L8b:
            if (r4 > r11) goto La0
            long r13 = r9 << r4
            long r13 = r13 & r7
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 == 0) goto La0
            int r4 = r0.B
            if (r3 != r4) goto L9b
            r4 = 26
            goto L8b
        L9b:
            int r4 = r3 + 1
            char r3 = r2[r3]
            goto L86
        La0:
            r0.d = r4
            r0.c = r3
            return r1
        La5:
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r3 = "illegal reference : "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.o.v():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean w() {
        return this.d == '[';
    }
}
