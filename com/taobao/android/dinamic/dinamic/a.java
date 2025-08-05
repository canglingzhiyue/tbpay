package com.taobao.android.dinamic.dinamic;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1809920416);
        kge.a(1711867884);
    }

    @Override // com.taobao.android.dinamic.dinamic.d
    public void a(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c001722", new Object[]{this, view, obj, obj2});
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595ecc62", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
        } else {
            a(view, str, obj, obj2, obj3);
        }
    }
}
