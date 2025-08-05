package com.uc.webview.internal.setup.component;

import com.uc.webview.internal.setup.component.h;

/* loaded from: classes9.dex */
interface j {

    /* loaded from: classes9.dex */
    public interface a {
        void a(int i);

        void a(int i, i iVar);

        void a(int i, String str);

        void a(int i, Throwable th);

        void b(int i);
    }

    /* loaded from: classes9.dex */
    public static abstract class b implements a {
        protected final String b;
        protected int c = -10000;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str) {
            this.b = str;
        }

        @Override // com.uc.webview.internal.setup.component.j.a
        public void a(int i, i iVar) {
            a(i, iVar.c);
        }

        @Override // com.uc.webview.internal.setup.component.j.a
        public final void a(int i, String str) {
            if (str == null) {
                str = "";
            }
            b(i, str, null);
        }

        protected void a(int i, String str, Throwable th) {
            l.a(h.a.b(i), this.b, "[%s <- %s] %s", h.a.a(i), h.a.a(this.c), str, th);
        }

        @Override // com.uc.webview.internal.setup.component.j.a
        public final void a(int i, Throwable th) {
            b(i, "", th);
        }

        @Override // com.uc.webview.internal.setup.component.j.a
        public final void b(int i) {
            b(i, "", null);
        }

        public void b(int i, String str, Throwable th) {
            a(i, str, th);
            this.c = i;
        }
    }

    void h();

    void i();
}
