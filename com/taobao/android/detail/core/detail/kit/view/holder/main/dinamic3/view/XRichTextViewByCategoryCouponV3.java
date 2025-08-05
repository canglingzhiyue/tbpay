package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.c;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import java.io.Serializable;
import java.util.List;
import tb.dzv;
import tb.eck;
import tb.emu;
import tb.epo;
import tb.fpr;
import tb.kge;

/* loaded from: classes4.dex */
public class XRichTextViewByCategoryCouponV3 extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int couponStartX;
    private List<Coupon> coupons;
    private int currentRight;
    private Drawable drawable;
    public int drawableH;
    public Rect drawableRect;
    public int drawableW;
    private int ellipsisLen;
    public int i;
    public int imageTextSpaceDraw;
    private int lineSpacingExtra;
    private final int textMarginLeft;
    private TextPaint textPaint;
    private JSONArray xBonusList;
    private int xCouponGap;
    private String xEllipsis;
    private int xEllipsisSize;
    private int xIconHeight;
    private int xSplitLineColor;
    private int xSplitLineGap;
    private int xSplitLineWidth;
    private int xTextBgPaddingV;
    private int xTextLeftGap;
    private int xVIPTextColor;
    private int xVIPTextLeftGap;
    private int xVIPTextRightGap;

    static {
        kge.a(250441684);
    }

    public static /* synthetic */ Object ipc$super(XRichTextViewByCategoryCouponV3 xRichTextViewByCategoryCouponV3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 362446068:
                super.setLineSpacing(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 835841791:
                super.setMaxLines(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$000(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97d0fb1f", new Object[]{drawable})).booleanValue() : isEnable(drawable);
    }

    private void clearDrawConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39ed2da", new Object[]{this});
            return;
        }
        this.couponStartX = 0;
        this.currentRight = 0;
    }

    public void setVIPTextColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99edcc6c", new Object[]{this, str});
        } else {
            this.xVIPTextColor = c.a(str);
        }
    }

    public void setTextLeftGap(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107b0279", new Object[]{this, new Float(f)});
        } else {
            this.xTextLeftGap = fpr.a(getContext(), Float.valueOf(f), 0);
        }
    }

    public void setVIPTextLeftGap(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4816d072", new Object[]{this, new Float(f)});
        } else {
            this.xVIPTextLeftGap = fpr.a(getContext(), Float.valueOf(f), 0);
        }
    }

    public void setVIPTextRightGap(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca205f7", new Object[]{this, new Float(f)});
        } else {
            this.xVIPTextRightGap = fpr.a(getContext(), Float.valueOf(f), 0);
        }
    }

    public void setBonusList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4229f4a", new Object[]{this, jSONArray});
        } else if (jSONArray.equals(this.xBonusList)) {
        } else {
            this.xBonusList = jSONArray;
            this.coupons = JSONObject.parseArray(jSONArray.toJSONString(), Coupon.class);
            startDownLoadCouponImg();
        }
    }

    public void setCouponGap(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600ba64b", new Object[]{this, new Float(f)});
        } else {
            this.xCouponGap = fpr.b(getContext(), f);
        }
    }

    public void setSplitLineColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b50ee28", new Object[]{this, str});
        } else {
            this.xSplitLineColor = c.a(str);
        }
    }

    public void setSplitLineWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51432b1f", new Object[]{this, new Float(f)});
        } else {
            this.xSplitLineWidth = fpr.b(getContext(), f);
        }
    }

    public void setSplitLineGap(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2854c70f", new Object[]{this, new Float(f)});
        } else {
            this.xSplitLineGap = fpr.b(getContext(), f);
        }
    }

    public void setEllipsisSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70525e8", new Object[]{this, new Integer(i)});
        } else {
            this.xEllipsisSize = epo.b(i);
        }
    }

    public void setEllipsis(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba8a9a4", new Object[]{this, str});
            return;
        }
        this.xEllipsis = str;
        float textSize = this.textPaint.getTextSize();
        this.textPaint.setTextSize(this.xEllipsisSize);
        this.ellipsisLen = (int) this.textPaint.measureText(str, 0, str.length());
        this.textPaint.setTextSize(textSize);
    }

    public XRichTextViewByCategoryCouponV3(Context context) {
        super(context);
        this.textMarginLeft = 0;
        this.xTextBgPaddingV = epo.b(2);
        this.couponStartX = 0;
        this.imageTextSpaceDraw = 0;
        init(context, null);
    }

    public XRichTextViewByCategoryCouponV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textMarginLeft = 0;
        this.xTextBgPaddingV = epo.b(2);
        this.couponStartX = 0;
        this.imageTextSpaceDraw = 0;
        init(context, attributeSet);
    }

    public XRichTextViewByCategoryCouponV3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textMarginLeft = 0;
        this.xTextBgPaddingV = epo.b(2);
        this.couponStartX = 0;
        this.imageTextSpaceDraw = 0;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.textPaint = new TextPaint(1);
        this.lineSpacingExtra = 3;
        this.textPaint.setTextSize(getTextSize());
        this.textPaint.setColor(getTextColors().getColorForState(getDrawableState(), 0));
        this.textPaint.setAntiAlias(true);
        setLineSpacing(this.lineSpacingExtra, 1.0f);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XRichTextViewByCategoryCouponV3");
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.textPaint.setColor(i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        this.textPaint.setTextSize(f);
        invalidate();
    }

    public void setXIconHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbc4e03", new Object[]{this, new Float(f)});
        } else {
            this.xIconHeight = fpr.b(getContext(), f);
        }
    }

    public void setTextBgPaddingV(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd5cfe0", new Object[]{this, new Float(f)});
        } else {
            this.xTextBgPaddingV = fpr.a(getContext(), f);
        }
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable == drawable) {
        } else {
            this.drawable = drawable;
            if (this.drawable != null) {
                getPaddingTop();
                this.textPaint.ascent();
                int intrinsicWidth = this.drawable.getIntrinsicWidth();
                int intrinsicHeight = this.drawable.getIntrinsicHeight();
                int i = this.xIconHeight;
                if (i != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * i) / intrinsicHeight;
                }
                this.drawableW = intrinsicWidth;
                this.drawableH = i;
                this.drawableRect = new Rect();
            }
            invalidate();
        }
    }

    private void drawCouponBg(Canvas canvas, Coupon coupon, Rect rect, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c99a6", new Object[]{this, canvas, coupon, rect, new Integer(i)});
            return;
        }
        Rect a2 = eck.a(coupon.srcRect.height(), rect);
        int width = coupon.srcRect.width() / 2;
        if (i != 0) {
            width = (int) (((i * 1.0d) * a2.height()) / rect.height());
        }
        if (!isEnable(coupon.targetBgDrawable)) {
            coupon.targetBgDrawable = eck.a(getContext(), coupon.bgDrawable, a2, width);
        }
        coupon.targetBgDrawable.setBounds(rect);
        coupon.targetBgDrawable.draw(canvas);
    }

    private Rect drawBgImg(Canvas canvas, Coupon coupon, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("d28fa410", new Object[]{this, canvas, coupon, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (coupon.bgDrawable != null) {
            if (TextUtils.isEmpty(coupon.title) && TextUtils.isEmpty(coupon.content)) {
                Rect rect = new Rect(i, i2, eck.a(getHeight(), coupon.srcRect).width() + i, getHeight() + i2);
                coupon.bgDrawable.setBounds(rect);
                coupon.bgDrawable.draw(canvas);
                this.currentRight = rect.right;
                return rect;
            }
            Rect rect2 = new Rect(i, i2, i3, getHeight() + i2);
            drawCouponBg(canvas, coupon, rect2, i4);
            this.currentRight = rect2.right;
            return rect2;
        }
        this.currentRight = i3;
        return null;
    }

    private boolean drawBlackCardCoupon(Canvas canvas, Coupon coupon) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b857102", new Object[]{this, canvas, coupon})).booleanValue();
        }
        int color = this.textPaint.getColor();
        this.textPaint.setColor(this.xVIPTextColor);
        if (this.i == 0) {
            i = this.couponStartX;
        } else {
            i = this.currentRight + this.couponStartX + this.xCouponGap;
        }
        int i2 = i;
        int i3 = i2 + this.xVIPTextLeftGap;
        int i4 = this.xVIPTextRightGap + i3;
        if (!TextUtils.isEmpty(coupon.content)) {
            i4 = ((int) this.textPaint.measureText(coupon.content, 0, coupon.content.length())) + i3 + this.xVIPTextRightGap;
        }
        int i5 = i4;
        if (!judgeEndAndDraw(i2, i5, canvas)) {
            return false;
        }
        drawBgImg(canvas, coupon, i2, 0, i5, this.xVIPTextLeftGap);
        if (!TextUtils.isEmpty(coupon.content)) {
            canvas.drawText(coupon.content, 0, this.textPaint.breakText(coupon.content, true, (getWidth() - this.couponStartX) - this.imageTextSpaceDraw, null), i3, getBaseLineY(this.textPaint), (Paint) this.textPaint);
        }
        this.textPaint.setColor(color);
        return true;
    }

    private boolean drawDefaultCoupon(Canvas canvas, Coupon coupon) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24395994", new Object[]{this, canvas, coupon})).booleanValue();
        }
        if (this.i == 0) {
            i = this.couponStartX;
        } else {
            i = this.currentRight + this.couponStartX + this.xCouponGap;
        }
        int i2 = i;
        int i3 = i2 + this.xTextLeftGap;
        int measureText = (!TextUtils.isEmpty(coupon.title) ? (int) this.textPaint.measureText(coupon.title, 0, coupon.title.length()) : 0) + i3 + this.xSplitLineGap;
        int i4 = !TextUtils.isEmpty(coupon.title) ? this.xSplitLineWidth + measureText + this.xSplitLineGap : i3;
        int measureText2 = (!TextUtils.isEmpty(coupon.content) ? ((int) this.textPaint.measureText(coupon.content, 0, coupon.content.length())) + i4 : i4) + this.xTextLeftGap;
        if (!judgeEndAndDraw(i2, measureText2, canvas)) {
            return false;
        }
        Rect drawBgImg = drawBgImg(canvas, coupon, i2, 0, measureText2, 0);
        if (coupon.bgDrawable != null && !TextUtils.isEmpty(coupon.title)) {
            Paint paint = new Paint();
            paint.setColor(this.xSplitLineColor);
            canvas.drawLine(measureText, 0, measureText + this.xSplitLineWidth, drawBgImg.bottom, paint);
        }
        if (!TextUtils.isEmpty(coupon.title)) {
            canvas.drawText(coupon.title, 0, this.textPaint.breakText(coupon.title, true, (getWidth() - this.couponStartX) - this.imageTextSpaceDraw, null), i3, getBaseLineY(this.textPaint), (Paint) this.textPaint);
        }
        if (!TextUtils.isEmpty(coupon.content)) {
            canvas.drawText(coupon.content, 0, this.textPaint.breakText(coupon.content, true, (getWidth() - this.couponStartX) - this.imageTextSpaceDraw, null), i4, getBaseLineY(this.textPaint), (Paint) this.textPaint);
        }
        return true;
    }

    private int getBaseLineY(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a257e958", new Object[]{this, textPaint})).intValue();
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
    }

    private boolean judgeEndAndDraw(int i, int i2, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b5f246b", new Object[]{this, new Integer(i), new Integer(i2), canvas})).booleanValue();
        }
        if (this.ellipsisLen == 0 || TextUtils.isEmpty(this.xEllipsis) || i2 + this.xCouponGap + this.ellipsisLen <= getWidth()) {
            return true;
        }
        float textSize = this.textPaint.getTextSize();
        this.textPaint.setTextSize(this.xEllipsisSize);
        canvas.drawText(this.xEllipsis, 0, this.textPaint.breakText(this.xEllipsis, true, (getWidth() - this.couponStartX) - this.imageTextSpaceDraw, null), i + this.xCouponGap, getBaseLineY(this.textPaint), (Paint) this.textPaint);
        this.textPaint.setTextSize(textSize);
        return false;
    }

    private boolean drawCoupon(Canvas canvas, Coupon coupon) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("605010fb", new Object[]{this, canvas, coupon})).booleanValue();
        }
        String str = coupon.type;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1742615137) {
            if (hashCode == 1813877401 && str.equals("blackCardOpen")) {
                c = 1;
            }
        } else if (str.equals("blackCardCal")) {
            c = 0;
        }
        if (c == 0 || c == 1) {
            return drawBlackCardCoupon(canvas, coupon);
        }
        return drawDefaultCoupon(canvas, coupon);
    }

    private void drawCoupons(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e80435", new Object[]{this, canvas});
            return;
        }
        this.i = 0;
        while (this.i < this.coupons.size() && drawCoupon(canvas, this.coupons.get(this.i))) {
            this.i++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        List<Coupon> list = this.coupons;
        if (list == null || list.isEmpty()) {
            return;
        }
        clearDrawConfig();
        if (this.drawable != null) {
            int i = this.drawableW;
            this.couponStartX = i;
            Rect rect = this.drawableRect;
            rect.left = 0;
            rect.right = i;
            rect.top = (getHeight() - this.drawableH) / 2;
            Rect rect2 = this.drawableRect;
            rect2.bottom = rect2.top + this.drawableH;
            this.drawable.setBounds(this.drawableRect);
            this.drawable.draw(canvas);
        }
        drawCoupons(canvas);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        super.setMaxLines(i);
        requestLayout();
        invalidate();
    }

    public void setLineSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727ca22c", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.lineSpacingExtra = i;
            super.setLineSpacing(i, 1.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isEnable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b51f367c", new Object[]{drawable})).booleanValue();
        }
        if (drawable != null) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes4.dex */
    public static class Coupon implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Drawable bgDrawable;
        public String bgImage;
        public String content;
        public Rect srcRect;
        public Drawable targetBgDrawable;
        public String title;
        public String type;

        static {
            kge.a(1315500822);
            kge.a(1028243835);
        }

        public void loadBgDrawable(final XRichTextViewByCategoryCouponV3 xRichTextViewByCategoryCouponV3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9de8272b", new Object[]{this, xRichTextViewByCategoryCouponV3});
            } else if (XRichTextViewByCategoryCouponV3.access$000(this.bgDrawable)) {
            } else {
                dzv.a(this.bgImage, xRichTextViewByCategoryCouponV3.getContext(), new c.a() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XRichTextViewByCategoryCouponV3.Coupon.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                        } else {
                            Coupon.this.srcRect = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            Coupon.this.bgDrawable = drawable;
                            xRichTextViewByCategoryCouponV3.invalidate();
                        }
                    }
                }, null);
            }
        }

        public void releaseImg() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7722cc3", new Object[]{this});
                return;
            }
            Drawable drawable = this.bgDrawable;
            if (drawable != null && drawable.equals(this.targetBgDrawable)) {
                return;
            }
            releaseImg(this.targetBgDrawable);
            this.targetBgDrawable = null;
        }

        private void releaseImg(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bd16a67", new Object[]{this, drawable});
            } else if (!XRichTextViewByCategoryCouponV3.access$000(drawable)) {
            } else {
                ((BitmapDrawable) drawable).getBitmap().recycle();
            }
        }
    }

    private void startDownLoadCouponImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ba2cba", new Object[]{this});
            return;
        }
        List<Coupon> list = this.coupons;
        if (list == null) {
            return;
        }
        for (Coupon coupon : list) {
            coupon.loadBgDrawable(this);
        }
    }

    private void releaseAllImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddba150", new Object[]{this});
            return;
        }
        List<Coupon> list = this.coupons;
        if (list == null) {
            return;
        }
        for (Coupon coupon : list) {
            coupon.releaseImg();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
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
        releaseAllImg();
    }
}
