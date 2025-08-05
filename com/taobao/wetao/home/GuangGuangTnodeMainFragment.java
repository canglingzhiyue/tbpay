package com.taobao.wetao.home;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.android.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import com.taobao.tao.log.TLog;
import com.taobao.wetao.home.tnode.a;
import com.taobao.wetao.utils.TNodeUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import tb.ohh;
import tb.ohk;

/* loaded from: classes9.dex */
public class GuangGuangTnodeMainFragment extends MainDexContainerFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Future preloadDataFuture = null;
    private static boolean preloadDone = false;

    public static /* synthetic */ Object ipc$super(GuangGuangTnodeMainFragment guangGuangTnodeMainFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment
    public String getNewIntentEventName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ae1a31a", new Object[]{this}) : "onUrlRefresh";
    }

    private void ensureAllsparkApplicationInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b8a9c5", new Object[]{this});
        } else if (ab.f20303a != null) {
        } else {
            TLog.loge("Guangguang", "AllsparkApplication is not Initialized");
            c.a("com.taobao.allspark", null);
        }
    }

    public static void doPreload(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0479f0f", new Object[]{str});
        } else if (preloadDone) {
        } else {
            ab.c(new Runnable() { // from class: com.taobao.wetao.home.GuangGuangTnodeMainFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        h.a(null, TNodeUtils.getGuangGuangUrl(str), TNodeUtils.GUANGGUANG_LOCAL_URL, TNodeUtils.GUANGGUANG_LOCAL_DSL_VERSION);
                    }
                }
            });
            preloadData();
            preloadDone = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.MainDexContainerFragment, com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ensureAllsparkApplicationInitialized();
        this.dataFuture = preloadDataFuture;
        preloadDataFuture = null;
        getArguments().putString("url", getPageUrl());
        super.onCreate(bundle);
        setUTPageName(null);
        prefetch(getUrl());
    }

    private static void prefetch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1fd948", new Object[]{str});
        } else {
            f.a(f.a(TNodeUtils.getGuangGuangUrl(str)), ohk.d(str));
        }
    }

    public static void preloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b589485a", new Object[0]);
        } else if (!(AsyncTask.THREAD_POOL_EXECUTOR instanceof ExecutorService) || PreloadDelegate.c(getPageUrl())) {
        } else {
            preloadDataFuture = ((ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR).submit(new Callable<Object>() { // from class: com.taobao.wetao.home.GuangGuangTnodeMainFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public Object call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                    }
                    TraceCompat.beginSection("GuangGuangFragment preloadData");
                    Object c = ohh.c("guangguang");
                    TraceCompat.endSection();
                    return c;
                }
            });
        }
    }

    private static String getPageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d4e50f", new Object[0]) : a.a();
    }
}
