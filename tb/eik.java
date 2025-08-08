package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.d;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;

/* loaded from: classes4.dex */
public class eik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-362607628);
        emu.a("com.taobao.android.detail.core.performance.conifg.DetailOptConfigService");
    }

    public static void a(DetailOptNode detailOptNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0cb880", new Object[]{detailOptNode});
            return;
        }
        try {
            ein a2 = ein.a();
            JSONObject data = detailOptNode.getData();
            if (data == null) {
                i.c(l.a("DetailOptConfigService"), "保存开关配置数据不成功：detailOptJson为空");
            } else if (StringUtils.isEmpty(detailOptNode.preloadChannel)) {
                i.c(l.a("DetailOptConfigService"), "保存开关配置数据不成功：配置数据中没有preloadChannel");
            } else {
                if ("navPreload".equals(detailOptNode.preloadChannel)) {
                    for (String str : eih.a()) {
                        if (!"navPreload".equals(str)) {
                            a2.b(str);
                        }
                    }
                } else {
                    a2.b("navPreload");
                }
                a2.a(detailOptNode.preloadChannel, data);
            }
        } catch (Exception e) {
            i.a(l.a("DetailOptConfigService"), "保存开关配置数据不成功 exception", e);
        }
    }

    public static void a(DetailClientDataNode.DetailClientOpt detailClientOpt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39aa631", new Object[]{detailClientOpt});
            return;
        }
        try {
            JSONObject data = detailClientOpt.getData();
            if (data == null) {
                i.c(d.a("DetailOptConfigService"), "detailClientOptJson为空");
            } else {
                eij.a().a(data);
            }
        } catch (Exception e) {
            i.a(d.a("DetailOptConfigService"), "保存详情优化开关配置数据不成功 exception: ", e);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            i.c(d.a("DetailOptConfigService"), "load detailClientOpt config");
            eij.a().c();
        } catch (Exception e) {
            i.a(d.a("DetailOptConfigService"), "load detailClientOpt exception", e);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            i.c(l.a("DetailOptConfigService"), "load detail opt config ");
            ein.a().a(eih.a());
        } catch (Exception e) {
            i.a(l.a("DetailOptConfigService"), "load detail opt config exception", e);
        }
    }

    public static DetailOptNode.OptFeature a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailOptNode.OptFeature) ipChange.ipc$dispatch("19d852b3", new Object[]{str});
        }
        DetailOptNode c = ein.a().c(str);
        if (c == null) {
            i.a(l.a("DetailOptConfigService"), "预加载优化后端开关关闭：detailOpt == null");
            return null;
        }
        return c.optFeature;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        DetailOptNode.OptFeature a2 = a(str);
        if (a2 == null) {
            i.a(l.a("DetailOptConfigService"), "预加载优化后端开关关闭：optFeature == null");
            return false;
        }
        String str2 = a2.enableCacheRequestData;
        boolean equals = "true".equals(str2);
        String a3 = l.a("DetailOptConfigService");
        i.c(a3, "预加载优化后端开关打开：optFeatureStr" + str2);
        return equals;
    }

    private static DetailClientDataNode.DetailClientOpt j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailClientDataNode.DetailClientOpt) ipChange.ipc$dispatch("f8f0f2fa", new Object[0]) : eij.a().d();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        DetailClientDataNode.DetailClientOpt j = j();
        if (j != null) {
            return j.hitCropData;
        }
        return false;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue();
        }
        DetailClientDataNode.DetailClientOpt j = j();
        if (j != null && j.skuLoadDelayTime > 0) {
            return j.skuLoadDelayTime;
        }
        return 250;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        DetailClientDataNode.DetailClientOpt j = j();
        if (j != null) {
            return j.asyncModulePreload;
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        DetailClientDataNode.DetailClientOpt j = j();
        if (j != null) {
            return j.dynamicJsonData;
        }
        return false;
    }
}
