package com.uc.webview.internal.setup.component;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.ErrorConstant;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.internal.setup.component.j;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
final class e extends com.uc.webview.internal.setup.component.a {
    private final int g;
    private String h;

    /* loaded from: classes9.dex */
    static class a extends IDownloadHandle.Client {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<e> f23906a;

        a(e eVar) {
            this.f23906a = new WeakReference<>(eVar);
        }

        @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
        public final void onFailed(UCKnownException uCKnownException) {
            e eVar = this.f23906a.get();
            if (eVar != null) {
                eVar.d.a(-111, uCKnownException);
            }
        }

        @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
        public final boolean onStart(String str) {
            e eVar = this.f23906a.get();
            if (eVar != null) {
                eVar.d.a(ErrorConstant.ERROR_GET_PROCESS_NULL, Integer.toString(eVar.b.b));
                return true;
            }
            return false;
        }

        @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
        public final void onSuccess(File file, long j, long j2) {
            e eVar = this.f23906a.get();
            if (eVar != null) {
                try {
                    eVar.e.b = file;
                    eVar.d.a(BSError.BSDIFF_OOM, eVar.e);
                    eVar.g();
                } catch (Throwable th) {
                    com.uc.webview.base.io.d.c(eVar.f23898a, file);
                    eVar.d.a(BSError.BSDIFF_OLD_FILE_DEC_FAILED, th);
                    eVar.c();
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    class b implements GlobalSettings.Observer {
        private boolean b;

        b(String str) {
            this.b = StringUtils.isEmpty(str) || x.a(str);
        }

        @Override // com.uc.webview.base.GlobalSettings.Observer
        public final void onValueChanged(int i, String str) {
            if (i != e.this.g || StringUtils.isEmpty(str) || str.equals(e.this.h)) {
                return;
            }
            int i2 = StringUtils.isEmpty(e.this.h) ? -105 : -106;
            e.this.h = str;
            if (x.a(e.this.h)) {
                e.this.d.b(i2);
                e.this.d.b(-107);
            } else if (!this.b) {
            } else {
                l.a(e.this.f23898a, "url: %s", str);
                e.this.a(i2);
                this.b = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(q qVar, k kVar, j.a aVar) {
        super(qVar.f23933a + ".DefDL", qVar, kVar, aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f23933a);
        sb.append(EnvInfo.is64Bit() ? "Url64" : "Url32");
        this.g = com.uc.webview.base.f.a(sb.toString());
    }

    @Override // com.uc.webview.internal.setup.component.a
    protected final String a() {
        return x.b(this.h);
    }

    @Override // com.uc.webview.internal.setup.component.j
    public final void h() {
        j.a aVar;
        int i;
        this.h = GlobalSettings.get(this.g, "");
        String str = this.h;
        if (str == null || str.length() <= 0) {
            aVar = this.d;
            i = -103;
        } else if (!x.a(this.h)) {
            a(-101);
            GlobalSettings.addObserver(new b(this.h));
        } else {
            this.d.b(-101);
            aVar = this.d;
            i = -107;
        }
        aVar.b(i);
        GlobalSettings.addObserver(new b(this.h));
    }

    @Override // com.uc.webview.internal.setup.component.j
    public final void i() {
        IDownloadHandle create = IDownloadHandle.Instance.create();
        if (create == null) {
            this.d.a(ErrorConstant.ERROR_GET_PROCESS_NULL, Integer.toString(this.b.b));
            this.d.b(-110);
            return;
        }
        create.setUrl(this.h).setSpecifiedDir(PathUtils.getDirCacheUpdate(EnvInfo.getContext())).setClient(new a(this)).start();
    }
}
