package com.flybird.deploy;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.FBUpdatePolicy;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import tb.cun;
import tb.ieb;

/* loaded from: classes4.dex */
public class e implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.flybird.deploy.model.b f7212a;
    public final /* synthetic */ com.flybird.deploy.callback.a b;
    public final /* synthetic */ FBTemplateDecider c;

    public e(FBTemplateDecider fBTemplateDecider, com.flybird.deploy.model.b bVar, com.flybird.deploy.callback.a aVar) {
        this.c = fBTemplateDecider;
        this.f7212a = bVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        int i;
        CountDownLatch countDownLatch;
        int i2;
        JSONArray jSONArray;
        String optString;
        FBFullTplInfo fromJSONString;
        String tplId;
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        FBTemplateDecider fBTemplateDecider = this.c;
        com.flybird.deploy.model.b bVar = this.f7212a;
        com.flybird.deploy.callback.a aVar = this.b;
        Map<String, FBTemplateDecider> map = FBTemplateDecider.f7201a;
        fBTemplateDecider.getClass();
        cun.c("_triggerDelayedTplUpdateAsync called on " + fBTemplateDecider + " options: " + bVar);
        ieb.a();
        fBTemplateDecider.a();
        ArrayList arrayList = new ArrayList();
        a.C0256a c0256a = new a.C0256a();
        c0256a.deploymentType = FBUpdatePolicy.DeploymentType.EnhancedDeployment;
        c0256a.customToken = bVar.b();
        c0256a.customInfo.a(bVar.a());
        try {
            String delayedGetWaitQueueTpls = FBTemplateDecider.delayedGetWaitQueueTpls(fBTemplateDecider.j);
            if (StringUtils.isEmpty(delayedGetWaitQueueTpls)) {
                cun.c("_triggerDelayedTplUpdateAsync nothing to update");
                aVar.onSuccess(arrayList, c0256a);
                return;
            }
            JSONArray jSONArray2 = new JSONArray(delayedGetWaitQueueTpls);
            int length = jSONArray2.length();
            cun.c("_triggerDelayedTplUpdateAsync waiting for " + length + " tpl_arr: " + delayedGetWaitQueueTpls);
            CountDownLatch countDownLatch2 = new CountDownLatch(length);
            int i3 = 0;
            while (i3 < length) {
                try {
                    optString = jSONArray2.optString(i3);
                    fromJSONString = FBFullTplInfo.fromJSONString(optString);
                    tplId = fromJSONString.getTplId();
                    c0256a.requests.add(fromJSONString);
                    cun.c("_triggerDelayedTplUpdateAsync trying to download #" + i3 + " " + fromJSONString);
                    str2 = str3;
                    i = i3;
                    countDownLatch = countDownLatch2;
                    i2 = length;
                    jSONArray = jSONArray2;
                } catch (Throwable th) {
                    th = th;
                    str2 = str3;
                    i = i3;
                    countDownLatch = countDownLatch2;
                    i2 = length;
                    jSONArray = jSONArray2;
                }
                try {
                    FBTemplateDecider.basicDownloadTplByTplInfo(fBTemplateDecider.j, optString, new f(fBTemplateDecider, c0256a, tplId, fromJSONString, arrayList, i, countDownLatch));
                    str = str2;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        str = str2;
                        try {
                            fBTemplateDecider.a(str, "e:decider:delayedUpdateEx", str, th.getMessage());
                            c0256a.errors.add(th);
                            cun.a("_triggerDelayedTplUpdateAsync exception", th);
                            countDownLatch.countDown();
                            i3 = i + 1;
                            str3 = str;
                            countDownLatch2 = countDownLatch;
                            length = i2;
                            jSONArray2 = jSONArray;
                        } catch (Throwable th3) {
                            th = th3;
                            fBTemplateDecider.a(str, "e:decider:delayedOverallEx", str, th.getMessage());
                            c0256a.errors.add(th);
                            fBTemplateDecider.a((FBTemplateContent) null, c0256a);
                            cun.a("_triggerDelayedTplUpdateAsync error, cb:" + c0256a, th);
                            aVar.onFailure(c0256a);
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str = str2;
                        fBTemplateDecider.a(str, "e:decider:delayedOverallEx", str, th.getMessage());
                        c0256a.errors.add(th);
                        fBTemplateDecider.a((FBTemplateContent) null, c0256a);
                        cun.a("_triggerDelayedTplUpdateAsync error, cb:" + c0256a, th);
                        aVar.onFailure(c0256a);
                        return;
                    }
                }
                i3 = i + 1;
                str3 = str;
                countDownLatch2 = countDownLatch;
                length = i2;
                jSONArray2 = jSONArray;
            }
            str = str3;
            countDownLatch2.await();
            cun.c("_triggerDelayedTplUpdateAsync all done: " + arrayList + " cb: " + c0256a);
            aVar.onSuccess(arrayList, c0256a);
        } catch (Throwable th5) {
            th = th5;
            str = str3;
        }
    }
}
