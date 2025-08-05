package com.taobao.android.fcanvas.integration;

import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1303422697);
    }

    public abstract void a();

    public abstract void a(boolean z);

    public abstract void b();

    public static f a(FCanvasJNIBridge fCanvasJNIBridge, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a82c90ea", new Object[]{fCanvasJNIBridge, new Boolean(z)}) : new a(fCanvasJNIBridge, z);
    }

    /* loaded from: classes5.dex */
    public static class a extends f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f12331a;
        private long b;
        private volatile boolean c;
        private Choreographer.FrameCallback d;
        private final FCanvasJNIBridge e;

        static {
            kge.a(-20568903);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a8af8e5", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.b = j;
            return j;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c360437", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1bbf9e38", new Object[]{aVar})).booleanValue() : aVar.f12331a;
        }

        public static /* synthetic */ long c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b493829", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ FCanvasJNIBridge d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FCanvasJNIBridge) ipChange.ipc$dispatch("5ec2f1f8", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ void e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a5c6c37", new Object[]{aVar});
            } else {
                aVar.c();
            }
        }

        private a(FCanvasJNIBridge fCanvasJNIBridge, boolean z) {
            this.c = false;
            this.e = fCanvasJNIBridge;
            this.f12331a = z;
        }

        @Override // com.taobao.android.fcanvas.integration.f
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c || this.e == null) {
            } else {
                this.d = new Choreographer.FrameCallback() { // from class: com.taobao.android.fcanvas.integration.f.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.Choreographer.FrameCallback
                    public void doFrame(long j) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                        } else if (!a.a(a.this)) {
                        } else {
                            if (!a.b(a.this)) {
                                a.d(a.this).dispatchVsync(j);
                            } else if (a.c(a.this) == 0 || j - a.c(a.this) >= 33333333) {
                                a.d(a.this).dispatchVsync(j);
                                a.a(a.this, j);
                            }
                            a.e(a.this);
                        }
                    }
                };
                this.e.dispatchVsync(System.nanoTime());
                this.c = true;
                c();
            }
        }

        @Override // com.taobao.android.fcanvas.integration.f
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!this.c || this.d == null) {
            } else {
                Choreographer.getInstance().removeFrameCallback(this.d);
                this.c = false;
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.d == null) {
            } else {
                Choreographer.getInstance().postFrameCallback(this.d);
            }
        }

        @Override // com.taobao.android.fcanvas.integration.f
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f12331a = z;
            }
        }
    }
}
