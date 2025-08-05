package com.ali.user.mobile.base.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.login.model.AliUserResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.uninstall.UninstallManager;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginDataHelper";

    static {
        kge.a(-506264938);
    }

    public static void processLoginReturnData(boolean z, LoginReturnData loginReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8763b23", new Object[]{new Boolean(z), loginReturnData});
        } else {
            processLoginReturnData(z, loginReturnData, null, null);
        }
    }

    public static void processLoginReturnData(boolean z, LoginReturnData loginReturnData, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2f9602", new Object[]{new Boolean(z), loginReturnData, map});
        } else {
            processLoginReturnData(z, loginReturnData, null, map);
        }
    }

    public static void processLoginReturnData(boolean z, LoginReturnData loginReturnData, LoginBaseParam loginBaseParam, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655e174", new Object[]{new Boolean(z), loginReturnData, loginBaseParam, map});
        } else if (loginReturnData == null || loginReturnData.data == null) {
        } else {
            new CoordinatorWrapper().execute(new LoginDataHelperTask(z, loginReturnData, loginBaseParam, map), new Object[0]);
        }
    }

    private static void clearAppLaunchSharedPreferencesCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87cedbd", new Object[0]);
        } else {
            AliUserLogin.clearCacheData(LoginConstant.FILE_NAME);
        }
    }

    public static void beforeProcessLoginData(boolean z, AliUserResponseData aliUserResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280bbea1", new Object[]{new Boolean(z), aliUserResponseData});
        } else if (!LoginStatus.isFromChangeAccount() || !z) {
        } else {
            SessionManager sessionManager = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            if (aliUserResponseData != null && sessionManager != null && LoginSwitch.getSwitch(LoginSwitch.NEW_LOGOUT_BROADCAST_SWITCH, "true") && TextUtils.equals(sessionManager.getUserId(), aliUserResponseData.userId)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(LoginConstants.LOGOUT_TYPE, LoginConstants.LogoutType.CHANGE_ACCOUNT.getType());
            hashMap.put("nick", SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldNick());
            hashMap.put("uid", SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId());
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGOUT, false, 0, "", (Map<String, String>) hashMap, "before recover account");
            UserTrackAdapter.sendUT("SEND_LOGOUT_BROADCAST");
        }
    }

    public static void sendLoginResultBroadcast(boolean z, String str, String str2, LoginBaseParam loginBaseParam, LoginReturnData loginReturnData, AliUserResponseData aliUserResponseData, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e0dd8f", new Object[]{new Boolean(z), str, str2, loginBaseParam, loginReturnData, aliUserResponseData, str3, str4});
        } else if (!z) {
        } else {
            String str6 = "";
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(LoginResActions.LOGIN_SUCCESS_ACTION);
                intent.putExtra("nick", str2);
                intent.putExtra("uid", str);
                if (loginBaseParam != null && TokenType.MERGE_ACCOUNT.equals(loginBaseParam.tokenType)) {
                    intent.putExtra("message", TokenType.MERGE_ACCOUNT);
                }
                if (LoginStatus.isFromChangeAccount()) {
                    intent.putExtra(LoginConstants.LOGIN_FROM, LoginConstants.LOGIN_FROM_MULTI_ACCOUNT);
                }
                if (aliUserResponseData != null && aliUserResponseData.loginServiceExt != null) {
                    str6 = aliUserResponseData.loginServiceExt.get(LoginConstants.LOGIN_TYPE);
                }
                if (!TextUtils.isEmpty(str6) || loginReturnData.extMap == null) {
                    str5 = str6;
                } else {
                    str5 = loginReturnData.extMap.get(LoginConstants.LOGIN_TYPE);
                    if (TextUtils.isEmpty(str5)) {
                        str5 = loginReturnData.extMap.get("rootLoginType");
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = str5;
                }
                intent.putExtra(LoginConstants.LOGIN_TYPE, str3);
                intent.putExtra(LoginConstants.LOGIN_ACCOUNT, str4);
                intent.putExtra("serverLoginType", str5);
                BroadCastHelper.sendLocalBroadCast(intent);
                return;
            }
            BroadCastHelper.sendLoginFailBroadcast(711, str6);
            LoginStatus.resetLoginFlag();
        }
    }

    public static void handleHistory(LoginReturnData loginReturnData, ISession iSession, AliUserResponseData aliUserResponseData, Map<String, String> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37f6f6e", new Object[]{loginReturnData, iSession, aliUserResponseData, map});
            return;
        }
        String str3 = (map == null || TextUtils.isEmpty(map.get(LoginConstants.LOGIN_TYPE))) ? "" : map.get(LoginConstants.LOGIN_TYPE);
        if (!TextUtils.equals(str3, LoginType.ServerLoginType.AutoLogin.getType()) && !TextUtils.equals(str3, LoginConstant.LOGIN_TYPE_FINGERPRINT)) {
            SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "login_type", str3);
        }
        if (loginReturnData.deviceToken != null) {
            String str4 = loginReturnData.deviceToken.key;
            str = loginReturnData.deviceToken.salt;
            str2 = str4;
        } else {
            str = null;
            str2 = null;
        }
        int i = loginReturnData.site;
        String str5 = loginReturnData.showLoginId;
        if (TextUtils.isEmpty(str5)) {
            str5 = loginReturnData.taobaoNick;
        }
        HistoryAccount historyAccount = new HistoryAccount(str5, loginReturnData.mobile, aliUserResponseData.headPicLink, loginReturnData.hid == null ? 0L : loginReturnData.hid.longValue(), loginReturnData.alipayHid == null ? 0L : loginReturnData.alipayHid.longValue(), aliUserResponseData.autoLoginToken, aliUserResponseData.loginTime <= 0 ? System.currentTimeMillis() / 1000 : aliUserResponseData.loginTime, str2, "", loginReturnData.taobaoNick, loginReturnData.email, loginReturnData.alipayCrossed, i);
        if (!TextUtils.isEmpty(loginReturnData.accountId)) {
            historyAccount.setAccountId(loginReturnData.accountId);
        }
        if (loginReturnData.extMap != null) {
            historyAccount.biometricId = loginReturnData.extMap.get(SessionConstants.BIOMETRIC);
        }
        historyAccount.setLoginPhone(aliUserResponseData.loginPhone);
        if (aliUserResponseData.loginServiceExt != null) {
            if (TextUtils.isEmpty(str3)) {
                str3 = aliUserResponseData.loginServiceExt.get(LoginConstants.LOGIN_TYPE);
            }
            String str6 = aliUserResponseData.loginServiceExt.get("loginEntrance");
            if (!TextUtils.isEmpty(str6)) {
                SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), LoginConstant.LOGIN_ENTRANCE, str6);
            }
            if (aliUserResponseData.loginServiceExt.containsKey("hasPwd")) {
                if (TextUtils.equals("true", aliUserResponseData.loginServiceExt.get("hasPwd"))) {
                    historyAccount.hasPwd = 1;
                } else {
                    historyAccount.hasPwd = 0;
                }
            } else {
                historyAccount.hasPwd = -1;
            }
        }
        if (!TextUtils.equals(str3, LoginType.ServerLoginType.AutoLogin.getType()) && !TextUtils.equals(str3, LoginConstant.LOGIN_TYPE_FINGERPRINT)) {
            historyAccount.loginType = str3;
            SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "login_type", str3);
        }
        if (loginReturnData.deviceToken != null) {
            SecurityGuardManagerWraper.putLoginHistory(historyAccount, str);
        } else {
            SecurityGuardManagerWraper.saveHistoryOnly(historyAccount);
        }
        SessionModel sessionModel = new SessionModel();
        sessionModel.sid = aliUserResponseData.sid;
        sessionModel.ecode = aliUserResponseData.ecode;
        sessionModel.nick = aliUserResponseData.nick;
        sessionModel.userId = aliUserResponseData.userId;
        sessionModel.email = aliUserResponseData.email;
        sessionModel.havanaId = aliUserResponseData.havanaId;
        sessionModel.alipayHid = aliUserResponseData.alipayHid;
        sessionModel.loginTime = aliUserResponseData.loginTime;
        sessionModel.autoLoginToken = aliUserResponseData.autoLoginToken;
        sessionModel.headPicLink = aliUserResponseData.headPicLink;
        sessionModel.havanaSsoToken = aliUserResponseData.havanaSsoToken;
        sessionModel.havanaSsoTokenExpiredTime = aliUserResponseData.havanaSsoTokenExpiredTime;
        sessionModel.externalCookies = aliUserResponseData.externalCookies;
        sessionModel.cookies = aliUserResponseData.cookies;
        sessionModel.ssoToken = aliUserResponseData.ssoToken;
        sessionModel.expires = aliUserResponseData.expires;
        sessionModel.extendAttribute = aliUserResponseData.extendAttribute;
        sessionModel.loginServiceExt = aliUserResponseData.loginServiceExt;
        sessionModel.site = loginReturnData.site;
        sessionModel.showLoginId = loginReturnData.showLoginId;
        sessionModel.loginPhone = aliUserResponseData.loginPhone;
        sessionModel.mobile = loginReturnData.mobile;
        SecurityGuardManagerWraper.putSessionModelToFile(sessionModel);
        SecurityGuardManagerWraper.getSessionList(new DataCallback<SessionList>() { // from class: com.ali.user.mobile.base.helper.LoginDataHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.DataCallback
            public void result(SessionList sessionList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5f6c387", new Object[]{this, sessionList});
                } else {
                    UninstallManager.getInstance().saveSessionData(sessionList);
                }
            }
        });
    }

    public static SessionModel sessionToModel(ISession iSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionModel) ipChange.ipc$dispatch("f89c3db6", new Object[]{iSession});
        }
        SessionModel sessionModel = new SessionModel();
        sessionModel.sid = iSession.getSid();
        sessionModel.ecode = iSession.getEcode();
        sessionModel.nick = iSession.getNick();
        sessionModel.userId = iSession.getUserId();
        sessionModel.email = iSession.getEmail();
        sessionModel.autoLoginToken = iSession.getLoginToken();
        sessionModel.havanaSsoToken = iSession.getOneTimeToken();
        sessionModel.havanaSsoTokenExpiredTime = iSession.getHavanaSsoTokenExpiredTime();
        sessionModel.ssoToken = iSession.getSsoToken();
        sessionModel.expires = iSession.getSessionExpiredTime();
        if (!TextUtils.isEmpty(iSession.getExtJson())) {
            try {
                sessionModel.loginServiceExt = (Map) JSON.parseObject(iSession.getExtJson(), new TypeReference<Map<String, String>>() { // from class: com.ali.user.mobile.base.helper.LoginDataHelper.2
                }, new Feature[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sessionModel.site = iSession.getLoginSite();
        sessionModel.showLoginId = iSession.getEmail();
        if (TextUtils.isEmpty(sessionModel.showLoginId)) {
            sessionModel.showLoginId = iSession.getNick();
        }
        return sessionModel;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:10|(2:12|(25:14|15|(1:17)(1:89)|18|(2:20|(1:22))(1:88)|(3:79|80|(1:82)(20:83|84|25|26|27|28|29|(1:31)(1:73)|32|(1:37)|39|40|(2:44|(4:46|47|48|(1:52)))|56|(3:58|(1:60)|61)(1:72)|(1:65)|66|(1:68)(1:71)|69|70))|24|25|26|27|28|29|(0)(0)|32|(2:34|37)|39|40|(3:42|44|(0))|56|(0)(0)|(2:63|65)|66|(0)(0)|69|70))(1:91)|90|15|(0)(0)|18|(0)(0)|(0)|24|25|26|27|28|29|(0)(0)|32|(0)|39|40|(0)|56|(0)(0)|(0)|66|(0)(0)|69|70) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
        r34 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:39:0x00cb, B:43:0x00d9, B:45:0x00e5, B:48:0x00ec, B:42:0x00d5), top: B:91:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[Catch: Exception -> 0x00f9, TryCatch #2 {Exception -> 0x00f9, blocks: (B:39:0x00cb, B:43:0x00d9, B:45:0x00e5, B:48:0x00ec, B:42:0x00d5), top: B:91:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void onLoginSuccess(com.ali.user.mobile.rpc.login.model.LoginReturnData r43, com.ali.user.mobile.rpc.login.model.AliUserResponseData r44, com.taobao.login4android.session.SessionManager r45) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.base.helper.LoginDataHelper.onLoginSuccess(com.ali.user.mobile.rpc.login.model.LoginReturnData, com.ali.user.mobile.rpc.login.model.AliUserResponseData, com.taobao.login4android.session.SessionManager):void");
    }

    public static void registerSessionInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a47da6", new Object[]{str, str2, str3});
            return;
        }
        UserTrackAdapter.sendUT("step_register_mtop");
        ((RpcService) ServiceFactory.getService(RpcService.class)).registerSessionInfo(str, str2, str3);
        if (LoginSwitch.getSwitch("login_reset_login_flag_enabled", "true")) {
            LoginStatus.resetLoginFlag();
        }
        LoginTLogAdapter.e(TAG, "register SessionInfo to mtopsdk:(sid:" + str);
    }

    private static void saveCp(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1465a96f", new Object[]{str, str2, str3});
            return;
        }
        try {
            Context applicationContext = DataProviderFactory.getApplicationContext();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", (Object) str);
            jSONObject.put("nick", (Object) StringUtil.dataMasking(str3));
            jSONObject.put("avatar", (Object) str2);
            CPHelper.save(applicationContext, LoginConstant.ACCOUNT, jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static long adjustSessionExpireTime(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("139544ee", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return currentTimeMillis > j2 ? j > 0 ? j + (currentTimeMillis - j2) : 86400 + currentTimeMillis : j;
    }
}
