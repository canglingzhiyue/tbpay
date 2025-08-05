package com.taobao.android.middleware.compat;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.l;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes.dex */
public class MtopInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_PROCESS_NAME = "com.taobao.taobao:channel";
    private static final String GUIDE_DAILY_DOMAIN = "guide-acs.waptest.taobao.com";
    private static final String GUIDE_ONLINE_DOMAIN = "guide-acs.m.taobao.com";
    private static final String GUIDE_PRE_DOMAIN = "guide-acs.wapa.taobao.com";
    private static final String MTOP_DELAY_INIT = "mtop_delay_init";
    private static final String MTOP_ID_INNER = "INNER";
    private static final String MTOP_ID_SSR = "SSR";
    private static final String MTOP_SITE_INNER = "taobao";
    private static final String MTOP_SITE_SSR = "mtop_ssr";
    private static final String TAG = "mtopsdk.MtopInitializer";
    private static Language currLanguage;
    private static final BroadcastReceiver receiver;
    private static String regId;
    private static final String[] sInstanceIds = {"MTOP_ID_ELEME", "MTOP_ID_XIANYU", "MTOP_ID_KOUBEI"};
    private static final String[] sAccountSites = {"eleme", "xianyu", "koubei"};
    private static final String[] ELEME_DOMAINS = {"shopping.ele.me", "ppe-shopping.ele.me", "acs-waptest.eleme.test"};
    private static final String[] XIANYU_DOMAINS = {"acs.m.goofish.com", "acs.wapa.goofish.com", "acs.wapatest.goofish.com"};
    private static final String[] KOUBEI_DOMAINS = {"acs.m.koubei.com", "acs-pre.koubei.com", MtopUnitStrategy.CENTER_DAILY_DOMAIN};
    private static final String[] SSR_DOMAINS = {"guide-acs.m.taobao.com", "guide-acs.wapa.taobao.com", "guide-acs.waptest.taobao.com"};
    private static SparseArray<List<String>> sDomains = new SparseArray<>();
    private static final AtomicInteger sAtomicInteger = new AtomicInteger(0);
    private static final AtomicBoolean sDelayInit = new AtomicBoolean(false);
    private static boolean isChannelProcess = false;
    private static AtomicBoolean initMinStatus = new AtomicBoolean(false);

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : regId;
    }

    public static /* synthetic */ String[] access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("90f5d887", new Object[0]) : sInstanceIds;
    }

    public static /* synthetic */ Language access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Language) ipChange.ipc$dispatch("314d5b62", new Object[0]) : currLanguage;
    }

    public static /* synthetic */ Language access$202(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("ff55f8c7", new Object[]{language});
        }
        currLanguage = language;
        return language;
    }

    static {
        sDomains.put(sAtomicInteger.getAndIncrement(), Arrays.asList(ELEME_DOMAINS));
        sDomains.put(sAtomicInteger.getAndIncrement(), Arrays.asList(XIANYU_DOMAINS));
        sDomains.put(sAtomicInteger.getAndIncrement(), Arrays.asList(KOUBEI_DOMAINS));
        receiver = new BroadcastReceiver() { // from class: com.taobao.android.middleware.compat.MtopInitializer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    TaoBaseService.ConnectInfo connectInfo = (TaoBaseService.ConnectInfo) intent.getExtras().get(Constants.KEY_CONNECT_INFO);
                    if (connectInfo == null || !connectInfo.connected || !l.s(context)) {
                        return;
                    }
                    String q = l.q(context);
                    if (TextUtils.isEmpty(q) || q.equals(MtopInitializer.access$000())) {
                        return;
                    }
                    MtopSetting.setParam("INNER", MtopParamType.HEADER, Constants.KEY_X_REGID, q);
                    for (String str : MtopInitializer.access$100()) {
                        MtopSetting.setParam(str, MtopParamType.HEADER, Constants.KEY_X_REGID, q);
                    }
                } catch (Throwable th) {
                    TBSdkLog.e(MtopInitializer.TAG, "receive connect info error", th);
                }
            }
        };
    }

    private static void setConfigParams(MtopConfig mtopConfig, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd6ed63", new Object[]{mtopConfig, new Integer(i), str, str2});
            return;
        }
        if (i == 0) {
            mtopConfig.envMode = EnvModeEnum.ONLINE;
        } else if (i == 1) {
            mtopConfig.envMode = EnvModeEnum.PREPARE;
        } else if (i == 2) {
            mtopConfig.envMode = EnvModeEnum.TEST;
        } else if (i == 3) {
            mtopConfig.envMode = EnvModeEnum.TEST_SANDBOX;
            if (!TextUtils.isEmpty(str)) {
                mtopConfig.registerMtopSdkProperty("mtopsdk.tb_eagleeyex_scm_project", str);
            }
        }
        mtopConfig.ttid = str2;
    }

    private static void initMtop(Application application, HashMap<String, Object> hashMap, String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80ab3f8", new Object[]{application, hashMap, str, str2, list});
        } else {
            initMtop(application, hashMap, str, str2, list, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void initMtop(android.app.Application r16, java.util.HashMap<java.lang.String, java.lang.Object> r17, java.lang.String r18, java.lang.String r19, java.util.List<java.lang.String> r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.initMtop(android.app.Application, java.util.HashMap, java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void initMin(android.app.Application r12, java.util.HashMap<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.initMin(android.app.Application, java.util.HashMap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void init(android.app.Application r6, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            java.lang.String r0 = "mtopsdk.MtopInitializer"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.middleware.compat.MtopInitializer.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L18
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            r6 = 1
            r0[r6] = r7
            java.lang.String r6 = "dddb138b"
            r1.ipc$dispatch(r6, r0)
            return
        L18:
            initMin(r6, r7)
            r1 = 0
            java.lang.String r2 = "checkSessionInvalid"
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Exception -> L59
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L59
            boolean r3 = r2.booleanValue()     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = "sid"
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Exception -> L59
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L59
            java.lang.String r4 = "userId"
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Exception -> L57
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L57
            mtopsdk.common.util.TBSdkLog$LogEnable r1 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable     // Catch: java.lang.Exception -> L5b
            boolean r1 = mtopsdk.common.util.TBSdkLog.isLogEnable(r1)     // Catch: java.lang.Exception -> L5b
            if (r1 == 0) goto L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b
            r1.<init>()     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = "INNERparse ParamsMap succeed.params="
            r1.append(r5)     // Catch: java.lang.Exception -> L5b
            r1.append(r7)     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L5b
            mtopsdk.common.util.TBSdkLog.i(r0, r1)     // Catch: java.lang.Exception -> L5b
            goto L6f
        L57:
            r4 = r1
            goto L5b
        L59:
            r2 = r1
            r4 = r2
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "INNERparse ParamsMap error.params="
            r1.append(r5)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            mtopsdk.common.util.TBSdkLog.e(r0, r1)
        L6f:
            java.lang.String r0 = "INNER"
            if (r3 == 0) goto L7c
            mtopsdk.mtop.intf.Mtop r1 = mtopsdk.mtop.intf.Mtop.getInstance(r0)
            if (r1 == 0) goto L7c
            r1.registerSessionInfo(r2, r4)
        L7c:
            java.lang.String r1 = "Home_Page_SecondRefreshOpt"
            boolean r1 = isABFeatureOpen(r6, r1)
            if (r1 == 0) goto L8d
            mtopsdk.mtop.intf.Mtop r0 = mtopsdk.mtop.intf.Mtop.getInstance(r0)
            if (r0 == 0) goto L8d
            r0.setLaunchFirstFrame()
        L8d:
            java.lang.String r0 = "mtop_delay_init"
            boolean r0 = isABFeatureOpen(r6, r0)
            if (r0 != 0) goto L99
            initDelay(r6, r7)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.init(android.app.Application, java.util.HashMap):void");
    }

    private static void initLocalization() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f1dfd0", new Object[0]);
            return;
        }
        currLanguage = b.a();
        if (b.c()) {
            SwitchConfig.errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.NETWORK_ERROR_MAPPING, b.a(R.string.taobao_app_1012_1_30273));
            SwitchConfig.errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.SERVICE_ERROR_MAPPING, b.a(R.string.taobao_app_1012_1_30274));
            SwitchConfig.errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.FLOW_LIMIT_ERROR_MAPPING, b.a(R.string.taobao_app_1012_1_30275));
        }
        b.a(new b.a() { // from class: com.taobao.android.middleware.compat.MtopInitializer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                } else if (MtopInitializer.access$200() != null && language != null && TextUtils.equals(MtopInitializer.access$200().getLanguage(), language.getLanguage())) {
                } else {
                    MtopInitializer.access$202(language);
                    SwitchConfig.errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.NETWORK_ERROR_MAPPING, b.a(R.string.taobao_app_1012_1_30273));
                    SwitchConfig.errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.SERVICE_ERROR_MAPPING, b.a(R.string.taobao_app_1012_1_30274));
                    SwitchConfig.errorMappingMsgMap.put(ErrorConstant.ErrorMappingType.FLOW_LIMIT_ERROR_MAPPING, b.a(R.string.taobao_app_1012_1_30275));
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:8|(2:10|(1:12))|13|(6:(2:17|(1:19)(0))|21|(1:25)|26|27|28)(0)|20|21|(2:23|25)|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        mtopsdk.common.util.TBSdkLog.e(com.taobao.android.middleware.compat.MtopInitializer.TAG, "init ssr fail" + r7.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void initDelay(android.app.Application r6, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.middleware.compat.MtopInitializer.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "4a780ace"
            r0.ipc$dispatch(r6, r1)
            return
        L15:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.taobao.android.middleware.compat.MtopInitializer.sDelayInit
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto Ld0
            java.lang.System.currentTimeMillis()
            boolean r0 = com.taobao.accs.utl.l.s(r6)
            if (r0 == 0) goto L3e
            java.lang.String r0 = com.taobao.accs.utl.l.q(r6)
            com.taobao.android.middleware.compat.MtopInitializer.regId = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3e
            java.lang.String r0 = com.taobao.android.middleware.compat.MtopInitializer.regId
            java.lang.String r1 = "INNER"
            java.lang.String r2 = "HEADER"
            java.lang.String r4 = "x-regid"
            mtopsdk.mtop.intf.MtopSetting.setParam(r1, r2, r4, r0)
        L3e:
            tb.tez.a()
            initLocalization()
            java.lang.String[] r0 = com.taobao.android.middleware.compat.MtopInitializer.sInstanceIds
            int r1 = r0.length
            java.lang.String[] r2 = com.taobao.android.middleware.compat.MtopInitializer.sAccountSites
            int r2 = r2.length
            if (r1 != r2) goto L6e
            int r0 = r0.length
            android.util.SparseArray<java.util.List<java.lang.String>> r1 = com.taobao.android.middleware.compat.MtopInitializer.sDomains
            int r1 = r1.size()
            if (r0 != r1) goto L6e
        L55:
            java.lang.String[] r0 = com.taobao.android.middleware.compat.MtopInitializer.sInstanceIds
            int r1 = r0.length
            if (r3 >= r1) goto L6e
            r0 = r0[r3]
            java.lang.String[] r1 = com.taobao.android.middleware.compat.MtopInitializer.sAccountSites
            r1 = r1[r3]
            android.util.SparseArray<java.util.List<java.lang.String>> r2 = com.taobao.android.middleware.compat.MtopInitializer.sDomains
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            initMtop(r6, r7, r0, r1, r2)
            int r3 = r3 + 1
            goto L55
        L6e:
            mtopsdk.ssrcore.a r0 = new mtopsdk.ssrcore.a     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            tb.mtf.a(r0)     // Catch: java.lang.Throwable -> L9f
            android.content.Context r0 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L9f
            tb.mtf.a(r0)     // Catch: java.lang.Throwable -> L9f
            java.util.HashMap r0 = tb.mtf.a()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L8c
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L9f
            if (r1 <= 0) goto L8c
            mtopsdk.ssrcore.util.c.a(r6, r0)     // Catch: java.lang.Throwable -> L9f
        L8c:
            java.lang.String r2 = "SSR"
            java.lang.String r3 = "mtop_ssr"
            java.lang.String[] r0 = com.taobao.android.middleware.compat.MtopInitializer.SSR_DOMAINS     // Catch: java.lang.Throwable -> L9f
            java.util.List r4 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "SSR"
            r0 = r6
            r1 = r7
            initMtop(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9f
            goto Lbc
        L9f:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init ssr fail"
            r0.append(r1)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "mtopsdk.MtopInitializer"
            mtopsdk.common.util.TBSdkLog.e(r0, r7)
        Lbc:
            android.util.SparseArray<java.util.List<java.lang.String>> r7 = com.taobao.android.middleware.compat.MtopInitializer.sDomains
            r7.clear()
            android.content.IntentFilter r7 = new android.content.IntentFilter
            r7.<init>()
            java.lang.String r0 = "com.taobao.accs.intent.action.CONNECTINFO"
            r7.addAction(r0)
            android.content.BroadcastReceiver r0 = com.taobao.android.middleware.compat.MtopInitializer.receiver
            r6.registerReceiver(r0, r7)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.middleware.compat.MtopInitializer.initDelay(android.app.Application, java.util.HashMap):void");
    }

    private static boolean isABFeatureOpen(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fea157a", new Object[]{context, str})).booleanValue();
        }
        try {
            boolean a2 = ABGlobal.a(context, "taobao", "tbspeed", str);
            StringBuilder sb = new StringBuilder();
            sb.append("[ABFeatureOpenStatus]key=");
            sb.append(str);
            sb.append("open=");
            if (!a2) {
                i = 0;
            }
            sb.append(i);
            TBSdkLog.e(TAG, sb.toString());
            return a2;
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "error" + th.toString());
            return false;
        }
    }
}
