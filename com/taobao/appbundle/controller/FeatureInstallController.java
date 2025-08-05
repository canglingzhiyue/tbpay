package com.taobao.appbundle.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.android.split.ab;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.c;
import com.taobao.appbundle.controller.FeatureInstallController;
import com.taobao.appbundle.d;
import com.taobao.appbundle.e;
import com.taobao.appbundle.scheduler.Priority;
import com.taobao.appbundle.scheduler.a;
import com.taobao.appbundle.scheduler.internal.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public class FeatureInstallController extends e implements ab.a, ab.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTO_FEATURE_DOWNLOAD = "auto_feature_download";
    public static final String DEFFERED_DOWNLOAD_FEATURES_ENABLED = "deffered_download_feature_enabled";
    public static final String DYNAMIC_FEATURES_CONFIG = "dynamic_features_config";

    /* renamed from: a  reason: collision with root package name */
    private Context f16294a;
    private List<String> f;
    private List<String> g;
    private List<String> h;
    private List<String> i;
    private g j;
    private Set<String> l;
    private ScheduledThreadPoolExecutor k = new ScheduledThreadPoolExecutor(1);
    private boolean r = false;
    private g.a b = a.a(Priority.HIGH).a();
    private g.a c = a.a(Priority.IMMEDIATE).a();
    private g.a d = a.a(Priority.MEDIUM).a();
    private g.a e = a.a(Priority.LOW).a();

    static {
        kge.a(-1706135307);
        kge.a(-1621337058);
        kge.a(1582880670);
    }

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

    public FeatureInstallController(Context context) {
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.l = new HashSet();
        this.f16294a = context;
        this.j = h.a(context);
        this.f = (List) b.a().b();
        this.g = (List) b.a().c();
        this.h = (List) b.a().d();
        this.i = (List) b.a().e();
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dynamic_features_config", 0);
            this.l = sharedPreferences.getStringSet("auto_feature_download_" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName, new HashSet());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        final int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.r) {
            this.r = true;
            try {
                SharedPreferences sharedPreferences = this.f16294a.getSharedPreferences("dynamic_features_config", 0);
                if (!sharedPreferences.getBoolean("deffered_download_feature_enabled_" + this.f16294a.getPackageManager().getPackageInfo(this.f16294a.getPackageName(), 0).versionName, true)) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            for (final String str : this.f) {
                this.c.a(new Runnable() { // from class: tb.jzo$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Log.e("FIController", "immediate defferInstall:" + str + Thread.currentThread().getName());
                        try {
                            k.a().a(c.Companion.a().a(), false, str);
                            j a2 = j.a().a(str).b(true).a();
                            FeatureInstallController featureInstallController = FeatureInstallController.this;
                            FeatureInstallController.$ipChange.a(a2);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                });
            }
            this.g.addAll(this.l);
            for (final String str2 : this.g) {
                this.k.schedule(new Runnable() { // from class: tb.jzo$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FeatureInstallController featureInstallController = FeatureInstallController.this;
                        FeatureInstallController.$ipChange.a(new Runnable() { // from class: tb.jzo$2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Log.e("FIController", "high defferInstall:" + str2 + "@" + Thread.currentThread());
                                try {
                                    k.a().a(c.Companion.a().a(), false, str2);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(str2);
                                    FeatureInstallController featureInstallController2 = FeatureInstallController.this;
                                    FeatureInstallController.$ipChange.a(arrayList);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                }, 1, TimeUnit.SECONDS);
            }
            final int i2 = 0;
            while (i2 < this.h.size()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.k;
                Runnable runnable = new Runnable() { // from class: tb.jzo$3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FeatureInstallController featureInstallController = FeatureInstallController.this;
                        FeatureInstallController.$ipChange.a(new Runnable() { // from class: tb.jzo$3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                FeatureInstallController featureInstallController2 = FeatureInstallController.this;
                                String str3 = (String) FeatureInstallController.$ipChange.get(i2);
                                StringBuilder sb = new StringBuilder();
                                sb.append("medium defferInstall:");
                                FeatureInstallController featureInstallController3 = FeatureInstallController.this;
                                sb.append(FeatureInstallController.$ipChange);
                                sb.append("@");
                                sb.append(Thread.currentThread());
                                Log.e("FIController", sb.toString());
                                try {
                                    k.a().a(c.Companion.a().a(), false, str3);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(str3);
                                    FeatureInstallController featureInstallController4 = FeatureInstallController.this;
                                    FeatureInstallController.$ipChange.a(arrayList);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                };
                i2++;
                scheduledThreadPoolExecutor.schedule(runnable, i2 * 2, TimeUnit.SECONDS);
            }
            while (i < this.i.size()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.k;
                Runnable runnable2 = new Runnable() { // from class: tb.jzo$4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FeatureInstallController featureInstallController = FeatureInstallController.this;
                        FeatureInstallController.$ipChange.a(new Runnable() { // from class: tb.jzo$4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                FeatureInstallController featureInstallController2 = FeatureInstallController.this;
                                String str3 = (String) FeatureInstallController.$ipChange.get(i);
                                StringBuilder sb = new StringBuilder();
                                sb.append("low defferInstall:");
                                FeatureInstallController featureInstallController3 = FeatureInstallController.this;
                                sb.append((String) FeatureInstallController.$ipChange.get(i));
                                sb.append("@");
                                sb.append(Thread.currentThread());
                                Log.e("FIController", sb.toString());
                                try {
                                    k.a().a(c.Companion.a().a(), false, str3);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(str3);
                                    FeatureInstallController featureInstallController4 = FeatureInstallController.this;
                                    FeatureInstallController.$ipChange.a(arrayList);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                };
                i++;
                scheduledThreadPoolExecutor2.schedule(runnable2, i * 5, TimeUnit.SECONDS);
            }
        }
    }

    @Override // com.taobao.appbundle.e
    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (final String str : list) {
            this.c.a(new Runnable() { // from class: tb.jzo$5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Log.e("FIController", "immediate defferInstall:" + str + Thread.currentThread().getName());
                    try {
                        k.a().a(c.Companion.a().a(), false, str);
                        j a2 = j.a().a(str).b(true).a();
                        FeatureInstallController featureInstallController = FeatureInstallController.this;
                        FeatureInstallController.$ipChange.a(a2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.taobao.appbundle.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (com.alibaba.ability.localization.b.f()) {
            a();
        } else {
            com.alibaba.ability.localization.b.a(new b.a() { // from class: tb.jzo$6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.ability.localization.b.a
                public void a(Language language, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                    } else if (!com.alibaba.ability.localization.b.f()) {
                    } else {
                        FeatureInstallController.this.a();
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
            Coordinator.execute(new Runnable() { // from class: tb.jzo$7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.Companion.a().c() != null) {
                        FeatureInstallController featureInstallController = FeatureInstallController.this;
                        for (String str : FeatureInstallController.$ipChange) {
                            d.b(str);
                        }
                        FeatureInstallController featureInstallController2 = FeatureInstallController.this;
                        for (String str2 : FeatureInstallController.$ipChange) {
                            d.b(str2);
                        }
                        FeatureInstallController featureInstallController3 = FeatureInstallController.this;
                        for (String str3 : FeatureInstallController.$ipChange) {
                            d.b(str3);
                        }
                        FeatureInstallController featureInstallController4 = FeatureInstallController.this;
                        for (String str4 : FeatureInstallController.$ipChange) {
                            d.b(str4);
                        }
                    }
                }
            });
        }
    }
}
