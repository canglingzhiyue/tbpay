package com.taobao.android.remoteso.tbadapter.ext;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.bsdiff.Bsdiff;
import java.io.File;
import java.io.IOException;
import tb.iit;
import tb.iku;

/* loaded from: classes6.dex */
public class a implements iit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.iit
    public iit.a a(Context context, File file, File file2, File file3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (iit.a) ipChange.ipc$dispatch("8b560c70", new Object[]{this, context, file, file2, file3});
        }
        try {
            iku.c(file3);
            int patch = Bsdiff.patch(file.getPath(), file2.getPath(), file3.getPath());
            if (patch != 0) {
                z = false;
            }
            return new iit.a(z, patch);
        } catch (IOException unused) {
            return new iit.a(false, -1);
        }
    }
}
