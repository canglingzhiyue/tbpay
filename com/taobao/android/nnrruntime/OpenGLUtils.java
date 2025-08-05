package com.taobao.android.nnrruntime;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nnrruntime.Scene;
import tb.ihq;
import tb.ihy;
import tb.ihz;
import tb.kge;

/* loaded from: classes6.dex */
public class OpenGLUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14474a;

    public static native long nativeCreateContext(int i);

    public static native long nativeCreateTarget();

    public static native void nativeReleaseContext(long j);

    public static native void nativeReleaseTarget(long j);

    public static native void nativeSetBackgroundColor(long j, float f, float f2, float f3, float f4);

    public static native void nativeSetClearBit(long j, int i);

    public static native void nativeSetDepthValue(long j, float f);

    public static native void nativeSetViewport(long j, int i, int i2, int i3, int i4);

    static {
        kge.a(668089356);
        f14474a = false;
    }

    /* loaded from: classes6.dex */
    public static class a implements Scene.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f14476a;

        static {
            kge.a(1789234423);
            kge.a(1024463301);
        }

        public a(int i) {
            this.f14476a = OpenGLUtils.nativeCreateContext(i);
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f14476a;
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                OpenGLUtils.nativeReleaseContext(this.f14476a);
            }
        }
    }

    public static void a(final Runnable runnable, final Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f8e64", new Object[]{runnable, runnable2});
        } else {
            ihq.a().a("nnrruntime", new ihy() { // from class: com.taobao.android.nnrruntime.OpenGLUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                    } else if (!ihzVar.g()) {
                        Log.e("NNRRuntime", "initNNR: Can't load nnrruntime.so");
                        OpenGLUtils.f14474a = false;
                    } else {
                        try {
                            OpenGLUtils.f14474a = true;
                            if (runnable == null) {
                                return;
                            }
                            runnable.run();
                        } catch (Throwable unused) {
                            OpenGLUtils.f14474a = false;
                            Runnable runnable3 = runnable2;
                            if (runnable3 == null) {
                                return;
                            }
                            runnable3.run();
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements Scene.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f14477a;

        static {
            kge.a(1917063497);
            kge.a(1024463301);
        }

        public b() {
            if (OpenGLUtils.f14474a) {
                this.f14477a = OpenGLUtils.nativeCreateTarget();
            } else {
                this.f14477a = 0L;
            }
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f14477a;
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!OpenGLUtils.f14474a) {
            } else {
                OpenGLUtils.nativeReleaseTarget(this.f14477a);
            }
        }

        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (!OpenGLUtils.f14474a) {
            } else {
                OpenGLUtils.nativeSetViewport(this.f14477a, i, i2, i3, i4);
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (!OpenGLUtils.f14474a) {
            } else {
                OpenGLUtils.nativeSetClearBit(this.f14477a, i);
            }
        }
    }

    public static Scene a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scene) ipChange.ipc$dispatch("8c4bd340", new Object[]{new Integer(i), str});
        }
        if (f14474a) {
            return Scene.a(str, new a(i), new b());
        }
        return null;
    }
}
