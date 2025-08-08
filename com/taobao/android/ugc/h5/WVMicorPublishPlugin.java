package com.taobao.android.ugc.h5;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ugc.service.ICallback;
import com.taobao.android.ugc.service.b;
import com.taobao.android.ugc.service.c;
import tb.kge;

/* loaded from: classes6.dex */
public class WVMicorPublishPlugin extends e implements ICallback {
    public static final String DATA = "data";
    public static final String DISMISS_ACTION = "dismiss";
    public static final String ERROR_CODE = "errorCode";
    public static final String ERROR_MSG = "errorMsg";
    public static final String PUBLISH_ERROR_EVENT_NAME = "WVPublish.Event.Error";
    public static final String PUBLISH_SUCCESS_EVENT_NAME = "WVPublish.Event.Success";
    public static final String RESULT = "result";
    public static final String SHOW_ACTION = "show";
    public static final String TEMPLATE_URL = "templateUrl";
    private WVCallBackContext mCallback;
    private b mMicroPublish;

    static {
        kge.a(-1130353304);
        kge.a(1221683555);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // com.taobao.android.ugc.service.ICallback
    public void onResult(float f, float f2) throws RemoteException {
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        super.initialize(context, iWVWebView);
        init(context);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        super.initialize(context, iWVWebView, obj);
        init(context);
    }

    private void init(Context context) {
        this.mMicroPublish = new c(context);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        this.mCallback = wVCallBackContext;
        try {
        } catch (Exception e) {
            e.printStackTrace();
            this.mCallback.error(e.getMessage());
        }
        if ("show".equalsIgnoreCase(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString(TEMPLATE_URL);
            String string2 = parseObject.getString("data");
            if (StringUtils.isEmpty(string2)) {
                this.mCallback.error("data is invalid!");
                return false;
            }
            this.mMicroPublish.a(string, string2, this);
            this.mCallback.success();
            return true;
        }
        if ("dismiss".equalsIgnoreCase(str)) {
            this.mMicroPublish.a();
            this.mCallback.success();
            return true;
        }
        return false;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        try {
            this.mMicroPublish.a(i, i2, intent);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        this.mMicroPublish.a();
        super.onDestroy();
    }

    @Override // com.taobao.android.ugc.service.ICallback
    public void onSuccess(String str) throws RemoteException {
        r rVar = new r();
        rVar.b();
        rVar.a("result", str);
        this.mCallback.fireEvent(PUBLISH_SUCCESS_EVENT_NAME, rVar.d());
    }

    @Override // com.taobao.android.ugc.service.ICallback
    public void onFailure(String str, String str2) throws RemoteException {
        r rVar = new r();
        rVar.a("errorCode", str);
        rVar.a("errorMsg", str2);
        this.mCallback.fireEvent(PUBLISH_ERROR_EVENT_NAME, rVar.d());
    }
}
