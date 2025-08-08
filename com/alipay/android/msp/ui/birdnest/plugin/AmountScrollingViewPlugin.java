package com.alipay.android.msp.ui.birdnest.plugin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class AmountScrollingViewPlugin extends AbsFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String b = "getCurrentAmount";
    private AmountScrollingView c;
    private Context d;
    private float e;
    private float f;
    private float g;
    private MspContext h;
    private int i;

    public static /* synthetic */ Object ipc$super(AmountScrollingViewPlugin amountScrollingViewPlugin, String str, Object... objArr) {
        if (str.hashCode() == -740778895) {
            return new Boolean(super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("60211294", new Object[]{amountScrollingViewPlugin})).intValue() : amountScrollingViewPlugin.i;
    }

    public static /* synthetic */ float b(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7a920bb0", new Object[]{amountScrollingViewPlugin})).floatValue() : amountScrollingViewPlugin.f;
    }

    public static /* synthetic */ float c(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("950304cf", new Object[]{amountScrollingViewPlugin})).floatValue() : amountScrollingViewPlugin.g;
    }

    public static /* synthetic */ float d(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af73fdee", new Object[]{amountScrollingViewPlugin})).floatValue() : amountScrollingViewPlugin.e;
    }

    public static /* synthetic */ Context e(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d1b50f15", new Object[]{amountScrollingViewPlugin}) : amountScrollingViewPlugin.d;
    }

    public static /* synthetic */ MspContext f(AmountScrollingViewPlugin amountScrollingViewPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("5f79a050", new Object[]{amountScrollingViewPlugin}) : amountScrollingViewPlugin.h;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.c = new AmountScrollingView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        relativeLayout.addView(this.c, layoutParams);
        this.d = context;
        return relativeLayout;
    }

    public AmountScrollingViewPlugin(int i) {
        this.i = i;
        this.h = MspContextManager.getInstance().getMspContextByBizId(i);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue() : super.setRect(f, f2, f3, f4);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.PluginViewDelegate
    public String handleInvoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78f6c325", new Object[]{this, str, str2});
        }
        if (!b.equals(str)) {
            return "{}";
        }
        String a2 = a();
        return "{\"shownAmount\":\"" + a2 + "\"}";
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (AmountScrollingView.access$000(this.c) != null) {
            Iterator it = AmountScrollingView.access$000(this.c).iterator();
            while (it.hasNext()) {
                sb.append(((Integer) it.next()).intValue());
            }
        }
        if (AmountScrollingView.access$100(this.c) != null && AmountScrollingView.access$100(this.c).size() > 0) {
            sb.append(".");
            Iterator it2 = AmountScrollingView.access$100(this.c).iterator();
            while (it2.hasNext()) {
                sb.append(((Integer) it2.next()).intValue());
            }
        }
        return sb.toString();
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (!"src".equals(str)) {
            return false;
        }
        try {
            LogUtil.record(4, "AmountScrollingAnimationPlugin updateAttr_src", str2);
            parseObject = JSONObject.parseObject(str2);
        } catch (Throwable th) {
            MspContext mspContext = this.h;
            if (mspContext != null) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "AmountScrollingViewPlugin:updateAttr", th.getMessage());
            }
            LogUtil.printExceptionStackTrace(th);
        }
        if (!parseObject.containsKey("data")) {
            return true;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        try {
            if (!jSONObject.containsKey("currency") || !jSONObject.containsKey("amount") || !jSONObject.containsKey("preAmount") || !jSONObject.containsKey("currencyMarginBottom") || !jSONObject.containsKey("duration") || !jSONObject.containsKey("amountFontSize") || !jSONObject.containsKey("currencyFontSize") || !jSONObject.containsKey("runAnim")) {
                LogUtil.record(8, "AmountScrollingAnimationPlugin", "Lack of amount details");
                throw new IllegalArgumentException("Lack of amount details");
            }
            Boolean bool = jSONObject.getBoolean("runAnim");
            String string = jSONObject.getString("currency");
            String string2 = jSONObject.getString("amount");
            String string3 = jSONObject.getString("preAmount");
            this.g = jSONObject.getFloat("currencyMarginBottom").floatValue();
            int intValue = jSONObject.getInteger("duration").intValue();
            float floatValue = jSONObject.getFloat("amountFontSize").floatValue();
            float floatValue2 = jSONObject.getFloat("currencyFontSize").floatValue();
            if (this.d != null && this.d.getResources() != null && this.d.getResources().getDisplayMetrics() != null) {
                this.e = TypedValue.applyDimension(1, floatValue, this.d.getResources().getDisplayMetrics());
                this.f = TypedValue.applyDimension(1, floatValue2, this.d.getResources().getDisplayMetrics());
            }
            if (StringUtils.isEmpty(string2)) {
                throw new IllegalArgumentException("Amount is empty");
            }
            if (Build.VERSION.SDK_INT < 24) {
                a(string2, string);
            } else if (!bool.booleanValue()) {
                this.c.pauseNumberAnimator();
                a(string2, string);
                return true;
            } else {
                if (!StringUtils.isEmpty(string3) && !string2.equals(string3)) {
                    a(string3, string);
                    this.c.setNumberAnimatorDuration(intValue);
                    String[] split = string2.split("\\.");
                    if (string3.split("\\.").length != split.length) {
                        throw new IllegalArgumentException("Amount decimal length changed!");
                    }
                    if (split.length > 1) {
                        this.c.setNumberAnimatorValues(Long.parseLong(split[0]), Integer.parseInt(split[1]), string);
                    } else if (split.length == 1) {
                        this.c.setNumberAnimatorValues(Long.parseLong(split[0]), 0, string);
                    } else {
                        throw new IllegalArgumentException("Wrong amount format");
                    }
                    this.c.startNumberAnimator();
                }
                a(string2, string);
            }
            return true;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Amount is empty");
        } else {
            String[] split = str.split("\\.");
            if (split.length > 1) {
                this.c.setInitialValue(Long.parseLong(split[0]), split[0].length(), Integer.parseInt(split[1]), split[1].length(), str2);
            } else if (split.length == 0) {
                this.c.setInitialValue(Long.parseLong(split[0]), split[0].length(), 0, 0, str2);
            } else {
                throw new IllegalArgumentException("Wrong amount format");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class AmountScrollingView extends View implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayList<Integer> mA;
        private ArrayList<Integer> mB;
        private ArrayList<Integer> mC;
        private final Point mD;
        private int mE;
        private final Point mF;
        private final Rect mG;
        private ArrayList<AmountScrollingAnimator> mH;
        private ArrayList<AmountScrollingAnimator> mI;
        private AnimatorSet mJ;
        private ArrayList<Animator> mK;
        private final Paint mPaint;
        private int mr;
        private int ms;
        private float mt;
        private float mu;
        private long mv;
        private int mw;
        private int mx;
        private String my;
        private ArrayList<Integer> mz;

        public static /* synthetic */ Object ipc$super(AmountScrollingView amountScrollingView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode == -244855388) {
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            } else if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public static /* synthetic */ ArrayList access$000(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("197c770e", new Object[]{amountScrollingView}) : amountScrollingView.mA;
        }

        public static /* synthetic */ ArrayList access$100(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8f92996d", new Object[]{amountScrollingView}) : amountScrollingView.mC;
        }

        public static /* synthetic */ Rect access$1000(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("f2e38a6e", new Object[]{amountScrollingView}) : amountScrollingView.mG;
        }

        public static /* synthetic */ int access$1100(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55adeab7", new Object[]{amountScrollingView})).intValue() : amountScrollingView.mr;
        }

        public static /* synthetic */ int access$1200(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("362fb296", new Object[]{amountScrollingView})).intValue() : amountScrollingView.ms;
        }

        public static /* synthetic */ Point access$800(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Point) ipChange.ipc$dispatch("3b08d6cd", new Object[]{amountScrollingView}) : amountScrollingView.mD;
        }

        public static /* synthetic */ float access$900(AmountScrollingView amountScrollingView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("643c3bfb", new Object[]{amountScrollingView})).floatValue() : amountScrollingView.mt;
        }

        public AmountScrollingView(Context context) {
            super(context);
            this.mz = new ArrayList<>();
            this.mA = new ArrayList<>();
            this.mB = new ArrayList<>();
            this.mC = new ArrayList<>();
            this.mPaint = new Paint(1);
            this.mD = new Point();
            this.mF = new Point();
            this.mG = new Rect();
            this.mH = new ArrayList<>();
            this.mI = new ArrayList<>();
            this.mJ = new AnimatorSet();
            this.mK = new ArrayList<>();
            Typeface typeface = PhoneCashierMspEngine.getMspWallet().getTypeface(context, "AlipayNumber", AmountScrollingViewPlugin.a(AmountScrollingViewPlugin.this));
            if (typeface != null) {
                this.mPaint.setTypeface(typeface);
            }
            this.mPaint.setColor(IndicatorBar.DEFAULT_NORMAL_TEXT_COLOR);
            this.mt = 1.5f;
            this.mu = 1.2f;
        }

        private void a(AmountScrollingAnimator amountScrollingAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("424edaa3", new Object[]{this, amountScrollingAnimator});
                return;
            }
            if (!amountScrollingAnimator.isDecimal()) {
                this.mH.add(0, amountScrollingAnimator);
            } else {
                this.mI.add(0, amountScrollingAnimator);
            }
            ValueAnimator valueAnimator = amountScrollingAnimator.getValueAnimator();
            valueAnimator.addUpdateListener(this);
            this.mK.add(valueAnimator);
            this.mJ.playTogether(this.mK);
        }

        private void e(boolean z) {
            ArrayList<AmountScrollingAnimator> arrayList;
            ArrayList<AmountScrollingAnimator> arrayList2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            } else if (!z && this.mH.isEmpty()) {
            } else {
                if (z && this.mI.isEmpty()) {
                    return;
                }
                AmountScrollingAnimator amountScrollingAnimator = null;
                if (!z && (arrayList2 = this.mH) != null) {
                    amountScrollingAnimator = arrayList2.remove(0);
                } else if (z && (arrayList = this.mI) != null) {
                    amountScrollingAnimator = arrayList.remove(0);
                }
                if (amountScrollingAnimator == null) {
                    return;
                }
                ValueAnimator valueAnimator = amountScrollingAnimator.getValueAnimator();
                valueAnimator.removeUpdateListener(this);
                this.mK.remove(valueAnimator);
                this.mJ.playTogether(this.mK);
                amountScrollingAnimator.removeNumberChangeListener();
            }
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            Rect rect = new Rect();
            if (this.mx > 0) {
                this.mPaint.setTextSize(AmountScrollingViewPlugin.b(AmountScrollingViewPlugin.this));
                this.mPaint.getTextBounds(this.my, 0, this.mx, rect);
                this.mE = rect.width() + ((int) TypedValue.applyDimension(1, 4.0f, AmountScrollingViewPlugin.e(AmountScrollingViewPlugin.this).getResources().getDisplayMetrics()));
                this.mPaint.setTextSize(AmountScrollingViewPlugin.d(AmountScrollingViewPlugin.this));
            } else {
                AmountScrollingViewPlugin.f(AmountScrollingViewPlugin.this).getStatisticInfo().addError(ErrorType.DEFAULT, "AmountScrollingViewPlugin:updateCurrencySymbolWidth", "mCurrencySymbol is empty");
            }
            f(false);
        }

        private void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
                return;
            }
            int i = (int) (this.mE + (this.mr * this.mD.x * this.mu));
            if (this.mB.size() > 0) {
                i += (int) ((this.ms * this.mD.x * this.mu) + (this.mD.x * this.mu * 0.5d));
            }
            int textSize = (int) this.mPaint.getTextSize();
            int i2 = (textSize - this.mD.y) / 2;
            setPadding(getPaddingLeft(), i2, getPaddingRight(), i2);
            int paddingLeft = getPaddingLeft() + i + getPaddingRight();
            if (z) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = paddingLeft;
                setLayoutParams(layoutParams);
            }
            setMeasuredDimension(paddingLeft, textSize);
        }

        @Override // android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            f(true);
            this.mG.set(i, i2, getWidth(), getHeight());
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            canvas.save();
            int paddingTop = getPaddingTop();
            int i = (int) (this.mD.x * this.mu);
            int i2 = this.mE;
            int i3 = paddingTop + this.mD.y;
            Iterator<AmountScrollingAnimator> it = this.mH.iterator();
            while (it.hasNext()) {
                it.next().setLocation(i2, i3);
                i2 += i;
            }
            this.mF.set(i2, i3);
            int i4 = (int) (i2 + (i * 0.5d));
            Iterator<AmountScrollingAnimator> it2 = this.mI.iterator();
            while (it2.hasNext()) {
                it2.next().setLocation(i4, i3);
                i4 += i;
            }
            float textSize = this.mPaint.getTextSize();
            if (this.mx > 0) {
                this.mPaint.setTextSize(AmountScrollingViewPlugin.b(AmountScrollingViewPlugin.this));
                canvas.drawText(this.my, 0.0f, this.mF.y - AmountScrollingViewPlugin.c(AmountScrollingViewPlugin.this), this.mPaint);
            }
            this.mPaint.setTextSize(textSize);
            Paint paint = this.mPaint;
            Iterator<AmountScrollingAnimator> it3 = this.mH.iterator();
            while (it3.hasNext()) {
                it3.next().drawOnCanvas(canvas, paint);
            }
            Iterator<AmountScrollingAnimator> it4 = this.mI.iterator();
            while (it4.hasNext()) {
                it4.next().drawOnCanvas(canvas, paint);
            }
            if (this.mB.size() > 0) {
                this.mPaint.setTextSize(AmountScrollingViewPlugin.d(AmountScrollingViewPlugin.this));
                canvas.drawText(".", this.mF.x, this.mF.y, this.mPaint);
                this.mPaint.setTextSize(textSize);
            }
            canvas.restore();
        }

        public void setPaintTextSize(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1aee4f", new Object[]{this, new Float(f)});
                return;
            }
            this.mPaint.setTextSize(f);
            Rect rect = new Rect();
            this.mPaint.getTextBounds("0", 0, 1, rect);
            this.mD.set(rect.width(), rect.height());
        }

        public void clearAllCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4208d55", new Object[]{this});
                return;
            }
            this.mz.clear();
            this.mB.clear();
            this.mA.clear();
            this.mC.clear();
            while (this.mH.size() > 0) {
                e(false);
            }
            while (this.mI.size() > 0) {
                e(true);
            }
            this.mJ = new AnimatorSet();
        }

        public void setInitialValue(long j, int i, int i2, int i3, String str) {
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54dbc3ff", new Object[]{this, new Long(j), new Integer(i), new Integer(i2), new Integer(i3), str});
                return;
            }
            setPaintTextSize(AmountScrollingViewPlugin.d(AmountScrollingViewPlugin.this));
            long j2 = this.mv;
            boolean z = !(j2 == 0 || j == j2) || !((i4 = this.mw) == 0 || i2 == i4) || (!StringUtils.isEmpty(this.my) && !StringUtils.equals(str, this.my));
            if (!StringUtils.isEmpty(str)) {
                this.my = str;
                this.mx = str.length();
            }
            clearAllCache();
            this.mr = i;
            for (int i5 = 0; i5 < this.mr; i5++) {
                a(new AmountScrollingAnimator(i5, false));
            }
            this.ms = i3;
            for (int i6 = 0; i6 < this.ms; i6++) {
                a(new AmountScrollingAnimator(i6, true));
            }
            this.mv = j;
            a(this.mv, this.mz, this.mr);
            a(this.mv, this.mA, this.mr);
            this.mw = i2;
            a(this.mw, this.mB, this.ms);
            a(this.mw, this.mC, this.ms);
            Iterator<AmountScrollingAnimator> it = this.mH.iterator();
            while (it.hasNext()) {
                it.next().setNumberWithValue(j);
            }
            Iterator<AmountScrollingAnimator> it2 = this.mI.iterator();
            while (it2.hasNext()) {
                it2.next().setNumberWithValue(i2);
            }
            if (!z) {
                return;
            }
            f(true);
        }

        public void setNumberAnimatorValues(long j, int i, String str) {
            IpChange ipChange = $ipChange;
            int i2 = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5435e4", new Object[]{this, new Long(j), new Integer(i), str});
                return;
            }
            if (!StringUtils.isEmpty(str)) {
                this.my = str;
                this.mx = str.length();
                f(true);
            }
            int i3 = 0;
            while (i3 < this.mH.size()) {
                int intValue = this.mz.get(i3).intValue();
                int[] iArr = new int[i2];
                iArr[0] = (int) ((j / Math.pow(10.0d, (this.mH.size() - i3) - i2)) % 10.0d);
                this.mH.get(i3).setAnimatorValues(intValue, iArr);
                i3++;
                i2 = 1;
            }
            for (int i4 = 0; i4 < this.mI.size(); i4++) {
                this.mI.get(i4).setAnimatorValues(this.mB.get(i4).intValue(), (int) ((i / Math.pow(10.0d, (this.mI.size() - i4) - 1)) % 10.0d));
            }
            if (this.mr < String.valueOf(j).length()) {
                for (int i5 = this.mr; i5 < String.valueOf(j).length(); i5++) {
                    this.mr++;
                    this.mz.add(0, 0);
                    this.mA.add(0, 0);
                    AmountScrollingAnimator amountScrollingAnimator = new AmountScrollingAnimator(i5, false);
                    amountScrollingAnimator.setNumberWithValue(0L);
                    amountScrollingAnimator.setAnimatorValues(0, (int) ((j / Math.pow(10.0d, i5)) % 10.0d));
                    a(amountScrollingAnimator);
                }
                f(true);
            } else if (this.mr > String.valueOf(j).length()) {
                int i6 = this.mr;
                for (int i7 = 0; i7 < i6 - String.valueOf(j).length(); i7++) {
                    this.mr--;
                    e(false);
                    this.mz.remove(0);
                    this.mA.remove(0);
                }
                f(true);
            }
        }

        public void setNumberAnimatorDuration(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4403d0d7", new Object[]{this, new Long(j)});
            } else {
                this.mJ.setDuration(j);
            }
        }

        public void startNumberAnimator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("463159d9", new Object[]{this});
            } else {
                this.mJ.start();
            }
        }

        public void pauseNumberAnimator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4248fe6d", new Object[]{this});
            } else {
                this.mJ.pause();
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                invalidate();
            }
        }

        private static void a(long j, ArrayList<Integer> arrayList, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6da078f5", new Object[]{new Long(j), arrayList, new Integer(i)});
                return;
            }
            for (int i2 = i - 1; i2 >= 0; i2--) {
                arrayList.add(0, Integer.valueOf((int) (j % 10)));
                j /= 10;
            }
        }

        private static int a(ArrayList<Integer> arrayList) {
            IpChange ipChange = $ipChange;
            int i = 0;
            int i2 = 1;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dfaf7e35", new Object[]{arrayList})).intValue();
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                i += arrayList.get(size).intValue() * i2;
                i2 *= 10;
            }
            return i;
        }

        public void onNumberChanged(AmountScrollingAnimator amountScrollingAnimator, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5c495ab", new Object[]{this, amountScrollingAnimator, new Integer(i)});
            } else if (!amountScrollingAnimator.isDecimal()) {
                this.mz.set((this.mr - amountScrollingAnimator.getDigit()) - 1, Integer.valueOf(i));
                this.mv = a(this.mz);
            } else {
                this.mB.set((this.ms - amountScrollingAnimator.getDigit()) - 1, Integer.valueOf(i));
                this.mw = a(this.mB);
            }
        }

        /* loaded from: classes3.dex */
        public class AmountScrollingAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b;
            private int c;
            private int d;
            private int e;
            private int f;
            private int g;
            private int h;
            private int i;
            private final ValueAnimator j = new ValueAnimator();
            private int k;
            private int l;
            private boolean m;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            public AmountScrollingAnimator(int i, boolean z) {
                this.h = i;
                this.i = (int) Math.pow(10.0d, i);
                this.j.setInterpolator(new AccelerateDecelerateInterpolator());
                this.j.addUpdateListener(this);
                this.j.addListener(this);
                this.m = z;
            }

            public int getNumber() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6ce4b39", new Object[]{this})).intValue() : this.f;
            }

            public int getDigit() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87cb1071", new Object[]{this})).intValue() : this.h;
            }

            public boolean isDecimal() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59ab23d2", new Object[]{this})).booleanValue() : this.m;
            }

            private void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                AmountScrollingView.this.onNumberChanged(this, i);
                this.f = i;
                int i2 = this.f;
                this.b = (i2 + 9) % 10;
                this.k = (i2 + 1) % 10;
            }

            public void removeNumberChangeListener() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6d5b6d8", new Object[]{this});
                    return;
                }
                this.j.removeListener(this);
                this.j.removeAllUpdateListeners();
            }

            public void setNumberWithValue(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c1399cdd", new Object[]{this, new Long(j)});
                } else {
                    a((int) ((j / this.i) % 10));
                }
            }

            private boolean b(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
                }
                int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                if (i == this.b) {
                    return this.d - access$900 > 0;
                } else if (i != this.f) {
                    return i == this.k && (this.d + access$900) - AmountScrollingView.access$800(AmountScrollingView.this).y < AmountScrollingView.access$1000(AmountScrollingView.this).height();
                } else {
                    int i2 = this.d;
                    return i2 > 0 || i2 - AmountScrollingView.access$800(AmountScrollingView.this).y < AmountScrollingView.access$1000(AmountScrollingView.this).height();
                }
            }

            public void setLocation(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6707581e", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                this.l = i;
                int i3 = i2 - this.c;
                this.c = i2;
                this.d += i3;
            }

            public void drawOnCanvas(Canvas canvas, Paint paint) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("719a5638", new Object[]{this, canvas, paint});
                    return;
                }
                int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                if (b(this.b)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.b);
                    canvas.drawText(sb.toString(), this.l, this.d - access$900, paint);
                    c(this.b);
                }
                if (b(this.f)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f);
                    canvas.drawText(sb2.toString(), this.l, this.d, paint);
                    c(this.f);
                }
                if (!b(this.k)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.k);
                canvas.drawText(sb3.toString(), this.l, this.d + access$900, paint);
                c(this.k);
            }

            private void c(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                } else if (!this.m) {
                    AmountScrollingView.access$000(AmountScrollingView.this).set((AmountScrollingView.access$1100(AmountScrollingView.this) - this.h) - 1, Integer.valueOf(i));
                } else {
                    AmountScrollingView.access$100(AmountScrollingView.this).set((AmountScrollingView.access$1200(AmountScrollingView.this) - this.h) - 1, Integer.valueOf(i));
                }
            }

            public ValueAnimator getValueAnimator() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("6d97b4ad", new Object[]{this}) : this.j;
            }

            public void setAnimatorValues(int i, int... iArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faf0191f", new Object[]{this, new Integer(i), iArr});
                    return;
                }
                int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                for (int i2 = 1; i2 < length; i2++) {
                    iArr2[i2] = (i - iArr[i2 - 1]) * access$900;
                }
                this.j.setIntValues(iArr2);
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = intValue - this.g;
                if (i != 0) {
                    int access$900 = (int) (AmountScrollingView.access$800(AmountScrollingView.this).y * AmountScrollingView.access$900(AmountScrollingView.this));
                    this.d += i;
                    this.e += i;
                    int i2 = this.e / access$900;
                    if (i2 != 0) {
                        int i3 = (this.f - i2) % 10;
                        if (i3 < 0) {
                            i3 += 10;
                        }
                        a(i3);
                        this.d -= i2 * access$900;
                        this.e %= access$900;
                    }
                }
                this.g = intValue;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                    return;
                }
                this.d = this.c;
                this.e = 0;
                this.g = 0;
            }
        }
    }
}
