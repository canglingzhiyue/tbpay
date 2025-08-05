package com.alipay.android.app.render.birdnest.widget;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class YearMonthPickerDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public YearMonthPicker mDatePicker;
    public AlertDialog.Builder mDialogBuilder;
    public String mNegativeLabel;
    public String mPositiveLabel;

    public void hideDayPick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6200e542", new Object[]{this});
        }
    }

    public YearMonthPickerDialog(String str, Context context) {
        this.mDialogBuilder = null;
        View inflate = LayoutInflater.from(context).inflate(ResUtils.getLayoutId("alipay_template_express_year_month_picker"), (ViewGroup) null, false);
        this.mDatePicker = (YearMonthPicker) inflate.findViewById(ResUtils.getId("datePicker1"));
        this.mDatePicker.disableBeforeYear();
        hideDayPick();
        this.mDialogBuilder = new AlertDialog.Builder(context);
        this.mDialogBuilder.setTitle(str);
        this.mDialogBuilder.setView(inflate);
        this.mPositiveLabel = ILocalizationService.CONFIRM;
        this.mNegativeLabel = ILocalizationService.CANCEL;
    }

    public void setMaxPickerYears(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2abe36", new Object[]{this, new Integer(i)});
            return;
        }
        YearMonthPicker yearMonthPicker = this.mDatePicker;
        if (yearMonthPicker == null) {
            return;
        }
        yearMonthPicker.setMaxPickerYears(i);
    }

    public void setCalendarType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bfc82b", new Object[]{this, str});
            return;
        }
        YearMonthPicker yearMonthPicker = this.mDatePicker;
        if (yearMonthPicker == null) {
            return;
        }
        yearMonthPicker.setCalendarType(str);
    }

    public void setStartPickDate(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8501496", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mDatePicker.setYearMonth(i, i2);
        }
    }

    public void setCurrentDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52f10c", new Object[]{this});
        } else {
            this.mDatePicker.setCurrentDate();
        }
    }

    public Dialog create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("858c5a2c", new Object[]{this});
        }
        AlertDialog create = this.mDialogBuilder.create();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return create;
    }

    public Dialog show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("a11c6f0b", new Object[]{this});
        }
        Dialog create = create();
        create.show();
        return create;
    }

    public void setPositiveListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db44e937", new Object[]{this, onClickListener});
        } else {
            this.mDialogBuilder.setPositiveButton(this.mPositiveLabel, onClickListener);
        }
    }

    public void setNegativeListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc7e07b", new Object[]{this, onClickListener});
        } else {
            this.mDialogBuilder.setNegativeButton(this.mNegativeLabel, onClickListener);
        }
    }
}
