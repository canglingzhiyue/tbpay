package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.w;
import com.taobao.themis.open.packages.downloader.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/open/packages/downloader/ZCacheCDNPackageDownloader;", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader;", "()V", "downloadPackageAsync", "", "packageInfo", "Lcom/taobao/themis/open/packages/downloader/PackageDownloadInfo;", "callback", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "downloadPackageSync", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$DownloadResult;", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1844937251);
        kge.a(1788576985);
    }

    @Override // com.taobao.themis.open.packages.downloader.a
    public void a(b packageInfo, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fcb773", new Object[]{this, packageInfo, bVar});
            return;
        }
        q.d(packageInfo, "packageInfo");
        w.a();
        d.a(packageInfo.d(), bVar);
    }
}
