package com.taobao.search.m3.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.r;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.searchdoor.sf.config.TbSearchStyleCard;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class M3ImageView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String defP4pIcon = "https://gw.alicdn.com/mt/TB1_KoL7oH1gK0jSZSyXXXtlpXa-48-48.png";
    private static final int defP4pSize;
    private static float limitScale = 0.0f;
    private static final int maskColOr;
    private static final float radius;
    private static final int rightBottomIconHeight;
    private static final int rightBottomIconWidth;
    private static final String rightBottomP4pImg = "https://img.alicdn.com/imgextra/i3/O1CN01HPmvQK24XFngDb2qa_!!6000000007400-2-tps-76-44.png";
    private float currentRadius;
    private TbSearchStyle currentStyle;
    private Runnable delayTask;
    private boolean hasRightBottomIcon;
    private final com.taobao.search.m3.d hotIcon;
    private i lastP4pIcon;
    private d.a lastTarget;
    private String lastUrl;
    private e leftScriptIcon;
    private Drawable loadedImage;
    private final boolean matchParent;
    private final h newDateIcon;
    private boolean p4pIconBottomLeft;
    private int p4pIconHeight;
    private String p4pIconUrl;
    private int p4pIconWidth;
    private final float photoScale;
    private float ratio;
    private final com.taobao.search.m3.d rightBottomIcon;
    private int serverP4pIconHeight;
    private int serverP4pIconWidth;
    private final boolean wf;

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.android.weex_framework.adapter.d b;
        public final /* synthetic */ String c;
        public final /* synthetic */ d.a d;

        public c(com.taobao.android.weex_framework.adapter.d dVar, String str, d.a aVar) {
            this.b = dVar;
            this.c = str;
            this.d = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.a(M3ImageView.this.getContext(), this.c, this.d, MUSImageQuality.AUTO);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(M3ImageView m3ImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @JvmStatic
    public static final void updateLimitScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd43207f", new Object[0]);
        } else {
            Companion.d();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(M3ImageView m3ImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54e293f6", new Object[]{m3ImageView})).floatValue() : m3ImageView.currentRadius;
    }

    public static final /* synthetic */ float access$getLimitScale$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a682f4e3", new Object[0])).floatValue() : limitScale;
    }

    public static final /* synthetic */ int access$getMaskColOr$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e0d153ea", new Object[0])).intValue() : maskColOr;
    }

    public static final /* synthetic */ float access$getPhotoScale$p(M3ImageView m3ImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b69702f", new Object[]{m3ImageView})).floatValue() : m3ImageView.photoScale;
    }

    public static final /* synthetic */ float access$getRadius$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33f3c640", new Object[0])).floatValue() : radius;
    }

    public static final /* synthetic */ void access$setCurrentRadius$p(M3ImageView m3ImageView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22a8786", new Object[]{m3ImageView, new Float(f)});
        } else {
            m3ImageView.currentRadius = f;
        }
    }

    public static final /* synthetic */ void access$setLimitScale$cp(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1079339", new Object[]{new Float(f)});
        } else {
            limitScale = f;
        }
    }

    public static final /* synthetic */ void access$setLoadedImage$p(M3ImageView m3ImageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44091549", new Object[]{m3ImageView, drawable});
        } else {
            m3ImageView.loadedImage = drawable;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3ImageView(Context context, boolean z, boolean z2) {
        super(context);
        q.c(context, "context");
        this.wf = z;
        this.matchParent = z2;
        this.ratio = 1.0f;
        this.photoScale = r.ao();
        M3ImageView m3ImageView = this;
        this.hotIcon = new com.taobao.search.m3.d(m3ImageView, null, 2, null);
        this.newDateIcon = new h(m3ImageView);
        this.rightBottomIcon = new com.taobao.search.m3.d(m3ImageView, null, 2, null);
        this.p4pIconWidth = rightBottomIconWidth;
        this.p4pIconHeight = rightBottomIconHeight;
        this.leftScriptIcon = new e(m3ImageView, this.wf);
        this.currentRadius = radius;
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.image.M3ImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                q.c(view, "view");
                q.c(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), M3ImageView.access$getCurrentRadius$p(M3ImageView.this));
            }
        });
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1785491815);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : M3ImageView.access$getRadius$cp();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : M3ImageView.access$getMaskColOr$cp();
        }

        public final void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                M3ImageView.access$setLimitScale$cp(f);
            }
        }

        public final float c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : M3ImageView.access$getLimitScale$cp();
        }

        @JvmStatic
        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
            q.a((Object) downgradeStrategy, "downgradeStrategy");
            if (!q.a((Object) "degrade", (Object) downgradeStrategy.getTacticsPerformance())) {
                return;
            }
            a(r.at());
        }
    }

    static {
        kge.a(-1050188655);
        Companion = new a(null);
        radius = l.a(12.0f);
        defP4pSize = l.a(24.0f);
        rightBottomIconWidth = l.a(21.0f);
        rightBottomIconHeight = l.a(12.0f);
        maskColOr = Color.argb(5, 0, 0, 0);
        limitScale = 1.0f;
        Companion.d();
    }

    public final void resetRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb36283", new Object[]{this});
        } else {
            this.ratio = 0.0f;
        }
    }

    private final boolean isSame(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6dfcf7b", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : Math.abs(f - f2) < 1.0E-6f;
    }

    public final void setImageUrl(String url, float f, TbSearchStyle tbSearchStyle) {
        TbSearchStyleCard tbSearchStyleCard;
        float f2;
        Float f3;
        TbSearchStyleCard tbSearchStyleCard2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a73a3", new Object[]{this, url, new Float(f), tbSearchStyle});
            return;
        }
        q.c(url, "url");
        this.currentStyle = tbSearchStyle;
        if (this.wf) {
            if (tbSearchStyle != null && (tbSearchStyleCard2 = tbSearchStyle.card) != null) {
                f2 = tbSearchStyleCard2.wfImgRounded;
                f3 = Float.valueOf(f2);
            }
            f3 = null;
        } else {
            if (tbSearchStyle != null && (tbSearchStyleCard = tbSearchStyle.card) != null) {
                f2 = tbSearchStyleCard.listImgRounded;
                f3 = Float.valueOf(f2);
            }
            f3 = null;
        }
        this.currentRadius = f3 != null ? f3.floatValue() : radius;
        if (q.a((Object) this.lastUrl, (Object) url) && isSame(this.ratio, f) && this.lastTarget != null) {
            return;
        }
        this.lastUrl = url;
        this.delayTask = null;
        if (this.ratio != f) {
            this.ratio = f;
            requestLayout();
        } else {
            z = false;
        }
        com.taobao.android.weex_framework.l a2 = com.taobao.android.weex_framework.l.a();
        q.a((Object) a2, "MUSDKManager.getInstance()");
        com.taobao.android.weex_framework.adapter.d f4 = a2.f();
        if (f4 == null) {
            return;
        }
        releaseImage(f4);
        this.lastTarget = new b();
        if (StringUtils.isEmpty(url)) {
            setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            return;
        }
        setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        if (getMeasuredWidth() > 0 && !z) {
            f4.a(getContext(), url, this.lastTarget, MUSImageQuality.AUTO);
        } else {
            this.delayTask = new c(f4, url, this.lastTarget);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.search.musie.img.c
        public int l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : (int) (M3ImageView.this.getMeasuredWidth() / M3ImageView.Companion.c());
        }

        @Override // com.taobao.search.musie.img.c
        public int m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : (int) (M3ImageView.this.getMeasuredHeight() / M3ImageView.Companion.c());
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                return;
            }
            M3ImageView.access$setLoadedImage$p(M3ImageView.this, drawable);
            M3ImageView.this.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            M3ImageView.this.setImageDrawable(drawable);
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) (M3ImageView.this.getMeasuredWidth() * M3ImageView.access$getPhotoScale$p(M3ImageView.this));
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (int) (M3ImageView.this.getMeasuredHeight() * M3ImageView.access$getPhotoScale$p(M3ImageView.this));
        }
    }

    public final void updateHotIcon(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ab7ad3", new Object[]{this, iVar});
        } else if (iVar == this.lastP4pIcon) {
        } else {
            this.lastP4pIcon = iVar;
            this.hotIcon.a();
            loadHotIcon();
        }
    }

    public final void updateNewDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc48936", new Object[]{this, str});
        } else {
            this.newDateIcon.a(str);
        }
    }

    public final void updateLeftScriptIcon(com.taobao.search.m3.image.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295e32e4", new Object[]{this, cVar, new Boolean(z)});
        } else {
            this.leftScriptIcon.a(cVar, z);
        }
    }

    public final void updateRightBottomP4pIcon(boolean z, String str, int i, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8679a9a4", new Object[]{this, new Boolean(z), str, new Integer(i), new Integer(i2), new Boolean(z2)});
            return;
        }
        if (this.p4pIconBottomLeft != z2) {
            this.p4pIconBottomLeft = z2;
            invalidate();
        }
        if (this.hasRightBottomIcon == z && q.a((Object) this.p4pIconUrl, (Object) str) && this.serverP4pIconWidth == i && this.serverP4pIconHeight == i2) {
            return;
        }
        this.hasRightBottomIcon = z;
        this.p4pIconUrl = str;
        this.serverP4pIconWidth = i;
        this.serverP4pIconHeight = i2;
        int i3 = this.serverP4pIconWidth;
        this.p4pIconWidth = i3 > 0 ? l.a(i3) : rightBottomIconWidth;
        int i4 = this.serverP4pIconHeight;
        this.p4pIconHeight = i4 > 0 ? l.a(i4) : rightBottomIconHeight;
        this.rightBottomIcon.a();
        loadBottomP4p();
    }

    private final void loadBottomP4p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e011c2", new Object[]{this});
        } else if (!this.hasRightBottomIcon) {
        } else {
            this.rightBottomIcon.a(StringUtils.isEmpty(this.p4pIconUrl) ? rightBottomP4pImg : this.p4pIconUrl, this.p4pIconWidth, this.p4pIconHeight);
        }
    }

    private final void loadHotIcon() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe2f27", new Object[]{this});
            return;
        }
        int i2 = defP4pSize;
        String str = defP4pIcon;
        i iVar = this.lastP4pIcon;
        if (iVar != null) {
            if (!StringUtils.isEmpty(iVar.a()) && (str = iVar.a()) == null) {
                q.a();
            }
            int a2 = iVar.b() > 0 ? l.a(iVar.b()) : i2;
            if (iVar.c() > 0) {
                i2 = l.a(iVar.c());
            }
            i = i2;
            i2 = a2;
        } else {
            i = i2;
        }
        this.hotIcon.a(str, i2, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        super.onDraw(canvas);
        if (!StringUtils.isEmpty(this.lastUrl)) {
            canvas.drawColor(maskColOr);
        }
        if (this.lastP4pIcon != null) {
            this.hotIcon.a(canvas);
        } else {
            this.newDateIcon.a(canvas);
        }
        this.leftScriptIcon.a(canvas);
        if (!this.hasRightBottomIcon) {
            return;
        }
        float measuredHeight = getMeasuredHeight() - this.p4pIconHeight;
        float measuredWidth = this.p4pIconBottomLeft ? 0.0f : getMeasuredWidth() - this.p4pIconWidth;
        canvas.translate(measuredWidth, measuredHeight);
        this.rightBottomIcon.a(canvas);
        canvas.translate(-measuredWidth, -measuredHeight);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, this.matchParent ? View.MeasureSpec.getSize(i2) : (int) (size / this.ratio));
        Runnable runnable = this.delayTask;
        if (runnable != null) {
            runnable.run();
        }
        this.delayTask = null;
        this.newDateIcon.a();
        this.leftScriptIcon.o();
    }

    private final void releaseImage(com.taobao.android.weex_framework.adapter.d dVar) {
        d.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2016c59e", new Object[]{this, dVar});
        } else if (dVar == null || (aVar = this.lastTarget) == null) {
        } else {
            dVar.a("", aVar);
            this.lastTarget = null;
            Drawable drawable = this.loadedImage;
            if (drawable == null) {
                return;
            }
            dVar.a(drawable, aVar);
            setImageDrawable(null);
            this.loadedImage = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && !StringUtils.isEmpty(this.lastUrl)) {
            String str = this.lastUrl;
            if (str == null) {
                q.a();
            }
            setImageUrl(str, this.ratio, this.currentStyle);
        }
        if (this.lastP4pIcon != null) {
            loadHotIcon();
        }
        loadBottomP4p();
        this.newDateIcon.b();
        this.leftScriptIcon.m();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        com.taobao.android.weex_framework.l a2 = com.taobao.android.weex_framework.l.a();
        q.a((Object) a2, "MUSDKManager.getInstance()");
        releaseImage(a2.f());
        this.hotIcon.a();
        this.rightBottomIcon.a();
        this.newDateIcon.c();
        this.leftScriptIcon.n();
    }
}
