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
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.refactor.e;
import com.taobao.search.refactor.i;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.Map;
import tb.itt;

/* loaded from: classes7.dex */
public class now implements b<e, MSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1699749412);
        kge.a(263684218);
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(MSearchResult mSearchResult, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501b2f18", new Object[]{this, mSearchResult, jSONObject, imnVar});
            return;
        }
        mSearchResult.newSearch = true;
        mSearchResult.guideSearch = true;
        i.d(mSearchResult, jSONObject);
        b(mSearchResult, jSONObject);
        i.a(mSearchResult, jSONObject);
        boolean b = b(mSearchResult, jSONObject, imnVar);
        mSearchResult.hasGuideSearchTopHeader = b;
        if (mSearchResult.isNew()) {
            a(mSearchResult);
            i.c(mSearchResult, jSONObject);
            a(mSearchResult, jSONObject, b);
        }
        a(mSearchResult, jSONObject);
        mSearchResult.getMainInfo().style = ListStyle.WATERFALL;
        if (b) {
            return;
        }
        c(mSearchResult, jSONObject, imnVar);
    }

    private boolean b(MSearchResult mSearchResult, JSONObject jSONObject, imn imnVar) {
        BaseTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b27645fb", new Object[]{this, mSearchResult, jSONObject, imnVar})).booleanValue();
        }
        Object obj = jSONObject.get("topHeader");
        JSONObject jSONObject2 = null;
        if (obj instanceof JSONObject) {
            jSONObject2 = (JSONObject) obj;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.size() > 0) {
                jSONObject2 = jSONArray.getJSONObject(0);
            }
        }
        if (jSONObject2 == null || (a2 = imnVar.g().a(jSONObject2, mSearchResult, mSearchResult.pageInfo)) == null) {
            return false;
        }
        mSearchResult.addHeader(new c("topHeader", a2, ""));
        return true;
    }

    private void a(MSearchResult mSearchResult, JSONObject jSONObject, e eVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f198cc55", new Object[]{this, mSearchResult, jSONObject, eVar});
        } else if (mSearchResult.isNew() && (b = a.b(jSONObject, "updateParams")) != null && !b.isEmpty()) {
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    mSearchResult.updateParams.put(entry.getKey(), entry.getValue().toString());
                    eVar.D().put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
    }

    private void a(MSearchResult mSearchResult, JSONObject jSONObject, boolean z) {
        BaseTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11f4e62", new Object[]{this, mSearchResult, jSONObject, new Boolean(z)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tabHeader");
        if (jSONObject2 == null || jSONObject2.isEmpty() || (a2 = mSearchResult.c().g().a(jSONObject2, mSearchResult, mSearchResult.pageInfo)) == null) {
            return;
        }
        if (z) {
            mSearchResult.addHeader(new c("sticky", a2, ""));
        } else {
            mSearchResult.setTabHeader(a2);
        }
    }

    private void a(MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4f7fe", new Object[]{this, mSearchResult});
            return;
        }
        TabBean tabBean = new TabBean();
        tabBean.isSelected = true;
        tabBean.param = "ns_all";
        tabBean.showText = com.alibaba.ability.localization.b.a(R.string.app_all);
        mSearchResult.setTabs(Arrays.asList(tabBean));
    }

    private void a(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf8bab2", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ComboArray");
        JSONObject jSONObject2 = jSONObject.getJSONObject("singleCombo");
        if (jSONArray == null || jSONArray.isEmpty()) {
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                jSONArray = new JSONArray();
                jSONArray.add(jSONObject2);
            } else {
                noz nozVar = new noz();
                nozVar.a((Boolean) true);
                mSearchResult.addCombo(nozVar);
                return;
            }
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            noz nozVar2 = new noz();
            nozVar2.h(true);
            a(mSearchResult, jSONObject, nozVar2);
            Boolean bool = jSONObject3.getBoolean("finished");
            nozVar2.b(bool);
            nozVar2.a(bool);
            b(nozVar2, jSONObject3);
            a(nozVar2, jSONObject3);
            nozVar2.b(jSONObject3.getJSONObject("pageInfo"));
            ResultMainInfoBean.parseBaseInfo(nozVar2.a(), jSONObject3);
            if (jSONObject3.containsKey("n")) {
                nozVar2.a().pageSize = jSONObject3.getIntValue("n");
            }
            a(nozVar2.a());
            nozVar2.c(jSONObject3.getJSONObject("iconStyle"));
            nozVar2.a(nozVar2.a().style);
            nozVar2.a(jSONObject3.getString("bizType"));
            b(nozVar2, jSONObject3, mSearchResult);
            int c = c(nozVar2, jSONObject3, mSearchResult);
            a(nozVar2, jSONObject3, mSearchResult);
            nozVar2.ac();
            if (jSONObject3.getBooleanValue("isAi")) {
                if (c != 0) {
                    nozVar2.g(true);
                }
            }
            mSearchResult.addCombo(nozVar2);
        }
    }

    private void a(noz nozVar, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c307a9c7", new Object[]{this, nozVar, jSONObject, mSearchResult});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("comboFooter");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                JSONObject a2 = a(jSONObject2);
                if (nozVar.Y() == null || !nozVar.Y().booleanValue()) {
                    a2.put("sectionClip", "true");
                }
                BaseCellBean a3 = mSearchResult.c().f().a(jSONObject2, mSearchResult, nozVar.R());
                if (a3 != null) {
                    nozVar.J().add(a3);
                    a3.comboType = "footer";
                }
            }
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sticky", (Object) "false");
        jSONObject2.put("backgroundColor", (Object) "#ffffff");
        jSONObject2.put("xsearchSection", (Object) "true");
        jSONObject.put("xsearchSectionStyle", (Object) jSONObject2);
        jSONObject.put("xsearchSection", "true");
        return jSONObject2;
    }

    private void b(noz nozVar, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562c0a6", new Object[]{this, nozVar, jSONObject, mSearchResult});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("comboHeader");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                JSONObject a2 = a(jSONObject2);
                if (i > 0) {
                    a2.put("sticky", "true");
                    a2.put("halfStickyOffset", (Object) jSONObject2.getString("halfStickyOffset"));
                }
                BaseCellBean a3 = mSearchResult.c().f().a(jSONObject2, mSearchResult, nozVar.R());
                if (a3 != null) {
                    a(nozVar, jSONObject2, a3);
                }
            }
        }
    }

    private void a(noz nozVar, JSONObject jSONObject, BaseCellBean baseCellBean) {
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

    private void c(MSearchResult mSearchResult, JSONObject jSONObject, imn imnVar) {
        BaseTypedBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d15cd6", new Object[]{this, mSearchResult, jSONObject, imnVar});
            return;
        }
        Object obj = jSONObject.get("sceneHeader");
        JSONObject jSONObject2 = null;
        if (obj instanceof JSONObject) {
            jSONObject2 = (JSONObject) obj;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.size() > 0) {
                jSONObject2 = jSONArray.getJSONObject(0);
            }
        }
        if (jSONObject2 == null || (a2 = imnVar.g().a(jSONObject2, mSearchResult, mSearchResult.pageInfo)) == null) {
            return;
        }
        mSearchResult.addHeader(new c("sceneHeader", a2, ""));
    }

    private int c(noz nozVar, JSONObject jSONObject, MSearchResult mSearchResult) {
        int i;
        int i2;
        JSONArray jSONArray;
        BaseCellBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87bdd778", new Object[]{this, nozVar, jSONObject, mSearchResult})).intValue();
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("itemsArray");
        JSONArray jSONArray3 = jSONObject.getJSONArray("itemIds");
        if (jSONArray3 != null && jSONArray3.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                String string = jSONArray3.getString(i3);
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                nozVar.b(sb.substring(0, sb.length() - 1));
                nozVar.m(jSONArray3.size());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        JSONObject jSONObject2 = jSONObject.getJSONObject("negFeedbackActions");
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < jSONArray2.size()) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
            if (jSONObject3 == null || jSONObject3.isEmpty() || (a2 = mSearchResult.c().f().a(jSONObject3, mSearchResult, nozVar.R())) == null) {
                jSONArray = jSONArray2;
            } else {
                i6++;
                jSONArray = jSONArray2;
                a(a2, "iconStyle", nozVar.S());
                if (jSONObject3.getBooleanValue("isFilterBar")) {
                    nozVar.I().add(a2);
                    a2.comboType = "header";
                } else {
                    nozVar.L().add(a2);
                    a(a2, "negFeedbackActions", jSONObject2);
                    a2.comboType = "item";
                    a(mSearchResult, jSONObject3, a2, nozVar.R());
                    if (TextUtils.equals(jSONObject3.getString(fjp.BIZ_CONTEXT_KEY_CARD_TYPE), "item")) {
                        String string2 = jSONObject3.getString("item_id");
                        if (jSONObject3.getBooleanValue(nog.PRD_IS_P4P)) {
                            i7++;
                            sb3.append(string2);
                            sb3.append(",");
                        } else {
                            i5++;
                            sb2.append(string2);
                            sb2.append(",");
                        }
                    }
                }
            }
            i4++;
            jSONArray2 = jSONArray;
        }
        if (!TextUtils.isEmpty(nozVar.W())) {
            return i6;
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
        if (i7 > 0) {
            nozVar.c(sb3.substring(i2, sb3.length() - i));
            nozVar.l(i7);
        }
        return i6;
    }

    private void a(MSearchResult mSearchResult, JSONObject jSONObject, BaseCellBean baseCellBean, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e6456c", new Object[]{this, mSearchResult, jSONObject, baseCellBean, jSONObject2});
        } else if (!(baseCellBean instanceof MuiseCellBean) || (jSONObject3 = jSONObject.getJSONObject(noa.VALUE_MODULE_DYNAMIC_CARD)) == null) {
        } else {
            jSONObject.remove(noa.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = jSONObject3;
            dynamicCardBean.mDynamicCellBean = mSearchResult.c().f().a(jSONObject3, mSearchResult, jSONObject2);
            a(baseCellBean, "dynamicCardBean", dynamicCardBean);
        }
    }

    private void a(BaseCellBean baseCellBean, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2c8d60", new Object[]{this, baseCellBean, str, obj});
        } else if (baseCellBean instanceof MuiseCellBean) {
            ((MuiseCellBean) baseCellBean).mExtraObj.put(str, obj);
        } else if (!(baseCellBean instanceof WeexCellBean)) {
        } else {
            ((WeexCellBean) baseCellBean).mExtraObj.put(str, obj);
        }
    }

    private void a(ResultMainInfoBean resultMainInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("944c80b7", new Object[]{this, resultMainInfoBean});
            return;
        }
        resultMainInfoBean.page = Math.max(1, resultMainInfoBean.page);
        resultMainInfoBean.pageSize = Math.max(resultMainInfoBean.pageSize, 1);
    }

    private void a(noz nozVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb127971", new Object[]{this, nozVar, jSONObject});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("mtopApi");
        String str2 = null;
        if (jSONObject3 != null) {
            str2 = jSONObject3.getString("api");
            str = jSONObject3.getString("v");
            jSONObject2 = jSONObject3.getJSONObject("params");
        } else {
            jSONObject2 = null;
            str = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = nnd.WSEARCH_TPP_API_NAME_VALUE;
        }
        if (TextUtils.isEmpty(str)) {
            str = "1.0";
        }
        nozVar.a(new itt.a(str2, str, "wsearch"));
        nozVar.a(jSONObject2);
    }

    private void b(noz nozVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48a0710", new Object[]{this, nozVar, jSONObject});
        } else {
            nozVar.k((int) jSONObject.getFloatValue("autoPage"));
        }
    }

    private void b(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbec2091", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
        ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
        mSearchResult.setMainInfo(resultMainInfoBean);
    }
}
