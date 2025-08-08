package com.taobao.android.home.component.view.video;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f12762a;
    private com.taobao.android.home.component.view.video.a b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f12763a;

        static {
            kge.a(1881401151);
            f12763a = new c();
        }
    }

    static {
        kge.a(51664865);
    }

    private c() {
        this.f12762a = new HashSet();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7eef27e9", new Object[0]) : a.f12763a;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String a2 = f.a(str);
        if (StringUtils.isEmpty(a2) || !new File(a2).exists()) {
            return null;
        }
        this.f12762a.remove(str);
        return a2;
    }

    public void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4586a94e", new Object[]{this, str, bVar});
        } else if (this.f12762a.add(str)) {
            this.b = new com.taobao.android.home.component.view.video.a(bVar, str);
            this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            com.taobao.android.home.component.view.video.a aVar = this.b;
            if (aVar == null || aVar.getStatus() != AsyncTask.Status.FINISHED || bVar == null) {
                return;
            }
            bVar.a();
        }
    }
}
