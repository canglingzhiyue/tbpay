package com.taobao.android.detail.core.request.cart;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AddBagRequestParams extends com.taobao.android.detail.core.request.a implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_AREA_ID = "divisionId";
    private static final String K_SERVICE_ID = "serviceId";
    public final String cartFrom;
    private final transient String divisionId;
    public final String exParams;
    public final String itemId;
    public final String quantity;
    private final transient String serviceId;
    public final String skuId;

    static {
        kge.a(-1556059644);
        kge.a(1028243835);
    }

    public AddBagRequestParams(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this(str, str2, str3, str4, str5, null, map);
    }

    public AddBagRequestParams(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.itemId = str;
        this.skuId = str2;
        this.quantity = str3;
        this.serviceId = str4;
        this.divisionId = str5;
        this.cartFrom = StringUtils.isEmpty(str6) ? QueryParamsManager.DEFAULT_CART_FROM : str6;
        this.exParams = constructExParams(map);
        emu.a("com.taobao.android.detail.core.request.cart.AddBagRequestParams");
    }

    private String constructExParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("761db552", new Object[]{this, map});
        }
        map.put("serviceId", this.serviceId);
        map.put(K_AREA_ID, this.divisionId);
        return JSONObject.toJSONString(map);
    }
}
