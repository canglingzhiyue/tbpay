package com.taobao.weex.common;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.tools.LogDetail;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes.dex */
public class WXThread extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;

    static {
        kge.a(1356250260);
    }

    public static /* synthetic */ Object ipc$super(WXThread wXThread, String str, Object... objArr) {
        if (str.hashCode() == -1052580006) {
            return new Boolean(super.quit());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes.dex */
    public static class SafeRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "SafeRunnable";
        private WeakReference<WXSDKInstance> mInstance;
        public final Runnable mTask;
        private LogDetail mTimelineLog;

        static {
            kge.a(745384954);
            kge.a(-1390502639);
        }

        public SafeRunnable(Runnable runnable) {
            this(runnable, null);
        }

        public SafeRunnable(Runnable runnable, String str) {
            this(runnable, null, str);
        }

        public SafeRunnable(Runnable runnable, WXSDKInstance wXSDKInstance, String str) {
            this.mTimelineLog = null;
            this.mTask = runnable;
            if (str != null) {
                this.mTimelineLog = new LogDetail();
                this.mTimelineLog.info.platform = "Android";
                this.mTimelineLog.name(str);
                this.mInstance = new WeakReference<>(wXSDKInstance);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<WXSDKInstance> weakReference;
            WXSDKInstance wXSDKInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.mTask != null) {
                    if (this.mTimelineLog != null) {
                        this.mTimelineLog.taskStart();
                    }
                    this.mTask.run();
                    if (this.mTimelineLog != null) {
                        this.mTimelineLog.taskEnd();
                    }
                }
            } catch (Throwable th) {
                if (WXEnvironment.isApkDebugable()) {
                    WXLogUtils.e(TAG, "SafeRunnable run throw expection:" + th.getMessage());
                    throw th;
                }
                WXLogUtils.w(TAG, th);
            }
            if (this.mTimelineLog == null || (weakReference = this.mInstance) == null || (wXSDKInstance = weakReference.get()) == null) {
                return;
            }
            wXSDKInstance.s.addLog(this.mTimelineLog);
        }
    }

    /* loaded from: classes.dex */
    public static class SafeCallback implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "SafeCallback";
        public final Handler.Callback mCallback;

        static {
            kge.a(-256247518);
            kge.a(-1043440182);
        }

        public SafeCallback(Handler.Callback callback) {
            this.mCallback = callback;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            boolean isApkDebugable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            try {
                if (this.mCallback == null) {
                    return false;
                }
                return this.mCallback.handleMessage(message);
            } finally {
                if (!isApkDebugable) {
                }
            }
        }
    }

    public static Runnable secure(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("a095c018", new Object[]{runnable}) : secure(runnable, null, null);
    }

    public static Runnable secure(Runnable runnable, WXSDKInstance wXSDKInstance, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("340f8458", new Object[]{runnable, wXSDKInstance, str}) : (runnable == null || (runnable instanceof SafeRunnable)) ? runnable : new SafeRunnable(runnable, wXSDKInstance, str);
    }

    public static Handler.Callback secure(Handler.Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler.Callback) ipChange.ipc$dispatch("f5070da0", new Object[]{callback}) : (callback == null || (callback instanceof SafeCallback)) ? callback : new SafeCallback(callback);
    }

    public WXThread(String str) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public WXThread(String str, Handler.Callback callback) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper(), secure(callback));
    }

    public WXThread(String str, int i, Handler.Callback callback) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper(), secure(callback));
    }

    public WXThread(String str, int i) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this}) : this.mHandler;
    }

    public boolean isWXThreadAlive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eaf746e3", new Object[]{this})).booleanValue() : (this.mHandler == null || getLooper() == null || !isAlive()) ? false : true;
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return super.quit();
    }
}
