package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.framework.taskscheduler.MspAsyncTask;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AuthTask extends MspAsyncTask<Object, Void, MspResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity activity;
    private OnAuthListener g;
    private IAlipayCallback h = new IAlipayCallback() { // from class: com.alipay.android.app.pay.AuthTask.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.pay.callback.IAlipayCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32b5bd9d", new Object[]{this, str, str2, new Integer(i), bundle});
                return;
            }
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthTask.startActivity", "className = " + str2 + ", callingPid = " + i);
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt(MspBaseActivity.KEY_ID, i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            intent.setClassName(str, str2);
            if (AuthTask.access$000(AuthTask.this) == null) {
                return;
            }
            AuthTask.access$000(AuthTask.this).startActivity(intent);
        }
    };

    /* loaded from: classes3.dex */
    public interface OnAuthListener {
        void onAuthFailed(Context context, String str, String str2, String str3);

        void onAuthSuccess(Context context, String str, String str2, String str3);
    }

    public static /* synthetic */ Object ipc$super(AuthTask authTask, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute((AuthTask) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Activity access$000(AuthTask authTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("56734d17", new Object[]{authTask}) : authTask.activity;
    }

    public AuthTask(Activity activity, OnAuthListener onAuthListener) {
        this.activity = activity;
        this.g = onAuthListener;
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "AuthTask.AuthTask", "AuthTask init");
    }

    public void auth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4921ea39", new Object[]{this, str});
        } else {
            execute(str);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    /* renamed from: doInBackground */
    public MspResult mo520doInBackground(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResult) ipChange.ipc$dispatch("f31a5ffe", new Object[]{this, objArr});
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthTask.doInBackground", "AuthTask doInBackground startPay ");
        PhoneCashierMspEngine.getMspBase().loadProperties(this.activity);
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String obj = objArr[0].toString();
        if (TextUtils.isEmpty(obj)) {
            return null;
        }
        String paramsError = Result.getParamsError();
        if (this.activity == null) {
            return new MspResult(paramsError);
        }
        MspContextManager.getInstance().registerCallback(this.h, null);
        String startPay = MspEngine.startPay(new MspPaySession(obj, null, false));
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthTask.processSDKAuth", startPay);
        if (this.h != null) {
            MspContextManager.getInstance().unregisterAlipayCallback(this.h);
        }
        return new MspResult(startPay);
    }

    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    public void onPostExecute(MspResult mspResult) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a812f1", new Object[]{this, mspResult});
            return;
        }
        super.onPostExecute((AuthTask) mspResult);
        if (this.g == null) {
            return;
        }
        if (mspResult != null && TextUtils.equals(mspResult.resultStatus, "9000")) {
            this.g.onAuthSuccess(this.activity, mspResult.resultStatus, mspResult.memo, mspResult.result);
            return;
        }
        OnAuthListener onAuthListener = this.g;
        Activity activity = this.activity;
        if (mspResult == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ResultStatus.CANCELED.getStatus());
            str = sb.toString();
        } else {
            str = mspResult.resultStatus;
        }
        onAuthListener.onAuthFailed(activity, str, mspResult == null ? "操作已经取消。" : mspResult.memo, mspResult == null ? "" : mspResult.result);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.activity = null;
        this.h = null;
        this.g = null;
    }
}
