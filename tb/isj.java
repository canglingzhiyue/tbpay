package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.nx3.bean.a;
import com.taobao.android.searchbaseframe.parse.c;

/* loaded from: classes6.dex */
public class isj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c<BaseTypedBean, BaseSearchResult> f29278a;

    static {
        kge.a(1207329370);
    }

    public isj(imn imnVar) {
        this.f29278a = new c<>(imnVar, new com.taobao.android.searchbaseframe.nx3.bean.c(), new a());
    }

    public void a(isi<? extends BaseTypedBean, ? extends BaseSearchResult> isiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4711f9", new Object[]{this, isiVar});
        } else {
            this.f29278a.a(isiVar);
        }
    }

    public BaseTypedBean a(JSONObject jSONObject, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseTypedBean) ipChange.ipc$dispatch("96179e5f", new Object[]{this, jSONObject, baseSearchResult}) : a(jSONObject, baseSearchResult, null);
    }

    public BaseTypedBean a(JSONObject jSONObject, BaseSearchResult baseSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("25c2b34f", new Object[]{this, jSONObject, baseSearchResult, jSONObject2});
        }
        BaseTypedBean baseTypedBean = (BaseTypedBean) this.f29278a.a(jSONObject, (JSONObject) baseSearchResult);
        if (baseTypedBean instanceof WeexBean) {
            ((WeexBean) baseTypedBean).pageInfoExtraStatus = jSONObject2;
        } else if (baseTypedBean instanceof MuiseBean) {
            ((MuiseBean) baseTypedBean).pageInfoExtraStatus = jSONObject2;
        }
        return baseTypedBean;
    }

    public static boolean a(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb896025", new Object[]{baseTypedBean})).booleanValue() : baseTypedBean instanceof WeexBean;
    }

    public static boolean b(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aeb51366", new Object[]{baseTypedBean})).booleanValue() : baseTypedBean instanceof MuiseBean;
    }
}
