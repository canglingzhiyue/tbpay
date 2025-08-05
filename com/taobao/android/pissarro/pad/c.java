package com.taobao.android.pissarro.pad;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.q;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-150287302);
    }

    @Override // com.taobao.android.nav.q, com.taobao.android.nav.a
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str.equals("com.taobao.taobao");
    }

    @Override // com.taobao.android.nav.q, com.taobao.android.nav.a
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : str.equals("com.taobao.taopai.business.image.album.ImageGalleryActivity") || str.equals("com.taobao.taopai.business.record.fragment.TPRecordActivity");
    }
}
