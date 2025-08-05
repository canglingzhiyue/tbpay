package com.taobao.android.tbuprofen.adapter;

import java.io.File;
import java.io.FileFilter;

/* compiled from: lambda */
/* renamed from: com.taobao.android.tbuprofen.adapter.-$$Lambda$TBHeapDumper$904ulbai0j80WTHaBu7-IzaxrVo  reason: invalid class name */
/* loaded from: classes6.dex */
public final /* synthetic */ class $$Lambda$TBHeapDumper$904ulbai0j80WTHaBu7IzaxrVo implements FileFilter {
    public static final /* synthetic */ $$Lambda$TBHeapDumper$904ulbai0j80WTHaBu7IzaxrVo INSTANCE = new $$Lambda$TBHeapDumper$904ulbai0j80WTHaBu7IzaxrVo();

    private /* synthetic */ $$Lambda$TBHeapDumper$904ulbai0j80WTHaBu7IzaxrVo() {
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        boolean c;
        c = TBHeapDumper.c(file);
        return c;
    }
}
