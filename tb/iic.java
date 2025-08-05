package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.c;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class iic implements ijy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f29038a;
    private final c b;
    private final ijv c;
    private final iju d;
    private final ijr e;
    private final iib f;

    public static /* synthetic */ void a(iic iicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb76cb5", new Object[]{iicVar});
        } else {
            iicVar.f();
        }
    }

    public static /* synthetic */ void b(iic iicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3a7336", new Object[]{iicVar});
        } else {
            iicVar.c();
        }
    }

    public static /* synthetic */ void c(iic iicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabd79b7", new Object[]{iicVar});
        } else {
            iicVar.b();
        }
    }

    public static /* synthetic */ iju d(iic iicVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iju) ipChange.ipc$dispatch("41fafe5a", new Object[]{iicVar}) : iicVar.d;
    }

    public iic(ijd ijdVar, c cVar, ijv ijvVar, iju ijuVar, ijr ijrVar, iib iibVar) {
        this.f29038a = ijdVar;
        this.b = cVar;
        this.c = ijvVar;
        this.d = ijuVar;
        this.e = ijrVar;
        this.f = iibVar;
    }

    @Override // tb.ijy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RSoLog.c("RSoCleaner, triggerCleaner(), enter ");
        ika.a(new Runnable() { // from class: tb.iic.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    iic.a(iic.this);
                }
            }
        });
        ika.a(new Runnable() { // from class: tb.iic.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    iic.b(iic.this);
                } catch (Throwable th) {
                    ikq.a("RSoCleaner,cleanExpiredLib", th);
                }
                try {
                    iic.c(iic.this);
                } catch (Throwable th2) {
                    ikq.a("RSoCleaner,checkDamagedLib", th2);
                }
                ikq.a("RSoCleaner,removeExpiredRuntimeDir", new Runnable() { // from class: tb.iic.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!iic.d(iic.this).d()) {
                            RSoLog.c("RSoCleaner, skip removeExpiredRuntimeDir in other process");
                        } else {
                            ijw.a(iic.d(iic.this).a());
                        }
                    }
                });
            }
        }, TimeUnit.SECONDS.toMillis(30L));
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RSoLog.c("RSoCleaner, checkDamagedLib(),    enter ");
        if (!this.f29038a.a("key_switch_check_damaged_lib_enabled", true)) {
            RSoLog.c("RSoCleaner, checkDamagedLib(), skipped: enabled == false");
            return;
        }
        List<File> c = this.c.c();
        RSoLog.c("RSoCleaner, checkDamagedLib(), existingLibDir=" + c);
        ArrayList arrayList = new ArrayList();
        for (File file : c) {
            String name = file.getName();
            if (!iib.c(name)) {
                if (iib.b(name)) {
                    ikq.a("RSoCleaner, checkDamagedLib, name not as Md5, error", file.getPath());
                }
            } else {
                arrayList.clear();
                iku.a(file, arrayList);
                if (a(arrayList, name)) {
                    iky.a(file);
                    RSoLog.c("RSoCleaner, checkDamagedLib(), will delete damaged libDir=" + file.getPath());
                }
            }
        }
        RSoLog.c("RSoCleaner, checkDamagedLib(), finish");
    }

    private boolean a(List<File> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{this, list, str})).booleanValue();
        }
        if (list.size() == 0) {
            return false;
        }
        for (File file : list) {
            if (file.getName().endsWith(bgy.SO_EXTENSION) && !this.d.a(str, file.getPath())) {
                ikq.a("RSoCleaner,damagedLib", "path=" + file.getPath() + ", size=" + file.length());
                return true;
            }
        }
        return false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        RSoLog.c("RSoCleaner, cleanExpiredLib(),    enter ");
        if (!this.f29038a.a("key_cleaner_enabled3", true)) {
            RSoLog.b("RSoCleaner, cleanExpiredLib(), skipped: cleanerEnabled == false");
            return;
        }
        List<File> c = this.c.c();
        RSoLog.c("RSoCleaner, cleanExpiredLib(), existingLibDir.size=" + c.size());
        Iterator<File> it = c.iterator();
        while (it.hasNext()) {
            RSoLog.c("RSoCleaner, cleanExpiredLib(), existingLibDir=" + it.next().getName());
        }
        Set<String> d = d();
        RSoLog.c("RSoCleaner, cleanExpiredLib(), libUsefulStorageKeys.size=" + d.size());
        Iterator<String> it2 = d.iterator();
        while (it2.hasNext()) {
            RSoLog.c("RSoCleaner, cleanExpiredLib(), libUsefulStorageKey=" + it2.next());
        }
        if (d.size() > 1 && d.size() < 5) {
            ikq.a("RSoCleaner, cleanExpiredLib(), libUsefulStorageKeys not available", d.toString());
            return;
        }
        List<String> e = e();
        RSoLog.c("RSoCleaner, cleanExpiredLib(), usefulLastCacheKeys=" + e);
        String f = this.b.f();
        RSoLog.c("RSoCleaner, cleanExpiredLib(), advancedContent=" + f);
        List<String> a2 = this.f.a();
        for (File file : c) {
            a(file, e, d, f, a2);
        }
        RSoLog.c("RSoCleaner, cleanExpiredLib(), finish ");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.io.File r4, java.util.List<java.lang.String> r5, java.util.Set<java.lang.String> r6, java.lang.String r7, java.util.List<java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iic.a(java.io.File, java.util.List, java.util.Set, java.lang.String, java.util.List):void");
    }

    private Set<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("916979a", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        try {
            Collection<SoIndexData.SoFileInfo> e = this.b.e();
            for (SoIndexData.SoFileInfo soFileInfo : e) {
                if (soFileInfo == null) {
                    RSoLog.c("RSoCleaner, list info, info == null, infoList=" + e);
                } else {
                    hashSet.add(soFileInfo.provideStorageKey());
                }
            }
        } catch (Throwable th) {
            ikq.a("listUsefulStorageKeys", th);
        }
        return hashSet;
    }

    private List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd625b", new Object[]{this});
        }
        if (!this.f29038a.a("key_cleaner_allow_clear_useless_last", true)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (SoIndexData soIndexData : this.b.a().b()) {
                for (Map.Entry<String, SoIndexData.SoIndexEntry> entry : soIndexData.getEntries().entrySet()) {
                    String key = entry.getKey();
                    Map<String, SoIndexData.SoFileInfo> files = entry.getValue().getFiles();
                    SoIndexData.SoFileInfo soFileInfo = files.get(this.d.b());
                    if (soFileInfo == null) {
                        RSoLog.c("RSoCleaner, last cache, lastCacheInfo == null, indexEntry.getFiles()=" + files);
                    } else if (a(key, soFileInfo)) {
                        arrayList.add(soFileInfo.provideStorageKey());
                        RSoLog.c("RSoCleaner, last cache useful, add to results, , libName=" + key + ", key=" + soFileInfo.provideStorageKey());
                    }
                }
            }
        } catch (Throwable th) {
            ikq.a("RSoCleaner,listUselessLastCache", th);
        }
        return arrayList;
    }

    private boolean a(String str, SoIndexData.SoFileInfo soFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f017ebc4", new Object[]{this, str, soFileInfo})).booleanValue();
        }
        try {
            j a2 = l.a(this.b, str);
            if (ikw.a((CharSequence) soFileInfo.getMd5(), (CharSequence) a2.c())) {
                RSoLog.c("RSoCleaner, last cache equals current info, libName=" + str);
                return true;
            } else if (this.e.a(a2).i()) {
                return false;
            } else {
                RSoLog.c("RSoCleaner, last cache need keep, !result.isSuccess(), libName=" + str);
                return true;
            }
        } catch (Throwable unused) {
            RSoLog.a("RSoCleaner, isLastInfoUseful, " + str + " from last not exists in current");
            return true;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Collection<File> a2 = iku.a(new File(this.c.b()), false);
        HashMap hashMap = new HashMap();
        long j = 0;
        for (File file : a2) {
            j += file.length();
        }
        long j2 = (j / 1000) / 1000;
        if (j2 > 180) {
            ikq.a("storage>180", a2.toString());
        }
        hashMap.put("rSoStore_Space", Long.valueOf(j2));
        hashMap.put("ext_Space", Integer.valueOf(a2.size()));
        ikq.a(ikn.POINT_CLEANER_SPACE, hashMap);
        RSoLog.c("RSoCleaner, trackUsedSpace(), finish ");
    }
}
