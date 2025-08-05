package android.taobao.windvane.extra.uc;

import android.taobao.windvane.config.j;
import android.taobao.windvane.util.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.uc.webview.base.klog.ILogger;
import tb.adj;
import tb.kge;

/* loaded from: classes2.dex */
public class UCLog extends ILogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG;
    private static final String MODULE = "WindVane";
    private static final String TAG = "UCLog";
    private static volatile boolean isInit;
    private final adj mSpanWrapper = new adj();

    /* loaded from: classes2.dex */
    public static final class Holder {
        public static final UCLog sInstance;

        static {
            kge.a(-1530001160);
            sInstance = new UCLog();
        }

        private Holder() {
        }
    }

    public static /* synthetic */ Object ipc$super(UCLog uCLog, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(122666744);
        DEBUG = e.b();
        isInit = false;
    }

    public static final UCLog getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UCLog) ipChange.ipc$dispatch("9a6d2e3b", new Object[0]) : Holder.sInstance;
    }

    public boolean isInited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue() : isInit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(boolean r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.UCLog.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r6)
            r1[r2] = r3
            java.lang.String r6 = "edcf041d"
            r0.ipc$dispatch(r6, r1)
            return
        L1a:
            java.lang.String r0 = "UCLog"
            if (r6 != 0) goto L27
            boolean r6 = android.taobao.windvane.extra.uc.UCLog.DEBUG     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L23
            goto L27
        L23:
            r6 = 0
            goto L28
        L25:
            r6 = move-exception
            goto L46
        L27:
            r6 = 1
        L28:
            java.lang.String r1 = com.uc.webview.export.extension.SettingKeys.EnableKLog     // Catch: java.lang.Throwable -> L25
            com.uc.webview.export.extension.GlobalSettings.set(r1, r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = com.uc.webview.export.extension.SettingKeys.SdkEnableLogToLogCat     // Catch: java.lang.Throwable -> L25
            boolean r4 = android.taobao.windvane.extra.uc.UCLog.DEBUG     // Catch: java.lang.Throwable -> L25
            com.uc.webview.export.extension.GlobalSettings.set(r1, r4)     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L38
            r6 = r5
            goto L39
        L38:
            r6 = 0
        L39:
            com.uc.webview.base.klog.ILogger.Instance.set(r6)     // Catch: java.lang.Throwable -> L25
            android.taobao.windvane.extra.uc.UCLog.isInit = r2     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "WindVane"
            java.lang.String r1 = "init success"
            com.taobao.tao.log.TLog.loge(r6, r0, r1)     // Catch: java.lang.Throwable -> L25
            return
        L46:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "init fail"
            android.taobao.windvane.util.m.b(r0, r2, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.UCLog.init(boolean):void");
    }

    public adj getSpanWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (adj) ipChange.ipc$dispatch("7c5935c5", new Object[]{this}) : this.mSpanWrapper;
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec3ad6", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void i(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662468f1", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    @Override // com.uc.webview.base.klog.ILogger
    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            log(str, str2, th);
        }
    }

    private void log(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf83f6", new Object[]{this, str, str2, th});
        } else if (!j.commonConfig.cN) {
        } else {
            if (th == null) {
                TLog.loge("WindVane", str, str2);
            } else {
                TLog.loge("WindVane", str, str2, th);
            }
        }
    }
}
