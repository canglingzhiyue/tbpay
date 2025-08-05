package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.utils.Util;

/* loaded from: classes4.dex */
public class ForegroundIntentBuilder {

    /* renamed from: a  reason: collision with root package name */
    private Activity f7321a;
    private RequestHeader b;
    private String c;
    private ForegroundInnerHeader d;
    private String e;
    private Context f;

    public ForegroundIntentBuilder(Activity activity) throws IllegalArgumentException {
        if (activity != null) {
            this.f7321a = activity;
            RequestHeader requestHeader = new RequestHeader();
            this.b = requestHeader;
            requestHeader.setSdkVersion(60800300);
            this.c = "";
            ForegroundInnerHeader foregroundInnerHeader = new ForegroundInnerHeader();
            this.d = foregroundInnerHeader;
            foregroundInnerHeader.setApkVersion(30000000);
            return;
        }
        throw new IllegalArgumentException("listener must not be null.");
    }

    public static void registerResponseCallback(String str, BusResponseCallback busResponseCallback) {
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
    }

    public static void unregisterResponseCallback(String str) {
        ForegroundBusResponseMgr.getInstance().unRegisterObserver(str);
    }

    public Intent build() {
        String packageName;
        Context context;
        RequestHeader requestHeader;
        StringBuilder sb;
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(this.f7321a, ForegroundBusDelegate.class.getName());
        Context context2 = this.f;
        if (context2 != null) {
            packageName = context2.getPackageName();
            context = this.f;
        } else {
            packageName = this.f7321a.getPackageName();
            context = this.f7321a;
        }
        String appId = Util.getAppId(context);
        if (this.b.getAppID() == null) {
            requestHeader = this.b;
            sb = new StringBuilder();
            sb.append(appId);
            sb.append("|");
        } else {
            requestHeader = this.b;
            sb = new StringBuilder();
            sb.append(appId);
            sb.append("|");
            sb.append(this.b.getAppID());
        }
        requestHeader.setAppID(sb.toString());
        if (TextUtils.isEmpty(this.b.getTransactionId())) {
            RequestHeader requestHeader2 = this.b;
            requestHeader2.setTransactionId(TransactionIdCreater.getId(requestHeader2.getAppID(), CoreNaming.HUBREQUEST));
        }
        this.b.setPkgName(packageName);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_HEADER, this.b.toJson());
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_BODY, this.c);
        intentStartBridgeActivity.putExtra(ForegroundBusDelegate.HMS_FOREGROUND_REQ_INNER, this.d.toJson());
        if (!TextUtils.isEmpty(this.e)) {
            intentStartBridgeActivity.putExtra(ForegroundBusDelegate.INNER_PKG_NAME, this.e);
        }
        return intentStartBridgeActivity;
    }

    public ForegroundIntentBuilder setAction(String str) {
        this.b.setApiName(str);
        return this;
    }

    public ForegroundIntentBuilder setApiLevel(int i) {
        this.b.setApiLevel(i);
        return this;
    }

    public ForegroundIntentBuilder setApplicationContext(Context context) {
        this.f = context;
        return this;
    }

    public ForegroundIntentBuilder setInnerHms() {
        this.e = this.f7321a.getPackageName();
        return this;
    }

    public ForegroundIntentBuilder setKitSdkVersion(int i) {
        this.b.setKitSdkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setMinApkVersion(int i) {
        this.d.setApkVersion(i);
        return this;
    }

    public ForegroundIntentBuilder setRequestBody(String str) {
        this.c = str;
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str) {
        this.d.setResponseCallbackKey(str);
        return this;
    }

    public ForegroundIntentBuilder setResponseCallback(String str, BusResponseCallback busResponseCallback) {
        this.d.setResponseCallbackKey(str);
        ForegroundBusResponseMgr.getInstance().registerObserver(str, busResponseCallback);
        return this;
    }

    public ForegroundIntentBuilder setServiceName(String str) {
        this.b.setSrvName(str);
        return this;
    }

    public ForegroundIntentBuilder setSubAppId(String str) {
        this.b.setAppID(str);
        return this;
    }

    public ForegroundIntentBuilder setTransactionId(String str) {
        this.b.setTransactionId(str);
        return this;
    }
}
