package com.taobao.themis.ability.basic.container;

import android.net.Uri;
import android.os.Looper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsContainerAbility;
import com.taobao.android.abilityidl.ability.ContainerSwiperSwitchDetail;
import com.taobao.android.abilityidl.ability.ContainerTabSwitchDetail;
import com.taobao.android.abilityidl.ability.ContainerWindowSize;
import com.taobao.android.abilityidl.ability.aa;
import com.taobao.android.abilityidl.ability.ab;
import com.taobao.android.abilityidl.ability.ac;
import com.taobao.android.abilityidl.ability.ad;
import com.taobao.android.abilityidl.ability.ae;
import com.taobao.android.abilityidl.ability.af;
import com.taobao.android.abilityidl.ability.ag;
import com.taobao.android.abilityidl.ability.ah;
import com.taobao.android.abilityidl.ability.ai;
import com.taobao.android.abilityidl.ability.aj;
import com.taobao.android.abilityidl.ability.ak;
import com.taobao.android.abilityidl.ability.al;
import com.taobao.android.abilityidl.ability.bj;
import com.taobao.android.abilityidl.ability.bk;
import com.taobao.android.abilityidl.ability.bl;
import com.taobao.android.abilityidl.ability.bm;
import com.taobao.android.abilityidl.ability.bn;
import com.taobao.android.abilityidl.ability.s;
import com.taobao.android.abilityidl.ability.u;
import com.taobao.android.abilityidl.ability.w;
import com.taobao.android.abilityidl.ability.x;
import com.taobao.android.abilityidl.ability.z;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.ability.c;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.extension.page.f;
import com.taobao.themis.kernel.extension.page.n;
import com.taobao.themis.kernel.extension.page.r;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.i;
import com.taobao.themis.kernel.utils.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.gml;
import tb.kge;
import tb.mto;
import tb.qpm;
import tb.qqc;
import tb.rnc;
import tb.sug;
import tb.suj;
import tb.tbz;
import tb.tca;
import tb.tcb;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010\"\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010(\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010*\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020+2\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u0002022\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u00103\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u00105\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u0002062\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u00107\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u0002082\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u00109\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020:2\u0006\u0010\u0007\u001a\u00020\rH\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010<\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020=2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010>\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010?\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020@2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010A\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\rH\u0016J \u0010C\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020\rH\u0016¨\u0006E"}, d2 = {"Lcom/taobao/themis/ability/basic/container/TMSContainerAbility;", "Lcom/taobao/android/abilityidl/ability/AbsContainerAbility;", "()V", "addPageResizeListener", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "callback", "Lcom/taobao/android/abilityidl/ability/IContainerPageResizeEvents;", "addSwiperItem", MUSMonitor.MODULE_DIM_ABILITY, "params", "Lcom/taobao/android/abilityidl/ability/ContainerAddSwiperItemParams;", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "addSwiperSwitchListener", "Lcom/taobao/android/abilityidl/ability/IContainerSwiperSwitchEvents;", "addTabItem", "Lcom/taobao/android/abilityidl/ability/ContainerAddTabBarModelParams;", "addTabSwitchListener", "Lcom/taobao/android/abilityidl/ability/IContainerTabSwitchEvents;", "disableInterceptPageClose", "getInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "hideErrorPage", "hideSwiperHeader", "hideTab", "config", "Lcom/taobao/android/abilityidl/ability/ContainerTabBarAnimationConfig;", "interceptPageClose", "Lcom/taobao/android/abilityidl/ability/IContainerPageCloseEvents;", "interceptTabBarClick", "Lcom/taobao/android/abilityidl/ability/IContainerTabBarClickInterceptEvents;", "preRenderSubPage", "Lcom/taobao/android/abilityidl/ability/ContainerPreRenderSubPageParams;", "registerPage", "Lcom/taobao/android/abilityidl/ability/ContainerRegisterPageParams;", "removePageResizeListener", "removeSwiperItem", "Lcom/taobao/android/abilityidl/ability/ContainerRemoveSwiperItemParams;", "removeSwiperSwitchListener", "removeTabBarBadge", "Lcom/taobao/android/abilityidl/ability/ContainerTabBarBadgeRemoveParams;", "removeTabItem", "Lcom/taobao/android/abilityidl/ability/ContainerRemoveTabItemParams;", "removeTabSwitchListener", "reportSubPagePreRenderStatus", "Lcom/taobao/android/abilityidl/ability/ContainerSubPagePreRenderStatusParams;", "setOrientation", "Lcom/taobao/android/abilityidl/ability/ContainerSetOrientationParams;", "setPageBgColor", "Lcom/taobao/android/abilityidl/ability/ContainerColor;", "setSwiperEnable", "Lcom/taobao/android/abilityidl/ability/ContainerSetSwiperEnableParams;", "setTabBarBadge", "Lcom/taobao/android/abilityidl/ability/ContainerTabBarBadgeSetParams;", "setTabBarItem", "Lcom/taobao/android/abilityidl/ability/ContainerSetTabBarModelParams;", "setTabBarMode", "Lcom/taobao/android/abilityidl/ability/ContainerTabBarStyleParams;", "showErrorPage", "showSwiperHeader", "Lcom/taobao/android/abilityidl/ability/ContainerShowSwiperHeaderParams;", "showTab", "slideTo", "Lcom/taobao/android/abilityidl/ability/ContainerSlideToParams;", "switchTab", "Lcom/taobao/android/abilityidl/ability/ContainerTabSwitchParams;", "swizzleTab", "Lcom/taobao/android/abilityidl/ability/ContainerSwizzleTabParams;", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSContainerAbility extends AbsContainerAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/ability/basic/container/TMSContainerAbility$addPageResizeListener$1", "Lcom/taobao/themis/kernel/ability/TMSMegaEventManager$EventListener;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "", "event", "", "params", "Lcom/alibaba/fastjson/JSON;", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bk f22287a;

        public a(bk bkVar) {
            this.f22287a = bkVar;
        }

        @Override // com.taobao.themis.kernel.ability.c.a
        public void a(String event, JSON json) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
                return;
            }
            q.d(event, "event");
            if (!(json instanceof JSONObject)) {
                this.f22287a.a(a$a.e(null));
                return;
            }
            bk bkVar = this.f22287a;
            ContainerWindowSize containerWindowSize = new ContainerWindowSize();
            JSONObject jSONObject = (JSONObject) json;
            Double d = jSONObject.getDouble("windowWidth");
            double d2 = mto.a.GEO_NOT_SUPPORT;
            containerWindowSize.width = Double.valueOf(d != null ? d.doubleValue() : 0.0d);
            Double d3 = jSONObject.getDouble("windowHeight");
            if (d3 != null) {
                d2 = d3.doubleValue();
            }
            containerWindowSize.height = Double.valueOf(d2);
            t tVar = t.INSTANCE;
            bkVar.a(containerWindowSize);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/taobao/themis/ability/basic/container/TMSContainerAbility$addSwiperSwitchListener$1$1", "Lcom/taobao/themis/kernel/extension/page/swiper/ISwiperSwitchListener;", "onSwiperSwitch", "", "tabIndex", "", "swiperIndex", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements tcb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bl f22288a;

        public b(bl blVar) {
            this.f22288a = blVar;
        }

        @Override // tb.tcb
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ContainerSwiperSwitchDetail containerSwiperSwitchDetail = new ContainerSwiperSwitchDetail();
            containerSwiperSwitchDetail.tabIndex = Integer.valueOf(i);
            containerSwiperSwitchDetail.swiperIndex = Integer.valueOf(i2);
            this.f22288a.a(containerSwiperSwitchDetail);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/taobao/themis/ability/basic/container/TMSContainerAbility$interceptTabBarClick$1$listener$1", "Lcom/taobao/themis/kernel/extension/page/tab/TabItemClickListener;", "onClick", "", "index", "", "originUrl", "", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements com.taobao.themis.kernel.extension.page.tab.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bm f22289a;

        public c(bm bmVar) {
            this.f22289a = bmVar;
        }

        @Override // com.taobao.themis.kernel.extension.page.tab.b
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            ContainerTabSwitchDetail containerTabSwitchDetail = new ContainerTabSwitchDetail();
            containerTabSwitchDetail.index = Integer.valueOf(i);
            containerTabSwitchDetail.result = Integer.valueOf(i);
            containerTabSwitchDetail.fromURL = str;
            this.f22289a.a(containerTabSwitchDetail);
        }
    }

    static {
        kge.a(-501846375);
    }

    public static /* synthetic */ Object ipc$super(TMSContainerAbility tMSContainerAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private final f a(als alsVar, gml gmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a70916c1", new Object[]{this, alsVar, gmlVar});
        }
        f b2 = com.taobao.themis.kernel.utils.a.b(alsVar);
        if (b2 == null) {
            if (gmlVar != null) {
                gmlVar.a(a$a.f("容器实例未找到"));
            }
            return null;
        } else if (b2.i() != TMSContainerType.EMBEDDED) {
            return b2;
        } else {
            if (gmlVar != null) {
                gmlVar.a(a$a.g("容器能力未实现"));
            }
            return null;
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addPageResizeListener(als context, bk callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fee7f3", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (a(context, callback) == null) {
            return;
        }
        com.taobao.themis.kernel.ability.c.a(RVEvents.WINDOW_RESIZE, new a(callback));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void hideErrorPage(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528a7fce", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        f a2 = a(context, callback);
        if (a2 == null) {
            return;
        }
        a2.n();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void hideSwiperHeader(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67c3cc0", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (a(context, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        while (a2 != null) {
            tca tcaVar = (tca) a2.a(tca.class);
            if (tcaVar != null) {
                tcaVar.j();
                return;
            } else {
                n nVar = (n) a2.a(n.class);
                a2 = nVar != null ? nVar.a() : null;
            }
        }
        callback.a(a$a.g(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removePageResizeListener(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be34c4d4", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        com.taobao.themis.kernel.ability.c.a(RVEvents.WINDOW_RESIZE);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addTabSwitchListener(als ability, bn callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc74f5f4", new Object[]{this, ability, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
        } else {
            v.a(new TMSContainerAbility$addTabSwitchListener$1(callback));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeTabSwitchListener(als ability, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d263312", new Object[]{this, ability, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
        } else {
            v.a();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void showTab(als ability, ah config, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b1d99f", new Object[]{this, ability, config, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(config, "config");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
        } else {
            v.e();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void hideTab(als ability, ah config, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf6c7fa", new Object[]{this, ability, config, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(config, "config");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
        } else {
            v.f();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void switchTab(als ability, al params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568451c4", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
            return;
        }
        Integer it = params.f8783a;
        if (it == null) {
            return;
        }
        q.b(it, "it");
        suj.a.a(v, it.intValue(), null, 2, null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void preRenderSubPage(als context, w params, gml callback) {
        AppManifest.Performance c2;
        List<String> prerenderSubPageWhiteList;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7160e69", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        f a2 = a(context, callback);
        if (a2 == null) {
            return;
        }
        if (TMSSolutionType.getType(a2) != TMSSolutionType.UNIAPP) {
            callback.a(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "该 API 仅 UniApp 支持"));
            return;
        }
        sug sugVar = (sug) a2.b(sug.class);
        if (sugVar == null) {
            callback.a(a$a.g("仅UniApp支持预渲染"));
            return;
        }
        com.taobao.themis.kernel.container.a x = a2.x();
        if (x != null && (c2 = x.c()) != null && (prerenderSubPageWhiteList = c2.getPrerenderSubPageWhiteList()) != null) {
            Uri parse = Uri.parse(params.f8898a);
            q.b(parse, "Uri.parse(\n             ….pageID\n                )");
            if (p.a((Iterable<? extends String>) prerenderSubPageWhiteList, parse.getPath())) {
                if (!sugVar.a()) {
                    callback.a(new ErrorResult("PRERENDER_POOL_FULL", "预渲染池中已存在页面实例"));
                    return;
                }
                String str2 = params.f8898a;
                q.b(str2, "params.pageID");
                List b2 = kotlin.text.n.b((CharSequence) str2, new String[]{"?"}, false, 0, 6, (Object) null);
                if (b2.size() == 2) {
                    str2 = (String) b2.get(0);
                    str = (String) b2.get(1);
                } else {
                    str = null;
                }
                String str3 = str;
                com.taobao.themis.kernel.container.b b3 = o.b(a2, str2);
                String b4 = b3 != null ? b3.b() : null;
                if (b4 == null) {
                    callback.a(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "预渲染出现预期外的系统异常"));
                    return;
                }
                String a3 = i.a(i.INSTANCE, b4, str3, null, null, 12, null);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "isPreRender", (String) true);
                ITMSPage a4 = a2.m().a(str2, (Window) null, a3, jSONObject);
                if (a4 == null) {
                    callback.a(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "预渲染出现预期外的系统异常"));
                    return;
                }
                com.taobao.themis.kernel.extension.page.f fVar = (com.taobao.themis.kernel.extension.page.f) a4.a(com.taobao.themis.kernel.extension.page.f.class);
                if (fVar != null) {
                    f.a.a(fVar, null, null, null, null, null, 31, null);
                }
                a4.h();
                sugVar.a(a4);
                return;
            }
        }
        callback.a(new ErrorResult("PRERENDER_PERMISSION_INVALID", "未申请预渲染权限"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void reportSubPagePreRenderStatus(als context, af params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f40659", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        com.taobao.themis.kernel.f a2 = a(context, callback);
        if (a2 == null) {
            return;
        }
        if (TMSSolutionType.getType(a2) != TMSSolutionType.UNIAPP) {
            callback.a(new ErrorResult("PRERENDER_UNKNOWN_SYSTEM_ERROR", "该 API 仅 UniApp 支持"));
            return;
        }
        sug sugVar = (sug) a2.b(sug.class);
        if (sugVar == null) {
            callback.a(a$a.g("仅UniApp支持预渲染"));
            return;
        }
        ITMSPage a3 = com.taobao.themis.kernel.utils.a.a(context);
        if (a3 == null) {
            callback.a(a$a.d(null));
        } else if (!params.f8777a) {
        } else {
            sugVar.b(a3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r5.equals("unknown") != false) goto L21;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOrientation(tb.als r4, com.taobao.android.abilityidl.ability.er r5, tb.gml r6) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.ability.basic.container.TMSContainerAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            java.lang.String r4 = "8e8cef8f"
            r0.ipc$dispatch(r4, r1)
            return
        L1b:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r4, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.q.d(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.q.d(r6, r0)
            com.taobao.themis.kernel.page.ITMSPage r4 = com.taobao.themis.kernel.utils.a.a(r4)
            r0 = 0
            if (r4 != 0) goto L3a
            com.alibaba.ability.result.ErrorResult r4 = com.alibaba.ability.result.a$a.d(r0)
            r6.a(r4)
            return
        L3a:
            java.lang.Class<com.taobao.themis.kernel.extension.page.w> r1 = com.taobao.themis.kernel.extension.page.w.class
            java.lang.Object r4 = r4.a(r1)
            com.taobao.themis.kernel.extension.page.w r4 = (com.taobao.themis.kernel.extension.page.w) r4
            if (r4 != 0) goto L4c
            com.alibaba.ability.result.ErrorResult r4 = com.alibaba.ability.result.a$a.g(r0)
            r6.a(r4)
            return
        L4c:
            java.lang.String r5 = r5.f8850a
            if (r5 != 0) goto L51
            goto L8a
        L51:
            int r1 = r5.hashCode()
            switch(r1) {
                case -1626174665: goto L7b;
                case -284840886: goto L71;
                case 729267099: goto L65;
                case 1430647483: goto L59;
                default: goto L58;
            }
        L58:
            goto L8a
        L59:
            java.lang.String r0 = "landscape"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8a
            com.taobao.themis.kernel.container.Window$Orientation r0 = com.taobao.themis.kernel.container.Window.Orientation.LANDSCAPE
            goto L86
        L65:
            java.lang.String r0 = "portrait"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8a
            com.taobao.themis.kernel.container.Window$Orientation r0 = com.taobao.themis.kernel.container.Window.Orientation.PORTRAIT
            goto L86
        L71:
            java.lang.String r1 = "unknown"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8a
            goto L86
        L7b:
            java.lang.String r0 = "unspecified"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L8a
            com.taobao.themis.kernel.container.Window$Orientation r0 = com.taobao.themis.kernel.container.Window.Orientation.UNSPECIFIED
        L86:
            r4.a(r0)
            return
        L8a:
            java.lang.String r4 = "orientation参数无法识别"
            com.alibaba.ability.result.ErrorResult r4 = com.alibaba.ability.result.a$a.b(r4)
            r6.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.container.TMSContainerAbility.setOrientation(tb.als, com.taobao.android.abilityidl.ability.er, tb.gml):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setTabBarMode(als ability, ak params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cf3627", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
            return;
        }
        String str = params.f8782a;
        q.b(str, "params.mode");
        if (v.a(str)) {
            return;
        }
        callback.a(a$a.f(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setTabBarItem(als ability, ac params, gml callback) {
        QueryPass queryPass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d31e689f", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
            return;
        }
        x xVar = params.e;
        if (xVar != null) {
            queryPass = new QueryPass();
            queryPass.setAllow(xVar.f8899a);
            queryPass.setIgnore(xVar.b);
        } else {
            queryPass = null;
        }
        TabBarItem tabBarItem = new TabBarItem();
        tabBarItem.setPageId(params.b);
        tabBarItem.setIconNormal(params.c);
        tabBarItem.setIconSelected(params.d);
        tabBarItem.setQueryPass(queryPass);
        if (v.a(params.f8774a, tabBarItem)) {
            return;
        }
        callback.a(a$a.e(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void swizzleTab(als ability, ag params, gml callback) {
        suj sujVar;
        suj v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54420e9f", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 != null) {
            n nVar = (n) a2.a(n.class);
            ITMSPage a3 = nVar != null ? nVar.a() : null;
            if (a3 != null && (v = qqc.v(a3)) != null) {
                v.a(params.f8778a, params.b);
                return;
            } else if (a3 != null && (sujVar = (suj) a3.a(suj.class)) != null) {
                sujVar.a(params.f8778a, params.b);
                return;
            }
        }
        callback.a(a$a.g("未找到 TabExtension"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void interceptTabBarClick(als ability, bm params) {
        suj sujVar;
        suj v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09ab201", new Object[]{this, ability, params});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 != null) {
            c cVar = new c(params);
            n nVar = (n) a2.a(n.class);
            ITMSPage a3 = nVar != null ? nVar.a() : null;
            if (a3 != null && (v = qqc.v(a3)) != null) {
                v.a(cVar);
                return;
            } else if (a3 != null && (sujVar = (suj) a3.a(suj.class)) != null) {
                sujVar.a(cVar);
                return;
            }
        }
        params.a(a$a.g("未找到 TabExtension"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setTabBarBadge(als ability, aj params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6939808", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        q.b(mainLooper, "Looper.getMainLooper()");
        if (!q.a(currentThread, mainLooper.getThread())) {
            callback.a(a$a.c("this api must be called in the main thread"));
            return;
        }
        int i = params.f8781a;
        String str = params.b;
        q.b(str, "params.text");
        if (v.a(i, str)) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeTabBarBadge(als ability, ai params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d4cc7", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        q.b(mainLooper, "Looper.getMainLooper()");
        if (!q.a(currentThread, mainLooper.getThread())) {
            callback.a(a$a.c("this api must be called in the main thread"));
        } else if (v.b(params.f8780a)) {
        } else {
            callback.a(a$a.g("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeTabItem(als ability, aa params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6575e6d2", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
        } else if (v.c(params.f8772a)) {
        } else {
            callback.a(a$a.e(null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
        if (r5.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_white) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (r5.equals("light") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r5 = com.taobao.themis.kernel.container.Window.Theme.LIGHT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
        if (r5.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_black) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        if (r5.equals("dark") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r5 = com.taobao.themis.kernel.container.Window.Theme.DARK;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void registerPage(tb.als r34, com.taobao.android.abilityidl.ability.y r35, tb.gml r36) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.container.TMSContainerAbility.registerPage(tb.als, com.taobao.android.abilityidl.ability.y, tb.gml):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addSwiperSwitchListener(als ability, bl params) {
        tbz tbzVar;
        List<tcb> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc548bfb", new Object[]{this, ability, params});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        com.taobao.themis.kernel.f a3 = a(ability, null);
        if (a3 == null || (tbzVar = (tbz) a3.b(tbz.class)) == null || (a2 = tbzVar.a()) == null) {
            return;
        }
        a2.add(new b(params));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addTabItem(als ability, com.taobao.android.abilityidl.ability.t params, gml callback) {
        QueryPass queryPass;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe7801b", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        suj v = qqc.v(a2);
        if (v == null) {
            callback.a(a$a.e(null));
            return;
        }
        TabBarItem tabBarItem = new TabBarItem();
        tabBarItem.setPageId(params.b);
        tabBarItem.setIconNormal(params.c);
        tabBarItem.setIconSelected(params.d);
        x xVar = params.e;
        if (xVar != null) {
            queryPass = new QueryPass();
            queryPass.setAllow(xVar.f8899a);
            queryPass.setIgnore(xVar.b);
        } else {
            queryPass = null;
        }
        tabBarItem.setQueryPass(queryPass);
        if (v.b(params.f8895a, tabBarItem)) {
            return;
        }
        callback.a(a$a.e(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeSwiperSwitchListener(als ability, gml callback) {
        List<tcb> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8954d1fd", new Object[]{this, ability, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(callback, "callback");
        com.taobao.themis.kernel.f a3 = a(ability, callback);
        if (a3 == null) {
            return;
        }
        tbz tbzVar = (tbz) a3.b(tbz.class);
        if (tbzVar != null && (a2 = tbzVar.a()) != null) {
            a2.clear();
        } else {
            callback.a(a$a.g("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void slideTo(als ability, ae params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8585736", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability, params.b);
        if (a2 == null) {
            callback.a(a$a.d("tab 页面没找到"));
            return;
        }
        tca tcaVar = (tca) a2.a(tca.class);
        if (tcaVar == null) {
            callback.a(a$a.g("swiper 页面没找到"));
        } else if (tcaVar.a(params.f8776a)) {
        } else {
            callback.a(a$a.b("slide to swiper failed"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void showSwiperHeader(als ability, ad params, gml callback) {
        n nVar;
        ITMSPage a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae98f00d", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a3 = com.taobao.themis.kernel.utils.a.a(ability);
        tca tcaVar = (a3 == null || (nVar = (n) a3.a(n.class)) == null || (a2 = nVar.a()) == null) ? null : (tca) a2.a(tca.class);
        if (tcaVar == null) {
            callback.a(a$a.g("swiperExtension not found"));
            return;
        }
        String str = params.f8775a;
        q.b(str, "params.headerPageId");
        if (tcaVar.a(str, params.b)) {
            return;
        }
        callback.a(a$a.b("show swiper header failed"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setSwiperEnable(als ability, ab params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9becfcea", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability, params.b);
        if (a2 == null) {
            callback.a(a$a.d("tab 页面没找到"));
            return;
        }
        tca tcaVar = (tca) a2.a(tca.class);
        if (tcaVar == null) {
            callback.a(a$a.g("swiper 页面没找到"));
        } else {
            tcaVar.a(params.f8773a);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void addSwiperItem(als ability, s params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ba5a17", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability, params.c);
        if (a2 == null) {
            callback.a(a$a.d("tab 页面没找到"));
            return;
        }
        tca tcaVar = (tca) a2.a(tca.class);
        if (tcaVar == null) {
            callback.a(a$a.g("swiper 页面没找到"));
            return;
        }
        int i = params.f8894a;
        String str = params.b;
        q.b(str, "params.pageId");
        if (tcaVar.a(i, str)) {
            return;
        }
        callback.a(a$a.b("add swiper item failed"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void removeSwiperItem(als ability, z params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed25e26d", new Object[]{this, ability, params, callback});
            return;
        }
        q.d(ability, "ability");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(ability, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(ability, params.f8901a);
        if (a2 == null) {
            callback.a(a$a.d("tab 页面没找到"));
            return;
        }
        tca tcaVar = (tca) a2.a(tca.class);
        if (tcaVar == null) {
            callback.a(a$a.g("swiper 页面没找到"));
        } else if (tcaVar.b(params.b)) {
        } else {
            callback.a(a$a.b("remove swiper item failed"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void setPageBgColor(als context, u params, gml callback) {
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5b3cd4", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (a(context, callback) == null) {
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        String str = params.f8896a;
        q.b(str, "params.color");
        qpm f = a2.f();
        if (f == null || (pageContainer = f.getPageContainer()) == null) {
            return;
        }
        pageContainer.a(str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void showErrorPage(als context, gml callback) {
        rnc pageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c3fff3", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        com.taobao.themis.kernel.f a2 = a(context, callback);
        if (a2 == null) {
            return;
        }
        if (com.taobao.themis.kernel.utils.n.ci()) {
            ITMSPage a3 = com.taobao.themis.kernel.utils.a.a(context);
            if (a3 == null) {
                callback.a(a$a.d("容器页面未找到"));
                return;
            }
            qpm f = a3.f();
            if (f == null || (pageContainer = f.getPageContainer()) == null) {
                return;
            }
            pageContainer.a(new e("TMS_ERR_CUSTOM", a2.h() + ", show Error", "对不起，加载失败，请尝试重新打开当前页面"));
            return;
        }
        a2.a(new e("TMS_ERR_CUSTOM", a2.h() + ", show Error", "对不起，加载失败，请尝试重新打开当前页面"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void interceptPageClose(als context, bj callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be74fe3", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        if (com.taobao.themis.kernel.utils.n.bN()) {
            if (a2.b().j() == TMSSolutionType.UNIAPP) {
                String e = a2.b().e();
                q.b(e, "page.getInstance().uniAppId");
                if (!com.taobao.themis.kernel.utils.n.k(e)) {
                    callback.a(a$a.e("无权调用回退拦截"));
                    return;
                }
            } else if (!com.taobao.themis.kernel.utils.n.l(a2.e())) {
                callback.a(a$a.e("无权调用回退拦截"));
                return;
            }
        }
        if (a2.a(com.taobao.themis.kernel.extension.page.s.class) == null) {
            callback.a(a$a.g("不支持回退拦截"));
            return;
        }
        r rVar = (r) a2.a(r.class);
        if (rVar == null) {
            callback.a(a$a.g("不支持回退拦截"));
        } else {
            rVar.a(callback);
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContainerAbility
    public void disableInterceptPageClose(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b460848", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
        } else if (a2.a(com.taobao.themis.kernel.extension.page.s.class) == null) {
            callback.a(a$a.g("不支持回退拦截"));
        } else {
            r rVar = (r) a2.a(r.class);
            if (rVar == null) {
                callback.a(a$a.g("不支持回退拦截"));
            } else {
                rVar.a();
            }
        }
    }
}
