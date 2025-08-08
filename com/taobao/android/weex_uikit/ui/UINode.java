package com.taobao.android.weex_uikit.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.ui.k;
import com.taobao.android.weex_uikit.ui.l;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.jvb;
import tb.jvo;
import tb.jvp;
import tb.jwx;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class UINode extends aa implements INode, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean added;
    private a animNodeInfo;
    private com.taobao.android.weex_uikit.util.a animationHolder;
    private i attachedTree;
    private g<u> attributes;
    private Paint borderPaint;
    private g<w> extras;
    private Rect globalVisibleRect;
    private MUSDKInstance instance;
    private boolean isMeasured;
    private boolean isRootNode;
    private c layoutProcessor;
    private s layoutState;
    private boolean locationChanged;
    private final com.taobao.android.weex_framework.util.o mAppearRunnable;
    private boolean mHasAppearSent;
    private boolean mHasDelayedAppear;
    private boolean mHasDelayedViewAppear;
    private boolean mHasViewAppearSent;
    private volatile String mLogName;
    private final com.taobao.android.weex_framework.util.o mViewAppearRunnable;
    private boolean mountState;
    private com.taobao.android.weex_framework.ui.d<UINode> nodeHolder;
    private int nodeId;
    private g<x> nodeInfo;
    private boolean notifyEngineRelayout;
    private UINode parentNode;
    private int previousParentLeft;
    private int previousParentTop;
    private e renderNode;
    private ab styleHelper;
    private final n touchHelper;
    private boolean transformApplied;
    private boolean updatingStyle;

    static {
        kge.a(1491405721);
        kge.a(-713936788);
        kge.a(939607522);
        kge.a(1028243835);
        kge.a(-1341537095);
    }

    public static /* synthetic */ Object ipc$super(UINode uINode, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -940796597) {
            super.unmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode != 26733618) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.mount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
    }

    public void addViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf16e8f", new Object[]{this});
        }
    }

    public void dispatchAccessibleChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edca74b", new Object[]{this});
        }
    }

    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
        }
    }

    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
        }
    }

    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acae82d0", new Object[]{this, str});
        }
        return null;
    }

    public boolean hasViewChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf9c208", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
        }
    }

    public void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d011af1", new Object[]{this, uINode, str, mUSValueArr});
        }
    }

    public void onLocationChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1a0e0b", new Object[]{this});
        }
    }

    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
        }
    }

    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
        }
    }

    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        return false;
    }

    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
        }
    }

    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        }
    }

    public void removeViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2331f2", new Object[]{this});
        }
    }

    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean viewSupportRenderNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c229a54d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean access$000(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29d5af5", new Object[]{uINode})).booleanValue() : uINode.mountState;
    }

    public static /* synthetic */ boolean access$102(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b8c9c8a", new Object[]{uINode, new Boolean(z)})).booleanValue();
        }
        uINode.mHasAppearSent = z;
        return z;
    }

    public static /* synthetic */ boolean access$202(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b16368b", new Object[]{uINode, new Boolean(z)})).booleanValue();
        }
        uINode.mHasViewAppearSent = z;
        return z;
    }

    public static /* synthetic */ a access$300(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fdb90f59", new Object[]{uINode}) : uINode.animNodeInfo;
    }

    public void setLogName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895443fe", new Object[]{this, str});
        } else {
            this.mLogName = str;
        }
    }

    private void createHolders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7bc2b2", new Object[]{this});
            return;
        }
        this.attributes = new g<>(this);
        this.attributes.a(createAttribute(false), createAttribute(true));
        this.extras = new g<>(this);
        this.extras.a(createExtra(false), createExtra(true));
        this.nodeInfo = new g<>(this);
        this.nodeInfo.a(createNodeInfo(false), createNodeInfo(true));
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public Rect getGlobalVisibleRect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("7602996d", new Object[]{this}) : this.globalVisibleRect;
    }

    private x createNodeInfo(boolean z) {
        x xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x) ipChange.ipc$dispatch("87987a0f", new Object[]{this, new Boolean(z)});
        }
        if (com.taobao.android.weex_framework.m.f15996a) {
            xVar = new y(this);
        } else {
            xVar = new x(this);
        }
        if (z) {
            xVar.l();
        }
        return xVar;
    }

    public u createAttribute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("b8285bc6", new Object[]{this, new Boolean(z)});
        }
        u uVar = new u(this);
        if (z) {
            uVar.l();
        }
        return uVar;
    }

    public w createExtra(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("e3d99378", new Object[]{this, new Boolean(z)});
        }
        w wVar = new w(this);
        if (z) {
            wVar.l();
        }
        return wVar;
    }

    public UINode(int i) {
        super(null);
        this.borderPaint = new Paint(1);
        this.animNodeInfo = new a(this);
        this.globalVisibleRect = new Rect();
        this.locationChanged = true;
        this.previousParentLeft = -1;
        this.previousParentTop = -1;
        this.mountState = false;
        this.mHasDelayedAppear = false;
        this.mHasDelayedViewAppear = false;
        this.mHasAppearSent = false;
        this.mHasViewAppearSent = false;
        this.mAppearRunnable = new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_uikit.ui.UINode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!UINode.access$000(UINode.this)) {
                } else {
                    UINode.access$102(UINode.this, true);
                    UINode.this.fireEvent("appear", null);
                }
            }
        };
        this.mViewAppearRunnable = new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_uikit.ui.UINode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!UINode.access$000(UINode.this)) {
                } else {
                    UINode.access$202(UINode.this, true);
                    UINode.this.fireEvent(Constants.Event.VIEWAPPEAR, null);
                }
            }
        };
        this.renderNode = com.taobao.android.weex_uikit.ui.cache.e.a(this);
        this.nodeId = i;
        this.touchHelper = onCreateTouchHelper();
        createHolders();
        this.borderPaint.setStyle(Paint.Style.STROKE);
        onNodeCreate(this);
    }

    public void notifyLocationChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243dd0f5", new Object[]{this});
            return;
        }
        onLocationChange();
        requestLayout();
        s sVar = this.layoutState;
        if (sVar != null) {
            sVar.h();
            this.layoutState.k();
        }
        i attachedTree = getAttachedTree();
        if (attachedTree != null && (attachedTree.g() instanceof MUSView)) {
            attachedTree.g().getMountState().b();
            attachedTree.g().requestLayout();
        }
        this.locationChanged = true;
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    /* renamed from: getAttachedView  reason: collision with other method in class */
    public MUSView mo1035getAttachedView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSView) ipChange.ipc$dispatch("188dab12", new Object[]{this});
        }
        i attachedTree = getAttachedTree();
        if (attachedTree == null) {
            return null;
        }
        return attachedTree.g();
    }

    public void updateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d5fce4", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.layoutState = sVar;
        this.attachedTree = sVar.a();
        if (!this.added) {
            sVar.a(this);
            this.added = true;
        }
        if (this.previousParentLeft == i && this.previousParentTop == i2 && !this.locationChanged) {
            return;
        }
        this.locationChanged = false;
        int left = getLeft() + i;
        int top = getTop() + i2;
        this.previousParentTop = i2;
        this.previousParentLeft = i;
        this.globalVisibleRect.set(left, top, getLayoutWidth() + left, getLayoutHeight() + top);
        if (!isMounted()) {
            return;
        }
        t.a(this, getMountContent(), this.globalVisibleRect);
    }

    public void setParentNode(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6dad3", new Object[]{this, uINode});
        } else {
            this.parentNode = uINode;
        }
    }

    public UINode getParentNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("3ba74e01", new Object[]{this}) : this.parentNode;
    }

    public x getNodeInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("af4e4d83", new Object[]{this}) : this.nodeInfo.a();
    }

    public a getAnimNodeInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("da3e4b69", new Object[]{this}) : this.animNodeInfo;
    }

    public String getAriaLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bde13564", new Object[]{this});
        }
        if (getNodeInfo().C()) {
            return null;
        }
        String D = getNodeInfo().D();
        if (!StringUtils.isEmpty(D)) {
            return D;
        }
        String str = (String) getExtra("ariaLabel");
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        if (!hasEvent("click")) {
            return null;
        }
        return "";
    }

    public n onCreateTouchHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("b0d04501", new Object[]{this}) : new n(this);
    }

    public final void updateLayout(int i, int i2, int i3, int i4) {
        BorderProp a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdddb41a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.isMeasured = true;
        Rect rect = new Rect(i, i2, i3, i4);
        c cVar = this.layoutProcessor;
        if (cVar != null) {
            cVar.modifyFrame(rect);
        }
        getNodeInfo().a(rect.left, rect.top, rect.right, rect.bottom);
        if (!getNodeInfo().k() && (a2 = getNodeInfo().a(false)) != null) {
            a2.e(i3 - i, i4 - i2);
            a2.a();
        }
        onUpdateLayout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void collectBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        this.nodeInfo.a(list);
        this.attributes.a(list);
        this.extras.a(list);
        dispatchBatchTasks(list);
        postCollectBatchTask(list);
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void bindNodeHolder(com.taobao.android.weex_framework.ui.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4b6d9c", new Object[]{this, dVar});
        } else {
            this.nodeHolder = dVar;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        this.instance = mUSDKInstance;
        if (mUSDKInstance != null) {
            setLogName(mUSDKInstance.getJustCreateTagName());
        }
        onBindInstance(this, mUSDKInstance);
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public MUSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSDKInstance) ipChange.ipc$dispatch("ab68dab8", new Object[]{this}) : this.instance;
    }

    public int getNodeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("246ed4ad", new Object[]{this})).intValue() : this.nodeId;
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void updateStyles(MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edda560", new Object[]{this, mUSProps});
            return;
        }
        List<com.taobao.android.weex_framework.t> rawProps = mUSProps.getRawProps();
        if (rawProps.isEmpty()) {
            return;
        }
        this.updatingStyle = true;
        for (com.taobao.android.weex_framework.t tVar : rawProps) {
            onUpdateStyle(this, tVar.f16074a, tVar.b);
        }
        ab abVar = this.styleHelper;
        if (abVar != null) {
            abVar.a();
        }
        this.updatingStyle = false;
        if (!this.notifyEngineRelayout) {
            return;
        }
        relayout();
    }

    private boolean updateArias(com.taobao.android.weex_framework.t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e0245c5", new Object[]{this, tVar})).booleanValue();
        }
        if (StringUtils.isEmpty(tVar.f16074a)) {
            return false;
        }
        String str = tVar.f16074a;
        char c = 65535;
        switch (str.hashCode()) {
            case -1551689441:
                if (str.equals(MUSConstants.ARIA_ROLE)) {
                    c = 2;
                    break;
                }
                break;
            case -1111969773:
                if (str.equals("ariaHidden")) {
                    c = 1;
                    break;
                }
                break;
            case -863700117:
                if (str.equals("ariaLabel")) {
                    c = 0;
                    break;
                }
                break;
            case -9888733:
                if (str.equals("className")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            onAriaLabel(tVar.b);
            return true;
        } else if (c == 1) {
            onAriaHidden(tVar.b);
            return true;
        } else if (c != 2) {
            return c == 3;
        } else {
            onAriaRole(tVar.b);
            return true;
        }
    }

    private void onAriaLabel(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77056100", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            getNodeInfo().b("");
        } else {
            getNodeInfo().b(mUSValue.getStringValue());
        }
    }

    private void onAriaRole(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca1b8d2", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            getNodeInfo().l(null);
        } else {
            getNodeInfo().l(mUSValue.getStringValue());
        }
    }

    private void onAriaHidden(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbd406", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            getNodeInfo().b(false);
        } else {
            getNodeInfo().b(mUSValue.getBoolValue());
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void updateAttrs(MUSProps mUSProps) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3699fae", new Object[]{this, mUSProps});
            return;
        }
        List<com.taobao.android.weex_framework.t> rawProps = mUSProps.getRawProps();
        if (rawProps.isEmpty()) {
            return;
        }
        this.updatingStyle = true;
        for (com.taobao.android.weex_framework.t tVar : rawProps) {
            if (!updateArias(tVar)) {
                if (isGenerated()) {
                    try {
                        if (!onUpdateAttr(this, tVar.f16074a, tVar.b) && com.taobao.android.weex_framework.util.g.a()) {
                            com.taobao.android.weex_framework.util.g.d("[Render]", "Attribute/style \"" + tVar.f16074a + "\" is not support in <" + getLogName() + ">");
                        }
                    } catch (Exception e) {
                        com.taobao.android.weex_framework.monitor.b.a();
                        if (com.taobao.android.weex_framework.util.g.a()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Attribute/style \"");
                            sb.append(tVar.f16074a);
                            sb.append("\" error for value: ");
                            sb.append(tVar.b == null ? "null" : tVar.b.toShortString());
                            sb.append(" in <");
                            sb.append(getLogName());
                            sb.append(">, error detail:");
                            sb.append(e.getMessage());
                            com.taobao.android.weex_framework.util.g.f("[Render]", sb.toString());
                            e.printStackTrace();
                        }
                    }
                } else {
                    onUpdateAttr(tVar.f16074a, tVar.b);
                }
            }
        }
        this.updatingStyle = false;
        if (!this.notifyEngineRelayout) {
            return;
        }
        relayout();
    }

    public String getLogName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a11b60e0", new Object[]{this}) : this.mLogName;
    }

    public void addEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85d704a", new Object[]{this, str});
            return;
        }
        getNodeInfo().i(str);
        char c = 65535;
        switch (str.hashCode()) {
            case -1578593149:
                if (str.equals("touchstart")) {
                    c = 2;
                    break;
                }
                break;
            case -1411068523:
                if (str.equals("appear")) {
                    c = 5;
                    break;
                }
                break;
            case -819532484:
                if (str.equals("touchend")) {
                    c = 4;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 0;
                    break;
                }
                break;
            case 348755879:
                if (str.equals("longtap")) {
                    c = 1;
                    break;
                }
                break;
            case 364536720:
                if (str.equals("touchmove")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            setOnClickListener(new jvo(this.instance, getNodeId()));
            notifyAccessibleChanged(true);
        } else if (c == 1) {
            setLongClickListener(new jvp(this.instance, getNodeId()));
        } else if (c == 2) {
            this.touchHelper.d(true);
        } else if (c == 3) {
            this.touchHelper.e(true);
        } else if (c == 4) {
            this.touchHelper.f(true);
        } else if (c != 5 || !this.mountState) {
        } else {
            notifyMountState();
        }
    }

    public void setLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713da630", new Object[]{this, onLongClickListener});
            return;
        }
        n nVar = this.touchHelper;
        if (onLongClickListener == null) {
            z = false;
        }
        nVar.c(z);
        this.touchHelper.a(onLongClickListener);
        if (!(getMountContent() instanceof View)) {
            return;
        }
        com.taobao.android.weex_uikit.util.e.c(this, (View) getMountContent());
    }

    public void addOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492482f6", new Object[]{this, onClickListener});
        } else {
            this.touchHelper.a(onClickListener);
        }
    }

    public void removeClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b1931a", new Object[]{this, onClickListener});
        } else {
            this.touchHelper.b(onClickListener);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        n nVar = this.touchHelper;
        if (onClickListener == null) {
            z = false;
        }
        nVar.b(z);
        this.touchHelper.c(onClickListener);
        if (!(getMountContent() instanceof View)) {
            return;
        }
        com.taobao.android.weex_uikit.util.e.b(this, (View) getMountContent());
    }

    public void removeEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36761a87", new Object[]{this, str});
            return;
        }
        getNodeInfo().j(str);
        char c = 65535;
        switch (str.hashCode()) {
            case -1578593149:
                if (str.equals("touchstart")) {
                    c = 2;
                    break;
                }
                break;
            case -819532484:
                if (str.equals("touchend")) {
                    c = 4;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c = 0;
                    break;
                }
                break;
            case 348755879:
                if (str.equals("longtap")) {
                    c = 1;
                    break;
                }
                break;
            case 364536720:
                if (str.equals("touchmove")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            setOnClickListener(null);
            notifyAccessibleChanged(true);
        } else if (c == 1) {
            setLongClickListener(null);
        } else if (c == 2) {
            this.touchHelper.d(false);
        } else if (c == 3) {
            this.touchHelper.e(false);
        } else if (c != 4) {
        } else {
            this.touchHelper.f(false);
        }
    }

    public boolean isMeasured() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc6eaa9b", new Object[]{this})).booleanValue() : this.isMeasured;
    }

    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        if (this.styleHelper == null) {
            this.styleHelper = new ab(this);
        }
        try {
            if (this.styleHelper.a(str, mUSValue)) {
                return true;
            }
            if (isGenerated()) {
                boolean onUpdateAttr = onUpdateAttr(this, str, mUSValue);
                if (!onUpdateAttr && com.taobao.android.weex_framework.util.g.a()) {
                    com.taobao.android.weex_framework.util.g.d("[Render]", "Attribute/style \"" + str + "\" is not support in <" + getLogName() + ">");
                }
                return onUpdateAttr;
            }
            return onUpdateAttr(str, mUSValue);
        } catch (Exception e) {
            com.taobao.android.weex_framework.monitor.b.a();
            StringBuilder sb = new StringBuilder();
            sb.append("Attribute/style \"");
            sb.append(str);
            sb.append("\" error for value: ");
            sb.append(mUSValue == null ? "null" : mUSValue.toShortString());
            sb.append(" in <");
            sb.append(getLogName());
            sb.append(">, error detail:");
            sb.append(e.getMessage());
            com.taobao.android.weex_framework.util.g.f("[Render]", sb.toString());
            e.printStackTrace();
            return true;
        }
    }

    public void onRefreshAttribute(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cdfa2d", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str)) {
            if (!com.taobao.android.weex_framework.util.g.a()) {
                return;
            }
            com.taobao.android.weex_framework.util.g.d("onRefreshAttribute error: attrName is empty");
        } else {
            com.taobao.android.weex_framework.bridge.c<UINode> c = this.nodeHolder.c(str);
            if (c == null) {
                return;
            }
            try {
                c.a(getInstance(), (MUSDKInstance) this, obj);
            } catch (Exception e) {
                com.taobao.android.weex_framework.monitor.b.a();
                if (!com.taobao.android.weex_framework.util.g.a()) {
                    return;
                }
                com.taobao.android.weex_framework.util.g.f("[Render]", "Attribute/style \"" + str + "\" error for value: " + obj + " in <" + getLogName() + ">, error detail:" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void refreshAttribute(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fdb07d", new Object[]{this, map});
        } else if (this.nodeHolder == null && !isGenerated()) {
            com.taobao.android.weex_framework.util.g.c(getClass().getSimpleName() + " onUpdateAttr node holder is null");
        } else if (isMounted()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (isGenerated()) {
                    onRefreshAttribute(this, getMountContent(), entry.getKey(), entry.getValue());
                } else {
                    onRefreshAttribute(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public boolean onUpdateAttr(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77acf1b", new Object[]{this, str, mUSValue})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return true;
        }
        com.taobao.android.weex_framework.ui.d<UINode> dVar = this.nodeHolder;
        if (dVar == null) {
            if (com.taobao.android.weex_framework.util.g.a()) {
                com.taobao.android.weex_framework.util.g.c(getClass().getSimpleName() + " onUpdateAttr node holder is null");
            }
            return false;
        }
        com.taobao.android.weex_framework.bridge.c<UINode> b = dVar.b(str);
        if (b == null) {
            if (com.taobao.android.weex_framework.util.g.a()) {
                com.taobao.android.weex_framework.util.g.d("[Render]", "Attribute/style \"" + str + "\" is not support in <" + getLogName() + ">");
            }
            return false;
        }
        try {
            b.a(getInstance(), (MUSDKInstance) this, mUSValue);
            return true;
        } catch (Exception e) {
            com.taobao.android.weex_framework.monitor.b.a();
            if (com.taobao.android.weex_framework.util.g.a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Attribute/style \"");
                sb.append(str);
                sb.append("\" error for value: ");
                sb.append(mUSValue == null ? "null" : mUSValue.toShortString());
                sb.append(" in <");
                sb.append(getLogName());
                sb.append(">, error detail:");
                sb.append(e.getMessage());
                com.taobao.android.weex_framework.util.g.f("[Render]", sb.toString());
                e.printStackTrace();
            }
            return true;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public final com.taobao.android.weex_framework.bridge.c<UINode> getInvoker(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("921b7a14", new Object[]{this, mUSValue});
        }
        com.taobao.android.weex_framework.ui.d<UINode> dVar = this.nodeHolder;
        if (dVar != null) {
            return dVar.a(mUSValue.getStringValue());
        }
        return null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c03524e0", new Object[]{this, motionEvent, view})).booleanValue() : this.touchHelper.a(motionEvent, view);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue() : this.touchHelper.b(motionEvent, view);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        Rect globalVisibleRect = getGlobalVisibleRect();
        return "<" + getClass().getSimpleName() + ">(" + this.nodeId + riy.BRACKET_END_STR + riy.BLOCK_START_STR + globalVisibleRect.left + "," + globalVisibleRect.top + "," + globalVisibleRect.right + "," + globalVisibleRect.bottom + riy.BLOCK_END_STR;
    }

    public final void draw(MUSNodeHost mUSNodeHost, Canvas canvas, int i, int i2, boolean z, float f) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be60289", new Object[]{this, mUSNodeHost, canvas, new Integer(i), new Integer(i2), new Boolean(z), new Float(f)});
        } else if (!this.mounted) {
        } else {
            int y = getNodeInfo().y();
            int z3 = getNodeInfo().z();
            if (y == 0 || z3 == 0) {
                return;
            }
            if (i == 0 && i2 == 0) {
                z2 = false;
            } else {
                canvas.translate(i, i2);
                z2 = true;
            }
            if (isRenderNodeEnabled()) {
                this.renderNode.a(canvas, mUSNodeHost, y, z3, f);
            } else {
                draw(canvas, mUSNodeHost, false, z, f);
            }
            if (!z2) {
                return;
            }
            canvas.translate(-i, -i2);
        }
    }

    public void drawWithRenderNode(MUSNodeHost mUSNodeHost, Canvas canvas, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455a775", new Object[]{this, mUSNodeHost, canvas, new Boolean(z)});
        } else {
            draw(canvas, mUSNodeHost, !z, false, 1.0f);
        }
    }

    public void notifyEngineRelayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ee73af", new Object[]{this});
        } else if (getInstance().isDestroyed()) {
        } else {
            this.notifyEngineRelayout = true;
            if (this.updatingStyle) {
                return;
            }
            relayout();
        }
    }

    private void relayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa10524", new Object[]{this});
            return;
        }
        this.notifyEngineRelayout = false;
        ((WeexMUSInstance) ((jvb) getInstance()).a()).a(getNodeId(), true);
    }

    public void removedFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0cbfb", new Object[]{this});
            return;
        }
        s layoutState = getLayoutState();
        if (layoutState != null) {
            layoutState.b(this);
            this.layoutState = null;
        }
        i attachedTree = getAttachedTree();
        if (isMounted() && attachedTree != null && (attachedTree.g() instanceof MUSView)) {
            attachedTree.g().getMountState().a(this, true);
            try {
                if (this.parentNode != null) {
                    this.parentNode.invalidate();
                }
            } catch (Exception unused) {
            }
        }
        setParentNode(null);
        this.added = false;
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue() : this.isRootNode;
    }

    public void setRootNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f513d20d", new Object[]{this});
        } else {
            this.isRootNode = true;
        }
    }

    public void setAttachedTree(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a007f9b4", new Object[]{this, iVar});
        } else {
            this.attachedTree = iVar;
        }
    }

    public int getAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue() : (int) (getOpacity() * 255.0f);
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public float getOpacity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2242c5cc", new Object[]{this})).floatValue() : this.animNodeInfo.j();
    }

    public void drawBackground(Canvas canvas, float f) {
        int i;
        int alpha;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c042d4", new Object[]{this, canvas, new Float(f)});
        } else if (getNodeInfo().x() == null) {
        } else {
            Rect bounds = getNodeInfo().x().getBounds();
            if (isRenderNodeEnabled() || (alpha = (int) (getAlpha() * f)) >= 255) {
                i = -1;
            } else if (Build.VERSION.SDK_INT >= 21) {
                i = canvas.saveLayerAlpha(0.0f, 0.0f, bounds.width(), bounds.height(), alpha);
            } else {
                i = canvas.saveLayerAlpha(0.0f, 0.0f, bounds.width(), bounds.height(), alpha, 31);
            }
            getNodeInfo().x().draw(canvas);
            if (i == -1) {
                return;
            }
            canvas.restoreToCount(i);
        }
    }

    public void drawBorder(Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4720e352", new Object[]{this, canvas, new Float(f)});
            return;
        }
        BorderProp a2 = getNodeInfo().a(false);
        if (a2 == null) {
            return;
        }
        if (!isRenderNodeEnabled()) {
            this.borderPaint.setAlpha((int) (getAlpha() * f));
        }
        a2.a(canvas, this.borderPaint);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void draw(android.graphics.Canvas r6, com.taobao.android.weex_uikit.ui.MUSNodeHost r7, boolean r8, boolean r9, float r10) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.ui.UINode.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            r6 = 3
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r8)
            r1[r6] = r7
            r6 = 4
            java.lang.Boolean r7 = new java.lang.Boolean
            r7.<init>(r9)
            r1[r6] = r7
            r6 = 5
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r10)
            r1[r6] = r7
            java.lang.String r6 = "a28782c9"
            r0.ipc$dispatch(r6, r1)
            return
        L30:
            r0 = -1
            if (r8 != 0) goto L68
            if (r9 != 0) goto L68
            com.taobao.android.weex_uikit.ui.x r8 = r5.getNodeInfo()
            com.taobao.android.weex_uikit.widget.border.BorderProp r8 = r8.a(r3)
            if (r8 == 0) goto L52
            android.graphics.Path r9 = r8.b()
            if (r9 == 0) goto L52
            int r9 = r6.save()
            android.graphics.Path r8 = r8.b()
            r6.clipPath(r8)
            r8 = r9
            goto L69
        L52:
            boolean r8 = r5.shouldClip()
            if (r8 == 0) goto L68
            int r8 = r6.save()
            int r9 = r5.getLayoutWidth()
            int r1 = r5.getLayoutHeight()
            r6.clipRect(r3, r3, r9, r1)
            goto L69
        L68:
            r8 = -1
        L69:
            r5.drawBackground(r6, r10)
            com.taobao.android.weex_uikit.ui.UINodeType r9 = r5.getNodeType()
            com.taobao.android.weex_uikit.ui.UINodeType r1 = com.taobao.android.weex_uikit.ui.UINodeType.LAYOUT
            if (r9 != r1) goto L78
            r5.dispatchDraw(r7, r6, r10)
            goto Lc6
        L78:
            java.lang.Object r9 = r5.getMountContent()
            com.taobao.android.weex_uikit.ui.x r1 = r5.getNodeInfo()
            com.taobao.android.weex_uikit.widget.border.BorderProp r1 = r1.a(r3)
            if (r1 != 0) goto L88
            r4 = 0
            goto L8c
        L88:
            int r4 = r1.b(r3)
        L8c:
            if (r1 != 0) goto L8f
            goto L93
        L8f:
            int r3 = r1.b(r2)
        L93:
            boolean r1 = r9 instanceof android.graphics.drawable.Drawable
            if (r1 == 0) goto Lb4
            boolean r7 = r5.isRenderNodeEnabled()
            if (r7 != 0) goto Lae
            r7 = r9
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            float r1 = r5.getOpacity()
            float r1 = r1 * r10
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r7.setAlpha(r1)
        Lae:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r5.drawDrawable(r6, r4, r3, r9)
            goto Lc6
        Lb4:
            boolean r1 = r9 instanceof android.view.View
            if (r1 == 0) goto Lc6
            android.view.View r9 = (android.view.View) r9
            float r1 = r5.getOpacity()
            float r1 = r1 * r10
            r9.setAlpha(r1)
            r5.drawView(r6, r7, r9)
        Lc6:
            r5.drawBorder(r6, r10)
            if (r8 == r0) goto Lce
            r6.restoreToCount(r8)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.ui.UINode.draw(android.graphics.Canvas, com.taobao.android.weex_uikit.ui.MUSNodeHost, boolean, boolean, float):void");
    }

    private void drawDrawable(Canvas canvas, int i, int i2, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37260a80", new Object[]{this, canvas, new Integer(i), new Integer(i2), drawable});
            return;
        }
        if (i != 0 || i2 != 0) {
            canvas.translate(i, i2);
        }
        drawable.draw(canvas);
        if (i == 0 && i2 == 0) {
            return;
        }
        canvas.translate(-i, -i2);
    }

    private void drawView(Canvas canvas, MUSNodeHost mUSNodeHost, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f418a60", new Object[]{this, canvas, mUSNodeHost, view});
            return;
        }
        int i = getGlobalVisibleRect().left;
        int i2 = getGlobalVisibleRect().top;
        int drawTranslateX = i + mUSNodeHost.getDrawTranslateX();
        int drawTranslateY = i2 + mUSNodeHost.getDrawTranslateY();
        if (drawTranslateX != 0 || drawTranslateY != 0) {
            canvas.translate(-drawTranslateX, -drawTranslateY);
        }
        mUSNodeHost.drawChild(view, canvas);
        if (drawTranslateX == 0 && drawTranslateY == 0) {
            return;
        }
        canvas.translate(drawTranslateX, drawTranslateY);
    }

    public void onBorderChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1089fd82", new Object[]{this});
        } else if (this.renderNode == null || !isRenderNodeEnabled()) {
        } else {
            this.renderNode.d();
        }
    }

    public void invalidate() {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        e eVar = this.renderNode;
        if (eVar != null) {
            eVar.b();
        }
        UINode uINode = this.parentNode;
        if (uINode != null) {
            uINode.invalidate();
            if (!isRoot() || (iVar = this.attachedTree) == null || iVar.g() == null) {
                return;
            }
            this.attachedTree.g().invalidate();
            return;
        }
        i iVar2 = this.attachedTree;
        if (iVar2 == null || iVar2.g() == null) {
            return;
        }
        this.attachedTree.g().invalidate();
    }

    public void setPadding(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98ee783", new Object[]{this, rect});
        } else {
            com.taobao.android.weex_uikit.util.e.a(this, rect);
        }
    }

    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        i iVar = this.attachedTree;
        if (iVar != null && (iVar.g() instanceof MUSView)) {
            MUSView g = this.attachedTree.g();
            g.getMountState().b();
            g.requestLayout();
            g.invalidate();
            return;
        }
        UINode uINode = this.parentNode;
        if (uINode == null) {
            return;
        }
        uINode.requestLayout();
    }

    public void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
            return;
        }
        e eVar = this.renderNode;
        if (eVar == null) {
            return;
        }
        eVar.a(view);
    }

    public void setClickable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d19a8d", new Object[]{this, new Boolean(z)});
        } else {
            this.touchHelper.b(z);
        }
    }

    public int getLayoutWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue() : getNodeInfo().y();
    }

    public int getLayoutHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue() : getNodeInfo().z();
    }

    public int getContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3d", new Object[]{this})).intValue();
        }
        BorderProp a2 = getNodeInfo().a(false);
        if (a2 == null) {
            return getLayoutWidth();
        }
        return (getLayoutWidth() - a2.b(0)) - a2.b(2);
    }

    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        BorderProp a2 = getNodeInfo().a(false);
        if (a2 == null) {
            return getLayoutHeight();
        }
        return (getLayoutHeight() - a2.b(1)) - a2.b(3);
    }

    public Rect getPadding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("1a2132ab", new Object[]{this}) : getNodeInfo().v();
    }

    public final <T> T getAttribute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("60511e1b", new Object[]{this, str});
        }
        T t = (T) this.attributes.a().a(str);
        return t != null ? t : (T) getDefaultAttribute(str);
    }

    public final <T> T getExtra(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("91ec6527", new Object[]{this, str}) : (T) this.extras.a().a(str);
    }

    public void setAttribute(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd20287", new Object[]{this, str, obj});
        } else if (com.taobao.android.weex_framework.util.g.a() && com.taobao.android.weex_framework.util.j.a()) {
            throw new RuntimeException("this method can only called from worker thread");
        } else {
            this.attributes.a().b(str, obj);
        }
    }

    public void setExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df7f6fb", new Object[]{this, str, obj});
        } else {
            this.extras.a().b(str, obj);
        }
    }

    public void updateExtra(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c767fbf7", new Object[]{this, map});
        } else if (!map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey())) {
                    if (StringUtils.equals(entry.getKey(), "ariaLabel")) {
                        updateAriaLabel();
                    } else {
                        onUpdateExtra(this, getMountContent(), entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public void updateAriaLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be661829", new Object[]{this});
            return;
        }
        e eVar = this.renderNode;
        if (eVar == null) {
            return;
        }
        eVar.a(getAriaLabel());
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue() : getNodeInfo().i();
    }

    public int getTranslateX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1cd153a", new Object[]{this})).intValue() : this.animNodeInfo.c();
    }

    public int getTranslateY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1db2cbb", new Object[]{this})).intValue() : this.animNodeInfo.d();
    }

    public float getScaleX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue() : this.animNodeInfo.h();
    }

    public float getSkewX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b41cbb4f", new Object[]{this})).floatValue() : this.animNodeInfo.a();
    }

    public float getSkewY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b42ad2d0", new Object[]{this})).floatValue() : this.animNodeInfo.b();
    }

    public float getScaleY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue() : this.animNodeInfo.i();
    }

    public float getRotate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e97cf448", new Object[]{this})).floatValue() : this.animNodeInfo.e();
    }

    public float getRotateX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4874231e", new Object[]{this})).floatValue() : this.animNodeInfo.f();
    }

    public float getRotateY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48823a9f", new Object[]{this})).floatValue() : this.animNodeInfo.g();
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue() : getNodeInfo().o();
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue() : getNodeInfo().p();
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public int getBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue() : getNodeInfo().q();
    }

    public s getLayoutState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("b7be2f7d", new Object[]{this});
        }
        s sVar = this.layoutState;
        if (sVar != null) {
            return sVar;
        }
        i attachedTree = getAttachedTree();
        if (attachedTree == null) {
            return null;
        }
        return attachedTree.e();
    }

    public boolean hasEvent(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d65e2b5", new Object[]{this, str})).booleanValue() : getNodeInfo().k(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void mount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197ec32", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        e eVar = this.renderNode;
        if (eVar != null) {
            eVar.c();
            this.renderNode.a(getAriaLabel());
        }
        tryApplyTransform(false);
        super.mount(mUSDKInstance, obj);
        com.taobao.android.weex_uikit.util.a aVar = this.animationHolder;
        if (aVar != null) {
            aVar.a();
        }
        if (getNodeType() != UINodeType.VIEW) {
            return;
        }
        notifyAddViewNode(true);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.unmount(mUSDKInstance, obj);
        com.taobao.android.weex_uikit.util.a aVar = this.animationHolder;
        if (aVar != null) {
            aVar.b();
            this.animationHolder = null;
        }
        if (getNodeType() == UINodeType.VIEW) {
            notifyRemoveViewNode(true);
        }
        e eVar = this.renderNode;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    public void setAnimationHolder(com.taobao.android.weex_uikit.util.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7ed3b8", new Object[]{this, aVar});
            return;
        }
        com.taobao.android.weex_uikit.util.a aVar2 = this.animationHolder;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.animationHolder = aVar;
        if (!this.mounted) {
            return;
        }
        aVar.a();
    }

    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        if (this.nodeId != i) {
            return null;
        }
        return this;
    }

    @Override // com.taobao.android.weex_framework.ui.INode
    public void setOpacity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5f5870", new Object[]{this, new Float(f)});
            return;
        }
        this.animNodeInfo.a(f);
        if (!this.mounted) {
            return;
        }
        invalidate();
    }

    public void setTranslateX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beaca010", new Object[]{this, new Integer(i)});
            return;
        }
        this.animNodeInfo.a(i);
        if (!this.mounted) {
            return;
        }
        invalidate();
    }

    public void setTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06178af", new Object[]{this, new Integer(i)});
            return;
        }
        this.animNodeInfo.b(i);
        if (!this.mounted) {
            return;
        }
        invalidate();
    }

    public i getAttachedTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("35afd8e0", new Object[]{this});
        }
        i iVar = this.attachedTree;
        if (iVar != null) {
            return iVar;
        }
        UINode uINode = this.parentNode;
        if (uINode == null) {
            return null;
        }
        return uINode.getAttachedTree();
    }

    public void dispatchMethod(String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735196f6", new Object[]{this, str, mUSValueArr});
        } else {
            onDispatchMethod(this, str, mUSValueArr);
        }
    }

    public MUSValue getArgument(MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("4793a668", new Object[]{this, mUSValueArr, new Integer(i)});
        }
        if (i < mUSValueArr.length) {
            return mUSValueArr[i];
        }
        return null;
    }

    public void dispatchMethodToMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1417dd34", new Object[]{this, runnable});
        } else if (getInstance() == null || getInstance().isDestroyed()) {
        } else {
            getInstance().postTaskToMain(runnable);
        }
    }

    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        throw new RuntimeException("addChild(UINode child) is not supported");
    }

    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        throw new RuntimeException("indexOf(UINode child) is not supported");
    }

    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        throw new RuntimeException("getChildAt(int index) is not supported");
    }

    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        throw new RuntimeException("getChildCount() is not supported");
    }

    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        throw new RuntimeException("addChild(int index, UINode child) is not supported");
    }

    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
            return;
        }
        throw new RuntimeException("removeChildAt(int index) is not supported");
    }

    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        throw new RuntimeException("moveNode(int fromIndex, int toIndex) is not supported");
    }

    public void notifyAddViewNode(boolean z) {
        UINode uINode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56b3f8e", new Object[]{this, new Boolean(z)});
        } else if ((!z && !hasViewChild()) || viewSupportRenderNode() || (uINode = this.parentNode) == null) {
        } else {
            uINode.addViewNode();
        }
    }

    public void notifyRemoveViewNode(boolean z) {
        UINode uINode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e28b119", new Object[]{this, new Boolean(z)});
        } else if ((!z && !hasViewChild()) || viewSupportRenderNode() || (uINode = this.parentNode) == null) {
        } else {
            uINode.removeViewNode();
        }
    }

    public boolean isRenderNodeEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("491d646a", new Object[]{this})).booleanValue() : !isRoot() && this.renderNode != null && !hasViewChild() && this.renderNode.e();
    }

    public void registerNativeStateListener(String str, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d56813", new Object[]{this, str, bVar});
            return;
        }
        UINode uINode = this;
        for (UINode uINode2 = this.parentNode; uINode2 != null; uINode2 = uINode2.parentNode) {
            if (uINode2 instanceof d) {
                ((d) uINode2).registerNativeStateListener(str, uINode, bVar);
                return;
            }
            uINode = uINode2;
        }
        if (getInstance() == null) {
            return;
        }
        getInstance().registerNativeStateListener(str, bVar);
    }

    public void unregisterNativeStateListener(String str, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154033ac", new Object[]{this, str, bVar});
            return;
        }
        UINode uINode = this;
        for (UINode uINode2 = this.parentNode; uINode2 != null; uINode2 = uINode2.parentNode) {
            if (uINode2 instanceof d) {
                ((d) uINode2).unregisterNativeStateListener(str, uINode, bVar);
                return;
            }
            uINode = uINode2;
        }
        if (getInstance() == null) {
            return;
        }
        getInstance().unregisterNativeStateListener(str, bVar);
    }

    public void fireNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7cdc8", new Object[]{this, str, str2});
            return;
        }
        for (UINode uINode = this.parentNode; uINode != null; uINode = uINode.parentNode) {
            if (uINode instanceof d) {
                ((d) uINode).fireNativeEvent(str, str2);
                return;
            }
        }
        if (getInstance() == null) {
            return;
        }
        getInstance().fireNativeEvent(str, str2);
    }

    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str});
        }
        UINode uINode = this;
        for (UINode uINode2 = this.parentNode; uINode2 != null; uINode2 = uINode2.parentNode) {
            if (uINode2 instanceof d) {
                return ((d) uINode2).getNativeState(str, uINode);
            }
            uINode = uINode2;
        }
        return getInstance() != null ? getInstance().getNativeState(str) : "";
    }

    public void setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19e070", new Object[]{this, charSequence});
        } else if (!this.mounted) {
            if (!com.taobao.android.weex_framework.util.g.a()) {
                return;
            }
            com.taobao.android.weex_framework.util.g.d("you should call setContentDescription after mounted");
        } else {
            e eVar = this.renderNode;
            if (eVar == null) {
                return;
            }
            eVar.a(charSequence);
        }
    }

    public void notifyMountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba527828", new Object[]{this});
            return;
        }
        this.mountState = true;
        if ((hasEvent("disappear") || hasEvent("appear")) && !this.mHasDelayedAppear) {
            this.mHasDelayedAppear = true;
            getInstance().postTaskToMainDelay(this.mAppearRunnable, 100L);
        }
        if (!this.isRootNode) {
            return;
        }
        if ((!hasEvent(Constants.Event.VIEWAPPEAR) && !hasEvent(Constants.Event.VIEWDISAPPEAR)) || this.mHasDelayedViewAppear) {
            return;
        }
        this.mHasDelayedAppear = true;
        getInstance().postTaskToMainDelay(this.mViewAppearRunnable, 100L);
    }

    public boolean isMountState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67b2904d", new Object[]{this})).booleanValue() : this.mountState;
    }

    public void notifyUnmountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492740c1", new Object[]{this});
            return;
        }
        this.mountState = false;
        if (hasEvent("disappear") || hasEvent("appear")) {
            this.mHasDelayedAppear = false;
            getInstance().removeTaskFromMain(this.mAppearRunnable);
            if (this.mHasAppearSent) {
                this.mHasAppearSent = false;
                fireEvent("disappear", null);
            }
        }
        if (!this.isRootNode) {
            return;
        }
        if (!hasEvent(Constants.Event.VIEWAPPEAR) && !hasEvent(Constants.Event.VIEWDISAPPEAR)) {
            return;
        }
        this.mHasDelayedViewAppear = false;
        getInstance().removeTaskFromMain(this.mViewAppearRunnable);
        if (!this.mHasViewAppearSent) {
            return;
        }
        this.mHasViewAppearSent = false;
        fireEvent(Constants.Event.VIEWDISAPPEAR, null);
    }

    public void setLayoutProcessor(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939e805c", new Object[]{this, cVar});
        } else {
            this.layoutProcessor = cVar;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onBoundsChange(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb13740b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        e eVar = this.renderNode;
        if (eVar == null) {
            return;
        }
        eVar.a(i, i2, i3, i4);
    }

    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
        } else if (getInstance() == null || getInstance().isDestroyed() || !hasEvent(str)) {
        } else {
            getInstance().fireEventOnNode(getNodeId(), str, jSONObject);
        }
    }

    public void notifyAccessibleChanged(boolean z) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9078b278", new Object[]{this, new Boolean(z)});
        } else if (z && ((iVar = this.attachedTree) == null || iVar.g() == null || !this.attachedTree.g().isAccessibilityEnabled())) {
        } else {
            dispatchAccessibleChanged();
        }
    }

    public void onParentAccessibleChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861893fe", new Object[]{this, new Boolean(z)});
            return;
        }
        e eVar = this.renderNode;
        if (eVar != null) {
            eVar.a(z);
        }
        dispatchAccessibleChanged();
    }

    public boolean shouldBlock() {
        UINode uINode;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f736fe25", new Object[]{this})).booleanValue() : hasEvent("click") || ((uINode = this.parentNode) != null && uINode.shouldBlock());
    }

    public boolean isAccessibilityBlocked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f230d93", new Object[]{this})).booleanValue();
        }
        UINode uINode = this.parentNode;
        return (uINode != null && uINode.shouldBlock()) && !hasEvent("click");
    }

    public void tryApplyTransform(boolean z) {
        List<l.a> list;
        List<k.a> list2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        int i2;
        float f7;
        float f8;
        int i3;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i4;
        UINode uINode;
        int i5;
        boolean z2;
        boolean z3;
        final float f14;
        final float f15;
        ArrayList arrayList;
        final float f16;
        float f17;
        float f18;
        float f19;
        UINode uINode2 = this;
        IpChange ipChange = $ipChange;
        boolean z4 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e944c94", new Object[]{uINode2, new Boolean(z)});
        } else if (z || !uINode2.transformApplied) {
            uINode2.transformApplied = true;
            String n = getNodeInfo().n();
            String j = getNodeInfo().j();
            try {
                list = l.a(j, getNodeInfo().c(), getNodeInfo().d(), getNodeInfo().e(), getNodeInfo().f());
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.a("[Render], invalid attribute transition: " + j, e);
                list = null;
            }
            final float A = getNodeInfo().A();
            jwx x = getNodeInfo().x();
            final int a2 = x == null ? 0 : x.a();
            try {
                list2 = k.a(n, getInstance().getRpxPerRem());
            } catch (Exception e2) {
                com.taobao.android.weex_framework.util.g.a("[Render], invalid attribute transform: " + j, e2);
                list2 = null;
            }
            float f20 = 0.0f;
            if (list2 != null) {
                int i6 = 0;
                int i7 = 0;
                float f21 = 0.0f;
                float f22 = 1.0f;
                f4 = 1.0f;
                float f23 = 0.0f;
                float f24 = 0.0f;
                float f25 = 0.0f;
                float f26 = 0.0f;
                for (k.a aVar : list2) {
                    switch (aVar.f16139a) {
                        case 0:
                        case 1:
                            i6 = (int) (i6 + aVar.b[0]);
                            f17 = i7;
                            f18 = aVar.b[1];
                            i7 = (int) (f17 + f18);
                            break;
                        case 2:
                            i6 = (int) (i6 + aVar.b[0]);
                            break;
                        case 3:
                            f17 = i7;
                            f18 = aVar.b[0];
                            i7 = (int) (f17 + f18);
                            break;
                        case 4:
                        case 5:
                            f21 += aVar.b[0];
                            break;
                        case 6:
                            f22 *= aVar.b[0];
                            f19 = aVar.b[1];
                            f4 *= f19;
                            break;
                        case 7:
                            f22 *= aVar.b[0];
                            break;
                        case 8:
                            f19 = aVar.b[0];
                            f4 *= f19;
                            break;
                        case 9:
                            f23 += aVar.b[0];
                            if (!Float.isNaN(aVar.b[1])) {
                                f26 += aVar.b[1];
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            f24 += aVar.b[0];
                            break;
                        case 11:
                            f25 += aVar.b[0];
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid Transform method: " + aVar.f16139a);
                    }
                }
                f = f21;
                f6 = f24;
                f3 = f25;
                i2 = i6;
                i = i7;
                f20 = f23;
                f2 = f26;
                f5 = f22;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 1.0f;
                f5 = 1.0f;
                f6 = 0.0f;
                i = 0;
                i2 = 0;
            }
            if (list == null || list.size() <= 0) {
                f7 = f2;
                f8 = f20;
                i3 = a2;
                f9 = A;
                f10 = f3;
                f11 = f4;
                f12 = f5;
                f13 = f6;
                i4 = i;
                uINode = uINode2;
                i5 = i2;
                z2 = false;
                z3 = false;
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                z2 = false;
                boolean z5 = false;
                while (true) {
                    z3 = false;
                    for (l.a aVar2 : list) {
                        f14 = f2;
                        f15 = f20;
                        int i8 = aVar2.f16140a;
                        if (i8 != 0) {
                            arrayList = arrayList4;
                            if (i8 != 1) {
                                f16 = f6;
                                if (i8 == 2) {
                                    if (!z3) {
                                        com.taobao.android.weex_uikit.util.a aVar3 = uINode2.animationHolder;
                                        if (aVar3 != null) {
                                            aVar3.b();
                                            uINode2.animationHolder = null;
                                        }
                                        final int B = getNodeInfo().B();
                                        if (a2 == B) {
                                            break;
                                        }
                                        ValueAnimator makeValueAnimator = uINode2.makeValueAnimator(aVar2);
                                        makeValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.weex_uikit.ui.UINode.6
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                                    return;
                                                }
                                                try {
                                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                                    int red = Color.red(B);
                                                    int green = Color.green(B);
                                                    int blue = Color.blue(B);
                                                    int alpha = Color.alpha(B);
                                                    UINode.this.getNodeInfo().e(Color.argb((int) (alpha + ((Color.alpha(a2) - alpha) * floatValue)), (int) (red + ((Color.red(a2) - red) * floatValue)), (int) (green + ((Color.green(a2) - green) * floatValue)), (int) (blue + ((Color.blue(a2) - blue) * floatValue))));
                                                    if (!UINode.this.mounted) {
                                                        return;
                                                    }
                                                    UINode.this.invalidate();
                                                } catch (Exception e3) {
                                                    com.taobao.android.weex_framework.util.g.a(e3);
                                                    com.taobao.android.weex_framework.monitor.b.a();
                                                }
                                            }
                                        });
                                        arrayList3.add(makeValueAnimator);
                                        z3 = true;
                                    } else {
                                        uINode2 = this;
                                        f4 = f4;
                                        arrayList4 = arrayList;
                                        arrayList3 = arrayList3;
                                        f3 = f3;
                                        arrayList2 = arrayList2;
                                        f5 = f5;
                                        i = i;
                                        i2 = i2;
                                        f2 = f14;
                                        f20 = f15;
                                        a2 = a2;
                                        A = A;
                                        f6 = f16;
                                    }
                                }
                                f6 = f16;
                                f2 = f14;
                                f20 = f15;
                                arrayList4 = arrayList;
                            } else {
                                f16 = f6;
                                if (!z5) {
                                    com.taobao.android.weex_uikit.util.a aVar4 = uINode2.animationHolder;
                                    if (aVar4 != null) {
                                        aVar4.b();
                                        uINode2.animationHolder = null;
                                    }
                                    final float opacity = getOpacity();
                                    if (Float.compare(opacity, A) == 0) {
                                        f6 = f16;
                                        f2 = f14;
                                        f20 = f15;
                                        arrayList4 = arrayList;
                                        z5 = false;
                                    } else {
                                        ValueAnimator makeValueAnimator2 = uINode2.makeValueAnimator(aVar2);
                                        makeValueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.weex_uikit.ui.UINode.5
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                                    return;
                                                }
                                                try {
                                                    UINode.this.setOpacity(opacity + ((A - opacity) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                                    if (!UINode.this.mounted) {
                                                        return;
                                                    }
                                                    UINode.this.invalidate();
                                                } catch (Exception e3) {
                                                    com.taobao.android.weex_framework.util.g.a(e3);
                                                    com.taobao.android.weex_framework.monitor.b.a();
                                                }
                                            }
                                        });
                                        arrayList3.add(makeValueAnimator2);
                                        f6 = f16;
                                        f2 = f14;
                                        f20 = f15;
                                        arrayList4 = arrayList;
                                        z5 = true;
                                    }
                                } else {
                                    uINode2 = this;
                                    f4 = f4;
                                    arrayList4 = arrayList;
                                    arrayList3 = arrayList3;
                                    f3 = f3;
                                    arrayList2 = arrayList2;
                                    f5 = f5;
                                    i = i;
                                    i2 = i2;
                                    f2 = f14;
                                    f20 = f15;
                                    a2 = a2;
                                    A = A;
                                    f6 = f16;
                                }
                            }
                        } else {
                            arrayList = arrayList4;
                            f16 = f6;
                            if (!z2) {
                                com.taobao.android.weex_uikit.util.a aVar5 = uINode2.animationHolder;
                                if (aVar5 != null) {
                                    aVar5.b();
                                    uINode2.animationHolder = null;
                                }
                                final int translateX = getTranslateX();
                                ArrayList arrayList5 = arrayList3;
                                final int translateY = getTranslateY();
                                final float scaleX = getScaleX();
                                ArrayList arrayList6 = arrayList2;
                                final float scaleY = getScaleY();
                                final float f27 = f4;
                                final float rotate = getRotate();
                                final float f28 = f5;
                                final float rotateX = getRotateX();
                                final int i9 = i;
                                final float rotateY = getRotateY();
                                final int i10 = i2;
                                final float skewX = getSkewX();
                                final float skewY = getSkewY();
                                ValueAnimator makeValueAnimator3 = uINode2.makeValueAnimator(aVar2);
                                final float f29 = f3;
                                final float f30 = f;
                                makeValueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.weex_uikit.ui.UINode.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                            return;
                                        }
                                        try {
                                            UINode.this.setTranslateY((int) (translateY + ((i9 - translateY) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                                            UINode.this.setTranslateX((int) (translateX + ((i10 - translateX) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                                            UINode.access$300(UINode.this).e(scaleX + ((f28 - scaleX) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            UINode.access$300(UINode.this).f(scaleY + ((f27 - scaleY) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            UINode.access$300(UINode.this).b(rotate + ((f30 - rotate) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            UINode.access$300(UINode.this).c(rotateX + ((f16 - rotateX) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            UINode.access$300(UINode.this).d(rotateY + ((f29 - rotateY) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            UINode.access$300(UINode.this).g(skewX + ((f15 - skewX) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            UINode.access$300(UINode.this).h(skewY + ((f14 - skewY) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                                            if (!UINode.this.mounted) {
                                                return;
                                            }
                                            UINode.this.invalidate();
                                        } catch (Exception e3) {
                                            com.taobao.android.weex_framework.util.g.a(e3);
                                            com.taobao.android.weex_framework.monitor.b.a();
                                        }
                                    }
                                });
                                final float f31 = f;
                                arrayList.add(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.android.weex_uikit.ui.UINode.4
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.android.weex_framework.util.o
                                    public void a() throws Exception {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            UINode.this.setTranslateY(i9);
                                            UINode.this.setTranslateX(i10);
                                            UINode.access$300(UINode.this).e(f28);
                                            UINode.access$300(UINode.this).f(f27);
                                            UINode.access$300(UINode.this).b(f31);
                                            UINode.access$300(UINode.this).c(f16);
                                            UINode.access$300(UINode.this).d(f29);
                                            UINode.access$300(UINode.this).g(f15);
                                            UINode.access$300(UINode.this).h(f14);
                                            if (!UINode.this.mounted) {
                                                return;
                                            }
                                            UINode.this.invalidate();
                                        } catch (Exception e3) {
                                            com.taobao.android.weex_framework.util.g.a(e3);
                                            com.taobao.android.weex_framework.monitor.b.a();
                                        }
                                    }
                                });
                                arrayList5.add(makeValueAnimator3);
                                uINode2 = this;
                                f4 = f27;
                                arrayList4 = arrayList;
                                arrayList3 = arrayList5;
                                f3 = f29;
                                arrayList2 = arrayList6;
                                f5 = f28;
                                i = i9;
                                i2 = i10;
                                f2 = f14;
                                f20 = f15;
                                a2 = a2;
                                A = A;
                                f6 = f16;
                                z2 = true;
                            } else {
                                uINode2 = this;
                                f4 = f4;
                                arrayList4 = arrayList;
                                arrayList3 = arrayList3;
                                f3 = f3;
                                arrayList2 = arrayList2;
                                f5 = f5;
                                i = i;
                                i2 = i2;
                                f2 = f14;
                                f20 = f15;
                                a2 = a2;
                                A = A;
                                f6 = f16;
                            }
                        }
                    }
                    f7 = f2;
                    f8 = f20;
                    i3 = a2;
                    ArrayList arrayList7 = arrayList3;
                    f9 = A;
                    ArrayList arrayList8 = arrayList2;
                    f10 = f3;
                    f11 = f4;
                    ArrayList arrayList9 = arrayList4;
                    f12 = f5;
                    f13 = f6;
                    i4 = i;
                    i5 = i2;
                    if (z2 || z5 || z3) {
                        uINode = this;
                    } else {
                        uINode = this;
                        com.taobao.android.weex_uikit.util.a aVar6 = uINode.animationHolder;
                        if (aVar6 != null) {
                            aVar6.b();
                            uINode.animationHolder = null;
                        }
                    }
                    if (arrayList7.size() > 0) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setStartDelay(0L);
                        animatorSet.playTogether(arrayList7);
                        arrayList8.add(animatorSet);
                        uINode.animationHolder = new com.taobao.android.weex_uikit.util.a(arrayList8, arrayList9);
                        uINode.animationHolder.a();
                    }
                    z4 = z5;
                    f6 = f16;
                    f2 = f14;
                    f20 = f15;
                    arrayList4 = arrayList;
                }
            }
            if (!z2) {
                uINode.setTranslateX(i5);
                uINode.setTranslateY(i4);
                uINode.animNodeInfo.e(f12);
                uINode.animNodeInfo.f(f11);
                uINode.animNodeInfo.b(f);
                uINode.animNodeInfo.c(f13);
                uINode.animNodeInfo.d(f10);
                uINode.animNodeInfo.g(f8);
                uINode.animNodeInfo.h(f7);
            }
            if (!z4) {
                uINode.animNodeInfo.a(f9);
            }
            if (!z3) {
                getNodeInfo().e(i3);
            }
            if (!uINode.mounted) {
                return;
            }
            invalidate();
        }
    }

    private ValueAnimator makeValueAnimator(l.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("43acc3de", new Object[]{this, aVar});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(aVar.c);
        ofFloat.setStartDelay(aVar.b);
        ofFloat.setInterpolator(l.a(aVar));
        return ofFloat;
    }
}
