package com.taobao.android.detail.ttdetail.transfer.widget.srich;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes5.dex */
public class XSimpleRichTextViewV3 extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "XSimpleRichTextViewV3";
    private int ascent;
    private ArrayList<DrawableHolder> drawableArrayList;
    private int imageSpace;
    private int imageTextSpace;
    private HashMap<String, Integer> indexMap;
    private int lineSpacingExtra;
    private int linesNum;
    private int mDrawableCount;
    private boolean mHasSortedDrawables;
    private final int textMarginLeft;
    private TextPaint textPaint;

    static {
        kge.a(1809915771);
    }

    public static /* synthetic */ Object ipc$super(XSimpleRichTextViewV3 xSimpleRichTextViewV3, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public XSimpleRichTextViewV3(Context context) {
        super(context);
        this.indexMap = new HashMap<>();
        this.linesNum = 1;
        this.ascent = 0;
        this.mDrawableCount = 0;
        this.mHasSortedDrawables = false;
        this.lineSpacingExtra = 3;
        this.imageSpace = 0;
        this.imageTextSpace = f.a(6.0f);
        this.textMarginLeft = 3;
        init(context, null);
    }

    public XSimpleRichTextViewV3(Context context, AttributeSet attributeSet) {
        super(context);
        this.indexMap = new HashMap<>();
        this.linesNum = 1;
        this.ascent = 0;
        this.mDrawableCount = 0;
        this.mHasSortedDrawables = false;
        this.lineSpacingExtra = 3;
        this.imageSpace = 0;
        this.imageTextSpace = f.a(6.0f);
        this.textMarginLeft = 3;
        init(context, attributeSet);
    }

    public XSimpleRichTextViewV3(Context context, AttributeSet attributeSet, int i) {
        super(context);
        this.indexMap = new HashMap<>();
        this.linesNum = 1;
        this.ascent = 0;
        this.mDrawableCount = 0;
        this.mHasSortedDrawables = false;
        this.lineSpacingExtra = 3;
        this.imageSpace = 0;
        this.imageTextSpace = f.a(6.0f);
        this.textMarginLeft = 3;
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
        this.ascent = (int) this.textPaint.ascent();
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

    public void addIcon(Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68da796f", new Object[]{this, drawable, str});
            return;
        }
        ArrayList<DrawableHolder> arrayList = this.drawableArrayList;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<DrawableHolder> it = this.drawableArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().drawable == drawable) {
                    return;
                }
            }
        } else {
            this.drawableArrayList = new ArrayList<>();
        }
        DrawableHolder drawableHolder = new DrawableHolder(drawable);
        drawableHolder.url = str;
        drawableHolder.index = getUrlIndex(str);
        this.drawableArrayList.add(drawableHolder);
        Collections.sort(this.drawableArrayList);
        if (this.mDrawableCount != this.drawableArrayList.size()) {
            return;
        }
        sortDrawables();
    }

    private void sortDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7d109e", new Object[]{this});
        } else if (this.drawableArrayList == null) {
        } else {
            reCaculateDrawBounds();
            this.mHasSortedDrawables = true;
        }
    }

    private void reCaculateDrawBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a0a8c9", new Object[]{this});
            return;
        }
        try {
            ArrayList<DrawableHolder> arrayList = this.drawableArrayList;
            if (arrayList == null) {
                return;
            }
            this.drawableArrayList = null;
            Iterator<DrawableHolder> it = arrayList.iterator();
            while (it.hasNext()) {
                DrawableHolder next = it.next();
                appendOnList(next.drawable, next.url);
            }
        } catch (Exception e) {
            i.a(TAG, "Fail to serialize drawableArrayList", e);
        }
    }

    public void appendOnList(Drawable drawable, String str) {
        DrawableHolder drawableHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f421e54c", new Object[]{this, drawable, str});
            return;
        }
        ArrayList<DrawableHolder> arrayList = this.drawableArrayList;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<DrawableHolder> it = this.drawableArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().drawable == drawable) {
                    return;
                }
            }
            ArrayList<DrawableHolder> arrayList2 = this.drawableArrayList;
            drawableHolder = arrayList2.get(arrayList2.size() - 1);
        } else {
            this.drawableArrayList = new ArrayList<>();
            drawableHolder = new DrawableHolder();
        }
        DrawableHolder drawableHolder2 = new DrawableHolder(drawable);
        if (drawableHolder2.drawable != null) {
            drawableHolder2.url = str;
            drawableHolder2.index = getUrlIndex(str);
            int paddingTop = (int) (getPaddingTop() - this.textPaint.ascent());
            int intrinsicWidth = drawableHolder2.drawable.getIntrinsicWidth();
            int intrinsicHeight = drawableHolder2.drawable.getIntrinsicHeight();
            int textSize = (int) this.textPaint.getTextSize();
            if (textSize != intrinsicHeight) {
                intrinsicWidth = (intrinsicWidth * textSize) / intrinsicHeight;
            }
            int descent = (int) (((paddingTop + this.textPaint.descent()) - textSize) / 2.0f);
            if (drawableHolder.drawable == null) {
                drawableHolder2.left = drawableHolder.right;
            } else {
                drawableHolder2.left = drawableHolder.right + this.imageSpace;
            }
            drawableHolder2.top = descent;
            drawableHolder2.right = drawableHolder2.left + intrinsicWidth;
            drawableHolder2.bottom = descent + textSize;
            drawableHolder2.drawable.setBounds(drawableHolder2.left, drawableHolder2.top, drawableHolder2.right, drawableHolder2.bottom);
            this.drawableArrayList.add(drawableHolder2);
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        ArrayList<DrawableHolder> arrayList;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (StringUtils.isEmpty(getText()) && ((arrayList = this.drawableArrayList) == null || arrayList.size() == 0)) {
        } else {
            this.ascent = (int) this.textPaint.ascent();
            CharSequence text = getText();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop() - this.ascent;
            ArrayList<DrawableHolder> arrayList2 = this.drawableArrayList;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                i = 0;
            } else {
                Iterator<DrawableHolder> it = this.drawableArrayList.iterator();
                while (it.hasNext()) {
                    it.next().drawable.draw(canvas);
                }
                ArrayList<DrawableHolder> arrayList3 = this.drawableArrayList;
                i = arrayList3.get(arrayList3.size() - 1).right + this.imageTextSpace;
            }
            int i3 = 0;
            int breakText = this.textPaint.breakText(text.toString(), true, width - i, null);
            if (breakText >= text.length()) {
                canvas.drawText(text, 0, breakText, paddingLeft + i + this.imageTextSpace, paddingTop, this.textPaint);
                return;
            }
            String str = getProperLengthString(this.textPaint, text.toString(), ((width - ((int) this.textPaint.measureText("...", 0, 3))) - i) - this.imageTextSpace) + "...";
            canvas.drawText(str, 0, str.length(), i + paddingLeft + this.imageTextSpace, paddingTop, (Paint) this.textPaint);
            while (i2 < this.linesNum) {
                i2++;
                int descent = ((int) (paddingTop + (-this.ascent) + this.textPaint.descent())) + this.lineSpacingExtra;
                int i4 = i3 + breakText;
                float f = width;
                if (this.textPaint.measureText(text, i4, text.length()) > f) {
                    int i5 = paddingLeft;
                    CharSequence charSequence = text;
                    breakText = this.textPaint.breakText(text, i4, text.length(), true, f, null);
                    canvas.drawText(charSequence.toString().substring(i4, i4 + breakText), i5, descent, this.textPaint);
                    paddingTop = descent;
                    width = width;
                    i3 = i4;
                    text = charSequence;
                    paddingLeft = i5;
                } else {
                    CharSequence charSequence2 = text;
                    canvas.drawText(charSequence2, i4, charSequence2.length(), paddingLeft, descent, this.textPaint);
                    return;
                }
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        this.linesNum = i;
        requestLayout();
        invalidate();
    }

    public void setImageSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0f7d0f", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.imageSpace;
        this.imageSpace = f.a(i);
        ArrayList<DrawableHolder> arrayList = this.drawableArrayList;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i3 = 0; i3 < this.drawableArrayList.size(); i3++) {
                if (i3 > 0) {
                    DrawableHolder drawableHolder = this.drawableArrayList.get(i3);
                    int i4 = drawableHolder.right - drawableHolder.left;
                    drawableHolder.left = (drawableHolder.left - i2) + i;
                    drawableHolder.right = drawableHolder.left + i4;
                }
            }
        }
        invalidate();
    }

    public void setImageTextSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5480a59c", new Object[]{this, new Integer(i)});
            return;
        }
        this.imageTextSpace = f.a(i);
        invalidate();
    }

    public ArrayList<DrawableHolder> getDrawableArrayList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3ae1e0c4", new Object[]{this});
        }
        if (this.drawableArrayList == null) {
            this.drawableArrayList = new ArrayList<>();
        }
        return this.drawableArrayList;
    }

    public String getProperLengthString(TextPaint textPaint, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e8b764b", new Object[]{this, textPaint, str, new Integer(i)});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        while (getTextViewLength(textPaint, str) > i) {
            str = str.subSequence(0, str.length() - 1).toString();
        }
        return str;
    }

    public float getTextViewLength(TextPaint textPaint, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11758fef", new Object[]{this, textPaint, str})).floatValue();
        }
        if (textPaint != null && !StringUtils.isEmpty(str) && textPaint != null) {
            return textPaint.measureText(str);
        }
        return -1.0f;
    }

    public void setUrlIndex(String str, int i) {
        HashMap<String, Integer> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecd31cd", new Object[]{this, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str) || (hashMap = this.indexMap) == null || hashMap.containsKey(str)) {
        } else {
            this.indexMap.put(str, Integer.valueOf(i));
        }
    }

    private int getUrlIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de7e6fdd", new Object[]{this, str})).intValue();
        }
        Integer num = this.indexMap.get(str);
        if (num != null && (num instanceof Integer)) {
            return num.intValue();
        }
        return 0;
    }

    public void setDrawableCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31412ed", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.mDrawableCount = i;
        }
    }

    /* loaded from: classes5.dex */
    public static class DrawableHolder implements Serializable, Comparable<DrawableHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int bottom;
        public Drawable drawable;
        public int index;
        public int left;
        public int right;
        public int top;
        public String url;

        static {
            kge.a(-1095424941);
            kge.a(415966670);
            kge.a(1028243835);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "\r\nUrl : " + this.url + "\r\nindex : " + this.index;
        }

        public DrawableHolder() {
            this.left = 0;
            this.right = 0;
            this.top = 0;
            this.bottom = 0;
        }

        public DrawableHolder(Drawable drawable) {
            this.left = 0;
            this.right = 0;
            this.top = 0;
            this.bottom = 0;
            this.drawable = drawable;
            this.url = "";
        }

        public DrawableHolder(Drawable drawable, String str) {
            this.left = 0;
            this.right = 0;
            this.top = 0;
            this.bottom = 0;
            this.drawable = drawable;
            this.url = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(DrawableHolder drawableHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("de2d891a", new Object[]{this, drawableHolder})).intValue();
            }
            if (drawableHolder == null) {
                return 0;
            }
            int i = this.index;
            int i2 = drawableHolder.index;
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 0 : -1;
        }
    }
}
