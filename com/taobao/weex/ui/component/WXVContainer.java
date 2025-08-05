package com.taobao.weex.ui.component;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class WXVContainer<T extends ViewGroup> extends WXComponent<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WXVContainer";
    private Boolean disableAppearBubble;
    private WXVContainer<T>.BoxShadowHost mBoxShadowHost;
    public ArrayList<WXComponent> mChildren;

    /* loaded from: classes9.dex */
    public class BoxShadowHost extends View {
        static {
            kge.a(-1946582195);
        }

        public BoxShadowHost(Context context) {
            super(context);
        }
    }

    static {
        kge.a(1304232574);
    }

    public static /* synthetic */ Object ipc$super(WXVContainer wXVContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2070063326:
                return super.mo1594getRealView();
            case -2027401452:
                super.onRenderFinish(((Number) objArr[0]).intValue());
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1893695439:
                super.onActivityCreate();
                return null;
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1265876613:
                super.onActivityStart();
                return null;
            case -869057037:
                super.bindData((WXComponent) objArr[0]);
                return null;
            case -631469807:
                super.refreshData((WXComponent) objArr[0]);
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case -415570888:
                super.recycled();
                return null;
            case -118097108:
                return super.detachViewAndClearPreInfo();
            case -69121504:
                return new Boolean(super.onActivityBack());
            case -17468269:
                super.onActivityDestroy();
                return null;
            case 196973982:
                super.notifyAppearStateChange((String) objArr[0], (String) objArr[1]);
                return null;
            case 253619399:
                super.applyLayoutAndEvent((WXComponent) objArr[0]);
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1268210568:
                super.createViewImpl();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void appendTreeCreateFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea12fae", new Object[]{this});
        }
    }

    public int getChildrenLayoutTopOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ba18e03", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Deprecated
    public WXVContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, z, basicComponentData);
    }

    @Deprecated
    public WXVContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, boolean z, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mChildren = new ArrayList<>();
        this.disableAppearBubble = false;
    }

    public WXVContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mChildren = new ArrayList<>();
        this.disableAppearBubble = false;
    }

    public void interceptFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aca66bd", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) mo1286getHostView();
        if (viewGroup == null) {
            return;
        }
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
        viewGroup.setDescendantFocusability(131072);
        viewGroup.requestFocus();
    }

    public void setDisableAppearBubble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36da1c6", new Object[]{this, new Boolean(z)});
        } else {
            this.disableAppearBubble = Boolean.valueOf(z);
        }
    }

    public void ignoreFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d23bad", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) mo1286getHostView();
        if (viewGroup == null) {
            return;
        }
        viewGroup.setFocusable(false);
        viewGroup.setFocusableInTouchMode(false);
        viewGroup.clearFocus();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    @Deprecated
    /* renamed from: getView  reason: collision with other method in class */
    public ViewGroup mo1595getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this}) : (ViewGroup) mo1286getHostView();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void applyLayoutAndEvent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1decc7", new Object[]{this, wXComponent});
        } else if (!isLazy()) {
            if (wXComponent == null) {
                wXComponent = this;
            }
            super.applyLayoutAndEvent(wXComponent);
            int childCount = childCount();
            for (int i = 0; i < childCount; i++) {
                getChild(i).applyLayoutAndEvent(((WXVContainer) wXComponent).getChild(i));
            }
        }
    }

    public ViewGroup.LayoutParams getChildLayoutParams(WXComponent wXComponent, View view, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("c947c43d", new Object[]{this, wXComponent, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(i, i2);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return layoutParams;
        }
        setMarginsSupportRTL((ViewGroup.MarginLayoutParams) layoutParams, i3, i5, i4, i6);
        return layoutParams;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public Scrollable getFirstScroller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scrollable) ipChange.ipc$dispatch("d2dc61d3", new Object[]{this});
        }
        if (this instanceof Scrollable) {
            return (Scrollable) this;
        }
        for (int i = 0; i < getChildCount(); i++) {
            Scrollable firstScroller = getChild(i).getFirstScroller();
            if (firstScroller != null) {
                return firstScroller;
            }
        }
        return null;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void bindData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
        } else if (!isLazy()) {
            if (wXComponent == null) {
                wXComponent = this;
            }
            super.bindData(wXComponent);
            int childCount = childCount();
            for (int i = 0; i < childCount; i++) {
                getChild(i).bindData(((WXVContainer) wXComponent).getChild(i));
            }
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean useAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a5a1bc8", new Object[]{this})).booleanValue();
        }
        if (this.useAnimations) {
            return true;
        }
        try {
            int childCount = childCount();
            for (int i = 0; i < childCount; i++) {
                if (getChild(i).useAnimation()) {
                    this.useAnimations = true;
                    return true;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e(TAG, th);
        }
        return false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void refreshData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5c8911", new Object[]{this, wXComponent});
            return;
        }
        if (wXComponent == null) {
            wXComponent = this;
        }
        super.refreshData(wXComponent);
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).refreshData(((WXVContainer) wXComponent).getChild(i));
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: getRealView  reason: collision with other method in class */
    public ViewGroup mo1594getRealView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a01aa735", new Object[]{this}) : (ViewGroup) super.mo1594getRealView();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b975b88", new Object[]{this});
            return;
        }
        super.createViewImpl();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            createChildViewAt(i);
        }
        if (mo1286getHostView() == 0) {
            return;
        }
        ((ViewGroup) mo1286getHostView()).setClipToPadding(false);
        if (!enableContainerNoAccessible() || Build.VERSION.SDK_INT < 16) {
            return;
        }
        ((ViewGroup) mo1286getHostView()).setImportantForAccessibility(2);
    }

    private boolean enableContainerNoAccessible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ce45bc0", new Object[]{this})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter == null) {
            return true;
        }
        return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_ext_config", "enableContainerNoAccessible", "true"));
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<WXComponent> arrayList = this.mChildren;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mChildren.get(i).destroy();
            }
            this.mChildren.clear();
        }
        super.destroy();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        if (this.mChildren != null && !isFixed() && getAttrs().canRecycled()) {
            int size = this.mChildren.size();
            for (int i = 0; i < size; i++) {
                this.mChildren.get(i).recycled();
            }
        }
        super.recycled();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public View detachViewAndClearPreInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8f5fb2c", new Object[]{this});
        }
        View detachViewAndClearPreInfo = super.detachViewAndClearPreInfo();
        if (this.mChildren != null) {
            int childCount = childCount();
            for (int i = 0; i < childCount; i++) {
                this.mChildren.get(i).detachViewAndClearPreInfo();
            }
        }
        return detachViewAndClearPreInfo;
    }

    public int childCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6af9e04d", new Object[]{this})).intValue();
        }
        ArrayList<WXComponent> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public WXComponent getChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("2423f285", new Object[]{this, new Integer(i)});
        }
        ArrayList<WXComponent> arrayList = this.mChildren;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return this.mChildren.get(i);
        }
        return null;
    }

    public int getChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue() : childCount();
    }

    public void addChild(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facefa67", new Object[]{this, wXComponent});
        } else {
            addChild(wXComponent, -1);
        }
    }

    public void addChild(WXComponent wXComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f10c57c", new Object[]{this, wXComponent, new Integer(i)});
        } else if (wXComponent == null || i < -1) {
        } else {
            wXComponent.mDeepInComponentTree = this.mDeepInComponentTree + 1;
            getInstance();
            if (i >= this.mChildren.size()) {
                i = -1;
            }
            if (i == -1) {
                this.mChildren.add(wXComponent);
            } else {
                this.mChildren.add(i, wXComponent);
            }
        }
    }

    public final int indexOf(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db015f28", new Object[]{this, wXComponent})).intValue() : this.mChildren.indexOf(wXComponent);
    }

    public void createChildViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf13b04", new Object[]{this, new Integer(i)});
            return;
        }
        Pair<WXComponent, Integer> rearrangeIndexAndGetChild = rearrangeIndexAndGetChild(i);
        if (rearrangeIndexAndGetChild.first == null) {
            return;
        }
        WXComponent wXComponent = (WXComponent) rearrangeIndexAndGetChild.first;
        wXComponent.createView();
        if (wXComponent.isVirtualComponent()) {
            return;
        }
        addSubView(wXComponent.mo1286getHostView(), ((Integer) rearrangeIndexAndGetChild.second).intValue());
    }

    public Pair<WXComponent, Integer> rearrangeIndexAndGetChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4e454fc2", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            i = childCount() - 1;
        }
        if (i < 0) {
            return new Pair<>(null, Integer.valueOf(i));
        }
        return new Pair<>(getChild(i), Integer.valueOf(i));
    }

    public void addSubView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b8489c", new Object[]{this, view, new Integer(i)});
        } else if (view == null || mo1594getRealView() == null) {
        } else {
            if (i >= mo1594getRealView().getChildCount()) {
                i = -1;
            }
            if (i == -1) {
                mo1594getRealView().addView(view);
            } else {
                mo1594getRealView().addView(view, i);
            }
            WXSDKInstance wXVContainer = getInstance();
            if (wXVContainer == null) {
                return;
            }
            wXVContainer.ar().g = true;
        }
    }

    public void remove(WXComponent wXComponent, boolean z) {
        ArrayList<WXComponent> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843596a4", new Object[]{this, wXComponent, new Boolean(z)});
        } else if (wXComponent == null || (arrayList = this.mChildren) == null || arrayList.size() == 0) {
        } else {
            this.mChildren.remove(wXComponent);
            if (getInstance() != null && getInstance().al() != null && wXComponent.isFixed()) {
                getInstance().b(wXComponent.mo1286getHostView());
            } else if (mo1594getRealView() != null) {
                if (!wXComponent.isVirtualComponent()) {
                    ViewParent viewParent = null;
                    if ((wXComponent.getParent() instanceof IWXScroller) && wXComponent.mo1286getHostView() != null) {
                        viewParent = wXComponent.mo1286getHostView().getParent();
                    }
                    if (viewParent != null && (viewParent instanceof ViewGroup)) {
                        ((ViewGroup) viewParent).removeView(wXComponent.mo1286getHostView());
                    } else {
                        mo1594getRealView().removeView(wXComponent.mo1286getHostView());
                    }
                } else {
                    wXComponent.removeVirtualComponent();
                }
            }
            if (!z) {
                return;
            }
            wXComponent.destroy();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void notifyAppearStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd959e", new Object[]{this, str, str2});
            return;
        }
        super.notifyAppearStateChange(str, str2);
        if (mo1286getHostView() == 0 || this.mChildren == null || this.disableAppearBubble.booleanValue()) {
            return;
        }
        Iterator<WXComponent> it = this.mChildren.iterator();
        while (it.hasNext()) {
            WXComponent next = it.next();
            if (next.mo1286getHostView() != null && next.mo1286getHostView().getVisibility() != 0) {
                str = "disappear";
            }
            next.notifyAppearStateChange(str, str2);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
            return;
        }
        super.onActivityCreate();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityCreate();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        super.onActivityStart();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityStart();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityPause();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityResume();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityStop();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityDestroy();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean onActivityBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe14a20", new Object[]{this})).booleanValue();
        }
        super.onActivityBack();
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onActivityBack();
        }
        return false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        int childCount = childCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChild(i3).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        super.onCreateOptionsMenu(menu);
        int childCount = childCount();
        for (int i = 0; i < childCount; i++) {
            getChild(i).onCreateOptionsMenu(menu);
        }
        return false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        int childCount = childCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChild(i2).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onRenderFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87284f14", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChild(i2).onRenderFinish(i);
        }
        super.onRenderFinish(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @JSMethod
    public void releaseImageList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c90963", new Object[]{this, str});
        } else if (mo1286getHostView() != 0 && ViewCompat.isAttachedToWindow(mo1286getHostView()) && (mo1286getHostView() instanceof ViewGroup)) {
            if (WXUtils.getBoolean(str, false).booleanValue()) {
                doViewTreeRecycleImageView((ViewGroup) mo1286getHostView(), true);
                return;
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                WXComponent child = getChild(i);
                if (child.mo1286getHostView() instanceof IWXImageView) {
                    IWXImageView iWXImageView = (IWXImageView) child.mo1286getHostView();
                    if (iWXImageView != null && ViewCompat.isAttachedToWindow((View) iWXImageView)) {
                        iWXImageView.autoReleaseImage();
                    }
                } else if (child instanceof WXVContainer) {
                    ((WXVContainer) child).releaseImageList(str);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @JSMethod
    public void recoverImageList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3499866", new Object[]{this, str});
        } else if (mo1286getHostView() != 0 && ViewCompat.isAttachedToWindow(mo1286getHostView()) && (mo1286getHostView() instanceof ViewGroup)) {
            if (WXUtils.getBoolean(str, false).booleanValue()) {
                doViewTreeRecycleImageView((ViewGroup) mo1286getHostView(), false);
                return;
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                WXComponent child = getChild(i);
                if (child.mo1286getHostView() instanceof IWXImageView) {
                    IWXImageView iWXImageView = (IWXImageView) child.mo1286getHostView();
                    if (iWXImageView != null && ViewCompat.isAttachedToWindow((View) iWXImageView)) {
                        iWXImageView.autoRecoverImage();
                    }
                } else if (child instanceof WXVContainer) {
                    ((WXVContainer) child).recoverImageList(str);
                }
            }
        }
    }

    private void doViewTreeRecycleImageView(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96606ab3", new Object[]{this, viewGroup, new Boolean(z)});
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof IWXImageView) {
                if (z) {
                    ((IWXImageView) childAt).autoReleaseImage();
                } else {
                    ((IWXImageView) childAt).autoRecoverImage();
                }
            } else if (childAt instanceof ViewGroup) {
                doViewTreeRecycleImageView((ViewGroup) childAt, z);
            }
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.mGesture != null) {
            if (this.mGesture.isRequestDisallowInterceptTouchEvent()) {
                return;
            }
            this.mGesture.setRequestDisallowInterceptTouchEvent(z);
        }
        if (getParent() == null) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    public View getBoxShadowHost(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("addee632", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return this.mBoxShadowHost;
        }
        ViewGroup viewGroup = (ViewGroup) mo1286getHostView();
        if (viewGroup == null) {
            return null;
        }
        try {
            if ("div".equals(getComponentType())) {
                WXLogUtils.d("BoxShadow", "Draw box-shadow with BoxShadowHost on div: " + toString());
                if (this.mBoxShadowHost == null) {
                    this.mBoxShadowHost = new BoxShadowHost(getContext());
                    WXViewInnerUtils.setBackGround(this.mBoxShadowHost, null, this);
                    viewGroup.addView(this.mBoxShadowHost);
                }
                CSSShorthand padding = getPadding();
                CSSShorthand border = getBorder();
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(viewGroup.getLayoutParams());
                setMarginsSupportRTL(marginLayoutParams, -((int) (padding.get(CSSShorthand.EDGE.LEFT) + border.get(CSSShorthand.EDGE.LEFT))), -((int) (padding.get(CSSShorthand.EDGE.TOP) + border.get(CSSShorthand.EDGE.TOP))), -((int) (padding.get(CSSShorthand.EDGE.RIGHT) + border.get(CSSShorthand.EDGE.RIGHT))), -((int) (padding.get(CSSShorthand.EDGE.BOTTOM) + border.get(CSSShorthand.EDGE.BOTTOM))));
                this.mBoxShadowHost.setLayoutParams(marginLayoutParams);
                viewGroup.removeView(this.mBoxShadowHost);
                viewGroup.addView(this.mBoxShadowHost);
                return this.mBoxShadowHost;
            }
        } catch (Throwable th) {
            WXLogUtils.w("BoxShadow", th);
        }
        return viewGroup;
    }
}
