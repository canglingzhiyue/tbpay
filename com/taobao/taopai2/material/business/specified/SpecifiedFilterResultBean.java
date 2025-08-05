package com.taobao.taopai2.material.business.specified;

import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class SpecifiedFilterResultBean implements Serializable {
    public List<MaterialDetailBean> mMaterialList;
    public Map<String, MaterialSpecifiedRule> mRuleMap = new HashMap();

    static {
        kge.a(399496265);
        kge.a(1028243835);
    }
}
