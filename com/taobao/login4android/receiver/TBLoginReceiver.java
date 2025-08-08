package com.taobao.login4android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.ucc.UccService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.b;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.search.common.util.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class TBLoginReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.login4android.receiver.TBLoginReceiver$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17915a = new int[LoginAction.values().length];

        static {
            try {
                f17915a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17915a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17915a[LoginAction.NOTIFY_UCC_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17915a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17915a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(1146393096);
    }

    public static /* synthetic */ Object ipc$super(TBLoginReceiver tBLoginReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent != null) {
            int i = AnonymousClass2.f17915a[LoginAction.valueOf(intent.getAction()).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (!StringUtils.equals(intent.getStringExtra(LoginConstants.LOGIN_TYPE), LoginType.ServerLoginType.AutoLogin.getType()) || !StringUtils.isEmpty(intent.getStringExtra(LoginConstants.LOGIN_FROM))) {
                    b.a(context, "", "", "login");
                }
                jumpToTargetUrl(context);
                return;
            }
            try {
                if (LoginSwitch.getSwitch("logoutAll", "true")) {
                    ((UccService) AliMemberSDK.getService(UccService.class)).logoutAll(context);
                } else {
                    for (String str : new ArrayList<String>() { // from class: com.taobao.login4android.receiver.TBLoginReceiver.1
                        {
                            add("damai.cn");
                        }
                    }) {
                        String cookie = CookieManager.getInstance().getCookie(str);
                        if (!StringUtils.isEmpty(cookie) && (split = cookie.split(";")) != null && split.length > 0) {
                            for (String str2 : split) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
                                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                                CookieManager.getInstance().setCookie(k.HTTP_PREFIX + str, str2 + "; Domain=." + str + "; Expires=" + simpleDateFormat.format((Object) 1000));
                            }
                            if (Build.VERSION.SDK_INT >= 21) {
                                CookieManager.getInstance().flush();
                            } else {
                                CookieSyncManager.createInstance(context).sync();
                            }
                        }
                    }
                }
                ((UccService) AliMemberSDK.getService(UccService.class)).logout(context, "eleme");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            b.a(context);
        }
    }

    private void jumpToTargetUrl(Context context) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc36c6c", new Object[]{this, context});
            return;
        }
        String extJson = Login.getExtJson();
        if (!StringUtils.isEmpty(extJson)) {
            try {
                string = new JSONObject(extJson).getString("afterLoginH5Url");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (StringUtils.isEmpty(string) || !LoginSwitch.getSwitch("afterLoginH5Url", "true")) {
            }
            Nav.from(context).toUri(string);
            return;
        }
        string = "";
        if (StringUtils.isEmpty(string)) {
        }
    }
}
