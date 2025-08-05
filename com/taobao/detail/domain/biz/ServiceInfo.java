package com.taobao.detail.domain.biz;

import com.taobao.detail.domain.base.ServiceUnit;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ServiceInfo implements Serializable {
    public Boolean groupMulti;
    public Boolean groupMustSelect;
    public Map<Long, String> serIdMap;
    public List<List<ServiceUnit>> serviceUnit;
    public Map<String, List<List<ServiceUnit>>> skuServiceUnit;
    public Map<Long, String> unqIdMap;

    static {
        kge.a(1266098375);
        kge.a(1028243835);
    }
}
