package com.alipay.android.app.safepaybase.alikeyboard;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface OnKeyboardListener {
    void onClose();

    void onDel();

    void onInput(String str);

    void onOK();
}
