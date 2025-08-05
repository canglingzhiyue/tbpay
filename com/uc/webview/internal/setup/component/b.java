package com.uc.webview.internal.setup.component;

import com.taobao.artc.api.AConstants;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.internal.setup.component.h;
import com.uc.webview.internal.setup.component.j;
import java.io.File;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    final q f23901a;
    final d b;
    final j c;
    i d;
    private final String e;
    private final j.a f;
    private final k g;

    /* loaded from: classes9.dex */
    class a extends j.b {
        a(String str) {
            super(str);
        }

        @Override // com.uc.webview.internal.setup.component.j.a
        public final void a(int i) {
            b.this.b.d = i;
        }

        @Override // com.uc.webview.internal.setup.component.j.b, com.uc.webview.internal.setup.component.j.a
        public final void a(int i, i iVar) {
            b bVar = b.this;
            bVar.d = iVar;
            bVar.b.a(iVar);
            super.a(i, iVar);
        }

        @Override // com.uc.webview.internal.setup.component.j.b
        protected final void a(int i, String str, Throwable th) {
            int b = h.a.b(i);
            String str2 = this.b;
            Object[] objArr = new Object[5];
            int i2 = b.this.b.d & 15;
            objArr[0] = i2 == 2 ? "[重下]" : i2 == 1 ? "[升级]" : "";
            objArr[1] = h.a.a(i);
            objArr[2] = h.a.a(this.c);
            objArr[3] = str;
            objArr[4] = th;
            l.a(b, str2, "%s[%s <- %s] %s", objArr);
        }

        @Override // com.uc.webview.internal.setup.component.j.b
        public final void b(int i, String str, Throwable th) {
            super.b(i, str, th);
            if (i == -125 || i == -124 || i == -121) {
                if (b.this.d != null) {
                    File file = b.this.f23901a.c ? b.this.d.b : b.this.d.f23911a;
                    if (file != null) {
                        GlobalSettings.set(b.this.f23901a.h, file.getAbsolutePath());
                    }
                }
            } else if (i == -107) {
                GlobalSettings.set(b.this.f23901a.h, "");
            }
            b.this.b.a(i, str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(q qVar) {
        this.e = qVar.f23933a;
        this.f23901a = qVar;
        this.f = new a(this.e);
        this.b = new d(this.e, qVar.b);
        this.g = new f(qVar);
        this.c = this.f23901a.e == 1 ? new m(this.f23901a, this.g, this.f) : new e(this.f23901a, this.g, this.f);
        this.g.a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        this.f.b(-100);
        com.uc.webview.base.task.c.a(this.e, new Runnable() { // from class: com.uc.webview.internal.setup.component.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.c.h();
            }
        }, new s(this.f, AConstants.ArtcErrorIceCandidateGatheringTimeOut), i);
    }
}
