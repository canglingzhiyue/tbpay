package com.taobao.weex.ui.component;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.flat.FlatComponent;
import com.taobao.weex.ui.flat.WidgetContainer;
import com.taobao.weex.ui.flat.widget.WidgetGroup;
import com.taobao.weex.ui.view.WXFrameLayout;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import tb.kge;

@Component(lazyload = false)
/* loaded from: classes9.dex */
public class WXDiv extends WidgetContainer<WXFrameLayout> implements FlatComponent<WidgetGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WidgetGroup mWidgetGroup;

    static {
        kge.a(1707354654);
        kge.a(-1237124722);
    }

    /* loaded from: classes9.dex */
    public static class Ceator implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1542323742);
            kge.a(1901682895);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) throws IllegalAccessException, InvocationTargetException, InstantiationException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData}) : new WXDiv(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    @Deprecated
    public WXDiv(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public WXDiv(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public WXFrameLayout mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXFrameLayout) ipChange.ipc$dispatch("243cce4c", new Object[]{this, context});
        }
        WXFrameLayout wXFrameLayout = new WXFrameLayout(context);
        wXFrameLayout.holdComponent(this);
        return wXFrameLayout;
    }

    @Override // com.taobao.weex.ui.flat.FlatComponent
    public boolean promoteToView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5800f91", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (getInstance().u() == null) {
            return false;
        }
        return !intendToBeFlatContainer() || getInstance().u().promoteToView(this, z, WXDiv.class);
    }

    @Override // com.taobao.weex.ui.flat.FlatComponent
    public WidgetGroup getOrCreateFlatWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetGroup) ipChange.ipc$dispatch("566769a6", new Object[]{this});
        }
        if (this.mWidgetGroup == null) {
            this.mWidgetGroup = new WidgetGroup(getInstance().u());
            for (int i = 0; i < getChildCount(); i++) {
                createChildViewAt(i);
            }
            mountFlatGUI();
        }
        return this.mWidgetGroup;
    }

    @Override // com.taobao.weex.ui.flat.WidgetContainer
    public void mountFlatGUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae2fcb0", new Object[]{this});
            return;
        }
        if (this.widgets == null) {
            this.widgets = new LinkedList();
        }
        if (promoteToView(true)) {
            if (mo1286getHostView() == 0) {
                return;
            }
            ((WXFrameLayout) mo1286getHostView()).mountFlatGUI(this.widgets);
            return;
        }
        this.mWidgetGroup.replaceAll(this.widgets);
    }

    @Override // com.taobao.weex.ui.flat.WidgetContainer
    public void unmountFlatGUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8cb949", new Object[]{this});
        } else if (mo1286getHostView() == 0) {
        } else {
            ((WXFrameLayout) mo1286getHostView()).unmountFlatGUI();
        }
    }

    @Override // com.taobao.weex.ui.flat.WidgetContainer
    public boolean intendToBeFlatContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ef49e9", new Object[]{this})).booleanValue();
        }
        try {
            if (getInstance().u().isFlatUIEnabled(this)) {
                if (WXDiv.class.equals(getClass())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
            return false;
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public boolean isVirtualComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1960fe07", new Object[]{this})).booleanValue() : !promoteToView(true);
    }
}
