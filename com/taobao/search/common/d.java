package com.taobao.search.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.q;
import tb.kge;

/* loaded from: classes7.dex */
public class d extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(325164311);
    }

    @Override // com.taobao.android.nav.q, com.taobao.android.nav.a
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str.equals("com.taobao.taobao");
    }

    @Override // com.taobao.android.nav.q, com.taobao.android.nav.a
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : str.equals("com.taobao.search.searchdoor.SearchDoorActivity") || str.equals("com.taobao.search.sf.MainSearchResultActivity") || str.equals("com.taobao.search.sf.InshopResultActivity") || str.equals("com.taobao.search.searchdoor.shop.ShopSearchDoorActivity") || str.equals("com.etao.feimagesearch.capture.CaptureActivity") || str.equals("com.etao.feimagesearch.IrpActivity") || str.equals("com.etao.feimagesearch.SingleIrpActivity") || str.equals("com.taobao.search.searchdoor.MultipleSearchDoorActivity") || str.equals("com.taobao.taowise.chat.ChatGPTActivity");
    }
}
