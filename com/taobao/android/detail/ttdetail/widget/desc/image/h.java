package com.taobao.android.detail.ttdetail.widget.desc.image;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTERED_SUFFIX = "END_IMAGE_URL";

    /* renamed from: a  reason: collision with root package name */
    public static int f11004a;

    static {
        kge.a(-1069757744);
        f11004a = 160;
    }

    public static String a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e4c47a7", new Object[]{context, str, new Integer(i)}) : i.a().a(str, new g(i, i));
    }
}
