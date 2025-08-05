package com.taobao.pha.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class TabBarItemModel implements Serializable {
    @JSONField(name = "active_icon")
    public String activeIcon;
    public String icon;
    public String name;
    @JSONField(name = "path")
    public String pagePath;

    static {
        kge.a(-655079653);
        kge.a(1028243835);
    }
}
