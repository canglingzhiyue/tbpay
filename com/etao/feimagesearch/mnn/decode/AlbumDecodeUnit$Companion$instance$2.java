package com.etao.feimagesearch.mnn.decode;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class AlbumDecodeUnit$Companion$instance$2 extends Lambda implements ruk<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AlbumDecodeUnit$Companion$instance$2 INSTANCE = new AlbumDecodeUnit$Companion$instance$2();

    public AlbumDecodeUnit$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final a mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fb33003f", new Object[]{this}) : new a(null);
    }
}
