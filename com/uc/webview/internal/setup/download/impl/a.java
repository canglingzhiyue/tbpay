package com.uc.webview.internal.setup.download.impl;

import anet.channel.util.HttpConstant;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.internal.setup.download.impl.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes9.dex */
final class a implements IUrlDownloader, b.a {
    private String d = null;

    /* renamed from: a  reason: collision with root package name */
    C1043a f23952a = null;
    int b = 0;
    int c = 0;
    private File e = null;
    private File f = null;
    private com.uc.webview.base.io.b g = null;
    private int h = 0;
    private long i = 0;
    private long j = 0;
    private long k = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uc.webview.internal.setup.download.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1043a extends IUrlDownloader.Client {
        public void a(UCKnownException uCKnownException) {
        }

        public void a(File file, long j, long j2) {
        }

        public boolean a(String str, long j, long j2) {
            return true;
        }
    }

    private b a(b.a aVar) {
        b bVar = new b(this.d, aVar);
        int i = this.b;
        if (i > 0) {
            bVar.f23953a = i;
        }
        int i2 = this.c;
        if (i2 > 0) {
            bVar.b = i2;
        }
        return bVar;
    }

    private boolean a() {
        boolean z = true;
        UCKnownException uCKnownException = null;
        try {
            b a2 = a((b.a) null);
            if (!a2.a() || !a2.b() || a2.e <= 0) {
                Log.w("UpdDlder", "startHead failed statusCode:" + a2.d + ", length:" + a2.e);
                ErrorCode.UPDATE_GET_URL_FILE_INFO_FAILED.report();
            }
            this.i = a2.e;
            this.k = a2.f;
        } catch (UCKnownException e) {
            uCKnownException = e;
        } catch (Throwable th) {
            uCKnownException = new UCKnownException(th);
        }
        if (!this.f23952a.a(this.d, this.i, this.k)) {
            Log.i("UpdDlder", "u4 exists, interrupt download");
            return false;
        }
        String generateName = PathUtils.generateName(this.d, this.i, this.k);
        d.a(this.e);
        this.f = new File(this.e, generateName);
        this.g = new com.uc.webview.base.io.b(this.f);
        this.g.a();
        Log.d("UpdDlder", "startDownload url:" + this.d + ", downloadFile:" + this.f.getAbsolutePath());
        long length = this.f.length();
        this.j = length;
        if (length != this.i) {
            if (!this.f23952a.onStart()) {
                Log.d("UpdDlder", "startDownload interrupt, url:" + this.d);
                ErrorCode.UPDATE_DOWNLOAD_INTERRUPTED.report();
            }
            try {
                if (!this.f.exists()) {
                    d.b("UpdDlder-cd", this.f);
                }
                if (length < this.i) {
                    Log.d("UpdDlder", "continueDownload recoverSize:" + length + ", totalSize:" + this.i);
                    b a3 = a(this);
                    if (length > 0) {
                        String str = HttpConstant.RANGE_PRE + length + "-" + this.i;
                        if (a3.c == null) {
                            a3.c = new HashMap();
                        }
                        a3.c.put(HttpConstant.RANGE, str);
                    }
                    a3.a();
                }
            } catch (Throwable th2) {
                Log.w("UpdDlder", "continueDownload failed", th2);
            }
            Log.d("UpdDlder", "continueDownload file:" + this.f.getAbsolutePath() + ", size:" + this.f.length() + ", lastModified:" + this.f.lastModified() + ", totalSize:" + this.i);
            if (this.f.length() != this.i) {
                ErrorCode.UPDATE_DOWNLOAD_SIZE_NOT_MATCH.report();
            }
            Log.d("UpdDlder", "startDownload success");
            this.f23952a.onSuccess(this.f.getAbsolutePath(), this.i, this.k);
        } else {
            this.f23952a.a(this.f, this.i, this.k);
        }
        if (uCKnownException != null) {
            z = false;
        }
        if (!z) {
            Log.d("UpdDlder", "startDownload failed:" + uCKnownException.errMsg());
            this.f23952a.a(uCKnownException);
        }
        com.uc.webview.base.io.b bVar = this.g;
        if (bVar != null) {
            bVar.b();
        }
        return z;
    }

    @Override // com.uc.webview.internal.setup.download.impl.b.a
    public final void a(InputStream inputStream) {
        Log.d("UpdDlder", "onBodyReceived stream:".concat(String.valueOf(inputStream)));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f, true);
            byte[] bArr = new byte[51200];
            do {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    int i = 0;
                    fileOutputStream.write(bArr, 0, read);
                    this.j += read;
                    int i2 = 100;
                    if (this.i > 0) {
                        i = this.j > this.i ? 100 : (int) ((((float) this.j) * 100.0f) / ((float) this.i));
                    }
                    if (i >= this.h) {
                        if (this.h <= 80) {
                            i2 = this.h + 20;
                        }
                        this.h = i2;
                        this.f23952a.onProgressChanged(i);
                    }
                }
                if (read <= 0) {
                    break;
                }
            } while (this.j < this.i);
            d.a(fileOutputStream);
        } catch (Throwable th) {
            try {
                Log.d("UpdDlder", "readBody failed", th);
            } finally {
                d.a(inputStream);
            }
        }
    }

    @Override // com.uc.webview.export.extension.IUrlDownloader
    public final synchronized void delete() {
        try {
            if (this.f != null && this.g != null) {
                this.g.a();
                Log.d("UpdDlder", "delete [" + this.f.getAbsolutePath() + "] for url:" + this.d);
                d.c("UpdDlder-dl", this.f);
                this.g.b();
                com.uc.webview.base.io.b bVar = this.g;
                d.c(bVar.b, bVar.f23788a);
            }
        } catch (Throwable th) {
            Log.w("UpdDlder", "delete failed", th);
        }
    }

    @Override // com.uc.webview.export.extension.IUrlDownloader
    public final synchronized boolean start(String str, String str2, IUrlDownloader.Client client) {
        Log.d("UpdDlder", "start url:" + str + ", savedPath:" + str2);
        this.d = str;
        this.e = new File(str2);
        return a();
    }

    @Override // com.uc.webview.export.extension.IUrlDownloader
    public final synchronized void stop() {
        Log.d("UpdDlder", "stop not support");
    }
}
