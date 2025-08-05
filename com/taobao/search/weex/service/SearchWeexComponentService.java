package com.taobao.search.weex.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.weex.component.InShopSearchComponent;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.component.WXComponent;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchWeexComponentService extends Service implements IExternalComponentGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String WX_SHOP_AUCTION_LIST = "shopAuctionList";

    static {
        kge.a(-297007371);
        kge.a(827327188);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // com.taobao.weex.ui.IExternalComponentGetter
    public Class<? extends WXComponent> getExternalComponentClass(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("464bab4e", new Object[]{this, str, wXSDKInstance});
        }
        char c = 65535;
        if (str.hashCode() == 979280043 && str.equals(WX_SHOP_AUCTION_LIST)) {
            c = 0;
        }
        if (c == 0) {
            return InShopSearchComponent.class;
        }
        return null;
    }
}
