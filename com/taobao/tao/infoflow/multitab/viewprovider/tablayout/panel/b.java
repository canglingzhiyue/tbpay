package com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubSectionModel;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ope;
import tb.oqc;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_ADDED_TEXT = "allAddedText";
    public static final String ALL_ADDED_TEXT_COLOR = "allAddedTextColor";
    public static final String ARROW_IMG = "arrowImg";
    public static final String CURRENT_MENU_CODE = "currentMenuCode";
    public static final String DEFAULT_TITLE_TAG = "defaultTitleTag";
    public static final String DOWN_PANEL = "downPanel";
    public static final String EDIT_INTRODUCER_TEXT = "editIntroducerText";
    public static final String INTRODUCER_TEXT = "introducerText";
    public static final String INTRODUCER_TEXT_COLOR = "introducerTextColor";
    public static final String IS_CATEGORY_SELECT = "isCategorySelect";
    public static final String IS_CLICK = "isClick";
    public static final String IS_EDITABLE = "isEditable";
    public static final String ITEM_IV_TAG = "editIvTag";
    public static final String ITEM_PARENT_TAG = "itemParentTag";
    public static final String ITEM_TV_TAG = "itemTvTag";
    public static final String MENU_CODE = "menuCode";
    public static final String MIN_NUMS_WARNING = "minNumsWarning";
    public static final String MY_CHANNEL = "myChannel";
    public static final String MY_CHANNEL_MIN_NUMS = "myChannelMInNums";
    public static final String PANEL_GUIDE_CLOSE_IMG = "closeImg";
    public static final String PANEL_SECTION = "panelSection";
    public static final String SECTION_NAME = "sectionName";
    public static final String TABS = "tabs";
    public static final String TAB_SECTION_CODE = "categoryTab";
    public static final String TITLE_MAIN_TAG = "mainTitleTag";
    public static final String TITLE_SUB_TAG = "subTitleTag";
    public static final String VIEW_TYPE = "viewType";
    public static final int VIEW_TYPE_CATEGORY = 2;
    public static final int VIEW_TYPE_DEFAULT_NULL_TITLE = 3;
    public static final int VIEW_TYPE_TITLE = 1;

    static {
        kge.a(1725640119);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("tabs")) == null) {
            return null;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("item");
        for (int i = 0; i < jSONObject5.size(); i++) {
            JSONObject jSONObject6 = jSONObject5.getJSONObject(String.valueOf(i));
            if (jSONObject6 != null && (jSONObject4 = jSONObject6.getJSONObject("content")) != null) {
                jSONObject4.put(CURRENT_MENU_CODE, MY_CHANNEL);
            }
        }
        return jSONObject5;
    }

    public static PanelStyleModel b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelStyleModel) ipChange.ipc$dispatch("19bc4330", new Object[]{jSONObject});
        }
        JSONObject f = f(jSONObject);
        if (f == null || (jSONObject2 = f.getJSONObject("ext")) == null) {
            return null;
        }
        try {
            return (PanelStyleModel) JSON.parseObject(JSON.toJSONString(jSONObject2), PanelStyleModel.class);
        } catch (Exception e) {
            g.a("PanelDataUtils", "getPanelData error", e);
            return null;
        }
    }

    public static List<JSONObject> a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4935846c", new Object[]{jSONObject, new Integer(i)});
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        JSONObject g = g(jSONObject);
        if (g == null) {
            return copyOnWriteArrayList;
        }
        for (int i2 = 0; i2 < g.size(); i2++) {
            JSONObject jSONObject2 = g.getJSONObject(String.valueOf(i2));
            if (jSONObject2 != null) {
                a(jSONObject2, copyOnWriteArrayList);
                a(jSONObject2, copyOnWriteArrayList, i);
            }
        }
        return copyOnWriteArrayList;
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        for (SectionModel sectionModel : oqc.a().b().e(oqc.a().l())) {
            if (TextUtils.equals(TAB_SECTION_CODE, sectionModel.getSectionBizCode())) {
                return sectionModel;
            }
        }
        return null;
    }

    public static boolean a(Map<String, List<JSONObject>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue();
        }
        if (map != null && !map.isEmpty()) {
            ope b = oqc.a().b();
            String l = oqc.a().l();
            AwesomeGetContainerData b2 = b.b(l);
            if (!a(a(b2.base.sections), map)) {
                return false;
            }
            AwesomeGetContainerInnerData m1279clone = b2.base.m1279clone();
            try {
                m1279clone.sections = JSON.parseArray(JSON.toJSONString(JSON.toJSON(m1279clone.sections)), SectionModel.class);
                SectionModel a2 = a(m1279clone.sections);
                if (a2 == null) {
                    return false;
                }
                SubSectionModel mo1098getSubSection = a2.mo1098getSubSection();
                for (Map.Entry<String, List<JSONObject>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    List<JSONObject> value = entry.getValue();
                    if (TextUtils.equals(key, MY_CHANNEL)) {
                        a(mo1098getSubSection, value);
                    } else {
                        a(a2, key, value);
                    }
                }
                b.a(m1279clone, l, "base");
                b2.base = m1279clone;
                return true;
            } catch (Exception e) {
                g.a("PanelDataUtils", "updateTabDataSource parseArray error", e);
            }
        }
        return false;
    }

    private static boolean a(SectionModel sectionModel, Map<String, List<JSONObject>> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ad9e64", new Object[]{sectionModel, map})).booleanValue();
        }
        if (sectionModel == null || sectionModel.mo1098getSubSection() == null || (jSONObject = sectionModel.mo1098getSubSection().getJSONObject("tabs")) == null || (jSONObject2 = jSONObject.getJSONObject("item")) == null) {
            return true;
        }
        List<JSONObject> list = map.get(MY_CHANNEL);
        if (list == null) {
            return false;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < jSONObject2.size(); i++) {
            copyOnWriteArrayList.add(jSONObject2.getJSONObject(String.valueOf(i)));
        }
        return !list.equals(copyOnWriteArrayList);
    }

    private static SectionModel a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("ed051936", new Object[]{list});
        }
        SectionModel sectionModel = null;
        for (SectionModel sectionModel2 : list) {
            if (TextUtils.equals(TAB_SECTION_CODE, sectionModel2.getSectionBizCode())) {
                sectionModel = sectionModel2;
            }
        }
        return sectionModel;
    }

    private static void a(SubSectionModel subSectionModel, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0754c74", new Object[]{subSectionModel, list});
            return;
        }
        JSONObject jSONObject = subSectionModel.getJSONObject("tabs");
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        for (int i = 0; i < list.size(); i++) {
            jSONObject2.put(String.valueOf(i), (Object) list.get(i));
        }
        jSONObject.put("item", (Object) jSONObject2);
    }

    private static void a(SectionModel sectionModel, String str, List<JSONObject> list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f64400", new Object[]{sectionModel, str, list});
            return;
        }
        JSONObject f = f(sectionModel);
        if (f == null || (jSONObject = f.getJSONObject("subSection")) == null) {
            return;
        }
        for (int i = 0; i < jSONObject.size() && (jSONObject2 = jSONObject.getJSONObject(String.valueOf(i))) != null && (jSONObject3 = jSONObject2.getJSONObject("ext")) != null; i++) {
            JSONObject jSONObject4 = new JSONObject();
            if (TextUtils.equals(str, jSONObject3.getString(MENU_CODE))) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    jSONObject4.put(String.valueOf(i2), (Object) list.get(i2));
                }
                jSONObject2.put("item", (Object) jSONObject4);
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{jSONObject, new Boolean(z)});
        } else if (z) {
            jSONObject.remove(MY_CHANNEL);
        } else {
            ArrayList arrayList = new ArrayList();
            JSONObject a2 = a(a());
            if (a2 == null) {
                return;
            }
            for (int i = 0; i < a2.size(); i++) {
                String c = c(a2.getJSONObject(String.valueOf(i)));
                if (!TextUtils.isEmpty(c)) {
                    arrayList.add(c);
                }
            }
            jSONObject.put(MY_CHANNEL, (Object) JSON.toJSONString(arrayList));
        }
    }

    public static String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            return jSONObject2.getString(e.KEY_TAB_ID);
        }
        return null;
    }

    public static String d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c579db", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            return jSONObject2.getString(CURRENT_MENU_CODE);
        }
        return null;
    }

    public static boolean e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b16e08", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject f = f(jSONObject);
        if (f != null && (jSONObject2 = f.getJSONObject("ext")) != null) {
            return jSONObject2.getBooleanValue("customizable");
        }
        return false;
    }

    public static JSONObject f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("subSection")) != null && (jSONObject3 = jSONObject2.getJSONObject(DOWN_PANEL)) != null && (jSONObject4 = jSONObject3.getJSONObject("subSection")) != null) {
            return jSONObject4.getJSONObject(PANEL_SECTION);
        }
        return null;
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Color.parseColor(str2);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return Color.parseColor(str2);
        }
    }

    private static JSONObject g(JSONObject jSONObject) {
        JSONObject f;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97d7ca62", new Object[]{jSONObject});
        }
        JSONObject a2 = a(jSONObject);
        if (a2 == null || (f = f(jSONObject)) == null || (jSONObject2 = f.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject("0")) == null) {
            return null;
        }
        jSONObject3.remove("item");
        jSONObject3.put("item", (Object) a2);
        return jSONObject2;
    }

    private static void a(JSONObject jSONObject, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883d7879", new Object[]{jSONObject, list});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put(VIEW_TYPE, (Object) 1);
        list.add(jSONObject2);
    }

    private static void a(JSONObject jSONObject, List<JSONObject> list, int i) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7209aa", new Object[]{jSONObject, list, new Integer(i)});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("item");
        if (jSONObject3 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < jSONObject3.size()) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject(String.valueOf(i2));
            if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("content")) != null) {
                String string = jSONObject2.getString(MENU_CODE);
                String string2 = jSONObject2.getString(CURRENT_MENU_CODE);
                jSONObject2.put(IS_CATEGORY_SELECT, (Object) Boolean.valueOf(i == i2 && TextUtils.equals(string2, MY_CHANNEL)));
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                jSONObject2.put(CURRENT_MENU_CODE, (Object) string);
                jSONObject4.put(VIEW_TYPE, (Object) Integer.valueOf(jSONObject4.containsKey(VIEW_TYPE) ? jSONObject4.getIntValue(VIEW_TYPE) : 2));
                list.add(jSONObject4);
            }
            i2++;
        }
    }
}
