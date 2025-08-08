package com.taobao.themis.open.ability.audio;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J4\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J(\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J2\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007JL\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010 \u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J(\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/ability/audio/TMSForegroundAudioBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "appLifeCycle", "Landroid/app/Application$ActivityLifecycleCallbacks;", "players", "Ljava/util/HashMap;", "", "Lcom/taobao/themis/open/ability/audio/PlayerInstance;", "Lkotlin/collections/HashMap;", "destroyForegroundAudio", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "audioPlayerId", "callback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getForegroundAudioOption", "optionName", "onFinalized", "onInitialized", "pauseForegroundAudio", "playForegroundAudio", "seekForegroundAudio", "position", "", "setForegroundAudioOption", "option", "params", "Lcom/alibaba/fastjson/JSONObject;", "appXDomain", "startMonitorForegroundAudio", "stopForegroundAudio", "stopMonitorForegroundAudio", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSForegroundAudioBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, d> f22614a = new HashMap<>();
    private final Application.ActivityLifecycleCallbacks b = new b();

    static {
        kge.a(-162423537);
        kge.a(-86622547);
        Companion = new a(null);
    }

    public static final /* synthetic */ HashMap access$getPlayers$p(TMSForegroundAudioBridge tMSForegroundAudioBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("71be7446", new Object[]{tMSForegroundAudioBridge}) : tMSForegroundAudioBridge.f22614a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/taobao/themis/open/ability/audio/TMSForegroundAudioBridge$appLifeCycle$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            q.d(activity, "activity");
            q.d(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            q.d(activity, "activity");
            for (Map.Entry entry : TMSForegroundAudioBridge.access$getPlayers$p(TMSForegroundAudioBridge.this).entrySet()) {
                entry.getKey();
                d dVar = (d) entry.getValue();
                if (dVar != null) {
                    try {
                        dVar.b((BridgeCallback) null);
                    } catch (Throwable th) {
                        TMSLogger.b("TMSForegroundAudioBridge", "onActivityPaused, pause player error: " + th.getMessage(), th);
                    }
                }
            }
        }
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void startMonitorForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b65973", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "startMonitorForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "startMonitorForegroundAudio page is null");
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        dVar.a(d);
        dVar.d(callback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void stopMonitorForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935b39d3", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "stopMonitorForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "stopMonitorForegroundAudio page is null");
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        dVar.j();
        dVar.d(callback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void getForegroundAudioOption(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingParam({"optionName"}) String str2, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23660832", new Object[]{this, apiContext, str, str2, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "getForegroundAudioOption page is null");
            return;
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "getForegroundAudioOption audioPlayerId is null or empty");
            return;
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            z = true;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "getForegroundAudioOption optionName is null or empty");
            return;
        }
        if (StringUtils.isEmpty(str3)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2129294769:
                    if (str2.equals("startTime")) {
                        dVar.h(callback);
                        return;
                    }
                    break;
                case -1992012396:
                    if (str2.equals("duration")) {
                        JSONObject k = dVar.k();
                        if (dVar.d()) {
                            k.put((JSONObject) "duration", (String) Float.valueOf(dVar.b().getDuration() / 1000.0f));
                        } else {
                            k.put((JSONObject) "duration", (String) Float.valueOf(0.0f));
                        }
                        callback.sendBridgeResponse(new BridgeResponse(k));
                        return;
                    }
                    break;
                case -1522036513:
                    if (str2.equals("buffered")) {
                        JSONObject k2 = dVar.k();
                        JSONObject jSONObject = k2;
                        jSONObject.put((JSONObject) "buffered", (String) Integer.valueOf(dVar.a()));
                        if (dVar.c()) {
                            jSONObject.put((JSONObject) "buffered", (String) 100);
                        }
                        callback.sendBridgeResponse(new BridgeResponse(k2));
                        return;
                    }
                    break;
                case -995321554:
                    if (str2.equals("paused")) {
                        JSONObject k3 = dVar.k();
                        k3.put((JSONObject) "paused", (String) Boolean.valueOf(!dVar.e()));
                        callback.sendBridgeResponse(new BridgeResponse(k3));
                        return;
                    }
                    break;
                case -810883302:
                    if (str2.equals(Constant.PROP_TTS_VOLUME)) {
                        dVar.i(callback);
                        return;
                    }
                    break;
                case 114148:
                    if (str2.equals("src")) {
                        dVar.f(callback);
                        return;
                    }
                    break;
                case 3327652:
                    if (str2.equals("loop")) {
                        dVar.j(callback);
                        return;
                    }
                    break;
                case 393706882:
                    if (str2.equals("isRecordAudioPlayState")) {
                        dVar.g(callback);
                        return;
                    }
                    break;
                case 601235430:
                    if (str2.equals("currentTime")) {
                        JSONObject k4 = dVar.k();
                        if (dVar.d()) {
                            k4.put((JSONObject) "currentTime", (String) Float.valueOf(dVar.b().getCurrentPosition() / 1000.0f));
                        } else {
                            k4.put((JSONObject) "currentTime", (String) Float.valueOf(0.0f));
                        }
                        callback.sendBridgeResponse(new BridgeResponse(k4));
                        return;
                    }
                    break;
                case 1439562083:
                    if (str2.equals("autoplay")) {
                        dVar.k(callback);
                        return;
                    }
                    break;
                case 1763557332:
                    if (str2.equals("obeyMuteSwitch")) {
                        JSONObject k5 = dVar.k();
                        k5.put((JSONObject) "obeyMuteSwitch", (String) true);
                        callback.sendBridgeResponse(new BridgeResponse(k5));
                        return;
                    }
                    break;
            }
        }
        callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        TMSLogger.d("TMSForegroundAudioBridge", "getForegroundAudioOption can't find optionName");
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void setForegroundAudioOption(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingParam({"option"}) String str2, @BindingRequest JSONObject jSONObject, @BindingParam({"__appxDomain"}) String str3, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94619b00", new Object[]{this, apiContext, str, str2, jSONObject, str3, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        ITMSPage iTMSPage = d;
        if (iTMSPage == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "stopMonitorForegroundAudio page is null");
            return;
        }
        String str4 = str;
        if (str4 != null && str4.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "stopMonitorForegroundAudio audioPlayerId is null or empty");
        } else if (jSONObject == null) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "stopMonitorForegroundAudio params is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("option");
            if (jSONObject2 == null) {
                callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.d("TMSForegroundAudioBridge", "stopMonitorForegroundAudio kv is null");
                return;
            }
            String str5 = StringUtils.isEmpty(str4) ? "DEFAULT_PLAYER" : str;
            d dVar = this.f22614a.get(str5);
            if (dVar == null) {
                dVar = new d(str5);
                this.f22614a.put(str5, dVar);
            }
            d dVar2 = dVar;
            dVar2.a(iTMSPage);
            if (jSONObject2.containsKey("src")) {
                String string = jSONObject2.getString("src");
                q.b(string, "kv.getString(TMSAudioConstant.ATTR_SRC)");
                dVar2.a(string, callback, false, str3, iTMSPage);
            } else if (jSONObject2.containsKey("autoplay")) {
                dVar2.a(callback, jSONObject2.getBooleanValue("autoplay"));
            } else if (jSONObject2.containsKey("loop")) {
                dVar2.b(jSONObject2.getBooleanValue("loop"), callback);
            } else if (jSONObject2.containsKey("startTime")) {
                dVar2.b(jSONObject2.getIntValue("startTime"), callback);
            } else if (jSONObject2.containsKey(Constant.PROP_TTS_VOLUME)) {
                dVar2.a(jSONObject2.getFloatValue(Constant.PROP_TTS_VOLUME), callback);
            } else if (jSONObject2.containsKey("isRecordAudioPlayState")) {
                Boolean bool = jSONObject2.getBoolean("isRecordAudioPlayState");
                q.b(bool, "kv.getBoolean(TMSAudioCo…t.ATTR_RECORD_PLAY_STATE)");
                dVar2.a(bool.booleanValue(), callback);
            } else {
                dVar2.e(callback);
                TMSLogger.b("ForeGroundAudioBridge", "InvalidParam : " + jSONObject);
            }
        }
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void playForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3020490f", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "playForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "playForegroundAudio page is null");
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        dVar.a(d);
        TMSLogger.b("TMSForegroundAudioBridge", "playForegroundAudio: " + this.f22614a.size());
        dVar.a(callback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void pauseForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50346651", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "pauseForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "pauseForegroundAudio page is null");
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        dVar.a(d);
        dVar.b(callback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void stopForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd3375d", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "stopForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        dVar.a(d);
        dVar.c(callback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void seekForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingParam({"position"}) int i, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd9f8a2", new Object[]{this, apiContext, str, new Integer(i), callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "stopForegroundAudio audioPlayerId is null or empty");
            return;
        }
        ITMSPage d = apiContext.d();
        if (!(d instanceof ITMSPage)) {
            d = null;
        }
        if (d == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str = "DEFAULT_PLAYER";
        }
        d dVar = this.f22614a.get(str);
        if (dVar == null) {
            dVar = new d(str);
            this.f22614a.put(str, dVar);
        }
        dVar.a(d);
        dVar.a(i, callback);
    }

    @ThreadType(ExecutorType.AUDIO)
    @APIMethod
    public final void destroyForegroundAudio(@BindingApiContext ApiContext apiContext, @BindingParam({"audioPlayerID"}) String str, @BindingCallback BridgeCallback callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4a8555", new Object[]{this, apiContext, str, callback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(callback, "callback");
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            callback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSForegroundAudioBridge", "stopForegroundAudio audioPlayerId is null or empty");
        } else if (apiContext.d() == null) {
            callback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSForegroundAudioBridge", "stopForegroundAudio page is null");
        } else {
            if (StringUtils.isEmpty(str2)) {
                str = "DEFAULT_PLAYER";
            }
            d dVar = this.f22614a.get(str);
            if (dVar == null) {
                dVar = new d(str);
                this.f22614a.put(str, dVar);
            }
            this.f22614a.remove(str);
            dVar.f();
            dVar.d(callback);
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
            return;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService == null || (applicationContext = iEnvironmentService.getApplicationContext()) == null) {
            return;
        }
        applicationContext.registerActivityLifecycleCallbacks(this.b);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        Application applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
            return;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        if (iEnvironmentService != null && (applicationContext = iEnvironmentService.getApplicationContext()) != null) {
            applicationContext.unregisterActivityLifecycleCallbacks(this.b);
        }
        try {
            for (d dVar : this.f22614a.values()) {
                if (dVar != null) {
                    dVar.f();
                }
            }
            d.Companion.a().removeCallbacksAndMessages(null);
        } catch (Throwable th) {
            TMSLogger.b("TMSForegroundAudioBridge", "onFinalized releaseMediaPlayer error: " + th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/audio/TMSForegroundAudioBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(2108146071);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
