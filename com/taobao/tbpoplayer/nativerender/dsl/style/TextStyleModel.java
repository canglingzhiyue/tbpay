package com.taobao.tbpoplayer.nativerender.dsl.style;

import com.alibaba.fastjson.annotation.JSONField;
import tb.kge;

/* loaded from: classes8.dex */
public class TextStyleModel extends StyleModel {
    @JSONField(name = "color")
    public String color;
    @JSONField(name = "fontSize")
    public String fontSize;
    @JSONField(name = "fontWeight")
    public String fontWeight;
    @JSONField(name = "lineHeight")
    public String lineHeight;
    @JSONField(name = "lineSpace")
    public String lineSpace;
    @JSONField(name = "maxLines")
    public String maxLines;
    @JSONField(name = "textAlign")
    public String textAlign;

    static {
        kge.a(607102633);
    }
}
