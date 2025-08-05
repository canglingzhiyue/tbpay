package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.event.pop")
/* loaded from: classes2.dex */
public final class axf extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1725185159);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "pop";
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else {
            fke.a(b().e());
        }
    }
}
