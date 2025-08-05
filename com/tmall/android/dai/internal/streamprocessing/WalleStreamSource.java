package com.tmall.android.dai.internal.streamprocessing;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.LogUtil;
import com.ut.mini.h;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class WalleStreamSource {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mInitialized = false;
    public boolean DEBUG = false;
    private final String TAG = "WalleStreamSource";
    public final ThreadPoolExecutor mSerialExecutor = new ThreadPoolExecutor(1, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.tmall.android.dai.internal.streamprocessing.WalleStreamSource.1
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b = 0;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("walle_sp_t");
            int i = this.b;
            this.b = i + 1;
            sb.append(i);
            return new Thread(runnable, sb.toString());
        }
    });

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final WalleStreamSource f23701a;

        static {
            kge.a(1558391430);
            f23701a = new WalleStreamSource();
        }

        public static /* synthetic */ WalleStreamSource a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WalleStreamSource) ipChange.ipc$dispatch("eae79ea5", new Object[0]) : f23701a;
        }
    }

    static {
        kge.a(-52372236);
    }

    public static native void nativeBeginEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeEndEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeSendEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeSendEventMap(Map<String, String> map);

    public static native void nativeUpdateEvent(WalleUtEventJava walleUtEventJava);

    public static native void nativeUpdateEventPageName(WalleUtEventJava walleUtEventJava);

    public WalleStreamSource() {
        if (this.DEBUG) {
            LogUtil.d("StreamProcessing", "WalleStreamSource Constructor called in thread: " + Thread.currentThread().getName());
        }
        this.mSerialExecutor.prestartAllCoreThreads();
        this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$ns3-yWvu1s_IeFGUg5HqGt0mkAw
            {
                WalleStreamSource.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WalleStreamSource.this.lambda$new$3$WalleStreamSource();
            }
        });
    }

    public /* synthetic */ void lambda$new$3$WalleStreamSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3b0a99", new Object[]{this});
            return;
        }
        this.mInitialized = true;
        if (!this.DEBUG) {
            return;
        }
        LogUtil.d("StreamProcessing", "WalleStreamSource Constructor created thread: " + Thread.currentThread().getName());
    }

    public static WalleStreamSource getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WalleStreamSource) ipChange.ipc$dispatch("1c34b8cf", new Object[0]) : a.a();
    }

    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue() : this.mInitialized;
    }

    /* loaded from: classes9.dex */
    public static class WalleUtEventJava {
        public String mArg1;
        public String mArg2;
        public String mArg3;
        public long mBeginTime;
        public long mDuration;
        public int mEventId;
        public boolean mH5Pv;
        public String mKey;
        public String mPageName;
        public Map<String, String> mProperties;

        static {
            kge.a(-1316452622);
        }

        public WalleUtEventJava() {
        }

        public WalleUtEventJava(h hVar) {
            this.mKey = hVar.getKey();
            this.mEventId = hVar.getEventId();
            this.mPageName = hVar.getPageName();
            this.mArg1 = hVar.getArg1();
            this.mArg2 = hVar.getArg2();
            this.mArg3 = hVar.getArg3();
            this.mBeginTime = hVar.getBeginTime();
            this.mDuration = Long.parseLong(hVar.getArg3());
            this.mProperties = hVar.getProperties();
            this.mH5Pv = false;
        }
    }

    public void beginEvent(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca353937", new Object[]{this, hVar});
        } else if (!WalleStreamListener.isStreamProcessingInitialized()) {
        } else {
            this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$rhCHB5B_ZS25AAmEuolBcDzWXuM
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$beginEvent$4$WalleStreamSource(hVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$beginEvent$4$WalleStreamSource(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa833e0a", new Object[]{this, hVar});
            return;
        }
        try {
            nativeBeginEvent(new WalleUtEventJava(hVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "beginEvent", e);
        }
    }

    public void updateEventPageName(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
        } else if (!WalleStreamListener.isStreamProcessingInitialized()) {
        } else {
            this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$DcQK1YRcqz2zKBUkHmANl9lDQYA
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$updateEventPageName$5$WalleStreamSource(hVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$updateEventPageName$5$WalleStreamSource(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45eb5509", new Object[]{this, hVar});
            return;
        }
        try {
            nativeUpdateEventPageName(new WalleUtEventJava(hVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "updateEventPageName", e);
        }
    }

    public void updateEvent(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816a9957", new Object[]{this, hVar});
        } else if (!WalleStreamListener.isStreamProcessingInitialized()) {
        } else {
            this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$b8QiL6gSmGdP6l3QJHNqVOxLUgs
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$updateEvent$6$WalleStreamSource(hVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$updateEvent$6$WalleStreamSource(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7484102", new Object[]{this, hVar});
            return;
        }
        try {
            nativeUpdateEvent(new WalleUtEventJava(hVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "updateEvent", e);
        }
    }

    public void endEvent(final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e15369", new Object[]{this, hVar});
        } else if (!WalleStreamListener.isStreamProcessingInitialized()) {
        } else {
            this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$1nLu9suowBs8zN4OF4l0J-o8-pc
                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$endEvent$7$WalleStreamSource(hVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$endEvent$7$WalleStreamSource(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986f8399", new Object[]{this, hVar});
            return;
        }
        try {
            nativeEndEvent(new WalleUtEventJava(hVar));
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "endEvent", e);
        }
    }

    public void sendEvent(final WalleUtEventJava walleUtEventJava) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ae95f6", new Object[]{this, walleUtEventJava});
        } else if (!WalleStreamListener.isStreamProcessingInitialized()) {
        } else {
            this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$K5FpcWvZCGypuHNKKy2jhRWu2vY
                {
                    WalleStreamSource.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$sendEvent$8$WalleStreamSource(walleUtEventJava);
                }
            });
        }
    }

    public /* synthetic */ void lambda$sendEvent$8$WalleStreamSource(WalleUtEventJava walleUtEventJava) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d25bad", new Object[]{this, walleUtEventJava});
            return;
        }
        try {
            nativeSendEvent(walleUtEventJava);
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "sendEvent", e);
        }
    }

    public void sendEventMap(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed18fd4", new Object[]{this, map});
        } else if (!WalleStreamListener.isStreamProcessingInitialized()) {
        } else {
            this.mSerialExecutor.execute(new Runnable() { // from class: com.tmall.android.dai.internal.streamprocessing.-$$Lambda$WalleStreamSource$psn8k01Q0VSBqfBMNCOxKUZgea8
                {
                    WalleStreamSource.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WalleStreamSource.this.lambda$sendEventMap$9$WalleStreamSource(map);
                }
            });
        }
    }

    public /* synthetic */ void lambda$sendEventMap$9$WalleStreamSource(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f82f202", new Object[]{this, map});
            return;
        }
        try {
            nativeSendEventMap(map);
        } catch (OutOfMemoryError e) {
            LogUtil.e("WalleStreamSource", "sendEventMap", e);
        }
    }
}
