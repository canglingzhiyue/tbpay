package com.taobao.search.m3.more.pk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import com.taobao.taobao.R;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class PkButton extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ADD_ICON = "https://gw.alicdn.com/imgextra/i4/O1CN01lTFU4L1q8betNAV1j_!!6000000005451-2-tps-40-40.png";
    @Deprecated
    public static final a Companion;
    private static final String DEF_SELECT_TEXT;
    private static final String DEF_TEXT;
    private static final int btnHeight;
    private static final int defEndColor;
    private static final int defStartColor;
    private static final int iconMargin;
    private static final int iconSize;
    private static final int padding;
    private static final float radius;
    private static final int selectedBgColor;
    private static final int selectedBorderColor;
    private static final int selectedBorderWidth;
    private static final int textDefColor = -1;
    private static final int textSelectedColor;
    private static final float textSize;
    private final Paint bgPaint;
    private boolean currentState;
    private String defText;
    private final com.taobao.search.m3.d icon;
    private String selectedText;
    private LinearGradient shader;
    private final TextPaint textPaint;
    private float textWidth;

    public static /* synthetic */ Object ipc$super(PkButton pkButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-911776156);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkButton(Context context) {
        super(context);
        q.c(context, "context");
        this.defText = DEF_TEXT;
        this.selectedText = DEF_SELECT_TEXT;
        this.textPaint = new TextPaint(1);
        this.bgPaint = new Paint(1);
        this.icon = new com.taobao.search.m3.d(this, null, 2, null);
        int i = padding;
        setPadding(i, 0, i, 0);
        this.textPaint.setFakeBoldText(true);
        this.textPaint.setTextSize(textSize);
    }

    static {
        kge.a(-528126436);
        Companion = new a(null);
        String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16695);
        q.a((Object) a2, "Localization.localizedSt….taobao_app_1005_1_16695)");
        DEF_TEXT = a2;
        String a3 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16708);
        q.a((Object) a3, "Localization.localizedSt….taobao_app_1005_1_16708)");
        DEF_SELECT_TEXT = a3;
        padding = l.a(6.0f);
        btnHeight = l.a(19.0f);
        radius = l.a(9.5f);
        defStartColor = Color.parseColor("#ff9000");
        defEndColor = Color.parseColor("#ff5000");
        selectedBgColor = Color.parseColor("#fff1eb");
        selectedBorderWidth = l.a(0.5f);
        selectedBorderColor = Color.parseColor("#fa9f63");
        textSize = l.a(11.0f);
        iconSize = l.a(10.0f);
        iconMargin = l.a(2.5f);
        textSelectedColor = Color.parseColor("#ff5000");
    }

    public final void update(com.taobao.search.m3.more.pk.a pkInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a17f3ed", new Object[]{this, pkInfo});
            return;
        }
        q.c(pkInfo, "pkInfo");
        this.currentState = pkInfo.c();
        String a2 = pkInfo.a();
        if (a2 == null) {
            a2 = DEF_TEXT;
        }
        this.defText = a2;
        String b = pkInfo.b();
        if (b == null) {
            b = DEF_SELECT_TEXT;
        }
        this.selectedText = b;
        if (!this.currentState) {
            this.textPaint.setColor(-1);
            com.taobao.search.m3.d dVar = this.icon;
            int i = iconSize;
            dVar.a(ADD_ICON, i, i);
            if (getWidth() > 0) {
                parseShader();
            }
        } else {
            this.textPaint.setColor(textSelectedColor);
            this.icon.a();
        }
        requestLayout();
    }

    private final void parseShader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fbf4ff", new Object[]{this});
        } else {
            this.shader = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, defStartColor, defEndColor, Shader.TileMode.CLAMP);
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
        if (this.currentState) {
            return;
        }
        parseShader();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.currentState) {
            this.bgPaint.setShader(null);
            this.bgPaint.setColor(selectedBgColor);
            this.bgPaint.setStyle(Paint.Style.FILL);
            float f = radius;
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f, f, this.bgPaint);
            this.bgPaint.setStyle(Paint.Style.STROKE);
            float f2 = selectedBorderWidth / 2.0f;
            this.bgPaint.setColor(selectedBorderColor);
            float f3 = radius;
            canvas.drawRoundRect(f2, f2, getWidth() - f2, getHeight() - f2, f3, f3, this.bgPaint);
            com.taobao.search.m3.a.a(canvas, this.textPaint, (getWidth() - this.textWidth) / 2.0f, this.selectedText, 0.0f, getHeight());
            return;
        }
        this.bgPaint.setShader(this.shader);
        this.bgPaint.setStyle(Paint.Style.FILL);
        float f4 = radius;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f4, f4, this.bgPaint);
        float f5 = padding;
        float height = (getHeight() - iconSize) / 2.0f;
        canvas.translate(f5, height);
        this.icon.a(canvas);
        canvas.translate(-f5, -height);
        com.taobao.search.m3.a.a(canvas, this.textPaint, padding + iconSize + iconMargin, this.defText, 0.0f, getHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.currentState) {
            this.textWidth = i.Companion.a(this.selectedText, this.textPaint);
            setMeasuredDimension(((int) this.textWidth) + getPaddingLeft() + getPaddingRight(), btnHeight);
        } else {
            this.textWidth = i.Companion.a(this.defText, this.textPaint);
            setMeasuredDimension(((int) this.textWidth) + getPaddingLeft() + getPaddingRight() + iconSize + iconMargin, btnHeight);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.currentState) {
            return;
        }
        com.taobao.search.m3.d dVar = this.icon;
        int i = iconSize;
        dVar.a(ADD_ICON, i, i);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.icon.a();
    }
}
