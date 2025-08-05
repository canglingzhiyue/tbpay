package com.taobao.android.external;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.h;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class UCPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_STATUS = "appStatus";
    public static final String CAN_BE_CONTROLLED_BY_UCP = "canBeControlledByUcp";
    public static final String DATA = "data";
    public static final String IN_APP_PUSH_STATUS_OFF = "inAppPushStatusOff";
    public static final String IN_APP_PUSH_STATUS_OPEN = "inAppPushStatusOpen";
    public static final String MSG = "msg";
    public static final String OFF = "off";
    public static final String SYSTEM_PUSH_STATUS_OFF = "systemPushStatusOff";
    public static final String SYSTEM_PUSH_STATUS_OPEN = "systemPushStatusOpen";
    public static final String UCPCHECK_FATIGUE_FAILED = "UCPCheckFatigueFailed";
    public static final String UCPCHECK_INIT_FAILED = "UCPCheckInitFailed";
    public static final String UCPCHECK_MUTEX_FAILED = "UCPCheckMutexFailed";
    public static final String UCP_CALLBACK_ID = "ucpCallbackId";
    public static final String UCP_CHECK_PARAMS_FAILED = "UCPCheckParamsFailed";
    public static final String UCP_CHECK_PLAN_FAILED = "UCPCheckPlanFailed";
    public static final String UCP_TRACK_INFO = "ucpTrackInfo";
    public static final String UCP_TRACK_PARAMS = "ucpParams";

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f12310a;
    private static final Map<String, com.taobao.android.external.b> b;

    /* loaded from: classes5.dex */
    public interface a {
        void notify(JSONObject jSONObject);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void callback(boolean z, String str, JSONObject jSONObject);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void callback(boolean z, JSONObject jSONObject);
    }

    private static native String checkAnyTrackerInProcess();

    private static native boolean checkPushCanBeControlled(String str);

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        a aVar = f12310a;
        if (aVar == null) {
            LogUtils.b("UCP", "UCPManager", "push回调未初始化");
            return false;
        }
        aVar.notify(jSONObject);
        LogUtils.b("UCP", "UCPManager", "push回调成功");
        return true;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07d2b1e", new Object[]{aVar});
            return;
        }
        LogUtils.b("UCP", "UCPManager", aVar);
        f12310a = aVar;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = com.taobao.android.ucp.util.c.a().a(str);
        if (currentTimeMillis % 10 == 0) {
            UtUtils.a("UCP", UtUtils.a(), "fetchFatiguePerf", "", "", g.a("cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "result", a2));
        }
        return a2;
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        TLog.loge("UCP:", "tryTriggerUCPEvent", JSON.toJSONString(jSONObject));
        String a2 = com.taobao.android.behavix.behavixswitch.a.a("splashADDowngradeUrl", "");
        String a3 = com.taobao.android.behavix.behavixswitch.a.a("splashADDowngradeIndexId", "");
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
            jSONObject2.put("popIndexId", (Object) a3);
            jSONObject2.put("msg", (Object) "UCPDowngrade");
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", a2);
            LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).sendBroadcast(intent);
            return true;
        }
        boolean b2 = b(jSONObject, jSONObject2);
        if (!b2) {
            UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "UCPManager", null, "UCPManager", jSONObject2.getString("msg"));
        }
        return b2;
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (!BHXCXXBaseBridge.checkCXXLib()) {
            jSONObject2.put("msg", UCPCHECK_INIT_FAILED);
            return false;
        }
        return NativeDelegate.nativeTryTriggerUCPEvent(jSONObject, jSONObject2);
    }

    static {
        kge.a(1390765276);
        b = new ConcurrentHashMap();
    }

    public static void a(com.taobao.android.external.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94183892", new Object[]{bVar, str});
        } else if (TextUtils.isEmpty(str) || bVar == null) {
        } else {
            b.put(str, bVar);
            bVar.registerStateSynchronizer(new com.taobao.android.external.c());
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b.remove(str);
        }
    }

    public static com.taobao.android.external.b c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.external.b) ipChange.ipc$dispatch("1498c154", new Object[]{str}) : b.get(str);
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{str, str2, str3, jSONObject});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
        } else {
            if (!com.taobao.android.behavix.d.e()) {
                UtUtils.a("UCP", 19999, "behavixNull", "sendUCPEventWithScene", "", "");
            }
            BHREvent buildInternalEvent = BHREvent.buildInternalEvent(str, str3, "", true);
            buildInternalEvent.actionType = str2;
            buildInternalEvent.bizArgKVMapObject = jSONObject;
            BHRDecisionEngine.a().a(buildInternalEvent);
        }
    }

    public static void a(final String str, final String str2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else {
            i.c(new i.a() { // from class: com.taobao.android.external.UCPManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.behavir.util.a.a(str, str2, jSONObject);
                    }
                }
            });
        }
    }

    public static void a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
        } else if (str == null) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            NativeDelegate.AddUserFeature(str, new JSONObject(map));
        }
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
        } else {
            NativeDelegate.registerUCPPlansToCpp(jSONObject);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.taobao.android.behavir.util.a.a(str);
        }
    }

    public static boolean a(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4326e94", new Object[]{str, str2, str3, str4, jSONObject, jSONObject2})).booleanValue();
        }
        if (!"bottomBar".equals(str)) {
            return true;
        }
        return com.taobao.android.ucp.bridge.a.a(str2, str3, str4, jSONObject, jSONObject2);
    }

    public static void a(final String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9222c7", new Object[]{str, bVar});
        } else if (TextUtils.isEmpty(str) || bVar == null) {
            if (bVar != null) {
                bVar.callback(false, UCP_CHECK_PARAMS_FAILED, new JSONObject());
            }
            LogUtils.a("GlobalControl", "checkDisplayWithCode", "code or callback is invalid");
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            final b bVar2 = new b() { // from class: com.taobao.android.external.UCPManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.external.UCPManager.b
                public void callback(boolean z, String str2, JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d8a835e", new Object[]{this, new Boolean(z), str2, jSONObject});
                        return;
                    }
                    b.this.callback(z, str2, jSONObject);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", (Object) str);
                    jSONObject2.put("checkResult", (Object) Boolean.valueOf(z));
                    jSONObject2.put("reason", (Object) str2);
                    jSONObject2.put("cost", (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    UtUtils.a("UCP", (int) UtUtils.CHANGED_UPP_EVENT_ID, "checkDisplayWithCode", "", "", jSONObject2);
                }
            };
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.CHECK_DISPLAY, g.a("data", str), new NativeBroadcast.Callback() { // from class: com.taobao.android.external.UCPManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        boolean booleanValue = jSONObject.getBooleanValue("checkResult");
                        String string = jSONObject.getString("reason");
                        bVar2.callback(booleanValue, string, jSONObject.getJSONObject("trackInfo"));
                        Object[] objArr = new Object[3];
                        objArr[0] = "checkResult:%s|reason:%s";
                        objArr[1] = booleanValue ? "true" : "false";
                        objArr[2] = string;
                        LogUtils.a("GlobalControl", "checkDisplayWithCode", objArr);
                    } else {
                        String[] split = str.split("#");
                        if (split == null || split.length < 5) {
                            bVar2.callback(false, UCPManager.UCP_CHECK_PARAMS_FAILED, new JSONObject());
                            LogUtils.a("GlobalControl", "checkDisplayWithCode", "json and code is invalid");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("schemeId", (Object) split[0]);
                        jSONObject2.put("schemeNumId", (Object) split[1]);
                        jSONObject2.put("bizId", (Object) split[2]);
                        jSONObject2.put("bizNum", (Object) split[3]);
                        jSONObject2.put(com.alibaba.triver.triver_shop.newShop.event.ucp.a.MATERIAL_ID_KEY, (Object) split[4]);
                        bVar2.callback(true, "UCPException", jSONObject2);
                        LogUtils.a("GlobalControl", "checkDisplayWithCode", "json is invalid");
                    }
                }
            });
        }
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        NativeDelegate.nativeCheckDisplaySyncWithCode(str, jSONObject);
    }

    public static void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{jSONObject});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.REPORT_ACTION, g.a("data", jSONObject), null);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            h.b().d();
        }
    }

    public static void a(JSONObject jSONObject, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a03bafc", new Object[]{jSONObject, cVar});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.CHECK_FATIGUE, jSONObject, new NativeBroadcast.Callback() { // from class: com.taobao.android.external.UCPManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback});
                    } else if (jSONObject2 == null) {
                        LogUtils.a("GlobalControl", NativeBroadcast.CHECK_FATIGUE, "json is invalid");
                        c.this.callback(true, g.a("msg", "UCPException"));
                    } else {
                        boolean booleanValue = jSONObject2.getBooleanValue("result");
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("outInfo");
                        c.this.callback(booleanValue, jSONObject3);
                        Object[] objArr = new Object[3];
                        objArr[0] = "checkResult:%s|outInfo:%s";
                        objArr[1] = booleanValue ? "true" : "false";
                        objArr[2] = Utils.a(jSONObject3).toJSONString();
                        LogUtils.a("GlobalControl", NativeBroadcast.CHECK_FATIGUE, objArr);
                    }
                }
            });
        }
    }
}
