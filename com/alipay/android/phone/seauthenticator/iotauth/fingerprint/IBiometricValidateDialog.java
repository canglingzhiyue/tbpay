package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.security.mobile.auth.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public abstract class IBiometricValidateDialog implements AuthenticatorManager.AuthNotify {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public interface IDialogActionListener {
        public static final int ACTION_FALLBACK = 3;
        public static final int ACTION_SWITCH = 4;
        public static final int ACTION_SYSTEM_CANCEL = 2;
        public static final int ACTION_USER_CANCEL = 1;

        void onAction(int i);
    }

    public abstract void dismiss(int i);

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthSuccess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7ea4c5", new Object[]{this, context});
        }
    }

    public abstract Dialog showDialog(Context context, int i, String str, IDialogActionListener iDialogActionListener);

    public abstract void updateMsg(String str, int i, int i2);

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onStartAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733daaf6", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_start_title);
        }
        updateMsg(clientText, 0, -16777216);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onProcessAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdefd2c9", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_PROCESSING);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_processing);
        }
        updateMsg(clientText, 0, -16777216);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthNoMatch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369f93e4", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_NOT_MATCH);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_not_match);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthNoMatchTooMuch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9979293d", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_OVER_COUNT);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_over_count);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthDone(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9a4978", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SUCCESS);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_success);
        }
        updateMsg(clientText, 0, -16777216);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthFail(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d30b5c", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_FAILURE);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_failure);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onAuthTimeout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e2bc27", new Object[]{this, context});
            return;
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TIMEOUT);
        if (StringUtils.isEmpty(clientText)) {
            clientText = context.getString(R.string.fp_auth_timeout);
        }
        updateMsg(clientText, 0, -65536);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.AuthNotify
    public void onCompleteAuth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff2d321", new Object[]{this, context});
        } else {
            dismiss(1000);
        }
    }
}
