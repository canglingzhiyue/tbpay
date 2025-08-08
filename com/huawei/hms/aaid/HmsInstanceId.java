package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.a;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.d;
import com.huawei.hms.opendevice.e;
import com.huawei.hms.opendevice.f;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.o;
import com.huawei.hms.support.log.HMSLog;
import tb.cxr;
import tb.cxs;
import tb.cxu;

/* loaded from: classes4.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";

    /* renamed from: a  reason: collision with root package name */
    private Context f7312a;
    private PushPreferences b;
    private HuaweiApi<Api.ApiOptions.NoOptions> c;

    private HmsInstanceId(Context context) {
        this.f7312a = context.getApplicationContext();
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        this.c = context instanceof Activity ? new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder()) : new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        this.c.setKitSdkVersion(60900300);
    }

    private String a(TokenReq tokenReq, int i) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f7312a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String a2 = h.a(this.f7312a, "push.gettoken");
        try {
            String str = TAG;
            HMSLog.d(str, "getToken req :" + tokenReq.toString());
            f fVar = new f("push.gettoken", tokenReq, this.f7312a, a2);
            fVar.setApiLevel(i);
            return ((TokenResult) cxu.a(this.c.doWrite(fVar))).getToken();
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.f7312a, "push.gettoken", a2, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f7312a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", a2, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a() throws ApiException {
        if (!BaseUtils.getProxyInit(this.f7312a) || ProxyCenter.getProxy() != null || BaseUtils.isMainProc(this.f7312a)) {
            return;
        }
        HMSLog.e(TAG, "Operations in child processes are not supported.");
        throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
    }

    private void a(DeleteTokenReq deleteTokenReq, int i) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.f7312a, subjectId, null);
            return;
        }
        String a2 = h.a(this.f7312a, "push.deletetoken");
        try {
            String b = i.a(this.f7312a).b(subjectId);
            if (deleteTokenReq.isMultiSender() && (StringUtils.isEmpty(b) || b.equals(i.a(this.f7312a).b(null)))) {
                i.a(this.f7312a).removeKey(subjectId);
                HMSLog.i(TAG, "The local subject token is null");
                return;
            }
            deleteTokenReq.setToken(b);
            e eVar = new e("push.deletetoken", deleteTokenReq, a2);
            eVar.setApiLevel(i);
            cxu.a(this.c.doWrite(eVar));
            i.a(this.f7312a).c(subjectId);
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.f7312a, "push.deletetoken", a2, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f7312a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.deletetoken", a2, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a(String str) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!d.e(this.f7312a)) {
            i.a(this.f7312a).removeKey("subjectId");
            return;
        }
        String string = i.a(this.f7312a).getString("subjectId");
        if (StringUtils.isEmpty(string)) {
            i.a(this.f7312a).saveString("subjectId", str);
        } else if (string.contains(str)) {
        } else {
            i a2 = i.a(this.f7312a);
            a2.saveString("subjectId", string + "," + str);
        }
    }

    private void b() throws ApiException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        o.c(context);
        return new HmsInstanceId(context);
    }

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (!this.b.containsKey("aaid")) {
                return;
            }
            this.b.removeKey("aaid");
            this.b.removeKey("creationTime");
            if (!b.e(this.f7312a)) {
                return;
            }
            if (ProxyCenter.getProxy() != null) {
                HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                ProxyCenter.getProxy().deleteAllToken(this.f7312a);
                return;
            }
            DeleteTokenReq b = b.b(this.f7312a);
            b.setDeleteType(1);
            b.setMultiSender(false);
            a(b, 1);
            BaseUtils.deleteAllTokenCache(this.f7312a);
        } catch (ApiException e) {
            throw e;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (!StringUtils.isEmpty(str)) {
            String d = b.d(this.f7312a);
            if (StringUtils.isEmpty(d)) {
                throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
            }
            if (str.equals(d)) {
                deleteToken(null, null);
                return;
            }
            DeleteTokenReq a2 = b.a(this.f7312a, str);
            a2.setMultiSender(true);
            a(a2, 2);
            return;
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq a2 = b.a(this.f7312a, str, str2);
        a2.setMultiSender(false);
        a(a2, 1);
    }

    public cxr<AAIDResult> getAAID() {
        try {
            return cxu.a(new a(this.f7312a.getApplicationContext()));
        } catch (Exception unused) {
            cxs cxsVar = new cxs();
            cxsVar.a((Exception) ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return cxsVar.a();
        }
    }

    public long getCreationTime() {
        try {
            if (!this.b.containsKey("creationTime")) {
                getAAID();
            }
            return this.b.getLong("creationTime");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return b.c(this.f7312a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (!StringUtils.isEmpty(str)) {
            String d = b.d(this.f7312a);
            if (StringUtils.isEmpty(d)) {
                throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
            }
            if (str.equals(d)) {
                return getToken(null, null);
            }
            TokenReq b = b.b(this.f7312a, str);
            b.setAaid(getId());
            b.setMultiSender(true);
            return a(b, 2);
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq b = b.b(this.f7312a, null, str2);
        b.setAaid(getId());
        b.setMultiSender(false);
        i.a(this.f7312a).saveString(this.f7312a.getPackageName(), "1");
        return a(b, 1);
    }
}
