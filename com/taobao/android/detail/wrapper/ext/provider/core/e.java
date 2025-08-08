package com.taobao.android.detail.wrapper.ext.provider.core;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.ehm;
import tb.ehn;
import tb.ehr;
import tb.emu;
import tb.feg;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements ehm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(432227346);
        kge.a(794670269);
    }

    public e() {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBDependProvider");
    }

    @Override // tb.ehm
    public void a(Context context, String[] strArr, String str, Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afde49c5", new Object[]{this, context, strArr, str, runnable, runnable2});
        } else {
            com.taobao.runtimepermission.f.a(context, strArr).a(str).a(runnable).b(runnable2).a();
        }
    }

    @Override // tb.ehm
    public ehr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehr) ipChange.ipc$dispatch("f0422cf", new Object[]{this}) : new ehr() { // from class: com.taobao.android.detail.wrapper.ext.provider.core.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ehr
            public int a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.anim.detail_h5_fade_in;
            }

            @Override // tb.ehr
            public int b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.anim.detail_h5_fade_out;
            }
        };
    }

    @Override // tb.ehm
    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : Globals.getApplication();
    }

    @Override // tb.ehm
    public ehn c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehn) ipChange.ipc$dispatch("1e676d11", new Object[]{this}) : new feg();
    }

    @Override // tb.ehm
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : StringUtils.equals(android.taobao.util.g.c(context), "wifi");
    }
}
