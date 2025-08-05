package com.taobao.mmad.data;

import com.taobao.bootimage.data.BootImageInfo;
import tb.kge;

/* loaded from: classes7.dex */
public class BaseMmAdModel extends BootImageInfo {
    private String creativeId;
    private String dataType;
    private String targetUrl;

    static {
        kge.a(846891433);
    }

    public String getCreativeId() {
        return this.creativeId;
    }

    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setTargetUrl(String str) {
        this.targetUrl = str;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }
}
