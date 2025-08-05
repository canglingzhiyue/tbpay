package com.taobao.mytaobao.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.mxi;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MtbGlobalEnv$disableDxPreRenderV2$2 extends Lambda implements ruk<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MtbGlobalEnv$disableDxPreRenderV2$2 INSTANCE = new MtbGlobalEnv$disableDxPreRenderV2$2();

    public MtbGlobalEnv$disableDxPreRenderV2$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a980813", new Object[]{this}) : Boolean.valueOf(mo2427invoke());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Boolean, boolean] */
    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final Boolean mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        ABGlobal.isFeatureOpened(Globals.getApplication(), "enableDxPreRenderV2");
        ABGlobal.isFeatureOpened(Globals.getApplication(), "disableDxPreRenderV2");
        return mxi.a().a("disableDxPreRenderV2", 5000L);
    }
}
