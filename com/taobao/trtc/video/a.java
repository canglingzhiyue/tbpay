package com.taobao.trtc.video;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.video.d;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private EglBase b;
    private GlRectDrawer c;

    /* renamed from: a  reason: collision with root package name */
    private final String f23194a = "TrtcDummySurfaceRender";
    private d d = null;

    static {
        kge.a(-456015125);
    }

    public static /* synthetic */ d a(a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("85749d55", new Object[]{aVar, dVar});
        }
        aVar.d = dVar;
        return dVar;
    }

    public static /* synthetic */ EglBase a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EglBase) ipChange.ipc$dispatch("39285886", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ EglBase a(a aVar, EglBase eglBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EglBase) ipChange.ipc$dispatch("9cc1525b", new Object[]{aVar, eglBase});
        }
        aVar.b = eglBase;
        return eglBase;
    }

    public static /* synthetic */ GlRectDrawer a(a aVar, GlRectDrawer glRectDrawer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GlRectDrawer) ipChange.ipc$dispatch("3a091c35", new Object[]{aVar, glRectDrawer});
        }
        aVar.c = glRectDrawer;
        return glRectDrawer;
    }

    public static /* synthetic */ GlRectDrawer b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GlRectDrawer) ipChange.ipc$dispatch("d5879c3a", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ d c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("1c406569", new Object[]{aVar}) : aVar.d;
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            com.taobao.artc.utils.a.c(runnable);
        }
    }

    public void a(final EglBase.Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631e4468", new Object[]{this, context});
        } else {
            a(new Runnable() { // from class: com.taobao.trtc.video.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this, EglBase.StaticMethod.create(context, EglBase.CONFIG_RECORDABLE));
                    a.a(a.this, new GlRectDrawer());
                }
            });
        }
    }

    public int a(final int i, final int i2, final int i3, final boolean z, final float[] fArr, d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50052db1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), fArr, bVar})).intValue();
        }
        if (this.d == null) {
            HandlerThread handlerThread = new HandlerThread("handler");
            handlerThread.start();
            this.d = new d(i, i2, null, new Handler(handlerThread.getLooper()));
            this.b.createSurface(this.d.a());
        }
        this.d.a(bVar);
        a(new Runnable() { // from class: com.taobao.trtc.video.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this).makeCurrent();
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                if (!z) {
                    GlRectDrawer b = a.b(a.this);
                    int i4 = i3;
                    float[] fArr2 = fArr;
                    int i5 = i;
                    int i6 = i2;
                    b.drawRgb(i4, fArr2, i5, i6, 0, 0, i5, i6);
                } else {
                    GlRectDrawer b2 = a.b(a.this);
                    int i7 = i3;
                    float[] fArr3 = fArr;
                    int i8 = i;
                    int i9 = i2;
                    b2.drawOes(i7, fArr3, i8, i9, 0, 0, i8, i9);
                }
                a.a(a.this).swapBuffers();
            }
        });
        return 0;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(new Runnable() { // from class: com.taobao.trtc.video.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (a.c(a.this) != null) {
                        a.c(a.this).b();
                        a.a(a.this, (d) null);
                    }
                    if (a.b(a.this) != null) {
                        a.b(a.this).release();
                        a.a(a.this, (GlRectDrawer) null);
                    }
                    if (a.a(a.this) == null) {
                        return;
                    }
                    a.a(a.this).release();
                    a.a(a.this, (EglBase) null);
                }
            });
        }
    }
}
