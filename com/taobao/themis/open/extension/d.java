package com.taobao.themis.open.extension;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.sud;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H&J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/taobao/themis/open/extension/IPkgInfoParseExtension;", "Lcom/taobao/themis/kernel/extension/instance/IExtension;", "destroy", "", "getAppCacheInfo", "Lcom/alibaba/fastjson/JSONObject;", "getAppPackageUrl", "", "getFrameworkCacheInfo", "getFrameworkPackageUrl", "getPluginCacheInfo", "pluginModel", "Lcom/alibaba/ariver/resource/api/models/PluginModel;", "getPluginPackageUrl", "getSubPackageModel", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public interface d extends sud {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1579290246);
        }

        public static void a(d dVar, f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("728a92d7", new Object[]{dVar, instance});
                return;
            }
            q.d(instance, "instance");
            sud.a.a(dVar, instance);
        }

        public static void b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0c6313", new Object[]{dVar});
            } else {
                sud.a.b(dVar);
            }
        }
    }

    String a();

    String a(PluginModel pluginModel);

    JSONObject b();

    JSONObject b(PluginModel pluginModel);

    String c();

    JSONObject d();

    JSONObject e();
}
