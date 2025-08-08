package com.taobao.accs.init;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ut.abtest.pipeline.accs.EvoAccsService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.center.AccsMainCenter;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.d;
import com.taobao.accs.internal.ACCSExceptionsReceiver;
import com.taobao.accs.internal.ACCSRestartService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.c;
import com.taobao.accs.utl.f;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.analysis.v3.v;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.control.NotifManager;
import tb.dcd;
import tb.ddk;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_InitAccs implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> SERVICES;
    private static final String TAG = "Launcher_InitAccs";
    public static String defaultAppkey;
    public static IAppReceiver mAppReceiver;
    public static String mAppkey;
    public static Context mContext;
    public static boolean mForceBindUser;
    public static volatile boolean mIsIdleTime;
    public static boolean mIsInited;
    private static ddk mRequestListener;
    public static String mSid;
    public static String mTtid;
    public static volatile String mUserId;

    public static /* synthetic */ ddk access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddk) ipChange.ipc$dispatch("4bd744a4", new Object[0]) : mRequestListener;
    }

    public static /* synthetic */ ddk access$002(ddk ddkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddk) ipChange.ipc$dispatch("24ce0a1d", new Object[]{ddkVar});
        }
        mRequestListener = ddkVar;
        return ddkVar;
    }

    static {
        kge.a(561873996);
        kge.a(1028243835);
        mForceBindUser = false;
        mIsInited = false;
        mIsIdleTime = false;
        defaultAppkey = "21646297";
        mAppReceiver = new IAppReceiver() { // from class: com.taobao.accs.init.Launcher_InitAccs.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.accs.IAppReceiver
            public void onUnbindUser(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f4f2cdc", new Object[]{this, new Integer(i)});
                } else if (!ALog.isPrintLog(ALog.Level.D)) {
                } else {
                    ALog.d(Launcher_InitAccs.TAG, "onUnbindUser, errorCode:" + i, new Object[0]);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onUnbindApp(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1230c610", new Object[]{this, new Integer(i)});
                } else if (!ALog.isPrintLog(ALog.Level.D)) {
                } else {
                    ALog.d(Launcher_InitAccs.TAG, "onUnbindApp,  errorCode:" + i, new Object[0]);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onSendData(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("46c12d21", new Object[]{this, str, new Integer(i)});
                } else if (!ALog.isPrintLog(ALog.Level.D)) {
                } else {
                    ALog.d(Launcher_InitAccs.TAG, "onSendData,  dataId:" + str + " errorCode:" + i, new Object[0]);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onData(String str, String str2, byte[] bArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20c4430b", new Object[]{this, str, str2, bArr});
                } else if (!ALog.isPrintLog(ALog.Level.D)) {
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onData,  userId:");
                    sb.append(str);
                    sb.append("dataId:");
                    sb.append(str2);
                    sb.append(" dataLen:");
                    sb.append(bArr == null ? 0 : bArr.length);
                    ALog.d(Launcher_InitAccs.TAG, sb.toString(), new Object[0]);
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onBindUser(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d2ee7e0b", new Object[]{this, str, new Integer(i)});
                    return;
                }
                ALog.e(Launcher_InitAccs.TAG, "onBindUser,", "isUserIdEmpty", Boolean.valueOf(StringUtils.isEmpty(str)), "errorCode", Integer.valueOf(i));
                if (i == 200 && UtilityImpl.isKeepAliveReport()) {
                    ALog.e(Launcher_InitAccs.TAG, "onBindUser return success by keepAliveReport", new Object[0]);
                    Launcher_InitAccs.mContext.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit().putLong(Constants.SP_KEY_BIND_USER_TIME, System.currentTimeMillis()).apply();
                } else if (i != 300) {
                } else {
                    try {
                        ACCSClient.getAccsClient().bindApp(Launcher_InitAccs.mTtid, this);
                    } catch (AccsException e) {
                        ALog.e(Launcher_InitAccs.TAG, "bindApp", e, new Object[0]);
                    }
                }
            }

            @Override // com.taobao.accs.IAppReceiver
            public void onBindApp(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a1fbb8b7", new Object[]{this, new Integer(i)});
                    return;
                }
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.e(Launcher_InitAccs.TAG, "onBindApp,  errorCode:" + i, new Object[0]);
                }
                if (i != 200) {
                    return;
                }
                if (UtilityImpl.isMainProcess(Launcher_InitAccs.mContext)) {
                    if (Launcher_InitAccs.access$000() == null) {
                        Launcher_InitAccs.access$002(new ddk(Launcher_InitAccs.mContext));
                    }
                    GlobalClientInfo.getInstance(Launcher_InitAccs.mContext).registerListener(NotifManager.getServiceId(Launcher_InitAccs.mContext, TaobaoConstants.SERVICE_ID_DEVICECMD), Launcher_InitAccs.access$000());
                }
                if (StringUtils.isEmpty(Launcher_InitAccs.mUserId) || (!Launcher_InitAccs.mIsIdleTime && !UtilityImpl.needPeriodicReport(Launcher_InitAccs.mContext, Constants.SP_KEY_BIND_USER_TIME))) {
                    ALog.e(Launcher_InitAccs.TAG, "onBindApp return early,", "isUserIdEmpty", Boolean.valueOf(StringUtils.isEmpty(Launcher_InitAccs.mUserId)), "mIsIdleTime", Boolean.valueOf(Launcher_InitAccs.mIsIdleTime));
                    return;
                }
                try {
                    ACCSClient.getAccsClient().bindUser(Launcher_InitAccs.mUserId, Launcher_InitAccs.mForceBindUser);
                    TaobaoRegister.setAlias(Launcher_InitAccs.mContext, Launcher_InitAccs.mUserId, new ICallback() { // from class: com.taobao.accs.init.Launcher_InitAccs.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass3.this = this;
                        }

                        @Override // com.taobao.agoo.ICallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                ALog.e(Launcher_InitAccs.TAG, "setAlias success", new Object[0]);
                            }
                        }

                        @Override // com.taobao.agoo.ICallback
                        public void onFailure(String str, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                                return;
                            }
                            ALog.e(Launcher_InitAccs.TAG, "setAlias fail, errDesc:" + str2 + " errorCode:" + str, new Object[0]);
                        }
                    });
                } catch (AccsException e) {
                    ALog.e(Launcher_InitAccs.TAG, "bindUser", e, new Object[0]);
                }
                Launcher_InitAccs.mForceBindUser = false;
            }

            @Override // com.taobao.accs.IAppReceiver
            public String getService(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46264ad0", new Object[]{this, str}) : Launcher_InitAccs.SERVICES.get(str);
            }

            @Override // com.taobao.accs.IAppReceiver
            public Map<String, String> getAllServices() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e25da25", new Object[]{this}) : Launcher_InitAccs.SERVICES;
            }
        };
        HashMap hashMap = new HashMap();
        SERVICES = hashMap;
        hashMap.put("im", "com.taobao.tao.amp.remote.AccsReceiverCallback");
        SERVICES.put("powermsg", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        SERVICES.put("pmmonitor", "com.taobao.appfrmbundle.mkt.AccsReceiverService");
        SERVICES.put("cloudsync", "com.taobao.datasync.network.accs.AccsCloudSyncService");
        SERVICES.put("acds", "com.taobao.acds.compact.AccsACDSService");
        SERVICES.put(GlobalClientInfo.AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        SERVICES.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        SERVICES.put("agooTokenReport", "org.android.agoo.accs.AgooService");
        SERVICES.put("AliLive", "com.taobao.playbudyy.gameplugin.danmu.DanmuCallbackService");
        SERVICES.put("orange", "com.taobao.orange.accssupport.OrangeAccsService");
        SERVICES.put("tsla", "com.taobao.android.festival.accs.HomepageAccsMassService");
        SERVICES.put("taobaoWaimaiAccsService", "com.taobao.takeout.order.detail.service.TakeoutOrderDetailACCSService");
        SERVICES.put("login", "com.taobao.android.sso.v2.service.LoginAccsService");
        SERVICES.put("ranger_abtest", "com.taobao.ranger3.RangerACCSService");
        SERVICES.put("accs_poplayer", "com.taobao.tbpoplayer.AccsPopLayerService");
        SERVICES.put("dm_abtest", "com.tmall.wireless.ant.accs.AntAccsService");
        SERVICES.put("family", "com.taobao.family.FamilyAccsService");
        SERVICES.put("adaemon", "com.taobao.adaemon.AdaemonMessageService");
        SERVICES.put("taobao-dingtalk", "com.laiwang.protocol.android.LwpAccsService");
        SERVICES.put("amp-sync", "com.taobao.message.init.accs.AccsReceiverCallback");
        SERVICES.put("friend_invite_msg", "com.taobao.message.init.accs.TaoFriendAccsReceiverCallback");
        SERVICES.put(WXBasicComponentType.SLIDER, "com.taobao.slide.accs.SlideAccsService");
        SERVICES.put("mtl_bypass", "com.android.taobao.safeclean.AccsBypassService");
        SERVICES.put("desktop_service", "com.taobao.desktop.channel.desktoplinktask.trigger.DesktopTaskTriggerService");
        SERVICES.put("metaserver", "com.taobao.android.artry.MetaServerAccsService");
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        initImpl(application, hashMap, 0);
        mIsIdleTime = true;
        ALog.e(TAG, "bindApp in Launcher_InitAccs init", new Object[0]);
        com.taobao.accs.common.a.a($$Lambda$Launcher_InitAccs$RTFoRsDs6pBnxm3wqNJPLBcX5M.INSTANCE);
        if (!UtilityImpl.isMainProcess(application)) {
            return;
        }
        traceAccs();
    }

    public static /* synthetic */ void lambda$init$3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa717fa3", new Object[0]);
            return;
        }
        try {
            ACCSClient.getAccsClient().bindApp(mTtid, mAppReceiver);
        } catch (AccsException e) {
            ALog.e(TAG, "bindApp", e, new Object[0]);
        }
    }

    public void initImpl(Application application, HashMap<String, Object> hashMap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af54a98", new Object[]{this, application, hashMap, new Integer(i)});
            return;
        }
        ALog.e(TAG, "init", new Object[0]);
        try {
            if (mIsInited) {
                ALog.e(TAG, "init return", new Object[0]);
                return;
            }
            Context applicationContext = application.getApplicationContext();
            mContext = applicationContext;
            UtilityImpl.debug(applicationContext);
            initAccs(application, hashMap);
            initADaemon(application, i);
            dynamicAddMsgReceiver();
            if (UtilityImpl.isMainProcess(mContext)) {
                mIsInited = true;
                launchInMain();
            } else if (UtilityImpl.isChannelProcess(mContext)) {
                launchInChannel();
            }
            UtilityImpl.asyncGetOAID(application, null);
        } catch (Throwable th) {
            ALog.e(TAG, "init", th, new Object[0]);
        }
    }

    private void dynamicAddMsgReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6b94d5", new Object[]{this});
            return;
        }
        try {
            SERVICES.put(com.taobao.update.datasource.accs.a.SERVICE_ID, "com.taobao.update.datasource.accs.AccsIpService");
            SERVICES.put("amp-sync", "com.taobao.message.init.accs.AccsMessageService");
        } catch (Throwable th) {
            ALog.e(TAG, "dynamicSetService err", th, new Object[0]);
        }
        com.taobao.accs.common.a.a($$Lambda$Launcher_InitAccs$9rWT5CEKlnV0E2xWO3qH5u08_WQ.INSTANCE);
    }

    public static /* synthetic */ void lambda$dynamicAddMsgReceiver$4() {
        try {
            ACCSClient.getAccsClient().registerDataListener(EvoAccsService.SERVICE_ID, (AccsAbstractDataListener) Class.forName("com.alibaba.ut.abtest.pipeline.accs.EvoAccsListener").newInstance());
            ALog.e(TAG, "dynamicAddReceiver finish", new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "dynamicAddMsgReceiver err", th, new Object[0]);
        }
    }

    private void initADaemon(final Application application, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff61620", new Object[]{this, application, new Integer(i)});
        } else if (!Launcher_InitAgooLifecycle.mADaemonValid) {
        } else {
            com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.init.-$$Lambda$Launcher_InitAccs$mXK-Ci3YgpO-5UGEza6XXQmfvAU
                @Override // java.lang.Runnable
                public final void run() {
                    Launcher_InitAccs.lambda$initADaemon$5(application);
                }
            }, i, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void lambda$initADaemon$5(Application application) {
        try {
            Launcher_InitAgooLifecycle.adaemonClazz.getMethod("initialize", Context.class).invoke(null, application);
        } catch (Exception e) {
            ALog.e(TAG, "adaemon initializeLifecycle error", e, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initAccs(android.app.Application r11, java.util.HashMap<java.lang.String, java.lang.Object> r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.init.Launcher_InitAccs.initAccs(android.app.Application, java.util.HashMap):void");
    }

    private void launchInMain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c492be18", new Object[]{this});
        } else {
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.init.-$$Lambda$Launcher_InitAccs$-v000JpNubbZC-yvmrK6zBNfL6g
                {
                    Launcher_InitAccs.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Launcher_InitAccs.this.lambda$launchInMain$7$Launcher_InitAccs();
                }
            });
        }
    }

    public /* synthetic */ void lambda$launchInMain$7$Launcher_InitAccs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdef50e8", new Object[]{this});
            return;
        }
        try {
            if (com.taobao.accs.utl.a.b()) {
                ALog.e(TAG, "init MainBinder in launchInMain", new Object[0]);
                AccsMainCenter.a().a(false);
            }
            ACCSClient.getAccsClient().setLoginInfo(new a());
            ACCSClient.getAccsClient().bindApp(mTtid, mAppReceiver);
            f.a().b();
            b.a(new AnonymousClass1());
        } catch (AccsException e) {
            ALog.e(TAG, "bindApp", e, new Object[0]);
        }
    }

    /* renamed from: com.taobao.accs.init.Launcher_InitAccs$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
            Launcher_InitAccs.this = r1;
        }

        @Override // com.alibaba.ability.localization.b.a
        public void a(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("246661b", new Object[]{this, language, str});
            } else {
                com.taobao.accs.common.a.a($$Lambda$Launcher_InitAccs$1$VuTMaOVBEw76uLRmlD27H187GKo.INSTANCE);
            }
        }

        public static /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            try {
                ALog.i(Launcher_InitAccs.TAG, "Locale change bindApp", new Object[0]);
                ACCSClient.getAccsClient().bindApp(Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
            } catch (AccsException e) {
                ALog.e(Launcher_InitAccs.TAG, "Locale change bindApp err", e, new Object[0]);
            }
        }
    }

    private void launchInChannel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cc10b2", new Object[]{this});
            return;
        }
        GlobalClientInfo.TAG_SERVICES.put("default", mAppReceiver.getAllServices());
        boolean isAppKeepAlive = UtilityImpl.isAppKeepAlive();
        ALog.e(TAG, "launchInChannel", "isAppKeepAlive", Boolean.valueOf(isAppKeepAlive));
        if (isAppKeepAlive) {
            d.getConnection(mContext, "default", true, -1);
            ACCSRestartService.a(mContext);
            Context context = mContext;
            UtilityImpl.enableService(context, new ComponentName(context, ACCSExceptionsReceiver.class));
            if (UtilityImpl.isReleaseAppVersion(mContext)) {
                UtilityImpl.enableService(mContext);
            }
        } else {
            Context context2 = mContext;
            UtilityImpl.disableComponent(context2, new ComponentName(context2, ACCSExceptionsReceiver.class));
        }
        Intent intent = new Intent(Constants.ACTION_START_SERVICE);
        intent.putExtra("appKey", mAppkey);
        intent.putExtra("ttid", mTtid);
        intent.putExtra("packageName", mContext.getPackageName());
        intent.putExtra("app_sercet", "");
        intent.putExtra("mode", AccsClientConfig.mEnv);
        intent.putExtra(Config.PROPERTY_APP_KEY, Config.getAgooAppKey(GlobalClientInfo.getContext()));
        intent.putExtra(Constants.KEY_CONFIG_TAG, "default");
        intent.putExtra("start", true);
        intent.setClassName(mContext.getPackageName(), c.channelService);
        dcd.a(mContext, intent);
        if (UtilityImpl.getServiceEnabled(mContext)) {
            return;
        }
        ALog.e(TAG, "channelService disabled", new Object[0]);
    }

    private void traceAccs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671803fe", new Object[]{this});
        } else {
            com.taobao.accs.common.a.a().schedule(new Runnable() { // from class: com.taobao.accs.init.Launcher_InitAccs.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    Launcher_InitAccs.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!Launcher_InitAgooLifecycle.hasConnected && !ACCSClient.getAccsClient().isAccsConnected()) {
                            str = "fail";
                            v.b().a("accs", "connect").e().a("status", str).c();
                        }
                        str = "success";
                        v.b().a("accs", "connect").e().a("status", str).c();
                    } catch (Throwable th) {
                        ALog.e(Launcher_InitAccs.TAG, "traceAccs error", th, new Object[0]);
                    }
                }
            }, 20L, TimeUnit.SECONDS);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ILoginInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1053556403);
            kge.a(-575911688);
        }

        @Override // com.taobao.accs.ILoginInfo
        public boolean getCommentUsed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fbf9f11", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getEcode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("42b43e5d", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getHeadPicLink() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getNick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getSsoToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d1ac5859", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getSid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("169fb061", new Object[]{this}) : Launcher_InitAccs.mSid;
        }

        @Override // com.taobao.accs.ILoginInfo
        public String getUserId() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : Launcher_InitAccs.mUserId;
        }
    }
}
