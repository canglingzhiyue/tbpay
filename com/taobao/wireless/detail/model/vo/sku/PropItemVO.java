package com.taobao.wireless.detail.model.vo.sku;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class PropItemVO implements Serializable {
    public boolean checked;
    public String propId;
    public String propName;
    public String propValue;
    public List<String> subTitles;
    public List<PropItemVO> subValues;
    public List<PropValuesVO> values;

    static {
        kge.a(-199514479);
        kge.a(1028243835);
    }
}
