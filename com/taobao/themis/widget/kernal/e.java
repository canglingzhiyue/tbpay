package com.taobao.themis.widget.kernal;

import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.extension.d;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/widget/kernal/TMSWidgetPkgInfoParser;", "Lcom/taobao/themis/open/extension/IPkgInfoParseExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Lcom/taobao/themis/kernel/TMSInstance;)V", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "destroy", "", "getAppCacheInfo", "Lcom/alibaba/fastjson/JSONObject;", "getAppPackageUrl", "", "getFrameworkCacheInfo", "getFrameworkPackageUrl", "getPluginCacheInfo", "pluginModel", "Lcom/alibaba/ariver/resource/api/models/PluginModel;", "getPluginPackageUrl", "getSubPackageModel", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e implements com.taobao.themis.open.extension.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.themis.kernel.f f22941a;

    static {
        kge.a(610672052);
        kge.a(1980968668);
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        return null;
    }

    public e(com.taobao.themis.kernel.f instance) {
        q.d(instance, "instance");
        this.f22941a = instance;
    }

    @Override // tb.sud
    public void a(com.taobao.themis.kernel.f instance) {
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
        TMSMetaInfoWrapper w = this.f22941a.w();
        if (w == null) {
            return null;
        }
        return w.q();
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject b() {
        JSONObject m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        TMSMetaInfoWrapper w = this.f22941a.w();
        if (w != null && (m = w.m()) != null) {
            return m.getJSONObject("cacheInfo");
        }
        return null;
    }

    @Override // com.taobao.themis.open.extension.d
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : k.A(this.f22941a);
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : k.B(this.f22941a);
    }

    @Override // com.taobao.themis.open.extension.d
    public String a(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f68f6b2d", new Object[]{this, pluginModel});
        }
        if (pluginModel == null) {
            return null;
        }
        return pluginModel.getPackageUrl();
    }

    @Override // com.taobao.themis.open.extension.d
    public JSONObject b(PluginModel pluginModel) {
        JSONObject extendInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8ed6df4", new Object[]{this, pluginModel});
        }
        if (pluginModel != null && (extendInfo = pluginModel.getExtendInfo()) != null) {
            return extendInfo.getJSONObject("cacheInfo");
        }
        return null;
    }
}
