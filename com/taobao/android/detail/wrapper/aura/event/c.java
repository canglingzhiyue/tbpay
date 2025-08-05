package com.taobao.android.detail.wrapper.aura.event;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import tb.arv;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.openSKU")
/* loaded from: classes5.dex */
public final class c extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openSKU";

    static {
        kge.a(1166672732);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openSKU";
    }

    public c() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailOpenSKUEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (!(b().e() instanceof DetailCoreActivity) || aURAEventIO.getEventModel().d() == null) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) b().e();
            if (detailCoreActivity != null) {
                detailCoreActivity.f = System.currentTimeMillis();
                detailCoreActivity.g = "skuBar";
            }
            new com.taobao.android.detail.wrapper.ext.event.subscriber.sku.d(detailCoreActivity).a(new OpenSkuEvent(c(aURAEventIO)));
        }
    }

    private SkuBottomBarStyleDTO c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuBottomBarStyleDTO) ipChange.ipc$dispatch("3ad5d8e4", new Object[]{this, aURAEventIO});
        }
        SkuBottomBarStyleDTO skuBottomBarStyleDTO = SkuBottomBarStyleDTO.ADD_CART_AND_BUY;
        if (aURAEventIO == null || aURAEventIO.getEventModel() == null || aURAEventIO.getEventModel().c() == null || aURAEventIO.getEventModel().c().getJSONObject("params") == null) {
            return skuBottomBarStyleDTO;
        }
        String string = aURAEventIO.getEventModel().c().getJSONObject("params").getString("skuBottomMode");
        if ("ADDCART".equals(string)) {
            return SkuBottomBarStyleDTO.CONFIRM_ADD_CART;
        }
        if ("BUYNOW".equals(string)) {
            return SkuBottomBarStyleDTO.CONFIRM_BUY;
        }
        return "ADDCART_AND_BUYNOW".equals(string) ? SkuBottomBarStyleDTO.ADD_CART_AND_BUY : skuBottomBarStyleDTO;
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
