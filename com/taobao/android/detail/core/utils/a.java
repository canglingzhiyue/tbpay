package com.taobao.android.detail.core.utils;

import android.content.Context;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;
import tb.nyf;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-910508485);
        emu.a("com.taobao.android.detail.core.utils.AliDetailTBSettingUtils");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            nyf nyfVar = (nyf) AliAdaptServiceManager.getInstance().findAliAdaptService(nyf.class);
            if (nyfVar != null) {
                return nyfVar.isAutoPlayVideoUnderCurrentNetwork(context);
            }
            return false;
        } catch (Throwable th) {
            i.a("AliDetailTBSettingUtils", "canAutoPlayInCurrentNetwork error: ", th);
            return false;
        }
    }
}
