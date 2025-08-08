package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f17430a;
    private com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.a b;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static f f17431a;

        static {
            kge.a(-1568980892);
            f17431a = new f();
        }
    }

    static {
        kge.a(1374978182);
    }

    private f() {
        this.f17430a = new HashSet();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2597a527", new Object[0]) : a.f17431a;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String a2 = i.a(str);
        if (StringUtils.isEmpty(a2) || !new File(a2).exists()) {
            return null;
        }
        this.f17430a.remove(str);
        return a2;
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906ea3be", new Object[]{this, str, eVar});
        } else if (this.f17430a.add(str)) {
            this.b = new com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.a(eVar, str);
            this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.a aVar = this.b;
            if (aVar == null || aVar.getStatus() != AsyncTask.Status.FINISHED || eVar == null) {
                return;
            }
            eVar.a();
        }
    }
}
