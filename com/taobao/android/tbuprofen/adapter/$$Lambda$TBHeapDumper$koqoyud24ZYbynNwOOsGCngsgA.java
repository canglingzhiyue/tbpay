package com.taobao.android.tbuprofen.adapter;

import java.io.File;
import java.io.FileFilter;

/* compiled from: lambda */
/* renamed from: com.taobao.android.tbuprofen.adapter.-$$Lambda$TBHeapDumper$koqoyud24ZYbynNwOOsGCng-sgA  reason: invalid class name */
/* loaded from: classes6.dex */
public final /* synthetic */ class $$Lambda$TBHeapDumper$koqoyud24ZYbynNwOOsGCngsgA implements FileFilter {
    public static final /* synthetic */ $$Lambda$TBHeapDumper$koqoyud24ZYbynNwOOsGCngsgA INSTANCE = new $$Lambda$TBHeapDumper$koqoyud24ZYbynNwOOsGCngsgA();

    private /* synthetic */ $$Lambda$TBHeapDumper$koqoyud24ZYbynNwOOsGCngsgA() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean b;
        b = TBHeapDumper.b(file);
        return b;
    }
}
