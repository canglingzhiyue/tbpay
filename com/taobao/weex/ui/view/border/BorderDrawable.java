package com.taobao.weex.ui.view.border;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import tb.kge;

/* loaded from: classes9.dex */
public class BorderDrawable extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BORDER_BOTTOM_LEFT_RADIUS = 3;
    public static final int BORDER_BOTTOM_RIGHT_RADIUS = 2;
    public static final int BORDER_RADIUS_ALL = 5;
    public static final int BORDER_TOP_LEFT_RADIUS = 0;
    public static final int BORDER_TOP_RIGHT_RADIUS = 1;
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final BorderStyle DEFAULT_BORDER_STYLE;
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    private static final String TAG = "Border";
    private static BorderStyle[] sBorderStyle;
    private SparseIntArray mBorderColor;
    private CSSShorthand<CSSShorthand.CORNER> mBorderRadius;
    private SparseIntArray mBorderStyle;
    private CSSShorthand<CSSShorthand.EDGE> mBorderWidth;
    private BottomLeftCorner mBottomLeftCorner;
    private BottomRightCorner mBottomRightCorner;
    private CSSShorthand<CSSShorthand.CORNER> mOverlappingBorderRadius;
    private Path mPathForBorderOutline;
    private RectF mRectBounds;
    private TopLeftCorner mTopLeftCorner;
    private TopRightCorner mTopRightCorner;
    private final Paint mPaint = new Paint(1);
    private boolean mNeedUpdatePath = false;
    private int mColor = 0;
    private Shader mShader = null;
    private int mAlpha = 255;
    private final BorderEdge mBorderEdge = new BorderEdge();

    public static /* synthetic */ Object ipc$super(BorderDrawable borderDrawable, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    static {
        kge.a(-1740397149);
        DEFAULT_BORDER_STYLE = BorderStyle.SOLID;
        sBorderStyle = BorderStyle.values();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        updateBorderOutline();
        this.mPaint.setAlpha(255);
        if (this.mPathForBorderOutline != null) {
            int multiplyColorAlpha = WXViewInnerUtils.multiplyColorAlpha(this.mColor, this.mAlpha);
            Shader shader = this.mShader;
            if (shader != null) {
                this.mPaint.setShader(shader);
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.drawPath(this.mPathForBorderOutline, this.mPaint);
                this.mPaint.setShader(null);
            } else if ((multiplyColorAlpha >>> 24) != 0) {
                this.mPaint.setColor(multiplyColorAlpha);
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.drawPath(this.mPathForBorderOutline, this.mPaint);
                this.mPaint.setShader(null);
            }
        }
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeJoin(Paint.Join.ROUND);
        drawBorders(canvas);
        this.mPaint.setShader(null);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.mNeedUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (i == this.mAlpha) {
        } else {
            this.mAlpha = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbf8c822", new Object[]{this})).intValue() : this.mAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        if (this.mShader == null) {
            return WXViewInnerUtils.getOpacityFromColor(WXViewInnerUtils.multiplyColorAlpha(this.mColor, this.mAlpha));
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e08cfc4", new Object[]{this, outline});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (this.mPathForBorderOutline == null) {
                this.mNeedUpdatePath = true;
            }
            updateBorderOutline();
            outline.setConvexPath(this.mPathForBorderOutline);
        }
    }

    public void setBorderWidth(CSSShorthand.EDGE edge, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c21dd0f", new Object[]{this, edge, new Float(f)});
            return;
        }
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new CSSShorthand<>();
        }
        if (this.mBorderWidth.get(edge) == f) {
            return;
        }
        this.mBorderWidth.set(edge, f);
        this.mNeedUpdatePath = true;
        invalidateSelf();
    }

    public float getBorderWidth(CSSShorthand.EDGE edge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3952b8b5", new Object[]{this, edge})).floatValue() : this.mBorderWidth.get(edge);
    }

    public void setBorderRadius(CSSShorthand.CORNER corner, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee6074f", new Object[]{this, corner, new Float(f)});
            return;
        }
        if (this.mBorderRadius == null) {
            this.mBorderRadius = new CSSShorthand<>();
        }
        if (this.mBorderRadius.get(corner) == f) {
            if (corner != CSSShorthand.CORNER.ALL) {
                return;
            }
            if (f == this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT) && f == this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT) && f == this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT) && f == this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT)) {
                return;
            }
        }
        this.mBorderRadius.set(corner, f);
        this.mNeedUpdatePath = true;
        invalidateSelf();
    }

    public float[] getBorderRadius(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("dec6d775", new Object[]{this, rectF});
        }
        prepareBorderRadius(rectF);
        if (this.mOverlappingBorderRadius == null) {
            this.mOverlappingBorderRadius = new CSSShorthand<>();
        }
        float f = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT);
        float f2 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT);
        float f3 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT);
        float f4 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT);
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public float[] getBorderInnerRadius(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("b8bb6503", new Object[]{this, rectF});
        }
        prepareBorderRadius(rectF);
        if (this.mOverlappingBorderRadius == null) {
            this.mOverlappingBorderRadius = new CSSShorthand<>();
        }
        float f = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT);
        float f2 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT);
        float f3 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT);
        float f4 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT);
        CSSShorthand<CSSShorthand.EDGE> cSSShorthand = this.mBorderWidth;
        if (cSSShorthand != null) {
            f = Math.max(f - cSSShorthand.get(CSSShorthand.EDGE.TOP), 0.0f);
            f2 = Math.max(f2 - this.mBorderWidth.get(CSSShorthand.EDGE.TOP), 0.0f);
            f3 = Math.max(f3 - this.mBorderWidth.get(CSSShorthand.EDGE.BOTTOM), 0.0f);
            f4 = Math.max(f4 - this.mBorderWidth.get(CSSShorthand.EDGE.BOTTOM), 0.0f);
        }
        return new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public void setBorderColor(CSSShorthand.EDGE edge, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4b26f", new Object[]{this, edge, new Integer(i)});
            return;
        }
        if (this.mBorderColor == null) {
            this.mBorderColor = new SparseIntArray(5);
            this.mBorderColor.put(CSSShorthand.EDGE.ALL.ordinal(), -16777216);
        }
        if (getBorderColor(edge) == i) {
            return;
        }
        BorderUtil.updateSparseArray(this.mBorderColor, edge.ordinal(), i);
        invalidateSelf();
    }

    public int getBorderColor(CSSShorthand.EDGE edge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da2fb6fb", new Object[]{this, edge})).intValue() : BorderUtil.fetchFromSparseArray(this.mBorderColor, edge.ordinal(), -16777216);
    }

    public void setBorderStyle(CSSShorthand.EDGE edge, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55b0450", new Object[]{this, edge, str});
            return;
        }
        if (this.mBorderStyle == null) {
            this.mBorderStyle = new SparseIntArray(5);
            this.mBorderStyle.put(CSSShorthand.EDGE.ALL.ordinal(), DEFAULT_BORDER_STYLE.ordinal());
        }
        try {
            int ordinal = BorderStyle.valueOf(str.toUpperCase(Locale.US)).ordinal();
            if (getBorderStyle(edge) == ordinal) {
                return;
            }
            BorderUtil.updateSparseArray(this.mBorderStyle, edge.ordinal(), ordinal);
            invalidateSelf();
        } catch (IllegalArgumentException e) {
            WXLogUtils.e(TAG, WXLogUtils.getStackTrace(e));
        }
    }

    public int getBorderStyle(CSSShorthand.EDGE edge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("776b23ed", new Object[]{this, edge})).intValue() : BorderUtil.fetchFromSparseArray(this.mBorderStyle, edge.ordinal(), BorderStyle.SOLID.ordinal());
    }

    public int getColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue() : this.mColor;
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.mColor = i;
        invalidateSelf();
    }

    public void setImage(Shader shader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764bf998", new Object[]{this, shader});
            return;
        }
        this.mShader = shader;
        invalidateSelf();
    }

    public boolean hasImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ad8e2ec", new Object[]{this})).booleanValue() : this.mShader != null;
    }

    public boolean isRounded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a78b952e", new Object[]{this})).booleanValue();
        }
        CSSShorthand<CSSShorthand.CORNER> cSSShorthand = this.mBorderRadius;
        return (cSSShorthand == null || (cSSShorthand.get(CSSShorthand.CORNER.BORDER_TOP_LEFT) == 0.0f && this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT) == 0.0f && this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT) == 0.0f && this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT) == 0.0f)) ? false : true;
    }

    public Path getContentPath(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("aa49a8c8", new Object[]{this, rectF});
        }
        Path path = new Path();
        prepareBorderPath(0, 0, 0, 0, rectF, path);
        return path;
    }

    private void updateBorderOutline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1e4e34", new Object[]{this});
        } else if (!this.mNeedUpdatePath) {
        } else {
            this.mNeedUpdatePath = false;
            if (this.mPathForBorderOutline == null) {
                this.mPathForBorderOutline = new Path();
            }
            this.mPathForBorderOutline.reset();
            prepareBorderPath(0, 0, 0, 0, new RectF(getBounds()), this.mPathForBorderOutline);
        }
    }

    private void prepareBorderPath(int i, int i2, int i3, int i4, RectF rectF, Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb72008", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rectF, path});
        } else if (this.mBorderRadius != null) {
            prepareBorderRadius(rectF);
            if (this.mOverlappingBorderRadius == null) {
                this.mOverlappingBorderRadius = new CSSShorthand<>();
            }
            float f = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT);
            float f2 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT);
            float f3 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT);
            float f4 = this.mOverlappingBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT);
            float f5 = i4;
            float f6 = i;
            float f7 = i2;
            float f8 = i3;
            path.addRoundRect(rectF, new float[]{f - f5, f - f6, f2 - f7, f2 - f6, f3 - f7, f3 - f8, f4 - f5, f4 - f8}, Path.Direction.CW);
        } else {
            path.addRect(rectF, Path.Direction.CW);
        }
    }

    private void prepareBorderRadius(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393b3f9d", new Object[]{this, rectF});
        } else if (this.mBorderRadius == null) {
        } else {
            float scaleFactor = getScaleFactor(rectF);
            if (this.mOverlappingBorderRadius == null) {
                this.mOverlappingBorderRadius = new CSSShorthand<>();
            }
            if (!Float.isNaN(scaleFactor) && scaleFactor < 1.0f) {
                this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_TOP_LEFT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT) * scaleFactor);
                this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_TOP_RIGHT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT) * scaleFactor);
                this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT) * scaleFactor);
                this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT) * scaleFactor);
                return;
            }
            this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_TOP_LEFT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT));
            this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_TOP_RIGHT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT));
            this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT));
            this.mOverlappingBorderRadius.set(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT, this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT));
        }
    }

    private float getScaleFactor(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("252dc20b", new Object[]{this, rectF})).floatValue();
        }
        float f = this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT) + this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT);
        float f2 = this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_RIGHT) + this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT);
        float f3 = this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT) + this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT);
        float f4 = this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT) + this.mBorderRadius.get(CSSShorthand.CORNER.BORDER_TOP_LEFT);
        ArrayList arrayList = new ArrayList(4);
        updateFactor(arrayList, rectF.width(), f);
        updateFactor(arrayList, rectF.height(), f2);
        updateFactor(arrayList, rectF.width(), f3);
        updateFactor(arrayList, rectF.height(), f4);
        if (!arrayList.isEmpty()) {
            return ((Float) Collections.min(arrayList)).floatValue();
        }
        return Float.NaN;
    }

    private void updateFactor(List<Float> list, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e956f0", new Object[]{this, list, new Float(f), new Float(f2)});
        } else if (f2 == 0.0f) {
        } else {
            list.add(Float.valueOf(f / f2));
        }
    }

    private void drawBorders(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ed51bb", new Object[]{this, canvas});
            return;
        }
        RectF rectF = this.mRectBounds;
        if (rectF == null) {
            this.mRectBounds = new RectF(getBounds());
        } else {
            rectF.set(getBounds());
        }
        CSSShorthand<CSSShorthand.EDGE> cSSShorthand = this.mBorderWidth;
        if (cSSShorthand == null) {
            return;
        }
        float f = cSSShorthand.get(CSSShorthand.EDGE.LEFT);
        float f2 = this.mBorderWidth.get(CSSShorthand.EDGE.TOP);
        float f3 = this.mBorderWidth.get(CSSShorthand.EDGE.BOTTOM);
        float f4 = this.mBorderWidth.get(CSSShorthand.EDGE.RIGHT);
        if (this.mTopLeftCorner == null) {
            this.mTopLeftCorner = new TopLeftCorner();
        }
        this.mTopLeftCorner.set(getBorderRadius(CSSShorthand.CORNER.BORDER_TOP_LEFT), f, f2, this.mRectBounds);
        if (this.mTopRightCorner == null) {
            this.mTopRightCorner = new TopRightCorner();
        }
        this.mTopRightCorner.set(getBorderRadius(CSSShorthand.CORNER.BORDER_TOP_RIGHT), f2, f4, this.mRectBounds);
        if (this.mBottomRightCorner == null) {
            this.mBottomRightCorner = new BottomRightCorner();
        }
        this.mBottomRightCorner.set(getBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_RIGHT), f4, f3, this.mRectBounds);
        if (this.mBottomLeftCorner == null) {
            this.mBottomLeftCorner = new BottomLeftCorner();
        }
        this.mBottomLeftCorner.set(getBorderRadius(CSSShorthand.CORNER.BORDER_BOTTOM_LEFT), f3, f, this.mRectBounds);
        drawOneSide(canvas, this.mBorderEdge.set(this.mTopLeftCorner, this.mTopRightCorner, f2, CSSShorthand.EDGE.TOP));
        drawOneSide(canvas, this.mBorderEdge.set(this.mTopRightCorner, this.mBottomRightCorner, f4, CSSShorthand.EDGE.RIGHT));
        drawOneSide(canvas, this.mBorderEdge.set(this.mBottomRightCorner, this.mBottomLeftCorner, f3, CSSShorthand.EDGE.BOTTOM));
        drawOneSide(canvas, this.mBorderEdge.set(this.mBottomLeftCorner, this.mTopLeftCorner, f, CSSShorthand.EDGE.LEFT));
    }

    private float getBorderRadius(CSSShorthand.CORNER corner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf032a0d", new Object[]{this, corner})).floatValue();
        }
        CSSShorthand<CSSShorthand.CORNER> cSSShorthand = this.mOverlappingBorderRadius;
        if (cSSShorthand == null) {
            return 0.0f;
        }
        return cSSShorthand.get(corner);
    }

    private void drawOneSide(Canvas canvas, BorderEdge borderEdge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fc447a", new Object[]{this, canvas, borderEdge});
        } else if (0.0f == borderEdge.getBorderWidth()) {
        } else {
            preparePaint(borderEdge.getEdge());
            borderEdge.drawEdge(canvas, this.mPaint);
        }
    }

    private void preparePaint(CSSShorthand.EDGE edge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63787712", new Object[]{this, edge});
            return;
        }
        float f = this.mBorderWidth.get(edge);
        int multiplyColorAlpha = WXViewInnerUtils.multiplyColorAlpha(getBorderColor(edge), this.mAlpha);
        this.mPaint.setShader(sBorderStyle[getBorderStyle(edge)].getLineShader(f, multiplyColorAlpha, edge));
        this.mPaint.setColor(multiplyColorAlpha);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
    }
}
