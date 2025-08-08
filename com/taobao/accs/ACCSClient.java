package com.taobao.accs;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.MessageFilter;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.f;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.o;
import com.taobao.aranger.utils.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class ACCSClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    public static Map<String, ACCSClient> mACCSClients;
    private static Context mContext;
    private String OTAG = TAG;
    public a mAccsManager;
    private AccsClientConfig mConfig;

    @Deprecated
    public String getUserUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59ed6b4", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(-949840377);
        TAG = "ACCSClient";
        mACCSClients = new ConcurrentHashMap(2);
    }

    public ACCSClient(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        this.OTAG += accsClientConfig.getTag();
        if (mContext == null) {
            Context context = GlobalClientInfo.mContext;
            mContext = context;
            if (context == null) {
                try {
                    mContext = jzv.a();
                } catch (Exception e) {
                    ALog.e(TAG, "[getContext]", e, new Object[0]);
                }
            }
        }
        this.mAccsManager = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
    }

    public static synchronized String init(Context context, String str) throws AccsException {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b8da0465", new Object[]{context, str});
            } else if (context == null || StringUtils.isEmpty(str)) {
                throw new AccsException("params error");
            } else {
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                if (!AccsClientConfig.loadedStaticConfig) {
                    configByTag = new AccsClientConfig.Builder().setAppKey(str).build();
                    ALog.i(TAG, "init", "create config, appkey as tag");
                }
                return init(context, configByTag);
            }
        }
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) throws AccsException {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("67b103a9", new Object[]{context, accsClientConfig});
            } else if (context == null || accsClientConfig == null) {
                throw new AccsException("init AccsClient params error");
            } else {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    ALog.isUseTlog = false;
                    anet.channel.util.ALog.setUseTlog(false);
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    mContext = applicationContext;
                    GlobalClientInfo.mContext = applicationContext;
                }
                ALog.d(TAG, "init", "config", accsClientConfig);
                return accsClientConfig.getTag();
            }
        }
    }

    public static void onApplicationCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8056250b", new Object[]{application});
            return;
        }
        if (UtilityImpl.isMainProcess(application)) {
            f.a().a(application);
        }
        if (c.a(application, 3)) {
            ConnectionServiceManager.getInstance().coldLaunch();
        }
        if (UtilityImpl.isMainProcess(application)) {
            if (UtilityImpl.isChannelProcessAlive(application)) {
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(104));
            } else {
                com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(100));
            }
        } else if (UtilityImpl.isMainProcessAlive(application)) {
            com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(104));
        } else {
            com.taobao.accs.connection.state.a.a().b(StateMachine.Event.obtain(102));
        }
    }

    public static ACCSClient getAccsClient() throws AccsException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ACCSClient) ipChange.ipc$dispatch("74b5d7a4", new Object[0]) : getAccsClient(null);
    }

    public static synchronized ACCSClient getAccsClient(String str) throws AccsException {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ACCSClient) ipChange.ipc$dispatch("56b41a1a", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
                str = "default";
                ALog.w(TAG, "getAccsClient", "configTag is null, use default!");
            }
            ALog.i(TAG, "getAccsClient", Constants.KEY_CONFIG_TAG, str);
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag == null && AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG.equals(str)) {
                com.taobao.accs.client.c.f8209a = true;
                ALog.e(TAG, "v2Launched = true", new Object[0]);
                if (com.taobao.accs.utl.c.a(GlobalClientInfo.getContext())) {
                    initV2ConnectionConfig();
                    configByTag = AccsClientConfig.getConfigByTag(str);
                }
            }
            if (configByTag == null) {
                ALog.e(TAG, "getAccsClient", "configTag not exist, please init first!!");
                throw new AccsException("configTag not exist");
            }
            ACCSClient aCCSClient = mACCSClients.get(str);
            if (aCCSClient == null) {
                ALog.d(TAG, "getAccsClient create client", new Object[0]);
                ACCSClient aCCSClient2 = new ACCSClient(configByTag);
                mACCSClients.put(str, aCCSClient2);
                aCCSClient2.updateConfig(configByTag);
                return aCCSClient2;
            }
            if (configByTag.equals(aCCSClient.mConfig)) {
                ALog.i(TAG, "getAccsClient exists", new Object[0]);
            } else {
                ALog.i(TAG, "getAccsClient update config", "old config", aCCSClient.mConfig.getTag(), "new config", configByTag.getTag());
                aCCSClient.updateConfig(configByTag);
            }
            return aCCSClient;
        }
    }

    private static void initV2ConnectionConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff48613", new Object[0]);
            return;
        }
        Context context = GlobalClientInfo.getContext();
        try {
            AccsClientConfig.Builder connType = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setConfigEnv(AccsClientConfig.mEnv).setTag(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).setVersion(2).setConnType("4");
            if (AccsClientConfig.mEnv == 0) {
                connType.setInappHost("umsgacs.m.taobao.com");
            } else {
                connType.setInappHost("umsgacs.wapa.taobao.com");
            }
            AccsClientConfig build = connType.build();
            ALog.e(TAG, "Build v2 connection", "appkey", build.getAppKey(), "env", Integer.valueOf(build.getConfigEnv()), "host", build.getInappHost());
            GlobalClientInfo.getInstance(context).setAppReceiver(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG, Launcher_InitAccs.mAppReceiver);
        } catch (Throwable th) {
            ALog.e(TAG, "v2 construct err", th, new Object[0]);
        }
    }

    private void updateConfig(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
            return;
        }
        this.mConfig = accsClientConfig;
        this.mAccsManager = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
        a aVar = this.mAccsManager;
        if (aVar == null) {
            return;
        }
        aVar.updateConfig(accsClientConfig);
    }

    public static synchronized void setEnvironment(Context context, int i) {
        synchronized (ACCSClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81bb0293", new Object[]{context, new Integer(i)});
                return;
            }
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    ALog.isUseTlog = false;
                    anet.channel.util.ALog.setUseTlog(false);
                }
            }
            if (i < 0 || i > 2) {
                ALog.e(TAG, "env error", "env", Integer.valueOf(i));
                i = 0;
            }
            int i2 = AccsClientConfig.mEnv;
            AccsClientConfig.mEnv = i;
            if (i2 != i && o.e(context)) {
                ALog.i(TAG, "setEnvironment", "preEnv", Integer.valueOf(i2), "toEnv", Integer.valueOf(i));
                o.c(context);
                o.f(context);
                o.d(context);
                if (i == 2) {
                    SessionCenter.switchEnvironment(ENV.TEST);
                } else if (i == 1) {
                    SessionCenter.switchEnvironment(ENV.PREPARE);
                }
                for (Map.Entry<String, ACCSClient> entry : mACCSClients.entrySet()) {
                    try {
                        getAccsClient(entry.getKey());
                    } catch (AccsException e) {
                        ALog.e(TAG, "setEnvironment update client", e, new Object[0]);
                    }
                }
            }
            o.a(context, i);
        }
    }

    public void bindApp(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7f6c13", new Object[]{this, str, iAppReceiver});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindApp mAccsManager null", new Object[0]);
        } else {
            aVar.bindApp(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void bindUser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc42a39", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            aVar.bindUser(mContext, str);
        }
    }

    public void bindUser(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac1cfbb", new Object[]{this, str, new Boolean(z)});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            aVar.bindUser(mContext, str, z);
        }
    }

    public void unbindUser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a87f48", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unbindUser mAccsManager null", new Object[0]);
        } else {
            aVar.unbindUser(mContext);
        }
    }

    public void bindService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8548c49", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "bindService mAccsManager null", new Object[0]);
        } else {
            aVar.bindService(mContext, str);
        }
    }

    public void unbindService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0a74d0", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unbindService mAccsManager null", new Object[0]);
        } else {
            aVar.unbindService(mContext, str);
        }
    }

    public long getServerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue();
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "getServerTime mAccsManager null", new Object[0]);
            return 0L;
        }
        return aVar.getServerTime();
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79bb5762", new Object[]{this, accsRequest});
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "sendData mAccsManager null", new Object[0]);
            return null;
        }
        return aVar.sendData(mContext, accsRequest);
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72735337", new Object[]{this, accsRequest});
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "sendRequest mAccsManager null", new Object[0]);
            return null;
        }
        return aVar.sendRequest(mContext, accsRequest);
    }

    public void subscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35c9661", new Object[]{this, accsStreamConfig});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "subscribeStream mAccsManager null", new Object[0]);
        } else {
            aVar.subscribeStream(accsStreamConfig);
        }
    }

    public void unSubscribeStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939fda", new Object[]{this, accsStreamConfig});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unSubscribeStream mAccsManager null", new Object[0]);
        } else {
            aVar.unSubscribeStream(accsStreamConfig);
        }
    }

    public void queryStream(AccsStreamConfig accsStreamConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8467ea3", new Object[]{this, accsStreamConfig});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "queryStream mAccsManager null", new Object[0]);
        } else {
            aVar.queryStream(accsStreamConfig);
        }
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a15df9c", new Object[]{this, accsRequest, extraInfo});
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "sendPushResponse mAccsManager null", new Object[0]);
            return null;
        }
        return aVar.sendPushResponse(mContext, accsRequest, extraInfo);
    }

    public boolean isNetworkReachable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401eec14", new Object[]{this})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "isNetworkReachable mAccsManager null", new Object[0]);
            return false;
        }
        return aVar.isNetworkReachable(mContext);
    }

    public void forceDisableService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46b8eff", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "forceDisableService mAccsManager null", new Object[0]);
        } else {
            aVar.forceDisableService(mContext);
        }
    }

    public void forceEnableService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1262738e", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "forceEnableService mAccsManager null", new Object[0]);
        } else {
            aVar.forceEnableService(mContext);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea3b67", new Object[]{this, str, iAppReceiver});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "startInAppConnection mAccsManager null", new Object[0]);
        } else {
            aVar.startInAppConnection(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57517b3", new Object[]{this, iLoginInfo});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "setLoginInfo mAccsManager null", new Object[0]);
        } else {
            aVar.setLoginInfo(mContext, iLoginInfo);
        }
    }

    public void clearLoginInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae629b71", new Object[]{this});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "clearLoginInfo mAccsManager null", new Object[0]);
        } else {
            aVar.clearLoginInfo(mContext);
        }
    }

    public boolean cancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5301f18f", new Object[]{this, str})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "cancel mAccsManager null", new Object[0]);
            return false;
        }
        return aVar.cancel(mContext, str);
    }

    public boolean isChannelError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf2cfb1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "isChannelError mAccsManager null", new Object[0]);
            return true;
        }
        return aVar.isChannelError(i);
    }

    public Map<String, Boolean> getChannelState() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83cd4940", new Object[]{this});
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "getChannelState mAccsManager null", new Object[0]);
            return null;
        }
        return aVar.getChannelState();
    }

    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b612f593", new Object[]{this});
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "forceReConnectChannel mAccsManager null", new Object[0]);
            return null;
        }
        return aVar.forceReConnectChannel();
    }

    public void registerSerivce(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601710a7", new Object[]{this, str, str2});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerSerivce mAccsManager null", new Object[0]);
        } else {
            aVar.registerSerivce(mContext, str, str2);
        }
    }

    public void unRegisterSerivce(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447b104", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unRegisterSerivce mAccsManager null", new Object[0]);
        } else {
            aVar.unRegisterSerivce(mContext, str);
        }
    }

    public void registerHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf7e846", new Object[]{this, iHeartBeat});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerHeartBeatListener mAccsManager null", new Object[0]);
        } else {
            aVar.registerHeartBeatListener(iHeartBeat);
        }
    }

    public void unregisterHeartBeatListener(IHeartBeat iHeartBeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee6bcd", new Object[]{this, iHeartBeat});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unregisterHeartBeatListener mAccsManager null", new Object[0]);
        } else {
            aVar.unregisterHeartBeatListener(iHeartBeat);
        }
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d61aa9", new Object[]{this, str, accsAbstractDataListener});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerDataListener mAccsManager null", new Object[0]);
        } else {
            aVar.registerDataListener(mContext, str, accsAbstractDataListener);
        }
    }

    public void unRegisterDataListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cc540b", new Object[]{this, str});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unRegisterDataListener mAccsManager null", new Object[0]);
        } else {
            aVar.unRegisterDataListener(mContext, str);
        }
    }

    public boolean registerMessageFilter(String str, MessageFilter messageFilter) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d72ea9d5", new Object[]{this, str, messageFilter})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || messageFilter == null) {
            String str2 = TAG;
            Object[] objArr = new Object[4];
            objArr[0] = "serviceId";
            objArr[1] = str;
            objArr[2] = "filter";
            if (messageFilter != null) {
                z = false;
            }
            objArr[3] = Boolean.valueOf(z);
            ALog.e(str2, "registerMessageFilter param err", objArr);
            return false;
        }
        GlobalClientInfo.FILTERS.put(str, messageFilter);
        ALog.e(TAG, "registerMessageFilter", "serviceId", str, "filter", messageFilter);
        return true;
    }

    public boolean unRegisterMessageFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97f141b8", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            ALog.e(TAG, "unRegisterMessageFilter param err", "serviceId", str);
            return false;
        }
        boolean z = GlobalClientInfo.FILTERS.remove(str) != null;
        ALog.e(TAG, "unRegisterMessageFilter", "serviceId", str, "result", Boolean.valueOf(z));
        return z;
    }

    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "registerConnectStateListener mAccsManager null", new Object[0]);
        } else {
            aVar.registerConnectStateListener(accsConnectStateListener);
        }
    }

    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "unRegisterConnectStateListener mAccsManager null", new Object[0]);
        } else {
            aVar.unRegisterConnectStateListener(accsConnectStateListener);
        }
    }

    public void sendBusinessAck(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acea1bf4", new Object[]{this, str, str2, str3, new Short(s), str4, map});
            return;
        }
        a aVar = this.mAccsManager;
        if (aVar == null) {
            ALog.e(this.OTAG, "sendBusinessAck mAccsManager null", new Object[0]);
        } else {
            aVar.sendBusinessAck(str, str2, str3, s, str4, map);
        }
    }

    public boolean isAccsConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eec7c18", new Object[]{this})).booleanValue();
        }
        a aVar = this.mAccsManager;
        return aVar != null && aVar.isAccsConnected();
    }

    public String getConnectionUnitInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d9bf73", new Object[]{this});
        }
        a aVar = this.mAccsManager;
        if (aVar != null) {
            return aVar.getConnectionUnitInfo();
        }
        return null;
    }

    public static String getRegId(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61356cf8", new Object[]{context}) : l.q(context);
    }
}
