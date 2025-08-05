package com.uc.webview.internal.setup.component;

import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.internal.setup.component.j;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f23936a = !t.class.desiredAssertionStatus();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private final d c;
    private final j.a d = new a("U4Patch");
    private w e;

    /* loaded from: classes9.dex */
    class a extends j.b {
        a(String str) {
            super(str);
        }

        @Override // com.uc.webview.internal.setup.component.j.a
        public final void a(int i) {
        }

        @Override // com.uc.webview.internal.setup.component.j.b, com.uc.webview.internal.setup.component.j.a
        public final void a(int i, i iVar) {
            t.this.c.a(iVar);
            super.a(i, iVar);
        }

        @Override // com.uc.webview.internal.setup.component.j.b
        public final void b(int i, String str, Throwable th) {
            super.b(i, str, th);
            if (i == -263) {
                t tVar = t.this;
                tVar.a(BSError.BSDIFF_PATCH_FILE_INVALID_MAGIC, tVar.e.a());
            }
            t.this.c.a(i, str, th);
        }
    }

    private t(d dVar) {
        this.c = dVar;
    }

    public static void a() {
        if (b.getAndSet(true)) {
            return;
        }
        com.uc.webview.base.task.c.a("U4Patch", new Runnable() { // from class: com.uc.webview.internal.setup.component.t.1
            @Override // java.lang.Runnable
            public final void run() {
                t.b();
            }
        }, null, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        this.d.a(i, str);
        new b(r.f23934a[1]).a(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void b() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.t.b():void");
    }
}
