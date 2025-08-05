package com.xiaomi.push;

/* loaded from: classes9.dex */
public final class em {

    /* loaded from: classes9.dex */
    public static final class a extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f265a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f268b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f271c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f273d;

        /* renamed from: e  reason: collision with other field name */
        private boolean f275e;

        /* renamed from: f  reason: collision with other field name */
        private boolean f276f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        /* renamed from: a  reason: collision with root package name */
        private int f24449a = 0;

        /* renamed from: a  reason: collision with other field name */
        private long f263a = 0;

        /* renamed from: a  reason: collision with other field name */
        private String f264a = "";

        /* renamed from: b  reason: collision with other field name */
        private String f267b = "";

        /* renamed from: c  reason: collision with other field name */
        private String f270c = "";

        /* renamed from: d  reason: collision with other field name */
        private String f272d = "";

        /* renamed from: e  reason: collision with other field name */
        private String f274e = "";
        private int b = 1;
        private int c = 0;
        private int d = 0;
        private String f = "";

        /* renamed from: b  reason: collision with other field name */
        private long f266b = 0;

        /* renamed from: c  reason: collision with other field name */
        private long f269c = 0;
        private int e = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.e < 0) {
                mo1912b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public long mo1910a() {
            return this.f263a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public a mo1910a() {
            this.f276f = false;
            this.f272d = "";
            return this;
        }

        public a a(int i) {
            this.f265a = true;
            this.f24449a = i;
            return this;
        }

        public a a(long j) {
            this.f268b = true;
            this.f263a = j;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public a mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                switch (m1715a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.m1724b());
                        break;
                    case 16:
                        a(bVar.m1725b());
                        break;
                    case 26:
                        a(bVar.m1718a());
                        break;
                    case 34:
                        b(bVar.m1718a());
                        break;
                    case 42:
                        c(bVar.m1718a());
                        break;
                    case 50:
                        d(bVar.m1718a());
                        break;
                    case 58:
                        e(bVar.m1718a());
                        break;
                    case 64:
                        b(bVar.m1724b());
                        break;
                    case 72:
                        c(bVar.m1724b());
                        break;
                    case 80:
                        d(bVar.m1724b());
                        break;
                    case 90:
                        f(bVar.m1718a());
                        break;
                    case 96:
                        b(bVar.m1725b());
                        break;
                    case 104:
                        c(bVar.m1725b());
                        break;
                    default:
                        if (a(bVar, m1715a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        public a a(String str) {
            this.f271c = true;
            this.f264a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo1910a() {
            return this.f264a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1755a(1, c());
            }
            if (mo1912b()) {
                cVar.m1769b(2, mo1910a());
            }
            if (m1854c()) {
                cVar.m1759a(3, mo1910a());
            }
            if (m1856d()) {
                cVar.m1759a(4, mo1912b());
            }
            if (m1858e()) {
                cVar.m1759a(5, m1853c());
            }
            if (m1860f()) {
                cVar.m1759a(6, m1855d());
            }
            if (g()) {
                cVar.m1759a(7, m1857e());
            }
            if (h()) {
                cVar.m1755a(8, d());
            }
            if (i()) {
                cVar.m1755a(9, e());
            }
            if (j()) {
                cVar.m1755a(10, f());
            }
            if (k()) {
                cVar.m1759a(11, m1859f());
            }
            if (l()) {
                cVar.m1769b(12, mo1912b());
            }
            if (m()) {
                cVar.m1769b(13, m1852c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f265a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, c());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.b(2, mo1910a());
            }
            if (m1854c()) {
                i += com.xiaomi.push.c.a(3, mo1910a());
            }
            if (m1856d()) {
                i += com.xiaomi.push.c.a(4, mo1912b());
            }
            if (m1858e()) {
                i += com.xiaomi.push.c.a(5, m1853c());
            }
            if (m1860f()) {
                i += com.xiaomi.push.c.a(6, m1855d());
            }
            if (g()) {
                i += com.xiaomi.push.c.a(7, m1857e());
            }
            if (h()) {
                i += com.xiaomi.push.c.a(8, d());
            }
            if (i()) {
                i += com.xiaomi.push.c.a(9, e());
            }
            if (j()) {
                i += com.xiaomi.push.c.a(10, f());
            }
            if (k()) {
                i += com.xiaomi.push.c.a(11, m1859f());
            }
            if (l()) {
                i += com.xiaomi.push.c.b(12, mo1912b());
            }
            if (m()) {
                i += com.xiaomi.push.c.b(13, m1852c());
            }
            this.e = i;
            return i;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public long mo1912b() {
            return this.f266b;
        }

        public a b(int i) {
            this.h = true;
            this.b = i;
            return this;
        }

        public a b(long j) {
            this.l = true;
            this.f266b = j;
            return this;
        }

        public a b(String str) {
            this.f273d = true;
            this.f267b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public String mo1912b() {
            return this.f267b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.f268b;
        }

        public int c() {
            return this.f24449a;
        }

        /* renamed from: c  reason: collision with other method in class */
        public long m1852c() {
            return this.f269c;
        }

        public a c(int i) {
            this.i = true;
            this.c = i;
            return this;
        }

        public a c(long j) {
            this.m = true;
            this.f269c = j;
            return this;
        }

        public a c(String str) {
            this.f275e = true;
            this.f270c = str;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public String m1853c() {
            return this.f270c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1854c() {
            return this.f271c;
        }

        public int d() {
            return this.b;
        }

        public a d(int i) {
            this.j = true;
            this.d = i;
            return this;
        }

        public a d(String str) {
            this.f276f = true;
            this.f272d = str;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public String m1855d() {
            return this.f272d;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m1856d() {
            return this.f273d;
        }

        public int e() {
            return this.c;
        }

        public a e(String str) {
            this.g = true;
            this.f274e = str;
            return this;
        }

        /* renamed from: e  reason: collision with other method in class */
        public String m1857e() {
            return this.f274e;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m1858e() {
            return this.f275e;
        }

        public int f() {
            return this.d;
        }

        public a f(String str) {
            this.k = true;
            this.f = str;
            return this;
        }

        /* renamed from: f  reason: collision with other method in class */
        public String m1859f() {
            return this.f;
        }

        /* renamed from: f  reason: collision with other method in class */
        public boolean m1860f() {
            return this.f276f;
        }

        public boolean g() {
            return this.g;
        }

        public boolean h() {
            return this.h;
        }

        public boolean i() {
            return this.i;
        }

        public boolean j() {
            return this.j;
        }

        public boolean k() {
            return this.k;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.m;
        }
    }

    /* loaded from: classes9.dex */
    public static final class b extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f277a;

        /* renamed from: c  reason: collision with other field name */
        private boolean f279c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f280d;
        private boolean e;

        /* renamed from: b  reason: collision with other field name */
        private boolean f278b = false;

        /* renamed from: a  reason: collision with root package name */
        private int f24450a = 0;
        private int b = 0;
        private int c = 0;
        private int d = -1;

        public static b a(byte[] bArr) {
            return (b) new b().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.d < 0) {
                mo1912b();
            }
            return this.d;
        }

        public b a(int i) {
            this.f279c = true;
            this.f24450a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public b mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 8) {
                        a(bVar.m1721a());
                    } else if (m1715a == 24) {
                        a(bVar.m1724b());
                    } else if (m1715a == 32) {
                        b(bVar.m1724b());
                    } else if (m1715a == 40) {
                        c(bVar.m1724b());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public b a(boolean z) {
            this.f277a = true;
            this.f278b = z;
            return this;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1912b()) {
                cVar.m1760a(1, mo1910a());
            }
            if (m1864c()) {
                cVar.m1755a(3, c());
            }
            if (m1865d()) {
                cVar.m1755a(4, d());
            }
            if (m1866e()) {
                cVar.m1755a(5, e());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo1910a() {
            return this.f278b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1912b()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (m1864c()) {
                i += com.xiaomi.push.c.a(3, c());
            }
            if (m1865d()) {
                i += com.xiaomi.push.c.a(4, d());
            }
            if (m1866e()) {
                i += com.xiaomi.push.c.a(5, e());
            }
            this.d = i;
            return i;
        }

        public b b(int i) {
            this.f280d = true;
            this.b = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.f277a;
        }

        public int c() {
            return this.f24450a;
        }

        public b c(int i) {
            this.e = true;
            this.c = i;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1864c() {
            return this.f279c;
        }

        public int d() {
            return this.b;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m1865d() {
            return this.f280d;
        }

        public int e() {
            return this.c;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m1866e() {
            return this.e;
        }
    }

    /* loaded from: classes9.dex */
    public static final class c extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f282a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f283b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f284c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f285d;

        /* renamed from: e  reason: collision with other field name */
        private boolean f286e;

        /* renamed from: f  reason: collision with other field name */
        private boolean f287f;

        /* renamed from: a  reason: collision with other field name */
        private String f281a = "";
        private String b = "";
        private String c = "";
        private String d = "";
        private String e = "";
        private String f = "";

        /* renamed from: a  reason: collision with root package name */
        private int f24451a = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.f24451a < 0) {
                mo1912b();
            }
            return this.f24451a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public c mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 10) {
                        a(bVar.m1718a());
                    } else if (m1715a == 18) {
                        b(bVar.m1718a());
                    } else if (m1715a == 26) {
                        c(bVar.m1718a());
                    } else if (m1715a == 34) {
                        d(bVar.m1718a());
                    } else if (m1715a == 42) {
                        e(bVar.m1718a());
                    } else if (m1715a == 50) {
                        f(bVar.m1718a());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public c a(String str) {
            this.f282a = true;
            this.f281a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo1910a() {
            return this.f281a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1759a(1, mo1910a());
            }
            if (mo1912b()) {
                cVar.m1759a(2, mo1912b());
            }
            if (m1870c()) {
                cVar.m1759a(3, c());
            }
            if (m1871d()) {
                cVar.m1759a(4, d());
            }
            if (m1872e()) {
                cVar.m1759a(5, e());
            }
            if (m1873f()) {
                cVar.m1759a(6, f());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f282a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, mo1912b());
            }
            if (m1870c()) {
                i += com.xiaomi.push.c.a(3, c());
            }
            if (m1871d()) {
                i += com.xiaomi.push.c.a(4, d());
            }
            if (m1872e()) {
                i += com.xiaomi.push.c.a(5, e());
            }
            if (m1873f()) {
                i += com.xiaomi.push.c.a(6, f());
            }
            this.f24451a = i;
            return i;
        }

        public c b(String str) {
            this.f283b = true;
            this.b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo1912b() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo1912b() {
            return this.f283b;
        }

        public c c(String str) {
            this.f284c = true;
            this.c = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1870c() {
            return this.f284c;
        }

        public c d(String str) {
            this.f285d = true;
            this.d = str;
            return this;
        }

        public String d() {
            return this.d;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m1871d() {
            return this.f285d;
        }

        public c e(String str) {
            this.f286e = true;
            this.e = str;
            return this;
        }

        public String e() {
            return this.e;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m1872e() {
            return this.f286e;
        }

        public c f(String str) {
            this.f287f = true;
            this.f = str;
            return this;
        }

        public String f() {
            return this.f;
        }

        /* renamed from: f  reason: collision with other method in class */
        public boolean m1873f() {
            return this.f287f;
        }
    }

    /* loaded from: classes9.dex */
    public static final class d extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f289a;

        /* renamed from: c  reason: collision with other field name */
        private boolean f291c;
        private boolean d;
        private boolean e;

        /* renamed from: b  reason: collision with other field name */
        private boolean f290b = false;

        /* renamed from: a  reason: collision with other field name */
        private String f288a = "";
        private String b = "";
        private String c = "";

        /* renamed from: a  reason: collision with root package name */
        private int f24452a = -1;

        public static d a(byte[] bArr) {
            return (d) new d().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.f24452a < 0) {
                mo1912b();
            }
            return this.f24452a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public d mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 8) {
                        a(bVar.m1721a());
                    } else if (m1715a == 18) {
                        a(bVar.m1718a());
                    } else if (m1715a == 26) {
                        b(bVar.m1718a());
                    } else if (m1715a == 34) {
                        c(bVar.m1718a());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public d a(String str) {
            this.f291c = true;
            this.f288a = str;
            return this;
        }

        public d a(boolean z) {
            this.f289a = true;
            this.f290b = z;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo1910a() {
            return this.f288a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1912b()) {
                cVar.m1760a(1, mo1910a());
            }
            if (m1877c()) {
                cVar.m1759a(2, mo1910a());
            }
            if (d()) {
                cVar.m1759a(3, mo1912b());
            }
            if (e()) {
                cVar.m1759a(4, c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f290b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1912b()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (m1877c()) {
                i += com.xiaomi.push.c.a(2, mo1910a());
            }
            if (d()) {
                i += com.xiaomi.push.c.a(3, mo1912b());
            }
            if (e()) {
                i += com.xiaomi.push.c.a(4, c());
            }
            this.f24452a = i;
            return i;
        }

        public d b(String str) {
            this.d = true;
            this.b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo1912b() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo1912b() {
            return this.f289a;
        }

        public d c(String str) {
            this.e = true;
            this.c = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1877c() {
            return this.f291c;
        }

        public boolean d() {
            return this.d;
        }

        public boolean e() {
            return this.e;
        }
    }

    /* loaded from: classes9.dex */
    public static final class e extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f295a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f298b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f300c;

        /* renamed from: d  reason: collision with other field name */
        private boolean f302d;

        /* renamed from: e  reason: collision with other field name */
        private boolean f304e;

        /* renamed from: f  reason: collision with other field name */
        private boolean f305f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        /* renamed from: a  reason: collision with root package name */
        private int f24453a = 0;

        /* renamed from: a  reason: collision with other field name */
        private String f294a = "";

        /* renamed from: b  reason: collision with other field name */
        private String f297b = "";

        /* renamed from: c  reason: collision with other field name */
        private String f299c = "";
        private int b = 0;

        /* renamed from: d  reason: collision with other field name */
        private String f301d = "";

        /* renamed from: e  reason: collision with other field name */
        private String f303e = "";
        private String f = "";

        /* renamed from: a  reason: collision with other field name */
        private b f293a = null;
        private int c = 0;

        /* renamed from: a  reason: collision with other field name */
        private com.xiaomi.push.a f292a = com.xiaomi.push.a.f24342a;

        /* renamed from: b  reason: collision with other field name */
        private com.xiaomi.push.a f296b = com.xiaomi.push.a.f24342a;
        private int d = 0;
        private int e = -1;

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.e < 0) {
                mo1912b();
            }
            return this.e;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public com.xiaomi.push.a mo1910a() {
            return this.f292a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public b mo1910a() {
            return this.f293a;
        }

        public e a(int i) {
            this.f295a = true;
            this.f24453a = i;
            return this;
        }

        public e a(com.xiaomi.push.a aVar) {
            this.k = true;
            this.f292a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public e mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                switch (m1715a) {
                    case 0:
                        return this;
                    case 8:
                        a(bVar.c());
                        break;
                    case 18:
                        a(bVar.m1718a());
                        break;
                    case 26:
                        b(bVar.m1718a());
                        break;
                    case 34:
                        c(bVar.m1718a());
                        break;
                    case 40:
                        b(bVar.m1724b());
                        break;
                    case 50:
                        d(bVar.m1718a());
                        break;
                    case 58:
                        e(bVar.m1718a());
                        break;
                    case 66:
                        f(bVar.m1718a());
                        break;
                    case 74:
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                        break;
                    case 80:
                        c(bVar.m1724b());
                        break;
                    case 90:
                        a(bVar.m1717a());
                        break;
                    case 98:
                        b(bVar.m1717a());
                        break;
                    case 104:
                        d(bVar.m1724b());
                        break;
                    default:
                        if (a(bVar, m1715a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }

        public e a(b bVar) {
            if (bVar != null) {
                this.i = true;
                this.f293a = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public e a(String str) {
            this.f298b = true;
            this.f294a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo1910a() {
            return this.f294a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1768b(1, c());
            }
            if (mo1912b()) {
                cVar.m1759a(2, mo1910a());
            }
            if (m1884c()) {
                cVar.m1759a(3, mo1912b());
            }
            if (m1886d()) {
                cVar.m1759a(4, m1883c());
            }
            if (m1888e()) {
                cVar.m1755a(5, d());
            }
            if (m1890f()) {
                cVar.m1759a(6, m1885d());
            }
            if (g()) {
                cVar.m1759a(7, m1887e());
            }
            if (h()) {
                cVar.m1759a(8, m1889f());
            }
            if (i()) {
                cVar.m1758a(9, (com.xiaomi.push.e) mo1910a());
            }
            if (j()) {
                cVar.m1755a(10, e());
            }
            if (k()) {
                cVar.m1757a(11, mo1910a());
            }
            if (l()) {
                cVar.m1757a(12, mo1912b());
            }
            if (m()) {
                cVar.m1755a(13, f());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f295a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.b(1, c());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, mo1910a());
            }
            if (m1884c()) {
                i += com.xiaomi.push.c.a(3, mo1912b());
            }
            if (m1886d()) {
                i += com.xiaomi.push.c.a(4, m1883c());
            }
            if (m1888e()) {
                i += com.xiaomi.push.c.a(5, d());
            }
            if (m1890f()) {
                i += com.xiaomi.push.c.a(6, m1885d());
            }
            if (g()) {
                i += com.xiaomi.push.c.a(7, m1887e());
            }
            if (h()) {
                i += com.xiaomi.push.c.a(8, m1889f());
            }
            if (i()) {
                i += com.xiaomi.push.c.a(9, (com.xiaomi.push.e) mo1910a());
            }
            if (j()) {
                i += com.xiaomi.push.c.a(10, e());
            }
            if (k()) {
                i += com.xiaomi.push.c.a(11, mo1910a());
            }
            if (l()) {
                i += com.xiaomi.push.c.a(12, mo1912b());
            }
            if (m()) {
                i += com.xiaomi.push.c.a(13, f());
            }
            this.e = i;
            return i;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public com.xiaomi.push.a mo1912b() {
            return this.f296b;
        }

        public e b(int i) {
            this.f304e = true;
            this.b = i;
            return this;
        }

        public e b(com.xiaomi.push.a aVar) {
            this.l = true;
            this.f296b = aVar;
            return this;
        }

        public e b(String str) {
            this.f300c = true;
            this.f297b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public String mo1912b() {
            return this.f297b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.f298b;
        }

        public int c() {
            return this.f24453a;
        }

        public e c(int i) {
            this.j = true;
            this.c = i;
            return this;
        }

        public e c(String str) {
            this.f302d = true;
            this.f299c = str;
            return this;
        }

        /* renamed from: c  reason: collision with other method in class */
        public String m1883c() {
            return this.f299c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1884c() {
            return this.f300c;
        }

        public int d() {
            return this.b;
        }

        public e d(int i) {
            this.m = true;
            this.d = i;
            return this;
        }

        public e d(String str) {
            this.f305f = true;
            this.f301d = str;
            return this;
        }

        /* renamed from: d  reason: collision with other method in class */
        public String m1885d() {
            return this.f301d;
        }

        /* renamed from: d  reason: collision with other method in class */
        public boolean m1886d() {
            return this.f302d;
        }

        public int e() {
            return this.c;
        }

        public e e(String str) {
            this.g = true;
            this.f303e = str;
            return this;
        }

        /* renamed from: e  reason: collision with other method in class */
        public String m1887e() {
            return this.f303e;
        }

        /* renamed from: e  reason: collision with other method in class */
        public boolean m1888e() {
            return this.f304e;
        }

        public int f() {
            return this.d;
        }

        public e f(String str) {
            this.h = true;
            this.f = str;
            return this;
        }

        /* renamed from: f  reason: collision with other method in class */
        public String m1889f() {
            return this.f;
        }

        /* renamed from: f  reason: collision with other method in class */
        public boolean m1890f() {
            return this.f305f;
        }

        public boolean g() {
            return this.g;
        }

        public boolean h() {
            return this.h;
        }

        public boolean i() {
            return this.i;
        }

        public boolean j() {
            return this.j;
        }

        public boolean k() {
            return this.k;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.m;
        }
    }

    /* loaded from: classes9.dex */
    public static final class f extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f308a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f309b;
        private boolean c;

        /* renamed from: a  reason: collision with other field name */
        private String f307a = "";
        private String b = "";

        /* renamed from: a  reason: collision with other field name */
        private b f306a = null;

        /* renamed from: a  reason: collision with root package name */
        private int f24454a = -1;

        public static f a(byte[] bArr) {
            return (f) new f().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.f24454a < 0) {
                mo1912b();
            }
            return this.f24454a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public b mo1910a() {
            return this.f306a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public f mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 10) {
                        a(bVar.m1718a());
                    } else if (m1715a == 18) {
                        b(bVar.m1718a());
                    } else if (m1715a == 26) {
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public f a(b bVar) {
            if (bVar != null) {
                this.c = true;
                this.f306a = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        public f a(String str) {
            this.f308a = true;
            this.f307a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public String mo1910a() {
            return this.f307a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1759a(1, mo1910a());
            }
            if (mo1912b()) {
                cVar.m1759a(2, mo1912b());
            }
            if (c()) {
                cVar.m1758a(3, (com.xiaomi.push.e) mo1910a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo1910a() {
            return this.f308a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, mo1912b());
            }
            if (c()) {
                i += com.xiaomi.push.c.a(3, (com.xiaomi.push.e) mo1910a());
            }
            this.f24454a = i;
            return i;
        }

        public f b(String str) {
            this.f309b = true;
            this.b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo1912b() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo1912b() {
            return this.f309b;
        }

        public boolean c() {
            return this.c;
        }
    }

    /* loaded from: classes9.dex */
    public static final class g extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f311a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f312b;

        /* renamed from: c  reason: collision with other field name */
        private boolean f313c;

        /* renamed from: a  reason: collision with other field name */
        private String f310a = "";
        private String b = "";
        private String c = "";

        /* renamed from: a  reason: collision with root package name */
        private int f24455a = -1;

        public static g a(byte[] bArr) {
            return (g) new g().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.f24455a < 0) {
                mo1912b();
            }
            return this.f24455a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public g mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 10) {
                        a(bVar.m1718a());
                    } else if (m1715a == 18) {
                        b(bVar.m1718a());
                    } else if (m1715a == 26) {
                        c(bVar.m1718a());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public g a(String str) {
            this.f311a = true;
            this.f310a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo1910a() {
            return this.f310a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1759a(1, mo1910a());
            }
            if (mo1912b()) {
                cVar.m1759a(2, mo1912b());
            }
            if (m1898c()) {
                cVar.m1759a(3, c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f311a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, mo1912b());
            }
            if (m1898c()) {
                i += com.xiaomi.push.c.a(3, c());
            }
            this.f24455a = i;
            return i;
        }

        public g b(String str) {
            this.f312b = true;
            this.b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public String mo1912b() {
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public boolean mo1912b() {
            return this.f312b;
        }

        public g c(String str) {
            this.f313c = true;
            this.c = str;
            return this;
        }

        public String c() {
            return this.c;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1898c() {
            return this.f313c;
        }
    }

    /* loaded from: classes9.dex */
    public static final class h extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f315a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f316b;

        /* renamed from: a  reason: collision with root package name */
        private int f24456a = 0;

        /* renamed from: a  reason: collision with other field name */
        private String f314a = "";
        private int b = -1;

        public static h a(byte[] bArr) {
            return (h) new h().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.b < 0) {
                mo1912b();
            }
            return this.b;
        }

        public h a(int i) {
            this.f315a = true;
            this.f24456a = i;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public h mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 8) {
                        a(bVar.m1724b());
                    } else if (m1715a == 18) {
                        a(bVar.m1718a());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public h a(String str) {
            this.f316b = true;
            this.f314a = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public String mo1910a() {
            return this.f314a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1755a(1, c());
            }
            if (mo1912b()) {
                cVar.m1759a(2, mo1910a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f315a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, c());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, mo1910a());
            }
            this.b = i;
            return i;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.f316b;
        }

        public int c() {
            return this.f24456a;
        }
    }

    /* loaded from: classes9.dex */
    public static final class i extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f318a;

        /* renamed from: a  reason: collision with other field name */
        private com.xiaomi.push.a f317a = com.xiaomi.push.a.f24342a;

        /* renamed from: a  reason: collision with root package name */
        private int f24457a = -1;

        public static i a(byte[] bArr) {
            return (i) new i().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.f24457a < 0) {
                mo1912b();
            }
            return this.f24457a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public com.xiaomi.push.a mo1910a() {
            return this.f317a;
        }

        public i a(com.xiaomi.push.a aVar) {
            this.f318a = true;
            this.f317a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public i mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 10) {
                        a(bVar.m1717a());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1757a(1, mo1910a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public boolean mo1910a() {
            return this.f318a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            this.f24457a = i;
            return i;
        }
    }

    /* loaded from: classes9.dex */
    public static final class j extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f321a;
        private boolean b;

        /* renamed from: a  reason: collision with other field name */
        private com.xiaomi.push.a f319a = com.xiaomi.push.a.f24342a;

        /* renamed from: a  reason: collision with other field name */
        private b f320a = null;

        /* renamed from: a  reason: collision with root package name */
        private int f24458a = -1;

        public static j a(byte[] bArr) {
            return (j) new j().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.f24458a < 0) {
                mo1912b();
            }
            return this.f24458a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public com.xiaomi.push.a mo1910a() {
            return this.f319a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public b mo1910a() {
            return this.f320a;
        }

        public j a(com.xiaomi.push.a aVar) {
            this.f321a = true;
            this.f319a = aVar;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public j mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 10) {
                        a(bVar.m1717a());
                    } else if (m1715a == 18) {
                        b bVar2 = new b();
                        bVar.a(bVar2);
                        a(bVar2);
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public j a(b bVar) {
            if (bVar != null) {
                this.b = true;
                this.f320a = bVar;
                return this;
            }
            throw new NullPointerException();
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1757a(1, mo1910a());
            }
            if (mo1912b()) {
                cVar.m1758a(2, (com.xiaomi.push.e) mo1910a());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo1910a() {
            return this.f321a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, (com.xiaomi.push.e) mo1910a());
            }
            this.f24458a = i;
            return i;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.b;
        }
    }

    /* loaded from: classes9.dex */
    public static final class k extends com.xiaomi.push.e {

        /* renamed from: a  reason: collision with other field name */
        private boolean f324a;

        /* renamed from: b  reason: collision with other field name */
        private boolean f327b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean g;

        /* renamed from: a  reason: collision with other field name */
        private String f323a = "";

        /* renamed from: b  reason: collision with other field name */
        private String f326b = "";

        /* renamed from: a  reason: collision with other field name */
        private long f322a = 0;

        /* renamed from: b  reason: collision with other field name */
        private long f325b = 0;
        private boolean f = false;

        /* renamed from: a  reason: collision with root package name */
        private int f24459a = 0;
        private int b = -1;

        public static k a(byte[] bArr) {
            return (k) new k().a(bArr);
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public int mo1910a() {
            if (this.b < 0) {
                mo1912b();
            }
            return this.b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public long mo1910a() {
            return this.f322a;
        }

        public k a(int i) {
            this.g = true;
            this.f24459a = i;
            return this;
        }

        public k a(long j) {
            this.c = true;
            this.f322a = j;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public k mo1909a(com.xiaomi.push.b bVar) {
            while (true) {
                int m1715a = bVar.m1715a();
                if (m1715a != 0) {
                    if (m1715a == 10) {
                        a(bVar.m1718a());
                    } else if (m1715a == 18) {
                        b(bVar.m1718a());
                    } else if (m1715a == 24) {
                        a(bVar.m1716a());
                    } else if (m1715a == 32) {
                        b(bVar.m1716a());
                    } else if (m1715a == 40) {
                        a(bVar.m1721a());
                    } else if (m1715a == 48) {
                        a(bVar.m1724b());
                    } else if (!a(bVar, m1715a)) {
                        return this;
                    }
                } else {
                    return this;
                }
            }
        }

        public k a(String str) {
            this.f324a = true;
            this.f323a = str;
            return this;
        }

        public k a(boolean z) {
            this.e = true;
            this.f = z;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a */
        public String mo1910a() {
            return this.f323a;
        }

        @Override // com.xiaomi.push.e
        public void a(com.xiaomi.push.c cVar) {
            if (mo1910a()) {
                cVar.m1759a(1, mo1910a());
            }
            if (mo1912b()) {
                cVar.m1759a(2, mo1912b());
            }
            if (m1913c()) {
                cVar.m1756a(3, mo1910a());
            }
            if (d()) {
                cVar.m1756a(4, mo1912b());
            }
            if (f()) {
                cVar.m1760a(5, e());
            }
            if (g()) {
                cVar.m1755a(6, c());
            }
        }

        @Override // com.xiaomi.push.e
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo1910a() {
            return this.f324a;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public int mo1912b() {
            int i = 0;
            if (mo1910a()) {
                i = 0 + com.xiaomi.push.c.a(1, mo1910a());
            }
            if (mo1912b()) {
                i += com.xiaomi.push.c.a(2, mo1912b());
            }
            if (m1913c()) {
                i += com.xiaomi.push.c.a(3, mo1910a());
            }
            if (d()) {
                i += com.xiaomi.push.c.a(4, mo1912b());
            }
            if (f()) {
                i += com.xiaomi.push.c.a(5, e());
            }
            if (g()) {
                i += com.xiaomi.push.c.a(6, c());
            }
            this.b = i;
            return i;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public long mo1912b() {
            return this.f325b;
        }

        public k b(long j) {
            this.d = true;
            this.f325b = j;
            return this;
        }

        public k b(String str) {
            this.f327b = true;
            this.f326b = str;
            return this;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b */
        public String mo1912b() {
            return this.f326b;
        }

        @Override // com.xiaomi.push.e
        /* renamed from: b  reason: collision with other method in class */
        public boolean mo1912b() {
            return this.f327b;
        }

        public int c() {
            return this.f24459a;
        }

        /* renamed from: c  reason: collision with other method in class */
        public boolean m1913c() {
            return this.c;
        }

        public boolean d() {
            return this.d;
        }

        public boolean e() {
            return this.f;
        }

        public boolean f() {
            return this.e;
        }

        public boolean g() {
            return this.g;
        }
    }
}
