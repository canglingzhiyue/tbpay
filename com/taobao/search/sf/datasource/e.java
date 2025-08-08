package com.taobao.search.sf.datasource;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.refactor.g;
import com.taobao.search.refactor.j;
import com.taobao.search.sf.context.CommonSearchContext;
import java.util.Map;
import tb.imn;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface b {
        j a(boolean z);
    }

    static {
        kge.a(1486707555);
    }

    public static j a(boolean z, CommonSearchContext commonSearchContext, imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("9f7216a7", new Object[]{new Boolean(z), commonSearchContext, imnVar}) : a(z, commonSearchContext, new g(imnVar));
    }

    public static j a(boolean z, CommonSearchContext commonSearchContext, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("62c4db3b", new Object[]{new Boolean(z), commonSearchContext, bVar});
        }
        Map<String, String> paramsSnapshot = commonSearchContext.getParamsSnapshot();
        a a2 = a(paramsSnapshot);
        j a3 = bVar.a(z);
        a3.a(a2);
        if (z) {
            a3.setParams(paramsSnapshot);
            a3.B();
            a3.t();
        } else {
            a3.setParams(commonSearchContext.getOtherTabParams());
        }
        return a3;
    }

    private static a a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a1fa428f", new Object[]{map});
        }
        if (map == null) {
            return a.a();
        }
        String remove = map.remove("apiInfo");
        if (StringUtils.isEmpty(remove)) {
            return a.a();
        }
        try {
            JSONObject parseObject = JSON.parseObject(remove);
            a aVar = new a();
            aVar.f19438a = parseObject.getString("apiName");
            aVar.b = parseObject.getString("apiVersion");
            aVar.c = "wsearch";
            return aVar;
        } catch (Exception unused) {
            return a.a();
        }
    }
}
