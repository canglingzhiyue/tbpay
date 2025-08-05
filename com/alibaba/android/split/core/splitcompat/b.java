package com.alibaba.android.split.core.splitcompat;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes2.dex */
public final class b implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<File> f2448a;
    private final q b;
    private final ZipFile c;

    static {
        kge.a(1844734327);
        kge.a(-458118459);
    }

    public b(Set<File> set, q qVar, ZipFile zipFile) {
        this.f2448a = set;
        this.b = qVar;
        this.c = zipFile;
    }

    @Override // com.alibaba.android.split.core.splitcompat.i
    public void a(f fVar, File file, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f968bdf", new Object[]{this, fVar, file, new Boolean(z)});
            return;
        }
        this.f2448a.add(file);
        if (z) {
            return;
        }
        g.a(this.c, fVar.b, file);
    }
}
