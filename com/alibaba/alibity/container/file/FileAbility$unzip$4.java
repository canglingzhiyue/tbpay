package com.alibaba.alibity.container.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/zip/ZipEntry;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class FileAbility$unzip$4 extends Lambda implements ruk<ZipEntry> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.ObjectRef $zipIn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAbility$unzip$4(Ref.ObjectRef objectRef) {
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
