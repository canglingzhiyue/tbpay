package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.c;
import com.taobao.android.searchbaseframe.parse.TypedBean;

/* loaded from: classes6.dex */
public abstract class isi<BEAN extends BaseTypedBean, RESULT extends BaseSearchResult> extends c<BEAN, RESULT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-959696080);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(isi isiVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((BaseTypedBean) typedBean), (BaseTypedBean) ((BaseSearchResult) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((BaseTypedBean) obj), (BaseTypedBean) ((BaseSearchResult) obj2));
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.c
    public void a(JSONObject jSONObject, BEAN bean, RESULT result) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eaddd7", new Object[]{this, jSONObject, bean, result});
        } else {
            super.a(jSONObject, (JSONObject) bean, (BEAN) result);
        }
    }
}
