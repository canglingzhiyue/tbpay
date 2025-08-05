package com.taobao.weex;

import android.os.Build;
import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f23511a;
    private final Choreographer b;
    private final Choreographer.FrameCallback c;
    private final Runnable d;

    /* loaded from: classes9.dex */
    public interface a {
        void OnVSync();
    }

    static {
        kge.a(2105695596);
    }

    public static /* synthetic */ WeakReference a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("69965313", new Object[]{oVar}) : oVar.f23511a;
    }

    public static /* synthetic */ Choreographer.FrameCallback b(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Choreographer.FrameCallback) ipChange.ipc$dispatch("4666fb94", new Object[]{oVar}) : oVar.c;
    }

    public static /* synthetic */ Choreographer c(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Choreographer) ipChange.ipc$dispatch("3a83d2e3", new Object[]{oVar}) : oVar.b;
    }

    public static /* synthetic */ Runnable d(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("e4ff9f2", new Object[]{oVar}) : oVar.d;
    }

    public o(a aVar) {
        this.f23511a = new WeakReference<>(aVar);
        if (Build.VERSION.SDK_INT > 15) {
            this.b = Choreographer.getInstance();
            this.c = new Choreographer.FrameCallback() { // from class: com.taobao.weex.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    a aVar2;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    } else if (o.a(o.this) == null || (aVar2 = (a) o.a(o.this).get()) == null) {
                    } else {
                        try {
                            aVar2.OnVSync();
                            o.c(o.this).postFrameCallback(o.b(o.this));
                        } catch (UnsatisfiedLinkError e) {
                            if (!(aVar2 instanceof WXSDKInstance)) {
                                return;
                            }
                            ((WXSDKInstance) aVar2).b(WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode(), Log.getStackTraceString(e));
                        } catch (Throwable th) {
                            WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                        }
                    }
                }
            };
            this.d = null;
            return;
        }
        this.d = new Runnable() { // from class: com.taobao.weex.o.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                a aVar2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (o.a(o.this) == null || (aVar2 = (a) o.a(o.this).get()) == null) {
                } else {
                    try {
                        aVar2.OnVSync();
                        WXSDKManager.getInstance().getWXRenderManager().postOnUiThread(o.d(o.this), 16L);
                    } catch (UnsatisfiedLinkError e) {
                        if (!(aVar2 instanceof WXSDKInstance)) {
                            return;
                        }
                        ((WXSDKInstance) aVar2).b(WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode(), Log.getStackTraceString(e));
                    }
                }
            }
        };
        this.b = null;
        this.c = null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Choreographer choreographer = this.b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this.c);
        } else if (this.d == null) {
        } else {
            WXSDKManager.getInstance().getWXRenderManager().postOnUiThread(this.d, 16L);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Choreographer choreographer = this.b;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.c);
        } else if (this.d == null) {
        } else {
            WXSDKManager.getInstance().getWXRenderManager().removeTask(this.d);
        }
    }
}
