package com.taobao.update.instantpatch;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;
import tb.rfx;

/* loaded from: classes9.dex */
public class d extends com.taobao.update.framework.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String path;
    public String workDir;

    static {
        kge.a(-2119721510);
    }

    public String getPatchPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ae0582", new Object[]{this});
        }
        if (this.context == null) {
            return null;
        }
        if (TextUtils.isEmpty(this.workDir)) {
            this.workDir = new File(this.context.getExternalCacheDir(), rfx.HOTPATCH).getAbsolutePath();
        }
        return this.workDir;
    }
}
