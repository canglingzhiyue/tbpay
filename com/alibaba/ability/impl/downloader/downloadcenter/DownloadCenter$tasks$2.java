package com.alibaba.ability.impl.downloader.downloadcenter;

import com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes2.dex */
public final class DownloadCenter$tasks$2 extends Lambda implements ruk<ConcurrentHashMap<String, DownloadCenter.b>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DownloadCenter$tasks$2 INSTANCE = new DownloadCenter$tasks$2();

    public DownloadCenter$tasks$2() {
        super(0);
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final ConcurrentHashMap<String, DownloadCenter.b> mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("da029207", new Object[]{this}) : new ConcurrentHashMap<>();
    }
}
