package com.taobao.android.detail.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-733703327);
        emu.a("com.taobao.android.detail.core.utils.NewArchitectureUtils");
    }

    public static String a(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null) {
            return intent.getStringExtra(TTDetailPageManager.DOWNGRADE_DATA_ID);
        }
        return null;
    }
}
