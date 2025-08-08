package tb;

import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.o;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class adi extends aen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1828574474);
    }

    public static /* synthetic */ Object ipc$super(adi adiVar, String str, Object... objArr) {
        if (str.hashCode() == 1371200915) {
            return super.b((IWVWebView) objArr[0], (String) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.aen
    public o b(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("51badd93", new Object[]{this, iWVWebView, str});
        }
        if (m.a()) {
            m.b("WVSecurityFilter", "WVSecurityFilter shouldInterceptRequest url =" + str);
        }
        if (!StringUtils.isEmpty(str) && str.length() > 6 && str.substring(0, 7).toLowerCase().startsWith("file://")) {
            return new o("", "utf-8", null, null);
        }
        return super.b(iWVWebView, str);
    }
}
