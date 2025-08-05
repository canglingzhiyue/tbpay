package com.taobao.search.m3.price;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class M3PriceView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int commonTextColor;
    private static final float commonTextSize;
    private static final int itemMargin;
    private static final Typeface priceTypeface;
    private static final int rightPadding;
    private static final int soldColor2024;
    private static final int textPaddingBottom;
    private final g comment;
    private final f commentPart;
    private e currentPrice;
    private final ArrayList<f> drawList;
    private ArrayList<f> drawListWithPriority;
    private boolean hasIcon;
    private final c icon;
    private final f iconPart;
    private final g location;
    private final f locationPart;
    private int measureHeight;
    private final g originPrice;
    private final f originPricePart;
    private final g preText;
    private final f preTextPart;
    private final com.taobao.search.m3.price.a price;
    private final f pricePart;
    private final g sold;
    private final f soldPart;
    private final g subText;
    private final f subTextPart;
    private final g suffixText;
    private final f suffixTextPart;
    private final boolean waterfall;

    public static /* synthetic */ Object ipc$super(M3PriceView m3PriceView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public static final class b<T> implements Comparator<f> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.util.Comparator
        public /* synthetic */ int compare(f fVar, f fVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, fVar, fVar2})).intValue() : a(fVar, fVar2);
        }

        public final int a(f fVar, f fVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4690da3", new Object[]{this, fVar, fVar2})).intValue() : fVar2.b() - fVar.b();
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-686858379);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : M3PriceView.access$getTextPaddingBottom$cp();
        }

        public final Typeface b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("8e4c429f", new Object[]{this}) : M3PriceView.access$getPriceTypeface$cp();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3PriceView(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.waterfall = z;
        M3PriceView m3PriceView = this;
        this.icon = new c(m3PriceView);
        this.iconPart = new f(this.icon, 3, false);
        this.preText = new g(m3PriceView);
        this.preTextPart = new f(this.preText, 99, false);
        this.price = new com.taobao.search.m3.price.a(m3PriceView);
        this.pricePart = new f(this.price, 100, true);
        this.suffixText = new g(m3PriceView);
        this.suffixTextPart = new f(this.suffixText, 2, false);
        this.subText = new g(m3PriceView);
        this.subTextPart = new f(this.subText, 4, false);
        this.originPrice = new g(m3PriceView);
        this.originPricePart = new f(this.originPrice, 0, false);
        this.sold = new g(m3PriceView);
        this.soldPart = new f(this.sold, 5, false);
        this.comment = new g(m3PriceView);
        this.commentPart = new f(this.comment, 2, false);
        this.location = new g(m3PriceView);
        this.locationPart = new f(this.location, 1, false);
        this.drawList = new ArrayList<>(9);
        this.drawListWithPriority = new ArrayList<>(9);
    }

    public static final /* synthetic */ Typeface access$getPriceTypeface$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("d95dea44", new Object[0]) : priceTypeface;
    }

    public static final /* synthetic */ int access$getTextPaddingBottom$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1fc5a172", new Object[0])).intValue() : textPaddingBottom;
    }

    static {
        kge.a(1525504109);
        Companion = new a(null);
        itemMargin = l.a(4.5f);
        commonTextSize = l.a(12.0f);
        commonTextColor = Color.parseColor("#999999");
        textPaddingBottom = l.a(0.5f);
        Application application = Globals.getApplication();
        q.a((Object) application, "Globals.getApplication()");
        Typeface createFromAsset = Typeface.createFromAsset(application.getAssets(), com.taobao.tab2interact.core.utils.e.ALI_SANS_TYPEFACE_ASSET_PATH);
        q.a((Object) createFromAsset, "Typeface.createFromAsset…Bao-Bd.ttf\"\n            )");
        priceTypeface = createFromAsset;
        rightPadding = l.a(11.0f);
        soldColor2024 = Color.parseColor("#50607A");
    }

    public final void update(e priceInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309632df", new Object[]{this, priceInfo, new Boolean(z)});
            return;
        }
        q.c(priceInfo, "priceInfo");
        if (priceInfo == this.currentPrice) {
            return;
        }
        reset();
        this.hasIcon = false;
        this.currentPrice = priceInfo;
        releaseIcon();
        this.drawList.clear();
        this.drawListWithPriority.clear();
        renderIcon(priceInfo);
        renderPreText(priceInfo);
        renderPrice(priceInfo);
        renderSuffix(priceInfo);
        renderSubText(priceInfo);
        renderOriginPrice(priceInfo);
        renderSale(priceInfo, z);
        renderComment(priceInfo);
        renderLocation(priceInfo);
        commit();
        requestLayout();
    }

    private final void addToDrawList(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e097d009", new Object[]{this, fVar});
            return;
        }
        this.drawList.add(fVar);
        this.drawListWithPriority.add(fVar);
    }

    private final void renderComment(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd741b5", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(eVar.k())) {
        } else {
            g gVar = this.comment;
            String k = eVar.k();
            if (k == null) {
                q.a();
            }
            gVar.a(k, commonTextColor, commonTextSize);
            addToDrawList(this.commentPart);
        }
    }

    private final void renderLocation(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b25c0b7", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(eVar.l())) {
        } else {
            g gVar = this.location;
            String l = eVar.l();
            if (l == null) {
                q.a();
            }
            gVar.a(l, commonTextColor, commonTextSize);
            addToDrawList(this.locationPart);
        }
    }

    private final void renderSale(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4702e42b", new Object[]{this, eVar, new Boolean(z)});
        } else if (TextUtils.isEmpty(eVar.j())) {
        } else {
            g gVar = this.sold;
            String j = eVar.j();
            if (j == null) {
                q.a();
            }
            gVar.a(j, z ? soldColor2024 : commonTextColor, commonTextSize);
            addToDrawList(this.soldPart);
        }
    }

    private final void renderOriginPrice(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765f7f19", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(eVar.h())) {
        } else {
            g gVar = this.originPrice;
            String h = eVar.h();
            if (h == null) {
                q.a();
            }
            gVar.a(h, commonTextColor, commonTextSize, eVar.i());
            addToDrawList(this.originPricePart);
        }
    }

    private final void renderSubText(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae9df63", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(eVar.f())) {
        } else {
            g gVar = this.subText;
            String f = eVar.f();
            if (f == null) {
                q.a();
            }
            Integer g = eVar.g();
            gVar.a(f, g != null ? g.intValue() : commonTextColor, commonTextSize);
            addToDrawList(this.subTextPart);
        }
    }

    private final void renderSuffix(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656a46d3", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(eVar.d())) {
        } else {
            g gVar = this.suffixText;
            String d = eVar.d();
            if (d == null) {
                q.a();
            }
            Integer e = eVar.e();
            gVar.a(d, e != null ? e.intValue() : commonTextColor, commonTextSize);
            addToDrawList(this.suffixTextPart);
        }
    }

    private final void renderIcon(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8848b77b", new Object[]{this, eVar});
        } else if (eVar.a() == null) {
        } else {
            this.hasIcon = true;
            this.icon.a(eVar);
            addToDrawList(this.iconPart);
        }
    }

    private final void renderPrice(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d0049f", new Object[]{this, eVar});
        } else if (eVar.c() == null) {
        } else {
            this.price.a(eVar.c());
            addToDrawList(this.pricePart);
        }
    }

    private final void renderPreText(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab27186", new Object[]{this, eVar});
        } else if (TextUtils.isEmpty(eVar.b()) || TextUtils.isEmpty(eVar.b())) {
        } else {
            g gVar = this.preText;
            String b2 = eVar.b();
            if (b2 == null) {
                q.a();
            }
            gVar.a(b2, commonTextColor, commonTextSize);
            addToDrawList(this.preTextPart);
        }
    }

    private final void releaseIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470471a7", new Object[]{this});
        } else if (!this.hasIcon) {
        } else {
            this.icon.b();
        }
    }

    private final void loadIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076bf86", new Object[]{this});
            return;
        }
        e eVar = this.currentPrice;
        if (eVar == null || !this.hasIcon) {
            return;
        }
        c cVar = this.icon;
        if (eVar == null) {
            q.a();
        }
        cVar.a(eVar);
    }

    private final void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            p.a((List) this.drawListWithPriority, (Comparator) b.INSTANCE);
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int c;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
        } else if (this.currentPrice != null) {
            int measuredWidth = getMeasuredWidth();
            if (this.waterfall) {
                measuredWidth -= rightPadding;
            }
            int size = this.drawListWithPriority.size();
            int i2 = measuredWidth;
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.drawListWithPriority.get(i3);
                q.a((Object) fVar, "drawListWithPriority[index]");
                f fVar2 = fVar;
                fVar2.a(false);
                if (i3 == 0) {
                    fVar2.a(true);
                    com.taobao.search.m3.price.b a2 = fVar2.a();
                    e eVar = this.currentPrice;
                    if (eVar == null) {
                        q.a();
                    }
                    a2.a(eVar);
                    c = i2 - fVar2.a().c();
                    i = itemMargin;
                } else if (i2 >= fVar2.a().c()) {
                    fVar2.a(true);
                    com.taobao.search.m3.price.b a3 = fVar2.a();
                    e eVar2 = this.currentPrice;
                    if (eVar2 == null) {
                        q.a();
                    }
                    a3.a(eVar2);
                    c = i2 - fVar2.a().c();
                    i = itemMargin;
                } else {
                    fVar2.a().b();
                }
                i2 = c - i;
            }
            this.measureHeight = this.price.a();
            setMeasuredDimension(getMeasuredWidth(), this.measureHeight);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        Iterator<f> it = this.drawList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f next = it.next();
            if (next.c()) {
                next.a().a(canvas);
                canvas.translate(next.a().c() + itemMargin, 0.0f);
                f += next.a().c() + itemMargin;
            }
        }
        canvas.translate(-f, 0.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        loadIcon();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseIcon();
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : this.measureHeight;
    }
}
