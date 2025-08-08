package com.taobao.android.home.component.view.video;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.Globals;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import java.io.File;
import tb.kge;
import tb.ksz;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f12765a;

    static {
        kge.a(36156494);
        f12765a = "VideoUtil";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String str2 = a() + i.a(str);
        if (StringUtils.isEmpty(str2)) {
            com.taobao.android.home.component.utils.e.e(f12765a, "getVideoFilePath empty");
        }
        return str2;
    }

    public static boolean a(Context context) {
        com.taobao.global.setting.c a2;
        ksz b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (j.a(context) && (a2 = com.taobao.global.setting.c.a(context, "homepage")) != null && (b = a2.b()) != null) {
            return b.a(context);
        }
        return false;
    }
}
