package com.flybird.deploy.callback;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.CustomInfoMap;
import com.flybird.deploy.model.FBUpdatePolicy;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class GenericCallbackContext<REQ_INFO_TYPE, LOCAL_INFO_TYPE, RESULT_TYPE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long costTimeMillis;
    public Object customToken;
    public FBUpdatePolicy.DeploymentType deploymentType;
    public boolean hasUpdated;
    public boolean isForceUpdated;
    public String onlyUpdateFlowType;
    public final ArrayList<REQ_INFO_TYPE> requests = new ArrayList<>();
    public final ArrayList<LOCAL_INFO_TYPE> locals = new ArrayList<>();
    public final CustomInfoMap customInfo = CustomInfoMap.a();
    public final ArrayList<Throwable> errors = new ArrayList<>();
    public final ArrayList<REQ_INFO_TYPE> successRequests = new ArrayList<>();
    public ArrayList<REQ_INFO_TYPE> failedRequests = new ArrayList<>();
    public int resultCode = -1;
    public int updateSource = 0;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GenericCallbackContext{requests=" + this.requests + ", locals=" + this.locals + ", isForceUpdated=" + this.isForceUpdated + ", costTimeMillis=" + this.costTimeMillis + ", onlyUpdateFlowType='" + this.onlyUpdateFlowType + "', customInfo=" + this.customInfo + ", errors=" + this.errors + ", successRequests=" + this.successRequests + ", failedRequests=" + this.failedRequests + ", resultCode=" + this.resultCode + ", deploymentType=" + this.deploymentType + '}';
    }
}
