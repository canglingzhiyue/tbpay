package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import okio.ByteString;
import okio.d;
import tb.akh;
import tb.riy;

/* loaded from: classes2.dex */
final class b extends JsonReader {
    private static final ByteString g = ByteString.encodeUtf8("'\\");
    private static final ByteString h = ByteString.encodeUtf8("\"\\");
    private static final ByteString i = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final ByteString j = ByteString.encodeUtf8("\n\r");
    private static final ByteString k = ByteString.encodeUtf8("*/");
    private final d l;
    private final okio.b m;
    private int n = 0;
    private long o;
    private int p;
    private String q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(d dVar) {
        this.l = dVar;
        if (dVar == null) {
            akh.c("source == null");
            this.m = null;
            return;
        }
        this.m = dVar.b();
        a(6);
    }

    private int a(String str, JsonReader.a aVar) {
        int length = aVar.f1787a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(aVar.f1787a[i2])) {
                this.n = 0;
                this.c[this.f1786a - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r6.m.g(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1 != 47) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r6.l.b(2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        t();
        r3 = r6.m.c(1L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r3 == 42) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r3 == 47) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        r6.m.g();
        r6.m.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        r6.m.g();
        r6.m.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (v() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        throw a("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r1 != 35) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int a(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            okio.d r2 = r6.l
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.b(r4)
            if (r2 == 0) goto L7e
            okio.b r2 = r6.m
            long r4 = (long) r1
            byte r1 = r2.c(r4)
            r2 = 10
            if (r1 == r2) goto L7c
            r2 = 32
            if (r1 == r2) goto L7c
            r2 = 13
            if (r1 == r2) goto L7c
            r2 = 9
            if (r1 == r2) goto L7c
            okio.b r2 = r6.m
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.g(r3)
            r2 = 47
            if (r1 != r2) goto L70
            okio.d r3 = r6.l
            r4 = 2
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L3b
            return r1
        L3b:
            r6.t()
            okio.b r3 = r6.m
            r4 = 1
            byte r3 = r3.c(r4)
            r4 = 42
            if (r3 == r4) goto L58
            if (r3 == r2) goto L4d
            return r1
        L4d:
            okio.b r1 = r6.m
            r1.g()
            okio.b r1 = r6.m
            r1.g()
            goto L77
        L58:
            okio.b r1 = r6.m
            r1.g()
            okio.b r1 = r6.m
            r1.g()
            boolean r1 = r6.v()
            if (r1 == 0) goto L69
            goto L1
        L69:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r7 = r6.a(r7)
            throw r7
        L70:
            r2 = 35
            if (r1 != r2) goto L7b
            r6.t()
        L77:
            r6.u()
            goto L1
        L7b:
            return r1
        L7c:
            r1 = r3
            goto L2
        L7e:
            if (r7 != 0) goto L82
            r7 = -1
            return r7
        L82:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.a(boolean):int");
    }

    private String a(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long b = this.l.b(byteString);
            if (b != -1) {
                if (this.m.c(b) != 92) {
                    if (sb == null) {
                        String e = this.m.e(b);
                        this.m.g();
                        return e;
                    }
                    sb.append(this.m.e(b));
                    this.m.g();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.m.e(b));
                this.m.g();
                sb.append(w());
            } else {
                throw a("Unterminated string");
            }
        }
    }

    private void b(ByteString byteString) throws IOException {
        while (true) {
            long b = this.l.b(byteString);
            if (b != -1) {
                if (this.m.c(b) != 92) {
                    this.m.g(b + 1);
                    return;
                } else {
                    this.m.g(b + 1);
                    w();
                }
            } else {
                throw a("Unterminated string");
            }
        }
    }

    private boolean b(int i2) throws IOException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        t();
        return false;
    }

    private int o() throws IOException {
        int i2;
        int i3 = this.b[this.f1786a - 1];
        if (i3 == 1) {
            this.b[this.f1786a - 1] = 2;
        } else if (i3 != 2) {
            if (i3 == 3 || i3 == 5) {
                this.b[this.f1786a - 1] = 4;
                if (i3 == 5) {
                    int a2 = a(true);
                    this.m.g();
                    if (a2 != 44) {
                        if (a2 != 59) {
                            if (a2 != 125) {
                                throw a("Unterminated object");
                            }
                            i2 = 2;
                        } else {
                            t();
                        }
                    }
                }
                int a3 = a(true);
                if (a3 == 34) {
                    this.m.g();
                    i2 = 13;
                } else if (a3 == 39) {
                    this.m.g();
                    t();
                    i2 = 12;
                } else if (a3 != 125) {
                    t();
                    if (!b((char) a3)) {
                        throw a("Expected name");
                    }
                    i2 = 14;
                } else if (i3 == 5) {
                    throw a("Expected name");
                } else {
                    this.m.g();
                    i2 = 2;
                }
            } else if (i3 == 4) {
                this.b[this.f1786a - 1] = 5;
                int a4 = a(true);
                this.m.g();
                if (a4 != 58) {
                    if (a4 != 61) {
                        throw a("Expected ':'");
                    }
                    t();
                    if (this.l.b(1L) && this.m.c(0L) == 62) {
                        this.m.g();
                    }
                }
            } else if (i3 == 6) {
                this.b[this.f1786a - 1] = 7;
            } else if (i3 == 7) {
                if (a(false) == -1) {
                    i2 = 18;
                }
                t();
            } else if (i3 == 8) {
                akh.c("JsonReader is closed");
                i2 = 0;
            }
            this.n = i2;
            return i2;
        } else {
            int a5 = a(true);
            this.m.g();
            if (a5 != 44) {
                if (a5 != 59) {
                    if (a5 != 93) {
                        throw a("Unterminated array");
                    }
                    this.n = 4;
                    return 4;
                }
                t();
            }
        }
        int a6 = a(true);
        if (a6 != 34) {
            if (a6 == 39) {
                t();
                this.m.g();
                this.n = 8;
                return 8;
            }
            if (a6 != 44 && a6 != 59) {
                if (a6 == 91) {
                    this.m.g();
                    this.n = 3;
                    return 3;
                } else if (a6 != 93) {
                    if (a6 == 123) {
                        this.m.g();
                        this.n = 1;
                        return 1;
                    }
                    int p = p();
                    if (p != 0) {
                        return p;
                    }
                    int q = q();
                    if (q != 0) {
                        return q;
                    }
                    if (!b(this.m.c(0L))) {
                        throw a("Expected value");
                    }
                    t();
                    i2 = 10;
                } else if (i3 == 1) {
                    this.m.g();
                    this.n = 4;
                    return 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                throw a("Unexpected value");
            }
            t();
            this.n = 7;
            return 7;
        }
        this.m.g();
        i2 = 9;
        this.n = i2;
        return i2;
    }

    private int p() throws IOException {
        int i2;
        String str;
        String str2;
        byte c = this.m.c(0L);
        if (c == 116 || c == 84) {
            i2 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 102 || c == 70) {
            i2 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 110 && c != 78) {
            return 0;
        } else {
            i2 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.l.b(i4)) {
                return 0;
            }
            byte c2 = this.m.c(i3);
            if (c2 != str.charAt(i3) && c2 != str2.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (!this.l.b(length + 1) || !b(this.m.c(length))) {
            this.m.g(length);
            this.n = i2;
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        if (b(r11) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a4, code lost:
        if (r6 != 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a6, code lost:
        if (r10 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ac, code lost:
        if (r7 != Long.MIN_VALUE) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ae, code lost:
        if (r9 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b4, code lost:
        if (r7 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b6, code lost:
        if (r9 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b8, code lost:
        if (r9 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00bb, code lost:
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00bc, code lost:
        r16.o = r7;
        r16.m.g(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c6, code lost:
        r16.n = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c8, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c9, code lost:
        if (r6 == 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00cc, code lost:
        if (r6 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00cf, code lost:
        if (r6 != 7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d2, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d3, code lost:
        r16.p = r5;
        r1 = 17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.b.q():int");
    }

    private String r() throws IOException {
        long b = this.l.b(i);
        return b != -1 ? this.m.e(b) : this.m.m();
    }

    private void s() throws IOException {
        long b = this.l.b(i);
        okio.b bVar = this.m;
        if (b == -1) {
            b = bVar.a();
        }
        bVar.g(b);
    }

    private void t() throws IOException {
        if (this.e) {
            return;
        }
        throw a("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void u() throws IOException {
        long b = this.l.b(j);
        okio.b bVar = this.m;
        bVar.g(b != -1 ? b + 1 : bVar.a());
    }

    private boolean v() throws IOException {
        long a2 = this.l.a(k);
        boolean z = a2 != -1;
        okio.b bVar = this.m;
        bVar.g(z ? a2 + k.size() : bVar.a());
        return z;
    }

    private char w() throws IOException {
        int i2;
        int i3;
        if (this.l.b(1L)) {
            byte g2 = this.m.g();
            if (g2 == 10 || g2 == 34 || g2 == 39 || g2 == 47 || g2 == 92) {
                return (char) g2;
            }
            if (g2 == 98) {
                return '\b';
            }
            if (g2 == 102) {
                return '\f';
            }
            if (g2 == 110) {
                return '\n';
            }
            if (g2 == 114) {
                return '\r';
            }
            if (g2 == 116) {
                return '\t';
            }
            if (g2 != 117) {
                if (this.e) {
                    return (char) g2;
                }
                throw a("Invalid escape sequence: \\" + ((char) g2));
            } else if (!this.l.b(4L)) {
                throw new EOFException("Unterminated escape sequence at path " + n());
            } else {
                char c = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte c2 = this.m.c(i4);
                    char c3 = (char) (c << 4);
                    if (c2 < 48 || c2 > 57) {
                        if (c2 >= 97 && c2 <= 102) {
                            i2 = c2 - 97;
                        } else if (c2 < 65 || c2 > 70) {
                            throw a("\\u" + this.m.e(4L));
                        } else {
                            i2 = c2 - 65;
                        }
                        i3 = i2 + 10;
                    } else {
                        i3 = c2 - 48;
                    }
                    c = (char) (c3 + i3);
                }
                this.m.g(4L);
                return c;
            }
        }
        throw a("Unterminated escape sequence");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int a(JsonReader.a aVar) throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return a(this.q, aVar);
        }
        int a2 = this.l.a(aVar.b);
        if (a2 != -1) {
            this.n = 0;
            this.c[this.f1786a - 1] = aVar.f1787a[a2];
            return a2;
        }
        String str = this.c[this.f1786a - 1];
        String g2 = g();
        int a3 = a(g2, aVar);
        if (a3 == -1) {
            this.n = 15;
            this.q = g2;
            this.c[this.f1786a - 1] = str;
        }
        return a3;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void a() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 3) {
            a(1);
            this.d[this.f1786a - 1] = 0;
            this.n = 0;
            return;
        }
        akh.c("Expected BEGIN_ARRAY but was " + f() + " at path " + n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 4) {
            this.f1786a--;
            int[] iArr = this.d;
            int i3 = this.f1786a - 1;
            iArr[i3] = iArr[i3] + 1;
            this.n = 0;
            return;
        }
        akh.c("Expected END_ARRAY but was " + f() + " at path " + n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 1) {
            a(3);
            this.n = 0;
            return;
        }
        akh.c("Expected BEGIN_OBJECT but was " + f() + " at path " + n());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.n = 0;
        this.b[0] = 8;
        this.f1786a = 1;
        this.m.o();
        this.l.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 2) {
            this.f1786a--;
            this.c[this.f1786a] = null;
            int[] iArr = this.d;
            int i3 = this.f1786a - 1;
            iArr[i3] = iArr[i3] + 1;
            this.n = 0;
            return;
        }
        akh.c("Expected END_OBJECT but was " + f() + " at path " + n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean e() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token f() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        switch (i2) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                return JsonReader.Token.NULL;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String g() throws IOException {
        String str;
        ByteString byteString;
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 14) {
            str = r();
        } else {
            if (i2 == 13) {
                byteString = h;
            } else if (i2 == 12) {
                byteString = g;
            } else if (i2 != 15) {
                akh.c("Expected a name but was " + f() + " at path " + n());
                return this.q;
            } else {
                str = this.q;
            }
            str = a(byteString);
        }
        this.n = 0;
        this.c[this.f1786a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void h() throws IOException {
        ByteString byteString;
        if (this.f) {
            akh.c("Cannot skip unexpected " + f() + " at " + n());
            return;
        }
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 14) {
            s();
        } else {
            if (i2 == 13) {
                byteString = h;
            } else if (i2 == 12) {
                byteString = g;
            } else if (i2 != 15) {
                akh.c("Expected a name but was " + f() + " at path " + n());
                return;
            }
            b(byteString);
        }
        this.n = 0;
        this.c[this.f1786a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String i() throws IOException {
        String e;
        ByteString byteString;
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 10) {
            e = r();
        } else {
            if (i2 == 9) {
                byteString = h;
            } else if (i2 == 8) {
                byteString = g;
            } else if (i2 == 11) {
                e = this.q;
                this.q = null;
            } else if (i2 == 16) {
                e = Long.toString(this.o);
            } else if (i2 != 17) {
                akh.c("Expected a string but was " + f() + " at path " + n());
                return this.q;
            } else {
                e = this.m.e(this.p);
            }
            e = a(byteString);
        }
        this.n = 0;
        int[] iArr = this.d;
        int i3 = this.f1786a - 1;
        iArr[i3] = iArr[i3] + 1;
        return e;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean j() throws IOException {
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 5) {
            this.n = 0;
            int[] iArr = this.d;
            int i3 = this.f1786a - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.n = 0;
            int[] iArr2 = this.d;
            int i4 = this.f1786a - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            akh.c("Expected a boolean but was " + f() + " at path " + n());
            return false;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double k() throws IOException {
        String r;
        ByteString byteString;
        double parseDouble;
        int i2 = this.n;
        if (i2 == 0) {
            i2 = o();
        }
        if (i2 == 16) {
            this.n = 0;
            int[] iArr = this.d;
            int i3 = this.f1786a - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.o;
        }
        try {
            if (i2 == 17) {
                r = this.m.e(this.p);
            } else {
                if (i2 == 9) {
                    byteString = h;
                } else if (i2 == 8) {
                    byteString = g;
                } else if (i2 != 10) {
                    if (i2 != 11) {
                        akh.c("Expected a double but was " + f() + " at path " + n());
                        return this.o;
                    }
                    this.n = 11;
                    parseDouble = Double.parseDouble(this.q);
                    if (!this.e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                        this.q = null;
                        this.n = 0;
                        int[] iArr2 = this.d;
                        int i4 = this.f1786a - 1;
                        iArr2[i4] = iArr2[i4] + 1;
                        return parseDouble;
                    }
                    akh.c("JSON forbids NaN and infinities: " + parseDouble + " at path " + n());
                    return this.o;
                } else {
                    r = r();
                }
                r = a(byteString);
            }
            parseDouble = Double.parseDouble(this.q);
            if (!this.e) {
            }
            this.q = null;
            this.n = 0;
            int[] iArr22 = this.d;
            int i42 = this.f1786a - 1;
            iArr22[i42] = iArr22[i42] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            akh.c("Expected a double but was " + this.q + " at path " + n());
            return this.o;
        }
        this.q = r;
        this.n = 11;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int l() throws IOException {
        StringBuilder sb;
        double parseDouble;
        int i2;
        int i3 = this.n;
        if (i3 == 0) {
            i3 = o();
        }
        if (i3 == 16) {
            long j2 = this.o;
            int i4 = (int) j2;
            if (j2 == i4) {
                this.n = 0;
                int[] iArr = this.d;
                int i5 = this.f1786a - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
            sb = new StringBuilder();
            sb.append("Expected an int but was ");
            sb.append(this.o);
        } else {
            if (i3 == 17) {
                this.q = this.m.e(this.p);
            } else if (i3 == 9 || i3 == 8) {
                this.q = a(i3 == 9 ? h : g);
                try {
                    int parseInt = Integer.parseInt(this.q);
                    this.n = 0;
                    int[] iArr2 = this.d;
                    int i6 = this.f1786a - 1;
                    iArr2[i6] = iArr2[i6] + 1;
                    return parseInt;
                } catch (NumberFormatException unused) {
                }
            } else if (i3 != 11) {
                sb = new StringBuilder();
                sb.append("Expected an int but was ");
                sb.append(f());
            }
            this.n = 11;
            try {
                parseDouble = Double.parseDouble(this.q);
                i2 = (int) parseDouble;
            } catch (NumberFormatException unused2) {
                sb = new StringBuilder();
            }
            if (i2 == parseDouble) {
                this.q = null;
                this.n = 0;
                int[] iArr3 = this.d;
                int i7 = this.f1786a - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i2;
            }
            sb = new StringBuilder();
            sb.append("Expected an int but was ");
            sb.append(this.q);
        }
        sb.append(" at path ");
        sb.append(n());
        akh.c(sb.toString());
        return (int) this.o;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void m() throws IOException {
        ByteString byteString;
        if (this.f) {
            akh.c("Cannot skip unexpected " + f() + " at " + n());
            return;
        }
        int i2 = 0;
        do {
            int i3 = this.n;
            if (i3 == 0) {
                i3 = o();
            }
            if (i3 == 3) {
                a(1);
            } else if (i3 == 1) {
                a(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        akh.c("Expected a value but was " + f() + " at path " + n());
                        return;
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        akh.c("Expected a value but was " + f() + " at path " + n());
                        return;
                    }
                } else {
                    if (i3 == 14 || i3 == 10) {
                        s();
                    } else {
                        if (i3 == 9 || i3 == 13) {
                            byteString = h;
                        } else if (i3 == 8 || i3 == 12) {
                            byteString = g;
                        } else if (i3 == 17) {
                            this.m.g(this.p);
                        } else if (i3 == 18) {
                            akh.c("Expected a value but was " + f() + " at path " + n());
                            return;
                        }
                        b(byteString);
                    }
                    this.n = 0;
                }
                this.f1786a--;
                this.n = 0;
            }
            i2++;
            this.n = 0;
        } while (i2 != 0);
        int[] iArr = this.d;
        int i4 = this.f1786a - 1;
        iArr[i4] = iArr[i4] + 1;
        this.c[this.f1786a - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.l + riy.BRACKET_END_STR;
    }
}
