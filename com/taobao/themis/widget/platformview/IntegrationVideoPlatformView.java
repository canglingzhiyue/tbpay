package com.taobao.themis.widget.platformview;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.weex.common.Constants;
import io.unicorn.plugin.platform.WeexPlatformView;
import io.unicorn.plugin.platform.e;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ept;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016Jt\u0010\u0011\u001a\u00020\f2&\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00152&\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00152\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u001c\u0010\u001f\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0007J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020\fH\u0014J\u001c\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0002J\u0014\u0010*\u001a\u0004\u0018\u00010\u001e2\b\u0010+\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010,\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010-\u001a\u00020\fH\u0007J\b\u0010.\u001a\u00020\fH\u0007J\u0012\u0010/\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0007J\u0012\u00100\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0007J\u001a\u00101\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u00102\u001a\u00020\fH\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/taobao/themis/widget/platformview/IntegrationVideoPlatformView;", "Lio/unicorn/plugin/platform/WeexPlatformView;", "Lcom/taobao/themis/widget/platformview/JSEventDelegate;", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;I)V", "mEmbedViewImpl", "Lcom/taobao/themis/widget/platformview/IEmbedPlatformView;", com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, Constants.Event.SLOT_LIFECYCLE.ATTACH, "", "holder", "Lcom/taobao/android/weex_framework/platform/SimpleComponentHolder;", BaseExecutor.EXECUTOR_SUFFIX, "Lio/unicorn/plugin/platform/MethodInvokeExecutor;", ept.SUB_BIND_VIEW, "styles", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "attrs", "events", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "createEmbedImpl", "doSendEvent", "eventName", "data", "Lcom/alibaba/fastjson/JSONObject;", "fireEventByInstance", "getView", "Landroid/view/View;", "mute", "params", "onActivityPause", "onActivityResume", "onDispose", "onReceivedMessage", "action", "param", "parseJSONString", "string", "parseReceiveRenderParam", "pause", "play", "playbackRate", "seek", "sendEvent", "stop", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class IntegrationVideoPlatformView extends WeexPlatformView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mEmbedViewImpl;
    private int nodeId;

    static {
        kge.a(-1626563423);
        kge.a(-1543257580);
    }

    public static /* synthetic */ Object ipc$super(IntegrationVideoPlatformView integrationVideoPlatformView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -658258689:
                super.bindData((HashMap) objArr[0], (HashMap) objArr[1], (HashSet) objArr[2]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1056639943:
                super.onDispose();
                return null;
            case 1239058914:
                super.attach((com.taobao.android.weex_framework.platform.c) objArr[0], (e) objArr[1]);
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrationVideoPlatformView(Context context, int i) {
        super(context, i);
        q.d(context, "context");
    }

    public static final /* synthetic */ void access$fireEvent(IntegrationVideoPlatformView integrationVideoPlatformView, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd93055f", new Object[]{integrationVideoPlatformView, str, obj});
        } else {
            integrationVideoPlatformView.fireEvent(str, obj);
        }
    }

    private final a createEmbedImpl() {
        try {
            if (q.a(getMUSInstance().getTag("tmsWidget"), (Object) true)) {
                Context context = getContext();
                q.b(context, "context");
                return new c(context, getViewId(), new d(getContext(), this), "video");
            }
            Constructor<?> constructor = Class.forName("com.alibaba.triver.cannal_engine.platformview.view.TRWidgetEmbedPlatformViewV3").getConstructor(Context.class, Integer.TYPE, String.class);
            q.b(constructor, "Class.forName(\"com.aliba…java, String::class.java)");
            Object newInstance = constructor.newInstance(getContext(), Integer.valueOf(getViewId()), "video");
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.widget.platformview.IEmbedPlatformView");
            }
            return (a) newInstance;
        } catch (Throwable th) {
            TMSLogger.b("IntegrationVideoPlatformView", "", th);
            return null;
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void attach(com.taobao.android.weex_framework.platform.c holder, e executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49da89e2", new Object[]{this, holder, executor});
            return;
        }
        q.d(holder, "holder");
        q.d(executor, "executor");
        super.attach(holder, executor);
        this.mEmbedViewImpl = createEmbedImpl();
        a aVar = this.mEmbedViewImpl;
        if (aVar != null) {
            aVar.setJSEventDelegate(this);
        }
        a aVar2 = this.mEmbedViewImpl;
        if (aVar2 == null) {
            return;
        }
        MUSDKInstance musInstance = getMUSInstance();
        q.b(musInstance, "musInstance");
        aVar2.onAttach(musInstance);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void bindData(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c3c4ff", new Object[]{this, hashMap, hashMap2, hashSet});
            return;
        }
        super.bindData(hashMap, hashMap2, hashSet);
        if (hashMap2 == null) {
            return;
        }
        try {
            String str = hashMap2.get("uni_node_id");
            if (str != null) {
                this.nodeId = Integer.parseInt(str);
            }
        } catch (Throwable th) {
            TMSLogger.a(c.TAG, th);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(hashMap2);
        if (q.a(getMUSInstance().getTag("widgetInitMuted"), (Object) true)) {
            jSONObject.put((JSONObject) MusLiveVideo.ATTR_MUTE, "true");
        }
        parseReceiveRenderParam(jSONObject);
        if (q.a(getMUSInstance().getTag("widgetInitMuted"), (Object) true)) {
            jSONObject.put((JSONObject) MusLiveVideo.ATTR_MUTE, (String) true);
        }
        a aVar = this.mEmbedViewImpl;
        if (aVar == null) {
            return;
        }
        aVar.onBindData(jSONObject);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        a aVar = this.mEmbedViewImpl;
        if (aVar == null) {
            return null;
        }
        return aVar.getView();
    }

    private final void parseReceiveRenderParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d94c5e2", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (!jSONObject.containsKey("showThinProgressBar")) {
                jSONObject.put((JSONObject) "show-thin-progress-bar", "false");
            }
            if (jSONObject.containsKey("objectFit")) {
                jSONObject.put((JSONObject) com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_object_fit, (String) jSONObject.get("objectFit"));
            }
            if (jSONObject.containsKey("initialTime")) {
                jSONObject.put((JSONObject) "initial-time", (String) jSONObject.get("initialTime"));
            }
            if (jSONObject.containsKey("enableProgressGesture")) {
                jSONObject.put((JSONObject) "enable-progress-gesture", (String) jSONObject.get("enableProgressGesture"));
            }
            if (jSONObject.containsKey(MusLiveVideo.ATTR_SHOW_CENTER_PLAY_BTN)) {
                jSONObject.put((JSONObject) "show-center-play-btn", (String) jSONObject.get(MusLiveVideo.ATTR_SHOW_CENTER_PLAY_BTN));
            }
            if (jSONObject.containsKey("pageGesture")) {
                jSONObject.put((JSONObject) "page-gesture", (String) jSONObject.get("pageGesture"));
            }
            if (jSONObject.containsKey("mobilenetHintType")) {
                jSONObject.put((JSONObject) "mobilenet-hint-type", (String) jSONObject.get("mobilenetHintType"));
            }
            if (jSONObject.containsKey(MusLiveVideo.ATTR_SHOW_FULLSCREEN_BTN)) {
                jSONObject.put((JSONObject) "show-fullscreen-btn", (String) jSONObject.get(MusLiveVideo.ATTR_SHOW_FULLSCREEN_BTN));
            }
            if (jSONObject.containsKey(MusLiveVideo.ATTR_SHOW_PLAY_BTN)) {
                jSONObject.put((JSONObject) "show-play-btn", (String) jSONObject.get(MusLiveVideo.ATTR_SHOW_PLAY_BTN));
            }
            if (!jSONObject.containsKey("fixProgressUnit")) {
                return;
            }
            jSONObject.put((JSONObject) "fix-progress-unit", (String) jSONObject.get("fixProgressUnit"));
        }
    }

    @JSMethod
    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            onReceivedMessage("play", new JSONObject());
        }
    }

    @JSMethod
    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            onReceivedMessage("pause", new JSONObject());
        }
    }

    @JSMethod
    public final void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            onReceivedMessage("stop", new JSONObject());
        }
    }

    @JSMethod
    public final void seek(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e25f09", new Object[]{this, str});
        } else {
            onReceivedMessage("seek", parseJSONString(str));
        }
    }

    @JSMethod
    public final void mute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bd03ea", new Object[]{this, str});
            return;
        }
        JSONObject parseJSONString = parseJSONString(str);
        if (q.a(getMUSInstance().getTag("widgetInitMuted"), (Object) true) && n.ag()) {
            if (q.a((Object) (parseJSONString != null ? parseJSONString.getBoolean("ison") : null), (Object) false)) {
                return;
            }
        }
        onReceivedMessage("mute", parseJSONString);
    }

    @JSMethod
    public final void playbackRate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5a55ec", new Object[]{this, str});
        } else {
            onReceivedMessage("playbackRate", parseJSONString(str));
        }
    }

    private final void onReceivedMessage(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a306b98", new Object[]{this, str, jSONObject});
            return;
        }
        a aVar = this.mEmbedViewImpl;
        if (aVar == null) {
            return;
        }
        aVar.onReceivedMessage(str, jSONObject);
    }

    private final JSONObject parseJSONString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c6285abd", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Result.a aVar = Result.Companion;
            jSONObject = JSON.parseObject(str);
            Result.m2371constructorimpl(t.INSTANCE);
            return jSONObject;
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
            return jSONObject;
        }
    }

    private final void doSendEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a65ef8", new Object[]{this, str, jSONObject});
        } else if (q.a((Object) "cameraFrame", (Object) str)) {
            fireEventByInstance(str, jSONObject);
        } else {
            com.taobao.themis.kernel.utils.a.a(new IntegrationVideoPlatformView$doSendEvent$1(this, str, jSONObject));
        }
    }

    private final void fireEventByInstance(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5239d4f", new Object[]{this, str, jSONObject});
            return;
        }
        MUSDKInstance mUSInstance = getMUSInstance();
        if (mUSInstance == null) {
            return;
        }
        mUSInstance.fireEventOnNode(this.nodeId, str, jSONObject, true);
    }

    @Override // com.taobao.themis.widget.platformview.b
    public void sendEvent(String eventName, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, eventName, jSONObject});
            return;
        }
        q.d(eventName, "eventName");
        String str = eventName;
        if (StringUtils.equals("onChangeState", str)) {
            Integer valueOf = jSONObject != null ? Integer.valueOf(jSONObject.getIntValue("state")) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                doSendEvent("stop", null);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                doSendEvent("play", null);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                doSendEvent("pause", null);
            } else if (valueOf != null && valueOf.intValue() == 3) {
                doSendEvent("loading", null);
            } else if (valueOf != null && valueOf.intValue() == 4) {
                doSendEvent("ended", null);
            } else if (valueOf == null || valueOf.intValue() != 5) {
            } else {
                doSendEvent("renderstart", null);
            }
        } else if (StringUtils.equals("onTimeUpdate", str)) {
            doSendEvent("timeupdate", jSONObject);
        } else {
            doSendEvent(eventName, jSONObject);
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            super.onActivityPause();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            super.onActivityResume();
        }
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        super.onDispose();
        a aVar = this.mEmbedViewImpl;
        if (aVar == null) {
            return;
        }
        aVar.destroy();
    }
}
