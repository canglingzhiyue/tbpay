package com.taobao.android.fluid.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import tb.kge;
import tb.odz;

/* loaded from: classes5.dex */
public final class FluidInstanceConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_NAME_DEFAULT = "default";
    public static final String CONTAINER_NAME_GG_TAG3 = "ggtab3";
    public static final String CONTAINER_NAME_SHOP_LOFT = "shopLoft";
    public static final String GG_TYPE_NAME_COMMUNITY = "gg_community";
    public static final String GG_TYPE_NAME_VIDEO = "gg_video";
    private static final String SEPARTOR = "@";
    public static final String TAB_TYPE_FOLLOW = "newFollow";
    public static final String TAB_TYPE_LIVE = "live";
    public static final String TAB_TYPE_VIDEO = "video";
    private Integer actionbarHeight;
    private String bizGroupName;
    private String bizName;
    private String bizType;
    private Context context;
    private odz coverObject;
    private Boolean dynamicProfileMode;
    private String fluidOriginUrl;
    private e fluidServiceRegistry;
    private Uri fluidUrl;
    private Boolean fragmentMode;
    private Boolean fullscreenDisplay;
    private String guangGuangType;
    private Boolean hideTopLayout;
    private com.taobao.tao.flexbox.layoutmanager.container.f hostPageIntegererface;
    private Component hostTNodeComponent;
    private Integer muteTipCount;
    private Boolean needTransferAnimation;
    private Boolean onCreateToRequest;
    private String playScenes;
    private String preCoverKey;
    private Boolean preloadInstance;
    private FrameLayout rootContainer;
    private String spm;
    private String tab3CardType;
    private String tab3ComponentSource;
    private Boolean tab3DisableCache;
    private Boolean tab3FromIconStream;
    private Boolean tab3FromLauncher;
    private Boolean tab3Fullscreen;
    private Boolean tabInstance;
    private Integer topBarHeight;
    private Integer topBarY;
    private Integer transferAnimationHeight;
    private Integer transferAnimationWidth;
    private h utCallback;

    static {
        kge.a(1236868681);
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.container.f access$002(FluidInstanceConfig fluidInstanceConfig, com.taobao.tao.flexbox.layoutmanager.container.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.container.f) ipChange.ipc$dispatch("15b1b277", new Object[]{fluidInstanceConfig, fVar});
        }
        fluidInstanceConfig.hostPageIntegererface = fVar;
        return fVar;
    }

    public static /* synthetic */ Boolean access$1002(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e6e1d59a", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.needTransferAnimation = bool;
        return bool;
    }

    public static /* synthetic */ Component access$102(FluidInstanceConfig fluidInstanceConfig, Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("6a653b28", new Object[]{fluidInstanceConfig, component});
        }
        fluidInstanceConfig.hostTNodeComponent = component;
        return component;
    }

    public static /* synthetic */ Boolean access$1102(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f2815db", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3FromLauncher = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1202(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("376e561c", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.onCreateToRequest = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1302(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5fb4965d", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.dynamicProfileMode = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1402(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("87fad69e", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.hideTopLayout = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1502(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b04116df", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3Fullscreen = bool;
        return bool;
    }

    public static /* synthetic */ Uri access$1602(FluidInstanceConfig fluidInstanceConfig, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3291fb14", new Object[]{fluidInstanceConfig, uri});
        }
        fluidInstanceConfig.fluidUrl = uri;
        return uri;
    }

    public static /* synthetic */ String access$1702(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f5371ad", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.fluidOriginUrl = str;
        return str;
    }

    public static /* synthetic */ Integer access$1802(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d6af79f6", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.topBarHeight = num;
        return num;
    }

    public static /* synthetic */ odz access$1902(FluidInstanceConfig fluidInstanceConfig, odz odzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("e7463d8f", new Object[]{fluidInstanceConfig, odzVar});
        }
        fluidInstanceConfig.coverObject = odzVar;
        return odzVar;
    }

    public static /* synthetic */ FrameLayout access$2002(FluidInstanceConfig fluidInstanceConfig, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2d7b63a5", new Object[]{fluidInstanceConfig, frameLayout});
        }
        fluidInstanceConfig.rootContainer = frameLayout;
        return frameLayout;
    }

    public static /* synthetic */ Integer access$202(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("fe26e041", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.transferAnimationWidth = num;
        return num;
    }

    public static /* synthetic */ String access$2102(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0f7a46", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.playScenes = str;
        return str;
    }

    public static /* synthetic */ String access$2202(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2bad6c7", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.guangGuangType = str;
        return str;
    }

    public static /* synthetic */ e access$2302(FluidInstanceConfig fluidInstanceConfig, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d16909ca", new Object[]{fluidInstanceConfig, eVar});
        }
        fluidInstanceConfig.fluidServiceRegistry = eVar;
        return eVar;
    }

    public static /* synthetic */ String access$2402(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be118fc9", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.bizGroupName = str;
        return str;
    }

    public static /* synthetic */ Context access$2502(FluidInstanceConfig fluidInstanceConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d1993bf4", new Object[]{fluidInstanceConfig, context});
        }
        fluidInstanceConfig.context = context;
        return context;
    }

    public static /* synthetic */ Integer access$2602(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("66a4c153", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.muteTipCount = num;
        return num;
    }

    public static /* synthetic */ String access$2702(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f13a54c", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.tab3CardType = str;
        return str;
    }

    public static /* synthetic */ String access$2802(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54bf01cd", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.bizType = str;
        return str;
    }

    public static /* synthetic */ String access$2902(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a6a5e4e", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.bizName = str;
        return str;
    }

    public static /* synthetic */ Boolean access$3002(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a7e56558", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.preloadInstance = bool;
        return bool;
    }

    public static /* synthetic */ String access$302(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90cca7ba", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.tab3ComponentSource = str;
        return str;
    }

    public static /* synthetic */ Boolean access$3102(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d02ba599", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tabInstance = bool;
        return bool;
    }

    public static /* synthetic */ String access$3202(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c27b0a66", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.spm = str;
        return str;
    }

    public static /* synthetic */ String access$3302(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a82666e7", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.preCoverKey = str;
        return str;
    }

    public static /* synthetic */ Boolean access$3402(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("48fe665c", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3DisableCache = bool;
        return bool;
    }

    public static /* synthetic */ Integer access$3502(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1ee048f1", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.transferAnimationHeight = num;
        return num;
    }

    public static /* synthetic */ h access$402(FluidInstanceConfig fluidInstanceConfig, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("942298f7", new Object[]{fluidInstanceConfig, hVar});
        }
        fluidInstanceConfig.utCallback = hVar;
        return hVar;
    }

    public static /* synthetic */ Integer access$502(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("76f9a104", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.topBarY = num;
        return num;
    }

    public static /* synthetic */ Boolean access$602(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f1a43ef1", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.fullscreenDisplay = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$702(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("19ea7f32", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.fragmentMode = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$802(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4230bf73", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3FromIconStream = bool;
        return bool;
    }

    public static /* synthetic */ Integer access$902(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1812a208", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.actionbarHeight = num;
        return num;
    }

    public void append(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6ebc57", new Object[]{this, fluidInstanceConfig});
        } else if (fluidInstanceConfig == null) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.container.f fVar = fluidInstanceConfig.hostPageIntegererface;
            if (fVar != null) {
                this.hostPageIntegererface = fVar;
            }
            Component component = fluidInstanceConfig.hostTNodeComponent;
            if (component != null) {
                this.hostTNodeComponent = component;
            }
            Integer num = fluidInstanceConfig.transferAnimationWidth;
            if (num != null) {
                this.transferAnimationWidth = num;
            }
            String str = fluidInstanceConfig.tab3ComponentSource;
            if (str != null) {
                this.tab3ComponentSource = str;
            }
            h hVar = fluidInstanceConfig.utCallback;
            if (hVar != null) {
                this.utCallback = hVar;
            }
            Integer num2 = fluidInstanceConfig.topBarY;
            if (num2 != null) {
                this.topBarY = num2;
            }
            Boolean bool = fluidInstanceConfig.fullscreenDisplay;
            if (bool != null) {
                this.fullscreenDisplay = bool;
            }
            Boolean bool2 = fluidInstanceConfig.fragmentMode;
            if (bool2 != null) {
                this.fragmentMode = bool2;
            }
            Boolean bool3 = fluidInstanceConfig.tab3FromIconStream;
            if (bool3 != null) {
                this.tab3FromIconStream = bool3;
            }
            Integer num3 = fluidInstanceConfig.actionbarHeight;
            if (num3 != null) {
                this.actionbarHeight = num3;
            }
            Boolean bool4 = fluidInstanceConfig.needTransferAnimation;
            if (bool4 != null) {
                this.needTransferAnimation = bool4;
            }
            Boolean bool5 = fluidInstanceConfig.tab3FromLauncher;
            if (bool5 != null) {
                this.tab3FromLauncher = bool5;
            }
            Boolean bool6 = fluidInstanceConfig.onCreateToRequest;
            if (bool6 != null) {
                this.onCreateToRequest = bool6;
            }
            Boolean bool7 = fluidInstanceConfig.dynamicProfileMode;
            if (bool7 != null) {
                this.dynamicProfileMode = bool7;
            }
            Boolean bool8 = fluidInstanceConfig.hideTopLayout;
            if (bool8 != null) {
                this.hideTopLayout = bool8;
            }
            Boolean bool9 = fluidInstanceConfig.tab3Fullscreen;
            if (bool9 != null) {
                this.tab3Fullscreen = bool9;
            }
            Uri uri = fluidInstanceConfig.fluidUrl;
            if (uri != null) {
                this.fluidUrl = uri;
            }
            String str2 = fluidInstanceConfig.fluidOriginUrl;
            if (str2 != null) {
                this.fluidOriginUrl = str2;
            }
            Integer num4 = fluidInstanceConfig.topBarHeight;
            if (num4 != null) {
                this.topBarHeight = num4;
            }
            odz odzVar = fluidInstanceConfig.coverObject;
            if (odzVar != null) {
                this.coverObject = odzVar;
            }
            FrameLayout frameLayout = fluidInstanceConfig.rootContainer;
            if (frameLayout != null) {
                this.rootContainer = frameLayout;
            }
            String str3 = fluidInstanceConfig.playScenes;
            if (str3 != null) {
                this.playScenes = str3;
            }
            String str4 = fluidInstanceConfig.guangGuangType;
            if (str4 != null) {
                this.guangGuangType = str4;
            }
            e eVar = fluidInstanceConfig.fluidServiceRegistry;
            if (eVar != null) {
                this.fluidServiceRegistry = eVar;
            }
            String str5 = fluidInstanceConfig.bizGroupName;
            if (str5 != null) {
                this.bizGroupName = str5;
            }
            Context context = fluidInstanceConfig.context;
            if (context != null) {
                this.context = context;
            }
            Integer num5 = fluidInstanceConfig.muteTipCount;
            if (num5 != null) {
                this.muteTipCount = num5;
            }
            String str6 = fluidInstanceConfig.tab3CardType;
            if (str6 != null) {
                this.tab3CardType = str6;
            }
            String str7 = fluidInstanceConfig.bizType;
            if (str7 != null) {
                this.bizType = str7;
            }
            String str8 = fluidInstanceConfig.bizName;
            if (str8 != null) {
                this.bizName = str8;
            }
            Boolean bool10 = fluidInstanceConfig.preloadInstance;
            if (bool10 != null) {
                this.preloadInstance = bool10;
            }
            Boolean bool11 = fluidInstanceConfig.tabInstance;
            if (bool11 != null) {
                this.tabInstance = bool11;
            }
            String str9 = fluidInstanceConfig.preCoverKey;
            if (str9 != null) {
                this.preCoverKey = str9;
            }
            Boolean bool12 = fluidInstanceConfig.tab3DisableCache;
            if (bool12 != null) {
                this.tab3DisableCache = bool12;
            }
            Integer num6 = fluidInstanceConfig.transferAnimationHeight;
            if (num6 == null) {
                return;
            }
            this.transferAnimationHeight = num6;
        }
    }

    public int getActionbarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b54a6ce8", new Object[]{this})).intValue() : getIntValue(this.actionbarHeight);
    }

    public String getBizGroupName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("756588cc", new Object[]{this}) : this.bizGroupName;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.bizName;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.bizType;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.context;
    }

    public odz getCoverObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (odz) ipChange.ipc$dispatch("c5208eda", new Object[]{this}) : this.coverObject;
    }

    public String getFluidOriginUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3680c764", new Object[]{this}) : this.fluidOriginUrl;
    }

    public e getFluidServiceRegistry() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2282e689", new Object[]{this}) : this.fluidServiceRegistry;
    }

    public void setFluidServiceRegistry(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba960a3", new Object[]{this, eVar});
        } else {
            this.fluidServiceRegistry = eVar;
        }
    }

    public Uri getFluidUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d50538f9", new Object[]{this}) : this.fluidUrl;
    }

    public String getGuangGuangType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15143149", new Object[]{this}) : this.guangGuangType;
    }

    public com.taobao.tao.flexbox.layoutmanager.container.f getHostPageInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.container.f) ipChange.ipc$dispatch("38136b63", new Object[]{this}) : this.hostPageIntegererface;
    }

    public Component getHostTNodeComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("cf2b1ec7", new Object[]{this}) : this.hostTNodeComponent;
    }

    public int getMuteTipCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("769743dd", new Object[]{this})).intValue() : getIntValue(this.muteTipCount);
    }

    public String getPlayScenes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6667e5e8", new Object[]{this}) : this.playScenes;
    }

    public String getPreCoverKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c0b1464", new Object[]{this}) : this.preCoverKey;
    }

    public FrameLayout getRootContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("69e8e0c9", new Object[]{this}) : this.rootContainer;
    }

    public String getTab3CardType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e5e1f7b", new Object[]{this}) : this.tab3CardType;
    }

    public String getTab3ComponentSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9225d055", new Object[]{this}) : this.tab3ComponentSource;
    }

    public int getTopBarHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2aa02eb5", new Object[]{this})).intValue() : getIntValue(this.topBarHeight);
    }

    public int getTopBarY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b60e0f5f", new Object[]{this})).intValue() : getIntValue(this.topBarY);
    }

    public int getTransferAnimationHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e50379a4", new Object[]{this})).intValue() : getIntValue(this.transferAnimationHeight);
    }

    public int getTransferAnimationWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("161935d", new Object[]{this})).intValue() : getIntValue(this.transferAnimationWidth);
    }

    public h getUtCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("76b10182", new Object[]{this}) : this.utCallback;
    }

    public boolean isPreloadInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("974f89bf", new Object[]{this})).booleanValue() : getBooleanValue(this.preloadInstance);
    }

    public boolean isTabInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a724944b", new Object[]{this})).booleanValue() : getBooleanValue(this.tabInstance);
    }

    public boolean isDynamicProfileMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c957902", new Object[]{this})).booleanValue() : getBooleanValue(this.dynamicProfileMode);
    }

    public boolean isFragmentMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23c3e868", new Object[]{this})).booleanValue() : getBooleanValue(this.fragmentMode);
    }

    public boolean isFullscreenDisplay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a61b8688", new Object[]{this})).booleanValue() : getBooleanValue(this.fullscreenDisplay);
    }

    public boolean isHideTopLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b6aebbe", new Object[]{this})).booleanValue() : getBooleanValue(this.hideTopLayout);
    }

    public boolean isNeedTransferAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("55e3e2e4", new Object[]{this})).booleanValue() : getBooleanValue(this.needTransferAnimation);
    }

    public boolean isOnCreateToRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d6471a", new Object[]{this})).booleanValue() : getBooleanValue(this.onCreateToRequest);
    }

    public boolean isTab3DisableCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2bc4a8ad", new Object[]{this})).booleanValue() : getBooleanValue(this.tab3DisableCache);
    }

    public boolean isTab3FromIconStream() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2099d556", new Object[]{this})).booleanValue() : getBooleanValue(this.tab3FromIconStream);
    }

    public boolean isTab3FromLauncher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af24449d", new Object[]{this})).booleanValue() : getBooleanValue(this.tab3FromLauncher);
    }

    public boolean isTab3Fullscreen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70b4b86e", new Object[]{this})).booleanValue() : getBooleanValue(this.tab3Fullscreen);
    }

    private boolean getBooleanValue(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b5973eb", new Object[]{this, bool})).booleanValue();
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private int getIntValue(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("191f7f4b", new Object[]{this, num})).intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private String getSpm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this}) : this.spm;
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Boolean A;
        private String C;
        private Integer D;
        private Integer E;
        private String F;
        private Integer G;
        private Integer H;
        private Boolean I;
        private Boolean J;
        private Boolean K;

        /* renamed from: a  reason: collision with root package name */
        private Context f12438a;
        private com.taobao.tao.flexbox.layoutmanager.container.f b;
        private Component c;
        private h d;
        private FrameLayout e;
        private e f;
        private String g;
        private String h;
        private Boolean i;
        private String j;
        private String k;
        private String l;
        private String m;
        private Uri n;
        private Boolean o;
        private String p;
        private odz q;
        private Boolean r;
        private Integer s;
        private Integer t;
        private Boolean u;
        private Boolean v;
        private Boolean w;
        private Boolean x;
        private Boolean y;
        private String z;

        static {
            kge.a(-639263712);
        }

        private a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("43477d93", new Object[0]) : new a();
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47efec5d", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7b9e171e", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("af4c41df", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public FluidInstanceConfig b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FluidInstanceConfig) ipChange.ipc$dispatch("e6cd5931", new Object[]{this});
            }
            FluidInstanceConfig fluidInstanceConfig = new FluidInstanceConfig();
            FluidInstanceConfig.access$002(fluidInstanceConfig, this.b);
            FluidInstanceConfig.access$102(fluidInstanceConfig, this.c);
            FluidInstanceConfig.access$202(fluidInstanceConfig, this.s);
            FluidInstanceConfig.access$302(fluidInstanceConfig, this.C);
            FluidInstanceConfig.access$402(fluidInstanceConfig, this.d);
            FluidInstanceConfig.access$502(fluidInstanceConfig, this.H);
            FluidInstanceConfig.access$602(fluidInstanceConfig, this.w);
            FluidInstanceConfig.access$702(fluidInstanceConfig, this.u);
            FluidInstanceConfig.access$802(fluidInstanceConfig, this.J);
            FluidInstanceConfig.access$902(fluidInstanceConfig, this.E);
            FluidInstanceConfig.access$1002(fluidInstanceConfig, this.r);
            FluidInstanceConfig.access$1102(fluidInstanceConfig, this.I);
            FluidInstanceConfig.access$1202(fluidInstanceConfig, this.o);
            FluidInstanceConfig.access$1302(fluidInstanceConfig, this.v);
            FluidInstanceConfig.access$1402(fluidInstanceConfig, this.x);
            FluidInstanceConfig.access$1502(fluidInstanceConfig, this.y);
            FluidInstanceConfig.access$1602(fluidInstanceConfig, this.n);
            FluidInstanceConfig.access$1702(fluidInstanceConfig, this.m);
            FluidInstanceConfig.access$1802(fluidInstanceConfig, this.G);
            FluidInstanceConfig.access$1902(fluidInstanceConfig, this.q);
            FluidInstanceConfig.access$2002(fluidInstanceConfig, this.e);
            FluidInstanceConfig.access$2102(fluidInstanceConfig, this.l);
            FluidInstanceConfig.access$2202(fluidInstanceConfig, this.z);
            FluidInstanceConfig.access$2302(fluidInstanceConfig, this.f);
            FluidInstanceConfig.access$2402(fluidInstanceConfig, this.j);
            FluidInstanceConfig.access$2502(fluidInstanceConfig, this.f12438a);
            FluidInstanceConfig.access$2602(fluidInstanceConfig, this.D);
            FluidInstanceConfig.access$2702(fluidInstanceConfig, this.F);
            FluidInstanceConfig.access$2802(fluidInstanceConfig, this.g);
            FluidInstanceConfig.access$2902(fluidInstanceConfig, this.h);
            FluidInstanceConfig.access$3002(fluidInstanceConfig, this.i);
            FluidInstanceConfig.access$3102(fluidInstanceConfig, this.K);
            FluidInstanceConfig.access$3202(fluidInstanceConfig, this.k);
            FluidInstanceConfig.access$3302(fluidInstanceConfig, this.p);
            FluidInstanceConfig.access$3402(fluidInstanceConfig, this.A);
            FluidInstanceConfig.access$3502(fluidInstanceConfig, this.t);
            return fluidInstanceConfig;
        }

        public a a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d2aa3690", new Object[]{this, bool});
            }
            this.i = bool;
            return this;
        }

        public a m(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ebc05704", new Object[]{this, bool});
            }
            this.K = bool;
            return this;
        }

        public a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5616e98b", new Object[]{this, context});
            }
            this.f12438a = context;
            return this;
        }

        public a a(odz odzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5445b11e", new Object[]{this, odzVar});
            }
            this.q = odzVar;
            return this;
        }

        public a b(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("14c163ef", new Object[]{this, bool});
            }
            this.v = bool;
            return this;
        }

        public a a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("188d9837", new Object[]{this, eVar});
            }
            this.f = eVar;
            return this;
        }

        public a a(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6cb95800", new Object[]{this, str, uri});
            }
            this.m = str;
            this.n = uri;
            return this;
        }

        public a c(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("56d8914e", new Object[]{this, bool});
            }
            this.u = bool;
            return this;
        }

        public a d(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("98efbead", new Object[]{this, bool});
            }
            this.w = bool;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e2fa6ca0", new Object[]{this, str});
            }
            this.z = str;
            return this;
        }

        public a e(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db06ec0c", new Object[]{this, bool});
            }
            this.x = bool;
            return this;
        }

        public a a(Component component) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b5505bce", new Object[]{this, component});
            }
            this.c = component;
            return this;
        }

        public a a(com.taobao.tao.flexbox.layoutmanager.container.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df3b2eb3", new Object[]{this, fVar});
            }
            this.b = fVar;
            return this;
        }

        public a a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8407a0ba", new Object[]{this, num});
            }
            this.D = num;
            return this;
        }

        public a f(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1d1e196b", new Object[]{this, bool});
            }
            this.r = bool;
            return this;
        }

        public a g(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f3546ca", new Object[]{this, bool});
            }
            this.o = bool;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("16a89761", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a56c222", new Object[]{this, str});
            }
            this.p = str;
            return this;
        }

        public a a(FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("814a4996", new Object[]{this, frameLayout});
            }
            this.e = frameLayout;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7e04ece3", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b1b317a4", new Object[]{this, str});
            }
            this.F = str;
            return this;
        }

        public a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e5614265", new Object[]{this, str});
            }
            this.C = str;
            return this;
        }

        public a h(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a14c7429", new Object[]{this, bool});
            }
            this.A = bool;
            return this;
        }

        public a j(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("257acee7", new Object[]{this, bool});
            }
            this.J = bool;
            return this;
        }

        public a k(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6791fc46", new Object[]{this, bool});
            }
            this.I = bool;
            return this;
        }

        public a l(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a9a929a5", new Object[]{this, bool});
            }
            this.y = bool;
            return this;
        }

        public a b(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c61ece19", new Object[]{this, num});
            }
            this.G = num;
            return this;
        }

        public a c(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("835fb78", new Object[]{this, num});
            }
            this.H = num;
            return this;
        }

        public a d(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a4d28d7", new Object[]{this, num});
            }
            this.t = num;
            return this;
        }

        public a e(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8c645636", new Object[]{this, num});
            }
            this.s = num;
            return this;
        }

        public a a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c3090d4", new Object[]{this, hVar});
            }
            this.d = hVar;
            return this;
        }
    }

    public static String appendBizName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f8d37eb", new Object[]{str}) : appendBizName(str, null);
    }

    public static String appendBizName(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("817b7ea1", new Object[]{str, str2}) : appendBizName(str, str2, null);
    }

    public static String appendBizName(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31c5c3d7", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (TextUtils.isEmpty(str3)) {
            return str + "_" + str2;
        }
        return str + "_" + str2 + "@" + str3;
    }

    public static String getPreloadBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b5236e4", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }
}
