package com.uc.webview.internal.setup;

import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;

/* loaded from: classes9.dex */
public final class i extends e {
    final k b;
    private final l c = new b((byte) 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class a extends U4Engine.InitializerClient {
        private U4Engine.InitializerClient b;

        public a(U4Engine.InitializerClient initializerClient) {
            this.b = initializerClient;
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onDexReady(ClassLoader classLoader) {
            Log.d("Post.init", "onDexReady:".concat(String.valueOf(classLoader)));
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onDownloadFinish(String str, File file) {
            Log.d("Post.init", "onDownloadFinish:" + file.getAbsolutePath());
            com.uc.webview.base.timing.a.c(StartupTimingKeys.POST_UPDATE_SUCCESS);
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onDownloadProgress(int i) {
            Log.d("Post.init", "onDownloadProgress:".concat(String.valueOf(i)));
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final boolean onDownloadStart(String str, U4Engine.IDownloadHandle iDownloadHandle) {
            U4Engine.InitializerClient initializerClient = this.b;
            boolean onDownloadStart = initializerClient != null ? initializerClient.onDownloadStart(i.this.b.g, i.this.b.h) : true;
            if (onDownloadStart) {
                com.uc.webview.base.timing.a.c(StartupTimingKeys.POST_UPDATE_START);
            }
            return onDownloadStart;
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onExtractFinish(File file) {
            Log.d("Post.init", "onExtractFinish");
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final boolean onExtractStart(File file, File file2) {
            Log.d("Post.init", "onExtractStart:" + file2.getAbsolutePath());
            return true;
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onFailed(IRunningCoreInfo iRunningCoreInfo) {
            Log.d("Post.init", "onFailed:" + iRunningCoreInfo.toString());
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onInitStart(IRunningCoreInfo iRunningCoreInfo) {
            Log.d("Post.init", "onInitStart:" + iRunningCoreInfo.toString());
        }

        @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
        public final void onSuccess(IRunningCoreInfo iRunningCoreInfo) {
            Log.d("Post.init", "onSuccess:" + iRunningCoreInfo.toString());
        }
    }

    /* loaded from: classes9.dex */
    static class b extends l {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // com.uc.webview.internal.setup.l
        public final j a(k kVar) {
            return j.b(kVar);
        }

        @Override // com.uc.webview.internal.setup.l
        public final void a() {
        }

        @Override // com.uc.webview.internal.setup.l
        public final boolean b(k kVar) {
            return true;
        }
    }

    public i(k kVar) {
        this.b = kVar;
    }

    @Override // com.uc.webview.internal.setup.e
    protected final void a(UCKnownException uCKnownException) {
        String str;
        boolean z = uCKnownException == null;
        StringBuilder sb = new StringBuilder("onFinished isSuccess:");
        sb.append(z);
        sb.append(", coreInfo: {");
        if (this.f23954a != null) {
            str = "\n" + this.f23954a.toString() + "\n}";
        } else {
            str = "null";
        }
        sb.append(str);
        Log.d("Post.init", sb.toString(), uCKnownException);
        if (this.f23954a != null) {
            this.c.a(this.f23954a.m());
        }
        if (z) {
            g.a(this.f23954a, this.f23954a.coreClassLoader());
            g.a(this.b.f23973a, this.f23954a);
            com.uc.webview.base.io.c r = this.f23954a.r();
            if (r != null) {
                r.a();
            }
        }
        new com.uc.webview.internal.setup.a(this.b.f23973a, this.b).a((!z || this.f23954a == null) ? null : this.f23954a.q()).a(3000L);
        com.uc.webview.base.timing.a.a((int) StartupTimingKeys.SDK_INIT_READY, 1L);
        com.uc.webview.internal.stats.b.a(false);
    }

    @Override // com.uc.webview.internal.setup.e
    protected final void b() {
        try {
            try {
                TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.POST_CONTINUE_INIT_LIBS);
                try {
                    g.b(this.b.f23973a);
                    this.c.a(this.f23954a, 2);
                    if (scoped != null) {
                        scoped.close();
                    }
                } catch (Throwable th) {
                    if (scoped != null) {
                        try {
                            scoped.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
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

    @Override // com.uc.webview.internal.setup.e
    protected final String c() {
        return "Post.init";
    }

    @Override // com.uc.webview.internal.setup.e
    protected final int d() {
        return StartupTimingKeys.POST_INITIALIZER;
    }

    @Override // com.uc.webview.internal.setup.e
    protected final long e() {
        return GlobalSettings.getIntValue(133);
    }

    @Override // com.uc.webview.internal.setup.e
    protected final k f() {
        return this.b;
    }

    @Override // com.uc.webview.internal.setup.e
    protected final l g() {
        return this.c;
    }

    @Override // com.uc.webview.internal.setup.e, com.uc.webview.export.extension.U4Engine.Initializer
    public final U4Engine.Initializer setClient(U4Engine.InitializerClient initializerClient) {
        super.setClient(new a(initializerClient));
        return this;
    }
}
