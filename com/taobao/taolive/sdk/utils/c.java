package com.taobao.taolive.sdk.utils;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.thread.ThreadPoolType;
import java.util.concurrent.ThreadPoolExecutor;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(254680877);
    }

    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> a(AsyncTask<Params, Progress, Result> asyncTask, ThreadPoolType threadPoolType, Params... paramsArr) {
        ThreadPoolExecutor a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncTask) ipChange.ipc$dispatch("6c2ed3d2", new Object[]{asyncTask, threadPoolType, paramsArr});
        }
        if (asyncTask == null) {
            return null;
        }
        com.taobao.taolive.sdk.thread.a A = pmd.a().A();
        return (A == null || (a2 = A.a(threadPoolType)) == null) ? asyncTask.execute(paramsArr) : asyncTask.executeOnExecutor(a2, paramsArr);
    }
}
