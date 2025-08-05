package com.taobao.android.order.core.dinamicX.view.barcode;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public final class c implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1503635980);
        kge.a(1322448450);
    }

    @Override // com.taobao.android.order.core.dinamicX.view.barcode.e
    public a a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5e68b0fd", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (barcodeFormat != BarcodeFormat.CODE_128) {
            throw new IllegalArgumentException("No encoder available for format " + barcodeFormat);
        }
        return new Code128Writer().a(str, barcodeFormat, i, i2, map);
    }
}
