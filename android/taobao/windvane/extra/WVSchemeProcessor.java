package android.taobao.windvane.extra;

import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.k;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.StrategyCenter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ado;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVSchemeProcessor implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1551205131);
        kge.a(1892164776);
    }

    @Override // android.taobao.windvane.webview.k
    public String dealUrlScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849ca447", new Object[]{this, str});
        }
        try {
            if (!StringUtils.isEmpty(str) && !str.startsWith("javascript:") && !str.equals("about:blank")) {
                String formalizeUrl = StrategyCenter.getInstance().getFormalizeUrl(str);
                m.e("Processor", "WVSchemeProcesor deal url, origin_url=[" + str + "], new_url=[" + formalizeUrl + riy.ARRAY_END_STR);
                return StringUtils.isEmpty(formalizeUrl) ? str : formalizeUrl;
            }
            return str;
        } catch (Throwable unused) {
            m.e("WVSchemeProcessor", "Can not dealUrlScheme : " + str);
            return str.startsWith(ado.URL_SEPARATOR) ? str.replaceFirst(ado.URL_SEPARATOR, com.taobao.search.common.util.k.HTTP_PREFIX) : str;
        }
    }
}
