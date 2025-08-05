package com.taobao.android.detail.datasdk.event.sku;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import java.io.Serializable;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class OpenSkuEvent extends enn implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TYPE_MULTI_METHOD_BUY = "multiMethodBuy";
    public static final String BIZ_TYPE_SEND_GIFT = "sendGift";

    /* renamed from: a  reason: collision with root package name */
    public SkuBottomBarStyleDTO f9953a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public SkuPageModel e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean mForceOldSku;

    static {
        kge.a(-1838797384);
        kge.a(1028243835);
    }

    public OpenSkuEvent() {
        this.i = false;
        this.f9953a = SkuBottomBarStyleDTO.ADD_CART_AND_BUY;
        emu.a("com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent");
    }

    public OpenSkuEvent(SkuBottomBarStyleDTO skuBottomBarStyleDTO) {
        this.i = false;
        this.f9953a = skuBottomBarStyleDTO;
        emu.a("com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9953a;
    }
}
