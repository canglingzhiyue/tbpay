package com.taobao.update.provider;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class UpdateProvider extends FileProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-877825659);
    }

    public static Uri getUriForFile(Context context, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("34061e0", new Object[]{context, file});
        }
        return getUriForFile(context, context.getPackageName() + ".update.provider", file);
    }
}
