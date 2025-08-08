package com.taobao.android.trade.cart.provider.msoa;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.TaoHelper;
import com.taobao.wireless.trade.mcart.sdk.co.mtop.MtopTradeAddBagRequest;
import java.io.Serializable;
import tb.acg;
import tb.kge;
import tb.rkm;

/* loaded from: classes6.dex */
public class MsoaCartServiceImpl implements MsoaCartService, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1020516365);
        kge.a(-184278221);
        kge.a(1028243835);
    }

    @Override // com.taobao.android.trade.cart.provider.msoa.MsoaCartService
    public void addCartBag(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2461888", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        if (StringUtils.isEmpty(str8)) {
            str8 = TaoHelper.getTTID();
        }
        if (StringUtils.isEmpty(str9)) {
            str9 = "97";
        }
        long j = 0;
        try {
            j = Long.parseLong(str4);
            i = Integer.parseInt(str9);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        MtopTradeAddBagRequest mtopTradeAddBagRequest = new MtopTradeAddBagRequest();
        mtopTradeAddBagRequest.setItemId(str2);
        mtopTradeAddBagRequest.setSkuId(str3);
        mtopTradeAddBagRequest.setQuantity(j);
        mtopTradeAddBagRequest.setExParams(str5);
        mtopTradeAddBagRequest.setFeature(str6);
        mtopTradeAddBagRequest.setCartFrom(str7);
        new rkm().a(mtopTradeAddBagRequest, (IRemoteBaseListener) new RemoteListener(str), acg.a().getApplicationContext(), str8, i);
    }
}
