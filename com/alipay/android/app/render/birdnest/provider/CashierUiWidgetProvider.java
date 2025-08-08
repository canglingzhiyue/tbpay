package com.alipay.android.app.render.birdnest.provider;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.widget.YearMonthPickerDialog;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.FBOverView;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class CashierUiWidgetProvider implements BirdNestEngine.UiWidgetProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICashierProvider f4373a;

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public View createIconView(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ccc04327", new Object[]{this, context, str, str2, str3});
        }
        return null;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public View createLoadingView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7c46691e", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public FBOverView createOverView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBOverView) ipChange.ipc$dispatch("56cae48", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public void updateWebViewProperties(View view, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5a23c", new Object[]{this, view, str, str2});
        }
    }

    public CashierUiWidgetProvider(ICashierProvider iCashierProvider) {
        this.f4373a = iCashierProvider;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public View createViewByTag(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("842e1fbe", new Object[]{this, context, str, map});
        }
        if (!"switch".equals(str)) {
            return null;
        }
        CheckBox checkBox = new CheckBox(context);
        checkBox.setButtonDrawable(ResUtils.getDrawableId("mini_ui_switch"));
        return checkBox;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public Dialog createDialog(Context context, String str, String str2, String str3, String[] strArr, final AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("ef6a404b", new Object[]{this, context, str, str2, str3, strArr, onItemClickListener});
        }
        if (!StringUtils.equals(str, "actionSheet")) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!StringUtils.isEmpty(str2)) {
            builder.setTitle(str2);
        } else {
            builder.setTitle("");
        }
        if (!StringUtils.isEmpty(str3)) {
            builder.setMessage(str3);
        }
        builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.alipay.android.app.render.birdnest.provider.CashierUiWidgetProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                try {
                    onItemClickListener.onItemClick(null, null, i, 0L);
                } catch (Throwable unused) {
                }
            }
        });
        return builder.create();
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public void openWebPage(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7995ed4", new Object[]{this, str, str2, context});
            return;
        }
        ICashierProvider iCashierProvider = this.f4373a;
        if (iCashierProvider == null) {
            return;
        }
        iCashierProvider.openWebPage(str, context);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public View createWebView(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d726c0b", new Object[]{this, context, str, loadUrlListener, map});
        }
        ICashierProvider iCashierProvider = this.f4373a;
        if (iCashierProvider == null) {
            return null;
        }
        return iCashierProvider.createWebView(context, str, loadUrlListener, map);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public void createWebViewAsync(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map, BirdNestEngine.UiWidgetProvider.CreateCallback createCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91e568f", new Object[]{this, context, str, loadUrlListener, map, createCallback});
            return;
        }
        ICashierProvider iCashierProvider = this.f4373a;
        if (iCashierProvider == null) {
            return;
        }
        iCashierProvider.createWebViewAsync(context, str, loadUrlListener, map, createCallback);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public void loadUrlWithWebView(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3512f2b", new Object[]{this, view, str});
            return;
        }
        ICashierProvider iCashierProvider = this.f4373a;
        if (iCashierProvider == null) {
            return;
        }
        iCashierProvider.loadUrlWithWebView(view, str);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public void loadData(View view, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8167bcd9", new Object[]{this, view, str, str2, str3});
            return;
        }
        ICashierProvider iCashierProvider = this.f4373a;
        if (iCashierProvider == null) {
            return;
        }
        iCashierProvider.loadData(view, str, str2, str3);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public void destroyWebView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88107f4c", new Object[]{this, view});
            return;
        }
        ICashierProvider iCashierProvider = this.f4373a;
        if (iCashierProvider == null) {
            return;
        }
        iCashierProvider.destroyWebView(view);
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider
    public Dialog createYearMounthPickerDialog(Context context, int i, int i2, int i3, String str, final BirdNestEngine.UiWidgetProvider.YearMounthPickerCallback yearMounthPickerCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("89c2049b", new Object[]{this, context, new Integer(i), new Integer(i2), new Integer(i3), str, yearMounthPickerCallback});
        }
        final YearMonthPickerDialog yearMonthPickerDialog = new YearMonthPickerDialog(context.getString(ResUtils.getStringId("alipay_template_month_dialog_title")), context);
        yearMonthPickerDialog.setCalendarType(str);
        yearMonthPickerDialog.setPositiveListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.app.render.birdnest.provider.CashierUiWidgetProvider.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i4)});
                    return;
                }
                yearMounthPickerCallback.onPick(yearMonthPickerDialog.mDatePicker.getYear(), yearMonthPickerDialog.mDatePicker.getMonthStr(true));
                dialogInterface.dismiss();
            }
        });
        yearMonthPickerDialog.setNegativeListener(new DialogInterface.OnClickListener() { // from class: com.alipay.android.app.render.birdnest.provider.CashierUiWidgetProvider.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i4)});
                } else {
                    dialogInterface.dismiss();
                }
            }
        });
        if (i < 0 && i2 < 0) {
            yearMonthPickerDialog.setCurrentDate();
        } else {
            yearMonthPickerDialog.setStartPickDate(i, i2);
        }
        return yearMonthPickerDialog.create();
    }
}
