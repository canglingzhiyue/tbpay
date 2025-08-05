package com.alibaba.ability.impl.file;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.fxb;
import tb.kge;

/* loaded from: classes2.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i INSTANCE;

    static {
        kge.a(240096322);
        INSTANCE = new i();
    }

    private i() {
    }

    public final ErrorResult a(String virtualPath) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3f57d21a", new Object[]{this, virtualPath});
        }
        q.d(virtualPath, "virtualPath");
        if (virtualPath.length() != 0) {
            z = false;
        }
        if (z) {
            return c.INSTANCE.a("file path is empty");
        }
        if (f.INSTANCE.c(virtualPath)) {
            return null;
        }
        return c.INSTANCE.a("file path is invalid");
    }

    public final String a(Context context, String businessId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, businessId});
        }
        q.d(context, "context");
        q.d(businessId, "businessId");
        return a(context) + "/Mega/" + e.INSTANCE.a(businessId) + fxb.DIR;
    }

    public final String a(Context context, String businessId, String virtualPath) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{this, context, businessId, virtualPath});
        }
        q.d(context, "context");
        q.d(businessId, "businessId");
        q.d(virtualPath, "virtualPath");
        String a2 = kotlin.text.n.a(virtualPath, "file://", "", false, 4, (Object) null);
        return a(context, businessId) + a2;
    }

    @JvmStatic
    private static final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        File filesDir = context.getFilesDir();
        q.b(filesDir, "context.filesDir");
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        String absolutePath = filesDir.getAbsolutePath();
        q.b(absolutePath, "fileDir.absolutePath");
        return absolutePath;
    }
}
