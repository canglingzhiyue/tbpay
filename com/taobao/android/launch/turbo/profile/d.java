package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f13014a = a();
    private final Context b;

    static {
        kge.a(2083375655);
    }

    private d(Context context) {
        this.b = context;
    }

    private File a() {
        File file;
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this});
        }
        try {
            file = new File(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).applicationInfo.publicSourceDir);
            file2 = new File(file.getParentFile(), "/oat/arm/base.odex");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(file.getParentFile(), "/oat/arm64/base.odex");
        if (!file3.exists()) {
            return null;
        }
        return file3;
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        try {
            File file = new d(context).f13014a;
            if (file == null) {
                return 0L;
            }
            return file.length();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
