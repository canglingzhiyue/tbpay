package com.taobao.mediaplay.player;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DoubleReflectionUtils;
import com.taobao.mediaplay.player.g;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class MediaSurfaceView extends SurfaceView implements SurfaceHolder.Callback, g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mBackground;
    private volatile Object mBackgroundControl;
    private g.a mCallback;
    private boolean mIsAvailable;
    private com.taobao.taobaoavsdk.widget.media.b mMeasureHelper;
    private volatile Object mSurfaceControl;
    private final Object mSurfaceControlLock;
    private volatile boolean mSurfaceDestroyed;
    private a mSurfaceHolder;
    private String mTag;

    static {
        kge.a(-1493998542);
        kge.a(1137734266);
        kge.a(632307482);
    }

    public static /* synthetic */ Object ipc$super(MediaSurfaceView mediaSurfaceView, String str, Object... objArr) {
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

    public void releaseSurface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        }
    }

    @Override // com.taobao.mediaplay.player.g
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
        }
    }

    public MediaSurfaceView(Context context) {
        super(context);
        this.mTag = "DWTextureView";
        this.mSurfaceControl = null;
        this.mBackgroundControl = null;
        this.mSurfaceControlLock = new Object();
        this.mSurfaceDestroyed = false;
        this.mBackground = false;
        init();
    }

    public MediaSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTag = "DWTextureView";
        this.mSurfaceControl = null;
        this.mBackgroundControl = null;
        this.mSurfaceControlLock = new Object();
        this.mSurfaceDestroyed = false;
        this.mBackground = false;
        init();
    }

    private void initSurfaceControl() {
        if (Build.VERSION.SDK_INT == 29 || Build.VERSION.SDK_INT == 28) {
            synchronized (this.mSurfaceControlLock) {
                try {
                    Field privateField = DoubleReflectionUtils.getPrivateField(SurfaceView.class, "mBackgroundControl");
                    privateField.setAccessible(true);
                    this.mBackgroundControl = privateField.get(this);
                } catch (Exception e) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=" + Build.VERSION.SDK_INT + " try to get mBackgroundControl with reflect failed!!" + e + "," + com.taobao.taobaoavsdk.util.c.a(e));
                }
                try {
                    if (Build.VERSION.SDK_INT == 29) {
                        this.mSurfaceControl = getSurfaceControl();
                    } else if (Build.VERSION.SDK_INT == 28) {
                        Field privateField2 = DoubleReflectionUtils.getPrivateField(SurfaceView.class, "mSurfaceControl");
                        privateField2.setAccessible(true);
                        this.mSurfaceControl = privateField2.get(this);
                    }
                } catch (Exception e2) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=" + Build.VERSION.SDK_INT + " try to get mSurfaceControl with reflect failed!!" + e2 + "," + com.taobao.taobaoavsdk.util.c.a(e2));
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=" + Build.VERSION.SDK_INT + " MediaSurfaceView initSurfaceControl=" + this.mSurfaceControl + ",mBackgroundControl=" + this.mBackgroundControl);
            }
        }
    }

    public void releaseSurfaceControl() {
        if (Build.VERSION.SDK_INT == 29) {
            synchronized (this.mSurfaceControlLock) {
                if (this.mSurfaceControl instanceof SurfaceControl) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=29 MediaSurfaceView release SurfaceControl=" + this.mSurfaceControl);
                    ((SurfaceControl) this.mSurfaceControl).release();
                    this.mSurfaceControl = null;
                }
                if (this.mBackgroundControl instanceof SurfaceControl) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=29 MediaSurfaceView release mBackgroundControl=" + this.mBackgroundControl);
                    ((SurfaceControl) this.mBackgroundControl).release();
                    this.mBackgroundControl = null;
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=29 MediaSurfaceView releaseSurfaceControl finished.");
            }
        } else if (Build.VERSION.SDK_INT != 28) {
        } else {
            synchronized (this.mSurfaceControlLock) {
                try {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=28 MediaSurfaceView release SurfaceControl=" + this.mSurfaceControl);
                    Method declaredMethod = this.mSurfaceControl.getClass().getDeclaredMethod("release", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.mSurfaceControl, new Object[0]);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=28 MediaSurfaceView release SurfaceControl=" + this.mSurfaceControl);
                    Method declaredMethod2 = this.mBackgroundControl.getClass().getDeclaredMethod("release", new Class[0]);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(this.mBackgroundControl, new Object[0]);
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=28 MediaSurfaceView releaseSurfaceControl finished.");
                } catch (Exception e) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "os_version=" + Build.VERSION.SDK_INT + " try to call release with reflect failed!!" + e + "," + com.taobao.taobaoavsdk.util.c.a(e));
                }
            }
        }
    }

    public boolean getSurfaceDestroyed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("776826ed", new Object[]{this})).booleanValue() : this.mSurfaceDestroyed;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mMeasureHelper = new com.taobao.taobaoavsdk.widget.media.b();
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "SeamlessSwitch MediaTextureView init holder: " + this.mSurfaceHolder);
        getHolder().setFormat(-2);
        getHolder().addCallback(this);
    }

    public void setUseCrop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20df4e58", new Object[]{this, new Boolean(z)});
        } else {
            this.mMeasureHelper.a(z);
        }
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

    @Override // android.view.SurfaceView, android.view.View
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

    @Override // android.view.View
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

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceCreated holder=" + surfaceHolder + ", surface=" + surfaceHolder.getSurface() + ", mCallback=" + this.mCallback);
        this.mIsAvailable = true;
        this.mSurfaceHolder = new a(this, surfaceHolder);
        initSurfaceControl();
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.a(this.mSurfaceHolder, 0, 0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        g.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceChanged holder=" + surfaceHolder + ", format=" + i + ", width=" + i2 + ", height=" + i3 + ", mSurfaceHolder=" + this.mSurfaceHolder + ", mCallback=" + this.mCallback);
        a aVar2 = this.mSurfaceHolder;
        if (aVar2 == null || (aVar = this.mCallback) == null) {
            return;
        }
        aVar.a(aVar2, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceDestroyed 111 holder=" + surfaceHolder + ", mSurfaceHolder=, mCallback" + this.mCallback);
        if (this.mSurfaceHolder == null) {
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceDestroyed 222 holder=" + surfaceHolder + ", surface=" + surfaceHolder.getSurface());
        g.a aVar = this.mCallback;
        if (aVar != null) {
            aVar.a(this.mSurfaceHolder, true);
            this.mSurfaceHolder = null;
        }
        this.mSurfaceDestroyed = true;
    }

    /* loaded from: classes7.dex */
    public static final class a implements g.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MediaSurfaceView f18047a;
        private boolean b;
        private SurfaceHolder c;

        static {
            kge.a(-1463183894);
            kge.a(1466194522);
        }

        public a(MediaSurfaceView mediaSurfaceView, SurfaceHolder surfaceHolder) {
            this.f18047a = mediaSurfaceView;
            this.c = surfaceHolder;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " InternalSurfaceHolder " + this.f18047a + ", " + this.c);
        }

        @Override // com.taobao.mediaplay.player.g.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d9604ca", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer == null) {
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " bindToMediaPlayer " + this.c);
                iMediaPlayer.setDisplay(this.c);
            }
        }

        @Override // com.taobao.mediaplay.player.g.b
        public g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("c2db7136", new Object[]{this}) : this.f18047a;
        }

        @Override // com.taobao.mediaplay.player.g.b
        public Surface b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("256e1759", new Object[]{this});
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " getSurface " + this.c);
            SurfaceHolder surfaceHolder = this.c;
            if (surfaceHolder == null) {
                return null;
            }
            return surfaceHolder.getSurface();
        }

        @Override // com.taobao.mediaplay.player.g.b
        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
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

    @Override // com.taobao.mediaplay.player.g
    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue() : this.mIsAvailable;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.onWindowVisibilityChanged(i);
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaSurfaceView catch onWindowVisibilityChanged error:" + e.toString());
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onWindowVisibilityChanged " + i);
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.g(i);
    }

    @Override // android.view.SurfaceView, android.view.View
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

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "MediaSurfaceView catch onWindowVisibilityChanged error:" + e.toString());
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onDetachedFromWindow ");
        g.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.U();
    }
}
