package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.c;
import com.taobao.android.meta.logic.b;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.refactor.e;
import com.taobao.search.refactor.i;
import com.taobao.taobao.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.itt;

/* loaded from: classes7.dex */
public final class npa implements b<e, MSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(725604362);
        kge.a(263684218);
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(MSearchResult result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501b2f18", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        q.c(result, "result");
        if (jSONObject == null) {
            q.a();
        }
        result.newSearch = true;
        i.d(result, jSONObject);
        a(result, jSONObject);
        i.a(result, jSONObject);
        c(result, jSONObject);
        if (result.isNew()) {
            b(result, jSONObject);
            i.c(result, jSONObject);
            i.b(result, jSONObject);
            jSONObject.put((JSONObject) nom.KEY_IS_FULL, "false");
            i.a(result, jSONObject, false);
            if (imnVar == null) {
                q.a();
            }
            b(result, jSONObject, imnVar);
            c(result, jSONObject, imnVar);
        }
        result.getMainInfo().style = ListStyle.WATERFALL;
    }

    private final void a(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf8bab2", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
        mSearchResult.setMainInfo(resultMainInfoBean);
    }

    private final void b(MSearchResult mSearchResult, JSONObject jSONObject, imn imnVar) {
        BaseTypedBean header;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27645f7", new Object[]{this, mSearchResult, jSONObject, imnVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sceneHeader");
        if (jSONObject2 == null || (header = imnVar.g().a(jSONObject2, mSearchResult, mSearchResult.pageInfo)) == null) {
            return;
        }
        q.a((Object) header, "header");
        mSearchResult.addHeader(new c("sceneHeader", header, ""));
    }

    private final void c(MSearchResult mSearchResult, JSONObject jSONObject, imn imnVar) {
        BaseTypedBean bean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d15cd6", new Object[]{this, mSearchResult, jSONObject, imnVar});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("listFooter");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && (bean = imnVar.g().a(jSONObject2, mSearchResult, mSearchResult.pageInfo)) != null) {
                q.a((Object) bean, "bean");
                mSearchResult.addFooter(bean);
            }
        }
    }

    private final void b(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbec2091", new Object[]{this, mSearchResult, jSONObject});
        } else if (a(jSONObject.getJSONArray("tabs"))) {
            TabBean tabBean = new TabBean();
            tabBean.isSelected = true;
            tabBean.param = "ns_all";
            tabBean.showText = com.alibaba.ability.localization.b.a(R.string.app_all);
            mSearchResult.setTabs(p.a(tabBean));
        } else {
            mSearchResult.setTabs(TabBean.parseBean(jSONObject));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r0 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(com.taobao.search.refactor.MSearchResult r6, com.alibaba.fastjson.JSONObject r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.npa.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.String r6 = "b9df8670"
            r0.ipc$dispatch(r6, r1)
            return
        L18:
            boolean r0 = r6.isNew()
            java.lang.String r1 = "updateParams"
            if (r0 == 0) goto L2e
            com.alibaba.fastjson.JSONObject r0 = r7.getJSONObject(r1)
            java.lang.String r2 = "newSearchHeader"
            com.alibaba.fastjson.JSONArray r2 = r7.getJSONArray(r2)
            r5.a(r6, r0, r2)
        L2e:
            java.lang.String r0 = "singleCombo"
            com.alibaba.fastjson.JSONObject r0 = r7.getJSONObject(r0)
            if (r0 == 0) goto L5f
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "totalResults"
            java.lang.Object r4 = r7.get(r3)
            r2.put(r3, r4)
            java.lang.String r3 = "totalPage"
            java.lang.Object r4 = r7.get(r3)
            r2.put(r3, r4)
            java.lang.String r3 = "RN"
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L5d
            java.lang.Object r4 = r7.get(r3)
            r2.put(r3, r4)
        L5d:
            if (r0 != 0) goto L60
        L5f:
            r0 = r7
        L60:
            r5.d(r6, r0)
            boolean r0 = r6.isNew()
            if (r0 == 0) goto L76
            com.alibaba.fastjson.JSONObject r0 = r7.getJSONObject(r1)
            java.lang.String r1 = "newSearchFooter"
            com.alibaba.fastjson.JSONArray r7 = r7.getJSONArray(r1)
            r5.a(r6, r0, r7)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.npa.c(com.taobao.search.refactor.MSearchResult, com.alibaba.fastjson.JSONObject):void");
    }

    private final boolean a(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{this, collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    private final JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "sticky", "false");
        jSONObject3.put((JSONObject) "backgroundColor", "#ffffff");
        JSONObject jSONObject4 = jSONObject;
        jSONObject4.put((JSONObject) "xsearchSection", "true");
        jSONObject4.put((JSONObject) "xsearchSectionStyle", (String) jSONObject2);
        return jSONObject2;
    }

    private final void a(MSearchResult mSearchResult, JSONObject jSONObject, JSONArray jSONArray) {
        BaseCellBean bean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cf4bda", new Object[]{this, mSearchResult, jSONObject, jSONArray});
            return;
        }
        JSONArray jSONArray2 = jSONArray;
        if (a(jSONArray2)) {
            return;
        }
        if (jSONArray == null) {
            q.a();
        }
        int size = jSONArray2.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                noz nozVar = new noz();
                a(nozVar, jSONObject);
                mSearchResult.addCombo(nozVar);
                nozVar.a(jSONObject2.getBoolean("finished"));
                c(nozVar, jSONObject2);
                b(nozVar, jSONObject2);
                a(jSONObject2, "pageInfo", mSearchResult.pageInfo);
                a(jSONObject2, "pageTraceArgs", mSearchResult.getMainInfo().originalPageTraceArgs);
                a(jSONObject2, "pageTraceName", mSearchResult.getMainInfo().pageTraceName);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("pageInfo");
                nozVar.b(jSONObject3);
                ResultMainInfoBean.parseBaseInfo(nozVar.a(), jSONObject2);
                nozVar.a().rn = mSearchResult.getMainInfo().rn;
                a(nozVar.a());
                nozVar.c(jSONObject2.getJSONObject("iconStyle"));
                ListStyle listStyle = nozVar.a().style;
                q.a((Object) listStyle, "combo.mainInfo.style");
                nozVar.a(listStyle);
                nozVar.a(jSONObject2.getString("bizType"));
                JSONArray jSONArray3 = jSONObject2.getJSONArray("comboHeader");
                if (jSONArray3 != null) {
                    int size2 = jSONArray3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                        if (jSONObject4 != null) {
                            JSONObject a2 = a(jSONObject4);
                            if (i2 > 0) {
                                JSONObject jSONObject5 = a2;
                                jSONObject5.put((JSONObject) "sticky", "true");
                                jSONObject5.put((JSONObject) "halfStickyOffset", (String) jSONObject4.get("halfStickyOffset"));
                            }
                            Boolean bool = jSONObject4.getBoolean("visibility");
                            if ((bool == null || bool.booleanValue()) && (bean = mSearchResult.c().f().a(jSONObject4, mSearchResult, jSONObject3)) != null) {
                                q.a((Object) bean, "bean");
                                a(nozVar, jSONObject4, bean);
                            }
                        }
                    }
                }
                a(mSearchResult, jSONObject2.getJSONArray("comboFooter"), nozVar);
                a(mSearchResult, jSONObject2.getJSONArray("itemsArray"), nozVar, jSONObject2);
                nozVar.ac();
            }
        }
    }

    private final void a(noz nozVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb127971", new Object[]{this, nozVar, jSONObject});
        } else if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    Map<String, String> D = nozVar.D();
                    q.a((Object) key, "key");
                    D.put(key, value.toString());
                }
            }
        }
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cfd2ae", new Object[]{this, jSONObject, str, obj});
            return;
        }
        JSONObject jSONObject2 = jSONObject;
        Object obj2 = jSONObject.get(str);
        if (obj2 == null) {
            obj2 = obj;
        }
        jSONObject2.put((JSONObject) str, (String) obj2);
    }

    private final void b(noz nozVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48a0710", new Object[]{this, nozVar, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("mtopApi")) != null) {
            nozVar.a(new itt.a(jSONObject2.getString("api"), jSONObject2.getString("v"), "wsearch"));
            nozVar.a(jSONObject2.getJSONObject("params"));
        } else {
            JSONObject jSONObject3 = new JSONObject();
            nozVar.a(new itt.a(nnd.WSEARCH_TPP_API_NAME_VALUE, "1.0", "wsearch"));
            jSONObject3.put((JSONObject) "appId", noa.VALUE_TPP_NEW_SEARCH_APP_ID);
            nozVar.a(jSONObject3);
        }
    }

    private final void a(MSearchResult mSearchResult, JSONArray jSONArray, noz nozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef3f81d", new Object[]{this, mSearchResult, jSONArray, nozVar});
            return;
        }
        JSONArray jSONArray2 = jSONArray;
        if (a(jSONArray2)) {
            return;
        }
        if (jSONArray == null) {
            q.a();
        }
        int size = jSONArray2.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                a(jSONObject).put((JSONObject) "sectionClip", "true");
                BaseCellBean bean = mSearchResult.c().f().a(jSONObject, mSearchResult, nozVar.R());
                if (bean != null) {
                    List<BaseCellBean> J = nozVar.J();
                    q.a((Object) bean, "bean");
                    J.add(bean);
                    bean.comboType = "footer";
                }
            }
        }
    }

    private final void a(noz nozVar, JSONObject jSONObject, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d5c183", new Object[]{this, nozVar, jSONObject, baseCellBean});
            return;
        }
        if (jSONObject.getBooleanValue("isFilterBar")) {
            nozVar.I().add(baseCellBean);
        } else {
            nozVar.H().add(baseCellBean);
        }
        baseCellBean.comboType = "header";
    }

    private final void b(MSearchResult mSearchResult, JSONArray jSONArray, noz nozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7b095e", new Object[]{this, mSearchResult, jSONArray, nozVar});
            return;
        }
        JSONArray jSONArray2 = jSONArray;
        if (a(jSONArray2)) {
            return;
        }
        if (jSONArray == null) {
            q.a();
        }
        int size = jSONArray2.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                a(jSONObject);
                if (jSONObject.getBooleanValue("isFilterBar")) {
                    Object obj = jSONObject.get("xsearchSectionStyle");
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                    ((JSONObject) obj).put((JSONObject) "sticky", "true");
                }
                BaseCellBean bean = mSearchResult.c().f().a(jSONObject, mSearchResult, nozVar.R());
                if (bean != null) {
                    q.a((Object) bean, "bean");
                    a(nozVar, jSONObject, bean);
                }
            }
        }
    }

    private final void a(MSearchResult mSearchResult, JSONArray jSONArray, noz nozVar, JSONObject jSONObject) {
        int i;
        int i2;
        BaseCellBean bean;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb27a73", new Object[]{this, mSearchResult, jSONArray2, nozVar, jSONObject});
            return;
        }
        JSONArray jSONArray3 = jSONArray2;
        if (a(jSONArray3)) {
            nozVar.a((Boolean) true);
            return;
        }
        JSONArray jSONArray4 = jSONObject.getJSONArray("itemIds");
        if (jSONArray4 != null && (!jSONArray4.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            int size = jSONArray4.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append(jSONArray4.getString(i3));
                sb.append(",");
            }
            if (sb.length() > 0) {
                nozVar.b(sb.substring(0, sb.length() - 1));
            }
            nozVar.m(jSONArray4.size());
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        JSONObject jSONObject2 = jSONObject.getJSONObject("negFeedbackActions");
        if (jSONArray2 == null) {
            q.a();
        }
        int size2 = jSONArray3.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < size2) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
            if (jSONObject3 != null && (bean = mSearchResult.c().f().a(jSONObject3, mSearchResult, nozVar.R())) != null) {
                a(bean, "iconStyle", nozVar.S());
                if (jSONObject3.getBooleanValue("isFilterBar")) {
                    List<BaseCellBean> I = nozVar.I();
                    q.a((Object) bean, "bean");
                    I.add(bean);
                    bean.comboType = "header";
                } else {
                    List<BaseCellBean> L = nozVar.L();
                    q.a((Object) bean, "bean");
                    L.add(bean);
                    a(bean, "negFeedbackActions", jSONObject2);
                    bean.comboType = "item";
                    a(mSearchResult, jSONObject3, bean, nozVar.R());
                    if (TextUtils.equals(jSONObject3.getString(fjp.BIZ_CONTEXT_KEY_CARD_TYPE), "item")) {
                        String string = jSONObject3.getString("item_id");
                        if (jSONObject3.getBooleanValue(nog.PRD_IS_P4P)) {
                            i6++;
                            sb3.append(string);
                            sb3.append(",");
                        } else {
                            i5++;
                            sb2.append(string);
                            sb2.append(",");
                        }
                    }
                }
            }
            i4++;
            jSONArray2 = jSONArray;
        }
        if (!TextUtils.isEmpty(nozVar.W())) {
            return;
        }
        if (i5 > 0) {
            i = 1;
            i2 = 0;
            nozVar.b(sb2.substring(0, sb2.length() - 1));
            nozVar.m(i5);
        } else {
            i = 1;
            i2 = 0;
        }
        if (i6 <= 0) {
            return;
        }
        nozVar.c(sb3.substring(i2, sb3.length() - i));
        nozVar.l(i6);
    }

    private final void a(MSearchResult mSearchResult, JSONObject jSONObject, BaseCellBean baseCellBean, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e6456c", new Object[]{this, mSearchResult, jSONObject, baseCellBean, jSONObject2});
        } else if (!(baseCellBean instanceof MuiseCellBean) || (jSONObject3 = jSONObject.getJSONObject(noa.VALUE_MODULE_DYNAMIC_CARD)) == null) {
        } else {
            jSONObject.remove(noa.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            a(baseCellBean, "dynamicCardBean", jSONObject3);
            dynamicCardBean.mOriginData = jSONObject3;
            dynamicCardBean.mDynamicCellBean = mSearchResult.c().f().a(jSONObject3, mSearchResult, jSONObject2);
            a(baseCellBean, "dynamicCardBean", dynamicCardBean);
        }
    }

    private final void a(BaseCellBean baseCellBean, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2c8d60", new Object[]{this, baseCellBean, str, obj});
        } else if (baseCellBean instanceof MuiseCellBean) {
            Map<String, Object> map = ((MuiseCellBean) baseCellBean).mExtraObj;
            q.a((Object) map, "cellBean.mExtraObj");
            map.put(str, obj);
        } else if (!(baseCellBean instanceof WeexCellBean)) {
        } else {
            Map<String, Object> map2 = ((WeexCellBean) baseCellBean).mExtraObj;
            q.a((Object) map2, "cellBean.mExtraObj");
            map2.put(str, obj);
        }
    }

    private final void c(noz nozVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0194af", new Object[]{this, nozVar, jSONObject});
            return;
        }
        Float f = jSONObject.getFloat("autoPage");
        if (f == null) {
            return;
        }
        nozVar.k((int) f.floatValue());
    }

    private final void a(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944c80b7", new Object[]{this, resultMainInfoBean});
            return;
        }
        resultMainInfoBean.page = rwf.c(1, resultMainInfoBean.page);
        resultMainInfoBean.pageSize = rwf.c(10, resultMainInfoBean.pageSize);
    }

    private final void d(MSearchResult mSearchResult, JSONObject jSONObject) {
        BaseCellBean bean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d2ec4f", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("listComboHeader");
        JSONArray jSONArray2 = jSONObject.getJSONArray("listComboFooter");
        noz nozVar = new noz();
        nozVar.a("all");
        nozVar.c(true);
        nozVar.c(jSONObject.getJSONObject("iconStyle"));
        ResultMainInfoBean.parseBaseInfo(nozVar.a(), jSONObject);
        ListStyle listStyle = nozVar.a().style;
        q.a((Object) listStyle, "combo.mainInfo.style");
        nozVar.a(listStyle);
        a(nozVar.a());
        nozVar.a(jSONObject.getBoolean("finished"));
        a(nozVar, jSONObject.getJSONObject("updateParams"));
        b(nozVar, (JSONObject) null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("comboExtra");
        if (jSONObject2 != null) {
            c(nozVar, jSONObject2);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("pageInfo");
            if (jSONObject3 != null) {
                nozVar.b(jSONObject3);
            }
            JSONArray jSONArray3 = jSONObject2.getJSONArray("pageTraceArgs");
            if (jSONArray3 != null) {
                nozVar.a().pageTraceArgs = ResultMainInfoBean.parseTraceArgs(jSONArray3);
            }
            String string = jSONObject2.getString("pageTraceName");
            if (string != null) {
                nozVar.a().pageTraceName = string;
            }
        }
        b(mSearchResult, jSONArray, nozVar);
        a(mSearchResult, jSONArray2, nozVar);
        JSONArray jSONArray4 = jSONObject.getJSONArray("itemsArray");
        if (jSONArray4 == null) {
            jSONArray4 = jSONObject.getJSONArray("shopArray");
        }
        a(mSearchResult, jSONArray4, nozVar, jSONObject);
        JSONArray jSONArray5 = jSONObject.getJSONArray("listHeader");
        JSONArray jSONArray6 = jSONArray5;
        if (!a(jSONArray6)) {
            if (jSONArray5 == null) {
                q.a();
            }
            int size = jSONArray6.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject4 = jSONArray5.getJSONObject(i);
                if (!jSONObject4.getBooleanValue("preNav") && (bean = mSearchResult.c().f().a(jSONObject4, mSearchResult, nozVar.R())) != null) {
                    List<BaseCellBean> K = nozVar.K();
                    q.a((Object) bean, "bean");
                    K.add(bean);
                    bean.comboFullSpan = true;
                    bean.comboType = "header";
                }
            }
        }
        mSearchResult.addCombo(nozVar);
        nozVar.ac();
    }
}
