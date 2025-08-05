package com.alipay.zoloz.hardware.camera.preview.filter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.alipay.zoloz.hardware.camera.preview.utils.EasyGlUtils;
import com.alipay.zoloz.hardware.camera.preview.utils.MatrixUtils;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class CapturingFilter extends AFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] l;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private long r;
    private int s;

    public static /* synthetic */ Object ipc$super(CapturingFilter capturingFilter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -828084277:
                super.draw();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public CapturingFilter(Resources resources) {
        super(resources);
        this.l = new int[1];
        this.n = false;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.j = "CapturingFilter";
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Log.d("CapturingFilter", "onCreate()");
        b("shader/base_vertex.sh", "shader/base_fragment.sh");
        EasyGlUtils.genTexturesWithParameter(1, this.l, 0, 6408, 10, 10);
        this.m = BitmapFactory.decodeResource(this.f, R.drawable.capture_ing);
        this.s = 0;
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void onSizeChanged(int i, int i2) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Log.d("CapturingFilter", "onSizeChanged() : width=" + i + ", height=" + i2);
        int min = Math.min(i, i2);
        this.q = min;
        this.o = (i - min) / 2;
        this.p = (i2 - min) / 2;
        float f3 = 1.0f;
        float f4 = -1.0f;
        if (min > min) {
            float f5 = min;
            f2 = f5 / f5;
            f4 = -f2;
            f = -1.0f;
        } else {
            float f6 = min;
            float f7 = f6 / f6;
            f = -f7;
            f3 = f7;
            f2 = 1.0f;
        }
        this.k[0] = f4;
        this.k[1] = f;
        this.k[2] = f4;
        this.k[3] = f3;
        this.k[4] = f2;
        this.k[5] = f;
        this.k[6] = f2;
        this.k[7] = f3;
        this.g.clear();
        this.g.put(this.k);
        this.g.position(0);
        this.n = false;
        this.r = System.currentTimeMillis();
        this.s++;
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            super.f();
        }
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        float[] matrix = getMatrix();
        long currentTimeMillis = System.currentTimeMillis();
        MatrixUtils.rotate(matrix, -((((float) (currentTimeMillis - this.r)) * 360.0f) / 1500.0f));
        this.r = currentTimeMillis;
        if (this.l[0] == 0) {
            return;
        }
        GLES20.glActiveTexture(getTextureType() + 33984 + 1);
        GLES20.glBindTexture(3553, this.l[0]);
        Bitmap bitmap = this.m;
        if (bitmap != null && !this.n) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            this.n = true;
        }
        setTextureId(this.l[0]);
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void draw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea46fcb", new Object[]{this});
        } else if (this.s >= 2) {
            int i = this.o;
            int i2 = this.p;
            int i3 = this.q;
            GLES20.glViewport(i, i2, i3, i3);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            super.draw();
            GLES20.glDisable(3042);
        } else {
            super.d();
        }
    }
}
