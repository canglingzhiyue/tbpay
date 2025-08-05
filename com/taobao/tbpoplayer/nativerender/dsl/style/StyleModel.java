package com.taobao.tbpoplayer.nativerender.dsl.style;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tbpoplayer.nativerender.dsl.INativeModel;
import com.taobao.tbpoplayer.nativerender.dsl.WidgetAnimModel;
import tb.kge;

/* loaded from: classes8.dex */
public class StyleModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "background")
    public String background;
    @JSONField(name = "backgroundUrl")
    public String backgroundUrl;
    @JSONField(name = "borderRadius")
    public int borderRadius;
    @JSONField(name = "bottom")
    public String bottom;
    @JSONField(name = "height")
    public String height;
    @JSONField(name = "layout")
    public String layout;
    @JSONField(name = "left")
    public String left;
    @JSONField(name = "marginBottom")
    public String marginBottom;
    @JSONField(name = "marginLeft")
    public String marginLeft;
    @JSONField(name = "marginRight")
    public String marginRight;
    @JSONField(name = "marginTop")
    public String marginTop;
    @JSONField(name = "opacity")
    public String opacity;
    @JSONField(name = "overflow")
    public String overflow;
    @JSONField(name = "paddingBottom")
    public long paddingBottom;
    @JSONField(name = "paddingLeft")
    public long paddingLeft;
    @JSONField(name = "paddingRight")
    public long paddingRight;
    @JSONField(name = "paddingTop")
    public long paddingTop;
    @JSONField(name = "right")
    public String right;
    @JSONField(name = "rotate")
    public String rotate;
    @JSONField(name = "rotateX")
    public String rotateX;
    @JSONField(name = "rotateY")
    public String rotateY;
    @JSONField(name = "scaleX")
    public String scaleX;
    @JSONField(name = "scaleY")
    public String scaleY;
    @JSONField(name = "top")
    public String top;
    @JSONField(name = "translateX")
    public String translateX;
    @JSONField(name = "translateY")
    public String translateY;
    @JSONField(name = "widgetAnimBackground")
    public WidgetAnimModel widgetAnimBackground;
    @JSONField(name = "width")
    public String width;
    @JSONField(name = a.ATOM_EXT_zIndex)
    public long zIndex;

    static {
        kge.a(-493696100);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
