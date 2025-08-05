package com.alipay.zoloz.toyger.face;

import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.Toyger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class ToygerRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ToygerAttr attr;
    public TGDepthFrame depthFrame;
    public List<TGFrame> frames;

    public ToygerRunnable(List<TGFrame> list, TGDepthFrame tGDepthFrame, ToygerAttr toygerAttr) {
        this.frames = list;
        this.depthFrame = tGDepthFrame;
        this.attr = toygerAttr;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Toyger.processImage(this.frames, this.depthFrame, this.attr);
        ToygerLog.i("TOYGER_FLOW_RUNNABLE", "ToygerRunnable.processing_image from init->process total time:" + (System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
