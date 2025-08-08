package com.taobao.tao.infoflow.multitab;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.ksk;
import tb.ldf;
import tb.ope;
import tb.tgr;
import tb.tht;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUSINESS_ID_GUIDE_POP = "guideTabPop";
    public static final String KEY_BG_COLOR = "bgColor";
    public static final String KEY_BG_IMG = "bgImg";
    public static final String KEY_CONTAINER_TYPE = "containerType";
    public static final String KEY_DARK_TAB_GIF_URL = "darkTabGifUrl";
    public static final String KEY_DARK_TAB_IMG_URL = "darkTabImgUrl";
    public static final String KEY_DARK_TAB_SELECTED_IMG_URL = "darkTabSelectedImgUrl";
    public static final String KEY_DARK_TEXT_SELECT_COLOR = "darkTextSelectColor";
    public static final String KEY_DEFAULT_SELECTED = "isDefaultSelected";
    public static final String KEY_DOWN_PANEL_ANCHOR_Y = "panelAnchorY";
    public static final String KEY_DOWN_PANEL_DARK_DOWN_IMG = "darkModeDownArrowImg";
    public static final String KEY_DOWN_PANEL_DARK_UP_IMG = "darkModeUpArrowImg";
    public static final String KEY_DOWN_PANEL_DOWN_IMG = "downArrowImg";
    public static final String KEY_DOWN_PANEL_UP_IMG = "upArrowImg";
    public static final String KEY_EMBED_SEARCH_BAR = "embedSearchBar";
    public static final String KEY_FESTIVAL_DARK = "0";
    public static final String KEY_FESTIVAL_LIGHT = "1";
    public static final String KEY_IMAGE_TAB_HEIGHT_AP = "imageTabHeightAp";
    public static final String KEY_IMAGE_TAB_WIDTH_AP = "imageTabWidthAp";
    public static final String KEY_IS_DEEP_COLOR = "isDeepColor";
    public static final String KEY_IS_FESTIVAL = "isFestival";
    public static final String KEY_IS_RECOMMEND_TAB = "isRecommendTab";
    public static final String KEY_IS_STICKY_LEFT = "isStickyLeft";
    public static final String KEY_SELECTED_TAB_ID = "selectedTabId";
    public static final String KEY_SHOW_TAB_INDICATOR = "showTabIndicator";
    public static final String KEY_SMART_CONTENT = "smartContent";
    public static final String KEY_TABS = "tabs";
    public static final String KEY_TAB_DARK_TEXT_COLOR = "darkTextColor";
    public static final String KEY_TAB_GIF_URL = "tabGifUrl";
    public static final String KEY_TAB_ID = "tabId";
    public static final String KEY_TAB_IMG_URL = "tabImgUrl";
    public static final String KEY_TAB_INDICATOR_COLOR = "tabIndicatorColor";
    public static final String KEY_TAB_INDICATOR_DARK_COLOR = "tabIndicatorDarkColor";
    public static final String KEY_TAB_MARGIN_LEFT = "tabMarginLeft";
    public static final String KEY_TAB_SECTION = "tabSection";
    public static final String KEY_TAB_SELECTED_IMG = "tabSelectedImgUrl";
    public static final String KEY_TAB_SPACE_CONFIG = "tabSpaceConfig";
    public static final String KEY_TAB_TEXT = "text";
    public static final String KEY_TEXT = "text";
    public static final String KEY_TEXT_COLOR = "textColor";
    public static final String KEY_TEXT_SELECT_COLOR = "textSelectColor";
    public static final String KEY_TEXT_SELECT_SIZE = "textSelectSize";
    public static final String KEY_TEXT_SIZE = "textSize";
    public static final String KEY_TOP_BAR_BG_COLOR = "topBarBgColor";
    public static final String KEY_TOP_BAR_BG_IMG = "topBarBgImg";
    public static final String PATH_DOWN_PANEL_ARROW_CONFIG = "subSection.downPanel.item.0.smartContent.arrowConfig";
    public static final String PATH_DOWN_PANEL_ITEM = "subSection.downPanel.item.0";
    public static final String PATH_DOWN_PANEL_POP_CONFIG = "subSection.downPanel.item.0.smartContent.panelPopConfig";
    public static final String PATH_DOWN_PANEL_POP_SECTION = "subSection.downPanel.subSection.panelSection";
    public static final String SECTION_BIZ_CODE_TAB_GUIDE = "tabGuidePop";

    static {
        kge.a(2042857956);
    }

    public static JSONObject a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42e64ef3", new Object[]{iContainerDataModel});
        }
        if (iContainerDataModel != null) {
            return b(iContainerDataModel.getTotalData());
        }
        return null;
    }

    public static JSONObject b(List<?> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("459ae1fa", new Object[]{list});
        }
        SectionModel sectionModel = null;
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (!(obj instanceof SectionModel)) {
                break;
            }
            SectionModel sectionModel2 = (SectionModel) obj;
            if (StringUtils.equals(sectionModel2.getSectionBizCode(), com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.TAB_SECTION_CODE) && a(a(sectionModel2))) {
                sectionModel = sectionModel2;
            }
        }
        return sectionModel;
    }

    public static JSONObject a() {
        AwesomeGetContainerData b;
        IContainerInnerDataModel<SectionModel> base;
        List<JSONObject> popData;
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        ope f = com.taobao.tao.homepage.d.f(ksk.NEW_FACE_PARENT.f30287a);
        if (f == null || (b = f.b(ksk.NEW_FACE_PARENT.f30287a)) == null || (base = b.getBase()) == null || (popData = base.getPopData()) == null || popData.isEmpty()) {
            return null;
        }
        Iterator<JSONObject> it = popData.iterator();
        while (true) {
            if (!it.hasNext()) {
                jSONObject = null;
                break;
            }
            jSONObject = it.next();
            if (StringUtils.equals(jSONObject.getString(PopConst.BRIDGE_KEY_BUSINESS_ID), BUSINESS_ID_GUIDE_POP)) {
                break;
            }
        }
        if (jSONObject == null || (jSONArray = jSONObject.getJSONArray("sections")) == null || jSONArray.isEmpty()) {
            return null;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && StringUtils.equals(jSONObject2.getString("sectionBizCode"), SECTION_BIZ_CODE_TAB_GUIDE)) {
                return jSONObject2;
            }
        }
        return jSONObject;
    }

    private static boolean a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            int i = 0;
            for (JSONObject jSONObject : list) {
                if (e(jSONObject)) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static List<JSONObject> a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("tabs")) == null || (jSONObject4 = jSONObject3.getJSONObject("item")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            JSONObject jSONObject5 = jSONObject4.getJSONObject(String.valueOf(i));
            if (jSONObject5 == null) {
                return arrayList;
            }
            if (h(jSONObject5)) {
                arrayList.add(jSONObject5);
            }
            i++;
        }
    }

    private static boolean h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba943e5", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return false;
        }
        return !StringUtils.isEmpty(jSONObject2.getString(KEY_TAB_ID)) && !StringUtils.isEmpty(jSONObject2.getString("containerType")) && !StringUtils.isEmpty(jSONObject2.getString("text"));
    }

    public static boolean a(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{list, list2})).booleanValue();
        }
        if ((list == null || list.isEmpty()) && list2 != null && !list2.isEmpty()) {
            return true;
        }
        if (list != null && list2 != null) {
            if (list.size() != list2.size()) {
                return true;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!StringUtils.equals(f(list.get(i)), f(list2.get(i)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) ? "" : jSONObject2.getString(KEY_TAB_ID);
    }

    public static String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject}) : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) ? "" : jSONObject2.getString("containerType");
    }

    public static String l(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc6823e3", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return "";
        }
        String string = jSONObject2.getString("containerType");
        String string2 = jSONObject2.getString(KEY_TAB_ID);
        return string + "_" + string2;
    }

    private static String f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e46e245d", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return "";
        }
        String string = jSONObject2.getString("text");
        String string2 = jSONObject2.getString(KEY_TAB_ID);
        String string3 = jSONObject2.getString("content");
        return string + "_" + string2 + "_" + string3;
    }

    public static boolean e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b16e08", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            return jSONObject2.getBooleanValue(KEY_IS_RECOMMEND_TAB);
        }
        return false;
    }

    public static int g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a56a735", new Object[]{jSONObject})).intValue();
        }
        List<JSONObject> a2 = a(jSONObject);
        if (a2 != null && !a2.isEmpty()) {
            for (int i = 0; i < a2.size(); i++) {
                JSONObject jSONObject3 = a2.get(i);
                if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("content")) != null && jSONObject2.getBooleanValue(KEY_DEFAULT_SELECTED)) {
                    return i;
                }
            }
        }
        return -2;
    }

    public static boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfa119c2", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            return false;
        }
        String string = jSONObject2.getString("refreshSearchText");
        if (!StringUtils.isEmpty(string)) {
            return Boolean.parseBoolean(string);
        }
        return true;
    }

    public static String j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bf7961", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(KEY_SMART_CONTENT)) != null) {
            return jSONObject2.getString("ssrPageUrl");
        }
        return null;
    }

    public static tgr a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tgr) ipChange.ipc$dispatch("300c0c9f", new Object[]{jSONObject, jSONObject2});
        }
        if (jSONObject == null || jSONObject2 == null) {
            return null;
        }
        JSONObject a2 = a(jSONObject, "leftComponent");
        JSONObject a3 = a(jSONObject, "rightComponent");
        JSONObject jSONObject3 = jSONObject.getJSONObject("content");
        int a4 = a(b(jSONObject3, KEY_TOP_BAR_BG_COLOR));
        String b = b(jSONObject3, KEY_TOP_BAR_BG_IMG);
        boolean z = jSONObject3 != null && jSONObject3.getBooleanValue("isSearchBoxDataFromSelf");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
        return new tht(a2, a3, b, a4, jSONObject4 != null && jSONObject4.getBooleanValue(KEY_IS_FESTIVAL), z);
    }

    public static boolean m(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92465300", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null) {
            return jSONObject2.getBooleanValue(KEY_EMBED_SEARCH_BAR);
        }
        return false;
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a0a6430", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject(str);
        }
        return null;
    }

    public static String b(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception e) {
            ldf.d("MultiTabDataParseUtils", "getTabIdFromWV error：" + e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(KEY_TAB_ID);
        }
        return null;
    }

    public static void a(JSONObject jSONObject, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{jSONObject, new Integer(i)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("spm");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        Matcher matcher = Pattern.compile("(\\d+)$").matcher(string);
        if (matcher.find()) {
            int length = string.length() - matcher.group(1).length();
            str = string.substring(0, length) + i;
        } else {
            str = string + i;
        }
        jSONObject2.put("spm", (Object) str);
    }

    private static JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_SMART_CONTENT);
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject(str);
        }
        return null;
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            ldf.d("MultiTabDataParseUtils", "出现异常：" + e);
            return -1;
        }
    }

    private static String b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a29568f", new Object[]{jSONObject, str});
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }
}
