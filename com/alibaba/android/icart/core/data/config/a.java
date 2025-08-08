package com.alibaba.android.icart.core.data.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.ultron.trade.data.request.c;
import com.alibaba.android.ultron.trade.utils.NetType;
import com.alibaba.android.ultron.trade.utils.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.bbz;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(977433781);
    }

    public static c a(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("11f6a94c", new Object[]{bbzVar}) : c.a().b("mtop.trade.query.bag").c(AfcCustomSdk.SDK_VERSION).c(d(bbzVar)).a(false);
    }

    public static c a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5c212d20", new Object[]{str}) : c.a().b("mtop.trade.query.bag").c(AfcCustomSdk.SDK_VERSION).c(b(str)).a(false);
    }

    public static c b(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("cc6c49cd", new Object[]{bbzVar}) : c.a().b("mtop.trade.update.bag").c("4.0").c(d(bbzVar));
    }

    public static c c(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("86e1ea4e", new Object[]{bbzVar}) : c.a().b("mtop.trade.update.structure").c("1.0").c(d(bbzVar));
    }

    private static Map<String, String> d(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("10179856", new Object[]{bbzVar}) : b(bbzVar.v().a());
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extStatus", "0");
        NetType b = e.b(Globals.getApplication());
        if (b != null) {
            hashMap.put("netType", String.valueOf(b.getCode()));
        }
        if (StringUtils.isEmpty(str)) {
            str = QueryParamsManager.DEFAULT_CART_FROM;
        }
        hashMap.put("cartFrom", str);
        hashMap.put("exParams", new JSONObject().toJSONString());
        hashMap.put("isPage", "true");
        return hashMap;
    }
}
