package com.taobao.android.ucp.bridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.f;
import com.alibaba.poplayer.trigger.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfig;
import com.taobao.android.behavir.e;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.event.BHRScrollEvent;
import com.taobao.android.behavir.fatigue.FatigueManager;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.c;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavir.util.l;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.j;
import com.taobao.android.external.UCPManager;
import com.taobao.android.external.UCPReachViewOpenState;
import com.taobao.android.external.b;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.ucp.UcpResponse;
import com.taobao.android.ucp.algo.NativeAlgo;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import com.taobao.android.ucp.view.UCPViewManager;
import com.taobao.android.upp.e;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tinct.ITinctOperater;
import com.tmall.android.dai.DAIKVStoreage;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import org.android.agoo.common.AgooConstants;
import tb.dqq;
import tb.dqz;
import tb.dro;
import tb.dsc;
import tb.dsj;
import tb.esv;
import tb.ghi;
import tb.ghm;
import tb.kge;
import tb.noa;
import tb.ssj;
import tb.ssl;

/* loaded from: classes.dex */
public class NativeDelegate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SETTING_ACTION = "UCPTabBarShouldRemove";
    public static final String SETTING_BIZ = "bx";
    public static final String SETTING_KEY = "tab2remind";
    private static final Map<String, NativeBroadcast.Callback> sceneCallbackMap;
    private static final Map<String, NativeBroadcast.Callback> schemeCallbackMap;

    /* loaded from: classes6.dex */
    public enum StaticVariableName {
        SERVER_TIME,
        CUR_PAGE_INFO,
        USER_ID,
        EDITION_CODE,
        IS_TAO_LINK_SHOW,
        IS_POP_FIRST_PAGE_READY,
        AFC_ID,
        CPP_INIT_END,
        CPP_LAUNCH_END,
        BX_LAUNCH_OPT,
        LOAD_MNN,
        LAUNCH_TYPE,
        APP_VERSION_CODE,
        TAO_SETTING_TAB2_BAR
    }

    private static native String innerCheckDisplaySyncWithCode(String str);

    private static native String[] innerCheckFatigue(String str);

    private static native void innerFetchColdStartData();

    private static native String innerGetCppStaticVariable(int i);

    private static native String[] innerTryTriggerUCPEvent(String str);

    private static native void nativeRefreshGlobalControl(String str);

    public static /* synthetic */ void access$000(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75554d8f", new Object[]{str, jSONObject});
        } else {
            doDyeInner(str, jSONObject);
        }
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]) : schemeCallbackMap;
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e220286e", new Object[0]) : sceneCallbackMap;
    }

    public static /* synthetic */ Intent access$300(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("8d0ba0a7", new Object[]{str, jSONObject}) : buildIntent(str, jSONObject);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        registerDoService();
        registerRunModel();
        registerSwitchThread();
        registerNotifyPop();
        registerDoDye();
        registerCommitUMError();
        registerNonUCPTask();
        registerWaitForFragment();
        registerUpdateNextPageUtparam();
        registerBHXBroadcast();
        registerNotifyFatigueSummaryChanged();
        registerNotifyPush();
        registerUpdatePushStatus();
        registerNotifyReachView();
        registerChangeToBXDBStatus();
        registerUCPControlCenterUpdatePolicies();
        registerUpdateTabBarNotification();
        LocalBroadcastManager.getInstance(d.b()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("data");
                if (stringExtra == null) {
                    return;
                }
                NativeBroadcast.sendMessageFromJava(NativeBroadcast.UPDATE_TAB_BAR_STATE, g.a("data", stringExtra), null);
            }
        }, new IntentFilter(esv.ACTION_TAB_BAR_ITEM_STATE_CHANGED));
        ssl.a(SETTING_KEY, new ssj() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ssj
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
                } else {
                    Intent intent = new Intent("UCPTabBarShouldRemove");
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("bizCode", (Object) "tab2");
                    jSONArray.add(jSONObject2);
                    jSONObject.put("removeList", (Object) jSONArray);
                    intent.putExtra("data", jSONObject);
                    LocalBroadcastManager.getInstance(d.b()).sendBroadcast(intent);
                }
            }
        });
    }

    private static void registerUCPControlCenterUpdatePolicies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597d7af3", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.UPDATE_TAB_BAR_POLICIES, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        a.a(jSONObject.getString("policies"));
                    }
                }
            });
        }
    }

    private static void registerUpdateTabBarNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8340bc", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.UPDATE_TAB_BAR, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    JSONObject jSONObject2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("updateInfo")) == null) {
                    } else {
                        TLog.loge("UCP", esv.ACTION_UCP_TAB_CONFIG_CHANGE);
                        Intent intent = new Intent(esv.ACTION_UCP_TAB_CONFIG_CHANGE);
                        intent.putExtra("data", jSONObject2);
                        dqq.a(intent);
                    }
                }
            });
        }
    }

    private static void registerChangeToBXDBStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b742a37b", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.CHANGE_TO_BX_STATUS, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        String string = jSONObject.getString("status");
                        String string2 = jSONObject.getString("dbPath");
                        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
                            return;
                        }
                        DAIKVStoreage.put("BehaviX", "BXDBMoveStatus", string);
                        DAIKVStoreage.put("BehaviX", "BXDBPath", string2);
                    }
                }
            });
        }
    }

    private static void registerUpdatePushStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4716229f", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.UPDATE_PUSH_STATUS, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (callback == null) {
                    } else {
                        callback.callback(g.a("inAppPushStatus", Boolean.valueOf(Utils.e()), "systemPushStatus", Boolean.valueOf(Utils.f())), null);
                    }
                }
            });
        }
    }

    private static void registerNotifyPush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb96da8d", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_PUSH, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, final NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null || callback == null) {
                    } else {
                        if (jSONObject.isEmpty()) {
                            callback.close();
                            return;
                        }
                        jSONObject.put(UCPManager.UCP_CALLBACK_ID, (Object) String.valueOf(callback.cache()));
                        if (UCPManager.a(jSONObject)) {
                            i.a(new i.a() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.behavix.utils.b
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else {
                                        callback.close();
                                    }
                                }
                            }, 10000L);
                        } else {
                            callback.close();
                        }
                    }
                }
            });
        }
    }

    private static void registerDoService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a50f14e", new Object[0]);
        } else {
            NativeBroadcast.register("request", new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, final NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(AgooConstants.MESSAGE_BODY);
                            final String string = jSONObject2.getString("apiName");
                            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
                            RemoteBusiness build = RemoteBusiness.build((MtopRequest) jSONObject2.toJavaObject(MtopRequest.class), d.d());
                            build.mo1297headers((Map<String, String>) jSONObject3);
                            build.mo1305reqMethod(MethodEnum.POST);
                            if (jSONObject.getBooleanValue("needWua")) {
                                build.mo1335useWua();
                            }
                            if ("1".equals(com.taobao.android.behavix.behavixswitch.a.a("inSubThread", "1"))) {
                                build.mo1296handler(dsc.c());
                            }
                            build.mo1328setUnitStrategy(com.taobao.android.behavir.network.a.a(jSONObject.getBooleanValue("isTradeUnit")));
                            com.taobao.android.behavir.network.a.a(build);
                            Looper myLooper = Looper.myLooper();
                            if (myLooper != null) {
                                build.mo1296handler(new Handler(myLooper));
                            }
                            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.8.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;
                                private volatile boolean d = false;

                                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    NativeBroadcast.Callback callback2 = callback;
                                    if (callback2 != null) {
                                        callback2.callback(null, null);
                                        callback.close();
                                    }
                                    this.d = true;
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                        return;
                                    }
                                    TLog.loge("UCP", string, "success");
                                    if (callback != null) {
                                        JSONObject jSONObject4 = new JSONObject();
                                        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
                                        if (headerFields != null) {
                                            jSONObject4.putAll(headerFields);
                                            jSONObject4.remove(null);
                                        }
                                        callback.callback(g.a("data", new String(mtopResponse.getBytedata()), "headerFields", jSONObject4), null);
                                        callback.close();
                                    }
                                    this.d = true;
                                    TLog.loge("UCP", string, "success end");
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                                        return;
                                    }
                                    TLog.loge("UCP", string, "error");
                                    NativeBroadcast.Callback callback2 = callback;
                                    if (callback2 != null) {
                                        callback2.callback(g.a("data", new String(mtopResponse.getBytedata()), "headerFields", mtopResponse.getHeaderFields()), null);
                                        callback.close();
                                    }
                                    this.d = true;
                                    TLog.loge("UCP", string, "error end");
                                }

                                public void finalize() throws Throwable {
                                    IpChange ipChange3 = $ipChange;
                                    boolean z = false;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("a35321a5", new Object[]{this});
                                        return;
                                    }
                                    super.finalize();
                                    if (this.d) {
                                        return;
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append("notCallback");
                                    if (callback == null) {
                                        z = true;
                                    }
                                    sb.append(z);
                                    UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "registerDoService", null, "registerDoServiceError", sb.toString());
                                    TLog.loge("UCP", string, "not callback");
                                    NativeBroadcast.Callback callback2 = callback;
                                    if (callback2 == null) {
                                        return;
                                    }
                                    callback2.callback(null, null);
                                    callback.close();
                                }
                            }).startRequest();
                        } catch (Exception e) {
                            UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "registerDoService", null, "registerDoServiceError", e.getMessage());
                            if (callback == null) {
                                return;
                            }
                            callback.callback(null, null);
                            callback.close();
                        }
                    }
                }
            });
        }
    }

    private static void registerRunModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff77b28", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.RUN_MODEL, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, final NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null || callback == null) {
                    } else {
                        String string = jSONObject.getString(noa.KEY_MODEL_NAME);
                        if (StringUtils.isEmpty(string)) {
                            string = jSONObject.getString("pythonName");
                        }
                        final boolean booleanValue = jSONObject.getBooleanValue("isAlias");
                        JSONObject a2 = Utils.a(jSONObject.getJSONObject("input"));
                        Object obj = new Object();
                        Log.e("sijian", "run model：" + System.identityHashCode(obj) + "," + System.currentTimeMillis());
                        e.a(string, a2.getInnerMap(), booleanValue, new com.taobao.android.behavix.task.d() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.9.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.behavix.task.d
                            public void a(String str, JSONObject jSONObject2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject2});
                                    return;
                                }
                                if (booleanValue) {
                                    l.a(jSONObject2);
                                }
                                callback.callback(jSONObject2, null);
                                callback.close();
                            }

                            @Override // com.taobao.android.behavix.task.d
                            public void a(String str, String str2, String str3, JSONObject jSONObject2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject2});
                                    return;
                                }
                                callback.callback(jSONObject2, null);
                                callback.close();
                            }
                        }, 0);
                    }
                }
            });
        }
    }

    private static void registerSwitchThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6426ca8", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.SWITCH_THREAD, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.10
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final int DEFAULT = 0;
                public final int MAIN_THREAD = 1;
                public final int BX_THREAD = 2;
                public final int NATIVEALGO_EXEC = 3;
                public final int UCP_THREAD = 4;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, final NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null || callback == null) {
                    } else {
                        int intValue = jSONObject.getIntValue("type");
                        int intValue2 = jSONObject.getIntValue("delay");
                        if (intValue == 1) {
                            i.b(new i.a() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.10.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.behavix.utils.b
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                        return;
                                    }
                                    callback.callback(null, null);
                                    callback.close();
                                }
                            }, intValue2);
                            return;
                        }
                        if (intValue != 2) {
                            if (intValue == 3) {
                                if (intValue2 <= 0) {
                                    NativeAlgo.getExecuteHandler().post(new i.a() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.10.3
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // com.taobao.android.behavix.utils.b
                                        public void a() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                                return;
                                            }
                                            callback.callback(null, null);
                                            callback.close();
                                        }
                                    });
                                    return;
                                } else {
                                    NativeAlgo.getExecuteHandler().postDelayed(new i.a() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.10.4
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // com.taobao.android.behavix.utils.b
                                        public void a() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                                return;
                                            }
                                            callback.callback(null, null);
                                            callback.close();
                                        }
                                    }, intValue2);
                                    return;
                                }
                            } else if (intValue != 4) {
                                callback.callback(null, null);
                                callback.close();
                                return;
                            }
                        }
                        i.a(new i.a() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.10.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.behavix.utils.b
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    return;
                                }
                                callback.callback(null, null);
                                callback.close();
                            }
                        }, intValue2);
                    }
                }
            });
        }
    }

    private static void registerNotifyReachView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365ced3", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_REACH_VIEW, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass11 anonymousClass11, String str, Object... objArr) {
                    str.hashCode();
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (callback == null) {
                        TLog.loge("UCPLOG registerNotifyReachView", "callback is null");
                    } else {
                        TLog.loge("UCP", "registerNotifyReachView", String.valueOf(jSONObject));
                        if (jSONObject == null) {
                            backflowException("ReachView", "InnerError", "reach view's param is empty", callback);
                            return;
                        }
                        String string = jSONObject.getString("reachViewKey");
                        if (StringUtils.isEmpty(string)) {
                            backflowException("ReachView", "InnerError", "reach view's key is empty", callback);
                            return;
                        }
                        b c = UCPManager.c(string);
                        if (c == null) {
                            backflowException("ReachView", "InnerError", "unregister reach view:" + string, callback);
                        } else if (!c.isEnabled()) {
                            backflowException("ReachView", "InnerError", "biz downgrade" + string, callback);
                        } else {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("trackInfo");
                            jSONObject2.put("callback", (Object) callback);
                            if (c.openReachView(jSONObject, jSONObject2) != UCPReachViewOpenState.TERMINATION) {
                                return;
                            }
                            backflowException("ReachView", com.taobao.homepage.pop.ucp.b.KEY_TERMINAL, "biz terminal early", callback);
                        }
                    }
                }

                private void backflowException(String str, String str2, String str3, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38037f49", new Object[]{this, str, str2, str3, callback});
                        return;
                    }
                    TLog.loge("UCP", "registerNotifyReachView", str, str2, str3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("group", (Object) str);
                    jSONObject.put("key", (Object) str2);
                    jSONObject.put("errorCode", (Object) 3);
                    jSONObject.put("errorMessage", (Object) str3);
                    callback.callback(jSONObject, null);
                    callback.close();
                }
            });
        }
    }

    private static void registerNotifyPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd17b4ec", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_POP, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                        return;
                    }
                    TLog.loge("UCPLOG registerNotifyPop", String.valueOf(jSONObject));
                    if (callback == null || jSONObject == null) {
                        TLog.loge("UCPLOG registerNotifyPop", "callback is null");
                    } else if (dro.b("ucpNotifyPopOpt")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(h.KEY_TRACK_MAP);
                        if (jSONObject2 == null) {
                            TLog.loge("registerNotifyPop", "trackMap is null");
                            callback.close();
                            return;
                        }
                        jSONObject.put(h.KEY_URI_SET, (Object) StringUtils.join(",", jSONObject.getJSONArray(h.KEY_URI_SET)));
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("nativeCallback", (Object) callback);
                        jSONObject3.put("fromNative", (Object) true);
                        for (String str : jSONObject2.keySet()) {
                            jSONObject2.getJSONObject(str).put("nonSerializableData", (Object) new Utils.b(jSONObject3));
                        }
                        TLog.loge("registerNotifyPop", "sendBroadcast begin");
                        f.a().a(jSONObject);
                        TLog.loge("registerNotifyPop", "sendBroadcast end");
                    } else {
                        Intent intent = new Intent(PopLayer.ACTION_PRE_DEAL_CUSTOM_TRIGGER);
                        intent.putExtra(h.KEY_URI_SET, StringUtils.join(",", jSONObject.getJSONArray(h.KEY_URI_SET)));
                        intent.putExtra(h.KEY_INDEX_MAP, jSONObject.getString(h.KEY_INDEX_MAP));
                        intent.putExtra(h.KEY_NO_ALG_FILTER_MAP, jSONObject.getString(h.KEY_NO_ALG_FILTER_MAP));
                        intent.putExtra("traceId", jSONObject.getString("traceId"));
                        JSONObject jSONObject4 = jSONObject.getJSONObject(h.KEY_TRACK_MAP);
                        if (jSONObject4 == null) {
                            TLog.loge("registerNotifyPop", "trackMap is null");
                            return;
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("nativeCallback", (Object) callback);
                        jSONObject5.put("fromNative", (Object) true);
                        for (String str2 : jSONObject4.keySet()) {
                            jSONObject4.getJSONObject(str2).put("nonSerializableData", (Object) new Utils.b(jSONObject5));
                        }
                        intent.putExtra(h.KEY_TRACK_MAP, jSONObject4);
                        TLog.loge("registerNotifyPop", "sendBroadcast begin");
                        dqq.a(intent);
                        TLog.loge("registerNotifyPop", "sendBroadcast end");
                    }
                }
            });
        }
    }

    private static void registerDoDye() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd17489", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.DO_DYE, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                        return;
                    }
                    JSONObject b = Utils.b(jSONObject);
                    if (!b.containsKey("bizName") || !b.containsKey("grayConfig")) {
                        return;
                    }
                    NativeDelegate.access$000(b.getString("bizName"), b.getJSONObject("grayConfig"));
                }
            });
        }
    }

    private static void doDyeInner(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403177ee", new Object[]{str, jSONObject});
            return;
        }
        for (String str2 : jSONObject.keySet()) {
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            if (jSONArray != null) {
                String format = String.format("%s-%s", str, str2);
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject b = Utils.b(jSONArray.getJSONObject(i));
                    ITinctOperater.getInstance().markUsed(format, b.getString("id"), b.getString("v"), str, true);
                }
            }
        }
    }

    private static void registerCommitUMError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ff1cdd", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.COMMIT_UM_ERROR, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        com.taobao.android.behavir.util.d.a(jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"), jSONObject.getJSONObject("errorData"));
                    }
                }
            });
        }
    }

    private static void registerNonUCPTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74411dc4", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NON_UCP_TASK, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass15 anonymousClass15, String str, Object... objArr) {
                    str.hashCode();
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    BHREvent bHREvent;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        BHRTaskConfig bHRTaskConfig = new BHRTaskConfig(jSONObject.getJSONObject("taskConfig"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
                        if ("scroll".equals(jSONObject2.getString("actionType"))) {
                            bHREvent = (BHREvent) jSONObject2.toJavaObject(BHRScrollEvent.class);
                        } else {
                            bHREvent = (BHREvent) jSONObject2.toJavaObject(BHREvent.class);
                        }
                        try {
                            bHREvent.actionArgsJSON = JSON.parseObject(bHREvent.actionArgs);
                        } catch (Exception unused) {
                            bHREvent = null;
                        }
                        if (bHREvent == null) {
                            return;
                        }
                        bHREvent.addBrMark();
                        dqz task = getTask(bHRTaskConfig, bHREvent);
                        if (task == null) {
                            return;
                        }
                        task.c();
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
                    if (r6.equals(tb.dqx.TYPE) != false) goto L17;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private tb.dqz getTask(com.taobao.android.behavir.config.BHRTaskConfigBase r10, com.taobao.android.behavir.event.BHREvent r11) {
                    /*
                        r9 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.ucp.bridge.NativeDelegate.AnonymousClass15.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        r5 = 3
                        if (r1 == 0) goto L1b
                        java.lang.Object[] r1 = new java.lang.Object[r5]
                        r1[r2] = r9
                        r1[r4] = r10
                        r1[r3] = r11
                        java.lang.String r10 = "74f13ac3"
                        java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
                        tb.dqz r10 = (tb.dqz) r10
                        return r10
                    L1b:
                        r0 = 0
                        if (r10 == 0) goto L8d
                        if (r11 != 0) goto L22
                        goto L8d
                    L22:
                        com.alibaba.fastjson.JSONObject r1 = r10.getTaskInfo()
                        java.lang.String r6 = "taskType"
                        java.lang.String r6 = r1.getString(r6)
                        boolean r7 = android.text.StringUtils.isEmpty(r6)
                        if (r7 == 0) goto L34
                        return r0
                    L34:
                        r7 = -1
                        int r8 = r6.hashCode()
                        switch(r8) {
                            case -1422950858: goto L5c;
                            case -973197092: goto L51;
                            case 711427452: goto L47;
                            case 1449359373: goto L3d;
                            default: goto L3c;
                        }
                    L3c:
                        goto L66
                    L3d:
                        java.lang.String r2 = "bx_feature"
                        boolean r2 = r6.equals(r2)
                        if (r2 == 0) goto L66
                        r2 = 2
                        goto L67
                    L47:
                        java.lang.String r8 = "python_solution"
                        boolean r6 = r6.equals(r8)
                        if (r6 == 0) goto L66
                        goto L67
                    L51:
                        java.lang.String r2 = "python"
                        boolean r2 = r6.equals(r2)
                        if (r2 == 0) goto L66
                        r2 = 1
                        goto L67
                    L5c:
                        java.lang.String r2 = "action"
                        boolean r2 = r6.equals(r2)
                        if (r2 == 0) goto L66
                        r2 = 3
                        goto L67
                    L66:
                        r2 = -1
                    L67:
                        if (r2 == 0) goto L82
                        if (r2 == r4) goto L7c
                        if (r2 == r3) goto L76
                        if (r2 == r5) goto L70
                        goto L8d
                    L70:
                        tb.dqr r0 = new tb.dqr
                        r0.<init>(r10, r11)
                        goto L8d
                    L76:
                        tb.dqt r0 = new tb.dqt
                        r0.<init>(r10, r11)
                        goto L8d
                    L7c:
                        tb.dqy r0 = new tb.dqy
                        r0.<init>(r10, r11)
                        goto L8d
                    L82:
                        com.taobao.android.behavir.solution.BHRSolution r1 = com.taobao.android.behavir.config.a.a(r1)
                        if (r1 == 0) goto L8d
                        tb.dqx r0 = new tb.dqx
                        r0.<init>(r1, r10, r11)
                    L8d:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ucp.bridge.NativeDelegate.AnonymousClass15.getTask(com.taobao.android.behavir.config.BHRTaskConfigBase, com.taobao.android.behavir.event.BHREvent):tb.dqz");
                }
            });
        }
    }

    public static void AddUserFeature(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdd2dd5", new Object[]{str, jSONObject});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.ADD_USER_FEATURE, g.a("channel", str, "userFeatureJson", jSONObject), null);
        }
    }

    public static String getJavaVariable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64522af8", new Object[]{new Integer(i)});
        }
        StaticVariableName[] values = StaticVariableName.values();
        if (i >= 0 && i < values.length) {
            switch (values[i]) {
                case SERVER_TIME:
                    return String.valueOf((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
                case CUR_PAGE_INFO:
                    return j.a(com.taobao.android.behavir.util.a.a()) + "," + j.a(com.taobao.android.behavir.util.a.b());
                case USER_ID:
                    return dsj.f26943a;
                case EDITION_CODE:
                    return c.a();
                case IS_TAO_LINK_SHOW:
                    com.taobao.android.ucp.view.b a2 = UCPViewManager.a("", "");
                    return a2 != null ? a2.c() : "";
                case IS_POP_FIRST_PAGE_READY:
                    return String.valueOf(com.taobao.android.behavir.util.h.b().c());
                case AFC_ID:
                    String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                    return globalProperty == null ? "" : globalProperty;
                case BX_LAUNCH_OPT:
                    return String.valueOf(dro.e());
                case LAUNCH_TYPE:
                    return dro.f();
                case APP_VERSION_CODE:
                    if (Utils.c()) {
                        try {
                            return ((ghm) ghi.a(ghm.class)).queryCurrentVersionInfo().c;
                        } catch (Throwable unused) {
                        }
                    }
                    return "";
                case TAO_SETTING_TAB2_BAR:
                    try {
                        return ((Boolean) com.taobao.global.setting.c.a(Globals.getApplication(), SETTING_BIZ).b().a(SETTING_BIZ, SETTING_KEY, true, null)).booleanValue() ? "1" : "0";
                    } catch (Throwable th) {
                        LogUtils.a(LogUtils.BX_BIZ_NAME, th.toString(), new Object[0]);
                        return "1";
                    }
            }
        }
        return "";
    }

    private static void registerUpdateNextPageUtparam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40143067", new Object[0]);
        } else {
            NativeBroadcast.register("updateNextPageUtparam", new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        String string = jSONObject.getString("data");
                        if (StringUtils.isEmpty(string)) {
                            return;
                        }
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(string);
                    }
                }
            });
        }
    }

    private static void registerWaitForFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13538068", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.WAIT_FOR_FRAGMENT, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, final NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (callback == null) {
                    } else {
                        com.taobao.android.behavir.util.a.a(new Runnable() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.17.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Log.e("sijian", "tryWaitForFragment");
                                callback.callback(null, null);
                                callback.close();
                            }
                        });
                    }
                }
            });
        }
    }

    static {
        kge.a(821366786);
        schemeCallbackMap = new HashMap();
        sceneCallbackMap = new HashMap();
    }

    public static String registerResourceSchemeToCpp(String str, Object obj, String str2, JSONObject jSONObject, final com.taobao.android.upp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("555ab75e", new Object[]{str, obj, str2, jSONObject, aVar});
        }
        String valueOf = obj != null ? String.valueOf(obj.hashCode()) : "kUCPCommonInstanceId";
        Log.e("sijian", "registerResourceSchemeToCpp");
        NativeBroadcast.Callback callback = new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback2) {
                com.taobao.android.upp.a aVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback2});
                } else if (jSONObject2 == null || (aVar2 = com.taobao.android.upp.a.this) == null || aVar2.a() == null) {
                } else {
                    new UcpResponse().setModelData(jSONObject2);
                    com.taobao.android.upp.a.this.a();
                }
            }
        };
        Map<String, NativeBroadcast.Callback> map = schemeCallbackMap;
        map.put(str2 + valueOf, callback);
        NativeBroadcast.register(NativeBroadcast.CALLBACK_TO_SCHEME, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
            public void callback(JSONObject jSONObject2, NativeBroadcast.Callback callback2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject2, callback2});
                } else if (jSONObject2 == null) {
                } else {
                    String string = jSONObject2.getString("schemeId");
                    String string2 = jSONObject2.getString("instanceId");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                    Map access$100 = NativeDelegate.access$100();
                    NativeBroadcast.Callback callback3 = (NativeBroadcast.Callback) access$100.get(string + string2);
                    if (callback3 == null) {
                        return;
                    }
                    callback3.callback(jSONObject3, null);
                }
            }
        });
        return str2 + valueOf;
    }

    public static void removeSceneCallback(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e43e70", new Object[]{str, activity});
        } else {
            sceneCallbackMap.remove(getUCPCallbackKey(str, activity));
        }
    }

    private static String getUCPCallbackKey(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7109c805", new Object[]{str, obj});
        }
        String valueOf = obj == null ? "null" : String.valueOf(obj.hashCode());
        return valueOf + str;
    }

    public static void addSceneCallback(String str, Object obj, final e.a aVar, final e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fc892f", new Object[]{str, obj, aVar, cVar});
        } else if (aVar == null && cVar == null) {
        } else {
            sceneCallbackMap.put(getUCPCallbackKey(str, obj), new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject != null) {
                        e.a aVar2 = e.a.this;
                        if (aVar2 != null) {
                            aVar2.a(jSONObject);
                        } else if (cVar != null) {
                            HashMap hashMap = new HashMap();
                            for (String str2 : jSONObject.keySet()) {
                                UcpResponse ucpResponse = new UcpResponse();
                                ucpResponse.setModelData(jSONObject);
                                hashMap.put(str2, ucpResponse);
                            }
                        }
                    }
                }
            });
            NativeBroadcast.register(NativeBroadcast.CALLBACK_TO_SCENE, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        String string = jSONObject.getString("scene");
                        String string2 = jSONObject.getString("sceneHash");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        Map access$200 = NativeDelegate.access$200();
                        NativeBroadcast.Callback callback2 = (NativeBroadcast.Callback) access$200.get(string2 + string);
                        if (callback2 == null) {
                            return;
                        }
                        callback2.callback(jSONObject2, null);
                    }
                }
            });
        }
    }

    public static void registerUCPPlansToCpp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1a8d2c", new Object[]{jSONObject});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.REGISTER_PLANS, jSONObject, null);
        }
    }

    private static void registerBHXBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891941b9", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.BHX_BROADCAST, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        String string = jSONObject.getString("broadcastName");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                        if (StringUtils.isEmpty(string) || jSONObject2 == null) {
                            return;
                        }
                        Intent access$300 = NativeDelegate.access$300(string, jSONObject2);
                        access$300.setPackage(d.b().getPackageName());
                        LocalBroadcastManager.getInstance(d.b()).sendBroadcast(access$300);
                    }
                }
            });
        }
    }

    private static Intent buildIntent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c4ae24de", new Object[]{str, jSONObject});
        }
        Intent intent = new Intent(str);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Serializable) {
                intent.putExtra(key, (Serializable) value);
            }
        }
        return intent;
    }

    public static void triggerServiceRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f5d703", new Object[]{str});
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.TRIGGER_SERVICE, str != null ? g.a("fetchType", str) : null, null);
        }
    }

    public static void cppMakeDecision(BHREvent bHREvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10dfc08b", new Object[]{bHREvent});
        } else if (bHREvent == null) {
        } else {
            NativeBroadcast.sendMessageFromJava(NativeBroadcast.MAKE_DECISION, bHREvent.toJsonObject(), null);
        }
    }

    public static boolean nativeTryTriggerUCPEvent(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e48eaf7", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        String[] innerTryTriggerUCPEvent = innerTryTriggerUCPEvent(jSONObject.toString());
        if (innerTryTriggerUCPEvent == null || innerTryTriggerUCPEvent.length == 0) {
            return false;
        }
        String str = innerTryTriggerUCPEvent[0];
        String str2 = null;
        if (innerTryTriggerUCPEvent.length >= 2) {
            str2 = innerTryTriggerUCPEvent[1];
        }
        jSONObject2.put("popIndexId", (Object) str);
        jSONObject2.put("msg", (Object) str2);
        return StringUtils.isEmpty(str2);
    }

    public static boolean nativeCheckFatigue(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc5cf2a1", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        String[] innerCheckFatigue = innerCheckFatigue(jSONObject.toString());
        if (innerCheckFatigue == null || innerCheckFatigue.length == 0) {
            return false;
        }
        String str = innerCheckFatigue[0];
        Object obj = null;
        if (innerCheckFatigue.length >= 2) {
            obj = innerCheckFatigue[1];
        }
        jSONObject2.put("msg", obj);
        return StringUtils.equals(str, "true");
    }

    public static void nativeCheckDisplaySyncWithCode(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6405120", new Object[]{str, jSONObject});
            return;
        }
        String innerCheckDisplaySyncWithCode = innerCheckDisplaySyncWithCode(str);
        if (StringUtils.isEmpty(innerCheckDisplaySyncWithCode)) {
            return;
        }
        jSONObject.putAll(JSON.parseObject(innerCheckDisplaySyncWithCode));
    }

    public static void fetchColdStartData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac94d95", new Object[0]);
        } else if (BHXCXXBaseBridge.LoadCXXLib()) {
            innerFetchColdStartData();
        } else {
            TLog.loge("UCP", "ColdStartData", "loadCXXLib failed");
        }
    }

    public static void refreshGlobalControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ad8e70", new Object[]{str});
        } else if (BHXCXXBaseBridge.LoadCXXLib()) {
            nativeRefreshGlobalControl(str);
        } else {
            TLog.loge("UCP", "refreshGlobalControl", "loadCXXLib failed");
        }
    }

    private static String checkPopFatigue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cd8ae11", new Object[]{str});
        }
        if (dro.b("ucpCheckPopFatigueOpt")) {
            return "";
        }
        Map<String, String> map = null;
        try {
            map = PopLayer.getReference().filterFatigue(Collections.singletonList(str));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        String str2 = map.get(str);
        if (StringUtils.isEmpty(str2)) {
            return "";
        }
        return "PopLayer_" + str2;
    }

    public static String getCppStaticVariable(StaticVariableName staticVariableName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cf42a94", new Object[]{staticVariableName});
        }
        if (staticVariableName == null) {
            return "";
        }
        if (!BHXCXXBaseBridge.checkCXXLib()) {
            TLog.loge("UCP", "getCppStaticVariable", "loadCXXLib failed: " + staticVariableName.ordinal());
            return "";
        }
        return innerGetCppStaticVariable(staticVariableName.ordinal());
    }

    private static void registerNotifyFatigueSummaryChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63323670", new Object[0]);
        } else {
            NativeBroadcast.register(NativeBroadcast.NOTIFY_FATIGUE_SUMMARY_CHANGED, new NativeBroadcast.Callback() { // from class: com.taobao.android.ucp.bridge.NativeDelegate.23
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.ucp.bridge.NativeBroadcast.Callback
                public void callback(JSONObject jSONObject, NativeBroadcast.Callback callback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b307a8e", new Object[]{this, jSONObject, callback});
                    } else if (jSONObject == null) {
                    } else {
                        FatigueManager.NotifyFatigueSummaryChanged(jSONObject.getString("identifier"));
                    }
                }
            });
        }
    }

    private static boolean getABSwitch(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("78d6f860", new Object[]{str})).booleanValue() : dro.b(str);
    }

    private static boolean checkSolution(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fc82a76", new Object[]{str})).booleanValue() : com.taobao.android.behavir.config.a.a(str) != null;
    }
}
