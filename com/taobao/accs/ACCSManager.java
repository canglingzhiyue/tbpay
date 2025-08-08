package com.taobao.accs;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.internal.ACCSManagerImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.o;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public final class ACCSManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ACCSManager";
    public static Map<String, a> mAccsInstances;
    public static Context mContext;
    public static String mDefaultAppkey;
    public static String mDefaultConfigTag;
    public static int mEnv;

    @Deprecated
    public static String getUserUnit(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc834e44", new Object[]{context});
        }
        return null;
    }

    @Deprecated
    public static void setServiceListener(Context context, String str, IServiceReceiver iServiceReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f681918e", new Object[]{context, str, iServiceReceiver});
        }
    }

    @Deprecated
    public static void unbindApp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a37ad16", new Object[]{context});
        }
    }

    static {
        kge.a(594392305);
        mEnv = 0;
        mDefaultConfigTag = "default";
        mAccsInstances = new ConcurrentHashMap(2);
    }

    private ACCSManager() {
    }

    @Deprecated
    public static void setAppkey(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9d2358", new Object[]{context, str, new Integer(i)});
        } else if (mDefaultAppkey != null) {
        } else {
            o.a(context, str);
            mContext = context.getApplicationContext();
            mDefaultAppkey = str;
            o.a(mContext, Constants.SP_KEY_DEFAULT_APPKEY, mDefaultAppkey);
            mEnv = i;
            AccsClientConfig.mEnv = i;
        }
    }

    @Deprecated
    public static String getDefaultAppkey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93254468", new Object[]{context});
        }
        if (StringUtils.isEmpty(mDefaultAppkey)) {
            ALog.e(TAG, "old interface!!, please AccsManager.setAppkey() first!", new Object[0]);
            String b = o.b(context, Constants.SP_KEY_DEFAULT_APPKEY, null);
            mDefaultAppkey = b;
            if (StringUtils.isEmpty(b)) {
                try {
                    mDefaultAppkey = SecurityGuardManager.getInstance(context).getStaticDataStoreComp().getAppKeyByIndex(0, null);
                } catch (Throwable th) {
                    ALog.e(TAG, "getDefaultAppkey", th, new Object[0]);
                }
            }
            if (StringUtils.isEmpty(mDefaultAppkey)) {
                mDefaultAppkey = "0";
            }
        }
        return mDefaultAppkey;
    }

    @Deprecated
    public static void setDefaultConfig(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1b5aea", new Object[]{context, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            ALog.i(TAG, "setDefaultConfig", Constants.KEY_CONFIG_TAG, str);
            mDefaultConfigTag = str;
        }
    }

    public static String getDefaultConfig(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6edbe40c", new Object[]{context}) : mDefaultConfigTag;
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73478e79", new Object[]{context, str, str2, str3, iAppReceiver});
        } else if (StringUtils.isEmpty(mDefaultAppkey)) {
            throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
        } else {
            o.a();
            getManagerImpl(context).bindApp(context, mDefaultAppkey, str2, str3, iAppReceiver);
        }
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6115946f", new Object[]{context, str, str2, iAppReceiver});
        } else {
            bindApp(context, mDefaultAppkey, "", str2, iAppReceiver);
        }
    }

    @Deprecated
    public static void bindUser(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253f5e03", new Object[]{context, str});
        } else {
            bindUser(context, str, false);
        }
    }

    @Deprecated
    public static void bindUser(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ad1531", new Object[]{context, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(mDefaultAppkey)) {
            throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
        } else {
            getManagerImpl(context).bindUser(context, str, z);
        }
    }

    @Deprecated
    public static void unbindUser(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4624d80", new Object[]{context});
        } else {
            getManagerImpl(context).unbindUser(context);
        }
    }

    @Deprecated
    public static void bindService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc166df3", new Object[]{context, str});
        } else {
            getManagerImpl(context).bindService(context, str);
        }
    }

    @Deprecated
    public static void unbindService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f05b4c", new Object[]{context, str});
        } else {
            getManagerImpl(context).unbindService(context, str);
        }
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70504f2c", new Object[]{context, str, str2, bArr, str3}) : getManagerImpl(context).sendData(context, str, str2, bArr, str3);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("210d8883", new Object[]{context, str, str2, bArr, str3, str4, url}) : getManagerImpl(context).sendData(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae89a7a2", new Object[]{context, str, str2, bArr, str3, str4}) : getManagerImpl(context).sendData(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendData(Context context, AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("864f5418", new Object[]{context, accsRequest}) : getManagerImpl(context).sendData(context, accsRequest);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8329b758", new Object[]{context, str, str2, bArr, str3, str4, url}) : getManagerImpl(context).sendRequest(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31751201", new Object[]{context, str, str2, bArr, str3}) : sendRequest(context, str, str2, bArr, str3, null);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b853f37", new Object[]{context, str, str2, bArr, str3, str4}) : getManagerImpl(context).sendRequest(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendRequest(Context context, AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97c9e1e3", new Object[]{context, accsRequest}) : getManagerImpl(context).sendRequest(context, accsRequest);
    }

    @Deprecated
    public static String sendPushResponse(Context context, AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e49eb68", new Object[]{context, accsRequest, extraInfo}) : getManagerImpl(context).sendPushResponse(context, accsRequest, extraInfo);
    }

    @Deprecated
    public static boolean isNetworkReachable(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("768651bc", new Object[]{context})).booleanValue() : getManagerImpl(context).isNetworkReachable(context);
    }

    @Deprecated
    public static void setMode(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab05467", new Object[]{context, new Integer(i)});
            return;
        }
        mEnv = i;
        getManagerImpl(context).setMode(context, i);
    }

    @Deprecated
    public static void setProxy(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdaae4", new Object[]{context, str, new Integer(i)});
        } else {
            getManagerImpl(context).setProxy(context, str, i);
        }
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dbbfa5", new Object[]{context, str, str2, str3, iAppReceiver});
            return;
        }
        o.a();
        getManagerImpl(context).startInAppConnection(context, mDefaultAppkey, str2, str3, iAppReceiver);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd31f89b", new Object[]{context, str, str2, iAppReceiver});
        } else {
            startInAppConnection(context, mDefaultAppkey, "", str2, iAppReceiver);
        }
    }

    @Deprecated
    public static void setLoginInfoImpl(Context context, ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca81443", new Object[]{context, iLoginInfo});
        } else {
            getManagerImpl(context).setLoginInfo(context, iLoginInfo);
        }
    }

    @Deprecated
    public static void clearLoginInfoImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd7b837", new Object[]{context});
        } else {
            getManagerImpl(context).clearLoginInfo(context);
        }
    }

    @Deprecated
    public static Map<String, Boolean> getChannelState(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("41739b52", new Object[]{context}) : getManagerImpl(context).getChannelState();
    }

    @Deprecated
    public static Map<String, Boolean> forceReConnectChannel(Context context) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("541d625f", new Object[]{context}) : getManagerImpl(context).forceReConnectChannel();
    }

    @Deprecated
    public static boolean isChannelError(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ea1b6d5", new Object[]{context, new Integer(i)})).booleanValue() : getManagerImpl(context).isChannelError(i);
    }

    @Deprecated
    public static void registerSerivce(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f898bca9", new Object[]{context, str, str2});
        } else {
            GlobalClientInfo.getInstance(context).registerService(str, str2);
        }
    }

    @Deprecated
    public static void unregisterService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713488b2", new Object[]{context, str});
        } else {
            GlobalClientInfo.getInstance(context).unRegisterService(str);
        }
    }

    @Deprecated
    public static void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13412671", new Object[]{context, str, accsAbstractDataListener});
        } else {
            GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
        }
    }

    @Deprecated
    public static void unRegisterDataListener(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cd8471", new Object[]{context, str});
        } else {
            GlobalClientInfo.getInstance(context).unregisterListener(str);
        }
    }

    @Deprecated
    public static boolean isAccsConnected(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae800e38", new Object[]{context})).booleanValue() : getManagerImpl(context).isAccsConnected();
    }

    private static synchronized a getManagerImpl(Context context) {
        synchronized (ACCSManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eb858fc4", new Object[]{context});
            }
            return getAccsInstance(context, null, getDefaultConfig(context));
        }
    }

    public static a getAccsInstance(Context context, String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6ad17e12", new Object[]{context, str, str2});
        }
        if (context == null || StringUtils.isEmpty(str2)) {
            ALog.e(TAG, "getAccsInstance param null", Constants.KEY_CONFIG_TAG, str2);
            return null;
        }
        String str3 = str2 + "|" + AccsClientConfig.mEnv;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(TAG, "getAccsInstance", "key", str3);
        }
        synchronized (ACCSManager.class) {
            aVar = mAccsInstances.get(str3);
            if (aVar == null) {
                try {
                    aVar = createAccsInstance(context, str2);
                } catch (Exception e) {
                    ALog.e(TAG, "createAccsInstance error", e.getMessage());
                }
                if (aVar != null) {
                    mAccsInstances.put(str3, aVar);
                }
            }
        }
        return aVar;
    }

    public static a createAccsInstance(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("540aa662", new Object[]{context, str}) : new ACCSManagerImpl(context, str);
    }

    public static void forceEnableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296f93fa", new Object[]{context});
        } else {
            getManagerImpl(context).forceEnableService(context);
        }
    }

    public static void forceDisableService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303889a9", new Object[]{context});
        } else {
            getManagerImpl(context).forceDisableService(context);
        }
    }

    public static String[] getAppkey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("8ad0389c", new Object[]{context});
        }
        try {
            String string = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString("appkey", null);
            ALog.i(TAG, "getAppkey:" + string, new Object[0]);
            if (!StringUtils.isEmpty(string)) {
                return string.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class AccsRequest implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String businessId;
        public byte[] data;
        public String dataId;
        private Map<Integer, String> ext;
        public URL host;
        public boolean isUnitBusiness = false;
        public String serviceId;
        public String tag;
        public String target;
        public String targetServiceName;
        public int timeout;
        public String userId;

        static {
            kge.a(309450442);
            kge.a(1028243835);
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3, String str4, URL url, String str5) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
            this.target = str4;
            this.host = url;
            this.businessId = str5;
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
        }

        public void setTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
            } else {
                this.tag = str;
            }
        }

        public void setTimeOut(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac10583d", new Object[]{this, new Integer(i)});
            } else {
                this.timeout = i;
            }
        }

        public void setIsUnitBusiness(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c94c7d", new Object[]{this, new Boolean(z)});
            } else {
                this.isUnitBusiness = z;
            }
        }

        public void setTarget(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15b02e4", new Object[]{this, str});
            } else {
                this.target = str;
            }
        }

        public void setTargetServiceName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce587b1e", new Object[]{this, str});
            } else {
                this.targetServiceName = str;
            }
        }

        public void setHost(URL url) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aad27c70", new Object[]{this, url});
            } else {
                this.host = url;
            }
        }

        public void setBusinessId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
            } else {
                this.businessId = str;
            }
        }

        public Map<Integer, String> getExt() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this}) : this.ext;
        }

        public void setExt(Map<Integer, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21ccc35f", new Object[]{this, map});
            } else {
                this.ext = map;
            }
        }
    }
}
