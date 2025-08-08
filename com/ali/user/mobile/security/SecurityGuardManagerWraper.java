package com.ali.user.mobile.security;

import android.content.ContextWrapper;
import android.os.AsyncTask;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.FingerInfo;
import com.ali.user.mobile.model.FingerList;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.rpc.login.model.WUAData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.ali.user.mobile.utils.EnvUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.FileUtils;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class SecurityGuardManagerWraper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG;
    public static final String FINGER_LIST = "finger_list";
    private static final String HISTORY_LOGIN_ACCOUNTS = "aliusersdk_history_acounts";
    public static final String LOGIN_IS_MORE_ACCOUNT = "is_more_act";
    private static final String SESSION_LIST = "aliusersdk_session_lists";
    private static final String TAG = "login.SecurityManager";
    private static boolean hadReadHistory;
    private static LoginHistory mLoginHistory;
    private static SecurityGuardManager mSecurityGuardManager;

    static {
        kge.a(495842150);
        DEBUG = Debuggable.isDebug();
        mSecurityGuardManager = null;
        hadReadHistory = false;
    }

    public static synchronized SecurityGuardManager getSecurityGuardManager() {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SecurityGuardManager) ipChange.ipc$dispatch("e7fb8de8", new Object[0]);
            }
            if (mSecurityGuardManager == null) {
                try {
                    mSecurityGuardManager = SecurityGuardManager.getInstance(new ContextWrapper(DataProviderFactory.getApplicationContext()));
                } catch (SecException e) {
                    e.printStackTrace();
                }
            }
            return mSecurityGuardManager;
        }
    }

    public static WUAData getWUA() {
        ISecurityBodyComponent securityBodyComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("64bf2216", new Object[0]);
        }
        try {
            com.taobao.wireless.security.sdk.SecurityGuardManager securityGuardManager = com.taobao.wireless.security.sdk.SecurityGuardManager.getInstance(new ContextWrapper(DataProviderFactory.getApplicationContext()));
            if (securityGuardManager == null || (securityBodyComp = securityGuardManager.getSecurityBodyComp()) == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String valueOf = String.valueOf(currentTimeMillis);
            String appkey = DataProviderFactory.getDataProvider().getAppkey();
            String securityBodyOpen = getSecurityBodyOpen(currentTimeMillis, appkey);
            if (StringUtils.isEmpty(securityBodyOpen)) {
                securityBodyOpen = securityBodyComp.getSecurityBodyData(valueOf, appkey);
            }
            return new WUAData(DataProviderFactory.getDataProvider().getAppkey(), valueOf, securityBodyOpen);
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, e);
            return null;
        }
    }

    private static WUAData getRPWUA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("9574a898", new Object[0]);
        }
        if (ServiceFactory.getService(FaceService.class) == null) {
            return null;
        }
        return new WUAData(DataProviderFactory.getDataProvider().getAppkey(), String.valueOf(System.currentTimeMillis()), ((FaceService) ServiceFactory.getService(FaceService.class)).getDeviceInfo());
    }

    private static String getSecurityBodyOpen(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28b083bb", new Object[]{new Long(j), str});
        }
        try {
            return ((com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent) getSecurityGuardManager().getInterface(com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent.class)).getSecurityBodyDataEx(String.valueOf(j), str, "", null, 4, EnvUtil.getAlimmsdk_env());
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, e);
            return null;
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th);
            return null;
        }
    }

    public static void getWUAData(DataCallback<WUAData> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193a5c32", new Object[]{dataCallback});
        } else if (dataCallback == null) {
        } else {
            new WUATask(dataCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
    }

    public static void getWSecurityData(final DataCallback<WSecurityData> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43857f9e", new Object[]{dataCallback});
        } else if (dataCallback == null) {
        } else {
            getWUAData(new DataCallback<WUAData>() { // from class: com.ali.user.mobile.security.SecurityGuardManagerWraper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.DataCallback
                public void result(WUAData wUAData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a3fea72e", new Object[]{this, wUAData});
                    } else {
                        DataCallback.this.result(SecurityGuardManagerWraper.buildWSecurityData(wUAData));
                    }
                }
            });
        }
    }

    public static WSecurityData buildWSecurityData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WSecurityData) ipChange.ipc$dispatch("1e6293c8", new Object[0]) : buildWSecurityData(getWUA());
    }

    public static WSecurityData buildWSecurityData(WUAData wUAData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WSecurityData) ipChange.ipc$dispatch("9e1db4a6", new Object[]{wUAData});
        }
        WSecurityData wSecurityData = new WSecurityData();
        if (wUAData != null) {
            wSecurityData.wua = wUAData.wua;
            wSecurityData.t = wUAData.t;
        }
        wSecurityData.apdId = AlipayInfo.getInstance().getApdid();
        wSecurityData.umidToken = AppInfo.getInstance().getUmidToken();
        wSecurityData.appStore = DataProviderFactory.getDataProvider().getTTID();
        wSecurityData.foreignLocation = DataProviderFactory.getDataProvider().isForigenLocation();
        wSecurityData.osName = "android";
        wSecurityData.osVersion = Build.VERSION.RELEASE;
        wSecurityData.deviceModel = Build.MODEL;
        wSecurityData.deviceBrand = Build.MANUFACTURER;
        wSecurityData.deviceName = Build.MODEL;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DataProviderFactory.getApplicationContext().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        wSecurityData.screenSize = i + "x" + i2;
        return wSecurityData;
    }

    public static WSecurityData buildRPSecurityData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WSecurityData) ipChange.ipc$dispatch("747e8c8b", new Object[0]);
        }
        WSecurityData wSecurityData = new WSecurityData();
        WUAData rpwua = getRPWUA();
        if (rpwua != null) {
            wSecurityData.wua = rpwua.wua;
            wSecurityData.t = rpwua.t;
        }
        wSecurityData.apdId = AlipayInfo.getInstance().getApdid();
        wSecurityData.umidToken = AppInfo.getInstance().getUmidToken();
        return wSecurityData;
    }

    public static String staticSafeEncrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f48d425", new Object[]{str});
        }
        try {
            IStaticDataEncryptComponent staticDataEncryptComp = SecurityGuardManager.getInstance(new ContextWrapper(DataProviderFactory.getApplicationContext())).getStaticDataEncryptComp();
            if (staticDataEncryptComp != null) {
                return staticDataEncryptComp.staticSafeEncrypt(16, DataProviderFactory.getDataProvider().getAppkey(), str, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void removeAllHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccb105d", new Object[0]);
            return;
        }
        try {
            removeString(HISTORY_LOGIN_ACCOUNTS);
            updateMemoryHistory(null);
            deleteHistoryAccounts();
        } catch (Throwable th) {
            th.printStackTrace();
            SecurityUTHitUtils.utHit("80005", "Throwable: " + th, "Event_removeHistoryAccountFail");
        }
    }

    public static void removeHistoryAccount(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7056c8", new Object[]{historyAccount});
        } else if (historyAccount != null) {
            UserTrackAdapter.sendUT("history_remove_user");
            try {
                AlibabaSecurityTokenService.removeSafeToken(historyAccount.tokenKey);
                LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
                if (loginHistoryFromLocal != null && loginHistoryFromLocal.accountHistory != null) {
                    ArrayList arrayList = new ArrayList();
                    if (historyAccount.alipayHid == 0) {
                        for (HistoryAccount historyAccount2 : loginHistoryFromLocal.accountHistory) {
                            if (historyAccount2.userId != historyAccount.userId || historyAccount2.alipayHid != 0) {
                                arrayList.add(historyAccount2);
                            }
                        }
                        loginHistoryFromLocal.accountHistory = arrayList;
                    } else {
                        for (HistoryAccount historyAccount3 : loginHistoryFromLocal.accountHistory) {
                            if (historyAccount.alipayHid != historyAccount3.alipayHid) {
                                arrayList.add(historyAccount3);
                            }
                        }
                        loginHistoryFromLocal.accountHistory = arrayList;
                    }
                }
                if (loginHistoryFromLocal != null) {
                    if (loginHistoryFromLocal.accountHistory != null && !loginHistoryFromLocal.accountHistory.isEmpty()) {
                        Collections.sort(loginHistoryFromLocal.accountHistory, new HistoryAccount());
                        loginHistoryFromLocal.index = 0;
                        putString(HISTORY_LOGIN_ACCOUNTS, JSON.toJSONString(loginHistoryFromLocal));
                        backupHistoryAccounts(loginHistoryFromLocal);
                    }
                    removeString(HISTORY_LOGIN_ACCOUNTS);
                    deleteHistoryAccounts();
                }
                updateMemoryHistory(loginHistoryFromLocal);
            } catch (Throwable th) {
                th.printStackTrace();
                SecurityUTHitUtils.utHit("80005", "Throwable: " + th, "Event_removeHistoryAccountFail");
            }
        }
    }

    public static synchronized List<FingerInfo> getFingerList() {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("99dae423", new Object[0]);
            }
            List<FingerInfo> arrayList = new ArrayList<>();
            String string = getString(FINGER_LIST);
            if (StringUtils.isEmpty(string)) {
                UserTrackAdapter.sendUT("readFingerFromFile");
                string = FileUtils.readFileData(DataProviderFactory.getApplicationContext(), FINGER_LIST);
                if (!StringUtils.isEmpty(string)) {
                    UserTrackAdapter.sendUT("readFingerFromFileNotEmpty");
                }
            }
            if (!StringUtils.isEmpty(string)) {
                if (LoginSwitch.getSwitch("fingerLog", "true")) {
                    LoginTLogAdapter.e(TAG, "getFingerString:" + string);
                }
                arrayList = ((FingerList) JSON.parseObject(string, FingerList.class)).list;
            }
            return arrayList;
        }
    }

    public static synchronized String getFingerValue(String str) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ac6f579d", new Object[]{str});
            } else if (StringUtils.isEmpty(str)) {
                UserTrackAdapter.sendUT("getFingerEmptyId");
                return "";
            } else {
                List<FingerInfo> fingerList = getFingerList();
                if (fingerList != null && fingerList.size() != 0) {
                    UserTrackAdapter.sendUT("startFindFor_" + fingerList.size());
                    for (int i = 0; i < fingerList.size(); i++) {
                        UserTrackAdapter.sendExtendUT("checkEncryptedUserId", str, fingerList.get(i).key, null);
                        if (StringUtils.equals(str, fingerList.get(i).key)) {
                            return fingerList.get(i).value;
                        }
                    }
                    return "";
                }
                UserTrackAdapter.sendUT("getFingerEmptyList");
                return "";
            }
        }
    }

    public static synchronized void saveFinger(FingerInfo fingerInfo) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf966b7", new Object[]{fingerInfo});
            } else {
                saveFinger(fingerInfo, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: Throwable -> 0x00ff, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x001b, B:12:0x0023, B:15:0x002d, B:17:0x003a, B:20:0x0042, B:23:0x0049, B:24:0x0055, B:26:0x005b, B:28:0x006b, B:30:0x0073, B:31:0x0076, B:32:0x0079, B:34:0x009e, B:36:0x00b4, B:41:0x00e6, B:33:0x008a, B:44:0x00f1, B:37:0x00ca), top: B:54:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void saveFinger(com.ali.user.mobile.model.FingerInfo r7, java.util.ArrayList<java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.security.SecurityGuardManagerWraper.saveFinger(com.ali.user.mobile.model.FingerInfo, java.util.ArrayList):void");
    }

    public static void removeFinger(FingerInfo fingerInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e7d3be", new Object[]{fingerInfo});
        } else if (fingerInfo != null && !StringUtils.isEmpty(fingerInfo.key)) {
            UserTrackAdapter.sendExtendUT("rmFinger", fingerInfo.key);
            List<FingerInfo> fingerList = getFingerList();
            if (fingerList == null || fingerList.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < fingerList.size(); i++) {
                FingerInfo fingerInfo2 = fingerList.get(i);
                if (!StringUtils.equals(fingerInfo.key, fingerInfo2.key)) {
                    arrayList.add(fingerInfo2);
                }
            }
            FingerList fingerList2 = new FingerList();
            fingerList2.list = arrayList;
            try {
                putString(FINGER_LIST, JSON.toJSONString(fingerList2));
            } catch (Throwable th) {
                th.printStackTrace();
                LoginTLogAdapter.e(TAG, th.getMessage());
                UserTrackAdapter.sendExtendUT("SGPutFingerException", th.getMessage());
            }
            try {
                FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), FINGER_LIST, JSON.toJSONString(fingerList2));
            } catch (Throwable th2) {
                th2.printStackTrace();
                UserTrackAdapter.sendExtendUT("SaveFingerFileException", th2.getMessage());
                th2.printStackTrace();
            }
        }
    }

    public static void removeAllFinger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa94d9cd", new Object[0]);
            return;
        }
        UserTrackAdapter.sendUT("removeAllFinger");
        removeString(FINGER_LIST);
        FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), FINGER_LIST, "");
    }

    private static LoginHistory getLoginHistoryFromLocal() {
        LoginHistory loginHistory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("cec487e1", new Object[0]);
        }
        String string = getString(HISTORY_LOGIN_ACCOUNTS);
        try {
            if (StringUtils.isEmpty(string)) {
                loginHistory = new LoginHistory();
            } else {
                loginHistory = (LoginHistory) JSON.parseObject(string, LoginHistory.class);
            }
            return loginHistory;
        } catch (JSONException e) {
            LoginTLogAdapter.e(TAG, "removeHistoryAccount JSONException");
            e.printStackTrace();
            SecurityUTHitUtils.utHit("80005", "JSONException: " + string, "Event_removeHistoryAccountFail");
            LoginHistory loginHistory2 = new LoginHistory();
            removeString(HISTORY_LOGIN_ACCOUNTS);
            deleteHistoryAccounts();
            return loginHistory2;
        }
    }

    public static synchronized void removeSessionModelFromFile(String str) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca43d50e", new Object[]{str});
            } else if (!StringUtils.isEmpty(str)) {
                try {
                    SessionList sessionListFromFile = getSessionListFromFile();
                    if (sessionListFromFile != null && sessionListFromFile.sessionModels != null && sessionListFromFile.sessionModels.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (SessionModel sessionModel : sessionListFromFile.sessionModels) {
                            if (!sessionModel.userId.equals(str)) {
                                arrayList.add(sessionModel);
                            }
                        }
                        sessionListFromFile.sessionModels = arrayList;
                        FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionListFromFile)));
                        backupSessionList(sessionListFromFile);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static synchronized void removeSessionAutoLoginTokenFromFile(String str) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fc03fe8", new Object[]{str});
            } else if (!StringUtils.isEmpty(str)) {
                try {
                    SessionList sessionListFromFile = getSessionListFromFile();
                    if (sessionListFromFile != null && sessionListFromFile.sessionModels != null && sessionListFromFile.sessionModels.size() != 0) {
                        for (SessionModel sessionModel : sessionListFromFile.sessionModels) {
                            if (sessionModel.userId.equals(str)) {
                                sessionModel.autoLoginToken = "";
                            }
                        }
                        FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionListFromFile)));
                        backupSessionList(sessionListFromFile);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static synchronized void putSessionModelToFile(SessionModel sessionModel) {
        SessionList sessionList;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b371af7e", new Object[]{sessionModel});
                return;
            }
            String decrypt = decrypt(FileUtils.readFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST));
            if (StringUtils.isEmpty(decrypt)) {
                sessionList = new SessionList();
            } else {
                try {
                    sessionList = (SessionList) JSON.parseObject(decrypt, SessionList.class);
                } catch (JSONException unused) {
                    sessionList = new SessionList();
                    emptySessionListFromFile();
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(sessionModel);
            if (sessionList != null) {
                if (sessionList.sessionModels != null) {
                    for (SessionModel sessionModel2 : sessionList.sessionModels) {
                        if (!StringUtils.equals(sessionModel.userId, sessionModel2.userId)) {
                            arrayList.add(sessionModel2);
                        }
                    }
                }
            } else {
                sessionList = new SessionList();
            }
            int maxSessionSize = DataProviderFactory.getDataProvider().getMaxSessionSize();
            if (maxSessionSize > 20) {
                maxSessionSize = 20;
            }
            if (arrayList.size() - maxSessionSize > 0 && arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            sessionList.sessionModels = arrayList;
            FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionList)));
            backupSessionList(sessionList);
        }
    }

    private static void backupHistoryAccounts(LoginHistory loginHistory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843e9df1", new Object[]{loginHistory});
            return;
        }
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup == null) {
            return;
        }
        harmonyLoginBackup.backupHistoryAccountList(loginHistory, null);
    }

    public static void deleteHistoryAccounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4232c76", new Object[0]);
            return;
        }
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup == null) {
            return;
        }
        harmonyLoginBackup.deleteHistoryAccountList(null);
    }

    private static void backupSessionList(SessionList sessionList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee96bd92", new Object[]{sessionList});
            return;
        }
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup == null) {
            return;
        }
        harmonyLoginBackup.backupSessionList(sessionList, null);
    }

    public static void emptySessionListFromFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb51c34", new Object[0]);
            return;
        }
        FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, "");
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup == null) {
            return;
        }
        harmonyLoginBackup.deleteSessionList(null);
    }

    public static synchronized void emptyAllSessionAutoLoginTokenFromFile() {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("325f6f0e", new Object[0]);
                return;
            }
            try {
                SessionList sessionListFromFile = getSessionListFromFile();
                if (sessionListFromFile != null && sessionListFromFile.sessionModels != null && sessionListFromFile.sessionModels.size() != 0) {
                    for (SessionModel sessionModel : sessionListFromFile.sessionModels) {
                        sessionModel.autoLoginToken = "";
                    }
                    FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionListFromFile)));
                    backupSessionList(sessionListFromFile);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void clearAutologinTokenFromFile(String str) {
        SessionList sessionList;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77b03023", new Object[]{str});
            } else if (!StringUtils.isEmpty(str)) {
                String decrypt = decrypt(FileUtils.readFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST));
                if (StringUtils.isEmpty(decrypt)) {
                    sessionList = new SessionList();
                } else {
                    try {
                        sessionList = (SessionList) JSON.parseObject(decrypt, SessionList.class);
                    } catch (JSONException unused) {
                        emptySessionListFromFile();
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (sessionList != null && sessionList.sessionModels != null) {
                    for (SessionModel sessionModel : sessionList.sessionModels) {
                        if (StringUtils.equals(str, sessionModel.userId)) {
                            sessionModel.autoLoginToken = "";
                            sessionModel.sid = "";
                        }
                        arrayList.add(sessionModel);
                    }
                }
                sessionList.sessionModels = arrayList;
                FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionList)));
                backupSessionList(sessionList);
            }
        }
    }

    public static synchronized void putLoginHistory(HistoryAccount historyAccount, String str) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e72d2cf", new Object[]{historyAccount, str});
            } else if (!AlibabaSecurityTokenService.saveToken(historyAccount.tokenKey, str) && LoginStatus.saveSalt) {
            } else {
                saveHistoryOnly(historyAccount);
            }
        }
    }

    public static void saveHistoryOnly(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8814bdce", new Object[]{historyAccount});
            return;
        }
        if (DEBUG) {
            String str = "saveHistoryOnly HistoryAccount: " + historyAccount;
        }
        UserTrackAdapter.sendUT("history_update_user");
        if (getSecurityGuardManager().getDynamicDataStoreComp() == null) {
            SecurityUTHitUtils.utHit("80016", "dynamicDataStoreComp = null", "Event_putLoginHistoryFail");
            return;
        }
        LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
        if (loginHistoryFromLocal != null) {
            if (loginHistoryFromLocal.accountHistory != null) {
                ArrayList arrayList = new ArrayList();
                if (historyAccount.alipayHid != 0) {
                    for (HistoryAccount historyAccount2 : loginHistoryFromLocal.accountHistory) {
                        if (historyAccount2.alipayHid == historyAccount.alipayHid) {
                            historyAccount2.update(historyAccount);
                            historyAccount = historyAccount2;
                        } else {
                            arrayList.add(historyAccount2);
                        }
                    }
                    arrayList.add(historyAccount);
                } else {
                    for (HistoryAccount historyAccount3 : loginHistoryFromLocal.accountHistory) {
                        if (historyAccount3.userId == historyAccount.userId && historyAccount3.alipayHid == 0) {
                            historyAccount3.update(historyAccount);
                            historyAccount = historyAccount3;
                        } else {
                            arrayList.add(historyAccount3);
                        }
                    }
                    arrayList.add(historyAccount);
                }
                int size = arrayList.size() - DataProviderFactory.getDataProvider().getMaxHistoryAccount();
                Collections.sort(arrayList, new HistoryAccount());
                if (size > 0) {
                    AlibabaSecurityTokenService.removeSafeToken(((HistoryAccount) arrayList.remove(arrayList.size() - 1)).tokenKey);
                }
                loginHistoryFromLocal.accountHistory = arrayList;
                loginHistoryFromLocal.index = arrayList.indexOf(historyAccount);
                putString(HISTORY_LOGIN_ACCOUNTS, JSON.toJSONString(loginHistoryFromLocal));
                backupHistoryAccounts(loginHistoryFromLocal);
            } else if (DataProviderFactory.getDataProvider().getMaxHistoryAccount() > 0) {
                loginHistoryFromLocal.accountHistory = new ArrayList();
                loginHistoryFromLocal.accountHistory.add(historyAccount);
                loginHistoryFromLocal.index = 0;
                putString(HISTORY_LOGIN_ACCOUNTS, JSON.toJSONString(loginHistoryFromLocal));
                backupHistoryAccounts(loginHistoryFromLocal);
            }
        }
        updateMemoryHistory(loginHistoryFromLocal);
        LoginTLogAdapter.e(TAG, "putLoginHistory Success");
    }

    private static void updateMemoryHistory(LoginHistory loginHistory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cba303", new Object[]{loginHistory});
            return;
        }
        mLoginHistory = loginHistory;
        hadReadHistory = true;
    }

    public static LoginHistory getLoginHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("9a16b920", new Object[0]);
        }
        try {
            if (mLoginHistory == null && !hadReadHistory) {
                LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
                if (loginHistoryFromLocal != null && loginHistoryFromLocal.accountHistory != null) {
                    Collections.sort(loginHistoryFromLocal.accountHistory, new HistoryAccount());
                    loginHistoryFromLocal.index = 0;
                }
                mLoginHistory = loginHistoryFromLocal;
                hadReadHistory = true;
                return loginHistoryFromLocal;
            }
            return mLoginHistory;
        } catch (Exception e) {
            SecurityUTHitUtils.utHit("80027", TLogTracker.SCENE_EXCEPTION + e, "Event_getLoginHistoryFailException");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HistoryAccount getTargetAccount(LoginHistory loginHistory, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("d3d2db71", new Object[]{loginHistory, str});
        }
        if (!StringUtils.isEmpty(str) && loginHistory != null && loginHistory.accountHistory != null && loginHistory.accountHistory.size() != 0) {
            for (HistoryAccount historyAccount : loginHistory.accountHistory) {
                if (str.equals(String.valueOf(historyAccount.userId))) {
                    return historyAccount;
                }
            }
        }
        return null;
    }

    public static List<HistoryAccount> getHistoryAccounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17c249fc", new Object[0]);
        }
        try {
            LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
            if (loginHistoryFromLocal == null) {
                return null;
            }
            return loginHistoryFromLocal.accountHistory;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static SessionList getSessionListFromFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionList) ipChange.ipc$dispatch("d7c5bc26", new Object[0]);
        }
        try {
            String decrypt = decrypt(FileUtils.readFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST));
            if (!StringUtils.isEmpty(decrypt)) {
                return (SessionList) JSON.parseObject(decrypt, SessionList.class);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void getSessionList(final DataCallback<SessionList> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee72d8b", new Object[]{dataCallback});
        } else if (dataCallback == null) {
        } else {
            CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, SessionList>() { // from class: com.ali.user.mobile.security.SecurityGuardManagerWraper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                /* renamed from: doInBackground */
                public SessionList mo110doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (SessionList) ipChange2.ipc$dispatch("eddb0b47", new Object[]{this, objArr}) : SecurityGuardManagerWraper.getSessionListFromFile();
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(SessionList sessionList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e4cb11ee", new Object[]{this, sessionList});
                    } else {
                        DataCallback.this.result(sessionList);
                    }
                }
            }, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ali.user.mobile.rpc.HistoryAccount matchHistoryAccount(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.mobile.security.SecurityGuardManagerWraper.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "8ddace2b"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            com.ali.user.mobile.rpc.HistoryAccount r4 = (com.ali.user.mobile.rpc.HistoryAccount) r4
            return r4
        L15:
            java.util.List r0 = getHistoryAccounts()
            r1 = 0
            if (r0 == 0) goto L55
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r0.next()
            com.ali.user.mobile.rpc.HistoryAccount r2 = (com.ali.user.mobile.rpc.HistoryAccount) r2
            java.lang.String r3 = r2.userInputName
            boolean r3 = android.text.StringUtils.equals(r4, r3)
            if (r3 != 0) goto L54
            java.lang.String r3 = r2.nick
            boolean r3 = android.text.StringUtils.equals(r4, r3)
            if (r3 != 0) goto L54
            java.lang.String r3 = r2.mobile
            boolean r3 = android.text.StringUtils.equals(r4, r3)
            if (r3 != 0) goto L54
            java.lang.String r3 = r2.email
            boolean r3 = android.text.StringUtils.equals(r4, r3)
            if (r3 != 0) goto L54
            java.lang.String r3 = r2.autologinToken
            boolean r3 = android.text.StringUtils.equals(r4, r3)
            if (r3 == 0) goto L20
        L54:
            return r2
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.security.SecurityGuardManagerWraper.matchHistoryAccount(java.lang.String):com.ali.user.mobile.rpc.HistoryAccount");
    }

    public static HistoryAccount findHistoryAccount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("61c298f", new Object[]{new Long(j)});
        }
        try {
            List<HistoryAccount> historyAccounts = getHistoryAccounts();
            if (historyAccounts != null) {
                for (HistoryAccount historyAccount : historyAccounts) {
                    if (j == historyAccount.userId) {
                        return historyAccount;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean hasHistoryAccounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6cbc32b", new Object[0])).booleanValue();
        }
        List<HistoryAccount> historyAccounts = getHistoryAccounts();
        return historyAccounts != null && historyAccounts.size() > 0;
    }

    public static void afterCancelAccount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1c5528", new Object[]{str});
        } else if (!StringUtils.isEmpty(str)) {
            try {
                List<HistoryAccount> historyAccounts = getHistoryAccounts();
                if (historyAccounts != null && historyAccounts.size() > 0) {
                    HistoryAccount historyAccount = null;
                    int i = 0;
                    for (int i2 = 0; i2 < historyAccounts.size(); i2++) {
                        if (str.equals(mask(historyAccounts.get(i2).userId))) {
                            i++;
                            historyAccount = historyAccounts.get(i2);
                        }
                    }
                    if (i == 1 && historyAccount != null) {
                        removeHistoryAccount(historyAccount);
                    }
                }
                SessionList sessionListFromFile = getSessionListFromFile();
                if (sessionListFromFile == null || sessionListFromFile.sessionModels == null || sessionListFromFile.sessionModels.size() <= 0) {
                    return;
                }
                String str2 = null;
                int i3 = 0;
                for (int i4 = 0; i4 < sessionListFromFile.sessionModels.size(); i4++) {
                    if (str.equals(mask(sessionListFromFile.sessionModels.get(i4).userId))) {
                        str2 = sessionListFromFile.sessionModels.get(i4).userId;
                        i3++;
                    }
                }
                if (i3 != 1 || str2 == null) {
                    return;
                }
                removeSessionModelFromFile(str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String mask(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("727f3d0f", new Object[]{new Long(j)}) : mask(String.valueOf(j));
    }

    public static String mask(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("74755c3", new Object[]{str}) : hiddenExceptPreAndPost(str, 3, 2);
    }

    public static String hiddenExceptPreAndPost(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad76ad38", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        return length <= i + i2 ? str : hiddenMiddle(str, i + 1, (length - i) - i2);
    }

    public static String hiddenMiddle(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef08fd10", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 1; i3 <= length; i3++) {
            if (i3 >= i && i3 < i + i2) {
                sb.append('*');
            } else {
                sb.append(str.charAt(i3 - 1));
            }
        }
        return sb.toString();
    }

    public static String staticSafeDecrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e62a6ffd", new Object[]{str});
        }
        try {
            return getSecurityGuardManager().getStaticDataEncryptComp().staticSafeDecrypt(16, DataProviderFactory.getDataProvider().getAppkey(), str, "");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String encode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{str});
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = getSecurityGuardManager().getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp != null) {
                String dynamicEncryptDDp = dynamicDataEncryptComp.dynamicEncryptDDp(str);
                return StringUtils.isEmpty(dynamicEncryptDDp) ? str : dynamicEncryptDDp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String decrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c54002", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = getSecurityGuardManager().getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp != null) {
                if (str.length() > 4 && str.charAt(3) == '&') {
                    return dynamicDataEncryptComp.dynamicDecryptDDp(str);
                }
                return dynamicDataEncryptComp.dynamicDecrypt(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String getDeviceTokenKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59886dd", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                HistoryAccount findHistoryAccount = findHistoryAccount(Long.parseLong(str));
                if (findHistoryAccount != null) {
                    return findHistoryAccount.tokenKey;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String getString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str}) : ((StorageService) ServiceFactory.getService(StorageService.class)).get(str);
    }

    public static void putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
        } else {
            ((StorageService) ServiceFactory.getService(StorageService.class)).put(str, str2);
        }
    }

    public static void removeString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986ba686", new Object[]{str});
        } else {
            ((StorageService) ServiceFactory.getService(StorageService.class)).remove(str);
        }
    }
}
