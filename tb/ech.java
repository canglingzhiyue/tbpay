package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.DetailViewPager;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.k;
import com.taobao.android.sku.utils.m;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.d;
import com.taobao.pexode.e;
import com.taobao.phenix.animate.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.File;

/* loaded from: classes4.dex */
public class ech implements DetailViewPager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f27186a;
    private View b = c();
    private int c;
    private int d;
    private float e;
    private float f;
    private DetailCoreActivity g;
    private ViewGroup h;
    private eci i;
    private Vibrator j;
    private boolean k;
    private float l;
    private float m;
    private TextView n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(byte[] bArr);
    }

    static {
        kge.a(778413472);
        kge.a(853391996);
    }

    public static /* synthetic */ int a(ech echVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e691c301", new Object[]{echVar})).intValue() : echVar.c;
    }

    public static /* synthetic */ void a(ech echVar, boolean z, byte[] bArr, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136bc5d6", new Object[]{echVar, new Boolean(z), bArr, aVar});
        } else {
            echVar.a(z, bArr, aVar);
        }
    }

    public ech(DetailCoreActivity detailCoreActivity, eci eciVar, ViewGroup viewGroup) {
        this.g = detailCoreActivity;
        this.h = viewGroup;
        this.i = eciVar;
        this.j = (Vibrator) detailCoreActivity.getSystemService("vibrator");
        this.f27186a = m.a(this.g, 14.0f);
        emu.a("com.taobao.android.detail.core.detail.shop.DragToShopInterceptor");
    }

    @Override // com.taobao.android.detail.core.detail.widget.DetailViewPager.a
    public void a(int i, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6071f0", new Object[]{this, new Integer(i), motionEvent});
            return;
        }
        final View c = c();
        if (motionEvent.getAction() == 2) {
            c.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) (this.c - (a(Math.abs(this.l)) * this.e));
                c.setLayoutParams(layoutParams);
            }
            if (Math.abs(this.l) / this.c >= 0.3f) {
                z = true;
            }
            if (!this.k && z) {
                b();
                this.k = true;
            }
            this.n.setText(z ? "松\n开\n手\n指\n \n进\n店\n逛\n逛" : "向\n左\n滑\n动\n \n进\n店\n逛\n逛");
            return;
        }
        if (this.l / this.c < -0.3f) {
            this.i.c();
            ecf.f(this.g, this.i.d());
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(c, "alpha", 1.0f, 0.0f).setDuration(200L);
        duration.addListener(new AnimatorListenerAdapter() { // from class: tb.ech.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = c.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = ech.a(ech.this);
                }
                c.setVisibility(8);
                c.setAlpha(1.0f);
            }
        });
        duration.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r8 != 3) goto L11;
     */
    @Override // com.taobao.android.detail.core.detail.widget.DetailViewPager.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(int r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ech.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L24
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r6
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r1[r5] = r2
            r1[r3] = r8
            java.lang.String r7 = "a690b1d3"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L24:
            float r0 = r8.getX()
            int r8 = r8.getAction()
            r1 = 0
            if (r8 == 0) goto L5e
            if (r8 == r5) goto L55
            if (r8 == r3) goto L36
            if (r8 == r2) goto L55
            goto L62
        L36:
            float r8 = r6.m
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r2 != 0) goto L41
            r6.m = r0
            r6.k = r4
            goto L62
        L41:
            float r2 = r6.l
            float r8 = r0 - r8
            float r2 = r2 + r8
            r6.l = r2
            r6.m = r0
            if (r7 == r5) goto L4e
            if (r7 != r3) goto L62
        L4e:
            float r7 = r6.l
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L62
            return r5
        L55:
            r6.m = r1
            float r7 = r6.l
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 == 0) goto L62
            return r5
        L5e:
            r6.m = r0
            r6.k = r4
        L62:
            r6.l = r1
            android.view.View r7 = r6.b
            if (r7 == 0) goto L6d
            r8 = 8
            r7.setVisibility(r8)
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ech.b(int, android.view.MotionEvent):boolean");
    }

    @Override // com.taobao.android.detail.core.detail.widget.DetailViewPager.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.m = 0.0f;
        this.k = false;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.j.hasVibrator()) {
        } else {
            this.j.vibrate(100L);
        }
    }

    private View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        View view = this.b;
        if (view != null) {
            return view;
        }
        if (this.c == 0) {
            this.c = this.h.getWidth();
            this.e = this.c * 0.15f;
        }
        if (this.d == 0) {
            this.d = this.h.getHeight();
            this.f = this.d * 0.65f;
        }
        View inflate = LayoutInflater.from(this.g).inflate(R.layout.x_detail_drag_to_shop_view, this.h, true);
        View findViewById = inflate.findViewById(R.id.intent_container);
        this.n = (TextView) inflate.findViewById(R.id.tv_tips);
        final TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_anim);
        ((TUrlImageView) inflate.findViewById(R.id.iv_background)).setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01rSjVoz1vL2fKVIeLb_!!6000000006155-2-tps-188-1560.png");
        a("https://gw.alicdn.com/imgextra/i3/O1CN01dewDaD1DlIGzgh9Ng_!!6000000000256-54-tps-40-40.apng", new a() { // from class: tb.ech.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ech.a
            public void a(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                    return;
                }
                i.d("DragToShopInterceptor", "getApngSuccess");
                try {
                    e a2 = d.a(bArr, 0, bArr.length, new PexodeOptions());
                    if (a2.b == null) {
                        return;
                    }
                    tUrlImageView.setImageDrawable(new b(a2.b));
                } catch (Exception e) {
                    i.a("DragToShopInterceptor", "getApngArrowDrawable error : ", e);
                    tUrlImageView.setVisibility(8);
                }
            }

            @Override // tb.ech.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    tUrlImageView.setVisibility(8);
                }
            }
        });
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((int) this.e, (int) this.f);
        if (this.h instanceof RelativeLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 16;
            layoutParams2.leftMargin = this.c;
            layoutParams = layoutParams2;
        }
        findViewById.setLayoutParams(layoutParams);
        this.b = findViewById;
        return this.b;
    }

    private void a(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77265afb", new Object[]{this, str, aVar});
            return;
        }
        File filesDir = this.g.getFilesDir();
        final File file = new File(filesDir, "detail" + File.separator + "drag_to_shop_arrow.apng");
        byte[] bArr = null;
        if (file.exists()) {
            bArr = k.b(file.getAbsolutePath());
        }
        if (bArr != null) {
            aVar.a(bArr);
        } else {
            knd.a(new Runnable() { // from class: tb.ech.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    byte[] a2 = com.taobao.android.detail.core.detail.kit.utils.e.a(str);
                    if (a2 == null) {
                        ech.a(ech.this, false, null, aVar);
                        return;
                    }
                    k.c(file.getAbsolutePath());
                    k.a(file, a2);
                    ech.a(ech.this, true, a2, aVar);
                }
            }, false);
        }
    }

    private void a(final boolean z, final byte[] bArr, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e49ebc", new Object[]{this, new Boolean(z), bArr, aVar});
        } else {
            knd.a(new Runnable() { // from class: tb.ech.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (z) {
                        aVar.a(bArr);
                    } else {
                        aVar.a();
                    }
                }
            }, true);
        }
    }

    private float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = f / this.c;
        float f3 = this.e;
        int i = this.f27186a;
        float f4 = f3 - i;
        return f2 <= 0.3f ? ((f4 / f3) / 0.3f) * f2 : (((i / f3) / 0.7f) * (f2 - 0.3f)) + (f4 / f3);
    }
}
