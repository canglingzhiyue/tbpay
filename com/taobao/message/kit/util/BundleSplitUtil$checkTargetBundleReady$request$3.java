package com.taobao.message.kit.util;

import android.content.DialogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BundleSplitUtil$checkTargetBundleReady$request$3 implements DialogInterface.OnShowListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BundleSplitUtil$checkTargetBundleReady$request$3 INSTANCE = new BundleSplitUtil$checkTargetBundleReady$request$3();

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
        }
    }
}
