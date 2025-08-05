package com.etao.feimagesearch.capture.controller;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.g;
import com.etao.feimagesearch.k;
import com.etao.feimagesearch.structure.capture.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.com;
import tb.cpb;
import tb.cpe;
import tb.ruw;

/* loaded from: classes3.dex */
public final class CaptureV2Controller$updateScreenshotSearchFloatBarState$1 extends Lambda implements ruw<Integer, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h $uiHolder;
    public final /* synthetic */ cpb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureV2Controller$updateScreenshotSearchFloatBarState$1(cpb cpbVar, h hVar) {
        super(2);
        this.this$0 = cpbVar;
        this.$uiHolder = hVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, num2});
        }
        invoke(num.intValue(), num2.intValue());
        return t.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fe99f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 1) {
            this.$uiHolder.a(new g(true));
        } else if (i == 2) {
            this.$uiHolder.a(new g(false));
        } else if (i == 3) {
            this.$uiHolder.a(new g(false));
        } else if (i != 4) {
        } else {
            this.$uiHolder.a(new g(i2 == 1));
            if (i2 == 1) {
                return;
            }
            cpb cpbVar = this.this$0;
            if (!cpb.$ipChange) {
                return;
            }
            cpb.a(this.this$0, false);
            if (!q.a((Object) "true", (Object) k.b(com.b(), cpe.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT))) {
                return;
            }
            cpb.c(this.this$0);
        }
    }
}
