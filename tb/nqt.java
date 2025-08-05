package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;

/* loaded from: classes7.dex */
public class nqt extends nqr<HistoryCellBean, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-933646715);
    }

    public static /* synthetic */ Object ipc$super(nqt nqtVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_history";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public HistoryCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HistoryCellBean) ipChange.ipc$dispatch("76c5b4d6", new Object[]{this}) : new HistoryCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<HistoryCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : HistoryCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, HistoryCellBean historyCellBean, b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef57403c", new Object[]{this, jSONObject, historyCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) historyCellBean, (HistoryCellBean) bVar);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return;
        }
        historyCellBean.name = jSONObject2.getString("name");
        historyCellBean.needToSync = jSONObject2.getBooleanValue("needToSync");
        historyCellBean.rownnum = jSONObject2.getIntValue("rownum");
        historyCellBean.newStyle = jSONObject2.getBooleanValue("simplyStyle");
    }
}
