package com.alipay.zoloz.hardware.camera.preview.filter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.alipay.zoloz.hardware.camera.preview.utils.EasyGlUtils;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes3.dex */
public class AvatarBeautyFilter extends AFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] l;
    private Bitmap m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public static /* synthetic */ Object ipc$super(AvatarBeautyFilter avatarBeautyFilter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 94685804) {
            super.e();
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    public AvatarBeautyFilter(Resources resources) {
        super(resources);
        this.l = new int[1];
        this.r = false;
        this.j = "IconBeautyFilter";
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b("shader/beauty_avatar.vert", "shader/beauty_avatar.frag");
        EasyGlUtils.genTexturesWithParameter(1, this.l, 0, 6408, 10, 10);
    }

    public void setBeautyImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a155f4e", new Object[]{this, str});
            return;
        }
        try {
            this.m = BitmapFactory.decodeStream(this.f.getAssets().open(str));
            this.r = false;
        } catch (IOException e) {
            Log.w("AvatarBeauty", e);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        float f = ((this.n * 2.0f) / this.p) - 1.0f;
        float f2 = 1.0f - ((this.o / this.q) * 2.0f);
        this.k[0] = -1.0f;
        this.k[1] = f2;
        this.k[2] = -1.0f;
        this.k[3] = 1.0f;
        this.k[4] = f;
        this.k[5] = f2;
        this.k[6] = f;
        this.k[7] = 1.0f;
        this.g.clear();
        this.g.put(this.k);
        this.g.position(0);
    }

    public void setBeautyImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e67682a", new Object[]{this, bitmap});
            return;
        }
        this.m = bitmap;
        this.n = bitmap.getWidth();
        this.o = bitmap.getHeight();
        if (this.q != this.o || this.p != this.n) {
            g();
        }
        this.r = false;
    }

    @Override // com.alipay.zoloz.hardware.camera.preview.filter.AFilter
    public void onSizeChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.p = i;
        this.q = i2;
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
        if (this.l[0] == 0) {
            return;
        }
        GLES20.glActiveTexture(getTextureType() + 33984 + 1);
        GLES20.glBindTexture(3553, this.l[0]);
        Bitmap bitmap = this.m;
        if (bitmap != null && !this.r) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            this.r = true;
        }
        setTextureId(this.l[0]);
    }
}
