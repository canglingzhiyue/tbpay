package com.alibaba.android.split.core.plugin;

import android.content.pm.PackageManager;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f2439a;

    static {
        kge.a(-999847650);
        f2439a = new File(a(), String.format("%s/%s/%s/%s", "splitcompat", b(), "native-libraries", j.PLUGIN_NAME)).getAbsolutePath();
    }

    public static File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[0]) : j.h().e().getFilesDir();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return j.h().e().getPackageManager().getPackageInfo(j.h().e().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }
}
