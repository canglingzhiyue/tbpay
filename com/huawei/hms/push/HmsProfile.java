package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import tb.cwx;
import tb.cxr;
import tb.cxs;
import tb.cye;

/* loaded from: classes4.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;
    private static final String c = "HmsProfile";

    /* renamed from: a  reason: collision with root package name */
    private Context f7514a;
    private HuaweiApi<Api.ApiOptions.NoOptions> b;

    private HmsProfile(Context context) {
        this.f7514a = null;
        Preconditions.checkNotNull(context);
        this.f7514a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        this.b = context instanceof Activity ? new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder()) : new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        this.b.setKitSdkVersion(61000300);
    }

    private static String a(Context context) {
        return cwx.a(context).a("client/project_id");
    }

    private cxr<Void> a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            cxs cxsVar = new cxs();
            cxsVar.a((Exception) ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return cxsVar.a();
        }
        if (!TextUtils.isEmpty(str)) {
            String a2 = a(this.f7514a);
            if (TextUtils.isEmpty(a2)) {
                HMSLog.i(c, "agc connect services config missing project id.");
                cxs cxsVar2 = new cxs();
                cxsVar2.a((Exception) ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return cxsVar2.a();
            } else if (str.equals(a2)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String reportEntry = PushBiUtil.reportEntry(this.f7514a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(cye.a(str2));
            profileReq.setPkgName(this.f7514a.getPackageName());
            return this.b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), reportEntry));
        } catch (Exception e) {
            if (!(e.getCause() instanceof ApiException)) {
                cxs cxsVar3 = new cxs();
                PushBiUtil.reportExit(this.f7514a, PushNaming.PUSH_PROFILE, reportEntry, ErrorEnum.ERROR_INTERNAL_ERROR);
                cxsVar3.a((Exception) ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
                return cxsVar3.a();
            }
            cxs cxsVar4 = new cxs();
            ApiException apiException = (ApiException) e.getCause();
            cxsVar4.a((Exception) apiException);
            PushBiUtil.reportExit(this.f7514a, PushNaming.PUSH_PROFILE, reportEntry, apiException.getStatusCode());
            return cxsVar4.a();
        }
    }

    private boolean b(Context context) {
        return c.b(context) >= 110001400;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public cxr<Void> addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    public cxr<Void> addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(c, "add profile type undefined.");
            cxs cxsVar = new cxs();
            cxsVar.a((Exception) ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return cxsVar.a();
        } else if (!TextUtils.isEmpty(str2)) {
            return a(0, str, i, str2);
        } else {
            HMSLog.i(c, "add profile params is empty.");
            cxs cxsVar2 = new cxs();
            cxsVar2.a((Exception) ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return cxsVar2.a();
        }
    }

    public cxr<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public cxr<Void> deleteProfile(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            HMSLog.e(c, "del profile params is empty.");
            cxs cxsVar = new cxs();
            cxsVar.a((Exception) ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return cxsVar.a();
        }
        return a(1, str, -1, str2);
    }

    public boolean isSupportProfile() {
        String str;
        String str2;
        if (c.d(this.f7514a)) {
            if (c.c()) {
                str = c;
                str2 = "current EMUI version below 9.1, not support profile operation.";
            } else if (b(this.f7514a)) {
                return true;
            } else {
                str = c;
                str2 = "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.";
            }
            HMSLog.i(str, str2);
            return false;
        }
        return true;
    }
}
