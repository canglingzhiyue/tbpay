package com.taobao.android.weex_uikit.widget.text;

import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f16227a;
    private static l b;
    private final b c;

    static {
        kge.a(515848222);
        f16227a = l.class.getName();
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f16228a;
        private final int b;
        private final int c;

        static {
            kge.a(1520159017);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("30196392", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5df1fdf1", new Object[]{aVar})).intValue() : aVar.c;
        }

        public static /* synthetic */ Drawable c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("6a540c3d", new Object[]{aVar}) : aVar.f16228a;
        }
    }

    public static synchronized l a() {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("4fd257fc", new Object[0]);
            }
            if (b == null) {
                b = new l();
            }
            return b;
        }
    }

    private l() {
        HandlerThread handlerThread = new HandlerThread(f16227a, 14);
        handlerThread.start();
        this.c = new b(handlerThread.getLooper());
    }

    public void a(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc35b8d", new Object[]{this, layout});
        } else {
            this.c.obtainMessage(0, new WeakReference(layout)).sendToTarget();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int WARM_DRAWABLE = 1;
        public static final int WARM_LAYOUT = 0;

        /* renamed from: a  reason: collision with root package name */
        private final Picture f16229a;

        static {
            kge.a(-966697262);
        }

        private b(Looper looper) {
            super(looper);
            Picture picture;
            try {
                picture = new Picture();
            } catch (RuntimeException unused) {
                picture = null;
            }
            this.f16229a = picture;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (this.f16229a == null) {
            } else {
                try {
                    int i = message.what;
                    if (i == 0) {
                        Layout layout = (Layout) ((WeakReference) message.obj).get();
                        if (layout != null) {
                            layout.draw(this.f16229a.beginRecording(layout.getWidth(), com.taobao.android.weex_uikit.widget.text.b.b(layout)));
                            this.f16229a.endRecording();
                        }
                    } else if (i == 1 && (aVar = (a) ((WeakReference) message.obj).get()) != null) {
                        a.c(aVar).draw(this.f16229a.beginRecording(a.a(aVar), a.b(aVar)));
                        this.f16229a.endRecording();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
