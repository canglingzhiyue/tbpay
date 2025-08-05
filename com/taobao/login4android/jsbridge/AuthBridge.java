package com.taobao.login4android.jsbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import tb.kge;

/* loaded from: classes7.dex */
public class AuthBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BroadcastReceiver mLoginReceiver;

    /* renamed from: com.taobao.login4android.jsbridge.AuthBridge$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17864a = new int[LoginAction.values().length];

        static {
            try {
                f17864a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17864a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17864a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17864a[LoginAction.NOTIFY_ALIPAY_SSO_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17864a[LoginAction.NOTIFY_ALIPAY_SSO_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-1479642288);
    }

    public static /* synthetic */ Object ipc$super(AuthBridge authBridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(AuthBridge authBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73fcc93", new Object[]{authBridge, wVCallBackContext});
        } else {
            authBridge.doWhenReceiveSuccess(wVCallBackContext);
        }
    }

    public static /* synthetic */ void access$100(AuthBridge authBridge, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac76f94", new Object[]{authBridge, wVCallBackContext});
        } else {
            authBridge.doWhenReceivedCancel(wVCallBackContext);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("bridgeAlipaySSOLogin".equals(str)) {
            alipay(wVCallBackContext);
        } else if ("bridgeAlipaySupported".equals(str)) {
            checkIfExist(wVCallBackContext);
        } else if ("bridgeTaobaoSSOLogin".equals(str)) {
            taobao(wVCallBackContext);
        } else if (!"bridgeTaobaoSupported".equals(str)) {
            return false;
        } else {
            checkIfTaobaoExist(wVCallBackContext);
        }
        return true;
    }

    public static boolean isSupportTBAuthBind(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abdbec8d", new Object[]{context})).booleanValue() : isSchemeSupport(context, "com.taobao.open.intent.action.BIND_AUTH", "tbopen://m.taobao.com/bind_auth?");
    }

    private static boolean isSchemeSupport(Context context, String str, String str2) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c617c59", new Object[]{context, str, str2})).booleanValue();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.taobao.taobao", 1);
            intent = new Intent();
            intent.setAction(str);
            intent.setData(Uri.parse(str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packageManager.queryIntentActivities(intent, 0).size() > 0;
    }

    private synchronized void checkIfTaobaoExist(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117e7f28", new Object[]{this, wVCallBackContext});
        } else if (isSupportTBAuthBind(this.mContext)) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private synchronized void checkIfExist(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e959f6", new Object[]{this, wVCallBackContext});
        } else if (AliMemberSDK.getService(OauthService.class) != null && ((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(this.mContext, "alipay")) {
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    private synchronized void taobao(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121e2572", new Object[]{this, wVCallBackContext});
        } else if (this.mContext instanceof Activity) {
            registerBroadcast(wVCallBackContext);
        } else {
            wVCallBackContext.error();
        }
    }

    private synchronized void alipay(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522c8a8e", new Object[]{this, wVCallBackContext});
        } else if (this.mContext instanceof Activity) {
            registerBroadcast(wVCallBackContext);
            c.a(SNSPlatform.PLATFORM_ALIPAY, (Activity) this.mContext);
        } else {
            wVCallBackContext.error();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mLoginReceiver == null) {
            return;
        }
        LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
    }

    private void registerBroadcast(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b175a2", new Object[]{this, wVCallBackContext});
            return;
        }
        this.mLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.jsbridge.AuthBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                LoginAction valueOf;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
                } else {
                    int i = AnonymousClass2.f17864a[valueOf.ordinal()];
                    if (i == 1) {
                        AuthBridge.access$000(AuthBridge.this, wVCallBackContext);
                    } else if (i == 2) {
                        AuthBridge.access$100(AuthBridge.this, wVCallBackContext);
                    } else if (i != 3 && i != 4 && i != 5) {
                    } else {
                        AuthBridge.access$100(AuthBridge.this, wVCallBackContext);
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
    }

    private void doWhenReceiveSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71be28a9", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.success();
        }
        if (this.mLoginReceiver == null) {
            return;
        }
        LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
        this.mLoginReceiver = null;
    }

    private void doWhenReceivedCancel(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e383c4", new Object[]{this, wVCallBackContext});
            return;
        }
        if (wVCallBackContext != null) {
            wVCallBackContext.error();
        }
        if (this.mLoginReceiver == null) {
            return;
        }
        LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mLoginReceiver);
        this.mLoginReceiver = null;
    }
}
