package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.split.core.internal.ServiceManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tb.bgu;
import tb.kge;

/* loaded from: classes.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final bgu b;

    /* renamed from: a  reason: collision with root package name */
    public final ServiceManager f2474a;
    private final Intent c;
    private final String d;

    static {
        kge.a(1906238272);
        b = (bgu) com.alibaba.android.split.a.b(bgu.class, "SplitInstallService");
    }

    public k(Context context) {
        this(context, context.getPackageName());
    }

    private k(Context context, String str) {
        this.c = new Intent("com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE");
        this.d = str;
        this.c.setPackage(str);
        this.f2474a = new ServiceManager(context.getApplicationContext(), b, "SplitInstallService", this.c, l.f2475a);
    }

    public final com.alibaba.android.split.core.tasks.h<Integer> a(Collection collection, Collection collection2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.split.core.tasks.h) ipChange.ipc$dispatch("fc02e4ce", new Object[]{this, collection, collection2, new Boolean(z)});
        }
        b.d("startInstall(%s,%s)", collection, collection2);
        com.alibaba.android.split.core.tasks.m mVar = new com.alibaba.android.split.core.tasks.m();
        this.f2474a.executeTask(new r(this, mVar, collection, collection2, mVar));
        return mVar.a();
    }

    public final com.alibaba.android.split.core.tasks.h<Void> a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.split.core.tasks.h) ipChange.ipc$dispatch("9704e39f", new Object[]{this, list});
        }
        b.d("deferredInstall(%s)", list);
        com.alibaba.android.split.core.tasks.m mVar = new com.alibaba.android.split.core.tasks.m();
        this.f2474a.executeTask(new a(this, mVar, list, mVar));
        return mVar.a();
    }

    private static ArrayList<Bundle> b(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1dc37fb4", new Object[]{collection});
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static Bundle b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d1183c0f", new Object[]{new Boolean(z)});
        }
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", com.alibaba.android.split.core.splitcompat.j.h().i());
        bundle.putBoolean("silence", z);
        return bundle;
    }

    public static ArrayList<Bundle> a(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("a8495973", new Object[]{collection}) : b(collection);
    }

    public static String a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca9ae21e", new Object[]{kVar}) : kVar.d;
    }

    public static Bundle a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("d516ad30", new Object[]{new Boolean(z)}) : b(z);
    }

    public static bgu b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("16b467ad", new Object[0]) : b;
    }
}
