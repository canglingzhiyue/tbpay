package io.unicorn.view;

import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Choreographer;
import io.unicorn.embedding.engine.FlutterJNI;
import tb.kge;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static a f24898a;
    private static b b;
    private long c = -1;
    private Choreographer$FrameCallbackC1065b d = new Choreographer$FrameCallbackC1065b(0);
    private final FlutterJNI.b e = new FlutterJNI.b() { // from class: io.unicorn.view.b.1
        private Choreographer.FrameCallback b(long j) {
            if (b.this.d != null) {
                b.this.d.b = j;
                Choreographer$FrameCallbackC1065b choreographer$FrameCallbackC1065b = b.this.d;
                b.this.d = null;
                return choreographer$FrameCallbackC1065b;
            }
            return new Choreographer$FrameCallbackC1065b(j);
        }

        @Override // io.unicorn.embedding.engine.FlutterJNI.b
        public void a(long j) {
            Choreographer.getInstance().postFrameCallback(b(j));
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class a implements DisplayManager.DisplayListener {
        private DisplayManager b;

        static {
            kge.a(-1772208645);
            kge.a(455664337);
        }

        a(DisplayManager displayManager) {
            this.b = displayManager;
        }

        void a() {
            try {
                this.b.registerDisplayListener(this, null);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                float refreshRate = this.b.getDisplay(0).getRefreshRate();
                b.this.c = (long) (1.0E9d / refreshRate);
                try {
                    FlutterJNI.setRefreshRateFPS(refreshRate);
                } catch (UnsatisfiedLinkError e) {
                    Log.e("Weex", "call jni exception: ", e);
                    this.b.unregisterDisplayListener(this);
                }
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.unicorn.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public class Choreographer$FrameCallbackC1065b implements Choreographer.FrameCallback {
        private long b;

        static {
            kge.a(1601152119);
            kge.a(-569788179);
        }

        Choreographer$FrameCallbackC1065b(long j) {
            this.b = j;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            long nanoTime = System.nanoTime() - j;
            FlutterJNI.nativeOnVsync(nanoTime < 0 ? 0L : nanoTime, b.this.c, this.b);
            b.this.d = this;
        }
    }

    static {
        kge.a(-1166187223);
    }

    private b() {
    }

    public static b a(float f) {
        if (b == null) {
            b = new b();
        }
        FlutterJNI.setRefreshRateFPS(f);
        b bVar = b;
        bVar.c = (long) (1.0E9d / f);
        return bVar;
    }

    public static b a(DisplayManager displayManager) {
        if (b == null) {
            b = new b();
        }
        if (f24898a == null) {
            b bVar = b;
            bVar.getClass();
            a aVar = new a(displayManager);
            f24898a = aVar;
            aVar.a();
        }
        if (b.c == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            b.c = (long) (1.0E9d / refreshRate);
            FlutterJNI.setRefreshRateFPS(refreshRate);
        }
        return b;
    }

    public void a() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.e);
    }
}
