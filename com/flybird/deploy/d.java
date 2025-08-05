package com.flybird.deploy;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.callback.FBTemplateDeciderTemplateModelCallback;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import java.util.Collections;
import java.util.Map;
import tb.cun;

/* loaded from: classes4.dex */
public class d extends FBTemplateDeciderTemplateModelCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String b;
    public final /* synthetic */ FBFullTplInfo c;
    public final /* synthetic */ com.flybird.deploy.callback.a d;
    public final /* synthetic */ FBTemplateDecider e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FBTemplateDecider fBTemplateDecider, a.C0256a c0256a, String str, FBFullTplInfo fBFullTplInfo, com.flybird.deploy.callback.a aVar) {
        super(c0256a);
        this.e = fBTemplateDecider;
        this.b = str;
        this.c = fBFullTplInfo;
        this.d = aVar;
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
        c0256a.resultCode = i2;
        c0256a.isForceUpdated = i == 3;
        if (i == 0) {
            z = false;
        }
        c0256a.hasUpdated = z;
        c0256a.costTimeMillis = j;
        c0256a.updateSource = i3;
        try {
            if (!TextUtils.isEmpty(str)) {
                c0256a.locals.add(FBFullTplInfo.fromJSONString(str));
            }
        } catch (Throwable th) {
            FBTemplateDecider fBTemplateDecider = this.e;
            String str2 = this.b;
            String message = th.getMessage();
            Map<String, FBTemplateDecider> map = FBTemplateDecider.f7201a;
            fBTemplateDecider.a(str2, "e:decider:enhanceLocalEx", "", message);
            cun.a("_updateAndGetTplInfoEnhancedAsync got an error when adding locals", th);
        }
        if (fBTemplateContent == null) {
            cun.b("_updateAndGetTplInfoEnhancedAsync failed on " + this + " tplId: " + this.c + " callback ctx: " + c0256a);
            c0256a.failedRequests.add(this.c);
            FBTemplateDecider fBTemplateDecider2 = this.e;
            Map<String, FBTemplateDecider> map2 = FBTemplateDecider.f7201a;
            fBTemplateDecider2.a((FBTemplateContent) null, c0256a);
            this.d.onFailure(c0256a);
            return;
        }
        c0256a.successRequests.add(this.c);
        fBTemplateContent.fillTplTrace(this.c.getTplTrace());
        cun.c("_updateAndGetTplInfoEnhancedAsync success on " + this + " tplId: " + this.c + " callback ctx: " + c0256a);
        FBTemplateDecider fBTemplateDecider3 = this.e;
        Map<String, FBTemplateDecider> map3 = FBTemplateDecider.f7201a;
        fBTemplateDecider3.a(fBTemplateContent, c0256a);
        this.d.onSuccess(Collections.singletonList(fBTemplateContent), c0256a);
    }
}
