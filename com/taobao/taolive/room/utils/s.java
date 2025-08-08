package com.taobao.taolive.room.utils;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ado;
import tb.ddw;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.xkw;

/* loaded from: classes8.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1482051924);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            a(context, str, false);
        }
    }

    public static void a(Context context, String str, Bundle bundle, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5844481b", new Object[]{context, str, bundle, new Integer(i), new Boolean(z)});
            return;
        }
        if (!StringUtils.isEmpty(str) && str.startsWith(ado.URL_SEPARATOR)) {
            str = "http:" + str;
        }
        if (pmd.a().r() != null) {
            pmd.a().r().a(context, str, bundle, i);
        }
        if (!z) {
            return;
        }
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, null, (phg.b() == null || phg.b().a() == null) ? null : phg.b().a().G());
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
        } else {
            a(context, str, null, z);
        }
    }

    public static void a(Context context, String str, Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e165aa", new Object[]{context, str, bundle, new Boolean(z)});
            return;
        }
        if (!StringUtils.isEmpty(str) && str.startsWith(ado.URL_SEPARATOR)) {
            str = "http:" + str;
        }
        if (pmd.a().r() != null) {
            pmd.a().r().a(context, str, bundle);
        }
        if (!z) {
            return;
        }
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, null, (phg.b() == null || phg.b().a() == null) ? null : phg.b().a().G());
    }
}
