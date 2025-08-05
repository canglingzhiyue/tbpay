package com.taobao.android.tcrash.utils;

import android.app.Application;
import android.os.Build;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbuprofen.adapter.TBHeapDumper;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.adapter.a;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.tao.log.statistics.UploadFileType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ihq;
import tb.jdy;
import tb.jfj;
import tb.jgd;
import tb.jgr;
import tb.olf;
import tb.olg;

/* loaded from: classes6.dex */
public class HprofDumpUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean b = false;
    private static String c = "heapDump";

    public static void a(jdy jdyVar) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2fcff9", new Object[]{jdyVar});
            return;
        }
        File file = new File(new jgd(jdyVar.a(), jdyVar.c()).a(), c);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            if (file2.length() <= 104857600) {
                if (file2.getName().endsWith(".zst") || file2.getName().endsWith(".strip") || file2.getName().endsWith(".part")) {
                    arrayList.add(file2.getAbsolutePath());
                } else {
                    file2.delete();
                }
            } else {
                file2.delete();
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        olg.a(arrayList, "USER_UPLOAD", "taobao_hprof_upload", new HashMap(), new olf() { // from class: com.taobao.android.tcrash.utils.HprofDumpUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.olf
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    return;
                }
                jfj.b("TBHeapDumper", "Upload file failed. errcode , errmsg ", str2, str3);
                File file3 = new File(str);
                if (!file3.exists()) {
                    return;
                }
                file3.delete();
            }

            @Override // tb.olf
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                jfj.b("TBHeapDumper", "Upload file succ", str);
                File file3 = new File(str);
                if (file3.exists()) {
                    file3.delete();
                }
                olg.a("ERROR", "MEM_EXHAUST", new HashMap(), new olf() { // from class: com.taobao.android.tcrash.utils.HprofDumpUtils.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.olf
                    public void a(String str3, String str4, String str5) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("929ad046", new Object[]{this, str3, str4, str5});
                        } else {
                            jfj.b("TBHeapDumper", "Upload tlog file failed.");
                        }
                    }

                    @Override // tb.olf
                    public void a(String str3, String str4) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                        } else {
                            jfj.b("TBHeapDumper", "Upload tlog file successfully.");
                        }
                    }
                });
            }
        }, 7, UploadFileType.HEAP_DUMP);
    }

    public static void a(jdy jdyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f84d83", new Object[]{jdyVar, str});
        } else if (!jdyVar.c().equals(jdyVar.a().getPackageName()) || b || Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            synchronized (HprofDumpUtils.class) {
                if (b) {
                    return;
                }
                Application a2 = jdyVar.a();
                File file = new File(new jgd(a2, jdyVar.c()).a(), c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, jgr.b(a2) + "-" + jgr.a(a2) + "-" + str);
                if (ihq.a().b(DefaultPlugin.PLUGIN_LIB_NAME).g()) {
                    a aVar = new a();
                    aVar.b = jgr.b(a2);
                    aVar.f15455a = jgr.a(a2);
                    TBProfConfig.HeapDumpConfig heapDumpConfig = new TBProfConfig.HeapDumpConfig();
                    file2.delete();
                    int nativeForkDumpStripHprof = TBHeapDumper.nativeForkDumpStripHprof(file2.getAbsolutePath(), aVar.b, heapDumpConfig.hprofTimeout, heapDumpConfig.zipLevel, heapDumpConfig.splitSize, 2, String.format("%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s@%s", com.taobao.android.tbuprofen.common.a.a(a2, "appkey"), a2.getPackageName(), aVar.b, aVar.f15455a, false, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.BRAND, Build.MODEL, Build.FINGERPRINT, true, com.taobao.android.tbuprofen.common.a.a(a2, "build_id"), com.taobao.android.tbuprofen.common.a.a(a2, "package_type"), com.taobao.android.tbuprofen.common.a.a(a2, "publish_type"), UTDevice.getUtdid(a2)));
                    if (nativeForkDumpStripHprof == 0) {
                        b = true;
                        jfj.b("dump succ", new Object[0]);
                    } else {
                        jfj.b("dump fail", Integer.valueOf(nativeForkDumpStripHprof));
                    }
                }
            }
        }
    }
}
