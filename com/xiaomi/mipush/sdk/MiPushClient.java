package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ax;
import com.xiaomi.push.bm;
import com.xiaomi.push.ds;
import com.xiaomi.push.ec;
import com.xiaomi.push.ed;
import com.xiaomi.push.fa;
import com.xiaomi.push.fb;
import com.xiaomi.push.fc;
import com.xiaomi.push.fn;
import com.xiaomi.push.ic;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.iw;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.jg;
import com.xiaomi.push.ji;
import com.xiaomi.push.jk;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    /* loaded from: classes9.dex */
    public static class CodeResult {
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        protected void setResultCode(long j) {
            this.resultCode = j;
        }
    }

    /* loaded from: classes9.dex */
    public interface ICallbackResult<R> {
        void onResult(R r);
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public static abstract class MiPushClientCallback {
        private String category;

        /* JADX INFO: Access modifiers changed from: protected */
        public String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        protected void setCategory(String str) {
            this.category = str;
        }
    }

    /* loaded from: classes9.dex */
    public static class TokenResult {
        private String token = null;
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public String getToken() {
            return this.token;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void setResultCode(long j) {
            this.resultCode = j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void setToken(String str) {
            this.token = str;
        }
    }

    /* loaded from: classes9.dex */
    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    /* loaded from: classes9.dex */
    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    /* loaded from: classes9.dex */
    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        String acceptTime = getAcceptTime(context);
        return StringUtils.equals(acceptTime, str + "," + str2);
    }

    public static long accountSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("account_" + str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + "," + str2);
            com.xiaomi.push.p.a(edit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        com.xiaomi.push.p.a(edit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        com.xiaomi.push.p.a(edit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("alias_" + str, -1L);
    }

    public static void awakeApps(final Context context, final String[] strArr) {
        com.xiaomi.push.ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.4
            @Override // java.lang.Runnable
            public void run() {
                String[] strArr2;
                PackageInfo packageInfo;
                try {
                    for (String str : strArr) {
                        if (!StringUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 4)) != null) {
                            MiPushClient.awakePushServiceByPackageInfo(context, packageInfo);
                        }
                    }
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.a(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("param " + str + " is not nullable");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it = getAllAlias(context).iterator();
        while (it.hasNext()) {
            edit.remove("alias_" + it.next());
        }
        Iterator<String> it2 = getAllUserAccount(context).iterator();
        while (it2.hasNext()) {
            edit.remove("account_" + it2.next());
        }
        Iterator<String> it3 = getAllTopic(context).iterator();
        while (it3.hasNext()) {
            edit.remove("topic_" + it3.next());
        }
        edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        ao.a(context).f();
    }

    public static void clearNotification(Context context) {
        ao.a(context).a(-1);
    }

    public static void clearNotification(Context context, int i) {
        ao.a(context).a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        ao.a(context).a(str, str2);
    }

    public static void disablePush(Context context) {
        ao.a(context).a(true);
    }

    public static void enablePush(Context context) {
        ao.a(context).a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (b.m1665a(context).m1674c()) {
            return b.m1665a(context).f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return com.xiaomi.push.j.m2121b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return f.a(context).b(e.ASSEMBLE_PUSH_FCM);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return f.a(context).b(e.ASSEMBLE_PUSH_HUAWEI);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return f.a(context).b(e.ASSEMBLE_PUSH_COS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean getOpenVIVOPush(Context context) {
        return f.a(context).b(e.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (b.m1665a(context).m1674c()) {
            return b.m1665a(context).m1673c();
        }
        return null;
    }

    private static void initEventPerfLogic(final Context context) {
        fc.a(new fc.a() { // from class: com.xiaomi.mipush.sdk.MiPushClient.5
            @Override // com.xiaomi.push.fc.a
            public void uploader(Context context2, ig igVar) {
                MiTinyDataClient.upload(context2, igVar);
            }
        });
        Config a2 = fc.a(context);
        com.xiaomi.clientreport.manager.a.a(context).a(BuildConfig.VERSION_NAME);
        ClientReportClient.init(context, a2, new fa(context), new fb(context));
        a.a(context);
        t.a(context, a2);
        az.a(context).a(new az.a(100, "perf event job update") { // from class: com.xiaomi.mipush.sdk.MiPushClient.6
            @Override // com.xiaomi.push.service.az.a
            protected void onCallback() {
                fc.m1920a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
        try {
            com.xiaomi.channel.commonutils.logger.b.a(context.getApplicationContext());
            com.xiaomi.channel.commonutils.logger.b.e("sdk_version = 5_3_0-C");
            ax.a(context).mo1730a();
            ds.a(context);
            if (miPushClientCallback != null) {
                PushMessageHandler.a(miPushClientCallback);
            }
            if (iCallbackResult != null) {
                PushMessageHandler.a(iCallbackResult);
            }
            if (com.xiaomi.push.r.m2215a(sContext)) {
                v.a(sContext);
            }
            boolean z = b.m1665a(sContext).a() != Constants.a();
            if (!z && !shouldSendRegRequest(sContext)) {
                ao.a(sContext).m1655a();
                com.xiaomi.channel.commonutils.logger.b.m1616a("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !b.m1665a(sContext).a(str, str2) || b.m1665a(sContext).m1677f()) {
                String a2 = bm.a(6);
                b.m1665a(sContext).m1667a();
                b.m1665a(sContext).a(Constants.a());
                b.m1665a(sContext).a(str, str2, a2);
                MiTinyDataClient.a.a().b(MiTinyDataClient.PENDING_REASON_APPID);
                clearExtras(sContext);
                clearNotification(context);
                jc jcVar = new jc();
                jcVar.a(bc.b());
                jcVar.b(str);
                jcVar.e(str2);
                jcVar.d(sContext.getPackageName());
                jcVar.f(a2);
                Context context2 = sContext;
                jcVar.c(com.xiaomi.push.g.m1946a(context2, context2.getPackageName()));
                Context context3 = sContext;
                jcVar.b(com.xiaomi.push.g.a(context3, context3.getPackageName()));
                jcVar.h(BuildConfig.VERSION_NAME);
                jcVar.a(BuildConfig.VERSION_CODE);
                jcVar.a(iq.Init);
                if (!StringUtils.isEmpty(str3)) {
                    jcVar.g(str3);
                }
                if (!com.xiaomi.push.j.m2123d()) {
                    String d = com.xiaomi.push.i.d(sContext);
                    if (!StringUtils.isEmpty(d)) {
                        jcVar.i(bm.a(d) + "," + com.xiaomi.push.i.f(sContext));
                    }
                }
                int a3 = com.xiaomi.push.i.a();
                if (a3 >= 0) {
                    jcVar.c(a3);
                }
                ao.a(sContext).a(jcVar, z);
                sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == PushMessageHelper.getPushMode(sContext)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0L, null, b.m1665a(sContext).m1673c());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b.m1665a(sContext).m1673c());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f362a, arrayList, 0L, null, null, null));
                }
                ao.a(sContext).m1655a();
                if (b.m1665a(sContext).m1669a()) {
                    jb jbVar = new jb();
                    jbVar.b(b.m1665a(sContext).m1666a());
                    jbVar.c(im.ClientInfoUpdate.f538a);
                    jbVar.a(bc.a());
                    jbVar.f678a = new HashMap();
                    Map<String, String> map = jbVar.f678a;
                    Context context4 = sContext;
                    map.put("app_version", com.xiaomi.push.g.m1946a(context4, context4.getPackageName()));
                    Map<String, String> map2 = jbVar.f678a;
                    Context context5 = sContext;
                    map2.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.push.g.a(context5, context5.getPackageName())));
                    jbVar.f678a.put("push_sdk_vn", BuildConfig.VERSION_NAME);
                    jbVar.f678a.put("push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                    String e = b.m1665a(sContext).e();
                    if (!StringUtils.isEmpty(e)) {
                        jbVar.f678a.put("deviceid", e);
                    }
                    ao.a(sContext).a((ao) jbVar, ic.Notification, false, (ip) null);
                    ao.a(sContext).m1656a(sContext);
                }
                if (!com.xiaomi.push.k.m2204a(sContext, "update_devId", false)) {
                    updateImeiOrOaid();
                    com.xiaomi.push.k.a(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    jb jbVar2 = new jb();
                    jbVar2.b(b.m1665a(sContext).m1666a());
                    jbVar2.c(im.PullOfflineMessage.f538a);
                    jbVar2.a(bc.a());
                    jbVar2.a(false);
                    ao.a(sContext).a((ao) jbVar2, ic.Notification, false, (ip) null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            av.a(sContext);
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                if (Logger.getUserLogger() != null) {
                    Logger.setLogger(sContext, Logger.getUserLogger());
                }
                com.xiaomi.channel.commonutils.logger.b.a(2);
            }
            operateSyncAction(context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
        }
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(af.a(sContext).a(au.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(af.a(sContext).a(au.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_HUAWEI_TOKEN))) {
            ao.a(sContext).a((String) null, au.UPLOAD_HUAWEI_TOKEN, e.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_COS_TOKEN))) {
            ao.a(sContext).a((String) null, au.UPLOAD_COS_TOKEN, e.ASSEMBLE_PUSH_COS, "init");
        }
        if ("syncing".equals(af.a(sContext).a(au.UPLOAD_FTOS_TOKEN))) {
            ao.a(context).a((String) null, au.UPLOAD_FTOS_TOKEN, e.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reInitialize(Context context, iq iqVar) {
        com.xiaomi.channel.commonutils.logger.b.e("re-register reason: " + iqVar);
        String a2 = bm.a(6);
        String m1666a = b.m1665a(context).m1666a();
        String b = b.m1665a(context).b();
        b.m1665a(context).m1667a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        b.m1665a(context).a(Constants.a());
        b.m1665a(context).a(m1666a, b, a2);
        jc jcVar = new jc();
        jcVar.a(bc.b());
        jcVar.b(m1666a);
        jcVar.e(b);
        jcVar.f(a2);
        jcVar.d(context.getPackageName());
        jcVar.c(com.xiaomi.push.g.m1946a(context, context.getPackageName()));
        jcVar.b(com.xiaomi.push.g.a(context, context.getPackageName()));
        jcVar.h(BuildConfig.VERSION_NAME);
        jcVar.a(BuildConfig.VERSION_CODE);
        jcVar.a(iqVar);
        int a3 = com.xiaomi.push.i.a();
        if (a3 >= 0) {
            jcVar.c(a3);
        }
        ao.a(context).a(jcVar, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            com.xiaomi.push.l.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("dynamic register network status receiver failed:" + th);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null, null);
    }

    private static void registerPush(Context context, final String str, final String str2, PushConfiguration pushConfiguration, final String str3, final ICallbackResult iCallbackResult) {
        checkNotNull(context, "context");
        checkNotNull(str, LogContext.STORAGE_APPID);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        com.xiaomi.push.r.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        f.a(sContext).a(pushConfiguration);
        com.xiaomi.push.ah.a(context2).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.1
            @Override // java.lang.Runnable
            public void run() {
                MiPushClient.initialize(MiPushClient.sContext, str, str2, null, str3, iCallbackResult);
            }
        });
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, null);
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), null, uPSRegisterCallBack);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
            com.xiaomi.push.p.a(edit);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("account_" + str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("alias_" + str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllUserAccount(context)) {
                removeAccount(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllAlias(context)) {
                removeAlias(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllTopic(context)) {
                removeTopic(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("topic_" + str).commit();
        }
    }

    public static void removeWindow(Context context) {
        ao.a(context).m1664e();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (!b.m1665a(context).m1672b()) {
            return;
        }
        im imVar = z ? im.APP_SLEEP : im.APP_WAKEUP;
        jb jbVar = new jb();
        jbVar.b(b.m1665a(context).m1666a());
        jbVar.c(imVar.f538a);
        jbVar.d(context.getPackageName());
        jbVar.a(bc.a());
        jbVar.a(false);
        ao.a(context).a((ao) jbVar, ic.Notification, false, (ip) null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reportIgnoreRegMessageClicked(Context context, String str, ip ipVar, String str2, String str3) {
        jb jbVar = new jb();
        if (StringUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
            return;
        }
        jbVar.b(str3);
        jbVar.c("bar:click");
        jbVar.a(str);
        jbVar.a(false);
        ao.a(context).a(jbVar, ic.Notification, false, true, ipVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        ip ipVar = new ip();
        ipVar.a(miPushMessage.getMessageId());
        ipVar.b(miPushMessage.getTopic());
        ipVar.d(miPushMessage.getDescription());
        ipVar.c(miPushMessage.getTitle());
        ipVar.c(miPushMessage.getNotifyId());
        ipVar.a(miPushMessage.getNotifyType());
        ipVar.b(miPushMessage.getPassThrough());
        ipVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), ipVar, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reportMessageClicked(Context context, String str, ip ipVar, String str2) {
        jb jbVar = new jb();
        if (StringUtils.isEmpty(str2)) {
            if (!b.m1665a(context).m1672b()) {
                com.xiaomi.channel.commonutils.logger.b.d("do not report clicked message");
                return;
            }
            str2 = b.m1665a(context).m1666a();
        }
        jbVar.b(str2);
        jbVar.c("bar:click");
        jbVar.a(str);
        jbVar.a(false);
        ao.a(context).a((ao) jbVar, ic.Notification, false, ipVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (az.a(sContext).a(ih.DataCollectionSwitch.a(), getDefaultSwitch())) {
            ec.a().a(new r(context));
            com.xiaomi.push.ah.a(sContext).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.2
                @Override // java.lang.Runnable
                public void run() {
                    ed.a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        com.xiaomi.push.ah.a(sContext).a(new ae(sContext), az.a(sContext).a(ih.OcVersionCheckFrequency.a(), RemoteMessageConst.DEFAULT_TTL), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j = ((((i * 60) + i2) + rawOffset) + 1440) % 1440;
        long j2 = ((((i3 * 60) + i4) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, fn.COMMAND_SET_ACCEPT_TIME.f362a, arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, fn.COMMAND_SET_ACCEPT_TIME.f362a, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fn.COMMAND_SET_ACCEPT_TIME.f362a, arrayList2, 0L, null, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!StringUtils.isEmpty(str)) {
            setCommand(context, fn.COMMAND_SET_ALIAS.f362a, str, str2);
        }
    }

    protected static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!StringUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (fn.COMMAND_SET_ALIAS.f362a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fn.COMMAND_SET_ALIAS.f362a, arrayList, 0L, null, str3, null));
            }
        } else if (fn.COMMAND_UNSET_ALIAS.f362a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Don't cancel alias for " + bm.a(arrayList.toString(), 3) + " is unseted");
        } else if (fn.COMMAND_SET_ACCOUNT.f362a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < 3600000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fn.COMMAND_SET_ACCOUNT.f362a, arrayList, 0L, null, str3, null));
            }
        } else if (!fn.COMMAND_UNSET_ACCOUNT.f362a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, arrayList, str3);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Don't cancel account for " + bm.a(arrayList.toString(), 3) + " is unseted");
        }
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (StringUtils.isEmpty(b.m1665a(context).m1666a())) {
            return;
        }
        iw iwVar = new iw();
        String a2 = bc.a();
        iwVar.a(a2);
        iwVar.b(b.m1665a(context).m1666a());
        iwVar.c(str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            iwVar.m2093a(it.next());
        }
        iwVar.e(str2);
        iwVar.d(context.getPackageName());
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + str + ", " + a2);
        ao.a(context).a((ao) iwVar, ic.Command, (ip) null);
    }

    public static void setLocalNotificationType(Context context, int i) {
        ao.a(context).b(i);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!StringUtils.isEmpty(str)) {
            setCommand(context, fn.COMMAND_SET_ACCOUNT.f362a, str, str2);
        }
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return ao.a(context).m1658a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (StringUtils.isEmpty(b.m1665a(context).m1666a()) || StringUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fn.COMMAND_SUBSCRIBE_TOPIC.f362a, arrayList, 0L, null, null, null));
            return;
        }
        jg jgVar = new jg();
        String a2 = bc.a();
        jgVar.a(a2);
        jgVar.b(b.m1665a(context).m1666a());
        jgVar.c(str);
        jgVar.d(context.getPackageName());
        jgVar.e(str2);
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + fn.COMMAND_SUBSCRIBE_TOPIC + ", " + a2);
        ao.a(context).a((ao) jgVar, ic.Subscription, (ip) null);
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    public static void syncAssembleFCMPushToken(Context context) {
        ao.a(context).a((String) null, au.UPLOAD_FCM_TOKEN, e.ASSEMBLE_PUSH_FCM, "");
    }

    @Deprecated
    public static void syncAssembleFTOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssemblePushToken(Context context) {
    }

    public static long topicSubscribedTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken(null);
            tokenResult.getToken();
            tokenResult.setResultCode(0L);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        i.c(context);
        az.a(context).a();
        if (!b.m1665a(context).m1672b()) {
            return;
        }
        ji jiVar = new ji();
        jiVar.a(bc.a());
        jiVar.b(b.m1665a(context).m1666a());
        jiVar.c(b.m1665a(context).m1673c());
        jiVar.e(b.m1665a(context).b());
        jiVar.d(context.getPackageName());
        ao.a(context).a(jiVar);
        PushMessageHandler.a();
        PushMessageHandler.b();
        b.m1665a(context).m1671b();
        clearLocalNotificationType(context);
        clearNotification(context);
        clearExtras(context);
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, fn.COMMAND_UNSET_ALIAS.f362a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, fn.COMMAND_UNSET_ACCOUNT.f362a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (!b.m1665a(context).m1672b()) {
            return;
        }
        if (topicSubscribedTime(context, str) < 0) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Don't cancel subscribe for " + bm.a(str, 3) + " is unsubscribed");
            return;
        }
        jk jkVar = new jk();
        String a2 = bc.a();
        jkVar.a(a2);
        jkVar.b(b.m1665a(context).m1666a());
        jkVar.c(str);
        jkVar.d(context.getPackageName());
        jkVar.e(str2);
        com.xiaomi.channel.commonutils.logger.b.e("cmd:" + fn.COMMAND_UNSUBSCRIBE_TOPIC + ", " + a2);
        ao.a(context).a((ao) jkVar, ic.UnSubscription, (ip) null);
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.3
            @Override // java.lang.Runnable
            public void run() {
                String c;
                if (!com.xiaomi.push.j.m2123d()) {
                    if (com.xiaomi.push.i.c(MiPushClient.sContext) == null && !ax.a(MiPushClient.sContext).mo1730a()) {
                        return;
                    }
                    jb jbVar = new jb();
                    jbVar.b(b.m1665a(MiPushClient.sContext).m1666a());
                    jbVar.c(im.ClientInfoUpdate.f538a);
                    jbVar.a(bc.a());
                    jbVar.a(new HashMap());
                    String str = "";
                    if (!StringUtils.isEmpty(com.xiaomi.push.i.c(MiPushClient.sContext))) {
                        str = str + bm.a(c);
                    }
                    String e = com.xiaomi.push.i.e(MiPushClient.sContext);
                    if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(e)) {
                        str = str + "," + e;
                    }
                    if (!StringUtils.isEmpty(str)) {
                        jbVar.m2129a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    ax.a(MiPushClient.sContext).a(jbVar.m2129a());
                    int a2 = com.xiaomi.push.i.a();
                    if (a2 >= 0) {
                        jbVar.m2129a().put("space_id", Integer.toString(a2));
                    }
                    ao.a(MiPushClient.sContext).a((ao) jbVar, ic.Notification, false, (ip) null);
                }
            }
        }).start();
    }
}
