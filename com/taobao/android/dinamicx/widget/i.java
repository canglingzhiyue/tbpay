package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.view.DXNativeFastText;
import tb.fxo;
import tb.gaz;
import tb.gbg;
import tb.kge;

/* loaded from: classes.dex */
public class i extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int DEFAULT_FONT_WEIGHT = 0;
    public static int DEFAULT_MAX_LINE = 0;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static int DEFAULT_TEXT_SIZE = 0;
    public static final long DXFASTTEXTVIEW_ENABLEELLIPSIZEENDFIX_ANDROID = -7798689015804333677L;
    public static final long DXFASTTEXTVIEW_FIXBREAKMODE = 1123090172363955901L;
    public static final CharSequence ELLIPSIS_TEXT;
    public Layout.Alignment alignment;
    public int beforeEllipsizeLineCount;
    public StringUtils.TruncateAt ellipsize;
    private boolean enableEllipsizeEndFix_Android;
    public int fontWeight;
    private boolean isItalic;
    public int lineBreakMode;
    public int maxLine;
    public int maxWidth;
    public int realPaddingBottom;
    public int realPaddingTop;
    public StaticLayout staticLayout;
    public int textFlags;
    public int textGravity;
    public TextPaint textPaint;
    public float textSize;
    public int textStyle;
    public float translateY;
    public CharSequence showText = "";
    private boolean enableTextSizeStrategy = true;
    public int lineHeight = -1;
    public int lineSpacing = -1;
    public boolean fixBreakMode = false;
    public CharSequence text = "";
    public int textColor = -16777216;

    private int getFontWeightValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("653523fb", new Object[]{this, new Integer(i)})).intValue();
        }
        switch (i) {
            case 0:
            default:
                return 400;
            case 1:
                return 100;
            case 2:
                return 200;
            case 3:
                return 300;
            case 4:
                return 500;
            case 5:
                return 600;
            case 6:
                return 700;
            case 7:
                return 800;
            case 8:
                return 900;
        }
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    static {
        kge.a(692706779);
        DEFAULT_TEXT_SIZE = 0;
        DEFAULT_MAX_LINE = 1;
        DEFAULT_FONT_WEIGHT = -1;
        ELLIPSIS_TEXT = "…";
    }

    public i() {
        if (DEFAULT_TEXT_SIZE == 0 && DinamicXEngine.i() != null) {
            DEFAULT_TEXT_SIZE = gbg.a(DinamicXEngine.i(), 12.0f);
        }
        this.textSize = DEFAULT_TEXT_SIZE;
        this.textStyle = 0;
        this.lineBreakMode = -1;
        this.textGravity = 0;
        this.maxLine = DEFAULT_MAX_LINE;
        this.maxWidth = Integer.MAX_VALUE;
        this.fontWeight = DEFAULT_FONT_WEIGHT;
        this.isItalic = false;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-951146062);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new i();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new i();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else if (!this.enableTextSizeStrategy || this.dXRuntimeContext == null) {
        } else {
            DXEngineConfig a2 = this.dXRuntimeContext.C().a();
            if (a2 != null && a2.n()) {
                z = true;
            }
            if (!z) {
                return;
            }
            this.textSize = com.taobao.android.dinamicx.p.a(this.dXRuntimeContext, this.textSize);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int min;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.showText = this.text;
        initText();
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            min = View.MeasureSpec.getSize(i);
            this.staticLayout = makeNewLayout((min - getPaddingLeft()) - getPaddingRight(), this.showText);
        } else {
            min = Math.min(Math.min(((int) this.textPaint.measureText(this.text.toString())) + getPaddingLeft() + getPaddingRight(), View.MeasureSpec.getSize(i)), this.maxWidth);
            this.staticLayout = makeNewLayout((min - getPaddingLeft()) - getPaddingRight(), this.text);
        }
        int i4 = this.maxLine;
        if (i4 > 0 && i4 < this.staticLayout.getLineCount()) {
            this.beforeEllipsizeLineCount = this.staticLayout.getLineCount();
            calculateEllipsizeText();
            this.staticLayout = makeNewLayout((min - getPaddingLeft()) - getPaddingRight(), this.showText);
        } else {
            this.showText = this.text;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i3 = size;
        } else if (!StringUtils.isEmpty(this.text) || this.layoutHeight != -2) {
            int height = this.staticLayout.getHeight() + this.realPaddingBottom + this.realPaddingTop;
            int i5 = this.maxLine;
            if (i5 > 0 && i5 < this.staticLayout.getLineCount()) {
                height = this.staticLayout.getLineTop(this.maxLine);
            }
            i3 = Math.min(height, size);
        }
        setMeasuredDimension(min, i3);
        this.translateY = calculateTranslateY(mode);
    }

    private void calculateEllipsizeText() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7621b", new Object[]{this});
            return;
        }
        int lineEnd = this.staticLayout.getLineEnd(this.maxLine - 1);
        try {
            if (lineEnd <= 0) {
                this.showText = "";
                return;
            }
            if (this.ellipsize != null && this.text.length() != 1) {
                float width = this.staticLayout.getWidth() - this.textPaint.measureText(ELLIPSIS_TEXT, 0, ELLIPSIS_TEXT.length());
                int lineStart = this.staticLayout.getLineStart(this.maxLine - 1);
                if (this.ellipsize == StringUtils.TruncateAt.END) {
                    int i2 = lineEnd - 1;
                    if (isEnableEllipsizeEndFix()) {
                        i2++;
                    }
                    while (true) {
                        if (i2 < lineStart) {
                            i2 = 0;
                            break;
                        }
                        CharSequence subSequence = this.text.subSequence(lineStart, i2);
                        if (this.textPaint.measureText(subSequence, 0, subSequence.length()) < width) {
                            break;
                        }
                        i2--;
                    }
                    this.showText = this.text.subSequence(0, i2).toString() + ((Object) ELLIPSIS_TEXT);
                    return;
                } else if (this.ellipsize == StringUtils.TruncateAt.START && this.maxLine == 1) {
                    int length = this.text.length();
                    int i3 = length - 1;
                    while (true) {
                        if (i3 < 0) {
                            i = 0;
                            break;
                        } else if (this.textPaint.measureText(this.text, i3, length) > width) {
                            i = 1 + i3;
                            break;
                        } else {
                            i3--;
                        }
                    }
                    this.showText = ((Object) ELLIPSIS_TEXT) + this.text.subSequence(i, length).toString();
                    return;
                } else if (this.ellipsize != StringUtils.TruncateAt.MIDDLE || this.maxLine != 1) {
                    return;
                } else {
                    int length2 = this.text.length();
                    int i4 = length2;
                    int i5 = 0;
                    boolean z = true;
                    int i6 = 0;
                    float f = 0.0f;
                    float f2 = 0.0f;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        } else if (z) {
                            i6++;
                            float measureText = this.textPaint.measureText(this.text, 0, i6);
                            if (measureText + f2 > width) {
                                i6--;
                                break;
                            }
                            f = measureText;
                            z = false;
                            i5++;
                        } else {
                            i4--;
                            float measureText2 = this.textPaint.measureText(this.text, i4, length2);
                            if (f + measureText2 > width) {
                                i4++;
                                break;
                            }
                            f2 = measureText2;
                            z = true;
                            i5++;
                        }
                    }
                    this.showText = this.text.subSequence(0, i6).toString() + ((Object) ELLIPSIS_TEXT) + ((Object) this.text.subSequence(i4, length2));
                    return;
                }
            }
            this.showText = this.text.subSequence(0, lineEnd);
        } catch (Exception e) {
            this.showText = this.text.subSequence(0, lineEnd);
            if (getDXRuntimeContext() != null && !StringUtils.isEmpty(getDXRuntimeContext().A())) {
                com.taobao.android.dinamicx.s n = getDXRuntimeContext().n();
                n.b = getDXRuntimeContext().c();
                n.c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_MEASURE, 80005));
            } else {
                com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s("dinamicx");
                sVar.c.add(new s.a(DXMonitorConstant.DX_MONITOR_PIPELINE_DETAIL, DXMonitorConstant.DX_MONITOR_SERVICE_ID_PERFORM_MEASURE, 80005));
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
            if (!DinamicXEngine.j()) {
                return;
            }
            e.printStackTrace();
        }
    }

    public void initText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b392464", new Object[]{this});
            return;
        }
        if (this.textPaint == null) {
            this.textPaint = new TextPaint();
        }
        this.textPaint.setAntiAlias(true);
        this.textPaint.setTextSize(this.textSize);
        this.textPaint.setColor(tryFetchDarkModeColor("textColor", 0, this.textColor));
        if (this.fontWeight != DEFAULT_FONT_WEIGHT && Build.VERSION.SDK_INT >= 28) {
            this.textPaint.setTypeface(fxo.a().a(getFontWeightValue(this.fontWeight), this.isItalic));
        } else {
            this.textPaint.setTypeface(getTypeface(this.textStyle));
        }
        int i = this.textFlags;
        if (i > 0) {
            this.textPaint.setFlags(i);
        }
        this.ellipsize = getEllipsize(this.lineBreakMode);
        this.alignment = getAlignment(this.textGravity);
        if (getAccessibilityText() != null) {
            return;
        }
        setAccessibilityText(this.text.toString());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 16) {
            String accessibilityText = getAccessibilityText();
            if (accessibilityText != null) {
                view.setContentDescription(accessibilityText);
            }
            if (i == 3) {
                return;
            }
            if (i == 1 || i == -1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
        } else {
            view.setContentDescription("");
        }
    }

    public Typeface getTypeface(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("80560ca5", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return Typeface.defaultFromStyle(0);
        }
        if (i == 1) {
            return Typeface.defaultFromStyle(1);
        }
        if (i == 2) {
            return Typeface.defaultFromStyle(2);
        }
        if (i == 3) {
            return Typeface.defaultFromStyle(3);
        }
        return Typeface.defaultFromStyle(0);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof i)) {
            return;
        }
        i iVar = (i) dXWidgetNode;
        this.textStyle = iVar.textStyle;
        this.fontWeight = iVar.fontWeight;
        this.isItalic = iVar.isItalic;
        this.textGravity = iVar.textGravity;
        this.maxLine = iVar.maxLine;
        this.lineBreakMode = iVar.lineBreakMode;
        this.maxWidth = iVar.maxWidth;
        this.text = iVar.text;
        this.textColor = iVar.textColor;
        this.textSize = iVar.textSize;
        this.textFlags = iVar.textFlags;
        this.showText = iVar.showText;
        this.textPaint = iVar.textPaint;
        this.staticLayout = iVar.staticLayout;
        this.ellipsize = iVar.ellipsize;
        this.translateY = iVar.translateY;
        this.alignment = iVar.alignment;
        this.lineHeight = iVar.lineHeight;
        this.lineSpacing = iVar.lineSpacing;
        this.realPaddingTop = iVar.realPaddingTop;
        this.realPaddingBottom = iVar.realPaddingBottom;
        this.beforeEllipsizeLineCount = iVar.beforeEllipsizeLineCount;
        this.enableTextSizeStrategy = iVar.enableTextSizeStrategy;
        this.enableEllipsizeEndFix_Android = iVar.enableEllipsizeEndFix_Android;
        this.fixBreakMode = iVar.fixBreakMode;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 6751005219504497256L) {
            return DEFAULT_TEXT_SIZE;
        }
        if (j == 4685059187929305417L) {
            return DEFAULT_MAX_LINE;
        }
        if (j == -2369181291898902408L || j == gaz.DXRICHTEXT_LINEHEIGHT) {
            return -1;
        }
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j == -1589356413427545047L) {
            return DEFAULT_FONT_WEIGHT;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == 38178040921L ? "" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5737767606580872653L == j) {
            this.textColor = i;
        } else if (-1564827143683948874L == j) {
            this.textGravity = i;
        } else if (4685059187929305417L == j) {
            if (i > 0) {
                this.maxLine = i;
            } else {
                this.maxLine = Integer.MAX_VALUE;
            }
        } else if (gaz.DXRICHTEXT_MAXWIDTH == j) {
            if (i > 0) {
                this.maxWidth = i;
            } else {
                this.maxWidth = Integer.MAX_VALUE;
            }
        } else if (1650157837879951391L == j) {
            this.lineBreakMode = i;
        } else if (6751005219504497256L == j) {
            if (i > 0) {
                this.textSize = i;
            } else {
                this.textSize = DEFAULT_TEXT_SIZE;
            }
        } else if (9423384817756195L == j) {
            this.textStyle = i > 0 ? this.textStyle | 1 : this.textStyle & (-2);
        } else if (3527554185889034042L == j) {
            this.textStyle = i > 0 ? this.textStyle | 2 : this.textStyle & (-3);
            this.isItalic = true;
        } else if (-1740854880214056386L == j) {
            this.textFlags = i > 0 ? this.textFlags | 17 : this.textFlags & (-18);
        } else if (-8089424158689439347L == j) {
            this.textFlags = i > 0 ? this.textFlags | 9 : this.textFlags & (-10);
        } else if (-1589356413427545047L == j) {
            if (i >= 0) {
                this.fontWeight = i;
            } else {
                this.fontWeight = DEFAULT_FONT_WEIGHT;
            }
        } else if (gaz.DXRICHTEXT_LINEHEIGHT == j) {
            this.lineHeight = i;
        } else if (-2369181291898902408L == j) {
            this.lineSpacing = i;
        } else if (4822617398935994384L == j) {
            if (i != 0) {
                z = true;
            }
            this.enableTextSizeStrategy = z;
        } else if (j == -7798689015804333677L) {
            if (i != 0) {
                z = true;
            }
            this.enableEllipsizeEndFix_Android = z;
        } else if (j == DXFASTTEXTVIEW_FIXBREAKMODE) {
            if (i != 0) {
                z = true;
            }
            this.fixBreakMode = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            this.text = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeFastText dXNativeFastText = new DXNativeFastText(context);
        com.taobao.android.dinamicx.monitor.b.b(dXNativeFastText);
        return dXNativeFastText;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof DXNativeFastText)) {
        } else {
            DXNativeFastText dXNativeFastText = (DXNativeFastText) view;
            StaticLayout staticLayout = this.staticLayout;
            if (staticLayout != null) {
                dXNativeFastText.setStaticLayout(staticLayout);
            }
            dXNativeFastText.setTranslateY(this.translateY + this.realPaddingTop);
            dXNativeFastText.setTranslateX(getPaddingLeft());
            com.taobao.android.dinamicx.monitor.b.a(dXNativeFastText);
        }
    }

    public float calculateTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4256c91b", new Object[]{this, new Integer(i)})).floatValue();
        }
        int height = this.staticLayout.getHeight();
        int measuredHeight = (getMeasuredHeight() - this.realPaddingTop) - this.realPaddingBottom;
        if (height < measuredHeight && i == 1073741824) {
            return (measuredHeight - height) >> 1;
        }
        return 0.0f;
    }

    public StringUtils.TruncateAt getEllipsize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringUtils.TruncateAt) ipChange.ipc$dispatch("692e091b", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return StringUtils.TruncateAt.START;
        }
        if (i == 2) {
            return StringUtils.TruncateAt.MIDDLE;
        }
        if (i == 3) {
            return StringUtils.TruncateAt.END;
        }
        return null;
    }

    public Layout.Alignment getAlignment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout.Alignment) ipChange.ipc$dispatch("bd335135", new Object[]{this, new Integer(i)});
        }
        if (getDirection() == 1) {
            if (i == 0) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i == 2) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            if (i == 1) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i == 2) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }
    }

    private StaticLayout makeNewLayout(int i, CharSequence charSequence) {
        boolean z;
        float f;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (StaticLayout) ipChange.ipc$dispatch("de237c7b", new Object[]{this, new Integer(i), charSequence});
        }
        boolean z3 = this.lineSpacing >= 0;
        float textSize = getTextSize();
        float descent = this.textPaint.descent() - this.textPaint.ascent();
        boolean z4 = ((float) this.lineHeight) >= descent;
        this.realPaddingTop = getPaddingTop();
        this.realPaddingBottom = getPaddingBottom();
        float f2 = 0.0f;
        if (z3 && !z4) {
            f2 = Math.max(this.lineSpacing - (descent - textSize), 0.0f);
            z2 = false;
        }
        if (z4) {
            float f3 = descent - textSize;
            int i2 = this.lineHeight;
            int i3 = (int) (((i2 - descent) + f3) / 2.0f);
            int max = Math.max((int) (((i2 - descent) - f3) / 2.0f), 0);
            int max2 = Math.max(i3, 0);
            this.realPaddingTop = getPaddingTop() + max;
            this.realPaddingBottom = getPaddingBottom() + max2;
            f = z3 ? max + max2 + this.lineSpacing : max + max2;
            z = false;
        } else {
            z = z2;
            f = f2;
        }
        if (Build.VERSION.SDK_INT >= 23 && this.fixBreakMode) {
            return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.textPaint, i).setAlignment(this.alignment).setLineSpacing(f, 1.0f).setIncludePad(z).setMaxLines(this.maxLine).setEllipsize(this.ellipsize).build();
        }
        return new StaticLayout(charSequence, this.textPaint, i, this.alignment, 1.0f, f, z);
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue() : this.textColor;
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue() : this.textSize;
    }

    public int getTextStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("394a7b48", new Object[]{this})).intValue() : this.textStyle;
    }

    public int getFontWeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d9ea997", new Object[]{this})).intValue() : this.fontWeight;
    }

    public int getTextGravity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5324625", new Object[]{this})).intValue() : this.textGravity;
    }

    public int getMaxLines() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a208196b", new Object[]{this})).intValue() : this.maxLine;
    }

    public int getLineBreakMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8de1672", new Object[]{this})).intValue() : this.lineBreakMode;
    }

    public int getMaxWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f83cb2", new Object[]{this})).intValue() : this.maxWidth;
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
        } else {
            this.text = charSequence;
        }
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this}) : this.text;
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
        } else if (f > 0.0f) {
            this.textSize = f;
        } else {
            this.textSize = DEFAULT_TEXT_SIZE;
        }
    }

    public void setTextStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fbca5a", new Object[]{this, new Integer(i)});
        } else {
            this.textStyle = i;
        }
    }

    public void setFontWeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0d9753", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.fontWeight = i;
        } else {
            this.fontWeight = DEFAULT_FONT_WEIGHT;
        }
    }

    public void setTextGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a513881d", new Object[]{this, new Integer(i)});
        } else {
            this.textGravity = i;
        }
    }

    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.maxLine = i;
        } else {
            this.maxLine = Integer.MAX_VALUE;
        }
    }

    public void setLineBreakMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10ae70", new Object[]{this, new Integer(i)});
        } else {
            this.lineBreakMode = i;
        }
    }

    public void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.maxWidth = i;
        } else {
            this.maxWidth = Integer.MAX_VALUE;
        }
    }

    public StaticLayout getStaticLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StaticLayout) ipChange.ipc$dispatch("5b0b5d8c", new Object[]{this}) : this.staticLayout;
    }

    public int getBeforeEllipsizeLineCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("145c33bd", new Object[]{this})).intValue() : this.beforeEllipsizeLineCount;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == i.class;
    }

    public boolean isEnableEllipsizeEndFix() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce1ec6a5", new Object[]{this})).booleanValue() : this.enableEllipsizeEndFix_Android;
    }
}
