package com.alipay.mobile.common.transportext.biz.appevent;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.transport.http.CookieAccessHelper;
import com.alipay.mobile.common.transport.http.GwCookieCacheHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class AmnetUserInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_USER_ID = "userId";
    public static final String SHARED_FILE_NAME = "amnetsui";

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f5658a;
    private static volatile String b;

    public static synchronized void setUserInfo(String str, String str2, byte[] bArr) {
        String str3;
        synchronized (AmnetUserInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39e8effd", new Object[]{str, str2, bArr});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setUserInfo,userId: ");
            sb.append(str);
            sb.append(", sessionid: ");
            sb.append(str2);
            sb.append(", syncExtParam: ");
            if (bArr == null) {
                str3 = "is null";
            } else {
                str3 = bArr.length + " byte ";
            }
            sb.append(str3);
            LogUtilAmnet.i("ext_AmnetUserInfo", sb.toString());
            f5658a = str;
            b = str2;
            a(f5658a, b);
            a(str, str2, bArr);
        }
    }

    private static void a(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a09343", new Object[]{str, str2, bArr});
            return;
        }
        try {
            ((OutEventNotifyService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(OutEventNotifyService.class)).notifyLoginOrLogoutEvent(str, str2, bArr);
        } catch (Exception e) {
            LogCatUtil.error("ext_AmnetUserInfo", e);
        }
    }

    private static final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(f5658a)) {
            a();
        } else {
            try {
                LogCatUtil.info("ext_AmnetUserInfo", "updateUserInfo,userId=[" + str + "] sessionId=[" + str2 + riy.ARRAY_END_STR);
                String encrypt = SecurityUtil.encrypt(str);
                String encrypt2 = SecurityUtil.encrypt(str2);
                SharedPreferences.Editor edit = ExtTransportEnv.getAppContext().getSharedPreferences("amnetsui", 4).edit();
                edit.putString("userId", encrypt);
                edit.putString("sessionId", encrypt2);
                edit.commit();
            } catch (Exception e) {
                LogCatUtil.error("ext_AmnetUserInfo", e);
            }
        }
    }

    private static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            SharedPreferences.Editor edit = ExtTransportEnv.getAppContext().getSharedPreferences("amnetsui", 4).edit();
            edit.remove("sessionId");
            edit.remove("userId");
            edit.commit();
        } catch (Exception e) {
            LogCatUtil.error("ext_AmnetUserInfo", e);
        }
    }

    public static void resendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3e1bd", new Object[0]);
            return;
        }
        try {
            String str = f5658a;
            String b2 = b();
            LogCatUtil.debug("ext_AmnetUserInfo", "resendSessionid,userid: " + str + ",sessionid: " + b2);
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(b2)) {
                ((OutEventNotifyService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(OutEventNotifyService.class)).notifyResendSessionid(str, b2);
            }
        } catch (Throwable th) {
            LogCatUtil.error("ext_AmnetUserInfo", "resendSessionid ex:" + th.toString());
        }
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("ext_AmnetUserInfo", "getSessionid ex:" + th.toString());
        }
        if (!MiscUtils.isInAlipayClient(ExtTransportEnv.getAppContext())) {
            return "";
        }
        String gwfurl = ReadSettingServerUrl.getInstance().getGWFURL(ExtTransportEnv.getAppContext());
        String a2 = a(GwCookieCacheHelper.getCookie(gwfurl));
        if (!StringUtils.isEmpty(a2)) {
            LogCatUtil.debug("ext_AmnetUserInfo", "sessionidFromCache:" + a2);
            return a2;
        }
        String a3 = a(CookieAccessHelper.getCookie(gwfurl, ExtTransportEnv.getAppContext()));
        if (!StringUtils.isEmpty(a3)) {
            LogCatUtil.debug("ext_AmnetUserInfo", "sessionidFromCookieStore:" + a3);
            return a3;
        }
        LogCatUtil.debug("ext_AmnetUserInfo", "getSessionid return null");
        return "";
    }

    private static String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.error("ext_AmnetUserInfo", "getAlipayJsessionidFromCookiestr ex:" + th.toString());
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("; ")) {
            if (!StringUtils.isEmpty(str2) && str2.contains("ALIPAYJSESSIONID")) {
                return str2.substring(str2.indexOf("=") + 1);
            }
        }
        return "";
    }
}
