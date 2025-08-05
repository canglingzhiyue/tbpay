package com.taobao.themis.uniapp.solution;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.utils.i;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.thk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"onGetAppManifest", "", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "isLocal", "", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "manifestWrapper", "Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;", "tryCheckUniAppRequestValid", "baseInfo", "Lcom/taobao/themis/kernel/utils/TMSUniAppUtils$UniAppBaseInfo;", "themis_uniapp_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(633905314);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep r9, com.taobao.themis.kernel.utils.i.a r10) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.uniapp.solution.b.a(com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep, com.taobao.themis.kernel.utils.i$a):void");
    }

    public static final void a(TMSBaseLaunchStep onGetAppManifest, boolean z, f instance, TMSMetaInfoWrapper manifestWrapper) {
        com.taobao.themis.uniapp.solution.extension.instance.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205befe5", new Object[]{onGetAppManifest, new Boolean(z), instance, manifestWrapper});
            return;
        }
        q.d(onGetAppManifest, "$this$onGetAppManifest");
        q.d(instance, "instance");
        q.d(manifestWrapper, "manifestWrapper");
        AppManifest v = manifestWrapper.v();
        instance.D().a("manifestLoadEnd");
        thk a2 = com.taobao.themis.kernel.utils.a.a(instance);
        if (a2 != null) {
            a2.a("manifestLoadEnd");
        }
        instance.k().b("isManifestLocal", String.valueOf(z));
        instance.k().a("manifestStepFinish");
        i iVar = i.INSTANCE;
        String g = instance.g();
        q.b(g, "instance.url");
        i.a a3 = iVar.a(g);
        if (v != null && a3 != null && a3.c() != null && a3.d() != null && (aVar = (com.taobao.themis.uniapp.solution.extension.instance.a) instance.b(com.taobao.themis.uniapp.solution.extension.instance.a.class)) != null) {
            String c = a3.c();
            q.a((Object) c);
            String d = a3.d();
            q.a((Object) d);
            aVar.a(c, d);
        }
        String str = onGetAppManifest.c;
        String mLogTraceId = onGetAppManifest.c;
        q.b(mLogTraceId, "mLogTraceId");
        String a4 = com.taobao.themis.kernel.logger.a.a(mLogTraceId);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "manifest", (String) JSONObject.parseObject(JSON.toJSONString(manifestWrapper.v())));
        jSONObject2.put((JSONObject) "isLocal", (String) Boolean.valueOf(z));
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_APPINFO, "ON_GET_MANIFEST", str, a4, jSONObject);
        AppManifest v2 = manifestWrapper.v();
        instance.D().a("manifestSource", (v2 == null || !v2.getPreset()) ? z ? "disk" : "network" : "preset");
    }
}
