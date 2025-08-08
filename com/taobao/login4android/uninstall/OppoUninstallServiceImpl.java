package com.taobao.login4android.uninstall;

import android.content.Context;
import android.content.pm.PackageInfo;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.helper.IFAAUtil;
import com.ali.user.mobile.base.helper.StrategyHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.UninstallService;
import com.ali.user.mobile.utils.BackgroundExecutor;
import com.ali.user.mobile.utils.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.ReloginDelegate;
import com.taobao.login4android.session.constants.SessionConstants;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.riy;

/* loaded from: classes7.dex */
public class OppoUninstallServiceImpl implements UninstallService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ERROR_CODE = -3333;
    private static final String KEY_ACCOUNTS = "alu_accounts";
    private static final String KEY_FINGER_IDS = "alu_last_finger_ids";
    private static final String KEY_LOGIN_DATA = "alu_login_data";
    private static final String KEY_MASK_PHONE = "alu_last_mask_phone";
    public static final int LOGIN_DATA_ERROR = -3335;
    public static final int LOGIN_DATA_NIL = -3334;
    public static final int LOGIN_ing = -3336;
    private static final String TAG = "login.Relogin.OppoUninstall";
    private OppoKeyChain keyChain;
    private String keyChainVersionCode;
    private String keyChainVersionName;
    private long startTime = 0;
    private final Context context = DataProviderFactory.getApplicationContext();

    public static /* synthetic */ void access$000(OppoUninstallServiceImpl oppoUninstallServiceImpl, String str, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f67145d", new Object[]{oppoUninstallServiceImpl, str, hashMap});
        } else {
            oppoUninstallServiceImpl.track(str, hashMap);
        }
    }

    public static /* synthetic */ void access$100(OppoUninstallServiceImpl oppoUninstallServiceImpl, String str, String str2, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a800fc6", new Object[]{oppoUninstallServiceImpl, str, str2, commonDataCallback});
        } else {
            oppoUninstallServiceImpl.onDataReady(str, str2, commonDataCallback);
        }
    }

    public static /* synthetic */ void access$200(OppoUninstallServiceImpl oppoUninstallServiceImpl, String str, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a15451", new Object[]{oppoUninstallServiceImpl, str, commonDataCallback});
        } else {
            oppoUninstallServiceImpl.compensate(str, commonDataCallback);
        }
    }

    public static /* synthetic */ void access$300(OppoUninstallServiceImpl oppoUninstallServiceImpl, DataCallback dataCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a795c9d1", new Object[]{oppoUninstallServiceImpl, dataCallback, str});
        } else {
            oppoUninstallServiceImpl.tryToGetLoginMaskPhone(dataCallback, str);
        }
    }

    public static /* synthetic */ void access$400(OppoUninstallServiceImpl oppoUninstallServiceImpl, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82b9826", new Object[]{oppoUninstallServiceImpl, str, str2, str3});
        } else {
            oppoUninstallServiceImpl.trackFailure(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$500(OppoUninstallServiceImpl oppoUninstallServiceImpl, String str, String str2, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2fd03ca", new Object[]{oppoUninstallServiceImpl, str, str2, commonDataCallback});
        } else {
            oppoUninstallServiceImpl.onGetSessionData(str, str2, commonDataCallback);
        }
    }

    public static /* synthetic */ long access$600(OppoUninstallServiceImpl oppoUninstallServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea57d4fa", new Object[]{oppoUninstallServiceImpl})).longValue() : oppoUninstallServiceImpl.startTime;
    }

    public static /* synthetic */ String access$700(OppoUninstallServiceImpl oppoUninstallServiceImpl, List list, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("73a9d400", new Object[]{oppoUninstallServiceImpl, list, str}) : oppoUninstallServiceImpl.convertSessionListToJSONString(list, str);
    }

    public static /* synthetic */ void access$800(OppoUninstallServiceImpl oppoUninstallServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f28e8e", new Object[]{oppoUninstallServiceImpl, str});
        } else {
            oppoUninstallServiceImpl.doUpdate(str);
        }
    }

    public OppoUninstallServiceImpl() {
        try {
            if (LoginSwitch.getSwitch("restore_session_init_service", "true")) {
                this.keyChain = new OppoKeyChain(this.context);
                this.keyChain.init();
            }
        } catch (Exception e) {
            LoginTLogAdapter.trace(TAG, "oppo_impl_init_error", e);
            track("restore_session_failure_init_error", null);
        }
        tryToResolveKeyChainInfo();
    }

    private boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        if (AppInfo.getInstance().isRoot()) {
            track("deviceJail", null);
            return false;
        }
        OppoKeyChain oppoKeyChain = this.keyChain;
        if (oppoKeyChain == null) {
            track("restore_session_failure_manufacturer_not_found", null);
            return false;
        }
        if (!oppoKeyChain.isSupport()) {
            track("restore_session_failure_manufacturer_disabled", null);
        }
        return this.keyChain.isSupport();
    }

    private void tryToRestoreSession(final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab787260", new Object[]{this, commonDataCallback});
            return;
        }
        LoginTLogAdapter.trace(TAG, "tryToRestoreSession");
        if (!isAvailable()) {
            track("restore_session_failure_disabled", null);
            if (commonDataCallback == null) {
                return;
            }
            commonDataCallback.onFail(DEFAULT_ERROR_CODE, "not enabled");
            return;
        }
        LoginTLogAdapter.trace(TAG, "tryToRestoreSession isAvailable=true");
        track("restore_session_query_commit", null);
        final long currentTimeMillis = System.currentTimeMillis();
        this.startTime = currentTimeMillis;
        LoginTLogAdapter.trace(TAG, "tryToRestoreSession  restore_session_query_commit");
        this.keyChain.query(KEY_LOGIN_DATA, new CommonDataCallback() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_query_success", hashMap);
                if (map == null || StringUtils.isEmpty(map.get("data"))) {
                    LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "tryToRestoreSession  restoreSessionIsNil");
                    OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restoreSessionIsNil", hashMap);
                    if (LoginSwitch.getSwitch("uninstallTagCaseDataNil", "false")) {
                        ReloginDelegate.setReloginOnce();
                    }
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 == null) {
                        return;
                    }
                    commonDataCallback2.onFail(OppoUninstallServiceImpl.LOGIN_DATA_NIL, "restore_session_query_data_empty");
                    return;
                }
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "tryToRestoreSession  enterRestoreSession");
                final String str = map.get("data");
                OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "enterRestoreSession", hashMap);
                OppoUninstallServiceImpl.access$300(OppoUninstallServiceImpl.this, new DataCallback<String>() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.DataCallback
                    public /* synthetic */ void result(String str2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("91402500", new Object[]{this, str2});
                        } else {
                            a(str2);
                        }
                    }

                    public void a(String str2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        } else if (StringUtils.isEmpty(str2)) {
                            int strategy = StrategyHelper.getStrategy("oppo_finger");
                            OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, StrategyHelper.getUtArg1(strategy, "oppoFinger_"), null);
                            if (strategy == 2) {
                                OppoUninstallServiceImpl.access$100(OppoUninstallServiceImpl.this, str2, str, commonDataCallback);
                                return;
                            }
                            LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "tryToRestoreSession  get_phone_fail_empty");
                            OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_failure_get_phone_failure", null);
                            OppoUninstallServiceImpl.access$200(OppoUninstallServiceImpl.this, str, new CommonDataCallback() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.1.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.mobile.callback.CommonDataCallback
                                public void onFail(int i, String str3) {
                                    IpChange ipChange4 = $ipChange;
                                    if (ipChange4 instanceof IpChange) {
                                        ipChange4.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str3});
                                    }
                                }

                                @Override // com.ali.user.mobile.callback.CommonDataCallback
                                public void onSuccess(Map<String, String> map2) {
                                    IpChange ipChange4 = $ipChange;
                                    if (ipChange4 instanceof IpChange) {
                                        ipChange4.ipc$dispatch("93e51c7a", new Object[]{this, map2});
                                    }
                                }
                            });
                        } else {
                            LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "tryToRestoreSession  getPhoneNumNotiSuccess");
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("arg2", "restoreSession");
                            hashMap2.put(UTHitBuilders.a.FIELD_ARG2, "restoreSession");
                            OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "getPhoneNumNotiSuccess", hashMap2);
                            OppoUninstallServiceImpl.access$100(OppoUninstallServiceImpl.this, str2, str, commonDataCallback);
                        }
                    }
                }, "restoreSession_query");
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                OppoUninstallServiceImpl oppoUninstallServiceImpl = OppoUninstallServiceImpl.this;
                OppoUninstallServiceImpl.access$400(oppoUninstallServiceImpl, "restore_session_query_error", i + "", str);
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "restore_session_query_error,code=" + i + ",msg=" + str);
                CommonDataCallback commonDataCallback2 = commonDataCallback;
                if (commonDataCallback2 == null) {
                    return;
                }
                commonDataCallback2.onFail(OppoUninstallServiceImpl.LOGIN_DATA_ERROR, "restore_session_query_data_error");
            }
        });
    }

    private void compensate(final String str, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee42a11d", new Object[]{this, str, commonDataCallback});
            return;
        }
        final NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            numberAuthService.addPrefetchResultObserver(new NumberAuthService.PrefetchResultObserver() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.service.NumberAuthService.PrefetchResultObserver
                public void onResult(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("14d0b3c2", new Object[]{this, map});
                        return;
                    }
                    numberAuthService.removePrefetchResultObserver(this);
                    OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_get_phone_by_notify", null);
                    if (!StringUtils.equals(map.get("scene"), "networkConnected")) {
                        CommonDataCallback commonDataCallback2 = commonDataCallback;
                        if (commonDataCallback2 == null) {
                            return;
                        }
                        commonDataCallback2.onFail(OppoUninstallServiceImpl.DEFAULT_ERROR_CODE, "get_phone_fail_empty");
                        return;
                    }
                    String str2 = map.get("number");
                    if (StringUtils.isEmpty(str2)) {
                        CommonDataCallback commonDataCallback3 = commonDataCallback;
                        if (commonDataCallback3 == null) {
                            return;
                        }
                        commonDataCallback3.onFail(OppoUninstallServiceImpl.DEFAULT_ERROR_CODE, "get_phone_fail_empty");
                        return;
                    }
                    OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "fetchPhoneCompensateSuccess", null);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - currentTimeMillis <= 10000) {
                        OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "valideIntervalSuccess", null);
                        OppoUninstallServiceImpl.access$100(OppoUninstallServiceImpl.this, str2, str, commonDataCallback);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("duration", String.valueOf(currentTimeMillis2 - currentTimeMillis));
                    OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "valideIntervalFail", hashMap);
                    CommonDataCallback commonDataCallback4 = commonDataCallback;
                    if (commonDataCallback4 == null) {
                        return;
                    }
                    commonDataCallback4.onFail(OppoUninstallServiceImpl.DEFAULT_ERROR_CODE, "get_phone_fail_empty");
                }
            });
        } else if (commonDataCallback == null) {
        } else {
            commonDataCallback.onFail(DEFAULT_ERROR_CODE, "get_phone_fail_empty");
        }
    }

    private void onDataReady(final String str, final String str2, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fd1030", new Object[]{this, str, str2, commonDataCallback});
            return;
        }
        track("startRestoreSession", null);
        LoginTLogAdapter.trace(TAG, " startRestoreSession");
        BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    OppoUninstallServiceImpl.access$500(OppoUninstallServiceImpl.this, SecurityGuardManagerWraper.staticSafeDecrypt(str2), str, commonDataCallback);
                } catch (Exception e) {
                    e.printStackTrace();
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onFail(OppoUninstallServiceImpl.DEFAULT_ERROR_CODE, "restore_session_failure_decrypt_error");
                    }
                    OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_failure_decrypt_error", null);
                    LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, " restore_session_failure_decrypt_error", e);
                }
            }
        });
    }

    private void tryToGetLoginMaskPhone(final DataCallback<String> dataCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe08e9a", new Object[]{this, dataCallback, str});
            return;
        }
        NumberAuthService numberAuthService = (NumberAuthService) ServiceFactory.getService(NumberAuthService.class);
        if (numberAuthService == null) {
            dataCallback.result("");
        } else if (!StringUtils.isEmpty(LoginSwitch.getConfig("restore_session_mock_phone", ""))) {
            dataCallback.result(LoginSwitch.getConfig("restore_session_mock_phone", ""));
        } else {
            final HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("scene", str);
            final long currentTimeMillis = System.currentTimeMillis();
            if (numberAuthService.hasPreFecthMaskPhone() && numberAuthService.getAuthInfoMap() != null && !numberAuthService.needPrefetch()) {
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                track("restore_session_get_phone_by_1", hashMap);
                dataCallback.result(numberAuthService.getAuthInfoMap().get("number"));
                return;
            }
            numberAuthService.getLoginMaskPhone(LoginSwitch.getSwitch("restore_session_get_phone_timeout", 5000), str, new CommonDataCallback() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onSuccess(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_get_phone_by_2", hashMap);
                    dataCallback.result(map.get("number"));
                }

                @Override // com.ali.user.mobile.callback.CommonDataCallback
                public void onFail(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                    } else {
                        dataCallback.result("");
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0110 A[Catch: Exception -> 0x016c, TRY_LEAVE, TryCatch #0 {Exception -> 0x016c, blocks: (B:10:0x0032, B:13:0x004d, B:15:0x005d, B:17:0x0069, B:21:0x007a, B:24:0x0088, B:26:0x00aa, B:37:0x00c7, B:50:0x0110, B:41:0x00d6, B:44:0x00e4, B:46:0x00ea, B:47:0x0103, B:34:0x00bd, B:64:0x0168, B:14:0x0055), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onGetSessionData(java.lang.String r21, java.lang.String r22, final com.ali.user.mobile.callback.CommonDataCallback r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.onGetSessionData(java.lang.String, java.lang.String, com.ali.user.mobile.callback.CommonDataCallback):void");
    }

    private void errorEmpty(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52361bf9", new Object[]{this, commonDataCallback});
            return;
        }
        track("getRestoreSessionError", null);
        LoginTLogAdapter.trace(TAG, " getRestoreSessionError ");
        if (LoginSwitch.getSwitch("uninstallTagCaseNoMatchedData", "true")) {
            ReloginDelegate.setReloginOnce();
        }
        if (commonDataCallback == null) {
            return;
        }
        commonDataCallback.onFail(DEFAULT_ERROR_CODE, "getRestoreSessionError");
    }

    private boolean compareFingerIds(String str, int[] iArr) {
        int[] restoredArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e73e168d", new Object[]{this, str, iArr})).booleanValue();
        }
        if (iArr != null) {
            try {
                if (iArr.length > 0 && (restoredArray = getRestoredArray(str)) != null && restoredArray.length > 0) {
                    for (int i = 0; i < iArr.length; i++) {
                        if (iArr[i] != 0 && containsNumber(restoredArray, iArr[i])) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                LoginTLogAdapter.e(TAG, "compareFingerIds exception: message=" + th.getMessage());
            }
        }
        return false;
    }

    private int[] getRestoredArray(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f1441926", new Object[]{this, str});
        }
        try {
            return (int[]) JSON.parseObject(str, int[].class);
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, "getRestoreArrayException: message=" + e.getMessage());
            return null;
        }
    }

    private boolean containsNumber(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d62948a", new Object[]{this, iArr, new Integer(i)})).booleanValue();
        }
        if (iArr != null && iArr.length != 0) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private void doUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5248f8c5", new Object[]{this, str});
            return;
        }
        LoginTLogAdapter.trace(TAG, "relogin update() called");
        if (this.keyChain == null) {
            return;
        }
        if (StringUtils.isEmpty(str)) {
            track("restore_session_service_update_data_empty", null);
            return;
        }
        track("restore_session_service_update_commit", null);
        final long currentTimeMillis = System.currentTimeMillis();
        LoginTLogAdapter.trace(TAG, "relogin restore_session_service_update_commit");
        this.keyChain.update(KEY_LOGIN_DATA, str, new CommonDataCallback() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_service_update_success", hashMap);
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "relogin restore_session_service_update_success");
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str2});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                hashMap.put("code", String.valueOf(i));
                hashMap.put("msg", str2);
                OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_service_update_error", hashMap);
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "relogin restore_session_service_update_error,code=" + i + ",msg=" + str2);
            }
        });
    }

    private boolean checkPhoneNumber(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a40daf4e", new Object[]{this, str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                String substring = str.substring(0, 3);
                String substring2 = str.substring(7, 11);
                if (str2.startsWith(substring)) {
                    if (str2.endsWith(substring2)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public void triggerRelogin(CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96771580", new Object[]{this, commonDataCallback});
            return;
        }
        LoginTLogAdapter.trace(TAG, "relogin triggerRelogin oppo impl ");
        track("restore_session_manufacturer_start", null);
        tryToRestoreSession(commonDataCallback);
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public void saveSessionData(final List<SessionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c652a59b", new Object[]{this, list});
            return;
        }
        track("restore_session_call_save", null);
        if (CollectionUtils.isEmpty(list)) {
            track("restore_session_call_save_but_data_empty", null);
            return;
        }
        LoginTLogAdapter.trace(TAG, "relogin save sessionData");
        if (!LoginSwitch.getSwitch("restore_session_save_session_data", "true")) {
            track("restore_session_call_save_but_disabled", null);
            return;
        }
        OppoKeyChain oppoKeyChain = this.keyChain;
        if (oppoKeyChain == null || !oppoKeyChain.isSupport()) {
            track("restore_session_call_save_but_not_support", null);
            return;
        }
        track("restore_session_save_before_exec", null);
        BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "relogin save sessionData tryToGetLoginMaskPhone");
                OppoUninstallServiceImpl.access$300(OppoUninstallServiceImpl.this, new DataCallback<String>() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.7.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.DataCallback
                    public /* synthetic */ void result(String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("91402500", new Object[]{this, str});
                        } else {
                            a(str);
                        }
                    }

                    public void a(String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else {
                            OppoUninstallServiceImpl.access$800(OppoUninstallServiceImpl.this, OppoUninstallServiceImpl.access$700(OppoUninstallServiceImpl.this, list, str));
                        }
                    }
                }, "restoreSession_update");
            }
        });
    }

    private String convertSessionListToJSONString(List<SessionModel> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83fa76e9", new Object[]{this, list, str});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_MASK_PHONE, (Object) str);
            if (IFAAUtil.getFingerIds() != null) {
                jSONObject.put(KEY_FINGER_IDS, JSON.toJSONString(IFAAUtil.getFingerIds()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                SessionModel sessionModel = list.get(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("userId", (Object) sessionModel.userId);
                jSONObject2.put("site", (Object) Integer.valueOf(sessionModel.site));
                jSONObject2.put(DeviceTokenSignParam.KEY_AUTOLOGINTOKEN, (Object) sessionModel.autoLoginToken);
                jSONObject2.put(SessionConstants.LOGIN_PHONE, (Object) convertToMaskPhone(sessionModel.loginPhone));
                jSONObject2.put("mobile", (Object) convertToMaskPhone(sessionModel.mobile));
                jSONObject2.put("showLoginId", (Object) sessionModel.showLoginId);
                jSONObject2.put(SessionConstants.HEAD_PIC_LINK, (Object) sessionModel.headPicLink);
                jSONArray.add(jSONObject2);
            }
            jSONObject.put(KEY_ACCOUNTS, (Object) jSONArray);
            jSONObject.put("v", "1");
            String jSONString = jSONObject.toJSONString();
            LoginTLogAdapter.trace(TAG, "result: jsonData:" + jSONString);
            String staticSafeEncrypt = SecurityGuardManagerWraper.staticSafeEncrypt(jSONString);
            LoginTLogAdapter.trace(TAG, "result: encodedData:" + staticSafeEncrypt);
            return staticSafeEncrypt;
        } catch (Exception e) {
            e.printStackTrace();
            trackFailure("restore_session_convert_data_error", "-400001", e.getMessage());
            return "";
        }
    }

    private String convertToMaskPhone(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b6791bb", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.substring(0, 3) + "****" + str.substring(7, 11);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public void clearSessionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c7dda", new Object[]{this});
            return;
        }
        OppoKeyChain oppoKeyChain = this.keyChain;
        if (oppoKeyChain == null || !oppoKeyChain.isSupport()) {
            return;
        }
        track("restore_session_clear_commit", null);
        final long currentTimeMillis = System.currentTimeMillis();
        LoginTLogAdapter.trace(TAG, "clearSessionData");
        this.keyChain.clear(new CommonDataCallback() { // from class: com.taobao.login4android.uninstall.OppoUninstallServiceImpl.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onSuccess(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "clearSessionData onSuccess");
                HashMap hashMap = new HashMap();
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_clear_success", hashMap);
            }

            @Override // com.ali.user.mobile.callback.CommonDataCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                LoginTLogAdapter.trace(OppoUninstallServiceImpl.TAG, "onFail() called with: code = [" + i + "], msg = [" + str + riy.ARRAY_END_STR);
                HashMap hashMap = new HashMap();
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                hashMap.put("code", String.valueOf(i));
                hashMap.put("msg", str);
                OppoUninstallServiceImpl.access$000(OppoUninstallServiceImpl.this, "restore_session_clear_error", hashMap);
            }
        });
    }

    private void trackFailure(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f919c24", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str2);
        hashMap.put("msg", str3);
        hashMap.put("keyChainVersionCode", this.keyChainVersionCode);
        hashMap.put("keyChainVersionName", this.keyChainVersionName);
        UserTrackAdapter.sendUserTrack("page_login_restore_session", str, hashMap);
    }

    private void track(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59b4297", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put("keyChainVersionCode", this.keyChainVersionCode);
        hashMap.put("keyChainVersionName", this.keyChainVersionName);
        UserTrackAdapter.sendUserTrack("page_login_restore_session", str, hashMap);
    }

    private void track(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9493e8b0", new Object[]{this, str, str2, str3});
            return;
        }
        Properties properties = new Properties();
        try {
            if (this.keyChainVersionCode != null) {
                properties.put("keyChainVersionCode", this.keyChainVersionCode);
            }
            if (this.keyChainVersionName != null) {
                properties.put("keyChainVersionName", this.keyChainVersionName);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        UserTrackAdapter.sendUT("page_login_restore_session", str, str2, str3, properties);
    }

    @Override // com.ali.user.mobile.service.UninstallService
    public boolean isSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[]{this})).booleanValue();
        }
        OppoKeyChain oppoKeyChain = this.keyChain;
        return oppoKeyChain != null && oppoKeyChain.isSupport();
    }

    private void tryToResolveKeyChainInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e4838d", new Object[]{this});
            return;
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.heytap.htms", 0);
            this.keyChainVersionCode = String.valueOf(packageInfo.versionCode);
            this.keyChainVersionName = packageInfo.versionName;
            LoginTLogAdapter.trace(TAG, "tryToResolveKeyChainInfo keyChainVersionCode=" + this.keyChainVersionCode + ",keyChainVersionName=" + this.keyChainVersionName);
        } catch (Exception e) {
            e.printStackTrace();
            LoginTLogAdapter.trace(TAG, "tryToResolveKeyChainInfo error", e);
        }
    }
}
