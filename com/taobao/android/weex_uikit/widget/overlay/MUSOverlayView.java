package com.taobao.android.weex_uikit.widget.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.a;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.l;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.i;
import org.android.agoo.common.AgooConstants;
import tb.jwq;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSOverlayView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAnimation;
    private String mAnimationType;
    private String mDisplayMode;
    private boolean mExitAnimation;
    private MUSView mMUSView;
    private boolean mMask;
    private boolean mMaskAnimation;
    private int mMaskColor;
    private boolean mMount;
    private MUSOverlay mMusOverlay;
    private int mNodeRef;
    private boolean mPendingDisplayTask;
    private String mPosition;
    private int mRequestExit;
    private int mRequestShow;
    private String mRole;
    private boolean mShow;
    private MUSOverlaySlice mSliceView;
    private String mType;
    private Integer mZIndex;

    static {
        kge.a(-840409284);
    }

    public static /* synthetic */ Object ipc$super(MUSOverlayView mUSOverlayView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$010(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0c7b722", new Object[]{mUSOverlayView})).intValue();
        }
        int i = mUSOverlayView.mRequestShow;
        mUSOverlayView.mRequestShow = i - 1;
        return i;
    }

    public static /* synthetic */ MUSOverlay access$100(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlay) ipChange.ipc$dispatch("ad160de7", new Object[]{mUSOverlayView}) : mUSOverlayView.mMusOverlay;
    }

    public static /* synthetic */ void access$200(MUSOverlayView mUSOverlayView, MUSOverlayContainer mUSOverlayContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e021bf91", new Object[]{mUSOverlayView, mUSOverlayContainer});
        } else {
            mUSOverlayView.showSliceToContainer(mUSOverlayContainer);
        }
    }

    public static /* synthetic */ void access$300(MUSOverlayView mUSOverlayView, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38aabca", new Object[]{mUSOverlayView, viewGroup});
        } else {
            mUSOverlayView.blockSiblingAccessibility(viewGroup);
        }
    }

    public static /* synthetic */ boolean access$400(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56be2cee", new Object[]{mUSOverlayView})).booleanValue() : mUSOverlayView.mPendingDisplayTask;
    }

    public static /* synthetic */ boolean access$402(MUSOverlayView mUSOverlayView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388b1ab0", new Object[]{mUSOverlayView, new Boolean(z)})).booleanValue();
        }
        mUSOverlayView.mPendingDisplayTask = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f32c294d", new Object[]{mUSOverlayView})).booleanValue() : mUSOverlayView.mShow;
    }

    public static /* synthetic */ void access$600(MUSOverlayView mUSOverlayView, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fe59e7", new Object[]{mUSOverlayView, viewGroup});
        } else {
            mUSOverlayView.recoverSiblingAccessibility(viewGroup);
        }
    }

    public static /* synthetic */ int access$710(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c99dbb", new Object[]{mUSOverlayView})).intValue();
        }
        int i = mUSOverlayView.mRequestExit;
        mUSOverlayView.mRequestExit = i - 1;
        return i;
    }

    public static /* synthetic */ MUSOverlaySlice access$800(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSOverlaySlice) ipChange.ipc$dispatch("33298ee4", new Object[]{mUSOverlayView}) : mUSOverlayView.mSliceView;
    }

    public MUSOverlayView(Context context) {
        super(context);
        this.mMount = false;
        this.mAnimationType = "opacity";
        this.mRequestExit = 0;
        this.mRequestShow = 0;
        this.mPendingDisplayTask = false;
    }

    public void mount(MUSOverlay mUSOverlay, String str, int i, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, int i2, boolean z5, Integer num, String str4, boolean z6, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14699171", new Object[]{this, mUSOverlay, str, new Integer(i), str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3), new Boolean(z4), new Integer(i2), new Boolean(z5), num, str4, new Boolean(z6), str5});
            return;
        }
        this.mRole = str4;
        this.mMusOverlay = mUSOverlay;
        MUSOverlayContainer ensureContainer = ensureContainer();
        if (ensureContainer == null) {
            return;
        }
        this.mMount = true;
        this.mType = str;
        this.mNodeRef = i;
        this.mPosition = str2;
        this.mExitAnimation = z2;
        this.mAnimation = z;
        this.mAnimationType = str3;
        this.mMaskAnimation = z3;
        this.mMask = z4;
        this.mMaskColor = i2;
        this.mShow = z5;
        this.mZIndex = num;
        this.mDisplayMode = str5;
        i childNodeTree = mUSOverlay.getChildNodeTree();
        if (this.mMUSView == null) {
            this.mMUSView = new MUSView(mUSOverlay.getInstance());
            this.mMUSView.setRoot(false);
            this.mMUSView.setDisableClip(true);
        }
        this.mMUSView.setUiNodeTree(childNodeTree);
        jwq overlayHolder = getOverlayHolder();
        this.mSliceView = (overlayHolder == null || !z6) ? null : overlayHolder.a(getContext(), this.mMUSView, this.mMusOverlay, this);
        if (this.mSliceView == null) {
            this.mSliceView = new MUSOverlaySlice(getContext(), this.mMUSView, this.mMusOverlay, this);
        }
        if (!z5) {
            return;
        }
        showSliceToContainer(ensureContainer);
        blockSiblingAccessibility(ensureContainer);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Rect getDisplayLoc(int[] iArr, Rect rect) {
        i attachedTree;
        MUSView g;
        char c;
        char c2;
        char c3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("363037d9", new Object[]{this, iArr, rect});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null) {
            return null;
        }
        i childNodeTree = mUSOverlay.getChildNodeTree();
        UINodeGroup uINodeGroup = (UINodeGroup) childNodeTree.f();
        if (uINodeGroup.getChildCount() == 0) {
            return new Rect(0, 0, 0, 0);
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < uINodeGroup.getChildCount(); i5++) {
            UINode childAt = uINodeGroup.getChildAt(i5);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            if (left < i) {
                i = left;
            }
            if (top < i2) {
                i2 = top;
            }
            if (right > i3) {
                i3 = right;
            }
            if (bottom > i4) {
                i4 = bottom;
            }
        }
        Rect sizeOfOverlayContainer = getSizeOfOverlayContainer();
        Rect rect2 = new Rect(i, i2, i3, i4);
        if (AgooConstants.MESSAGE_POPUP.equals(this.mType)) {
            String str = this.mPosition;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                iArr[0] = sizeOfOverlayContainer.width() - rect2.width();
                iArr[1] = 0;
            } else if (c3 == 1) {
                iArr[0] = 0;
                iArr[1] = sizeOfOverlayContainer.height() - rect2.height();
            } else if (c3 == 2) {
                iArr[0] = 0;
                iArr[1] = 0;
            } else {
                if (c3 != 4) {
                    g.f("mus-overlay", String.format("value [\"%s\"] not support for property \"position\"", this.mPosition));
                }
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return rect2;
        } else if ("popover".equals(this.mType)) {
            iArr[0] = 0;
            iArr[1] = 0;
            UINode uINode = (UINode) this.mMusOverlay.getInstance().findNodeById(this.mNodeRef);
            if (uINode == null) {
                g.f("mus-overlay", "nodeRef not found");
                return rect2;
            }
            Rect globalVisibleRect = uINode.getGlobalVisibleRect();
            if (globalVisibleRect == null || (attachedTree = uINode.getAttachedTree()) == null || (g = attachedTree.g()) == null) {
                return rect2;
            }
            int[] iArr2 = new int[2];
            g.getLocationOnScreen(iArr2);
            int drawTranslateX = iArr2[0] + globalVisibleRect.left + g.getDrawTranslateX();
            int drawTranslateY = iArr2[1] + globalVisibleRect.top + g.getDrawTranslateY();
            int right2 = drawTranslateX + (uINode.getRight() - uINode.getLeft());
            int bottom2 = (uINode.getBottom() - uINode.getTop()) + drawTranslateY;
            rect.left = drawTranslateX - sizeOfOverlayContainer.left;
            rect.top = drawTranslateY - sizeOfOverlayContainer.top;
            rect.right = right2 - sizeOfOverlayContainer.left;
            rect.bottom = bottom2 - sizeOfOverlayContainer.top;
            String str2 = this.mPosition;
            switch (str2.hashCode()) {
                case -1683001720:
                    if (str2.equals("bottomEdge")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1682792238:
                    if (str2.equals("bottomLeft")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1569573383:
                    if (str2.equals("rightEdge")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1383228885:
                    if (str2.equals("bottom")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1140330318:
                    if (str2.equals("topEdge")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1140120836:
                    if (str2.equals("topLeft")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -978346553:
                    if (str2.equals("topRight")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -621290831:
                    if (str2.equals("bottomRight")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str2.equals("top")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1717970532:
                    if (str2.equals("leftEdge")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 1:
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[c2] = drawTranslateY;
                    break;
                case 2:
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = drawTranslateY;
                    break;
                case 3:
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = bottom2;
                    break;
                case 4:
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = bottom2;
                    break;
                case 5:
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = (drawTranslateY + bottom2) / 2;
                    break;
                case 6:
                    c2 = 1;
                    iArr[0] = (drawTranslateX + right2) / 2;
                    iArr[1] = drawTranslateY;
                    break;
                case 7:
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = (drawTranslateY + bottom2) / 2;
                    break;
                case '\b':
                    c2 = 1;
                    iArr[0] = (drawTranslateX + right2) / 2;
                    iArr[1] = bottom2;
                    break;
                case '\t':
                    c2 = 1;
                    iArr[0] = sizeOfOverlayContainer.left;
                    iArr[1] = drawTranslateY;
                    break;
                case '\n':
                    c2 = 1;
                    iArr[0] = sizeOfOverlayContainer.left;
                    iArr[1] = bottom2;
                    break;
                case 11:
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = sizeOfOverlayContainer.top;
                    break;
                case '\f':
                    iArr[0] = right2;
                    c2 = 1;
                    iArr[1] = sizeOfOverlayContainer.top;
                    break;
                default:
                    c2 = 1;
                    g.f("mus-overlay", String.format("value [\"%s\"] not support for property \"position\"", this.mPosition));
                    iArr[0] = drawTranslateX;
                    iArr[c2] = drawTranslateY;
                    break;
            }
            iArr[0] = iArr[0] - sizeOfOverlayContainer.left;
            iArr[c2] = iArr[c2] - sizeOfOverlayContainer.top;
            return rect2;
        } else {
            iArr[0] = 0;
            if (childNodeTree.l() > sizeOfOverlayContainer.height()) {
                iArr[1] = sizeOfOverlayContainer.height() - childNodeTree.l();
            } else {
                iArr[1] = 0;
            }
            return sizeOfOverlayContainer;
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.mMount = false;
        if (this.mSliceView != null) {
            MUSOverlayContainer ensureContainer = ensureContainer();
            recoverSiblingAccessibility(ensureContainer);
            if (ensureContainer != null) {
                ensureContainer.removeOverlay(this.mSliceView);
            }
        }
        MUSView mUSView = this.mMUSView;
        if (mUSView != null) {
            mUSView.release(true);
            this.mMUSView = null;
        }
        this.mMusOverlay = null;
    }

    private MUSOverlayContainer ensureContainer() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlayContainer) ipChange.ipc$dispatch("1003e651", new Object[]{this});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null || !(mUSOverlay.getInstance().getUIContext() instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) this.mMusOverlay.getInstance().getUIContext();
        if (!TextUtils.isEmpty(this.mDisplayMode) && a.ATOM_EXT_window.equals(this.mDisplayMode)) {
            viewGroup = (ViewGroup) activity.findViewById(16908290);
        } else {
            viewGroup = (ViewGroup) this.mMusOverlay.getInstance().getTag("MUSOverlayContainerHolder");
        }
        if (viewGroup == null) {
            View findViewById = activity.findViewById(16908290);
            if (!(findViewById instanceof ViewGroup)) {
                return null;
            }
            viewGroup = (ViewGroup) findViewById;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof MUSOverlayContainer) {
                return (MUSOverlayContainer) childAt;
            }
        }
        MUSOverlayContainer mUSOverlayContainer = new MUSOverlayContainer(activity);
        viewGroup.addView(mUSOverlayContainer, -1, -1);
        return mUSOverlayContainer;
    }

    private Rect getSizeOfOverlayContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("749778af", new Object[]{this});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null) {
            return new Rect(0, 0, l.d(m.b()), l.f(m.b()));
        }
        View findViewById = ((Activity) mUSOverlay.getInstance().getUIContext()).findViewById(16908290);
        int[] iArr = new int[2];
        findViewById.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + findViewById.getWidth(), iArr[1] + findViewById.getHeight());
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.mType = str;
        }
    }

    public void setNodeRef(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e1d141", new Object[]{this, num});
        } else {
            this.mNodeRef = num.intValue();
        }
    }

    public void setPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974e8ffc", new Object[]{this, str});
        } else {
            this.mPosition = str;
        }
    }

    public void setMusAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67893e92", new Object[]{this, new Boolean(z)});
        } else {
            this.mAnimation = z;
        }
    }

    public void setMusExitAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc21ad0", new Object[]{this, new Boolean(z)});
        } else {
            this.mExitAnimation = z;
        }
    }

    public void setAnimationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9b3d2d", new Object[]{this, str});
        } else {
            this.mAnimationType = str;
        }
    }

    public void setMaskAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6e6037", new Object[]{this, new Boolean(z)});
        } else {
            this.mMaskAnimation = z;
        }
    }

    public void setMask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d55d7f", new Object[]{this, new Boolean(z)});
        } else {
            this.mMask = z;
        }
    }

    public void setMaskColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e1d6e7", new Object[]{this, new Integer(i)});
        } else {
            this.mMaskColor = i;
        }
    }

    private jwq getOverlayHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwq) ipChange.ipc$dispatch("31fcddb5", new Object[]{this});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null || !(mUSOverlay.getInstance().getUIContext() instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) this.mMusOverlay.getInstance().getUIContext();
        if (!(activity instanceof jwq)) {
            return null;
        }
        return (jwq) activity;
    }

    public void setShow(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7796c0e", new Object[]{this, new Boolean(z)});
            return;
        }
        final MUSOverlayContainer ensureContainer = ensureContainer();
        if (ensureContainer == null) {
            return;
        }
        this.mShow = z;
        if (ensureContainer.indexOfChild(this.mSliceView) >= 0) {
            z2 = true;
        }
        final jwq overlayHolder = getOverlayHolder();
        int i2 = this.mRequestShow;
        if (i2 > 0 || (i = this.mRequestExit) > 0) {
            this.mPendingDisplayTask = true;
            return;
        }
        boolean z3 = this.mShow;
        if (z2 == z3) {
            return;
        }
        if (z3) {
            this.mRequestShow = i2 + 1;
            this.mMusOverlay.getInstance().postTaskToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    MUSOverlayView.access$010(MUSOverlayView.this);
                    jwq jwqVar = overlayHolder;
                    if (jwqVar != null) {
                        jwqVar.a(MUSOverlayView.access$100(MUSOverlayView.this));
                    }
                    MUSOverlayView.access$200(MUSOverlayView.this, ensureContainer);
                    MUSOverlayView.access$300(MUSOverlayView.this, ensureContainer);
                    if (!MUSOverlayView.access$400(MUSOverlayView.this)) {
                        return;
                    }
                    MUSOverlayView.access$402(MUSOverlayView.this, false);
                    MUSOverlayView mUSOverlayView = MUSOverlayView.this;
                    mUSOverlayView.setShow(MUSOverlayView.access$500(mUSOverlayView));
                }
            });
            return;
        }
        this.mRequestExit = i + 1;
        this.mMusOverlay.getInstance().postTaskToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                jwq jwqVar = overlayHolder;
                if (jwqVar != null) {
                    jwqVar.b(MUSOverlayView.access$100(MUSOverlayView.this));
                }
                MUSOverlayView.access$600(MUSOverlayView.this, ensureContainer);
                MUSOverlayView.access$800(MUSOverlayView.this).playExitAnim(new o() { // from class: com.taobao.android.weex_uikit.widget.overlay.MUSOverlayView.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        MUSOverlayView.access$710(MUSOverlayView.this);
                        ensureContainer.removeOverlay(MUSOverlayView.access$800(MUSOverlayView.this));
                        if (!MUSOverlayView.access$400(MUSOverlayView.this)) {
                            return;
                        }
                        MUSOverlayView.access$402(MUSOverlayView.this, false);
                        MUSOverlayView.this.setShow(MUSOverlayView.access$500(MUSOverlayView.this));
                    }
                });
            }
        });
    }

    private void blockSiblingAccessibility(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fae821f", new Object[]{this, viewGroup});
        } else if (Build.VERSION.SDK_INT >= 19 && shouldBlock()) {
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                View childAt = viewGroup2.getChildAt(i);
                if (childAt == viewGroup) {
                    blockOtherSlice(viewGroup, this.mSliceView);
                } else {
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
    }

    private void blockOtherSlice(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9b729d", new Object[]{this, viewGroup, view});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
    }

    private void recoverOtherSlice(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30f75a6", new Object[]{this, viewGroup, view});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    childAt.setImportantForAccessibility(0);
                }
            }
        }
    }

    private void recoverSiblingAccessibility(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3be40f6", new Object[]{this, viewGroup});
        } else if (Build.VERSION.SDK_INT >= 16 && shouldBlock()) {
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                View childAt = viewGroup2.getChildAt(i);
                if (childAt == viewGroup) {
                    recoverOtherSlice(viewGroup, this.mSliceView);
                } else {
                    childAt.setImportantForAccessibility(0);
                }
            }
        }
    }

    private boolean shouldBlock() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f736fe25", new Object[]{this})).booleanValue() : TextUtils.equals(this.mRole, "dialog");
    }

    private void showSliceToContainer(MUSOverlayContainer mUSOverlayContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08dc4dd", new Object[]{this, mUSOverlayContainer});
            return;
        }
        mUSOverlayContainer.addOverlay(this.mSliceView, this.mZIndex);
        i childNodeTree = this.mMusOverlay.getChildNodeTree();
        int[] iArr = new int[2];
        Rect rect = new Rect();
        Rect displayLoc = getDisplayLoc(iArr, rect);
        if (displayLoc == null) {
            displayLoc = new Rect(0, 0, childNodeTree.k(), childNodeTree.l());
        }
        Rect rect2 = displayLoc;
        this.mSliceView.setUpAndShow(iArr[0], iArr[1], rect2.width(), rect2.height(), rect, rect2, this.mAnimation, this.mExitAnimation, this.mAnimationType, this.mMaskAnimation, this.mMask, this.mMaskColor);
    }

    public void updateLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28be925", new Object[]{this});
        } else if (ensureContainer() == null) {
        } else {
            i childNodeTree = this.mMusOverlay.getChildNodeTree();
            int[] iArr = new int[2];
            Rect rect = new Rect();
            Rect displayLoc = getDisplayLoc(iArr, rect);
            if (displayLoc == null) {
                displayLoc = new Rect(0, 0, childNodeTree.k(), childNodeTree.l());
            }
            Rect rect2 = displayLoc;
            this.mSliceView.updateLocation(iArr[0], iArr[1], rect2.width(), rect2.height(), rect, rect2);
        }
    }

    public void setZIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d8dd6", new Object[]{this, num});
        } else {
            this.mZIndex = num;
        }
    }
}
