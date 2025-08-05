package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.expressionv2.i;
import com.taobao.android.dinamic.j;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpo;
import tb.fpq;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DSwitchConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECKED_COLOR = -45056;
    private static final String D_HEIGHT = "dHeight";
    private static final String D_OFF_COLOR = "dOffColor";
    private static final String D_ON_COLOR = "dOnColor";
    private static final String D_SWITCH_ON = "dSwitchOn";
    private static final String D_WIDTH = "dWidth";
    private static final String STRING_CHECKED_COLOR = "#ffff5000";
    private static final String STRING_UNCHECKED_COLOR = "#ffe5e5e5";
    private static final int UNCHECKED_COLOR = -1710619;
    private static final String VIEW_EVENT_ON_CHANGE = "onChange";
    public static final String VIEW_TAG = "DSwitch";

    static {
        kge.a(297277642);
    }

    public static /* synthetic */ Object ipc$super(DSwitchConstructor dSwitchConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        SwitchCompat switchCompat = null;
        if (view instanceof SwitchCompat) {
            switchCompat = (SwitchCompat) view;
        }
        if (arrayList.contains(D_HEIGHT) || arrayList.contains(D_ON_COLOR) || arrayList.contains(D_OFF_COLOR)) {
            Object obj = map.get(D_HEIGHT);
            Object obj2 = map.get(D_ON_COLOR);
            Object obj3 = map.get(D_OFF_COLOR);
            String str = obj2 instanceof String ? (String) obj2 : STRING_CHECKED_COLOR;
            String str2 = obj3 instanceof String ? (String) obj3 : STRING_UNCHECKED_COLOR;
            int a2 = fpr.a(view.getContext(), obj, -1);
            if (a2 != -1) {
                updateInternalStatus(switchCompat, getTrackDrawable(view.getContext(), str, -45056, a2), getTrackDrawable(view.getContext(), str2, UNCHECKED_COLOR, a2), getThumbDrawable(view.getContext(), a2));
            }
        }
        if (arrayList.contains(D_WIDTH)) {
            Object obj4 = map.get(D_WIDTH);
            Object obj5 = map.get(D_HEIGHT);
            int a3 = fpr.a(view.getContext(), obj4, -1);
            int a4 = fpr.a(view.getContext(), obj5, -1);
            if (a3 != -1 && a4 != -1 && a3 >= a4 * 2) {
                setSwitchMinWidth(switchCompat, a3);
            }
        }
        if (arrayList.contains(D_SWITCH_ON)) {
            setChecked(switchCompat, i.a((String) map.get(D_SWITCH_ON)));
        }
        if (!arrayList.contains("dEnabled")) {
            return;
        }
        String str3 = (String) map.get("dEnabled");
        if (!TextUtils.isEmpty(str3)) {
            setEnable(view, i.a(str3));
        } else {
            setEnable(view, true);
        }
    }

    private void setEnable(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf338cce", new Object[]{this, view, new Boolean(z)});
        } else {
            view.setEnabled(z);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setEvents(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a6a1c6", new Object[]{this, view, fpdVar});
        } else {
            new a().a(view, fpdVar);
        }
    }

    public void setChecked(SwitchCompat switchCompat, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdae7d4c", new Object[]{this, switchCompat, new Boolean(z)});
        } else if (switchCompat == null) {
        } else {
            switchCompat.setTag(R.id.change_with_attribute, "true");
            switchCompat.setChecked(z);
            switchCompat.setTag(R.id.change_with_attribute, "false");
        }
    }

    public void setSwitchMinWidth(SwitchCompat switchCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154b8396", new Object[]{this, switchCompat, new Integer(i)});
        } else if (switchCompat == null) {
        } else {
            switchCompat.setSwitchMinWidth(i);
        }
    }

    private GradientDrawable getTrackDrawable(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("3da82d12", new Object[]{this, context, str, new Integer(i), new Integer(i2)}) : b.a(0, 16777215, i2 / 2, com.taobao.android.dinamic.constructor.a.a(str, i), i2, i2);
    }

    private GradientDrawable getThumbDrawable(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("d760010a", new Object[]{this, context, new Integer(i)}) : b.a((int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()), 16777215, i / 2, -1, i, i);
    }

    private StateListDrawable getSelector(Drawable drawable, Drawable drawable2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateListDrawable) ipChange.ipc$dispatch("e174db35", new Object[]{this, drawable, drawable2}) : b.a(drawable, drawable2, b.STATE_CHECKED);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        SwitchCompat switchCompat = new SwitchCompat(context, attributeSet);
        switchCompat.setClickable(true);
        switchCompat.setTextOn("");
        switchCompat.setTextOff("");
        switchCompat.setShowText(false);
        switchCompat.setThumbTextPadding(0);
        switchCompat.setSplitTrack(false);
        return switchCompat;
    }

    private void updateInternalStatus(SwitchCompat switchCompat, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c7de47", new Object[]{this, switchCompat, drawable, drawable2, drawable3});
        } else if (switchCompat == null) {
        } else {
            switchCompat.setTrackDrawable(getSelector(drawable, drawable2));
            switchCompat.setThumbDrawable(drawable3);
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends fpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2017388108);
        }

        private a() {
        }

        @Override // tb.fpo
        public void a(View view, fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb350c0", new Object[]{this, view, fpdVar});
            } else {
                b(view, fpdVar);
            }
        }

        public void b(View view, fpd fpdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e3909f", new Object[]{this, view, fpdVar});
                return;
            }
            fpq fpqVar = (fpq) view.getTag(j.PROPERTY_KEY);
            if (fpqVar == null) {
                return;
            }
            Map<String, String> map = fpqVar.d;
            if (map.isEmpty() || !map.containsKey(DSwitchConstructor.VIEW_EVENT_ON_CHANGE) || !(view instanceof SwitchCompat)) {
                return;
            }
            ((SwitchCompat) view).setOnCheckedChangeListener(new OnChangeListener(this, fpdVar, fpqVar, view));
        }
    }

    /* loaded from: classes5.dex */
    public static class OnChangeListener implements CompoundButton.OnCheckedChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private fpd mDinamicParams;
        private a mHandler;
        private String mOnChangeExpression;
        private fpq mProperty;
        private View mView;

        static {
            kge.a(-247200515);
            kge.a(1381311248);
        }

        public OnChangeListener(a aVar, fpd fpdVar, fpq fpqVar, View view) {
            this.mHandler = aVar;
            this.mDinamicParams = fpdVar;
            this.mProperty = fpqVar;
            this.mView = view;
            Map<String, String> map = fpqVar.d;
            if (!map.isEmpty()) {
                this.mOnChangeExpression = map.get(DSwitchConstructor.VIEW_EVENT_ON_CHANGE);
            }
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                return;
            }
            Object tag = compoundButton.getTag(R.id.change_with_attribute);
            if (TextUtils.isEmpty(this.mOnChangeExpression) || "true".equals(tag)) {
                return;
            }
            ArrayList arrayList = new ArrayList(5);
            arrayList.add(Boolean.valueOf(compoundButton.isChecked()));
            this.mView.setTag(j.VIEW_PARAMS, arrayList);
            a.b(this.mView, this.mDinamicParams, this.mProperty, this.mOnChangeExpression);
        }
    }
}
