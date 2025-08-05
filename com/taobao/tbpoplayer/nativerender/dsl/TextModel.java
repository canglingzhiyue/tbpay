package com.taobao.tbpoplayer.nativerender.dsl;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.tbpoplayer.nativerender.dsl.style.TextStyleModel;
import tb.kge;

/* loaded from: classes8.dex */
public class TextModel extends ComponentBaseModel {
    @JSONField(name = "enableEmpty")
    public boolean enableEmpty;
    @JSONField(name = "style")
    public TextStyleModel style;
    @JSONField(name = "text")
    public String text;

    static {
        kge.a(1514205238);
    }
}
