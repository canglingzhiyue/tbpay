package com.taobao.taobaoavsdk.widget.media;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.widget.media.a;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class SurfaceRenderView extends SurfaceView implements SurfaceHolder.Callback, com.taobao.taobaoavsdk.widget.media.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private a.InterfaceC0888a mCallback;
    private b mMeasureHelper;

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    static {
        kge.a(8649117);
        kge.a(1164492313);
        kge.a(632307482);
        TAG = SurfaceRenderView.class.getSimpleName();
    }

    public SurfaceRenderView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mMeasureHelper = new b();
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

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setVideoSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            this.mMeasureHelper.a(i, i2);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setVideoSize ");
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
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setVideoSampleAspectRatio ");
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
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setVideoRotation " + i);
        setRotation((float) i);
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void setAspectRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMeasureHelper.c(i);
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " setAspectRatio " + i);
        requestLayout();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mMeasureHelper.c(i, i2);
        setMeasuredDimension(this.mMeasureHelper.b(), this.mMeasureHelper.c());
    }

    @Override // com.taobao.taobaoavsdk.widget.media.a
    public void addRenderCallback(a.InterfaceC0888a interfaceC0888a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f48e4b", new Object[]{this, interfaceC0888a});
        } else {
            this.mCallback = interfaceC0888a;
        }
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

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceCreated");
        a aVar = new a(this, surfaceHolder);
        a.InterfaceC0888a interfaceC0888a = this.mCallback;
        if (interfaceC0888a == null) {
            return;
        }
        interfaceC0888a.a(aVar, 0, 0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceChanged holder=" + surfaceHolder + ", format=" + i + ", width=" + i2 + ", height=" + i3);
        a aVar = new a(this, surfaceHolder);
        a.InterfaceC0888a interfaceC0888a = this.mCallback;
        if (interfaceC0888a == null) {
            return;
        }
        interfaceC0888a.a(aVar, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            return;
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " surfaceDestroyed");
        a aVar = new a(this, surfaceHolder);
        a.InterfaceC0888a interfaceC0888a = this.mCallback;
        if (interfaceC0888a == null) {
            return;
        }
        interfaceC0888a.a(aVar, true);
    }

    /* loaded from: classes8.dex */
    public static final class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private SurfaceRenderView f21349a;
        private SurfaceHolder b;

        static {
            kge.a(1464301845);
            kge.a(-932872997);
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public Surface b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Surface) ipChange.ipc$dispatch("256e1759", new Object[]{this});
            }
            return null;
        }

        public a(SurfaceRenderView surfaceRenderView, SurfaceHolder surfaceHolder) {
            this.f21349a = surfaceRenderView;
            this.b = surfaceHolder;
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public void a(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d9604ca", new Object[]{this, iMediaPlayer});
            } else if (iMediaPlayer == null) {
            } else {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, this + " bindToMediaPlayer " + iMediaPlayer + ", " + this.f21349a);
                iMediaPlayer.setDisplay(this.b);
            }
        }

        @Override // com.taobao.taobaoavsdk.widget.media.a.b
        public com.taobao.taobaoavsdk.widget.media.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taobaoavsdk.widget.media.a) ipChange.ipc$dispatch("26042a3", new Object[]{this}) : this.f21349a;
        }
    }
}
