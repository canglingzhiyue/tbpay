package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.chatv2.viewcenter.IViewCenterProvider;
import com.taobao.message.chatv2.viewcenter.IViewCenterService;
import com.taobao.message.chatv2.viewcenter.ViewCenterPreloadCache;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.support.dinamic.DxCustemDataEvent;
import com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class DXMsgDXWrapperWidgetNodeV2 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMSGDXWRAPPER_DATA = 33556442494L;
    public static final long DXMSGDXWRAPPER_JSRUNTIMEDATA = 1150689195281789256L;
    public static final long DXMSGDXWRAPPER_LAYOUTINFO = 2441585390341008180L;
    public static final long DXMSGDXWRAPPER_MSGDXWRAPPER = -7589736022598687312L;
    public static final long DXMSGDXWRAPPER_ONCHANGE = 5288679823228297259L;
    public static final long DXMSGDXWRAPPER_RUNTIMEDATA = -4616099342033412215L;
    public static final long DXMSGDXWRAPPER_TEMPLATEID = -912316463184242157L;
    public static final String EVENT_INNER_FRAME_SIZE_CHANGED = "InnerFrameSizeChanged";
    private ActionDispatcher actionDispatcher;
    private String auraContainerKey;
    private JSONObject jsRuntimeData;
    private JSONObject mData;
    private LayoutInfo mLayoutInfo;
    private JSONObject runtimeData;
    private String templateId;
    private IViewCenterService viewCenterService;

    static {
        kge.a(1240062942);
    }

    public static /* synthetic */ Object ipc$super(DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$100(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eaec777", new Object[]{dXWidgetNode});
        } else {
            refresh(dXWidgetNode);
        }
    }

    /* loaded from: classes9.dex */
    public static class Builder implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2078143669);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMsgDXWrapperWidgetNodeV2();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXMsgDXWrapperWidgetNodeV2();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXMsgDXWrapperWidgetNodeV2)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2 = (DXMsgDXWrapperWidgetNodeV2) dXWidgetNode;
            this.mData = dXMsgDXWrapperWidgetNodeV2.mData;
            this.mLayoutInfo = dXMsgDXWrapperWidgetNodeV2.mLayoutInfo;
            this.jsRuntimeData = dXMsgDXWrapperWidgetNodeV2.jsRuntimeData;
            this.runtimeData = dXMsgDXWrapperWidgetNodeV2.runtimeData;
            this.templateId = dXMsgDXWrapperWidgetNodeV2.templateId;
        }
    }

    private boolean optRecycler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc55bb9d", new Object[]{this})).booleanValue();
        }
        if ("1".equals(SimpleFrameworkModule.optDXMsgDXWrapper)) {
            return true;
        }
        return SimpleFrameworkModule.OPT_DX_MSG_WRAPPER_ONLY_AI.equals(SimpleFrameworkModule.optDXMsgDXWrapper) && isAI(this.mData);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        try {
            LongClickListenFrameLayout longClickListenFrameLayout = new LongClickListenFrameLayout(context);
            longClickListenFrameLayout.setSelector(0);
            if (!optRecycler()) {
                WidgetInterface widgetInstance = getWidgetInstance(true);
                if (widgetInstance != null) {
                    longClickListenFrameLayout.addView(widgetInstance.getView(), new FrameLayout.LayoutParams(-2, -2));
                    longClickListenFrameLayout.setTag(R.id.dx_wrapper_widget_instance_ref, widgetInstance);
                } else {
                    TLog.loge("DXWrapper", "onCreateView|widgetInstace is null" + this.mLayoutInfo);
                }
            }
            return longClickListenFrameLayout;
        } catch (Throwable th) {
            if (ApplicationUtil.isDebug()) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        WidgetInterface widgetInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        try {
            super.onRenderView(context, view);
            if (view == null) {
                return;
            }
            LongClickListenFrameLayout longClickListenFrameLayout = (LongClickListenFrameLayout) view;
            if (optRecycler()) {
                if (longClickListenFrameLayout.getChildCount() > 0) {
                    longClickListenFrameLayout.removeAllViews();
                }
                widgetInterface = getWidgetInstance(false);
                if (widgetInterface != null) {
                    ViewGroup viewGroup = (ViewGroup) widgetInterface.getView().getParent();
                    if (viewGroup != null) {
                        viewGroup.removeViewAt(viewGroup.indexOfChild(widgetInterface.getView()));
                    }
                    longClickListenFrameLayout.addView(widgetInterface.getView(), new FrameLayout.LayoutParams(-2, -2));
                    longClickListenFrameLayout.setTag(R.id.dx_wrapper_widget_instance_ref, widgetInterface);
                }
            } else {
                widgetInterface = (WidgetInterface) longClickListenFrameLayout.getTag(R.id.dx_wrapper_widget_instance_ref);
                int childCount = longClickListenFrameLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    longClickListenFrameLayout.getChildAt(i).setVisibility(8);
                }
            }
            if (widgetInterface == null) {
                TLog.loge("DXWrapper", "onRenderView|widgetInstace is null" + this.mLayoutInfo);
                if (!ApplicationUtil.isDebug() || this.mLayoutInfo == null) {
                    return;
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread currentThread = Thread.currentThread();
                defaultUncaughtExceptionHandler.uncaughtException(currentThread, new IllegalStateException("获取不到widgetInterface，刷新失败" + this.mLayoutInfo));
                return;
            }
            renderWidgetInstance(widgetInterface);
        } catch (Throwable th) {
            if (ApplicationUtil.isDebug()) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == 33556442494L) {
            this.mData = jSONObject;
        } else if (j == DXMSGDXWRAPPER_LAYOUTINFO && jSONObject != null) {
            this.mLayoutInfo = (LayoutInfo) jSONObject.toJavaObject(LayoutInfo.class);
        } else if (j == DXMSGDXWRAPPER_JSRUNTIMEDATA) {
            this.jsRuntimeData = jSONObject;
        } else if (j == DXMSGDXWRAPPER_RUNTIMEDATA) {
            this.runtimeData = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMSGDXWRAPPER_TEMPLATEID) {
            this.templateId = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (!(view instanceof LongClickListenFrameLayout)) {
            return;
        }
        LongClickListenFrameLayout longClickListenFrameLayout = (LongClickListenFrameLayout) view;
        if (j == -6544685697300501093L) {
            longClickListenFrameLayout.setOnLongClickListener(null);
            longClickListenFrameLayout.setOnLongPressListener(new LongClickListenFrameLayout.OnLongPressListener() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout.OnLongPressListener
                public void onLongPress(View view2, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2ff438", new Object[]{this, view2, motionEvent});
                    } else {
                        DXMsgDXWrapperWidgetNodeV2.this.postEvent(new DXEvent(-6544685697300501093L));
                    }
                }
            });
        } else if (j != 18903999933159L) {
        } else {
            longClickListenFrameLayout.setOnClickListener(null);
            longClickListenFrameLayout.setOnWrapClickListener(new LongClickListenFrameLayout.OnWrapClickListener() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout.OnWrapClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        DXMsgDXWrapperWidgetNodeV2.this.postEvent(new DXEvent(18903999933159L));
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: Throwable -> 0x00aa, TryCatch #0 {Throwable -> 0x00aa, blocks: (B:6:0x0022, B:9:0x002a, B:19:0x0045, B:21:0x0075, B:23:0x0081, B:25:0x0088, B:24:0x0086, B:20:0x004e, B:27:0x008c, B:29:0x0095, B:31:0x009c, B:30:0x009a), top: B:38:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: Throwable -> 0x00aa, TryCatch #0 {Throwable -> 0x00aa, blocks: (B:6:0x0022, B:9:0x002a, B:19:0x0045, B:21:0x0075, B:23:0x0081, B:25:0x0088, B:24:0x0086, B:20:0x004e, B:27:0x008c, B:29:0x0095, B:31:0x009c, B:30:0x009a), top: B:38:0x0022 }] */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            r1[r2] = r3
            r8 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r9)
            r1[r8] = r2
            java.lang.String r8 = "26cb6a66"
            r0.ipc$dispatch(r8, r1)
            return
        L22:
            com.taobao.message.lab.comfrm.render.WidgetInterface r0 = r7.getWidgetInstance(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = "layoutId"
            if (r0 == 0) goto L8c
            r7.renderWidgetInstance(r0)     // Catch: java.lang.Throwable -> Laa
            int r4 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r8)     // Catch: java.lang.Throwable -> Laa
            int r5 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r9)     // Catch: java.lang.Throwable -> Laa
            r6 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            if (r5 == r6) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r4 != 0) goto L4e
            if (r2 == 0) goto L45
            goto L4e
        L45:
            int r8 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.b(r8)     // Catch: java.lang.Throwable -> Laa
            int r9 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.b(r9)     // Catch: java.lang.Throwable -> Laa
            goto L75
        L4e:
            android.view.View r2 = r0.getView()     // Catch: java.lang.Throwable -> Laa
            r2.measure(r8, r9)     // Catch: java.lang.Throwable -> Laa
            android.view.View r8 = r0.getView()     // Catch: java.lang.Throwable -> Laa
            int r8 = r8.getMeasuredWidth()     // Catch: java.lang.Throwable -> Laa
            android.view.View r9 = r0.getView()     // Catch: java.lang.Throwable -> Laa
            int r9 = r9.getMeasuredHeight()     // Catch: java.lang.Throwable -> Laa
            int r0 = r7.getSuggestedMinimumWidth()     // Catch: java.lang.Throwable -> Laa
            int r8 = java.lang.Math.max(r8, r0)     // Catch: java.lang.Throwable -> Laa
            int r0 = r7.getSuggestedMinimumHeight()     // Catch: java.lang.Throwable -> Laa
            int r9 = java.lang.Math.max(r9, r0)     // Catch: java.lang.Throwable -> Laa
        L75:
            r7.setMeasuredDimension(r8, r9)     // Catch: java.lang.Throwable -> Laa
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Throwable -> Laa
            r8.<init>()     // Catch: java.lang.Throwable -> Laa
            com.taobao.message.chatv2.viewcenter.config.LayoutInfo r9 = r7.mLayoutInfo     // Catch: java.lang.Throwable -> Laa
            if (r9 == 0) goto L86
            com.taobao.message.chatv2.viewcenter.config.LayoutInfo r9 = r7.mLayoutInfo     // Catch: java.lang.Throwable -> Laa
            java.lang.String r9 = r9.layoutId     // Catch: java.lang.Throwable -> Laa
            goto L88
        L86:
            java.lang.String r9 = r7.templateId     // Catch: java.lang.Throwable -> Laa
        L88:
            r8.put(r1, r9)     // Catch: java.lang.Throwable -> Laa
            return
        L8c:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Throwable -> Laa
            r0.<init>()     // Catch: java.lang.Throwable -> Laa
            com.taobao.message.chatv2.viewcenter.config.LayoutInfo r2 = r7.mLayoutInfo     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L9a
            com.taobao.message.chatv2.viewcenter.config.LayoutInfo r2 = r7.mLayoutInfo     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r2.layoutId     // Catch: java.lang.Throwable -> Laa
            goto L9c
        L9a:
            java.lang.String r2 = r7.templateId     // Catch: java.lang.Throwable -> Laa
        L9c:
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = "data"
            com.alibaba.fastjson.JSONObject r2 = r7.mData     // Catch: java.lang.Throwable -> Laa
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Laa
            super.onMeasure(r8, r9)     // Catch: java.lang.Throwable -> Laa
            return
        Laa:
            r8 = move-exception
            boolean r9 = com.taobao.message.uikit.util.ApplicationUtil.isDebug()
            if (r9 == 0) goto Lbc
            java.lang.Thread$UncaughtExceptionHandler r9 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r9.uncaughtException(r0, r8)
        Lbc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.onMeasure(int, int):void");
    }

    private IViewCenterService getViewCenterService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IViewCenterService) ipChange.ipc$dispatch("6b9d86f6", new Object[]{this});
        }
        if (this.viewCenterService == null) {
            if (getDXRuntimeContext().b() instanceof DXWidgetInstance.MPUserContext) {
                DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) getDXRuntimeContext().b();
                if (mPUserContext.getRenderContext() != null) {
                    this.viewCenterService = (IViewCenterService) mPUserContext.getRenderContext().get("viewCenterService");
                    this.auraContainerKey = (String) mPUserContext.getRenderContext().get("auraContainerKey");
                }
            }
            if (getDXRuntimeContext().m() instanceof IViewCenterProvider) {
                this.viewCenterService = ((IViewCenterProvider) getDXRuntimeContext().m()).getViewCenterService();
            }
        }
        return this.viewCenterService;
    }

    private void renderWidgetInstance(WidgetInterface widgetInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f15b997", new Object[]{this, widgetInterface});
            return;
        }
        IViewCenterService viewCenterService = getViewCenterService();
        if (viewCenterService == null) {
            TLog.loge("DXWrapper", "viewCenterService is null");
            return;
        }
        widgetInterface.getView().setVisibility(0);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.mData;
        if (jSONObject2 != null) {
            jSONObject.putAll(jSONObject2);
        }
        JSONObject jSONObject3 = this.runtimeData;
        if (jSONObject3 != null) {
            jSONObject.putAll(jSONObject3);
        }
        JSONObject jSONObject4 = this.jsRuntimeData;
        if (jSONObject4 != null) {
            jSONObject.putAll(jSONObject4);
        }
        if (this.actionDispatcher == null) {
            this.actionDispatcher = createActionDispatcher(this.mData);
        }
        if (getUserId() != null) {
            ((DXWidgetInstance.MPUserContext) getDXRuntimeContext().b()).addDisposable("DXWrapperCache." + getUserId() + getWidgetId(), new WidgetInstanceHolder(widgetInterface));
        }
        String string = jSONObject.getString("VC_UNI_ID");
        if (!StringUtils.isEmpty(string)) {
            if (ViewCenterPreloadCache.getWidgetInterface(this.auraContainerKey, string) != null) {
                ViewCenterPreloadCache.removeWidgetInterface(this.auraContainerKey, string);
                return;
            } else {
                viewCenterService.renderView(widgetInterface, jSONObject, this.actionDispatcher);
                return;
            }
        }
        viewCenterService.renderView(widgetInterface, jSONObject, this.actionDispatcher);
    }

    private WidgetInterface getWidgetInstance(boolean z) {
        WidgetInterface<?> createView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("af426019", new Object[]{this, new Boolean(z)});
        }
        IViewCenterService viewCenterService = getViewCenterService();
        WidgetInterface<?> widgetInterface = null;
        if (viewCenterService != null && getUserId() != null) {
            String str = "DXWrapperCache." + getUserId() + getWidgetId();
            DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) getDXRuntimeContext().b();
            WidgetInstanceHolder widgetInstanceHolder = (WidgetInstanceHolder) mPUserContext.getDisposable(str);
            WidgetInterface<?> widgetInterface2 = widgetInstanceHolder != null ? (WidgetInterface) WidgetInstanceHolder.access$000(widgetInstanceHolder).get() : null;
            JSONObject jSONObject = this.mData;
            if (jSONObject == null || !jSONObject.containsKey("expandStatus") || !this.mData.getBoolean("expandStatus").booleanValue()) {
                widgetInterface = widgetInterface2;
            } else {
                TLog.loge("DXWrapper", "expandStatus true");
                ViewCenterPreloadCache.removeWidgetInterface(this.auraContainerKey, this.mData.getString("VC_UNI_ID"));
            }
            if (widgetInterface == null || (z && widgetInterface.getView() != null && widgetInterface.getView().getParent() != null)) {
                JSONObject jSONObject2 = this.mData;
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("VC_UNI_ID");
                    if (!StringUtils.isEmpty(string)) {
                        widgetInterface = ViewCenterPreloadCache.getWidgetInterface(this.auraContainerKey, string);
                    }
                }
                if (widgetInterface == null) {
                    LayoutInfo layoutInfo = this.mLayoutInfo;
                    if (layoutInfo != null) {
                        createView = viewCenterService.createView(layoutInfo);
                    } else if (!StringUtils.isEmpty(this.templateId) && StringUtils.isDigitsOnly(this.templateId)) {
                        createView = viewCenterService.createView(Integer.parseInt(this.templateId));
                    }
                    widgetInterface = createView;
                }
                if (widgetInterface != null) {
                    mPUserContext.addDisposable(str, new WidgetInstanceHolder(widgetInterface));
                }
            }
        }
        return widgetInterface;
    }

    private static void refresh(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1af98d", new Object[]{dXWidgetNode});
        } else {
            dXWidgetNode.setNeedLayout(new DXWidgetRefreshOption.a().a(3).a(true).b(true).a());
        }
    }

    public ActionDispatcher getActionDispatcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionDispatcher) ipChange.ipc$dispatch("2390c0d0", new Object[]{this}) : this.actionDispatcher;
    }

    private String getWidgetId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eec0a24", new Object[]{this});
        }
        LayoutInfo layoutInfo = this.mLayoutInfo;
        if (layoutInfo != null) {
            return layoutInfo.layoutId;
        }
        return (StringUtils.isEmpty(this.templateId) || !StringUtils.isDigitsOnly(this.templateId)) ? "" : String.valueOf(this.templateId);
    }

    /* loaded from: classes9.dex */
    public static class WidgetInstanceHolder implements Disposable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<WidgetInterface> ref;

        static {
            kge.a(-1370407125);
            kge.a(1930554497);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Disposable
        public void dispose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("226c8326", new Object[]{this});
            }
        }

        public static /* synthetic */ WeakReference access$000(WidgetInstanceHolder widgetInstanceHolder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("6e77d869", new Object[]{widgetInstanceHolder}) : widgetInstanceHolder.ref;
        }

        public WidgetInstanceHolder(WidgetInterface widgetInterface) {
            this.ref = new WeakReference<>(widgetInterface);
        }
    }

    /* loaded from: classes9.dex */
    public static class MyActionDispatcher implements ActionDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<DXMsgDXWrapperWidgetNodeV2> wrapperWidgetNodeV2WeakReference;

        static {
            kge.a(1632291311);
            kge.a(341861051);
        }

        public MyActionDispatcher(DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2) {
            this.wrapperWidgetNodeV2WeakReference = new WeakReference<>(dXMsgDXWrapperWidgetNodeV2);
        }

        @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(Action action) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                return;
            }
            DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
            if (action.getData() != null) {
                dxCustemDataEvent.getContext().putAll((Map) action.getData());
            }
            dxCustemDataEvent.setName(action.getName());
            DXMsgDXWrapperWidgetNodeV2 dXMsgDXWrapperWidgetNodeV2 = this.wrapperWidgetNodeV2WeakReference.get();
            if (dXMsgDXWrapperWidgetNodeV2 == null) {
                return;
            }
            if (DXMsgDXWrapperWidgetNodeV2.EVENT_INNER_FRAME_SIZE_CHANGED.equals(action.getName())) {
                if (dxCustemDataEvent.getContext().containsKey("isAI")) {
                    z = ((Boolean) dxCustemDataEvent.getContext().get("isAI")).booleanValue();
                }
                if (z && SimpleFrameworkModule.noActionPostEvent) {
                    DXMsgDXWrapperWidgetNodeV2.access$100(dXMsgDXWrapperWidgetNodeV2);
                    return;
                }
                dXMsgDXWrapperWidgetNodeV2.requestLayout(true);
                dXMsgDXWrapperWidgetNodeV2.postEvent(dxCustemDataEvent);
                return;
            }
            dXMsgDXWrapperWidgetNodeV2.postEvent(dxCustemDataEvent);
        }
    }

    /* loaded from: classes9.dex */
    public class OldActionDispatcher implements ActionDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(759667678);
            kge.a(341861051);
        }

        private OldActionDispatcher() {
        }

        @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
        public void dispatch(Action action) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                return;
            }
            DxCustemDataEvent dxCustemDataEvent = new DxCustemDataEvent(5288679823228297259L);
            if (action.getData() != null) {
                dxCustemDataEvent.getContext().putAll((Map) action.getData());
            }
            dxCustemDataEvent.setName(action.getName());
            if (dxCustemDataEvent.getContext().containsKey("isAI")) {
                z = ((Boolean) dxCustemDataEvent.getContext().get("isAI")).booleanValue();
            }
            if (DXMsgDXWrapperWidgetNodeV2.EVENT_INNER_FRAME_SIZE_CHANGED.equals(action.getName())) {
                if (z && SimpleFrameworkModule.noActionPostEvent) {
                    DXMsgDXWrapperWidgetNodeV2.access$100(DXMsgDXWrapperWidgetNodeV2.this);
                    return;
                }
                DXMsgDXWrapperWidgetNodeV2.this.requestLayout(true);
                DXMsgDXWrapperWidgetNodeV2.this.postEvent(dxCustemDataEvent);
                return;
            }
            DXMsgDXWrapperWidgetNodeV2.this.postEvent(dxCustemDataEvent);
        }
    }

    private ActionDispatcher createActionDispatcher(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionDispatcher) ipChange.ipc$dispatch("8faf6626", new Object[]{this, jSONObject});
        }
        if (isAI(jSONObject) && SimpleFrameworkModule.useNewActionDispatcher) {
            return new MyActionDispatcher(this);
        }
        return new OldActionDispatcher();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isAI(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "bc0bebbb"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1c:
            if (r5 == 0) goto L39
            java.lang.String r0 = "bizType"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L2b
            java.lang.String r5 = r5.getString(r0)
            goto L3b
        L2b:
            java.lang.String r1 = "props"
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r1)
            if (r5 == 0) goto L39
            java.lang.String r5 = r5.getString(r0)
            goto L3b
        L39:
            java.lang.String r5 = ""
        L3b:
            java.lang.String r0 = "10022"
            boolean r5 = android.text.StringUtils.equals(r5, r0)
            if (r5 == 0) goto L44
            return r2
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.mdc.dinamicx.widget.DXMsgDXWrapperWidgetNodeV2.isAI(com.alibaba.fastjson.JSONObject):boolean");
    }
}
