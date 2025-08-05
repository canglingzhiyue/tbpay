package com.taobao.taopai2.material.business.musiclist;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialBaseRequestParams;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicListRequestParams extends MaterialBaseRequestParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int category;
    public int page;
    public int pageSize = 20;
    public String searchKey;
    public String searchTerms;

    static {
        kge.a(1632957035);
        kge.a(1028243835);
    }

    @Override // com.taobao.taopai2.material.base.b
    public String getAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef90fe95", new Object[]{this}) : "mtop.alibaba.tspeditor.material.music.list";
    }
}
