package com.taobao.weex.ui.component;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.trade.event.m;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXAccessibilityRoleAdapter;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.c;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.IWXObject;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.dom.binding.ELUtils;
import com.taobao.weex.dom.transition.WXTransition;
import com.taobao.weex.l;
import com.taobao.weex.layout.ContentBoxMeasurement;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.WXRenderManager;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.action.GraphicActionAnimation;
import com.taobao.weex.ui.action.GraphicActionUpdateStyle;
import com.taobao.weex.ui.action.GraphicPosition;
import com.taobao.weex.ui.action.GraphicSize;
import com.taobao.weex.ui.animation.WXAnimationBean;
import com.taobao.weex.ui.animation.WXAnimationModule;
import com.taobao.weex.ui.component.basic.WXBasicComponent;
import com.taobao.weex.ui.component.list.template.jni.NativeRenderObjectUtils;
import com.taobao.weex.ui.component.pesudo.OnActivePseudoListner;
import com.taobao.weex.ui.component.pesudo.PesudoStatus;
import com.taobao.weex.ui.component.pesudo.TouchActivePseudoListener;
import com.taobao.weex.ui.flat.FlatComponent;
import com.taobao.weex.ui.flat.FlatGUIContext;
import com.taobao.weex.ui.flat.widget.AndroidViewWidget;
import com.taobao.weex.ui.flat.widget.Widget;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import com.taobao.weex.utils.BoxShadowUtil;
import com.taobao.weex.utils.WXDataStructureUtil;
import com.taobao.weex.utils.WXExceptionUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXReflectionUtils;
import com.taobao.weex.utils.WXResourceUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class WXComponent<T extends View> extends WXBasicComponent implements IWXObject, l, OnActivePseudoListner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROP_FIXED_SIZE = "fixedSize";
    public static final String PROP_FS_MATCH_PARENT = "m";
    public static final String PROP_FS_WRAP_CONTENT = "w";
    public static final String ROOT = "_root";
    public static final int STATE_ALL_FINISH = 2;
    public static final int STATE_DOM_FINISH = 0;
    public static final int STATE_UI_FINISH = 1;
    public static final String TYPE = "type";
    public static final int TYPE_COMMON = 0;
    public static final int TYPE_VIRTUAL = 1;
    private ConcurrentLinkedQueue<Pair<String, Map<String, Object>>> animations;
    public ContentBoxMeasurement contentBoxMeasurement;
    private volatile boolean hasRendered;
    public int interactionAbsoluteX;
    public int interactionAbsoluteY;
    public boolean isIgnoreInteraction;
    private boolean isLastLayoutDirectionRTL;
    private boolean isUsing;
    private int mAbsoluteX;
    private int mAbsoluteY;
    private WXAnimationModule.AnimationHolder mAnimationHolder;
    private Set<String> mAppendEvents;
    private BorderDrawable mBackgroundDrawable;
    public int mChildrensWidth;
    private WXComponent<T>.OnClickListenerImp mClickEventListener;
    private Context mContext;
    public int mDeepInComponentTree;
    private int mFixedProp;
    private List<OnFocusChangeListener> mFocusChangeListeners;
    public WXGesture mGesture;
    private Set<String> mGestureType;
    private boolean mHasAddFocusListener;
    private IFComponentHolder mHolder;
    public T mHost;
    private List<OnClickListener> mHostClickListeners;
    private WXSDKInstance mInstance;
    public boolean mIsAddElementToTree;
    private boolean mIsDestroyed;
    private boolean mIsDisabled;
    private String mLastBoxShadowId;
    private boolean mLazy;
    private boolean mNeedLayoutOnAnimation;
    private volatile WXVContainer mParent;
    private PesudoStatus mPesudoStatus;
    private int mPreRealHeight;
    private int mPreRealLeft;
    private int mPreRealRight;
    private int mPreRealTop;
    private int mPreRealWidth;
    private GraphicSize mPseudoResetGraphicSize;
    private Drawable mRippleBackground;
    private int mStickyOffset;
    private WXTransition mTransition;
    private int mType;
    private String mViewTreeKey;
    public boolean useAnimations;
    private boolean waste;

    /* loaded from: classes9.dex */
    public static class MeasureOutput {
        public int height;
        public int width;

        static {
            kge.a(1848684933);
        }
    }

    /* loaded from: classes9.dex */
    public interface OnClickListener {
        void onHostViewClick();
    }

    /* loaded from: classes9.dex */
    public interface OnFocusChangeListener {
        void onFocusChange(boolean z);
    }

    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface RenderState {
    }

    static {
        kge.a(-1076845366);
        kge.a(-294504032);
        kge.a(-864520249);
        kge.a(1238659679);
    }

    public static /* synthetic */ Object ipc$super(WXComponent wXComponent, String str, Object... objArr) {
        if (str.hashCode() == 993594860) {
            super.bindComponent((WXComponent) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void appendEventToDOM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75351058", new Object[]{this, str});
        }
    }

    public String getAttrByKey(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("944a76ae", new Object[]{this, str}) : "default";
    }

    public int getLayoutTopOffsetForSibling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5812efdb", new Object[]{this})).intValue();
        }
        return 0;
    }

    /* renamed from: initComponentHostView */
    public T mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        return null;
    }

    public void layoutDirectionDidChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa2a2e3", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean onActivityBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe14a20", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.weex.l
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
        }
    }

    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        }
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // com.taobao.weex.l
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        }
    }

    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        return false;
    }

    public void onInvokeUnknownMethod(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b876b88d", new Object[]{this, str, jSONArray});
        }
    }

    public void onRenderFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87284f14", new Object[]{this, new Integer(i)});
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public void refreshData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5c8911", new Object[]{this, wXComponent});
        }
    }

    @Deprecated
    public void registerActivityStateListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b261ba", new Object[]{this});
        }
    }

    public void removeVirtualComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afceb85d", new Object[]{this});
        }
    }

    public static /* synthetic */ WXSDKInstance access$100(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("6111ddbb", new Object[]{wXComponent}) : wXComponent.mInstance;
    }

    public static /* synthetic */ List access$200(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1ef3a6e9", new Object[]{wXComponent}) : wXComponent.mFocusChangeListeners;
    }

    public static /* synthetic */ List access$300(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9d54aac8", new Object[]{wXComponent}) : wXComponent.mHostClickListeners;
    }

    public static /* synthetic */ BorderDrawable access$400(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BorderDrawable) ipChange.ipc$dispatch("e158280e", new Object[]{wXComponent}) : wXComponent.mBackgroundDrawable;
    }

    public void setUseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862f1846", new Object[]{this});
        } else {
            this.useAnimations = true;
        }
    }

    @Deprecated
    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, z, basicComponentData);
    }

    @Deprecated
    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, 0, basicComponentData);
    }

    public WXComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(basicComponentData);
        this.mFixedProp = 0;
        this.mAbsoluteY = 0;
        this.mAbsoluteX = 0;
        this.isLastLayoutDirectionRTL = false;
        this.mPreRealWidth = 0;
        this.mPreRealHeight = 0;
        this.mPreRealLeft = 0;
        this.mPreRealRight = 0;
        this.mPreRealTop = 0;
        this.mStickyOffset = 0;
        this.isUsing = false;
        this.mIsDestroyed = false;
        this.mIsDisabled = false;
        this.mType = 0;
        this.mNeedLayoutOnAnimation = false;
        this.mDeepInComponentTree = 0;
        this.mIsAddElementToTree = false;
        this.interactionAbsoluteX = 0;
        this.interactionAbsoluteY = 0;
        this.mChildrensWidth = 0;
        this.mHasAddFocusListener = false;
        this.waste = false;
        this.isIgnoreInteraction = false;
        this.hasRendered = false;
        this.useAnimations = false;
        this.mLazy = false;
        this.mInstance = wXSDKInstance;
        this.mContext = this.mInstance.O();
        this.mParent = wXVContainer;
        this.mType = i;
        if (wXSDKInstance != null) {
            setViewPortWidth(wXSDKInstance.y());
        }
        onCreate();
        c C = getInstance().C();
        if (C != null) {
            C.onCreate(this);
        }
    }

    @Override // com.taobao.weex.ui.component.basic.WXBasicComponent
    public final void bindComponent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b390dec", new Object[]{this, wXComponent});
            return;
        }
        super.bindComponent(wXComponent);
        if (getInstance() != null) {
            setViewPortWidth(getInstance().y());
        }
        this.mParent = wXComponent.getParent();
        this.mType = wXComponent.getType();
    }

    public final void setContentBoxMeasurement(ContentBoxMeasurement contentBoxMeasurement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cf3b3e", new Object[]{this, contentBoxMeasurement});
            return;
        }
        this.contentBoxMeasurement = contentBoxMeasurement;
        this.mInstance.a(getRenderObjectPtr(), contentBoxMeasurement);
        if (WXSDKManager.getInstance().getWXBridgeManager() == null) {
            return;
        }
        WXSDKManager.getInstance().getWXBridgeManager().bindMeasurementToRenderObject(getRenderObjectPtr());
    }

    public void setMarginsSupportRTL(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc69622a", new Object[]{this, marginLayoutParams, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        if (!(marginLayoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        }
        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 51;
    }

    public void updateStyles(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1d5877", new Object[]{this, wXComponent});
        } else if (wXComponent == null) {
        } else {
            updateProperties(wXComponent.getStyles());
            applyBorder(wXComponent);
        }
    }

    public void updateStyles(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a06eb33", new Object[]{this, map});
        } else if (map == null) {
        } else {
            updateProperties(map);
            applyBorder(this);
        }
    }

    public void updateAttrs(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5f8e45", new Object[]{this, wXComponent});
        } else if (wXComponent == null) {
        } else {
            updateProperties(wXComponent.getAttrs());
        }
    }

    public void updateAttrs(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fc6e25", new Object[]{this, map});
        } else if (map == null) {
        } else {
            updateProperties(map);
        }
    }

    private void applyBorder(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c7b466", new Object[]{this, wXComponent});
            return;
        }
        CSSShorthand border = wXComponent.getBorder();
        float f = border.get(CSSShorthand.EDGE.LEFT);
        float f2 = border.get(CSSShorthand.EDGE.TOP);
        float f3 = border.get(CSSShorthand.EDGE.RIGHT);
        float f4 = border.get(CSSShorthand.EDGE.BOTTOM);
        if (this.mHost == null) {
            return;
        }
        setBorderWidth("borderLeftWidth", f);
        setBorderWidth("borderTopWidth", f2);
        setBorderWidth("borderRightWidth", f3);
        setBorderWidth("borderBottomWidth", f4);
    }

    public void setPadding(CSSShorthand cSSShorthand, CSSShorthand cSSShorthand2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15f5d94", new Object[]{this, cSSShorthand, cSSShorthand2});
            return;
        }
        int i = (int) (cSSShorthand.get(CSSShorthand.EDGE.LEFT) + cSSShorthand2.get(CSSShorthand.EDGE.LEFT));
        int i2 = (int) (cSSShorthand.get(CSSShorthand.EDGE.TOP) + cSSShorthand2.get(CSSShorthand.EDGE.TOP));
        int i3 = (int) (cSSShorthand.get(CSSShorthand.EDGE.RIGHT) + cSSShorthand2.get(CSSShorthand.EDGE.RIGHT));
        int i4 = (int) (cSSShorthand.get(CSSShorthand.EDGE.BOTTOM) + cSSShorthand2.get(CSSShorthand.EDGE.BOTTOM));
        if (this instanceof FlatComponent) {
            FlatComponent flatComponent = (FlatComponent) this;
            if (!flatComponent.promoteToView(true)) {
                flatComponent.getOrCreateFlatWidget().setContentBox(i, i2, i3, i4);
                return;
            }
        }
        T t = this.mHost;
        if (t == null) {
            return;
        }
        t.setPadding(i, i2, i3, i4);
    }

    public void applyComponentEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455d53af", new Object[]{this});
        } else {
            applyEvents();
        }
    }

    private void applyEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ff9f2e", new Object[]{this});
        } else if (getEvents() != null && !getEvents().isEmpty()) {
            WXEvent events = getEvents();
            int size = events.size();
            for (int i = 0; i < size && i < events.size(); i++) {
                addEvent(events.get(i));
            }
            setActiveTouchListener();
        }
    }

    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        if (this.mAppendEvents == null) {
            this.mAppendEvents = new HashSet();
        }
        if (TextUtils.isEmpty(str) || this.mAppendEvents.contains(str)) {
            return;
        }
        View mo1594getRealView = mo1594getRealView();
        if (str.equals(Constants.Event.LAYEROVERFLOW)) {
            addLayerOverFlowListener(getRef());
        }
        if (str.equals("click")) {
            if (mo1594getRealView == null) {
                return;
            }
            if (this.mClickEventListener == null) {
                this.mClickEventListener = new OnClickListenerImp();
            }
            addClickListener(this.mClickEventListener);
        } else if (str.equals(Constants.Event.FOCUS) || str.equals(Constants.Event.BLUR)) {
            if (!this.mHasAddFocusListener) {
                this.mHasAddFocusListener = true;
                addFocusChangeListener(new OnFocusChangeListener() { // from class: com.taobao.weex.ui.component.WXComponent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.ui.component.WXComponent.OnFocusChangeListener
                    public void onFocusChange(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("55af8984", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("timeStamp", Long.valueOf(System.currentTimeMillis()));
                        WXComponent.this.fireEvent(z ? Constants.Event.FOCUS : Constants.Event.BLUR, hashMap);
                    }
                });
            }
        } else if (!needGestureDetector(str)) {
            Scrollable parentScroller = getParentScroller();
            if (parentScroller == null) {
                return;
            }
            if (str.equals("appear")) {
                parentScroller.bindAppearEvent(this);
            } else if (str.equals("disappear")) {
                parentScroller.bindDisappearEvent(this);
            }
        } else if (mo1594getRealView == null) {
            return;
        } else {
            if (mo1594getRealView instanceof WXGestureObservable) {
                if (this.mGesture == null) {
                    this.mGesture = new WXGesture(this, this.mContext);
                    this.mGesture.setPreventMoveEvent(WXUtils.getBoolean(getAttrs().get(Constants.Name.PREVENT_MOVE_EVENT), false).booleanValue());
                }
                if (this.mGestureType == null) {
                    this.mGestureType = new HashSet();
                }
                this.mGestureType.add(str);
                ((WXGestureObservable) mo1594getRealView).registerGestureListener(this.mGesture);
            } else {
                WXLogUtils.e(mo1594getRealView.getClass().getSimpleName() + " don't implement WXGestureObservable, so no gesture is supported.");
            }
        }
        this.mAppendEvents.add(str);
    }

    public void bindHolder(IFComponentHolder iFComponentHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9308c53", new Object[]{this, iFComponentHolder});
        } else {
            this.mHolder = iFComponentHolder;
        }
    }

    public WXSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("19215a70", new Object[]{this}) : this.mInstance;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    public final WXComponent findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("45957e46", new Object[]{this, str});
        }
        if (this.mInstance != null && str != null) {
            return WXSDKManager.getInstance().getWXRenderManager().getWXComponent(this.mInstance.N(), str);
        }
        return null;
    }

    public void postAnimation(WXAnimationModule.AnimationHolder animationHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f5748a", new Object[]{this, animationHolder});
        } else {
            this.mAnimationHolder = animationHolder;
        }
    }

    public boolean isFlatUIEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6981935", new Object[]{this})).booleanValue() : this.mParent != null && this.mParent.isFlatUIEnabled();
    }

    /* loaded from: classes9.dex */
    public class OnClickListenerImp implements OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2078965257);
            kge.a(-1699117373);
        }

        private OnClickListenerImp() {
        }

        @Override // com.taobao.weex.ui.component.WXComponent.OnClickListener
        public void onHostViewClick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e23cc03", new Object[]{this});
                return;
            }
            HashMap newHashMapWithExpectedSize = WXDataStructureUtil.newHashMapWithExpectedSize(1);
            HashMap newHashMapWithExpectedSize2 = WXDataStructureUtil.newHashMapWithExpectedSize(4);
            int[] iArr = new int[2];
            WXComponent.this.mHost.getLocationOnScreen(iArr);
            newHashMapWithExpectedSize2.put("x", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), iArr[0], WXComponent.access$100(WXComponent.this).y())));
            newHashMapWithExpectedSize2.put("y", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), iArr[1], WXComponent.access$100(WXComponent.this).y())));
            newHashMapWithExpectedSize2.put("width", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), WXComponent.this.getLayoutWidth(), WXComponent.access$100(WXComponent.this).y())));
            newHashMapWithExpectedSize2.put("height", Float.valueOf(WXViewInnerUtils.getWebPxByWidth(WXComponent.access$100(WXComponent.this), WXComponent.this.getLayoutHeight(), WXComponent.access$100(WXComponent.this).y())));
            newHashMapWithExpectedSize.put("position", newHashMapWithExpectedSize2);
            WXComponent.this.fireEvent("click", newHashMapWithExpectedSize);
        }
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this}) : this.mInstance.N();
    }

    public Rect getComponentSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("387a3b78", new Object[]{this});
        }
        Rect rect = new Rect();
        T t = this.mHost;
        if (t != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            t.getLocationOnScreen(iArr);
            this.mInstance.am().getLocationOnScreen(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = (iArr[1] - this.mStickyOffset) - iArr2[1];
            rect.set(i, i2, ((int) getLayoutWidth()) + i, ((int) getLayoutHeight()) + i2);
        }
        return rect;
    }

    public final void invoke(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be01ca31", new Object[]{this, str, jSONArray});
            return;
        }
        Invoker methodInvoker = this.mHolder.getMethodInvoker(str);
        if (methodInvoker != null) {
            try {
                getInstance().n().invoke(this, methodInvoker, jSONArray);
                return;
            } catch (Exception e) {
                WXLogUtils.e("[WXComponent] updateProperties :class:" + getClass() + "method:" + methodInvoker.toString() + " function " + WXLogUtils.getStackTrace(e));
                return;
            }
        }
        onInvokeUnknownMethod(str, jSONArray);
    }

    public final void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            fireEvent(str, null);
        }
    }

    public final void fireEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else if (WXUtils.getBoolean(getAttrs().get("fireEventSyn"), false).booleanValue()) {
            fireEventWait(str, map);
        } else {
            fireEvent(str, map, null, null);
        }
    }

    public final EventResult fireEventWait(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventResult) ipChange.ipc$dispatch("2e54425e", new Object[]{this, str, map});
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        EventResult eventResult = new EventResult() { // from class: com.taobao.weex.ui.component.WXComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str2, Object... objArr) {
                if (str2.hashCode() == 1878571239) {
                    super.onCallback(objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // com.taobao.weex.bridge.EventResult
            public void onCallback(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6ff8b8e7", new Object[]{this, obj});
                    return;
                }
                super.onCallback(obj);
                countDownLatch.countDown();
            }
        };
        try {
            fireEvent(str, map, null, eventResult);
            countDownLatch.await(50L, TimeUnit.MILLISECONDS);
            return eventResult;
        } catch (Exception e) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("fireEventWait", e);
            }
            return eventResult;
        }
    }

    public final void fireEvent(String str, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d4d035", new Object[]{this, str, map, map2});
        } else {
            fireEvent(str, map, map2, null);
        }
    }

    private final void fireEvent(String str, Map<String, Object> map, Map<String, Object> map2, EventResult eventResult) {
        String componentId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49966678", new Object[]{this, str, map, map2, eventResult});
        } else if (this.mInstance == null) {
        } else {
            List<Object> list = null;
            if (getEvents() != null && getEvents().getEventBindingArgsValues() != null) {
                list = getEvents().getEventBindingArgsValues().get(str);
            }
            List<Object> list2 = list;
            if (map != null && (componentId = getComponentId()) != null) {
                map.put("componentId", componentId);
            }
            this.mInstance.a(getRef(), str, map, map2, list2, eventResult);
        }
    }

    public String getComponentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5df1a77", new Object[]{this});
        }
        WXAttr attrs = getAttrs();
        if (attrs.get(ELUtils.IS_COMPONENT_ROOT) != null && WXUtils.getBoolean(attrs.get(ELUtils.IS_COMPONENT_ROOT), false).booleanValue() && attrs.get(ELUtils.COMPONENT_PROPS) != null && (attrs.get(ELUtils.COMPONENT_PROPS) instanceof JSONObject)) {
            Object obj = attrs.get("@virtualComponentId");
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } else if (getParent() == null) {
            return null;
        } else {
            return getParent().getComponentId();
        }
    }

    public Object findTypeParent(WXComponent wXComponent, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("66f7345e", new Object[]{this, wXComponent, cls});
        }
        if (wXComponent.getClass() == cls) {
            return wXComponent;
        }
        if (wXComponent.getParent() == null) {
            return null;
        }
        findTypeParent(wXComponent.getParent(), cls);
        return null;
    }

    public boolean isLazy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85e0e549", new Object[]{this})).booleanValue();
        }
        if (this.mLazy) {
            return true;
        }
        return this.mParent != null && this.mParent.isLazy();
    }

    public final void addFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        View mo1594getRealView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5220214e", new Object[]{this, onFocusChangeListener});
        } else if (onFocusChangeListener == null || (mo1594getRealView = mo1594getRealView()) == null) {
        } else {
            if (this.mFocusChangeListeners == null) {
                this.mFocusChangeListeners = new ArrayList();
                mo1594getRealView.setFocusable(true);
                mo1594getRealView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.weex.ui.component.WXComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnFocusChangeListener
                    public void onFocusChange(View view, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                            return;
                        }
                        for (OnFocusChangeListener onFocusChangeListener2 : WXComponent.access$200(WXComponent.this)) {
                            if (onFocusChangeListener2 != null) {
                                onFocusChangeListener2.onFocusChange(z);
                            }
                        }
                    }
                });
            }
            this.mFocusChangeListeners.add(onFocusChangeListener);
        }
    }

    public final void addClickListener(OnClickListener onClickListener) {
        View mo1594getRealView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37d6a0e", new Object[]{this, onClickListener});
        } else if (onClickListener == null || (mo1594getRealView = mo1594getRealView()) == null) {
        } else {
            if (this.mHostClickListeners == null) {
                this.mHostClickListeners = new ArrayList();
                mo1594getRealView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.weex.ui.component.WXComponent.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (WXComponent.this.mGesture == null || !WXComponent.this.mGesture.isTouchEventConsumedByAdvancedGesture()) {
                            for (OnClickListener onClickListener2 : WXComponent.access$300(WXComponent.this)) {
                                if (onClickListener2 != null) {
                                    onClickListener2.onHostViewClick();
                                }
                            }
                        }
                    }
                });
            }
            this.mHostClickListeners.add(onClickListener);
        }
    }

    public final void removeClickListener(OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a3c64b", new Object[]{this, onClickListener});
        } else {
            this.mHostClickListeners.remove(onClickListener);
        }
    }

    public void bindData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
        } else if (isLazy()) {
        } else {
            if (wXComponent == null) {
                wXComponent = this;
            }
            bindComponent(wXComponent);
            updateStyles(wXComponent);
            updateAttrs(wXComponent);
            updateExtra(wXComponent.getExtra());
        }
    }

    public void applyLayoutAndEvent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1decc7", new Object[]{this, wXComponent});
        } else if (isLazy()) {
        } else {
            if (wXComponent == null) {
                wXComponent = this;
            }
            bindComponent(wXComponent);
            setSafeLayout(wXComponent);
            setPadding(wXComponent.getPadding(), wXComponent.getBorder());
            applyEvents();
        }
    }

    public void setDemission(GraphicSize graphicSize, GraphicPosition graphicPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92666be8", new Object[]{this, graphicSize, graphicPosition});
            return;
        }
        setLayoutPosition(graphicPosition);
        setLayoutSize(graphicSize);
    }

    public void updateDemission(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2501f3e9", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
            return;
        }
        getLayoutPosition().update(f, f2, f3, f4);
        getLayoutSize().update(f6, f5);
    }

    public void applyLayoutOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6973a8b", new Object[]{this});
        } else if (isLazy()) {
        } else {
            setSafeLayout(this);
            setPadding(getPadding(), getBorder());
        }
    }

    @Deprecated
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
        } else if (map != null) {
            if (this.mHost == null && !isVirtualComponent()) {
                return;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                String string = WXUtils.getString(key, null);
                if (string != null && !(key instanceof String)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(m.KEY_COMPONENT_TYPE, getComponentType());
                    hashMap.put("actual key", string == null ? "" : string);
                    WXExceptionUtils.commitCriticalExceptionRT(getInstanceId(), WXErrorCode.WX_RENDER_ERR_COMPONENT_ATTR_KEY, "WXComponent.updateProperties", WXErrorCode.WX_RENDER_ERR_COMPONENT_ATTR_KEY.getErrorMsg(), hashMap);
                }
                Object value = entry.getValue();
                String string2 = WXUtils.getString(value, null);
                if (string == null) {
                    WXExceptionUtils.commitCriticalExceptionRT(getInstanceId(), WXErrorCode.WX_RENDER_ERR_NULL_KEY, "updateProperties", WXErrorCode.WX_RENDER_ERR_NULL_KEY.getErrorMsg(), null);
                } else {
                    if (TextUtils.isEmpty(string2)) {
                        value = convertEmptyProperty(string, string2);
                    }
                    if (setProperty(string, value)) {
                        continue;
                    } else {
                        IFComponentHolder iFComponentHolder = this.mHolder;
                        if (iFComponentHolder == null) {
                            return;
                        }
                        Invoker propertyInvoker = iFComponentHolder.getPropertyInvoker(string);
                        if (propertyInvoker != null) {
                            try {
                                Type[] parameterTypes = propertyInvoker.getParameterTypes();
                                if (parameterTypes.length != 1) {
                                    WXLogUtils.e("[WXComponent] setX method only one parameter：" + propertyInvoker);
                                    return;
                                }
                                propertyInvoker.invoke(this, WXReflectionUtils.parseArgument(parameterTypes[0], value));
                            } catch (Exception e) {
                                WXLogUtils.e("[WXComponent] updateProperties :class:" + getClass() + "method:" + propertyInvoker.toString() + " function " + WXLogUtils.getStackTrace(e));
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            readyToRender();
            if (!(this instanceof FlatComponent) || this.mBackgroundDrawable == null) {
                return;
            }
            FlatComponent flatComponent = (FlatComponent) this;
            if (flatComponent.promoteToView(true) || (flatComponent.getOrCreateFlatWidget() instanceof AndroidViewWidget)) {
                return;
            }
            flatComponent.getOrCreateFlatWidget().setBackgroundAndBorder(this.mBackgroundDrawable);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r8.equals("position") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setProperty(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setProperty(java.lang.String, java.lang.Object):boolean");
    }

    public BorderDrawable getOrCreateBorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderDrawable) ipChange.ipc$dispatch("552ff536", new Object[]{this});
        }
        if (this.mBackgroundDrawable == null) {
            this.mBackgroundDrawable = new BorderDrawable();
            T t = this.mHost;
            if (t != null) {
                WXViewInnerUtils.setBackGround(t, null, this);
                Drawable drawable = this.mRippleBackground;
                if (drawable == null) {
                    WXViewInnerUtils.setBackGround(this.mHost, this.mBackgroundDrawable, this);
                } else {
                    WXViewInnerUtils.setBackGround(this.mHost, new LayerDrawable(new Drawable[]{drawable, this.mBackgroundDrawable}), this);
                }
            }
        }
        return this.mBackgroundDrawable;
    }

    public void setSafeLayout(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ac3c05", new Object[]{this, wXComponent});
        } else if (TextUtils.isEmpty(wXComponent.getComponentType()) || TextUtils.isEmpty(wXComponent.getRef()) || wXComponent.getLayoutPosition() == null || wXComponent.getLayoutSize() == null) {
        } else {
            setLayout(wXComponent);
        }
    }

    public void setLayout(WXComponent wXComponent) {
        int left;
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0915d8", new Object[]{this, wXComponent});
            return;
        }
        setLayoutSize(wXComponent.getLayoutSize());
        setLayoutPosition(wXComponent.getLayoutPosition());
        setPaddings(wXComponent.getPadding());
        setMargins(wXComponent.getMargin());
        setBorders(wXComponent.getBorder());
        boolean isLayoutRTL = wXComponent.isLayoutRTL();
        setIsLayoutRTL(isLayoutRTL);
        if (isLayoutRTL != wXComponent.isLastLayoutDirectionRTL) {
            wXComponent.isLastLayoutDirectionRTL = isLayoutRTL;
            layoutDirectionDidChanged(isLayoutRTL);
        }
        parseAnimation();
        boolean z = this.mParent == null;
        if (!z) {
            i2 = this.mParent.getChildrenLayoutTopOffset();
        }
        CSSShorthand cSSShorthand = z ? new CSSShorthand() : this.mParent.getPadding();
        CSSShorthand cSSShorthand2 = z ? new CSSShorthand() : this.mParent.getBorder();
        int width = (int) getLayoutSize().getWidth();
        int height = (int) getLayoutSize().getHeight();
        if (isFixed()) {
            int top = ((int) (getLayoutPosition().getTop() - getInstance().ao())) + i2;
            left = (int) (getLayoutPosition().getLeft() - getInstance().an());
            i = top;
        } else {
            int top2 = ((int) ((getLayoutPosition().getTop() - cSSShorthand.get(CSSShorthand.EDGE.TOP)) - cSSShorthand2.get(CSSShorthand.EDGE.TOP))) + i2;
            left = (int) ((getLayoutPosition().getLeft() - cSSShorthand.get(CSSShorthand.EDGE.LEFT)) - cSSShorthand2.get(CSSShorthand.EDGE.LEFT));
            i = top2;
        }
        int i3 = (int) getMargin().get(CSSShorthand.EDGE.RIGHT);
        int i4 = (int) getMargin().get(CSSShorthand.EDGE.BOTTOM);
        Point point = new Point((int) getLayoutPosition().getLeft(), (int) getLayoutPosition().getTop());
        if (this.mPreRealWidth == width && this.mPreRealHeight == height && this.mPreRealLeft == left && this.mPreRealRight == i3 && this.mPreRealTop == i) {
            return;
        }
        float f = 0.0f;
        this.mAbsoluteY = (int) (z ? 0.0f : this.mParent.getAbsoluteY() + getCSSLayoutTop());
        if (!z) {
            f = getCSSLayoutLeft() + this.mParent.getAbsoluteX();
        }
        this.mAbsoluteX = (int) f;
        T t = this.mHost;
        if (t == null) {
            return;
        }
        if (!(t instanceof ViewGroup) && this.mAbsoluteY + height > this.mInstance.P() + 1) {
            if (!this.mInstance.f) {
                this.mInstance.ah();
            }
            if (!this.mInstance.j) {
                WXSDKInstance wXSDKInstance = this.mInstance;
                wXSDKInstance.j = true;
                wXSDKInstance.ar().g();
            }
        }
        MeasureOutput measure = measure(width, height);
        setComponentLayoutParams(measure.width, measure.height, left, i, i3, i4, point);
    }

    private void setComponentLayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Point point) {
        Widget androidViewWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8dfedf5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), point});
        } else if (getInstance() == null || getInstance().P_()) {
        } else {
            FlatGUIContext u = getInstance().u();
            if (u != null && u.getFlatComponentAncestor(this) != null) {
                if (this instanceof FlatComponent) {
                    FlatComponent flatComponent = (FlatComponent) this;
                    if (!flatComponent.promoteToView(true)) {
                        androidViewWidget = flatComponent.getOrCreateFlatWidget();
                        setWidgetParams(androidViewWidget, u, point, i, i2, i3, i5, i4, i6);
                    }
                }
                androidViewWidget = u.getAndroidViewWidget(this);
                setWidgetParams(androidViewWidget, u, point, i, i2, i3, i5, i4, i6);
            } else if (this.mHost == null) {
            } else {
                clearBoxShadow();
                if (isFixed()) {
                    setFixedHostLayoutParams(this.mHost, i, i2, i3, i5, i4, i6);
                } else {
                    setHostLayoutParams(this.mHost, i, i2, i3, i5, i4, i6);
                }
                recordInteraction(i, i2);
                this.mPreRealWidth = i;
                this.mPreRealHeight = i2;
                this.mPreRealLeft = i3;
                this.mPreRealRight = i5;
                this.mPreRealTop = i4;
                onFinishLayout();
                updateBoxShadow();
            }
        }
    }

    private void recordInteraction(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e93768", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.mIsAddElementToTree) {
        } else {
            this.mIsAddElementToTree = false;
            if (this.mParent == null) {
                this.interactionAbsoluteX = 0;
                this.interactionAbsoluteY = 0;
            } else {
                float cSSLayoutTop = getCSSLayoutTop();
                float cSSLayoutLeft = getCSSLayoutLeft();
                this.interactionAbsoluteX = (int) (isFixed() ? cSSLayoutLeft : this.mParent.interactionAbsoluteX + this.mParent.mChildrensWidth + cSSLayoutLeft);
                if (!isFixed()) {
                    cSSLayoutTop += this.mParent.interactionAbsoluteY;
                }
                this.interactionAbsoluteY = (int) cSSLayoutTop;
                if ((WXBasicComponentType.SLIDER.equalsIgnoreCase(this.mParent.getComponentType()) || WXBasicComponentType.CYCLE_SLIDER.equalsIgnoreCase(this.mParent.getComponentType())) && !WXBasicComponentType.INDICATOR.equalsIgnoreCase(getComponentType())) {
                    this.mParent.mChildrensWidth += (int) (i + cSSLayoutLeft);
                }
            }
            if (getInstance().ar().d == null) {
                getInstance().ar().d = new Rect();
            }
            Rect rect = getInstance().ar().d;
            rect.set(0, 0, this.mInstance.Q(), this.mInstance.P());
            if (rect.contains(this.interactionAbsoluteX, this.interactionAbsoluteY) || rect.contains(this.interactionAbsoluteX + i, this.interactionAbsoluteY) || rect.contains(this.interactionAbsoluteX, this.interactionAbsoluteY + i2)) {
                return;
            }
            rect.contains(this.interactionAbsoluteX + i, this.interactionAbsoluteY + i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setWidgetParams(com.taobao.weex.ui.flat.widget.Widget r18, com.taobao.weex.ui.flat.FlatGUIContext r19, android.graphics.Point r20, int r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.setWidgetParams(com.taobao.weex.ui.flat.widget.Widget, com.taobao.weex.ui.flat.FlatGUIContext, android.graphics.Point, int, int, int, int, int, int):void");
    }

    public void setHostLayoutParams(T t, int i, int i2, int i3, int i4, int i5, int i6) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f903871", new Object[]{this, t, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        if (this.mParent == null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
            setMarginsSupportRTL(layoutParams2, i3, i5, i4, i6);
            layoutParams = layoutParams2;
        } else {
            layoutParams = this.mParent.getChildLayoutParams(this, t, i, i2, i3, i4, i5, i6);
        }
        if (layoutParams == null) {
            return;
        }
        t.setLayoutParams(layoutParams);
    }

    private void setFixedHostLayoutParams(T t, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbc3ea1", new Object[]{this, t, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = i;
        layoutParams.height = i2;
        setMarginsSupportRTL(layoutParams, i3, i5, i4, i6);
        t.setLayoutParams(layoutParams);
        this.mInstance.a(t);
        if (!WXEnvironment.isApkDebugable()) {
            return;
        }
        WXLogUtils.d("Weex_Fixed_Style", "WXComponent:setLayout :" + i3 + " " + i5 + " " + i + " " + i2);
        StringBuilder sb = new StringBuilder();
        sb.append("WXComponent:setLayout Left:");
        sb.append(getStyles().getLeft());
        sb.append(" ");
        sb.append((int) getStyles().getTop());
        WXLogUtils.d("Weex_Fixed_Style", sb.toString());
    }

    public void updateBoxShadow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62a8b89", new Object[]{this});
        } else if (BoxShadowUtil.isBoxShadowEnabled()) {
            if (getStyles() != null) {
                Object obj = getStyles().get("boxShadow");
                Object obj2 = getAttrs().get(Constants.Name.SHADOW_QUALITY);
                if (obj == null) {
                    return;
                }
                View view = this.mHost;
                if (this instanceof WXVContainer) {
                    view = ((WXVContainer) this).getBoxShadowHost(false);
                }
                View view2 = view;
                if (view2 == null) {
                    return;
                }
                float floatValue = WXUtils.getFloat(obj2, Float.valueOf(0.5f)).floatValue();
                int y = getInstance().y();
                String str = obj.toString() + " / [" + view2.getMeasuredWidth() + "," + view2.getMeasuredHeight() + "] / " + floatValue;
                String str2 = this.mLastBoxShadowId;
                if (str2 != null && str2.equals(str)) {
                    WXLogUtils.d("BoxShadow", "box-shadow style was not modified. " + str);
                    return;
                }
                float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                WXStyle styles = getStyles();
                if (styles != null) {
                    float floatValue2 = WXUtils.getFloat(styles.get("borderTopLeftRadius"), Float.valueOf(0.0f)).floatValue();
                    fArr[0] = floatValue2;
                    fArr[1] = floatValue2;
                    float floatValue3 = WXUtils.getFloat(styles.get("borderTopRightRadius"), Float.valueOf(0.0f)).floatValue();
                    fArr[2] = floatValue3;
                    fArr[3] = floatValue3;
                    float floatValue4 = WXUtils.getFloat(styles.get("borderBottomRightRadius"), Float.valueOf(0.0f)).floatValue();
                    fArr[4] = floatValue4;
                    fArr[5] = floatValue4;
                    float floatValue5 = WXUtils.getFloat(styles.get("borderBottomLeftRadius"), Float.valueOf(0.0f)).floatValue();
                    fArr[6] = floatValue5;
                    fArr[7] = floatValue5;
                    if (styles.containsKey("borderRadius")) {
                        float floatValue6 = WXUtils.getFloat(styles.get("borderRadius"), Float.valueOf(0.0f)).floatValue();
                        for (int i = 0; i < fArr.length; i++) {
                            fArr[i] = floatValue6;
                        }
                    }
                }
                BoxShadowUtil.setBoxShadow(getInstance(), view2, obj.toString(), fArr, y, floatValue);
                this.mLastBoxShadowId = str;
                return;
            }
            WXLogUtils.w("Can not resolve styles");
        }
    }

    public void clearBoxShadow() {
        ViewOverlay overlay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84742485", new Object[]{this});
        } else if (!BoxShadowUtil.isBoxShadowEnabled()) {
        } else {
            if (getStyles() != null && getStyles().get("boxShadow") == null) {
                return;
            }
            View view = this.mHost;
            if (this instanceof WXVContainer) {
                view = ((WXVContainer) this).getBoxShadowHost(true);
            }
            if (view != null && Build.VERSION.SDK_INT >= 18 && (overlay = view.getOverlay()) != null) {
                overlay.clear();
            }
            this.mLastBoxShadowId = null;
        }
    }

    public void onFinishLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc9ba3", new Object[]{this});
            return;
        }
        Object obj = getStyles() != null ? getStyles().get("backgroundImage") : null;
        if (obj != null) {
            setBackgroundImage(obj.toString());
        }
        if (getEvents().contains(Constants.Event.RENDERED) && !this.hasRendered) {
            HashMap hashMap = new HashMap();
            hashMap.put("renderTimestamp", Long.valueOf(System.currentTimeMillis()));
            fireEvent(Constants.Event.RENDERED, hashMap);
        }
        this.hasRendered = true;
    }

    public MeasureOutput measure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureOutput) ipChange.ipc$dispatch("49fa9afb", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        MeasureOutput measureOutput = new MeasureOutput();
        int i3 = this.mFixedProp;
        if (i3 != 0) {
            measureOutput.width = i3;
            measureOutput.height = i3;
        } else {
            measureOutput.width = i;
            measureOutput.height = i2;
        }
        return measureOutput;
    }

    public void setAriaHidden(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8758e38", new Object[]{this, new Boolean(z)});
            return;
        }
        T mo1286getHostView = mo1286getHostView();
        if (mo1286getHostView == null || Build.VERSION.SDK_INT < 16) {
            return;
        }
        if (z) {
            i = Build.VERSION.SDK_INT >= 19 ? 4 : 2;
        }
        mo1286getHostView.setImportantForAccessibility(i);
    }

    public void setAriaLabel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808332fa", new Object[]{this, str});
            return;
        }
        T mo1286getHostView = mo1286getHostView();
        if (mo1286getHostView == null) {
            return;
        }
        mo1286getHostView.setContentDescription(str);
    }

    public void setAccessible(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e8c6ae", new Object[]{this, bool});
        } else if (mo1286getHostView() == null || Build.VERSION.SDK_INT < 16) {
        } else {
            if (bool.booleanValue()) {
                mo1286getHostView().setImportantForAccessibility(1);
            } else {
                mo1286getHostView().setImportantForAccessibility(2);
            }
        }
    }

    public void setRole(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfba2089", new Object[]{this, str});
            return;
        }
        T mo1286getHostView = mo1286getHostView();
        if (mo1286getHostView == null || TextUtils.isEmpty(str)) {
            return;
        }
        IWXAccessibilityRoleAdapter accessibilityRoleAdapter = WXSDKManager.getInstance().getAccessibilityRoleAdapter();
        if (accessibilityRoleAdapter != null) {
            str = accessibilityRoleAdapter.getRole(str);
        }
        ViewCompat.setAccessibilityDelegate(mo1286getHostView, new AccessibilityDelegateCompat() { // from class: com.taobao.weex.ui.component.WXComponent.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str2, Object... objArr) {
                if (str2.hashCode() == -1796852737) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view, accessibilityNodeInfoCompat});
                    return;
                }
                try {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setRoleDescription(str);
                } catch (Throwable unused) {
                    WXLogUtils.e("SetRole failed!");
                }
            }
        });
    }

    private void setFixedSize(String str) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99be3da4", new Object[]{this, str});
            return;
        }
        if ("m".equals(str)) {
            this.mFixedProp = -1;
        } else if ("w".equals(str)) {
            this.mFixedProp = -2;
        } else {
            this.mFixedProp = 0;
            return;
        }
        T t = this.mHost;
        if (t == null || (layoutParams = t.getLayoutParams()) == null) {
            return;
        }
        int i = this.mFixedProp;
        layoutParams.height = i;
        layoutParams.width = i;
        this.mHost.setLayoutParams(layoutParams);
    }

    /* renamed from: getRealView */
    public View mo1594getRealView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("849d5722", new Object[]{this}) : this.mHost;
    }

    private boolean needGestureDetector(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b517aa8e", new Object[]{this, str})).booleanValue();
        }
        if (this.mHost != null) {
            for (WXGestureType.LowLevelGesture lowLevelGesture : WXGestureType.LowLevelGesture.values()) {
                if (str.equals(lowLevelGesture.toString())) {
                    return true;
                }
            }
            for (WXGestureType.HighLevelGesture highLevelGesture : WXGestureType.HighLevelGesture.values()) {
                if (str.equals(highLevelGesture.toString())) {
                    return true;
                }
            }
        }
        return WXGesture.isStopPropagation(str);
    }

    public Scrollable getParentScroller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scrollable) ipChange.ipc$dispatch("5b2c2d79", new Object[]{this});
        }
        WXComponent<T> wXComponent = this;
        do {
            wXComponent = wXComponent.getParent();
            if (wXComponent == null) {
                return null;
            }
            if (wXComponent instanceof Scrollable) {
                return (Scrollable) wXComponent;
            }
        } while (!wXComponent.getRef().equals(ROOT));
        return null;
    }

    public Scrollable getFirstScroller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scrollable) ipChange.ipc$dispatch("d2dc61d3", new Object[]{this});
        }
        if (!(this instanceof Scrollable)) {
            return null;
        }
        return (Scrollable) this;
    }

    public WXVContainer getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXVContainer) ipChange.ipc$dispatch("84cdb95a", new Object[]{this}) : this.mParent;
    }

    public final void createView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
        } else if (isLazy()) {
        } else {
            createViewImpl();
        }
    }

    public void createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b975b88", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context != null) {
            this.mHost = mo1592initComponentHostView(context);
            if (this.mHost == null && !isVirtualComponent()) {
                initView();
            }
            T t = this.mHost;
            if (t != null) {
                if (t.getId() == -1) {
                    this.mHost.setId(WXViewInnerUtils.generateViewId());
                }
                if (TextUtils.isEmpty(this.mHost.getContentDescription())) {
                    WXEnvironment.isApkDebugable();
                }
                c C = getInstance().C();
                if (C != null) {
                    C.onViewCreated(this, this.mHost);
                }
            }
            onHostViewInitialized(this.mHost);
            return;
        }
        WXLogUtils.e("createViewImpl", "Context is null");
    }

    @Deprecated
    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.mHost = mo1592initComponentHostView(context);
    }

    public void onHostViewInitialized(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e90023", new Object[]{this, t});
            return;
        }
        WXAnimationModule.AnimationHolder animationHolder = this.mAnimationHolder;
        if (animationHolder != null) {
            animationHolder.execute(this.mInstance, this);
        }
        setActiveTouchListener();
    }

    /* renamed from: getHostView */
    public T mo1286getHostView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("d4389aac", new Object[]{this}) : this.mHost;
    }

    @Deprecated
    /* renamed from: getView */
    public View mo1595getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mHost;
    }

    public int getAbsoluteY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e0b3186", new Object[]{this})).intValue() : this.mAbsoluteY;
    }

    public int getAbsoluteX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8dfd1a05", new Object[]{this})).intValue() : this.mAbsoluteX;
    }

    public void removeEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36761a87", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.equals(Constants.Event.LAYEROVERFLOW)) {
                removeLayerOverFlowListener(getRef());
            }
            if (getEvents() != null) {
                getEvents().remove(str);
            }
            Set<String> set = this.mAppendEvents;
            if (set != null) {
                set.remove(str);
            }
            Set<String> set2 = this.mGestureType;
            if (set2 != null) {
                set2.remove(str);
            }
            removeEventFromView(str);
        }
    }

    public void removeEventFromView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a57e4d6", new Object[]{this, str});
            return;
        }
        if (str.equals("click") && mo1594getRealView() != null && this.mHostClickListeners != null) {
            if (this.mClickEventListener == null) {
                this.mClickEventListener = new OnClickListenerImp();
            }
            this.mHostClickListeners.remove(this.mClickEventListener);
        }
        Scrollable parentScroller = getParentScroller();
        if (str.equals("appear") && parentScroller != null) {
            parentScroller.unbindAppearEvent(this);
        }
        if (!str.equals("disappear") || parentScroller == null) {
            return;
        }
        parentScroller.unbindDisappearEvent(this);
    }

    public void removeAllEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff7ac24", new Object[]{this});
        } else if (getEvents().size() > 0) {
            WXEvent events = getEvents();
            int size = events.size();
            for (int i = 0; i < size && i < events.size(); i++) {
                String str = events.get(i);
                if (str != null) {
                    removeEventFromView(str);
                }
            }
            Set<String> set = this.mAppendEvents;
            if (set != null) {
                set.clear();
            }
            Set<String> set2 = this.mGestureType;
            if (set2 != null) {
                set2.clear();
            }
            this.mGesture = null;
            if (mo1594getRealView() != null && (mo1594getRealView() instanceof WXGestureObservable)) {
                ((WXGestureObservable) mo1594getRealView()).registerGestureListener(null);
            }
            T t = this.mHost;
            if (t == null) {
                return;
            }
            t.setOnFocusChangeListener(null);
            List<OnClickListener> list = this.mHostClickListeners;
            if (list == null || list.size() <= 0) {
                return;
            }
            this.mHostClickListeners.clear();
            this.mHost.setOnClickListener(null);
        }
    }

    public final void removeStickyStyle() {
        Scrollable parentScroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f78cab", new Object[]{this});
        } else if (!isSticky() || (parentScroller = getParentScroller()) == null) {
        } else {
            parentScroller.unbindStickStyle(this);
        }
    }

    public boolean isSticky() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b2496be", new Object[]{this})).booleanValue() : getStyles().isSticky();
    }

    public boolean isFixed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("72b8d3f5", new Object[]{this})).booleanValue() : getStyles().isFixed();
    }

    public void setDisabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3718d4ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsDisabled = z;
        T t = this.mHost;
        if (t == null) {
            return;
        }
        t.setEnabled(!z);
    }

    public boolean isDisabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("98011351", new Object[]{this})).booleanValue() : this.mIsDisabled;
    }

    public void setSticky(String str) {
        Scrollable parentScroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2a713c", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !str.equals("sticky") || (parentScroller = getParentScroller()) == null) {
        } else {
            parentScroller.bindStickStyle(this);
        }
    }

    public void setBackgroundColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29247c64", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            int color = WXResourceUtils.getColor(str);
            if (isRippleEnabled() && Build.VERSION.SDK_INT >= 21) {
                this.mRippleBackground = prepareBackgroundRipple();
                Drawable drawable = this.mRippleBackground;
                if (drawable != null) {
                    BorderDrawable borderDrawable = this.mBackgroundDrawable;
                    if (borderDrawable == null) {
                        WXViewInnerUtils.setBackGround(this.mHost, drawable, this);
                        return;
                    } else {
                        WXViewInnerUtils.setBackGround(this.mHost, new LayerDrawable(new Drawable[]{drawable, borderDrawable}), this);
                        return;
                    }
                }
            }
            if (color == 0 && this.mBackgroundDrawable == null) {
                return;
            }
            getOrCreateBorder().setColor(color);
        }
    }

    private Drawable prepareBackgroundRipple() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("422a700e", new Object[]{this});
        }
        try {
            if (getStyles() != null && getStyles().getPesudoResetStyles() != null) {
                Map<String, Object> pesudoResetStyles = getStyles().getPesudoResetStyles();
                Object obj = pesudoResetStyles.get("backgroundColor");
                if (obj != null) {
                    i = WXResourceUtils.getColor(obj.toString(), 0);
                    if (i == 0) {
                        return null;
                    }
                } else {
                    i = 0;
                }
                Object obj2 = pesudoResetStyles.get("backgroundColor:active");
                if (obj2 == null) {
                    return null;
                }
                int color = WXResourceUtils.getColor(obj2.toString(), i);
                if (Build.VERSION.SDK_INT >= 21) {
                    return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), new ColorDrawable(i), null) { // from class: com.taobao.weex.ui.component.WXComponent.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                            if (str.hashCode() == -1665133574) {
                                super.draw((Canvas) objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
                        public void draw(Canvas canvas) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
                                return;
                            }
                            if (WXComponent.access$400(WXComponent.this) != null) {
                                canvas.clipPath(WXComponent.access$400(WXComponent.this).getContentPath(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())));
                            }
                            super.draw(canvas);
                        }
                    };
                }
            }
        } catch (Throwable th) {
            WXLogUtils.w("Exception on create ripple: ", th);
        }
        return null;
    }

    public void setBackgroundImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab3ac5c", new Object[]{this, str});
        } else if ("".equals(str.trim())) {
            getOrCreateBorder().setImage(null);
        } else {
            getOrCreateBorder().setImage(WXResourceUtils.getShader(str, getLayoutSize().getWidth(), getLayoutSize().getHeight()));
        }
    }

    private boolean shouldCancelHardwareAccelerate() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e22e575d", new Object[]{this})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter != null) {
            try {
                z = Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_test_gpu", "cancel_hardware_accelerate", "true"));
            } catch (Exception e) {
                WXLogUtils.e(WXLogUtils.getStackTrace(e));
            }
            WXLogUtils.i("cancel_hardware_accelerate : " + z);
        }
        return z;
    }

    public void setOpacity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5f5870", new Object[]{this, new Float(f)});
        } else if (f < 0.0f || f > 1.0f || this.mHost.getAlpha() == f) {
        } else {
            int openGLRenderLimitValue = WXRenderManager.getOpenGLRenderLimitValue();
            if (isLayerTypeEnabled()) {
                this.mHost.setLayerType(2, null);
            }
            if (isLayerTypeEnabled() && shouldCancelHardwareAccelerate() && openGLRenderLimitValue > 0) {
                float f2 = openGLRenderLimitValue;
                if (getLayoutHeight() > f2 || getLayoutWidth() > f2) {
                    this.mHost.setLayerType(0, null);
                }
            }
            this.mHost.setAlpha(f);
        }
    }

    public void setBorderRadius(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383169ef", new Object[]{this, str, new Float(f)});
        } else if (f < 0.0f) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1228066334:
                    if (str.equals("borderTopLeftRadius")) {
                        c = 1;
                        break;
                    }
                    break;
                case 333432965:
                    if (str.equals("borderTopRightRadius")) {
                        c = 2;
                        break;
                    }
                    break;
                case 581268560:
                    if (str.equals("borderBottomLeftRadius")) {
                        c = 4;
                        break;
                    }
                    break;
                case 588239831:
                    if (str.equals("borderBottomRightRadius")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1349188574:
                    if (str.equals("borderRadius")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                BorderDrawable orCreateBorder = getOrCreateBorder();
                CSSShorthand.CORNER corner = CSSShorthand.CORNER.ALL;
                WXSDKInstance wXSDKInstance = this.mInstance;
                orCreateBorder.setBorderRadius(corner, WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance, f, wXSDKInstance.y()));
            } else if (c == 1) {
                BorderDrawable orCreateBorder2 = getOrCreateBorder();
                CSSShorthand.CORNER corner2 = CSSShorthand.CORNER.BORDER_TOP_LEFT;
                WXSDKInstance wXSDKInstance2 = this.mInstance;
                orCreateBorder2.setBorderRadius(corner2, WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance2, f, wXSDKInstance2.y()));
            } else if (c == 2) {
                BorderDrawable orCreateBorder3 = getOrCreateBorder();
                CSSShorthand.CORNER corner3 = CSSShorthand.CORNER.BORDER_TOP_RIGHT;
                WXSDKInstance wXSDKInstance3 = this.mInstance;
                orCreateBorder3.setBorderRadius(corner3, WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance3, f, wXSDKInstance3.y()));
            } else if (c == 3) {
                BorderDrawable orCreateBorder4 = getOrCreateBorder();
                CSSShorthand.CORNER corner4 = CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT;
                WXSDKInstance wXSDKInstance4 = this.mInstance;
                orCreateBorder4.setBorderRadius(corner4, WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance4, f, wXSDKInstance4.y()));
            } else if (c != 4) {
            } else {
                BorderDrawable orCreateBorder5 = getOrCreateBorder();
                CSSShorthand.CORNER corner5 = CSSShorthand.CORNER.BORDER_BOTTOM_LEFT;
                WXSDKInstance wXSDKInstance5 = this.mInstance;
                orCreateBorder5.setBorderRadius(corner5, WXViewInnerUtils.getRealSubPxByWidth(wXSDKInstance5, f, wXSDKInstance5.y()));
            }
        }
    }

    public void setBorderWidth(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a4a117", new Object[]{this, str, new Float(f)});
        } else if (f < 0.0f) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1971292586:
                    if (str.equals("borderRightWidth")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1452542531:
                    if (str.equals("borderTopWidth")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1290574193:
                    if (str.equals("borderBottomWidth")) {
                        c = 3;
                        break;
                    }
                    break;
                case -223992013:
                    if (str.equals("borderLeftWidth")) {
                        c = 4;
                        break;
                    }
                    break;
                case 741115130:
                    if (str.equals("borderWidth")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                getOrCreateBorder().setBorderWidth(CSSShorthand.EDGE.ALL, f);
            } else if (c == 1) {
                getOrCreateBorder().setBorderWidth(CSSShorthand.EDGE.TOP, f);
            } else if (c == 2) {
                getOrCreateBorder().setBorderWidth(CSSShorthand.EDGE.RIGHT, f);
            } else if (c == 3) {
                getOrCreateBorder().setBorderWidth(CSSShorthand.EDGE.BOTTOM, f);
            } else if (c != 4) {
            } else {
                getOrCreateBorder().setBorderWidth(CSSShorthand.EDGE.LEFT, f);
            }
        }
    }

    public void setBorderStyle(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b587523e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1974639039:
                    if (str.equals("borderRightStyle")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1455888984:
                    if (str.equals("borderTopStyle")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1293920646:
                    if (str.equals("borderBottomStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case -227338466:
                    if (str.equals("borderLeftStyle")) {
                        c = 3;
                        break;
                    }
                    break;
                case 737768677:
                    if (str.equals("borderStyle")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                getOrCreateBorder().setBorderStyle(CSSShorthand.EDGE.ALL, str2);
            } else if (c == 1) {
                getOrCreateBorder().setBorderStyle(CSSShorthand.EDGE.RIGHT, str2);
            } else if (c == 2) {
                getOrCreateBorder().setBorderStyle(CSSShorthand.EDGE.BOTTOM, str2);
            } else if (c == 3) {
                getOrCreateBorder().setBorderStyle(CSSShorthand.EDGE.LEFT, str2);
            } else if (c != 4) {
            } else {
                getOrCreateBorder().setBorderStyle(CSSShorthand.EDGE.TOP, str2);
            }
        }
    }

    public void setBorderColor(String str, String str2) {
        int color;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2dc49f0", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str2) || (color = WXResourceUtils.getColor(str2)) == Integer.MIN_VALUE) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1989576717:
                    if (str.equals("borderRightColor")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1470826662:
                    if (str.equals("borderTopColor")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1308858324:
                    if (str.equals("borderBottomColor")) {
                        c = 3;
                        break;
                    }
                    break;
                case -242276144:
                    if (str.equals("borderLeftColor")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722830999:
                    if (str.equals("borderColor")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                getOrCreateBorder().setBorderColor(CSSShorthand.EDGE.ALL, color);
            } else if (c == 1) {
                getOrCreateBorder().setBorderColor(CSSShorthand.EDGE.TOP, color);
            } else if (c == 2) {
                getOrCreateBorder().setBorderColor(CSSShorthand.EDGE.RIGHT, color);
            } else if (c == 3) {
                getOrCreateBorder().setBorderColor(CSSShorthand.EDGE.BOTTOM, color);
            } else if (c != 4) {
            } else {
                getOrCreateBorder().setBorderColor(CSSShorthand.EDGE.LEFT, color);
            }
        }
    }

    public String getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5490c8f1", new Object[]{this});
        }
        try {
            return (String) getStyles().get("visibility");
        } catch (Exception unused) {
            return "visible";
        }
    }

    public void setVisibility(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b471dca5", new Object[]{this, str});
            return;
        }
        View mo1594getRealView = mo1594getRealView();
        if (mo1594getRealView == null) {
            return;
        }
        if (TextUtils.equals(str, "visible")) {
            mo1594getRealView.setVisibility(0);
        } else if (!TextUtils.equals(str, "hidden")) {
        } else {
            mo1594getRealView.setVisibility(8);
        }
    }

    private void updateElevation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6387821b", new Object[]{this});
            return;
        }
        float elevation = getAttrs().getElevation(getInstance(), getInstance().y());
        if (Float.isNaN(elevation)) {
            return;
        }
        ViewCompat.setElevation(mo1286getHostView(), elevation);
    }

    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
        } else if (isFixed()) {
        } else {
            clearBoxShadow();
        }
    }

    public void destroy() {
        T mo1286getHostView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        c C = getInstance().C();
        if (C != null) {
            C.onPreDestory(this);
        }
        if (WXEnvironment.isApkDebugable() && !WXUtils.isUiThread()) {
            throw new WXRuntimeException("[WXComponent] destroy can only be called in main thread");
        }
        T t = this.mHost;
        if (t != null && t.getLayerType() == 2 && isLayerTypeEnabled()) {
            this.mHost.setLayerType(0, null);
        }
        removeAllEvent();
        removeStickyStyle();
        if (isFixed() && (mo1286getHostView = mo1286getHostView()) != null) {
            getInstance().b(mo1286getHostView);
        }
        ContentBoxMeasurement contentBoxMeasurement = this.contentBoxMeasurement;
        if (contentBoxMeasurement != null) {
            contentBoxMeasurement.destroy();
            this.contentBoxMeasurement = null;
        }
        this.mIsDestroyed = true;
        ConcurrentLinkedQueue<Pair<String, Map<String, Object>>> concurrentLinkedQueue = this.animations;
        if (concurrentLinkedQueue == null) {
            return;
        }
        concurrentLinkedQueue.clear();
    }

    public boolean isDestoryed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("883bf6b4", new Object[]{this})).booleanValue() : this.mIsDestroyed;
    }

    public View detachViewAndClearPreInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8f5fb2c", new Object[]{this});
        }
        T t = this.mHost;
        this.mPreRealLeft = 0;
        this.mPreRealRight = 0;
        this.mPreRealWidth = 0;
        this.mPreRealHeight = 0;
        this.mPreRealTop = 0;
        return t;
    }

    public void clearPreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaec9867", new Object[]{this});
            return;
        }
        this.mPreRealLeft = 0;
        this.mPreRealRight = 0;
        this.mPreRealWidth = 0;
        this.mPreRealHeight = 0;
        this.mPreRealTop = 0;
    }

    public void computeVisiblePointInViewCoordinate(PointF pointF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3b0f49", new Object[]{this, pointF});
            return;
        }
        View mo1594getRealView = mo1594getRealView();
        pointF.set(mo1594getRealView.getScrollX(), mo1594getRealView.getScrollY());
    }

    public boolean containsGesture(WXGestureType wXGestureType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71113862", new Object[]{this, wXGestureType})).booleanValue();
        }
        Set<String> set = this.mGestureType;
        return set != null && set.contains(wXGestureType.toString());
    }

    public boolean containsEvent(String str) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("627cf410", new Object[]{this, str})).booleanValue() : getEvents().contains(str) || ((set = this.mAppendEvents) != null && set.contains(str));
    }

    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
        } else if (!containsEvent("appear") && !containsEvent("disappear")) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("direction", str2);
            fireEvent(str, hashMap);
        }
    }

    public boolean isUsing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("278f8105", new Object[]{this})).booleanValue() : this.isUsing;
    }

    public void setUsing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655b5b2b", new Object[]{this, new Boolean(z)});
        } else {
            this.isUsing = z;
        }
    }

    public void readyToRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c045293b", new Object[]{this});
        } else if (this.mParent == null) {
        } else {
            this.mParent.readyToRender();
        }
    }

    public boolean isVirtualComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1960fe07", new Object[]{this})).booleanValue() : this.mType == 1;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.mType;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r8.equals("borderBottomLeftRadius") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object convertEmptyProperty(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXComponent.convertEmptyProperty(java.lang.String, java.lang.Object):java.lang.Object");
    }

    private void setActiveTouchListener() {
        View mo1594getRealView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec156f2", new Object[]{this});
        } else if (!getStyles().getPesudoStyles().containsKey(Constants.PSEUDO.ACTIVE) || (mo1594getRealView = mo1594getRealView()) == null) {
        } else {
            mo1594getRealView.setOnTouchListener(new TouchActivePseudoListener(this, !isConsumeTouch()));
        }
    }

    public boolean isConsumeTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53648f8", new Object[]{this})).booleanValue();
        }
        List<OnClickListener> list = this.mHostClickListeners;
        return (list != null && list.size() > 0) || this.mGesture != null;
    }

    @Override // com.taobao.weex.ui.component.pesudo.OnActivePseudoListner
    public void updateActivePseudo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4be5f80", new Object[]{this, new Boolean(z)});
        } else {
            setPseudoClassStatus(Constants.PSEUDO.ACTIVE, z);
        }
    }

    public void setPseudoClassStatus(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8aa879", new Object[]{this, str, new Boolean(z)});
            return;
        }
        WXStyle styles = getStyles();
        Map<String, Map<String, Object>> pesudoStyles = styles.getPesudoStyles();
        if (pesudoStyles == null || pesudoStyles.size() == 0) {
            return;
        }
        if (this.mPesudoStatus == null) {
            this.mPesudoStatus = new PesudoStatus();
        }
        Map<String, Object> updateStatusAndGetUpdateStyles = this.mPesudoStatus.updateStatusAndGetUpdateStyles(str, z, pesudoStyles, styles.getPesudoResetStyles());
        if (updateStatusAndGetUpdateStyles != null) {
            if (z) {
                this.mPseudoResetGraphicSize = new GraphicSize(getLayoutSize().getWidth(), getLayoutSize().getHeight());
                if (updateStatusAndGetUpdateStyles.keySet().contains("width")) {
                    getLayoutSize().setWidth(WXViewInnerUtils.getRealPxByWidth(getInstance(), WXUtils.parseFloat(styles.getPesudoResetStyles().get("width:active")), getViewPortWidth()));
                } else if (updateStatusAndGetUpdateStyles.keySet().contains("height")) {
                    getLayoutSize().setHeight(WXViewInnerUtils.getRealPxByWidth(getInstance(), WXUtils.parseFloat(styles.getPesudoResetStyles().get("height:active")), getViewPortWidth()));
                }
            } else {
                GraphicSize graphicSize = this.mPseudoResetGraphicSize;
                if (graphicSize != null) {
                    setLayoutSize(graphicSize);
                }
            }
        }
        updateStyleByPesudo(updateStatusAndGetUpdateStyles);
    }

    private void updateStyleByPesudo(Map<String, Object> map) {
        IWXBridgeManager wXBridgeManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530192dd", new Object[]{this, map});
            return;
        }
        new GraphicActionUpdateStyle(getInstance(), getRef(), map, getPadding(), getMargin(), getBorder(), true).executeActionOnRender();
        if ((getLayoutWidth() == 0.0f && getLayoutWidth() == 0.0f) || (wXBridgeManager = WXSDKManager.getInstance().getWXBridgeManager()) == null) {
            return;
        }
        wXBridgeManager.setStyleWidth(getInstanceId(), getRef(), getLayoutWidth());
        wXBridgeManager.setStyleHeight(getInstanceId(), getRef(), getLayoutHeight());
    }

    public int getStickyOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7bab4dcc", new Object[]{this})).intValue() : this.mStickyOffset;
    }

    public boolean canRecycled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c236802c", new Object[]{this})).booleanValue() : (!isFixed() || !isSticky()) && getAttrs().canRecycled() && recycleWithAnimation();
    }

    private boolean recycleWithAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dfe9496", new Object[]{this})).booleanValue() : !checkUseAnimation() || !useAnimation();
    }

    private boolean checkUseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a734f0", new Object[]{this})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        return wxConfigAdapter == null || !"false".equals(wxConfigAdapter.getConfig("android_weex_common_config", "checkAnimationWhenRecycle", "true"));
    }

    public boolean useAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a5a1bc8", new Object[]{this})).booleanValue() : this.useAnimations;
    }

    public void setStickyOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554ecbe", new Object[]{this, new Integer(i)});
        } else {
            this.mStickyOffset = i;
        }
    }

    public boolean isLayerTypeEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64b9366b", new Object[]{this})).booleanValue() : getInstance().t();
    }

    public void setNeedLayoutOnAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e814b6a", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedLayoutOnAnimation = z;
        }
    }

    public void notifyNativeSizeChanged(int i, int i2) {
        IWXBridgeManager wXBridgeManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a27e37a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.mNeedLayoutOnAnimation || (wXBridgeManager = WXSDKManager.getInstance().getWXBridgeManager()) == null) {
        } else {
            wXBridgeManager.setStyleWidth(getInstanceId(), getRef(), i);
            wXBridgeManager.setStyleHeight(getInstanceId(), getRef(), i2);
        }
    }

    public boolean isRippleEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db70a6f2", new Object[]{this})).booleanValue();
        }
        try {
            return WXUtils.getBoolean(getAttrs().get(Constants.Name.RIPPLE_ENABLED), false).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean isWaste() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d626c9b", new Object[]{this})).booleanValue() : this.waste;
    }

    public void setWaste(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e5e255", new Object[]{this, new Boolean(z)});
        } else if (this.waste == z) {
        } else {
            this.waste = z;
            if (!WXBasicComponentType.RECYCLE_LIST.equals(getParent().getComponentType())) {
                NativeRenderObjectUtils.nativeRenderObjectChildWaste(getRenderObjectPtr(), z);
            }
            if (z) {
                getStyles().put("visibility", (Object) "hidden");
                if (mo1286getHostView() == null) {
                    if (this.mLazy) {
                        return;
                    }
                    lazy(true);
                    return;
                }
                mo1286getHostView().setVisibility(8);
                return;
            }
            getStyles().put("visibility", (Object) "visible");
            if (mo1286getHostView() == null) {
                if (!this.mLazy) {
                    return;
                }
                if (this.mParent != null && this.mParent.isLazy()) {
                    lazy(false);
                    return;
                } else {
                    initLazyComponent(this, this.mParent);
                    return;
                }
            }
            mo1286getHostView().setVisibility(0);
        }
    }

    public static void initLazyComponent(WXComponent wXComponent, WXVContainer wXVContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c71be7e", new Object[]{wXComponent, wXVContainer});
        } else if (!wXComponent.isLazy() && wXComponent.mo1286getHostView() != null) {
        } else {
            wXComponent.lazy(false);
            if (wXVContainer != null) {
                wXVContainer.createChildViewAt(wXVContainer.indexOf(wXComponent));
            } else {
                wXComponent.createView();
            }
            wXComponent.applyLayoutAndEvent(wXComponent);
            wXComponent.bindData(wXComponent);
        }
    }

    public String getViewTreeKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23740073", new Object[]{this});
        }
        if (this.mViewTreeKey == null) {
            if (getParent() == null) {
                this.mViewTreeKey = hashCode() + "_" + getRef();
            } else {
                this.mViewTreeKey = hashCode() + "_" + getRef() + "_" + getParent().indexOf(this);
            }
        }
        return this.mViewTreeKey;
    }

    public WXTransition getTransition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXTransition) ipChange.ipc$dispatch("4272d89b", new Object[]{this}) : this.mTransition;
    }

    public void setTransition(WXTransition wXTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72f08bb", new Object[]{this, wXTransition});
        } else {
            this.mTransition = wXTransition;
        }
    }

    public void addAnimationForElement(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cb6628", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            if (this.animations == null) {
                this.animations = new ConcurrentLinkedQueue<>();
            }
            this.animations.add(new Pair<>(getRef(), map));
        }
    }

    private void parseAnimation() {
        WXAnimationBean createAnimationBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d48e18", new Object[]{this});
            return;
        }
        ConcurrentLinkedQueue<Pair<String, Map<String, Object>>> concurrentLinkedQueue = this.animations;
        if (concurrentLinkedQueue == null) {
            return;
        }
        Iterator<Pair<String, Map<String, Object>>> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            Pair<String, Map<String, Object>> next = it.next();
            if (!TextUtils.isEmpty((CharSequence) next.first) && (createAnimationBean = createAnimationBean((String) next.first, (Map) next.second)) != null) {
                new GraphicActionAnimation(getInstance(), getRef(), createAnimationBean).executeAction();
            }
        }
        this.animations.clear();
    }

    private WXAnimationBean createAnimationBean(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXAnimationBean) ipChange.ipc$dispatch("a4edf941", new Object[]{this, str, map});
        }
        if (map != null) {
            try {
                Object obj = map.get("transform");
                if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                    String str2 = (String) map.get("transformOrigin");
                    WXAnimationBean wXAnimationBean = new WXAnimationBean();
                    int layoutWidth = (int) getLayoutWidth();
                    int layoutHeight = (int) getLayoutHeight();
                    wXAnimationBean.styles = new WXAnimationBean.Style();
                    wXAnimationBean.styles.init(str2, (String) obj, layoutWidth, layoutHeight, WXSDKManager.getInstanceViewPortWidth(getInstanceId()), getInstance());
                    return wXAnimationBean;
                }
            } catch (RuntimeException e) {
                WXLogUtils.e("", e);
            }
        }
        return null;
    }

    public void lazy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efff3439", new Object[]{this, new Boolean(z)});
        } else {
            this.mLazy = z;
        }
    }

    public long getRenderObjectPtr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ac63efe", new Object[]{this})).longValue();
        }
        if (getBasicComponentData().isRenderPtrEmpty()) {
            getBasicComponentData().setRenderObjectPr(NativeRenderObjectUtils.nativeGetRenderObject(getInstanceId(), getRef()));
        }
        return getBasicComponentData().getRenderObjectPr();
    }

    public void updateNativeAttr(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e5cb7e", new Object[]{this, str, obj});
        } else if (str == null) {
        } else {
            if (obj == null) {
                obj = "";
            }
            getBasicComponentData().getAttrs().put(str, obj);
            NativeRenderObjectUtils.nativeUpdateRenderObjectAttr(getRenderObjectPtr(), str, obj.toString());
        }
    }

    public void nativeUpdateAttrs(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7481c", new Object[]{this, map});
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                updateNativeAttr(entry.getKey(), entry.getValue());
            }
        }
    }

    public void updateNativeStyle(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77853e7e", new Object[]{this, str, obj});
        } else if (str == null) {
        } else {
            if (obj == null) {
                obj = "";
            }
            getBasicComponentData().getStyles().put(str, obj);
            NativeRenderObjectUtils.nativeUpdateRenderObjectStyle(getRenderObjectPtr(), str, obj.toString());
        }
    }

    public void updateNativeStyles(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac75ed9c", new Object[]{this, map});
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                updateNativeStyle(entry.getKey(), entry.getValue());
            }
        }
    }

    public void addLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c05be57", new Object[]{this, str});
        } else if (getInstance() == null) {
        } else {
            getInstance().b(str);
        }
    }

    public void removeLayerOverFlowListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0044e94", new Object[]{this, str});
        } else if (getInstance() == null) {
        } else {
            getInstance().c(str);
        }
    }
}
