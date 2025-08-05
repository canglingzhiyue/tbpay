package com.etao.imagesearch.component.preview;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.capture.components.b;
import tb.com;
import tb.cuj;
import tb.kge;

/* loaded from: classes4.dex */
public class PreviewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f7104a;
    public static int b;
    public static int c;
    private static boolean d;

    static {
        kge.a(-754758194);
        f7104a = cuj.b(com.b(), b.KEY_PREVIEW_ID, "");
        b = com.etao.feimagesearch.config.b.D();
        c = com.etao.feimagesearch.config.b.E();
        d = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }
}
