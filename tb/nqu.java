package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.MuiseActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;

/* loaded from: classes7.dex */
public class nqu extends nqr<MuiseActivateCellBean, b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-528939177);
    }

    public static /* synthetic */ Object ipc$super(nqu nquVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "muiseActivateCell";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public MuiseActivateCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseActivateCellBean) ipChange.ipc$dispatch("270c6104", new Object[]{this}) : new MuiseActivateCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<MuiseActivateCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : MuiseActivateCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, MuiseActivateCellBean muiseActivateCellBean, b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5caeaa", new Object[]{this, jSONObject, muiseActivateCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) muiseActivateCellBean, (MuiseActivateCellBean) bVar);
        MuiseBean muiseBean = new MuiseBean();
        muiseBean.type = jSONObject.getString("tItemType");
        if (TextUtils.isEmpty(muiseBean.type)) {
            muiseBean.type = jSONObject.getString("type");
        }
        muiseBean.model = jSONObject;
        muiseActivateCellBean.muiseBean = muiseBean;
    }
}
