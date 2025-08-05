package com.alipay.android.app.smartpays.widget.dialog;

import android.app.Activity;
import android.content.Context;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface IHardwarePayDialog {
    void dismiss(int i);

    void dismiss(Context context);

    boolean isShown();

    void setAllButtonsGone();

    void setResourceLoader(IResourceLoader iResourceLoader);

    void showAnimation();

    void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener);

    void updateMsg(String str, int i, int i2);
}
