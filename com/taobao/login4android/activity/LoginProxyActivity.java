package com.taobao.login4android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.LoginContext;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.ui.AccountSwitchDialogFragment;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginProxyActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCOUNT_HOST = "account.taobao.com";
    public static final String ACTION_ALIPAY_AUTH = "alipayAuth";
    public static final String ACTION_TYPE_ACCOUNT_SWITCH = "account_switch";
    public static final String ACTION_TYPE_OPERATION = "operation";
    public static final String ACTION_TYPE_REQUEST_PERMISSION = "request_permission";

    /* renamed from: com.taobao.login4android.activity.LoginProxyActivity$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17844a = new int[LoginAction.values().length];

        static {
            try {
                f17844a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17844a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17844a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17844a[LoginAction.NOTIFY_USER_LOGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(795335574);
    }

    public static /* synthetic */ Object ipc$super(LoginProxyActivity loginProxyActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(LoginProxyActivity loginProxyActivity, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83a5cfd", new Object[]{loginProxyActivity, bool});
        } else {
            loginProxyActivity.executeCallback(bool);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (LoginSwitch.getSwitch("ProxyActivityTranslucent", "true")) {
            this.activityIsTranslucent = true;
        }
        super.onCreate(bundle);
        if (getIntent() != null) {
            if (getIntent().getData() != null) {
                Uri data = getIntent().getData();
                String host = data.getHost();
                data.getPath();
                String queryParameter = data.getQueryParameter(LoginType.LocalLoginType.SMS_LOGIN);
                if (!StringUtils.isEmpty(queryParameter)) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString(LoginType.LocalLoginType.SMS_LOGIN, queryParameter);
                }
                if (ACCOUNT_HOST.equals(host)) {
                    finish();
                    return;
                }
            }
            String stringExtra = getIntent().getStringExtra("action");
            if (StringUtils.equals(stringExtra, ACTION_ALIPAY_AUTH)) {
                LoginParam loginParam = new LoginParam();
                loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, UTConstant.PageName.UT_PAGE_LOGIN_BAR);
                loginParam.utPageName = UTConstant.PageName.UT_PAGE_LOGIN_BAR;
                loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
                HashMap hashMap = new HashMap();
                hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
                UserTrackAdapter.control(loginParam.utPageName, null, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", hashMap);
                AlipayAuth.alipayAuth(this);
                finish();
                return;
            } else if (StringUtils.equals(ACTION_TYPE_ACCOUNT_SWITCH, stringExtra)) {
                showAccountSwitchDialogFragment(getIntent().getStringExtra("message"));
                return;
            }
        }
        LoginBroadcastHelper.registerLoginReceiver(this, new BroadcastReceiver() { // from class: com.taobao.login4android.activity.LoginProxyActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null || StringUtils.isEmpty(intent.getAction())) {
                } else {
                    int i = AnonymousClass4.f17844a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i != 1 && i != 2 && i != 3) {
                        return;
                    }
                    LoginProxyActivity.this.finish();
                    LoginBroadcastHelper.unregisterLoginReceiver(LoginProxyActivity.this.getApplicationContext(), this);
                }
            }
        });
        Login.login(true, bundle);
    }

    private void showAccountSwitchDialogFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f40ee2d", new Object[]{this, str});
            return;
        }
        AccountSwitchDialogFragment accountSwitchDialogFragment = new AccountSwitchDialogFragment();
        accountSwitchDialogFragment.setTitleText(str);
        accountSwitchDialogFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.activity.LoginProxyActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    LoginProxyActivity.access$000(LoginProxyActivity.this, Boolean.FALSE);
                }
            }
        });
        accountSwitchDialogFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.activity.LoginProxyActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    LoginProxyActivity.access$000(LoginProxyActivity.this, Boolean.TRUE);
                }
            }
        });
        accountSwitchDialogFragment.show(getSupportFragmentManager(), ACTION_TYPE_ACCOUNT_SWITCH);
    }

    private void executeCallback(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5138b4c", new Object[]{this, bool});
            return;
        }
        finish();
        if (LoginContext.mDataCallback != null) {
            LoginContext.mDataCallback.result(bool);
        }
        LoginContext.mDataCallback = null;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
