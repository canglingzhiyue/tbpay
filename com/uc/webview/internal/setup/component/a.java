package com.uc.webview.internal.setup.component;

import mtopsdk.common.util.StringUtils;
import com.taobao.artc.api.AConstants;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.internal.setup.component.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public abstract class a implements j {
    static final /* synthetic */ boolean f = !a.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    protected final String f23898a;
    protected final q b;
    protected final k c;
    protected final j.a d;
    protected i e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, q qVar, k kVar, j.a aVar) {
        this.f23898a = str;
        this.b = qVar;
        this.c = kVar;
        this.d = aVar;
    }

    private boolean a(File file) {
        if (file != null && file.exists()) {
            int a2 = this.c.a(file);
            if (p.a(a2)) {
                com.uc.webview.base.io.d.a(this.f23898a, this.b.i, true, (ArrayList<File>) new ArrayList(Arrays.asList(file)));
                return true;
            }
            this.d.b(a2);
            if (file.isDirectory()) {
                com.uc.webview.base.io.d.a(this.f23898a, file);
            } else {
                com.uc.webview.base.io.d.c(this.f23898a, file);
            }
        }
        return false;
    }

    private void j() {
        String stringValue = GlobalSettings.getStringValue(this.b.h);
        if (StringUtils.isEmpty(stringValue)) {
            com.uc.webview.base.io.d.a(this.f23898a, this.b.i, true, (ArrayList<File>) null);
        } else {
            com.uc.webview.base.io.d.a(this.f23898a, this.b.i, true, (ArrayList<File>) new ArrayList(Arrays.asList(new File(stringValue))));
        }
    }

    protected abstract String a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i) {
        String str = GlobalSettings.get(this.b.h, "");
        this.d.a((StringUtils.isEmpty(str) || x.a(str)) ? 0 : a(new File(str)) ? 1 : 2);
        String a2 = a();
        if (!StringUtils.isEmpty(a2)) {
            this.e = new i(this.b, a2);
            if (b()) {
                this.d.b(-101);
                this.d.a(BSError.BSDIFF_NEW_FILE_WRITE_FAILED, this.e);
                return;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.uc.webview.internal.setup.component.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.i();
            }
        };
        long a3 = g.a(c.f23904a);
        l.b(this.f23898a, "downloadComponent at %s (delay %.1fs)", x.a(a3), Float.valueOf(((float) a3) / 1000.0f));
        this.d.b(i);
        com.uc.webview.base.task.c.a(this.f23898a, runnable, new s(this.d, AConstants.ArtcErrorIceRecvCandidateTimeout), a3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b() {
        i iVar;
        if (f || ((iVar = this.e) != null && !StringUtils.isEmpty(iVar.c))) {
            return a(this.e.f23911a);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }

    protected void d() {
    }

    protected boolean e() {
        return this.b.c;
    }

    protected final void f() {
        this.d.b(-117);
        p a2 = this.c.a(this.e);
        if (p.a(a2.f23932a)) {
            this.d.b(a2.f23932a);
        } else {
            this.d.a(a2.f23932a, Integer.toString(a2.b));
        }
        if (p.a(a2.f23932a)) {
            a2 = this.c.a();
        }
        if (p.a(a2.f23932a)) {
            this.d.a(BSError.BSDIFF_NEW_FILE_WRITE_FAILED, this.e);
            return;
        }
        j();
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        if (this.b.c) {
            this.d.a(BSError.BSDIFF_NEW_FILE_WRITE_FAILED, this.e);
            return;
        }
        j();
        U4Engine.createExtractor().setContext(EnvInfo.getContext()).setCompressedFile(this.e.b).setSpecifiedDir(this.e.f23911a).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.internal.setup.component.a.2
            private File b;

            {
                this.b = a.this.e.b;
            }

            private void a() {
                a.this.f();
                b();
            }

            private void b() {
                if (this.b != null) {
                    if (!a.this.e()) {
                        com.uc.webview.base.io.d.c(a.this.f23898a, this.b);
                    }
                    this.b = null;
                }
            }

            protected final void finalize() throws Throwable {
                super.finalize();
                b();
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file, File file2) {
                a.this.d.b(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCB);
                a();
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                a.this.d.a(BSError.BSDIFF_OLD_FILE_MD5_MISMATCH, uCKnownException);
                a.this.c();
                b();
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file, File file2) {
                a.this.d.b(-112);
                return true;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file) {
                a.this.d.b(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
                a();
            }
        }).start();
    }
}
