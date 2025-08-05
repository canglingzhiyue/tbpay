package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import anet.channel.util.ErrorConstant;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.internal.setup.component.j;
import com.uc.webview.internal.setup.component.n;
import java.io.File;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class o {
    static final /* synthetic */ boolean c = !o.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    final q f23929a;
    i b;
    private final String d;
    private a e;
    private final j.a f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes9.dex */
    class b implements n.f {

        /* renamed from: a  reason: collision with root package name */
        Object f23930a;

        private b() {
        }

        /* synthetic */ b(o oVar, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.component.n.f
        public final void a() {
            com.uc.webview.base.task.c.a(o.this.d, new Runnable() { // from class: com.uc.webview.internal.setup.component.o.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!o.this.a()) {
                        return;
                    }
                    if (b.this.f23930a != null) {
                        n.a(o.this.d, b.this.f23930a);
                        b.this.f23930a = null;
                    }
                    o.this.f.a(BSError.BSDIFF_OOM, o.this.b);
                    if (o.this.e == null) {
                        return;
                    }
                    o.this.e.a();
                    o.this.e = null;
                }
            }, null);
        }

        @Override // com.uc.webview.internal.setup.component.n.f
        public final void a(Object obj) {
            this.f23930a = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j.a aVar, q qVar) {
        this.d = qVar.f23933a;
        this.f = aVar;
        this.f23929a = qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j.a aVar, q qVar, i iVar) {
        this(aVar, qVar);
        this.b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (c || this.b.b == null) {
            n.i a2 = n.a(this.f23929a.f23933a, this.f23929a.f, this.f23929a.g);
            if (a2 == null || TextUtils.isEmpty(a2.f23927a)) {
                return false;
            }
            File file = new File(a2.f23927a);
            String name = !TextUtils.isEmpty(a2.b) ? a2.b : file.getName();
            if (!this.b.a().equals(new i(this.f23929a, name).a())) {
                this.f.b(-251);
                return false;
            }
            i iVar = this.b;
            iVar.b = file;
            iVar.a(this.f23929a, name);
            if (this.f23929a.h == -1) {
                return true;
            }
            String absolutePath = this.b.b.getAbsolutePath();
            if (GlobalSettings.get(this.f23929a.h, "").equals(absolutePath)) {
                return true;
            }
            GlobalSettings.set(this.f23929a.h, absolutePath);
            return true;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(i iVar) {
        return this.f23929a.f.equals(iVar.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(a aVar) {
        if (this.b.b != null || a()) {
            this.f.a(-126, this.b);
            return true;
        }
        try {
            this.e = aVar;
            this.f.a(ErrorConstant.ERROR_GET_PROCESS_NULL, Integer.toString(this.f23929a.b));
            n.b(this.d, this.f23929a.f);
            n.a(this.d, this.f23929a.f, new b(this, (byte) 0));
        } catch (Throwable unused) {
        }
        return false;
    }

    public String toString() {
        return "{name: " + this.f23929a.f23933a + ", file: " + this.b + riy.BLOCK_END_STR;
    }
}
