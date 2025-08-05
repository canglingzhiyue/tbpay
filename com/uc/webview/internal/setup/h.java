package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.extension.UCPlayer;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class h implements UCPlayer.Updater {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f23964a = new AtomicBoolean(false);
    private Context b;
    private String c;
    private UCPlayer.UpdaterClient d;
    private IUrlDownloader e;
    private IDownloadHandle f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f23968a = new h((byte) 0);
    }

    private h() {
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* synthetic */ h(byte b) {
        this();
    }

    public static h a() {
        return a.f23968a;
    }

    static /* synthetic */ void a(h hVar, File file, UCKnownException e) {
        boolean z = true;
        if (e == null) {
            try {
                if (!b(file)) {
                    ErrorCode.UPDATE_MISSING_UCPLAYER_SO.report();
                }
            } catch (UCKnownException e2) {
                e = e2;
            } catch (Throwable th) {
                e = new UCKnownException(th);
            }
        }
        if (e != null) {
            z = false;
        }
        Log.d("Setup.player", "onFinished isSuccess:" + z + ", mClient:" + hVar.d, e);
        if (!z) {
            hVar.d.onFailed(e);
            return;
        }
        a(file.getAbsolutePath());
        hVar.d.onSuccess(file.getAbsolutePath());
    }

    static /* synthetic */ void a(h hVar, File file, File file2) {
        U4Engine.createExtractor().setContext(hVar.b).setCompressedFile(file).setSpecifiedDir(file2).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.internal.setup.h.2
            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file3, File file4) {
                h.a(h.this, file4, (UCKnownException) null);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                h.a(h.this, (File) null, uCKnownException);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file3, File file4) {
                return true;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file3) {
                h.a(h.this, file3, (UCKnownException) null);
            }
        }).start();
    }

    public static void a(String str) {
        Log.d("Setup.player", "updateLibPath:".concat(String.valueOf(str)));
        GlobalSettings.set(170, "so_dir: ".concat(String.valueOf(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(File file) {
        return new File(file, "libu3player.so").exists();
    }

    static /* synthetic */ void e(h hVar) {
        Log.d("Setup.player", "odUpdating");
        hVar.f.setUrl(hVar.c).setSpecifiedDir(PathUtils.getDirCacheUpdate(hVar.b)).setDownloader(hVar.e).setClient(new IDownloadHandle.Client() { // from class: com.uc.webview.internal.setup.h.1
            private File b = null;

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final void onFailed(UCKnownException uCKnownException) {
                Log.w("Setup.player", "Download.onFailed:" + uCKnownException.errMsg());
                h.a(h.this, (File) null, uCKnownException);
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final boolean onGetSizeInfo(String str, long j, long j2) {
                boolean b;
                if (this.b == null) {
                    this.b = new File(PathUtils.f(h.this.b), PathUtils.generateName(h.this.c, j, j2));
                    com.uc.webview.base.io.d.a(this.b);
                    Log.d("Setup.player", "downloadExtractDir:" + this.b.getAbsolutePath() + ", for url:" + h.this.c);
                }
                if (!PathUtils.a(this.b).c()) {
                    Log.d("Setup.player", "Download.canReuse url is updated and need download");
                    b = false;
                } else {
                    b = h.b(this.b);
                }
                if (b) {
                    Log.d("Setup.player", "Download.onGetSizeInfo:u4 exists");
                    h.a(h.this, this.b, (UCKnownException) null);
                    return false;
                }
                return true;
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final void onProgress(int i) {
                if (h.this.d != null) {
                    h.this.d.onDownloadProgress(i);
                }
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final boolean onStart(String str) {
                Log.d("Setup.player", "Download.onStart:".concat(String.valueOf(str)));
                if (h.this.d == null) {
                    return true;
                }
                return h.this.d.onDownloadStart(h.this.c, h.this.f);
            }

            @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
            public final void onSuccess(File file, long j, long j2) {
                Log.d("Setup.player", "Download.onSuccess:" + file.getAbsolutePath() + ", extractDir:" + this.b.getAbsolutePath());
                if (h.this.d != null) {
                    h.this.d.onDownloadFinish(h.this.c, file);
                }
                h.a(h.this, file, this.b);
            }
        }).start();
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setClient(UCPlayer.UpdaterClient updaterClient) {
        this.d = updaterClient;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setContext(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setDownloader(IUrlDownloader iUrlDownloader) {
        this.e = iUrlDownloader;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final UCPlayer.Updater setUrl(String str) {
        this.c = str;
        return this;
    }

    @Override // com.uc.webview.export.extension.UCPlayer.Updater
    public final void start() throws UCKnownException {
        this.f = IDownloadHandle.Instance.create();
        if (this.f == null) {
            Log.w("Setup.player", "update feature is disabled, please update u4sdk or choose other init type");
            ErrorCode.UPDATE_FEATURE_DISABLED.report();
        }
        if (f23964a.getAndSet(true)) {
            ErrorCode.UPDATE_INIT_DUPLICATED.report();
        }
        if (TextUtils.isEmpty(this.c)) {
            ErrorCode.UPDATE_INVALID_URL.report();
        }
        com.uc.webview.base.task.c cVar = new com.uc.webview.base.task.c() { // from class: com.uc.webview.internal.setup.h.4
            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
            public final /* synthetic */ c.C1036c call() throws Exception {
                return super.call();
            }

            @Override // com.uc.webview.base.task.c
            public final void d() {
                if (com.uc.webview.internal.e.d()) {
                    ErrorCode.UPDATE_FAILED_BECAUSE_FALLBACK_SYSTEM.report();
                }
                if (!GlobalSettings.getBoolValue(78)) {
                    ErrorCode.UPDATE_UC_PLAYER_DISABLED.report();
                }
                h.e(h.this);
            }

            @Override // com.uc.webview.base.task.c
            public final String e() {
                return "Setup.player";
            }

            @Override // com.uc.webview.base.task.c
            public final int f() {
                return StartupTimingKeys.PLAYER_INITIALIZER;
            }
        };
        cVar.f23798a = new c.b() { // from class: com.uc.webview.internal.setup.h.3
            @Override // com.uc.webview.base.task.c.b
            public final void a(UCKnownException uCKnownException) {
                h.a(h.this, (File) null, uCKnownException);
            }
        };
        cVar.a();
    }
}
