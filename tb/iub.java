package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.bridge.TryDecisionPassParam;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.b;
import com.taobao.android.searchbaseframe.util.r;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class iub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1715215212);
    }

    public static Map<String, TemplateBean> a(JSONArray jSONArray, imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("929e47ab", new Object[]{jSONArray, imnVar}) : a(jSONArray, null, imnVar);
    }

    public static Map<String, TemplateBean> a(JSONArray jSONArray, ioz iozVar, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d8179487", new Object[]{jSONArray, iozVar, imnVar});
        }
        if (jSONArray == null) {
            imnVar.b().f("wx.TemplateConfigParser", "模板数组为空");
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            TemplateBean a2 = a(imnVar, jSONArray.getJSONObject(i));
            if (a2 != null) {
                sb.append(a2.templateName);
                sb.append("/");
                hashMap.put(a2.templateName, a2);
            }
        }
        if (iozVar != null) {
            iozVar.f29197a = sb.toString();
        }
        return hashMap;
    }

    public static TemplateBean a(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("da6adbae", new Object[]{imnVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        TemplateBean templateBean = new TemplateBean();
        templateBean.templateName = jSONObject.getString("templateName");
        templateBean.dItemType = jSONObject.getString("dItemType");
        templateBean.version = jSONObject.getString("version");
        templateBean.isGray = jSONObject.getString("isGray");
        String string = jSONObject.getString("url");
        String string2 = jSONObject.getString("lt_url");
        boolean z2 = TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2);
        if (imnVar.c().j().c) {
            templateBean.forceDownload = true;
        }
        if (z2) {
            string = string2;
        }
        templateBean.url = string;
        templateBean.md5 = jSONObject.getString(z2 ? "lt_md5" : "md5");
        templateBean.listHeight = iuc.b(jSONObject.getString("listHeight"));
        templateBean.midHeight = iuc.b(jSONObject.getString("midHeight"));
        JSONArray jSONArray = jSONObject.getJSONArray("supportedStyle");
        if (jSONArray != null && jSONArray.size() > 0) {
            templateBean.supportedStyle = new int[jSONArray.size()];
            for (int i = 0; i < templateBean.supportedStyle.length; i++) {
                templateBean.supportedStyle[i] = jSONArray.getIntValue(i);
            }
        }
        templateBean.required = b.a(jSONObject, TryDecisionPassParam.REQUIRED, 0);
        String b = r.b(templateBean.url);
        Map<String, String> a2 = r.a(templateBean.url);
        if (b != null && (b.endsWith(".wlasm") || b.endsWith(".wlm"))) {
            z = true;
        }
        templateBean.binary = z;
        if (TextUtils.equals("1", a2.get("__cell_for_layout"))) {
            templateBean.cellBinary = true;
        }
        iua iuaVar = imnVar.c().j().v;
        if (iuaVar != null) {
            iuaVar.a(templateBean);
        }
        return templateBean;
    }
}
