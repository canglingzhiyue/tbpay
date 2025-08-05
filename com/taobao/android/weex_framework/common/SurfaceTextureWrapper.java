package com.taobao.android.weex_framework.common;

import android.graphics.SurfaceTexture;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class SurfaceTextureWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean attached;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;

    static {
        kge.a(1192371069);
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }

    public SurfaceTextureWrapper(SurfaceTexture surfaceTexture, Runnable runnable) {
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = runnable;
    }

    public SurfaceTexture surfaceTexture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceTexture) ipChange.ipc$dispatch("78c76774", new Object[]{this}) : this.surfaceTexture;
    }

    public void updateTexImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6464b64", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (!this.released) {
                this.surfaceTexture.updateTexImage();
                if (this.onFrameConsumed != null) {
                    this.onFrameConsumed.run();
                }
            }
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (!this.released) {
                this.surfaceTexture.release();
                this.released = true;
                this.attached = false;
            }
        }
    }

    public void attachToGLContext(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113d5032", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            if (this.released) {
                return;
            }
            if (this.attached) {
                this.surfaceTexture.detachFromGLContext();
            }
            this.surfaceTexture.attachToGLContext(i);
            this.attached = true;
        }
    }

    public void detachFromGLContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2ee5d4", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.attached && !this.released) {
                this.surfaceTexture.detachFromGLContext();
                this.attached = false;
            }
        }
    }

    public void getTransformMatrix(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab63d569", new Object[]{this, fArr});
        } else {
            this.surfaceTexture.getTransformMatrix(fArr);
        }
    }
}
