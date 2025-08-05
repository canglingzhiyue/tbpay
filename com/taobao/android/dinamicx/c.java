package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageInterface;
import com.taobao.android.AliImageServiceInterface;
import tb.gay;

/* loaded from: classes.dex */
public class c implements com.taobao.android.dinamicx.widget.am {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.widget.am
    public void a(Context context, String str, final gay.b bVar) {
        AliImageInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ace91d", new Object[]{this, context, str, bVar});
            return;
        }
        AliImageServiceInterface a3 = com.taobao.android.k.a();
        if (a3 == null || (a2 = a3.a(context)) == null) {
            return;
        }
        a2.a(str).b(new com.taobao.android.i<com.taobao.android.l>() { // from class: com.taobao.android.dinamicx.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.i
            public boolean a(com.taobao.android.l lVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
                }
                bVar.a(lVar.a().getBitmap());
                return false;
            }
        }).a();
    }
}
