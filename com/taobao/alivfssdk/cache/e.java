package com.taobao.alivfssdk.cache;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile File f8491a;

    static {
        kge.a(2007481311);
    }

    public static File a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{context});
        }
        if (f8491a != null) {
            return f8491a;
        }
        File file = new File(context.getFilesDir(), "AVFSCache");
        f8491a = file;
        return file;
    }
}
