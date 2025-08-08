package com.taobao.search.mmd.uikit.iconlist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.c;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.datasource.bean.IconBean;
import com.taobao.search.mmd.uikit.iconlist.a;
import com.taobao.search.mmd.util.d;
import com.taobao.search.sf.e;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nus;

/* loaded from: classes7.dex */
public class IconListView extends View implements a.InterfaceC0770a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DARK_MODE_BG_ALPHA = 0.1f;
    public static final float DARK_MODE_BORDER_ALPHA = 0.5f;
    private static final float DEFAULT_TEXT_SIZE = 10.0f;
    private static final String LOG_TAG = "IconListView";
    private static final String TYPE_IMAGE = "img";
    private static final String TYPE_TEXT = "text";
    public final int ICON_HEIGHT;
    private final int MARGIN;
    private final int PADDING;
    private final int RADIUS;
    private final int TEXT_TRANSLATE;
    private Paint mBackgroundPaint;
    private Paint mBoraderPaint;
    private SparseArray<Drawable> mDrawables;
    private SparseArray<LinearGradient> mIconGradients;
    private List<IconBean> mIconList;
    private SparseIntArray mIconStart;
    private SparseIntArray mIconWidth;
    private boolean mIsDarkMode;
    private int mLastHeight;
    private int mLastHeightSpec;
    private int mLastWidth;
    private int mLastWidthSpec;
    private SparseArray<a> mLoaders;
    private int mMaxIconNum;
    private int mMaxWidth;
    private boolean mNeedReLayout;
    private int mStrokeWidth;
    private boolean mTaobao2021;
    private TextPaint mTextPaint;
    private final RectF mTmpRectF;
    private int mVisibleIconEndIndex;
    private boolean mVisibleIconEndIndexValid;

    static {
        kge.a(-1121343800);
        kge.a(-227018379);
    }

    public static /* synthetic */ Object ipc$super(IconListView iconListView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public IconListView(Context context) {
        this(context, null);
    }

    public IconListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextPaint = new TextPaint();
        this.mBackgroundPaint = new Paint();
        this.mBoraderPaint = new Paint();
        this.mIsDarkMode = c.a(Globals.getApplication());
        this.mLoaders = new SparseArray<>(2);
        this.mDrawables = new SparseArray<>(2);
        this.mIconList = new ArrayList();
        this.mIconStart = new SparseIntArray(5);
        this.mIconWidth = new SparseIntArray(5);
        this.mIconGradients = new SparseArray<>(5);
        this.mVisibleIconEndIndex = 0;
        this.mVisibleIconEndIndexValid = false;
        this.mMaxWidth = -1;
        this.mMaxIconNum = Integer.MAX_VALUE;
        this.mNeedReLayout = true;
        this.mTmpRectF = new RectF();
        this.mLastWidthSpec = -1;
        this.mLastHeightSpec = -1;
        this.mLastWidth = -1;
        this.mLastHeight = -1;
        this.mTaobao2021 = (context instanceof nus) && ((nus) context).x();
        this.mTextPaint.setAntiAlias(true);
        this.mBoraderPaint.setStyle(Paint.Style.STROKE);
        this.mStrokeWidth = DensityUtil.dip2px(context, 0.5f);
        if (this.mStrokeWidth == 0) {
            this.mStrokeWidth = DensityUtil.dip2px(context, 1.0f);
        }
        this.mBoraderPaint.setStrokeWidth(this.mStrokeWidth);
        this.mBoraderPaint.setAntiAlias(true);
        this.mBackgroundPaint.setAntiAlias(true);
        if ((context instanceof e) && ((e) context).v()) {
            this.ICON_HEIGHT = DensityUtil.dip2px(context, 14.0f);
            this.TEXT_TRANSLATE = DensityUtil.dip2px(context, 1.0f);
        } else {
            this.ICON_HEIGHT = DensityUtil.dip2px(context, 12.0f);
            this.TEXT_TRANSLATE = 0;
        }
        this.PADDING = DensityUtil.dip2px(context, 3.0f);
        this.MARGIN = this.mTaobao2021 ? DensityUtil.dip2px(context, 4.0f) : DensityUtil.dip2px(context, 2.0f);
        this.RADIUS = this.mTaobao2021 ? DensityUtil.dip2px(context, 2.0f) : DensityUtil.dip2px(context, 3.0f);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mLoaders.size(); i++) {
            this.mLoaders.valueAt(i).a();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mLoaders.size(); i++) {
            this.mLoaders.valueAt(i).b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int size;
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int width = getWidth() - getPaddingRight();
        if (this.mVisibleIconEndIndexValid) {
            size = this.mVisibleIconEndIndex;
        } else {
            size = this.mIconList.size();
        }
        int i3 = size;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = this.mIconStart.get(i4);
            int i6 = this.mIconWidth.get(i4);
            if (i5 > width) {
                q.b(LOG_TAG, "超出view的宽度");
            } else if (i6 == -1) {
                q.b(LOG_TAG, "wrong iconWidth");
            } else {
                IconBean iconBean = this.mIconList.get(i4);
                if (iconBean == null) {
                    q.b(LOG_TAG, "icon is null");
                } else {
                    SearchDomBean searchDomBean = iconBean.searchDomBean;
                    if (this.mIsDarkMode && iconBean.darkDomBean != null) {
                        searchDomBean = iconBean.darkDomBean;
                    }
                    SearchDomBean searchDomBean2 = searchDomBean;
                    if (searchDomBean2 == null) {
                        q.b(LOG_TAG, "icon dom is null");
                    } else {
                        this.mTmpRectF.set(0.0f, 0.0f, i6, this.ICON_HEIGHT);
                        canvas.save();
                        canvas.translate(i5, 0.0f);
                        canvas.clipRect(this.mTmpRectF);
                        if ("text".equals(iconBean.type)) {
                            int dip2px = searchDomBean2.borderRadius > 0 ? DensityUtil.dip2px(getContext(), searchDomBean2.borderRadius) : this.RADIUS;
                            setBackgroundPaintColor(iconBean, i4);
                            boolean boarderPaintColor = setBoarderPaintColor(iconBean);
                            if (boarderPaintColor) {
                                RectF rectF = this.mTmpRectF;
                                int i7 = this.mStrokeWidth;
                                rectF.inset(i7 / 2.0f, i7 / 2.0f);
                            }
                            float f = dip2px;
                            canvas.drawRoundRect(this.mTmpRectF, f, f, this.mBackgroundPaint);
                            if (boarderPaintColor) {
                                canvas.drawRoundRect(this.mTmpRectF, f, f, this.mBoraderPaint);
                            }
                            int i8 = (boarderPaintColor || this.mBackgroundPaint.getColor() != 0) ? this.PADDING : 0;
                            setTextPaintSize(searchDomBean2);
                            if (!StringUtils.isEmpty(iconBean.prefix)) {
                                float measureText = this.mTextPaint.measureText(iconBean.prefix);
                                int i9 = (searchDomBean2.separatorWidth <= 0 || searchDomBean2.separatorHeight <= 0) ? 0 : (this.ICON_HEIGHT / searchDomBean2.separatorHeight) * searchDomBean2.separatorWidth;
                                if (!StringUtils.isEmpty(searchDomBean2.prefixBgColor)) {
                                    int a2 = d.a(searchDomBean2.prefixBgColor, i2);
                                    if (this.mIsDarkMode && iconBean.darkDomBean == null) {
                                        a2 = d.a(25, a2);
                                    }
                                    this.mBackgroundPaint.setColor(a2);
                                    this.mBackgroundPaint.setShader(null);
                                    this.mTmpRectF.set(0.0f, 0.0f, dip2px << 1, this.ICON_HEIGHT);
                                    if (boarderPaintColor) {
                                        RectF rectF2 = this.mTmpRectF;
                                        int i10 = this.mStrokeWidth;
                                        rectF2.inset(i10, i10);
                                    }
                                    canvas.drawRoundRect(this.mTmpRectF, f, f, this.mBackgroundPaint);
                                    this.mTmpRectF.set(f, 0.0f, i8 + measureText + (i9 > 0 ? i9 / 2 : 0), this.ICON_HEIGHT);
                                    if (boarderPaintColor) {
                                        RectF rectF3 = this.mTmpRectF;
                                        int i11 = this.mStrokeWidth;
                                        rectF3.inset(i11, i11);
                                    }
                                    canvas.drawRect(this.mTmpRectF, this.mBackgroundPaint);
                                }
                                this.mTextPaint.setColor(d.a(searchDomBean2.prefixColor, -16777216));
                                float f2 = i8;
                                canvas.drawText(iconBean.prefix, f2, (this.ICON_HEIGHT - this.mTextPaint.descent()) - this.TEXT_TRANSLATE, this.mTextPaint);
                                int i12 = (int) (f2 + measureText);
                                if (StringUtils.isEmpty(searchDomBean2.separatorImg) || i9 <= 0) {
                                    i = width;
                                    i8 = i12;
                                } else {
                                    Drawable drawable = this.mDrawables.get(i4);
                                    int i13 = boarderPaintColor ? this.mStrokeWidth : 0;
                                    if (drawable == null) {
                                        if (this.mLoaders.get(i4) == null) {
                                            i = width;
                                            a aVar = new a(getContext(), this, i9, this.ICON_HEIGHT, i4);
                                            aVar.a(searchDomBean2.separatorImg);
                                            this.mLoaders.put(i4, aVar);
                                            Drawable drawable2 = this.mDrawables.get(i4);
                                            if (drawable2 != null) {
                                                drawable2.setBounds(i12, i13, i12 + i9, this.ICON_HEIGHT - i13);
                                                drawable2.draw(canvas);
                                            }
                                        } else {
                                            i = width;
                                        }
                                    } else {
                                        i = width;
                                        drawable.setBounds(i12, i13, i12 + i9, this.ICON_HEIGHT - i13);
                                        drawable.draw(canvas);
                                    }
                                    i8 = i12 + i9;
                                }
                            } else {
                                i = width;
                            }
                            setTextPaintColor(searchDomBean2);
                            canvas.drawText(iconBean.text, i8, (this.ICON_HEIGHT - this.mTextPaint.descent()) - this.TEXT_TRANSLATE, this.mTextPaint);
                        } else {
                            i = width;
                            if ("img".equals(iconBean.type)) {
                                Drawable drawable3 = this.mDrawables.get(i4);
                                if (drawable3 == null) {
                                    if (this.mLoaders.get(i4) == null) {
                                        a aVar2 = new a(getContext(), this, (this.ICON_HEIGHT * searchDomBean2.width) / searchDomBean2.height, this.ICON_HEIGHT, i4);
                                        aVar2.a(searchDomBean2.image);
                                        this.mLoaders.put(i4, aVar2);
                                        Drawable drawable4 = this.mDrawables.get(i4);
                                        if (drawable4 != null) {
                                            drawable4.setBounds(0, 0, i6, this.ICON_HEIGHT);
                                            drawable4.draw(canvas);
                                        }
                                    }
                                } else {
                                    drawable3.setBounds(0, 0, i6, this.ICON_HEIGHT);
                                    drawable3.draw(canvas);
                                }
                                canvas.restore();
                                i4++;
                                width = i;
                                i2 = 0;
                            }
                        }
                        canvas.restore();
                        i4++;
                        width = i;
                        i2 = 0;
                    }
                }
            }
            i = width;
            i4++;
            width = i;
            i2 = 0;
        }
    }

    private boolean setBoarderPaintColor(IconBean iconBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5502d2f3", new Object[]{this, iconBean})).booleanValue();
        }
        SearchDomBean searchDomBean = iconBean.searchDomBean;
        if (this.mIsDarkMode && iconBean.darkDomBean != null) {
            searchDomBean = iconBean.darkDomBean;
        }
        if (StringUtils.isEmpty(searchDomBean.borderColor)) {
            return false;
        }
        int a2 = d.a(searchDomBean.borderColor, 0);
        if (this.mIsDarkMode && iconBean.darkDomBean == null) {
            a2 = d.a(127, a2);
        }
        this.mBoraderPaint.setColor(a2);
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i6 = this.mLastHeightSpec;
        if (i6 != -1 && i6 == i2 && (i3 = this.mLastWidthSpec) != -1 && i3 == i && (i4 = this.mLastHeight) != -1 && (i5 = this.mLastWidth) != -1) {
            setMeasuredDimension(i5, i4);
            return;
        }
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        setMaxWidth(i);
        this.mVisibleIconEndIndex = 0;
        this.mIconStart.clear();
        this.mIconWidth.clear();
        this.mIconGradients.clear();
        int resolveSizeAndState = resolveSizeAndState(getPaddingLeft() + getPaddingRight() + Math.max(suggestedMinimumWidth, arrangeIcon(this.mMaxWidth)), i, 0);
        int paddingTop = getPaddingTop() + getPaddingBottom() + Math.max(getSuggestedMinimumHeight(), this.ICON_HEIGHT);
        int resolveSizeAndState2 = resolveSizeAndState(paddingTop, i2, 0);
        if (resolveSizeAndState2 < paddingTop) {
            resolveSizeAndState2 = paddingTop;
        }
        this.mLastWidthSpec = i;
        this.mLastHeightSpec = i2;
        this.mLastWidth = resolveSizeAndState;
        this.mLastHeight = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private int arrangeIcon(int i) {
        int calImgIconWidth;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2972842a", new Object[]{this, new Integer(i)})).intValue();
        }
        this.mVisibleIconEndIndexValid = this.mMaxWidth > 0;
        StringBuilder sb = new StringBuilder();
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        int paddingLeft = getPaddingLeft();
        int size = this.mIconList.size();
        int i3 = paddingLeft;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (i4 < size && i5 < this.mMaxIconNum) {
            IconBean iconBean = this.mIconList.get(i4);
            if (iconBean == null) {
                q.b(LOG_TAG, "icon 不存在");
            } else {
                SearchDomBean searchDomBean = iconBean.searchDomBean;
                if (searchDomBean == null) {
                    this.mIconStart.put(i4, -1);
                    this.mIconWidth.put(i4, -1);
                    this.mIconGradients.put(i4, null);
                    this.mVisibleIconEndIndex += i2;
                    q.b(LOG_TAG, "icon 样式不存在:" + iconBean.domClass);
                } else {
                    if ("text".equals(iconBean.type)) {
                        calImgIconWidth = calTextIconWidth(searchDomBean, iconBean);
                    } else {
                        calImgIconWidth = "img".equals(iconBean.type) ? calImgIconWidth(searchDomBean, iconBean) : 0;
                    }
                    if (calImgIconWidth <= 0) {
                        this.mIconStart.put(i4, -1);
                        this.mIconWidth.put(i4, -1);
                        this.mIconGradients.put(i4, null);
                        this.mVisibleIconEndIndex++;
                    } else {
                        i5++;
                        int i6 = i4 > 0 ? this.MARGIN : 0;
                        if (i > 0 && i3 + calImgIconWidth + i6 > paddingRight) {
                            this.mIconStart.put(i4, -1);
                            this.mIconWidth.put(i4, -1);
                            this.mIconGradients.put(i4, null);
                            this.mVisibleIconEndIndex++;
                            z = true;
                        } else {
                            i3 += i6 + calImgIconWidth;
                            this.mIconStart.put(i4, i3 - calImgIconWidth);
                            this.mIconWidth.put(i4, calImgIconWidth);
                            if (hasGradientConfig(searchDomBean)) {
                                int a2 = d.a(searchDomBean.backgroundGradientStart, 0);
                                int a3 = d.a(searchDomBean.backgroundGradientEnd, 0);
                                if (this.mIsDarkMode && iconBean.darkDomBean == null) {
                                    a2 = d.a(25, a2);
                                    a3 = d.a(25, a3);
                                }
                                this.mIconGradients.put(i4, new LinearGradient(0.0f, 0.0f, calImgIconWidth, 0.0f, a2, a3, Shader.TileMode.CLAMP));
                            } else {
                                this.mIconGradients.put(i4, null);
                            }
                            this.mVisibleIconEndIndex++;
                            if ("text".equals(iconBean.type)) {
                                sb.append(iconBean.text);
                                sb.append(" ");
                            }
                            z = true;
                            i4++;
                            i2 = 1;
                        }
                    }
                }
            }
            i4++;
            i2 = 1;
        }
        setContentDescription(sb.toString());
        if (!z) {
            setVisibility(4);
        }
        return i3;
    }

    private boolean hasGradientConfig(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7860ce7", new Object[]{this, searchDomBean})).booleanValue() : !StringUtils.isEmpty(searchDomBean.backgroundGradientStart) && !StringUtils.isEmpty(searchDomBean.backgroundGradientEnd);
    }

    private int calImgIconWidth(SearchDomBean searchDomBean, IconBean iconBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeb7207c", new Object[]{this, searchDomBean, iconBean})).intValue();
        }
        if (searchDomBean.width > 0 && searchDomBean.height > 0) {
            return (this.ICON_HEIGHT * searchDomBean.width) / searchDomBean.height;
        }
        return -1;
    }

    private int calTextIconWidth(SearchDomBean searchDomBean, IconBean iconBean) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2a12002", new Object[]{this, searchDomBean, iconBean})).intValue();
        }
        setTextPaintSize(searchDomBean);
        float measureText = this.mTextPaint.measureText(iconBean.text);
        if (!StringUtils.isEmpty(iconBean.prefix)) {
            measureText += this.mTextPaint.measureText(iconBean.prefix);
            if (searchDomBean.separatorWidth > 0 && searchDomBean.separatorHeight > 0) {
                measureText += (this.ICON_HEIGHT / searchDomBean.separatorHeight) * searchDomBean.separatorWidth;
            }
        }
        if (d.a(searchDomBean.backgroundColor, 0) == 0 && !hasGradientConfig(searchDomBean)) {
            z = false;
        }
        return (!StringUtils.isEmpty(searchDomBean.borderColor) || z) ? ((int) measureText) + (this.PADDING * 2) : (int) measureText;
    }

    private void setTextPaintSize(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd577f9f", new Object[]{this, searchDomBean});
        } else if (searchDomBean.textSize > 0.0f) {
            this.mTextPaint.setTextSize(DensityUtil.dip2px(getContext(), searchDomBean.textSize));
        } else {
            this.mTextPaint.setTextSize(DensityUtil.dip2px(getContext(), DEFAULT_TEXT_SIZE));
        }
    }

    private void setBackgroundPaintColor(IconBean iconBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63518635", new Object[]{this, iconBean, new Integer(i)});
            return;
        }
        SearchDomBean searchDomBean = iconBean.searchDomBean;
        if (this.mIsDarkMode && iconBean.darkDomBean != null) {
            searchDomBean = iconBean.darkDomBean;
        }
        if (hasGradientConfig(searchDomBean)) {
            LinearGradient linearGradient = this.mIconGradients.get(i);
            if (linearGradient == null) {
                return;
            }
            this.mBackgroundPaint.setColor(-16711936);
            this.mBackgroundPaint.setShader(linearGradient);
            return;
        }
        this.mBackgroundPaint.setShader(null);
        int a2 = d.a(searchDomBean.backgroundColor, 0);
        if (this.mIsDarkMode && iconBean.darkDomBean == null) {
            a2 = d.a(25, a2);
        }
        this.mBackgroundPaint.setColor(a2);
    }

    private void setTextPaintColor(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef799fb", new Object[]{this, searchDomBean});
        } else {
            this.mTextPaint.setColor(d.a(searchDomBean.textColor, -1));
        }
    }

    private void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            this.mNeedReLayout = true;
        } else if (mode == 1073741824) {
            this.mNeedReLayout = false;
        } else {
            size = -1;
            this.mNeedReLayout = true;
        }
        this.mMaxWidth = size;
    }

    public void render(List<IconBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd0be0e", new Object[]{this, list});
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.mIconList.clear();
        this.mIconList.addAll(list);
        this.mDrawables.clear();
        for (int i = 0; i < this.mLoaders.size(); i++) {
            this.mLoaders.valueAt(i).c();
        }
        this.mLoaders.clear();
        if (this.mNeedReLayout) {
            requestLayout();
        } else {
            this.mIconStart.clear();
            this.mIconWidth.clear();
            this.mIconGradients.clear();
            this.mVisibleIconEndIndex = 0;
            arrangeIcon(this.mMaxWidth);
        }
        invalidate();
        invalidateMeasureCache();
    }

    public void invalidateMeasureCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2ce6a6", new Object[]{this});
            return;
        }
        this.mLastHeightSpec = -1;
        this.mLastWidthSpec = -1;
        this.mLastWidth = -1;
        this.mLastHeight = -1;
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.mDrawables.put(i, bitmapDrawable);
        invalidate();
    }

    public int getMaxIconNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dadf5739", new Object[]{this})).intValue() : this.mMaxIconNum;
    }

    public void setMaxIconNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e29df1", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxIconNum = i;
        }
    }
}
