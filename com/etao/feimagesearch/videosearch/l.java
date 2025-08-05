package com.etao.feimagesearch.videosearch;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public final class l implements TextureView.SurfaceTextureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f7065a;
    private final g b;

    static {
        kge.a(-669606305);
        kge.a(714349968);
    }

    public l(TextureView.SurfaceTextureListener surfaceTextureListener, g gVar) {
        this.f7065a = surfaceTextureListener;
        this.b = gVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surface, new Integer(i), new Integer(i2)});
            return;
        }
        kotlin.jvm.internal.q.c(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f7065a;
        if (surfaceTextureListener == null) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureSizeChanged(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surface});
            return;
        }
        kotlin.jvm.internal.q.c(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f7065a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surface);
        }
        g gVar = this.b;
        if (gVar == null) {
            return;
        }
        gVar.b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surface})).booleanValue();
        }
        kotlin.jvm.internal.q.c(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f7065a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surface);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbd3ac", new Object[]{this, surface, new Integer(i), new Integer(i2)});
            return;
        }
        kotlin.jvm.internal.q.c(surface, "surface");
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f7065a;
        if (surfaceTextureListener == null) {
            return;
        }
        surfaceTextureListener.onSurfaceTextureAvailable(surface, i, i2);
    }
}
