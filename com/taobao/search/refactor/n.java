package com.taobao.search.refactor;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import tb.imn;
import tb.ioy;
import tb.ioz;
import tb.iub;
import tb.kge;
import tb.nsq;

/* loaded from: classes7.dex */
public final class n extends nsq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1466833599);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        if (str.hashCode() == 1696138856) {
            super.b((n) ((MetaResult) objArr[0]), (JSONObject) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(imn core, ioy ioyVar) {
        super(core, ioyVar);
        kotlin.jvm.internal.q.c(core, "core");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.b
    public /* synthetic */ void b(BaseSearchResult baseSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17b92a1", new Object[]{this, baseSearchResult, jSONObject});
        } else {
            d((CommonSearchResult) baseSearchResult, jSONObject);
        }
    }

    public void d(CommonSearchResult result, JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009368", new Object[]{this, result, data});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(data, "data");
        result.templatesParseTraceDigest = new ioz();
        Map<String, TemplateBean> a2 = iub.a(data.getJSONArray("templates"), result.templatesParseTraceDigest, result.c());
        if (a2 == null) {
            return;
        }
        if (result.getTemplates() == null) {
            result.setTemplates(a2);
            return;
        }
        Map<String, TemplateBean> templates = result.getTemplates();
        if (templates == null) {
            kotlin.jvm.internal.q.a();
        }
        templates.putAll(a2);
    }

    @Override // tb.nsq, com.taobao.android.meta.data.f, com.taobao.android.searchbaseframe.datasource.impl.b
    public void a(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e020b", new Object[]{this, commonSearchResult, jSONObject});
        } else {
            b(commonSearchResult, jSONObject);
        }
    }

    @Override // com.taobao.android.meta.data.f
    public void b(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1edd2a", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        super.b((n) commonSearchResult, jSONObject);
        c(commonSearchResult, jSONObject);
    }
}
