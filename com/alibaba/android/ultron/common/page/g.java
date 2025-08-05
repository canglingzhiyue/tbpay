package com.alibaba.android.ultron.common.page;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f2527a;

    static {
        kge.a(-1459899580);
        kge.a(1456798185);
    }

    public void a(i iVar, final Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82db3ebf", new Object[]{this, iVar, context, new Integer(i)});
        } else if (i == 2 || this.f2527a != null) {
        } else {
            this.f2527a = new c(context, R.style.Dialog_Status_Container);
            this.f2527a.setContentView(View.inflate(context, R.layout.common_progressbar_layout, null));
            this.f2527a.a();
            this.f2527a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alibaba.android.ultron.common.page.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    dialogInterface.dismiss();
                    Context context2 = context;
                    if (!(context2 instanceof Activity)) {
                        return;
                    }
                    ((Activity) context2).finish();
                }
            });
            this.f2527a.show();
        }
    }

    public void b(i iVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e725c0", new Object[]{this, iVar, context, new Integer(i)});
            return;
        }
        c cVar = this.f2527a;
        if (cVar == null) {
            return;
        }
        cVar.dismiss();
        this.f2527a = null;
    }
}
