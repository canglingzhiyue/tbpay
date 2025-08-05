package com.taobao.android.a11y.ability.ocr;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class OCRRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String imgList;

    static {
        kge.a(1934002449);
    }

    public String getImgList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2b18d0e", new Object[]{this}) : this.imgList;
    }

    public void setImgList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a839d90", new Object[]{this, str});
        } else {
            this.imgList = str;
        }
    }
}
