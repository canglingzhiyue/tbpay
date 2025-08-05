package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class FloutWhiteListBean implements Serializable {
    @JSONField(name = "link")
    public String link;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "packageName")
    public String packageName;
    @JSONField(name = "schemes")
    public String[] schemes;
    @JSONField(name = "supportAfcLink")
    public boolean supportAfcLink;

    static {
        kge.a(355203606);
        kge.a(1028243835);
    }
}
