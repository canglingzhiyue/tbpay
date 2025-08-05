package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14020a;

    static {
        kge.a(1292882322);
        f14020a = a.class.getSimpleName();
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context != null && !l.e(str)) {
            try {
                return context.getSharedPreferences("taobao_live_home", 0).getString(str, "");
            } catch (Exception e) {
                q.a(f14020a, "readPreferences exp", e);
            }
        }
        return "";
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        if (context != null && !l.e(str)) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("taobao_live_home", 0).edit();
                edit.putString(str, str2);
                edit.apply();
                return true;
            } catch (Exception e) {
                q.a(f14020a, "writePreferences exp", e);
            }
        }
        return false;
    }
}
