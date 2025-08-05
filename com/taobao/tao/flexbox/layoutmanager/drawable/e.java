package com.taobao.tao.flexbox.layoutmanager.drawable;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureMode;
import com.taobao.tao.flexbox.layoutmanager.component.TextComponent;
import com.taobao.tao.flexbox.layoutmanager.core.ac;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ofu;
import tb.ogk;
import tb.ohc;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TextDirectionHeuristic A;
    private static int B;
    private static Constructor z;
    private Canvas b;
    private Picture c;
    private TextComponent d;
    private boolean f;
    private float g;
    private boolean i;
    private boolean j;
    private Layout k;
    private CharSequence l;
    private float n;
    private TextUtils.TruncateAt o;
    private int p;
    private int q;
    private YogaMeasureMode r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f20386a = true;
    private float h = 2.14748365E9f;
    private int m = Integer.MAX_VALUE;
    private boolean y = true;
    private TextPaint e = new TextPaint(1);

    public static /* synthetic */ Canvas a(e eVar, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Canvas) ipChange.ipc$dispatch("70cbe5be", new Object[]{eVar, canvas});
        }
        eVar.b = canvas;
        return canvas;
    }

    public static /* synthetic */ Picture a(e eVar, Picture picture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Picture) ipChange.ipc$dispatch("fde766ba", new Object[]{eVar, picture});
        }
        eVar.c = picture;
        return picture;
    }

    public static /* synthetic */ TextComponent a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextComponent) ipChange.ipc$dispatch("1ae50af4", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5857c65c", new Object[]{eVar, new Boolean(z2)})).booleanValue();
        }
        eVar.j = z2;
        return z2;
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9091ea9f", new Object[]{eVar})).booleanValue() : eVar.f20386a;
    }

    public static /* synthetic */ Layout c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout) ipChange.ipc$dispatch("90e2201f", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ Picture d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Picture) ipChange.ipc$dispatch("9fc7d592", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ Canvas e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Canvas) ipChange.ipc$dispatch("f611ce4d", new Object[]{eVar}) : eVar.b;
    }

    static {
        kge.a(-1866940019);
        if (Build.VERSION.SDK_INT < 18) {
            A = (TextDirectionHeuristic) ohc.a("FIRSTSTRONG_LTR", "android.text.TextDirectionHeuristics");
        } else {
            A = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        B = Build.VERSION.SDK_INT < 23 ? 0 : 1;
    }

    public e() {
    }

    public e(TextComponent textComponent) {
        this.d = textComponent;
    }

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, boolean z2, TextUtils.TruncateAt truncateAt, int i2, int i3) {
        try {
            if (z == null) {
                Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                z = constructor;
                constructor.setAccessible(true);
            }
            return (StaticLayout) z.newInstance(charSequence, 0, Integer.valueOf(charSequence.length()), textPaint, Integer.valueOf(i), alignment, A, Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z2), truncateAt, Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return new StaticLayout(charSequence, textPaint, i, alignment, 1.0f, f2, z2);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public TextUtils.TruncateAt b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextUtils.TruncateAt) ipChange.ipc$dispatch("306cea1f", new Object[]{this}) : this.o;
    }

    public void a(YogaMeasureMode yogaMeasureMode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d99b4", new Object[]{this, yogaMeasureMode, new Float(f)});
            return;
        }
        this.r = yogaMeasureMode;
        this.s = f;
    }

    public YogaMeasureMode c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (YogaMeasureMode) ipChange.ipc$dispatch("23acebce", new Object[]{this}) : this.r;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.s;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (this.e.getAlpha() == i) {
        } else {
            this.e.setAlpha(i);
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e.getAlpha() < 255 ? -3 : -1;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public void a(TextUtils.TruncateAt truncateAt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a334989e", new Object[]{this, truncateAt});
        } else {
            this.o = truncateAt;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        Layout layout = this.k;
        if (layout == null) {
            return 1;
        }
        return Math.min(this.m, layout.getLineCount());
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else if (this.e.getColor() == i) {
        } else {
            this.e.setColor(i);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        TextPaint textPaint = this.e;
        if (textPaint == null) {
            return 1;
        }
        return textPaint.getColor();
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else if (this.w == i) {
        } else {
            this.w = i;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.w;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
            this.e.setUnderlineText(false);
            this.e.setStrikeThruText(false);
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1171789332) {
                if (hashCode == -1026963764 && str.equals("underline")) {
                    c = 1;
                }
            } else if (str.equals("line-through")) {
                c = 0;
            }
            if (c == 0) {
                this.e.setStrikeThruText(true);
            } else if (c != 1) {
            } else {
                this.e.setUnderlineText(true);
            }
        }
    }

    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.l = charSequence;
        if (this.f) {
            float f = this.g;
            while (true) {
                if (f > this.h) {
                    break;
                }
                float textSize = this.e.getTextSize();
                this.e.setTextSize(f);
                Layout layout = this.k;
                w();
                if (this.m == Integer.MAX_VALUE || this.k.getLineCount() <= this.m) {
                    if (this.k.getHeight() <= this.q) {
                        Layout layout2 = this.k;
                        if (layout2.getEllipsisCount(layout2.getLineCount() - 1) <= 0) {
                            f += 1.0f;
                        } else if (layout != null) {
                            this.k = layout;
                            this.e.setTextSize(textSize);
                        }
                    } else if (layout != null) {
                        this.k = layout;
                        this.e.setTextSize(textSize);
                    }
                } else if (layout != null) {
                    this.k = layout;
                    this.e.setTextSize(textSize);
                }
            }
        } else {
            w();
        }
        v();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.i;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (!oeb.aR() || this.k == null || this.d == null || Build.VERSION.SDK_INT < 23 || !((ogk) this.d.getViewParams()).H) {
        } else {
            this.i = true;
            this.j = false;
            ac.a().e().b(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.drawable.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Layout c;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.a(e.this) == null || !e.b(e.this) || (c = e.c(e.this)) == null) {
                    } else {
                        if (e.d(e.this) == null) {
                            e.a(e.this, new Picture());
                        }
                        e eVar = e.this;
                        e.a(eVar, e.d(eVar).beginRecording(c.getWidth(), c.getHeight()));
                        c.draw(e.e(e.this));
                        e.d(e.this).endRecording();
                        e.a(e.this, true);
                        if (e.a(e.this).getView() == 0 && e.a(e.this).getDrawable() == null) {
                            return;
                        }
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.drawable.e.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View] */
                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (e.a(e.this) == null) {
                                } else {
                                    if (e.a(e.this).getView() != 0) {
                                        e.a(e.this).getView().invalidate();
                                    } else if (e.a(e.this).getDrawable() == null) {
                                    } else {
                                        e.a(e.this).getDrawable()[1].invalidateSelf();
                                    }
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public CharSequence j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("4e0e88a9", new Object[]{this}) : this.l;
    }

    public float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue() : this.e.getTextSize();
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.e.setTextSize(f);
        }
    }

    public void a(boolean z2, float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83af95cc", new Object[]{this, new Boolean(z2), new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        this.f = z2;
        if (z2 && (i <= 0 || i2 <= 0)) {
            this.f = false;
        }
        this.g = f;
        this.h = f2;
        this.p = i;
        this.q = i2;
        if (z2) {
            return;
        }
        a(f2);
    }

    public void a(float f, float f2, float f3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cbf3ab", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Integer(i)});
            return;
        }
        this.t = f;
        this.u = f2;
        this.v = f3;
        this.e.setShadowLayer(f, f2, f3, i);
    }

    public Typeface l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("5f641529", new Object[]{this}) : this.e.getTypeface();
    }

    public void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
        } else {
            this.y = z2;
        }
    }

    public void a(Typeface typeface, int i) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487f3a5", new Object[]{this, typeface, new Integer(i)});
            return;
        }
        if (typeface == null) {
            typeface = Typeface.defaultFromStyle(i);
        }
        if (this.e.getTypeface() != typeface) {
            this.e.setTypeface(typeface);
        }
        float f = 0.0f;
        if (i > 0) {
            int i2 = (~(typeface != null ? typeface.getStyle() : 0)) & i;
            TextPaint textPaint = this.e;
            if ((i2 & 1) == 0) {
                z2 = false;
            }
            textPaint.setFakeBoldText(z2);
            TextPaint textPaint2 = this.e;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.e.setFakeBoldText(false);
        this.e.setTextSkewX(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w() {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.drawable.e.w():void");
    }

    public Layout m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout) ipChange.ipc$dispatch("56c15c59", new Object[]{this}) : this.k;
    }

    public Picture n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Picture) ipChange.ipc$dispatch("6c8af6f6", new Object[]{this});
        }
        if (!this.j) {
            return null;
        }
        return this.c;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.k.getWidth();
    }

    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.k.getHeight();
    }

    public ReplacementSpan q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReplacementSpan) ipChange.ipc$dispatch("b316451", new Object[]{this});
        }
        CharSequence charSequence = this.l;
        if (!(charSequence instanceof ofu)) {
            return null;
        }
        return ((ofu) charSequence).a();
    }

    private static int a(String str, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123967e", new Object[]{str, new Character(c)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    private Layout.Alignment x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("d16b25e5", new Object[]{this});
        }
        int i = this.w;
        if (i == 17) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i == 8388611) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (i == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public float r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbe9", new Object[]{this})).floatValue() : this.u;
    }

    public float s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136a", new Object[]{this})).floatValue() : this.v;
    }

    public float t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aeb", new Object[]{this})).floatValue() : this.t;
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        Picture picture = this.c;
        if (picture != null && this.j) {
            picture.draw(canvas);
            return;
        }
        Layout layout = this.k;
        if (layout == null) {
            return;
        }
        layout.draw(canvas);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.f20386a = false;
        this.k = null;
        this.c = null;
        this.e = null;
        this.d = null;
    }
}
