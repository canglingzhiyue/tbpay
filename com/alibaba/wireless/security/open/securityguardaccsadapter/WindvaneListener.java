package com.alibaba.wireless.security.open.securityguardaccsadapter;

import android.taobao.windvane.extra.uc.IOnSgHttpRequestCallback;
import anet.channel.util.HttpConstant;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.ISGPluginManager;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.middletier.IUnifiedSecurityComponent;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import tb.kge;

/* loaded from: classes.dex */
public class WindvaneListener implements IOnSgHttpRequestCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final int ERROR_HANDLER_METHOD_ID_MIN = 200000;
    private static final int ERROR_HANDLER_METHOD_WINDVANE_H5_SIGN_NORMAL = 200001;
    private static final int ERROR_HANDLER_METHOD_WINDVANE_H5_SIGN_TEST1000 = 200002;
    private static String[] FIX_HEADER_KEY = null;
    private static final String KEY_API = "api";
    private static final String KEY_APPKEY = "appkey";
    private static final String KEY_AUTH_CODE = "authCode";
    private static final String KEY_DATA = "data";
    private static final String KEY_ENV = "env";
    private static final String KEY_MINI_WUA = "miniWua";
    private static final String KEY_SIGN_KEY = "signKey";
    private static final String KEY_USE_WUA = "useWua";
    private static final String RESULT_X_APPKEY = "x-appkey";
    private static final String RESULT_X_MINIWUA = "x-mini-wua";
    private static final String RESULT_X_PV = "x-pv";
    private static final String RESULT_X_PV_VALUE = "6.3-h5-v2";
    private static final String RESULT_X_PV_VALUE_TEST = "6.3-h5-test";
    private static final String RESULT_X_SGEXT = "x-sgext";
    private static final String RESULT_X_SIGN = "x-sign";
    private static final String RESULT_X_T = "x-t";
    private static final String RESULT_X_UMT = "x-umt";
    private static final String RESULT_X_WUA = "wua";
    private static final String SYMBOL_AND = "&";
    private static final String TAG = "WindvaneListener";
    private static volatile IRouterComponent gGlobalRounterComponent;
    private IUnifiedSecurityComponent gUnifiedSecurityComp;
    private IStaticDataStoreComponent sdsComponent;
    public final int PLUGIN_ID = 10;
    private long avg_TimeCost = 0;
    public final int ERROR_CODE_GET_ROUTER_FAILED = 1;
    public final int ERROR_CODE_G_CONFIG_CLOSE = 2;
    public final int ERROR_CODE_G_URL_LIST_CLOSE = 3;
    public final int ERROR_CODE_GET_APPKEY_FAILED = 4;
    public final int ERROR_CODE_GET_SIGN_INIT_FAILED = 5;
    public final int ERROR_CODE_GET_SIGN_GETFACTOR_FAILED = 6;
    public final int ERROR_CODE_GET_SIGN_GETFACTOR_NULL = 7;
    public final int ERROR_CODE_REQUEST_HEADER_INVALID = 8;
    public final int ERROR_CODE_GET_GORANGECALLBACKPROCESSSWITCH_FAILED = 9;
    public final int ERROR_CODE_GET_GORANGEURLLISTSTR_FAILED = 10;

    /* loaded from: classes.dex */
    public static class WLOG {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1485047614);
        }

        public static void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            }
        }

        public static void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            }
        }
    }

    static {
        kge.a(-846950865);
        kge.a(-454334514);
        gGlobalRounterComponent = null;
        FIX_HEADER_KEY = new String[]{"Accept-Encoding", HttpConstant.USER_AGENT};
    }

    private IRouterComponent getRouterComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRouterComponent) ipChange.ipc$dispatch("695ef05", new Object[]{this});
        }
        if (gGlobalRounterComponent == null) {
            synchronized (WindvaneListener.class) {
                if (gGlobalRounterComponent == null) {
                    try {
                        ISGPluginManager sGPluginManager = SecurityGuardManager.getInstance(OrangeAdapter.gContext).getSGPluginManager();
                        this.gUnifiedSecurityComp = (IUnifiedSecurityComponent) SecurityGuardManager.getInstance(OrangeAdapter.gContext).getInterface(IUnifiedSecurityComponent.class);
                        this.sdsComponent = SecurityGuardManager.getInstance(OrangeAdapter.gContext).getStaticDataStoreComp();
                        gGlobalRounterComponent = sGPluginManager.getRouter();
                    } catch (Exception e) {
                        WLOG.d("getRouterComponent : " + e.getMessage());
                    }
                }
            }
        }
        return gGlobalRounterComponent;
    }

    @Override // android.taobao.windvane.extra.uc.IOnSgHttpRequestCallback
    public Map<String, String> onSgHttpRequest(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e258f2fa", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4}) : onSgHttpRequestImpl(str, str2, z, map, map2, map3, map4);
    }

    public Map<String, String> onSgHttpRequestImpl(String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, byte[]> map4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83087eba", new Object[]{this, str, str2, new Boolean(z), map, map2, map3, map4});
        }
        WLOG.d("enter onSgHttpRequest");
        return new HashMap();
    }

    public String getSignUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60d68129", new Object[]{this, str, str2});
        }
        int length = str2.length();
        int length2 = str.length();
        if (str.contains("#")) {
            length2 = str.indexOf("#");
        }
        if (length > length2) {
            return null;
        }
        return str.substring(length, length2);
    }

    public String assembleSignData(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a07c82a7", new Object[]{this, map, str, str2});
        }
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] strArr = FIX_HEADER_KEY;
            if (i < strArr.length) {
                String str3 = strArr[i];
                String str4 = map.get(str3);
                if (str4 == null) {
                    return null;
                }
                WLOG.d("key = " + str3 + " value = " + str4);
                sb.append(str4);
                sb.append("&");
                i++;
            } else {
                sb.append(str);
                sb.append("&");
                sb.append(str2);
                return sb.toString();
            }
        }
    }

    public static String stringToMD5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eae365d", new Object[]{str});
        }
        String str2 = null;
        try {
            str2 = new BigInteger(1, MessageDigest.getInstance("md5").digest(str.getBytes())).toString(16);
            for (int i = 0; i < 32 - str2.length(); i++) {
                str2 = "0" + str2;
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static Map<String, String> sortMapByKey(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b91468c9", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.alibaba.wireless.security.open.securityguardaccsadapter.WindvaneListener.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }

    public boolean isHeadValid(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45525ef0", new Object[]{this, map})).booleanValue();
        }
        for (String str : FIX_HEADER_KEY) {
            if (!map.keySet().contains(str)) {
                return false;
            }
        }
        return true;
    }
}
