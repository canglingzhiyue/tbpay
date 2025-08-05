package android.taobao.windvane.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class h implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1312796615);
        kge.a(-177738061);
    }

    @Override // android.taobao.windvane.monitor.g
    public void didCallAtURL(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c0524", new Object[]{this, str, str2, str3});
        }
    }

    @Override // android.taobao.windvane.monitor.g
    public void didCallBackAtURL(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf57247", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // android.taobao.windvane.monitor.g
    public void didOccurError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22f0c8a", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // android.taobao.windvane.monitor.g
    public void onJsBridgeReturn(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5ad7ba", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            a.commitJsBridgeReturn(str, str3, str4, str5);
        }
    }

    @Override // android.taobao.windvane.monitor.g
    public void commitParamParseError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1775567a", new Object[]{this, str, str2, str3, str4});
        } else {
            a.commitParamParseError(str, str2, str3, str4);
        }
    }
}
