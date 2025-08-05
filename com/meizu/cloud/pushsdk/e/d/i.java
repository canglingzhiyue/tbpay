package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.d.c;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final f f7921a;
    private final String b;
    private final c c;
    private final j d;
    private final Object e;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private f f7922a;
        private String b = "GET";
        private c.b c = new c.b();
        private j d;
        private Object e;

        public b a(c cVar) {
            this.c = cVar.b();
            return this;
        }

        public b a(f fVar) {
            if (fVar != null) {
                this.f7922a = fVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public b a(j jVar) {
            return a("DELETE", jVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.meizu.cloud.pushsdk.e.d.i.b a(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L64
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L27
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "http:"
                r0.append(r1)
                r1 = 3
            L1b:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L41
            L27:
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 4
                java.lang.String r3 = "wss:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "https:"
                r0.append(r1)
                r1 = 4
                goto L1b
            L41:
                com.meizu.cloud.pushsdk.e.d.f r0 = com.meizu.cloud.pushsdk.e.d.f.b(r7)
                if (r0 == 0) goto L4c
                com.meizu.cloud.pushsdk.e.d.i$b r7 = r6.a(r0)
                return r7
            L4c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unexpected url: "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L64:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.d.i.b.a(java.lang.String):com.meizu.cloud.pushsdk.e.d.i$b");
        }

        public b a(String str, j jVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (jVar != null && !d.a(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (jVar != null || !d.b(str)) {
                this.b = str;
                this.d = jVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public b a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public i a() {
            if (this.f7922a != null) {
                return new i(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b b() {
            return a("GET", (j) null);
        }

        public b b(j jVar) {
            return a("PATCH", jVar);
        }

        public b c() {
            return a("HEAD", (j) null);
        }

        public b c(j jVar) {
            return a("POST", jVar);
        }

        public b d(j jVar) {
            return a("PUT", jVar);
        }
    }

    private i(b bVar) {
        this.f7921a = bVar.f7922a;
        this.b = bVar.b;
        this.c = bVar.c.a();
        this.d = bVar.d;
        this.e = bVar.e != null ? bVar.e : this;
    }

    public j a() {
        return this.d;
    }

    public String a(String str) {
        return this.c.a(str);
    }

    public int b() {
        if ("POST".equals(d())) {
            return 1;
        }
        if ("PUT".equals(d())) {
            return 2;
        }
        if ("DELETE".equals(d())) {
            return 3;
        }
        if ("HEAD".equals(d())) {
            return 4;
        }
        return "PATCH".equals(d()) ? 5 : 0;
    }

    public c c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public f e() {
        return this.f7921a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.f7921a);
        sb.append(", tag=");
        Object obj = this.e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
