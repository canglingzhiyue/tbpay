package com.taobao.android.fluid.framework.data.remote;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.f;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTION_ORDER = "collectionContentOrder";
    public static final String KEY_ASAC = "asac";
    public static final String KEY_BX_FEATURE = "bxFeature";
    public static final String KEY_CLOSE_WANNA_SEE = "closeWannaSee";
    public static final String KEY_CONTENT_PASSPARAMS = "contentPassParams";
    public static final String KEY_DATA_SOURCE = "dataSource";
    public static final String KEY_ENABLE_SERVER_ABR = "enableServerABR";
    public static final String KEY_FROMLAUNCHER = "fromLauncher";
    public static final String KEY_ISAUTOSLIDE = "isAutoSlide";
    public static final String KEY_ISGGPICKPRELOAD = "isGGPickPreload";
    public static final String KEY_ISSIMPLEPAGE = "isSimplePage";
    public static final String KEY_IS_PRELOAD_FILL = "isPreloadFill";
    public static final String KEY_LBS_DATA = "lbsData";
    public static final String KEY_NETWORK_SPEED = "networkSpeed";
    public static final String KEY_PAGE = "page";
    public static final String KEY_REFRESH_MODE = "refreshMode";
    public static final String KEY_REFRESH_TYPE = "refresh_type";
    public static final String KEY_SPM_URL = "spm-url";
    public static final String KEY_SWITCH_MODE = "switchMode";
    public static final String KEY_TAB3COMPONENTSOURCE = "tab3ComponentSource";
    public static final String KEY_VERTICAL_LAYOUT = "enableVerticalLayout";

    static {
        kge.a(1439620177);
    }

    public a a(sps spsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cedd3af0", new Object[]{this, spsVar}) : new a(spsVar);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map f12536a = new HashMap();
        public final sps b;

        static {
            kge.a(-301870951);
        }

        public a(sps spsVar) {
            this.b = spsVar;
        }

        public Map a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f12536a;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9e8e2d09", new Object[]{this});
            }
            if (this.b == null) {
                return this;
            }
            this.f12536a.put("spm-cnt", "a310p.13800399");
            this.f12536a.put("spm-url", this.b.e);
            this.f12536a.put("page", this.b.c);
            this.f12536a.put("product_type", com.taobao.android.fluid.business.usertrack.track.b.PRODUCT_NAME);
            this.f12536a.put("sourcePageName", this.b.w);
            HashMap hashMap = new HashMap();
            hashMap.put("sourcePageName", this.b.w);
            this.f12536a.put("echoParam", hashMap);
            if (!StringUtils.isEmpty(this.b.i)) {
                this.f12536a.put(com.taobao.android.fluid.framework.data.remote.a.KEY_DETAIL_PARAMETERS, this.b.i);
            }
            this.f12536a.put("scene", this.b.x);
            this.f12536a.put("miniAppId", this.b.y);
            if (!StringUtils.isEmpty(this.b.J)) {
                this.f12536a.put(aw.PARAM_UT_PARAMS, this.b.J);
            }
            this.f12536a.put("tbvs_version", 31);
            this.f12536a.put(com.taobao.android.shop.features.category.b.REQ_SUPPORTWEEX, true);
            this.f12536a.put(c.KEY_FROMLAUNCHER, Boolean.valueOf(i.b("video")));
            this.f12536a.put(c.KEY_ISSIMPLEPAGE, Boolean.valueOf(i.g()));
            this.f12536a.put(FluidSDK.FLUID_SDK_FLAG, "1");
            this.f12536a.put(f.FLUID_SDK_REMOTE_VERSION, f.FLUID_SDK_REMOTE_VERSION_VALUE);
            spz.c("RequestParam", "setLauncher islauncher=" + i.b("video") + ",issimple=" + i.g());
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("be017ca6", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                this.f12536a.put(c.KEY_IS_PRELOAD_FILL, true);
            }
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29e16a20", new Object[]{this, str});
            }
            if (str != null) {
                this.f12536a.put("bxFeature", str);
            }
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e39585a7", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                this.f12536a.put("refreshType", "edit");
            }
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9298ea8", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                this.f12536a.put(c.KEY_ENABLE_SERVER_ABR, true);
            }
            return this;
        }

        public a a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("40073a55", new Object[]{this, map});
            }
            if (map != null) {
                spz.c("RequestParam", "setExtendParams extendParams=" + map);
                this.f12536a.putAll(map);
            }
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4452633f", new Object[]{this, str});
            }
            if (str != null) {
                this.f12536a.put(c.KEY_LBS_DATA, str);
            }
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ebd97a9", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                this.f12536a.put("exclVinfo", "true");
            }
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("22e1417", new Object[]{this, new Integer(i)});
            }
            spz.c("RequestParam", "request detail buildExtendParameters netSpeedValue=" + i);
            this.f12536a.put(c.KEY_NETWORK_SPEED, i >= 0 ? Integer.valueOf(i) : null);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5ec35c5e", new Object[]{this, str});
            }
            if (str != null) {
                this.f12536a.put(c.KEY_REFRESH_TYPE, str);
            }
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5451a0aa", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                this.f12536a.put(c.KEY_ISGGPICKPRELOAD, "true");
            }
            return this;
        }
    }
}
