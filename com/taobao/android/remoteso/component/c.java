package com.taobao.android.remoteso.component;

import android.content.Context;
import android.os.Build;
import com.alibaba.android.split.core.splitinstall.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.bgy;
import tb.bhw;
import tb.ihp;
import tb.ikq;
import tb.ikw;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.android.split.core.splitinstall.g f14788a = com.taobao.appbundle.c.Companion.a().c();
    private final Map<Integer, a> b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a extends com.alibaba.android.split.core.tasks.d, com.alibaba.android.split.core.tasks.e<Integer> {
        void a(int i);
    }

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4c0a60f7", new Object[]{cVar}) : cVar.b;
    }

    public c() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.android.split.core.splitinstall.g gVar = this.f14788a;
        if (gVar == null) {
            RSoLog.c("remo,FlexaOperator-init(), manager == null");
        } else {
            gVar.a(new com.alibaba.android.split.core.splitinstall.o() { // from class: com.taobao.android.remoteso.component.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.listener.b
                public /* synthetic */ void onStateUpdate(com.alibaba.android.split.core.splitinstall.m mVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                    } else {
                        a(mVar);
                    }
                }

                public void a(com.alibaba.android.split.core.splitinstall.m mVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("398f1780", new Object[]{this, mVar});
                        return;
                    }
                    int a2 = mVar.a();
                    a aVar = (a) c.a(c.this).get(Integer.valueOf(a2));
                    if (aVar == null) {
                        return;
                    }
                    try {
                        int b = mVar.b();
                        if (b == 2) {
                            aVar.a((int) mVar.e());
                        } else if (b == 3) {
                        } else {
                            if (b == 5) {
                                c.a(c.this).remove(Integer.valueOf(a2));
                                aVar.onSuccess(Integer.valueOf(a2));
                            } else if (b != 6 && b != 7) {
                                if (b == 13) {
                                }
                            } else {
                                c.a(c.this).remove(Integer.valueOf(a2));
                                aVar.onFailure(new RuntimeException("code[" + mVar.d() + "], type=" + mVar.c()));
                            }
                        }
                    } catch (Throwable th) {
                        ikq.a("remo,FlexaOperator, state listener ", th);
                    }
                }
            });
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        com.alibaba.android.split.core.splitinstall.g gVar = this.f14788a;
        if (gVar == null) {
            RSoLog.c("remo,FlexaOperator-retrieveState(), manager == null" + str);
            return "null_manager";
        } else if (!gVar.a().contains(str)) {
            return a(LauncherRuntime.h, str) ? "remote" : "local";
        } else {
            RSoLog.c("remo,FlexaOperator, check(), request module installed =" + str);
            return "loaded";
        }
    }

    private boolean a(Context context, String str) {
        boolean exists;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        try {
            exists = com.alibaba.android.split.k.a().b().c(str).exists();
            String str2 = com.android.tools.bundleInfo.b.a().c(str).matchedAppVersion;
            if (!ikw.b((CharSequence) str2) || !new bgy(context, true, str2, false).c(str).exists()) {
                z = false;
            }
        } catch (Throwable th) {
            ikq.a("remo,FlexaOperator,shouldDownload", th);
        }
        return (exists || z || new bhw(LauncherRuntime.e).a(str)) ? false : false;
    }

    public List<String> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d4e0080c", new Object[]{this, jVar});
        }
        List<String> a2 = jVar.a("flexa");
        if (this.f14788a == null) {
            RSoLog.c("remo,FlexaOperator-check(), manager == null" + jVar);
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : a2) {
                if (com.android.tools.bundleInfo.b.a().c(str) == null) {
                    RSoLog.c("remo,FlexaOperator,dynamicInfo == null, module=" + str);
                } else {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyList();
            }
        } catch (Throwable th) {
            ikq.a("remo,FlexaOperator peekNotInstalledModules error", th);
        }
        Set<String> a3 = this.f14788a.a();
        if (a3.containsAll(arrayList)) {
            RSoLog.c("remo,FlexaOperator, check(), all request module installed =" + a2);
            return Collections.emptyList();
        }
        arrayList.removeAll(a3);
        if (ihp.by_().d().a("key_remo_flexa_load_disabled", false)) {
            RSoLog.c("remo,FlexaOperator, check, disable flexa load, failedModules=" + arrayList);
            return arrayList;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                RSoLog.c("remo,FlexaOperator, check(), trigger load for modules=" + arrayList);
                com.alibaba.android.split.k.a().a(jVar.h(), false, (String[]) arrayList.toArray(new String[0]));
            } catch (Throwable th2) {
                ikq.a("remo,FlexaOperator SplitCompatHolder error", th2);
            }
            Set<String> a4 = this.f14788a.a();
            if (a4.containsAll(arrayList)) {
                RSoLog.c("remo,FlexaOperator, check(), after load, all request module installed =" + a2);
                return Collections.emptyList();
            }
            arrayList.removeAll(a4);
        }
        RSoLog.c("remo,FlexaOperator, peekNotInstalledModules(), failedModules=" + arrayList);
        return arrayList;
    }

    public void a(final j jVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bc8392", new Object[]{this, jVar, aVar});
        } else if (this.f14788a == null) {
            RSoLog.c("remo,FlexaOperator-install(), manager == null" + jVar);
            aVar.onSuccess(999);
        } else {
            try {
                List<String> a2 = jVar.a("flexa");
                if (a2.isEmpty()) {
                    RSoLog.c("remo,FlexaOperator, installFlexa  skip, no flexa module need install");
                    return;
                }
                j.a a3 = com.alibaba.android.split.core.splitinstall.j.a();
                for (String str : a2) {
                    a3.a(str);
                }
                this.f14788a.a(a3.a()).a(new com.alibaba.android.split.core.tasks.e<Integer>() { // from class: com.taobao.android.remoteso.component.c.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.e
                    public /* synthetic */ void onSuccess(Integer num) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                        } else {
                            a(num);
                        }
                    }

                    public void a(Integer num) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                        } else if (num == null) {
                            ikq.a("FlexaOperator,install,integer==null", jVar.toString());
                        } else {
                            c.a(c.this).put(num, aVar);
                            RSoLog.c("remo,FlexaOperator, startInstall-onSuccess,  [" + num + "]  sessionMap=" + c.a(c.this));
                        }
                    }
                }).a(new com.alibaba.android.split.core.tasks.d() { // from class: com.taobao.android.remoteso.component.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.split.core.tasks.d
                    public void onFailure(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                            return;
                        }
                        RSoLog.c("remo,FlexaOperator, startInstall-onFailure, e = " + exc);
                        aVar.onFailure(exc);
                    }
                });
                RSoLog.c("remo,FlexaOperator, install(),  flexa = " + a2);
            } catch (Throwable th) {
                aVar.onFailure(new RuntimeException("startInstall,error", th));
            }
        }
    }

    public void b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c943267a", new Object[]{this, jVar});
        } else if (this.f14788a == null) {
            RSoLog.c("remo,FlexaOperator-cancel(), manager == null" + jVar);
        } else {
            RSoLog.c("remo,FlexaOperator, fake cacnel done, do not really cancel install");
        }
    }
}
