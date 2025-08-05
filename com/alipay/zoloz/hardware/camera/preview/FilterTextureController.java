package com.alipay.zoloz.hardware.camera.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.widget.ImageView;
import com.alipay.zoloz.hardware.camera.ICameraInterface;
import com.alipay.zoloz.hardware.camera.abs.AbsCamera;
import com.alipay.zoloz.hardware.camera.preview.filter.CapturingFilter;
import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class FilterTextureController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6244a;
    private CameraTextureRender b = new CameraTextureRender();
    private FaceRegion c;
    private AvatarBeauty d;
    private PromptMaskDrawer e;
    private CapturingFilter f;
    private int g;
    private int h;
    private Rect i;
    private int j;
    private int k;
    private ImageView.ScaleType l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public void setDrawCapturing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32904f0", new Object[]{this, new Boolean(z)});
            return;
        }
        Log.d(CameraTextureRender.TAG, "drawCapturing=" + z);
        this.m = z;
    }

    public FilterTextureController(Context context, ImageView.ScaleType scaleType, boolean z, boolean z2, boolean z3, boolean z4) {
        this.m = false;
        this.n = false;
        this.f6244a = context;
        this.l = scaleType;
        this.m = z;
        this.n = z2;
        this.p = z3;
        this.o = z4;
        this.d = new AvatarBeauty(context);
        this.f = new CapturingFilter(this.f6244a.getResources());
    }

    public void setRenderLayers(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288f49e4", new Object[]{this, map});
        } else if (!this.p || map == null || map.isEmpty() || this.c == null || this.i == null) {
        } else {
            this.c.update((List) map.get(ICameraInterface.KEY_FACE_REGIONS), this.i, this.g, this.h, this.j, this.k);
        }
    }

    public Rect surfaceCreated(boolean z, AbsCamera.PreviewTexture previewTexture, Rect rect, int i, int i2, int i3, int i4, int i5, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("fac8587e", new Object[]{this, new Boolean(z), previewTexture, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Float(f), new Float(f2)});
        }
        Rect create = this.b.create(z, previewTexture, rect, i, i2, i3, i4, i5, f, f2);
        this.d.surfaceCreated(i, i2);
        this.c = new FaceRegion(this.f6244a);
        this.e = new PromptMaskDrawer(f, f2);
        this.f.create();
        this.g = i;
        this.h = i2;
        this.i = create;
        this.j = i3;
        this.k = i4;
        this.d.surfaceChanged();
        if (this.k > this.j) {
            this.f.onSizeChanged(i3, i4);
        }
        return create;
    }

    public void drawFrame(boolean z) {
        FaceRegion faceRegion;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5773644", new Object[]{this, new Boolean(z)});
            return;
        }
        GLES20.glViewport(0, 0, this.j, this.k);
        this.b.setMirror(z);
        this.b.draw();
        if (this.p && (faceRegion = this.c) != null) {
            faceRegion.draw();
        }
        if (this.m && this.k > this.j) {
            this.f.draw();
        }
        if (!this.n) {
            return;
        }
        this.e.draw();
    }

    public SurfaceTexture getSurfaceTexture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTexture) ipChange.ipc$dispatch("c7ae716a", new Object[]{this}) : this.b.getSurfaceTexture();
    }

    public boolean beautifyImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fceec2af", new Object[]{this, bitmap})).booleanValue();
        }
        AvatarBeauty avatarBeauty = this.d;
        if (avatarBeauty == null) {
            return false;
        }
        return avatarBeauty.beautifyImage(bitmap);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        FaceRegion faceRegion = this.c;
        if (faceRegion != null) {
            faceRegion.release();
        }
        PromptMaskDrawer promptMaskDrawer = this.e;
        if (promptMaskDrawer != null) {
            promptMaskDrawer.release();
        }
        AvatarBeauty avatarBeauty = this.d;
        if (avatarBeauty != null) {
            avatarBeauty.release();
        }
        CapturingFilter capturingFilter = this.f;
        if (capturingFilter == null) {
            return;
        }
        capturingFilter.release();
    }
}
