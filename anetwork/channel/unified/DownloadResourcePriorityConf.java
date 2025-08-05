package anetwork.channel.unified;

import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.map.IAddressMap;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.appbundle.c;
import tb.flp;
import tb.kge;
import tb.mqt;

/* loaded from: classes.dex */
public class DownloadResourcePriorityConf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BANDWIDTH_PRIORITY_COPPER = 2;
    public static final int BANDWIDTH_PRIORITY_GOLD = 0;
    public static final int BANDWIDTH_PRIORITY_NONE = -1;
    public static final int BANDWIDTH_PRIORITY_SLIVER = 1;
    private static DynamicResource[] GOLD_RESOURCE;
    private static DynamicResource[] SLIVER_RESOURCES;

    /* loaded from: classes.dex */
    public static class DynamicResource {
        public int bandWidthPriority;
        public String featureName;
        public String fileName;
        public boolean isDownloadRequired = true;
        public boolean isDownloadCompleted = false;

        static {
            kge.a(728776338);
        }

        public DynamicResource(String str, String str2, int i) {
            this.fileName = str;
            this.featureName = str2;
            this.bandWidthPriority = i;
        }
    }

    static {
        kge.a(139619305);
        GOLD_RESOURCE = null;
        SLIVER_RESOURCES = null;
        DynamicResource[] dynamicResourceArr = new DynamicResource[18];
        GOLD_RESOURCE = dynamicResourceArr;
        dynamicResourceArr[0] = new DynamicResource(c.TAOPAI_FEATURE, c.TAOPAI_FEATURE, 0);
        GOLD_RESOURCE[1] = new DynamicResource("zstd", "zstd", 0);
        GOLD_RESOURCE[2] = new DynamicResource("themis_gfx", "themis_gfx", 0);
        GOLD_RESOURCE[3] = new DynamicResource("ratefeature", RateNode.TAG, 0);
        GOLD_RESOURCE[4] = new DynamicResource(flp.PRELOAD_LITE_DETAIL_FEATURE_NAME, "imagecontent", 0);
        GOLD_RESOURCE[5] = new DynamicResource(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC, IAddressMap.MAP_TYPE_AMAP, 0);
        GOLD_RESOURCE[6] = new DynamicResource("xquic", "xquic", 0);
        GOLD_RESOURCE[6] = new DynamicResource("artc_engine", "artc_engine", 0);
        GOLD_RESOURCE[7] = new DynamicResource("ALBiometricsJni", "ALBiometricsJni", 0);
        GOLD_RESOURCE[8] = new DynamicResource(c.TAOPAI_SDK_FEATURE, c.TAOPAI_SDK_FEATURE, 0);
        GOLD_RESOURCE[9] = new DynamicResource("PailitaoCUtil", "PailitaoCUtil", 0);
        GOLD_RESOURCE[10] = new DynamicResource("taobao_favorite_aar", "taobao_favorite_aar", 0);
        GOLD_RESOURCE[11] = new DynamicResource(WuKongNativeManager.b, WuKongNativeManager.b, 0);
        GOLD_RESOURCE[12] = new DynamicResource("ipatch", "ipatch", 0);
        GOLD_RESOURCE[13] = new DynamicResource("taobao_weex_adapter", "taobao_weex_adapter", 0);
        GOLD_RESOURCE[14] = new DynamicResource("rxandroid", "rxandroid", 0);
        GOLD_RESOURCE[15] = new DynamicResource("litecreator", "litecreator", 0);
        GOLD_RESOURCE[16] = new DynamicResource("ugc_core", "ugc_core", 0);
        GOLD_RESOURCE[17] = new DynamicResource("ugc_component_rate", "ugc_component_rate", 0);
        DynamicResource[] dynamicResourceArr2 = new DynamicResource[12];
        SLIVER_RESOURCES = dynamicResourceArr2;
        dynamicResourceArr2[0] = new DynamicResource("compressed_libwalle_base", "walle_base", 1);
        SLIVER_RESOURCES[1] = new DynamicResource("triver_taobao", "triver_taobao", 1);
        SLIVER_RESOURCES[2] = new DynamicResource("TBSubscribe", "TBSubscribe", 1);
        SLIVER_RESOURCES[3] = new DynamicResource(e.BTYPE, e.BTYPE, 1);
        SLIVER_RESOURCES[4] = new DynamicResource("taobao_wangxin", "taobao_wangxin", 1);
        SLIVER_RESOURCES[5] = new DynamicResource("messagesdkwrapper", "messagesdkwrapper", 1);
        SLIVER_RESOURCES[6] = new DynamicResource("bhx_cxx", "bhx_cxx", 1);
        SLIVER_RESOURCES[7] = new DynamicResource("MNN", "MNN", 1);
        SLIVER_RESOURCES[8] = new DynamicResource("AliNNPython", "AliNNPython", 1);
        SLIVER_RESOURCES[9] = new DynamicResource("fcanvas_v8_jsi", "fcanvas_v8_jsi", 1);
        SLIVER_RESOURCES[10] = new DynamicResource("dwebp", "dwebp", 1);
        SLIVER_RESOURCES[11] = new DynamicResource("pexwebp", "pexwebp", 1);
    }

    public static DynamicResource getVIPDynamicResourceInfo(String str) {
        DynamicResource[] dynamicResourceArr;
        DynamicResource[] dynamicResourceArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicResource) ipChange.ipc$dispatch("331d2684", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        for (DynamicResource dynamicResource : GOLD_RESOURCE) {
            if (str.contains(dynamicResource.fileName)) {
                return dynamicResource;
            }
        }
        for (DynamicResource dynamicResource2 : SLIVER_RESOURCES) {
            if (str.contains(dynamicResource2.fileName)) {
                return dynamicResource2;
            }
        }
        return null;
    }

    public static boolean isDownloadCompleted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8607e467", new Object[]{new Integer(i)})).booleanValue();
        }
        DynamicResource[] dynamicResourceArr = null;
        if (i == 0) {
            dynamicResourceArr = GOLD_RESOURCE;
        } else if (i == 1) {
            dynamicResourceArr = SLIVER_RESOURCES;
        }
        if (dynamicResourceArr != null) {
            for (DynamicResource dynamicResource : dynamicResourceArr) {
                if (!dynamicResource.isDownloadCompleted) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getResourceScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea0335ec", new Object[]{str})).intValue();
        }
        if (str.contains("taobao_wangxin.so") || str.contains("messagesdkwrapper.so")) {
            return 1;
        }
        if (str.contains("triver_taobao.so") || str.contains("libkernelu4_7z_uc.so")) {
            return 2;
        }
        return (str.contains("taopai_business.so") || str.contains("libpixelai.so") || str.contains("libtaopai-jni.so")) ? 3 : 0;
    }
}
