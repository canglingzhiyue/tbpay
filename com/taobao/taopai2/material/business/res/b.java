package com.taobao.taopai2.material.business.res;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;
import tb.pzc;
import tb.qbq;
import tb.qbs;
import tb.qcg;

/* loaded from: classes8.dex */
public class b extends qbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1755914858);
    }

    public static /* synthetic */ void lambda$Mc9eIkRbMyy4sHC_RrAXeNvr84A(b bVar, String str) {
        bVar.a(str);
    }

    public b() {
        super(null);
    }

    @Override // tb.qbq, tb.kml
    public void onDownloadFinish(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        a();
        pzc.a(new Runnable() { // from class: com.taobao.taopai2.material.business.res.-$$Lambda$b$Mc9eIkRbMyy4sHC_RrAXeNvr84A
            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.lambda$Mc9eIkRbMyy4sHC_RrAXeNvr84A(b.this, str2);
            }
        });
    }

    public /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.d == null) {
        } else {
            if (qcg.a(str)) {
                this.d.a(this.f32884a, str);
            } else {
                this.d.a(this.f32884a, "file_not_exist", "file not exist");
            }
        }
    }

    public static File b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e4e27fb0", new Object[]{str, str2});
        }
        String a2 = qbs.a(str);
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        if (StringUtils.isEmpty(str2)) {
            return new File(a2, str + ".mp3");
        }
        return new File(a2, str + "_" + str2 + ".mp3");
    }

    public static File c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fefdfe4f", new Object[]{str, str2});
        }
        String a2 = qbs.a(str);
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        if (StringUtils.isEmpty(str2)) {
            return new File(a2, str + "_wave.txt");
        }
        return new File(a2, str + "_" + str2 + "_wave.txt");
    }
}
