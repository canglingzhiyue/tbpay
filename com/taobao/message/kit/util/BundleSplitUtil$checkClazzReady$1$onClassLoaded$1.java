package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BundleSplitUtil$checkClazzReady$1$onClassLoaded$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Class $aClass;
    public final /* synthetic */ BundleSplitUtil$checkClazzReady$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleSplitUtil$checkClazzReady$1$onClassLoaded$1(BundleSplitUtil$checkClazzReady$1 bundleSplitUtil$checkClazzReady$1, Class cls) {
        super(0);
        this.this$0 = bundleSplitUtil$checkClazzReady$1;
        this.$aClass = cls;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.this$0.$onSuccess.mo2421invoke(this.$aClass);
        }
    }
}
