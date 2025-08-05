package com.taobao.search.m3.shoinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.mmd.uikit.shopinfo.e;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class ShopInfoView extends BaseItemView implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int bgColor;
    private static final int bgPadding;
    private static final int bgRadius;
    private static final int darkBgColor;
    private static final int darkTxtColor;
    private static float iconWidth = 0.0f;
    private static final float shopTextSize;
    private static final int shopTextSizeOrigin = 12;
    private static final int tb2024ViewHeight;
    private static final int viewHeight;
    private b currentBean;
    private List<e> drawList;
    private boolean hasBackground;
    private final TextPaint iconPaint;
    private com.taobao.search.m3.shoinfo.a listener;
    private final com.taobao.search.mmd.uikit.shopinfo.a shopBackground;
    private final com.taobao.search.mmd.uikit.shopinfo.b shopDrawable;
    private final TextPaint shopInfoPaint;
    private boolean tb2024;

    public static /* synthetic */ Object ipc$super(ShopInfoView shopInfoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(1964071309);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public ShopInfoView(Context context) {
        super(context);
        int i = bgColor;
        int i2 = bgRadius;
        int i3 = bgPadding;
        this.shopBackground = new com.taobao.search.mmd.uikit.shopinfo.a(i, i2, i3, i3);
        this.shopDrawable = new com.taobao.search.mmd.uikit.shopinfo.b();
        this.iconPaint = new TextPaint(1);
        this.shopInfoPaint = new TextPaint(1);
        this.hasBackground = true;
        this.iconPaint.setTypeface(com.taobao.search.mmd.uikit.shopinfo.b.b);
        this.iconPaint.setTextSize(shopTextSize);
        this.shopInfoPaint.setTextSize(shopTextSize);
        this.shopDrawable.setCallback(this);
        setOnClickListener(this);
    }

    static {
        kge.a(354717829);
        kge.a(-1201612728);
        Companion = new a(null);
        viewHeight = l.a(20.0f);
        tb2024ViewHeight = l.a(16.0f);
        bgRadius = l.a(10.5f);
        bgPadding = l.a(6.0f);
        bgColor = Color.parseColor("#f7f7f7");
        darkBgColor = Color.parseColor("#333333");
        darkTxtColor = Color.parseColor("#aaaaaa");
        shopTextSize = l.a(12);
    }

    public final void update(b bean, com.taobao.search.m3.shoinfo.a listener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e412eef1", new Object[]{this, bean, listener, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        this.tb2024 = z;
        this.listener = listener;
        if (this.currentBean == bean) {
            return;
        }
        reset();
        this.currentBean = bean;
        if (bean.d()) {
            this.shopDrawable.a(this.shopBackground);
            this.hasBackground = true;
        } else {
            this.shopDrawable.a((com.taobao.search.mmd.uikit.shopinfo.a) null);
            this.hasBackground = false;
        }
        Context context = getContext();
        if (!(context instanceof f)) {
            context = null;
        }
        f fVar = (f) context;
        if (fVar != null && fVar.g()) {
            ah.a(this);
            this.shopBackground.a(darkBgColor);
        } else {
            this.shopBackground.a(bgColor);
        }
        requestLayout();
        setContentDescription(bean.e());
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        updateDrawList(this.tb2024);
        this.shopDrawable.a(this.drawList);
        this.shopDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private final boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        if (!(context instanceof f)) {
            context = null;
        }
        f fVar = (f) context;
        return fVar != null && fVar.g();
    }

    private final void updateDrawList(boolean z) {
        int intValue;
        int i;
        int i2;
        float[] fArr;
        int intValue2;
        int intValue3;
        int d;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b999a622", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.drawList = null;
        b bVar = this.currentBean;
        if (bVar == null) {
            return;
        }
        this.drawList = new ArrayList();
        String str = z2 ? com.taobao.search.mmd.uikit.shopinfo.b.j : com.taobao.search.mmd.uikit.shopinfo.b.c;
        if (iconWidth == 0.0f) {
            iconWidth = this.iconPaint.measureText(str);
        }
        int measuredWidth = (int) (getMeasuredWidth() - iconWidth);
        int i3 = this.hasBackground ? bgPadding : 0;
        int i4 = measuredWidth - (i3 * 2);
        float calculateBaseline = calculateBaseline(this.shopInfoPaint, getMeasuredHeight());
        int i5 = z2 ? com.taobao.search.mmd.uikit.shopinfo.b.k : com.taobao.search.mmd.uikit.shopinfo.b.f;
        float[] fArr2 = new float[1];
        int size = bVar.c().size();
        int i6 = i3;
        int i7 = i4;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            c cVar = bVar.c().get(i8);
            if (!TextUtils.isEmpty(cVar.f()) && cVar.d() > 0 && cVar.e() > 0) {
                int d2 = (int) ((cVar.d() / cVar.e()) * (z2 ? com.taobao.search.mmd.uikit.shopinfo.b.l : rwf.d(com.taobao.search.mmd.uikit.shopinfo.b.g, getMeasuredHeight())));
                if (d2 <= i7) {
                    e eVar = new e(this.iconPaint, z3);
                    int measuredHeight = (int) ((getMeasuredHeight() - d) / 2.0f);
                    eVar.a(i6, measuredHeight, i6 + d2, getMeasuredHeight() - measuredHeight);
                    eVar.a(cVar.f(), d2, getContext());
                    int i9 = d2 + i5;
                    i7 -= i9;
                    i6 += i9;
                    List<e> list = this.drawList;
                    if (list == null) {
                        q.a();
                    }
                    list.add(eVar);
                    i2 = size;
                    fArr = fArr2;
                }
                i = i6;
                i2 = size;
                fArr = fArr2;
                i6 = i;
            } else {
                if (!TextUtils.isEmpty(cVar.b())) {
                    float measureText = this.shopInfoPaint.measureText(cVar.b());
                    float f = i7;
                    if (measureText <= f) {
                        e eVar2 = new e(this.shopInfoPaint, false);
                        if (isDarkMode()) {
                            intValue3 = darkTxtColor;
                        } else {
                            Integer a2 = cVar.a();
                            intValue3 = a2 != null ? a2.intValue() : com.taobao.search.mmd.uikit.shopinfo.b.d;
                        }
                        int i10 = i6;
                        i2 = size;
                        int i11 = intValue3;
                        fArr = fArr2;
                        eVar2.a(cVar.b(), calculateBaseline, i11, 12, false);
                        eVar2.a(i10, 0, 0, 0);
                        List<e> list2 = this.drawList;
                        if (list2 == null) {
                            q.a();
                        }
                        list2.add(eVar2);
                        int i12 = (int) (measureText + i5);
                        i6 = i10 + i12;
                        i7 -= i12;
                    } else {
                        i = i6;
                        i2 = size;
                        fArr = fArr2;
                        if (TextUtils.equals(Constants.Name.SUFFIX, cVar.c())) {
                            float measureText2 = this.shopInfoPaint.measureText("...");
                            int breakText = this.shopInfoPaint.breakText(cVar.b(), true, f - measureText2, fArr);
                            if (breakText >= 2) {
                                e eVar3 = new e(this.shopInfoPaint, false);
                                if (isDarkMode()) {
                                    intValue2 = darkTxtColor;
                                } else {
                                    Integer a3 = cVar.a();
                                    intValue2 = a3 != null ? a3.intValue() : com.taobao.search.mmd.uikit.shopinfo.b.d;
                                }
                                int i13 = intValue2;
                                StringBuilder sb = new StringBuilder();
                                String b = cVar.b();
                                if (b == null) {
                                    q.a();
                                }
                                if (b != null) {
                                    String substring = b.substring(0, breakText);
                                    q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    sb.append(substring);
                                    sb.append("...");
                                    eVar3.a(sb.toString(), calculateBaseline, i13, 12, false);
                                    eVar3.a(i, 0, 0, 0);
                                    List<e> list3 = this.drawList;
                                    if (list3 == null) {
                                        q.a();
                                    }
                                    list3.add(eVar3);
                                    i6 = i + ((int) (fArr[0] + i5 + measureText2));
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            } else {
                                i6 = i;
                            }
                        }
                        i6 = i;
                    }
                }
                i = i6;
                i2 = size;
                fArr = fArr2;
                i6 = i;
            }
            i8++;
            z2 = z;
            fArr2 = fArr;
            size = i2;
            z3 = true;
        }
        int i14 = i6;
        float calculateBaseline2 = calculateBaseline(this.iconPaint, getMeasuredHeight());
        e eVar4 = new e(this.iconPaint, true);
        if (isDarkMode()) {
            intValue = darkTxtColor;
        } else {
            Integer b2 = bVar.b();
            intValue = b2 != null ? b2.intValue() : com.taobao.search.mmd.uikit.shopinfo.b.d;
        }
        eVar4.a(str, calculateBaseline2, intValue);
        int i15 = i14 - i5;
        eVar4.a(i15, 0, (int) (i15 + this.iconPaint.measureText(str)), 0);
        List<e> list4 = this.drawList;
        if (list4 == null) {
            q.a();
        }
        list4.add(eVar4);
    }

    private final float calculateBaseline(TextPaint textPaint, int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e185561", new Object[]{this, textPaint, new Integer(i)})).floatValue();
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        float f3 = i;
        if (f2 > f3) {
            f = fontMetrics.descent;
        } else {
            f3 -= (f3 - f2) / 2.0f;
            f = fontMetrics.descent;
        }
        return f3 - f;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue() : this.hasBackground ? viewHeight : tb2024ViewHeight;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        this.shopDrawable.draw(canvas);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.taobao.search.m3.shoinfo.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        b bVar = this.currentBean;
        if (bVar == null || (aVar = this.listener) == null) {
            return;
        }
        aVar.a(bVar);
    }
}
