package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.uc.interfaces.INetworkDecider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AliNetworkDecider implements INetworkDecider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1404500164);
        kge.a(-45468914);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetworkDecider
    public int chooseNetwork(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1abc35b", new Object[]{this, str})).intValue() : (str.startsWith("ws://") || str.startsWith("wss://") || !WVUCWebView.getUseTaobaoNetwork()) ? 0 : 2;
    }
}
