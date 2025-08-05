package com.alibaba.security.client.smart.core.track.easy;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.Ca;
import com.alibaba.security.ccrc.service.build.Da;
import com.alibaba.security.ccrc.service.build.Ea;
import com.alibaba.security.ccrc.service.build.HandlerC1256va;
import com.alibaba.security.ccrc.service.build.Ka;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.client.smart.core.track.ITrack;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class EasyTracker implements Handler.Callback, ITrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EasyTracker";
    public static final int UPLOAD_MSG = 4096;
    public final AtomicBoolean hasInit;
    public Context mContext;
    public final Handler mHandler;
    public final Da mLogBuffer;
    public final ThreadPoolExecutor mThreadPoolExecutor;
    public final Ea mTrackUpload;
    public boolean startTimer;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public static final EasyTracker f3343a = new EasyTracker();
    }

    public /* synthetic */ EasyTracker(Ca ca) {
        this();
    }

    public /* synthetic */ void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4926222", new Object[]{this, trackLog});
        } else {
            doTrace(trackLog);
        }
    }

    public static /* synthetic */ void access$200(EasyTracker easyTracker, Da da, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9bae978", new Object[]{easyTracker, da, str});
        } else {
            easyTracker.doUpload(da, str);
        }
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            doUpload(this.mLogBuffer, "bootstrap");
        }
    }

    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.mThreadPoolExecutor.submit(new Runnable() { // from class: com.alibaba.security.client.smart.core.track.easy.-$$Lambda$EasyTracker$zuHS8QmbZa-YpaktE5UeMTLoMqI
                {
                    EasyTracker.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.m251lambda$zuHS8QmbZaYpaktE5UeMTLoMqI(EasyTracker.this);
                }
            });
        }
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        long bootstrapUploadInterval = getBootstrapUploadInterval();
        if (bootstrapUploadInterval < 0) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.alibaba.security.client.smart.core.track.easy.-$$Lambda$EasyTracker$IYy62BiPO_YJQH0iXeTEWi5H2_E
            {
                EasyTracker.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EasyTracker.lambda$IYy62BiPO_YJQH0iXeTEWi5H2_E(EasyTracker.this);
            }
        }, bootstrapUploadInterval);
    }

    private void doNetUpload(List<TrackLog> list, String str) {
        Ea ea;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe4bab5", new Object[]{this, list, str});
        } else if (list == null || list.isEmpty() || (ea = this.mTrackUpload) == null) {
        } else {
            ea.a(list, str, this.mContext);
        }
    }

    private void doTrace(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e2fa29", new Object[]{this, trackLog});
        } else if (!getLogSwitch()) {
            Logging.e("trace", "log switch closed");
        } else {
            synchronized (EasyTracker.class) {
                if (!this.startTimer) {
                    startTimer();
                    this.startTimer = true;
                }
            }
            this.mLogBuffer.a(trackLog);
            if (!this.mLogBuffer.a(getUploadCountThreshHold())) {
                return;
            }
            doUpload(this.mLogBuffer, "threshold");
        }
    }

    private synchronized void doUpload(Da da, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a60d64", new Object[]{this, da, str});
        } else if (!isInit()) {
            logNotInitError();
        } else {
            try {
                List<TrackLog> c = da.c();
                int min = Math.min(getUploadCountThreshHold() + 0, c.size());
                while (i < min) {
                    doNetUpload(c.subList(i, min), str);
                    i = min;
                    min = Math.min(getUploadCountThreshHold() + min, c.size());
                }
                da.a();
            } catch (Throwable unused) {
            }
        }
    }

    private long getBootstrapUploadInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("85246539", new Object[]{this})).longValue() : Kb.b().d() * 1000;
    }

    public static EasyTracker getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EasyTracker) ipChange.ipc$dispatch("ee4eba22", new Object[0]) : a.f3343a;
    }

    private boolean getLogSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcbd786d", new Object[]{this})).booleanValue() : Kb.b().h();
    }

    private long getLogUploadInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5b9500f", new Object[]{this})).longValue() : Kb.b().i() * 1000;
    }

    private int getUploadCountThreshHold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa1d7e8d", new Object[]{this})).intValue() : Kb.b().n();
    }

    private synchronized boolean isInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return this.mContext != null;
    }

    public static /* synthetic */ void lambda$1CQR2mO9mM8xtIj0Y60oLRsgyMw(EasyTracker easyTracker) {
        easyTracker.a();
    }

    public static /* synthetic */ void lambda$Eb94Pbvxz6Md3ci7IrtPhObh70o(EasyTracker easyTracker) {
        easyTracker.d();
    }

    public static /* synthetic */ void lambda$IYy62BiPO_YJQH0iXeTEWi5H2_E(EasyTracker easyTracker) {
        easyTracker.c();
    }

    public static /* synthetic */ void lambda$nGsX25HmZhoTUUrx4U5Z3Z_8590(EasyTracker easyTracker, TrackLog trackLog) {
        easyTracker.a(trackLog);
    }

    /* renamed from: lambda$zuHS8QmbZa-YpaktE5UeMTLoMqI */
    public static /* synthetic */ void m251lambda$zuHS8QmbZaYpaktE5UeMTLoMqI(EasyTracker easyTracker) {
        easyTracker.b();
    }

    private void logNotInitError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5952b0", new Object[]{this});
        } else {
            Logging.e(TAG, "context is null,sdk has not init");
        }
    }

    private void postUploadMsgDelayed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2bd6bc9", new Object[]{this});
            return;
        }
        if (this.mHandler.hasMessages(4096)) {
            this.mHandler.removeMessages(4096);
        }
        this.mHandler.sendEmptyMessageDelayed(4096, getLogUploadInterval());
    }

    private void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else {
            this.mHandler.sendEmptyMessageDelayed(4096, getLogUploadInterval());
        }
    }

    private void uploadDiskCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1da616b", new Object[]{this});
        } else {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: com.alibaba.security.client.smart.core.track.easy.-$$Lambda$EasyTracker$Eb94Pbvxz6Md3ci7IrtPhObh70o
                {
                    EasyTracker.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.lambda$Eb94Pbvxz6Md3ci7IrtPhObh70o(EasyTracker.this);
                }
            });
        }
    }

    private void uploadInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad08e76d", new Object[]{this});
        } else {
            this.mThreadPoolExecutor.execute(new Ca(this));
        }
    }

    public void doUploadOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbde514", new Object[]{this});
        } else if (!isInit()) {
            logNotInitError();
        } else {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: com.alibaba.security.client.smart.core.track.easy.-$$Lambda$EasyTracker$1CQR2mO9mM8xtIj0Y60oLRsgyMw
                {
                    EasyTracker.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.lambda$1CQR2mO9mM8xtIj0Y60oLRsgyMw(EasyTracker.this);
                }
            });
        }
    }

    @Override // com.alibaba.security.client.smart.core.track.ITrack
    public Executor getExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this}) : this.mThreadPoolExecutor;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 4096) {
            uploadInterval();
            postUploadMsgDelayed();
        }
        return true;
    }

    @Override // com.alibaba.security.client.smart.core.track.ITrack
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.hasInit.compareAndSet(false, true)) {
        } else {
            this.mContext = context;
            this.mLogBuffer.a(this.mContext);
            uploadDiskCache();
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeMessages(4096);
    }

    @Override // com.alibaba.security.client.smart.core.track.ITrack
    public void trace(final TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facdadbe", new Object[]{this, trackLog});
        } else if (!isInit()) {
            logNotInitError();
        } else {
            this.mThreadPoolExecutor.execute(new Runnable() { // from class: com.alibaba.security.client.smart.core.track.easy.-$$Lambda$EasyTracker$nGsX25HmZhoTUUrx4U5Z3Z_8590
                @Override // java.lang.Runnable
                public final void run() {
                    EasyTracker.lambda$nGsX25HmZhoTUUrx4U5Z3Z_8590(EasyTracker.this, trackLog);
                }
            });
        }
    }

    public EasyTracker() {
        this.hasInit = new AtomicBoolean(false);
        this.mLogBuffer = new Da();
        this.mThreadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Ka("track_manager"));
        this.mThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.mHandler = new HandlerC1256va(this);
        this.mTrackUpload = new Ea();
    }

    public /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            doUpload(this.mLogBuffer, Baggage.Amnet.SECURITY_INSTANT);
        }
    }
}
