package com.ali.user.open.cookies;

import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.ali.user.open.core.Site;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.Constants;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.FileUtils;
import com.ali.user.open.service.impl.SessionManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CookieManagerWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final CookieManagerWrapper INSTANCE = new CookieManagerWrapper();
    private static final String TAG = "CookieManagerWrapper";

    private CookieManagerWrapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:15:0x004a), top: B:24:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void refreshCookie(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.cookies.CookieManagerWrapper.$ipChange     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L17
            java.lang.String r1 = "70b2c270"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            r2[r3] = r6     // Catch: java.lang.Throwable -> L4f
            r0.ipc$dispatch(r1, r2)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r5)
            return
        L17:
            r0 = 0
            android.content.Context r1 = com.ali.user.open.core.context.KernelContext.getApplicationContext()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r5.getCoookieFileNameBySite(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = com.ali.user.open.core.util.FileUtils.readFileData(r1, r2)     // Catch: java.lang.Throwable -> L47
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L47
            java.lang.String r2 = com.ali.user.open.cookies.CookieManagerWrapper.TAG     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "get cookie from storage:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L47
            r3.append(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L47
            com.ali.user.open.core.trace.SDKLogger.d(r2, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "\u0005"
            java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r1 = r0
        L48:
            if (r1 == 0) goto L4d
            r5.injectCookie(r6, r1, r0)     // Catch: java.lang.Throwable -> L4f
        L4d:
            monitor-exit(r5)
            return
        L4f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.cookies.CookieManagerWrapper.refreshCookie(java.lang.String):void");
    }

    public String getCoookieFileNameBySite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2ed0e85", new Object[]{this, str});
        }
        return Constants.COOKIES + str;
    }

    public String getCoookieBackupFileNameBySite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d90065a3", new Object[]{this, str});
        }
        return Constants.COOKIES + str + "_backup";
    }

    public synchronized void injectCookie(String str, String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e468d546", new Object[]{this, str, strArr, strArr2});
            return;
        }
        if (KernelContext.getApplicationContext() != null) {
            if (strArr != null) {
                SDKLogger.d(TAG, "injectCookie cookies != null");
                ArrayList<LoginCookie> arrayList = new ArrayList();
                String domainBySite = getDomainBySite(str);
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2)) {
                        LoginCookie parseCookie = LoginCookieUtils.parseCookie(str2);
                        String httpDomin = LoginCookieUtils.getHttpDomin(parseCookie);
                        String loginCookie = parseCookie.toString();
                        SDKLogger.d(TAG, "add cookie: " + loginCookie);
                        CookieManagerService.getWebViewProxy().setCookie(httpDomin, loginCookie);
                        if (TextUtils.equals(parseCookie.domain, domainBySite)) {
                            arrayList.add(parseCookie);
                        }
                    }
                }
                if (strArr2 != null && strArr2.length > 0 && !arrayList.isEmpty()) {
                    for (LoginCookie loginCookie2 : arrayList) {
                        String str3 = loginCookie2.domain;
                        for (String str4 : strArr2) {
                            loginCookie2.domain = str4;
                            String httpDomin2 = LoginCookieUtils.getHttpDomin(loginCookie2);
                            String loginCookie3 = loginCookie2.toString();
                            SDKLogger.d(TAG, "add cookies to domain:" + str4 + ", cookie = " + loginCookie3);
                            CookieManagerService.getWebViewProxy().setCookie(httpDomin2, loginCookie3);
                        }
                        loginCookie2.domain = str3;
                    }
                }
                CookieManagerService.getWebViewProxy().flush();
                if (strArr.length > 0) {
                    FileUtils.writeFileData(KernelContext.getApplicationContext(), getCoookieFileNameBySite(str), TextUtils.join(Constants.COOKIE_SPLIT, strArr));
                    FileUtils.writeFileData(KernelContext.getApplicationContext(), getCoookieBackupFileNameBySite(str), TextUtils.join(Constants.COOKIE_SPLIT, strArr));
                }
                return;
            }
            clearCookies(str);
        }
    }

    public void clearCookies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5884b093", new Object[]{this, str});
        } else {
            clearCookies(str, "");
        }
    }

    public void clearCookies(String str, String str2) {
        String[] strArr;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e53fb9d", new Object[]{this, str, str2});
            return;
        }
        SDKLogger.e("clearCookies", "into clearCookies ");
        CookieSyncManager.createInstance(KernelContext.getApplicationContext());
        SDKLogger.e("clearCookies", "into clearCookies removeSessionCookie finish");
        if (TextUtils.isEmpty(str2)) {
            str2 = FileUtils.readFileData(KernelContext.getApplicationContext(), getCoookieFileNameBySite(str));
        }
        String[] strArr2 = null;
        if (!TextUtils.isEmpty(str2)) {
            SDKLogger.d(TAG, "get cookie from storage:" + str2);
            strArr = TextUtils.split(str2, Constants.COOKIE_SPLIT);
        } else {
            strArr = null;
        }
        SDKLogger.e("clearCookies", "into clearCookies readFileData finish");
        if (strArr != null) {
            ArrayList<LoginCookie> arrayList = new ArrayList();
            String domainBySite = getDomainBySite(str);
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        LoginCookie parseCookie = LoginCookieUtils.parseCookie(str3);
                        if (!"munb".equals(parseCookie.name)) {
                            String httpDomin = LoginCookieUtils.getHttpDomin(parseCookie);
                            LoginCookieUtils.expiresCookies(parseCookie);
                            CookieManagerService.getWebViewProxy().setCookie(httpDomin, parseCookie.toString());
                            if (TextUtils.equals(parseCookie.domain, domainBySite)) {
                                arrayList.add(parseCookie);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            try {
                if (SessionManager.INSTANCE.getInternalSession(str) != null && SessionManager.INSTANCE.getInternalSession(str).otherInfo != null && (obj = SessionManager.INSTANCE.getInternalSession(str).otherInfo.get(SessionConstants.SSO_DOMAIN_LIST)) != null && (obj instanceof ArrayList)) {
                    strArr2 = (String[]) ((ArrayList) obj).toArray(new String[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (strArr2 != null && strArr2.length > 0 && !arrayList.isEmpty()) {
                for (LoginCookie loginCookie : arrayList) {
                    String str4 = loginCookie.domain;
                    for (String str5 : strArr2) {
                        loginCookie.domain = str5;
                        String httpDomin2 = LoginCookieUtils.getHttpDomin(loginCookie);
                        LoginCookieUtils.expiresCookies(loginCookie);
                        CookieManagerService.getWebViewProxy().setCookie(httpDomin2, loginCookie.toString());
                    }
                    loginCookie.domain = str4;
                }
            }
            SDKLogger.d(TAG, "injectCookie cookies is null");
            FileUtils.writeFileData(KernelContext.getApplicationContext(), getCoookieFileNameBySite(str), "");
        }
        SDKLogger.e("clearCookies", "into clearCookies reset cookie finish");
        CookieManagerService.getWebViewProxy().removeExpiredCookie();
        SDKLogger.e("clearCookies", "into clearCookies removeExpiredCookie finish");
        CookieManagerService.getWebViewProxy().flush();
        SDKLogger.e("clearCookies", "into clearCookies  finish");
    }

    private String getDomainBySite(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c79f8697", new Object[]{this, str}) : TextUtils.equals(str, "taobao") ? ".taobao.com" : TextUtils.equals(str, "alipay") ? ".alipay.com" : TextUtils.equals(str, Site.DAMAI) ? ".damai.cn" : TextUtils.equals(str, "eleme") ? ".ele.me" : TextUtils.equals(str, Site.ICBU) ? ".alibaba.com" : TextUtils.equals(str, "xianyu") ? ".goofish.com" : "";
    }
}
