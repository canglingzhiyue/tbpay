package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class nqq extends nqr<ActivateCellBean, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(636017860);
    }

    public static /* synthetic */ Object ipc$super(nqq nqqVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_hotsearch";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public ActivateCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivateCellBean) ipChange.ipc$dispatch("d2c81df5", new Object[]{this}) : new ActivateCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<ActivateCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : ActivateCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, ActivateCellBean activateCellBean, b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2636361", new Object[]{this, jSONObject, activateCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) activateCellBean, (ActivateCellBean) bVar);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            activateCellBean.name = jSONObject2.getString("name");
            activateCellBean.rownnum = jSONObject2.getIntValue("rownum");
        }
        JSONArray jSONArray = jSONObject2.getJSONArray("result");
        if (jSONArray == null) {
            return;
        }
        activateCellBean.activateItems = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            if (jSONObject3 != null) {
                ActivateBean activateBean = new ActivateBean();
                activateBean.keyword = jSONObject3.getString("query");
                activateBean.groupType = activateCellBean.type;
                activateCellBean.activateItems.add(activateBean);
            }
        }
    }
}
