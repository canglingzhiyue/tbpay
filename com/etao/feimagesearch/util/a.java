package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-815469352);
    }

    public static AliNNImageProcess.a a(float[] fArr, float[] fArr2, AliNNImageProcess.Format format) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNImageProcess.a) ipChange.ipc$dispatch("8b3ea346", new Object[]{fArr, fArr2, format});
        }
        AliNNImageProcess.a aVar = new AliNNImageProcess.a();
        aVar.c = format;
        aVar.d = AliNNImageProcess.Format.RGB;
        aVar.f9017a = fArr;
        aVar.b = fArr2;
        return aVar;
    }

    public static AliNNImageProcess.a a(float[] fArr, float[] fArr2, AliNNImageProcess.Format format, AliNNImageProcess.Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNImageProcess.a) ipChange.ipc$dispatch("70ae7df6", new Object[]{fArr, fArr2, format, filter});
        }
        AliNNImageProcess.a aVar = new AliNNImageProcess.a();
        aVar.c = format;
        aVar.d = AliNNImageProcess.Format.RGB;
        aVar.f9017a = fArr;
        aVar.b = fArr2;
        aVar.e = filter;
        return aVar;
    }
}
