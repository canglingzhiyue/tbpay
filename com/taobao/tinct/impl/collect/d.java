package com.taobao.tinct.impl.collect;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import com.taobao.update.result.BundleUpdateStep;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import tb.rfn;
import tb.rfx;
import tb.rfy;
import tb.rfz;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f22951a = false;

    public static /* synthetic */ void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
        } else {
            b(str, str2, z);
        }
    }

    public static void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92c5d7b", new Object[]{context, bVar});
        } else if (f22951a) {
        } else {
            f22951a = true;
            a(context);
            b(context, bVar);
        }
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (!com.taobao.tinct.impl.config.a.b()) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.orange.monitor.DATA");
            intentFilter.setPriority(Integer.MAX_VALUE);
            context.registerReceiver(new MonitorLauncher$1(), intentFilter);
            ConfigCenter.getInstance().addGlobalListener(new com.taobao.orange.d() { // from class: com.taobao.tinct.impl.collect.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    try {
                        String str2 = map.get("configVersion");
                        String.format("The orange %s is fully update to %s. isCache: %s", str, str2, map.get("fromCache"));
                        d.a(str, str2, false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MonitorLauncher", "Failed to register orange monitor done!");
        }
    }

    private static void b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552009f7", new Object[]{str, str2, new Boolean(z)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            b.a().a(OrangeChangeInfo.builder(str, str2).setGray(z));
        }
    }

    private static void b(final Context context, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcbbe1bc", new Object[]{context, bVar});
            return;
        }
        final ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: com.taobao.tinct.impl.collect.-$$Lambda$d$e4y_WWITn-n8Hxounqa5znU3_WY
            @Override // java.lang.Runnable
            public final void run() {
                d.a(context, bVar, newSingleThreadScheduledExecutor);
            }
        }, 10L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, b bVar, ScheduledExecutorService scheduledExecutorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672fcd9", new Object[]{context, bVar, scheduledExecutorService});
            return;
        }
        try {
            b(context);
            c(context);
            if (bVar != null) {
                bVar.b();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("MonitorLauncher", "Register patch monitor exception:" + e.getMessage());
        } finally {
            scheduledExecutorService.shutdown();
        }
    }

    private static void b(final Context context) {
        rfz rfzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (!com.taobao.tinct.impl.config.a.d() || (rfzVar = rfy.listenerMap.get(rfx.HOTPATCH)) == null) {
        } else {
            rfzVar.patchProcessListener(new rfz.a() { // from class: com.taobao.tinct.impl.collect.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rfz.a
                public void hasPatched(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // tb.rfz.a
                public void patchStart() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77e91881", new Object[]{this});
                    }
                }

                @Override // tb.rfz.a
                public void patching(BundleUpdateStep bundleUpdateStep) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
                    }
                }

                @Override // tb.rfz.a
                public void patchFailed(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("839bcb76", new Object[]{this, str});
                        return;
                    }
                    Log.e("MonitorLauncher", "The hotpatch update failed： " + str);
                }

                @Override // tb.rfz.a
                public void patchSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("890915a2", new Object[]{this});
                        return;
                    }
                    try {
                        String patchVersion = InstantPatchChangeInfo.getPatchVersion(context);
                        String patchType = InstantPatchChangeInfo.getPatchType(context);
                        if (TextUtils.isEmpty(patchVersion)) {
                            return;
                        }
                        InstantPatchChangeInfo instantPatchChangeInfo = new InstantPatchChangeInfo(patchVersion, patchType);
                        b.a().a(instantPatchChangeInfo);
                        e.a(instantPatchChangeInfo, e.UPLOAD_TYPE_EFFECT);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (!com.taobao.tinct.impl.config.a.e()) {
        } else {
            rfn.sharedInstance().registerCPPInlinePatchListener(new rfn.a() { // from class: com.taobao.tinct.impl.collect.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rfn.a
                public void onPatchFailure(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e61a71a2", new Object[]{this, str, new Boolean(z)});
                    }
                }

                @Override // tb.rfn.a
                public void onPatchSuccess(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("af0e2b09", new Object[]{this, str, new Boolean(z)});
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        com.taobao.tinct.model.b bVar = new com.taobao.tinct.model.b(str, z);
                        b.a().a(bVar);
                        e.a(bVar, e.UPLOAD_TYPE_EFFECT);
                    }
                }
            });
        }
    }
}
