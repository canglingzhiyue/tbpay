package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.w;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;

@AURAExtensionImpl(code = "picGallery.impl.event.openSKU")
/* loaded from: classes4.dex */
public final class eju extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-366951206);
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : w.EVENT_TYPE_ALTERNATIVE;
    }

    public eju() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.events.PicGalleryOpenSKUEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        d a2 = f.a(b().e());
        if (a2 == null) {
            return;
        }
        a2.a(new OpenSkuEvent(SkuBottomBarStyleDTO.ADD_CART_AND_BUY));
    }
}
