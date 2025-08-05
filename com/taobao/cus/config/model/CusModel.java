package com.taobao.cus.config.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class CusModel implements Serializable {
    @JSONField(name = "content")
    public List<CusContentModel> content;
    @JSONField(name = "success")
    public boolean success;

    static {
        kge.a(1193021434);
        kge.a(1028243835);
    }
}
