package com.taobao.android.fluid.framework.data.datamodel;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes5.dex */
public final class MediaMixContentDetail implements Serializable, IMTOPDataObject {
    public Map<String, Object> businessExtraMap;
    public Map<String, Object> config;
    public Map<String, Object> edgeComputeConfig;
    public List<MediaContentDetailData> list;
    public String noMoreData;
    public String noMoreMsg;
    public List<MediaContentDetailData> pitList;
    public Map<String, Object> transmission;

    static {
        kge.a(2022734342);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
