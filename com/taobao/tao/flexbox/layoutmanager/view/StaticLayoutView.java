package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;
import tb.ibp;
import tb.kge;
import tb.oeb;
import tb.oft;
import tb.ofu;
import tb.ohd;
import tb.tds;

/* loaded from: classes8.dex */
public class StaticLayoutView extends View implements tds {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean fixTextDraw;
    private boolean drawed;
    private ibp fadingEdge;
    private com.taobao.tao.flexbox.layoutmanager.drawable.e helper;
    private int mTextAlignment;
    private d marquee;
    private Layout textLayout;

    /* loaded from: classes8.dex */
    public interface b {
        void a(String str);
    }

    public static /* synthetic */ Object ipc$super(StaticLayoutView staticLayoutView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int access$000(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e40425bb", new Object[]{staticLayoutView})).intValue() : staticLayoutView.getDisplayWidth();
    }

    public static /* synthetic */ int access$100(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfc5a17c", new Object[]{staticLayoutView})).intValue() : staticLayoutView.getDisplayHeight();
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.drawable.e access$200(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.drawable.e) ipChange.ipc$dispatch("21e05fde", new Object[]{staticLayoutView}) : staticLayoutView.helper;
    }

    public static /* synthetic */ ibp access$400(StaticLayoutView staticLayoutView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibp) ipChange.ipc$dispatch("30bca3", new Object[]{staticLayoutView}) : staticLayoutView.fadingEdge;
    }

    static {
        kge.a(646236830);
        kge.a(-2026558253);
        fixTextDraw = oeb.ap();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.helper;
        if (eVar == null) {
            return;
        }
        eVar.e(i);
        invalidate();
    }

    public void setBoxShadow(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7782c950", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.helper;
        if (eVar == null) {
            return;
        }
        eVar.a(i, i2, i3, i4);
        invalidate();
    }

    @Override // tb.tds
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (this.fadingEdge == null) {
            this.fadingEdge = new ibp(this);
        }
        this.fadingEdge.a(iArr);
    }

    public StaticLayoutView(Context context) {
        super(context);
        this.drawed = false;
        this.marquee = null;
    }

    public void setTextAlign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71780586", new Object[]{this, new Integer(i)});
        } else if (this.mTextAlignment == i) {
        } else {
            this.mTextAlignment = i;
        }
    }

    public void enableNewMarquee(boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f732471b", new Object[]{this, new Boolean(z), bVar});
        } else if (z) {
            this.marquee = new e(bVar);
        } else {
            this.marquee = new c(bVar);
        }
    }

    public void setLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4d5a73", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.c = i;
    }

    public void setScrollAmount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9001a8b5", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.d = i;
    }

    public void setMarqueeScrollGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535349b3", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.f = i;
    }

    public void setDirection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436d380e", new Object[]{this, str});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.b = str;
    }

    public void setLoopDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d71a7f", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.e = i;
    }

    @Override // android.view.View
    public int getTextAlignment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10ed7ffa", new Object[]{this})).intValue() : this.mTextAlignment;
    }

    public void setLayout(com.taobao.tao.flexbox.layoutmanager.drawable.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18d2311", new Object[]{this, eVar});
            return;
        }
        Layout layout = this.textLayout;
        this.helper = eVar;
        if (eVar != null) {
            this.textLayout = eVar.m();
        }
        d dVar = this.marquee;
        if ((dVar instanceof c) && layout != this.textLayout) {
            dVar.a();
        }
        requestLayout();
        invalidate();
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.helper = null;
        this.textLayout = null;
        this.mTextAlignment = 0;
        this.marquee = null;
        this.drawed = false;
        ibp ibpVar = this.fadingEdge;
        if (ibpVar == null) {
            return;
        }
        ibpVar.a((int[]) null);
        this.fadingEdge = null;
    }

    public com.taobao.tao.flexbox.layoutmanager.drawable.e getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.drawable.e) ipChange.ipc$dispatch("a943c73b", new Object[]{this}) : this.helper;
    }

    public Layout getTextLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("b8322a99", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.helper;
        if (eVar == null) {
            return null;
        }
        return eVar.m();
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.helper;
        if (eVar == null) {
            return;
        }
        eVar.a((CharSequence) str);
        d dVar = this.marquee;
        if (dVar instanceof c) {
            dVar.a();
        }
        requestLayout();
        invalidate();
    }

    public String getText() {
        CharSequence text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        Layout textLayout = getTextLayout();
        if (textLayout != null && (text = textLayout.getText()) != null) {
            return text.toString();
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        ibp ibpVar = this.fadingEdge;
        if (ibpVar != null && ibpVar.a()) {
            int a2 = this.fadingEdge.a(canvas);
            super.draw(canvas);
            this.fadingEdge.b(canvas);
            this.fadingEdge.a(canvas, a2);
            return;
        }
        super.draw(canvas);
    }

    private boolean needRunMarquee(boolean z) {
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59696304", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.textLayout != null && (!z || ((eVar = this.helper) != null && eVar.b() == TextUtils.TruncateAt.MARQUEE))) {
            if (!TextUtils.equals(this.marquee.b, "right") && !TextUtils.equals(this.marquee.b, "left")) {
                return getDisplayHeight() < this.textLayout.getHeight();
            } else if (getDisplayWidth() < this.textLayout.getWidth()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.helper == null) {
            return;
        }
        if (this.marquee == null) {
            this.marquee = new c(null);
        }
        boolean i5 = this.helper.i();
        Picture n = this.helper.n();
        if (i5 && n == null && !this.drawed) {
            return;
        }
        this.drawed = true;
        Layout textLayout = getTextLayout();
        if (textLayout == null) {
            return;
        }
        canvas.save();
        int width = textLayout.getWidth();
        int height = textLayout.getHeight();
        int displayWidth = (getDisplayWidth() - getPaddingLeft()) - getPaddingRight();
        int displayHeight = (getDisplayHeight() - getPaddingTop()) - getPaddingBottom();
        boolean z = this.marquee instanceof c;
        int i6 = ((this.mTextAlignment & 7) != 1 || needRunMarquee(z)) ? 0 : (displayWidth - width) / 2;
        int i7 = ((this.mTextAlignment & 112) != 16 || needRunMarquee(z)) ? 0 : (displayHeight - height) / 2;
        if ((this.mTextAlignment & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388613 && !needRunMarquee(z)) {
            i6 = displayWidth - width;
        }
        this.marquee.a(canvas, i6, i7);
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.helper;
        if (eVar != null && eVar.b() == null && oeb.B()) {
            height = Math.min(height, getDisplayHeight());
        }
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar2 = this.helper;
        if (eVar2 != null) {
            int min = 0 + ((int) Math.min(0.0f, this.helper.s() - this.helper.t()));
            int max = width + ((int) Math.max(0.0f, this.helper.r() + this.helper.t()));
            int max2 = height + ((int) Math.max(0.0f, this.helper.s() + this.helper.t()));
            i2 = max;
            i3 = min;
            i4 = ((int) Math.min(0.0f, eVar2.r() - this.helper.t())) + 0;
            i = max2;
        } else {
            i = height;
            i2 = width;
            i3 = 0;
        }
        canvas.clipRect(i4, i3, i2, i);
        this.helper.a(canvas);
        if (this.marquee.a(canvas, textLayout, i6, i7)) {
            return;
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (tb.oft.a(r10, r4, r5, tb.oft.a.class, r11, false) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r11 = "a9b14c3a"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L1c:
            android.text.Layout r4 = r10.getTextLayout()
            if (r4 == 0) goto L83
            java.lang.CharSequence r0 = r4.getText()
            boolean r1 = tb.ofv.a(r0)
            r3 = 0
            if (r1 == 0) goto L5c
            com.taobao.tao.flexbox.layoutmanager.drawable.e r1 = r10.helper
            java.lang.CharSequence r1 = r1.j()
            boolean r1 = r1 instanceof tb.ofu
            if (r1 == 0) goto L48
            com.taobao.tao.flexbox.layoutmanager.drawable.e r0 = r10.helper
            java.lang.CharSequence r0 = r0.j()
            tb.ofu r0 = (tb.ofu) r0
            android.text.Spanned r1 = r0.b()
            r9 = r3
            r3 = r0
            r0 = r1
            r1 = r9
            goto L5d
        L48:
            com.taobao.tao.flexbox.layoutmanager.drawable.e r1 = r10.helper
            java.lang.CharSequence r1 = r1.j()
            boolean r1 = r1 instanceof com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.c
            if (r1 == 0) goto L5c
            com.taobao.tao.flexbox.layoutmanager.drawable.e r0 = r10.helper
            java.lang.CharSequence r0 = r0.j()
            r1 = r0
            com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent$c r1 = (com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent.c) r1
            goto L5d
        L5c:
            r1 = r3
        L5d:
            boolean r3 = r10.handleEllipsizeSpanClick(r3, r4, r11)
            if (r3 != 0) goto L82
            boolean r1 = r10.handleCompositeSpanClick(r1, r4, r11)
            if (r1 == 0) goto L6a
            goto L82
        L6a:
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L83
            r5 = r0
            android.text.Spanned r5 = (android.text.Spanned) r5
            boolean r0 = tb.oft.a(r10, r4, r5, r11)
            if (r0 != 0) goto L82
            java.lang.Class<tb.oft$a> r6 = tb.oft.a.class
            r8 = 0
            r3 = r10
            r7 = r11
            boolean r0 = tb.oft.a(r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L83
        L82:
            return r2
        L83:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        d dVar = this.marquee;
        if (dVar instanceof e) {
            if (((e) dVar).h != 1) {
                return;
            }
            this.marquee.a();
        } else if (!(dVar instanceof c)) {
        } else {
            dVar.a();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    public void setMarqueeState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59d02eb", new Object[]{this, new Integer(i)});
            return;
        }
        d dVar = this.marquee;
        if (!(dVar instanceof e)) {
            return;
        }
        ((e) dVar).h = i;
    }

    public int getMarqueeState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a213dff", new Object[]{this})).intValue();
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return 0;
        }
        return dVar.h;
    }

    public void startMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c873de7", new Object[]{this});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.a();
    }

    public void pauseMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf6d7d3", new Object[]{this});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    public void stopMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974b7647", new Object[]{this});
            return;
        }
        d dVar = this.marquee;
        if (dVar == null) {
            return;
        }
        dVar.c();
    }

    private boolean handleEllipsizeSpanClick(ofu ofuVar, Layout layout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5a62dbc", new Object[]{this, ofuVar, layout, motionEvent})).booleanValue();
        }
        ReplacementSpan replacementSpan = null;
        com.taobao.tao.flexbox.layoutmanager.drawable.e eVar = this.helper;
        if (eVar != null) {
            replacementSpan = eVar.q();
        }
        return (!(replacementSpan instanceof RichTextContainerComponent.b) || ((RichTextContainerComponent.b) replacementSpan).a()) && (replacementSpan instanceof oft.a) && ofuVar != null && oft.a(this, layout, ofuVar, ((oft.a) replacementSpan).getClass(), motionEvent, false);
    }

    private boolean handleCompositeSpanClick(RichTextContainerComponent.c cVar, Layout layout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86cb5012", new Object[]{this, cVar, layout, motionEvent})).booleanValue();
        }
        if (cVar == null) {
            return false;
        }
        RichTextContainerComponent.a a2 = cVar.a();
        return (a2 instanceof oft.a) && cVar != null && oft.a(this, layout, a2.b(), a2.getClass(), motionEvent, true);
    }

    private int getDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4638814", new Object[]{this})).intValue();
        }
        if (fixTextDraw) {
            return getWidth();
        }
        return getMeasuredWidth();
    }

    private int getDisplayHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42401bcd", new Object[]{this})).intValue();
        }
        if (fixTextDraw) {
            return getHeight();
        }
        return getMeasuredHeight();
    }

    /* loaded from: classes8.dex */
    public static class a extends LinearInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f20519a;

        static {
            kge.a(855185225);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 583500507) {
                return new Float(super.getInterpolation(((Number) objArr[0]).floatValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(long j, int i) {
            this.f20519a = (((float) (j - i)) * 1.0f) / ((float) j);
        }

        @Override // android.view.animation.LinearInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            float f2 = this.f20519a;
            if (f2 == 1.0f) {
                return super.getInterpolation(f);
            }
            if (f < f2) {
                return f / f2;
            }
            return 1.0f;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!(this.marquee instanceof c)) {
            return;
        }
        startMarquee();
    }

    /* loaded from: classes8.dex */
    public abstract class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATE_INIT = 0;
        public static final int STATE_PAUSE = 2;
        public static final int STATE_START = 1;
        public static final int STATE_STOP = 3;

        /* renamed from: a  reason: collision with root package name */
        private b f20522a;
        public int d;
        public int f;
        public ValueAnimator i;
        public String b = "left";
        public int c = -1;
        public int e = 0;
        public int g = 0;
        public int h = 0;
        public Handler j = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                Layout textLayout = StaticLayoutView.this.getTextLayout();
                if (textLayout == null) {
                    return;
                }
                d.this.a(textLayout);
            }
        };

        static {
            kge.a(356719612);
        }

        public abstract boolean a();

        public static /* synthetic */ b a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7d458c10", new Object[]{dVar}) : dVar.f20522a;
        }

        public d(b bVar) {
            this.f20522a = bVar;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.i == null || Build.VERSION.SDK_INT < 19) {
            } else {
                this.i.pause();
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.j.removeMessages(0);
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.i = null;
            }
            this.g = 0;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
                return;
            }
            Layout textLayout = StaticLayoutView.this.getTextLayout();
            if (textLayout == null) {
                return;
            }
            String str = this.b;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3739) {
                if (hashCode != 3089570) {
                    if (hashCode != 3317767) {
                        if (hashCode == 108511772 && str.equals("right")) {
                            c = 1;
                        }
                    } else if (str.equals("left")) {
                        c = 0;
                    }
                } else if (str.equals("down")) {
                    c = 3;
                }
            } else if (str.equals("up")) {
                c = 2;
            }
            if (c == 0) {
                this.g = -((int) ((textLayout.getWidth() + this.f) * f));
            } else if (c == 1) {
                this.g = (int) ((textLayout.getWidth() + this.f) * f);
            } else if (c == 2) {
                this.g = -((int) ((textLayout.getHeight() + this.f) * f));
            } else if (c == 3) {
                this.g = (int) ((textLayout.getHeight() + this.f) * f);
            }
            if (f != 1.0f) {
                return;
            }
            this.g = 0;
        }

        public void a(Canvas canvas, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a565671d", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
                return;
            }
            String str = this.b;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3739) {
                if (hashCode != 3089570) {
                    if (hashCode != 3317767) {
                        if (hashCode == 108511772 && str.equals("right")) {
                            c = 1;
                        }
                    } else if (str.equals("left")) {
                        c = 0;
                    }
                } else if (str.equals("down")) {
                    c = 2;
                }
            } else if (str.equals("up")) {
                c = 3;
            }
            if (c == 0 || c == 1) {
                canvas.translate(StaticLayoutView.this.getPaddingLeft() + i + this.g, StaticLayoutView.this.getPaddingTop() + i2);
            } else if (c != 2 && c != 3) {
            } else {
                canvas.translate(StaticLayoutView.this.getPaddingLeft() + i, StaticLayoutView.this.getPaddingTop() + i2 + this.g);
            }
        }

        public boolean a(Canvas canvas, Layout layout, int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c906f7c", new Object[]{this, canvas, layout, new Integer(i), new Integer(i2)})).booleanValue();
            }
            String str = this.b;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3739) {
                if (hashCode != 3089570) {
                    if (hashCode != 3317767) {
                        if (hashCode == 108511772 && str.equals("right")) {
                            c = 1;
                        }
                    } else if (str.equals("left")) {
                        c = 0;
                    }
                } else if (str.equals("down")) {
                    c = 3;
                }
            } else if (str.equals("up")) {
                c = 2;
            }
            if (c == 0) {
                if (StaticLayoutView.access$000(StaticLayoutView.this) < layout.getWidth() && this.g < (-((layout.getWidth() + this.f) - StaticLayoutView.access$000(StaticLayoutView.this)))) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate(StaticLayoutView.this.getPaddingLeft() + i + this.g + layout.getWidth() + this.f, StaticLayoutView.this.getPaddingTop() + i2);
                }
                z = false;
            } else if (c == 1) {
                if (StaticLayoutView.access$000(StaticLayoutView.this) < layout.getWidth() && this.g > this.f) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate(StaticLayoutView.this.getPaddingLeft() + i + (-((layout.getWidth() + this.f) - this.g)), StaticLayoutView.this.getPaddingTop() + i2);
                }
                z = false;
            } else if (c == 2) {
                if (StaticLayoutView.access$100(StaticLayoutView.this) < layout.getHeight() && this.g < (-((layout.getHeight() + this.f) - StaticLayoutView.access$100(StaticLayoutView.this)))) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate(StaticLayoutView.this.getPaddingLeft() + i, StaticLayoutView.this.getPaddingTop() + i2 + this.g + layout.getHeight() + this.f);
                }
                z = false;
            } else {
                if (c == 3 && StaticLayoutView.access$100(StaticLayoutView.this) < layout.getHeight() && this.g > this.f) {
                    canvas.restore();
                    canvas.save();
                    canvas.translate(StaticLayoutView.this.getPaddingLeft() + i, StaticLayoutView.this.getPaddingTop() + i2 + (-((layout.getHeight() + this.f) - this.g)));
                }
                z = false;
            }
            if (z) {
                StaticLayoutView.access$200(StaticLayoutView.this).a(canvas);
                canvas.restore();
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
            if (r5.equals("right") == false) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.text.Layout r11) {
            /*
                Method dump skipped, instructions count: 240
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d.a(android.text.Layout):void");
        }
    }

    /* loaded from: classes8.dex */
    public class e extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(127125576);
        }

        public e(b bVar) {
            super(bVar);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d
        public boolean a() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if ((this.i == null || Build.VERSION.SDK_INT < 19) ? false : this.i.isPaused()) {
                if (Build.VERSION.SDK_INT >= 19) {
                    this.i.resume();
                }
                z = false;
            } else {
                c();
                Layout textLayout = StaticLayoutView.this.getTextLayout();
                if (textLayout != null) {
                    if (TextUtils.equals(this.b, "right") || TextUtils.equals(this.b, "left")) {
                        if (StaticLayoutView.access$000(StaticLayoutView.this) < textLayout.getWidth()) {
                            this.j.sendEmptyMessage(0);
                        }
                    } else if (StaticLayoutView.access$100(StaticLayoutView.this) < textLayout.getHeight()) {
                        this.j.sendEmptyMessage(0);
                    }
                }
                z = false;
            }
            if (StaticLayoutView.access$400(StaticLayoutView.this) != null) {
                StaticLayoutView.access$400(StaticLayoutView.this).a(z);
            }
            return z;
        }
    }

    /* loaded from: classes8.dex */
    public class c extends d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(519164019);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1936691332) {
                if (hashCode != -1077716083) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.a((Layout) objArr[0]);
                return null;
            }
            return new Boolean(super.a((Canvas) objArr[0], (Layout) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue()));
        }

        public c(b bVar) {
            super(bVar);
        }

        private void b(Layout layout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c19caeac", new Object[]{this, layout});
                return;
            }
            int width = layout.getWidth();
            int access$000 = StaticLayoutView.access$000(StaticLayoutView.this);
            int i = width + access$000;
            int b = (i / ohd.b(StaticLayoutView.this.getContext(), 1)) * 20;
            if (this.i == null) {
                this.i = ValueAnimator.ofInt(access$000, -width);
                this.i.setInterpolator(new LinearInterpolator());
                this.i.setDuration(b);
                this.i.setRepeatCount(-1);
                this.i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            return;
                        }
                        c.this.g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewCompat.postInvalidateOnAnimation(StaticLayoutView.this);
                    }
                });
            } else {
                this.i.cancel();
            }
            this.i.start();
            this.i.setCurrentPlayTime((access$000 * b) / i);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d
        public void a(Layout layout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfc35b8d", new Object[]{this, layout});
            } else if (this.d > 0 || this.f > 0) {
                super.a(layout);
            } else {
                b(layout);
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d
        public boolean a() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            c();
            Layout textLayout = StaticLayoutView.this.getTextLayout();
            if (textLayout == null || StaticLayoutView.access$200(StaticLayoutView.this) == null || StaticLayoutView.access$200(StaticLayoutView.this).b() != TextUtils.TruncateAt.MARQUEE || StaticLayoutView.access$000(StaticLayoutView.this) >= textLayout.getWidth()) {
                z = false;
            } else {
                this.j.sendEmptyMessageDelayed(0, 1000L);
            }
            if (StaticLayoutView.access$400(StaticLayoutView.this) != null) {
                StaticLayoutView.access$400(StaticLayoutView.this).a(z);
            }
            return z;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView.d
        public boolean a(Canvas canvas, Layout layout, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c906f7c", new Object[]{this, canvas, layout, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (this.d <= 0 && this.f <= 0) {
                return false;
            }
            return super.a(canvas, layout, i, i2);
        }
    }
}
