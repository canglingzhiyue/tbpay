package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IGlobalClientInfoService;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import com.taobao.aranger.exception.IPCException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;
import tb.jzv;
import tb.kaq;
import tb.kge;

/* loaded from: classes.dex */
public class GlobalClientInfo implements IGlobalClientInfoService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AGOO_SERVICE_ID = "agooSend";
    public static final Map<String, MessageFilter> FILTERS;
    private static Map<String, String> SERVICES;
    private static final String TAG;
    public static Map<String, Map<String, String>> TAG_SERVICES;
    private static Map<String, ArrayList<AccsConnectStateListener>> connListenerMap;
    public static IAgooAppReceiver mAgooAppReceiver;
    public static volatile Context mContext;
    public static String mCookieSec;
    private static volatile GlobalClientInfo mInstance;
    private Map<String, AccsDataListener> LISTENERS = new ConcurrentHashMap();
    private volatile IBinder mAccsMainBinder;
    private ActivityManager mActivityManager;
    private ConcurrentHashMap<String, IAppReceiver> mAppReceiver;
    private ConnectivityManager mConnectivityManager;
    private ConcurrentHashMap<String, ILoginInfo> mILoginInfoImpl;
    private PackageInfo mPackageInfo;

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    static {
        kge.a(371996086);
        kge.a(-714268806);
        TAG = GlobalClientInfo.class.getName();
        SERVICES = new ConcurrentHashMap();
        connListenerMap = new ConcurrentHashMap();
        TAG_SERVICES = new ConcurrentHashMap();
        FILTERS = new ConcurrentHashMap();
        SERVICES.put(AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        SERVICES.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        SERVICES.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    public static GlobalClientInfo getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlobalClientInfo) ipChange.ipc$dispatch("68045031", new Object[]{context});
        }
        if (mInstance == null) {
            synchronized (GlobalClientInfo.class) {
                if (mInstance == null) {
                    mInstance = new GlobalClientInfo(context);
                }
            }
        }
        return mInstance;
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        if (mContext == null) {
            mContext = kaq.a();
        }
        return mContext;
    }

    public static void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (mContext != null || context == null) {
        } else {
            mContext = context;
        }
    }

    private GlobalClientInfo(Context context) {
        if (mContext == null) {
            mContext = getContext();
        }
        if (mContext == null && context != null) {
            mContext = context.getApplicationContext();
        }
        com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                GlobalClientInfo.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    GlobalClientInfo.mCookieSec = UtilityImpl.restoreCookie(GlobalClientInfo.mContext);
                }
            }
        });
    }

    public IBinder getMainBinder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("ae7f32fd", new Object[]{this}) : this.mAccsMainBinder;
    }

    public void setMainBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4367533", new Object[]{this, iBinder});
        } else {
            this.mAccsMainBinder = iBinder;
        }
    }

    public ActivityManager getActivityManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityManager) ipChange.ipc$dispatch("14fd76b0", new Object[]{this});
        }
        if (this.mActivityManager == null) {
            this.mActivityManager = (ActivityManager) mContext.getSystemService("activity");
        }
        return this.mActivityManager;
    }

    public ConnectivityManager getConnectivityManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectivityManager) ipChange.ipc$dispatch("30cb7534", new Object[]{this});
        }
        if (this.mConnectivityManager == null) {
            this.mConnectivityManager = (ConnectivityManager) mContext.getSystemService("connectivity");
        }
        return this.mConnectivityManager;
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d63cb3d", new Object[]{this, str, iLoginInfo});
            return;
        }
        if (this.mILoginInfoImpl == null) {
            this.mILoginInfoImpl = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo == null) {
            return;
        }
        this.mILoginInfoImpl.put(str, iLoginInfo);
    }

    public void clearLoginInfoImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed16ccb1", new Object[]{this});
        } else {
            this.mILoginInfoImpl = null;
        }
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22690597", new Object[]{this, str});
        }
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.mILoginInfoImpl;
        if (concurrentHashMap != null && (iLoginInfo = concurrentHashMap.get(str)) != null) {
            return iLoginInfo.getSid();
        }
        return null;
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72541173", new Object[]{this, str});
        }
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.mILoginInfoImpl;
        if (concurrentHashMap != null && (iLoginInfo = concurrentHashMap.get(str)) != null) {
            return iLoginInfo.getUserId();
        }
        return null;
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9285c36", new Object[]{this, str});
        }
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.mILoginInfoImpl;
        if (concurrentHashMap != null && (iLoginInfo = concurrentHashMap.get(str)) != null) {
            return iLoginInfo.getNick();
        }
        return null;
    }

    public void setAppReceiver(final String str, final IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f333dd", new Object[]{this, str, iAppReceiver});
        } else if ((l.b() && !UtilityImpl.isMainProcess(mContext)) || iAppReceiver == null) {
        } else {
            if (iAppReceiver instanceof IAgooAppReceiver) {
                mAgooAppReceiver = (IAgooAppReceiver) iAppReceiver;
            } else {
                if (this.mAppReceiver == null) {
                    this.mAppReceiver = new ConcurrentHashMap<>(2);
                }
                this.mAppReceiver.put(str, iAppReceiver);
                try {
                    registerAllService(str, iAppReceiver.getAllServices());
                } catch (IPCException e) {
                    ALog.e(TAG, "setAppReceiver getAllServices", e, new Object[0]);
                }
            }
            if (!l.b() || !jzv.a(new ComponentName(mContext, AccsIPCProvider.class))) {
                return;
            }
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    GlobalClientInfo.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) jzv.b(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext));
                        if (iAppReceiver instanceof IAgooAppReceiver) {
                            iGlobalClientInfoService.setRemoteAgooAppReceiver((IAgooAppReceiver) iAppReceiver);
                        } else {
                            iGlobalClientInfoService.setRemoteAppReceiver(str, iAppReceiver);
                        }
                    } catch (IPCException e2) {
                        ALog.e(GlobalClientInfo.access$000(), "setAppReceiver exception", e2, new Object[0]);
                    }
                }
            });
        }
    }

    public Map<String, IAppReceiver> getAppReceiver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("652231f6", new Object[]{this}) : this.mAppReceiver;
    }

    public void registerService(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c5caad", new Object[]{this, str, str2});
            return;
        }
        ALog.e(TAG, "registerService info", "serviceId", str, "serviceClassName", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        SERVICES.put(str, str2);
        if (!l.b() || !UtilityImpl.isMainProcess(mContext) || !jzv.a(new ComponentName(mContext, AccsIPCProvider.class))) {
            return;
        }
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                GlobalClientInfo.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) jzv.b(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext));
                    if (m.t()) {
                        AccsMainCenter.a().a(iGlobalClientInfoService);
                    }
                    iGlobalClientInfoService.registerRemoteService(str, str2);
                } catch (IPCException e) {
                    ALog.e(GlobalClientInfo.access$000(), "registerService exception", e, new Object[0]);
                }
            }
        });
    }

    public void unRegisterService(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5dd008a", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ALog.e(TAG, "unRegisterService", "serviceId", str);
            SERVICES.remove(str);
            if (!l.b() || !UtilityImpl.isMainProcess(mContext) || !jzv.a(new ComponentName(mContext, AccsIPCProvider.class))) {
                return;
            }
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    GlobalClientInfo.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((IGlobalClientInfoService) jzv.b(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).unregisterRemoteService(str);
                    } catch (IPCException e) {
                        ALog.e(GlobalClientInfo.access$000(), "unRegisterService exception", e, new Object[0]);
                    }
                }
            });
        }
    }

    public void registerConnectionListener(final String str, final AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e0e47a", new Object[]{this, str, accsConnectStateListener});
        } else if (accsConnectStateListener == null) {
        } else {
            ALog.e(TAG, "registerConnectionListener", Constants.KEY_CONFIG_TAG, str, DataReceiveMonitor.CB_LISTENER, accsConnectStateListener);
            ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                connListenerMap.put(str, arrayList);
            }
            if (!arrayList.contains(accsConnectStateListener)) {
                arrayList.add(accsConnectStateListener);
            }
            final Context context = getContext();
            if (UtilityImpl.isMainProcess(context) && ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str)) {
                ALog.e(TAG, "registerConnectionListener return", new Object[0]);
            } else if (!l.b() || !UtilityImpl.isMainProcess(context) || !jzv.a(new ComponentName(context, AccsIPCProvider.class))) {
            } else {
                com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.-$$Lambda$GlobalClientInfo$_alf4zKtoCNy6W2d31oUOVYKKT4
                    @Override // java.lang.Runnable
                    public final void run() {
                        GlobalClientInfo.lambda$registerConnectionListener$8(context, str, accsConnectStateListener);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void lambda$registerConnectionListener$8(Context context, String str, AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794155fb", new Object[]{context, str, accsConnectStateListener});
            return;
        }
        try {
            ((IGlobalClientInfoService) jzv.b(new ComponentName(context, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, context))).registerRemoteConnectionListener(str, accsConnectStateListener.getClass().getName(), accsConnectStateListener);
        } catch (IPCException e) {
            ALog.e(TAG, "registerConnectionListener err", e, new Object[0]);
        }
    }

    public void unRegisterConnectStateListener(final String str, final AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5bd58", new Object[]{this, str, accsConnectStateListener});
        } else if (accsConnectStateListener == null) {
        } else {
            ALog.e(TAG, "unRegisterConnectStateListener", Constants.KEY_CONFIG_TAG, str);
            ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
            if (arrayList != null) {
                arrayList.remove(accsConnectStateListener);
            }
            final Context context = getContext();
            if (UtilityImpl.isMainProcess(context) && ConnectionServiceManager.getInstance().isCurProcessAllow2Connect(str)) {
                ALog.e(TAG, "unRegisterConnectStateListener return", new Object[0]);
            } else if (!l.b() || !UtilityImpl.isMainProcess(context) || !jzv.a(new ComponentName(context, AccsIPCProvider.class))) {
            } else {
                com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.-$$Lambda$GlobalClientInfo$pYgtNmTZ4IjBuFJTcoG5O_XhYEI
                    @Override // java.lang.Runnable
                    public final void run() {
                        GlobalClientInfo.lambda$unRegisterConnectStateListener$9(context, str, accsConnectStateListener);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void lambda$unRegisterConnectStateListener$9(Context context, String str, AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1a5c1e", new Object[]{context, str, accsConnectStateListener});
            return;
        }
        try {
            ((IGlobalClientInfoService) jzv.b(new ComponentName(context, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, context))).unregisterRemoteConnectionListener(str, accsConnectStateListener.getClass().getName(), accsConnectStateListener);
        } catch (IPCException e) {
            ALog.e(TAG, "unRegisterService exception", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteConnectionListener(String str, String str2, AccsConnectStateListener accsConnectStateListener) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56db0f8a", new Object[]{this, str, str2, accsConnectStateListener});
            return;
        }
        ALog.e(TAG, "registerRemoteConnectionListener", Constants.KEY_CONFIG_TAG, str, "listenerName", str2);
        ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            connListenerMap.put(str, arrayList);
        }
        if (arrayList.contains(accsConnectStateListener)) {
            return;
        }
        arrayList.add(accsConnectStateListener);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void unregisterRemoteConnectionListener(String str, String str2, AccsConnectStateListener accsConnectStateListener) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ead10d1", new Object[]{this, str, str2, accsConnectStateListener});
            return;
        }
        ALog.e(TAG, "unregisterRemoteConnectionListener", Constants.KEY_CONFIG_TAG, str, "listenerName", str2);
        ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(accsConnectStateListener);
    }

    public ArrayList<AccsConnectStateListener> getConnectionListenerList(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("11dfa8d1", new Object[]{this, str});
        }
        ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
        String str2 = TAG;
        Object[] objArr = new Object[4];
        objArr[0] = Constants.KEY_CONFIG_TAG;
        objArr[1] = str;
        objArr[2] = "list size";
        if (arrayList != null) {
            i = arrayList.size();
        }
        objArr[3] = Integer.valueOf(i);
        ALog.e(str2, "getConnectionListenerList", objArr);
        return arrayList;
    }

    public String getService(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46264ad0", new Object[]{this, str}) : SERVICES.get(str);
    }

    public String getService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("681d8246", new Object[]{this, str, str2});
        }
        if (TAG_SERVICES.get(str) == null) {
            return null;
        }
        return TAG_SERVICES.get(str).get(str2);
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d49cb3", new Object[]{this, str, accsAbstractDataListener});
        } else {
            registerListener(str, (AccsDataListener) accsAbstractDataListener);
        }
    }

    public void registerListener(final String str, final AccsDataListener accsDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f03835", new Object[]{this, str, accsDataListener});
        } else if ((l.b() && !UtilityImpl.isMainProcess(mContext)) || TextUtils.isEmpty(str) || accsDataListener == null) {
        } else {
            ALog.e(TAG, "registerListener info", "serviceId", str);
            this.LISTENERS.put(str, accsDataListener);
            if (!l.b() || !jzv.a(new ComponentName(mContext, AccsIPCProvider.class))) {
                return;
            }
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    GlobalClientInfo.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((IGlobalClientInfoService) jzv.b(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).registerRemoteListener(str, accsDataListener);
                    } catch (IPCException e) {
                        ALog.e(GlobalClientInfo.access$000(), "registerListener exception", e, new Object[0]);
                    }
                }
            });
        }
    }

    public void unregisterListener(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dfcfa1", new Object[]{this, str});
        } else if (l.b() && !UtilityImpl.isMainProcess(mContext)) {
        } else {
            ALog.e(TAG, "unregisterListener info", "serviceId", str);
            this.LISTENERS.remove(str);
            if (!l.b() || !jzv.a(new ComponentName(mContext, AccsIPCProvider.class))) {
                return;
            }
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    GlobalClientInfo.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((IGlobalClientInfoService) jzv.b(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).unregisterRemoteListener(str);
                    } catch (IPCException e) {
                        ALog.e(GlobalClientInfo.access$000(), "unregisterListener exception", e, new Object[0]);
                    }
                }
            });
        }
    }

    public AccsDataListener getListener(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccsDataListener) ipChange.ipc$dispatch("7dd04fa8", new Object[]{this, str}) : this.LISTENERS.get(str);
    }

    public PackageInfo getPackageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackageInfo) ipChange.ipc$dispatch("4454a4a8", new Object[]{this});
        }
        try {
            if (this.mPackageInfo == null) {
                this.mPackageInfo = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.mPackageInfo;
    }

    public Map<String, String> getAllService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("900c13d0", new Object[]{this, str});
        }
        if (TAG_SERVICES.get(str) != null && !TAG_SERVICES.get(str).isEmpty()) {
            return TAG_SERVICES.get(str);
        }
        return null;
    }

    private void registerAllService(final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79a3e5d", new Object[]{this, str, map});
        } else if (map == null) {
        } else {
            if (l.b() && !UtilityImpl.isMainProcess(mContext)) {
                return;
            }
            if (TAG_SERVICES.get(str) == null) {
                TAG_SERVICES.put(str, new ConcurrentHashMap());
            }
            TAG_SERVICES.get(str).putAll(map);
            if (!l.b() || !jzv.a(new ComponentName(mContext, AccsIPCProvider.class))) {
                return;
            }
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.client.GlobalClientInfo.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    GlobalClientInfo.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((IGlobalClientInfoService) jzv.b(new ComponentName(GlobalClientInfo.mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, GlobalClientInfo.mContext))).registerAllRemoteService(str, map);
                    } catch (IPCException e) {
                        ALog.e(GlobalClientInfo.access$000(), "registerAllService exception", e, new Object[0]);
                    }
                }
            });
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void setRemoteAgooAppReceiver(IAgooAppReceiver iAgooAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53f56d", new Object[]{this, iAgooAppReceiver});
        } else {
            mAgooAppReceiver = iAgooAppReceiver;
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void setRemoteAppReceiver(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451cdc37", new Object[]{this, str, iAppReceiver});
            return;
        }
        if (this.mAppReceiver == null) {
            this.mAppReceiver = new ConcurrentHashMap<>(2);
        }
        this.mAppReceiver.put(str, iAppReceiver);
        try {
            registerAllService(str, iAppReceiver.getAllServices());
        } catch (IPCException e) {
            ALog.e(TAG, "setRemoteAppReceiver registerAllService", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteListener(String str, AccsDataListener accsDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc431cf", new Object[]{this, str, accsDataListener});
            return;
        }
        ALog.e(TAG, "registerRemoteListener", "serviceId", str);
        this.LISTENERS.put(str, accsDataListener);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void unregisterRemoteListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b02087", new Object[]{this, str});
            return;
        }
        ALog.e(TAG, "unregisterRemoteListener", "serviceId", str);
        this.LISTENERS.remove(str);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteService(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a744f3c7", new Object[]{this, str, str2});
            return;
        }
        ALog.e(TAG, "registerRemoteService info", "serviceId", str, "serviceClassName", str2);
        SERVICES.put(str, str2);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void unregisterRemoteService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e66b04", new Object[]{this, str});
            return;
        }
        ALog.e(TAG, "unregisterRemoteService", "serviceId", str);
        SERVICES.remove(str);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerAllRemoteService(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abebeb43", new Object[]{this, str, map});
            return;
        }
        if (TAG_SERVICES.get(str) == null) {
            TAG_SERVICES.put(str, new ConcurrentHashMap());
        }
        TAG_SERVICES.get(str).putAll(map);
    }

    @Override // com.taobao.accs.IGlobalClientInfoService
    public void registerRemoteMainBinder(IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304f2bda", new Object[]{this, iBinder});
            return;
        }
        ALog.e(TAG, "registerRemoteMainBinder success", "MainBinder", iBinder);
        this.mAccsMainBinder = iBinder;
        notifyMainBinderHeld(mContext);
    }

    private void notifyMainBinderHeld(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb687e80", new Object[]{this, context});
        } else {
            com.taobao.accs.connection.state.a.a().d(context);
        }
    }

    public void recoverListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111ff2c9", new Object[]{this, str});
            return;
        }
        try {
            IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) jzv.b(new ComponentName(mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, mContext));
            if (!this.LISTENERS.isEmpty()) {
                for (Map.Entry<String, AccsDataListener> entry : this.LISTENERS.entrySet()) {
                    iGlobalClientInfoService.registerRemoteListener(entry.getKey(), entry.getValue());
                }
            }
            if (getAllService(str) != null) {
                iGlobalClientInfoService.registerAllRemoteService(str, getAllService(str));
            }
            if (SERVICES.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry2 : SERVICES.entrySet()) {
                iGlobalClientInfoService.registerRemoteService(entry2.getKey(), entry2.getValue());
            }
        } catch (IPCException e) {
            ALog.e(TAG, "recoverListener error", e, new Object[0]);
        }
    }

    public void recoverConnectionListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d1d047", new Object[]{this, str});
            return;
        }
        try {
            ArrayList<AccsConnectStateListener> arrayList = connListenerMap.get(str);
            if (arrayList == null || arrayList.isEmpty() || !m.u()) {
                return;
            }
            IGlobalClientInfoService iGlobalClientInfoService = (IGlobalClientInfoService) jzv.b(new ComponentName(mContext, AccsIPCProvider.class), IGlobalClientInfoService.class, new Pair(Context.class, mContext));
            for (AccsConnectStateListener accsConnectStateListener : arrayList) {
                iGlobalClientInfoService.registerRemoteConnectionListener(str, accsConnectStateListener.getClass().getName(), accsConnectStateListener);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "recoverConnectionListener error", th, new Object[0]);
        }
    }
}
