package com.taobao.android.trade.cart.provider;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cart.api.ITBCartService;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.TaoHelper;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagRequest;
import java.io.Serializable;
import tb.kge;
import tb.rkm;

/* loaded from: classes6.dex */
public class TBCartServiceImpl implements ITBCartService, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-924363014);
        kge.a(-1998904625);
        kge.a(1028243835);
    }

    @Override // com.taobao.cart.api.ITBCartService
    public void addBag(String str, String str2, long j, String str3, String str4, String str5, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9aff28", new Object[]{this, str, str2, new Long(j), str3, str4, str5, context});
            return;
        }
        rkm rkmVar = new rkm();
        MtopTradeAddBagRequest mtopTradeAddBagRequest = new MtopTradeAddBagRequest();
        mtopTradeAddBagRequest.setItemId(str2);
        mtopTradeAddBagRequest.setSkuId(str3);
        mtopTradeAddBagRequest.setQuantity(j);
        mtopTradeAddBagRequest.setExParams(str4);
        mtopTradeAddBagRequest.setCartFrom(str5);
        RemoteListener2 remoteListener2 = new RemoteListener2(str);
        if (context == null) {
            context = Globals.getApplication() == null ? null : Globals.getApplication().getApplicationContext();
        }
        Context context2 = context;
        if (context2 == null) {
            return;
        }
        rkmVar.a(mtopTradeAddBagRequest, (IRemoteBaseListener) remoteListener2, context2, TaoHelper.getTTID(), 97);
    }
}
