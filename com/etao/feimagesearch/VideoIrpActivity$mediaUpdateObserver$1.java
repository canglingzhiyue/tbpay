package com.etao.feimagesearch;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.coy;
import tb.rul;

/* loaded from: classes3.dex */
public final class VideoIrpActivity$mediaUpdateObserver$1 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final VideoIrpActivity$mediaUpdateObserver$1 INSTANCE = new VideoIrpActivity$mediaUpdateObserver$1();

    public VideoIrpActivity$mediaUpdateObserver$1() {
        super(1);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, path});
            return;
        }
        q.c(path, "path");
        coy.a("Page_PhotoSearchResult", "plt_2023_screenshot", "path", path);
    }
}
