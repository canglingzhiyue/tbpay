package com.taobao.mediaplay.player;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.g;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.Field;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class MediaTextureView extends TextureView implements TextureView.SurfaceTextureListener, g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mBackground;
    private g.a mCallback;
    private boolean mEnableStaySurfaceTexture;
    private com.taobao.taobaoavsdk.widget.media.b mMeasureHelper;
    private a mSurfaceHolder;
    private String mTag;

    static {
        kge.a(1522623904);
        kge.a(1137734266);
        kge.a(714349968);
    }

    public static /* synthetic */ Object ipc$super(MediaTextureView mediaTextureView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    public MediaTextureView(Context context) {
        super(context);
        this.mTag = "DWTextureView";
        this.mEnableStaySurfaceTexture = true;
        this.mBackground = false;
        init();
    }

    public MediaTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTag = "DWTextureView";
        this.mEnableStaySurfaceTexture = true;
        this.mBackground = false;
        init();
    }

    public MediaTextureView(Context context, AttributeSet attributeSet, int i, com.taobao.taobaoavsdk.widget.media.b bVar) {
        super(context, attributeSet, i);
        this.mTag = "DWTextureView";
        this.mEnableStaySurfaceTexture = true;
        this.mBackground = false;
        init();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mMeasureHelper = new com.taobao.taobaoavsdk.widget.media.b();
        this.mSurfaceHolder = new a(this);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch MediaTextureView init holder: " + this.mSurfaceHolder);
        setSurfaceTextureListener(this);
    }

    public boolean isBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue() : this.mBackground;
    }

    @Override // com.taobao.mediaplay.player.g
    public void setBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a7e1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mBackground = z;
        a aVar = this.mSurfaceHolder;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.taobaoavsdk.widget.media.b bVar = this.mMeasureHelper;
        if (bVar == null) {
            return;
        }
        bVar.c(i, i2);
        setMeasuredDimension(this.mMeasureHelper.b(), this.mMeasureHelper.c());
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (Build.VERSION.SDK_INT >= 24 || drawable == null) {
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.mMeasureHelper.a(i, i2);
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public void setVideoSampleAspectRatio(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886d77", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.mMeasureHelper.b(i, i2);
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.a(i);
        setRotation(i);
    }

    @Override // com.taobao.mediaplay.player.g
    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.c(i);
        requestLayout();
    }

    public int getAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b371757", new Object[]{this})).intValue() : this.mMeasureHelper.a();
    }

    /* loaded from: classes7.dex */
    public static final class a implements g.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MediaTextureView f18048a;
        private SurfaceTexture b;
        private Surface c;
        private boolean d;

        static {
            kge.a(-2130661160);
            kge.a(1466194522);
        }

        public static /* synthetic */ SurfaceTexture a(a aVar, SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SurfaceTexture) ipChange.ipc$dispatch("3070c234", new Object[]{aVar, surfaceTexture});
            }
            aVar.b = surfaceTexture;
            return surfaceTexture;
        }

        public static /* synthetic */ Surface a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("9be7e648", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Surface a(a aVar, Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("33bd777c", new Object[]{aVar, surface});
            }
            aVar.c = surface;
            return surface;
        }

        public static /* synthetic */ SurfaceTexture b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SurfaceTexture) ipChange.ipc$dispatch("708b0d5a", new Object[]{aVar}) : aVar.b;
        }

        public a(MediaTextureView mediaTextureView) {
            this.f18048a = mediaTextureView;
        }

        @Override // com.taobao.mediaplay.player.g.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d9604ca", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer == null) {
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " bindToMediaPlayer mSurfaceHolder: " + this.c);
                iMediaPlayer.setSurface(this.c);
            }
        }

        @Override // com.taobao.mediaplay.player.g.b
        public g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c2db7136", new Object[]{this}) : this.f18048a;
        }

        @Override // com.taobao.mediaplay.player.g.b
        public Surface b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("256e1759", new Object[]{this}) : this.c;
        }

        @Override // com.taobao.mediaplay.player.g.b
        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public void addRenderCallback(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c2b35e", new Object[]{this, aVar});
        } else {
            this.mCallback = aVar;
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public void removeRenderCallback(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797fb69b", new Object[]{this, aVar});
        } else {
            this.mCallback = null;
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public float getDisplayAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0487f5e", new Object[]{this})).floatValue() : this.mMeasureHelper.d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable " + surfaceTexture + ", " + i + ", " + i2 + ", background: " + this.mBackground);
        a.a(this.mSurfaceHolder, Build.VERSION.SDK_INT < k.A ? new Surface(surfaceTexture) : a.a(this.mSurfaceHolder));
        if (a.b(this.mSurfaceHolder) != null && Build.VERSION.SDK_INT >= k.A) {
            try {
                setSurfaceTexture(a.b(this.mSurfaceHolder));
            } catch (Exception unused) {
            }
            if (Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22) {
                try {
                    Field declaredField = getClass().getSuperclass().getDeclaredField("mUpdateListener");
                    declaredField.setAccessible(true);
                    a.b(this.mSurfaceHolder).setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) declaredField.get(this));
                } catch (Throwable th) {
                    AVSDKLog.e("", "setOnFrameAvailableListener error" + th.getMessage());
                }
            }
        }
        if (a.a(this.mSurfaceHolder) == null) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable new " + surfaceTexture + ", " + i + ", " + i2 + ", background: " + this.mBackground);
            a.a(this.mSurfaceHolder, new Surface(surfaceTexture));
            a.a(this.mSurfaceHolder, surfaceTexture);
        } else if (!this.mEnableStaySurfaceTexture && a.b(this.mSurfaceHolder) != surfaceTexture) {
            a.a(this.mSurfaceHolder, new Surface(surfaceTexture));
            a.a(this.mSurfaceHolder, surfaceTexture);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable re-create " + surfaceTexture + ", " + i + ", " + i2 + ", background: " + this.mBackground);
        }
        g.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.a(this.mSurfaceHolder, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureSizeChanged " + i + ", " + i2);
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.a(this.mSurfaceHolder, 0, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureDestroyed " + surfaceTexture + ", mEnableStaySurfaceTexture=" + this.mEnableStaySurfaceTexture);
        if (this.mEnableStaySurfaceTexture && Build.VERSION.SDK_INT >= k.A) {
            z = false;
        }
        g.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.a(this.mSurfaceHolder, z);
        }
        if (Build.VERSION.SDK_INT < k.A) {
            if (a.a(this.mSurfaceHolder) != null) {
                a.a(this.mSurfaceHolder).release();
            }
            a.a(this.mSurfaceHolder, (Surface) null);
        }
        return z;
    }

    public void setStaySurfaceTexture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed245e64", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableStaySurfaceTexture = z;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
            return;
        }
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.a(this.mSurfaceHolder);
    }

    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < k.A) {
        } else {
            try {
                if (this.mSurfaceHolder == null || a.a(this.mSurfaceHolder) == null) {
                    return;
                }
                a.a(this.mSurfaceHolder).release();
                a.a(this.mSurfaceHolder, (Surface) null);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onWindowVisibilityChanged " + i);
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.g(i);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onAttachedToWindow ");
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.T();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        if (!isMainThread()) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "mediaTextureView onDetachedFromWindow at subThread, stackTrace" + com.taobao.taobaoavsdk.util.c.a(new Exception()));
        }
        super.onDetachedFromWindow();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onDetachedFromWindow ");
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.U();
    }

    private boolean isMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
