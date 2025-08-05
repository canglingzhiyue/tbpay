package tb;

import android.content.Context;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.b;

@AURAExtensionImpl(code = "tbwaitpay.impl.event.refresh")
/* loaded from: classes6.dex */
public final class jth extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1101986917);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "refresh";
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Context e = b().e();
        if (!(e instanceof b)) {
            return;
        }
        ((b) e).refreshPage(true);
    }
}
