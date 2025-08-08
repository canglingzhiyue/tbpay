package com.taobao.message.lab.comfrm.support.dinamic;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.cf;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.expression.event.DXSwitchEvent;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.expression.event.tab.TabEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.model.DXJSONObjectForVM;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnExposeEvent;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnStayEvent;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.render.RenderError;
import com.taobao.message.lab.comfrm.render.RenderResult;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.Monitor;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier;
import com.taobao.message.lab.comfrm.util.KeyboardStateHelper;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.message.uikit.util.ViewTraversalHelper;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPRecyclerCompanionWidgetNode;
import com.taobao.unit.center.mdc.dinamicx.widget.DXPageLifecyclerWidgetNode;
import com.uc.webview.export.media.MessageID;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.fvb;
import tb.fve;
import tb.fxa;
import tb.gbg;
import tb.kge;

/* loaded from: classes7.dex */
public class DXWidgetInstance extends WidgetInstance implements UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CAHCE_KEY = "auraPageBindingDefaultHeight";
    private static final long DXMPRECYCLERCOMPANION_ONSHIMMERANIMATION = -3156252362327331484L;
    private static final String TAG = "DXWidgetInstance";
    public static boolean isLoadMoreOpenOpt;
    public static final Map<Object, DXEngineRefInfo> sCacheDXEngine;
    private boolean convertJSON;
    public boolean demoteDiffRefreshOpt;
    private EventDispatcher dispatcher;
    private DinamicXEngine dxEngine;
    private DXRootView dxRootView;
    private DXTemplateItem dxTemplateItem;
    private FrameLayout frameLayout;
    private String identifier;
    private Map<String, Object> lastRenderData;
    private RenderResult mRenderResult;
    private MPUserContext mpUserContext;
    private Serializable pauseBindDataObject;
    private boolean pauseBindDataPause;
    private EventDispatcher pauseBindEventDispatch;
    private JSONArray recyclerHoldLastBottomArray;
    private RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension;
    private RenderTemplate renderTemplate;
    private JSONObject uiData = new JSONObject();
    private String usePartRefreshConfig;

    /* loaded from: classes7.dex */
    public static class DXEngineRefInfo {
        public Map<DXWidgetInstance, MPUserContext> cacheInstanceMap;
        public DinamicXEngine dinamicXEngine;

        static {
            kge.a(-1685249626);
        }
    }

    /* loaded from: classes7.dex */
    public interface DXPartRefreshHanlder {
        boolean partRefresh(DinamicXEngine dinamicXEngine, DXRootView dXRootView, DXWidgetNode dXWidgetNode, Map<String, Object> map, Map<String, Object> map2, Diff diff);
    }

    /* loaded from: classes7.dex */
    public static class EmptyTapHandler extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(11725263);
        }

        @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class PartRefresh {
        public Map<String, Object> refreshConfig;
        public String refreshType;
        public String widgetId;

        static {
            kge.a(1331402595);
        }
    }

    public static /* synthetic */ Object ipc$super(DXWidgetInstance dXWidgetInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1283962764) {
            super.postEvent((Event) objArr[0]);
            return null;
        } else if (hashCode != 577536806) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.dispose();
            return null;
        }
    }

    public static /* synthetic */ Map access$000(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("78df067c", new Object[]{dXWidgetInstance}) : dXWidgetInstance.lastRenderData;
    }

    public static /* synthetic */ EventDispatcher access$100(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventDispatcher) ipChange.ipc$dispatch("4f0ef83a", new Object[]{dXWidgetInstance}) : dXWidgetInstance.dispatcher;
    }

    public static /* synthetic */ JSONObject access$200(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fea49a29", new Object[]{dXWidgetInstance}) : dXWidgetInstance.uiData;
    }

    public static /* synthetic */ JSONObject access$202(DXWidgetInstance dXWidgetInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91cecd65", new Object[]{dXWidgetInstance, jSONObject});
        }
        dXWidgetInstance.uiData = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ DXRootView access$300(DXWidgetInstance dXWidgetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("b06f404d", new Object[]{dXWidgetInstance}) : dXWidgetInstance.dxRootView;
    }

    public static /* synthetic */ void access$400(DXWidgetInstance dXWidgetInstance, RecyclerView recyclerView, int i, String str, String str2, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585f1b3", new Object[]{dXWidgetInstance, recyclerView, new Integer(i), str, str2, new Integer(i2), animatorListenerAdapter});
        } else {
            dXWidgetInstance.shimmerItemByPosition(recyclerView, i, str, str2, i2, animatorListenerAdapter);
        }
    }

    static {
        kge.a(-509569729);
        kge.a(451726918);
        sCacheDXEngine = new HashMap();
        isLoadMoreOpenOpt = ABGlobal.isFeatureOpened(Globals.getApplication(), "msgLoadMoreOpt");
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(final Context context, RenderTemplate renderTemplate) {
        String str;
        BizTagUtil.BizTag bizTag;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        this.demoteDiffRefreshOpt = false;
        this.convertJSON = "1".equals(ValueUtil.getString(renderTemplate.renderData, "convertJSON", "0"));
        this.usePartRefreshConfig = ValueUtil.getString(renderTemplate.renderData, "usePartRefresh", "0");
        this.recyclerHoldLastBottomArray = (JSONArray) ValueUtil.getValue(renderTemplate.renderData, "recyclerHoldLastBottomArray", JSONArray.class, null);
        JSONArray jSONArray = this.recyclerHoldLastBottomArray;
        if (jSONArray != null && !jSONArray.isEmpty()) {
            this.recyclerHoldLastBottomExtension = new RecyclerHoldLastBottomExtension();
        }
        this.renderTemplate = renderTemplate;
        this.dxTemplateItem = new DXTemplateItem();
        this.dxTemplateItem.f11925a = (String) renderTemplate.renderData.get("name");
        this.dxTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
        this.dxTemplateItem.c = (String) renderTemplate.renderData.get("url");
        final Object reUseKey = getReUseKey(context);
        DXEngineRefInfo dXEngineRefInfo = sCacheDXEngine.get(reUseKey);
        if (dXEngineRefInfo == null) {
            TraceUtil.beginSection("msgTabDxEngine");
            if (getRenderContext() != null) {
                str = ValueUtil.getString(getRenderContext(), MsgDinamicxEngine.KEY_DX_SUB_BIZTYPE);
                i = ValueUtil.getInteger(getRenderContext(), "dxPipelineCacheMaxCount", 0);
                bizTag = (BizTagUtil.BizTag) ValueUtil.getValue(getRenderContext(), "dxBizTag", BizTagUtil.BizTag.class, null);
            } else {
                str = null;
                bizTag = null;
                i = -1;
            }
            dXEngineRefInfo = new DXEngineRefInfo();
            WidgetRenderImpl.RenderConfig renderConfig = getRenderConfig();
            if (renderConfig != null && !StringUtils.isEmpty(renderConfig.dxEngineBizType)) {
                dXEngineRefInfo.dinamicXEngine = MsgDinamicxEngine.createNewEngine(context, str, renderConfig.dxEngineBizType, bizTag, i, renderConfig.ap2dp);
            } else {
                dXEngineRefInfo.dinamicXEngine = MsgDinamicxEngine.createNewEngine(context, str);
            }
            dXEngineRefInfo.dinamicXEngine.a(new fve() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fve
                public void onNotificationListener(final fvb fvbVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                    } else if (fvbVar == null || fvbVar.f28139a == null || fvbVar.f28139a.size() <= 0) {
                    } else {
                        Logger.e(DXWidgetInstance.TAG, "dinamicx DXNotificationResult finishedTemplateItems come back ");
                        UIHandler.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                TraceUtil.beginSection("DXNotificationResultRefresh");
                                for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                                    DXEngineRefInfo dXEngineRefInfo2 = DXWidgetInstance.sCacheDXEngine.get(reUseKey);
                                    if (dXEngineRefInfo2 != null) {
                                        for (DXWidgetInstance dXWidgetInstance : dXEngineRefInfo2.cacheInstanceMap.keySet()) {
                                            if (dXWidgetInstance != null) {
                                                DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
                                                dXTemplateItem2.f11925a = (String) dXWidgetInstance.getRenderTemplate().renderData.get("name");
                                                dXTemplateItem2.b = Long.parseLong((String) dXWidgetInstance.getRenderTemplate().renderData.get("version"));
                                                dXTemplateItem2.c = (String) dXWidgetInstance.getRenderTemplate().renderData.get("url");
                                                if (dXTemplateItem.f11925a.equals(dXTemplateItem2.f11925a)) {
                                                    Logger.e(DXWidgetInstance.TAG, "dinamicx DXNotificationResult rebuildAndBindData for item: " + dXTemplateItem2.f11925a + ", version:" + dXTemplateItem2.b);
                                                    if (DXWidgetInstance.access$000(dXWidgetInstance) != null) {
                                                        dXWidgetInstance.buildInnerDXView(context, dXWidgetInstance.getRenderTemplate(), DXWidgetInstance.access$000(dXWidgetInstance));
                                                        dXWidgetInstance.bindData((Serializable) DXWidgetInstance.access$000(dXWidgetInstance), DXWidgetInstance.access$100(dXWidgetInstance));
                                                    } else {
                                                        Logger.e(DXWidgetInstance.TAG, "lastRenderData is null, template:" + dXTemplateItem2.f11925a);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                TraceUtil.endTrace();
                            }
                        });
                    }
                }
            });
            setupFullPageEngine(dXEngineRefInfo.dinamicXEngine);
            dXEngineRefInfo.cacheInstanceMap = new ConcurrentHashMap();
            sCacheDXEngine.put(reUseKey, dXEngineRefInfo);
            TraceUtil.endTrace();
        }
        if (this.frameLayout == null) {
            boolean equals = StringUtils.equals(ValueUtil.getString(renderTemplate.renderData, "resizeFrame"), "1");
            if (equals && (context instanceof Activity)) {
                this.frameLayout = new ResizeFrameLayout((Activity) context);
            } else {
                this.frameLayout = new FrameLayout(context);
            }
            if (equals) {
                this.frameLayout.setId(R.id.auraRootDX);
            }
        }
        this.dxEngine = dXEngineRefInfo.dinamicXEngine;
        this.mpUserContext = new MPUserContext(getRenderContext());
        this.mpUserContext.setIdentifier(this.identifier);
        this.mpUserContext.setRenderConfig(getRenderConfig());
        dXEngineRefInfo.cacheInstanceMap.put(this, this.mpUserContext);
        return this.frameLayout;
    }

    public static void setupFullPageEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3a16b5", new Object[]{dinamicXEngine});
            return;
        }
        h hVar = new h() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
            public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
                Editable text;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                    return;
                }
                TraceUtil.beginSection(dXEvent.getClass().getName());
                if (!cf.a(dXRuntimeContext)) {
                    return;
                }
                DXWidgetInstance dXWidgetInstance = (DXWidgetInstance) dXRuntimeContext.s().getTag(R.id.messageDX);
                if (DXWidgetInstance.access$100(dXWidgetInstance) != null) {
                    HashMap hashMap = new HashMap();
                    if ((dXEvent instanceof DXTextInputEvent) && (text = ((DXTextInputEvent) dXEvent).getText()) != null) {
                        hashMap.put("text", text.toString());
                    }
                    Event build = new Event.Build((String) objArr[0]).data(hashMap).build();
                    build.getContext().put("args", objArr);
                    DXWidgetInstance.access$100(dXWidgetInstance).dispatch(build);
                }
                TraceUtil.endTrace();
            }
        };
        dinamicXEngine.a(fxa.a("mpTap"), hVar);
        dinamicXEngine.a(fxa.a("mpLTap"), hVar);
        dinamicXEngine.a(fxa.a("mpAppear"), hVar);
        dinamicXEngine.a(fxa.a("mpDisappear"), hVar);
        dinamicXEngine.a(fxa.a("aura"), new h() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
            public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
                JSONObject parseObject;
                Map map;
                Object data;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                    return;
                }
                TraceUtil.beginSection(dXEvent.getClass().getName());
                if (!cf.a(dXRuntimeContext)) {
                    return;
                }
                DXWidgetInstance dXWidgetInstance = (DXWidgetInstance) dXRuntimeContext.s().getTag(R.id.messageDX);
                if (DXWidgetInstance.access$100(dXWidgetInstance) != null) {
                    String str = "unknow";
                    if (objArr[0] instanceof String) {
                        try {
                            parseObject = JSON.parseObject((String) objArr[0]);
                        } catch (Exception e) {
                            Logger.e(DXWidgetInstance.TAG, e);
                        }
                    } else {
                        if (objArr[0] instanceof JSONObject) {
                            parseObject = (JSONObject) objArr[0];
                        }
                        parseObject = null;
                    }
                    String str2 = "data";
                    if (dXEvent instanceof DXRecyclerLayoutOnExposeEvent) {
                        map = new HashMap();
                        DXRecyclerLayoutOnExposeEvent dXRecyclerLayoutOnExposeEvent = (DXRecyclerLayoutOnExposeEvent) dXEvent;
                        map.put("index", Integer.valueOf(dXRecyclerLayoutOnExposeEvent.getIndex()));
                        map.put(str2, dXRecyclerLayoutOnExposeEvent.getData());
                        map.put("duration", Long.valueOf(dXRecyclerLayoutOnExposeEvent.getDuration()));
                    } else {
                        map = null;
                    }
                    if (dXEvent instanceof DxCustemDataEvent) {
                        DxCustemDataEvent dxCustemDataEvent = (DxCustemDataEvent) dXEvent;
                        if (dxCustemDataEvent.getName() != null) {
                            str = dxCustemDataEvent.getName();
                        }
                        map = dxCustemDataEvent.getContext();
                    } else if (dXEvent instanceof TabEvent) {
                        map = new HashMap();
                        TabEvent tabEvent = (TabEvent) dXEvent;
                        int index = tabEvent.getIndex();
                        boolean isFirstSelected = tabEvent.isFirstSelected();
                        map.put("index", Integer.valueOf(index));
                        map.put("isFirstSelected", Boolean.valueOf(isFirstSelected));
                    } else {
                        if (dXEvent instanceof DXSwitchEvent) {
                            map = new HashMap();
                            data = Boolean.valueOf(((DXSwitchEvent) dXEvent).isOn());
                            str2 = "isOn";
                        } else if (dXEvent instanceof DXRecyclerLayoutOnStayEvent) {
                            map = new HashMap();
                            DXRecyclerLayoutOnStayEvent dXRecyclerLayoutOnStayEvent = (DXRecyclerLayoutOnStayEvent) dXEvent;
                            map.put("index", Integer.valueOf(dXRecyclerLayoutOnStayEvent.getIndex()));
                            map.put("duration", Long.valueOf(dXRecyclerLayoutOnStayEvent.getDuration()));
                            data = dXRecyclerLayoutOnStayEvent.getData();
                        }
                        map.put(str2, data);
                    }
                    if (parseObject != null) {
                        String string = ValueUtil.getString(parseObject, "name", str);
                        JSONObject jSONObject = parseObject.getJSONObject("eventData");
                        if (jSONObject != null && !jSONObject.isEmpty()) {
                            if (map == null) {
                                map = jSONObject;
                            } else {
                                map.putAll(jSONObject);
                                if (ApplicationUtil.isDebug()) {
                                    for (String str3 : jSONObject.keySet()) {
                                        if (map.containsKey(str3)) {
                                            throw new IllegalStateException("error|keyConflict|" + str3);
                                        }
                                    }
                                }
                            }
                        }
                        String string2 = ValueUtil.getString(parseObject, StdActions.ACTION_OPT_IMMEDIATE, null);
                        String string3 = ValueUtil.getString(parseObject, "stateKey", null);
                        if (string3 != null && (dXEvent instanceof TabEvent)) {
                            JSONObject jSONObject2 = new JSONObject();
                            TabEvent tabEvent2 = (TabEvent) dXEvent;
                            int index2 = tabEvent2.getIndex();
                            boolean isFirstSelected2 = tabEvent2.isFirstSelected();
                            jSONObject2.put("index", (Object) Integer.valueOf(index2));
                            jSONObject2.put("isFirstSelected", (Object) Boolean.valueOf(isFirstSelected2));
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.putAll(DXWidgetInstance.access$200(dXWidgetInstance));
                            jSONObject3.put(string3, (Object) jSONObject2);
                            DXWidgetInstance.access$202(dXWidgetInstance, jSONObject3);
                        }
                        HashMap hashMap = new HashMap();
                        if (string2 != null) {
                            hashMap.put(StdActions.ACTION_OPT_IMMEDIATE, string2);
                        }
                        WrapperEvent build = new WrapperEvent.Build(string).data(map).context(hashMap).auraEventHandler(parseObject.getJSONArray("eventHandler")).build();
                        ObjectVerifier.addCheckObject(build, string);
                        DXWidgetInstance.access$100(dXWidgetInstance).dispatch(build);
                    }
                }
                TraceUtil.endTrace();
            }
        });
        dinamicXEngine.a(new DXDataProxy());
    }

    /* loaded from: classes7.dex */
    public class ResizeFrameLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Activity activity;
        private boolean isKeybaordOn;
        private final KeyboardStateHelper keyboardStateHelper;

        static {
            kge.a(-31634082);
        }

        public static /* synthetic */ Object ipc$super(ResizeFrameLayout resizeFrameLayout, String str, Object... objArr) {
            if (str.hashCode() == 650865254) {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public ResizeFrameLayout(Activity activity) {
            super(activity);
            this.isKeybaordOn = false;
            this.keyboardStateHelper = new KeyboardStateHelper();
            this.activity = activity;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            boolean isKeyboardShow = this.keyboardStateHelper.isKeyboardShow(this.activity);
            if (ApplicationUtil.isDebug()) {
                if (isKeyboardShow) {
                    Logger.e("ResizeFrameLayout", "FANYETEST|isKeyboardShow");
                } else {
                    Logger.e("ResizeFrameLayout", "FANYETEST|isKeyboardHide");
                }
            }
            if (isKeyboardShow != this.isKeybaordOn) {
                this.isKeybaordOn = isKeyboardShow;
                DXWidgetInstance.this.refreshView();
            }
            super.onMeasure(i, i2);
        }
    }

    private DXTemplateItem fetchTemplate(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f20a9f2", new Object[]{this, dXTemplateItem, dXTemplateItem2});
        }
        DXTemplateItem a2 = this.dxEngine.a(dXTemplateItem);
        if (a2 != null || !ComponentFrmModule.sDXTemplateSnapshot) {
            return a2;
        }
        Logger.e(TAG, "dinamicx buildInnerDXView fetchTemplate again ");
        DXTemplateItem dXTemplateItem3 = new DXTemplateItem();
        dXTemplateItem3.f11925a = dXTemplateItem2.f11925a;
        dXTemplateItem3.b = dXTemplateItem2.b + 100;
        dXTemplateItem3.c = dXTemplateItem2.c;
        DXTemplateItem a3 = this.dxEngine.a(dXTemplateItem3);
        return (a3 == null || !a3.e) ? a2 : a3;
    }

    public boolean buildInnerDXView(Context context, RenderTemplate renderTemplate, Object obj) {
        DXResult<DXRootView> b;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9567bfca", new Object[]{this, context, renderTemplate, obj})).booleanValue();
        }
        if (this.frameLayout != null && this.dxRootView == null) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = (String) renderTemplate.renderData.get("name");
            dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
            dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
            Logger.e(TAG, "dinamicx build for item: " + dXTemplateItem.f11925a + ", version:" + dXTemplateItem.b);
            DXRootView dXRootView = null;
            if (DXAsyncCacheManager.isOpen) {
                dXRootView = DXAsyncCacheManager.dxCache.remove(String.valueOf(obj.hashCode()));
                if (dXRootView != null) {
                    this.dxRootView = dXRootView;
                } else if (obj instanceof JSONObject) {
                    String string = ((JSONObject) obj).getString("VC_UNI_ID");
                    if (!StringUtils.isEmpty(string) && (dXRootView = DXAsyncCacheManager.dxCache.remove(string)) != null) {
                        this.dxRootView = dXRootView;
                    }
                }
            }
            if (this.dxRootView == null) {
                DXTemplateItem fetchTemplate = fetchTemplate(dXTemplateItem, dXTemplateItem);
                checkTemplate(fetchTemplate, dXTemplateItem);
                if (fetchTemplate != null && (b = this.dxEngine.b(context, fetchTemplate)) != null && !b.b()) {
                    this.dxRootView = b.f11780a;
                }
            }
            DXRootView dXRootView2 = this.dxRootView;
            if (dXRootView2 == null) {
                Logger.e(TAG, "dinamicx onCreateContentHolder dinamicXView is null ");
                return false;
            }
            dXRootView2.setTag(R.id.messageDX, this);
            this.frameLayout.removeAllViews();
            if (StringUtils.equals(ValueUtil.getString(renderTemplate.renderData, "heightMode"), "fullScreen") || StringUtils.equals(ValueUtil.getString(renderTemplate.renderData, "heightMode"), "matchParent")) {
                z = true;
            }
            if (renderTemplate.renderData != null && z) {
                this.frameLayout.addView(this.dxRootView, -1, -1);
            } else if (dXRootView != null) {
                this.frameLayout.addView(this.dxRootView, dXRootView.getLayoutParams().width, dXRootView.getLayoutParams().height);
            } else {
                this.frameLayout.addView(this.dxRootView, -1, -2);
            }
        }
        return true;
    }

    public void pauseBindData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27fc3a4", new Object[]{this});
        } else {
            this.pauseBindDataPause = true;
        }
    }

    public void resumeBindData() {
        EventDispatcher eventDispatcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6538cb5b", new Object[]{this});
            return;
        }
        this.pauseBindDataPause = false;
        Serializable serializable = this.pauseBindDataObject;
        if (serializable == null || (eventDispatcher = this.pauseBindEventDispatch) == null) {
            return;
        }
        bindData(serializable, eventDispatcher);
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(Serializable serializable, EventDispatcher eventDispatcher) {
        JSONObject jSONObject;
        long j;
        Integer num;
        boolean z;
        JSONArray jSONArray;
        final JSONObject jSONObject2;
        Integer num2;
        Integer num3;
        boolean z2;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdace18e", new Object[]{this, serializable, eventDispatcher});
        } else if (this.pauseBindDataPause) {
            this.pauseBindDataObject = serializable;
            this.pauseBindEventDispatch = eventDispatcher;
        } else if (serializable == null) {
        } else {
            boolean isDebug = ApplicationUtil.isDebug();
            long j2 = 0;
            if (isDebug) {
                j2 = SystemClock.elapsedRealtime();
            }
            Logger.e(TAG, "dinamicx  bindData for item: " + this.dxTemplateItem.f11925a + ", version:" + this.dxTemplateItem.b);
            if (this.convertJSON) {
                jSONObject = dxDataAdapter((Map) serializable);
            } else {
                jSONObject = (JSONObject) serializable;
            }
            DXAsyncCacheManager.ban(jSONObject);
            this.dispatcher = eventDispatcher;
            TraceUtil.beginSection((String) this.renderTemplate.renderData.get("name"), "buildInnerDXView");
            buildInnerDXView(this.frameLayout.getContext(), this.renderTemplate, jSONObject);
            TraceUtil.endTrace();
            DXRootView dXRootView = this.dxRootView;
            if (dXRootView != null) {
                if ((jSONObject == dXRootView.getData() ? false : !jSONObject.equals(this.dxRootView.getData())) || this.demoteDiffRefreshOpt) {
                    DXResult<DXRootView> renderDXTemplate = renderDXTemplate(this.dxRootView, jSONObject, false);
                    if (renderDXTemplate.b()) {
                        String sVar = renderDXTemplate.a().toString();
                        Logger.e(TAG, "dinamicx render failed: " + sVar);
                        j = j2;
                        this.mRenderResult = new RenderResult(new RenderError("10000", "dx 渲染失败", renderDXTemplate.a().toString()));
                        MonitorUtil.commitFail(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_DX_COMPONENT_RATE, "DX", "DX_FAIL", "renderTemplateFail:" + sVar);
                        z2 = true;
                    } else {
                        j = j2;
                        z2 = false;
                    }
                    z3 = z2;
                } else {
                    if (ApplicationUtil.isDebug()) {
                        Logger.e(TAG, "dinamicX|BindData|needRefresh|false|" + this.renderTemplate.name);
                    }
                    j = j2;
                    z3 = false;
                }
                getView().setVisibility(0);
                z = z3;
                num = null;
            } else {
                j = j2;
                getView().setVisibility(4);
                Logger.e(TAG, "dinamicx render failed: dxRootView null");
                num = null;
                this.mRenderResult = new RenderResult(new RenderError("202", "dxRootView null", null));
                MonitorUtil.commitFail(Monitor.MODULE_COMFRM, Monitor.POINT_LOAD_DX_COMPONENT_RATE, "DX", "DX_FAIL", "dxRootView null");
                z = true;
            }
            if (!z) {
                this.mRenderResult = new RenderResult();
            }
            TraceUtil.beginSection((String) this.renderTemplate.renderData.get("name"), "buildData-2");
            if (jSONObject.containsKey("__DXCMD") && (jSONArray = (JSONArray) jSONObject.get("__DXCMD")) != null) {
                int i = 0;
                while (i < jSONArray.size()) {
                    try {
                        jSONObject2 = jSONArray.getJSONObject(i);
                    } catch (Throwable unused) {
                        Logger.e(TAG, "dinamicx render cmd fail: " + i + "|" + jSONArray.toJSONString());
                    }
                    if ("updateLoadMoreStatus".equals(jSONObject2.getString("name"))) {
                        String string = jSONObject2.getString("widgetNodeId");
                        try {
                            num3 = jSONObject2.getInteger("status");
                        } catch (Exception unused2) {
                            Logger.e(TAG, "status get err");
                            num3 = num;
                        }
                        if (num3 == null) {
                            String string2 = jSONObject2.getString("status");
                            if (DXRecyclerLayout.LOAD_MORE_STOPED.equals(string2)) {
                                num3 = 4;
                            } else if (DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING.equals(string2)) {
                                num3 = 5;
                            }
                        }
                        if (string != null && num3 != null) {
                            DXWidgetNode queryWTByUserId = this.dxRootView.getExpandWidgetNode().queryWTByUserId(string);
                            if (queryWTByUserId instanceof DXRecyclerLayout) {
                                ((DXRecyclerLayout) queryWTByUserId).a(num3.intValue());
                            }
                        }
                        i++;
                        num = null;
                    } else {
                        if ("updatePullLoadMoreStatus".equals(jSONObject2.getString("name"))) {
                            String string3 = jSONObject2.getString("widgetNodeId");
                            try {
                                num2 = jSONObject2.getInteger("status");
                            } catch (Exception unused3) {
                                Logger.e(TAG, "status get err");
                                num2 = num;
                            }
                            if (num2 == null) {
                                String string4 = jSONObject2.getString("status");
                                if (DXRecyclerLayout.LOAD_MORE_STOPED.equals(string4)) {
                                    num2 = 4;
                                } else if (DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING.equals(string4)) {
                                    num2 = 5;
                                }
                            }
                            if (string3 != null && num2 != null) {
                                DXWidgetNode queryWTByUserId2 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(string3);
                                if (queryWTByUserId2 instanceof DXRecyclerLayout) {
                                    try {
                                        ((DXRecyclerLayout) queryWTByUserId2).b(num2.intValue());
                                    } catch (Throwable unused4) {
                                    }
                                }
                            }
                        } else if ("scrollBottom".equals(jSONObject2.getString("name"))) {
                            Logger.e(TAG, "scrollBottom 111");
                            DXWidgetNode queryWTByUserId3 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(jSONObject2.getString("widgetNodeId"));
                            if (queryWTByUserId3 instanceof DXRecyclerLayout) {
                                Logger.e(TAG, "scrollBottom 222");
                                DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWTByUserId3;
                                int itemCount = dXRecyclerLayout.l().getAdapter().getItemCount();
                                dXRecyclerLayout.a(false, itemCount == 0 ? 0 : itemCount - 1);
                            }
                        } else if ("scrollOffset".equals(jSONObject2.getString("name"))) {
                            if (jSONObject2.getBooleanValue("delay")) {
                                this.dxRootView.post(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.-$$Lambda$DXWidgetInstance$TnSKNxLipj2uwO49PqroCXrNACg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DXWidgetInstance.this.lambda$bindData$0$DXWidgetInstance(jSONObject2);
                                    }
                                });
                            } else {
                                handleScrollOffset(jSONObject2);
                            }
                        } else if ("sendFirstPageEvent".equals(jSONObject2.getString("name"))) {
                            DXWidgetNode queryWTByUserId4 = this.dxRootView.getExpandWidgetNode().queryWTByUserId(jSONObject2.getString("widgetNodeId"));
                            if (queryWTByUserId4 != null) {
                                queryWTByUserId4.postEvent(new DxCustemDataEvent(DXMPRecyclerCompanionWidgetNode.DXMPRECYCLERCOMPANION_FIRSTPAGELOADFINISH));
                            }
                        } else if ("shimmerItem".equals(jSONObject2.getString("name"))) {
                            shimmerCell(jSONObject2.getString("widgetNodeId"), jSONObject2.getJSONArray("list"), jSONObject2.getString("shimmerStyle"), StringUtils.equals("1", ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "shimmerPartItemV5", "1")) ? jSONObject2.getString("partShimmerNodeId") : null);
                        }
                        i++;
                        num = null;
                    }
                    Logger.e(TAG, "dinamicx render cmd fail: " + i + "|" + jSONArray.toJSONString());
                    i++;
                    num = null;
                }
            }
            TraceUtil.endTrace();
            TraceUtil.beginSection((String) this.renderTemplate.renderData.get("name"), "tryInit");
            DXRootView dXRootView2 = this.dxRootView;
            if (dXRootView2 != null && this.recyclerHoldLastBottomExtension != null && (dXRootView2.getContext() instanceof Activity)) {
                this.recyclerHoldLastBottomExtension.tryInit((Activity) this.dxRootView.getContext(), this.dxRootView, this.recyclerHoldLastBottomArray);
            }
            this.lastRenderData = jSONObject;
            TraceUtil.endTrace();
            if (!isDebug) {
                return;
            }
            Logger.e(TAG, "dinamicX|BindData|" + this.renderTemplate.name + "|" + (SystemClock.elapsedRealtime() - j));
        }
    }

    public /* synthetic */ void lambda$bindData$0$DXWidgetInstance(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d157f9", new Object[]{this, jSONObject});
        } else {
            handleScrollOffset(jSONObject);
        }
    }

    private void handleScrollOffset(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7979841", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("widgetNodeId");
        int intValue = jSONObject.getInteger(aw.PARAM_SEARCH_KEYWORD_POS).intValue();
        DXWidgetNode queryWTByUserId = this.dxRootView.getExpandWidgetNode().queryWTByUserId(string);
        Logger.e("huu", "recycler = " + string + ", pos = " + intValue + ", dxWidgetNode = " + queryWTByUserId);
        if (!(queryWTByUserId instanceof DXRecyclerLayout)) {
            return;
        }
        if (jSONObject.getBooleanValue("animation")) {
            RecyclerView l = ((DXRecyclerLayout) queryWTByUserId).l();
            if (l == null) {
                return;
            }
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(l.getContext()) { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int getVerticalSnapPreference() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
                    }
                    return -1;
                }
            };
            linearSmoothScroller.setTargetPosition(intValue);
            l.getLayoutManager().startSmoothScroll(linearSmoothScroller);
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWTByUserId;
        dXRecyclerLayout.a(false, intValue);
        RecyclerView l2 = dXRecyclerLayout.l();
        if (l2 == null) {
            return;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) l2.getLayoutManager();
        if (l2.findViewHolderForAdapterPosition(intValue) == null) {
            staggeredGridLayoutManager.scrollToPositionWithOffset(intValue, 0);
            l2.scrollBy(0, -200);
            return;
        }
        staggeredGridLayoutManager.scrollToPositionWithOffset(intValue, 200);
    }

    private void shimmerCell(final String str, JSONArray jSONArray, final String str2, final String str3) {
        final RecyclerView l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3144090", new Object[]{this, str, jSONArray, str2, str3});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            DXWidgetNode queryWTByUserId = this.dxRootView.getExpandWidgetNode().queryWTByUserId(str);
            if (!(queryWTByUserId instanceof DXRecyclerLayout) || (l = ((DXRecyclerLayout) queryWTByUserId).l()) == null) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                final int intValue = jSONArray.getInteger(i).intValue();
                l.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        final AtomicInteger atomicInteger = new AtomicInteger(0);
                        DXWidgetInstance.access$400(DXWidgetInstance.this, l, intValue, str3, str2, Color.parseColor("#27FFC300"), new AnimatorListenerAdapter() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str4, Object... objArr) {
                                if (str4.hashCode() == 1133046404) {
                                    super.onAnimationRepeat((Animator) objArr[0]);
                                    return null;
                                }
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationRepeat(Animator animator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                                    return;
                                }
                                super.onAnimationRepeat(animator);
                                if (atomicInteger.getAndAdd(1) != 0) {
                                    return;
                                }
                                DXWidgetNode expandWidgetNode = DXWidgetInstance.access$300(DXWidgetInstance.this).getExpandWidgetNode();
                                DXWidgetNode queryWTByUserId2 = expandWidgetNode.queryWTByUserId(str + "_companion");
                                if (queryWTByUserId2 == null) {
                                    return;
                                }
                                queryWTByUserId2.postEvent(new DXEvent(DXWidgetInstance.DXMPRECYCLERCOMPANION_ONSHIMMERANIMATION));
                            }
                        });
                    }
                }, 350L);
            }
        }
    }

    private void shimmerItemByPosition(RecyclerView recyclerView, int i, String str, String str2, int i2, AnimatorListenerAdapter animatorListenerAdapter) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        DXWidgetNode dXWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf65543", new Object[]{this, recyclerView, new Integer(i), str, str2, new Integer(i2), animatorListenerAdapter});
        } else if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null || findViewHolderForAdapterPosition.itemView == null) {
        } else {
            View view2 = findViewHolderForAdapterPosition.itemView;
            if (!(findViewHolderForAdapterPosition.itemView instanceof ViewGroup) || (view = new ViewTraversalHelper((ViewGroup) findViewHolderForAdapterPosition.itemView).findDeepestChildOfSameSize()) == null) {
                view = view2;
            }
            if (!StringUtils.isEmpty(str) && (dXWidgetNode = (DXWidgetNode) view.getTag(DXWidgetNode.TAG_WIDGET_NODE)) != null && (queryWidgetNodeByUserId = dXWidgetNode.queryWidgetNodeByUserId(str)) != null && StringUtils.equals(queryWidgetNodeByUserId.getUserId(), str) && (v = queryWidgetNodeByUserId.getDXRuntimeContext().v()) != null) {
                view = v;
            }
            shimmerItem(view, str2, i2, animatorListenerAdapter);
        }
    }

    private void shimmerItem(final View view, String str, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bd1f76", new Object[]{this, view, str, new Integer(i), animatorListenerAdapter});
        } else if ("background".equals(str)) {
            final int color = view.getBackground() instanceof ColorDrawable ? ((ColorDrawable) view.getBackground()).getColor() : 0;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "backgroundColor", i, color);
            ofInt.setDuration(600L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.addListener(animatorListenerAdapter);
            ofInt.start();
            view.postDelayed(new Runnable() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        view.setBackgroundColor(color);
                    }
                }
            }, 650L);
        } else {
            ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[0]);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(i, 0);
            ofInt2.setDuration(750L);
            ofInt2.setEvaluator(new ArgbEvaluator());
            ofInt2.setRepeatCount(1);
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    } else if (Build.VERSION.SDK_INT < 23) {
                    } else {
                        view.setForeground(new ColorDrawable(((Integer) valueAnimator.getAnimatedValue()).intValue()));
                    }
                }
            });
            ofInt2.addListener(animatorListenerAdapter);
            ofInt2.start();
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.render.WidgetInterface
    public void postEvent(Event event) {
        DXRootView dXRootView;
        DXWidgetNode expandWidgetNode;
        DXRootView dXRootView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        super.postEvent(event);
        if ("onAppear".equals(event.getName())) {
            this.dxEngine.b(this.dxRootView);
        } else if ("onDisappear".equals(event.getName())) {
            this.dxEngine.a(this.dxRootView);
        } else if ("onSystemConfigurationsChanged".equals(event.getName())) {
            refreshView();
        } else if ("onScreenChanged".equals(event.getName())) {
            refreshView();
        }
        if ("onReAppear".equals(event.getName()) && (dXRootView2 = this.dxRootView) != null && dXRootView2.getExpandWidgetNode() != null) {
            DXWidgetNode expandWidgetNode2 = this.dxRootView.getExpandWidgetNode();
            if (expandWidgetNode2 == null) {
                return;
            }
            expandWidgetNode2.sendBroadcastEvent(new DXEvent(DXPageLifecyclerWidgetNode.DXPAGELIFECYCLER_ONREAPPEAR));
        } else if (!MessageID.onDestroy.equals(event.getName()) || (dXRootView = this.dxRootView) == null || dXRootView.getExpandWidgetNode() == null || (expandWidgetNode = this.dxRootView.getExpandWidgetNode()) == null) {
        } else {
            expandWidgetNode.sendBroadcastEvent(new DXEvent(DXPageLifecyclerWidgetNode.DXPAGELIFECYCLER_ONDESTROY));
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void onRefresh(Serializable serializable, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87d3b43", new Object[]{this, serializable, eventDispatcher});
            return;
        }
        Map<? extends String, ? extends Object> map = (Map) serializable;
        if (this.dxRootView == null) {
            return;
        }
        if (this.convertJSON) {
            map = dxDataAdapter(map);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(map);
        jSONObject.put("__refreshTime", (Object) Long.valueOf(System.currentTimeMillis()));
        Logger.e(TAG, "dinamicx  refresh for item: " + this.dxTemplateItem.f11925a + ", version:" + this.dxTemplateItem.b);
        if ("1".equals(ValueUtil.getString(this.renderTemplate.renderData, "enableRefresh", "1"))) {
            renderDXTemplate(this.dxRootView, jSONObject, true);
        }
        if (!ApplicationUtil.isDebug()) {
            return;
        }
        Logger.d(TAG, ResponseProtocolType.ID + getId() + " | onRefresh");
    }

    private DXResult<DXRootView> renderDXTemplate(DXRootView dXRootView, JSONObject jSONObject, boolean z) {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("6f877eb1", new Object[]{this, dXRootView, jSONObject, new Boolean(z)});
        }
        DXRenderOptions.a a2 = new DXRenderOptions.a().a(gbg.a()).a((ba) this.mpUserContext);
        if (DisplayUtil.isLargeScreen(dXRootView.getContext())) {
            a2.a(gbg.a(DisplayUtil.getActivityFromContext(dXRootView.getContext())));
        }
        String string = ValueUtil.getString(this.renderTemplate.renderData, "heightMode", null);
        String string2 = ValueUtil.getString(this.renderTemplate.renderData, "widthMode", null);
        boolean equals = "fullScreen".equals(string);
        if (equals || "matchParent".equals(string)) {
            height = dXRootView.getParent() instanceof View ? ((View) dXRootView.getParent()).getHeight() : 0;
            if (height <= 0) {
                int statusBarHeight = "1".equals(ValueUtil.getString(this.renderTemplate.renderData, "immersiveStatusBar", null)) ? 0 : DisplayUtil.getStatusBarHeight(dXRootView.getContext());
                if ((dXRootView.getContext() instanceof Activity) && ((Activity) dXRootView.getContext()).findViewById(16908290) != null) {
                    height = ((Activity) dXRootView.getContext()).findViewById(16908290).getHeight() - statusBarHeight;
                }
                if (height <= 0) {
                    height = DisplayUtil.getScreenHeight() - statusBarHeight;
                }
                if (getRenderConfig() != null) {
                    height -= getRenderConfig().matchParentPaddingTop;
                }
            }
            if (SharedPreferencesUtil.getIntSharedPreference(this.frameLayout.getContext(), DEFAULT_CAHCE_KEY, 0) != height) {
                SharedPreferencesUtil.addIntSharedPreference(DEFAULT_CAHCE_KEY, height);
            }
            a2.b(DXWidgetNode.DXMeasureSpec.a(height, 1073741824));
        } else {
            a2.b(gbg.b());
            height = 0;
        }
        if ("matchParent".equals(string2)) {
            int width = dXRootView.getParent() instanceof View ? ((View) dXRootView.getParent()).getWidth() : 0;
            if (width <= 0 && dXRootView.getParent() != null) {
                ((View) dXRootView.getParent()).measure(0, 0);
                width = ((View) dXRootView.getParent()).getMeasuredWidth();
            }
            a2.a(DXWidgetNode.DXMeasureSpec.a(width, 1073741824));
        }
        if (this.convertJSON) {
            if (equals && height == dXRootView.getHeight() && !"0".equals(this.usePartRefreshConfig)) {
                return refreshWithNode(dXRootView, jSONObject, a2, z);
            }
            return this.dxEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, a2.a());
        }
        return this.dxEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, a2.a());
    }

    private DXResult<DXRootView> refreshWithNode(DXRootView dXRootView, Map<String, Object> map, DXRenderOptions.a aVar, boolean z) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("65384d6", new Object[]{this, dXRootView, map, aVar, new Boolean(z)});
        }
        if (dXRootView.getData() == null || z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(map);
            return this.dxEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, aVar.a());
        }
        JSONObject data = dXRootView.getData();
        if (data instanceof DXJSONObjectForVM) {
            ((DXJSONObjectForVM) data).setData(map);
        } else {
            data.clear();
            data.putAll(map);
        }
        JSONArray jSONArray = (JSONArray) this.renderTemplate.renderData.get("recyclerLayoutRefresh");
        Diff diff = getViewObject().diff;
        String str2 = TAG;
        if (jSONArray != null && diff != null) {
            int i2 = 0;
            while (i2 < jSONArray.size()) {
                PartRefresh partRefresh = (PartRefresh) jSONArray.getObject(i2, PartRefresh.class);
                String str3 = partRefresh.widgetId;
                String str4 = partRefresh.refreshType;
                if (str3 != null) {
                    DXWidgetNode queryWTByUserId = dXRootView.getExpandWidgetNode().queryWTByUserId(str3);
                    if (queryWTByUserId instanceof DXRecyclerLayout) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        DXPartRefreshHanlder dXPartRefreshHanlder = (DXPartRefreshHanlder) ClassPool.instance().getInstance(str4, (Class<Object>) DXPartRefreshHanlder.class, this.identifier, true, this.classNamespace);
                        TraceUtil.beginSection("partRefresh");
                        i = i2;
                        str = str2;
                        boolean partRefresh2 = dXPartRefreshHanlder.partRefresh(this.dxEngine, dXRootView, (DXRecyclerLayout) queryWTByUserId, partRefresh.refreshConfig, map, diff);
                        TraceUtil.endTrace();
                        if (ApplicationUtil.isDebug()) {
                            Logger.e(str, "dinamicX|BindData|" + this.renderTemplate.name + "|partRefresh|" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                        if (!partRefresh2) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.putAll(map);
                            return this.dxEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject2, -1, aVar.a());
                        }
                    } else {
                        i = i2;
                        str = str2;
                        if (queryWTByUserId == null) {
                            String str5 = "局部刷新找不到DXRecyclerLayout: " + str3;
                            if (ApplicationUtil.isDebug()) {
                                Logger.e(str, str5);
                            } else {
                                Logger.e(str, str5);
                            }
                        } else {
                            throw new RuntimeException("局部刷新指定节点不是dxRecyclerLayout: " + str3);
                        }
                    }
                } else {
                    i = i2;
                    str = str2;
                }
                i2 = i + 1;
                str2 = str;
            }
        }
        String str6 = str2;
        if (diff != null && diff.getOriginalDiffSize() == 0 && diff.getRuntimeDiffSize() == 1 && diff.getJsRuntimeDiffSize() == 0) {
            DeltaItem runtimeDiff = diff.getRuntimeDiff("inputViewObjects");
            if (runtimeDiff != null && ((Boolean) runtimeDiff.getDataChange()).booleanValue()) {
                Logger.e(str6, "dinamicX|BindData|" + this.renderTemplate.name + "|onlyTextChanged");
                return new DXResult<>(dXRootView);
            } else if (diff.getRuntimeDiff("scrollBottomOut") != null) {
                Logger.e(str6, "dinamicX|BindData|" + this.renderTemplate.name + "|onlyScrollBottomOut");
                return new DXResult<>(dXRootView);
            }
        }
        if (isLoadMoreOpenOpt && diff != null && diff.getOriginalDiffSize() == 1 && diff.getOriginalDiff(SimpleMessageListData.SOURCE_NAME_MESSAGE) != null) {
            Logger.e(str6, "dinamicX|BindData|" + this.renderTemplate.name + "|messageSource");
            return new DXResult<>(dXRootView);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        TraceUtil.beginSection("refreshTemplateWithNode");
        if (TraceUtil.isEnableTrace() && diff != null) {
            JSONObject json = diff.toJSON();
            if (diff.getOriginalDiffSize() > 0) {
                for (String str7 : json.getJSONObject("originalDiff").keySet()) {
                    TraceUtil.beginSection("originalDiff-", str7);
                    TraceUtil.endTrace();
                }
            }
            if (diff.getRuntimeDiffSize() > 0) {
                for (String str8 : json.getJSONObject("runtimeDiff").keySet()) {
                    TraceUtil.beginSection("runtimeDiff-", str8);
                    TraceUtil.endTrace();
                }
            }
            if (diff.getJsRuntimeDiffSize() > 0) {
                for (String str9 : json.getJSONObject("jsRuntimeDiff").keySet()) {
                    TraceUtil.beginSection("jsRuntimeDiff-", str9);
                    TraceUtil.endTrace();
                }
            }
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        DXWidgetRefreshOption.a aVar2 = new DXWidgetRefreshOption.a();
        aVar2.a(true).a("2".equals(this.usePartRefreshConfig) ? 3 : 0).b(true);
        this.dxEngine.a(expandWidgetNode, 0, aVar2.a());
        if (ApplicationUtil.isDebug()) {
            Logger.e(str6, "dinamicX|BindData|" + this.renderTemplate.name + "|refreshTemplateWithNode|" + (SystemClock.elapsedRealtime() - elapsedRealtime2));
        }
        TraceUtil.endTrace();
        return new DXResult<>(dXRootView);
    }

    public static DXMsgCenterEvent buildMsg(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXMsgCenterEvent) ipChange.ipc$dispatch("9bf3444c", new Object[]{str, jSONObject});
        }
        DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
        dXMsgCenterEvent.setMethod(str);
        dXMsgCenterEvent.setParams(jSONObject);
        dXMsgCenterEvent.setType("General");
        return dXMsgCenterEvent;
    }

    private JSONObject dxDataAdapter(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6e977c8d", new Object[]{this, map});
        }
        if ("alimp_page_goods_select".equals(this.renderTemplate.name)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(map);
            jSONObject.put("UIData", (Object) this.uiData);
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "UIDATA|" + JSON.toJSONString(this.uiData));
            }
            return jSONObject;
        } else if (map instanceof JSONObject) {
            return (JSONObject) map;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(map);
            return jSONObject2;
        }
    }

    private void checkTemplate(DXTemplateItem dXTemplateItem, DXTemplateItem dXTemplateItem2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7eeb3b", new Object[]{this, dXTemplateItem, dXTemplateItem2});
        } else if (dXTemplateItem == null && dXTemplateItem2 != null) {
            download(dXTemplateItem2);
        } else if (dXTemplateItem == null || dXTemplateItem2 == null || dXTemplateItem.b == dXTemplateItem2.b || dXTemplateItem2.b <= dXTemplateItem.b) {
        } else {
            download(dXTemplateItem2);
        }
    }

    private void download(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c6c878", new Object[]{this, dXTemplateItem});
        } else {
            this.dxEngine.a(Collections.singletonList(dXTemplateItem));
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        MPUserContext remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        RecyclerHoldLastBottomExtension recyclerHoldLastBottomExtension = this.recyclerHoldLastBottomExtension;
        if (recyclerHoldLastBottomExtension != null) {
            recyclerHoldLastBottomExtension.destory();
        }
        Object reUseKey = getReUseKey(getView().getContext());
        DXEngineRefInfo dXEngineRefInfo = sCacheDXEngine.get(reUseKey);
        if (dXEngineRefInfo == null) {
            return;
        }
        if (dXEngineRefInfo.cacheInstanceMap.containsKey(this) && (remove = dXEngineRefInfo.cacheInstanceMap.remove(this)) != null) {
            remove.dispose();
        }
        if (!dXEngineRefInfo.cacheInstanceMap.isEmpty()) {
            return;
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(2).module(16).point(2002).build());
        dXEngineRefInfo.dinamicXEngine.a(new EmptyNotificationListener());
        dXEngineRefInfo.dinamicXEngine.a(fxa.a("mpTap"), new EmptyTapHandler());
        dXEngineRefInfo.dinamicXEngine.a(fxa.a("mpLTap"), new EmptyTapHandler());
        dXEngineRefInfo.dinamicXEngine.a(fxa.a("mpAppear"), new EmptyTapHandler());
        dXEngineRefInfo.dinamicXEngine.a(fxa.a("mpDisappear"), new EmptyTapHandler());
        dXEngineRefInfo.dinamicXEngine.o();
        sCacheDXEngine.remove(reUseKey);
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void onDryRun(Context context, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76212876", new Object[]{this, context, serializable});
            return;
        }
        DXEngineRefInfo dXEngineRefInfo = sCacheDXEngine.get(getReUseKey(context));
        if (dXEngineRefInfo == null) {
            return;
        }
        RenderTemplate renderTemplate = getViewObject().info.renderTemplate;
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = (String) renderTemplate.renderData.get("name");
        dXTemplateItem.b = Long.parseLong((String) renderTemplate.renderData.get("version"));
        dXTemplateItem.c = (String) renderTemplate.renderData.get("url");
        if (DXAsyncCacheManager.isOpen) {
            if (isSnapshot()) {
                DXAsyncCacheManager.asyncRender(context, dXEngineRefInfo.dinamicXEngine, dXTemplateItem, serializable);
                return;
            } else {
                dXEngineRefInfo.dinamicXEngine.a(context, (JSONObject) serializable, dXTemplateItem, -1, new DXRenderOptions.a().a());
                return;
            }
        }
        dXEngineRefInfo.dinamicXEngine.a(context, (JSONObject) serializable, dXTemplateItem, -1, new DXRenderOptions.a().a());
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
        } else {
            this.identifier = str;
        }
    }

    /* loaded from: classes7.dex */
    public static class EmptyNotificationListener implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-783668121);
            kge.a(-1579893205);
        }

        @Override // tb.fve
        public void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            }
        }

        private EmptyNotificationListener() {
        }
    }

    /* loaded from: classes7.dex */
    public static class MPUserContext extends ba implements Disposable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String identifier;
        private WidgetRenderImpl.RenderConfig renderConfig;
        private Map<String, Object> renderContext;
        private volatile boolean isDisposed = false;
        private Map<String, Disposable> disposableMap = new HashMap();

        static {
            kge.a(-843663588);
            kge.a(1930554497);
        }

        public MPUserContext(Map<String, Object> map) {
            this.renderContext = null;
            this.renderContext = map;
        }

        public WidgetRenderImpl.RenderConfig getRenderConfig() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WidgetRenderImpl.RenderConfig) ipChange.ipc$dispatch("e26145d5", new Object[]{this}) : this.renderConfig;
        }

        public void setRenderConfig(WidgetRenderImpl.RenderConfig renderConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e835cd5", new Object[]{this, renderConfig});
            } else {
                this.renderConfig = renderConfig;
            }
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Disposable
        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
                return;
            }
            for (Disposable disposable : this.disposableMap.values()) {
                if (disposable != null) {
                    disposable.dispose();
                }
            }
            this.disposableMap.clear();
            this.renderContext = null;
            this.isDisposed = true;
        }

        public void addDisposable(String str, Disposable disposable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1839572e", new Object[]{this, str, disposable});
            } else if (this.isDisposed) {
                disposable.dispose();
            } else {
                this.disposableMap.put(str, disposable);
            }
        }

        public Disposable getDisposable(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Disposable) ipChange.ipc$dispatch("210d2137", new Object[]{this, str}) : this.disposableMap.get(str);
        }

        public boolean isDisposed() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be7a7a", new Object[]{this})).booleanValue() : this.isDisposed;
        }

        public String getIdentifier() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this}) : this.identifier;
        }

        public void setIdentifier(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eb8cafc", new Object[]{this, str});
            } else {
                this.identifier = str;
            }
        }

        public Map<String, Object> getRenderContext() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4f58573f", new Object[]{this}) : this.renderContext;
        }
    }

    public RenderTemplate getRenderTemplate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderTemplate) ipChange.ipc$dispatch("a90ba7a7", new Object[]{this}) : this.renderTemplate;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public RenderResult getRenderResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderResult) ipChange.ipc$dispatch("26051047", new Object[]{this}) : this.mRenderResult;
    }

    private Object getReUseKey(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cc4b20ee", new Object[]{this, obj}) : (getRenderConfig() == null || StringUtils.isEmpty(getRenderConfig().reUseKey)) ? obj : getRenderConfig().reUseKey;
    }
}
