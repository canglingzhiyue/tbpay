package com.alibaba.android.split.core.splitcompat;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes2.dex */
public class a implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<File> f2447a;
    public final q b;
    public final g c;

    static {
        kge.a(-1163710088);
        kge.a(-257010881);
    }

    public a(g gVar, Set<File> set, q qVar) {
        this.c = gVar;
        this.f2447a = set;
        this.b = qVar;
    }

    @Override // com.alibaba.android.split.core.splitcompat.h
    public void a(ZipFile zipFile, Set<f> set) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2093cf35", new Object[]{this, zipFile, set});
        } else {
            this.f2447a.addAll(this.c.a(set, this.b, zipFile));
        }
    }
}
