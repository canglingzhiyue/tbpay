package com.alibaba.android.split.core.splitcompat;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final q f2450a;
    public final Set<File> b;
    public final AtomicBoolean c;
    public final g d;

    static {
        kge.a(-1881419982);
        kge.a(-257010881);
    }

    public e(g gVar, q qVar, Set<File> set, AtomicBoolean atomicBoolean) {
        this.d = gVar;
        this.f2450a = qVar;
        this.b = set;
        this.c = atomicBoolean;
    }

    @Override // com.alibaba.android.split.core.splitcompat.h
    public void a(ZipFile zipFile, Set<f> set) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2093cf35", new Object[]{this, zipFile, set});
        } else {
            this.d.b(this.f2450a, set, new d(this));
        }
    }
}
