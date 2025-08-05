package com.taobao.search.searchdoor.activate.guess;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import tb.kge;
import tb.nqr;

/* loaded from: classes7.dex */
public class a extends nqr<GuessDiscoveryCellBean, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1645269559);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_search_door_guess_discovery";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public GuessDiscoveryCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GuessDiscoveryCellBean) ipChange.ipc$dispatch("36855283", new Object[]{this}) : new GuessDiscoveryCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<GuessDiscoveryCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : GuessDiscoveryCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, GuessDiscoveryCellBean guessDiscoveryCellBean, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8612e9", new Object[]{this, jSONObject, guessDiscoveryCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) guessDiscoveryCellBean, (GuessDiscoveryCellBean) bVar);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return;
        }
        guessDiscoveryCellBean.discoveryVO = (GuessDiscoveryVO) JSON.toJavaObject(jSONObject2, GuessDiscoveryVO.class);
        guessDiscoveryCellBean.preload = bVar.s;
    }
}
