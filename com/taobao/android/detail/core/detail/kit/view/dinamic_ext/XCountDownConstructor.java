package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.view.HandlerTimer;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import tb.emu;
import tb.fpa;
import tb.fpd;
import tb.fpn;
import tb.fpo;
import tb.fpq;
import tb.fpr;
import tb.kge;

/* loaded from: classes4.dex */
public class XCountDownConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final String TAG = "XCountDownConstructor";
    public static final String VIEW_EVENT_ON_COUNT_DOWN_FINISH = "onCountDownFinish";
    public static final String VIEW_TAG = "XCountDownTimerView";
    private final int MARGIN_LEFT = 0;
    private final int MARGIN_TOP = 1;
    private final int MARGIN_RIGHT = 2;
    private final int MARGIN_BOTTOM = 3;
    private final int TEXT_SIZE = 6;
    private final int TEXT_COLOR = 7;
    private final int[] seeMoreTextDefaults = {0, 0, 0, 0, -1, -1, 12, -16777216};
    private final int[] timerTextDefaults = {0, 0, 0, 0, 20, 20, 12, -1};
    private final int[] colonTextDefaults = {0, 0, 0, 0, -1, -1, 10, -16777216};

    static {
        kge.a(464387595);
    }

    public static /* synthetic */ Object ipc$super(XCountDownConstructor xCountDownConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        } else if (hashCode != 2131214456) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (fpd) objArr[2]);
            return null;
        }
    }

    public XCountDownConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor");
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new XCountDownTimerView(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        XCountDownTimerView xCountDownTimerView = (XCountDownTimerView) view;
        if (arrayList.contains("dTimerTextMarginLeft") || arrayList.contains("dTimerTextMarginTop") || arrayList.contains("dTimerTextMarginRight") || arrayList.contains("dTimerTextMarginBottom") || arrayList.contains("dTimerTextWidth") || arrayList.contains("dTimerTextHeight") || arrayList.contains("dTimerTextSize") || arrayList.contains("dTimerTextColor") || arrayList.contains("dTimerBackgroundColor") || arrayList.contains("dTimerCornerRadius")) {
            setTimerTextViewStyle(xCountDownTimerView, (String) map.get("dTimerTextMarginLeft"), (String) map.get("dTimerTextMarginTop"), (String) map.get("dTimerTextMarginRight"), (String) map.get("dTimerTextMarginBottom"), (String) map.get("dTimerTextWidth"), (String) map.get("dTimerTextHeight"), (String) map.get("dTimerTextSize"), (String) map.get("dTimerTextColor"), (String) map.get("dTimerBackgroundColor"), (String) map.get("dTimerCornerRadius"));
        }
        if (arrayList.contains("dColonTextMarginLeft") || arrayList.contains("dColonTextMarginTop") || arrayList.contains("dColonTextMarginRight") || arrayList.contains("dColonTextMarginBottom") || arrayList.contains("dColonTextWidth") || arrayList.contains("dColonTextHeight") || arrayList.contains("dColonTextSize") || arrayList.contains("dColonTextColor") || arrayList.contains("dColonText")) {
            setColonTextViewStyle(xCountDownTimerView, (String) map.get("dColonTextMarginLeft"), (String) map.get("dColonTextMarginTop"), (String) map.get("dColonTextMarginRight"), (String) map.get("dColonTextMarginBottom"), (String) map.get("dColonTextWidth"), (String) map.get("dColonTextHeight"), (String) map.get("dColonTextSize"), (String) map.get("dColonTextColor"), (String) map.get("dColonText"));
        }
        if (arrayList.contains("dFutureTime") || arrayList.contains("dCurrentTime")) {
            setFutureTime(xCountDownTimerView, (String) map.get("dFutureTime"), (String) map.get("dCurrentTime"));
        }
        if (!arrayList.contains("dSeeMoreText") && !arrayList.contains("dSeeMoreTextMarginLeft") && !arrayList.contains("dSeeMoreTextMarginTop") && !arrayList.contains("dSeeMoreTextMarginRight") && !arrayList.contains("dSeeMoreTextMarginBottom") && !arrayList.contains("dSeeMoreTextWidth") && !arrayList.contains("dSeeMoreTextHeight") && !arrayList.contains("dSeeMoreTextSize") && !arrayList.contains("dSeeMoreTextColor")) {
            return;
        }
        setSeeMoreTextViewStyle(xCountDownTimerView, (String) map.get("dSeeMoreText"), (String) map.get("dSeeMoreTextMarginLeft"), (String) map.get("dSeeMoreTextMarginTop"), (String) map.get("dSeeMoreTextMarginRight"), (String) map.get("dSeeMoreTextMarginBottom"), (String) map.get("dSeeMoreTextWidth"), (String) map.get("dSeeMoreTextHeight"), (String) map.get("dSeeMoreTextSize"), (String) map.get("dSeeMoreTextColor"));
    }

    public void setSeeMoreTextViewStyle(XCountDownTimerView xCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ed4db1", new Object[]{this, xCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        TextView seeMoreView = xCountDownTimerView.getSeeMoreView();
        seeMoreView.setText(str);
        setTextViewStyle(seeMoreView, str2, str3, str4, str5, str6, str7, str8, str9, this.seeMoreTextDefaults);
    }

    public void setFutureTime(XCountDownTimerView xCountDownTimerView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735c3ee4", new Object[]{this, xCountDownTimerView, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            xCountDownTimerView.hideCountDown();
            xCountDownTimerView.setFutureTime(-1L);
            xCountDownTimerView.getTimer().b();
            XCountDownTimerView.a onFinishListener = xCountDownTimerView.getOnFinishListener();
            if (onFinishListener == null) {
                return;
            }
            onFinishListener.a();
        } else {
            xCountDownTimerView.setFutureTime(Long.valueOf(str).longValue());
            if (!StringUtils.isEmpty(str2)) {
                xCountDownTimerView.setCurrentTime(Long.valueOf(str2).longValue());
            }
            if (xCountDownTimerView.getLastTime() > 0) {
                xCountDownTimerView.showCountDown();
                xCountDownTimerView.updateCountDownViewTime();
                xCountDownTimerView.getTimer().a();
                return;
            }
            xCountDownTimerView.hideCountDown();
            xCountDownTimerView.getTimer().b();
            XCountDownTimerView.a onFinishListener2 = xCountDownTimerView.getOnFinishListener();
            if (onFinishListener2 == null) {
                return;
            }
            onFinishListener2.a();
        }
    }

    public void setColonTextViewStyle(XCountDownTimerView xCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba758fa", new Object[]{this, xCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9});
            return;
        }
        TextView colonFirst = xCountDownTimerView.getColonFirst();
        TextView colonSecond = xCountDownTimerView.getColonSecond();
        setTextViewStyle(colonFirst, str, str2, str3, str4, str5, str6, str7, str8, this.colonTextDefaults);
        setTextViewStyle(colonSecond, str, str2, str3, str4, str5, str6, str7, str8, this.colonTextDefaults);
        if (StringUtils.isEmpty(str9)) {
            return;
        }
        colonFirst.setText(str9);
        colonSecond.setText(str9);
    }

    public void setTimerTextViewStyle(XCountDownTimerView xCountDownTimerView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e42c9e", new Object[]{this, xCountDownTimerView, str, str2, str3, str4, str5, str6, str7, str8, str9, str10});
            return;
        }
        TextView hour = xCountDownTimerView.getHour();
        TextView minute = xCountDownTimerView.getMinute();
        TextView second = xCountDownTimerView.getSecond();
        setTextViewStyle(hour, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTextViewStyle(minute, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTextViewStyle(second, str, str2, str3, str4, str5, str6, str7, str8, this.timerTextDefaults);
        setTimerTextBackground(hour, minute, second, str9, str10);
    }

    private void setTextViewStyle(TextView textView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int[] iArr) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb3e1fe", new Object[]{this, textView, str, str2, str3, str4, str5, str6, str7, str8, iArr});
            return;
        }
        if (!StringUtils.isEmpty(str7)) {
            textView.setTextSize(0, fpr.a(textView.getContext(), str7, 0));
        }
        if (!StringUtils.isEmpty(str8) && (a2 = fpn.a(str8, -16777216)) != -16777216) {
            textView.setTextColor(a2);
        }
        int[] textViewMargin = getTextViewMargin(textView.getContext(), str, str2, str3, str4, iArr);
        if (textViewMargin == null && StringUtils.isEmpty(str5) && StringUtils.isEmpty(str6)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (!StringUtils.isEmpty(str5)) {
            marginLayoutParams.width = fpr.a(textView.getContext(), str5, 0);
        }
        if (!StringUtils.isEmpty(str6)) {
            marginLayoutParams.height = fpr.a(textView.getContext(), str6, 0);
        }
        if (textViewMargin != null) {
            marginLayoutParams.setMargins(textViewMargin[0], textViewMargin[1], textViewMargin[2], textViewMargin[3]);
        }
        textView.setLayoutParams(marginLayoutParams);
    }

    private void setTimerTextBackground(TextView textView, TextView textView2, TextView textView3, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb47c793", new Object[]{this, textView, textView2, textView3, str, str2});
            return;
        }
        int a2 = !StringUtils.isEmpty(str) ? fpn.a(str, -16777216) : -16777216;
        int a3 = fpr.a(textView.getContext(), str2, 0);
        if (a2 == -16777216 && a3 == 0) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(a3);
        gradientDrawable.setColor(a2);
        textView.setBackgroundDrawable(gradientDrawable);
        textView2.setBackgroundDrawable(gradientDrawable);
        textView3.setBackgroundDrawable(gradientDrawable);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        super.applyDefaultProperty(view, map, fpdVar);
        XCountDownTimerView xCountDownTimerView = (XCountDownTimerView) view;
        TextView seeMoreView = xCountDownTimerView.getSeeMoreView();
        TextView hour = xCountDownTimerView.getHour();
        TextView minute = xCountDownTimerView.getMinute();
        TextView second = xCountDownTimerView.getSecond();
        TextView colonFirst = xCountDownTimerView.getColonFirst();
        TextView colonSecond = xCountDownTimerView.getColonSecond();
        setTextViewMarginAndColorAndSize(seeMoreView, this.seeMoreTextDefaults);
        seeMoreView.setText("");
        setTextViewMarginAndColorAndSize(hour, this.timerTextDefaults);
        setTextViewMarginAndColorAndSize(minute, this.timerTextDefaults);
        setTextViewMarginAndColorAndSize(second, this.timerTextDefaults);
        hour.setPadding(0, 0, 0, 0);
        minute.setPadding(0, 0, 0, 0);
        second.setPadding(0, 0, 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setColor(-16777216);
        hour.setBackgroundDrawable(gradientDrawable);
        minute.setBackgroundDrawable(gradientDrawable);
        second.setBackgroundDrawable(gradientDrawable);
        setTextViewMarginAndColorAndSize(colonFirst, this.colonTextDefaults);
        setTextViewMarginAndColorAndSize(colonSecond, this.colonTextDefaults);
        colonFirst.setText(":");
        colonSecond.setText(":");
    }

    private void setTextViewMarginAndColorAndSize(TextView textView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd492841", new Object[]{this, textView, iArr});
            return;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
            textView.setLayoutParams(marginLayoutParams);
        }
        textView.setTextColor(iArr[7]);
        textView.setTextSize(1, iArr[6]);
    }

    private int[] getTextViewMargin(Context context, String str, String str2, String str3, String str4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4e9dc763", new Object[]{this, context, str, str2, str3, str4, iArr});
        }
        int a2 = fpr.a(context, str, iArr[0]);
        int a3 = fpr.a(context, str2, iArr[1]);
        int a4 = fpr.a(context, str3, iArr[2]);
        int a5 = fpr.a(context, str4, iArr[3]);
        if (a2 != iArr[0] || a3 != iArr[1] || a4 != iArr[2] || a5 != iArr[3]) {
            return new int[]{a2, a3, a4, a5};
        }
        return null;
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setEvents(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a6a1c6", new Object[]{this, view, fpdVar});
        } else {
            new b().a(view, fpdVar);
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements XCountDownTimerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f9562a;
        private fpd b;
        private fpq c;
        private View d;
        private String e;

        static {
            kge.a(221056192);
            kge.a(-204200238);
        }

        public a(b bVar, fpd fpdVar, fpq fpqVar, View view) {
            this.f9562a = bVar;
            this.b = fpdVar;
            this.c = fpqVar;
            this.d = view;
            Map<String, String> map = fpqVar.d;
            if (map == null || map.isEmpty()) {
                return;
            }
            this.e = map.get(XCountDownConstructor.VIEW_EVENT_ON_COUNT_DOWN_FINISH);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor.XCountDownTimerView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (StringUtils.isEmpty(this.e)) {
            } else {
                b.b(this.d, this.b, this.c, this.e);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends fpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1504047296);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 196300992) {
                super.a((View) objArr[0], (fpd) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private b() {
        }

        @Override // tb.fpo
        public void a(View view, fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb350c0", new Object[]{this, view, fpdVar});
                return;
            }
            super.a(view, fpdVar);
            b(view, fpdVar);
        }

        public void b(View view, fpd fpdVar) {
            fpq fpqVar;
            Map<String, String> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e3909f", new Object[]{this, view, fpdVar});
                return;
            }
            Object tag = view.getTag(j.PROPERTY_KEY);
            if (!(tag instanceof fpq) || (map = (fpqVar = (fpq) tag).d) == null || map.isEmpty() || !map.containsKey(XCountDownConstructor.VIEW_EVENT_ON_COUNT_DOWN_FINISH) || !(view instanceof XCountDownTimerView)) {
                return;
            }
            ((XCountDownTimerView) view).setOnFinishListener(new a(this, fpdVar, fpqVar, view));
        }
    }

    /* loaded from: classes4.dex */
    public static class XCountDownTimerView extends RelativeLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String TAG = "XCountDownTimerView";
        private TextView colonFirst;
        private TextView colonSecond;
        private View countDownTimerContainer;
        private long futureTime;
        private TextView hour;
        private boolean isAttached;
        private boolean isNativeTime;
        private final BroadcastReceiver mReceiver;
        private HandlerTimer mTimer;
        private TextView minute;
        private long offset;
        private a onFinishListener;
        private TextView second;
        private TextView seeMoreView;

        /* loaded from: classes4.dex */
        public interface a {
            void a();
        }

        static {
            kge.a(-398331240);
        }

        public static /* synthetic */ Object ipc$super(XCountDownTimerView xCountDownTimerView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -461309207) {
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            } else if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }

        public static /* synthetic */ boolean access$100(XCountDownTimerView xCountDownTimerView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d62da893", new Object[]{xCountDownTimerView})).booleanValue() : xCountDownTimerView.isAttached;
        }

        public static /* synthetic */ HandlerTimer access$200(XCountDownTimerView xCountDownTimerView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HandlerTimer) ipChange.ipc$dispatch("64a21703", new Object[]{xCountDownTimerView}) : xCountDownTimerView.mTimer;
        }

        public static /* synthetic */ long access$300(XCountDownTimerView xCountDownTimerView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98461d85", new Object[]{xCountDownTimerView})).longValue() : xCountDownTimerView.futureTime;
        }

        public XCountDownTimerView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.isNativeTime = true;
            this.offset = 0L;
            this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor.XCountDownTimerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (XCountDownTimerView.access$200(XCountDownTimerView.this) == null) {
                    } else {
                        String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            XCountDownTimerView.access$200(XCountDownTimerView.this).b();
                        } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                        } else {
                            if (!XCountDownTimerView.this.isShown() || XCountDownTimerView.access$300(XCountDownTimerView.this) <= 0) {
                                XCountDownTimerView.access$200(XCountDownTimerView.this).b();
                            } else {
                                XCountDownTimerView.access$200(XCountDownTimerView.this).a();
                            }
                        }
                    }
                }
            };
            init();
        }

        public XCountDownTimerView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.isNativeTime = true;
            this.offset = 0L;
            this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor.XCountDownTimerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (XCountDownTimerView.access$200(XCountDownTimerView.this) == null) {
                    } else {
                        String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            XCountDownTimerView.access$200(XCountDownTimerView.this).b();
                        } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                        } else {
                            if (!XCountDownTimerView.this.isShown() || XCountDownTimerView.access$300(XCountDownTimerView.this) <= 0) {
                                XCountDownTimerView.access$200(XCountDownTimerView.this).b();
                            } else {
                                XCountDownTimerView.access$200(XCountDownTimerView.this).a();
                            }
                        }
                    }
                }
            };
            init();
        }

        public XCountDownTimerView(Context context) {
            super(context);
            this.isNativeTime = true;
            this.offset = 0L;
            this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor.XCountDownTimerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (XCountDownTimerView.access$200(XCountDownTimerView.this) == null) {
                    } else {
                        String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            XCountDownTimerView.access$200(XCountDownTimerView.this).b();
                        } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                        } else {
                            if (!XCountDownTimerView.this.isShown() || XCountDownTimerView.access$300(XCountDownTimerView.this) <= 0) {
                                XCountDownTimerView.access$200(XCountDownTimerView.this).b();
                            } else {
                                XCountDownTimerView.access$200(XCountDownTimerView.this).a();
                            }
                        }
                    }
                }
            };
            init();
        }

        private void init() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            LayoutInflater.from(getContext()).inflate(R.layout.x_detail_count_down_timer, this);
            this.hour = (TextView) findViewById(R.id.tv_hours);
            this.minute = (TextView) findViewById(R.id.tv_minutes);
            this.second = (TextView) findViewById(R.id.tv_seconds);
            this.colonFirst = (TextView) findViewById(R.id.tv_colon1);
            this.colonSecond = (TextView) findViewById(R.id.tv_colon2);
            this.countDownTimerContainer = findViewById(R.id.count_down_timer_view_container);
            this.seeMoreView = (TextView) findViewById(R.id.see_more_default);
        }

        public void hideCountDown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce4c2c36", new Object[]{this});
                return;
            }
            this.seeMoreView.setVisibility(0);
            this.countDownTimerContainer.setVisibility(8);
        }

        public void showCountDown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("220c965b", new Object[]{this});
                return;
            }
            this.seeMoreView.setVisibility(8);
            this.countDownTimerContainer.setVisibility(0);
        }

        public HandlerTimer getTimer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HandlerTimer) ipChange.ipc$dispatch("4440a93d", new Object[]{this});
            }
            if (this.mTimer == null) {
                this.mTimer = new HandlerTimer(500L, new Runnable() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.XCountDownConstructor.XCountDownTimerView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!XCountDownTimerView.access$100(XCountDownTimerView.this)) {
                        } else {
                            XCountDownTimerView.this.updateCountDownViewTime();
                        }
                    }
                });
            }
            return this.mTimer;
        }

        public void setFutureTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e02eb12b", new Object[]{this, new Long(j)});
            } else {
                this.futureTime = j;
            }
        }

        public void setCurrentTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f105f79", new Object[]{this, new Long(j)});
                return;
            }
            this.isNativeTime = false;
            this.offset = j - SystemClock.elapsedRealtime();
        }

        public long getLastTime() {
            long elapsedRealtime;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7e823bf4", new Object[]{this})).longValue();
            }
            if (this.futureTime <= 0) {
                return -1L;
            }
            if (this.isNativeTime) {
                elapsedRealtime = System.currentTimeMillis();
            } else {
                elapsedRealtime = SystemClock.elapsedRealtime() + this.offset;
            }
            return this.futureTime - elapsedRealtime;
        }

        public void updateCountDownViewTime() {
            long j;
            long j2;
            long j3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("670e9e41", new Object[]{this});
            } else if (this.countDownTimerContainer == null) {
            } else {
                long lastTime = getLastTime();
                if (lastTime > 0) {
                    long j4 = 3600000;
                    j2 = lastTime / j4;
                    long j5 = lastTime - (j4 * j2);
                    long j6 = 60000;
                    j3 = j5 / j6;
                    j = (j5 - (j6 * j3)) / 1000;
                } else {
                    j = 0;
                    j2 = 0;
                    j3 = 0;
                }
                if (j2 <= 99 && j3 <= 60 && j <= 60 && (j2 != 0 || j3 != 0 || j != 0)) {
                    int i = (int) (j % 10);
                    this.hour.setText(((int) (j2 / 10)) + "" + ((int) (j2 % 10)));
                    this.minute.setText(((int) (j3 / 10)) + "" + ((int) (j3 % 10)));
                    this.second.setText(((int) (j / 10)) + "" + i);
                    this.countDownTimerContainer.setVisibility(0);
                    this.seeMoreView.setVisibility(8);
                    return;
                }
                this.countDownTimerContainer.setVisibility(8);
                this.seeMoreView.setVisibility(0);
                this.hour.setText("00");
                this.minute.setText("00");
                this.second.setText("00");
                HandlerTimer handlerTimer = this.mTimer;
                if (handlerTimer != null) {
                    handlerTimer.b();
                    this.mTimer = null;
                }
                a aVar = this.onFinishListener;
                if (aVar == null) {
                    return;
                }
                aVar.a();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            this.isAttached = true;
            HandlerTimer handlerTimer = this.mTimer;
            if (handlerTimer != null && this.futureTime > 0) {
                handlerTimer.a();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            try {
                getContext().unregisterReceiver(this.mReceiver);
            } catch (Exception e) {
                fpa.b("XCountDownTimerView", e, new String[0]);
            }
            try {
                getContext().registerReceiver(this.mReceiver, intentFilter);
            } catch (Exception e2) {
                fpa.b("XCountDownTimerView", e2, new String[0]);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            this.isAttached = false;
            HandlerTimer handlerTimer = this.mTimer;
            if (handlerTimer != null) {
                handlerTimer.b();
            }
            try {
                getContext().unregisterReceiver(this.mReceiver);
            } catch (Exception e) {
                fpa.b("XCountDownTimerView", e, new String[0]);
            }
        }

        @Override // android.view.View
        public void onWindowVisibilityChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
                return;
            }
            super.onWindowVisibilityChanged(i);
            HandlerTimer handlerTimer = this.mTimer;
            if (handlerTimer == null) {
                return;
            }
            if (i == 0 && this.futureTime > 0) {
                handlerTimer.a();
            } else {
                this.mTimer.b();
            }
        }

        public TextView getSeeMoreView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("a117cb52", new Object[]{this}) : this.seeMoreView;
        }

        public TextView getHour() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("bec87b55", new Object[]{this}) : this.hour;
        }

        public TextView getMinute() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("34e4fe05", new Object[]{this}) : this.minute;
        }

        public TextView getSecond() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("27614c65", new Object[]{this}) : this.second;
        }

        public TextView getColonFirst() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ade27602", new Object[]{this}) : this.colonFirst;
        }

        public TextView getColonSecond() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("67993df8", new Object[]{this}) : this.colonSecond;
        }

        public a getOnFinishListener() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1e146f4d", new Object[]{this}) : this.onFinishListener;
        }

        public void setOnFinishListener(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caf44269", new Object[]{this, aVar});
            } else {
                this.onFinishListener = aVar;
            }
        }
    }
}
