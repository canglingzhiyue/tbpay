package com.taobao.taopai2.material.business.res;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialResource extends MaterialDetailBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String dirPath;
    public String materialJsonPath;

    static {
        kge.a(1677104433);
    }

    public String getDirPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a504e5d", new Object[]{this}) : this.dirPath;
    }

    public void setDirPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bd0621", new Object[]{this, str});
        } else {
            this.dirPath = str;
        }
    }

    public String getMaterialJsonPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c840da4f", new Object[]{this}) : this.materialJsonPath;
    }

    public void setMaterialJsonPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1cfe07", new Object[]{this, str});
        } else {
            this.materialJsonPath = str;
        }
    }
}
