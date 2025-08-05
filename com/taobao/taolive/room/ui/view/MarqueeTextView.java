package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class MarqueeTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private a mMarquee;
    private b mMarqueeCompleteListener;
    private int mMarqueeRepeatLimit;
    private int mOriginTextWidth;
    private int mParentWidth;

    /* loaded from: classes8.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ Object ipc$super(MarqueeTextView marqueeTextView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 358241672) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ b access$300(MarqueeTextView marqueeTextView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ee667270", new Object[]{marqueeTextView}) : marqueeTextView.mMarqueeCompleteListener;
    }

    public static /* synthetic */ int access$400(MarqueeTextView marqueeTextView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("75742154", new Object[]{marqueeTextView})).intValue() : marqueeTextView.mOriginTextWidth;
    }

    public static /* synthetic */ int access$500(MarqueeTextView marqueeTextView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76aa7433", new Object[]{marqueeTextView})).intValue() : marqueeTextView.mParentWidth;
    }

    static {
        kge.a(1632260901);
        TAG = MarqueeTextView.class.getSimpleName();
    }

    public MarqueeTextView(Context context) {
        this(context, null);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMarqueeRepeatLimit = 2;
    }

    @Override // android.widget.TextView
    public void setMarqueeRepeatLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca849fc", new Object[]{this, new Integer(i)});
        } else {
            this.mMarqueeRepeatLimit = i;
        }
    }

    public void setOnMarqueeCompleteListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52403c29", new Object[]{this, bVar});
        } else {
            this.mMarqueeCompleteListener = bVar;
        }
    }

    public boolean outOfBounds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21516065", new Object[]{this})).booleanValue() : getTextWidth() >= this.mParentWidth;
    }

    public int getTextWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca9d78dd", new Object[]{this})).intValue() : this.mOriginTextWidth;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
            return;
        }
        super.setText(charSequence, bufferType);
        this.mOriginTextWidth = (int) getPaint().measureText(getText().toString());
    }

    public void setParentWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91979222", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        Log.e(str, "parentWidth = " + i);
        this.mParentWidth = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        a aVar = this.mMarquee;
        if (aVar != null && aVar.g()) {
            canvas.translate(-this.mMarquee.e(), 0.0f);
        }
        super.onDraw(canvas);
        a aVar2 = this.mMarquee;
        if (aVar2 == null || !aVar2.f()) {
            return;
        }
        canvas.translate(this.mMarquee.d(), 0.0f);
        super.onDraw(canvas);
    }

    public void startScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75254ad6", new Object[]{this});
            return;
        }
        if (this.mMarquee == null) {
            this.mMarquee = new a(this);
        }
        this.mMarquee.a(this.mMarqueeRepeatLimit);
    }

    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
            return;
        }
        a aVar = this.mMarquee;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<MarqueeTextView> f21741a;
        private final float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        private int j;
        private float k;
        private long l;
        private byte c = 0;
        private Choreographer.FrameCallback m = new Choreographer.FrameCallback() { // from class: com.taobao.taolive.room.ui.view.MarqueeTextView.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                } else {
                    a.this.a();
                }
            }
        };
        private Choreographer.FrameCallback n = new Choreographer.FrameCallback() { // from class: com.taobao.taolive.room.ui.view.MarqueeTextView.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    return;
                }
                a.a(a.this, (byte) 2);
                a.a(a.this, System.currentTimeMillis());
                a.this.a();
            }
        };
        private Choreographer.FrameCallback o = new Choreographer.FrameCallback() { // from class: com.taobao.taolive.room.ui.view.MarqueeTextView.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                } else if (a.a(a.this) != 2) {
                } else {
                    if (a.b(a.this) >= 0) {
                        a.c(a.this);
                    }
                    a aVar = a.this;
                    aVar.a(a.b(aVar));
                }
            }
        };
        private final Choreographer b = Choreographer.getInstance();

        static {
            kge.a(-646947822);
        }

        public static /* synthetic */ byte a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4f25823", new Object[]{aVar})).byteValue() : aVar.c;
        }

        public static /* synthetic */ byte a(a aVar, byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9590751", new Object[]{aVar, new Byte(b)})).byteValue();
            }
            aVar.c = b;
            return b;
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f9592561", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.l = j;
            return j;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a628ab09", new Object[]{aVar})).intValue() : aVar.j;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a75efde8", new Object[]{aVar})).intValue();
            }
            int i = aVar.j;
            aVar.j = i - 1;
            return i;
        }

        public a(MarqueeTextView marqueeTextView) {
            this.d = (marqueeTextView.getContext().getResources().getDisplayMetrics().density * 50.0f) / 1000.0f;
            this.f21741a = new WeakReference<>(marqueeTextView);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c != 2) {
            } else {
                this.b.removeFrameCallback(this.m);
                MarqueeTextView marqueeTextView = this.f21741a.get();
                if (marqueeTextView == null) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.l = currentTimeMillis;
                this.k += ((float) (currentTimeMillis - this.l)) * this.d;
                float f = this.k;
                float f2 = this.e;
                if (f > f2) {
                    this.k = f2;
                    this.b.postFrameCallbackDelayed(this.o, 1200L);
                } else {
                    this.b.postFrameCallback(this.m);
                }
                marqueeTextView.invalidate();
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.c = (byte) 0;
            this.b.removeFrameCallback(this.n);
            this.b.removeFrameCallback(this.o);
            this.b.removeFrameCallback(this.m);
            c();
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.k = 0.0f;
            MarqueeTextView marqueeTextView = this.f21741a.get();
            if (marqueeTextView == null) {
                return;
            }
            marqueeTextView.invalidate();
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                b();
                MarqueeTextView marqueeTextView = this.f21741a.get();
                if (marqueeTextView == null || MarqueeTextView.access$300(marqueeTextView) == null) {
                    return;
                }
                MarqueeTextView.access$300(marqueeTextView).a();
            } else {
                this.j = i;
                MarqueeTextView marqueeTextView2 = this.f21741a.get();
                if (marqueeTextView2 == null) {
                    return;
                }
                this.c = (byte) 1;
                this.k = 0.0f;
                float access$400 = MarqueeTextView.access$400(marqueeTextView2);
                float access$500 = MarqueeTextView.access$500(marqueeTextView2) / 3.0f;
                this.g = (access$400 - MarqueeTextView.access$500(marqueeTextView2)) + access$500;
                this.e = this.g + MarqueeTextView.access$500(marqueeTextView2);
                this.h = access$500 + access$400;
                this.i = (MarqueeTextView.access$500(marqueeTextView2) / 6.0f) + access$400;
                this.f = this.g + access$400 + access$400;
                marqueeTextView2.invalidate();
                this.b.postFrameCallbackDelayed(this.n, 1500L);
            }
        }

        public float d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.h;
        }

        public float e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.k;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c == 2 && this.k > this.g;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.c == 2;
        }
    }
}
