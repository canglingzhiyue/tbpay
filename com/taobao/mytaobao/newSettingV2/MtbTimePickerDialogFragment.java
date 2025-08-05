package com.taobao.mytaobao.newSettingV2;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.kge;
import tb.mtr;
import tb.mxx;

/* loaded from: classes7.dex */
public class MtbTimePickerDialogFragment extends BottomSheetDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public mtr<JSONObject> confirmCallback;
    public int initHourEnd;
    public int initHourStart;
    public int initMinuteEnd;
    public int initMinuteStart;
    private NumberPicker npHourEnd;
    private NumberPicker npHourStart;
    private NumberPicker npMinuteEnd;
    private NumberPicker npMinuteStart;

    static {
        kge.a(547359565);
    }

    public static /* synthetic */ Object ipc$super(MtbTimePickerDialogFragment mtbTimePickerDialogFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ NumberPicker access$000(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NumberPicker) ipChange.ipc$dispatch("3e08c788", new Object[]{mtbTimePickerDialogFragment}) : mtbTimePickerDialogFragment.npHourStart;
    }

    public static /* synthetic */ NumberPicker access$100(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NumberPicker) ipChange.ipc$dispatch("6dbffb89", new Object[]{mtbTimePickerDialogFragment}) : mtbTimePickerDialogFragment.npMinuteStart;
    }

    public static /* synthetic */ NumberPicker access$200(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NumberPicker) ipChange.ipc$dispatch("9d772f8a", new Object[]{mtbTimePickerDialogFragment}) : mtbTimePickerDialogFragment.npHourEnd;
    }

    public static /* synthetic */ NumberPicker access$300(MtbTimePickerDialogFragment mtbTimePickerDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NumberPicker) ipChange.ipc$dispatch("cd2e638b", new Object[]{mtbTimePickerDialogFragment}) : mtbTimePickerDialogFragment.npMinuteEnd;
    }

    public static MtbTimePickerDialogFragment newInstance(int i, int i2, int i3, int i4, mtr<JSONObject> mtrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbTimePickerDialogFragment) ipChange.ipc$dispatch("72427ff7", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), mtrVar});
        }
        MtbTimePickerDialogFragment mtbTimePickerDialogFragment = new MtbTimePickerDialogFragment();
        mtbTimePickerDialogFragment.initHourStart = i;
        mtbTimePickerDialogFragment.initMinuteStart = i2;
        mtbTimePickerDialogFragment.initHourEnd = i3;
        mtbTimePickerDialogFragment.initMinuteEnd = i4;
        mtbTimePickerDialogFragment.confirmCallback = mtrVar;
        return mtbTimePickerDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.mtb_time_picker, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        view.post(new Runnable() { // from class: com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BottomSheetBehavior.b(view.getRootView().findViewById(R.id.design_bottom_sheet)).a(false);
                View findViewById = view.findViewById(R.id.btnConfirm);
                mxx.a(findViewById, findViewById.getHeight() / 2, -1);
                mxx.a(view.findViewById(R.id.viewHoverLeft), DensityUtil.dip2px(view.getContext(), 9.0f), -657931);
                mxx.a(view.findViewById(R.id.viewHoverRight), DensityUtil.dip2px(view.getContext(), 9.0f), -657931);
                try {
                    view.getRootView().findViewById(R.id.design_bottom_sheet).setBackgroundColor(0);
                } catch (Throwable unused) {
                }
            }
        });
        getDialog().setCanceledOnTouchOutside(false);
        this.npHourStart = (NumberPicker) view.findViewById(R.id.hourStart);
        this.npMinuteStart = (NumberPicker) view.findViewById(R.id.minuteStart);
        this.npHourEnd = (NumberPicker) view.findViewById(R.id.hourEnd);
        this.npMinuteEnd = (NumberPicker) view.findViewById(R.id.minuteEnd);
        setNumberPickerStyle(this.npHourStart, true);
        setNumberPickerStyle(this.npMinuteStart, false);
        setNumberPickerStyle(this.npHourEnd, true);
        setNumberPickerStyle(this.npMinuteEnd, false);
        this.npHourStart.setValue(this.initHourStart);
        this.npMinuteStart.setValue(this.initMinuteStart);
        this.npHourEnd.setValue(this.initHourEnd);
        this.npMinuteEnd.setValue(this.initMinuteEnd);
        view.findViewById(R.id.btnConfirm).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                int value = MtbTimePickerDialogFragment.access$000(MtbTimePickerDialogFragment.this).getValue();
                int value2 = MtbTimePickerDialogFragment.access$100(MtbTimePickerDialogFragment.this).getValue();
                int value3 = MtbTimePickerDialogFragment.access$200(MtbTimePickerDialogFragment.this).getValue();
                int value4 = MtbTimePickerDialogFragment.access$300(MtbTimePickerDialogFragment.this).getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("startHour", (Object) Integer.valueOf(value));
                jSONObject.put("starMinute", (Object) Integer.valueOf(value2));
                jSONObject.put("endHour", (Object) Integer.valueOf(value3));
                jSONObject.put("endMinute", (Object) Integer.valueOf(value4));
                if (MtbTimePickerDialogFragment.this.confirmCallback == null) {
                    return;
                }
                MtbTimePickerDialogFragment.this.confirmCallback.onResult(true, null, jSONObject);
                MtbTimePickerDialogFragment.this.dismissAllowingStateLoss();
            }
        });
        view.findViewById(R.id.btnClose).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    MtbTimePickerDialogFragment.this.dismissAllowingStateLoss();
                }
            }
        });
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.confirmCallback = null;
        super.onDestroy();
    }

    private void setNumberPickerStyle(NumberPicker numberPicker, boolean z) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(z ? 23 : 59);
        numberPicker.setDescendantFocusability(393216);
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setFormatter(new NumberPicker.Formatter() { // from class: com.taobao.mytaobao.newSettingV2.MtbTimePickerDialogFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.NumberPicker.Formatter
            public String format(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("77712d7b", new Object[]{this, new Integer(i)});
                }
                if (i >= 10) {
                    return String.valueOf(i);
                }
                return "0" + i;
            }
        });
        try {
            Field declaredField = numberPicker.getClass().getDeclaredField("mSelectionDivider");
            declaredField.setAccessible(true);
            declaredField.set(numberPicker, new ColorDrawable(0));
            Field declaredField2 = numberPicker.getClass().getDeclaredField("mSelectionDividerHeight");
            declaredField2.setAccessible(true);
            declaredField2.setInt(numberPicker, 0);
        } catch (Throwable unused) {
        }
    }
}
