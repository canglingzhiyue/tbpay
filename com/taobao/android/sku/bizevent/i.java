package com.taobao.android.sku.bizevent;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.r;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.jpx;
import tb.kge;

/* loaded from: classes6.dex */
public class i implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "switch_mark_type";

    static {
        kge.a(-624392628);
        kge.a(-1413102650);
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
        } else if (!jpx.a(iyeVar.a())) {
        } else {
            SharedPreferences.Editor edit = iyeVar.a().getApplicationContext().getSharedPreferences(com.taobao.android.sku.c.MARK_SHARED_PREFERENCES_NAME, 0).edit();
            int f = iybVar.b().f();
            if (f == 0) {
                str = "弹框";
                i = 1002;
            } else if (f != 1002) {
                str = "关闭";
                i = 0;
            } else {
                i = 1001;
                str = "水印";
            }
            edit.putInt("type", i);
            edit.apply();
            iybVar.b().a(i);
            r.a(iyeVar.a(), str, 0);
        }
    }
}
