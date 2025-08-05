package com.taobao.android.order.bundle.nav;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dcn;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1377922844);
    }

    public static Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{uri}) : !dcn.a() ? uri : uri.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
    }
}
