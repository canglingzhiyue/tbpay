package com.taobao.bootimage.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class BootImageBrandHubInfo implements IMTOPDataObject {
    public String bidid;
    public String creativeJson;
    private BootImageBrandCreativeJson creativeJsonModel;
    public String source;

    static {
        kge.a(-594235911);
        kge.a(-350052935);
    }

    public BootImageBrandCreativeJson getCreativeJson() {
        if (this.creativeJsonModel == null && !TextUtils.isEmpty(this.creativeJson)) {
            this.creativeJsonModel = (BootImageBrandCreativeJson) JSONObject.parseObject(this.creativeJson, BootImageBrandCreativeJson.class);
        }
        return this.creativeJsonModel;
    }
}
