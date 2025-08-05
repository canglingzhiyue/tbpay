package com.alipay.zoloz.toyger.face;

import android.content.Context;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class FaceDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract ToygerFaceAttr detect(TGFrame tGFrame);

    public abstract boolean init(Context context);

    public abstract void release();

    public abstract void reset();
}
