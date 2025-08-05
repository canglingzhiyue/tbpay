package com.taobao.tao.sharegift;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class SharePasteImageConfig implements Serializable {
    @JSONField(name = "bizID")
    public String bizID;
    @JSONField(name = "buttonText")
    public String buttonText;
    @JSONField(name = "sharepasteimage")
    public String sharepasteimage;
    @JSONField(name = "tipimage")
    public String tipimage;

    static {
        kge.a(-2097686583);
        kge.a(1028243835);
    }
}
