package com.taobao.dxng.kmp_api_exporter;

import com.alibaba.ability.impl.log.LogAbility;
import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.f;
import com.taobao.trtc.api.TrtcConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import tb.aln;
import tb.alq;
import tb.kge;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, "", "api", "", "params", "", "", "error", "Lcom/taobao/dxng/kmp_api_exporter/Log$Companion;", "Lcom/taobao/dxng/kmp_api_exporter/LogErrorParams;", LogAbility.API_WARN, "Lcom/taobao/dxng/kmp_api_exporter/LogWarnParams;", "info", "Lcom/taobao/dxng/kmp_api_exporter/LogInfoParams;", "debug", "Lcom/taobao/dxng/kmp_api_exporter/LogDebugParams;", "kmp_api_exporter_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1854492660);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ExecuteResult it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34013fd1", new Object[]{it});
        } else {
            kotlin.jvm.internal.q.d(it, "it");
        }
    }

    public static final void a(String api, Map<String, ? extends Object> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{api, params});
            return;
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(params, "params");
        new LogAbility().execute(api, new alq(), params, new aln($$Lambda$i$GfLnbjHqh4c0orLGTkR0eDv_fk.INSTANCE));
    }

    public static final void a(f.a aVar, g params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e0a40e", new Object[]{aVar, params});
            return;
        }
        kotlin.jvm.internal.q.d(aVar, "<this>");
        kotlin.jvm.internal.q.d(params, "params");
        a("error", ai.a(kotlin.j.a("event", params.a()), kotlin.j.a("errorCode", params.b()), kotlin.j.a("errorMessage", params.c()), kotlin.j.a(TrtcConstants.TRTC_PARAMS_EXTENSION, params.d()), kotlin.j.a("id", params.e()), kotlin.j.a("parentID", params.f())));
    }

    public static final void a(f.a aVar, h params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e1186d", new Object[]{aVar, params});
            return;
        }
        kotlin.jvm.internal.q.d(aVar, "<this>");
        kotlin.jvm.internal.q.d(params, "params");
        a("info", ai.a(kotlin.j.a("event", params.a()), kotlin.j.a(TrtcConstants.TRTC_PARAMS_EXTENSION, params.b()), kotlin.j.a("id", params.c()), kotlin.j.a("parentID", params.d())));
    }
}
