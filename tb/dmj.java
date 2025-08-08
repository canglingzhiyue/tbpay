package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class dmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AlertDialog f26855a;
    private Activity b;

    static {
        kge.a(1202509583);
    }

    public dmj(Activity activity, dmk dmkVar, String str, String str2, String str3, String str4) {
        a(activity, dmkVar, str, str2, str3, str4);
    }

    private void a(Activity activity, final dmk dmkVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed04210", new Object[]{this, activity, dmkVar, str, str2, str3, str4});
        } else if (activity == null || StringUtils.isEmpty(str2)) {
        } else {
            this.b = activity;
            String string = activity.getString(R.string.ak_alert_confirm);
            AlertDialog.Builder a2 = a(str, str2, str3, activity);
            if (!StringUtils.isEmpty(str3)) {
                a2.setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: tb.dmj.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        dmk dmkVar2 = dmkVar;
                        if (dmkVar2 == null) {
                            return;
                        }
                        dmkVar2.a(false);
                    }
                });
            }
            if (StringUtils.isEmpty(str4)) {
                str4 = string;
            }
            a2.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: tb.dmj.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    dmk dmkVar2 = dmkVar;
                    if (dmkVar2 == null) {
                        return;
                    }
                    dmkVar2.a(true);
                }
            }).setCancelable(!StringUtils.isEmpty(str3)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.dmj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    dmk dmkVar2 = dmkVar;
                    if (dmkVar2 == null) {
                        return;
                    }
                    dmkVar2.a(false);
                }
            });
            this.f26855a = a2.create();
        }
    }

    public void a() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f26855a == null || (activity = this.b) == null || activity.isFinishing()) {
        } else {
            this.f26855a.show();
        }
    }

    private static AlertDialog.Builder a(String str, String str2, String str3, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("a203ac26", new Object[]{str, str2, str3, context});
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 3);
        if (!StringUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        return builder;
    }
}
