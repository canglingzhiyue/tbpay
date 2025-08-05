package com.taobao.android.searchbaseframe.parse;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<BEAN extends TypedBean, CTX> extends a<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ID = "__id__";
    public static final String KEY_TYPE = "tItemType";
    public static final String KEY_TYPE_BACKUP = "type";

    static {
        kge.a(658516753);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((TypedBean) obj), (TypedBean) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(Object obj, JSONObject jSONObject, Object obj2) {
        a((b<BEAN, CTX>) ((TypedBean) obj), jSONObject, (JSONObject) obj2);
    }

    public void a(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbd54c3", new Object[]{this, jSONObject, bean, ctx});
            return;
        }
        bean.type = jSONObject.getString("tItemType");
        if (TextUtils.isEmpty(bean.type)) {
            bean.type = jSONObject.getString("type");
        }
        Long l = jSONObject.getLong(KEY_ID);
        if (l == null) {
            return;
        }
        bean.id = l.longValue();
    }

    public void a(BEAN bean, JSONObject jSONObject, CTX ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9306b5e5", new Object[]{this, bean, jSONObject, ctx});
        } else if (!TextUtils.isEmpty(bean.type)) {
        } else {
            bean.type = jSONObject.getString("type");
        }
    }
}
