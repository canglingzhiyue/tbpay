package com.taobao.taopai.material.maires;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;
import tb.qcg;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);

        void a(MaiResDependenceList maiResDependenceList);
    }

    static {
        kge.a(1620556535);
    }

    public static /* synthetic */ void lambda$fvotdhO4ap1JdEk5lrhyrxUbHR4(String str, a aVar) {
        b(str, aVar);
    }

    public void a(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9458fd1", new Object[]{this, str, aVar});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.taopai.material.maires.-$$Lambda$c$fvotdhO4ap1JdEk5lrhyrxUbHR4
                @Override // java.lang.Runnable
                public final void run() {
                    c.lambda$fvotdhO4ap1JdEk5lrhyrxUbHR4(str, aVar);
                }
            });
        }
    }

    public static /* synthetic */ void b(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d83ff70", new Object[]{str, aVar});
        } else if (StringUtils.isEmpty(str) || !str.endsWith("require.json")) {
            aVar.a(5);
        } else if (!new File(str).exists()) {
            aVar.a(2);
        } else {
            String d = qcg.d(str);
            if (!StringUtils.isEmpty(d)) {
                try {
                    aVar.a((MaiResDependenceList) JSONObject.parseObject(d, MaiResDependenceList.class));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    aVar.a(4);
                    return;
                }
            }
            aVar.a(3);
        }
    }
}
