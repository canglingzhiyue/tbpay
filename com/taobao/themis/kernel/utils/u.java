package com.taobao.themis.kernel.utils;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J6\u0010\b\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSUserTrackerUtils;", "", "()V", com.taobao.android.tbabilitykit.t.API_GET_PAGE_NAME, "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getSPMCNT", "getUTPageProperties", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getUTParams", "Lcom/alibaba/fastjson/JSONObject;", "updateDefaultPageUTParam", "", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u INSTANCE;

    static {
        kge.a(-1760277948);
        INSTANCE = new u();
    }

    private u() {
    }

    @JvmStatic
    public static final HashMap<String, String> a(com.taobao.themis.kernel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c14b6e50", new Object[]{fVar});
        }
        String str = null;
        String str2 = fVar != null ? fVar.d : null;
        String g = fVar != null ? fVar.g() : null;
        if (fVar != null) {
            str = fVar.h();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        hashMap2.put("miniapp_id", str);
        hashMap2.put("miniapp_trace_id", str2);
        hashMap2.put(com.alibaba.triver.triver_shop.adapter.c.MINIAPP_ORI_URL_KEY, g);
        hashMap2.put("miniapp_type", "miniapp");
        hashMap2.put("pageName", c(fVar));
        hashMap2.put("name", c(fVar));
        hashMap2.put("spm-cnt", INSTANCE.d(fVar));
        return hashMap;
    }

    @JvmStatic
    public static final JSONObject b(com.taobao.themis.kernel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b50db94e", new Object[]{fVar});
        }
        String str = null;
        String str2 = fVar != null ? fVar.d : null;
        String g = fVar != null ? fVar.g() : null;
        if (fVar != null) {
            str = fVar.h();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "miniapp_id", str);
        jSONObject2.put((JSONObject) com.alibaba.triver.triver_shop.adapter.c.MINIAPP_ORI_URL_KEY, g);
        jSONObject2.put((JSONObject) "miniapp_trace_id", str2);
        jSONObject2.put((JSONObject) "miniapp_type", "miniapp");
        return jSONObject;
    }

    @JvmStatic
    public static final String c(com.taobao.themis.kernel.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcabb651", new Object[]{fVar});
        }
        if (fVar == null) {
            return "";
        }
        if (fVar.j() != TMSSolutionType.MINIGAME) {
            return "TMS";
        }
        return "hdkf_" + fVar.h() + ".home";
    }

    public final String d(com.taobao.themis.kernel.f fVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae555c70", new Object[]{this, fVar});
        }
        if (fVar == null) {
            return "";
        }
        String str = "MiniApp_" + fVar.h() + ".pages_index_index.0.0";
        if (n.Z()) {
            String a2 = com.taobao.themis.utils.o.a(fVar.g(), "spm");
            if (a2 != null && a2.length() != 0) {
                z = false;
            }
            if (!z) {
                str = com.taobao.themis.utils.o.a(fVar.g(), "spm");
                kotlin.jvm.internal.q.b(str, "TMSUrlUtils.getUrlParamByKey(instance.url, \"spm\")");
                TMSLogger.d("TMSUserTrackerUtils", "spm:" + str);
                return str;
            }
        }
        if (fVar.j() == TMSSolutionType.MINIGAME) {
            str = "hdkf_" + fVar.h() + ".home.0.0";
        }
        TMSLogger.d("TMSUserTrackerUtils", "spm:" + str);
        return str;
    }

    @JvmStatic
    public static final void e(com.taobao.themis.kernel.f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82a7a31", new Object[]{instance});
            return;
        }
        kotlin.jvm.internal.q.d(instance, "instance");
        Activity o = instance.o();
        IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter != null) {
            iUserTrackerAdapter.updatePageProperties(o, a(instance));
        }
        IUserTrackerAdapter iUserTrackerAdapter2 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter2 != null) {
            iUserTrackerAdapter2.updatePageUtParam(o, b(instance));
        }
        IUserTrackerAdapter iUserTrackerAdapter3 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter3 != null) {
            iUserTrackerAdapter3.updatePageName(o, c(instance));
        }
        IUserTrackerAdapter iUserTrackerAdapter4 = (IUserTrackerAdapter) qpt.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter4 == null) {
            return;
        }
        iUserTrackerAdapter4.updatePageUrl(o, instance.g());
    }
}
