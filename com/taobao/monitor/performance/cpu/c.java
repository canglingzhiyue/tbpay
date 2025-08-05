package com.taobao.monitor.performance.cpu;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.CharBuffer;

/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f18213a;
    private final int c;
    private char d;
    private char e;
    private int b = -1;
    private boolean f = true;
    private boolean g = false;

    public c(byte[] bArr, int i) {
        this.f18213a = bArr;
        this.c = i;
    }

    public c a() throws ParseException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1200e668", new Object[]{this});
        }
        if (this.f18213a == null || this.c <= 0) {
            throw new RuntimeException("can not parse null buffer.");
        }
        this.f = true;
        this.b = -1;
        this.d = (char) 0;
        this.e = (char) 0;
        this.g = false;
        return this;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f) {
            int i = this.b;
            int i2 = this.c;
            if (i <= i2 - 1 && i < i2 - 1) {
                return true;
            }
        }
        return false;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.b++;
        this.e = this.d;
        this.d = (char) this.f18213a[this.b];
        this.g = false;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.g) {
            throw new RuntimeException("Can only rewind one step!");
        } else {
            this.b--;
            this.d = this.e;
            this.g = true;
        }
    }

    public CharBuffer a(CharBuffer charBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharBuffer) ipChange.ipc$dispatch("2adb3b0e", new Object[]{this, charBuffer});
        }
        charBuffer.clear();
        CharBuffer charBuffer2 = charBuffer;
        boolean z = true;
        while (true) {
            if (!b()) {
                break;
            }
            f();
            if (!Character.isWhitespace(this.d)) {
                if (!charBuffer2.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer2.capacity() << 1);
                    charBuffer2.flip();
                    allocate.put(charBuffer2);
                    charBuffer2 = allocate;
                }
                charBuffer2.put(this.d);
                z = false;
            } else if (z) {
                throw new RuntimeException("Couldn't read string!");
            } else {
                g();
            }
        }
        if (z) {
            throw new RuntimeException("Couldn't read string because file ended!");
        }
        charBuffer2.flip();
        return charBuffer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        return r0 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        throw new java.lang.RuntimeException("Couldn't read number because the file ended!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long c() {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.monitor.performance.cpu.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "5889b5e"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
        L19:
            r0 = 1
            r4 = 0
        L1d:
            boolean r6 = r9.b()
            if (r6 == 0) goto L50
            r9.f()
            char r6 = r9.d
            r7 = 48
            if (r6 < r7) goto L39
            r7 = 57
            if (r6 > r7) goto L39
            r7 = 10
            long r4 = r4 * r7
            int r6 = r6 + (-48)
            long r6 = (long) r6
            long r4 = r4 + r6
            goto L43
        L39:
            if (r3 == 0) goto L4d
            char r0 = r9.d
            r1 = 45
            if (r0 != r1) goto L45
            r0 = -1
        L43:
            r3 = 0
            goto L1d
        L45:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Couldn't read number!"
            r0.<init>(r1)
            throw r0
        L4d:
            r9.g()
        L50:
            if (r3 != 0) goto L55
            long r0 = r0 * r4
            return r0
        L55:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Couldn't read number because the file ended!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.monitor.performance.cpu.c.c():long");
    }

    public CharBuffer a(char c, CharBuffer charBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharBuffer) ipChange.ipc$dispatch("aa7d1101", new Object[]{this, new Character(c), charBuffer});
        }
        charBuffer.clear();
        CharBuffer charBuffer2 = charBuffer;
        boolean z = true;
        while (true) {
            if (!b()) {
                break;
            }
            f();
            if (c != this.d) {
                if (!charBuffer2.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer2.capacity() << 1);
                    charBuffer2.flip();
                    allocate.put(charBuffer2);
                    charBuffer2 = allocate;
                }
                charBuffer2.put(this.d);
                z = false;
            } else if (z) {
                return charBuffer2;
            } else {
                g();
            }
        }
        if (z) {
            throw new RuntimeException("Couldn't read string because file ended!");
        }
        charBuffer2.flip();
        return charBuffer2;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(' ');
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a('(');
        }
    }

    public void a(char c) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217d15", new Object[]{this, new Character(c)});
            return;
        }
        while (b()) {
            f();
            if (this.d == c) {
                z = true;
            } else if (z) {
                g();
                return;
            }
        }
    }
}
