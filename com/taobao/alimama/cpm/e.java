package com.taobao.alimama.cpm;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.c;
import tb.kge;

/* loaded from: classes4.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static CpmAdvertiseBundle f8426a;

    static {
        kge.a(-290729338);
    }

    public static boolean a(CpmAdvertise cpmAdvertise, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fa62f11", new Object[]{cpmAdvertise, new Boolean(z)})).booleanValue() : !TextUtils.isEmpty(cpmAdvertise.clickUrl) && !TextUtils.isEmpty(cpmAdvertise.pid) && !(z && cpmAdvertise.bitmap == null && cpmAdvertise.animatedDrawable == null);
    }

    public static Pair<Long, Long> a(CpmAdvertiseBundle cpmAdvertiseBundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("33c1dc99", new Object[]{cpmAdvertiseBundle, str});
        }
        if (!TextUtils.isEmpty(str) && cpmAdvertiseBundle != null && cpmAdvertiseBundle.advertises != null) {
            for (CpmAdvertise cpmAdvertise : cpmAdvertiseBundle.advertises.values()) {
                if (a(cpmAdvertise, false)) {
                    String queryParameter = Uri.parse(cpmAdvertise.clickUrl).getQueryParameter(c.E_URL);
                    if (!TextUtils.isEmpty(queryParameter) && queryParameter.equals(str)) {
                        return new Pair<>(Long.valueOf(cpmAdvertiseBundle.timeStamp), Long.valueOf(cpmAdvertise.cachetime * 1000));
                    }
                }
            }
        }
        return null;
    }

    public static boolean b(CpmAdvertiseBundle cpmAdvertiseBundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb33b832", new Object[]{cpmAdvertiseBundle, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && cpmAdvertiseBundle != null && cpmAdvertiseBundle.advertises != null) {
            for (CpmAdvertise cpmAdvertise : cpmAdvertiseBundle.advertises.values()) {
                if (a(cpmAdvertise, false) && str.equals(cpmAdvertise.ifs)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Pair<Long, Long> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{str}) : a(f8426a, str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : b(f8426a, str);
    }
}
