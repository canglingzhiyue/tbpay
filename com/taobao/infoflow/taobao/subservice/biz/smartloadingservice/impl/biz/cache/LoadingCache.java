package com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class LoadingCache implements Serializable, IMTOPDataObject {
    private List<JSONObject> bufferList;

    static {
        kge.a(25405276);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public List<JSONObject> getBufferList() {
        return this.bufferList;
    }

    public void setBufferList(List<JSONObject> list) {
        this.bufferList = list;
    }
}
