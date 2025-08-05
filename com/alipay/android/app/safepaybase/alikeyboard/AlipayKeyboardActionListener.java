package com.alipay.android.app.safepaybase.alikeyboard;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public abstract class AlipayKeyboardActionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void onDel();

    public abstract void onInput(String str);

    public abstract void onOk();
}
