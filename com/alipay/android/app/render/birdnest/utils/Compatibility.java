package com.alipay.android.app.render.birdnest.utils;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public final class Compatibility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void adapter(FBContext fBContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d34cce8", new Object[]{fBContext});
            return;
        }
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            String str = Build.VERSION.RELEASE;
            boolean z2 = lowerCase.equals("samsung") && Build.MODEL.equals("GT-N7100") && !StringUtils.equals(str, "4.4.2") && !StringUtils.equals(str, "4.4.4");
            boolean equals = Build.MODEL.equals("K-Touch E806");
            if (Build.MODEL.equals("SM-G9350") && StringUtils.equals(str, "6.0.1")) {
                z = true;
            }
            View contentView = fBContext.getContentView();
            if (contentView == null) {
                return;
            }
            if (!contentView.isHardwareAccelerated() && !z2 && !equals && !z && !fBContext.isFullscreen()) {
                contentView.setLayerType(2, null);
            }
            if (!z2 && !equals && !z) {
                contentView.setAlpha(fBContext.getBodyOpacity());
                return;
            }
            contentView.setAlpha(1.0f);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
    }
}
