package com.alibaba.poplayer.config.model.style;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kgt;

/* loaded from: classes3.dex */
public class StyleModel implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = kgt.EVENT_DRAG)
    public boolean drag;
    @JSONField(name = "dragArea")
    public DragArea dragArea;
    @JSONField(name = "dragMode")
    public String dragMode;
    @JSONField(name = "height")
    public String height;
    @JSONField(name = "layout")
    public String layout;
    @JSONField(name = "offsetBottom")
    public String offsetBottom;
    @JSONField(name = "offsetLeft")
    public String offsetLeft;
    @JSONField(name = "offsetRight")
    public String offsetRight;
    @JSONField(name = "offsetTop")
    public String offsetTop;
    @JSONField(name = "width")
    public String width;

    /* loaded from: classes3.dex */
    public static class DragArea implements IModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "offsetBottom")
        public String offsetBottom;
        @JSONField(name = "offsetLeft")
        public String offsetLeft;
        @JSONField(name = "offsetRight")
        public String offsetRight;
        @JSONField(name = "offsetTop")
        public String offsetTop;

        static {
            kge.a(-1803915382);
            kge.a(-284545415);
        }

        @Override // com.alibaba.poplayer.config.model.base.IModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    static {
        kge.a(-1158778117);
        kge.a(-284545415);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.layout) && !StringUtils.isEmpty(this.width) && !StringUtils.isEmpty(this.height);
    }
}
