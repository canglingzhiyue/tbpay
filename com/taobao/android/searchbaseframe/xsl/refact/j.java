package com.taobao.android.searchbaseframe.xsl.refact;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import java.util.ArrayList;
import java.util.List;
import tb.htg;
import tb.imn;
import tb.itk;
import tb.iub;
import tb.kge;

/* loaded from: classes6.dex */
public final class j implements com.taobao.android.meta.logic.b<htg, XslSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-226902029);
        kge.a(263684218);
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(XslSearchResult result, JSONObject jSONObject, imn imnVar) {
        ArrayList<TabBean> createDefaultTabs;
        ArrayList<TabBean> arrayList;
        BaseCellBean a2;
        JSONObject jSONObject2;
        BaseTypedBean a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684c445c", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        if (jSONObject == null) {
            return;
        }
        g gVar = new g();
        result.addCombo(gVar);
        ResultMainInfoBean parse = ResultMainInfoBean.parse(jSONObject.getJSONObject("pageInfo"));
        if (parse == null) {
            parse = ResultMainInfoBean.createDefault();
        }
        result.setMainInfo(parse);
        ResultMainInfoBean mainInfo = result.getMainInfo();
        kotlin.jvm.internal.q.a((Object) mainInfo, "result.mainInfo");
        gVar.a(mainInfo);
        ListStyle listStyle = result.getMainInfo().style;
        kotlin.jvm.internal.q.a((Object) listStyle, "result.mainInfo.style");
        gVar.a(listStyle);
        if (gVar.a().page == 0) {
            gVar.a().page = 1;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("pageInfo");
        ArrayList<com.taobao.android.meta.data.c> arrayList2 = result.topHeaders;
        kotlin.jvm.internal.q.a((Object) arrayList2, "result.topHeaders");
        a("topHeader", jSONObject, arrayList2, "", result, jSONObject3);
        JSONObject jSONObject4 = jSONObject.getJSONObject("tab");
        if (jSONObject4 != null && (a3 = result.c().g().a(jSONObject4, result, jSONObject3)) != null) {
            kotlin.jvm.internal.q.a((Object) a3, "result.c().modParserRegi…            ?: return@let");
            result.tabHeaders.add(new com.taobao.android.meta.data.c("", a3, ""));
        }
        a("foldHeader", jSONObject, result.getHeaders(), itk.TYPE_FOLD, result, jSONObject3);
        a("stickyHeader", jSONObject, result.getHeaders(), "sticky", result, jSONObject3);
        a("listHeader", jSONObject, result.getHeaders(), "list", result, jSONObject3);
        JSONArray jSONArray = jSONObject.getJSONArray("listFooter");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                BaseTypedBean a4 = result.c().g().a(jSONArray.getJSONObject(i), result, jSONObject3);
                if (a4 != null) {
                    kotlin.jvm.internal.q.a((Object) a4, "result.c().modParserRegi…              ?: continue");
                    result.addFooter(a4);
                }
            }
        }
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(XslMUSComponent.KEY_ATMOSPHERE)) != null) {
            result.setAtmosphereListBgColor(jSONObject2.getString("listBgColor"));
            String string = jSONObject2.getString("type");
            String string2 = jSONObject2.getString("url");
            boolean booleanValue = jSONObject2.getBooleanValue("animate");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                result.setAtmosphereType(string);
                result.setAtmosphereUrl(string2);
                result.setAtmosphereAnim(booleanValue);
            }
        }
        result.setTemplates(iub.a(jSONObject.getJSONArray("templates"), result.c()));
        JSONArray jSONArray2 = jSONObject.getJSONArray("listItems");
        if (jSONArray2 != null) {
            int size2 = jSONArray2.size();
            gVar.c(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i2);
                if (jSONObject5 != null && (a2 = result.c().f().a(jSONObject5, result, jSONObject3)) != null) {
                    kotlin.jvm.internal.q.a((Object) a2, "result.c().cellParserReg…              ?: continue");
                    gVar.b(a2);
                    a2.pagePos = i2;
                    a2.pageSize = size2;
                    a2.pageNo = gVar.a().page;
                }
            }
            result.addCells(gVar.w());
        }
        if (!gVar.f()) {
            gVar.a().finish = true;
        }
        JSONObject jSONObject6 = jSONObject.getJSONObject("tab");
        if (jSONObject6 != null) {
            if (!jSONObject6.containsKey("tabCount")) {
                arrayList = TabBean.createDefaultTabs();
            } else {
                int intValue = jSONObject6.getIntValue("tabCount");
                if (intValue == 0) {
                    arrayList = TabBean.createDefaultTabs();
                } else {
                    ArrayList<TabBean> arrayList3 = new ArrayList<>(intValue);
                    int intValue2 = jSONObject6.getIntValue("defaultIndex");
                    int i3 = 0;
                    while (i3 < intValue) {
                        TabBean tabBean = new TabBean();
                        tabBean.bizName = "tab" + i3;
                        tabBean.isSelected = i3 == intValue2;
                        tabBean.showText = "";
                        tabBean.type = "native";
                        arrayList3.add(tabBean);
                        i3++;
                    }
                    arrayList = arrayList3;
                }
            }
            if (arrayList != null) {
                createDefaultTabs = arrayList;
                result.setTabs(createDefaultTabs);
            }
        }
        createDefaultTabs = TabBean.createDefaultTabs();
        result.setTabs(createDefaultTabs);
    }

    private final void a(String str, JSONObject jSONObject, List<com.taobao.android.meta.data.c> list, String str2, XslSearchResult xslSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab851587", new Object[]{this, str, jSONObject, list, str2, xslSearchResult, jSONObject2});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            BaseTypedBean a2 = xslSearchResult.c().g().a(jSONArray.getJSONObject(i), xslSearchResult, jSONObject2);
            if (a2 != null) {
                kotlin.jvm.internal.q.a((Object) a2, "result.c().modParserRegi…              ?: continue");
                list.add(new com.taobao.android.meta.data.c(str2, a2, ""));
            }
        }
    }
}
