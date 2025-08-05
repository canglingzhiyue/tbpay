package com.taobao.android.order.core.subscriber.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(768558173);
    }

    public static void a(Context context, String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895ff3f5", new Object[]{context, str, bVar});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            if (Build.VERSION.SDK_INT > 29) {
                f fVar = new f(context);
                fVar.a(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.order.core.subscriber.widget.OrderVesselContainer$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                            return;
                        }
                        b bVar2 = b.this;
                        if (bVar2 == null) {
                            return;
                        }
                        bVar2.a();
                    }
                });
                fVar.a(str);
                return;
            }
            e eVar = new e(context);
            eVar.a(new DialogInterface.OnDismissListener() { // from class: com.taobao.android.order.core.subscriber.widget.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    b bVar2 = b.this;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a();
                }
            });
            eVar.a(str);
        }
    }
}
