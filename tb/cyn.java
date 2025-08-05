package tb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes4.dex */
public class cyn {

    /* renamed from: a  reason: collision with root package name */
    private final String f26601a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private char[] g;

    public cyn(X500Principal x500Principal) {
        this.f26601a = x500Principal.getName("RFC2253");
        this.b = this.f26601a.length();
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            throw new IllegalStateException("Malformed DN: " + this.f26601a);
        }
        char c = this.g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c < 'A' || c > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.f26601a);
        } else {
            i2 = c - '7';
        }
        char c2 = this.g[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 < 'A' || c2 > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.f26601a);
        } else {
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    private String a() {
        char[] cArr;
        while (true) {
            int i = this.c;
            if (i >= this.b || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        int i2 = this.c;
        if (i2 == this.b) {
            return null;
        }
        this.d = i2;
        do {
            this.c = i2 + 1;
            i2 = this.c;
            if (i2 >= this.b) {
                break;
            }
            cArr = this.g;
            if (cArr[i2] == '=') {
                break;
            }
        } while (cArr[i2] != ' ');
        int i3 = this.c;
        if (i3 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f26601a);
        }
        this.e = i3;
        if (this.g[i3] == ' ') {
            while (true) {
                int i4 = this.c;
                if (i4 >= this.b) {
                    break;
                }
                char[] cArr2 = this.g;
                if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                    break;
                }
                this.c = i4 + 1;
            }
            char[] cArr3 = this.g;
            int i5 = this.c;
            if (cArr3[i5] != '=' || i5 == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f26601a);
            }
        }
        int i6 = this.c;
        do {
            this.c = i6 + 1;
            i6 = this.c;
            if (i6 >= this.b) {
                break;
            }
        } while (this.g[i6] == ' ');
        int i7 = this.e;
        int i8 = this.d;
        if (i7 - i8 > 4) {
            char[] cArr4 = this.g;
            if (cArr4[i8 + 3] == '.' && (cArr4[i8] == 'O' || cArr4[i8] == 'o')) {
                char[] cArr5 = this.g;
                int i9 = this.d + 1;
                if (cArr5[i9] == 'I' || cArr5[i9] == 'i') {
                    char[] cArr6 = this.g;
                    int i10 = this.d + 2;
                    if (cArr6[i10] == 'D' || cArr6[i10] == 'd') {
                        this.d += 4;
                    }
                }
            }
        }
        char[] cArr7 = this.g;
        int i11 = this.d;
        return new String(cArr7, i11, this.e - i11);
    }

    private String b() {
        this.c++;
        this.d = this.c;
        int i = this.d;
        while (true) {
            this.e = i;
            int i2 = this.c;
            if (i2 == this.b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f26601a);
            }
            char[] cArr = this.g;
            if (cArr[i2] == '\"') {
                do {
                    this.c = i2 + 1;
                    i2 = this.c;
                    if (i2 >= this.b) {
                        break;
                    }
                } while (this.g[i2] == ' ');
                char[] cArr2 = this.g;
                int i3 = this.d;
                return new String(cArr2, i3, this.e - i3);
            }
            if (cArr[i2] == '\\') {
                cArr[this.e] = e();
            } else {
                cArr[this.e] = cArr[i2];
            }
            this.c++;
            i = this.e + 1;
        }
    }

    private String c() {
        int i = this.c;
        if (i + 4 >= this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f26601a);
        }
        this.d = i;
        while (true) {
            this.c = i + 1;
            int i2 = this.c;
            if (i2 == this.b) {
                break;
            }
            char[] cArr = this.g;
            if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                break;
            } else if (cArr[i2] == ' ') {
                this.e = i2;
                do {
                    this.c = i2 + 1;
                    i2 = this.c;
                    if (i2 >= this.b) {
                        break;
                    }
                } while (this.g[i2] == ' ');
            } else {
                if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                    cArr[i2] = (char) (cArr[i2] + ' ');
                }
                i = this.c;
            }
        }
        this.e = this.c;
        int i3 = this.e;
        int i4 = this.d;
        int i5 = i3 - i4;
        if (i5 < 5 || (i5 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f26601a);
        }
        byte[] bArr = new byte[i5 / 2];
        int i6 = i4 + 1;
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr[i7] = (byte) a(i6);
            i6 += 2;
        }
        return new String(this.g, this.d, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String d() {
        /*
            r8 = this;
            int r0 = r8.c
            r8.d = r0
            r8.e = r0
        L6:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L4f
            r5 = 92
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L4f
            if (r2 == r3) goto L4f
            int r2 = r8.e
            int r3 = r2 + 1
            r8.e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L4a
        L3c:
            int r0 = r8.e
            int r2 = r0 + 1
            r8.e = r2
            char r2 = r8.e()
            r1[r0] = r2
            int r0 = r8.c
        L4a:
            int r0 = r0 + 1
            r8.c = r0
            goto L6
        L4f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.e
            r8.f = r2
            int r0 = r0 + 1
            r8.c = r0
            int r0 = r2 + 1
            r8.e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 >= r1) goto L83
            char[] r1 = r8.g
            char r2 = r1[r0]
            if (r2 != r6) goto L83
            int r2 = r8.e
            int r7 = r2 + 1
            r8.e = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.c = r0
            goto L6a
        L83:
            int r0 = r8.c
            int r1 = r8.b
            if (r0 == r1) goto L97
            char[] r1 = r8.g
            char r2 = r1[r0]
            if (r2 == r3) goto L97
            char r2 = r1[r0]
            if (r2 == r4) goto L97
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L97:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.g
            int r2 = r8.d
            int r3 = r8.f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cyn.d():java.lang.String");
    }

    private char e() {
        this.c++;
        int i = this.c;
        if (i == this.b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f26601a);
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return f();
                    }
            }
        }
        return cArr[i];
    }

    private char f() {
        int i;
        int i2;
        int a2 = a(this.c);
        this.c++;
        if (a2 < 128) {
            return (char) a2;
        }
        if (a2 < 192 || a2 > 247) {
            return riy.CONDITION_IF;
        }
        if (a2 <= 223) {
            i2 = a2 & 31;
            i = 1;
        } else if (a2 <= 239) {
            i = 2;
            i2 = a2 & 15;
        } else {
            i = 3;
            i2 = a2 & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c++;
            int i4 = this.c;
            if (i4 == this.b || this.g[i4] != '\\') {
                return riy.CONDITION_IF;
            }
            this.c = i4 + 1;
            int a3 = a(this.c);
            this.c++;
            if ((a3 & crd.DETECT_WIDTH) != 128) {
                return riy.CONDITION_IF;
            }
            i2 = (i2 << 6) + (a3 & 63);
        }
        return (char) i2;
    }

    public List<String> a(String str) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = this.f26601a.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String a2 = a();
        if (a2 == null) {
            return emptyList;
        }
        do {
            int i = this.c;
            if (i < this.b) {
                char c = this.g[i];
                String d = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : d() : c() : b();
                if (str.equalsIgnoreCase(a2)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(d);
                }
                int i2 = this.c;
                if (i2 < this.b) {
                    char[] cArr = this.g;
                    if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.f26601a);
                    }
                    this.c++;
                    a2 = a();
                }
            }
            return emptyList;
        } while (a2 != null);
        throw new IllegalStateException("Malformed DN: " + this.f26601a);
    }
}
