package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.analysis.analysis.a;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.c;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class jqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f29689a;
    private final jbj b;
    private FluidInstanceConfig c;
    private sps d;

    static {
        kge.a(-285587169);
    }

    public jqa(jbj jbjVar) {
        this.b = jbjVar;
    }

    public sps a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sps) ipChange.ipc$dispatch("f0a9e28", new Object[]{this});
        }
        if (this.d == null) {
            spz.c("SceneParamsManager", "mSessionParams 为空");
        }
        return this.d;
    }

    public void a(FluidContext fluidContext, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56de6cab", new Object[]{this, fluidContext, map});
            return;
        }
        Map b = this.d.a().b();
        if (ogv.a(b) && ogv.a(map)) {
            return;
        }
        if (!ogv.a(b)) {
            try {
                b.putAll(map);
            } catch (Exception e) {
                FluidException.throwException(fluidContext, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, "mergeTab3ExtParams", e);
            }
            map = b;
        }
        spz.c("SceneParamsManager", "合并小红点扩展参数" + map);
        this.d.a().a(map);
    }

    public void a(FluidContext fluidContext, FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f012be", new Object[]{this, fluidContext, fluidInstanceConfig});
            return;
        }
        a fluidInstanceAnalysis = ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.a();
        fluidInstanceAnalysis.c(FluidInstanceAnalysis.Stage.PARSE_CONFIG.name());
        spz.c("SceneParamsManager", "解析视频流场景配置：\n视频流原始链接：" + fluidInstanceConfig.getFluidOriginUrl() + "\n视频流唤端链接：" + fluidInstanceConfig.getFluidUrl() + "\n视频流父容器 TNode：" + fluidInstanceConfig.getHostTNodeComponent() + "\n视频流父容器 PageInterface: " + fluidInstanceConfig.getHostPageInterface());
        this.c = fluidInstanceConfig;
        Uri fluidUrl = fluidInstanceConfig.getFluidUrl();
        if (fluidUrl != null) {
            a(fluidUrl);
        }
        Component hostTNodeComponent = fluidInstanceConfig.getHostTNodeComponent();
        if (hostTNodeComponent != null) {
            a(fluidContext, hostTNodeComponent);
        }
        this.b.a(this.c, this.d);
        this.b.a(this.d);
        fluidInstanceAnalysis.b(FluidInstanceAnalysis.Stage.PARSE_CONFIG.name());
        fluidInstanceAnalysis.a("succeed");
    }

    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        sps spsVar = this.d;
        if (spsVar == null) {
            return;
        }
        spsVar.b(map);
        this.b.a(this.d);
    }

    private Map a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("608c7685", new Object[]{this, aaVar});
        }
        if (aaVar == null) {
            return null;
        }
        Object e = aaVar.e("query");
        if (!(e instanceof Map)) {
            return null;
        }
        return (Map) e;
    }

    private void b() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (f29689a == null) {
            f29689a = new HashMap();
            String a2 = oeb.a("ShortVideo.extParamsMap", "ug_param,itemId=triggerItemId");
            if (TextUtils.isEmpty(a2) || (split = a2.split(",")) == null) {
                return;
            }
            for (String str : split) {
                String[] split2 = str.split("=");
                if (split2 != null) {
                    if (split2.length == 1) {
                        f29689a.put(split2[0], split2[0]);
                    } else if (split2.length == 2) {
                        f29689a.put(split2[0], split2[1]);
                    }
                }
            }
        }
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : TextUtils.equals(str, "0") && TextUtils.equals(str2, "video");
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : TextUtils.equals(this.c.getTab3CardType(), "video");
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            this.d = new sps(uri);
            boolean equals = FluidInstanceConfig.CONTAINER_NAME_GG_TAG3.equals(this.c.getBizType());
            if (this.d.v != null && this.d.v.contains("default")) {
                z = true;
            }
            spz.a("SceneParamsManager", "isDefaultGuangguangTab3:" + z);
            if (equals && z) {
                this.d.a().a(true);
            }
            this.d.a().a("FullScreen");
            this.d.a().d("videoFullScreen");
        }
    }

    private void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{this, fluidContext, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            if (!a(parse.getQueryParameter(gvw.CONFIG_LAUNCH), parse.getQueryParameter("tabid"))) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    this.d.a().e(str);
                }
                if (parse == null) {
                    return;
                }
                this.d.a().c(!"1".equals(parse.getQueryParameter("skipLoading")));
                if ("1".equals(parse.getQueryParameter("skipDelay"))) {
                    z = false;
                }
                this.d.a().b(z);
            } catch (Exception e) {
                FluidException.throwException(fluidContext, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, "parseLauncherConfig", e);
            }
        }
    }

    private void a(FluidContext fluidContext, Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da82231", new Object[]{this, fluidContext, component});
        } else if (component == null) {
            spz.c("SceneParamsManager", "TNode Component 为空");
        } else {
            aa tNode = component.getTNode();
            if (tNode == null) {
                spz.c("SceneParamsManager", "TNode 为空");
            } else if (ogv.a(tNode.C())) {
            } else {
                String str = (String) tNode.C().get("url");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                spz.c("SceneParamsManager", "解析视频流 TAB2 父容器页面链接：" + str);
                this.d.a().b(str);
                String tab3CardType = fluidContext.getInstanceConfig().getTab3CardType();
                if (spj.d()) {
                    if (c.a(str, tab3CardType)) {
                        a(fluidContext, str, a(tNode));
                    }
                } else {
                    a(fluidContext, str, a(tNode));
                }
                a(fluidContext, str);
            }
        }
    }

    private void a(FluidContext fluidContext, String str, Map map) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c37821", new Object[]{this, fluidContext, str, map});
        } else if (str != null) {
            try {
                if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
                    return;
                }
                String c = sov.c(parse);
                if (!TextUtils.isEmpty(c)) {
                    this.d.a().c(c);
                }
                JSONObject a2 = sov.a(parse);
                if (!ogv.a(a2)) {
                    this.d.a().a(a2);
                }
                HashMap hashMap = null;
                if (com.taobao.android.fluid.framework.preload.dwinstance.c.b(Uri.parse(str)) && c()) {
                    b();
                    if (map == null) {
                        map = oec.f(str);
                    }
                    hashMap = new HashMap();
                    for (Map.Entry<String, String> entry : f29689a.entrySet()) {
                        String value = entry.getValue();
                        Object obj = map.get(entry.getKey());
                        if (obj != null) {
                            hashMap.put(value, obj.toString());
                        }
                    }
                }
                this.d.a(hashMap);
            } catch (Exception e) {
                FluidException.throwException(fluidContext, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, "parseTab2PageUrlExtParams", e);
            }
        }
    }
}
