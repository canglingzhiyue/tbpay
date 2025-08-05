package com.taobao.pha.core.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ResourcePrefetchModel implements Serializable {
    @JSONField(name = "headers")
    public JSONObject headers;
    @JSONField(name = "mime_type")
    public String mimeType;
    @JSONField(name = d.BUNDLE_QUERY_PARAMS)
    public List<String> queryParams;
    @JSONField(name = "src")
    public String src;

    static {
        kge.a(643876263);
        kge.a(1028243835);
    }
}
