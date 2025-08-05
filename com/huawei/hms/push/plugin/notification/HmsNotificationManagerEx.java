package com.huawei.hms.push.plugin.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.NotificationEnableReq;
import com.huawei.hms.support.log.HMSLog;
import tb.cxr;
import tb.cxs;
import tb.cxu;

/* loaded from: classes4.dex */
public class HmsNotificationManagerEx {

    /* renamed from: a  reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f7530a;
    private Context b;

    private HmsNotificationManagerEx(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.b = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>((Activity) this.b, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.f7530a = huaweiApi;
        huaweiApi.setKitSdkVersion(61000300);
    }

    private cxr<NotificationStatus> a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return a(ErrorEnum.ERROR_MAIN_THREAD.toApiException());
        }
        if (!a.a()) {
            HMSLog.e("HmsNotificationManagerEx", "operation not supported on device with EMUI lower than 10");
            return a(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
        } else if (((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled()) {
            HMSLog.e("HmsNotificationManagerEx", "App already enabled notification");
            return a(ErrorEnum.ERROR_NOTIFICATION_ENABLED.toApiException());
        } else {
            long j = new PushPreferences(this.b, "hwpush_local_config").getLong("notification_request_time");
            if (j > 0 && System.currentTimeMillis() - j < AuthenticatorCache.MAX_CACHE_TIME) {
                HMSLog.e("HmsNotificationManagerEx", "the frequency is too high");
                return a(ErrorEnum.ERROR_OVER_FLOW_CONTROL_SIZE.toApiException());
            }
            String reportEntry = PushBiUtil.reportEntry(this.b, "push.enableNotification");
            try {
                NotificationEnableReq notificationEnableReq = new NotificationEnableReq();
                notificationEnableReq.setPkgName(this.b.getPackageName());
                cxr doWrite = this.f7530a.doWrite(new b("push.enableNotification", notificationEnableReq, this.b, reportEntry));
                cxu.a(doWrite);
                return doWrite;
            } catch (Exception e) {
                if (!(e.getCause() instanceof ApiException)) {
                    PushBiUtil.reportExit(this.b, "push.enableNotification", reportEntry, ErrorEnum.ERROR_INTERNAL_ERROR);
                    return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
                }
                ApiException apiException = (ApiException) e.getCause();
                PushBiUtil.reportExit(this.b, "push.enableNotification", reportEntry, apiException.getStatusCode());
                return a(apiException);
            }
        }
    }

    private cxr<NotificationStatus> a(Exception exc) {
        cxs cxsVar = new cxs();
        cxsVar.a(exc);
        return cxsVar.a();
    }

    public static HmsNotificationManagerEx getInstance(Activity activity) {
        return new HmsNotificationManagerEx(activity);
    }

    public cxr<NotificationStatus> enableNotification() {
        return a();
    }
}
