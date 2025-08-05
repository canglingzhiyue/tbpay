package android.taobao.windvane.jsbridge;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVAppEvent extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-456111407);
    }

    public static /* synthetic */ Object ipc$super(WVAppEvent wVAppEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.mWebView.fireEvent("WV.Event.APP.Background", "{}");
        if (android.taobao.windvane.monitor.o.getPerformanceMonitor() != null) {
            android.taobao.windvane.monitor.o.getPerformanceMonitor().didExitAtTime(this.mWebView.getUrl(), System.currentTimeMillis());
        }
        super.onPause();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        String dataOnActive = this.mWebView.getDataOnActive();
        if (TextUtils.isEmpty(dataOnActive)) {
            dataOnActive = "{}";
        }
        this.mWebView.fireEvent("WV.Event.APP.Active", dataOnActive);
        this.mWebView.setDataOnActive(null);
    }
}
