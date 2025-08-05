package com.taobao.augecore.data;

import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* loaded from: classes6.dex */
public class CrowdResponseData implements Serializable, IMTOPDataObject {
    public List<GroupData> crowds;
    public String expireTime;

    public List<GroupData> getCrowds() {
        return this.crowds;
    }

    public void setCrowds(List<GroupData> list) {
        this.crowds = list;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(String str) {
        this.expireTime = str;
    }
}
