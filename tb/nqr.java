package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b;

/* loaded from: classes7.dex */
public abstract class nqr<BEAN extends ActivateTypedBean, CTX extends b> extends com.taobao.android.searchbaseframe.parse.b<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(284482883);
    }

    public static /* synthetic */ Object ipc$super(nqr nqrVar, String str, Object... objArr) {
        if (str.hashCode() == 1019040963) {
            super.a((JSONObject) objArr[0], (JSONObject) ((TypedBean) objArr[1]), (TypedBean) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((ActivateTypedBean) typedBean), (ActivateTypedBean) ((b) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((ActivateTypedBean) obj), (ActivateTypedBean) ((b) obj2));
    }

    public void a(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb156e3b", new Object[]{this, jSONObject, bean, ctx});
            return;
        }
        super.a(jSONObject, (JSONObject) bean, (BEAN) ctx);
        bean.traceBizType = jSONObject.getString("traceBizType");
        bean.traceTmplType = jSONObject.getString("traceTmplType");
        bean.suggestRn = ctx.f19366a;
        bean.tab = ctx.b;
    }
}
