package com.taobao.appbundle;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.android.split.ab;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.split.k;
import com.alibaba.android.split.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.runtime.ModuleDependencyUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.flp;
import tb.kge;
import tb.mqt;

/* loaded from: classes6.dex */
public class d extends e implements ab.a, ab.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f16295a;
    private static List<String> b;

    @Override // com.alibaba.android.split.ab.a
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.split.ab.a
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    public static /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : b;
    }

    static {
        kge.a(677001067);
        kge.a(-1621337058);
        kge.a(1582880670);
        f16295a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add(c.TAOPAI_FEATURE);
        b.add(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC);
        b.add(flp.PRELOAD_LITE_DETAIL_FEATURE_NAME);
        b.add("liteCreator");
        b.add("taobao_weex_adapter");
        b.add(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
        b.add("taobao_favorite_aar");
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            SharedPreferences sharedPreferences = application.getSharedPreferences("dynamic_features_config", 0);
            if (!sharedPreferences.getBoolean("deffered_download_feature_enabled_" + application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName, true)) {
                return;
            }
            c.Companion.a().b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (b.a().c(str) == null) {
            return;
        }
        arrayList.add(str);
        arrayList.addAll(ModuleDependencyUtils.getDependencies(str));
        if (p.a().a().containsAll(arrayList)) {
            return;
        }
        try {
            j.h().a((Context) c.Companion.a().a(), false, (String[]) arrayList.toArray(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.appbundle.e
    public void a(final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.appbundle.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (String str : list) {
                        if (c.Companion.a().c() != null && !c.Companion.a().c().a().contains(str)) {
                            try {
                                k.a().a(c.Companion.a().a(), false, str);
                                if (com.alibaba.ability.localization.b.f()) {
                                    c.Companion.a().c().a(com.alibaba.android.split.core.splitinstall.j.a().a(str).b(true).a());
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.taobao.appbundle.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // com.taobao.appbundle.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.appbundle.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.Companion.a().c() != null) {
                        for (String str : d.a()) {
                            d.b(str);
                        }
                    }
                }
            });
        }
    }
}
