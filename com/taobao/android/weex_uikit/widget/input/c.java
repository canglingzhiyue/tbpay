package com.taobao.android.weex_uikit.widget.input;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.o;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SimpleDateFormat f16179a;
    private static SimpleDateFormat b;

    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z, String str);
    }

    static {
        kge.a(-1915733740);
    }

    public static void a(Context context, String str, String str2, String str3, final a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be67ff80", new Object[]{context, str, str2, str3, aVar, map});
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(a(str));
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() { // from class: com.taobao.android.weex_uikit.widget.input.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.DatePickerDialog.OnDateSetListener
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String valueOf;
                String valueOf2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84167245", new Object[]{this, datePicker, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                int i4 = i2 + 1;
                if (i4 < 10) {
                    valueOf = "0" + i4;
                } else {
                    valueOf = String.valueOf(i4);
                }
                if (i3 < 10) {
                    valueOf2 = "0" + i3;
                } else {
                    valueOf2 = String.valueOf(i3);
                }
                a.this.a(true, i + "-" + valueOf + "-" + valueOf2);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Calendar calendar2 = Calendar.getInstance(Locale.getDefault());
        Calendar calendar3 = Calendar.getInstance(Locale.getDefault());
        calendar2.set(1900, 0, 1);
        calendar3.set(2100, 11, 31);
        if (!TextUtils.isEmpty(str3)) {
            if (datePicker.getMaxDate() >= a(str3).getTime()) {
                datePicker.setMinDate(a(str3).getTime());
            } else {
                datePicker.setMinDate(calendar2.getTimeInMillis());
                datePicker.setMaxDate(calendar3.getTimeInMillis());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (datePicker.getMinDate() <= a(str2).getTime()) {
                datePicker.setMaxDate(a(str2).getTime());
            } else {
                datePicker.setMinDate(calendar2.getTimeInMillis());
                datePicker.setMaxDate(calendar3.getTimeInMillis());
            }
        }
        datePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.android.weex_uikit.widget.input.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                } else {
                    a.this.a(false, null);
                }
            }
        });
        Object obj = null;
        a(datePickerDialog, -2, String.valueOf(map != null ? map.get("cancelTitle") : null));
        if (map != null) {
            obj = map.get("confirmTitle");
        }
        a(datePickerDialog, -1, String.valueOf(obj));
        datePickerDialog.show();
    }

    public static void a(Context context, String str, final a aVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d99a14", new Object[]{context, str, aVar, map});
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(b(str));
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() { // from class: com.taobao.android.weex_uikit.widget.input.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public void onTimeSet(TimePicker timePicker, int i, int i2) {
                String valueOf;
                String valueOf2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e120539e", new Object[]{this, timePicker, new Integer(i), new Integer(i2)});
                    return;
                }
                if (i < 10) {
                    valueOf = "0" + i;
                } else {
                    valueOf = String.valueOf(i);
                }
                if (i2 < 10) {
                    valueOf2 = "0" + i2;
                } else {
                    valueOf2 = String.valueOf(i2);
                }
                a.this.a(true, valueOf + ":" + valueOf2);
            }
        }, calendar.get(11), calendar.get(12), false);
        timePickerDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.android.weex_uikit.widget.input.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                } else {
                    a.this.a(false, null);
                }
            }
        });
        Object obj = null;
        a(timePickerDialog, -2, String.valueOf(map != null ? map.get("cancelTitle") : null));
        if (map != null) {
            obj = map.get("confirmTitle");
        }
        a(timePickerDialog, -1, String.valueOf(obj));
        timePickerDialog.show();
    }

    private static Date a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("2806fec5", new Object[]{str});
        }
        if (b == null) {
            b = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        }
        try {
            return b.parse(str);
        } catch (ParseException e) {
            com.taobao.android.weex_framework.util.g.a(e);
            return new Date();
        }
    }

    private static Date b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("89599b64", new Object[]{str});
        }
        if (f16179a == null) {
            f16179a = new SimpleDateFormat("HH:mm", Locale.getDefault());
        }
        try {
            return f16179a.parse(str);
        } catch (ParseException e) {
            com.taobao.android.weex_framework.util.g.a(e);
            return new Date();
        }
    }

    private static void a(final AlertDialog alertDialog, final int i, final CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9741d584", new Object[]{alertDialog, new Integer(i), charSequence});
        } else if (TextUtils.isEmpty(charSequence) || "null".equals(charSequence)) {
        } else {
            try {
                if (alertDialog.getWindow() == null) {
                    return;
                }
                alertDialog.getWindow().getDecorView().post(new o() { // from class: com.taobao.android.weex_uikit.widget.input.c.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        Button button = alertDialog.getButton(i);
                        if (button == null) {
                            return;
                        }
                        button.setAllCaps(false);
                        button.setText(charSequence);
                    }
                });
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.a(th);
            }
        }
    }
}
