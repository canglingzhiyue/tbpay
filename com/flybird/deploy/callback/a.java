package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.FBFullTplInfo;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.deploy.model.IFBTplInfo;
import java.util.List;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.flybird.deploy.callback.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0256a extends GenericCallbackContext<IFBTplInfo, FBFullTplInfo, FBTemplateContent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.flybird.deploy.callback.GenericCallbackContext
        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FBTemplateDeciderCallback.CallbackContext{requests=" + this.requests + ", locals=" + this.locals + ", isForceUpdated=" + this.isForceUpdated + ", costTimeMillis=" + this.costTimeMillis + ", onlyUpdateFlowType='" + this.onlyUpdateFlowType + "', customInfo=" + this.customInfo + ", errors=" + this.errors + ", successRequests=" + this.successRequests + ", failedRequests=" + this.failedRequests + ", resultCode=" + this.resultCode + ", deploymentType=" + this.deploymentType + '}';
        }
    }

    void onFailure(C0256a c0256a);

    void onSuccess(List<FBTemplateContent> list, C0256a c0256a);
}
