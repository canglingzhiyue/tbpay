package com.alibaba.analytics.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.aob;
import tb.apr;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class a implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "audid";

    static {
        kge.a(775063098);
        kge.a(-2114741388);
    }

    public a() {
        a(f.a().a(KEY));
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str2);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        apr.b("AudidConfigListener", "parseConfig value", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("0".equalsIgnoreCase(str)) {
            a(aob.a().k(), true);
        } else {
            a(aob.a().k(), false);
        }
    }

    private void a(final Context context, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
        } else {
            aqe.a().a(new Runnable() { // from class: com.alibaba.analytics.core.config.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context2 = context;
                    if (context2 == null) {
                        return;
                    }
                    try {
                        File fileStreamPath = context2.getFileStreamPath("3c9b584e65e6c983");
                        if (fileStreamPath.exists()) {
                            if (z) {
                                return;
                            }
                            fileStreamPath.delete();
                        } else if (!z) {
                        } else {
                            fileStreamPath.createNewFile();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }
}
