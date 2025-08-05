package com.taobao.taobaoavsdk.widget.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.a;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class TextureRenderView extends TextureView implements TextureView.SurfaceTextureListener, com.taobao.taobaoavsdk.widget.media.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    private a.InterfaceC0888a mCallback;
    private boolean mEnableStaySurfaceTexture;
    private int mHeight;
    private boolean mIsFormatChanged;
    private b mMeasureHelper;
    private a mSurfaceHolder;
    private SurfaceTexture mSurfaceTexture;
    private int mWidth;

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
        }
    }

    public static /* synthetic */ boolean access$000(TextureRenderView textureRenderView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4f36543", new Object[]{textureRenderView})).booleanValue() : textureRenderView.mEnableStaySurfaceTexture;
    }

    static {
        kge.a(-1023758197);
        kge.a(1164492313);
        kge.a(714349968);
        TAG = "TextureRenderView";
    }

    public TextureRenderView(Context context) {
        super(context);
        this.mEnableStaySurfaceTexture = true;
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnableStaySurfaceTexture = true;
        initView(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEnableStaySurfaceTexture = true;
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mMeasureHelper = new b();
        setSurfaceTextureListener(this);
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.mMeasureHelper.a(i, i2);
            requestLayout();
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSampleAspectRatio(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886d77", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.mMeasureHelper.b(i, i2);
            requestLayout();
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoRotation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.a(i);
        setRotation(i);
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.c(i);
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mMeasureHelper.c(i, i2);
        setMeasuredDimension(this.mMeasureHelper.b(), this.mMeasureHelper.c());
    }

    /* loaded from: classes8.dex */
    public static final class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private TextureRenderView f21363a;
        private SurfaceTexture b;
        private Surface c;

        static {
            kge.a(2051942787);
            kge.a(-932872997);
        }

        public static /* synthetic */ Surface a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("691f271", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Surface a(a aVar, Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("18080ee5", new Object[]{aVar, surface});
            }
            aVar.c = surface;
            return surface;
        }

        public a(TextureRenderView textureRenderView, SurfaceTexture surfaceTexture) {
            this.f21363a = textureRenderView;
            this.b = surfaceTexture;
        }

        public void a(SurfaceTexture surfaceTexture) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91c82ee7", new Object[]{this, surfaceTexture});
                return;
            }
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " InternalSurfaceHolder setSurfaceTexture " + surfaceTexture);
            this.b = surfaceTexture;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d9604ca", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer == null) {
            } else {
                if (this.b == null) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " InternalSurfaceHolder bindToMediaPlayer null and return");
                    iMediaPlayer.setSurface(null);
                    return;
                }
                if (this.c == null || Build.VERSION.SDK_INT < TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE) {
                    this.c = new Surface(this.b);
                } else if (!TextureRenderView.access$000(this.f21363a)) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " InternalSurfaceHolder bindToMediaPlayer " + this.b);
                    this.c = new Surface(this.b);
                }
                iMediaPlayer.setSurface(this.c);
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public com.taobao.taobaoavsdk.widget.media.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taobaoavsdk.widget.media.a) ipChange.ipc$dispatch("26042a3", new Object[]{this}) : this.f21363a;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public Surface b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("256e1759", new Object[]{this}) : this.c;
        }
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void addRenderCallback(a.InterfaceC0888a interfaceC0888a) {
        SurfaceTexture surfaceTexture;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f48e4b", new Object[]{this, interfaceC0888a});
            return;
        }
        this.mCallback = interfaceC0888a;
        if (this.mSurfaceHolder == null && (surfaceTexture = this.mSurfaceTexture) != null) {
            this.mSurfaceHolder = new a(this, surfaceTexture);
            interfaceC0888a.a(this.mSurfaceHolder, this.mWidth, this.mHeight);
        }
        if (!this.mIsFormatChanged) {
            return;
        }
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = new a(this, this.mSurfaceTexture);
        }
        interfaceC0888a.a(this.mSurfaceHolder, 0, this.mWidth, this.mHeight);
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void removeRenderCallback(a.InterfaceC0888a interfaceC0888a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f4d0488", new Object[]{this, interfaceC0888a});
        } else {
            this.mCallback = null;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbd3ac", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " onSurfaceTextureAvailable " + surfaceTexture + ", w=" + i + ", h=" + i2);
        if (Build.VERSION.SDK_INT >= TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE && this.mEnableStaySurfaceTexture) {
            SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
            if (surfaceTexture2 != null) {
                setSurfaceTexture(surfaceTexture2);
            }
            if (this.mSurfaceTexture == null) {
                this.mSurfaceTexture = surfaceTexture;
            }
        } else {
            this.mSurfaceTexture = surfaceTexture;
        }
        this.mIsFormatChanged = false;
        this.mWidth = 0;
        this.mHeight = 0;
        a aVar = this.mSurfaceHolder;
        if (aVar == null) {
            this.mSurfaceHolder = new a(this, this.mSurfaceTexture);
        } else {
            aVar.a(this.mSurfaceTexture);
        }
        a.InterfaceC0888a interfaceC0888a = this.mCallback;
        if (interfaceC0888a == null) {
            return;
        }
        interfaceC0888a.a(this.mSurfaceHolder, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsFormatChanged = true;
        this.mWidth = i;
        this.mHeight = i2;
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = new a(this, surfaceTexture);
        }
        a.InterfaceC0888a interfaceC0888a = this.mCallback;
        if (interfaceC0888a == null) {
            return;
        }
        interfaceC0888a.a(this.mSurfaceHolder, 0, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
        }
        this.mIsFormatChanged = false;
        this.mWidth = 0;
        this.mHeight = 0;
        if (this.mEnableStaySurfaceTexture && Build.VERSION.SDK_INT >= TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE) {
            z = false;
        }
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = new a(this, surfaceTexture);
        }
        a.InterfaceC0888a interfaceC0888a = this.mCallback;
        if (interfaceC0888a != null) {
            interfaceC0888a.a(this.mSurfaceHolder, z);
        }
        return z;
    }

    public void releaseSurface() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbca582d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < TaoLiveVideoView.SDK_INT_FOR_OPTIMIZE || (aVar = this.mSurfaceHolder) == null || a.a(aVar) == null) {
        } else {
            a.a(this.mSurfaceHolder).release();
            a.a(this.mSurfaceHolder, null);
        }
    }
}
