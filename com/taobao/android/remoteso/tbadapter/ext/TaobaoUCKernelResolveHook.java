package com.taobao.android.remoteso.tbadapter.ext;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ihp;
import tb.iii;
import tb.iik;
import tb.iim;
import tb.iiq;
import tb.iit;
import tb.iiu;
import tb.iiv;
import tb.ijd;
import tb.iju;
import tb.ijv;
import tb.ika;
import tb.iki;
import tb.ikj;
import tb.ikq;
import tb.iku;
import tb.ikw;

/* loaded from: classes6.dex */
public class TaobaoUCKernelResolveHook implements com.taobao.android.remoteso.resolver2.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iju f14848a;
    private final ijd b;
    private final ijv c;
    private final iik d;
    private final iiq e;
    private final iit f;
    private final com.taobao.android.remoteso.resolver2.d g;

    /* loaded from: classes6.dex */
    public static class UCAdvancedInfo {
        public SoIndexData.SoFileInfo baseInfo;
        public final List<UCInnerFileInfo> innerFileInfoList = new ArrayList();
    }

    /* loaded from: classes6.dex */
    public static class UCInnerFileInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SoIndexData.SoFileInfo newInfo;
        public SoIndexData.SoFileInfo oldInfo;
        public SoIndexData.SoFileInfo patchInfo;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "UCInnerFileInfo{oldInfo=" + this.oldInfo + ", newInfo=" + this.newInfo + ", patchInfo=" + this.patchInfo + '}';
        }
    }

    public static /* synthetic */ File a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, com.taobao.android.remoteso.resolver2.j jVar, UCAdvancedInfo uCAdvancedInfo) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("d6db68e5", new Object[]{taobaoUCKernelResolveHook, jVar, uCAdvancedInfo}) : taobaoUCKernelResolveHook.a(jVar, uCAdvancedInfo);
    }

    public static /* synthetic */ List a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, List list, File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d6f68f26", new Object[]{taobaoUCKernelResolveHook, list, file}) : taobaoUCKernelResolveHook.a(list, file);
    }

    public static /* synthetic */ ijv a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijv) ipChange.ipc$dispatch("52c9f978", new Object[]{taobaoUCKernelResolveHook}) : taobaoUCKernelResolveHook.c;
    }

    public static /* synthetic */ void a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993ae00a", new Object[]{taobaoUCKernelResolveHook, new Integer(i)});
        } else {
            taobaoUCKernelResolveHook.a(i);
        }
    }

    public static /* synthetic */ void a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, com.taobao.android.remoteso.resolver2.c cVar, com.taobao.android.remoteso.resolver2.j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7707c26c", new Object[]{taobaoUCKernelResolveHook, cVar, jVar, aVar});
        } else {
            taobaoUCKernelResolveHook.b(cVar, jVar, aVar);
        }
    }

    public static /* synthetic */ void a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20f8ba3", new Object[]{taobaoUCKernelResolveHook, str});
        } else {
            taobaoUCKernelResolveHook.a(str);
        }
    }

    public static /* synthetic */ void a(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook, List list, File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e59b4b8", new Object[]{taobaoUCKernelResolveHook, list, file, file2});
        } else {
            taobaoUCKernelResolveHook.a(list, file, file2);
        }
    }

    public static /* synthetic */ iik b(TaobaoUCKernelResolveHook taobaoUCKernelResolveHook) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iik) ipChange.ipc$dispatch("33434a63", new Object[]{taobaoUCKernelResolveHook}) : taobaoUCKernelResolveHook.d;
    }

    public TaobaoUCKernelResolveHook(iju ijuVar, ijd ijdVar, ijv ijvVar, iik iikVar, iiq iiqVar, iit iitVar, com.taobao.android.remoteso.resolver2.d dVar) {
        this.f14848a = ijuVar;
        this.b = ijdVar;
        this.c = ijvVar;
        this.d = iikVar;
        this.e = iiqVar;
        this.f = iitVar;
        this.g = dVar;
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public com.taobao.android.remoteso.resolver2.k a(com.taobao.android.remoteso.resolver2.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.resolver2.k) ipChange.ipc$dispatch("4c517c4f", new Object[]{this, jVar});
        }
        if (!ikw.a((CharSequence) "kernelu4_7z_uc", (CharSequence) jVar.a())) {
            return this.g.a(jVar);
        }
        com.taobao.android.remoteso.resolver2.k b2 = b(jVar);
        try {
            return a(jVar, b2);
        } catch (Throwable th) {
            ikq.a("TBUCResolveHook, peek-filter", th);
            return b2;
        }
    }

    private com.taobao.android.remoteso.resolver2.k a(com.taobao.android.remoteso.resolver2.j jVar, com.taobao.android.remoteso.resolver2.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.resolver2.k) ipChange.ipc$dispatch("37c9684a", new Object[]{this, jVar, kVar});
        }
        if (!this.b.a("key_enable_uc_dir_force_filter", false)) {
            RSoLog.c("TBUCResolveHook, filterUCDirResult(), enableUcDirForceFilter = false");
            return kVar;
        } else if (!kVar.i()) {
            RSoLog.c("TBUCResolveHook, filterUCDirResult(), result failed");
            return kVar;
        } else {
            File file = new File(kVar.h());
            if (!file.isDirectory()) {
                RSoLog.c("TBUCResolveHook, filterUCDirResult(), result is not dir");
                return kVar;
            } else if (!iki.a(this.f14848a.a(), (int) TimeUnit.HOURS.toSeconds(2L))) {
                RSoLog.c("TBUCResolveHook, filterUCDirResult(), isAtCrashRisk = false");
                return kVar;
            } else {
                SoInfo2 f = jVar.f();
                if (f == null) {
                    RSoLog.c("TBUCResolveHook, filterUCDirResult(), soInfo2 not available");
                    return kVar;
                }
                UCAdvancedInfo uCAdvancedInfo = (UCAdvancedInfo) JSON.parseObject(f.advancedInfo, UCAdvancedInfo.class);
                if (uCAdvancedInfo != null) {
                    return a(file, uCAdvancedInfo.innerFileInfoList, new iiu<UCInnerFileInfo, SoIndexData.SoFileInfo>() { // from class: com.taobao.android.remoteso.tbadapter.ext.TaobaoUCKernelResolveHook.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.iiu
                        public SoIndexData.SoFileInfo a(UCInnerFileInfo uCInnerFileInfo) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (SoIndexData.SoFileInfo) ipChange2.ipc$dispatch("63e4f019", new Object[]{this, uCInnerFileInfo});
                            }
                            SoIndexData.SoFileInfo soFileInfo = uCInnerFileInfo.newInfo;
                            if (soFileInfo != null) {
                                return soFileInfo;
                            }
                            throw new RuntimeException("not allow newInfo == null, " + uCInnerFileInfo);
                        }
                    }) ? kVar : com.taobao.android.remoteso.resolver2.l.a(jVar, RSoException.error(6209), "resolve-hook");
                }
                RSoLog.c("TBUCResolveHook, filterUCDirResult(), ucAdvancedInfo not available");
                return kVar;
            }
        }
    }

    private com.taobao.android.remoteso.resolver2.k b(com.taobao.android.remoteso.resolver2.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.resolver2.k) ipChange.ipc$dispatch("91f2beee", new Object[]{this, jVar});
        }
        com.taobao.android.remoteso.resolver2.k a2 = this.g.a(jVar);
        if (a2.i()) {
            RSoLog.c("TBUCResolveHook, peek kernel from lib, peek=" + a2);
            return a2;
        }
        String a3 = this.c.a(jVar.e().provideStorageKey());
        if (ikw.a((CharSequence) a3)) {
            RSoLog.c("TBUCResolveHook, peek kernel failed, lib dir path is empty, req=" + jVar);
            return com.taobao.android.remoteso.resolver2.l.a(jVar, RSoException.error(6005, "libDirPath is empty"), "resolve-hook");
        }
        File file = new File(a3);
        File file2 = new File(file, "uc_dir");
        if (!file.isDirectory() || !file2.isDirectory()) {
            RSoLog.c("TBUCResolveHook, peek kernel failed, libDir or ucDir is not directory, req=" + jVar);
            return com.taobao.android.remoteso.resolver2.l.a(jVar, RSoException.error(6005, "libDir or ucDir not available"), "resolve-hook");
        } else if (!new File(file2, ".validated").isFile()) {
            RSoLog.c("TBUCResolveHook, peek kernel failed, validatedTag is not file, req=" + jVar);
            return com.taobao.android.remoteso.resolver2.l.a(jVar, RSoException.error(6005, "validatedTag is not file"), "resolve-hook");
        } else {
            RSoLog.c("TBUCResolveHook, peek kernel success, ucDir=" + file2);
            return com.taobao.android.remoteso.resolver2.l.a(jVar, file2.getPath(), "resolve-hook");
        }
    }

    @Override // com.taobao.android.remoteso.resolver2.d
    public void a(final com.taobao.android.remoteso.resolver2.c cVar, final com.taobao.android.remoteso.resolver2.j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9ed67d", new Object[]{this, cVar, jVar, aVar});
        } else if (!ikw.a((CharSequence) "kernelu4_7z_uc", (CharSequence) jVar.a())) {
            this.g.a(cVar, jVar, aVar);
        } else if (!this.b.a("key_diff_patch_for_uc_enabled", true)) {
            RSoLog.c("TBUCResolveHook, config key_diff_patch_for_uc_enabled=false, doNormalResolve");
            this.g.a(cVar, jVar, aVar);
        } else {
            ika.a(new Runnable() { // from class: com.taobao.android.remoteso.tbadapter.ext.TaobaoUCKernelResolveHook.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RSoLog.c("TBUCResolveHook, real resolve enter, req = " + jVar.a());
                    try {
                        TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, "stageStart");
                        SoInfo2 f = jVar.f();
                        if (f == null) {
                            RSoLog.c("TBUCResolveHook, soInfo2 not available, doNormalResolve");
                            TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, cVar, jVar, aVar);
                            return;
                        }
                        final UCAdvancedInfo uCAdvancedInfo = (UCAdvancedInfo) JSON.parseObject(f.advancedInfo, UCAdvancedInfo.class);
                        if (uCAdvancedInfo == null) {
                            RSoLog.c("TBUCResolveHook, ucAdvancedInfo not available, doNormalResolve");
                            TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, cVar, jVar, aVar);
                            return;
                        }
                        TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, "stageInfoEnd");
                        jVar.h().a("stage1");
                        final File a2 = TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, jVar, uCAdvancedInfo);
                        if (a2 == null) {
                            RSoLog.c("TBUCResolveHook, oldUCDir not available, doNormalResolve");
                            TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, cVar, jVar, aVar);
                            return;
                        }
                        jVar.h().a("stage1_end", "stage1");
                        TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, "stageOldDirEnd");
                        final File file = new File(TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this).a(jVar.e().provideStorageKey()), "uc_dir");
                        iku.b(file);
                        iku.h(file);
                        TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, "stageNewDirEnd");
                        List<iim> a3 = TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, uCAdvancedInfo.innerFileInfoList, file);
                        b bVar = new b(new iiv<Boolean, Void>() { // from class: com.taobao.android.remoteso.tbadapter.ext.TaobaoUCKernelResolveHook.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.iiv
                            public Void a(Boolean bool) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (Void) ipChange3.ipc$dispatch("45fa3078", new Object[]{this, bool});
                                }
                                if (!bool.booleanValue()) {
                                    ikq.a("TBUCResolveHook, downloadFailed", "");
                                    TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, cVar, jVar, aVar);
                                    return null;
                                }
                                jVar.h().a("stage2_end", "stage2");
                                TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, "stageDownloadEnd");
                                try {
                                    jVar.h().a("stage3");
                                    TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, 99);
                                    TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, uCAdvancedInfo.innerFileInfoList, a2, file);
                                    jVar.h().a("stage3_end", "stage3");
                                    TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, 100);
                                    TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, "stagePatchEnd");
                                    aVar.a(com.taobao.android.remoteso.resolver2.l.a(jVar, file.getPath(), "resolve-hook"));
                                } catch (Throwable th) {
                                    ikq.a("TBUCResolveHook, patchAndVerify", th);
                                    TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, cVar, jVar, aVar);
                                }
                                return null;
                            }
                        }, new a());
                        b.a(bVar).set(a3.size());
                        for (iim iimVar : a3) {
                            iimVar.a(bVar);
                            TaobaoUCKernelResolveHook.b(TaobaoUCKernelResolveHook.this).a(iimVar);
                        }
                        jVar.h().a("stage2");
                        RSoLog.c("TBUCResolveHook, diffPatch task scheduled,  task count=" + a3.size());
                    } catch (Throwable th) {
                        ikq.a("TBUCResolveHook, tryDiffPatch", th);
                        TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, cVar, jVar, aVar);
                    }
                }
            });
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count_type", str);
        ikq.a("custom_count", hashMap);
    }

    private void a(List<UCInnerFileInfo> list, File file, File file2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2148d087", new Object[]{this, list, file, file2});
            return;
        }
        RSoLog.c("TBUCResolveHook, doPatchAndVerify(), enter");
        for (UCInnerFileInfo uCInnerFileInfo : list) {
            RSoLog.c("TBUCResolveHook, doPatchAndVerify(), handle ucInnerFileInfo, " + uCInnerFileInfo);
            SoIndexData.SoFileInfo soFileInfo = uCInnerFileInfo.newInfo;
            File file3 = new File(file2, soFileInfo.getUri());
            if (file3.exists()) {
                RSoLog.c("TBUCResolveHook, doPatchAndVerify(), newFile exists, " + file3);
            } else {
                SoIndexData.SoFileInfo soFileInfo2 = uCInnerFileInfo.oldInfo;
                if (soFileInfo2 == null) {
                    throw new RuntimeException("doPatchAndVerify, oldInfo==null, ucInnerFileInfo=" + uCInnerFileInfo);
                }
                File file4 = new File(file, soFileInfo2.getUri());
                if (!file4.exists()) {
                    throw new RuntimeException("doPatchAndVerify, oldFile not exists, oldFile=" + file4);
                } else if (ikw.a((CharSequence) soFileInfo.getMd5(), (CharSequence) soFileInfo2.getMd5())) {
                    iku.a(file4, file3);
                    RSoLog.c("TBUCResolveHook, doPatchAndVerify(), newFile copy succ, " + file3);
                } else {
                    SoIndexData.SoFileInfo soFileInfo3 = uCInnerFileInfo.patchInfo;
                    if (soFileInfo3 == null) {
                        throw new RuntimeException("doPatchAndVerify, patchInfo==null, ucInnerFileInfo=" + uCInnerFileInfo);
                    }
                    File file5 = new File(file2, soFileInfo3.getUri());
                    if (!file5.exists()) {
                        throw new RuntimeException("doPatchAndVerify, patchFile not exists, patchFile=" + file5);
                    }
                    iit.a a2 = this.f.a(this.f14848a.a(), file4, file5, file3);
                    if (!a2.f29060a) {
                        throw new RuntimeException("doPatchAndVerify, apply patch failed, errorCode=" + a2.b);
                    }
                    RSoLog.c("TBUCResolveHook, doPatchAndVerify(), newFile patch succ, " + file3);
                }
            }
        }
        if (!a(file2, list, new iiu<UCInnerFileInfo, SoIndexData.SoFileInfo>() { // from class: com.taobao.android.remoteso.tbadapter.ext.TaobaoUCKernelResolveHook.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiu
            public SoIndexData.SoFileInfo a(UCInnerFileInfo uCInnerFileInfo2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (SoIndexData.SoFileInfo) ipChange2.ipc$dispatch("63e4f019", new Object[]{this, uCInnerFileInfo2});
                }
                SoIndexData.SoFileInfo soFileInfo4 = uCInnerFileInfo2.newInfo;
                if (soFileInfo4 != null) {
                    return soFileInfo4;
                }
                throw new RuntimeException("not allow newInfo == null, " + uCInnerFileInfo2);
            }
        })) {
            throw new RuntimeException("doPatchAndVerify, verified failed, newUCDir=" + iku.a(file2, false));
        }
        File file6 = new File(file2, ".validated");
        try {
            if (file6.createNewFile()) {
                return;
            }
            ikq.a("TBUCResolveHook", file6.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void b(com.taobao.android.remoteso.resolver2.c cVar, com.taobao.android.remoteso.resolver2.j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bde69c", new Object[]{this, cVar, jVar, aVar});
            return;
        }
        RSoLog.c("TBUCResolveHook, doNormalResolve, " + jVar);
        this.g.a(cVar, jVar, aVar);
    }

    private File a(com.taobao.android.remoteso.resolver2.j jVar, UCAdvancedInfo uCAdvancedInfo) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("df1f3874", new Object[]{this, jVar, uCAdvancedInfo});
        }
        RSoLog.c("TBUCResolveHook, prepareOldUCDir(), enter, " + jVar.a());
        com.taobao.android.remoteso.resolver2.k b2 = b(com.taobao.android.remoteso.resolver2.j.a(jVar.a(), uCAdvancedInfo.baseInfo, jVar.f()));
        if (!b2.i()) {
            RSoLog.c("TBUCResolveHook, prepareOldUCDir(), skip, baseResult failed , result=" + b2);
            return null;
        }
        iiu<UCInnerFileInfo, SoIndexData.SoFileInfo> iiuVar = new iiu<UCInnerFileInfo, SoIndexData.SoFileInfo>() { // from class: com.taobao.android.remoteso.tbadapter.ext.TaobaoUCKernelResolveHook.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iiu
            public SoIndexData.SoFileInfo a(UCInnerFileInfo uCInnerFileInfo) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SoIndexData.SoFileInfo) ipChange2.ipc$dispatch("63e4f019", new Object[]{this, uCInnerFileInfo}) : uCInnerFileInfo.oldInfo;
            }
        };
        List<UCInnerFileInfo> list = uCAdvancedInfo.innerFileInfoList;
        String h = b2.h();
        RSoLog.c("TBUCResolveHook, prepareOldUCDir(), ready to verify oldDir, , list=" + list + ", oldUCPath=" + h);
        File file = new File(h);
        if (file.isFile()) {
            File file2 = new File(file.getParentFile(), "uc_dir");
            if (a(file2, list, iiuVar)) {
                RSoLog.c("TBUCResolveHook, prepareOldUCDir(), verified origin oldUCDir succ, " + iku.a(file2, false));
                return file2;
            }
            RSoLog.c("TBUCResolveHook, prepareOldUCDir(), verified origin oldUCDir failed, ready to extract old lib " + h);
            this.e.a(this.f14848a.a(), h, file2.getPath(), false);
            if (a(file2, list, iiuVar)) {
                return file2;
            }
            RSoLog.c("TBUCResolveHook, prepareOldUCDir(), verified extracted oldUCDir failed, " + iku.a(file2, false));
            return null;
        } else if (!file.isDirectory()) {
            return null;
        } else {
            if (a(file, list, iiuVar)) {
                return file;
            }
            RSoLog.c("TBUCResolveHook, prepareOldUCDir(), verified dir oldUCFile failed, " + iku.a(file, false));
            return null;
        }
    }

    private List<iim> a(List<UCInnerFileInfo> list, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a1eaed37", new Object[]{this, list, file});
        }
        ArrayList arrayList = new ArrayList();
        for (UCInnerFileInfo uCInnerFileInfo : list) {
            a(file, uCInnerFileInfo.newInfo, arrayList);
            a(file, uCInnerFileInfo.patchInfo, arrayList);
        }
        RSoLog.c("TBUCResolveHook, buildRequests done,  " + arrayList);
        return arrayList;
    }

    private void a(File file, SoIndexData.SoFileInfo soFileInfo, List<iim> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b577701e", new Object[]{this, file, soFileInfo, list});
        } else if (soFileInfo == null || ikw.a((CharSequence) soFileInfo.getFrom())) {
        } else {
            String from = soFileInfo.getFrom();
            String path = file.getPath();
            String uri = soFileInfo.getUri();
            list.add(new iim("_", from, path, uri, file.getPath() + soFileInfo.getUri(), soFileInfo.getMd5(), soFileInfo.getLength()));
        }
    }

    private boolean a(File file, List<UCInnerFileInfo> list, iiu<UCInnerFileInfo, SoIndexData.SoFileInfo> iiuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f33ed5cf", new Object[]{this, file, list, iiuVar})).booleanValue();
        }
        RSoLog.c("TBUCResolveHook, verifyInnerFiles, enter, ucDir=" + file);
        if (!file.isDirectory()) {
            RSoLog.c("TBUCResolveHook, verifyInnerFiles, ucDir is not dir, ucDir=" + file);
            return false;
        }
        for (UCInnerFileInfo uCInnerFileInfo : list) {
            SoIndexData.SoFileInfo a2 = iiuVar.a(uCInnerFileInfo);
            if (a2 == null) {
                RSoLog.c("TBUCResolveHook, oldInfo = null, file=" + uCInnerFileInfo);
            } else {
                File file2 = new File(file, a2.getUri());
                if (!(file2.isFile() && file2.length() == a2.getLength() && ikj.a(a2.getMd5(), file2.getPath()))) {
                    RSoLog.c("TBUCResolveHook, fileVerifySucc = false, file=" + file2);
                    return false;
                }
                RSoLog.c("TBUCResolveHook, verified, file=" + file2);
            }
        }
        RSoLog.c("TBUCResolveHook, verifyInnerFiles, all success, ucDir=" + file);
        return true;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RSoLog.c("TBUCResolveHook,  final updateProgress = " + i);
        ihp.by_().c().a("kernelu4_7z_uc", i);
    }

    /* loaded from: classes6.dex */
    public static class b extends iii {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final iiv<Boolean, Void> b;
        private final iiv<Integer, Void> c;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f14855a = new AtomicInteger();
        private final Map<String, Integer> d = new ConcurrentHashMap();
        private volatile boolean e = true;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1145182134) {
                super.a((iim) objArr[0], (RSoException) objArr[1]);
                return null;
            } else if (hashCode != -909932552) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((iim) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public static /* synthetic */ AtomicInteger a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("7030185", new Object[]{bVar}) : bVar.f14855a;
        }

        public b(iiv<Boolean, Void> iivVar, iiv<Integer, Void> iivVar2) {
            this.b = iivVar;
            this.c = iivVar2;
        }

        @Override // tb.iii, tb.iij
        public void a(iim iimVar, int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9c387f8", new Object[]{this, iimVar, new Integer(i)});
                return;
            }
            super.a(iimVar, i);
            this.d.put(iimVar.b(), Integer.valueOf(i));
            Collection<Integer> values = this.d.values();
            int size = values.size();
            for (Integer num : values) {
                i2 += num.intValue() / size;
            }
            this.c.a(Integer.valueOf(i2));
        }

        @Override // tb.iii, tb.iij
        public void a(iim iimVar, RSoException rSoException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbbde84a", new Object[]{this, iimVar, rSoException});
                return;
            }
            super.a(iimVar, rSoException);
            if (rSoException != null) {
                this.e = false;
            }
            if (this.f14855a.decrementAndGet() > 0) {
                return;
            }
            this.b.a(Boolean.valueOf(this.e));
        }
    }

    /* loaded from: classes6.dex */
    public class a implements iiv<Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile int b;

        private a() {
            this.b = -1;
        }

        @Override // tb.iiv
        public Void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("9afd6c0e", new Object[]{this, num});
            }
            if (num.intValue() <= this.b || num.intValue() > 98) {
                return null;
            }
            this.b = num.intValue();
            TaobaoUCKernelResolveHook.a(TaobaoUCKernelResolveHook.this, num.intValue());
            return null;
        }
    }
}
