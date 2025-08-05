package com.taobao.weex.ui.flat;

import android.util.Pair;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.flat.widget.AndroidViewWidget;
import com.taobao.weex.ui.flat.widget.Widget;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class WidgetContainer<T extends ViewGroup> extends WXVContainer<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Widget> widgets;

    static {
        kge.a(-1867061209);
    }

    public static /* synthetic */ Object ipc$super(WidgetContainer widgetContainer, String str, Object... objArr) {
        if (str.hashCode() == -588170492) {
            super.createChildViewAt(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public boolean intendToBeFlatContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ef49e9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void mountFlatGUI();

    public abstract void unmountFlatGUI();

    public WidgetContainer(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    @Override // com.taobao.weex.ui.component.WXVContainer
    public void createChildViewAt(int i) {
        Widget androidViewWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf13b04", new Object[]{this, new Integer(i)});
        } else if (intendToBeFlatContainer()) {
            Pair<WXComponent, Integer> rearrangeIndexAndGetChild = rearrangeIndexAndGetChild(i);
            if (rearrangeIndexAndGetChild.first == null) {
                return;
            }
            WXComponent wXComponent = (WXComponent) rearrangeIndexAndGetChild.first;
            FlatGUIContext u = getInstance().u();
            WidgetContainer<T> flatComponentAncestor = u.getFlatComponentAncestor(this);
            if (flatComponentAncestor == null || u.getAndroidViewWidget(this) != null) {
                flatComponentAncestor = this;
            }
            u.register(wXComponent, flatComponentAncestor);
            if (wXComponent instanceof FlatComponent) {
                FlatComponent flatComponent = (FlatComponent) wXComponent;
                if (!flatComponent.promoteToView(false)) {
                    androidViewWidget = flatComponent.getOrCreateFlatWidget();
                    u.register(androidViewWidget, wXComponent);
                    addFlatChild(androidViewWidget, ((Integer) rearrangeIndexAndGetChild.second).intValue());
                }
            }
            androidViewWidget = new AndroidViewWidget(u);
            AndroidViewWidget androidViewWidget2 = (AndroidViewWidget) androidViewWidget;
            u.register(wXComponent, androidViewWidget2);
            wXComponent.createView();
            androidViewWidget2.setContentView(wXComponent.mo1286getHostView());
            flatComponentAncestor.addSubView(wXComponent.mo1286getHostView(), -1);
            u.register(androidViewWidget, wXComponent);
            addFlatChild(androidViewWidget, ((Integer) rearrangeIndexAndGetChild.second).intValue());
        } else {
            super.createChildViewAt(i);
        }
    }

    private void addFlatChild(Widget widget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4346e64", new Object[]{this, widget, new Integer(i)});
            return;
        }
        if (this.widgets == null) {
            this.widgets = new LinkedList();
        }
        if (i >= this.widgets.size()) {
            this.widgets.add(widget);
        } else {
            this.widgets.add(i, widget);
        }
        mountFlatGUI();
    }
}
