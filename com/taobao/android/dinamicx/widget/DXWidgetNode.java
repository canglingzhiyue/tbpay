package com.taobao.android.dinamicx.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Looper;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXGeneralMsgCenterEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fpr;
import tb.fqe;
import tb.fqi;
import tb.fqo;
import tb.fqp;
import tb.fqs;
import tb.fqt;
import tb.fuw;
import tb.fzi;
import tb.fzj;
import tb.fzk;
import tb.fzm;
import tb.fzn;
import tb.gay;
import tb.gba;
import tb.gbb;
import tb.gbg;
import tb.gbh;
import tb.gfl;
import tb.gfn;
import tb.ggk;
import tb.ivg;
import tb.kge;
import tb.mto;
import tb.ter;

/* loaded from: classes.dex */
public class DXWidgetNode implements ak, bi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCESSIBILITY_AUTO = 3;
    public static final int ACCESSIBILITY_DEF = -1;
    public static final int ACCESSIBILITY_OFF = 0;
    public static final int ACCESSIBILITY_OFF_CHILD = 2;
    public static final int ACCESSIBILITY_ON = 1;
    public static final int BORDER_TYPE_DASH = 1;
    public static final int BORDER_TYPE_NORMAL = 0;
    public static final int DIRECTION_NOT_SET = -1;
    public static final int DXGRAVITY_RLT_DELTA = 6;
    public static final int DXGravityCenter = 4;
    public static final int DXGravityCenterBottom = 5;
    public static final int DXGravityCenterTop = 3;
    public static final int DXGravityLeftBottom = 2;
    public static final int DXGravityLeftCenter = 1;
    public static final int DXGravityLeftTop = 0;
    public static final int DXGravityRightBottom = 8;
    public static final int DXGravityRightCenter = 7;
    public static final int DXGravityRightTop = 6;
    public static final long DXVIEW_ISRELAYOUTBOUNDARY = 350727206366142343L;
    public static final long DXVIEW_NEEDPOSTPREPAREBINDEVENT = -4260932846646087288L;
    public static final long DXVIEW_ONCREATEVIEW = 188822591186414296L;
    public static final long DXVIEW_ROTATIONX = 4617826730867065809L;
    public static final long DXVIEW_ROTATIONY = 4617826730867066322L;
    public static final long DXVIEW_ROTATIONZ = 4617826730867066835L;
    public static final long DXVIEW_SCALEX = 10147632719833830L;
    public static final long DXVIEW_SCALEY = 10147632719833895L;
    private static final long DXVIEW_TBORDERJSON = -1688385493169466985L;
    public static final long DXVIEW_TRANSLATIONX = -5563329329641359597L;
    public static final long DXVIEW_TRANSLATIONY = -5563329329641355500L;
    public static final int DX_PROPERTY_MASK_NODE_ACCESSIBILITY = 32;
    public static final int DX_PROPERTY_MASK_NODE_ANIMATION = 256;
    public static final int DX_PROPERTY_MASK_NODE_BORDER = 16;
    public static final int DX_PROPERTY_MASK_NODE_COMMON = 64;
    public static final int DX_PROPERTY_MASK_NODE_CORNER = 8;
    public static final int DX_PROPERTY_MASK_NODE_FRAME = 128;
    public static final int DX_PROPERTY_MASK_NODE_LOW_FREQUENCY_PROPERTY = 4;
    public static final int DX_PROPERTY_MASK_NODE_MARGIN = 2;
    public static final int DX_PROPERTY_MASK_NODE_PADDING = 1;
    public static final int DX_VIEW_EVENTRESPONSEMODE_DISABLE_ALL = 3;
    public static final int DX_VIEW_EVENTRESPONSEMODE_DISABLE_CHILD = 2;
    public static final int DX_VIEW_EVENTRESPONSEMODE_DISABLE_SELF = 1;
    public static final int DX_VIEW_EVENTRESPONSEMODE_NORMAL = 0;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ALPHA = 1;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_HEIGHT = 4;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ROTATION_X = 256;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ROTATION_Y = 512;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_ROTATION_Z = 1024;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_SCALE_X = 8;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_SCALE_Y = 16;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_TRANSLATION_X = 32;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_TRANSLATION_Y = 64;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_TRANSLATION_Z = 128;
    public static final int DX_WIDGET_NODE_ANIMATING_PROPERTY_WIDTH = 2;
    public static final int DX_WIDGET_NODE_ATTR_PARSED = 2;
    public static final int DX_WIDGET_NODE_BIND_CHILD_CALLED = 4096;
    public static final int DX_WIDGET_NODE_BIND_CHILD_CALLED_NEED_CHECK = 524288;
    public static final int DX_WIDGET_NODE_EFFECT_EXECUTED = 1048576;
    public static final int DX_WIDGET_NODE_FLATTEND = 128;
    public static final int DX_WIDGET_NODE_FORCE_LAYOUT = 16384;
    public static final int DX_WIDGET_NODE_IS_PRE_RENDERED = 8192;
    public static final int DX_WIDGET_NODE_LAID_OUT = 32;
    public static final int DX_WIDGET_NODE_MEASURED = 8;
    public static final int DX_WIDGET_NODE_NEED_AP_PARSED = 2097152;
    public static final int DX_WIDGET_NODE_NEED_FLATTEN = 64;
    public static final int DX_WIDGET_NODE_NEED_LAYOUT = 16;
    public static final int DX_WIDGET_NODE_NEED_MEASURE = 4;
    public static final int DX_WIDGET_NODE_NEED_PARSE = 1;
    public static final int DX_WIDGET_NODE_NEED_RENDER = 256;
    public static final int DX_WIDGET_NODE_PARSED = 32768;
    public static final int DX_WIDGET_NODE_PARSE_IN_MEASURE = 1024;
    public static final int DX_WIDGET_NODE_RENDERED = 512;
    public static final int DX_WIDGET_NODE_STATUS_DEFAULT = -1;
    public static final int DX_WIDGET_NODE_STATUS_EXPAND = 1;
    public static final int DX_WIDGET_NODE_STATUS_FLATTEN = 2;
    public static final int DX_WIDGET_NODE_STATUS_SKIP = 3;
    public static final int DX_WIDGET_NODE_VARIABLE_PARSED = 131072;
    public static final int DX_WIDGET_NODE_VIEW_FROM_CACHE = 65536;
    public static final int DX_WIDGET_NODE_VISIBILITY_PARSED = 2048;
    public static final int GONE = 2;
    public static final int INVISIBLE = 1;
    public static final int IS_ACCESSIBILITY_FALSE = 0;
    public static final int IS_ACCESSIBILITY_TRUE = 1;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    public static final int LAYOUT_GRAVITY_INIT_MASK = 1;
    public static final int LISTDATA_INIT_MASK = 2;
    public static final int MATCH_CONTENT = -2;
    public static final int MATCH_PARENT = -1;
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    public static final int MEASURED_SIZE_MASK = 16777215;
    public static final int MEASURED_STATE_MASK = -16777216;
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    public static final int NO = 0;
    public static final int POOL_SIZE_MAX = 10;
    public static final int POOL_SIZE_MID = 6;
    public static final int POOL_SIZE_MIN = 3;
    public static final int TAG_WIDGET_NODE;
    public static final int VISIBLE = 0;
    public static final int YES = 1;
    private static ThreadLocal<com.taobao.android.dinamicx.model.a> attributeThreadLocal;
    private static boolean sAlwaysRemeasureExactly;
    public int animationFlags;
    private fzi animationHolder;
    public JSONObject animationObj;
    private int autoId;
    public Map<String, fqe> bindingXExecutingMap;
    public Map<String, fqe> bindingXSpecMap;
    public List<DXWidgetNode> children;
    private int childrenCount;
    public DXRuntimeContext dXRuntimeContext;
    private com.taobao.android.dinamicx.eventchain.k dxEventChains;
    private byte[] dxExprBytes;
    public av dxNodeAccessibility;
    public aw dxNodeAnimation;
    public ax dxNodeBorder;
    public ay dxNodeCommon;
    public az dxNodeConstantProperty;
    public ba dxNodeCorner;
    public bb dxNodeFrame;
    public bc dxNodeLowFrequencyProperty;
    public bd dxNodeMargin;
    public be dxNodePadding;
    private DXWidgetNode dxRootWidgetCache;
    public bg dxv3VariableInfo;
    public gfl dxv4Properties;
    private JSONArray exportMethods;
    public z flattenNode;
    private boolean hasHandleDark;
    public boolean isEnableButter;
    public boolean isFlatten;
    public boolean isViewStub;
    private int lastAutoId;
    public int layoutHeight;
    public int layoutWidth;
    private View nativeView;
    public boolean needSetBackground;
    public bh originInfo;
    public DXWidgetNode parentWidget;
    public int privateFlags;
    private int propertyDeepCloneFlag;
    public int propertyInitFlag;
    private com.taobao.android.dinamicx.model.a realLayoutAttribute;
    private WeakReference<DXWidgetNode> referenceNode;
    public com.taobao.android.dinamicx.model.b<Double> screenAttrNode;
    private WeakReference<DXWidgetNode> sourceWidgetWR;
    private bq strategy;
    public String userId;
    private ViewGroup viewContainer;
    private fqp viewStubExprNode;
    private WeakReference<View> weakView;
    private int status = -1;
    private boolean isAlreadyExpand = false;
    private int sourceAutoId = -1;
    private boolean viewMatrixChanged = false;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXAnimatingPropertyFlag {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXGravity {
    }

    /* loaded from: classes.dex */
    public static class DXMeasureSpec {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int AT_MOST = Integer.MIN_VALUE;
        public static final int EXACTLY = 1073741824;
        public static final int UNSPECIFIED = 0;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes5.dex */
        public @interface MeasureSpecMode {
        }

        static {
            kge.a(1587378483);
        }

        public static int a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : i & (-1073741824);
        }

        public static int a(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i & 1073741823) | (i2 & (-1073741824));
        }

        public static int b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : i & 1073741823;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXNodePropertyInitMask {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXWidgetNodeStatFlag {
    }

    public static int combineMeasuredStates(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c972161", new Object[]{new Integer(i), new Integer(i2)})).intValue() : i | i2;
    }

    public static int getAbsoluteGravity(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db55acfb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i2 != 0 && i2 == 1) ? (i == 0 || i == 1 || i == 2) ? i + 6 : (i == 6 || i == 7 || i == 8) ? i - 6 : i : i;
    }

    public void bindRenderOptions(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca762e", new Object[]{this, dXRenderOptions});
        }
    }

    public boolean extraHandleDark() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe5f779", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue() : mto.a.GEO_NOT_SUPPORT;
    }

    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (20052926345925L == j || 9346582897824575L == j || -916628110244908525L == j || -4674119579031497081L == j || -2641581645694792774L == j || 6506044224063169535L == j || -378913133726214547L == j || 3229586316762092001L == j || -2632461973017864940L == j || -4745829179314597287L == j || 4879707785646574221L == j || -3218010051991756042L == j || 7504432960089273802L == j || 5802348655878590802L == j || -8019934667170236535L == j || -8020113231441560440L == j || 1844153004063100714L == j || -6579663421190292502L == j || -5241271604340946425L == j || 3998176004939777025L == j) {
            return 0;
        }
        if (16887479372907L == j || 4804789929613330386L == j || j == -6311293910063768578L) {
            return 1;
        }
        if (gay.DXIMAGESPAN_CORNERRADIUS == j || -7043958449911898942L == j || 8679583519247168310L == j || -3738348576243028217L == j || 1691221861925381243L == j) {
        }
        return 0;
    }

    public JSONArray getDefaultValueForListAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a3068013", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public long getDefaultValueForLongAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4ae4a1", new Object[]{this, new Long(j)})).longValue();
        }
        return 0L;
    }

    public JSONObject getDefaultValueForMapAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("638dd53", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public Object getDefaultValueForObjectAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("68bb4468", new Object[]{this, new Long(j)});
        }
        return null;
    }

    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : "";
    }

    public int getNextLocationOffset(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("248935aa", new Object[]{this, dXWidgetNode})).intValue();
        }
        return 0;
    }

    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        }
    }

    public void onBeforeBindChildDataWithButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        }
    }

    public void onBeginParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83893ed0", new Object[]{this});
        }
    }

    public void onBeginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f4e04", new Object[]{this, new Boolean(z)});
        }
    }

    public void onDiff(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ad7d84", new Object[]{this, dXWidgetNode});
        }
    }

    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        }
    }

    public void onEndParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e57e52", new Object[]{this, new Boolean(z)});
        }
    }

    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        }
    }

    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        }
    }

    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        }
    }

    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        }
    }

    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        }
    }

    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        }
    }

    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        }
    }

    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        }
    }

    public void onSetUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671484b", new Object[]{this, new Long(j), list});
        }
    }

    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 20;
    }

    public void setAlreadyExpand(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaea55d", new Object[]{this, new Boolean(z)});
        }
    }

    public void setClipChildren(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad724adc", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(1797351762);
        kge.a(349752956);
        kge.a(33300609);
        kge.a(-1569096886);
        TAG_WIDGET_NODE = R.id.dinamicXWidgetNodeTag;
        sAlwaysRemeasureExactly = false;
        attributeThreadLocal = new ThreadLocal<>();
    }

    public void setEnableButter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76eef68", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableButter = z;
        }
    }

    public boolean isEnableButter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a061a1b8", new Object[]{this})).booleanValue() : this.isEnableButter;
    }

    public fqp getViewStubExprNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fqp) ipChange.ipc$dispatch("69f87c9a", new Object[]{this}) : this.viewStubExprNode;
    }

    public boolean isViewStub() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("308da248", new Object[]{this})).booleanValue() : this.isViewStub;
    }

    public void updateStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d1e21", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public boolean isAlreadyExpand() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5597093", new Object[]{this})).booleanValue() : this.isAlreadyExpand;
    }

    public void setStrategy(bq bqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0066a9e", new Object[]{this, bqVar});
        } else {
            this.strategy = bqVar;
        }
    }

    public ViewGroup getViewContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("bb9ebe48", new Object[]{this}) : this.viewContainer;
    }

    public void setViewContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2efc0591", new Object[]{this, view});
        } else {
            this.viewContainer = (ViewGroup) view;
        }
    }

    public void handleViewStub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d007642", new Object[]{this});
        } else {
            this.isViewStub = true;
        }
    }

    public void setViewStubExprNode(fqp fqpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77da2fe", new Object[]{this, fqpVar});
        } else {
            this.viewStubExprNode = fqpVar;
        }
    }

    public com.taobao.android.dinamicx.eventchain.k getDxEventChains() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.eventchain.k) ipChange.ipc$dispatch("ee0cea26", new Object[]{this}) : this.dxEventChains;
    }

    public void setDxEventChains(com.taobao.android.dinamicx.eventchain.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd26df6", new Object[]{this, kVar});
        } else {
            this.dxEventChains = kVar;
        }
    }

    public int getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b77db82", new Object[]{this})).intValue();
        }
        ay ayVar = this.dxNodeCommon;
        if (ayVar != null) {
            return ayVar.f12070a;
        }
        return 0;
    }

    public int getVirtualChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f140ee82", new Object[]{this})).intValue() : this.childrenCount;
    }

    public DXWidgetNode getChildAt(int i) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("2070a3e2", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.childrenCount && (list = this.children) != null) {
            return list.get(i);
        }
        return null;
    }

    public int getSuggestedMinimumHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c99447e2", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.f;
        }
        return 0;
    }

    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            onLayout(setFrame(i, i2, i3, i4), i, i2, i3, i4);
        }
    }

    public final void layout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1242f1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        bq bqVar = this.strategy;
        if (bqVar != null) {
            bqVar.a(this, i, i2, i3, i4);
        } else {
            defaultLayout(i, i2, i3, i4);
        }
    }

    public void defaultLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db45f92", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            if ((this.privateFlags & 4) != 0) {
                onMeasure(getOldWidthMeasureSpec(), getOldHeightMeasureSpec());
                this.privateFlags &= -5;
                this.privateFlags |= 8;
                if (fqi.ae()) {
                    this.privateFlags |= 16;
                }
            }
            boolean frame = setFrame(i, i2, i3, i4);
            if (frame || (this.privateFlags & 16) == 16) {
                onLayout(frame, i, i2, i3, i4);
                this.privateFlags &= -17;
                if (this.dXRuntimeContext != null && this.dXRuntimeContext.G()) {
                    this.privateFlags |= 256;
                }
            }
            this.privateFlags &= -16385;
            this.privateFlags |= 32;
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext == null || dXRuntimeContext.n() == null) {
                return;
            }
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_LAYOUT, 80007);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(e);
            dXRuntimeContext.n().c.add(aVar);
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219b20f6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        if (getLeft() == i && getRight() == i3 && getTop() == i2 && getBottom() == i4) {
            return false;
        }
        setLeft(i);
        setTop(i2);
        setRight(i3);
        setBottom(i4);
        return true;
    }

    public List<DXWidgetNode> getChildren() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this}) : this.children;
    }

    public int getChildrenCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62bc4e14", new Object[]{this})).intValue() : this.childrenCount;
    }

    public final void addChild(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bac576d", new Object[]{this, dXWidgetNode});
        } else {
            addChild(dXWidgetNode, true);
        }
    }

    public final void addChild(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29df4907", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || dXWidgetNode == this) {
        } else {
            if (this.children == null) {
                this.children = new ArrayList();
                this.childrenCount = 0;
            }
            this.children.add(dXWidgetNode);
            this.childrenCount++;
            dXWidgetNode.parentWidget = this;
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext == null || !z) {
                return;
            }
            dXWidgetNode.dXRuntimeContext = dXRuntimeContext.a(dXWidgetNode);
        }
    }

    public final DXWidgetNode removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("6d316410", new Object[]{this, new Integer(i)});
        }
        List<DXWidgetNode> list = this.children;
        if (list == null) {
            return null;
        }
        if (i >= list.size() || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + "  size: " + this.children.size());
        }
        this.childrenCount--;
        return this.children.remove(i);
    }

    public void insertChild(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a834901e", new Object[]{this, dXWidgetNode, new Integer(i)});
        } else {
            insertChild(dXWidgetNode, i, true);
        }
    }

    public void insertChild(DXWidgetNode dXWidgetNode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e5e2676", new Object[]{this, dXWidgetNode, new Integer(i), new Boolean(z)});
        } else if (dXWidgetNode == null || dXWidgetNode == this || i > this.childrenCount) {
        } else {
            if (this.children == null) {
                this.children = new ArrayList();
                this.childrenCount = 0;
            }
            this.children.add(i, dXWidgetNode);
            this.childrenCount++;
            dXWidgetNode.parentWidget = this;
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext == null || !z) {
                return;
            }
            dXWidgetNode.dXRuntimeContext = dXRuntimeContext.a(dXWidgetNode);
        }
    }

    public void removeAllChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86c1da6", new Object[]{this});
            return;
        }
        List<DXWidgetNode> list = this.children;
        if (list == null) {
            this.childrenCount = 0;
            return;
        }
        list.clear();
        this.childrenCount = 0;
    }

    public void addLanguageConfig(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de07c864", new Object[]{this, str, jSONObject});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        if (this.dxNodeConstantProperty.g == null) {
            this.dxNodeConstantProperty.g = new ConcurrentHashMap();
        }
        this.dxNodeConstantProperty.g.put(str, jSONObject);
    }

    public synchronized void addLanguageConfigSync(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2188c9", new Object[]{this, str, jSONObject});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        if (this.dxNodeConstantProperty.g == null) {
            this.dxNodeConstantProperty.g = new ConcurrentHashMap();
        }
        this.dxNodeConstantProperty.g.put(str, jSONObject);
    }

    public String getLanguageString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7890ba46", new Object[]{this, str, str2});
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        if (this.dxNodeConstantProperty.g == null) {
            ter.b(this);
        }
        if (this.dxNodeConstantProperty.g == null) {
            return "";
        }
        JSONObject jSONObject = this.dxNodeConstantProperty.g.get(str);
        String str3 = jSONObject == null ? "" : (String) jSONObject.get(str2);
        if (!TextUtils.isEmpty(str3) || str.equals("zh_CN")) {
            return str3;
        }
        JSONObject jSONObject2 = this.dxNodeConstantProperty.g.get("zh_CN");
        return jSONObject2 == null ? "" : (String) jSONObject2.get(str2);
    }

    public void removeChildWithAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4b3bb4", new Object[]{this, new Integer(i)});
        } else if (this.children != null && this.childrenCount != 0) {
            for (int i2 = 0; i2 < this.childrenCount; i2++) {
                if (this.children.get(i2).autoId == i) {
                    this.children.remove(i2);
                    this.childrenCount--;
                    return;
                }
            }
        }
    }

    public int replaceChild(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f51762", new Object[]{this, dXWidgetNode, dXWidgetNode2})).intValue();
        }
        if (!(this instanceof m) || dXWidgetNode2 == null) {
            return -1;
        }
        while (true) {
            if (i >= getChildrenCount()) {
                i = -1;
                break;
            } else if (getChildAt(i).getAutoId() == dXWidgetNode2.getAutoId()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            removeChildWithAutoId(dXWidgetNode2.getAutoId());
            insertChild(dXWidgetNode, i);
        }
        return i;
    }

    public void newEventHandlersExprNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a77b82", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.f12071a = new com.taobao.android.dinamicx.model.b<>(i);
    }

    public void newVariableInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9a8a91", new Object[]{this});
        } else {
            this.dxv3VariableInfo = new bg();
        }
    }

    public bg getDxv3VariableInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bg) ipChange.ipc$dispatch("442c694c", new Object[]{this}) : this.dxv3VariableInfo;
    }

    public LongSparseArray<fqp> getEventHandlersExprNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("76c28d1b", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.f12071a;
        }
        return null;
    }

    public void newConstAttributeMap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a943ed9", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.h = new com.taobao.android.dinamicx.model.b<>(i);
    }

    public LongSparseArray<ivg> getConstAttributeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("4a2b5ae4", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.h;
        }
        return null;
    }

    public void newDataParsersExprNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cd80db", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.b = new com.taobao.android.dinamicx.model.b<>(i);
    }

    public LongSparseArray<fqp> getDataParsersExprNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("a61a6022", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.b;
        }
        return null;
    }

    public com.taobao.android.dinamicx.model.b<Double> getScreenAttrNodeArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("6e70c1d3", new Object[]{this}) : this.screenAttrNode;
    }

    public boolean validScreenAttrNodeArray() {
        com.taobao.android.dinamicx.model.b<Double> bVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81f2ed69", new Object[]{this})).booleanValue() : !com.taobao.android.dinamicx.model.f.e() && (bVar = this.screenAttrNode) != null && bVar.size() != 0 && getStatInPrivateFlags(2097152);
    }

    public void initScreenAttrNodeArray(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc70b52", new Object[]{this, new Integer(i)});
        } else if (com.taobao.android.dinamicx.model.f.e() || this.screenAttrNode != null) {
        } else {
            if (i <= 0) {
                i = 10;
            }
            this.screenAttrNode = new com.taobao.android.dinamicx.model.b<>(i);
        }
    }

    public boolean needParseAP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee07eb37", new Object[]{this})).booleanValue() : validScreenAttrNodeArray() && getStatInPrivateFlags(2097152) && this.dXRuntimeContext.G();
    }

    public void parseAp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b882d5c9", new Object[]{this});
            return;
        }
        if (getScreenAttrNodeArray() != null) {
            for (int i = 0; i < getScreenAttrNodeArray().size(); i++) {
                long keyAt = getScreenAttrNodeArray().keyAt(i);
                setIntAttribute(keyAt, gbg.a(getEngine(), getDXRuntimeContext().m(), String.valueOf(getScreenAttrNodeArray().get(keyAt)), 0));
            }
            setStatFlag(4);
        }
        unsetStatFlag(2097152);
    }

    public void newEnumMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f165e2", new Object[]{this});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.c = new com.taobao.android.dinamicx.model.b<>();
    }

    public com.taobao.android.dinamicx.model.b<Map<String, Integer>> getEnumMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("206ceef4", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.c;
        }
        return null;
    }

    public int getAutoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c55fce9a", new Object[]{this})).intValue() : this.autoId;
    }

    public void setAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cffecb0", new Object[]{this, new Integer(i)});
        } else {
            this.autoId = i;
        }
    }

    public DXRuntimeContext getDXRuntimeContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRuntimeContext) ipChange.ipc$dispatch("a960eebf", new Object[]{this}) : this.dXRuntimeContext;
    }

    public void setDXRuntimeContext(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff05745", new Object[]{this, dXRuntimeContext});
        } else {
            this.dXRuntimeContext = dXRuntimeContext;
        }
    }

    public WeakReference<View> getWRView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("295b23cb", new Object[]{this});
        }
        if (this.isEnableButter) {
            return this.weakView;
        }
        if (bx.p() && getFlattenNode() != null) {
            return getFlattenNode().u();
        }
        return this.weakView;
    }

    public View getNativeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("89cf52db", new Object[]{this});
        }
        if (this.isEnableButter) {
            return this.nativeView;
        }
        if (bx.p() && getFlattenNode() != null) {
            return getFlattenNode().d();
        }
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setWRView(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4aa8b5", new Object[]{this, weakReference});
        } else {
            this.weakView = weakReference;
        }
    }

    public final void measure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bc8605", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        bq bqVar = this.strategy;
        if (bqVar != null) {
            bqVar.a(this, i, i2);
        } else {
            defaultMeasure(i, i2);
        }
    }

    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            onMeasure(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
        if (r2 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (r6 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void defaultMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXWidgetNode.defaultMeasure(int, int):void");
    }

    public static int resolveSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d52ae167", new Object[]{new Integer(i), new Integer(i2)})).intValue() : resolveSizeAndState(i, i2, 0) & 16777215;
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d425ea8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int a2 = DXMeasureSpec.a(i2);
        int b2 = DXMeasureSpec.b(i2);
        if (a2 != Integer.MIN_VALUE) {
            if (a2 == 1073741824) {
                i = b2;
            }
        } else if (b2 < i) {
            i = 16777216 | b2;
        }
        return i | ((-16777216) & i3);
    }

    public static int getDefaultSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3e116c6", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || (mode != 0 && mode == 1073741824)) ? View.MeasureSpec.getSize(i2) : i;
    }

    public final int getMeasuredState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1cd77af", new Object[]{this})).intValue() : (getMeasuredWidthAndState() & (-16777216)) | ((getMeasuredHeightAndState() >> 16) & InputDeviceCompat.SOURCE_ANY);
    }

    public final DXWidgetNode getVirtualChildAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("8aa58ee1", new Object[]{this, new Integer(i)}) : getChildAt(i);
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public final int getMeasuredHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e10b2f7d", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.f & 16777215;
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public final int getMeasuredWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b0f3e64", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.e & 16777215;
        }
        return 0;
    }

    public final int getMeasuredWidthAndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82d9e47e", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.e;
        }
        return 0;
    }

    public final int getMeasuredHeightAndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e503ac97", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.f;
        }
        return 0;
    }

    public int getWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : getRight() - getLeft();
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : getBottom() - getTop();
    }

    public final int getSuggestedMinimumWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f055f", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.g;
        }
        return 0;
    }

    public final void setMeasuredDimension(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926701a5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setNodeFrameBeforeCheck();
        bb bbVar = this.dxNodeFrame;
        bbVar.e = i;
        bbVar.f = i2;
    }

    public void setViewMatrixChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3fc9e1", new Object[]{this, new Boolean(z)});
        } else {
            this.viewMatrixChanged = z;
        }
    }

    public boolean isViewMatrixChanged() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("14b8cf8f", new Object[]{this})).booleanValue() : (this.viewMatrixChanged || getStatInAnimationFlag(2097152)) && !com.taobao.android.dinamicx.model.f.e();
    }

    private View getRealView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("849d5722", new Object[]{this});
        }
        if (bx.p()) {
            if (getFlattenNode() != null) {
                return getFlattenNode().d();
            }
            return null;
        }
        WeakReference<View> weakReference = this.weakView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void createNativeView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1162a9", new Object[]{this, context});
        } else if (getNativeView() != null) {
        } else {
            View onCreateView = onCreateView(context);
            this.weakView = new WeakReference<>(onCreateView);
            this.nativeView = onCreateView;
            onCreateView.setTag(TAG_WIDGET_NODE, this);
            postEvent(new DXEvent(DXVIEW_ONCREATEVIEW));
        }
    }

    public final View createView(Context context) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View realView = getRealView();
        if (realView == null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread() && getDXRuntimeContext() != null && getDXRuntimeContext().C() != null && getDXRuntimeContext().C().b() != null && getDXRuntimeContext().C().b().v() != null && getDXRuntimeContext().C().l() && (a2 = getDXRuntimeContext().C().b().v().a(getDXRuntimeContext(), getClass())) != null) {
                getReferenceNode();
                this.privateFlags |= 256;
                if (bx.p()) {
                    gbh.a(getFlattenNode(), a2);
                } else {
                    gbh.a(a2, (bi) this);
                }
                this.weakView = new WeakReference<>(a2);
                if (isSoftwareRender()) {
                    a2.setLayerType(1, null);
                }
                postEvent(new DXEvent(DXVIEW_ONCREATEVIEW));
                setStatFlag(65536);
                DinamicXEngine.j();
                return a2;
            }
            realView = (isFlatten() ? getReferenceNode() : this).onCreateView(context);
            this.privateFlags |= 256;
            if (realView == null && fqi.a(this)) {
                return null;
            }
            if (bx.p()) {
                gbh.a(getFlattenNode(), realView);
            } else {
                gbh.a(realView, (bi) this);
            }
            this.weakView = new WeakReference<>(realView);
            if (isSoftwareRender()) {
                realView.setLayerType(1, null);
            }
            postEvent(new DXEvent(DXVIEW_ONCREATEVIEW));
        }
        return realView;
    }

    public final View _createViewOnlyForCache(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9e41cfe", new Object[]{this, context}) : onCreateView(context);
    }

    public final void renderView(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8c49a6", new Object[]{this, context});
            return;
        }
        try {
            View realView = getRealView();
            if (realView == null) {
                return;
            }
            if ((this.privateFlags & 256) != 0) {
                DXTraceUtil.a(" onRenderView Before ");
                setRealViewVisibility(realView, getVisibility());
                renderAnimationSupportProperty(realView);
                if (getEnabled() == 1) {
                    z = true;
                }
                if (realView.isEnabled() != z) {
                    realView.setEnabled(z);
                }
                renderTransformedProperty(realView);
                bindAccessibilityToView(realView, getAccessibility());
                DXWidgetNode referenceNode = isFlatten() ? getReferenceNode() : this;
                referenceNode.setBackground(realView);
                DXTraceUtil.a();
                referenceNode.onRenderView(context, realView);
                DXTraceUtil.a(" onRenderView End ");
                if (Build.VERSION.SDK_INT >= 17 && (realView instanceof ViewGroup)) {
                    if (bx.a()) {
                        if (realView.getLayoutDirection() != getDirection()) {
                            realView.setLayoutDirection(getDirection());
                        }
                    } else {
                        realView.setLayoutDirection(getDirection());
                    }
                }
                referenceNode.setForceDark(realView);
                DXTraceUtil.a();
            }
            this.privateFlags &= -257;
            this.privateFlags |= 512;
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext == null || dXRuntimeContext.n() == null) {
                return;
            }
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, 90002);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(e);
            dXRuntimeContext.n().c.add(aVar);
        }
    }

    public final void renderViewWithButter(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf16caa0", new Object[]{this, context});
            return;
        }
        try {
            View nativeView = getNativeView();
            if (nativeView == null) {
                return;
            }
            if (nativeView.getAlpha() != getAlpha() && !getStatInAnimationFlag(1)) {
                nativeView.setAlpha(getAlpha());
            }
            renderTransformedProperty(nativeView);
            bindAccessibilityToView(nativeView, getAccessibility());
            setBackground(nativeView);
            onRenderView(context, nativeView);
            if (Build.VERSION.SDK_INT >= 17 && (nativeView instanceof ViewGroup)) {
                if (bx.a()) {
                    if (nativeView.getLayoutDirection() != getDirection()) {
                        nativeView.setLayoutDirection(getDirection());
                    }
                } else {
                    nativeView.setLayoutDirection(getDirection());
                }
            }
            setForceDark(nativeView);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext == null || dXRuntimeContext.n() == null) {
                return;
            }
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.DX_MONITOR_SERVICE_ID_RENDER_DETAIL, 90002);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(e);
            dXRuntimeContext.n().c.add(aVar);
        }
    }

    public void renderTransformedProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df392f21", new Object[]{this, view});
        } else if (isV4Node()) {
        } else {
            if (getTranslateX() != view.getTranslationX()) {
                view.setTranslationX(getTranslateX());
            }
            if (getTranslateY() != view.getTranslationY()) {
                view.setTranslationY(getTranslateY());
            }
            if (getRotationX() != view.getRotationX()) {
                view.setRotationX(getRotationX());
            }
            if (getRotationY() != view.getRotationY()) {
                view.setRotationY(getRotationY());
            }
            if (getRotationZ() != view.getRotation()) {
                view.setRotation(getRotationZ());
            }
            if (getScaleX() != view.getScaleX()) {
                view.setScaleX(getScaleX());
            }
            if (getScaleY() == view.getScaleY()) {
                return;
            }
            view.setScaleY(getScaleY());
        }
    }

    public void renderAnimationSupportProperty(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3817d5d5", new Object[]{this, view});
            return;
        }
        if (view.getAlpha() != getAlpha() && !getStatInAnimationFlag(1)) {
            view.setAlpha(getAlpha());
        }
        if (!isV4Node()) {
            return;
        }
        if (view.getScaleX() != this.dxv4Properties.m() && !getStatInAnimationFlag(8)) {
            view.setScaleX(this.dxv4Properties.m());
        }
        if (view.getScaleY() != this.dxv4Properties.n() && !getStatInAnimationFlag(16)) {
            view.setScaleY(this.dxv4Properties.n());
        }
        if (view.getTranslationX() != this.dxv4Properties.o() && !getStatInAnimationFlag(32)) {
            view.setTranslationX(this.dxv4Properties.o());
        }
        if (view.getTranslationY() != this.dxv4Properties.p() && !getStatInAnimationFlag(64)) {
            view.setTranslationY(this.dxv4Properties.p());
        }
        if (view.getRotationX() != this.dxv4Properties.q() && !getStatInAnimationFlag(256)) {
            view.setRotationX(this.dxv4Properties.q());
        }
        if (view.getRotationY() != this.dxv4Properties.r() && !getStatInAnimationFlag(512)) {
            view.setRotationY(this.dxv4Properties.r());
        }
        if (view.getRotation() == this.dxv4Properties.s() || getStatInAnimationFlag(1024)) {
            return;
        }
        view.setRotation(this.dxv4Properties.s());
    }

    public void setBackground(View view) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
        } else if (!this.needSetBackground && !getStatInPrivateFlags(65536)) {
        } else {
            int tryFetchDarkModeColor = tryFetchDarkModeColor("backgroundColor", 1, getBackGroundColor());
            int tryFetchDarkModeColor2 = tryFetchDarkModeColor("borderColor", 2, getBorderColor());
            Drawable background = view.getBackground();
            int dashWidth = getDashWidth();
            int dashGap = getDashGap();
            int cornerRadius = getCornerRadius();
            int cornerRadiusLeftTop = getCornerRadiusLeftTop();
            int cornerRadiusRightBottom = getCornerRadiusRightBottom();
            int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
            int cornerRadiusRightTop = getCornerRadiusRightTop();
            int borderWidth = getBorderWidth();
            if (getBorderType() == 1) {
                i = (dashWidth >= 0 || DinamicXEngine.i() == null) ? dashWidth : gbg.a(getEngine(), DinamicXEngine.i(), 6.0f);
                i2 = (dashGap >= 0 || DinamicXEngine.i() == null) ? dashGap : gbg.a(getEngine(), DinamicXEngine.i(), 4.0f);
            } else {
                i = 0;
                i2 = 0;
            }
            b backgroundGradient = getBackgroundGradient();
            if (background != null && (background instanceof GradientDrawable)) {
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                gradientDrawable.setColor(tryFetchDarkModeColor);
                if (cornerRadius > 0) {
                    gradientDrawable.setCornerRadius(cornerRadius);
                } else {
                    float f = cornerRadiusLeftTop;
                    float f2 = cornerRadiusRightTop;
                    float f3 = cornerRadiusRightBottom;
                    float f4 = cornerRadiusLeftBottom;
                    gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
                }
                if (borderWidth >= 0 && tryFetchDarkModeColor2 != 0) {
                    gradientDrawable.setStroke(borderWidth, tryFetchDarkModeColor2, i, i2);
                } else if (borderWidth >= 0 && tryFetchDarkModeColor2 == 0) {
                    gradientDrawable.setStroke(0, 0, 0.0f, 0.0f);
                }
                if (backgroundGradient == null || backgroundGradient.c() != 0) {
                    return;
                }
                gradientDrawable.setGradientType(backgroundGradient.c());
                if (Build.VERSION.SDK_INT < 16) {
                    return;
                }
                gradientDrawable.setOrientation(backgroundGradient.a());
                gradientDrawable.setColors(backgroundGradient.b());
            } else if (hasCornerRadius() || tryFetchDarkModeColor2 != 0 || borderWidth >= 0 || backgroundGradient != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                if (cornerRadius > 0) {
                    gradientDrawable2.setCornerRadius(cornerRadius);
                } else {
                    float f5 = cornerRadiusLeftTop;
                    float f6 = cornerRadiusRightTop;
                    float f7 = cornerRadiusRightBottom;
                    float f8 = cornerRadiusLeftBottom;
                    gradientDrawable2.setCornerRadii(new float[]{f5, f5, f6, f6, f7, f7, f8, f8});
                }
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(tryFetchDarkModeColor);
                if (borderWidth >= 0 && tryFetchDarkModeColor2 != 0) {
                    gradientDrawable2.setStroke(borderWidth, tryFetchDarkModeColor2, i, i2);
                } else if (borderWidth >= 0 && tryFetchDarkModeColor2 == 0) {
                    gradientDrawable2.setStroke(0, 0, 0.0f, 0.0f);
                }
                if (backgroundGradient == null || backgroundGradient.c() != 0) {
                    i3 = 16;
                } else {
                    gradientDrawable2.setGradientType(backgroundGradient.c());
                    i3 = 16;
                    if (Build.VERSION.SDK_INT >= 16) {
                        gradientDrawable2.setOrientation(backgroundGradient.a());
                        gradientDrawable2.setColors(backgroundGradient.b());
                    }
                }
                if (Build.VERSION.SDK_INT >= i3) {
                    view.setBackground(gradientDrawable2);
                } else {
                    view.setBackgroundDrawable(gradientDrawable2);
                }
            } else {
                view.setBackgroundColor(tryFetchDarkModeColor);
            }
        }
    }

    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 16) {
            String accessibilityText = getAccessibilityText();
            final String accessibilityRole = getAccessibilityRole();
            if (i == -1 || i == 3) {
                return;
            }
            if (accessibilityText != null) {
                view.setContentDescription(accessibilityText);
            }
            if (i == 1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
            if (TextUtils.isEmpty(accessibilityRole)) {
                return;
            }
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.taobao.android.dinamicx.widget.DXWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -1796852737) {
                        super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("94e633ff", new Object[]{this, view2, accessibilityNodeInfoCompat});
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    String a2 = gbb.a(accessibilityRole);
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    accessibilityNodeInfoCompat.setRoleDescription(a2);
                }
            });
        } else {
            view.setContentDescription("");
        }
    }

    public void setRealViewVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a0874f", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            if (i != 0) {
                if (i == 1) {
                    i2 = 4;
                } else if (i == 2) {
                    i2 = 8;
                }
            }
            if (view.getVisibility() == i2) {
                return;
            }
            view.setVisibility(i2);
        }
    }

    public void setRealViewLayoutParam(View view) {
        ViewGroup.LayoutParams generateLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70250cd", new Object[]{this, view});
        } else if (view == null) {
        } else {
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode == null || !(dXWidgetNode instanceof m)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(getMeasuredWidth(), getMeasuredHeight());
                } else {
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                }
                view.setLayoutParams(layoutParams);
                return;
            }
            this.realLayoutAttribute = attributeThreadLocal.get();
            if (this.realLayoutAttribute == null) {
                this.realLayoutAttribute = new com.taobao.android.dinamicx.model.a();
                attributeThreadLocal.set(this.realLayoutAttribute);
            }
            this.realLayoutAttribute.f11888a = getMeasuredWidth();
            this.realLayoutAttribute.b = getMeasuredHeight();
            m mVar = (m) this.parentWidget;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                generateLayoutParams = mVar.generateLayoutParams(this.realLayoutAttribute);
            } else {
                generateLayoutParams = mVar.generateLayoutParams(this.realLayoutAttribute, layoutParams2);
            }
            view.setLayoutParams(generateLayoutParams);
        }
    }

    public Object shallowClone(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("10620bbf", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        }
        DXWidgetNode build = build(null);
        if (build == null) {
            return null;
        }
        if (dXRuntimeContext != null) {
            build.dXRuntimeContext = dXRuntimeContext.a(build);
        }
        build.onClone(this, z);
        return build;
    }

    public DXWidgetNode deepClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("442ee468", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        if (this.children != null) {
            dXWidgetNode.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                dXWidgetNode.addChild(this.children.get(i).deepClone(dXRuntimeContext));
            }
        }
        return dXWidgetNode;
    }

    public DXWidgetNode butterClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("498d0cd4", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode shallowButterClone = shallowButterClone(dXRuntimeContext);
        if (this.children != null) {
            shallowButterClone.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                shallowButterClone.addChild(this.children.get(i).butterClone(dXRuntimeContext), false);
            }
        }
        return shallowButterClone;
    }

    public DXWidgetNode deepCloneForEmbed(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5042318", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode dXWidgetNode = (DXWidgetNode) shallowClone(dXRuntimeContext, true);
        dXWidgetNode.initOriginInfo(dXWidgetNode);
        if (this.children != null) {
            dXWidgetNode.children = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                DXWidgetNode deepCloneForEmbed = this.children.get(i).deepCloneForEmbed(dXRuntimeContext);
                deepCloneForEmbed.initOriginInfo(deepCloneForEmbed);
                dXWidgetNode.addChild(deepCloneForEmbed);
            }
        }
        return dXWidgetNode;
    }

    public DXWidgetNode shallowButterClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("fd886b20", new Object[]{this, dXRuntimeContext});
        }
        DXWidgetNode build = build(null);
        if (build == null) {
            return null;
        }
        if (dXRuntimeContext != null) {
            build.dXRuntimeContext = dXRuntimeContext.a(build);
        }
        build.onButterClone(this);
        return build;
    }

    public void onButterClone(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17d186a", new Object[]{this, dXWidgetNode});
            return;
        }
        this.autoId = dXWidgetNode.autoId;
        this.isEnableButter = dXWidgetNode.isEnableButter;
        this.isViewStub = dXWidgetNode.isViewStub;
        this.isAlreadyExpand = dXWidgetNode.isAlreadyExpand;
        this.viewStubExprNode = dXWidgetNode.viewStubExprNode;
        this.strategy = dXWidgetNode.strategy;
        this.dxNodeConstantProperty = dXWidgetNode.dxNodeConstantProperty;
        this.privateFlags = dXWidgetNode.privateFlags;
        this.lastAutoId = dXWidgetNode.lastAutoId;
        this.dxEventChains = dXWidgetNode.dxEventChains;
        byte[] bArr = dXWidgetNode.dxExprBytes;
        if (bArr != null) {
            this.dxExprBytes = bArr;
        }
        this.dxv3VariableInfo = dXWidgetNode.dxv3VariableInfo;
        this.originInfo = dXWidgetNode.originInfo;
    }

    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        this.userId = dXWidgetNode.userId;
        this.autoId = dXWidgetNode.autoId;
        this.privateFlags = dXWidgetNode.privateFlags;
        this.isFlatten = dXWidgetNode.isFlatten;
        this.needSetBackground = dXWidgetNode.needSetBackground;
        this.animationObj = dXWidgetNode.animationObj;
        this.propertyInitFlag = dXWidgetNode.propertyInitFlag;
        this.layoutWidth = dXWidgetNode.layoutWidth;
        setLayoutHeight(dXWidgetNode.layoutHeight);
        this.dxNodePadding = dXWidgetNode.dxNodePadding;
        this.dxNodeMargin = dXWidgetNode.dxNodeMargin;
        this.dxNodeLowFrequencyProperty = dXWidgetNode.dxNodeLowFrequencyProperty;
        this.dxNodeCorner = dXWidgetNode.dxNodeCorner;
        this.dxNodeBorder = dXWidgetNode.dxNodeBorder;
        this.dxNodeAccessibility = dXWidgetNode.dxNodeAccessibility;
        this.dxNodeCommon = dXWidgetNode.dxNodeCommon;
        this.dxNodeFrame = dXWidgetNode.dxNodeFrame;
        this.dxNodeConstantProperty = dXWidgetNode.dxNodeConstantProperty;
        this.dxNodeAnimation = dXWidgetNode.dxNodeAnimation;
        this.bindingXSpecMap = dXWidgetNode.bindingXSpecMap;
        this.bindingXExecutingMap = dXWidgetNode.bindingXExecutingMap;
        this.lastAutoId = dXWidgetNode.lastAutoId;
        this.sourceWidgetWR = dXWidgetNode.sourceWidgetWR;
        this.sourceAutoId = dXWidgetNode.sourceAutoId;
        this.dxEventChains = dXWidgetNode.dxEventChains;
        byte[] bArr = dXWidgetNode.dxExprBytes;
        if (bArr != null) {
            this.dxExprBytes = bArr;
        }
        gfl gflVar = dXWidgetNode.dxv4Properties;
        if (gflVar != null) {
            this.dxv4Properties = gflVar.a(z);
        }
        this.animationFlags = dXWidgetNode.animationFlags;
        this.screenAttrNode = dXWidgetNode.screenAttrNode;
        this.isEnableButter = dXWidgetNode.isEnableButter;
        this.strategy = dXWidgetNode.strategy;
        this.dxv3VariableInfo = dXWidgetNode.dxv3VariableInfo;
        this.originInfo = dXWidgetNode.originInfo;
    }

    public final void invalidateParseCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17debbb1", new Object[]{this});
            return;
        }
        this.privateFlags &= -3;
        this.privateFlags |= 1;
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode == null) {
            return;
        }
        dXWidgetNode.invalidateParseCache();
    }

    private final void invalidateSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9f82e", new Object[]{this});
        } else {
            getDXRuntimeContext().U().a(this, this.viewContainer);
        }
    }

    public final void setNeedParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa11082", new Object[]{this});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().U().a(this, this.viewContainer);
        } else {
            this.privateFlags &= -3;
            this.privateFlags |= 1;
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode instanceof DXRecyclerLayout) {
                ((DXRecyclerLayout) dXWidgetNode).e(this);
            }
            DXWidgetNode dXWidgetNode2 = this.parentWidget;
            if (dXWidgetNode2 != null) {
                dXWidgetNode2.setNeedParse();
                return;
            }
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext == null) {
                return;
            }
            com.taobao.android.dinamicx.am r = dXRuntimeContext.r();
            fzm q = dXRuntimeContext.q();
            if (r == null || q == null) {
                return;
            }
            com.taobao.android.dinamicx.ab f = r.f();
            if (f != null) {
                f.a(dXRuntimeContext.t());
            }
            fzn fznVar = new fzn();
            fznVar.d = 2;
            fznVar.f28239a = this;
            q.b(fznVar);
        }
    }

    public void setNeedParse(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36667011", new Object[]{this, dXWidgetRefreshOption});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().U().a(this, this.viewContainer);
        } else {
            if (dXWidgetRefreshOption == null) {
                dXWidgetRefreshOption = new DXWidgetRefreshOption();
            }
            boolean f = dXWidgetRefreshOption.f();
            if (dXWidgetRefreshOption.b() == 3) {
                if (isShouldUpdate()) {
                    this.privateFlags &= -3;
                    this.privateFlags |= 1;
                    this.privateFlags |= 4;
                    unsetStatFlag(2048);
                    unsetStatFlag(4096);
                    setStatFlag(524288);
                }
            } else {
                this.privateFlags &= -3;
                this.privateFlags |= 1;
                this.privateFlags |= 4;
                unsetStatFlag(2048);
                if (!isMarkContainerLayout()) {
                    unsetStatFlag(4096);
                }
            }
            if (f) {
                setStatFlag(2097152);
            }
            if (dXWidgetRefreshOption.b() == 3) {
                if (dXWidgetRefreshOption.a() && isShouldUpdate()) {
                    bindChildrenParseFlag(dXWidgetRefreshOption);
                }
            } else if (dXWidgetRefreshOption != null && dXWidgetRefreshOption.a()) {
                bindChildrenParseFlag(dXWidgetRefreshOption);
            }
            if (this.parentWidget != null) {
                if (DinamicXEngine.j() && f) {
                    throw new IllegalArgumentException(Log.getStackTraceString(new IllegalArgumentException("窗口变化局部刷新必须从根节点调用(getDXRuntimeContext().getRealRootExpandWidget())：")));
                }
                if (dXWidgetRefreshOption.b() == 3) {
                    this.parentWidget.bindParentMeasureFlagWithOption(true, dXWidgetRefreshOption);
                    return;
                } else {
                    this.parentWidget.bindParentMeasureFlag(this, true, dXWidgetRefreshOption);
                    return;
                }
            }
            sendPartParserEvent(dXWidgetRefreshOption);
        }
    }

    private boolean isMarkContainerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f3c5d7f", new Object[]{this})).booleanValue();
        }
        if (!(this instanceof DXAbsContainerBaseLayout) && !(this instanceof v)) {
            return false;
        }
        return ((m) this).isMarkContainer();
    }

    private void bindChildrenParseFlag(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6fab59", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        List<DXWidgetNode> list = null;
        if (dXWidgetRefreshOption.b() == 3) {
            if (!isShouldUpdate()) {
                return;
            }
            list = getPartRefreshChildren();
        } else if (isMarkContainerLayout()) {
            if (dXWidgetRefreshOption.b() == 0) {
                return;
            }
            if (1 == dXWidgetRefreshOption.b()) {
                if (this instanceof v) {
                    list = ((v) this).itemWidgetNodes;
                }
                if (this instanceof DXAbsContainerBaseLayout) {
                    list = ((DXAbsContainerBaseLayout) this).d();
                }
            } else if (2 == dXWidgetRefreshOption.b()) {
                unsetStatFlag(4096);
                return;
            }
        } else if (this instanceof v) {
            list = ((v) this).itemWidgetNodes;
        } else if (this instanceof DXAbsContainerBaseLayout) {
            list = ((DXAbsContainerBaseLayout) this).d();
        } else {
            list = getChildren();
        }
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DXWidgetNode dXWidgetNode = list.get(i);
            if ((dXWidgetRefreshOption.b() != 0 || !dXWidgetNode.isMarkContainerLayout()) && (dXWidgetRefreshOption.b() != 3 || dXWidgetNode.isShouldUpdate())) {
                dXWidgetNode.setStatFlag(1);
                dXWidgetNode.unsetStatFlag(2);
                dXWidgetNode.setStatFlag(16384);
                dXWidgetNode.setStatFlag(4);
                dXWidgetNode.unsetStatFlag(8);
                dXWidgetNode.unsetStatFlag(32);
                dXWidgetNode.setStatFlag(256);
                dXWidgetNode.unsetStatFlag(2048);
                if (dXWidgetRefreshOption.f()) {
                    dXWidgetNode.setStatFlag(2097152);
                }
                if (dXWidgetRefreshOption.b() == 3) {
                    if (!dXWidgetNode.isShouldUpdate()) {
                        return;
                    }
                    unsetStatFlag(4096);
                    setStatFlag(524288);
                } else if (!dXWidgetNode.isMarkContainerLayout()) {
                    dXWidgetNode.unsetStatFlag(4096);
                }
                dXWidgetNode.bindChildrenParseFlag(dXWidgetRefreshOption);
            }
        }
    }

    public void setNeedLayout(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f1b8", new Object[]{this, dXWidgetRefreshOption});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().U().a(this, this.viewContainer);
        } else {
            if (dXWidgetRefreshOption == null) {
                dXWidgetRefreshOption = new DXWidgetRefreshOption();
            }
            setStatFlag(16384);
            setStatFlag(4);
            unsetStatFlag(8);
            unsetStatFlag(32);
            if (dXWidgetRefreshOption != null && dXWidgetRefreshOption.a()) {
                bindChildrenMeasureFlag(dXWidgetRefreshOption);
            }
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode != null) {
                dXWidgetNode.bindParentMeasureFlag(this, false, dXWidgetRefreshOption);
            } else {
                sendPartMeasureLayoutEvent(dXWidgetRefreshOption);
            }
        }
    }

    public List<DXWidgetNode> getPartRefreshChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17f2cef", new Object[]{this});
        }
        if (this instanceof v) {
            return ((v) this).itemWidgetNodes;
        }
        if (this instanceof DXAbsContainerBaseLayout) {
            return ((DXAbsContainerBaseLayout) this).d();
        }
        if (this instanceof ab) {
            return ((ab) this).c();
        }
        return getChildren();
    }

    private void bindChildrenMeasureFlag(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66cae44", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        List<DXWidgetNode> list = null;
        if (dXWidgetRefreshOption.b() == 3) {
            if (!isShouldUpdate()) {
                return;
            }
            list = getPartRefreshChildren();
        } else if (isMarkContainerLayout()) {
            if (dXWidgetRefreshOption.b() == 0) {
                return;
            }
            if (1 == dXWidgetRefreshOption.b()) {
                if (this instanceof v) {
                    list = ((v) this).itemWidgetNodes;
                }
                if (this instanceof DXAbsContainerBaseLayout) {
                    list = ((DXAbsContainerBaseLayout) this).d();
                }
            } else if (2 == dXWidgetRefreshOption.b()) {
                return;
            }
        } else {
            list = getChildren();
        }
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            DXWidgetNode dXWidgetNode = list.get(i);
            if (dXWidgetRefreshOption.b() != 3 || dXWidgetNode.isShouldUpdate()) {
                dXWidgetNode.setStatFlag(16384);
                dXWidgetNode.setStatFlag(4);
                dXWidgetNode.unsetStatFlag(8);
                dXWidgetNode.unsetStatFlag(32);
                dXWidgetNode.unsetStatFlag(2048);
                dXWidgetNode.bindChildrenMeasureFlag(dXWidgetRefreshOption);
            }
        }
    }

    private void refreshRecyclerLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca7028b", new Object[]{this});
        } else if (!(this instanceof DXRecyclerLayout)) {
        } else {
            DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) this;
            DXGeneralMsgCenterEvent dXGeneralMsgCenterEvent = new DXGeneralMsgCenterEvent();
            dXGeneralMsgCenterEvent.setMethod(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) dXRecyclerLayout.c());
            dXGeneralMsgCenterEvent.setParams(jSONObject);
            dXRecyclerLayout.postEvent(dXGeneralMsgCenterEvent);
        }
    }

    public final void setNeedParse(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4981b292", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            setNeedParse();
        } else {
            this.privateFlags &= -3;
            this.privateFlags |= 1;
            this.privateFlags |= 4;
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode != null) {
                dXWidgetNode.bindParentMeasureFlag(this, true, null);
            } else {
                sendPartParserEvent(null);
            }
        }
    }

    private void bindParentMeasureFlag(DXWidgetNode dXWidgetNode, boolean z, DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aefc377e", new Object[]{this, dXWidgetNode, new Boolean(z), dXWidgetRefreshOption});
            return;
        }
        this.privateFlags |= 16384;
        this.privateFlags &= -41;
        if ((this.parentWidget instanceof DXRecyclerLayout) || ((fqi.H() && (this.parentWidget instanceof v)) || (fqi.ai() && (this.parentWidget instanceof DXAbsContainerBaseLayout)))) {
            if (dXWidgetRefreshOption != null && dXWidgetRefreshOption.f()) {
                updateRefreshType(2);
            } else {
                updateRefreshType(1);
            }
            if (z) {
                setStatFlag(1);
            } else {
                setStatFlag(4);
            }
            DXWidgetNode dXWidgetNode2 = this.parentWidget;
            if (dXWidgetNode2 instanceof DXRecyclerLayout) {
                ((DXRecyclerLayout) dXWidgetNode2).f(this);
                return;
            }
        } else {
            boolean z2 = this instanceof DXRecyclerLayout;
            if (z2 || (this instanceof v) || (fqi.ai() && (this instanceof DXAbsContainerBaseLayout))) {
                if (dXWidgetRefreshOption != null && dXWidgetRefreshOption.f()) {
                    dXWidgetNode.updateRefreshType(2);
                } else {
                    dXWidgetNode.updateRefreshType(1);
                }
                if (z) {
                    dXWidgetNode.setStatFlag(1);
                } else {
                    dXWidgetNode.setStatFlag(4);
                }
                if (z2) {
                    ((DXRecyclerLayout) this).f(dXWidgetNode);
                    return;
                }
            }
        }
        DXWidgetNode dXWidgetNode3 = this.parentWidget;
        if (dXWidgetNode3 != null) {
            dXWidgetNode3.bindParentMeasureFlag(this, z, dXWidgetRefreshOption);
        } else if (z) {
            sendPartParserEvent(dXWidgetRefreshOption);
        } else {
            sendPartMeasureLayoutEvent(dXWidgetRefreshOption);
        }
    }

    private void bindParentMeasureFlagWithOption(boolean z, DXWidgetRefreshOption dXWidgetRefreshOption) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dfc1de", new Object[]{this, new Boolean(z), dXWidgetRefreshOption});
        } else if (dXWidgetRefreshOption == null || (dXWidgetNode = this.parentWidget) == null) {
        } else {
            if (dXWidgetRefreshOption.b() == 3) {
                if (dXWidgetNode.isShouldUpdate()) {
                    dXWidgetNode.privateFlags |= 16384;
                    dXWidgetNode.privateFlags &= -41;
                }
            } else {
                dXWidgetNode.privateFlags |= 16384;
                dXWidgetNode.privateFlags &= -41;
            }
            if ((dXWidgetNode instanceof DXRecyclerLayout) || (dXWidgetNode instanceof v) || (fqi.ai() && (dXWidgetNode instanceof DXAbsContainerBaseLayout))) {
                if (dXWidgetRefreshOption.f()) {
                    updateRefreshType(2);
                } else {
                    updateRefreshType(1);
                }
                if (z) {
                    setStatFlag(1);
                } else {
                    setStatFlag(4);
                }
                DXWidgetNode dXWidgetNode2 = this.parentWidget;
                if (dXWidgetNode2 instanceof DXRecyclerLayout) {
                    ((DXRecyclerLayout) dXWidgetNode2).f(this);
                    return;
                }
            }
            if (dXWidgetNode.parentWidget != null) {
                dXWidgetNode.bindParentMeasureFlagWithOption(z, dXWidgetRefreshOption);
            } else if (z) {
                dXWidgetNode.sendPartParserEvent(dXWidgetRefreshOption);
            } else {
                dXWidgetNode.sendPartMeasureLayoutEvent(dXWidgetRefreshOption);
            }
        }
    }

    private void sendPartParserEvent(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9d72f6", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return;
        }
        com.taobao.android.dinamicx.am r = dXRuntimeContext.r();
        fzm q = dXRuntimeContext.q();
        if (r == null || q == null) {
            return;
        }
        com.taobao.android.dinamicx.ab f = r.f();
        if (f != null) {
            f.a(dXRuntimeContext.t());
        }
        fzn fznVar = new fzn();
        fznVar.d = 2;
        fznVar.e = 1;
        fznVar.f28239a = this;
        if (dXWidgetRefreshOption == null) {
            fznVar.f = false;
        } else {
            if (dXWidgetRefreshOption.f()) {
                fznVar.e = 2;
            }
            fznVar.f = dXWidgetRefreshOption.c();
            fznVar.c.put("width", Integer.valueOf(dXWidgetRefreshOption.d()));
            fznVar.c.put("height", Integer.valueOf(dXWidgetRefreshOption.e()));
        }
        if (fznVar.f) {
            q.a(fznVar);
        } else {
            q.b(fznVar);
        }
    }

    private void sendPartMeasureLayoutEvent(DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4a0763", new Object[]{this, dXWidgetRefreshOption});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return;
        }
        com.taobao.android.dinamicx.am r = dXRuntimeContext.r();
        fzm q = dXRuntimeContext.q();
        if (r == null || q == null) {
            return;
        }
        com.taobao.android.dinamicx.ab f = r.f();
        if (f != null) {
            f.a(dXRuntimeContext.t());
        }
        fzn fznVar = new fzn();
        fznVar.d = 3;
        fznVar.f28239a = this;
        fznVar.e = 1;
        if (dXWidgetRefreshOption == null) {
            fznVar.f = false;
        } else {
            if (dXWidgetRefreshOption.f()) {
                fznVar.e = 2;
            }
            fznVar.f = dXWidgetRefreshOption.c();
            fznVar.c.put("width", Integer.valueOf(dXWidgetRefreshOption.d()));
            fznVar.c.put("height", Integer.valueOf(dXWidgetRefreshOption.e()));
        }
        if (fznVar.f) {
            q.a(fznVar);
        } else {
            q.b(fznVar);
        }
    }

    public final void invalidateLayoutCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3954044", new Object[]{this});
            return;
        }
        this.privateFlags |= 16384;
        this.privateFlags &= -41;
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode == null) {
            return;
        }
        dXWidgetNode.invalidateLayoutCache();
    }

    public final void setNeedLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1530e9", new Object[]{this});
        } else {
            setNeedLayout(false);
        }
    }

    public final void setNeedLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7919f0b", new Object[]{this, new Boolean(z)});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().U().a(this, this.viewContainer);
        } else {
            this.privateFlags |= 16384;
            this.privateFlags &= -41;
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode instanceof DXRecyclerLayout) {
                if (z) {
                    updateRefreshType(1);
                    ((DXRecyclerLayout) this.parentWidget).f(this);
                    return;
                }
                ((DXRecyclerLayout) dXWidgetNode).e(this);
            } else if (dXWidgetNode != null) {
                dXWidgetNode.setNeedLayout(z);
            } else {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                if (dXRuntimeContext == null) {
                    return;
                }
                com.taobao.android.dinamicx.am r = dXRuntimeContext.r();
                fzm q = dXRuntimeContext.q();
                if (r == null || q == null) {
                    return;
                }
                com.taobao.android.dinamicx.ab f = r.f();
                if (f != null) {
                    f.a(dXRuntimeContext.t());
                }
                fzn fznVar = new fzn();
                fznVar.d = 3;
                fznVar.f28239a = this;
                if (z) {
                    fznVar.e = 1;
                } else {
                    fznVar.e = 0;
                }
                q.b(fznVar);
            }
        }
    }

    public final void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else {
            requestLayout(false);
        }
    }

    public final void requestLayout(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fc0434", new Object[]{this, new Boolean(z)});
        } else if (this.isEnableButter) {
            getDXRuntimeContext().U().a(this, this.viewContainer);
        } else {
            this.privateFlags |= 16384;
            this.privateFlags &= -41;
            DXWidgetNode dXWidgetNode = this.parentWidget;
            if (dXWidgetNode != null) {
                dXWidgetNode.requestLayout(z);
                return;
            }
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext == null) {
                return;
            }
            com.taobao.android.dinamicx.am r = dXRuntimeContext.r();
            fzm q = dXRuntimeContext.q();
            if (r == null || q == null) {
                return;
            }
            com.taobao.android.dinamicx.ab f = r.f();
            if (f != null) {
                f.a(dXRuntimeContext.t());
            }
            fzn fznVar = new fzn();
            fznVar.d = 3;
            fznVar.f28239a = this;
            if (z) {
                fznVar.e = 1;
            } else {
                fznVar.e = 0;
            }
            q.a(fznVar);
        }
    }

    public final void setNeedRender(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f1e413", new Object[]{this, context});
            return;
        }
        this.privateFlags |= 256;
        renderView(context);
    }

    public boolean hasCornerRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e04e30c", new Object[]{this})).booleanValue() : this.dxNodeCorner != null;
    }

    public final void setIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e07e135", new Object[]{this, new Long(j), new Integer(i)});
        } else if (20052926345925L == j) {
            this.layoutWidth = i;
        } else if (9346582897824575L == j) {
            setLayoutHeight(i);
        } else if (-916628110244908525L == j) {
            setMarginLeft(i);
        } else if (-4674119579031497081L == j) {
            setMarginRight(i);
        } else if (-2641581645694792774L == j) {
            setMarginTop(i);
        } else if (6506044224063169535L == j) {
            setMarginBottom(i);
        } else if (-378913133726214547L == j) {
            setPaddingLeft(i);
        } else if (3229586316762092001L == j) {
            setPaddingRight(i);
        } else if (-2632461973017864940L == j) {
            setPaddingTop(i);
        } else if (-4745829179314597287L == j) {
            setPaddingBottom(i);
        } else if (4879707785646574221L == j && i >= 0 && i <= 8) {
            setLayoutGravity(i);
            this.propertyInitFlag |= 1;
        } else if (-3218010051991756042L == j && i >= 0 && i <= 8) {
            setChildGravity(i);
        } else if (7504432960089273802L == j && (i == 0 || i == 1)) {
            setDirection(i);
        } else if (5802348655878590802L == j && (i == 0 || i == 1 || i == 2)) {
            setVisibility(i);
        } else if (gay.DXIMAGESPAN_CORNERRADIUS == j) {
            setCornerRadius(i);
            this.needSetBackground = true;
        } else if (-7043958449911898942L == j) {
            setCornerRadiusLeftTop(i);
            this.needSetBackground = true;
        } else if (8679583519247168310L == j) {
            setCornerRadiusRightTop(i);
            this.needSetBackground = true;
        } else if (-3738348576243028217L == j) {
            setCornerRadiusLeftBottom(i);
            this.needSetBackground = true;
        } else if (1691221861925381243L == j) {
            setCornerRadiusRightBottom(i);
            this.needSetBackground = true;
        } else if (-8019934667170236535L == j) {
            setBorderWidth(i);
            this.needSetBackground = true;
        } else if (-8020113231441560440L == j) {
            setBorderColor(i);
            this.needSetBackground = true;
        } else if (1844153004063100714L == j) {
            setBorderType(i);
            this.needSetBackground = true;
        } else if (3657130712798351885L == j) {
            setDashWidth(i);
        } else if (5384687760714897699L == j) {
            setDashGap(i);
        } else if (-6716070147120443019L == j) {
            setAccessibility(i);
        } else if (-2819959685970048978L == j) {
            setBackGroundColor(i);
            this.needSetBackground = true;
        } else if (4804789929613330386L == j) {
            setEnabled(i);
        } else if (2051502660558186662L == j) {
            setMinHeight(i);
        } else if (j == 3998176004939777025L) {
            if (i != 0) {
                z = true;
            }
            setSoftwareRender(z);
        } else if (4694181495334893900L == j) {
            setMinWidth(i);
        } else if (j == -8044124925891189930L) {
            if (i == 1) {
                z = true;
            }
            setClipChildren(z);
        } else if (j == -6579663421190292502L) {
            if (i != 0) {
                z = true;
            }
            setDisableDarkMode(z);
        } else if (j == -5241271604340946425L) {
            setEventResponseMode(i);
        } else if (j == 9037937761546515694L) {
            if (i == 1) {
                z = true;
            }
            setOpenNewFastReturnLogic(z);
        } else if (j == -6311293910063768578L) {
            if (i == 1) {
                z = true;
            }
            setShouldUpdate(z);
        } else if (j == DXVIEW_ISRELAYOUTBOUNDARY) {
            if (i == 1) {
                z = true;
            }
            setRelayoutBoundary(z);
        } else if (j == DXVIEW_NEEDPOSTPREPAREBINDEVENT) {
            if (i == 1) {
                z = true;
            }
            setNeedPostPrepareBindEvent(z);
        } else {
            if (isV4Node()) {
                if (j == DXVIEW_TRANSLATIONX) {
                    this.dxv4Properties.a(i);
                } else if (j == DXVIEW_TRANSLATIONY) {
                    this.dxv4Properties.b(i);
                }
            }
            onSetIntAttribute(j, i);
        }
    }

    public void setNeedPostPrepareBindEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2243df", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.o = z;
    }

    public boolean getNeedPostPrepareBindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be493e8d", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.o;
        }
        return false;
    }

    public void setShouldUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ded440f", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.m = z;
    }

    public void setRelayoutBoundary(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b9f5e4", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.n = z;
    }

    public final void setObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aee60f2", new Object[]{this, new Long(j), obj});
        } else if (obj == null) {
        } else {
            if (j == 3436950829494956384L) {
                setBackgroundGradient((b) obj);
                this.needSetBackground = true;
            } else if (j == -396946557348092076L) {
                setDarkModeColorMap((HashMap) obj);
            } else {
                onSetObjAttribute(j, obj);
            }
        }
    }

    public void setSoftwareRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380f2f6e", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.i = z;
    }

    public boolean isSoftwareRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f86936f2", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.i;
        }
        return false;
    }

    public void setDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02c0b0a", new Object[]{this, new Long(j), new Double(d)});
        } else if (10439708918555150L == j) {
            setWeight(d);
        } else if (16887479372907L == j) {
            setAlpha((float) d);
        } else {
            if (isV4Node()) {
                if (j == DXVIEW_SCALEX) {
                    this.dxv4Properties.a((float) d);
                } else if (j == DXVIEW_SCALEY) {
                    this.dxv4Properties.b((float) d);
                } else if (j == DXVIEW_ROTATIONX) {
                    this.dxv4Properties.c((float) d);
                } else if (j == DXVIEW_ROTATIONY) {
                    this.dxv4Properties.d((float) d);
                } else if (j == DXVIEW_ROTATIONZ) {
                    this.dxv4Properties.e((float) d);
                }
            }
            onSetDoubleAttribute(j, d);
        }
    }

    public void setStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419fd4be", new Object[]{this, new Long(j), str});
        } else if (10297924263834610L == j) {
            this.userId = str;
        } else if (6301829145275697438L == j) {
            setAccessibilityText(str);
        } else if (6301824781620251403L == j) {
            setAccessibilityRole(str);
        } else if (j == -60331626368423735L || j == -8952773332738010306L) {
            setAnimation(str);
        } else if (j != DXVIEW_TBORDERJSON) {
            if (j == 526314816) {
                setRef(str);
            } else {
                onSetStringAttribute(j, str);
            }
        } else {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.dxNodeConstantProperty == null) {
                    this.dxNodeConstantProperty = new az();
                }
                this.dxNodeConstantProperty.f = JSONObject.parseObject(str);
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
    }

    public void setRef(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0fe8a2", new Object[]{this, str});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.j = str;
    }

    public String getRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this});
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.j;
        }
        return null;
    }

    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.exportMethods == null) {
            this.exportMethods = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXWidgetNode.2
                {
                    add("render");
                    add("refresh");
                    add(com.taobao.android.weex_framework.util.a.ATOM_EXT_getBoundingClientRect);
                    add("commit");
                }
            };
        }
        return this.exportMethods;
    }

    @Deprecated
    public JSONObject invokeRefMethod(String str, JSONArray jSONArray) {
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cd0df95", new Object[]{this, str, jSONArray});
        }
        if (com.taobao.android.weex_framework.util.a.ATOM_EXT_getBoundingClientRect.equals(str)) {
            if (getDXRuntimeContext() == null || (v = getDXRuntimeContext().v()) == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            int measuredWidth = v.getMeasuredWidth();
            int measuredHeight = v.getMeasuredHeight();
            int[] iArr = new int[2];
            v.getLocationOnScreen(iArr);
            float a2 = fpr.a(getDXRuntimeContext().m()) / 375.0f;
            jSONObject.put("x", (Object) Float.valueOf(iArr[0] / a2));
            jSONObject.put("y", (Object) Float.valueOf(iArr[1] / a2));
            jSONObject.put("left", (Object) Float.valueOf(iArr[0] / a2));
            jSONObject.put("top", (Object) Float.valueOf(iArr[1] / a2));
            jSONObject.put("width", (Object) Float.valueOf(measuredWidth / a2));
            jSONObject.put("height", (Object) Float.valueOf(measuredHeight / a2));
            jSONObject.put("right", (Object) Float.valueOf((iArr[0] + measuredWidth) / a2));
            jSONObject.put("bottom", (Object) Float.valueOf((iArr[1] + measuredHeight) / a2));
            return jSONObject;
        } else if (!"commit".equals(str) || getDXRuntimeContext() == null || getDXRuntimeContext().v() == null) {
            return null;
        } else {
            try {
                applyTransform(getDXRuntimeContext().v(), jSONArray.get(0));
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    public void applyTransform(View view, Object obj) {
        List<Animator> list;
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4659229", new Object[]{this, view, obj});
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("transform");
            String string2 = jSONObject.getString("transition");
            try {
                List<fzj.a> a2 = fzj.a(string);
                float f3 = 1.0f;
                if (a2 != null) {
                    f = 1.0f;
                    for (fzj.a aVar : a2) {
                        int i2 = aVar.f28233a;
                        if (i2 == 6) {
                            f3 *= aVar.b[0];
                            f2 = aVar.b[1];
                        } else if (i2 == 7) {
                            f3 *= aVar.b[0];
                        } else if (i2 == 8) {
                            f2 = aVar.b[0];
                        } else {
                            throw new IllegalArgumentException("Invalid Transform method: " + aVar.f28233a);
                        }
                        f *= f2;
                    }
                } else {
                    f = 1.0f;
                }
                view.setScaleX(f3);
                view.setScaleY(f);
                List<fzk.a> a3 = fzk.a(string2, null, null, null, null);
                float floatValue = jSONObject.getFloatValue("opacity");
                String string3 = jSONObject.getString("backgroundColor");
                if (!TextUtils.isEmpty(string3)) {
                    i = Color.parseColor(string3);
                }
                list = fzk.a(a3, view, floatValue, i);
            } catch (Throwable unused) {
                list = null;
            }
            if (list == null || list.isEmpty()) {
                fzi fziVar = this.animationHolder;
                if (fziVar == null) {
                    return;
                }
                fziVar.b();
                this.animationHolder = null;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setStartDelay(0L);
            animatorSet.playTogether(list);
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorSet);
            this.animationHolder = new fzi(arrayList);
            this.animationHolder.a();
        }
    }

    public void setLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d8e305", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            onSetLongAttribute(j, j2);
        }
    }

    public void setListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f87a369", new Object[]{this, new Long(j), jSONArray});
        } else {
            onSetListAttribute(j, jSONArray);
        }
    }

    public final void setUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a16504c", new Object[]{this, new Long(j), list});
        } else {
            onSetUserDefinedListAttribute(j, list);
        }
    }

    public void setMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fa015", new Object[]{this, new Long(j), jSONObject});
        } else {
            onSetMapAttribute(j, jSONObject);
        }
    }

    public void beforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f39b171", new Object[]{this});
            return;
        }
        bq bqVar = this.strategy;
        if (bqVar != null) {
            bqVar.a(this);
        } else {
            onBeforeBindChildData();
        }
    }

    public void beforeBindChildDataWithButter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b3d477", new Object[]{this});
        } else {
            onBeforeBindChildDataWithButter();
        }
    }

    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        }
    }

    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.viewContainer;
        if (viewGroup == null) {
            return;
        }
        viewGroup.invalidate();
    }

    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new View(context);
    }

    public final void bindEvent(Context context) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e48b9e4", new Object[]{this, context});
        } else if (isV4Node()) {
            if (getDxv4Properties() == null || getDxv4Properties().a() == null) {
                return;
            }
            View realView = getRealView();
            while (i < getDxv4Properties().a().size()) {
                getReferenceNode().onBindEvent(context, realView, getDxv4Properties().a().keyAt(i));
                i++;
            }
        } else if (getEventHandlersExprNode() == null) {
        } else {
            View realView2 = getRealView();
            while (i < getEventHandlersExprNode().size()) {
                getReferenceNode().onBindEvent(context, realView2, getEventHandlersExprNode().keyAt(i));
                i++;
            }
        }
    }

    public final void bindEventWithButter(Context context) {
        View nativeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26a855e", new Object[]{this, context});
        } else if (getEventHandlersExprNode() != null && (nativeView = getNativeView()) != null) {
            for (int i = 0; i < getEventHandlersExprNode().size(); i++) {
                onBindEvent(context, nativeView, getEventHandlersExprNode().keyAt(i));
            }
        }
    }

    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        if (getEnabled() == 1) {
            if (j == 18903999933159L) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.DXWidgetNode.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            DXWidgetNode.this.onTapEvent();
                        }
                    }
                });
            } else if (j == -6544685697300501093L) {
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.dinamicx.widget.DXWidgetNode.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                        }
                        DXWidgetNode.this.onLongTap();
                        return true;
                    }
                });
            }
        }
        if (j == 2683803675109176030L) {
            bindDataEvent();
        }
        if (isV4Node()) {
            return;
        }
        if (bx.a() && !getNeedPostPrepareBindEvent()) {
            return;
        }
        prePareBindEvent(j);
    }

    private void prePareBindEvent(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6edf5e7", new Object[]{this, new Long(j)});
            return;
        }
        DXEvent dXEvent = new DXEvent(j);
        dXEvent.setPrepareBind(true);
        postEvent(dXEvent);
    }

    public final void onTapEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c9ed3d", new Object[]{this});
        } else {
            postEvent(new DXEvent(18903999933159L));
        }
    }

    public void onLongTap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6134112f", new Object[]{this});
        } else {
            postEvent(new DXEvent(-6544685697300501093L));
        }
    }

    public void bindDataEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296e05a", new Object[]{this});
        } else {
            postEvent(new DXEvent(2683803675109176030L));
        }
    }

    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (this.isEnableButter) {
            if (getVisibility() != 0) {
                return;
            }
            if (getNativeView() != null && isSelfResponseEvent()) {
                postEvent(dXEvent);
            }
            if (getChildrenCount() <= 0) {
                return;
            }
            for (DXWidgetNode dXWidgetNode : getChildren()) {
                if (isChildResponseEvent()) {
                    dXWidgetNode.sendBroadcastEvent(dXEvent);
                }
            }
        } else if (dXEvent != null) {
            try {
                if (bx.p()) {
                    if (getFlattenNode() != null && isSelfResponseEvent()) {
                        postEvent(dXEvent);
                    }
                } else if (getReferenceNode() != null && isSelfResponseEvent()) {
                    postEvent(dXEvent);
                }
                if (getChildrenCount() <= 0) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode2 : getChildren()) {
                    if (isChildResponseEvent()) {
                        dXWidgetNode2.sendBroadcastEvent(dXEvent);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean postEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba8db67", new Object[]{this, dXEvent})).booleanValue();
        }
        if (!isSelfResponseEvent()) {
            return false;
        }
        if (!this.isFlatten) {
            return onEvent(dXEvent);
        }
        return getReferenceNode().onEvent(dXEvent);
    }

    public boolean onEvent(DXEvent dXEvent) {
        DXTemplateItem dXTemplateItem;
        String str;
        fqp fqpVar;
        fqp fqpVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (isV4Node()) {
            return onEventV4(dXEvent);
        }
        try {
            if (getEventHandlersExprNode() == null || dXEvent == null || (fqpVar2 = getEventHandlersExprNode().get(dXEvent.getEventId())) == null) {
                return false;
            }
            if ((getDXRuntimeContext() == null || !getDXRuntimeContext().H()) && !(fqpVar2 instanceof fqo) && !(fqpVar2 instanceof fqt) && !(fqpVar2 instanceof fqs)) {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                if (dXRuntimeContext != null && dXRuntimeContext.n() != null) {
                    new s.a("Event", DXMonitorConstant.DX_MONITOR_EVENT_EXCETION_CAST_EXCEPTION, com.taobao.android.dinamicx.s.EVENT_DXEXPRNODE_CAST_ERROR, "eventid" + dXEvent.getEventId() + " exprNode id " + fqpVar2.d + " exprNode name " + fqpVar2.e);
                }
                return false;
            }
            fqpVar2.a(dXEvent, getDXRuntimeContext());
            return true;
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            if (getDXRuntimeContext() != null) {
                str = getDXRuntimeContext().A();
                dXTemplateItem = getDXRuntimeContext().c();
            } else {
                dXTemplateItem = null;
                str = "dinamicx";
            }
            String str2 = "";
            if (dXEvent != null) {
                str2 = str2 + "eventId : " + dXEvent.getEventId();
                if (getEventHandlersExprNode() != null && (fqpVar = getEventHandlersExprNode().get(dXEvent.getEventId())) != null) {
                    str2 = str2 + " exprNode id " + fqpVar.d + " exprNode name " + fqpVar.e;
                }
            }
            com.taobao.android.dinamicx.monitor.b.a(str, dXTemplateItem, DXMonitorConstant.DX_MONITOR_PIPELINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PIPELINE_ONEVENT, com.taobao.android.dinamicx.s.ONEVENT_CRASH, str2 + " crash stack: " + com.taobao.android.dinamicx.exception.a.a(e));
            return false;
        }
    }

    private boolean onEventV4(DXEvent dXEvent) {
        gfn gfnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("692580a6", new Object[]{this, dXEvent})).booleanValue();
        }
        gfl gflVar = this.dxv4Properties;
        if (gflVar != null && gflVar.a() != null && (gfnVar = this.dxv4Properties.a().get(dXEvent.getEventId())) != null) {
            return gfnVar.executeEvent(dXEvent, getDXRuntimeContext());
        }
        return false;
    }

    public DXWidgetNode queryWidgetNodeByAutoId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("8d293a0c", new Object[]{this, new Integer(i)}) : queryRootWidgetNode().queryWTByAutoId(i);
    }

    public DXWidgetNode queryWidgetNodeByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ffaa925b", new Object[]{this, str});
        }
        if (fqi.b(getDXRuntimeContext())) {
            DXWidgetNode queryWidgetNodeByUserIdFromMap = queryWidgetNodeByUserIdFromMap(str, true);
            if (queryWidgetNodeByUserIdFromMap == null && DinamicXEngine.j()) {
                fuw.b(str + " queryWidgetNodeByUserId 没有找到");
            }
            return queryWidgetNodeByUserIdFromMap;
        }
        return queryRootWidgetNode().queryWTByUserId(str);
    }

    private DXWidgetNode queryWidgetNodeByUserIdFromMap(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("534ab9bb", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals(getUserId())) {
            return this;
        }
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        if (!(queryRootWidgetNode instanceof m)) {
            return null;
        }
        Map<String, WeakReference<DXWidgetNode>> dxUserIdMap = ((m) queryRootWidgetNode).getDxUserIdMap();
        if (dxUserIdMap == null) {
            return queryWTByUserId(str);
        }
        WeakReference<DXWidgetNode> weakReference = dxUserIdMap.get(str);
        if (weakReference == null) {
            return queryWTByUserId(str);
        }
        DXWidgetNode dXWidgetNode = weakReference.get();
        if (dXWidgetNode == null) {
            return queryWTByUserId(str);
        }
        if (dXWidgetNode == null) {
            return null;
        }
        return dXWidgetNode;
    }

    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.isEnableButter) {
            if (getVisibility() != 0) {
                return null;
            }
            if (str.equals(this.userId)) {
                return this;
            }
            if (getChildrenCount() > 0) {
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    DXWidgetNode queryWTByUserId = dXWidgetNode.queryWTByUserId(str);
                    if (queryWTByUserId != null) {
                        return queryWTByUserId;
                    }
                }
            }
            return null;
        } else if (str.equals(this.userId)) {
            return this;
        } else {
            if (getChildrenCount() > 0) {
                if (fqi.b(getDXRuntimeContext()) && (this instanceof ac)) {
                    for (DXWidgetNode dXWidgetNode2 : getChildren()) {
                        DXWidgetNode queryWidgetNodeByUserIdFromMap = dXWidgetNode2.queryWidgetNodeByUserIdFromMap(str, false);
                        if (queryWidgetNodeByUserIdFromMap != null) {
                            return queryWidgetNodeByUserIdFromMap;
                        }
                    }
                } else {
                    for (DXWidgetNode dXWidgetNode3 : getChildren()) {
                        DXWidgetNode queryWTByUserId2 = dXWidgetNode3.queryWTByUserId(str);
                        if (queryWTByUserId2 != null) {
                            return queryWTByUserId2;
                        }
                    }
                }
            }
            return null;
        }
    }

    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)});
        }
        if (this.autoId == i) {
            return this;
        }
        if (getChildrenCount() <= 0) {
            return null;
        }
        for (DXWidgetNode dXWidgetNode : getChildren()) {
            DXWidgetNode queryWTByAutoId = dXWidgetNode.queryWTByAutoId(i);
            if (queryWTByAutoId != null) {
                return queryWTByAutoId;
            }
        }
        return null;
    }

    public DXWidgetNode queryRootWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("fc3bfb76", new Object[]{this});
        }
        if (this.dxRootWidgetCache != null && fqi.b(getDXRuntimeContext())) {
            return this.dxRootWidgetCache;
        }
        DXWidgetNode dXWidgetNode = this;
        while (dXWidgetNode.getParentWidget() != null) {
            DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
            if (parentWidget instanceof ac) {
                return dXWidgetNode;
            }
            dXWidgetNode = parentWidget;
        }
        if (dXWidgetNode != null) {
            this.dxRootWidgetCache = dXWidgetNode;
        }
        return dXWidgetNode;
    }

    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2788f0c", new Object[]{this, dXRuntimeContext});
        } else {
            bindRuntimeContext(dXRuntimeContext, false);
        }
    }

    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else if (dXRuntimeContext != null) {
            Object obj = null;
            if (z) {
                obj = this.dXRuntimeContext.f();
                i = this.dXRuntimeContext.i();
            }
            if (this.dXRuntimeContext != dXRuntimeContext) {
                this.dXRuntimeContext = dXRuntimeContext.a(this);
                if (z) {
                    this.dXRuntimeContext.a(obj);
                    this.dXRuntimeContext.b(i);
                }
            }
            if (this.childrenCount <= 0) {
                return;
            }
            for (DXWidgetNode dXWidgetNode : this.children) {
                dXWidgetNode.bindRuntimeContext(dXRuntimeContext, z);
            }
        }
    }

    public int indexOf(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbf38ed2", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (dXWidgetNode == null) {
            return -1;
        }
        for (int i = 0; i < getChildrenCount(); i++) {
            if (getChildAt(i).getAutoId() == dXWidgetNode.getAutoId()) {
                return i;
            }
        }
        return -1;
    }

    public int getLayoutDirection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff9eba39", new Object[]{this})).intValue() : getDirection();
    }

    public int getLeftMarginWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ace5c408", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getMarginRight();
        }
        return getMarginLeft();
    }

    public int getRightMarginWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f628dff", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getMarginLeft();
        }
        return getMarginRight();
    }

    public int getPaddingLeftWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4d4d2f1", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getPaddingRight();
        }
        return getPaddingLeft();
    }

    public int getPaddingRightWithDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83b59c52", new Object[]{this})).intValue();
        }
        if (getDirection() == 1) {
            return getPaddingLeft();
        }
        return getPaddingRight();
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1446694441);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public int getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.f12075a;
        }
        return 0;
    }

    public int getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.b;
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.bi
    public int getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.c;
        }
        return 0;
    }

    public int getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.d;
        }
        return 0;
    }

    public void setLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bffd73", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.f12075a = i;
    }

    public void setRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d9b4c2", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.b = i;
    }

    public void setTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a28e9a9", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.c = i;
    }

    public void setBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491a424f", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.d = i;
    }

    public float getAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue();
        }
        ay ayVar = this.dxNodeCommon;
        if (ayVar != null) {
            return ayVar.d;
        }
        return 1.0f;
    }

    public void setAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.d = f;
    }

    public int getBorderWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c84ce3e", new Object[]{this})).intValue();
        }
        ax axVar = this.dxNodeBorder;
        if (axVar != null) {
            return axVar.f12069a;
        }
        return -1;
    }

    public void setBorderWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        if (this.dxNodeBorder.f12069a == i) {
            return;
        }
        this.dxNodeBorder.f12069a = i;
        this.needSetBackground = true;
    }

    public int getBorderColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5a9b95b", new Object[]{this})).intValue();
        }
        ax axVar = this.dxNodeBorder;
        if (axVar != null) {
            return axVar.b;
        }
        return 0;
    }

    public void setBorderColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        if (i == this.dxNodeBorder.b) {
            return;
        }
        this.dxNodeBorder.b = i;
        this.needSetBackground = true;
    }

    public int getBorderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9ab9ff6", new Object[]{this})).intValue();
        }
        ax axVar = this.dxNodeBorder;
        if (axVar != null) {
            return axVar.c;
        }
        return 0;
    }

    public void setBorderType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29f6cd4", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        if (this.dxNodeBorder.c == i) {
            return;
        }
        this.dxNodeBorder.c = i;
        this.needSetBackground = true;
    }

    public int getDashWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67bdb018", new Object[]{this})).intValue();
        }
        ax axVar = this.dxNodeBorder;
        if (axVar != null) {
            return axVar.d;
        }
        return -1;
    }

    public int getDashGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8d85f28", new Object[]{this})).intValue();
        }
        ax axVar = this.dxNodeBorder;
        if (axVar != null) {
            return axVar.e;
        }
        return -1;
    }

    public void setDashWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ef2f8a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        this.dxNodeBorder.d = i;
    }

    public void setDashGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987cf57a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeBorderBeforeCheck();
        this.dxNodeBorder.e = i;
    }

    public int getBackGroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc5e9d79", new Object[]{this})).intValue();
        }
        ay ayVar = this.dxNodeCommon;
        if (ayVar != null) {
            return ayVar.e;
        }
        return 0;
    }

    public void setBackGroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c8b549", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        if (i == this.dxNodeCommon.e) {
            return;
        }
        this.dxNodeCommon.e = i;
        this.needSetBackground = true;
    }

    public String getAccessibilityText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4beeb534", new Object[]{this});
        }
        av avVar = this.dxNodeAccessibility;
        if (avVar != null) {
            return avVar.b;
        }
        return null;
    }

    public void setAccessibilityText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f66f92a", new Object[]{this, str});
            return;
        }
        setNodeAccessibilityBeforeCheck();
        this.dxNodeAccessibility.b = str;
    }

    public int getAccessibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d187612", new Object[]{this})).intValue();
        }
        if (bx.p() && getFlattenNode() != null) {
            return getFlattenNode().c();
        }
        av avVar = this.dxNodeAccessibility;
        if (avVar != null) {
            return avVar.f12067a;
        }
        return -1;
    }

    public void setAccessibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2242d0", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeAccessibilityBeforeCheck();
        this.dxNodeAccessibility.f12067a = i;
    }

    public String getAccessibilityRole() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf74918b", new Object[]{this});
        }
        av avVar = this.dxNodeAccessibility;
        if (avVar != null) {
            return avVar.c;
        }
        return null;
    }

    public void setAccessibilityRole(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9ca7b3", new Object[]{this, str});
            return;
        }
        setNodeAccessibilityBeforeCheck();
        this.dxNodeAccessibility.c = str;
    }

    public boolean hasAccessibilityOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("117f70de", new Object[]{this})).booleanValue();
        }
        av avVar = this.dxNodeAccessibility;
        return avVar != null && avVar.f12067a == 1;
    }

    public boolean hasAccessibilityAuto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eebf2bae", new Object[]{this})).booleanValue();
        }
        av avVar = this.dxNodeAccessibility;
        return avVar != null && avVar.f12067a == 3;
    }

    public int getCornerRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c34be7b7", new Object[]{this})).intValue();
        }
        ba baVar = this.dxNodeCorner;
        if (baVar != null) {
            return baVar.f12074a;
        }
        return 0;
    }

    public void setCornerRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c79033", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        if (this.dxNodeCorner.f12074a == i) {
            return;
        }
        this.dxNodeCorner.f12074a = i;
        this.needSetBackground = true;
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        setNodeCornerBeforeCheck();
        ba baVar = this.dxNodeCorner;
        baVar.b = i;
        baVar.c = i2;
        baVar.d = i3;
        baVar.e = i4;
        this.needSetBackground = true;
    }

    public int getCornerRadiusLeftTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26c5b4b", new Object[]{this})).intValue();
        }
        ba baVar = this.dxNodeCorner;
        if (baVar != null) {
            return baVar.b;
        }
        return 0;
    }

    public int getCornerRadiusRightTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37bd3bf0", new Object[]{this})).intValue();
        }
        ba baVar = this.dxNodeCorner;
        if (baVar != null) {
            return baVar.c;
        }
        return 0;
    }

    public int getCornerRadiusLeftBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bd77a9", new Object[]{this})).intValue();
        }
        ba baVar = this.dxNodeCorner;
        if (baVar != null) {
            return baVar.d;
        }
        return 0;
    }

    public int getCornerRadiusRightBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d48b98e4", new Object[]{this})).intValue();
        }
        ba baVar = this.dxNodeCorner;
        if (baVar != null) {
            return baVar.e;
        }
        return 0;
    }

    public void setEventHandlersExprNode(com.taobao.android.dinamicx.model.b<fqp> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bcdf19", new Object[]{this, bVar});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.f12071a = bVar;
    }

    public void setDataParsersExprNode(com.taobao.android.dinamicx.model.b<fqp> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bad472", new Object[]{this, bVar});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.b = bVar;
    }

    public void setEnumMap(com.taobao.android.dinamicx.model.b<Map<String, Integer>> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952be4f8", new Object[]{this, bVar});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.c = bVar;
    }

    public DXWidgetNode getParentWidget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("16e277aa", new Object[]{this}) : this.parentWidget;
    }

    public void setParentWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54efce78", new Object[]{this, dXWidgetNode});
        } else {
            this.parentWidget = dXWidgetNode;
        }
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public int getLayoutWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue() : this.layoutWidth;
    }

    public void setLayoutWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5a64a2", new Object[]{this, new Integer(i)});
        } else {
            this.layoutWidth = i;
        }
    }

    public int getLayoutHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue() : this.layoutHeight;
    }

    public void setLayoutHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80610c9", new Object[]{this, new Integer(i)});
        } else {
            this.layoutHeight = i;
        }
    }

    public double getWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e3", new Object[]{this})).doubleValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        return bcVar == null ? mto.a.GEO_NOT_SUPPORT : bcVar.f12076a;
    }

    public void setWeight(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e944af5d", new Object[]{this, new Double(d)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.f12076a = d;
    }

    public void setMarginBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41af8541", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.d = i;
    }

    public int getPaddingLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        be beVar = this.dxNodePadding;
        if (beVar != null) {
            return beVar.f12078a;
        }
        return 0;
    }

    public void setPaddingLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.f12078a = i;
    }

    public void setPaddingBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc124f81", new Object[]{this});
        } else if (this.dxNodePadding == null) {
            this.dxNodePadding = new be();
            setStatInPropertyDeepCloneFlag(1);
        } else if (getStatInPropertyDeepCloneFlag(1)) {
        } else {
            this.dxNodePadding = this.dxNodePadding.a(true);
            setStatInPropertyDeepCloneFlag(1);
        }
    }

    public int getPaddingRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        be beVar = this.dxNodePadding;
        if (beVar != null) {
            return beVar.b;
        }
        return 0;
    }

    public void setPaddingRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.b = i;
    }

    public int getPaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        be beVar = this.dxNodePadding;
        if (beVar != null) {
            return beVar.c;
        }
        return 0;
    }

    public void setPaddingBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.c = i;
    }

    public int getPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        be beVar = this.dxNodePadding;
        if (beVar != null) {
            return beVar.d;
        }
        return 0;
    }

    public void setPaddingTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
            return;
        }
        setPaddingBeforeCheck();
        this.dxNodePadding.d = i;
    }

    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.f12070a = i;
        if (!this.isEnableButter || this.status == -1) {
            return;
        }
        changeVisibility();
    }

    public void changeVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b79ba69", new Object[]{this});
            return;
        }
        int checkRealVisibility = checkRealVisibility();
        View nativeView = getNativeView();
        if (nativeView == null) {
            return;
        }
        setRealViewVisibility(nativeView, checkRealVisibility);
    }

    public int checkRealVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e56376f2", new Object[]{this})).intValue();
        }
        DXWidgetNode dXWidgetNode = this.parentWidget;
        if (dXWidgetNode == null) {
            return getVisibility();
        }
        int checkRealVisibility = dXWidgetNode.checkRealVisibility();
        if (checkRealVisibility == 0) {
            return getVisibility();
        }
        return checkRealVisibility == 1 ? 1 : 2;
    }

    public int getLayoutGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5d9588", new Object[]{this})).intValue();
        }
        ay ayVar = this.dxNodeCommon;
        if (ayVar != null) {
            return ayVar.b;
        }
        return 0;
    }

    public void setLayoutGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c681121a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.b = i;
        this.propertyInitFlag |= 1;
    }

    public int getChildGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c013082", new Object[]{this})).intValue();
        }
        ay ayVar = this.dxNodeCommon;
        if (ayVar != null) {
            return ayVar.c;
        }
        return 0;
    }

    public void setChildGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb60c8", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCommonBeforeCheck();
        this.dxNodeCommon.c = i;
    }

    public int getDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9db770c3", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar == null || bcVar.b == -1) {
            DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
            if (dXRuntimeContext == null) {
                return 0;
            }
            return dXRuntimeContext.w();
        }
        return this.dxNodeLowFrequencyProperty.b;
    }

    public void setDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12d843f", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.b = i;
    }

    public int getEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84d1ce05", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.d;
        }
        return 1;
    }

    public void setEnabled(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1623d", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.d = i;
        if (!this.isEnableButter) {
            return;
        }
        if (getEnabled() == 1) {
            z = true;
        }
        View nativeView = getNativeView();
        if (nativeView == null || nativeView.isEnabled() == z) {
            return;
        }
        nativeView.setEnabled(z);
    }

    public int getMinHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ce02a5d", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.f;
        }
        return 0;
    }

    public void setMinHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271bfde5", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.f = i;
    }

    public int getMinWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("253f6784", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.g;
        }
        return 0;
    }

    public void setMinWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15846406", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.g = i;
    }

    public boolean isFlatten() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8d5e105", new Object[]{this})).booleanValue() : this.isFlatten;
    }

    public void setFlatten(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6838d2b", new Object[]{this, new Boolean(z)});
        } else {
            this.isFlatten = z;
        }
    }

    public boolean isNeedSetBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f969febb", new Object[]{this})).booleanValue() : this.needSetBackground;
    }

    public void setNeedSetBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb48035", new Object[]{this, new Boolean(z)});
        } else {
            this.needSetBackground = z;
        }
    }

    public void setCornerRadiusLeftTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faec4bb7", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.b = i;
    }

    public void setCornerRadiusRightTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b70f1a", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.c = i;
    }

    public void setCornerRadiusLeftBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a09fd81", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.d = i;
    }

    public void setCornerRadiusRightBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d15b3e", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeCornerBeforeCheck();
        this.dxNodeCorner.e = i;
    }

    public int getMarginLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue();
        }
        bd bdVar = this.dxNodeMargin;
        if (bdVar != null) {
            return bdVar.f12077a;
        }
        return 0;
    }

    public void setMarginLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274d54e5", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.f12077a = i;
    }

    public int getMarginTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee5420b", new Object[]{this})).intValue();
        }
        bd bdVar = this.dxNodeMargin;
        if (bdVar != null) {
            return bdVar.b;
        }
        return 0;
    }

    public void setMarginTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9dbf7", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.b = i;
    }

    public int getMarginRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ddec852", new Object[]{this})).intValue();
        }
        bd bdVar = this.dxNodeMargin;
        if (bdVar != null) {
            return bdVar.c;
        }
        return 0;
    }

    public void setMarginRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f74b90", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeMarginBeforeCheck();
        this.dxNodeMargin.c = i;
    }

    public int getMarginBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f2a18e9", new Object[]{this})).intValue();
        }
        bd bdVar = this.dxNodeMargin;
        if (bdVar != null) {
            return bdVar.d;
        }
        return 0;
    }

    public String getAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95de4eeb", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.e;
        }
        return null;
    }

    public JSONObject getAnimationObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f72bf070", new Object[]{this});
        }
        if (TextUtils.isEmpty(getAnimation())) {
            return null;
        }
        JSONObject jSONObject = this.animationObj;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            this.animationObj = JSON.parseObject(getAnimation());
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
        return this.animationObj;
    }

    public void setAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8294a53", new Object[]{this, str});
        } else if (bx.t()) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.dxNodeConstantProperty == null) {
                this.dxNodeConstantProperty = new az();
            }
            this.dxNodeConstantProperty.e = str;
            try {
                this.animationObj = JSON.parseObject(getAnimation());
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        } else {
            if (this.dxNodeConstantProperty == null) {
                this.dxNodeConstantProperty = new az();
            }
            this.dxNodeConstantProperty.e = str;
        }
    }

    public float getTranslateX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1cd1537", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.f12068a;
        }
        return 0.0f;
    }

    public void setTranslateX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beac94cd", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.f12068a = f;
    }

    public float getTranslateY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1db2cb8", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.b;
        }
        return 0.0f;
    }

    public void setTranslateY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0616d6c", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.b = f;
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.c;
        }
        return 1.0f;
    }

    public void setScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.c = f;
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.d;
        }
        return 1.0f;
    }

    public void setScaleY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.d = f;
    }

    public float getRotationX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc08445b", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.e;
        }
        return 0.0f;
    }

    public void setRotationX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf718c1", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.e = f;
    }

    public float getRotationY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc165bdc", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.f;
        }
        return 0.0f;
    }

    public void setRotationY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eabf160", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.f = f;
    }

    public float getRotationZ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc24735d", new Object[]{this})).floatValue();
        }
        aw awVar = this.dxNodeAnimation;
        if (awVar != null) {
            return awVar.g;
        }
        return 0.0f;
    }

    public void setRotationZ(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8060c9ff", new Object[]{this, new Float(f)});
            return;
        }
        setNodeAnimationBeforeCheck();
        this.dxNodeAnimation.g = f;
    }

    public aw getDxNodeAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aw) ipChange.ipc$dispatch("88d27682", new Object[]{this}) : this.dxNodeAnimation;
    }

    public boolean isDisableDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5ad3c2", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.l;
        }
        return false;
    }

    public void setDisableDarkMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ca3a0e", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.l = z;
    }

    public int getEventResponseMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfdcf102", new Object[]{this})).intValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.h;
        }
        return 0;
    }

    public void setEventResponseMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e053fe0", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.h = i;
    }

    public void setOpenNewFastReturnLogic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0286af", new Object[]{this, new Boolean(z)});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.c = z;
    }

    public boolean isSelfResponseEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e485d1ee", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        return bcVar == null || bcVar.h == 0 || this.dxNodeLowFrequencyProperty.h == 2;
    }

    public boolean isChildResponseEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf622f2", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        return bcVar == null || bcVar.h == 0 || this.dxNodeLowFrequencyProperty.h == 1;
    }

    public Map<String, fqe> getBindingXSpecMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5926b7f4", new Object[]{this}) : this.bindingXSpecMap;
    }

    public void setBindingXSpecMap(Map<String, fqe> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4fd7b2", new Object[]{this, map});
        } else {
            this.bindingXSpecMap = map;
        }
    }

    public void setStatFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d05e3a", new Object[]{this, new Integer(i)});
        } else {
            this.privateFlags = i | this.privateFlags;
        }
    }

    public void unsetStatFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87a1ad3", new Object[]{this, new Integer(i)});
        } else {
            this.privateFlags = (~i) & this.privateFlags;
        }
    }

    public boolean getStatInPrivateFlags(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eed3094d", new Object[]{this, new Integer(i)})).booleanValue() : (this.privateFlags & i) == i;
    }

    public int getLastAutoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d22d8ed0", new Object[]{this})).intValue() : this.lastAutoId;
    }

    public void setLastAutoId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5b593a", new Object[]{this, new Integer(i)});
        } else {
            this.lastAutoId = i;
        }
    }

    public DXWidgetNode getSourceWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("dbc277db", new Object[]{this});
        }
        WeakReference<DXWidgetNode> weakReference = this.sourceWidgetWR;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getSourceAutoId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69169c95", new Object[]{this})).intValue() : this.sourceAutoId;
    }

    public void setSourceWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0fd467", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            this.sourceWidgetWR = new WeakReference<>(dXWidgetNode);
            this.sourceAutoId = dXWidgetNode.getAutoId();
        }
    }

    public b getBackgroundGradient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a393815c", new Object[]{this});
        }
        ay ayVar = this.dxNodeCommon;
        if (ayVar != null) {
            return ayVar.f;
        }
        return null;
    }

    public void setBackgroundGradient(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83f4d8a", new Object[]{this, bVar});
            return;
        }
        setNodeCommonBeforeCheck();
        this.needSetBackground = true;
        this.dxNodeCommon.f = bVar;
    }

    public DXWidgetNode getReferenceNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("7f5f1a5d", new Object[]{this});
        }
        if (this.isEnableButter) {
            return this;
        }
        if (bx.p()) {
            WeakReference<DXWidgetNode> weakReference = this.referenceNode;
            return (weakReference == null || weakReference.get() == null) ? this : this.referenceNode.get();
        }
        WeakReference<DXWidgetNode> weakReference2 = this.referenceNode;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    public void setReferenceNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b267bd", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
            this.referenceNode = null;
        } else {
            this.referenceNode = new WeakReference<>(dXWidgetNode);
        }
    }

    public boolean isClipChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df8b07c4", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.e;
        }
        return true;
    }

    public void removeBindingXSpec(fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a447392f", new Object[]{this, fqeVar});
        } else if (this.bindingXExecutingMap == null || fqeVar == null || TextUtils.isEmpty(fqeVar.f28115a)) {
        } else {
            this.bindingXExecutingMap.remove(fqeVar.f28115a);
        }
    }

    public void putBindingXExecutingSpec(fqe fqeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f0f288", new Object[]{this, fqeVar});
        } else if (fqeVar == null || TextUtils.isEmpty(fqeVar.f28115a)) {
        } else {
            if (this.bindingXExecutingMap == null) {
                this.bindingXExecutingMap = new HashMap();
            }
            this.bindingXExecutingMap.put(fqeVar.f28115a, fqeVar);
        }
    }

    public boolean hasExecutingAnimationSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84d7dbd2", new Object[]{this})).booleanValue();
        }
        Map<String, fqe> map = this.bindingXExecutingMap;
        return map != null && map.size() > 0;
    }

    public void setBindingXExecutingMap(Map<String, fqe> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1048b1f", new Object[]{this, map});
        } else {
            this.bindingXExecutingMap = map;
        }
    }

    public Map<String, fqe> getBindingXExecutingMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7efc034f", new Object[]{this}) : this.bindingXExecutingMap;
    }

    public boolean containsExecutingAnimationSpec(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc3f5e21", new Object[]{this, str})).booleanValue();
        }
        Map<String, fqe> map = this.bindingXExecutingMap;
        if (map != null && map.size() != 0 && !TextUtils.isEmpty(str)) {
            return this.bindingXExecutingMap.containsKey(str);
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f12031a = -1;
        private GradientDrawable.Orientation b;
        private int[] c;

        static {
            kge.a(1958724144);
        }

        public GradientDrawable.Orientation a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable.Orientation) ipChange.ipc$dispatch("9c872df6", new Object[]{this}) : this.b;
        }

        public void a(GradientDrawable.Orientation orientation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a49b33b0", new Object[]{this, orientation});
            } else {
                this.b = orientation;
            }
        }

        public int[] b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a9d5fa1b", new Object[]{this}) : this.c;
        }

        public void a(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            } else {
                this.c = iArr;
            }
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f12031a;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.f12031a = i;
            }
        }
    }

    public int tryFetchDarkModeColor(String str, int i, int i2) {
        Integer num;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1cfecf", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!needHandleDark(getDXRuntimeContext())) {
            return i2;
        }
        if (getDarkModeColorMap() != null) {
            if (getDXRuntimeContext() != null && getDXRuntimeContext().D() != null && getDXRuntimeContext().D().S() != null) {
                z = getDXRuntimeContext().D().S().a();
            }
            if (!z && (num = getDarkModeColorMap().get(str)) != null) {
                this.hasHandleDark = true;
                return num.intValue();
            }
        }
        if (getDXRuntimeContext() != null && getDXRuntimeContext().D() != null && getDXRuntimeContext().D().S() != null) {
            this.hasHandleDark = true;
            return getDXRuntimeContext().D().S().a(i, i2);
        } else if (!DXDarkModeCenter.c()) {
            return i2;
        } else {
            this.hasHandleDark = true;
            return DXDarkModeCenter.a(i, i2);
        }
    }

    public boolean needHandleDark(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93a709b0", new Object[]{this, dXRuntimeContext})).booleanValue() : DXDarkModeCenter.b() && DXDarkModeCenter.a(dXRuntimeContext) && !isDisableDarkMode();
    }

    public void setForceDark(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257e674c", new Object[]{this, view});
        } else if (!DXDarkModeCenter.b() || !DXDarkModeCenter.a(getDXRuntimeContext())) {
        } else {
            if (isDisableDarkMode()) {
                DXDarkModeCenter.a(getDXRuntimeContext(), view);
            } else if (!extraHandleDark() && !this.hasHandleDark) {
            } else {
                DXDarkModeCenter.a(getDXRuntimeContext(), view);
            }
        }
    }

    public byte[] getDxExprBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("46cecaa", new Object[]{this}) : this.dxExprBytes;
    }

    public void setDxExprBytes(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64dd0f0e", new Object[]{this, bArr});
        } else {
            this.dxExprBytes = bArr;
        }
    }

    public JSONObject getTborderJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d60f2819", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.f;
        }
        return null;
    }

    public boolean isChildWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("967102a3", new Object[]{this})).booleanValue();
        }
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        return queryRootWidgetNode != null && (queryRootWidgetNode.getParentWidget() instanceof ac);
    }

    public void updateRefreshType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
            return;
        }
        DXRuntimeContext dXRuntimeContext = this.dXRuntimeContext;
        if (dXRuntimeContext == null) {
            return;
        }
        dXRuntimeContext.d(i);
        if (this.childrenCount <= 0) {
            return;
        }
        for (DXWidgetNode dXWidgetNode : this.children) {
            dXWidgetNode.updateRefreshType(i);
        }
    }

    public boolean isOpenNewFastReturnLogic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e62b91", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.c;
        }
        return false;
    }

    public final void beginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9c9a05", new Object[]{this, new Boolean(z)});
            return;
        }
        bq bqVar = this.strategy;
        if (bqVar != null) {
            bqVar.a(this, z);
            return;
        }
        onBeginParser();
        onBeginParser(z);
    }

    public void beginParserWithButter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cd1d3f", new Object[]{this, new Boolean(z)});
            return;
        }
        onBeginParser();
        onBeginParser(z);
    }

    public final void endParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617d693", new Object[]{this, new Boolean(z)});
            return;
        }
        bq bqVar = this.strategy;
        if (bqVar != null) {
            bqVar.b(this, z);
            return;
        }
        if (fqi.b(getDXRuntimeContext())) {
            processUserId();
        }
        onEndParser();
        onEndParser(z);
    }

    public void endParserWithButter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648804d", new Object[]{this, new Boolean(z)});
            return;
        }
        if (fqi.b(getDXRuntimeContext())) {
            processUserId();
        }
        onEndParser();
        onEndParser(z);
    }

    public final void endSetConstAttribute(Context context) {
        View nativeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873f5941", new Object[]{this, context});
            return;
        }
        onEndSetConstAttribute(context);
        if (!isSoftwareRender() || (nativeView = getNativeView()) == null) {
            return;
        }
        nativeView.setLayerType(1, null);
    }

    public final void beginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f52d08f", new Object[]{this, context});
        } else {
            onBeginSetConstAttribute(context);
        }
    }

    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        } else {
            createNativeView(context);
        }
    }

    public void processUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410f1b9c", new Object[]{this});
        } else if (TextUtils.isEmpty(this.userId)) {
        } else {
            DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
            if (!(queryRootWidgetNode instanceof m)) {
                return;
            }
            Map<String, WeakReference<DXWidgetNode>> dxUserIdMap = ((m) queryRootWidgetNode).getDxUserIdMap();
            WeakReference<DXWidgetNode> weakReference = dxUserIdMap.get(this.userId);
            if (weakReference != null && weakReference.get() != null) {
                return;
            }
            dxUserIdMap.put(this.userId, new WeakReference<>(this));
        }
    }

    public com.taobao.android.dinamicx.model.b<fqp> getCodeMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("92dffa88", new Object[]{this});
        }
        az azVar = this.dxNodeConstantProperty;
        if (azVar != null) {
            return azVar.d;
        }
        return null;
    }

    public void setCodeMap(com.taobao.android.dinamicx.model.b<fqp> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711a4be4", new Object[]{this, bVar});
            return;
        }
        if (this.dxNodeConstantProperty == null) {
            this.dxNodeConstantProperty = new az();
        }
        this.dxNodeConstantProperty.d = bVar;
    }

    public String toTreeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cda5452", new Object[]{this});
        }
        DXWidgetNode queryRootWidgetNode = queryRootWidgetNode();
        if (queryRootWidgetNode != this) {
            return queryRootWidgetNode.toTreeInfo();
        }
        JSONObject jSONObject = new JSONObject(true);
        parseTreeInfo(jSONObject);
        return jSONObject.toJSONString();
    }

    private void parseTreeInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173f656a", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (this instanceof DXAbsContainerBaseLayout) {
            DXAbsContainerBaseLayout dXAbsContainerBaseLayout = (DXAbsContainerBaseLayout) this;
            if (dXAbsContainerBaseLayout.d() != null) {
                for (DXWidgetNode dXWidgetNode : dXAbsContainerBaseLayout.d()) {
                    dXWidgetNode.parseTreeInfo(jSONObject2);
                }
            }
        }
        if (this instanceof v) {
            v vVar = (v) this;
            if (vVar.itemWidgetNodes != null) {
                Iterator<DXWidgetNode> it = vVar.itemWidgetNodes.iterator();
                while (it.hasNext()) {
                    it.next().parseTreeInfo(jSONObject2);
                }
            }
        }
        List<DXWidgetNode> list = this.children;
        if (list != null) {
            for (DXWidgetNode dXWidgetNode2 : list) {
                dXWidgetNode2.parseTreeInfo(jSONObject2);
            }
        }
        jSONObject.put(toSelfWidgetNodeInfo(), (Object) jSONObject2);
    }

    public String toSelfWidgetNodeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7c6c15e", new Object[]{this});
        }
        if ((this instanceof gba) || (this instanceof gay)) {
            return "";
        }
        return getClass().getName() + "@" + hashCode();
    }

    public gfl getDxv4Properties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfl) ipChange.ipc$dispatch("b2482597", new Object[]{this}) : this.dxv4Properties;
    }

    public void setDxv4Properties(gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0768d1", new Object[]{this, gflVar});
        } else {
            this.dxv4Properties = gflVar;
        }
    }

    public boolean isV4Node() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fe472f5", new Object[]{this})).booleanValue() : this.dxv4Properties != null;
    }

    public boolean isRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("307736d9", new Object[]{this})).booleanValue();
        }
        DXWidgetNode dXWidgetNode = this.parentWidget;
        return dXWidgetNode == null || (dXWidgetNode instanceof ac);
    }

    public DinamicXEngine getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b092b8e8", new Object[]{this});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext != null) {
            return dXRuntimeContext.D();
        }
        return null;
    }

    public Map<String, ggk> getVariableNameMap() {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb64533b", new Object[]{this});
        }
        if (!isV4Node() || (queryRootWidgetNode = queryRootWidgetNode()) == null || !queryRootWidgetNode.isV4Node()) {
            return null;
        }
        return queryRootWidgetNode.getDxv4Properties().h();
    }

    public boolean isShouldUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e029c31", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.m;
        }
        return true;
    }

    public boolean isRelayoutBoundary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9c037bc", new Object[]{this})).booleanValue();
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.n;
        }
        return false;
    }

    public void setStatAnimationFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809064c2", new Object[]{this, new Integer(i)});
        } else {
            this.animationFlags = i | this.animationFlags;
        }
    }

    public void unsetStatAnimationFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfec449", new Object[]{this, new Integer(i)});
        } else {
            this.animationFlags = (~i) & this.animationFlags;
        }
    }

    public boolean getStatInAnimationFlag(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e926003f", new Object[]{this, new Integer(i)})).booleanValue() : (this.animationFlags & i) == i;
    }

    public Map<String, Integer> getDarkModeColorMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e5c85044", new Object[]{this});
        }
        bc bcVar = this.dxNodeLowFrequencyProperty;
        if (bcVar != null) {
            return bcVar.k;
        }
        return null;
    }

    public void setDarkModeColorMap(HashMap<String, Integer> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a04278", new Object[]{this, hashMap});
            return;
        }
        setNodeLowFrequencyPropertyBeforeCheck();
        this.dxNodeLowFrequencyProperty.k = hashMap;
    }

    public int getOldWidthMeasureSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("848f281e", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.g;
        }
        return 0;
    }

    public int getOldHeightMeasureSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("793a279b", new Object[]{this})).intValue();
        }
        bb bbVar = this.dxNodeFrame;
        if (bbVar != null) {
            return bbVar.h;
        }
        return 0;
    }

    public void setOldWidthMeasureSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd231944", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.g = i;
    }

    public void setOldHeightMeasureSpec(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d798cf", new Object[]{this, new Integer(i)});
            return;
        }
        setNodeFrameBeforeCheck();
        this.dxNodeFrame.h = i;
    }

    public void setNodeMarginBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b61b21e", new Object[]{this});
        } else if (this.dxNodeMargin == null) {
            this.dxNodeMargin = new bd();
            setStatInPropertyDeepCloneFlag(2);
        } else if (getStatInPropertyDeepCloneFlag(2)) {
        } else {
            this.dxNodeMargin = this.dxNodeMargin.a(true);
            setStatInPropertyDeepCloneFlag(2);
        }
    }

    public void setNodeCornerBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bdf0297", new Object[]{this});
        } else if (this.dxNodeCorner == null) {
            this.dxNodeCorner = new ba();
            setStatInPropertyDeepCloneFlag(8);
        } else if (getStatInPropertyDeepCloneFlag(8)) {
        } else {
            this.dxNodeCorner = this.dxNodeCorner.a(true);
            setStatInPropertyDeepCloneFlag(8);
        }
    }

    public void setNodeAccessibilityBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6d3946", new Object[]{this});
        } else if (this.dxNodeAccessibility == null) {
            this.dxNodeAccessibility = new av();
            setStatInPropertyDeepCloneFlag(32);
        } else if (getStatInPropertyDeepCloneFlag(32)) {
        } else {
            this.dxNodeAccessibility = this.dxNodeAccessibility.a();
            setStatInPropertyDeepCloneFlag(32);
        }
    }

    public void setNodeBorderBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719337e0", new Object[]{this});
        } else if (this.dxNodeBorder == null) {
            this.dxNodeBorder = new ax();
            setStatInPropertyDeepCloneFlag(16);
        } else if (getStatInPropertyDeepCloneFlag(16)) {
        } else {
            this.dxNodeBorder = this.dxNodeBorder.a(true);
            setStatInPropertyDeepCloneFlag(16);
        }
    }

    public void setNodeCommonBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3546c41", new Object[]{this});
        } else if (this.dxNodeCommon == null) {
            this.dxNodeCommon = new ay();
            setStatInPropertyDeepCloneFlag(64);
        } else if (getStatInPropertyDeepCloneFlag(64)) {
        } else {
            this.dxNodeCommon = this.dxNodeCommon.a();
            setStatInPropertyDeepCloneFlag(64);
        }
    }

    public void setNodeFrameBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a231347", new Object[]{this});
        } else if (this.dxNodeFrame == null) {
            this.dxNodeFrame = new bb();
            setStatInPropertyDeepCloneFlag(128);
        } else if (getStatInPropertyDeepCloneFlag(128)) {
        } else {
            this.dxNodeFrame = this.dxNodeFrame.a();
            setStatInPropertyDeepCloneFlag(128);
        }
    }

    public void setNodeAnimationBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414ede50", new Object[]{this});
        } else if (this.dxNodeAnimation == null) {
            this.dxNodeAnimation = new aw();
            setStatInPropertyDeepCloneFlag(256);
        } else if (getStatInPropertyDeepCloneFlag(256)) {
        } else {
            this.dxNodeAnimation = this.dxNodeAnimation.a();
            setStatInPropertyDeepCloneFlag(256);
        }
    }

    public void setNodeLowFrequencyPropertyBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b52d88f", new Object[]{this});
        } else if (this.dxNodeLowFrequencyProperty == null) {
            this.dxNodeLowFrequencyProperty = new bc();
            setStatInPropertyDeepCloneFlag(4);
        } else if (getStatInPropertyDeepCloneFlag(4)) {
        } else {
            this.dxNodeLowFrequencyProperty = this.dxNodeLowFrequencyProperty.a(true);
            setStatInPropertyDeepCloneFlag(4);
        }
    }

    public boolean getStatInPropertyDeepCloneFlag(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52704e47", new Object[]{this, new Integer(i)})).booleanValue() : (this.propertyDeepCloneFlag & i) == i;
    }

    public void setStatInPropertyDeepCloneFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24994b4f", new Object[]{this, new Integer(i)});
        } else {
            this.propertyDeepCloneFlag = i | this.propertyDeepCloneFlag;
        }
    }

    public void unsetStatFlagInPropertyDeepCloneFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9ce0122", new Object[]{this, new Integer(i)});
        } else {
            this.propertyDeepCloneFlag = (~i) & this.propertyDeepCloneFlag;
        }
    }

    public void initOriginInfo(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87955e4", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            bh bhVar = new bh();
            bhVar.f12081a = dXWidgetNode;
            this.originInfo = bhVar;
            setSourceWidget(dXWidgetNode);
        }
    }

    public bh getOriginInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bh) ipChange.ipc$dispatch("33d8c1a4", new Object[]{this}) : this.originInfo;
    }

    public DXWidgetNode getOriginNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f648fae4", new Object[]{this});
        }
        bh bhVar = this.originInfo;
        if (bhVar != null) {
            return bhVar.f12081a;
        }
        return null;
    }

    public z getFlattenNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("3d63c2ec", new Object[]{this}) : this.flattenNode;
    }

    public void setFlattenNode(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c22898", new Object[]{this, zVar});
        } else {
            this.flattenNode = zVar;
        }
    }
}
