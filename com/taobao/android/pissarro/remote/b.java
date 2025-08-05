package com.taobao.android.pissarro.remote;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.alibaba.android.split.core.tasks.h;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.c;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import tb.bhs;
import tb.hho;
import tb.kge;
import tb.oyw;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14668a;
    private static boolean b;
    private static boolean c;
    private static boolean d;

    static {
        kge.a(780744300);
        f14668a = false;
        b = false;
        c = false;
        d = false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (c) {
            TLog.loge("TaopaiCheck", "is GG Loaded Init true");
            return true;
        } else if (com.android.tools.bundleInfo.b.a().c("litecreator") == null && com.android.tools.bundleInfo.b.a().c("umipublish") == null && com.android.tools.bundleInfo.b.a().c(c.TAOPAI_SDK_FEATURE) == null) {
            TLog.loge("TaopaiCheck", "GG DynamicFeature is null, is Init true");
            return true;
        } else {
            g c2 = c.Companion.a().c();
            if (!d && c2 != null) {
                d = true;
                ArrayList arrayList = new ArrayList();
                if (com.android.tools.bundleInfo.b.a().c("litecreator") != null) {
                    arrayList.add("litecreator");
                }
                if (com.android.tools.bundleInfo.b.a().c("umipublish") != null) {
                    arrayList.add("umipublish");
                }
                if (com.android.tools.bundleInfo.b.a().c("rxandroid") != null) {
                    arrayList.add("rxandroid");
                }
                arrayList.add(c.TAOPAI_SDK_FEATURE);
                h<Void> a2 = c2.a(arrayList);
                final long currentTimeMillis = System.currentTimeMillis();
                a.a(oyw.PRE_LOAD, "gg_start", "", 0L);
                a2.a(new e<Void>() { // from class: com.taobao.android.pissarro.remote.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.e
                    public /* synthetic */ void onSuccess(Void r4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, r4});
                        } else {
                            a(r4);
                        }
                    }

                    public void a(Void r5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6f8d528f", new Object[]{this, r5});
                        } else {
                            a.a(oyw.PRE_LOAD, "gg_success", "", System.currentTimeMillis() - currentTimeMillis);
                        }
                    }
                });
                a2.a(new d() { // from class: com.taobao.android.pissarro.remote.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.d
                    public void onFailure(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                        } else {
                            a.a(oyw.PRE_LOAD, "gg_fail", exc != null ? exc.getMessage() : "", System.currentTimeMillis() - currentTimeMillis);
                        }
                    }
                });
            }
            if (!d()) {
                TLog.loge("TaopaiCheck", "GG pixelAI dependency is not ready");
                return false;
            }
            if (c2 == null) {
                TLog.loge("TaopaiCheck", "GG AppBundle is null, is Init false");
            } else if (a(c2, "litecreator") && a(c2, "umipublish") && a(c2, "rxandroid") && a(c2, c.TAOPAI_SDK_FEATURE)) {
                TLog.loge("TaopaiCheck", " is GG Init success ,both litecreator and taopai_sdk");
                z = true;
            } else {
                TLog.loge("TaopaiCheck", " is GG Init error , not found lc and taopai_sdk module");
            }
            c = z;
            TLog.loge("TaopaiCheck", "is GG Init result = " + c);
            return z;
        }
    }

    private static boolean a(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("136b0194", new Object[]{gVar, str})).booleanValue();
        }
        if (com.android.tools.bundleInfo.b.a().c(str) != null) {
            return gVar.a().contains(str);
        }
        return true;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f14668a) {
            TLog.loge("TaopaiCheck", "is Loaded Init true");
            return true;
        } else if (com.android.tools.bundleInfo.b.a().c(c.TAOPAI_FEATURE) == null && com.android.tools.bundleInfo.b.a().c("rxandroid") == null && com.android.tools.bundleInfo.b.a().c(c.TAOPAI_SDK_FEATURE) == null) {
            TLog.loge("TaopaiCheck", " DynamicFeature is null, is Init true");
            return true;
        } else {
            g c2 = c.Companion.a().c();
            if (!d()) {
                TLog.loge("TaopaiCheck", " pixelAI dependency is not ready");
                return false;
            }
            if (c2 == null) {
                TLog.loge("TaopaiCheck", " AppBundle is null, is Init false");
            } else if (c2.a().contains(c.TAOPAI_FEATURE) && a(c2, "rxandroid") && c2.a().contains(c.TAOPAI_SDK_FEATURE)) {
                z = b();
                TLog.loge("TaopaiCheck", " is Init " + z);
            } else {
                TLog.loge("TaopaiCheck", " is Init error , not found taopai module");
            }
            f14668a = z;
            TLog.loge("TaopaiCheck", "is Init result = " + f14668a);
            return z;
        }
    }

    public static void a(Context context, TaopaiLoadConfig taopaiLoadConfig, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b952090f", new Object[]{context, taopaiLoadConfig, new Boolean(z), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" taopai try init");
        sb.append(taopaiLoadConfig != null ? taopaiLoadConfig.toString() : "");
        sb.append(" ");
        sb.append(z);
        TLog.loge("TaopaiCheck", sb.toString());
        if (z) {
            Intent intent = new Intent(context, RemoteLoadingActivity.class);
            intent.putExtra("taopai_load_config", taopaiLoadConfig);
            if (com.android.tools.bundleInfo.b.a().c(str) == null) {
                intent.putExtra("feature_name", c.TAOPAI_SDK_FEATURE);
            } else {
                intent.putExtra("feature_name", str);
            }
            if (taopaiLoadConfig.getSuccessIntent() != null) {
                intent.putExtra("orignal_intent", taopaiLoadConfig.getSuccessIntent());
            }
            if ((context instanceof Service) || (context instanceof Application)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return;
        }
        c.Companion.a().c().a(j.a().a(c.TAOPAI_SDK_FEATURE).a(str).a());
    }

    public static void a(Context context, TaopaiLoadConfig taopaiLoadConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6019685", new Object[]{context, taopaiLoadConfig, new Boolean(z)});
        } else {
            a(context, taopaiLoadConfig, z, c.TAOPAI_FEATURE);
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.taobao.taopai.business.workflow.WorkflowLauncherActivity");
            return true;
        } catch (ClassNotFoundException e) {
            a.a("classNotFound", Log.getStackTraceString(e));
            TLog.loge("TaopaiCheck", " taipai class not found , " + Log.getStackTraceString(e));
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : hho.a();
    }

    public static void a(Context context) {
        g c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (b) {
        } else {
            boolean a2 = a(context, c.TAOPAI_SDK_FEATURE);
            boolean a3 = a(context, "litecreator");
            boolean a4 = a(context, "rxandroid");
            if ((a2 && a3 && a4) || (c2 = c.Companion.a().c()) == null) {
                return;
            }
            b = true;
            ArrayList arrayList = new ArrayList();
            if (com.android.tools.bundleInfo.b.a().c("rxandroid") != null) {
                arrayList.add("rxandroid");
            }
            arrayList.add("litecreator");
            arrayList.add(c.TAOPAI_SDK_FEATURE);
            h<Void> a5 = c2.a(arrayList);
            final long currentTimeMillis = System.currentTimeMillis();
            a.a("gg_preload", "start", "", 0L);
            a5.a(new e<Void>() { // from class: com.taobao.android.pissarro.remote.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.e
                public /* synthetic */ void onSuccess(Void r4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, r4});
                    } else {
                        a(r4);
                    }
                }

                public void a(Void r5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f8d528f", new Object[]{this, r5});
                    } else {
                        a.a("gg_preload", "success", "", System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            });
            a5.a(new d() { // from class: com.taobao.android.pissarro.remote.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.d
                public void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    } else {
                        a.a("gg_preload", "fail", exc != null ? exc.getMessage() : "", System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            });
        }
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (com.android.tools.bundleInfo.b.a().c(str) == null) {
            return true;
        }
        try {
            z = k.a().a(context, false, str);
        } catch (Exception e) {
            TLog.loge("TaopaiCheck", "flexa load " + str + " error " + e.getMessage());
        }
        if (z) {
            return z;
        }
        bhs bhsVar = new bhs();
        boolean a2 = bhsVar.a(str);
        return a2 ? bhsVar.a(context, str, bhsVar.b(str)) : a2;
    }
}
