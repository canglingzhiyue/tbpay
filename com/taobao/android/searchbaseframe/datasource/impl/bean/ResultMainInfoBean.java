package com.taobao.android.searchbaseframe.datasource.impl.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.weex_framework.util.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.imn;
import tb.imo;
import tb.iuc;
import tb.kge;

/* loaded from: classes6.dex */
public class ResultMainInfoBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String abtest;
    public boolean finish;
    public String keyword;
    public ResultLayoutInfoBean layoutInfo;
    public JSONArray originalPageTraceArgs;
    public String pageName;
    public Map<String, String> pageTraceArgs;
    public String pageTraceName;
    public String pageType;
    public String rn;
    public String sessionid;
    public float wfgap;
    public ListStyle style = ListStyle.LIST;
    public int totalResult = 1000;
    public int totalPage = 0;
    public int page = 0;
    public int pageSize = 10;
    public int column = 0;

    static {
        kge.a(316755936);
        kge.a(1028243835);
    }

    public static ResultMainInfoBean parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultMainInfoBean) ipChange.ipc$dispatch("5afb046f", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        parseBaseInfo(resultMainInfoBean, jSONObject);
        parseLayout(resultMainInfoBean, jSONObject);
        return resultMainInfoBean;
    }

    public static void parseBaseInfo(ResultMainInfoBean resultMainInfoBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7a22a8", new Object[]{resultMainInfoBean, jSONObject});
            return;
        }
        resultMainInfoBean.style = ListStyle.fromString(jSONObject.getString("style"));
        resultMainInfoBean.totalResult = jSONObject.getIntValue("totalResults");
        resultMainInfoBean.totalPage = jSONObject.getIntValue("totalPage");
        resultMainInfoBean.sessionid = jSONObject.getString("sessionid");
        imn b = imo.b();
        if (b != null && b.c().j().n) {
            resultMainInfoBean.page = g.b(jSONObject.getString("page"), 1);
        } else {
            resultMainInfoBean.page = jSONObject.getIntValue("page");
        }
        resultMainInfoBean.wfgap = iuc.a(jSONObject.getString("wfgap"), -1.0f);
        resultMainInfoBean.pageName = jSONObject.getString("pageName");
        resultMainInfoBean.pageTraceName = jSONObject.getString("pageTraceName");
        JSONArray jSONArray = jSONObject.getJSONArray("pageTraceArgs");
        resultMainInfoBean.originalPageTraceArgs = jSONArray;
        resultMainInfoBean.pageTraceArgs = parseTraceArgs(jSONArray);
        resultMainInfoBean.abtest = jSONObject.getString(TBSearchChiTuJSBridge.ABTEST);
        resultMainInfoBean.keyword = jSONObject.getString("paramValue");
        resultMainInfoBean.finish = jSONObject.getBooleanValue("finished");
        resultMainInfoBean.rn = jSONObject.getString("RN");
        resultMainInfoBean.pageType = jSONObject.getString("pageType");
        int intValue = jSONObject.getIntValue("pageSize");
        if (intValue <= 0) {
            intValue = resultMainInfoBean.pageSize;
        }
        resultMainInfoBean.pageSize = intValue;
        if (jSONObject.containsKey(a.ATOM_EXT_column)) {
            i = jSONObject.getIntValue(a.ATOM_EXT_column);
        }
        resultMainInfoBean.column = i;
    }

    public static Map<String, String> parseTraceArgs(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f558e33", new Object[]{jSONArray});
        }
        if (jSONArray == null || jSONArray.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                hashMap.put(jSONObject.getString("key"), jSONObject.getString("value"));
            }
        }
        return hashMap;
    }

    public static void parseLayout(ResultMainInfoBean resultMainInfoBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cb713d", new Object[]{resultMainInfoBean, jSONObject});
            return;
        }
        ResultLayoutInfoBean parse = ResultLayoutInfoBean.parse(jSONObject.getJSONObject("layoutInfo"));
        if (parse == null) {
            parse = ResultLayoutInfoBean.createDefualt();
        }
        resultMainInfoBean.layoutInfo = parse;
    }

    public static ResultMainInfoBean createDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultMainInfoBean) ipChange.ipc$dispatch("81865f79", new Object[0]);
        }
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        resultMainInfoBean.layoutInfo = ResultLayoutInfoBean.createDefualt();
        return resultMainInfoBean;
    }
}
