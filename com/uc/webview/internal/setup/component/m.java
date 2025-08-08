package com.uc.webview.internal.setup.component;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.ErrorConstant;
import com.taobao.artc.api.AConstants;
import com.taobao.message.datasdk.facade.message.MessageType;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.internal.setup.component.j;
import com.uc.webview.internal.setup.component.n;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class m extends com.uc.webview.internal.setup.component.a implements n.a {
    static final /* synthetic */ boolean g = !m.class.desiredAssertionStatus();
    private n.b h;
    private boolean i;
    private boolean j;
    private a k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class a implements n.f {

        /* renamed from: a  reason: collision with root package name */
        Object f23915a;

        private a() {
        }

        /* synthetic */ a(m mVar, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.component.n.f
        public final void a() {
            com.uc.webview.base.task.c.a(m.this.f23898a, new Runnable() { // from class: com.uc.webview.internal.setup.component.m.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!m.this.o()) {
                        return;
                    }
                    if (a.this.f23915a != null) {
                        n.a(m.this.f23898a, a.this.f23915a);
                        a.this.f23915a = null;
                    }
                    m.this.k = null;
                }
            }, null);
        }

        @Override // com.uc.webview.internal.setup.component.n.f
        public final void a(Object obj) {
            this.f23915a = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(q qVar, k kVar, j.a aVar) {
        super(qVar.f23933a + ".ParsDL", qVar, kVar, aVar);
        this.i = true;
    }

    private int a(i iVar) {
        return this.b.f.equals(iVar.d) ? -9 : -15;
    }

    private boolean a(File file, String str) {
        if (g || this.e != null) {
            i iVar = new i(this.b, str);
            int a2 = a(iVar);
            if (a2 != -9) {
                this.d.b(a2);
                n.a(this.f23898a, iVar.d);
                return false;
            } else if (!this.e.a().equals(iVar.a())) {
                this.d.b(-251);
                return false;
            } else {
                iVar.b = file;
                this.d.a(this.j ? BSError.BSDIFF_OOM : -126, iVar);
                this.e = iVar;
                if (b()) {
                    this.d.a(BSError.BSDIFF_NEW_FILE_INVALID_SIZE, this.e);
                    return true;
                }
                try {
                    g();
                    return true;
                } catch (Throwable th) {
                    this.d.a(BSError.BSDIFF_OLD_FILE_DEC_FAILED, th);
                    n();
                    return true;
                }
            }
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.d.a(-454, this.e);
        if (b()) {
            this.d.a(BSError.BSDIFF_NEW_FILE_SIZE_MISMATC, this.e);
        } else if (m()) {
        } else {
            this.j = true;
            this.d.a(ErrorConstant.ERROR_GET_PROCESS_NULL, Integer.toString(this.b.b));
            n.b(this.f23898a, this.b.f);
        }
    }

    private boolean m() {
        if (o()) {
            return true;
        }
        if (this.k == null) {
            try {
                this.k = new a(this, (byte) 0);
                n.a(this.f23898a, this.b.f, this.k);
            } catch (Throwable th) {
                this.d.a(-400, th);
            }
        }
        return false;
    }

    private void n() {
        n.a(this.f23898a, this.b.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        try {
            this.d.a(-453, this.b.g);
            n.i a2 = n.a(this.f23898a, this.b.f, this.b.g);
            if (a2 == null || StringUtils.isEmpty(a2.f23927a)) {
                return false;
            }
            File file = new File(a2.f23927a);
            return a(file, !StringUtils.isEmpty(a2.b) ? a2.b : file.getName());
        } catch (Throwable th) {
            this.d.a(ErrorConstant.ERROR_SOCKET_TIME_OUT, th);
            return false;
        }
    }

    @Override // com.uc.webview.internal.setup.component.a
    protected final String a() {
        if (this.e != null) {
            return this.e.c;
        }
        return null;
    }

    @Override // com.uc.webview.internal.setup.component.a
    protected final void a(int i) {
        this.h = n.b.a(GlobalSettings.get((int) MessageType.WEEX_CARD_CENTER, ""));
        super.a(i);
    }

    @Override // com.uc.webview.internal.setup.component.n.a
    public final boolean a(n.d dVar, boolean z, boolean z2) {
        try {
            i iVar = new i(this.b, dVar.b());
            int a2 = a(iVar);
            if (a2 == -9) {
                this.e = iVar;
                if (z2) {
                    com.uc.webview.base.task.c.a(this.f23898a, new Runnable() { // from class: com.uc.webview.internal.setup.component.m.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.this.l();
                        }
                    }, new s(this.d, AConstants.ArtcErrorCreatePcError));
                } else {
                    l();
                }
                this.h.a(this);
            } else if (z) {
                l.a(this.f23898a, "not for me - %s", iVar);
            }
            if (a2 == -9) {
                this.i = false;
                return true;
            }
        } catch (Throwable th) {
            if (z) {
                l.c(this.f23898a, "handlePackage with %s exception", dVar, th);
            }
        }
        return false;
    }

    @Override // com.uc.webview.internal.setup.component.n.a
    public final boolean a(n.j jVar) {
        j.a aVar;
        int i;
        List<n.d> list = jVar != null ? jVar.f23928a : null;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            Iterator<n.d> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    n.d next = it.next();
                    if (next != null && !StringUtils.isEmpty(next.b()) && a(next, true, true)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                aVar = this.d;
                i = -457;
            }
            return z;
        }
        aVar = this.d;
        i = -456;
        aVar.b(i);
        return z;
    }

    @Override // com.uc.webview.internal.setup.component.a
    protected final void c() {
        n();
    }

    @Override // com.uc.webview.internal.setup.component.a
    protected final void d() {
        n();
    }

    @Override // com.uc.webview.internal.setup.component.a
    protected final boolean e() {
        return true;
    }

    @Override // com.uc.webview.internal.setup.component.j
    public final void h() {
        a(-101);
    }

    @Override // com.uc.webview.internal.setup.component.j
    public final void i() {
        n.d dVar;
        j.a aVar;
        int i;
        String str;
        this.d.b(-452);
        if (n.f23917a == null) {
            aVar = this.d;
            i = ErrorConstant.ERROR_HOST_NOT_VERIFY_ERROR;
            str = "com.uc.pars.api.Pars";
        } else if (n.b != null) {
            n.b bVar = this.h;
            String str2 = this.f23898a;
            Map<String, n.d> a2 = n.a();
            if (a2 != null) {
                Iterator<String> it = a2.keySet().iterator();
                while (it.hasNext() && ((dVar = a2.get(it.next())) == null || StringUtils.isEmpty(dVar.b()) || !a(dVar, false, false))) {
                }
            }
            bVar.a(str2, this);
            return;
        } else {
            aVar = this.d;
            i = ErrorConstant.ERROR_SSL_ERROR;
            str = "com.uc.pars.api.IParsObserver";
        }
        aVar.a(i, str);
    }

    @Override // com.uc.webview.internal.setup.component.n.a
    public final boolean j() {
        return this.i;
    }

    @Override // com.uc.webview.internal.setup.component.n.a
    public final void k() {
    }
}
