package com.alibaba.android.split.core.splitcompat;

import android.os.Build;
import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.bgh;
import tb.bgu;
import tb.bgy;
import tb.bhy;
import tb.bib;
import tb.iju;
import tb.kge;
import tb.xin;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Pattern b;
    private static xin d;

    /* renamed from: a  reason: collision with root package name */
    public final bgy f2452a;
    private final bgu c = (bgu) com.alibaba.android.split.a.b(bgu.class, "NativeLibraryExtractor");

    public static /* synthetic */ bgu a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("d78b9c19", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ Pattern b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("b67140b2", new Object[0]) : b;
    }

    static {
        kge.a(-1423730003);
        b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
        d = (xin) com.alibaba.android.split.a.a((Class<? extends Object>) xin.class, new Object[0]);
    }

    public g(bgy bgyVar) {
        this.f2452a = bgyVar;
    }

    public void a() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                Set<q> q = this.f2452a.q();
                for (String str : this.f2452a.r()) {
                    Iterator<q> it = q.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.equals(it.next().b())) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        this.c.d("NativeLibraryExtractor.synchronizeNativeLibs:NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str);
                        this.f2452a.e(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Set<File> a(q qVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2b58428d", new Object[]{this, qVar});
        }
        HashSet hashSet = new HashSet();
        a(qVar, new a(this, hashSet, qVar));
        if (hashSet.size() == 0) {
            return hashSet;
        }
        for (File file : this.f2452a.f(qVar.b())) {
            if (!hashSet.contains(file) && Build.VERSION.SDK_INT > 22) {
                this.c.d("NativeLibraryExtractor.synchronizeNativeLib:NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), qVar.b(), qVar.a().getAbsolutePath());
                this.f2452a.a(file);
            }
        }
        return hashSet;
    }

    public Set<File> b(q qVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6522e46c", new Object[]{this, qVar});
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        a(qVar, new e(this, qVar, hashSet, atomicBoolean));
        if (!atomicBoolean.get()) {
            return null;
        }
        return hashSet;
    }

    public void a(q qVar, h hVar) throws IOException {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db11d92", new Object[]{this, qVar, hVar});
            return;
        }
        try {
            try {
                final HashMap hashMap = new HashMap();
                zipFile = new ZipFile(qVar.a());
                try {
                    bgh.a(zipFile, new bgh.a() { // from class: com.alibaba.android.split.core.splitcompat.g.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.bgh.a
                        public void a(ZipEntry zipEntry) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6aa97658", new Object[]{this, zipEntry});
                                return;
                            }
                            String name = zipEntry.getName();
                            Matcher matcher = g.b().matcher(name);
                            if (!matcher.matches()) {
                                return;
                            }
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            g.a(g.this).d("NativeLibraryExtractor.extract:NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", name, group, group2);
                            Set set = (Set) hashMap.get(group);
                            if (set == null) {
                                set = new HashSet();
                                hashMap.put(group, set);
                            }
                            set.add(new f(zipEntry, group2));
                        }
                    });
                    if (hashMap.size() != 0) {
                        HashMap hashMap2 = new HashMap();
                        String a2 = bhy.a(j.h().e());
                        ArrayList arrayList = new ArrayList();
                        if (Build.VERSION.SDK_INT > 20) {
                            String[] strArr = Build.SUPPORTED_ABIS;
                            int length = strArr.length;
                            ArrayList arrayList2 = new ArrayList(length);
                            arrayList2.add(a2);
                            for (int i = 0; i < length; i++) {
                                if (!arrayList2.contains(strArr[i])) {
                                    arrayList2.add(strArr[i]);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList.add(iju.ABI_ARM);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (hashMap.containsKey(str)) {
                                this.c.d("NativeLibraryExtractor.extract:NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str);
                                for (f fVar : (Set) hashMap.get(str)) {
                                    if (hashMap2.containsKey(fVar.f2451a)) {
                                        this.c.d("NativeLibraryExtractor.extract:NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", fVar.f2451a, str);
                                    } else {
                                        hashMap2.put(fVar.f2451a, fVar);
                                        this.c.d("NativeLibraryExtractor.extract:NativeLibraryExtractor: using library %s for ABI %s", fVar.f2451a, str);
                                    }
                                }
                            } else {
                                String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str);
                                this.c.d("NativeLibraryExtractor.extract:NativeLibraryExtractor: there are no native libraries for supported ABI %s", str);
                            }
                        }
                        hVar.a(zipFile, new HashSet(hashMap2.values()));
                        try {
                            zipFile.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                } catch (IOException e) {
                    e = e;
                    this.c.a(e, "extract failed:%s", e.getMessage());
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
    }

    private final void a(q qVar, Set<f> set, i iVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29330d74", new Object[]{this, qVar, set, iVar});
            return;
        }
        for (f fVar : set) {
            File a2 = this.f2452a.a(qVar.b(), fVar.f2451a);
            iVar.a(fVar, a2, a2.exists() && a2.length() == fVar.b.getSize());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static void b(java.util.zip.ZipFile r5, java.util.zip.ZipEntry r6, java.io.File r7) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.split.core.splitcompat.g.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 2
            r1[r5] = r7
            java.lang.String r5 = "b47b5a50"
            r0.ipc$dispatch(r5, r1)
            return
        L18:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            if (r7 == 0) goto L28
            boolean r3 = r7.exists()     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L28
            r7.delete()     // Catch: java.lang.Throwable -> L59
        L28:
            java.io.InputStream r5 = r5.getInputStream(r6)     // Catch: java.lang.Throwable -> L59
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L50
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L50
        L31:
            int r7 = r5.read(r0)     // Catch: java.lang.Throwable -> L46
            if (r7 <= 0) goto L3b
            r6.write(r0, r2, r7)     // Catch: java.lang.Throwable -> L46
            goto L31
        L3b:
            a(r5)
            a(r6)
            return
        L42:
            r7 = move-exception
            r1 = r5
            r5 = r7
            goto L5d
        L46:
            r7 = move-exception
            r1 = r5
            r5 = r7
            goto L5b
        L4a:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r6
            r6 = r4
            goto L5d
        L50:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r6
            r6 = r4
            goto L5b
        L56:
            r5 = move-exception
            r6 = r1
            goto L5d
        L59:
            r5 = move-exception
            r6 = r1
        L5b:
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
        L5d:
            a(r1)
            a(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.split.core.splitcompat.g.b(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }

    public void b(q qVar, Set set, i iVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51794db5", new Object[]{this, qVar, set, iVar});
        } else {
            a(qVar, set, iVar);
        }
    }

    public Set a(Set<f> set, q qVar, ZipFile zipFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ff7608f2", new Object[]{this, set, qVar, zipFile});
        }
        HashSet hashSet = new HashSet();
        a(qVar, set, new b(hashSet, qVar, zipFile));
        return hashSet;
    }

    public static void a(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4bd231", new Object[]{zipFile, zipEntry, file});
            return;
        }
        while (i <= 2) {
            i++;
            b(zipFile, zipEntry, file);
            if (file.exists() && bib.a(zipFile.getInputStream(zipEntry)).equals(d.a(file.getAbsolutePath()))) {
                return;
            }
        }
        if (file.exists()) {
            file.delete();
        }
        throw new IOException("extract so File:" + file + "failed!");
    }

    private static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
