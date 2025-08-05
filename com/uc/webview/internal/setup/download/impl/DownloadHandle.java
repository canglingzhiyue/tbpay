package com.uc.webview.internal.setup.download.impl;

import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.task.e;
import com.uc.webview.export.extension.IUrlDownloader;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import com.uc.webview.internal.setup.download.impl.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class DownloadHandle implements IDownloadHandle {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f23949a = new AtomicInteger(0);
    private e.a b = null;
    private IDownloadHandle.Client c = null;
    private a.C1043a d = null;
    private IUrlDownloader e = null;
    private String f = null;
    private File g = null;
    private File h = null;
    private long i = 0;
    private long j = 0;
    private long k = 0;

    /* loaded from: classes9.dex */
    class a extends a.C1043a {
        private a() {
        }

        /* synthetic */ a(DownloadHandle downloadHandle, byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.download.impl.a.C1043a
        public final void a(UCKnownException uCKnownException) {
            Log.d("DlHandle", "DClient.onFailed:" + uCKnownException.errMsg());
            DownloadHandle.a(DownloadHandle.this, uCKnownException);
        }

        @Override // com.uc.webview.internal.setup.download.impl.a.C1043a
        public final void a(File file, long j, long j2) {
            Log.d("DlHandle", "DClient.onFileExists:" + file.getAbsolutePath() + ", length:" + file.length() + ", remoteSize:" + j + ", remoteLastModified:" + j2);
            DownloadHandle.this.h = file;
            DownloadHandle.this.i = j;
            DownloadHandle.this.j = j2;
            DownloadHandle.a(DownloadHandle.this, (UCKnownException) null);
        }

        @Override // com.uc.webview.internal.setup.download.impl.a.C1043a
        public final boolean a(String str, long j, long j2) {
            if (DownloadHandle.this.c != null) {
                return DownloadHandle.this.c.onGetSizeInfo(str, j, j2);
            }
            return true;
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final void onFailed(String str, Throwable th) {
            Log.w("DlHandle", "DClient.onFailed msg:".concat(String.valueOf(str)), th);
            a(new UCKnownException(th));
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final void onProgressChanged(int i) {
            Log.d("DlHandle", "DClient.onProgressChanged:".concat(String.valueOf(i)));
            if (DownloadHandle.this.c != null) {
                DownloadHandle.this.c.onProgress(i);
            }
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final boolean onStart() {
            Log.d("DlHandle", "DClient.onStart");
            if (DownloadHandle.this.c != null) {
                return DownloadHandle.this.c.onStart(DownloadHandle.this.f);
            }
            return true;
        }

        @Override // com.uc.webview.export.extension.IUrlDownloader.Client
        public final void onSuccess(String str, long j, long j2) {
            Log.i("DlHandle", "DClient.onSuccess filePath:" + str + ", size:" + j);
            DownloadHandle.this.h = new File(str);
            DownloadHandle.this.i = j;
            DownloadHandle.this.j = j2;
            DownloadHandle.a(DownloadHandle.this, (UCKnownException) null);
        }
    }

    private DownloadHandle() {
    }

    private void a() {
        synchronized (this) {
            try {
                if (this.b != null) {
                    this.b.f23803a.quitSafely();
                }
                this.b = null;
            } catch (Throwable unused) {
            }
        }
    }

    private void a(long j) {
        Runnable runnable = new Runnable() { // from class: com.uc.webview.internal.setup.download.impl.DownloadHandle.1
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHandle.a(DownloadHandle.this);
            }
        };
        synchronized (this) {
            if (this.b == null) {
                this.b = e.a("dl" + f23949a.getAndIncrement());
            }
            this.b.b.postDelayed(runnable, j);
        }
    }

    static /* synthetic */ void a(DownloadHandle downloadHandle) {
        Log.d("DlHandle", "startDownload url:" + downloadHandle.f);
        downloadHandle.e.start(downloadHandle.f, downloadHandle.g.getAbsolutePath(), downloadHandle.d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    static /* synthetic */ void a(com.uc.webview.internal.setup.download.impl.DownloadHandle r11, com.uc.webview.base.UCKnownException r12) {
        /*
            r0 = 0
            r1 = 1
            if (r12 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            java.lang.String r3 = "DlHandle"
            if (r2 == 0) goto L1e
            com.uc.webview.internal.setup.download.IDownloadHandle$Client r12 = r11.c     // Catch: java.lang.Throwable -> L75
            if (r12 == 0) goto L1a
            com.uc.webview.internal.setup.download.IDownloadHandle$Client r4 = r11.c     // Catch: java.lang.Throwable -> L75
            java.io.File r5 = r11.h     // Catch: java.lang.Throwable -> L75
            long r6 = r11.i     // Catch: java.lang.Throwable -> L75
            long r8 = r11.j     // Catch: java.lang.Throwable -> L75
            r4.onSuccess(r5, r6, r8)     // Catch: java.lang.Throwable -> L75
        L1a:
            r11.a()
            return
        L1e:
            int r4 = r12.errCode()     // Catch: java.lang.Throwable -> L75
            com.uc.webview.base.ErrorCode r5 = com.uc.webview.base.ErrorCode.UPDATE_DOWNLOAD_INTERRUPTED     // Catch: java.lang.Throwable -> L75
            int r5 = r5.code     // Catch: java.lang.Throwable -> L75
            if (r4 != r5) goto L32
            java.lang.String r12 = "onInterrupted, do not retry"
            com.uc.webview.base.Log.w(r3, r12)     // Catch: java.lang.Throwable -> L75
            r11.a()
            return
        L32:
            long r4 = r11.k     // Catch: java.lang.Throwable -> L6f
            r6 = 180000(0x2bf20, double:8.8932E-319)
            long r4 = r4 + r6
            r11.k = r4     // Catch: java.lang.Throwable -> L6f
            long r4 = r11.k     // Catch: java.lang.Throwable -> L6f
            r8 = 1800000(0x1b7740, double:8.89318E-318)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L54
            java.lang.String r4 = "onFailed retry after 3 mins"
            com.uc.webview.base.Log.w(r3, r4, r12)     // Catch: java.lang.Throwable -> L6f
            r11.a(r6)     // Catch: java.lang.Throwable -> L51
            r0 = 1
            goto L63
        L4e:
            r12 = move-exception
            r0 = 1
            goto L8c
        L51:
            r12 = move-exception
            r0 = 1
            goto L70
        L54:
            java.lang.String r4 = "onFailed retry multi times and failed"
            com.uc.webview.base.Log.w(r3, r4, r12)     // Catch: java.lang.Throwable -> L6f
            com.uc.webview.internal.setup.download.IDownloadHandle$Client r4 = r11.c     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L63
            com.uc.webview.internal.setup.download.IDownloadHandle$Client r4 = r11.c     // Catch: java.lang.Throwable -> L6f
            r4.onFailed(r12)     // Catch: java.lang.Throwable -> L6f
        L63:
            r11.delete()
            if (r0 != 0) goto L88
            r11.a()
            return
        L6c:
            r12 = move-exception
            r0 = 1
            goto L73
        L6f:
            r12 = move-exception
        L70:
            r4 = 1
            goto L77
        L72:
            r12 = move-exception
        L73:
            r1 = 0
            goto L8c
        L75:
            r12 = move-exception
            r4 = 0
        L77:
            java.lang.String r5 = "finish failed"
            com.uc.webview.base.Log.w(r3, r5, r12)     // Catch: java.lang.Throwable -> L89
            r12 = r2 ^ 1
            if (r12 == 0) goto L83
            r11.delete()
        L83:
            if (r0 != 0) goto L88
            r11.a()
        L88:
            return
        L89:
            r12 = move-exception
            r1 = r0
            r0 = r4
        L8c:
            if (r0 == 0) goto L91
            r11.delete()
        L91:
            if (r1 != 0) goto L96
            r11.a()
        L96:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.download.impl.DownloadHandle.a(com.uc.webview.internal.setup.download.impl.DownloadHandle, com.uc.webview.base.UCKnownException):void");
    }

    public static IDownloadHandle create() {
        return new DownloadHandle();
    }

    @Override // com.uc.webview.export.extension.U4Engine.IDownloadHandle
    public void cancel() {
        a();
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public void delete() {
        IUrlDownloader iUrlDownloader = this.e;
        if (iUrlDownloader != null) {
            iUrlDownloader.delete();
        }
    }

    protected void finalize() throws Throwable {
        a();
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public long getRemoteLastModified() {
        return this.j;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public long getRemoteSize() {
        return this.i;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public File getSavedFile() {
        return this.h;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public String getUrl() {
        return this.f;
    }

    @Override // com.uc.webview.export.extension.U4Engine.IDownloadHandle
    public void restart() {
        cancel();
        a(0L);
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setClient(IDownloadHandle.Client client) {
        this.c = client;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setDownloader(IUrlDownloader iUrlDownloader) {
        this.e = iUrlDownloader;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setSpecifiedDir(File file) {
        this.g = file;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public IDownloadHandle setUrl(String str) {
        this.f = str;
        return this;
    }

    @Override // com.uc.webview.internal.setup.download.IDownloadHandle
    public void start() {
        this.d = new a(this, (byte) 0);
        if (this.e == null) {
            Log.d("DlHandle", "checkConfigs use internal IUrlDownloader");
            com.uc.webview.internal.setup.download.impl.a aVar = new com.uc.webview.internal.setup.download.impl.a();
            aVar.f23952a = this.d;
            aVar.b = GlobalSettings.getIntValue(129);
            aVar.c = GlobalSettings.getIntValue(128);
            this.e = aVar;
        } else {
            Log.d("DlHandle", "checkConfigs use delegate IUrlDownloader");
        }
        a(0L);
    }
}
