package tb;

import android.content.Context;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ak;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;

@AURAExtensionImpl(code = "picGallery.impl.event.updateSKU")
/* loaded from: classes4.dex */
public final class ejw extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1491433369);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : ak.EVENT_TYPE;
    }

    public ejw() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.events.PicGalleryUpdateSKUEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        Event a2;
        d a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        Context e = b().e();
        if (!(e instanceof DetailCoreActivity) || (a2 = com.taobao.android.detail.core.aura.utils.d.a((DetailCoreActivity) e, aURAEventIO, com.taobao.android.detail.core.aura.utils.d.ROUTE_TABLE)) == null || (a3 = f.a(e)) == null) {
            return;
        }
        a3.a(a2);
    }
}
