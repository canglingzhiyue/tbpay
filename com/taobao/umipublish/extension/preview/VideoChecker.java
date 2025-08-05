package com.taobao.umipublish.extension.preview;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import tb.gwu;
import tb.gwv;
import tb.kge;

/* loaded from: classes9.dex */
public class VideoChecker implements gwu<IUGCMedia> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1911114289);
        kge.a(607954589);
    }

    @Override // tb.gwu
    public boolean check(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4837411", new Object[]{this, iUGCMedia})).booleanValue() : gwv.e(iUGCMedia);
    }
}
