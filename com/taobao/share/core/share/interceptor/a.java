package com.taobao.share.core.share.interceptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.ut.share.ShareApi;
import java.util.ArrayList;
import tb.kge;
import tb.nzp;

/* loaded from: classes8.dex */
public class a extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1636244492);
    }

    @Override // com.taobao.share.core.share.interceptor.c
    public void a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b62ec75", new Object[]{this, arrayList, tBShareContent, str});
            return;
        }
        com.taobao.android.share.resource.a a2 = com.taobao.android.share.resource.a.a();
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELCONTENTDEALPROCESSORSTART);
        com.taobao.share.globalmodel.e.b().a(com.taobao.share.copy.a.a().e(), tBShareContent);
        ShareApi.getInstance().registerShortenAdapter(new nzp());
        a2.a(com.taobao.android.share.resource.a.KEY_SHAREPANELCONTENTDEALPROCESSOREND);
    }
}
