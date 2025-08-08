package com.uc.webview.internal.setup;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;

/* loaded from: classes9.dex */
public class e implements U4Engine.Initializer {
    private final k b = new k();
    private U4Engine.InitializerClient c = null;
    private IUrlDownloader d = null;

    /* renamed from: a  reason: collision with root package name */
    protected j f23954a = null;
    private boolean e = true;
    private int f = 0;
    private int g = 0;
    private UCKnownException h = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f23960a = new e();
    }

    static {
        Log.d("Setup.init", "prepare init");
        com.uc.webview.base.task.d.a("initEnv", new Runnable() { // from class: com.uc.webview.internal.setup.e.1
            @Override // java.lang.Runnable
            public final void run() {
                l.b();
                l.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public e() {
        com.uc.webview.base.timing.a.b();
    }

    public static e a() {
        return a.f23960a;
    }

    private void a(int i) {
        if (GlobalSettings.getBoolValue(74)) {
            Log.d(c(), "fallbackToSystemWebView");
            com.uc.webview.internal.e.a(2, i);
            U4Engine.InitializerClient initializerClient = this.c;
            if (initializerClient == null) {
                return;
            }
            initializerClient.onCoreTypeReady(com.uc.webview.internal.e.c(), i);
        }
    }

    private void a(boolean z) {
        if (this.c == null) {
            return;
        }
        try {
            IRunningCoreInfo iRunningCoreInfo = IRunningCoreInfo.Instance.get();
            if (z) {
                this.c.onSuccess(iRunningCoreInfo);
            } else {
                this.c.onFailed(iRunningCoreInfo);
            }
        } catch (Throwable th) {
            Log.rInfo(c(), "onFinished: client handle failed", th);
            if (!z || !GlobalSettings.getBoolValue(65)) {
                return;
            }
            f h = f.h();
            h.c = f();
            h.d = this.f23954a;
            h.e = new UCKnownException(ErrorCode.EMBEDER_INIT_FINISHED_CALLBACK_FAILED, (String) null, th);
            h.a(1000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void b(com.uc.webview.internal.setup.e r5, boolean r6) {
        /*
            java.lang.String r0 = "Setup.init"
            com.uc.webview.internal.setup.k r1 = r5.f()
            android.content.Context r2 = r1.f23973a
            r3 = 0
            com.uc.webview.internal.setup.j r4 = r5.f23954a     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L20
            com.uc.webview.internal.setup.j r4 = r5.f23954a     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r4.isReUsed()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L20
            if (r6 == 0) goto L1c
            boolean r5 = r5.i()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L1c:
            com.uc.webview.internal.setup.g.b(r2)     // Catch: java.lang.Throwable -> L2e
            goto L34
        L20:
            if (r6 == 0) goto L34
            java.lang.String r4 = "prepare to saveLastRCI"
            com.uc.webview.base.Log.d(r0, r4)     // Catch: java.lang.Throwable -> L2e
            com.uc.webview.internal.setup.j r5 = r5.f23954a     // Catch: java.lang.Throwable -> L2e
            com.uc.webview.internal.setup.g.a(r2, r5)     // Catch: java.lang.Throwable -> L2e
            goto L34
        L2e:
            r5 = move-exception
            java.lang.String r4 = "handleReuse failed"
            com.uc.webview.base.Log.w(r0, r4, r5)
        L34:
            r5 = 0
        L35:
            if (r5 != 0) goto L4c
            com.uc.webview.internal.setup.a r5 = new com.uc.webview.internal.setup.a
            r5.<init>(r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r5.a(r0)
            r5 = 4063745(0x3e0201, float:5.69452E-39)
            r0 = 1
            com.uc.webview.base.timing.a.a(r5, r0)
            com.uc.webview.internal.stats.b.a(r3)
        L4c:
            if (r6 == 0) goto L51
            com.uc.webview.internal.setup.component.c.a()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.e.b(com.uc.webview.internal.setup.e, boolean):void");
    }

    static /* synthetic */ void d(e eVar) {
        EnvInfo.getContext();
        eVar.f23954a = eVar.g().a(eVar.f());
        eVar.f = GlobalSettings.getIntValue(127);
        if (eVar.f < 0) {
            eVar.f = 0;
        }
        U4Engine.InitializerClient initializerClient = eVar.c;
        if (initializerClient != null) {
            initializerClient.onInitStart(eVar.f23954a);
        }
        if (eVar.f23954a.isFirstUsed()) {
            if (eVar.f23954a.b()) {
                if (!com.uc.webview.internal.e.e()) {
                    Log.d("Setup.init", "download core try use system webview");
                    eVar.a(3);
                }
                final IDownloadHandle iDownloadHandle = eVar.f().h;
                final String str = eVar.f().g;
                iDownloadHandle.setUrl(str).setSpecifiedDir(PathUtils.getDirCacheUpdate(eVar.f().f23973a)).setDownloader(eVar.d).setClient(new IDownloadHandle.Client() { // from class: com.uc.webview.internal.setup.e.2
                    private File d = null;

                    private File a(long j, long j2) {
                        if (this.d == null) {
                            this.d = PathUtils.a(e.this.f().f23973a, str, j, j2);
                            String c = e.this.c();
                            Log.d(c, "downloadExtractDir:" + this.d.getAbsolutePath() + ", for url:" + str);
                        }
                        return this.d;
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final void onFailed(UCKnownException uCKnownException) {
                        String c = e.this.c();
                        Log.w(c, "Download.onFailed:" + uCKnownException.errMsg());
                        if (uCKnownException.errCode() == ErrorCode.UPDATE_DOWNLOAD_INTERRUPTED.code) {
                            Log.w(e.this.c(), "Download.onInterrupted wait for restart");
                            return;
                        }
                        com.uc.webview.base.timing.a.a((int) StartupTimingKeys.UPDATE_FAILED_CODE, uCKnownException.errCode());
                        e.this.a(uCKnownException);
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final boolean onGetSizeInfo(String str2, long j, long j2) {
                        com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_HEAD_VALIDITY);
                        File a2 = a(j, j2);
                        if (PathUtils.a(a2).c()) {
                            com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_EXISTS);
                            e.this.f().e = a2;
                            File a3 = l.b().a(e.this.f().f23973a, false);
                            if (a3 == null || !a3.equals(a2)) {
                                Log.d(e.this.c(), "Download.onGetSizeInfo:u4 exists but new");
                                e.this.f23954a.a((File) null, a2);
                                e.this.b();
                            } else {
                                Log.d(e.this.c(), "Download.onGetSizeInfo:u4 exists");
                            }
                            return false;
                        }
                        return true;
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final void onProgress(int i) {
                        if (e.this.c != null) {
                            e.this.c.onDownloadProgress(i);
                        }
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final boolean onStart(String str2) {
                        Log.d(e.this.c(), "Download.onStart:".concat(String.valueOf(str2)));
                        boolean onDownloadStart = e.this.c != null ? e.this.c.onDownloadStart(str, iDownloadHandle) : true;
                        if (onDownloadStart) {
                            com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_START);
                        }
                        return onDownloadStart;
                    }

                    @Override // com.uc.webview.internal.setup.download.IDownloadHandle.Client
                    public final void onSuccess(File file, long j, long j2) {
                        File a2 = a(j, j2);
                        String c = e.this.c();
                        Log.d(c, "Download.onSuccess:" + file.getAbsolutePath() + ", extractDir:" + a2.getAbsolutePath());
                        if (e.this.c != null) {
                            e.this.c.onDownloadFinish(str, file);
                        }
                        e.this.f().d = file;
                        e.this.f().e = a2;
                        e.this.f23954a.a(file, a2);
                        com.uc.webview.base.timing.a.c(StartupTimingKeys.UPDATE_SUCCESS);
                        e.this.h();
                    }
                }).start();
                return;
            } else if (eVar.f().d != null) {
                eVar.h();
                return;
            }
        }
        eVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        com.uc.webview.base.timing.a.c(StartupTimingKeys.EXTRACTOR_START);
        new d().setContext(f().f23973a).setCompressedFile(f().d).setSpecifiedDir(f().e).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.internal.setup.e.3
            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file, File file2) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.EXTRACTOR_EXISTS);
                e.this.b();
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                com.uc.webview.base.timing.a.a((int) StartupTimingKeys.EXTRACTOR_FAILED_CODE, uCKnownException.errCode());
                e.this.a(uCKnownException);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file, File file2) {
                e eVar = e.this;
                eVar.e = eVar.c != null ? e.this.c.onExtractStart(file, file2) : true;
                com.uc.webview.base.b.a("wk_ucbsExtractInter", String.valueOf(e.this.e));
                return e.this.e;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.EXTRACTOR_SUCCESS);
                if (e.this.c != null) {
                    e.this.c.onExtractFinish(file);
                }
                e.this.b();
            }
        }).start();
    }

    private boolean i() {
        if (this.f23954a.v() && GlobalSettings.getBoolValue(71)) {
            Log.d("Setup.init", "postInitNewCore disabled because core is same");
            return false;
        } else if (this.f23954a.a()) {
            Log.d("Setup.init", "postInitNewCore disabled because usingFullCapacity");
            return false;
        } else {
            Log.d("Setup.init", "prepare to postInitNewCore");
            try {
                new i(f()).setClient(this.c).setDownloader(this.d).start();
                return true;
            } catch (Throwable th) {
                Log.w("Setup.init", "doPostInitialization failed", th);
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void a(com.uc.webview.base.UCKnownException r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.e.a(com.uc.webview.base.UCKnownException):void");
    }

    protected void b() {
        try {
            try {
                Log.d(c(), "continueInitCoreLibs");
                com.uc.webview.base.timing.a.c(StartupTimingKeys.CONTINUE_INIT_LIBS);
                EnvInfo.getContext();
                l g = g();
                TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.LOAD_DEX);
                try {
                    ClassLoader a2 = g.a(this.f23954a.m(), this.f23954a.n(), this.f23954a.o());
                    if (this.c != null) {
                        this.c.onDexReady(a2);
                    }
                    if (scoped != null) {
                        scoped.close();
                    }
                    scoped = TraceEvent.scoped((int) StartupTimingKeys.INIT_CORE_ENGINE);
                    try {
                        g.a(this.f23954a, f().b);
                        if (this.c != null) {
                            this.c.onNativeReady(this.f23954a.o());
                        }
                        if (scoped != null) {
                            scoped.close();
                        }
                        IRunningCoreInfo.Instance.set(this.f23954a);
                    } finally {
                    }
                } finally {
                }
            } catch (UCKnownException e) {
                a(e);
            } catch (Exception e2) {
                a(new UCKnownException(e2));
            }
        } finally {
            a((UCKnownException) null);
        }
    }

    protected String c() {
        return "Setup.init";
    }

    protected int d() {
        return StartupTimingKeys.INITIALIZER;
    }

    protected long e() {
        return 0L;
    }

    protected k f() {
        return this.b;
    }

    protected l g() {
        return l.b();
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setAuthKey(String str) {
        Log.d(c(), "setAuthKey:".concat(String.valueOf(str)));
        return setAuthKey(new String[]{str});
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setAuthKey(String[] strArr) {
        f().b = strArr;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setClient(U4Engine.InitializerClient initializerClient) {
        Log.d(c(), "setClient:".concat(String.valueOf(initializerClient)));
        this.c = initializerClient;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setCompressedFile(File file) {
        String c = c();
        StringBuilder sb = new StringBuilder("setCompressedFile:");
        sb.append(file != null ? file.getAbsolutePath() : "null");
        Log.d(c, sb.toString());
        f().d = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setContext(final Context context) {
        Log.d(c(), "setContext:".concat(String.valueOf(context)));
        f().a(context);
        com.uc.webview.base.task.d.a("initLRCI", new Runnable() { // from class: com.uc.webview.internal.setup.e.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    PathUtils.d(context);
                    PathUtils.e(context);
                } catch (Throwable unused) {
                }
                g.c(context);
            }
        });
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setDecompressedDir(File file) {
        String c = c();
        StringBuilder sb = new StringBuilder("setDecompressedDir:");
        sb.append(file != null ? file.getAbsolutePath() : "null");
        Log.d(c, sb.toString());
        f().f = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setDownloader(IUrlDownloader iUrlDownloader) {
        Log.d(c(), "setDownloader:".concat(String.valueOf(iUrlDownloader)));
        this.d = iUrlDownloader;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setSpecifiedDir(File file) {
        String c = c();
        StringBuilder sb = new StringBuilder("setSpecifiedDir:");
        sb.append(file != null ? file.getAbsolutePath() : "null");
        Log.d(c, sb.toString());
        f().e = file;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public U4Engine.Initializer setUrl(String str) {
        Log.d(c(), "setUrl:".concat(String.valueOf(str)));
        f().g = str;
        return this;
    }

    @Override // com.uc.webview.export.extension.U4Engine.Initializer
    public void start() throws UCKnownException {
        UCKnownException e;
        try {
            Log.d(c(), "start");
            g().a();
            k f = f();
            StringBuilder sb = new StringBuilder("using configs {\n");
            sb.append(f.toString());
            sb.append("\n}");
            Log.b();
            if (f.f23973a == null) {
                ErrorCode.CONTEXT_IS_NULL.report();
            }
            if (f.i) {
                f.c = false;
            }
            if (GlobalSettings.get(77, false)) {
                f.c = false;
                m.b = true;
            }
            if (f.d == null && f.f == null && StringUtils.isEmpty(f.g) && (!f.c || !PathUtils.getFileCoreLib(new File(f.f23973a.getApplicationInfo().nativeLibraryDir)).exists())) {
                ErrorCode.NEED_AT_LEAST_ONE_LIB_CONFIG.report();
            }
            if (f.d != null && !f.d.exists()) {
                ErrorCode.INVALID_COMPRESSED_LIB.report();
            }
            if (f.f != null && !com.uc.webview.base.io.d.a(f.f, f.c)) {
                ErrorCode.INVALID_DECOMPRESSED_DIR.report();
            }
            if (!StringUtils.isEmpty(f.g)) {
                f.h = IDownloadHandle.Instance.create();
                if (f.h == null) {
                    ErrorCode.UPDATE_FEATURE_DISABLED.report();
                }
            }
            com.uc.webview.base.task.c cVar = new com.uc.webview.base.task.c() { // from class: com.uc.webview.internal.setup.e.7
                @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
                public final /* synthetic */ c.C1036c call() throws Exception {
                    return super.call();
                }

                @Override // com.uc.webview.base.task.c
                public final void d() {
                    e.d(e.this);
                }

                @Override // com.uc.webview.base.task.c
                public final String e() {
                    return e.this.c();
                }

                @Override // com.uc.webview.base.task.c
                public final int f() {
                    return e.this.d();
                }
            };
            cVar.f23798a = new c.b() { // from class: com.uc.webview.internal.setup.e.6
                @Override // com.uc.webview.base.task.c.b
                public final void a(UCKnownException uCKnownException) {
                    e.this.a(uCKnownException);
                }
            };
            cVar.a(e());
            e = null;
        } catch (UCKnownException e2) {
            e = e2;
        } catch (Throwable th) {
            e = new UCKnownException(th);
        }
        if (e == null) {
            return;
        }
        a(e);
        throw e;
    }
}
