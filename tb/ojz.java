package tb;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pig;

/* loaded from: classes5.dex */
public abstract class ojz implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pig.a f32129a;
    private GestureDetector b;
    private View c;
    private Context d;
    private int e;
    private ScaleGestureDetector f;
    private boolean g;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f32131a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(-718715246);
        }
    }

    static {
        kge.a(923334372);
        kge.a(-468432129);
    }

    public abstract int a();

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public abstract String b();

    public static /* synthetic */ boolean a(ojz ojzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f80d0c7d", new Object[]{ojzVar})).booleanValue() : ojzVar.g;
    }

    public static /* synthetic */ boolean a(ojz ojzVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995357f", new Object[]{ojzVar, new Boolean(z)})).booleanValue();
        }
        ojzVar.g = z;
        return z;
    }

    public static /* synthetic */ pig.a b(ojz ojzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pig.a) ipChange.ipc$dispatch("18ce64a1", new Object[]{ojzVar}) : ojzVar.f32129a;
    }

    public static /* synthetic */ View c(ojz ojzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f33a68fd", new Object[]{ojzVar}) : ojzVar.c;
    }

    public static /* synthetic */ Context d(ojz ojzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ba814af4", new Object[]{ojzVar}) : ojzVar.d;
    }

    public ojz(View view, Context context, pig.a aVar) {
        this.f32129a = aVar;
        this.d = context;
        this.b = new GestureDetector(context, new a());
        this.f = new ScaleGestureDetector(context, new c());
        this.c = view;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.e = motionEvent.getAction();
        this.f.onTouchEvent(motionEvent);
        this.b.onTouchEvent(motionEvent);
        return true;
    }

    /* loaded from: classes5.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1983276973);
        }

        private c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            ojz.a(ojz.this, false);
            fjt.a(fjt.TAG_RENDER, "主图下沉onScaleBegin：" + scaleFactor);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!ojz.a(ojz.this) && ojz.b(ojz.this) != null) {
                b bVar = new b();
                bVar.b = ojz.this.b();
                bVar.f32131a = ojz.this.a();
                bVar.e = scaleFactor > 1.0f ? "unpinch" : "pinch";
                fjt.a(fjt.TAG_RENDER, "主图下沉onScale：" + scaleFactor);
                ojz.b(ojz.this).d(bVar);
                ojz.a(ojz.this, true);
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1144047421);
        }

        private a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            ojz.c(ojz.this);
            if (ojz.b(ojz.this) == null) {
                return;
            }
            b bVar = new b();
            bVar.b = ojz.this.b();
            bVar.f32131a = ojz.this.a();
            fjt.a(fjt.TAG_RENDER, "widgetClickListener onLongPress, position: " + bVar.f32131a + ", area: " + bVar.b);
            ojz.b(ojz.this).b(bVar);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
            }
            ojz ojzVar = ojz.this;
            ojzVar.a(ojz.c(ojzVar));
            if (ojz.b(ojz.this) != null) {
                b bVar = new b();
                bVar.b = ojz.this.b();
                bVar.f32131a = ojz.this.a();
                fjt.a(fjt.TAG_RENDER, "widgetClickListener onSingleTapConfirmed, position: " + bVar.f32131a + ", area: " + bVar.b);
                ojz.b(ojz.this).a(bVar);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ojz.b(ojz.this) != null) {
                b bVar = new b();
                bVar.b = ojz.this.b();
                bVar.f32131a = ojz.this.a();
                int[] iArr = new int[2];
                ojz.c(ojz.this).getLocationOnScreen(iArr);
                float f = x + iArr[0];
                float f2 = y + iArr[1];
                bVar.c = String.valueOf(fjl.b(ojz.d(ojz.this), f));
                bVar.d = String.valueOf(fjl.b(ojz.d(ojz.this), f2));
                fjt.a(fjt.TAG_RENDER, "widgetClickListener onDoubleTap, position: " + bVar.f32131a + ", area: " + bVar.b + ", X: " + bVar.c + ", Y: " + bVar.d);
                ojz.b(ojz.this).c(bVar);
            }
            return true;
        }
    }
}
