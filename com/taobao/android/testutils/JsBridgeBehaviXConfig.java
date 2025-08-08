package com.taobao.android.testutils;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.android.behavix.task.d;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.mini.internal.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class JsBridgeBehaviXConfig extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "JsBridgeBehaviXConfig";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f15513a;
    private static Boolean b;
    private static Boolean c;
    private static Map<String, String> d;
    private static Map<String, String> e;

    public static /* synthetic */ Object ipc$super(JsBridgeBehaviXConfig jsBridgeBehaviXConfig, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : d;
    }

    static {
        kge.a(1143868822);
        f15513a = null;
        b = null;
    }

    private static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f15513a = Boolean.valueOf(z);
        }
    }

    private static void a(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2e4c4a", new Object[]{new Boolean(z), str, str2, str3});
            return;
        }
        com.taobao.android.behavix.utils.a.c().a(str, z ? System.currentTimeMillis() : 0L);
        com.taobao.android.behavix.utils.a.c().a(str2, str3);
    }

    public static boolean isEnableRealTimeUtDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb924a67", new Object[0])).booleanValue();
        }
        if (f15513a == null) {
            try {
                if (System.currentTimeMillis() - com.taobao.android.behavix.utils.a.c().b("utDebugCacheTime", 0L) < TimeUnit.DAYS.toMillis(1L)) {
                    b(com.taobao.android.behavix.utils.a.c().a("utDebugCacheParam"));
                }
            } catch (Exception unused) {
            }
            f15513a = Boolean.valueOf(Boolean.TRUE.equals(f15513a));
        }
        return f15513a.booleanValue();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            try {
                if (System.currentTimeMillis() - com.taobao.android.behavix.utils.a.c().b("mtopDebugCacheTime", 0L) < TimeUnit.DAYS.toMillis(1L)) {
                    b(com.taobao.android.behavix.utils.a.c().a("mtopDebugCacheParam"));
                }
            } catch (Exception unused) {
            }
            b = Boolean.valueOf(Boolean.TRUE.equals(b));
        }
        Boolean bool = f15513a;
        return bool != null && bool.booleanValue();
    }

    public static void initPersistScriptConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feb98b8", new Object[0]);
        } else if (c != null) {
        } else {
            long b2 = com.taobao.android.behavix.utils.a.c().b("scriptConfigCacheTime", 0L);
            if (b2 != 0) {
                c = true;
            } else {
                c = false;
            }
            if (System.currentTimeMillis() - b2 >= TimeUnit.HOURS.toMillis(4L) || !c.booleanValue()) {
                return;
            }
            d = (Map) JSONObject.parseObject(com.taobao.android.behavix.utils.a.c().a("scriptConfigCacheParam"), new TypeReference<Map<String, String>>() { // from class: com.taobao.android.testutils.JsBridgeBehaviXConfig.1
            }, new Feature[0]);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Map<String, String> map = (Map) JSONObject.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.android.testutils.JsBridgeBehaviXConfig.2
            }, new Feature[0]);
            d = map;
            a(Boolean.valueOf(map.get("isPersist")).booleanValue(), "scriptConfigCacheTime", "scriptConfigCacheParam", str);
            d.put("debugKey", (String) ((Map) JSONObject.parseObject(com.taobao.android.behavix.utils.a.c().a("mtopDebugCacheParam"), new TypeReference<Map<String, String>>() { // from class: com.taobao.android.testutils.JsBridgeBehaviXConfig.3
            }, new Feature[0])).get("debugKey"));
        }
    }

    public static String getScriptValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f45699ff", new Object[]{str});
        }
        Map<String, String> map = d;
        if (map != null && !map.isEmpty()) {
            return d.get(str);
        }
        return null;
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        f.getInstance().turnOffRealTimeDebug();
        e = (Map) JSONObject.parseObject(str, new TypeReference<Map<String, String>>() { // from class: com.taobao.android.testutils.JsBridgeBehaviXConfig.4
        }, new Feature[0]);
        f.getInstance().turnOnRealTimeDebug(e);
        a(true);
    }

    public static boolean isEnableRealTimeMTopDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d78c37e", new Object[0])).booleanValue();
        }
        if (b()) {
            return true;
        }
        BHXCXXInnerBridge.updateCXXCttpUploadState(false, null);
        return false;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.loge("BehaviX", NAME, "action : " + str + " params : " + str2);
        if (str == null) {
            return false;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1399846204:
                if (str.equals("mtopTurnOnRealTimeDebug")) {
                    c2 = 3;
                    break;
                }
                break;
            case 62904519:
                if (str.equals("pythonScript")) {
                    c2 = 4;
                    break;
                }
                break;
            case 183915661:
                if (str.equals("utTurnOnRealTimeDebug")) {
                    c2 = 0;
                    break;
                }
                break;
            case 202513074:
                if (str.equals("performBXTestTools")) {
                    c2 = 5;
                    break;
                }
                break;
            case 660498156:
                if (str.equals("walleUploadOrangeConfig")) {
                    c2 = 2;
                    break;
                }
                break;
            case 720943669:
                if (str.equals("utTurnOffRealTimeDebug")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return c(str2, wVCallBackContext);
        }
        if (c2 == 1) {
            return d(str2, wVCallBackContext);
        }
        if (c2 == 2) {
            return e(str2, wVCallBackContext);
        }
        if (c2 == 3) {
            return b(str2, wVCallBackContext);
        }
        if (c2 == 4) {
            return a(str2, wVCallBackContext);
        }
        if (c2 == 5) {
            return f(str2, wVCallBackContext);
        }
        NativeBroadcast.cxxJSBridge(NAME, str, str2, wVCallBackContext);
        return false;
    }

    private boolean a(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        final JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("pageName");
        String string2 = parseObject.getString("scriptName");
        final String string3 = parseObject.getString("operatorName");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
            wVCallBackContext.error();
            return true;
        }
        a(str);
        com.taobao.android.behavix.task.e.a(string, string2, null, new d() { // from class: com.taobao.android.testutils.JsBridgeBehaviXConfig.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.behavix.task.d
            public void a(String str2, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6635bcfe", new Object[]{this, str2, jSONObject});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("scriptExecuteResult", (Object) jSONObject);
                jSONObject2.put("params", (Object) parseObject);
                jSONObject2.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
                wVCallBackContext.success();
                a.b("BehaviX", "tableTest", string3, jSONObject2.toJSONString(), JsBridgeBehaviXConfig.a());
            }

            @Override // com.taobao.android.behavix.task.d
            public void a(String str2, String str3, String str4, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d5d0b6a", new Object[]{this, str2, str3, str4, jSONObject});
                } else {
                    wVCallBackContext.error();
                }
            }
        });
        return true;
    }

    private boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            String string = JSONObject.parseObject(str).getString("debugKey");
            if (StringUtils.isEmpty(string)) {
                wVCallBackContext.error("debugKey is null");
                return false;
            }
            b(str);
            a(true);
            a(true, "mtopDebugCacheTime", "mtopDebugCacheParam", str);
            wVCallBackContext.success();
            BHXCXXInnerBridge.updateCXXCttpUploadState(true, string);
            return true;
        } catch (Exception e2) {
            BHXCXXInnerBridge.updateCXXCttpUploadState(false, null);
            LogUtils.a(NAME, "", e2.getMessage());
            return false;
        }
    }

    private boolean c(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (StringUtils.equals(parseObject.getString("uploadSource"), "BXLog")) {
                parseObject.put("debug_api_url", (Object) "http://service-usertrack.alibaba-inc.com/upload_records_from_client");
                parseObject.put("debug_sampling_option", (Object) "true");
                parseObject.put("debug_store", (Object) parseObject.getString("debugKey"));
            }
            b(parseObject.toJSONString());
            a(true, "utDebugCacheTime", "utDebugCacheParam", parseObject.toJSONString());
            wVCallBackContext.success();
            BXBRBridge.a(BXBRBridge.ExtAction.UPLOAD_UPP_PLAN, new Object[0]);
            TLog.loge("BehaviX", NAME, "turnOnRealTimeDebug ok");
            return true;
        } catch (Throwable th) {
            wVCallBackContext.error();
            TLog.loge("BehaviX", NAME, "turnOnRealTimeDebug e:" + th.getMessage());
            return false;
        }
    }

    private boolean d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c8deb6", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            a(false);
            wVCallBackContext.success();
            TLog.loge("BehaviX", NAME, "turnOffRealTimeDebug ok");
            return true;
        } catch (Throwable th) {
            wVCallBackContext.error(th.getMessage());
            TLog.loge("BehaviX", NAME, "turnOffRealTimeDebug e:" + th.getMessage());
            return false;
        }
    }

    private boolean e(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d770977", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            ArrayList arrayList = (ArrayList) JSON.parseObject(JSON.parseObject(str).getString("groups"), ArrayList.class);
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LogUtils.d("mobileIntelligentUtils", NAME, JSON.toJSONString(OrangeConfig.getInstance().getConfigs((String) it.next())));
                }
                uPPConfigContentLogUpload();
                wVCallBackContext.success();
                return true;
            }
            wVCallBackContext.error("params is empty, " + str);
            return true;
        } catch (Throwable th) {
            wVCallBackContext.error(th.getMessage());
            return false;
        }
    }

    private boolean f(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1253438", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        } else if (JSONObject.parseObject(str) == null) {
            wVCallBackContext.error("params-parse failed.");
            return false;
        } else {
            BHXCXXInnerBridge.execMockInterface(str);
            wVCallBackContext.success();
            return true;
        }
    }

    public static void uPPConfigContentLogUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2839c3ea", new Object[0]);
        } else {
            BXBRBridge.a(BXBRBridge.ExtAction.UPLOAD_UPP_CONFIG, new Object[0]);
        }
    }

    public static String getBXLogMtopDebugKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da7257ed", new Object[0]);
        }
        Map<String, String> map = e;
        if (map == null) {
            return null;
        }
        return map.get("debugKey");
    }
}
