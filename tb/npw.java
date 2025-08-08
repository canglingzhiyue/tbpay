package tb;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.d;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintADBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintStructuredBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class npw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1905029676);
    }

    public static ArrayMap<String, SearchBarHintBean> a(JSONObject jSONObject, String str) {
        SearchBarHintBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("915ad866", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            q.b("SearchHintParserHelper", "activateSearchHintJson is null");
            return null;
        }
        ArrayMap<String, SearchBarHintBean> arrayMap = new ArrayMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!StringUtils.isEmpty(next) && (a2 = a(jSONObject.optJSONObject(next))) != null) {
                a2.suggestRn = str;
                arrayMap.put(next, a2);
            }
        }
        return arrayMap;
    }

    private static SearchBarHintBean a(JSONObject jSONObject) {
        com.alibaba.fastjson.JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintBean) ipChange.ipc$dispatch("f729c01", new Object[]{jSONObject});
        }
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            q.g("SearchHintParserHelper", "searchHintJson is null");
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!StringUtils.isEmpty(next)) {
                String trim = jSONObject.optString(next, "").trim();
                if (!StringUtils.isEmpty(trim)) {
                    hashMap.put(next, trim);
                }
            }
        }
        SearchBarHintBean searchBarHintBean = new SearchBarHintBean();
        searchBarHintBean.displayText = (String) hashMap.remove("displayText");
        searchBarHintBean.searchText = (String) hashMap.remove("searchText");
        searchBarHintBean.voiceText = (String) hashMap.remove("voiceText");
        searchBarHintBean.voiceColor = (String) hashMap.remove("voiceColor");
        searchBarHintBean.voiceMask = (String) hashMap.remove("voiceMask");
        searchBarHintBean.suggestRn = (String) hashMap.remove(k.KEY_SUGGEST_RN);
        searchBarHintBean.aac = (String) hashMap.remove("aac");
        searchBarHintBean.iconUrl = (String) hashMap.remove("iconUrl");
        searchBarHintBean.iconName = (String) hashMap.remove(ChangeAppIconBridge.KEY_ICONNAME);
        searchBarHintBean.iconWidth = d.b((String) hashMap.remove("iconWidth"), 0);
        searchBarHintBean.iconHeight = d.b((String) hashMap.remove("iconHeight"), 0);
        String str = (String) hashMap.remove("advInfo");
        if (!StringUtils.isEmpty(str)) {
            try {
                searchBarHintBean.advInfo = SearchBarHintADBean.parseADInfo(JSON.parseObject(str));
            } catch (Exception unused) {
                searchBarHintBean.advInfo = null;
            }
        }
        String str2 = (String) hashMap.remove("structuredHintInfo");
        if (!StringUtils.isEmpty(str2)) {
            try {
                searchBarHintBean.structuredInfo = SearchBarHintStructuredBean.parseStructuredInfo(JSON.parseObject(str2));
            } catch (Exception unused2) {
                searchBarHintBean.structuredInfo = null;
            }
        }
        String str3 = (String) hashMap.remove("atmos");
        if (!StringUtils.isEmpty(str3)) {
            try {
                com.alibaba.fastjson.JSONObject parseObject2 = JSON.parseObject(str3);
                searchBarHintBean.atmosImg = parseObject2.getString("boxAtmosImgForsearch");
                searchBarHintBean.darkAtmosImg = parseObject2.getString("darkBoxAtmosImgForsearch");
            } catch (Throwable unused3) {
            }
        }
        String str4 = (String) hashMap.remove("utParams");
        if (!StringUtils.isEmpty(str4)) {
            try {
                searchBarHintBean.utParams = a.a(JSON.parseObject(str4));
            } catch (Exception unused4) {
                searchBarHintBean.utParams = null;
            }
        }
        String str5 = (String) hashMap.remove("searchparams");
        if (!StringUtils.isEmpty(str5)) {
            searchBarHintBean.extraParams = new HashMap<>();
            try {
                jSONArray = new JSONArray(str5);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jSONArray == null) {
                return searchBarHintBean;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("key");
                    String optString2 = optJSONObject.optString("value");
                    if (!StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString2)) {
                        searchBarHintBean.extraParams.put(optString, optString2);
                    }
                }
            }
        }
        String str6 = (String) hashMap.remove(ndl.TAB_DISCOVER);
        if (!StringUtils.isEmpty(str6) && (parseObject = JSON.parseObject(str6)) != null) {
            ActivateCellBean activateCellBean = new ActivateCellBean();
            activateCellBean.suggestRn = searchBarHintBean.suggestRn;
            activateCellBean.name = parseObject.getString("name");
            Boolean bool = parseObject.getBoolean("is_first_module");
            if (bool != null) {
                activateCellBean.aboveHistory = bool.booleanValue();
            }
            activateCellBean.rownnum = parseObject.getIntValue("rownum");
            activateCellBean.type = parseObject.getString("type");
            com.alibaba.fastjson.JSONArray jSONArray2 = parseObject.getJSONArray("result");
            if (jSONArray2 != null) {
                activateCellBean.activateItems = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        ActivateBean activateBean = new ActivateBean();
                        activateBean.groupType = activateCellBean.type;
                        activateBean.keyword = jSONObject2.getString("searchtext");
                        activateBean.subType = jSONObject2.getString("subtype");
                        activateBean.showText = jSONObject2.getString("showtext");
                        activateBean.tagText = jSONObject2.getString("tagText");
                        activateBean.tagColor = jSONObject2.getString("tagColor");
                        activateBean.tagBgColor = jSONObject2.getString("tagBgColor");
                        activateBean.tagBorderColor = jSONObject2.getString("tagBorderColor");
                        activateBean.suggestRn = activateCellBean.suggestRn;
                        com.alibaba.fastjson.JSONArray a2 = a.a(jSONObject2, "searchparams");
                        if (str5 != null) {
                            HashMap hashMap2 = new HashMap();
                            for (int i3 = 0; i3 < a2.size(); i3++) {
                                com.alibaba.fastjson.JSONObject jSONObject3 = a2.getJSONObject(i3);
                                if (jSONObject3 != null) {
                                    String string = jSONObject3.getString("key");
                                    String string2 = jSONObject3.getString("value");
                                    if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                                        hashMap2.put(string, string2);
                                    }
                                }
                            }
                            activateBean.searchparams = hashMap2;
                        }
                        activateCellBean.activateItems.add(activateBean);
                    }
                }
            }
            searchBarHintBean.discovery = activateCellBean;
        }
        return searchBarHintBean;
    }

    public static SearchBarHintBean a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarHintBean) ipChange.ipc$dispatch("9e49b8dd", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            q.g("SearchHintParserHelper", "searchHintConfigStr is empty");
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            q.b("SearchHintParserHelper", "解析首页底纹参数失败", e);
            jSONObject = new JSONObject();
        }
        return a(jSONObject);
    }
}
