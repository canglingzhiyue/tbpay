package com.taobao.taopai2.material.business.musicdetail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicDetailRequestParams extends MaterialBaseRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String audioId;
    public String id;
    public String soundId;
    public int vendorType;

    static {
        kge.a(667481669);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.music.detail";
    }
}
