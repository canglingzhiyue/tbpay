package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* loaded from: classes8.dex */
public abstract class nsu<BEAN extends BaseTypedBean> extends isi<BEAN, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-734703494);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(nsu nsuVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(org.json.JSONObject jSONObject, BEAN bean, CommonSearchResult commonSearchResult) throws Exception;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isi, com.taobao.android.searchbaseframe.datasource.impl.c
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult) throws Exception {
        a(jSONObject, (JSONObject) baseTypedBean, (CommonSearchResult) baseSearchResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isi, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((BaseTypedBean) typedBean), (CommonSearchResult) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.isi, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((BaseTypedBean) obj), (CommonSearchResult) obj2);
    }

    public void a(JSONObject jSONObject, BEAN bean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ab6dde", new Object[]{this, jSONObject, bean, commonSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) bean, (BEAN) commonSearchResult);
        String jSONString = jSONObject.toJSONString();
        if (StringUtils.isEmpty(jSONString)) {
            k.a("ModAdapterParser", "beanStr is empty");
            return;
        }
        try {
            a(new org.json.JSONObject(jSONString), (org.json.JSONObject) bean, commonSearchResult);
        } catch (Exception unused) {
            k.a("ModAdapterParser", "fail to create old json object");
        }
    }
}
