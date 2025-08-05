package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.d.c;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final i f7925a;
    private final int b;
    private final String c;
    private final c d;
    private final l e;
    private final k f;
    private final k g;
    private final k h;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private i f7926a;
        private String c;
        private l e;
        private k f;
        private k g;
        private k h;
        private int b = -1;
        private c.b d = new c.b();

        public b a(int i) {
            this.b = i;
            return this;
        }

        public b a(c cVar) {
            this.d = cVar.b();
            return this;
        }

        public b a(i iVar) {
            this.f7926a = iVar;
            return this;
        }

        public b a(l lVar) {
            this.e = lVar;
            return this;
        }

        public b a(String str) {
            this.c = str;
            return this;
        }

        public k a() {
            if (this.f7926a != null) {
                if (this.b >= 0) {
                    return new k(this);
                }
                throw new IllegalStateException("code < 0: " + this.b);
            }
            throw new IllegalStateException("request == null");
        }
    }

    private k(b bVar) {
        this.f7925a = bVar.f7926a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d.a();
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }

    public l a() {
        return this.e;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "Response{protocol=, code=" + this.b + ", message=" + this.c + ", url=" + this.f7925a.e() + '}';
    }
}
