package com.taobao.oversea.baobao;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TMGBaobaoBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DETAIL_CODE_KEY = "detailBizCountry";
    public static final Map<String, WeakReference<IWVWebView>> mWebViewMap = new HashMap();

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("initBaobaoManager".equals(str)) {
            try {
                mWebViewMap.put(String.valueOf(wVCallBackContext.getWebview().hashCode()), new WeakReference<>(wVCallBackContext.getWebview()));
                if (BaobaoManager.a().b()) {
                    HashMap<String, Object> i = BaobaoManager.a().i();
                    r rVar = new r();
                    JSONObject jSONObject = new JSONObject();
                    for (String str3 : i.keySet()) {
                        jSONObject.put(str3, String.valueOf(i.get(str3)));
                    }
                    rVar.a(jSONObject);
                    Map map = (Map) JSON.parseObject(str2, new TypeReference<HashMap<String, String>>() { // from class: com.taobao.oversea.baobao.TMGBaobaoBridge.1
                    }, new Feature[0]);
                    if (map.get(DETAIL_CODE_KEY) != null) {
                        BaobaoManager.f18619a = (String) map.get(DETAIL_CODE_KEY);
                    }
                    rVar.b();
                    wVCallBackContext.success(rVar);
                } else {
                    wVCallBackContext.error(r.RET_FAIL);
                }
                return true;
            } catch (Exception unused) {
                wVCallBackContext.error(r.RET_FAIL);
            }
        }
        return false;
    }
}
