package com.alibaba.android.split.core.splitcompat;

import android.util.Log;
import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
import tb.bgu;
import tb.bgy;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    static {
        kge.a(1791170674);
    }

    public c(bgy bgyVar) {
        super(bgyVar);
        this.b = bgyVar.b();
    }

    @Override // com.alibaba.android.split.core.splitcompat.g
    public Set<File> a(q qVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2b58428d", new Object[]{this, qVar});
        }
        HashSet hashSet = new HashSet();
        a(qVar, new a(this, hashSet, qVar));
        for (File file : this.f2452a.f(qVar.b())) {
            if (!hashSet.contains(file)) {
                Log.e(bgu.MODULE, String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), qVar.b(), qVar.a().getAbsolutePath()));
                this.f2452a.a(file);
            }
        }
        return hashSet;
    }

    @Override // com.alibaba.android.split.core.splitcompat.g
    public final Set<File> b(q qVar) throws IOException {
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

    @Override // com.alibaba.android.split.core.splitcompat.g
    public Set a(Set<f> set, q qVar, ZipFile zipFile) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ff7608f2", new Object[]{this, set, qVar, zipFile});
        }
        HashSet hashSet = new HashSet();
        a(qVar, set, new b(hashSet, qVar, zipFile));
        return hashSet;
    }

    public final void a(q qVar, Set<f> set, i iVar) throws IOException {
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
}
