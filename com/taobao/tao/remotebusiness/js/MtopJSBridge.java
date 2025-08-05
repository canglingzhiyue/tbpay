package com.taobao.tao.remotebusiness.js;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IInteractingListener;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.InteractOption;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.login.c;
import com.taobao.tao.remotebusiness.login.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.instanceconfigs.MtopExternalInstanceConfigsData;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.IWVRequestInterceptor;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopJSBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ScheduledExecutorService f21021a;
    private static ConcurrentHashMap<String, CopyOnWriteArrayList<b>> b;

    /* loaded from: classes8.dex */
    public interface MtopJSParam {
        public static final String ACCOUNT_SITE = "accountSite";
        public static final String ALLOW_SWITCH_TO_POST = "allowSwitchToPOST";
        public static final String API = "api";
        public static final String DATA = "data";
        public static final String DATA_TYPE = "dataType";
        public static final String EXT_HEADERS = "ext_headers";
        public static final String EXT_QUERYS = "ext_querys";
        public static final String IGNORE_PREFETCH = "ignorePrefetch";
        public static final String METHOD = "method";
        public static final String MP_HOST = "mpHost";
        public static final String NEED_LOGIN = "needLogin";
        public static final String PAGE_URL = "pageUrl";
        public static final String REFERER = "referer";
        public static final String RETRY_FORBIDDEN = "retryForbidden";
        public static final String SEC_TYPE = "secType";
        public static final String SESSION_OPTION = "sessionOption";
        public static final String TIMEOUT = "timeout";
        public static final String TTID = "ttid";
        @Deprecated
        public static final String USER_AGENT = "user-agent";
        public static final String USER_INFO = "userInfo";
        public static final String V = "v";
        public static final String X_UA = "x-ua";

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes8.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Object> f21029a;
        public IRemoteBaseListener b;
        public int c;

        static {
            kge.a(1153834940);
        }

        public b(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener, int i) {
            this.f21029a = map;
            this.b = iRemoteBaseListener;
            this.c = i;
        }
    }

    public static /* synthetic */ void a(Map map, IRemoteBaseListener iRemoteBaseListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c6b9ea", new Object[]{map, iRemoteBaseListener, new Integer(i)});
        } else {
            b(map, iRemoteBaseListener, i);
        }
    }

    public static /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ba6647dd", new Object[0]) : b;
    }

    static {
        kge.a(-1385237865);
        b = new ConcurrentHashMap<>();
    }

    public static void a(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971c039", new Object[]{map, iRemoteBaseListener});
        } else if (iRemoteBaseListener == null) {
            TBSdkLog.e("mtopsdk.MtopJSBridge", "illegal param listener.");
        } else if (map == null || map.isEmpty()) {
            TBSdkLog.e("mtopsdk.MtopJSBridge", "illegal param jsParamMap.");
            iRemoteBaseListener.onSystemError(0, new MtopResponse(ErrorConstant.ERRCODE_ILLEGAL_JSPARAM_ERROR, ErrorConstant.ERRMSG_ILLEGAL_JSPARAM_ERROR), null);
        } else {
            int i = 20000;
            try {
                int intValue = ((Integer) map.get("timeout")).intValue();
                if (intValue >= 0) {
                    i = 60000;
                    if (intValue <= 60000) {
                        i = intValue;
                    }
                }
            } catch (Exception unused) {
                TBSdkLog.e("mtopsdk.MtopJSBridge", "parse timeout (jsParam field) error.");
            }
            if (c(map, iRemoteBaseListener, i)) {
                return;
            }
            b(map, iRemoteBaseListener, i);
        }
    }

    private static void b(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116ec9", new Object[]{map, iRemoteBaseListener, new Integer(i)});
            return;
        }
        MtopBusiness a2 = a(map);
        if (a2 == null) {
            iRemoteBaseListener.onSystemError(0, new MtopResponse(ErrorConstant.ERRCODE_PARSE_JSPARAM_ERROR, ErrorConstant.ERRMSG_PARSE_JSPARAM_ERROR), null);
            return;
        }
        String seqNo = a2.getSeqNo();
        TBSdkLog.e("mtopsdk.MtopJSBridge", seqNo, "jsparam jsParamMap." + map);
        if (SwitchConfig.getInstance().isEnableJsBridgeTimeout() && SwitchConfig.getInstance().jsBridgeTimeoutApiSet != null && SwitchConfig.getInstance().jsBridgeTimeoutApiSet.contains(a2.request.getKey()) && i > 3000) {
            int i2 = i / 2;
            a2.mo1326setSocketTimeoutMilliSecond(i2);
            if (a2.mtopProp != null) {
                a2.mtopProp.isTimeoutEnable = true;
            }
            String seqNo2 = a2.getSeqNo();
            TBSdkLog.e("mtopsdk.MtopJSBridge", seqNo2, "[setSocketTimeoutMilliSecond]before=" + i + ", after=" + i2);
        }
        final MtopJSListener mtopJSListener = new MtopJSListener(a2, iRemoteBaseListener, i);
        a2.registerListener((IRemoteListener) mtopJSListener);
        a2.startRequest();
        a().schedule(new Runnable() { // from class: com.taobao.tao.remotebusiness.js.MtopJSBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MtopJSListener.this.onTimeOut();
                }
            }
        }, i, TimeUnit.MILLISECONDS);
    }

    private static boolean c(Map<String, Object> map, IRemoteBaseListener iRemoteBaseListener, final int i) {
        IWVRequestInterceptor iWVRequestInterceptor;
        HashMap<String, String> intercept;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("895c23ac", new Object[]{map, iRemoteBaseListener, new Integer(i)})).booleanValue();
        }
        if (SwitchConfig.getInstance().dynamicInjectMtopInstance()) {
            try {
                JSONObject jSONObject = new JSONObject(map);
                String string = jSONObject.getString("api");
                String optString = jSONObject.optString("v", "*");
                String optString2 = jSONObject.optString("pageUrl");
                final String optString3 = jSONObject.optString(MtopJSParam.ACCOUNT_SITE, "");
                if (TextUtils.isEmpty(optString3) && (iWVRequestInterceptor = MtopSetting.sWVRequestInterceptor) != null && (intercept = iWVRequestInterceptor.intercept(string, optString, optString2)) != null && intercept.size() > 0) {
                    optString3 = intercept.get(MtopJSParam.ACCOUNT_SITE);
                }
                if (StringUtils.isNotBlank(optString3) && StringUtils.isBlank(MtopAccountSiteUtils.getInstanceId(optString3))) {
                    final Mtop mtop = Mtop.getInstance(Mtop.Id.INNER);
                    if (a(mtop, optString3, -1L, true) != null) {
                        return false;
                    }
                    CopyOnWriteArrayList<b> copyOnWriteArrayList = b.get(optString3);
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.add(new b(map, iRemoteBaseListener, i));
                        return true;
                    }
                    CopyOnWriteArrayList<b> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(new b(map, iRemoteBaseListener, i));
                    b.put(optString3, copyOnWriteArrayList2);
                    MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: com.taobao.tao.remotebusiness.js.MtopJSBridge.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            MtopJSBridge.a(Mtop.this, optString3, i, false);
                            CopyOnWriteArrayList copyOnWriteArrayList3 = (CopyOnWriteArrayList) MtopJSBridge.b().get(optString3);
                            Iterator it = copyOnWriteArrayList3.iterator();
                            while (it.hasNext()) {
                                b bVar = (b) it.next();
                                MtopJSBridge.a(bVar.f21029a, bVar.b, bVar.c);
                            }
                            copyOnWriteArrayList3.clear();
                            MtopJSBridge.b().remove(optString3);
                        }
                    });
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(5:6|7|(4:9|(7:12|13|14|15|(2:19|20)|21|10)|29|30)(1:196)|31|32)|(3:34|(2:40|(6:42|(1:44)(1:188)|45|(1:51)|(1:57)|58)(1:189))|190)(2:191|(1:193)(6:194|60|(1:62)(1:187)|63|64|(2:66|(37:68|69|70|(3:76|(1:82)(1:80)|81)|83|(1:85)(1:177)|86|(1:88)|89|(1:91)|92|(1:94)|95|(1:101)|102|(1:104)|105|(1:107)|108|109|(4:111|(4:114|(5:119|120|(1:122)|123|124)|125|112)|128|129)(1:176)|130|(2:(1:133)|134)|135|(2:137|(14:(1:140)|141|(1:143)(1:174)|144|(3:146|(4:149|(3:154|155|156)|157|147)|160)|161|(1:163)|164|(1:166)|167|(1:169)|170|(1:172)|28))|175|144|(0)|161|(0)|164|(0)|167|(0)|170|(0)|28)(4:180|181|182|183))(2:184|185)))|59|60|(0)(0)|63|64|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0388, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ec A[Catch: Exception -> 0x0354, TryCatch #3 {Exception -> 0x0354, blocks: (B:66:0x015d, B:68:0x0163, B:70:0x0169, B:72:0x016f, B:74:0x019a, B:76:0x01a2, B:78:0x01ad, B:79:0x01bf, B:83:0x01c8, B:85:0x01e0, B:86:0x01e5, B:88:0x01f4, B:89:0x01f7, B:91:0x0201, B:92:0x0204, B:94:0x0210, B:96:0x0219, B:98:0x0222, B:99:0x022f, B:101:0x0241, B:102:0x0244, B:104:0x024a, B:105:0x024d, B:108:0x0258, B:109:0x0262, B:111:0x0268, B:113:0x0278, B:115:0x027e, B:118:0x0285, B:121:0x028f, B:124:0x029e, B:125:0x02a3, B:126:0x02b4, B:128:0x02be, B:131:0x02ca, B:132:0x02cf, B:134:0x02d7, B:137:0x02e1, B:139:0x02ec, B:140:0x02f0, B:142:0x02f6, B:144:0x0306, B:146:0x030c, B:147:0x0310, B:149:0x031d, B:150:0x0320, B:152:0x0326, B:153:0x0329, B:155:0x033a, B:156:0x033d, B:158:0x0350, B:135:0x02db), top: B:182:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031d A[Catch: Exception -> 0x0354, TryCatch #3 {Exception -> 0x0354, blocks: (B:66:0x015d, B:68:0x0163, B:70:0x0169, B:72:0x016f, B:74:0x019a, B:76:0x01a2, B:78:0x01ad, B:79:0x01bf, B:83:0x01c8, B:85:0x01e0, B:86:0x01e5, B:88:0x01f4, B:89:0x01f7, B:91:0x0201, B:92:0x0204, B:94:0x0210, B:96:0x0219, B:98:0x0222, B:99:0x022f, B:101:0x0241, B:102:0x0244, B:104:0x024a, B:105:0x024d, B:108:0x0258, B:109:0x0262, B:111:0x0268, B:113:0x0278, B:115:0x027e, B:118:0x0285, B:121:0x028f, B:124:0x029e, B:125:0x02a3, B:126:0x02b4, B:128:0x02be, B:131:0x02ca, B:132:0x02cf, B:134:0x02d7, B:137:0x02e1, B:139:0x02ec, B:140:0x02f0, B:142:0x02f6, B:144:0x0306, B:146:0x030c, B:147:0x0310, B:149:0x031d, B:150:0x0320, B:152:0x0326, B:153:0x0329, B:155:0x033a, B:156:0x033d, B:158:0x0350, B:135:0x02db), top: B:182:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0326 A[Catch: Exception -> 0x0354, TryCatch #3 {Exception -> 0x0354, blocks: (B:66:0x015d, B:68:0x0163, B:70:0x0169, B:72:0x016f, B:74:0x019a, B:76:0x01a2, B:78:0x01ad, B:79:0x01bf, B:83:0x01c8, B:85:0x01e0, B:86:0x01e5, B:88:0x01f4, B:89:0x01f7, B:91:0x0201, B:92:0x0204, B:94:0x0210, B:96:0x0219, B:98:0x0222, B:99:0x022f, B:101:0x0241, B:102:0x0244, B:104:0x024a, B:105:0x024d, B:108:0x0258, B:109:0x0262, B:111:0x0268, B:113:0x0278, B:115:0x027e, B:118:0x0285, B:121:0x028f, B:124:0x029e, B:125:0x02a3, B:126:0x02b4, B:128:0x02be, B:131:0x02ca, B:132:0x02cf, B:134:0x02d7, B:137:0x02e1, B:139:0x02ec, B:140:0x02f0, B:142:0x02f6, B:144:0x0306, B:146:0x030c, B:147:0x0310, B:149:0x031d, B:150:0x0320, B:152:0x0326, B:153:0x0329, B:155:0x033a, B:156:0x033d, B:158:0x0350, B:135:0x02db), top: B:182:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x033a A[Catch: Exception -> 0x0354, TryCatch #3 {Exception -> 0x0354, blocks: (B:66:0x015d, B:68:0x0163, B:70:0x0169, B:72:0x016f, B:74:0x019a, B:76:0x01a2, B:78:0x01ad, B:79:0x01bf, B:83:0x01c8, B:85:0x01e0, B:86:0x01e5, B:88:0x01f4, B:89:0x01f7, B:91:0x0201, B:92:0x0204, B:94:0x0210, B:96:0x0219, B:98:0x0222, B:99:0x022f, B:101:0x0241, B:102:0x0244, B:104:0x024a, B:105:0x024d, B:108:0x0258, B:109:0x0262, B:111:0x0268, B:113:0x0278, B:115:0x027e, B:118:0x0285, B:121:0x028f, B:124:0x029e, B:125:0x02a3, B:126:0x02b4, B:128:0x02be, B:131:0x02ca, B:132:0x02cf, B:134:0x02d7, B:137:0x02e1, B:139:0x02ec, B:140:0x02f0, B:142:0x02f6, B:144:0x0306, B:146:0x030c, B:147:0x0310, B:149:0x031d, B:150:0x0320, B:152:0x0326, B:153:0x0329, B:155:0x033a, B:156:0x033d, B:158:0x0350, B:135:0x02db), top: B:182:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0350 A[Catch: Exception -> 0x0354, TRY_LEAVE, TryCatch #3 {Exception -> 0x0354, blocks: (B:66:0x015d, B:68:0x0163, B:70:0x0169, B:72:0x016f, B:74:0x019a, B:76:0x01a2, B:78:0x01ad, B:79:0x01bf, B:83:0x01c8, B:85:0x01e0, B:86:0x01e5, B:88:0x01f4, B:89:0x01f7, B:91:0x0201, B:92:0x0204, B:94:0x0210, B:96:0x0219, B:98:0x0222, B:99:0x022f, B:101:0x0241, B:102:0x0244, B:104:0x024a, B:105:0x024d, B:108:0x0258, B:109:0x0262, B:111:0x0268, B:113:0x0278, B:115:0x027e, B:118:0x0285, B:121:0x028f, B:124:0x029e, B:125:0x02a3, B:126:0x02b4, B:128:0x02be, B:131:0x02ca, B:132:0x02cf, B:134:0x02d7, B:137:0x02e1, B:139:0x02ec, B:140:0x02f0, B:142:0x02f6, B:144:0x0306, B:146:0x030c, B:147:0x0310, B:149:0x031d, B:150:0x0320, B:152:0x0326, B:153:0x0329, B:155:0x033a, B:156:0x033d, B:158:0x0350, B:135:0x02db), top: B:182:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0370 A[Catch: Exception -> 0x0388, TRY_LEAVE, TryCatch #2 {Exception -> 0x0388, blocks: (B:164:0x036b, B:166:0x0370), top: B:181:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153 A[Catch: Exception -> 0x038a, TryCatch #1 {Exception -> 0x038a, blocks: (B:13:0x0068, B:15:0x0073, B:17:0x0077, B:19:0x0084, B:21:0x0093, B:24:0x00c9, B:26:0x00cd, B:28:0x00d3, B:30:0x00d9, B:32:0x00e5, B:36:0x00f0, B:38:0x00fe, B:40:0x0107, B:42:0x010f, B:44:0x0118, B:46:0x011e, B:57:0x013f, B:61:0x0149, B:63:0x0153, B:65:0x0159, B:162:0x0358, B:53:0x0132), top: B:180:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.taobao.tao.remotebusiness.MtopBusiness a(java.util.Map<java.lang.String, java.lang.Object> r22) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.js.MtopJSBridge.a(java.util.Map):com.taobao.tao.remotebusiness.MtopBusiness");
    }

    public static Mtop a(Mtop mtop, String str, long j, boolean z) {
        MtopExternalInstanceConfigsData.a a2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (mtop != null && !StringUtils.isBlank(str)) {
            MtopConfig mtopConfig = mtop.getMtopConfig();
            if (z) {
                a2 = mtopsdk.instanceconfigs.a.a().a(mtopConfig.context, mtopConfig.appKey, str);
            } else {
                a2 = mtopsdk.instanceconfigs.a.a().a(mtopConfig.context, mtopConfig.appKey, str, j);
            }
            if (a2 != null && !StringUtils.isBlank(a2.b) && !StringUtils.isBlank(a2.f25001a)) {
                try {
                    List<Map<String, String>> list = a2.c;
                    String str7 = "";
                    if (list == null || list.size() <= 2) {
                        str2 = str7;
                        str3 = str2;
                        str4 = str3;
                    } else {
                        str2 = str7;
                        str3 = str2;
                        str4 = str3;
                        for (Map<String, String> map : list) {
                            String str8 = map.get("env");
                            String str9 = map.get("domain");
                            if (StringUtils.isNotBlank(str8) && StringUtils.isNotBlank(str9)) {
                                if (StringUtils.isStringEqual(str8, "pre")) {
                                    str2 = str9;
                                } else if (StringUtils.isStringEqual(str8, "online")) {
                                    str3 = str9;
                                } else if (StringUtils.isStringEqual(str8, "daily")) {
                                    str4 = str9;
                                }
                            }
                        }
                    }
                    Map<String, String> map2 = a2.d;
                    if (map2 != null) {
                        str7 = map2.get("implClass");
                        str6 = map2.get(com.taobao.android.weex_framework.util.a.ATOM_function);
                        str5 = map2.get("parameter");
                    } else {
                        str5 = str7;
                        str6 = str5;
                    }
                    if (!StringUtils.isBlank(str2) && !StringUtils.isBlank(str3) && !StringUtils.isBlank(str4) && !StringUtils.isBlank(str7) && !StringUtils.isBlank(str6) && !StringUtils.isBlank(str5)) {
                        Mtop instance = Mtop.instance(a2.b, mtop.getMtopConfig().context);
                        MtopSetting.setMtopDomain(a2.b, str3, str2, str4);
                        c cVar = (c) Class.forName(str7).getMethod(str6, String.class).invoke(null, a2.f25001a);
                        if (cVar != null) {
                            h.a(instance, cVar);
                            MtopAccountSiteUtils.bindInstanceId(a2.b, a2.f25001a);
                            return instance;
                        }
                    }
                    return null;
                } catch (Exception e) {
                    TBSdkLog.e("mtopsdk.MtopJSBridge", "do generateMtopFromRemoteInstanceId error.", e);
                }
            }
        }
        return null;
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("7a4b6c8c", new Object[0]);
        }
        if (f21021a == null) {
            synchronized (MtopJSBridge.class) {
                if (f21021a == null) {
                    f21021a = new ScheduledThreadPoolExecutor(1, new a());
                }
            }
        }
        return f21021a;
    }

    /* loaded from: classes8.dex */
    public static class MtopJSListener implements IInteractingListener, IRemoteBaseListener, IRemoteCacheListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MtopResponse cachedResponse;
        public final IRemoteBaseListener listener;
        private final MtopBusiness mtopBusiness;
        private long timeout;
        private AtomicBoolean isFinish = new AtomicBoolean(false);
        private AtomicBoolean ignoreTimeout = new AtomicBoolean(false);
        private AtomicLong loginDuration = new AtomicLong(0);

        static {
            kge.a(488568498);
            kge.a(-525336021);
            kge.a(1454207888);
            kge.a(-255644000);
        }

        public MtopJSListener(MtopBusiness mtopBusiness, IRemoteBaseListener iRemoteBaseListener, int i) {
            this.mtopBusiness = mtopBusiness;
            this.listener = iRemoteBaseListener;
            this.timeout = i;
        }

        public void onTimeOut() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47459e9", new Object[]{this});
                return;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.e("mtopsdk.MtopJSBridge", "callback onTimeOut");
            }
            if (this.ignoreTimeout.get()) {
                TBSdkLog.e("mtopsdk.MtopJSBridge", "onInteracting callback ignoreTimeout");
                MtopBusiness mtopBusiness = this.mtopBusiness;
                if (mtopBusiness == null || mtopBusiness.mtopProp == null) {
                    return;
                }
                this.mtopBusiness.mtopProp.isLoginTimeout = true;
            } else if (!this.isFinish.compareAndSet(false, true)) {
                TBSdkLog.e("mtopsdk.MtopJSBridge", "onTimeOut task is finish");
            } else {
                this.mtopBusiness.cancelRequest();
                try {
                    if (this.cachedResponse != null) {
                        this.listener.onSuccess(0, this.cachedResponse, null, null);
                    } else {
                        this.listener.onSystemError(0, null, null);
                    }
                } catch (Exception e) {
                    TBSdkLog.e("mtopsdk.MtopJSBridge", "do onTimeOut callback error.", e);
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(final int i, final MtopResponse mtopResponse, final BaseOutDo baseOutDo, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.MtopJSBridge", "callback onSuccess");
                }
                MtopJSBridge.a().submit(new Runnable() { // from class: com.taobao.tao.remotebusiness.js.MtopJSBridge.MtopJSListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            MtopJSListener.this.listener.onSuccess(i, mtopResponse, baseOutDo, obj);
                        } catch (Exception e) {
                            TBSdkLog.e("mtopsdk.MtopJSBridge", "do onSuccess callback error.", e);
                        }
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(final int i, final MtopResponse mtopResponse, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.MtopJSBridge", "callback onError");
                }
                MtopJSBridge.a().submit(new Runnable() { // from class: com.taobao.tao.remotebusiness.js.MtopJSBridge.MtopJSListener.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            MtopJSListener.this.listener.onError(i, mtopResponse, obj);
                        } catch (Exception e) {
                            TBSdkLog.e("mtopsdk.MtopJSBridge", "do onError callback error.", e);
                        }
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteCacheListener
        public void onCached(MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73f40859", new Object[]{this, mtopCacheEvent, baseOutDo, obj});
                return;
            }
            if (mtopCacheEvent != null) {
                this.cachedResponse = mtopCacheEvent.getMtopResponse();
            }
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                return;
            }
            TBSdkLog.d("mtopsdk.MtopJSBridge", "callback onCached");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(final int i, final MtopResponse mtopResponse, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.MtopJSBridge", "callback onSystemError");
                }
                MtopJSBridge.a().submit(new Runnable() { // from class: com.taobao.tao.remotebusiness.js.MtopJSBridge.MtopJSListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            MtopJSListener.this.listener.onSystemError(i, mtopResponse, obj);
                        } catch (Exception e) {
                            TBSdkLog.e("mtopsdk.MtopJSBridge", "do onSystemError callback error.", e);
                        }
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IInteractingListener
        public void onInteract(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8938ee06", new Object[]{this, str});
                return;
            }
            TBSdkLog.e("mtopsdk.MtopJSBridge", "onInteract action: " + str);
            if (this.isFinish.get() || !SwitchConfig.getInstance().isOptH5LoginTimeout()) {
                return;
            }
            if (TextUtils.equals(str, "login")) {
                this.ignoreTimeout.set(true);
                this.loginDuration.set(System.currentTimeMillis());
            } else if (!TextUtils.equals(str, InteractOption.INTERACT_FINISH)) {
            } else {
                this.loginDuration.set(System.currentTimeMillis() - this.loginDuration.get());
                if (!this.ignoreTimeout.compareAndSet(true, false)) {
                    return;
                }
                MtopBusiness mtopBusiness = this.mtopBusiness;
                if (mtopBusiness != null && mtopBusiness.mtopProp != null) {
                    this.mtopBusiness.mtopProp.loginTime = this.loginDuration.get();
                }
                MtopJSBridge.a().schedule(new Runnable() { // from class: com.taobao.tao.remotebusiness.js.MtopJSBridge.MtopJSListener.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MtopJSListener.this.onTimeOut();
                        }
                    }
                }, this.timeout, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f21028a;
        private final ThreadGroup b;
        private final AtomicInteger c = new AtomicInteger(1);
        private final String d;

        static {
            kge.a(143598316);
            kge.a(-1938806936);
            f21028a = new AtomicInteger(1);
        }

        public a() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.b = threadGroup;
            this.d = "mtop pool-" + f21028a.getAndIncrement() + "-thread-";
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            ThreadGroup threadGroup = this.b;
            Thread thread = new Thread(threadGroup, runnable, this.d + this.c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }
}
