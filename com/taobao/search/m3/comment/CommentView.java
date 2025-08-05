package com.taobao.search.m3.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.m3.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class CommentView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int bgColor;
    private static final float bgRadius;
    private static final int capsuleHeight;
    private static final int defColor;
    private static final int lineExtraSpacing;
    private static final int noCapsuleHeight;
    private static final int padding;
    private static final String suffix = "...";
    private static final int textMargin;
    private static final float textSize;
    private static final int topPadding;
    private final Paint bgPaint;
    private String brokeText;
    private final ArrayList<String> brokeTextLines;
    private int calculateHeight;
    private int calculateWidth;
    private final TextPaint commentPaint;
    private com.taobao.search.m3.comment.a currentInfo;
    private float numCommentWidth;
    private final TextPaint numPaint;
    private final boolean twoLineMode;
    private boolean useCapsule;

    public static /* synthetic */ Object ipc$super(CommentView commentView, String str, Object... objArr) {
        if (str.hashCode() == 2022597206) {
            super.reset();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.m3.BaseItemView
    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public CommentView(Context context, boolean z) {
        super(context);
        this.twoLineMode = z;
        this.numPaint = new TextPaint(1);
        this.commentPaint = new TextPaint(1);
        this.bgPaint = new Paint(1);
        this.brokeTextLines = new ArrayList<>();
        this.numPaint.setTextSize(textSize);
        this.commentPaint.setTextSize(textSize);
        this.bgPaint.setColor(bgColor);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(1025858343);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1851331937);
        Companion = new a(null);
        capsuleHeight = l.a(21.0f);
        int a2 = l.a(12.0f);
        noCapsuleHeight = a2;
        textSize = a2;
        defColor = Color.parseColor("#333333");
        bgColor = Color.parseColor("#f7f7f7");
        textMargin = l.a(7.0f);
        bgRadius = capsuleHeight / 2.0f;
        padding = l.a(6.0f);
        lineExtraSpacing = l.a(4.0f);
        topPadding = (capsuleHeight - noCapsuleHeight) / 2;
    }

    public final void update(com.taobao.search.m3.comment.a info, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4622c71", new Object[]{this, info, new Boolean(z)});
            return;
        }
        q.c(info, "info");
        if (this.currentInfo == info) {
            return;
        }
        reset();
        this.useCapsule = z;
        this.currentInfo = info;
        TextPaint textPaint = this.numPaint;
        Integer d = info.d();
        textPaint.setColor(d != null ? d.intValue() : defColor);
        TextPaint textPaint2 = this.commentPaint;
        Integer c = info.c();
        textPaint2.setColor(c != null ? c.intValue() : defColor);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        this.brokeText = null;
        this.numCommentWidth = 0.0f;
        this.calculateHeight = 0;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        int i2;
        float a2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        com.taobao.search.m3.comment.a aVar = this.currentInfo;
        if (aVar == null) {
            return;
        }
        this.calculateWidth = 0;
        float f = this.useCapsule ? padding * 2 : 0;
        float f2 = 0.0f + f;
        float measuredWidth = getMeasuredWidth() - f;
        if (this.twoLineMode) {
            this.calculateHeight = 0;
            this.brokeTextLines.clear();
            if (!TextUtils.isEmpty(aVar.a())) {
                this.numCommentWidth = i.Companion.a(aVar.a(), this.numPaint);
                float f3 = this.numCommentWidth;
                int i4 = textMargin;
                measuredWidth = (measuredWidth - f3) - i4;
                f2 = f2 + f3 + i4;
            }
            if (i.Companion.a(aVar.b(), this.commentPaint) <= measuredWidth) {
                this.brokeTextLines.add(aVar.b());
                this.calculateWidth = (int) (f2 + ((int) a2));
                return;
            }
            this.calculateWidth = getMeasuredWidth();
            int breakText = this.commentPaint.breakText(aVar.b(), true, measuredWidth, null);
            if (breakText > 0) {
                ArrayList<String> arrayList = this.brokeTextLines;
                String b = aVar.b();
                if (b == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = b.substring(0, breakText);
                q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
            } else {
                this.brokeTextLines.add("");
                breakText = 0;
            }
            String b2 = aVar.b();
            if (b2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring2 = b2.substring(breakText);
            q.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            float measuredWidth2 = getMeasuredWidth() - f;
            if (i.Companion.a(substring2, this.commentPaint) <= measuredWidth2) {
                this.brokeTextLines.add(substring2);
            } else {
                int breakText2 = this.commentPaint.breakText(substring2, true, measuredWidth2 - i.Companion.a(suffix, this.commentPaint), null);
                if (breakText2 > 0) {
                    ArrayList<String> arrayList2 = this.brokeTextLines;
                    StringBuilder sb = new StringBuilder();
                    if (substring2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String substring3 = substring2.substring(0, breakText2);
                    q.a((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring3);
                    sb.append(suffix);
                    arrayList2.add(sb.toString());
                }
            }
            if (this.useCapsule) {
                i3 = topPadding * 2;
            }
            this.calculateHeight = (int) (i3 + (this.brokeTextLines.size() * textSize) + lineExtraSpacing);
            setMeasuredDimension(getMeasuredWidth(), this.calculateHeight);
            return;
        }
        if (!TextUtils.isEmpty(aVar.a())) {
            this.numCommentWidth = i.Companion.a(aVar.a(), this.numPaint);
            float f4 = this.numCommentWidth;
            measuredWidth = (measuredWidth - f4) - textMargin;
            f2 += (int) (f4 + i2);
        }
        float a3 = i.Companion.a(aVar.b(), this.commentPaint);
        this.brokeText = null;
        if (a3 <= measuredWidth) {
            this.brokeText = aVar.b();
            i = (int) a3;
        } else {
            float a4 = i.Companion.a(suffix, this.commentPaint);
            float[] fArr = new float[1];
            int breakText3 = this.commentPaint.breakText(aVar.b(), true, measuredWidth - a4, fArr);
            if (breakText3 > 0) {
                StringBuilder sb2 = new StringBuilder();
                String b3 = aVar.b();
                if (b3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String substring4 = b3.substring(0, breakText3);
                q.a((Object) substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb2.append(substring4);
                sb2.append(suffix);
                this.brokeText = sb2.toString();
                i = (int) (fArr[0] + a4);
            }
            this.calculateWidth = (int) f2;
        }
        f2 += i;
        this.calculateWidth = (int) f2;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue() : this.calculateWidth;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        com.taobao.search.m3.comment.a aVar = this.currentInfo;
        if (aVar == null) {
            return;
        }
        float f2 = 0.0f;
        float f3 = this.useCapsule ? padding : 0.0f;
        if (this.useCapsule) {
            float f4 = bgRadius;
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f4, f4, this.bgPaint);
        }
        if (this.twoLineMode) {
            if (this.useCapsule) {
                f2 = topPadding;
            }
            if (this.numCommentWidth > 0) {
                TextPaint textPaint = this.numPaint;
                String a2 = aVar.a();
                if (a2 == null) {
                    q.a();
                }
                com.taobao.search.m3.a.a(canvas, textPaint, f3, a2, f2, f2 + textSize);
                f = this.numCommentWidth + f3 + textMargin;
            } else {
                f = f3;
            }
            Iterator<String> it = this.brokeTextLines.iterator();
            float f5 = f;
            while (it.hasNext()) {
                String line = it.next();
                q.a((Object) line, "line");
                com.taobao.search.m3.a.a(canvas, this.commentPaint, f5, line, f2, f2 + textSize);
                f2 = f2 + textSize + lineExtraSpacing;
                f5 = f3;
            }
            return;
        }
        if (this.numCommentWidth > 0) {
            TextPaint textPaint2 = this.numPaint;
            String a3 = aVar.a();
            if (a3 == null) {
                q.a();
            }
            com.taobao.search.m3.a.a(canvas, textPaint2, f3, a3, 0.0f, getHeight());
            f3 = f3 + this.numCommentWidth + textMargin;
        }
        float f6 = f3;
        String str = this.brokeText;
        if (str == null) {
            return;
        }
        TextPaint textPaint3 = this.commentPaint;
        if (str == null) {
            q.a();
        }
        com.taobao.search.m3.a.a(canvas, textPaint3, f6, str, 0.0f, getHeight());
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        int i = this.calculateHeight;
        return i > 0 ? i : this.useCapsule ? capsuleHeight : noCapsuleHeight;
    }
}
