package com.taobao.message.kit.util;

import com.alibaba.android.split.core.tasks.e;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "sessionId", "", "kotlin.jvm.PlatformType", "onSuccess", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BundleSplitUtil$checkMsgBundleReady$task$1<TResult> implements e<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BundleSplitUtil$checkMsgBundleReady$task$1 INSTANCE = new BundleSplitUtil$checkMsgBundleReady$task$1();

    @Override // com.alibaba.android.split.core.tasks.e
    public final void onSuccess(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
        }
    }
}
