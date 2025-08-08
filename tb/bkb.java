package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class bkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AlertDialog f25948a;
    private Activity b;

    static {
        kge.a(-1193883602);
    }

    public bkb(Activity activity, bkf bkfVar, String str, String str2, String str3, String str4) {
        a(activity, bkfVar, str, str2, str3, str4);
    }

    private void a(Activity activity, final bkf bkfVar, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bcbef5", new Object[]{this, activity, bkfVar, str, str2, str3, str4});
        } else if (activity == null || StringUtils.isEmpty(str2)) {
        } else {
            this.b = activity;
            AlertDialog.Builder a2 = a(str, str2, str3, activity);
            if (!StringUtils.isEmpty(str3)) {
                a2.setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: tb.bkb.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        bkf bkfVar2 = bkfVar;
                        if (bkfVar2 == null) {
                            return;
                        }
                        bkfVar2.a(false);
                    }
                });
            }
            if (StringUtils.isEmpty(str4)) {
                str4 = b.a(R.string.order_biz_sure);
            }
            a2.setPositiveButton(str4, new DialogInterface.OnClickListener() { // from class: tb.bkb.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    bkf bkfVar2 = bkfVar;
                    if (bkfVar2 == null) {
                        return;
                    }
                    bkfVar2.a(true);
                }
            }).setCancelable(!StringUtils.isEmpty(str3)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.bkb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    bkf bkfVar2 = bkfVar;
                    if (bkfVar2 == null) {
                        return;
                    }
                    bkfVar2.a(false);
                }
            });
            this.f25948a = a2.create();
        }
    }

    public void a() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f25948a == null || (activity = this.b) == null || activity.isFinishing()) {
        } else {
            this.f25948a.show();
            this.f25948a.getButton(-2).setAllCaps(false);
            this.f25948a.getButton(-1).setAllCaps(false);
        }
    }

    private static AlertDialog.Builder a(String str, String str2, String str3, Context context) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            return (AlertDialog.Builder) ipChange.ipc$dispatch("a203ac26", new Object[]{str, str2, str3, context});
        }
        if (bxd.a("useDefaultLightThemeForAlert", true)) {
            i = 5;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        if (!StringUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!StringUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        return builder;
    }
}
