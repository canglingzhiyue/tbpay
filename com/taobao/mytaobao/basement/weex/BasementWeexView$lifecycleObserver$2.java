package com.taobao.mytaobao.basement.weex;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/GenericLifecycleObserver;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BasementWeexView$lifecycleObserver$2 extends Lambda implements ruk<GenericLifecycleObserver> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BasementWeexView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasementWeexView$lifecycleObserver$2(BasementWeexView basementWeexView) {
        super(0);
        this.this$0 = basementWeexView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final GenericLifecycleObserver mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GenericLifecycleObserver) ipChange.ipc$dispatch("48c32ce9", new Object[]{this}) : new GenericLifecycleObserver() { // from class: com.taobao.mytaobao.basement.weex.BasementWeexView$lifecycleObserver$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.arch.lifecycle.GenericLifecycleObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                p mInstance;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b6da9d1e", new Object[]{this, lifecycleOwner, event});
                } else if (event == null) {
                } else {
                    int i = b.$EnumSwitchMapping$0[event.ordinal()];
                    if (i == 1) {
                        p mInstance2 = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance();
                        if (mInstance2 == null) {
                            return;
                        }
                        mInstance2.onActivityStart();
                    } else if (i == 2) {
                        p mInstance3 = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance();
                        if (mInstance3 == null) {
                            return;
                        }
                        mInstance3.onActivityResume();
                    } else if (i != 3) {
                        if (i != 4 || (mInstance = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance()) == null) {
                            return;
                        }
                        mInstance.onActivityStop();
                    } else {
                        p mInstance4 = BasementWeexView$lifecycleObserver$2.this.this$0.getMInstance();
                        if (mInstance4 == null) {
                            return;
                        }
                        mInstance4.onActivityPause();
                    }
                }
            }
        };
    }
}
