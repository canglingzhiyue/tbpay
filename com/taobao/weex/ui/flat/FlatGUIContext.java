package com.taobao.weex.ui.flat;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.flat.widget.AndroidViewWidget;
import com.taobao.weex.ui.flat.widget.Widget;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class FlatGUIContext implements Destroyable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<WXComponent, WidgetContainer> mWidgetRegistry = new ArrayMap();
    private Map<WXComponent, AndroidViewWidget> mViewWidgetRegistry = new ArrayMap();
    private Map<Widget, WXComponent> widgetToComponent = new ArrayMap();

    static {
        kge.a(-332223101);
        kge.a(-1927357621);
    }

    public boolean isFlatUIEnabled(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995fd0da", new Object[]{this, wXComponent})).booleanValue();
        }
        return false;
    }

    public void register(WXComponent wXComponent, WidgetContainer widgetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa7a40b", new Object[]{this, wXComponent, widgetContainer});
        } else if ((widgetContainer instanceof FlatComponent) && !((FlatComponent) widgetContainer).promoteToView(true)) {
        } else {
            this.mWidgetRegistry.put(wXComponent, widgetContainer);
        }
    }

    public void register(WXComponent wXComponent, AndroidViewWidget androidViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c1ddcdb", new Object[]{this, wXComponent, androidViewWidget});
        } else {
            this.mViewWidgetRegistry.put(wXComponent, androidViewWidget);
        }
    }

    public void register(Widget widget, WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1685e823", new Object[]{this, widget, wXComponent});
        } else {
            this.widgetToComponent.put(widget, wXComponent);
        }
    }

    public WidgetContainer getFlatComponentAncestor(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetContainer) ipChange.ipc$dispatch("1042d697", new Object[]{this, wXComponent}) : this.mWidgetRegistry.get(wXComponent);
    }

    public AndroidViewWidget getAndroidViewWidget(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidViewWidget) ipChange.ipc$dispatch("16fc5014", new Object[]{this, wXComponent}) : this.mViewWidgetRegistry.get(wXComponent);
    }

    public boolean promoteToView(WXComponent wXComponent, boolean z, Class<? extends WXComponent<?>> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52ec7839", new Object[]{this, wXComponent, new Boolean(z), cls})).booleanValue() : !isFlatUIEnabled(wXComponent) || !cls.equals(wXComponent.getClass()) || StringUtils.equals(wXComponent.getRef(), WXComponent.ROOT) || (z && getFlatComponentAncestor(wXComponent) == null) || checkComponent(wXComponent);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    public View getWidgetContainerView(Widget widget) {
        WidgetContainer flatComponentAncestor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3166fd17", new Object[]{this, widget});
        }
        WXComponent component = getComponent(widget);
        if (component != null && (flatComponentAncestor = getFlatComponentAncestor(component)) != null) {
            return flatComponentAncestor.mo1286getHostView();
        }
        return null;
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.widgetToComponent.clear();
        for (Map.Entry<WXComponent, AndroidViewWidget> entry : this.mViewWidgetRegistry.entrySet()) {
            entry.getValue().destroy();
        }
        this.mViewWidgetRegistry.clear();
        for (Map.Entry<WXComponent, WidgetContainer> entry2 : this.mWidgetRegistry.entrySet()) {
            entry2.getValue().unmountFlatGUI();
        }
        this.mWidgetRegistry.clear();
    }

    private WXComponent getComponent(Widget widget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("51c36421", new Object[]{this, widget}) : this.widgetToComponent.get(widget);
    }

    private boolean checkComponent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a5f04c5", new Object[]{this, wXComponent})).booleanValue();
        }
        if (wXComponent != null) {
            WXStyle styles = wXComponent.getStyles();
            WXAttr attrs = wXComponent.getAttrs();
            if (styles.containsKey("opacity") || styles.containsKey("transform") || styles.containsKey("visibility") || attrs.containsKey(Constants.Name.ELEVATION) || attrs.containsKey("ariaHidden") || attrs.containsKey("ariaLabel") || attrs.containsKey(WXComponent.PROP_FIXED_SIZE) || attrs.containsKey("disabled") || styles.isFixed() || styles.isSticky() || !styles.getPesudoStyles().isEmpty() || wXComponent.getEvents().size() > 0) {
                return true;
            }
        }
        return false;
    }
}
