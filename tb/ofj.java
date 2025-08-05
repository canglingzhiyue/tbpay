package tb;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ofl;

/* loaded from: classes8.dex */
public class ofj extends ofl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(653882228);
    }

    /* loaded from: classes8.dex */
    public static class b extends ofl.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2099672831);
        }

        @Override // tb.ofl.e
        public boolean a(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ff88d03", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getHistorySize() == 0) {
                return false;
            }
            float y = motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0);
            float x = motionEvent.getX(0) - motionEvent.getHistoricalX(0, 0);
            if (Math.abs(x) < Math.abs(y)) {
                return false;
            }
            this.f31999a = view.getTranslationX();
            this.b = x;
            if (this.b > 0.0f) {
                z = true;
            }
            this.c = z;
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends ofl.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(869693743);
        }

        public a() {
            this.f31996a = View.TRANSLATION_X;
        }

        @Override // tb.ofl.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            this.b = view.getTranslationX();
            this.c = view.getWidth();
        }
    }

    public ofj(ofk ofkVar) {
        this(ofkVar, 3.0f, 1.0f, -2.0f);
    }

    public ofj(ofk ofkVar, float f, float f2, float f3) {
        super(ofkVar, f3, f, f2);
    }

    @Override // tb.ofl
    public ofl.e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofl.e) ipChange.ipc$dispatch("6f77ee28", new Object[]{this}) : new b();
    }

    @Override // tb.ofl
    public ofl.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ofl.a) ipChange.ipc$dispatch("5155b74b", new Object[]{this}) : new a();
    }

    @Override // tb.ofl
    public void a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
        } else {
            view.setTranslationX(f);
        }
    }

    @Override // tb.ofl
    public void a(View view, float f, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cafc2b", new Object[]{this, view, new Float(f), motionEvent});
            return;
        }
        view.setTranslationX(f);
        motionEvent.offsetLocation(f - motionEvent.getX(0), 0.0f);
    }
}
