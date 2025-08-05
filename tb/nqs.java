package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.CombineHistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;

/* loaded from: classes7.dex */
public class nqs extends nqr<CombineHistoryCellBean, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1409115046);
    }

    public static /* synthetic */ Object ipc$super(nqs nqsVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_combine_history";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public CombineHistoryCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CombineHistoryCellBean) ipChange.ipc$dispatch("dae5b393", new Object[]{this}) : new CombineHistoryCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<CombineHistoryCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : CombineHistoryCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, CombineHistoryCellBean combineHistoryCellBean, b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b41ebf", new Object[]{this, jSONObject, combineHistoryCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) combineHistoryCellBean, (CombineHistoryCellBean) bVar);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return;
        }
        combineHistoryCellBean.name = jSONObject2.getString("name");
        combineHistoryCellBean.needToSync = jSONObject2.getBooleanValue("needToSync");
        combineHistoryCellBean.rownnum = jSONObject2.getIntValue("rownum");
        String string = jSONObject2.getString("picModName");
        if (!TextUtils.isEmpty(string)) {
            combineHistoryCellBean.setPicModName(string);
        }
        String string2 = jSONObject2.getString("showPicMod");
        if (!TextUtils.isEmpty(string2)) {
            combineHistoryCellBean.setShowPicMod("true".equals(string2));
        }
        combineHistoryCellBean.setShowGuide(jSONObject2.getBooleanValue("showPop"));
        combineHistoryCellBean.setGuideUrl(jSONObject2.getString("popUrl"));
        combineHistoryCellBean.setShowFoldButton(jSONObject2.getBooleanValue("showFoldButton"));
        combineHistoryCellBean.newStyle = jSONObject2.getBooleanValue("simplyStyle");
        combineHistoryCellBean.setTitleTextSize(jSONObject2.getString("titleTextSize"));
    }
}
