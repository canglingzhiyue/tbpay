package com.alibaba.android.split.core.plugin;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.alibaba.android.split.core.internal.ApkLoader;
import com.alibaba.android.split.core.internal.TBSplitCore;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.manager.IPluginContext;
import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bgy;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a<T extends IPluginContext> implements com.alibaba.android.split.manager.b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, T> f2438a = new ConcurrentHashMap();
    public com.alibaba.android.split.core.splitcompat.g b;
    public ClassLoader c;
    public bgy d;
    public ApkLoader e;

    static {
        kge.a(-993766134);
        kge.a(609270953);
    }

    @Override // com.alibaba.android.split.manager.b
    public void a(bgy bgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b35184", new Object[]{this, bgyVar});
            return;
        }
        this.d = bgyVar;
        this.c = j.h().e().getClassLoader();
        this.e = TBSplitCore.getApkLoader();
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.f2438a.containsKey(str)) {
            return false;
        }
        return this.f2438a.get(str).c();
    }

    public com.alibaba.android.split.core.splitcompat.g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.split.core.splitcompat.g) ipChange.ipc$dispatch("a5bdf643", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.android.split.manager.b
    public T b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("3d550a7", new Object[]{this, str}) : this.f2438a.get(str);
    }

    @Override // com.alibaba.android.split.manager.b
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f2438a.remove(str);
        }
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53423322", new Object[]{this, qVar})).booleanValue() : this.f2438a.containsKey(qVar.b());
    }

    @Override // com.alibaba.android.split.manager.b
    public boolean b(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9061f741", new Object[]{this, qVar})).booleanValue() : this.f2438a.get(qVar.b()).d();
    }

    @Override // com.alibaba.android.split.manager.b
    public void a(String str, IPluginContext.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2b78c4", new Object[]{this, str, status});
        } else {
            this.f2438a.get(str).a(status);
        }
    }

    @Override // com.alibaba.android.split.manager.b
    public void a(Context context, Collection<File> collection) throws Exception {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821eaa11", new Object[]{this, context, collection});
        } else if (collection != null && collection.size() != 0) {
            if (Build.VERSION.SDK_INT > 23) {
                String[] strArr = new String[collection.size()];
                for (File file : collection) {
                    if (Build.VERSION.SDK_INT < 26) {
                        if (!h.a().a(context.getAssets(), file.getAbsolutePath())) {
                            h.a().b(context.getAssets(), file.getAbsolutePath());
                        }
                    } else {
                        h.a().b(context.getAssets(), file.getAbsolutePath());
                    }
                    strArr[i] = file.getAbsolutePath();
                    i++;
                }
                h.a().a(strArr);
                h.a().a(strArr, context);
                a(collection);
                return;
            }
            for (File file2 : collection) {
                h.a().a(context, file2.getAbsolutePath());
            }
        }
    }

    public Map<String, Integer> a(Collection<File> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f1aee8e", new Object[]{this, collection});
        }
        HashMap hashMap = new HashMap();
        try {
            for (WeakReference weakReference : new ArrayList(j.h().d())) {
                Resources resources = (Resources) weakReference.get();
                if (resources != null) {
                    for (File file : collection) {
                        if (Build.VERSION.SDK_INT < 26) {
                            if (!h.a().a(resources.getAssets(), file.getAbsolutePath())) {
                                hashMap.put(file.getAbsolutePath(), Integer.valueOf(h.a().b(resources.getAssets(), file.getAbsolutePath())));
                            }
                        } else {
                            hashMap.put(file.getAbsolutePath(), Integer.valueOf(h.a().b(resources.getAssets(), file.getAbsolutePath())));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}
