package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.zip.MultiThreadSevenZip;
import com.uc.webview.base.zip.a;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;

/* loaded from: classes9.dex */
public final class d implements U4Engine.Extractor {

    /* renamed from: a  reason: collision with root package name */
    private Context f23947a = null;
    private U4Engine.Extractor.Client b = null;
    private boolean c = false;
    private boolean d = true;
    private boolean e = false;
    private File f = null;
    private File g = null;
    private UCKnownException h = null;

    static /* synthetic */ void a(d dVar, UCKnownException uCKnownException) {
        U4Engine.Extractor.Client client;
        boolean z = uCKnownException == null;
        Log.d("Setup.extract", "doExtraction finish isSuccess:" + z + ", exists:" + dVar.c + ", mClient:" + dVar.b, uCKnownException);
        if (dVar.c || (client = dVar.b) == null) {
            return;
        }
        if (!z) {
            client.onFailed(uCKnownException);
        } else if (!dVar.a()) {
            dVar.b.onFailed(dVar.h);
        } else {
            dVar.b.onSuccess(dVar.g);
        }
    }

    private boolean a() {
        if (!this.e) {
            return true;
        }
        boolean z = false;
        try {
            if (this.b == null || !com.uc.webview.base.g.a(U4Engine.Extractor.Client.class, this.b.getClass(), "onVerification", File.class, File.class)) {
                Log.d("Setup.extract", "doU4Verification");
                if (!com.uc.webview.internal.e.e()) {
                    Log.d("Setup.extract", "doU4Verification start");
                    k kVar = new k();
                    kVar.a(this.f23947a);
                    kVar.d = this.f;
                    l.b().a(j.b(kVar), GlobalSettings.getIntValue(135));
                    Log.d("Setup.extract", "doU4Verification success");
                }
            } else {
                Log.d("Setup.extract", "doCustomVerification");
                if (!this.b.onVerification(this.f, this.g)) {
                    ErrorCode.DECOMPRESS_CUSTOM_VERIFICATION_FAILED.report();
                }
            }
        } catch (UCKnownException e) {
            this.h = e;
        } catch (Throwable th) {
            this.h = new UCKnownException(th);
        }
        if (this.h == null) {
            z = true;
        }
        StringBuilder sb = new StringBuilder("doVerification ");
        sb.append(z ? "success" : "failed");
        Log.d("Setup.extract", sb.toString());
        return z;
    }

    static /* synthetic */ void d(d dVar) {
        Log.d("Setup.extract", "doExtraction exists, not need to extract");
        if (!dVar.a()) {
            U4Engine.Extractor.Client client = dVar.b;
            if (client == null) {
                return;
            }
            client.onFailed(dVar.h);
            return;
        }
        dVar.c = true;
        U4Engine.Extractor.Client client2 = dVar.b;
        if (client2 == null) {
            return;
        }
        client2.onExists(dVar.f, dVar.g);
    }

    static /* synthetic */ boolean e(d dVar) {
        Log.d("Setup.extract", "doExtraction start file: " + dVar.f.getAbsolutePath() + ", outDir:" + dVar.g.getAbsolutePath());
        U4Engine.Extractor.Client client = dVar.b;
        if (client != null) {
            return client.onStart(dVar.f, dVar.g);
        }
        return true;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setASync(boolean z) {
        this.d = z;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setClient(U4Engine.Extractor.Client client) {
        this.b = client;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setCompressedFile(File file) {
        this.f = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setContext(Context context) {
        this.f23947a = context;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setForceVerification(boolean z) {
        this.e = z;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final U4Engine.Extractor setSpecifiedDir(File file) {
        this.g = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Extractor
    public final void start() throws UCKnownException {
        if (this.f23947a == null) {
            ErrorCode.CONTEXT_IS_NULL.report();
        }
        if (EnvInfo.getContext() == null) {
            EnvInfo.a(this.f23947a);
        }
        File file = this.f;
        if (file == null || !file.exists()) {
            StringBuilder sb = new StringBuilder("error compressed lib:");
            File file2 = this.f;
            sb.append(file2 != null ? file2.getAbsolutePath() : "null");
            Log.e("Setup.extract", sb.toString());
            ErrorCode.INVALID_COMPRESSED_LIB.report();
        }
        if (this.g == null) {
            this.g = new File(PathUtils.e(this.f23947a), PathUtils.generateName(this.f));
            com.uc.webview.base.io.d.a(this.g);
        }
        com.uc.webview.base.task.c cVar = new com.uc.webview.base.task.c() { // from class: com.uc.webview.internal.setup.d.2
            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
            public final /* synthetic */ c.C1036c call() throws Exception {
                return super.call();
            }

            @Override // com.uc.webview.base.task.c
            public final void d() {
                com.uc.webview.base.io.b bVar;
                com.uc.webview.base.zip.a aVar = new com.uc.webview.base.zip.a(d.this.f23947a, d.this.f, d.this.g);
                if (aVar.e.c()) {
                    d.d(d.this);
                } else if (!d.e(d.this)) {
                    Log.d("Setup.extract", "cannot extract internal");
                } else {
                    synchronized (PathUtils.a()) {
                        try {
                            aVar.f.a();
                            if (aVar.e.c()) {
                                Log.d("UnZipper", "unzip finished");
                                aVar.e.a();
                                if (!TextUtils.isEmpty(null)) {
                                    com.uc.webview.base.zip.a.f23813a.remove(null);
                                }
                                bVar = aVar.f;
                            } else {
                                com.uc.webview.base.io.d.a(aVar.d);
                                com.uc.webview.base.io.c cVar2 = aVar.e;
                                com.uc.webview.base.io.d.c("FlagMarker-ms", cVar2.b);
                                com.uc.webview.base.io.d.b("FlagMarker-ms", cVar2.f23789a);
                                File file3 = aVar.d;
                                if (aVar.g) {
                                    file3 = new File(PathUtils.i(aVar.b), PathUtils.generateName(aVar.c));
                                    Log.d("UnZipper", "zipFile:" + aVar.c.getAbsolutePath());
                                    Log.d("UnZipper", "tempOutDir:" + file3.getAbsolutePath());
                                }
                                com.uc.webview.base.io.d.a(file3);
                                String absolutePath = file3.getAbsolutePath();
                                com.uc.webview.base.zip.a.f23813a.add(absolutePath);
                                if (com.uc.webview.base.io.d.b(aVar.c)) {
                                    Log.d("UnZipper", "start un gzip");
                                    new a.C1039a(aVar.c, file3).a();
                                } else {
                                    Log.d("UnZipper", "start un sevenzip");
                                    File file4 = aVar.c;
                                    int deccompress = new MultiThreadSevenZip().deccompress(aVar.b, file4.getAbsolutePath(), file3.getAbsolutePath());
                                    if (deccompress != 0) {
                                        Log.rInfo("UnZipper", "7z decode failed:" + deccompress + ", length:" + (file4.length() / 1024) + "KB, freeSize:" + com.uc.webview.base.io.d.c(file3) + ", zipFile:" + file4.getAbsolutePath() + ", outDir:" + file3.getAbsolutePath());
                                        if (28 == deccompress) {
                                            ErrorCode.DECOMPRESS_SEVENZIP_ERROR_NOSPC.report();
                                        }
                                        ErrorCode.DECOMPRESS_SEVENZIP_ERROR.report("7zError=" + String.valueOf(deccompress));
                                    }
                                }
                                Log.d("UnZipper", "unzip result: true");
                                if (aVar.g) {
                                    com.uc.webview.base.zip.a.a(file3, aVar.d);
                                }
                                aVar.e.a();
                                if (!TextUtils.isEmpty(absolutePath)) {
                                    com.uc.webview.base.zip.a.f23813a.remove(absolutePath);
                                }
                                bVar = aVar.f;
                            }
                            bVar.b();
                        } catch (UCKnownException e) {
                            throw e;
                        }
                    }
                }
            }

            @Override // com.uc.webview.base.task.c
            public final String e() {
                return "Setup.extract";
            }

            @Override // com.uc.webview.base.task.c
            public final int f() {
                return StartupTimingKeys.EXTRACTOR;
            }
        };
        cVar.f23798a = new c.b() { // from class: com.uc.webview.internal.setup.d.1
            @Override // com.uc.webview.base.task.c.b
            public final void a() {
                d.a(d.this, null);
            }

            @Override // com.uc.webview.base.task.c.b
            public final void a(UCKnownException uCKnownException) {
                d.a(d.this, uCKnownException);
            }
        };
        cVar.b = this.d;
        cVar.a();
    }
}
