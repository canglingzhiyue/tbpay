package com.taobao.themis.open.extension;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpy;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u000f\u0010J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J6\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/open/extension/IPackageManagerExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "loadSubPackage", "", "subPackageDownloadInfo", "Lcom/taobao/themis/open/packages/downloader/PackageDownloadInfo;", "commonPackageDownloadCallback", "Lcom/taobao/themis/open/extension/IPackageManagerExtension$CommonPackageDownloadCallback;", "starLoadAppPackage", "frameworkPackageDownloadInfo", "mainPackageDownloadInfo", "pluginPackageDownloadInfo", "", "appPackageDownloadCallback", "Lcom/taobao/themis/open/extension/IPackageManagerExtension$AppPackageDownloadCallback;", "AppPackageDownloadCallback", "CommonPackageDownloadCallback", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface c extends sud {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\r"}, d2 = {"Lcom/taobao/themis/open/extension/IPackageManagerExtension$AppPackageDownloadCallback;", "Lcom/taobao/themis/kernel/LaunchStepCallback;", "onFrameworkPackageDownloadFinish", "", "onFrameworkPackageDownloadProgress", "progress", "", "onMainPackageDownloadFinish", "onMainPackageDownloadProgress", "onPluginDownloadFinish", qpy.PLUGIN_ID, "", "onPluginDownloadProgress", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a extends com.taobao.themis.kernel.c {
        void a(String str);

        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/taobao/themis/open/extension/IPackageManagerExtension$CommonPackageDownloadCallback;", "", "onDownloadError", "", "errorCode", "", "errorMsg", "", "onDownloadFinish", "path", "onDownloadProgress", "progress", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void a(int i);

        void a(int i, String str);

        void a(String str);
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.open.extension.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0960c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(129307336);
        }

        public static void a(c cVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea5a52f8", new Object[]{cVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(cVar, instance);
        }

        public static void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0beeb4", new Object[]{cVar});
            } else {
                sud.a.b(cVar);
            }
        }
    }

    void a(com.taobao.themis.open.packages.downloader.b bVar, b bVar2);

    void a(com.taobao.themis.open.packages.downloader.b bVar, com.taobao.themis.open.packages.downloader.b bVar2, List<com.taobao.themis.open.packages.downloader.b> list, a aVar);
}
