package com.alipay.zoloz.hardware.camera.preview;

import android.content.Context;
import android.graphics.Bitmap;
import com.alipay.zoloz.hardware.camera.preview.filter.AvatarBeautyFilter;
import com.alipay.zoloz.hardware.camera.preview.filter.FrameBuffer;
import com.alipay.zoloz.hardware.camera.preview.utils.MatrixUtils;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AvatarBeauty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AvatarBeautyFilter f6238a;
    private int e;
    private int f;
    private float[] c = new float[16];
    private int d = 1;
    private FrameBuffer b = new FrameBuffer();

    public AvatarBeauty(Context context) {
        this.f6238a = new AvatarBeautyFilter(context.getResources());
    }

    public void surfaceCreated(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae89462", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i;
        this.f = i2;
        this.f6238a.create();
        this.b.createBuffer(this.e, this.f);
    }

    public void surfaceChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47496a4e", new Object[]{this});
            return;
        }
        float[] fArr = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        MatrixUtils.getMatrix(fArr, i, i2, i3, i2, i3);
        this.f6238a.setMatrix(this.c);
        this.f6238a.setSize(this.e, this.f);
    }

    public boolean beautifyImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fceec2af", new Object[]{this, bitmap})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.b.bindFrame();
        this.f6238a.setBeautyImage(bitmap);
        this.f6238a.draw();
        this.b.getFBOContent(bitmap);
        this.b.unBindFrame();
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.d("beautifyImage cost time : " + (currentTimeMillis2 - currentTimeMillis));
        return true;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        AvatarBeautyFilter avatarBeautyFilter = this.f6238a;
        if (avatarBeautyFilter != null) {
            avatarBeautyFilter.release();
        }
        FrameBuffer frameBuffer = this.b;
        if (frameBuffer == null) {
            return;
        }
        frameBuffer.release();
    }
}
