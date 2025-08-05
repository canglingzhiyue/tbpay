package tb;

import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.open.extension.d;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/canvas/extension/instance/TMSGameJSPkgInfoParser;", "Lcom/taobao/themis/open/extension/IPkgInfoParseExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "destroy", "", "getAppCacheInfo", "Lcom/alibaba/fastjson/JSONObject;", "getAppPackageUrl", "", "getFrameworkCacheInfo", "getFrameworkPackageUrl", "getPluginCacheInfo", "pluginModel", "Lcom/alibaba/ariver/resource/api/models/PluginModel;", "getPluginPackageUrl", "getSubPackageModel", "parseByteCacheInfo", "metaInfo", "Lcom/taobao/themis/kernel/metaInfo/TMSMetaInfoWrapper;", "parseCacheInfo", "parsePluginCacheInfo", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tnx implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f34236a;

    static {
        kge.a(1160248589);
        kge.a(1980968668);
    }

    public tnx(f instance) {
        q.d(instance, "instance");
        this.f34236a = instance;
    }

    @Override // tb.sud
    public void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        d.a.a(this, instance);
    }

    @Override // tb.sud
    public void bQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfab7697", new Object[]{this});
        } else {
            d.a.b(this);
        }
    }

    @Override // com.taobao.themis.open.extension.d
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.f34236a.w() == null) {
            return null;
        }
        TMSMetaInfoWrapper w = this.f34236a.w();
        q.a(w);
        return w.q();
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        if (this.f34236a.w() != null) {
            return a(this.f34236a.w());
        }
        return null;
    }

    @Override // com.taobao.themis.open.extension.d
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        TMSMetaInfoWrapper v = this.f34236a.v();
        if (v == null) {
            return null;
        }
        return v.q();
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        if (this.f34236a.v() != null) {
            return a(this.f34236a.v());
        }
        return null;
    }

    @Override // com.taobao.themis.open.extension.d
    public String a(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f68f6b2d", new Object[]{this, pluginModel});
        }
        if (pluginModel != null) {
            return pluginModel.getPackageUrl();
        }
        return null;
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject b(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8ed6df4", new Object[]{this, pluginModel});
        }
        if (pluginModel != null) {
            return c(pluginModel);
        }
        return null;
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject e() {
        AppModel z;
        AppInfoModel appInfoModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        TMSMetaInfoWrapper v = this.f34236a.v();
        if (v != null && (z = v.z()) != null && (appInfoModel = z.getAppInfoModel()) != null) {
            return appInfoModel.getSubPackages();
        }
        return null;
    }

    private final JSONObject a(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72327cd1", new Object[]{this, tMSMetaInfoWrapper});
        }
        q.a(tMSMetaInfoWrapper);
        JSONObject m = tMSMetaInfoWrapper.m();
        if (m != null) {
            return m.getJSONObject("cacheInfo");
        }
        return null;
    }

    private final JSONObject c(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1f532f5", new Object[]{this, pluginModel});
        }
        JSONObject extendInfo = pluginModel.getExtendInfo();
        if (extendInfo != null) {
            return extendInfo.getJSONObject("cacheInfo");
        }
        return null;
    }
}
