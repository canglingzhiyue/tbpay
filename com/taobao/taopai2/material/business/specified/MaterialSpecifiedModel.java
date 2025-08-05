package com.taobao.taopai2.material.business.specified;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.request.Response;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialSpecifiedModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String filterInfoMap;
    public List<MaterialDetailBean> materialList;

    /* loaded from: classes8.dex */
    public static class MaterialSpecifiedResponse extends Response<MaterialSpecifiedModel> {
        static {
            kge.a(136224338);
        }
    }

    static {
        kge.a(552520044);
        kge.a(1028243835);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MaterialSpecifiedModel{filterInfoMap='" + this.filterInfoMap + "', materialList=" + this.materialList + '}';
    }
}
