package com.android.dingtalk.share.ddsharemodule;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.message.BaseReq;
import com.android.dingtalk.share.ddsharemodule.message.DDMessage;
import com.android.dingtalk.share.ddsharemodule.message.DDMessageAct;
import com.android.dingtalk.share.ddsharemodule.message.SendAuth;
import com.android.dingtalk.share.ddsharemodule.message.SendMessageToDD;
import com.android.dingtalk.share.ddsharemodule.plugin.DDVersionCheck;
import com.android.dingtalk.share.ddsharemodule.plugin.SignatureCheck;
import tb.kge;

/* loaded from: classes3.dex */
public class DDShareApiV2 implements IDDShareApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DDShareApiV2";
    private String mAppId;
    private Context mContext;
    private boolean mNeedSignatureCheck;

    static {
        kge.a(958000514);
        kge.a(-648572231);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean isDDSupportDingAPI(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b843c54e", new Object[]{this, context})).booleanValue();
        }
        return false;
    }

    public DDShareApiV2(Context context, String str, boolean z) {
        this.mContext = context;
        this.mAppId = str;
        this.mNeedSignatureCheck = z;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean registerApp(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b073d493", new Object[]{this, str})).booleanValue() : registerApp(this.mContext, str);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public void unregisterApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92370e4c", new Object[]{this});
        } else {
            unregisterApp(this.mContext);
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean isDDAppInstalled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("598d85ae", new Object[]{this})).booleanValue() : isDDAppInstalled(this.mContext);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean handleIntent(Intent intent, IDDAPIEventHandler iDDAPIEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a8975d1", new Object[]{this, intent, iDDAPIEventHandler})).booleanValue();
        }
        String stringExtra = intent.getStringExtra(ShareConstant.EXTRA_MESSAGE_APP_PACKAGE_NAME);
        if (stringExtra != null && stringExtra.length() != 0 && iDDAPIEventHandler != null) {
            int intExtra = intent.getIntExtra(ShareConstant.EXTRA_COMMAND_TYPE, 0);
            if (intExtra == 1) {
                iDDAPIEventHandler.onResp(new SendMessageToDD.Resp(intent.getExtras()));
                return true;
            } else if (intExtra == 2) {
                iDDAPIEventHandler.onResp(new SendMessageToDD.Resp(intent.getExtras()));
                return true;
            } else if (intExtra == 3) {
                iDDAPIEventHandler.onReq(new SendMessageToDD.Req(intent.getExtras()));
                return true;
            } else if (intExtra == 4) {
                iDDAPIEventHandler.onReq(new SendMessageToDD.Req(intent.getExtras()));
                return true;
            } else if (intExtra != 100) {
                return false;
            } else {
                SendAuth.Resp resp = new SendAuth.Resp();
                resp.fromBundle(intent.getExtras());
                iDDAPIEventHandler.onResp(resp);
                return true;
            }
        }
        Log.e(RPCDataItems.SWITCH_TAG_LOG, "invalid argument");
        return false;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean isDDSupportAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63294ca0", new Object[]{this})).booleanValue() : isDDSupportAPI(this.mContext);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean isDDSupportDingAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7381e842", new Object[]{this})).booleanValue() : isDDSupportDingAPI(this.mContext);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public int getDDSupportAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6118f6bb", new Object[]{this})).intValue() : getDDSupportAPI(this.mContext);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean openDDApp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac225282", new Object[]{this})).booleanValue() : openDDApp(this.mContext);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean sendReq(BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b079ca36", new Object[]{this, baseReq})).booleanValue() : sendReq(this.mContext, baseReq);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean sendReqToDing(BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30fc122f", new Object[]{this, baseReq})).booleanValue() : sendReqToDing(this.mContext, baseReq);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean registerApp(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a4e071", new Object[]{this, context, str})).booleanValue();
        }
        if (!checkSumConsistent(context, ShareConstant.DD_APP_PACKAGE) && !checkSumConsistent(context, ShareConstant.ALI_DD_APP_PACKAGE)) {
            Log.e(TAG, "register app failed for alipay app signature check failed");
            return false;
        }
        if (str != null) {
            this.mAppId = str;
        }
        if (context != null) {
            String str2 = "register app " + context.getPackageName();
            DDMessage.send(context, ShareConstant.DD_APP_PACKAGE, ShareConstant.PERMISSION_ACTION_HANDLE_APP_REGISTER, ShareConstant.ACTION_APP_REGISTER + str);
            return true;
        }
        Log.e(TAG, "register app context null");
        return false;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public void unregisterApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b67eafc", new Object[]{this, context});
        } else if (!checkSumConsistent(context, ShareConstant.DD_APP_PACKAGE) && !checkSumConsistent(context, ShareConstant.ALI_DD_APP_PACKAGE)) {
            Log.e(TAG, "unregister app failed for dd app signature check failed");
        } else {
            String str = this.mAppId;
            if (str != null && str.length() != 0 && context != null) {
                String str2 = "unregister app " + context.getPackageName();
                DDMessage.send(context, ShareConstant.DD_APP_PACKAGE, ShareConstant.PERMISSION_ACTION_HANDLE_APP_UNREGISTER, ShareConstant.ACTION_APP_UNREGISTER + this.mAppId);
                return;
            }
            Log.e(TAG, "unregisterApp fail, appId is empty or context null");
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean isDDAppInstalled(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3441d962", new Object[]{this, context})).booleanValue() : innerIsDDAppInstalled(context, ShareConstant.DD_APP_PACKAGE) || innerIsDDAppInstalled(context, ShareConstant.ALI_DD_APP_PACKAGE);
    }

    private boolean innerIsDDAppInstalled(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32ac5e76", new Object[]{this, context, str})).booleanValue();
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 64) != null) {
                if (checkSumConsistent(context, str)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
        }
        return false;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean isDDSupportAPI(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74c166b0", new Object[]{this, context})).booleanValue() : getDDSupportAPI(context) >= 20151201;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public int getDDSupportAPI(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("543f45f3", new Object[]{this, context})).intValue();
        }
        if (!isDDAppInstalled(context)) {
            Log.e(TAG, "open dd app failed, not installed or signature check failed");
            return 0;
        }
        int sdkVersionFromMetaData = DDVersionCheck.getSdkVersionFromMetaData(context, 0);
        Log.e(TAG, "getDDSupportAPI: result = " + sdkVersionFromMetaData);
        return sdkVersionFromMetaData;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.IDDShareApi
    public boolean openDDApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e663630e", new Object[]{this, context})).booleanValue();
        }
        if (!isDDAppInstalled(context)) {
            Log.e(TAG, "open dd app failed, not installed or signature check failed");
            return false;
        }
        try {
            Log.e(TAG, "openDDApp: ");
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(ShareConstant.DD_APP_PACKAGE));
            return true;
        } catch (Exception e) {
            Log.e(TAG, "start dd Main Activity fail, exception = " + e.getMessage());
            return false;
        }
    }

    private boolean sendReq(Context context, BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e90cc24", new Object[]{this, context, baseReq})).booleanValue();
        }
        if (!isDDSupportAPI(context)) {
            Log.e(TAG, "sendReq failed for dd not supported baseRequest");
            return false;
        } else if (baseReq.getSupportVersion() > getDDSupportAPI(context)) {
            Log.e(TAG, "sendReq failed for dd not supported baseRequest,minSupportVersion:" + baseReq.getSupportVersion() + ",dingtalkSupportSdkVersion:" + getDDSupportAPI(context));
            return false;
        } else if (!checkSumConsistent(context, ShareConstant.DD_APP_PACKAGE) && !checkSumConsistent(context, ShareConstant.ALI_DD_APP_PACKAGE)) {
            Log.e(TAG, "sendReq failed for dd app signature check failed");
            return false;
        } else if (!baseReq.checkArgs()) {
            Log.e(TAG, "sendReq checkArgs fail");
            return false;
        } else {
            Log.e(TAG, "sendReq: ");
            Bundle bundle = new Bundle();
            baseReq.attachContext(context);
            baseReq.toBundle(bundle);
            if (baseReq.getType() == 100) {
                Log.e(TAG, "sendReq: dd auth");
                return DDMessageAct.sendDDAuth(context, this.mAppId, bundle);
            }
            Log.e(TAG, "sendReq: dd friend");
            return DDMessageAct.sendDDFriend(context, this.mAppId, bundle);
        }
    }

    private boolean sendReqToDing(Context context, BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66be3e4b", new Object[]{this, context, baseReq})).booleanValue();
        }
        if (!isDDSupportDingAPI(context)) {
            Log.e(TAG, "sendReq failed for dd not supported ding");
            return false;
        } else if (!checkSumConsistent(context, ShareConstant.DD_APP_PACKAGE) && !checkSumConsistent(context, ShareConstant.ALI_DD_APP_PACKAGE)) {
            Log.e(TAG, "sendReq failed for dd app signature check failed");
            return false;
        } else if (!baseReq.checkArgs()) {
            Log.e(TAG, "sendReq checkArgs fail");
            return false;
        } else {
            Bundle bundle = new Bundle();
            baseReq.toBundle(bundle);
            return DDMessageAct.sendDing(context, this.mAppId, bundle);
        }
    }

    public boolean checkSumConsistent(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24c324fa", new Object[]{this, context, str})).booleanValue();
        }
        if (!this.mNeedSignatureCheck) {
            return true;
        }
        boolean equals = TextUtils.equals(SignatureCheck.getMD5Signature(context, str), ShareConstant.DD_APP_SIGNATURE);
        Log.e(TAG, "checkSumConsistent: result = " + equals + ",packageName = " + str);
        return equals;
    }
}
