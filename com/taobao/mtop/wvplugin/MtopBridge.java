package com.taobao.mtop.wvplugin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.upload.domain.UploadConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MtopBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f18285a = new AtomicBoolean(false);
    private static ScheduledExecutorService b = Executors.newScheduledThreadPool(1, new a());
    private WeakReference<MtopWVPlugin> c;
    private String d = "";
    private String e = "";
    private Handler f = new Handler(Looper.getMainLooper()) { // from class: com.taobao.mtop.wvplugin.MtopBridge.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 500 || !(message.obj instanceof c)) {
            } else {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.MtopBridge", "call result, retString: " + ((c) message.obj).toString());
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                    TBSdkLog.e("mtopsdk.MtopBridge", "call result, retString requestKey: " + MtopBridge.a(MtopBridge.this) + ", falcoid: " + MtopBridge.b(MtopBridge.this));
                }
                MtopWVPlugin mtopWVPlugin = (MtopWVPlugin) MtopBridge.c(MtopBridge.this).get();
                if (mtopWVPlugin == null) {
                    return;
                }
                try {
                    mtopWVPlugin.wvCallback((c) message.obj);
                } catch (Exception e) {
                    TBSdkLog.e("mtopsdk.MtopBridge", "execute  plugin.wvCallback error.", e);
                }
            }
        }
    };

    public static /* synthetic */ c a(MtopBridge mtopBridge, WVCallBackContext wVCallBackContext, MtopResponse mtopResponse, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5d629427", new Object[]{mtopBridge, wVCallBackContext, mtopResponse, map}) : mtopBridge.a(wVCallBackContext, mtopResponse, map);
    }

    public static /* synthetic */ String a(MtopBridge mtopBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("192a8a41", new Object[]{mtopBridge}) : mtopBridge.d;
    }

    public static /* synthetic */ Map a(MtopBridge mtopBridge, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5a37704a", new Object[]{mtopBridge, bVar}) : mtopBridge.a(bVar);
    }

    public static /* synthetic */ void a(MtopBridge mtopBridge, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fceb34", new Object[]{mtopBridge, cVar});
        } else {
            mtopBridge.a(cVar);
        }
    }

    public static /* synthetic */ String b(MtopBridge mtopBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29e05702", new Object[]{mtopBridge}) : mtopBridge.e;
    }

    public static /* synthetic */ WeakReference c(MtopBridge mtopBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("b82179cb", new Object[]{mtopBridge}) : mtopBridge.c;
    }

    public MtopBridge(MtopWVPlugin mtopWVPlugin) {
        this.c = null;
        this.c = new WeakReference<>(mtopWVPlugin);
    }

    private void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393adfdd", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.f.obtainMessage(500, cVar).sendToTarget();
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : MtopAccountSiteUtils.getInstanceId(str) != null;
    }

    public void a(final WVCallBackContext wVCallBackContext, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ae5a2f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.MtopBridge", "MtopBridge JSParams: " + str);
        }
        final b bVar = new b(str);
        MtopWVPlugin mtopWVPlugin = this.c.get();
        if (mtopWVPlugin != null) {
            bVar.b = mtopWVPlugin.getUserAgent();
            bVar.c = mtopWVPlugin.getCurrentUrl();
        }
        b.submit(new Runnable() { // from class: com.taobao.mtop.wvplugin.MtopBridge.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                Map map;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str2 = null;
                try {
                    map = MtopBridge.a(MtopBridge.this, bVar);
                    try {
                        if (map != null) {
                            MtopJSBridge.a(map, new MtopBridgeListener(wVCallBackContext, map));
                            return;
                        }
                        TBSdkLog.e("mtopsdk.MtopBridge", "MtopBridge parseJSParams failed. params:" + str);
                        MtopBridge.this.a(null, null, "MtopBridge parseJSParams failed.", "HY_PARAM_ERR", null);
                        c cVar = new c(wVCallBackContext);
                        cVar.a(com.taobao.mtop.wvplugin.a.RESULT_KEY, new JSONArray().put("HY_PARAM_ERR"));
                        cVar.a("code", "MtopBridge parseJSParams failed.");
                        MtopBridge.a(MtopBridge.this, cVar);
                    } catch (Exception e) {
                        e = e;
                        TBSdkLog.e("mtopsdk.MtopBridge", "MtopJSBridge sendMtopRequest failed.params:" + str, e);
                        String str3 = map != null ? (String) map.get("api") : null;
                        if (map != null) {
                            str2 = (String) map.get("v");
                        }
                        MtopBridge.this.a(str3, str2, "MtopJSBridge sendMtopRequest failed.", "HY_FAILED", null);
                        c cVar2 = new c(wVCallBackContext);
                        cVar2.a(com.taobao.mtop.wvplugin.a.RESULT_KEY, new JSONArray().put("HY_FAILED"));
                        cVar2.a("code", "MtopJSBridge sendMtopRequest failed.");
                        MtopBridge.a(MtopBridge.this, cVar2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    map = null;
                }
            }
        });
    }

    /* loaded from: classes7.dex */
    public class MtopBridgeListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> jsParamMap;
        private WVCallBackContext wvCallBackContext;

        public MtopBridgeListener(WVCallBackContext wVCallBackContext, Map<String, Object> map) {
            this.wvCallBackContext = wVCallBackContext;
            this.jsParamMap = map;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            MtopBridge mtopBridge = MtopBridge.this;
            MtopBridge.a(mtopBridge, MtopBridge.a(mtopBridge, this.wvCallBackContext, mtopResponse, this.jsParamMap));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            MtopBridge mtopBridge = MtopBridge.this;
            MtopBridge.a(mtopBridge, MtopBridge.a(mtopBridge, this.wvCallBackContext, mtopResponse, this.jsParamMap));
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            MtopBridge mtopBridge = MtopBridge.this;
            MtopBridge.a(mtopBridge, MtopBridge.a(mtopBridge, this.wvCallBackContext, mtopResponse, this.jsParamMap));
        }
    }

    private Map<String, Object> a(b bVar) {
        HashMap hashMap;
        JSONObject jSONObject;
        boolean z;
        String optString;
        int optInt;
        int optInt2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f0d38933", new Object[]{this, bVar});
        }
        if (bVar == null || StringUtils.isBlank(bVar.f18292a)) {
            return null;
        }
        try {
            jSONObject = new JSONObject(bVar.f18292a);
            hashMap = new HashMap();
        } catch (Throwable th) {
            th = th;
            hashMap = null;
        }
        try {
            hashMap.put("api", jSONObject.getString("api"));
            hashMap.put("v", jSONObject.optString("v", "*"));
            hashMap.put("data", jSONObject.optJSONObject("param"));
            hashMap.put(MtopJSBridge.MtopJSParam.ACCOUNT_SITE, jSONObject.optString(MtopJSBridge.MtopJSParam.ACCOUNT_SITE, ""));
            if (!jSONObject.isNull("needLogin")) {
                z = jSONObject.optBoolean("needLogin");
            } else {
                z = jSONObject.optInt(SessionConstants.ECODE, 0) != 0;
            }
            String optString2 = jSONObject.optString(MtopJSBridge.MtopJSParam.SESSION_OPTION);
            hashMap.put("needLogin", Boolean.valueOf(z));
            hashMap.put(MtopJSBridge.MtopJSParam.SESSION_OPTION, optString2);
            String str = "GET";
            if (!jSONObject.isNull("method")) {
                str = jSONObject.optString("method");
            } else if (jSONObject.optInt("post", 0) != 0) {
                str = "POST";
            }
            hashMap.put("method", str);
            if (!jSONObject.isNull("dataType")) {
                optString = jSONObject.optString("dataType");
            } else {
                optString = jSONObject.optString("type");
            }
            hashMap.put("dataType", optString);
            if (!jSONObject.isNull(MtopJSBridge.MtopJSParam.SEC_TYPE)) {
                optInt = jSONObject.optInt(MtopJSBridge.MtopJSParam.SEC_TYPE);
            } else {
                optInt = jSONObject.optInt("isSec", 0);
            }
            hashMap.put(MtopJSBridge.MtopJSParam.SEC_TYPE, Integer.valueOf(optInt));
            int i = 20000;
            if (!jSONObject.isNull("timeout")) {
                optInt2 = jSONObject.optInt("timeout", 20000);
            } else {
                optInt2 = jSONObject.optInt("timer", 20000);
            }
            if (optInt2 >= 0) {
                i = optInt2 > 60000 ? 60000 : optInt2;
            }
            hashMap.put("timeout", Integer.valueOf(i));
            hashMap.put(MtopJSBridge.MtopJSParam.EXT_HEADERS, jSONObject.optJSONObject(MtopJSBridge.MtopJSParam.EXT_HEADERS));
            hashMap.put(MtopJSBridge.MtopJSParam.IGNORE_PREFETCH, jSONObject.optJSONObject(MtopJSBridge.MtopJSParam.IGNORE_PREFETCH));
            hashMap.put("user-agent", bVar.b);
            hashMap.put("ttid", jSONObject.optString("ttid"));
            String optString3 = jSONObject.optString("pageUrl");
            if (!StringUtils.isEmpty(optString3)) {
                hashMap.put("pageUrl", optString3);
            } else {
                hashMap.put("pageUrl", bVar.c);
            }
            hashMap.put(MtopJSBridge.MtopJSParam.EXT_QUERYS, jSONObject.optJSONObject(MtopJSBridge.MtopJSParam.EXT_QUERYS));
            hashMap.put(MtopJSBridge.MtopJSParam.MP_HOST, jSONObject.optString(MtopJSBridge.MtopJSParam.MP_HOST));
            hashMap.put("userInfo", jSONObject.optString("userInfo"));
            hashMap.put("x-ua", bVar.b);
            hashMap.put(MtopJSBridge.MtopJSParam.RETRY_FORBIDDEN, Boolean.valueOf(jSONObject.optBoolean(MtopJSBridge.MtopJSParam.RETRY_FORBIDDEN)));
            hashMap.put("bizId", jSONObject.optString("bizId"));
            hashMap.put(MtopModule.KEY_MTOP_BIZ_TOPIC, jSONObject.optString(MtopModule.KEY_MTOP_BIZ_TOPIC));
            String str2 = bVar.c;
            if (!StringUtils.isEmpty(str2)) {
                int indexOf = str2.indexOf("?");
                if (indexOf != -1) {
                    str2 = str2.substring(0, indexOf);
                } else {
                    int indexOf2 = str2.indexOf("#");
                    if (indexOf2 != -1) {
                        str2 = str2.substring(0, indexOf2);
                    }
                }
            }
            hashMap.put(MtopJSBridge.MtopJSParam.REFERER, str2);
            if (!jSONObject.isNull(MtopJSBridge.MtopJSParam.ALLOW_SWITCH_TO_POST)) {
                hashMap.put(MtopJSBridge.MtopJSParam.ALLOW_SWITCH_TO_POST, jSONObject.opt(MtopJSBridge.MtopJSParam.ALLOW_SWITCH_TO_POST));
            }
        } catch (Throwable th2) {
            th = th2;
            TBSdkLog.e("mtopsdk.MtopBridge", "parseJSParams error.params =" + bVar.f18292a, th);
            return hashMap;
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0222 A[Catch: Exception -> 0x0227, TRY_LEAVE, TryCatch #3 {Exception -> 0x0227, blocks: (B:69:0x021c, B:71:0x0222, B:68:0x0209), top: B:88:0x0209 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.mtop.wvplugin.c a(android.taobao.windvane.jsbridge.WVCallBackContext r24, mtopsdk.mtop.domain.MtopResponse r25, java.util.Map<java.lang.String, java.lang.Object> r26) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mtop.wvplugin.MtopBridge.a(android.taobao.windvane.jsbridge.WVCallBackContext, mtopsdk.mtop.domain.MtopResponse, java.util.Map):com.taobao.mtop.wvplugin.c");
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            a(str, str2, str3, str4, str5, "0");
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IUploadStats iUploadStats;
        String str7;
        String str8;
        String str9;
        String str10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        try {
            IUploadStats iUploadStats2 = Mtop.instance(Mtop.Id.INNER, (Context) null).getMtopConfig().uploadStats;
            if (iUploadStats2 == null) {
                return;
            }
            if (f18285a.compareAndSet(false, true)) {
                HashSet hashSet = new HashSet();
                hashSet.add("api");
                hashSet.add("v");
                hashSet.add(com.taobao.mtop.wvplugin.a.RESULT_KEY);
                hashSet.add("code");
                hashSet.add("retCode");
                str7 = "api";
                str8 = "v";
                str9 = com.taobao.mtop.wvplugin.a.RESULT_KEY;
                iUploadStats = iUploadStats2;
                str10 = "code";
                iUploadStats2.onRegister(UploadConstants.UPLOAD_MODULE, "jsStats", hashSet, null, false);
            } else {
                iUploadStats = iUploadStats2;
                str7 = "api";
                str8 = "v";
                str9 = com.taobao.mtop.wvplugin.a.RESULT_KEY;
                str10 = "code";
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str7, str);
            hashMap.put(str8, str2);
            hashMap.put(str9, str4);
            hashMap.put(str10, str3);
            hashMap.put("retCode", str5);
            hashMap.put("timeout", str6);
            iUploadStats.onCommit(UploadConstants.UPLOAD_MODULE, "jsStats", hashMap, null);
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.MtopBridge", "commitMtopJSStat error.", th);
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f18288a = new AtomicInteger(1);
        private final ThreadGroup b;
        private final AtomicInteger c = new AtomicInteger(1);
        private final String d;

        public a() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.b = threadGroup;
            this.d = "mtopPlugin pool-" + f18288a.getAndIncrement() + "-thread-";
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
