package com.ali.user.mobile.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.ui.AliUserCodeActivity;
import com.ali.user.mobile.login.ui.AliUserContainer;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.register.ui.AliUserRegisterSMSCodeActivity;
import com.ali.user.mobile.register.ui.EmailRegActivity;
import com.ali.user.mobile.register.ui.oversea.EmailCodeActivity;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.webview.AliUserWebTransparent;
import com.ali.user.mobile.webview.WebViewActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class NavigatorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile NavigatorManager navigatorManager;

    public static /* synthetic */ void access$000(NavigatorManager navigatorManager2, Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ead104", new Object[]{navigatorManager2, context, intent});
        } else {
            navigatorManager2.nonOneKeyLogin(context, intent);
        }
    }

    static {
        kge.a(-568222231);
        navigatorManager = null;
    }

    private NavigatorManager() {
    }

    public static NavigatorManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigatorManager) ipChange.ipc$dispatch("7dd1487a", new Object[0]);
        }
        if (navigatorManager == null) {
            synchronized (NavigatorManager.class) {
                if (navigatorManager == null) {
                    navigatorManager = new NavigatorManager();
                }
            }
        }
        return navigatorManager;
    }

    public void navToLoginPage(Context context, Bundle bundle, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3726fedd", new Object[]{this, context, bundle, str, new Boolean(z)});
        } else if (context == null) {
        } else {
            Intent callingIntent = UserLoginActivity.getCallingIntent(context, str, z, false);
            if (bundle != null) {
                bundle.getString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE);
            }
            if (bundle != null) {
                callingIntent.putExtras(bundle);
            }
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            if (needCheckOnekey(bundle)) {
                loginDispatchForCheckOneKeyLogin(context, callingIntent, str);
            } else {
                context.startActivity(callingIntent);
            }
        }
    }

    public void navToEmailRegPage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2ef438", new Object[]{this, context, bundle});
        } else if (context == null) {
        } else {
            Intent callingIntent = EmailRegActivity.getCallingIntent(context, bundle);
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            context.startActivity(callingIntent);
        }
    }

    public void navToEmailLoginPage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977aa0d", new Object[]{this, context, bundle});
        } else if (context == null) {
        } else {
            Intent callingIntent = EmailRegActivity.getCallingIntent(context, bundle);
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            context.startActivity(callingIntent);
        }
    }

    public void navToEmailCodePage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42920d8d", new Object[]{this, context, bundle});
        } else if (context == null) {
        } else {
            Intent callingIntent = EmailCodeActivity.getCallingIntent(context, bundle);
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            context.startActivity(callingIntent);
        }
    }

    public void navToSMSCodePage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2720ca", new Object[]{this, context, bundle});
        } else if (context == null) {
        } else {
            Intent callingIntent = AliUserCodeActivity.getCallingIntent(context, bundle);
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            context.startActivity(callingIntent);
        }
    }

    public void navToRegSMSCodePage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f376a412", new Object[]{this, context, bundle});
        } else if (context == null) {
        } else {
            Intent callingIntent = AliUserRegisterSMSCodeActivity.getCallingIntent(context, bundle);
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            context.startActivity(callingIntent);
        }
    }

    private boolean needCheckOnekey(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836555a6", new Object[]{this, bundle})).booleanValue();
        }
        return bundle == null || ((StringUtils.isEmpty(bundle != null ? bundle.getString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE) : "") || StringUtils.equals(bundle.getString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE), UIBaseConstants.LoginPage.PAGE_ONEKEY_LOGIN) || StringUtils.equals(bundle.getString(UIBaseConstants.LoginPage.PAGE_LOGIN_TYPE), UIBaseConstants.LoginPage.HALF_PAGE_ONEKEY_LOGIN)) && ServiceFactory.getService(NumberAuthService.class) != null);
    }

    private void loginDispatchForCheckOneKeyLogin(Context context, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873a2ada", new Object[]{this, context, intent, str});
        } else if (context == null) {
        } else {
            if (DataProviderFactory.getDataProvider().supportOneKeyLogin() || LoginStatus.enableOnekeyLoginV2) {
                onekeyLogin(context, intent, true);
            } else {
                context.startActivity(intent);
            }
        }
    }

    public void onekeyLogin(Context context, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f62566", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        try {
            if (ServiceFactory.getService(NumberAuthService.class) != null) {
                Map<String, String> authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
                if (authInfoMap != null && !StringUtils.isEmpty(authInfoMap.get("number"))) {
                    transmitMap(authInfoMap, intent, context, z);
                    return;
                } else {
                    waitLoginPhone(context, intent, z);
                    return;
                }
            }
            nonOneKeyLogin(context, intent);
        } catch (Throwable th) {
            th.printStackTrace();
            UserTrackAdapter.sendUT("ONEKEY_LOGIN_EXCEPTION");
            nonOneKeyLogin(context, intent);
        }
    }

    public void waitLoginPhone(final Context context, final Intent intent, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b722ac10", new Object[]{this, context, intent, new Boolean(z)});
            return;
        }
        Log.e("Login.login", "call waitLoginPhone");
        ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginMaskPhone(2000, new CommonDataCallback() { // from class: com.ali.user.mobile.navigation.NavigatorManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                Log.e("Login.login", "call waitLoginPhone,success");
                NavigatorManager.this.transmitMap(map, intent, context, z);
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                Log.e("Login.login", "call waitLoginPhone onFail");
                NavigatorManager.access$000(NavigatorManager.this, context, intent);
            }
        });
    }

    public void transmitMap(Map<String, String> map, Intent intent, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905c551b", new Object[]{this, map, intent, context, new Boolean(z)});
            return;
        }
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        context.startActivity(intent);
    }

    private void nonOneKeyLogin(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95929fb", new Object[]{this, context, intent});
        } else {
            context.startActivity(intent);
        }
    }

    public void navToRegisterPage(Context context, RegistParam registParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194f8587", new Object[]{this, context, registParam});
        } else {
            navToRegisterPage(context, null, registParam);
        }
    }

    public void navToRegisterPage(Context context, Intent intent, RegistParam registParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1676962a", new Object[]{this, context, intent, registParam});
        } else if (context != null) {
            Intent callingIntent = AliUserRegisterActivity.getCallingIntent(context);
            if (intent != null) {
                callingIntent.putExtras(intent);
            }
            if (registParam != null) {
                callingIntent.putExtra(RegistConstants.REGISTPARAM, registParam);
            }
            if (!(context instanceof Activity)) {
                callingIntent.addFlags(268435456);
            }
            if (DataProviderFactory.getDataProvider().supportOneKeyRegister() || LoginStatus.enableOnekeyLoginV2) {
                try {
                    if (ServiceFactory.getService(NumberAuthService.class) != null) {
                        Properties properties = LoginComponent.getProperties();
                        Map<String, String> authInfoMap = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap();
                        if (authInfoMap != null && !StringUtils.isEmpty(authInfoMap.get("number"))) {
                            for (Map.Entry<String, String> entry : authInfoMap.entrySet()) {
                                callingIntent.putExtra(entry.getKey(), entry.getValue());
                            }
                            context.startActivity(callingIntent);
                            return;
                        }
                        waitRegisterPhone(context, callingIntent, properties);
                        return;
                    }
                    context.startActivity(callingIntent);
                    return;
                } catch (Throwable th) {
                    UserTrackAdapter.sendUT("ONEKEY_REGISTER_EXCEPTION");
                    context.startActivity(callingIntent);
                    th.printStackTrace();
                    return;
                }
            }
            try {
                context.startActivity(callingIntent);
            } catch (Exception e) {
                e.printStackTrace();
                UserTrackAdapter.sendUT("ONEKEY_REGISTER_EXCEPTION_2");
            }
        }
    }

    public void waitRegisterPhone(final Context context, final Intent intent, final Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f26f784", new Object[]{this, context, intent, properties});
            return;
        }
        final int i = LoginSwitch.getSwitch(LoginSwitch.REGISTER_ONEKEY_WAIT, 3000);
        UserTrackAdapter.sendExtendUT("get_register_number_commit", "", String.valueOf(i), properties);
        ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginMaskPhone(i, "openRegView", new CommonDataCallback() { // from class: com.ali.user.mobile.navigation.NavigatorManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                UserTrackAdapter.sendExtendUT("get_register_number_success", "", String.valueOf(i), properties);
                if (map != null) {
                    try {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            intent.putExtra(entry.getKey(), entry.getValue());
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                context.startActivity(intent);
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str});
                    return;
                }
                Properties properties2 = new Properties();
                properties2.setProperty("code", i2 + "");
                properties2.setProperty("cause", str + "");
                properties2.setProperty("wait_time", String.valueOf(i));
                UserTrackAdapter.sendUT("get_register_number_fail", properties2);
                UserTrackAdapter.sendExtendUT("get_register_number_failure", i2 + "", String.valueOf(i), properties);
                context.startActivity(intent);
            }
        });
    }

    public void navToWebViewPage(Activity activity, String str, LoginParam loginParam, LoginReturnData loginReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c3d132", new Object[]{this, activity, str, loginParam, loginReturnData});
        } else if (activity == null) {
        } else {
            UrlParam urlParam = new UrlParam();
            urlParam.loginParam = loginParam;
            urlParam.url = str;
            urlParam.needTitle = true;
            if (loginReturnData != null) {
                urlParam.token = loginReturnData.token;
                urlParam.scene = loginReturnData.scene;
                urlParam.loginId = loginReturnData.showLoginId;
            }
            activity.startActivityForResult(WebViewActivity.getCallingIntent(activity, urlParam), 257);
        }
    }

    public void navToTransparentWeb(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e132d6b", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent(context, AliUserWebTransparent.class);
        intent.putExtra(WebConstant.WEBURL, str);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public void navToFingerSet(Context context, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9164a997", new Object[]{this, context, commonCallback});
        } else {
            navToFinger(context, 2, commonCallback);
        }
    }

    public void navToFingerLogin(Context context, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb83caf0", new Object[]{this, context, commonCallback});
        } else {
            navToFinger(context, 1, commonCallback);
        }
    }

    public void navToFinger(Context context, int i, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16ea57a", new Object[]{this, context, new Integer(i), commonCallback});
            return;
        }
        Intent intent = new Intent(context, AliUserContainer.class);
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        AliUserContainer.callback = commonCallback;
        intent.putExtra("status", i);
        intent.putExtra("actionType", AliUserContainer.TYPE_FINGER);
        context.startActivity(intent);
    }
}
