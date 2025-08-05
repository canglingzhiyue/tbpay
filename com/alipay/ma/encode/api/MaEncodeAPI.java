package com.alipay.ma.encode.api;

import android.graphics.Bitmap;
import com.alipay.ma.MaLogger;
import com.alipay.ma.encode.InputParameters.MaEncodeInputParameters;
import com.alipay.ma.encode.MaGenerator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MaEncodeAPI {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Bitmap encodeMa2(MaEncodeInputParameters maEncodeInputParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5c896622", new Object[]{maEncodeInputParameters});
        }
        MaLogger.v("MaEncodeAPI", "encodeMa2");
        return MaGenerator.facade(maEncodeInputParameters);
    }
}
