package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.widget.TextViewCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.listview.TRecyclerView;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.view.DXMeasuredTextView;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.fqi;
import tb.fux;
import tb.fxe;
import tb.fxo;
import tb.fxs;
import tb.gaz;
import tb.gbg;
import tb.gbh;
import tb.kge;

/* loaded from: classes.dex */
public class af extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CUSTOM = 2;
    private static int DEFAULT_FLAGS = 0;
    public static final int DEFAULT_FROM_STYLE = 0;
    public static int DEFAULT_MAX_LINE = 0;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static int DEFAULT_TEXT_SIZE = 0;
    public static final int TYPEFACE_FINAL = 1;
    private static ThreadLocal<com.taobao.android.dinamicx.model.a> attributeThreadLocal;
    private static ThreadLocal<HashMap<Class, DXMeasuredTextView>> measuredTextViewHashMapThreadLocal;
    private com.taobao.android.dinamicx.model.a beforeMeasureAttribute;
    public boolean hasDeepCloneTextUnCommonUseProperty;
    public int lineBreakMode;
    public int maxLine;
    public int maxWidth;
    public CharSequence text = "";
    public int textColor = -16777216;
    public int textFlags;
    public int textGravity;
    public float textSize;
    public int textStyle;
    public b textViewUnCommonUseProperty;
    private DXMeasuredTextView textViewUtilForMeasure;

    private int getFontStyle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a1226e3", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return i != 3 ? 0 : 3;
    }

    public static /* synthetic */ Object ipc$super(af afVar, String str, Object... objArr) {
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
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
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

    public static /* synthetic */ Typeface access$000(af afVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("9b8e25ec", new Object[]{afVar, new Integer(i)}) : afVar.getFont(i);
    }

    public static /* synthetic */ int access$100(af afVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a95193aa", new Object[]{afVar, new Integer(i)})).intValue() : afVar.getFontStyle(i);
    }

    static {
        kge.a(1040943204);
        DEFAULT_TEXT_SIZE = 0;
        DEFAULT_MAX_LINE = 1;
        attributeThreadLocal = new ThreadLocal<>();
        measuredTextViewHashMapThreadLocal = new ThreadLocal<>();
        DEFAULT_FLAGS = 0;
    }

    /* loaded from: classes5.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12048a = true;
        public boolean b = false;
        public int c = TRecyclerView.ITEM_POSITION_MASK;
        public int d = 1;
        public boolean e = true;
        public String f = "";

        static {
            kge.a(-1127685198);
        }

        public b() {
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("24944b1e", new Object[]{this});
            }
            b bVar = new b();
            bVar.f12048a = this.f12048a;
            bVar.b = this.b;
            bVar.c = this.c;
            bVar.e = this.e;
            bVar.d = this.d;
            bVar.f = this.f;
            return bVar;
        }
    }

    public af() {
        if (DEFAULT_TEXT_SIZE == 0 && DinamicXEngine.i() != null) {
            DEFAULT_TEXT_SIZE = gbg.a(DinamicXEngine.i(), 12.0f);
        }
        HashMap<Class, DXMeasuredTextView> hashMap = measuredTextViewHashMapThreadLocal.get();
        if (hashMap == null) {
            hashMap = new HashMap<>();
            measuredTextViewHashMapThreadLocal.set(hashMap);
        }
        this.textViewUtilForMeasure = hashMap.get(getClass());
        if (this.textViewUtilForMeasure == null) {
            if (DinamicXEngine.i() != null) {
                this.textViewUtilForMeasure = new DXMeasuredTextView(DinamicXEngine.i());
                DEFAULT_FLAGS = this.textViewUtilForMeasure.getPaintFlags();
                hashMap.put(getClass(), this.textViewUtilForMeasure);
            } else {
                fux.b("DXTextViewWidgetNode create textViewUtilForMeasure 时 context是空");
            }
        }
        this.beforeMeasureAttribute = attributeThreadLocal.get();
        if (this.beforeMeasureAttribute == null) {
            this.beforeMeasureAttribute = new com.taobao.android.dinamicx.model.a();
            attributeThreadLocal.set(this.beforeMeasureAttribute);
        }
        this.textSize = DEFAULT_TEXT_SIZE;
        this.textStyle = 0;
        this.lineBreakMode = -1;
        this.textGravity = 0;
        this.maxLine = 1;
        this.maxWidth = -1;
    }

    public af(Context context) {
        if (DEFAULT_TEXT_SIZE == 0 && context != null) {
            DEFAULT_TEXT_SIZE = gbg.a(context, 12.0f);
        }
        this.textSize = DEFAULT_TEXT_SIZE;
        this.textStyle = 0;
        this.lineBreakMode = -1;
        this.textGravity = 0;
        this.maxLine = 1;
        this.maxWidth = -1;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1432730427);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new af();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new af();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else if (!isEnableTextSizeStrategy() || this.dXRuntimeContext == null) {
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
        DXMeasuredTextView dXMeasuredTextView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(i, i2);
        } else {
            if (fqi.k() && ((dXMeasuredTextView = this.textViewUtilForMeasure) == null || dXMeasuredTextView.getInitThreadId() != Thread.currentThread().getId())) {
                HashMap<Class, DXMeasuredTextView> hashMap = measuredTextViewHashMapThreadLocal.get();
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    measuredTextViewHashMapThreadLocal.set(hashMap);
                }
                this.textViewUtilForMeasure = hashMap.get(getClass());
                if (this.textViewUtilForMeasure == null) {
                    this.textViewUtilForMeasure = new DXMeasuredTextView(DinamicXEngine.i());
                    DEFAULT_FLAGS = this.textViewUtilForMeasure.getPaintFlags();
                    hashMap.put(getClass(), this.textViewUtilForMeasure);
                }
            }
            onBeforeMeasure(this.textViewUtilForMeasure);
            this.textViewUtilForMeasure.onMeasure(i, i2);
            if (StringUtils.isEmpty(this.text) && this.layoutHeight == -2) {
                setMeasuredDimension(this.textViewUtilForMeasure.getMeasuredWidthAndState(), 0);
            } else {
                setMeasuredDimension(this.textViewUtilForMeasure.getMeasuredWidthAndState(), this.textViewUtilForMeasure.getMeasuredHeightAndState());
            }
            checkTextViewMeasure(i, i2, getMeasuredWidthAndState(), getMeasuredHeightAndState());
            if (!fqi.N()) {
                return;
            }
            this.textViewUtilForMeasure.setText((CharSequence) null);
        }
    }

    public void onBeforeMeasure(TextView textView) {
        ViewGroup.LayoutParams generateLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        int layoutGravity = getLayoutGravity();
        resetMeasuredView(textView);
        this.beforeMeasureAttribute.f11888a = this.layoutWidth;
        this.beforeMeasureAttribute.b = this.layoutHeight;
        this.beforeMeasureAttribute.c = getWeight();
        if (layoutGravity != this.beforeMeasureAttribute.e) {
            this.beforeMeasureAttribute.d = gbh.a(getAbsoluteGravity(layoutGravity, getDirection()));
            this.beforeMeasureAttribute.e = layoutGravity;
        }
        m mVar = (m) this.parentWidget;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            generateLayoutParams = mVar.generateLayoutParams(this.beforeMeasureAttribute);
        } else {
            generateLayoutParams = mVar.generateLayoutParams(this.beforeMeasureAttribute, layoutParams);
        }
        textView.setLayoutParams(generateLayoutParams);
    }

    public void resetMeasuredView(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe64c63", new Object[]{this, textView});
            return;
        }
        if (!bx.a()) {
            setNativeText(textView, this.text);
        }
        float textSize = textView.getTextSize();
        float f = this.textSize;
        if (textSize != f) {
            textView.setTextSize(0, f);
        }
        if (!StringUtils.isEmpty(getFont())) {
            setNativeTextFont(textView, getFont(), this.textStyle);
        } else {
            setNativeTextStyle(textView, this.textStyle);
        }
        setNativeMaxLines(textView, this.maxLine);
        setNativeEllipsize(textView, this.lineBreakMode);
        setNativeMaxWidth(textView, this.maxWidth);
        setNativeTextFlags(textView, this.textFlags);
        setNativeTextIncludeFontPadding(textView, isIncludeFontPadding_Android());
        if (!bx.a()) {
            return;
        }
        setNativeText(textView, this.text);
    }

    public void setNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7415a331", new Object[]{this, textView, new Integer(i)});
        } else if (fqi.c()) {
            setTypefaceFinalNativeTextStyle(textView, i);
        } else {
            setDefaultFromStyleNativeTextStyle(textView, i);
        }
    }

    public void setDefaultFromStyleNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9f81eb", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setTag(R.id.dx_textview_font_tag, 0);
        textView.setTypeface(Typeface.defaultFromStyle(getFontStyle(i)));
    }

    public void setTypefaceFinalNativeTextStyle(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bac0996", new Object[]{this, textView, new Integer(i)});
            return;
        }
        textView.setTag(R.id.dx_textview_font_tag, 1);
        textView.setTypeface(getFont(i));
    }

    public void setNativeTextFlags(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5d987", new Object[]{this, textView, new Integer(i)});
        } else if (i == textView.getPaintFlags()) {
        } else {
            if (i == 0) {
                i = DEFAULT_FLAGS;
            }
            textView.getPaint().setFlags(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb92188", new Object[]{this, textView, new Integer(i), new Integer(i2)});
        } else if (!isAutoSize() || i2 <= 0 || i <= 0) {
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, 1, 0);
                } else {
                    TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, i, i2, 1, 0);
                }
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    public void setNativeText(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25fcd1b", new Object[]{this, textView, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
            textView.setText("");
        } else {
            textView.setText(charSequence);
        }
    }

    public void setNativeMaxLines(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5479b63a", new Object[]{this, textView, new Integer(i)});
        } else if (i > 0) {
            textView.setMaxLines(i);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
    }

    public void setNativeMaxWidth(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2fbec1", new Object[]{this, textView, new Integer(i)});
        } else if (i > 0) {
            textView.setMaxWidth(i);
        } else {
            textView.setMaxWidth(Integer.MAX_VALUE);
        }
    }

    public void setNativeTextFont(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b1cf11", new Object[]{this, textView, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                if (DinamicXEngine.i() == null) {
                    setNativeTextStyle(textView, i);
                    return;
                }
                Typeface a2 = fxo.a().a(str, getFontStyle(i));
                if (a2 != null) {
                    textView.setTypeface(a2);
                    textView.setTag(R.id.dx_textview_font_tag, 2);
                    return;
                }
                setNativeTextStyle(textView, i);
            } catch (Throwable th) {
                setNativeTextStyle(textView, i);
                com.taobao.android.dinamicx.exception.a.a(th, false);
            }
        }
    }

    public void setNativeTextIncludeFontPadding(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a074457", new Object[]{this, textView, new Boolean(z)});
        } else if (!fqi.B()) {
        } else {
            textView.setIncludeFontPadding(z);
        }
    }

    private Typeface getFont(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("9cf736ed", new Object[]{this, new Integer(i)});
        }
        Typeface typeface = Typeface.DEFAULT;
        if (i == 0) {
            return Typeface.DEFAULT;
        }
        if (i == 1) {
            return Typeface.DEFAULT_BOLD;
        }
        if (i == 2) {
            return Typeface.defaultFromStyle(2);
        }
        return i != 3 ? typeface : Typeface.defaultFromStyle(3);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof af)) {
            return;
        }
        af afVar = (af) dXWidgetNode;
        this.textStyle = afVar.textStyle;
        this.textGravity = afVar.textGravity;
        this.maxLine = afVar.maxLine;
        this.lineBreakMode = afVar.lineBreakMode;
        this.maxWidth = afVar.maxWidth;
        this.text = afVar.text;
        this.textColor = afVar.textColor;
        this.textSize = afVar.textSize;
        this.textFlags = afVar.textFlags;
        this.textViewUnCommonUseProperty = afVar.textViewUnCommonUseProperty;
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
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j == 1174195049226651996L) {
            return 0;
        }
        if (j == -7175398628172498739L) {
            return TRecyclerView.ITEM_POSITION_MASK;
        }
        if (j != 5734523154528465099L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
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
        } else if (-1740854880214056386L == j) {
            this.textFlags = i > 0 ? this.textFlags | 17 : this.textFlags & (-18);
        } else if (-8089424158689439347L == j) {
            this.textFlags = i > 0 ? this.textFlags | 9 : this.textFlags & (-10);
        } else if (4822617398935994384L == j) {
            if (i != 0) {
                z = true;
            }
            setEnableTextSizeStrategy(z);
        } else if (1174195049226651996L == j) {
            if (i != 0) {
                z = true;
            }
            setAutoSize(z);
        } else if (-7175398628172498739L == j) {
            if (i > 0) {
                setAutoSizeMaxTextSize(i);
            } else {
                setAutoSizeMaxTextSize(TRecyclerView.ITEM_POSITION_MASK);
            }
        } else if (5734523154528465099L == j) {
            if (i > 0) {
                setAutoSizeMinTextSize(i);
            } else {
                setAutoSizeMinTextSize(1);
            }
        } else if (j == 1046654090308105836L) {
            if (i != 0) {
                z = true;
            }
            setIncludeFontPadding_Android(z);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public boolean isIncludeFontPadding_Android() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a61795f", new Object[]{this})).booleanValue();
        }
        b bVar = this.textViewUnCommonUseProperty;
        if (bVar != null) {
            return bVar.f12048a;
        }
        return true;
    }

    public void setIncludeFontPadding_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e4cea1", new Object[]{this, new Boolean(z)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.f12048a = z;
    }

    public String getFont() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea4d754", new Object[]{this});
        }
        b bVar = this.textViewUnCommonUseProperty;
        return bVar == null ? "" : bVar.f;
    }

    public void setFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7553a2", new Object[]{this, str});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.f = str;
    }

    public int isAutoSizeMinTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3c35ec0", new Object[]{this})).intValue();
        }
        b bVar = this.textViewUnCommonUseProperty;
        if (bVar != null) {
            return bVar.d;
        }
        return 1;
    }

    public void setAutoSizeMinTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0de750e", new Object[]{this, new Integer(i)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.d = i;
    }

    public int isAutoSizeMaxTextSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35f352d2", new Object[]{this})).intValue();
        }
        b bVar = this.textViewUnCommonUseProperty;
        return bVar == null ? TRecyclerView.ITEM_POSITION_MASK : bVar.c;
    }

    public void setAutoSizeMaxTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ad033c", new Object[]{this, new Integer(i)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.c = i;
    }

    public boolean isAutoSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faab9125", new Object[]{this})).booleanValue();
        }
        b bVar = this.textViewUnCommonUseProperty;
        if (bVar != null) {
            return bVar.b;
        }
        return false;
    }

    public void setAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29be119b", new Object[]{this, new Boolean(z)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.b = z;
    }

    public boolean isEnableTextSizeStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        b bVar = this.textViewUnCommonUseProperty;
        if (bVar != null) {
            return bVar.e;
        }
        return true;
    }

    public void setEnableTextSizeStrategy(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cf07e7", new Object[]{this, new Boolean(z)});
            return;
        }
        setTextPropertyBeforeCheck();
        this.textViewUnCommonUseProperty.e = z;
    }

    public void setTextPropertyBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904e88c", new Object[]{this});
            return;
        }
        b bVar = this.textViewUnCommonUseProperty;
        if (bVar == null) {
            this.textViewUnCommonUseProperty = new b();
            this.hasDeepCloneTextUnCommonUseProperty = true;
        } else if (this.hasDeepCloneTextUnCommonUseProperty) {
        } else {
            this.textViewUnCommonUseProperty = bVar.a();
            this.hasDeepCloneTextUnCommonUseProperty = true;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            this.text = str;
        } else if (j == 34149272427L) {
            setFont(str);
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeTextView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof TextView)) {
        } else {
            TextView textView = (TextView) view;
            if (!bx.a()) {
                setNativeText(textView, this.text);
            }
            textView.setTextColor(tryFetchDarkModeColor("textColor", 0, this.textColor));
            textView.setTextSize(0, this.textSize);
            if (!StringUtils.isEmpty(getFont())) {
                setNativeTextFont(textView, getFont(), this.textStyle);
            } else {
                int i = this.textStyle;
                if (i != -1) {
                    setNativeTextStyle(textView, i);
                }
            }
            setNativeMaxLines(textView, this.maxLine);
            setNativeTextGravity(textView, this.textGravity);
            int i2 = this.lineBreakMode;
            if (i2 != -1) {
                setNativeEllipsize(textView, i2);
            }
            int i3 = this.maxWidth;
            if (i3 != -1) {
                setNativeMaxWidth(textView, i3);
            }
            setNativeTextFlags(textView, this.textFlags);
            setAutoSizeTextTypeUniformWithConfiguration(textView, isAutoSizeMinTextSize(), isAutoSizeMaxTextSize());
            setNativeTextIncludeFontPadding(this.textViewUtilForMeasure, isIncludeFontPadding_Android());
            if (!bx.a()) {
                return;
            }
            setNativeText(textView, this.text);
        }
    }

    public void setNativeTextGravity(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341b208e", new Object[]{this, textView, new Integer(i)});
        } else if (getDirection() == 1) {
            if (i == 0) {
                textView.setGravity(21);
            } else if (i == 1) {
                textView.setGravity(17);
            } else if (i == 2) {
                textView.setGravity(19);
            } else {
                textView.setGravity(16);
            }
        } else if (i == 0) {
            textView.setGravity(19);
        } else if (i == 1) {
            textView.setGravity(17);
        } else if (i == 2) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
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

    public void setNativeEllipsize(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a49cb7a", new Object[]{this, textView, new Integer(i)});
        } else if (i == 0) {
            textView.setEllipsize(null);
        } else if (i == 1) {
            textView.setEllipsize(StringUtils.TruncateAt.START);
        } else if (i == 2) {
            textView.setEllipsize(StringUtils.TruncateAt.MIDDLE);
        } else if (i != 3) {
        } else {
            textView.setEllipsize(StringUtils.TruncateAt.END);
        }
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this}) : this.text;
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

    public int getTextGravity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5324625", new Object[]{this})).intValue() : this.textGravity;
    }

    public int getTextFlags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("756ef11e", new Object[]{this})).intValue() : this.textFlags;
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

    public static void clearStaticField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1bc3a6", new Object[0]);
            return;
        }
        measuredTextViewHashMapThreadLocal = new ThreadLocal<>();
        DEFAULT_TEXT_SIZE = 0;
    }

    private void checkTextViewMeasure(final int i, final int i2, final int i3, final int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21932b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!fqi.d()) {
        } else {
            try {
                fxe.f(new Runnable() { // from class: com.taobao.android.dinamicx.widget.af.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        int i5;
                        int i6;
                        int measuredWidthAndState;
                        int measuredHeightAndState;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            DXMeasuredTextView dXMeasuredTextView = new DXMeasuredTextView(DinamicXEngine.i());
                            af.this.onBeforeMeasure(dXMeasuredTextView);
                            if (dXMeasuredTextView.getTag(R.id.dx_textview_font_tag) == null) {
                                return;
                            }
                            int intValue = ((Integer) dXMeasuredTextView.getTag(R.id.dx_textview_font_tag)).intValue();
                            if (intValue != 0) {
                                if (intValue == 1) {
                                    dXMeasuredTextView.setTypeface(Typeface.defaultFromStyle(af.access$100(af.this, af.this.textStyle)));
                                    i5 = i;
                                    i6 = i2;
                                }
                                measuredWidthAndState = dXMeasuredTextView.getMeasuredWidthAndState();
                                measuredHeightAndState = (StringUtils.isEmpty(af.this.text) || af.this.layoutHeight != -2) ? dXMeasuredTextView.getMeasuredHeightAndState() : 0;
                                if (measuredWidthAndState != i3 && measuredHeightAndState == i4) {
                                    return;
                                }
                                com.taobao.android.dinamicx.monitor.b.a(af.this.getDXRuntimeContext(), DXMonitorConstant.DX_TRXTVIEW_FONT, DXMonitorConstant.DX_TRXTVIEW_FONT_MEASURE_ERROR, (int) com.taobao.android.dinamicx.s.DX_TEXTVIEW_FONT_MEASURE_ERROR, String.format("text view 宽高计算不一致[width=%s height=%s measuredWidth=%s measuredHeight=%s  manufacturer=%s romName=%s romverName=%s systemModel=%s brand=%s fontStyle=%s  useTypeface=%s]", Integer.valueOf(measuredWidthAndState), Integer.valueOf(measuredHeightAndState), Integer.valueOf(i3), Integer.valueOf(i4), fxs.g(), fxs.h(), fxs.c(), fxs.f(), Build.BRAND, intValue + "", fqi.c() + ""));
                            }
                            dXMeasuredTextView.setTypeface(af.access$000(af.this, af.this.textStyle));
                            i5 = i;
                            i6 = i2;
                            dXMeasuredTextView.onMeasure(i5, i6);
                            measuredWidthAndState = dXMeasuredTextView.getMeasuredWidthAndState();
                            if (StringUtils.isEmpty(af.this.text)) {
                            }
                            if (measuredWidthAndState != i3) {
                            }
                            com.taobao.android.dinamicx.monitor.b.a(af.this.getDXRuntimeContext(), DXMonitorConstant.DX_TRXTVIEW_FONT, DXMonitorConstant.DX_TRXTVIEW_FONT_MEASURE_ERROR, (int) com.taobao.android.dinamicx.s.DX_TEXTVIEW_FONT_MEASURE_ERROR, String.format("text view 宽高计算不一致[width=%s height=%s measuredWidth=%s measuredHeight=%s  manufacturer=%s romName=%s romverName=%s systemModel=%s brand=%s fontStyle=%s  useTypeface=%s]", Integer.valueOf(measuredWidthAndState), Integer.valueOf(measuredHeightAndState), Integer.valueOf(i3), Integer.valueOf(i4), fxs.g(), fxs.h(), fxs.c(), fxs.f(), Build.BRAND, intValue + "", fqi.c() + ""));
                        } catch (Throwable th) {
                            com.taobao.android.dinamicx.exception.a.b(th);
                        }
                    }
                });
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == af.class;
    }
}
