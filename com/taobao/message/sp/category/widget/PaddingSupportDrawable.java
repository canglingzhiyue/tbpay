package com.taobao.message.sp.category.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import kotlin.Metadata;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000bH\u0014J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lcom/taobao/message/sp/category/widget/PaddingSupportDrawable;", "Landroid/graphics/drawable/Drawable;", "()V", "value", "", e.KEY_BG_COLOR, "getBgColor", "()I", "setBgColor", "(I)V", "opaqueRect", "Landroid/graphics/Rect;", "paddingTop", "getPaddingTop", "setPaddingTop", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "calcOpaqueRect", "", "draw", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "onBoundsChange", "bounds", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Companion", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class PaddingSupportDrawable extends Drawable {
    public static final /* synthetic */ k[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    private static final String TAG = "PaddingSupportDrawable";
    private int paddingTop;
    private final Rect opaqueRect = new Rect();
    private final d paint$delegate = kotlin.e.a(new PaddingSupportDrawable$paint$2(this));
    private int bgColor = -1;

    static {
        kge.a(483351117);
        $$delegatedProperties = new k[]{t.a(new PropertyReference1Impl(t.b(PaddingSupportDrawable.class), "paint", "getPaint()Landroid/graphics/Paint;"))};
        Companion = new Companion(null);
    }

    private final Paint getPaint() {
        IpChange ipChange = $ipChange;
        return (Paint) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("daa8bf5c", new Object[]{this}) : this.paint$delegate.getValue());
    }

    public static /* synthetic */ Object ipc$super(PaddingSupportDrawable paddingSupportDrawable, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/message/sp/category/widget/PaddingSupportDrawable$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static {
            kge.a(1396738389);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final int getBgColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1061a262", new Object[]{this})).intValue() : this.bgColor;
    }

    public final void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
            return;
        }
        this.bgColor = i;
        getPaint().setColor(i);
    }

    public final int getPaddingTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue() : this.paddingTop;
    }

    public final void setPaddingTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
            return;
        }
        this.paddingTop = i;
        String str = "setPaddingTop: " + i;
        calcOpaqueRect();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, bounds});
            return;
        }
        q.c(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.opaqueRect.set(bounds);
        calcOpaqueRect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.opaqueRect.height() <= 0) {
            return;
        }
        canvas.drawRect(this.opaqueRect, getPaint());
    }

    private final void calcOpaqueRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27201161", new Object[]{this});
        } else if (getBounds().height() < 0) {
        } else {
            this.opaqueRect.top = getBounds().top + Math.max(this.paddingTop, 0);
        }
    }
}
