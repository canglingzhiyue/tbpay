package com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.alz;
import tb.kge;

/* loaded from: classes2.dex */
public class WVTradeZCacheJSBridgePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACTION_PREFETCH = "prefetch";
    private static final Map<String, Integer> bizMap;

    static {
        kge.a(-150787736);
        HashMap hashMap = new HashMap();
        bizMap = hashMap;
        hashMap.put("all", 0);
        bizMap.put("cart", 1);
        bizMap.put("purchase", 2);
        bizMap.put(alz.BizKeyOrderList, 3);
        bizMap.put(alz.BizKeyOrderDetail, 4);
        bizMap.put(alz.BizKeyRefund, 5);
        bizMap.put("sku", 6);
        bizMap.put("newbuy", 7);
        bizMap.put(alz.BizKeyPaysuccess, 8);
        bizMap.put("mytaobao", 9);
        bizMap.put("detail", 10);
        bizMap.put(alz.BizKeyLivegoods, 11);
        bizMap.put("NewDetail", 12);
        bizMap.put(alz.BizKeyRefundDetail, 13);
        bizMap.put(alz.BizKeyPackageList, 14);
        bizMap.put("message", 15);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"prefetch".equals(str) || (num = bizMap.get(JSON.parseObject(str2).getString("bizType"))) == null) {
            return false;
        }
        a.a(num.intValue());
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        return true;
    }
}
