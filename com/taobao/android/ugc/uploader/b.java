package com.taobao.android.ugc.uploader;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-967436379);
        kge.a(-1568548066);
    }

    @Override // com.taobao.android.ugc.uploader.c
    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d22817", new Object[]{this, jVar});
        }
    }

    @Override // com.taobao.android.ugc.uploader.c
    public void a(List<i> list, List<e> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
        }
    }
}
