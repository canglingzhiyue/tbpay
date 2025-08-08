package com.etao.feimagesearch.album;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.com;
import tb.cov;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g INSTANCE;

    static {
        kge.a(114232958);
        INSTANCE = new g();
    }

    private g() {
    }

    @JvmStatic
    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            cuj.a(com.b(), "PltLastAlbumPicTime", str);
        }
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : cuj.b(com.b(), "PltLastAlbumPicTime", "");
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String a2 = a();
        if (a2 == null || StringUtils.isEmpty(a2)) {
            return "InvalidValue";
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - cov.a(a2, -1L);
        if (currentTimeMillis <= 0) {
            return "InvalidValue";
        }
        long j = 60;
        long j2 = currentTimeMillis / j;
        return j2 <= ((long) 5) ? "5m" : j2 <= ((long) 10) ? "10m" : j2 <= ((long) 30) ? "30m" : j2 <= j ? "1h" : j2 <= ((long) 1440) ? "1d" : "over1d";
    }
}
