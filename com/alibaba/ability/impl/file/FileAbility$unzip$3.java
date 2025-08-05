package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import tb.ruk;

/* loaded from: classes2.dex */
public final class FileAbility$unzip$3 extends Lambda implements ruk<ZipEntry> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.ObjectRef $zipIn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAbility$unzip$3(Ref.ObjectRef objectRef) {
        super(0);
        this.$zipIn = objectRef;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final ZipEntry mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ZipEntry) ipChange.ipc$dispatch("6508ec27", new Object[]{this}) : ((ZipInputStream) this.$zipIn.element).getNextEntry();
    }
}
