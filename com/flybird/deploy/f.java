package com.flybird.deploy;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import tb.cun;

/* loaded from: classes4.dex */
public class f extends FBTemplateDeciderTemplateModelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String b;
    public final /* synthetic */ FBFullTplInfo c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;
    public final /* synthetic */ CountDownLatch f;
    public final /* synthetic */ FBTemplateDecider g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FBTemplateDecider fBTemplateDecider, a.C0256a c0256a, String str, FBFullTplInfo fBFullTplInfo, ArrayList arrayList, int i, CountDownLatch countDownLatch) {
        super(c0256a);
        this.g = fBTemplateDecider;
        this.b = str;
        this.c = fBFullTplInfo;
        this.d = arrayList;
        this.e = i;
        this.f = countDownLatch;
    }

    @Override // com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback
    public void call(FBTemplateContent fBTemplateContent, String str, int i, long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af7da99", new Object[]{this, fBTemplateContent, str, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
            return;
        }
        a.C0256a c0256a = this.f7211a;
        boolean z2 = c0256a.isForceUpdated || i == 3;
        c0256a.isForceUpdated = z2;
        if (!z2 && i == 0) {
            z = false;
        }
        c0256a.hasUpdated = z;
        c0256a.updateSource = i3;
        try {
            if (!TextUtils.isEmpty(str)) {
                c0256a.locals.add(FBFullTplInfo.fromJSONString(str));
            }
        } catch (Throwable th) {
            FBTemplateDecider fBTemplateDecider = this.g;
            String str2 = this.b;
            String message = th.getMessage();
            Map<String, FBTemplateDecider> map = FBTemplateDecider.f7201a;
            fBTemplateDecider.a(str2, "e:decider:delayedLocalEx", "", message);
            cun.a("_updateAndGetTplInfoEnhancedAsync got an error when adding locals", th);
        }
        if (fBTemplateContent != null || i2 == 0) {
            c0256a.successRequests.add(this.c);
            this.d.add(fBTemplateContent);
            FBTemplateDecider fBTemplateDecider2 = this.g;
            Map<String, FBTemplateDecider> map2 = FBTemplateDecider.f7201a;
            fBTemplateDecider2.a(fBTemplateContent, c0256a);
            cun.c("_triggerDelayedTplUpdateAsync succeed to download #" + this.e + " " + this.c);
        } else {
            FBTemplateDecider fBTemplateDecider3 = this.g;
            Map<String, FBTemplateDecider> map3 = FBTemplateDecider.f7201a;
            fBTemplateDecider3.a((FBTemplateContent) null, c0256a);
            c0256a.failedRequests.add(this.c);
            cun.b("_triggerDelayedTplUpdateAsync failed to download #" + this.e + " " + this.c);
        }
        this.f.countDown();
    }
}
