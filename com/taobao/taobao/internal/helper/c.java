package com.taobao.taobao.internal.helper;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.fv;
import tb.jao;
import tb.jzb;
import tb.qem;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            jao.a().a(str, new jzb() { // from class: com.taobao.taobao.internal.helper.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jzb, tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                    }
                }
            });
        }
    }

    public static void a(final qem qemVar, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e042e549", new Object[]{qemVar, context});
        } else if (!(context instanceof Activity)) {
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.taobao.internal.helper.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        qem.this.a((Activity) context, new fv(), null);
                    }
                }
            });
        }
    }

    public static void a(qem qemVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2a5f5f", new Object[]{qemVar});
        } else if (qemVar == null) {
        } else {
            qemVar.a(null);
        }
    }
}
