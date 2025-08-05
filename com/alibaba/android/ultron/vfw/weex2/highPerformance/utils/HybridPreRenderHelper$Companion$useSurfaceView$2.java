package com.alibaba.android.ultron.vfw.weex2.highPerformance.utils;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.fkh;
import tb.iro;
import tb.ruk;
import tb.spk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class HybridPreRenderHelper$Companion$useSurfaceView$2 extends Lambda implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HybridPreRenderHelper$Companion$useSurfaceView$2 INSTANCE = new HybridPreRenderHelper$Companion$useSurfaceView$2();

    public HybridPreRenderHelper$Companion$useSurfaceView$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        String a2 = fkh.a();
        if (a2 != null) {
            int hashCode = a2.hashCode();
            if (hashCode != -1074341483) {
                if (hashCode != 107348) {
                    if (hashCode == 3202466 && a2.equals("high")) {
                        str = "useRefundSurfaceViewHigh";
                    }
                } else if (a2.equals("low")) {
                    str = "useRefundSurfaceViewLow";
                }
            } else if (a2.equals("middle")) {
                str = "useRefundSurfaceViewMiddle";
            }
            return spk.a(iro.ORANGE_KEY_MY_TAOBAO, str, false);
        }
        str = "useRefundSurfaceView";
        return spk.a(iro.ORANGE_KEY_MY_TAOBAO, str, false);
    }
}
