package org.json.alipay;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f25085a;
    private Reader b;
    private char c;
    private boolean d;

    public c(Reader reader) {
        this.b = !reader.markSupported() ? new BufferedReader(reader) : reader;
        this.d = false;
        this.f25085a = 0;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    public void a() throws JSONException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d || (i = this.f25085a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        } else {
            this.f25085a = i - 1;
            this.d = true;
        }
    }

    public char b() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("57a83d6", new Object[]{this})).charValue();
        }
        if (this.d) {
            this.d = false;
            if (this.c != 0) {
                this.f25085a++;
            }
            return this.c;
        }
        try {
            int read = this.b.read();
            if (read <= 0) {
                this.c = (char) 0;
                return (char) 0;
            }
            this.f25085a++;
            this.c = (char) read;
            return this.c;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    public String a(int i) throws JSONException {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        if (this.d) {
            this.d = false;
            cArr[0] = this.c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int read = this.b.read(cArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.f25085a += i2;
        if (i2 < i) {
            throw a("Substring bounds error");
        }
        this.c = cArr[i - 1];
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char c() throws org.json.alipay.JSONException {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = org.json.alipay.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L19
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r2 = "5889b57"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            return r0
        L19:
            char r0 = r5.b()
            r1 = 13
            r2 = 10
            r3 = 47
            if (r0 != r3) goto L57
            char r0 = r5.b()
            r4 = 42
            if (r0 == r4) goto L3e
            if (r0 == r3) goto L33
            r5.a()
            return r3
        L33:
            char r0 = r5.b()
            if (r0 == r2) goto L19
            if (r0 == r1) goto L19
            if (r0 != 0) goto L33
            goto L19
        L3e:
            char r0 = r5.b()
            if (r0 == 0) goto L50
            if (r0 != r4) goto L3e
            char r0 = r5.b()
            if (r0 == r3) goto L19
            r5.a()
            goto L3e
        L50:
            java.lang.String r0 = "Unclosed comment"
            org.json.alipay.JSONException r0 = r5.a(r0)
            throw r0
        L57:
            r3 = 35
            if (r0 != r3) goto L66
        L5b:
            char r0 = r5.b()
            if (r0 == r2) goto L19
            if (r0 == r1) goto L19
            if (r0 != 0) goto L5b
            goto L19
        L66:
            if (r0 == 0) goto L6c
            r1 = 32
            if (r0 <= r1) goto L19
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.c():char");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        throw a("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(char r7) throws org.json.alipay.JSONException {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = org.json.alipay.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            if (r1 == 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            java.lang.Character r3 = new java.lang.Character
            r3.<init>(r7)
            r1[r2] = r3
            java.lang.String r7 = "2299a42b"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L1d:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L22:
            char r1 = r6.b()
            if (r1 == 0) goto L9a
            r3 = 10
            if (r1 == r3) goto L9a
            r4 = 13
            if (r1 == r4) goto L9a
            r5 = 92
            if (r1 == r5) goto L3f
            if (r1 != r7) goto L3b
            java.lang.String r7 = r0.toString()
            return r7
        L3b:
            r0.append(r1)
            goto L22
        L3f:
            char r1 = r6.b()
            r5 = 98
            if (r1 == r5) goto L94
            r5 = 102(0x66, float:1.43E-43)
            if (r1 == r5) goto L8e
            r5 = 110(0x6e, float:1.54E-43)
            if (r1 == r5) goto L8a
            r3 = 114(0x72, float:1.6E-43)
            if (r1 == r3) goto L86
            r3 = 120(0x78, float:1.68E-43)
            r4 = 16
            if (r1 == r3) goto L79
            r3 = 116(0x74, float:1.63E-43)
            if (r1 == r3) goto L73
            r3 = 117(0x75, float:1.64E-43)
            if (r1 == r3) goto L65
            r0.append(r1)
            goto L22
        L65:
            r1 = 4
            java.lang.String r1 = r6.a(r1)
            int r1 = java.lang.Integer.parseInt(r1, r4)
            char r1 = (char) r1
            r0.append(r1)
            goto L22
        L73:
            r1 = 9
            r0.append(r1)
            goto L22
        L79:
            java.lang.String r1 = r6.a(r2)
            int r1 = java.lang.Integer.parseInt(r1, r4)
            char r1 = (char) r1
            r0.append(r1)
            goto L22
        L86:
            r0.append(r4)
            goto L22
        L8a:
            r0.append(r3)
            goto L22
        L8e:
            r1 = 12
            r0.append(r1)
            goto L22
        L94:
            r1 = 8
            r0.append(r1)
            goto L22
        L9a:
            java.lang.String r7 = "Unterminated string"
            org.json.alipay.JSONException r7 = r6.a(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.a(char):java.lang.String");
    }

    public Object d() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50c537a7", new Object[]{this});
        }
        char c = c();
        if (c != '\"') {
            if (c != '[') {
                if (c == '{') {
                    a();
                    return new b(this);
                } else if (c != '\'') {
                    if (c != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char c2 = c;
                        while (c2 >= ' ' && ",:]}/\\\"[{;=#".indexOf(c2) < 0) {
                            stringBuffer.append(c2);
                            c2 = b();
                        }
                        a();
                        String trim = stringBuffer.toString().trim();
                        if (trim.equals("")) {
                            throw a("Missing value");
                        }
                        if (trim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (trim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (trim.equalsIgnoreCase("null")) {
                            return b.NULL;
                        }
                        if ((c < '0' || c > '9') && c != '.' && c != '-' && c != '+') {
                            return trim;
                        }
                        if (c == '0') {
                            try {
                                if (trim.length() > 2 && (trim.charAt(1) == 'x' || trim.charAt(1) == 'X')) {
                                    return new Integer(Integer.parseInt(trim.substring(2), 16));
                                }
                                return new Integer(Integer.parseInt(trim, 8));
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            try {
                                try {
                                    return new Integer(trim);
                                } catch (Exception unused2) {
                                    return new Double(trim);
                                }
                            } catch (Exception unused3) {
                                return trim;
                            }
                        } catch (Exception unused4) {
                            return new Long(trim);
                        }
                    }
                }
            }
            a();
            return new a(this);
        }
        return a(c);
    }

    public JSONException a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONException) ipChange.ipc$dispatch("10bbd185", new Object[]{this, str});
        }
        return new JSONException(str + toString());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return " at character " + this.f25085a;
    }
}
