package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import tb.cxm;
import tb.cxs;

/* loaded from: classes4.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final String f7403a;
    private final String b;
    private Parcelable c;
    private String d;
    private cxm e;
    private int f;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.f = 1;
        this.f7403a = str;
        this.b = str2;
        this.c = null;
        this.d = null;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.f = 1;
        this.f7403a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.f7403a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
        this.f = i;
    }

    protected abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, cxs<ResultT> cxsVar);

    public int getApiLevel() {
        return this.f;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.c;
    }

    public String getRequestJson() {
        return this.b;
    }

    public cxm getToken() {
        return this.e;
    }

    public String getTransactionId() {
        return this.d;
    }

    public String getUri() {
        return this.f7403a;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, cxs<ResultT> cxsVar) {
        cxm cxmVar = this.e;
        if (cxmVar != null && cxmVar.a()) {
            HMSLog.i("TaskApiCall", "This Task has been canceled, uri:" + this.f7403a + ", transactionId:" + this.d);
            return;
        }
        HMSLog.i("TaskApiCall", "doExecute, uri:" + this.f7403a + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.d);
        doExecute(clientt, responseErrorCode, str, cxsVar);
    }

    public void setApiLevel(int i) {
        this.f = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.c = parcelable;
    }

    public void setToken(cxm cxmVar) {
        this.e = cxmVar;
    }

    public void setTransactionId(String str) {
        this.d = str;
    }
}
