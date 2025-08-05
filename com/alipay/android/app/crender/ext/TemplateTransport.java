package com.alipay.android.app.crender.ext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.api.ITplTransport;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.msp.framework.exception.PublicKeyException;
import com.alipay.android.msp.network.PackUtils;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class TemplateTransport implements ITplTransport {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.app.cctemplate.api.ITplTransport
    public List<String> querySyncTpls(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed16b830", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.android.app.cctemplate.api.ITplTransport
    public List<String> fetchTemplates(Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de15a048", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject2.put(str, (Object) map.get(str));
            }
            jSONObject.put("tplids", (Object) jSONObject2);
            jSONObject.put("tplver", (Object) TemplateService.getBirdNestVersion());
        }
        return a(jSONObject.toString(), true);
    }

    private static ArrayList<String> a(String str, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a0e98bbc", new Object[]{str, new Boolean(z)});
        }
        while (true) {
            RequestConfig requestConfig = new RequestConfig(RequestConfig.RequestChannel.BYTES_CASHIER);
            requestConfig.setMethod("get");
            requestConfig.setType("tpl");
            ResData<byte[]> requestData = PluginManager.getTransChannel().requestData(new ReqData<>(PackUtils.packTplRequestData(str, requestConfig)), requestConfig);
            requestConfig.setmResponseHeaderGzipFlag(Boolean.valueOf(requestData.getHeader("msp-gzip")).booleanValue());
            try {
                String unpackBytesResponseData = PackUtils.unpackBytesResponseData(requestData.toBytesData(), requestConfig);
                ArrayList<String> arrayList = new ArrayList<>();
                JSONObject parseObject = JSON.parseObject(unpackBytesResponseData);
                if (parseObject.containsKey("tpls")) {
                    JSONArray jSONArray = parseObject.getJSONArray("tpls");
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                }
                return arrayList;
            } catch (PublicKeyException unused) {
                if (!z) {
                    return null;
                }
                z = false;
            }
        }
    }
}
