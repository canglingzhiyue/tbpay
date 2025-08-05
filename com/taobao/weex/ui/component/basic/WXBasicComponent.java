package com.taobao.weex.ui.component.basic;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.dom.WXStyle;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.action.GraphicPosition;
import com.taobao.weex.ui.action.GraphicSize;
import com.taobao.weex.ui.component.WXComponent;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class WXBasicComponent<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BasicComponentData mBasicComponentData;
    private String mComponentType;
    private Object mExtra;
    private boolean mIsLayoutRTL;
    private GraphicPosition mLayoutPosition;
    private GraphicSize mLayoutSize;
    private String mRef;
    private int mViewPortWidth = 750;

    static {
        kge.a(-1795913981);
    }

    public WXBasicComponent(BasicComponentData basicComponentData) {
        this.mBasicComponentData = basicComponentData;
        this.mRef = basicComponentData.mRef;
        this.mComponentType = basicComponentData.mComponentType;
    }

    public BasicComponentData getBasicComponentData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasicComponentData) ipChange.ipc$dispatch("61ce693d", new Object[]{this}) : this.mBasicComponentData;
    }

    public void bindComponent(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b390dec", new Object[]{this, wXComponent});
            return;
        }
        this.mComponentType = wXComponent.getComponentType();
        this.mRef = wXComponent.getRef();
    }

    public final WXStyle getStyles() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXStyle) ipChange.ipc$dispatch("92801168", new Object[]{this}) : this.mBasicComponentData.getStyles();
    }

    public final WXAttr getAttrs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXAttr) ipChange.ipc$dispatch("e2b4aa58", new Object[]{this}) : this.mBasicComponentData.getAttrs();
    }

    public final WXEvent getEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXEvent) ipChange.ipc$dispatch("9d1805d6", new Object[]{this}) : this.mBasicComponentData.getEvents();
    }

    public final CSSShorthand getMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CSSShorthand) ipChange.ipc$dispatch("a687534a", new Object[]{this}) : this.mBasicComponentData.getMargin();
    }

    public final CSSShorthand getPadding() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CSSShorthand) ipChange.ipc$dispatch("5e728a73", new Object[]{this}) : this.mBasicComponentData.getPadding();
    }

    public CSSShorthand getBorder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CSSShorthand) ipChange.ipc$dispatch("902d3b8c", new Object[]{this}) : this.mBasicComponentData.getBorder();
    }

    public final void setMargins(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3909c149", new Object[]{this, cSSShorthand});
        } else {
            this.mBasicComponentData.setMargins(cSSShorthand);
        }
    }

    public final void setPaddings(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f773ca", new Object[]{this, cSSShorthand});
        } else {
            this.mBasicComponentData.setPaddings(cSSShorthand);
        }
    }

    public final void setBorders(CSSShorthand cSSShorthand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d6a10b", new Object[]{this, cSSShorthand});
        } else {
            this.mBasicComponentData.setBorders(cSSShorthand);
        }
    }

    public final void addAttr(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35368ac", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.mBasicComponentData.addAttr(map);
        }
    }

    public final void addStyle(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fadc8e", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.mBasicComponentData.addStyle(map);
        }
    }

    public final void addStyle(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a616806", new Object[]{this, map, new Boolean(z)});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.mBasicComponentData.addStyle(map, z);
        }
    }

    public final void updateStyle(Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6fa4de", new Object[]{this, map, new Boolean(z)});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.mBasicComponentData.getStyles().updateStyle(map, z);
        }
    }

    public final void addEvent(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44fa683f", new Object[]{this, set});
        } else if (set == null || set.isEmpty()) {
        } else {
            this.mBasicComponentData.addEvent(set);
        }
    }

    public final void addShorthand(Map<String, String> map) {
        BasicComponentData basicComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b57c94", new Object[]{this, map});
        } else if (map.isEmpty() || (basicComponentData = this.mBasicComponentData) == null) {
        } else {
            basicComponentData.addShorthand(map);
        }
    }

    public int getViewPortWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca639864", new Object[]{this})).intValue() : this.mViewPortWidth;
    }

    public void setViewPortWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193b6abe", new Object[]{this, new Integer(i)});
        } else {
            this.mViewPortWidth = i;
        }
    }

    public Object getExtra() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("88ef371", new Object[]{this}) : this.mExtra;
    }

    public void updateExtra(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552da22a", new Object[]{this, obj});
        } else {
            this.mExtra = obj;
        }
    }

    public String getComponentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("533be778", new Object[]{this}) : this.mComponentType;
    }

    public String getRef() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this}) : this.mRef;
    }

    public void setIsLayoutRTL(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8629499", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLayoutRTL = z;
        }
    }

    public boolean isLayoutRTL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b16fe661", new Object[]{this})).booleanValue() : this.mIsLayoutRTL;
    }

    public GraphicPosition getLayoutPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GraphicPosition) ipChange.ipc$dispatch("d075aca9", new Object[]{this});
        }
        if (this.mLayoutPosition == null) {
            this.mLayoutPosition = new GraphicPosition(0.0f, 0.0f, 0.0f, 0.0f);
        }
        return this.mLayoutPosition;
    }

    public void setLayoutPosition(GraphicPosition graphicPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70c800d", new Object[]{this, graphicPosition});
        } else {
            this.mLayoutPosition = graphicPosition;
        }
    }

    public GraphicSize getLayoutSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GraphicSize) ipChange.ipc$dispatch("ad586d29", new Object[]{this});
        }
        if (this.mLayoutSize == null) {
            this.mLayoutSize = new GraphicSize(0.0f, 0.0f);
        }
        return this.mLayoutSize;
    }

    public void setLayoutSize(GraphicSize graphicSize) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c627d5d", new Object[]{this, graphicSize});
        } else {
            this.mLayoutSize = graphicSize;
        }
    }

    public float getCSSLayoutTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39f762f5", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition != null) {
            return graphicPosition.getTop();
        }
        return 0.0f;
    }

    public float getCSSLayoutBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cfb4d9", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition != null) {
            return graphicPosition.getBottom();
        }
        return 0.0f;
    }

    public float getCSSLayoutLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7b9ee75", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition != null) {
            return graphicPosition.getLeft();
        }
        return 0.0f;
    }

    public float getCSSLayoutRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cec61fc", new Object[]{this})).floatValue();
        }
        GraphicPosition graphicPosition = this.mLayoutPosition;
        if (graphicPosition != null) {
            return graphicPosition.getRight();
        }
        return 0.0f;
    }

    public float getLayoutWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b44fd", new Object[]{this})).floatValue();
        }
        GraphicSize graphicSize = this.mLayoutSize;
        if (graphicSize != null) {
            return graphicSize.getWidth();
        }
        return 0.0f;
    }

    public float getLayoutHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc5e", new Object[]{this})).floatValue();
        }
        GraphicSize graphicSize = this.mLayoutSize;
        if (graphicSize != null) {
            return graphicSize.getHeight();
        }
        return 0.0f;
    }
}
