package com.huawei.hms.common.api;

import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class AvailabilityException extends Exception {
    private static final String TAG = "AvailabilityException";
    private String message = null;

    private ConnectionResult generateConnectionResult(int i) {
        HMSLog.i(TAG, "The availability check result is: " + i);
        setMessage(i);
        return new ConnectionResult(i);
    }

    private void setMessage(int i) {
        this.message = i != 21 ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? "INTERNAL_ERROR" : "SERVICE_DISABLED" : "SERVICE_VERSION_UPDATE_REQUIRED" : "SERVICE_MISSING" : "success" : "ANDROID_VERSION_UNSUPPORT";
    }

    public ConnectionResult getConnectionResult(HuaweiApi<? extends Api.ApiOptions> huaweiApi) {
        int isHuaweiMobileServicesAvailable;
        if (huaweiApi == null) {
            HMSLog.e(TAG, "The huaweiApi is null.");
            isHuaweiMobileServicesAvailable = 8;
        } else {
            isHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(huaweiApi.getContext(), 30000000);
        }
        return generateConnectionResult(isHuaweiMobileServicesAvailable);
    }

    public ConnectionResult getConnectionResult(HuaweiApiCallable huaweiApiCallable) {
        int i;
        if (huaweiApiCallable == null || huaweiApiCallable.getHuaweiApi() == null) {
            HMSLog.e(TAG, "The huaweiApi is null.");
            i = 8;
        } else {
            i = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(huaweiApiCallable.getHuaweiApi().getContext(), 30000000);
        }
        return generateConnectionResult(i);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
