package com.taobao.artc.video;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcLog;
import org.webrtc.SurfaceTextureHelper;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f16386a = "CameraProxy";
    private SurfaceTextureHelper b = null;
    private NativeWindow c = null;
    private InterfaceC0632a d = null;
    private boolean e = false;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    /* renamed from: com.taobao.artc.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0632a {
        void onTextureReady(int i, int i2, int i3, int i4, float[] fArr, long j);
    }

    static {
        kge.a(64935577);
        kge.a(-2096193541);
    }

    public void a(SurfaceTextureHelper surfaceTextureHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bada4c6", new Object[]{this, surfaceTextureHelper});
            return;
        }
        ArtcLog.i("CameraProxy", "init, stHelper:", this.b);
        if (this.b != null) {
            return;
        }
        this.b = surfaceTextureHelper;
        this.b.startListening(this);
        this.c = new NativeWindow(new Surface(this.b.getSurfaceTexture()));
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.c == null) {
        } else {
            ArtcLog.i("CameraProxy", "config, width:", Integer.valueOf(i), ", height:", Integer.valueOf(i2), ", format:", Integer.valueOf(i3));
            this.c.a(i, i2, i3);
            this.e = true;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(InterfaceC0632a interfaceC0632a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcc50b", new Object[]{this, interfaceC0632a});
        } else {
            this.d = interfaceC0632a;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArtcLog.i("CameraProxy", "uninit", new Object[0]);
        NativeWindow nativeWindow = this.c;
        if (nativeWindow != null) {
            nativeWindow.close();
            this.c = null;
            this.e = false;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        if (surfaceTextureHelper == null) {
            return;
        }
        surfaceTextureHelper.stopListening();
    }

    public void a(byte[] bArr, int i, int i2, int i3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8baa6430", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)});
            return;
        }
        NativeWindow nativeWindow = this.c;
        if (nativeWindow == null) {
            return;
        }
        nativeWindow.a(bArr);
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    @Override // org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c74fcb5", new Object[]{this, new Integer(i), fArr, new Long(j)});
            return;
        }
        InterfaceC0632a interfaceC0632a = this.d;
        if (interfaceC0632a != null) {
            interfaceC0632a.onTextureReady(i, this.f, this.g, this.h, fArr, j);
        } else {
            this.b.returnTextureFrame();
        }
    }
}
