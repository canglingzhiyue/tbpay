package com.taobao.android.detail2.core.framework;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.fkt;
import tb.kge;

/* loaded from: classes5.dex */
public class h implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1910454365);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "NewDetailShareNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri.Builder authority;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!data.getBooleanQueryParameter("hybrid_nd", false)) {
                return true;
            }
            String queryParameter = data.getQueryParameter("shareNDParams");
            if (StringUtils.isEmpty(queryParameter)) {
                return true;
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = JSON.parseObject(Uri.decode(queryParameter));
            } catch (Exception e) {
                com.taobao.android.detail.core.utils.i.a("NewDetailShareNavProcessor", "parse shareNDParams error" + e);
            }
            if (jSONObject != null && !jSONObject.isEmpty()) {
                if (data.getBooleanQueryParameter("native_liteDetail", false)) {
                    authority = new Uri.Builder().scheme("https").authority("litedetail.taobao.com");
                } else {
                    authority = new Uri.Builder().scheme("https").authority("newdetail.taobao.com");
                }
                fkt.a();
                if (fkt.R()) {
                    List<String> O = fkt.O();
                    for (String str : data.getQueryParameterNames()) {
                        if (!O.contains(str) && !jSONObject.containsKey(str)) {
                            authority.appendQueryParameter(str, data.getQueryParameter(str));
                        }
                    }
                }
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    if (entry != null) {
                        authority.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                intent.setData(authority.build());
            }
        }
        return true;
    }
}
