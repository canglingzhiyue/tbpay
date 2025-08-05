package com.taobao.themis.open.extension;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpy;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0007H&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0007H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0017"}, d2 = {"Lcom/taobao/themis/open/extension/IResourceManagerExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "addSubPackageResource", "", "resourcePackage", "Lcom/taobao/themis/open/resource/ResourcePackage;", "getAPIFrameworkExtHotPatchContent", "", "getFrameworkResource", "Lcom/taobao/themis/open/resource/Resource;", "resourceName", "getJSFrameworkHotPatchContent", "getMainResource", "name", "getPluginResource", qpy.PLUGIN_ID, "getSubPackageResource", "setAPIFrameworkExtHotPatchContent", "content", "setFrameworkResource", "setJSFrameworkHotPatchContent", "setMainResource", "setPluginResourcePackage", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface e extends sud {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(173704300);
        }

        public static void a(e eVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fabad2b6", new Object[]{eVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(eVar, instance);
        }

        public static void b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0cd772", new Object[]{eVar});
            } else {
                sud.a.b(eVar);
            }
        }
    }

    com.taobao.themis.open.resource.c a(String str);

    com.taobao.themis.open.resource.c a(String str, String str2);

    String a();

    void a(com.taobao.themis.open.resource.e eVar);

    com.taobao.themis.open.resource.c b(String str);

    String b();

    void b(com.taobao.themis.open.resource.e eVar);

    com.taobao.themis.open.resource.c c(String str);

    void c(com.taobao.themis.open.resource.e eVar);

    void d(com.taobao.themis.open.resource.e eVar);

    void d(String str);

    void e(String str);
}
