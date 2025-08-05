package com.taobao.search.sf.widgets.searchbar;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchBarTagBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String description;
    private Map<String, String> params;
    private String q;
    private String showKeyword;
    private String type;

    static {
        kge.a(675632651);
        kge.a(1028243835);
    }

    public String getShowKeyword() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b86689c3", new Object[]{this}) : this.showKeyword;
    }

    public void setShowKeyword(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c21dd7b", new Object[]{this, str});
        } else {
            this.showKeyword = str;
        }
    }

    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this}) : this.params;
    }

    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else {
            this.params = map;
        }
    }

    public String getQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8221061e", new Object[]{this}) : this.q;
    }

    public void setQ(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf02d80", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public String getDescription() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this}) : this.description;
    }

    public void setDescription(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e6b14b", new Object[]{this, str});
        } else {
            this.description = str;
        }
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public SearchBarTagBean(String str, String str2, Map<String, String> map, String str3, String str4) {
        this.showKeyword = str;
        this.params = map;
        this.q = str2;
        this.description = str3;
        this.type = str4;
    }

    public static SearchBarTagBean fromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarTagBean) ipChange.ipc$dispatch("9005775d", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        String string = jSONObject.getString("showKeyword");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
        String string2 = jSONObject.getString("q");
        if ((b == null || b.isEmpty()) && TextUtils.isEmpty(string2)) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (b != null) {
            for (String str : b.keySet()) {
                String string3 = b.getString(str);
                if (!TextUtils.isEmpty(string3)) {
                    arrayMap.put(str, string3);
                }
            }
        }
        String string4 = jSONObject.getString("type");
        if (!TextUtils.equals(string4, "update")) {
            string4 = "append";
        }
        return new SearchBarTagBean(string, string2, arrayMap, jSONObject.getString("description"), string4);
    }
}
