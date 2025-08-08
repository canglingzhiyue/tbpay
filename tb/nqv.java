package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;

/* loaded from: classes7.dex */
public class nqv extends nqr<WeexActivateCellBean, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-431590747);
    }

    public static /* synthetic */ Object ipc$super(nqv nqvVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "weexActivateCell";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public WeexActivateCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexActivateCellBean) ipChange.ipc$dispatch("fe1fd874", new Object[]{this}) : new WeexActivateCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<WeexActivateCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : WeexActivateCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, WeexActivateCellBean weexActivateCellBean, b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d28460", new Object[]{this, jSONObject, weexActivateCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) weexActivateCellBean, (WeexActivateCellBean) bVar);
        WeexBean weexBean = new WeexBean();
        weexBean.type = jSONObject.getString("tItemType");
        if (StringUtils.isEmpty(weexBean.type)) {
            weexBean.type = jSONObject.getString("type");
        }
        weexBean.model = jSONObject;
        JSONObject jSONObject2 = jSONObject.getJSONObject("status");
        if (jSONObject2 != null) {
            weexBean.status = jSONObject2;
        }
        weexActivateCellBean.weexBean = weexBean;
    }
}
