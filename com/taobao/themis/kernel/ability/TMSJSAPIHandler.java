package com.taobao.themis.kernel.ability;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.logger.b;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.f;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpt;
import tb.qpv;

/* loaded from: classes9.dex */
public class TMSJSAPIHandler implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, Long> API_CALL_TIME_MAP;
    private static List<String> ARRAY_BUFFER_API_LIST = null;
    public static final String DOMAIN_KEY = "__canalDomain";
    public static final String DOMAIN_WIDGET_FRAMEWORK = "widgetFramework";
    private static final String TAG = "TMSAbilityHandler";
    private volatile boolean mActive = true;
    private ITMSPage mPage;

    /* loaded from: classes9.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(JSONObject jSONObject, byte[] bArr);
    }

    public static /* synthetic */ ITMSPage access$000(TMSJSAPIHandler tMSJSAPIHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("7ddeaa6d", new Object[]{tMSJSAPIHandler}) : tMSJSAPIHandler.mPage;
    }

    public static /* synthetic */ boolean access$100(TMSJSAPIHandler tMSJSAPIHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc65a099", new Object[]{tMSJSAPIHandler})).booleanValue() : tMSJSAPIHandler.mActive;
    }

    public static /* synthetic */ void access$200(TMSJSAPIHandler tMSJSAPIHandler, String str, String str2, qoy qoyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60783c1f", new Object[]{tMSJSAPIHandler, str, str2, qoyVar});
        } else {
            tMSJSAPIHandler.onCallback(str, str2, qoyVar);
        }
    }

    public static /* synthetic */ List access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e8603dcd", new Object[0]) : ARRAY_BUFFER_API_LIST;
    }

    static {
        kge.a(-1191814702);
        kge.a(1028243835);
        ARRAY_BUFFER_API_LIST = new ArrayList();
        API_CALL_TIME_MAP = new ConcurrentHashMap();
        ARRAY_BUFFER_API_LIST.add("readFile");
    }

    public TMSJSAPIHandler(ITMSPage iTMSPage) {
        this.mPage = iTMSPage;
    }

    public void callTMSAbilityAsync(String str, JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f591", new Object[]{this, str, jSONObject, aVar});
            return;
        }
        try {
            if (this.mActive && this.mPage != null) {
                if (StringUtils.equals("internalAPI", str)) {
                    str = jSONObject.getString("method");
                    jSONObject = jSONObject.getJSONObject("param");
                }
                if (StringUtils.isEmpty(str)) {
                    TMSLogger.d(TAG, "invalid param, api name is null");
                    return;
                }
                TMSLogger.b(TAG, "api name: " + str);
                final String a2 = com.taobao.themis.kernel.logger.a.a(b.a(this.mPage));
                onInvoke(a2, str, false, jSONObject);
                com.taobao.themis.kernel.ability.a a3 = com.taobao.themis.kernel.ability.a.a();
                ITMSPage iTMSPage = this.mPage;
                ApiContext.a a4 = new ApiContext.a().a(a2);
                if (StringUtils.equals("internalAPI", str)) {
                    z = false;
                }
                final String str2 = str;
                final JSONObject jSONObject2 = jSONObject;
                a3.a(iTMSPage, str, jSONObject, a4.a(z).a(this.mPage.b().o()).a(this.mPage).a(isCallFromFramework(jSONObject) ? ApiContext.Source.FRAMEWORK : ApiContext.Source.INSTANCE).a(), new qox() { // from class: com.taobao.themis.kernel.ability.TMSJSAPIHandler.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.qox
                    public void a(qoy qoyVar, boolean z2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z2)});
                            return;
                        }
                        ITMSPage access$000 = TMSJSAPIHandler.access$000(TMSJSAPIHandler.this);
                        if (!TMSJSAPIHandler.access$100(TMSJSAPIHandler.this) || access$000 == null || qoyVar == null) {
                            return;
                        }
                        TMSJSAPIHandler.access$200(TMSJSAPIHandler.this, a2, str2, qoyVar);
                        JSONObject a5 = qoyVar.a();
                        String string = jSONObject2.getString("action");
                        if (a5 == null || string == null || !TMSJSAPIHandler.access$300().contains(string) || !a5.containsKey("dataType") || !a5.containsKey("data") || !StringUtils.equals("ArrayBuffer".toLowerCase(), a5.getString("dataType").toLowerCase()) || !o.l(access$000.b())) {
                            aVar.a(a5);
                            return;
                        }
                        byte[] bytes = a5.getBytes("data");
                        a5.remove("data");
                        aVar.a(a5, bytes);
                    }
                });
            }
        } catch (Throwable unused) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("success", (Object) false);
            try {
                aVar.a(jSONObject3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isCallFromFramework(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e57db21", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null && jSONObject.containsKey(DOMAIN_KEY)) {
            return "widgetFramework".equals(jSONObject.getString(DOMAIN_KEY));
        }
        return false;
    }

    public JSONObject callTMSAbilitySync(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aaf8c816", new Object[]{this, str, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (this.mActive && this.mPage != null) {
            if (StringUtils.equals("internalAPI", str)) {
                str = jSONObject.getString("method");
                jSONObject = jSONObject.getJSONObject("param");
            }
            JSONObject jSONObject3 = jSONObject;
            String a2 = com.taobao.themis.kernel.logger.a.a(b.a(this.mPage));
            if (StringUtils.isEmpty(str)) {
                TMSLogger.d(TAG, "invalid param, api name is null");
                return jSONObject2;
            }
            TMSLogger.b(TAG, "api name: " + str);
            onInvoke(a2, str, true, jSONObject3);
            ApiContext.a a3 = new ApiContext.a().a(a2).a(this.mPage.b().o()).a(this.mPage).a(isCallFromFramework(jSONObject3) ? ApiContext.Source.FRAMEWORK : ApiContext.Source.INSTANCE);
            if (n.aY()) {
                a3.b(true);
            }
            qoy a4 = com.taobao.themis.kernel.ability.a.a().a(this.mPage, str, jSONObject3, a3.a(), 3000L);
            jSONObject2.putAll(a4.a());
            onCallback(a2, str, a4);
        }
        return jSONObject2;
    }

    private void onInvoke(String str, String str2, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8101b86e", new Object[]{this, str, str2, new Boolean(z), jSONObject});
            return;
        }
        ITMSPage iTMSPage = this.mPage;
        API_CALL_TIME_MAP.put(str, Long.valueOf(System.currentTimeMillis()));
        if (iTMSPage == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) jSONObject.getString("action"));
            jSONObject2.put("name", (Object) str2);
            jSONObject2.put("sync", (Object) Boolean.valueOf(z));
            jSONObject2.put("params", (Object) jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.getString("api") != null) {
                jSONObject3.put("api", (Object) jSONObject.getString("api"));
            }
            if (jSONObject.getString("url") != null) {
                jSONObject3.put("url", (Object) jSONObject.getString("url"));
            }
            jSONObject2.put("extra", (Object) jSONObject3);
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_JSBRIDGE, com.taobao.themis.kernel.logger.a.EVENT_ON_INVOKE, b.a(iTMSPage), str, jSONObject2);
        } catch (Throwable th) {
            TMSLogger.b(TAG, "", th);
        }
    }

    private void onCallback(String str, final String str2, final qoy qoyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bd5cd4", new Object[]{this, str, str2, qoyVar});
            return;
        }
        final ITMSPage iTMSPage = this.mPage;
        if (iTMSPage == null || qoyVar == null) {
            return;
        }
        if ("fsManage".equals(str2)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.valueOf(qoyVar.d()));
            jSONObject.put("errorCode", (Object) qoyVar.b());
            jSONObject.put("errorMsg", (Object) qoyVar.c());
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_JSBRIDGE, com.taobao.themis.kernel.logger.a.EVENT_ON_CALLBACK, b.a(iTMSPage), str, f.a(new Pair(InputFrame3.TYPE_RESPONSE, jSONObject)));
        } else {
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_JSBRIDGE, com.taobao.themis.kernel.logger.a.EVENT_ON_CALLBACK, b.a(iTMSPage), str, f.a(new Pair(InputFrame3.TYPE_RESPONSE, qoyVar.a())));
        }
        Long l = API_CALL_TIME_MAP.get(str);
        if (l == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new Runnable() { // from class: com.taobao.themis.kernel.ability.TMSJSAPIHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    qpv.a(iTMSPage.b(), str2, qoyVar.d(), currentTimeMillis, qoyVar.b(), qoyVar.c());
                }
            }
        });
    }

    public void terminal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26677903", new Object[]{this});
            return;
        }
        this.mActive = false;
        this.mPage = null;
        API_CALL_TIME_MAP.clear();
    }
}
