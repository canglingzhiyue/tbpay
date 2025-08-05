package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class lyf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ESCAPE_MODE_BACKSLASH = 2;
    public static final int ESCAPE_MODE_DOUBLED = 1;

    /* renamed from: a  reason: collision with root package name */
    private Reader f30986a;
    private String b;
    private e c;
    private Charset d;
    private boolean e;
    private b f;
    private a g;
    private d h;
    private boolean[] i;
    private String j;
    private c k;
    private boolean l;
    private boolean m;
    private boolean n;
    private char o;
    private boolean p;
    private int q;
    private long r;
    private String[] s;
    private boolean t;
    private boolean u;

    /* loaded from: classes7.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public char[] f30987a = new char[50];
        public int b = 0;

        public a() {
        }
    }

    /* loaded from: classes7.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public char[] f30988a = new char[1024];
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;

        public b() {
        }
    }

    /* loaded from: classes7.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public String[] f30989a = null;
        public int b = 0;
        public HashMap c = new HashMap();

        public c() {
        }
    }

    /* loaded from: classes7.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public char[] f30990a = new char[500];
        public int b = 0;

        public d() {
        }
    }

    /* loaded from: classes7.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f30991a = true;
        public char b = '\"';
        public boolean c = true;
        public boolean d = true;
        public char e = ',';
        public char f = 0;
        public char g = '#';
        public boolean h = false;
        public int i = 1;
        public boolean j = true;
        public boolean k = true;
        public boolean l = true;

        public e() {
        }
    }

    private static char b(char c2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("a9d655a1", new Object[]{new Character(c2)})).charValue();
        }
        char c3 = 'a';
        if (c2 < 'a') {
            c3 = 'A';
            if (c2 < 'A') {
                i = c2 - '0';
                return (char) i;
            }
        }
        i = (c2 - c3) + 10;
        return (char) i;
    }

    public lyf(Reader reader, char c2) {
        this.f30986a = null;
        this.b = null;
        this.c = new e();
        this.d = null;
        this.e = false;
        this.f = new b();
        this.g = new a();
        this.h = new d();
        this.i = null;
        this.j = "";
        this.k = new c();
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = (char) 0;
        this.p = false;
        this.q = 0;
        this.r = 0L;
        this.s = new String[10];
        this.t = false;
        this.u = false;
        if (reader == null) {
            throw new IllegalArgumentException("Parameter inputStream can not be null.");
        }
        this.f30986a = reader;
        this.c.e = c2;
        this.t = true;
        this.i = new boolean[this.s.length];
    }

    public lyf(InputStream inputStream, char c2, Charset charset) {
        this(new InputStreamReader(inputStream, charset), c2);
    }

    public String[] a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("c770f637", new Object[]{this});
        }
        k();
        if (this.k.f30989a == null) {
            return null;
        }
        String[] strArr = new String[this.k.b];
        System.arraycopy(this.k.f30989a, 0, strArr, 0, this.k.b);
        return strArr;
    }

    public String[] b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this});
        }
        k();
        int i = this.q;
        String[] strArr = new String[i];
        System.arraycopy(this.s, 0, strArr, 0, i);
        return strArr;
    }

    public String a(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        k();
        return (i < 0 || i >= this.q) ? "" : this.s[i];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d3, code lost:
        if (r7 != 'x') goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03a2, code lost:
        if (r6 == r3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03ad, code lost:
        if (r6 == 3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03b8, code lost:
        if (r6 == 3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03c8, code lost:
        if (r6 == 4) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03ca, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0498, code lost:
        if (r2 != 'x') goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r8 == 2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
        if (r8 == 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
        if (r8 == 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (r8 == r14) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0509  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lyf.c():boolean");
    }

    private void g() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (!this.t) {
            String str = this.b;
            if (str != null) {
                this.f30986a = new BufferedReader(new InputStreamReader(new FileInputStream(str), this.d), 4096);
            }
            this.d = null;
            this.t = true;
        }
        i();
        if (this.c.l && this.f.c > 0) {
            if (this.h.f30990a.length - this.h.b < this.f.c - this.f.e) {
                char[] cArr = new char[this.h.f30990a.length + Math.max(this.f.c - this.f.e, this.h.f30990a.length)];
                System.arraycopy(this.h.f30990a, 0, cArr, 0, this.h.b);
                this.h.f30990a = cArr;
            }
            System.arraycopy(this.f.f30988a, this.f.e, this.h.f30990a, this.h.b, this.f.c - this.f.e);
            this.h.b += this.f.c - this.f.e;
        }
        try {
            this.f.c = this.f30986a.read(this.f.f30988a, 0, this.f.f30988a.length);
            if (this.f.c == -1) {
                this.n = false;
            }
            b bVar = this.f;
            bVar.b = 0;
            bVar.e = 0;
            bVar.d = 0;
        } catch (IOException e2) {
            f();
            throw e2;
        }
    }

    public boolean d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        boolean c2 = c();
        c cVar = this.k;
        int i = this.q;
        cVar.b = i;
        cVar.f30989a = new String[i];
        for (int i2 = 0; i2 < this.k.b; i2++) {
            String a2 = a(i2);
            this.k.f30989a[i2] = a2;
            this.k.c.put(a2, Integer.valueOf(i2));
        }
        if (c2) {
            this.r--;
        }
        this.q = 0;
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lyf.h():void");
    }

    private void a(char c2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217d15", new Object[]{this, new Character(c2)});
            return;
        }
        if (this.g.b == this.g.f30987a.length) {
            char[] cArr = new char[this.g.f30987a.length << 1];
            System.arraycopy(this.g.f30987a, 0, cArr, 0, this.g.b);
            this.g.f30987a = cArr;
        }
        char[] cArr2 = this.g.f30987a;
        a aVar = this.g;
        int i = aVar.b;
        aVar.b = i + 1;
        cArr2[i] = c2;
        b bVar = this.f;
        bVar.d = bVar.b + 1;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        if (this.l && this.f.d < this.f.b) {
            if (this.g.f30987a.length - this.g.b < this.f.b - this.f.d) {
                char[] cArr = new char[this.g.f30987a.length + Math.max(this.f.b - this.f.d, this.g.f30987a.length)];
                System.arraycopy(this.g.f30987a, 0, cArr, 0, this.g.b);
                this.g.f30987a = cArr;
            }
            System.arraycopy(this.f.f30988a, this.f.d, this.g.f30987a, this.g.b, this.f.b - this.f.d);
            this.g.b += this.f.b - this.f.d;
        }
        b bVar = this.f;
        bVar.d = bVar.b + 1;
    }

    private void j() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.p = true;
        this.r++;
    }

    public boolean e() throws IOException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        k();
        this.q = 0;
        if (this.n) {
            boolean z2 = false;
            z = false;
            do {
                if (this.f.b == this.f.c) {
                    g();
                } else {
                    char c2 = this.f.f30988a[this.f.b];
                    if (c2 == '\r' || c2 == '\n') {
                        z2 = true;
                    }
                    this.o = c2;
                    if (!z2) {
                        this.f.b++;
                    }
                    z = true;
                }
                if (!this.n) {
                    break;
                }
            } while (!z2);
            this.g.b = 0;
            b bVar = this.f;
            bVar.e = bVar.b + 1;
        } else {
            z = false;
        }
        this.h.b = 0;
        this.j = "";
        return z;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.u) {
        } else {
            a(true);
            this.u = true;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.u) {
        } else {
            if (z) {
                this.d = null;
                c cVar = this.k;
                cVar.f30989a = null;
                cVar.c = null;
                this.f.f30988a = null;
                this.g.f30987a = null;
                this.h.f30990a = null;
            }
            try {
                if (this.t) {
                    this.f30986a.close();
                }
            } catch (Exception unused) {
            }
            this.f30986a = null;
            this.u = true;
        }
    }

    private void k() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.u) {
            throw new IOException("This instance of the CsvReader class has already been closed.");
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            a(false);
        }
    }
}
