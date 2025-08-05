package com.alipay.android.app.smartpays.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class DismissCatchDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DismissCatchDialog(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DismissCatchDialog dismissCatchDialog, String str, Object... objArr) {
        if (str.hashCode() == -1373052399) {
            super.dismiss();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        try {
            super.dismiss();
        } catch (IllegalArgumentException e) {
            LogUtils.printExceptionStackTrace(e);
        }
    }
}
