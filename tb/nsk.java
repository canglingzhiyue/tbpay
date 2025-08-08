package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.downgrade.Downgrade;
import com.taobao.linkmanager.flowout.c;
import com.taobao.search.common.util.r;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.search.sf.widgets.topbar.SFTopBarBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class nsk extends isf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONVERTER_NAME = "mainsearch";
    public static final String KEY_GUIDE_SEARCH_URL = "guideSearchUrl";
    public static final String KEY_NEW_SEARCH_URL = "newSearchUrl";
    public static final String KEY_TAB_PAGE_URL = "tabPageUrl";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31726a;

    public static /* synthetic */ Object ipc$super(nsk nskVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-821951410);
        f31726a = false;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : !StringUtils.isEmpty(jSONObject.getString(KEY_NEW_SEARCH_URL));
    }

    @Override // tb.isf
    public <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject, imn imnVar) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e1246", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        boolean z = result instanceof CommonSearchResult;
        if (z) {
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) result;
            if (commonSearchResult2.newSearchNative && a(jSONObject)) {
                jSONObject.getString(KEY_NEW_SEARCH_URL);
                e((nsk) result, jSONObject);
                f((nsk) result, jSONObject);
                if (!z) {
                    return;
                }
                commonSearchResult2.originData = jSONObject;
                commonSearchResult2.newSearch = true;
                return;
            }
        }
        JSONArray jSONArray = null;
        if (z) {
            commonSearchResult = (CommonSearchResult) result;
            JSONArray jSONArray2 = commonSearchResult.carriedData;
            commonSearchResult.carriedData = null;
            a(jSONObject, jSONArray2);
            nst.INSTANCE.a(commonSearchResult, jSONObject);
            commonSearchResult.originData = JSON.parseObject(jSONObject.toString());
            jSONArray = jSONArray2;
        } else {
            commonSearchResult = null;
        }
        i((nsk) result, jSONObject);
        CommonSearchResult commonSearchResult3 = (CommonSearchResult) result;
        c(commonSearchResult3, jSONObject);
        h((nsk) result, jSONObject);
        g((nsk) result, jSONObject);
        j((nsk) result, jSONObject);
        k((nsk) result, jSONObject);
        List<String> e = e(jSONObject);
        if (!a((nsk) result, jSONObject, e, jSONArray)) {
            b(result, jSONObject, e, jSONArray);
        }
        if (commonSearchResult != null) {
            a((nsk) result, a.a(jSONObject, "replaceArray"), jSONObject, commonSearchResult.getReplaceCells(), e, false);
            a((nsk) result, a.a(jSONObject, "bufferArray"), jSONObject, commonSearchResult.getBufferCells(), e, false);
            a(commonSearchResult, jSONObject);
        }
        e((nsk) result, jSONObject);
        f((nsk) result, jSONObject);
        d((nsk) result, jSONObject);
        b((nsk) result, jSONObject);
        c((nsk) result, jSONObject);
        a((nsk) result, jSONObject);
        f(commonSearchResult3, jSONObject);
        if (!result.isNew()) {
            return;
        }
        d(commonSearchResult3, jSONObject);
    }

    private void a(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e020b", new Object[]{this, commonSearchResult, jSONObject});
        } else if (!commonSearchResult.isNew() || (b = a.b(jSONObject, "pkModule")) == null) {
        } else {
            commonSearchResult.pkModuleBean = commonSearchResult.c().g().a(b, commonSearchResult, jSONObject.getJSONObject("pageInfo"));
        }
    }

    private <RESULT extends BaseSearchResult> boolean a(RESULT result, JSONObject jSONObject, List<String> list, JSONArray jSONArray) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ea9cdfd", new Object[]{this, result, jSONObject, list, jSONArray})).booleanValue();
        }
        if (f31726a || (jSONObject2 = jSONObject.getJSONObject("singleCombo")) == null || jSONObject2.isEmpty()) {
            return false;
        }
        a(jSONObject2, jSONArray);
        a((nsk) result, jSONObject2.getJSONArray("itemsArray"), jSONObject, result.getCells(), list, true);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(JSONObject jSONObject, JSONArray jSONArray) {
        Object obj;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94b4b0", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("type");
                if (!StringUtils.isEmpty(string) && (obj = jSONObject2.get("data")) != null) {
                    String string2 = jSONObject2.getString("key");
                    if (!StringUtils.isEmpty(string2)) {
                        Object obj2 = jSONObject.get(string2);
                        if (obj2 == null) {
                            jSONObject.put(string2, obj);
                        } else {
                            boolean z = obj2 instanceof JSONArray;
                            switch (string.hashCode()) {
                                case -1108791789:
                                    if (string.equals("mergeLocal")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1102179574:
                                    if (string.equals("mergeStart")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -501718653:
                                    if (string.equals("mergeEnd")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 178828699:
                                    if (string.equals("mergeServer")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1094496948:
                                    if (string.equals("replace")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                a(true, z, obj2, obj);
                            } else if (c == 1) {
                                a(false, z, obj2, obj);
                            } else if (c == 2) {
                                jSONObject.put(string2, obj);
                            } else if (c == 3) {
                                a(string2, jSONObject, obj2, obj);
                            } else if (c == 4) {
                                a(string2, jSONObject, obj, obj2);
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(String str, JSONObject jSONObject, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f01b6b6", new Object[]{this, str, jSONObject, obj, obj2});
        } else if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
        } else {
            JSONObject jSONObject2 = (JSONObject) obj2;
            jSONObject2.putAll((JSONObject) obj);
            jSONObject.put(str, (Object) jSONObject2);
        }
    }

    private void a(boolean z, boolean z2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f119a0", new Object[]{this, new Boolean(z), new Boolean(z2), obj, obj2});
        } else if (!(obj2 instanceof JSONArray) || !z2) {
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            if (z) {
                jSONArray.addAll(0, (JSONArray) obj2);
            } else {
                jSONArray.addAll((JSONArray) obj2);
            }
        }
    }

    private <RESULT extends BaseSearchResult> boolean a(RESULT result, JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d843c6", new Object[]{this, result, jSONObject, list, list2})).booleanValue();
        }
        if (f31726a || (jSONObject2 = jSONObject.getJSONObject("singleCombo")) == null || jSONObject2.isEmpty()) {
            return false;
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("comboHeader");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("comboFooter");
        JSONObject jSONObject3 = jSONObject.getJSONObject("pageInfo");
        a((nsk) result, jSONObject3, jSONArray, list);
        a((nsk) result, jSONObject3, jSONArray2, list2);
        return true;
    }

    private <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject, JSONArray jSONArray, List<String> list) {
        BaseTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17a81f9", new Object[]{this, result, jSONObject, jSONArray, list});
        } else if (jSONArray == null || jSONArray.isEmpty() || (a2 = result.c().g().a(jSONArray.getJSONObject(0), result, jSONObject)) == null) {
        } else {
            list.add(a2.type);
            result.addMod(a2.type, a2);
        }
    }

    private void c(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730fb849", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        JSONObject b = a.b(jSONObject, "pageInfo");
        commonSearchResult.pageInfo = b;
        if (b != null) {
            commonSearchResult.copyPageInfo = (JSONObject) b.clone();
        }
        if (b == null) {
            return;
        }
        String string = b.getString("for_bts");
        if (StringUtils.isEmpty(string)) {
            str = nth.a();
        } else {
            if (!string.endsWith(";")) {
                string = string + ";";
            }
            str = string + nth.a();
        }
        b.put("for_bts", (Object) str);
        if (!r.aP()) {
            return;
        }
        ntz.INSTANCE.a(str);
        ntz.INSTANCE.b(str);
    }

    private void d(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009368", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        JSONObject b = a.b(jSONObject, "switches");
        if (b == null) {
            return;
        }
        commonSearchResult.isServerAutoPlay = b.getBooleanValue("videoAutoPlay4g");
        commonSearchResult.isPrePaging = b.getBooleanValue("prePaging");
        commonSearchResult.isNewFilter = b.getBooleanValue("newFilter");
        commonSearchResult.isJarvisDataCache = b.getBooleanValue("isJarvisDataCache");
        commonSearchResult.isUpdateUtparam = b.getBooleanValue("updateUtparam");
        commonSearchResult.isPreciseAppear = b.getBooleanValue("preciseAppear");
        commonSearchResult.setPreDetail(a.a(b, "preDetail", (Boolean) null));
    }

    private void f(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae249a6", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        JSONObject b2 = a.b(jSONObject, "jarvisFeature");
        if (b2 == null || (b = a.b(b2, "queryFeature")) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : b.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!StringUtils.isEmpty(key) && value != null) {
                hashMap.put(key, value.toString());
            }
        }
        commonSearchResult.jarvisFeature = hashMap;
    }

    private <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b150abe0", new Object[]{this, result, jSONObject});
        } else if (!(result instanceof CommonSearchResult)) {
        } else {
            ((CommonSearchResult) result).sessionId = jSONObject.getString("sessionid");
        }
    }

    private <RESULT extends BaseSearchResult> void b(RESULT result, JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17b92a1", new Object[]{this, result, jSONObject});
        } else if ((result instanceof CommonSearchResult) && result.isNew() && (b = a.b(jSONObject, "updateParams")) != null && !b.isEmpty()) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) result;
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                commonSearchResult.updateParams.put(entry.getKey(), entry.getValue().toString());
            }
        }
    }

    private <RESULT extends BaseSearchResult> void c(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a67962", new Object[]{this, result, jSONObject});
            return;
        }
        String string = jSONObject.getString(JarvisConstant.KEY_JARVIS_CONFIG);
        if (!StringUtils.isEmpty(string)) {
            result.addExtMod(JarvisConstant.KEY_JARVIS_CONFIG, string);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(JarvisConstant.KEY_JARVIS_CONTEXT);
        if (jSONObject2 == null) {
            return;
        }
        result.addExtMod(JarvisConstant.KEY_JARVIS_CONTEXT, jSONObject2.toString());
        if (!result.isNew()) {
            return;
        }
        ((CommonSearchResult) result).spClientSession = jSONObject2.getString("isOpenDuplicateRemove");
    }

    private <RESULT extends BaseSearchResult> void d(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d16023", new Object[]{this, result, jSONObject});
            return;
        }
        String string = jSONObject.getString("filterMod");
        if (string != null) {
            result.addExtMod("filterMod", string);
        }
        String string2 = jSONObject.getString("sideMod");
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        result.addExtMod("sideMod", string2);
    }

    private <RESULT extends BaseSearchResult> void e(RESULT result, JSONObject jSONObject) {
        SearchBarBean fromJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fc46e4", new Object[]{this, result, jSONObject});
        } else if (!(result instanceof CommonSearchResult)) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ssm.UI_MODULE_SEARCH_BAR);
            if (jSONObject2 == null) {
                fromJson = SearchBarBean.createDefault();
            } else {
                fromJson = SearchBarBean.fromJson(jSONObject2);
            }
            ((CommonSearchResult) result).setSearchBarInfo(fromJson);
        }
    }

    private <RESULT extends BaseSearchResult> void f(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2272da5", new Object[]{this, result, jSONObject});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) result;
        commonSearchResult.tabParseTraceDigest = new ioz();
        ArrayList<TabBean> parseBean = TabBean.parseBean(jSONObject, commonSearchResult.tabParseTraceDigest);
        if (parseBean == null || parseBean.size() == 0) {
            parseBean = TabBean.createDefaultTabs();
        }
        result.setTabs(parseBean);
        b(jSONObject);
    }

    private void b(JSONObject jSONObject) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty() && (a2 = a.a(jSONObject, "tabs")) != null) {
            for (int i = 0; i < a2.size(); i++) {
                c(a2.getJSONObject(i));
            }
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject b;
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (b = a.b(jSONObject, "api")) != null && (b2 = a.b(jSONObject, "tabAction")) != null) {
            String string = b2.getString("param");
            String string2 = b.getString("name");
            String string3 = b.getString("version");
            if (StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3) || StringUtils.isEmpty(string)) {
                return;
            }
            HashMap hashMap = null;
            JSONObject b3 = a.b(b, "params");
            if (b3 != null) {
                hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : b3.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!StringUtils.isEmpty(key) && value != null) {
                        hashMap.put(key, value.toString());
                    }
                }
            }
            nty.INSTANCE.a(string, new SearchApiModel(string2, string3, hashMap));
        }
    }

    private <RESULT extends BaseSearchResult> void g(RESULT result, JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32521466", new Object[]{this, result, jSONObject});
            return;
        }
        String string = "bizDegrade".equals(Downgrade.getInstance().getDowngradeStrategy(noa.VALUE_BIZ_TYPE_NEW_SEARCH).getTacticsFunction()) ? null : jSONObject.getString(KEY_NEW_SEARCH_URL);
        if (StringUtils.isEmpty(string)) {
            string = jSONObject.getString(KEY_GUIDE_SEARCH_URL);
        }
        if (StringUtils.isEmpty(string)) {
            string = jSONObject.getString(nom.KEY_BOX_SEARCH);
            z = false;
        } else {
            z = true;
        }
        if (StringUtils.isEmpty(string)) {
            return;
        }
        if (result instanceof CommonSearchResult) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) result;
            if (z) {
                commonSearchResult.newSearch = true;
                commonSearchResult.guideSearch = true ^ StringUtils.isEmpty(jSONObject.getString(KEY_GUIDE_SEARCH_URL));
            }
        }
        jSONObject.remove(nom.KEY_BOX_SEARCH);
        Map<String, String> a2 = com.taobao.android.searchbaseframe.util.r.a(string);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tItemType", (Object) nom.TYPE_NAME);
        jSONObject2.put("url", (Object) string);
        JSONObject jSONObject3 = new JSONObject();
        a(jSONObject3, nom.KEY_IMMERSE_STYLE, a2.get(nom.KEY_X_IMMERSE_STYLE));
        a(jSONObject3, nom.KEY_NAVI_STYLE, a2.get(nom.KEY_X_NAVI_STYLE));
        a(jSONObject3, "redirect", a2.get(nom.KEY_X_REDIRECT));
        a(jSONObject3, nom.KEY_HIDE_NAVIBAR, a2.get(nom.KEY_X_HIDE_NAVIBAR));
        a(jSONObject3, nom.KEY_SIZE_RATION, a2.get(nom.KEY_X_RATION));
        a(jSONObject3, nom.KEY_DISABLE_HEADER_SCROLL, a2.get(nom.KEY_DISABLE_HEADER_SCROLL));
        a(jSONObject3, "tabTextNormalColor", a2.get("_xsearchTabTextNormalColor"));
        a(jSONObject3, "tabTextSelectedColor", a2.get("_xsearchTabTextSelectedColor"));
        a(jSONObject3, "statusBarStyle", a2.get("_xsearchStatusBarStyle"));
        if (z) {
            jSONObject3.put("bizType", (Object) noa.VALUE_BIZ_TYPE_NEW_SEARCH);
        } else if (jSONObject.getBooleanValue(nom.KEY_IS_FULL)) {
            jSONObject3.put("bizType", (Object) noa.VALUE_BIZ_TYPE_QD);
        } else {
            jSONObject3.put("bizType", (Object) noa.VALUE_BIZ_TYPE_ONESEARCH);
            jSONObject3.put("width", (Object) jSONObject.getString("width"));
            jSONObject3.put("height", (Object) String.valueOf(jSONObject.getIntValue("height") - g.b(a2.get(nom.KEY_X_CUT_HEIGHT), 0)));
        }
        jSONObject2.put("style", (Object) jSONObject3);
        jSONObject.put("sceneHeader", (Object) jSONObject2);
    }

    private <RESULT extends BaseSearchResult> void h(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727cfb27", new Object[]{this, result, jSONObject});
        } else if (!(result instanceof CommonSearchResult) || jSONObject == null) {
        } else {
            CommonSearchResult commonSearchResult = (CommonSearchResult) result;
            if (!StringUtils.isEmpty(jSONObject.getString(KEY_NEW_SEARCH_URL))) {
                return;
            }
            String string = jSONObject.getString(nom.KEY_BOX_SEARCH);
            if (StringUtils.isEmpty(string)) {
                return;
            }
            Map<String, String> a2 = com.taobao.android.searchbaseframe.util.r.a(string);
            if (a2.isEmpty() || !StringUtils.equals(nom.VALUE_YES, a2.get("_xsearchIsGiraffe"))) {
                return;
            }
            TemplateBean templateBean = new TemplateBean();
            templateBean.url = a2.remove("_xsearchBundleUrl");
            templateBean.md5 = a2.remove("_xsearchJSMd5");
            templateBean.templateName = "wx_gl__shopstar__" + a2.remove("_xsearchTplId");
            templateBean.version = a2.remove("_xsearchJSVer");
            String b = com.taobao.android.searchbaseframe.util.r.b(templateBean.url);
            Map<String, String> a3 = com.taobao.android.searchbaseframe.util.r.a(templateBean.url);
            templateBean.binary = b != null && b.endsWith(".wlasm");
            if (StringUtils.equals("1", a3.get("__cell_for_layout"))) {
                templateBean.cellBinary = true;
            }
            a2.put("tItemType", templateBean.templateName);
            if (commonSearchResult.getTemplates() != null) {
                commonSearchResult.getTemplates().put(templateBean.templateName, templateBean);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(templateBean.templateName, templateBean);
                commonSearchResult.setTemplates(hashMap);
            }
            JSONObject jSONObject2 = new JSONObject(new HashMap(a2));
            String string2 = jSONObject.getString("width");
            int b2 = g.b(jSONObject.getString("height"), 0) - g.b(a2.get(nom.KEY_X_CUT_HEIGHT), 0);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", (Object) string2);
            jSONObject3.put("height", (Object) String.valueOf(b2));
            jSONObject3.put("isGiraffe", (Object) nom.VALUE_YES);
            jSONObject3.put(c.DEGTAGE_H5URL, (Object) string);
            a(jSONObject3, "showType", jSONObject2.getString("_xsearchShowType"));
            a(jSONObject3, "enableSlide", jSONObject2.getString("_xsearchEnableSlide"));
            a(jSONObject3, "collapseSecond", jSONObject2.getString("_xsearchCSec"));
            a(jSONObject3, "advanceBottomSearchListHeight", jSONObject2.getString("_xsearchAdvanceBSLHeight"));
            a(jSONObject3, "fullBottomSearchListHeight", jSONObject2.getString("_xsearchFullBSLHeight"));
            a(jSONObject3, "enableGuide", jSONObject2.getString("_xsearchNEnableGuide"));
            a(jSONObject3, "enterAnimation", jSONObject2.getString("_xsearchEnterAnimation"));
            a(jSONObject3, "collapseSecond", jSONObject2.getString("_xsearchCSec"));
            a(jSONObject3, "hideMaskView", jSONObject2.getString("_xsearchHideMaskView"));
            a(jSONObject3, "disableAutoExpand", jSONObject2.getString("_xsearchDisableAutoExpand"));
            a(jSONObject3, nom.KEY_IMMERSE_STYLE, jSONObject2.getString(nom.KEY_X_IMMERSE_STYLE));
            a(jSONObject3, "statusBarStyle", jSONObject2.getString("_xsearchStatusBarStyle"));
            a(jSONObject3, "tabTextNormalColor", jSONObject2.getString("_xsearchTabTextNormalColor"));
            a(jSONObject3, "tabTextSelectedColor", jSONObject2.getString("_xsearchTabTextSelectedColor"));
            a(jSONObject3, "repeatCollapseSecond", jSONObject2.getString("_xsearchRCSec"));
            jSONObject2.put("style", (Object) jSONObject3);
            jSONObject.remove(nom.KEY_BOX_SEARCH);
            jSONObject.put("sceneHeader", (Object) jSONObject2);
            commonSearchResult.addExtMod("enableSlide", a2.get("_xsearchEnableSlide"));
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{jSONObject, str, str2});
        } else if (jSONObject == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            jSONObject.put(str, (Object) str2);
        }
    }

    private <RESULT extends BaseSearchResult> void i(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a7e1e8", new Object[]{this, result, jSONObject});
            return;
        }
        d(jSONObject);
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
        result.setMainInfo(resultMainInfoBean);
    }

    private void d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (f31726a || (jSONObject2 = jSONObject.getJSONObject("singleCombo")) == null || jSONObject2.isEmpty()) {
        } else {
            jSONObject.put("style", (Object) jSONObject2.getString("style"));
        }
    }

    private <RESULT extends BaseSearchResult> void j(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d2c8a9", new Object[]{this, result, jSONObject});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) result;
        commonSearchResult.layoutParseTraceDigestMap = new HashMap();
        ResultLayoutInfoBean resultLayoutInfoBean = new ResultLayoutInfoBean();
        if (!a((nsk) result, jSONObject, resultLayoutInfoBean.stickyHeaders, resultLayoutInfoBean.listFooters)) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            JSONArray jSONArray6 = new JSONArray();
            k(jSONArray, jSONObject);
            e(jSONArray4, jSONObject);
            j(jSONArray4, jSONObject);
            f(jSONArray4, jSONObject);
            g(jSONArray4, jSONObject);
            h(jSONArray4, jSONObject);
            m(jSONArray4, jSONObject);
            i(jSONArray4, jSONObject);
            l(jSONArray5, jSONObject);
            a(jSONArray3, jSONArray, jSONArray2, jSONArray4, jSONArray6, jSONObject, result);
            commonSearchResult.topBarParseTraceDigest = null;
            String a2 = a(jSONArray, jSONObject, result.getMainInfo().pageName);
            a(itk.TYPE_FOLD, result, resultLayoutInfoBean.foldHeaders, jSONArray3, jSONObject);
            a("sticky", result, resultLayoutInfoBean.stickyHeaders, jSONArray, jSONObject);
            a(itk.TYPE_HALF_STICKY, result, resultLayoutInfoBean.halfStickyHeaders, jSONArray2, jSONObject);
            a("listHeader", result, resultLayoutInfoBean.listHeaders, jSONArray4, jSONObject);
            a("listFooter", result, resultLayoutInfoBean.listFooters, jSONArray5, jSONObject);
            a("scene", result, resultLayoutInfoBean.sceneHeaders, jSONArray6, jSONObject);
            a(resultLayoutInfoBean, jSONArray6, a2);
        }
        result.getMainInfo().layoutInfo = resultLayoutInfoBean;
    }

    private void a(ResultLayoutInfoBean resultLayoutInfoBean, JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c84c98", new Object[]{this, resultLayoutInfoBean, jSONArray, str});
        } else if (a(resultLayoutInfoBean, jSONArray)) {
        } else {
            String a2 = a(resultLayoutInfoBean.listHeaders, "nt_prepose_filter");
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            resultLayoutInfoBean.stickyHeaders.add(0, a2);
            String a3 = a(resultLayoutInfoBean.stickyHeaders, str);
            if (StringUtils.isEmpty(a3)) {
                return;
            }
            resultLayoutInfoBean.halfStickyHeaders.add(a3);
        }
    }

    private boolean a(ResultLayoutInfoBean resultLayoutInfoBean, JSONArray jSONArray) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b49bda52", new Object[]{this, resultLayoutInfoBean, jSONArray})).booleanValue();
        }
        if (!resultLayoutInfoBean.sceneHeaders.isEmpty() && !jSONArray.isEmpty() && (b = a.b(jSONArray.getJSONObject(0), "style")) != null) {
            return StringUtils.equals(nom.VALUE_YES, b.getString("isGiraffe"));
        }
        return false;
    }

    private String a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe45281d", new Object[]{this, list, str});
        }
        if (StringUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return "";
        }
        int i2 = -1;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            String str2 = list.get(i);
            if (!StringUtils.isEmpty(str2) && str2.contains(str)) {
                i2 = i;
                break;
            }
            i++;
        }
        return i2 < 0 ? "" : list.remove(i2);
    }

    private <RESULT extends BaseSearchResult> void a(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, JSONObject jSONObject, RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6360ddb8", new Object[]{this, jSONArray, jSONArray2, jSONArray3, jSONArray4, jSONArray5, jSONObject, result});
        } else if (jSONObject == null) {
        } else {
            b(jSONArray, jSONObject);
            c(jSONArray2, jSONObject);
            d(jSONArray3, jSONObject);
            a(jSONArray4, jSONObject);
            a(jSONArray5, jSONObject, (JSONObject) result);
        }
    }

    private <RESULT extends BaseSearchResult> void a(JSONArray jSONArray, JSONObject jSONObject, RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91fb118", new Object[]{this, jSONArray, jSONObject, result});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sceneHeader");
        if (jSONObject2 == null || jSONArray == null) {
            return;
        }
        jSONArray.add(jSONObject2);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("style");
        if (jSONObject3 == null) {
            return;
        }
        String string = jSONObject3.getString("enableSlide");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        result.addExtMod("enableSlide", string);
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48168760", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("listHeader");
        if (jSONArray2 == null || jSONArray == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6e7ff", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("foldHeader");
        if (jSONArray2 == null || jSONArray == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private void c(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7489e", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("stickyHeader");
        if (jSONArray2 == null || jSONArray == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private void d(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b7a93d", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("halfStickyHeader");
        if (jSONArray2 == null || jSONArray == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private void e(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9809dc", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("searchTips");
        if (jSONObject2 == null) {
            return;
        }
        jSONArray.add(jSONObject2);
    }

    private void f(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64786a7b", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("promotionBanner");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put("tItemType", "nt_promotionbanner");
        jSONArray.add(jSONObject2);
    }

    private void g(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d58cb1a", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("newPromotion");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put("tItemType", "nt_promotionfilter");
        jSONArray.add(jSONObject2);
    }

    private void h(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6392bb9", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("searchHint");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put("tItemType", "nt_searchhint");
        jSONArray.add(jSONObject2);
    }

    private void i(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f198c58", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("userdoc");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put("tItemType", "nt_personalization");
        jSONArray.add(jSONObject2);
    }

    private void j(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f9ecf7", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ShopRecommendHeader");
        if (jSONObject2 == null) {
            return;
        }
        jSONArray.add(jSONObject2);
    }

    private void k(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80da4d96", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sortMenu");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put("tItemType", "nt_sortbar");
        jSONArray.add(jSONObject2);
    }

    private String a(JSONArray jSONArray, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("194b6", new Object[]{this, jSONArray, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("topBar");
        if (jSONObject2 == null) {
            return "";
        }
        String string = jSONObject2.getString("tItemType");
        if (StringUtils.isEmpty(string)) {
            string = StringUtils.equals(nne.PAGE_NAME_INSHOP, str) ? "nt_inshop_topbar" : "nt_topbar";
            jSONObject2.put("tItemType", (Object) string);
        }
        jSONArray.add(0, jSONObject2);
        return string;
    }

    private void l(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9baae35", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("srpFooter");
        if (jSONObject2 == null) {
            return;
        }
        jSONArray.add(jSONObject2);
    }

    private void m(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29b0ed4", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("dynCellHeader");
        if (jSONArray2 == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private <RESULT extends BaseSearchResult> void a(String str, RESULT result, List<String> list, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd7fd31", new Object[]{this, str, result, list, jSONArray, jSONObject});
        } else if (jSONArray == null) {
            k.e("WsearchConverter", "fillLayoutArray:layoutArray is null");
        } else {
            StringBuilder sb = new StringBuilder();
            JSONObject jSONObject2 = jSONObject.getJSONObject("pageInfo");
            for (int i = 0; i < jSONArray.size(); i++) {
                BaseTypedBean a2 = result.c().g().a(jSONArray.getJSONObject(i), result, jSONObject2);
                if (a2 != null) {
                    String str2 = str + a2.type + i;
                    sb.append(a2.type);
                    sb.append("/");
                    if (a2 instanceof SFTopBarBean) {
                        ((CommonSearchResult) result).topBarParseTraceDigest = ((SFTopBarBean) a2).traceDigest;
                    }
                    list.add(str2);
                    result.addMod(str2, a2);
                }
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) result;
            if (commonSearchResult.layoutParseTraceDigestMap == null) {
                commonSearchResult.layoutParseTraceDigestMap = new HashMap();
            }
            commonSearchResult.layoutParseTraceDigestMap.put(str, new ioz(sb.toString()));
        }
    }

    private <RESULT extends BaseSearchResult> void k(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fdaf6a", new Object[]{this, result, jSONObject});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) result;
        commonSearchResult.templatesParseTraceDigest = new ioz();
        Map<String, TemplateBean> a2 = iub.a(jSONObject.getJSONArray("templates"), commonSearchResult.templatesParseTraceDigest, result.c());
        if (a2 == null) {
            return;
        }
        if (result.getTemplates() == null) {
            result.setTemplates(a2);
        } else {
            result.getTemplates().putAll(a2);
        }
    }

    private <RESULT extends BaseSearchResult> void b(RESULT result, JSONObject jSONObject, List<String> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39edceba", new Object[]{this, result, jSONObject, list, jSONArray});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("itemsArray");
        if (jSONArray2 == null) {
            jSONArray2 = jSONObject.getJSONArray("shopArray");
        }
        a((nsk) result, jSONArray2, jSONObject, result.getCells(), list, true);
    }

    private <RESULT extends BaseSearchResult> void a(RESULT result, JSONArray jSONArray, JSONObject jSONObject, List<BaseCellBean> list, List<String> list2, boolean z) {
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7967a", new Object[]{this, result, jSONArray2, jSONObject, list, list2, new Boolean(z)});
        } else if (jSONArray2 == null || jSONArray.isEmpty()) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("pageInfo");
            HashMap hashMap = new HashMap();
            hashMap.put("iconStyle", jSONObject.getJSONObject("iconStyle"));
            hashMap.put("pageData", jSONObject.getJSONObject("pageData"));
            hashMap.put("negFeedbackActions", jSONObject.getJSONObject("negFeedbackActions"));
            int size = jSONArray.size();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < size) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                if (jSONObject3 == null) {
                    sb.append("null_cell");
                    sb.append("/");
                } else {
                    BaseCellBean a2 = a((nsk) result, jSONObject3, jSONObject2, (Map<String, Object>) hashMap, size, list2);
                    if (a2 == null) {
                        sb.append("parse_error:");
                        sb.append(jSONObject3.getString("tItemType"));
                        sb.append("/");
                    } else {
                        sb.append(a2.type);
                        sb.append("/");
                        list.add(a2);
                    }
                }
                i++;
                jSONArray2 = jSONArray;
            }
            if (!z) {
                return;
            }
            ((CommonSearchResult) result).itemsArrayTraceDigest = new ioz(sb.toString());
        }
    }

    private <RESULT extends BaseSearchResult> BaseCellBean a(RESULT result, JSONObject jSONObject, JSONObject jSONObject2, Map<String, Object> map, int i, List<String> list) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("58818969", new Object[]{this, result, jSONObject, jSONObject2, map, new Integer(i), list});
        }
        BaseCellBean a2 = result.c().f().a(jSONObject, result, jSONObject2);
        if (a2 == null) {
            return null;
        }
        a(a2, jSONObject);
        boolean z = a2 instanceof SFAuctionBaseCellBean;
        if (z) {
            ((SFAuctionBaseCellBean) a2).pageInfo = jSONObject2;
        }
        boolean z2 = a2 instanceof MuiseCellBean;
        if (z2) {
            ((MuiseCellBean) a2).mExtraObj.putAll(map);
        } else if (a2 instanceof WeexCellBean) {
            ((WeexCellBean) a2).mExtraObj.putAll(map);
        }
        if (z2 && (b = a.b(jSONObject, noa.VALUE_MODULE_DYNAMIC_CARD)) != null) {
            jSONObject.remove(noa.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = b;
            dynamicCardBean.mDynamicCellBean = result.c().f().a(b, result, jSONObject2);
            ((MuiseCellBean) a2).mExtraObj.put("dynamicCardBean", dynamicCardBean);
        }
        JSONObject a3 = a(jSONObject, list);
        if (z) {
            ((SFAuctionBaseCellBean) a2).wsData = a3;
        } else if (z2) {
            ((MuiseCellBean) a2).mExtraObj.put("wsData", a3);
        } else if (a2 instanceof M3CellBean) {
            ((M3CellBean) a2).setWsData(a3);
        }
        a2.pageSize = i;
        a2.setOriginPageSize(i);
        return a2;
    }

    private JSONObject a(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e793ff99", new Object[]{this, jSONObject, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : list) {
            String string = jSONObject.getString(str);
            if (!StringUtils.isEmpty(string)) {
                jSONObject2.put(str, (Object) string);
            }
        }
        return jSONObject2;
    }

    private void a(BaseCellBean baseCellBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33562f6", new Object[]{this, baseCellBean, jSONObject});
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("fullSpan");
        if (baseCellBean instanceof MuiseCellBean) {
            ((MuiseCellBean) baseCellBean).mExtraObj.put("fullSpan", Boolean.valueOf(booleanValue));
        } else if (!(baseCellBean instanceof WeexCellBean)) {
        } else {
            ((WeexCellBean) baseCellBean).mExtraObj.put("fullSpan", Boolean.valueOf(booleanValue));
        }
    }

    private List<String> e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74521bc3", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray a2 = a.a(a.b(a.b(jSONObject, JarvisConstant.KEY_JARVIS_CONFIG), "ext"), "ws_keys");
        if (a2 != null) {
            for (int i = 0; i < a2.size(); i++) {
                String string = a2.getString(i);
                if (!StringUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }
}
