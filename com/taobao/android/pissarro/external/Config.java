package com.taobao.android.pissarro.external;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class Config implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARTWORK_MODE = 1;
    public static final int ARTWORK_OR_CLOP_MODE = 2;
    public static final int CLIP_MODE = 0;
    public static final int DEFAULT_FACING_BACK = 0;
    public static final int DEFAULT_FACING_FRONT = 1;
    public static final int WINDOW_DIALOG_MODE = 0;
    public static final int WINDOW_PAGE_MODE = 1;
    private AspectRatio aspectRatio;
    private BitmapSize bitmapSize;
    private String bizCode;
    private String bizLine;
    private String bizScene;
    private int definitionMode;
    private boolean disableAlbumSelect;
    private boolean enableClip;
    private boolean enableFilter;
    private boolean enableGraffiti;
    private boolean enableMosaic;
    private boolean enablePosture;
    private boolean enableSticker;
    private int facing;
    private String finishButtonText;
    private boolean isAutoUpload;
    private boolean isSupportGif;
    private boolean isUseNewUi;
    private int maxImageSize;
    private int maxSelectCount;
    private int maxStickerCount;
    private int maxVideoDuration;
    private int maxVideoSize;
    private String mediaType;
    private String mode;
    private boolean multiple;
    private String returnPage;
    private List<String> stickerIds;
    private String videoBizCode;
    private int windowMode;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface DefaultFacing {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Mode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface WindowMode {
    }

    static {
        kge.a(1706233265);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    private Config(a aVar) {
        this.isUseNewUi = false;
        this.mediaType = "image";
        this.maxImageSize = com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE;
        this.maxVideoSize = 104857600;
        this.maxVideoDuration = -1;
        this.multiple = a.a(aVar);
        this.maxSelectCount = a.b(aVar);
        this.enableClip = a.c(aVar);
        this.aspectRatio = a.d(aVar);
        this.enableFilter = a.e(aVar);
        this.enableSticker = a.f(aVar);
        this.maxStickerCount = a.g(aVar);
        this.definitionMode = a.h(aVar);
        this.bitmapSize = a.i(aVar);
        this.enableGraffiti = a.j(aVar);
        this.enableMosaic = a.k(aVar);
        this.facing = a.l(aVar);
        this.isSupportGif = a.m(aVar);
        this.bizCode = a.n(aVar);
        this.enablePosture = a.o(aVar);
        this.windowMode = a.p(aVar);
        this.stickerIds = a.q(aVar);
        this.disableAlbumSelect = a.r(aVar);
        this.returnPage = a.s(aVar);
        this.isAutoUpload = a.t(aVar);
        this.isUseNewUi = a.u(aVar);
        this.bizLine = a.v(aVar);
        this.bizScene = a.w(aVar);
        this.videoBizCode = a.x(aVar);
        this.mediaType = a.y(aVar);
        this.maxVideoSize = a.z(aVar);
        this.maxVideoDuration = a.A(aVar);
        this.mode = a.B(aVar);
        this.finishButtonText = a.C(aVar);
        this.maxImageSize = a.D(aVar);
    }

    public String getReturnPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("735aa244", new Object[]{this}) : this.returnPage;
    }

    /* renamed from: clone */
    public Config m1010clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("90a1f504", new Object[]{this});
        }
        try {
            return (Config) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void setFinishButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c44c85", new Object[]{this, str});
        } else {
            this.finishButtonText = str;
        }
    }

    public AspectRatio getAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AspectRatio) ipChange.ipc$dispatch("6b40fb1d", new Object[]{this}) : this.aspectRatio;
    }

    public boolean isEnableClip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1ccde48", new Object[]{this})).booleanValue() : this.enableClip;
    }

    public boolean isEnableFilter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f48cb30", new Object[]{this})).booleanValue() : this.enableFilter;
    }

    public boolean isEnableSticker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40cb95bb", new Object[]{this})).booleanValue() : this.enableSticker;
    }

    public int getMaxSelectCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e1fc5f", new Object[]{this})).intValue() : this.maxSelectCount;
    }

    public int getMaxStickerCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("751d5f9a", new Object[]{this})).intValue() : this.maxStickerCount;
    }

    public boolean isMultiple() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1cb94e5", new Object[]{this})).booleanValue() : this.multiple;
    }

    public BitmapSize getBitmapSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapSize) ipChange.ipc$dispatch("bcd6949f", new Object[]{this}) : this.bitmapSize;
    }

    public int getMaxImageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5285d2e8", new Object[]{this})).intValue() : this.maxImageSize;
    }

    public int getDefinitionMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59e82d06", new Object[]{this})).intValue() : this.definitionMode;
    }

    public boolean isEnableGraffiti() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fea9940", new Object[]{this})).booleanValue() : this.enableGraffiti;
    }

    public boolean isEnableMosaic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56f75342", new Object[]{this})).booleanValue() : this.enableMosaic;
    }

    public int getFacing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("116a8f4a", new Object[]{this})).intValue() : this.facing;
    }

    public boolean isDisableAlbumSelect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e8abd18", new Object[]{this})).booleanValue() : this.disableAlbumSelect;
    }

    public void setMultiple(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269e85db", new Object[]{this, new Boolean(z)});
        } else {
            this.multiple = z;
        }
    }

    public void setMaxSelectCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a2c38b", new Object[]{this, new Integer(i)});
        } else {
            this.maxSelectCount = i;
        }
    }

    public void setEnableClip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344296d8", new Object[]{this, new Boolean(z)});
        } else {
            this.enableClip = z;
        }
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6604c5c3", new Object[]{this, aspectRatio});
        } else {
            this.aspectRatio = aspectRatio;
        }
    }

    public void setEnableFilter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456cf4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFilter = z;
        }
    }

    public void setEnableSticker(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0812535", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSticker = z;
        }
    }

    public void setMaxStickerCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e23748", new Object[]{this, new Integer(i)});
        } else {
            this.maxStickerCount = i;
        }
    }

    public void setDefinitionMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3162a7c4", new Object[]{this, new Integer(i)});
        } else {
            this.definitionMode = i;
        }
    }

    public String getFinishButtonText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f56c411", new Object[]{this}) : this.finishButtonText;
    }

    public void setBitmapSize(BitmapSize bitmapSize) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c136269", new Object[]{this, bitmapSize});
        } else {
            this.bitmapSize = bitmapSize;
        }
    }

    public void setEnableGraffiti(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ba16e0", new Object[]{this, new Boolean(z)});
        } else {
            this.enableGraffiti = z;
        }
    }

    public void setEnableMosaic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238f6f1e", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMosaic = z;
        }
    }

    public void setFacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24d4200", new Object[]{this, new Integer(i)});
        } else {
            this.facing = i;
        }
    }

    public boolean isSupportGif() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a099b4a", new Object[]{this})).booleanValue() : this.isSupportGif;
    }

    public void setSupportGif(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239d7a16", new Object[]{this, new Boolean(z)});
        } else {
            this.isSupportGif = z;
        }
    }

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : this.bizCode;
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public boolean isEnablePosture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93c4b7c6", new Object[]{this})).booleanValue() : this.enablePosture;
    }

    public void setEnablePosture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcac448a", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePosture = z;
        }
    }

    public int getWindowMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee9851a3", new Object[]{this})).intValue() : this.windowMode;
    }

    public void setWindowMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b48f0c7", new Object[]{this, new Integer(i)});
        } else {
            this.windowMode = i;
        }
    }

    public List<String> getStickerIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c104ef0f", new Object[]{this}) : this.stickerIds;
    }

    public void setStickerIds(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206fd935", new Object[]{this, list});
        } else {
            this.stickerIds = list;
        }
    }

    public static Config createDefault() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("7a82614c", new Object[0]) : new a().a();
    }

    public String getBizScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this}) : this.bizScene;
    }

    public String getBizLine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26095428", new Object[]{this}) : this.bizLine;
    }

    public int getMaxVideoDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34ebbb9b", new Object[]{this})).intValue() : this.maxVideoDuration;
    }

    public int getMaxVideoSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f12e1e08", new Object[]{this})).intValue() : this.maxVideoSize;
    }

    public String getMediaType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5a5b4171", new Object[]{this}) : this.mediaType;
    }

    public String getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24310680", new Object[]{this}) : this.mode;
    }

    public String getVideoBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2c1babe", new Object[]{this}) : this.videoBizCode;
    }

    public boolean isAutoUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b181dce5", new Object[]{this})).booleanValue() : this.isAutoUpload;
    }

    public boolean isUseNewUi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1249b62", new Object[]{this})).booleanValue() : this.isUseNewUi;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String C;
        private String D;
        private AspectRatio d;
        private BitmapSize h;
        private boolean m;
        private String n;
        private boolean o;
        private List<String> q;
        private String s;
        private boolean t;
        private String v;
        private String w;
        private String x;

        /* renamed from: a  reason: collision with root package name */
        private boolean f14656a = true;
        private int b = 9;
        private boolean c = false;
        private boolean e = false;
        private boolean f = false;
        private int g = 6;
        private int i = 2;
        private boolean j = false;
        private boolean k = false;
        private int l = 0;
        private int p = 0;
        private boolean r = false;
        private boolean u = false;
        private String y = "image";
        private int z = 104857600;
        private int A = com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE;
        private int B = -1;

        static {
            kge.a(206414728);
        }

        public static /* synthetic */ int A(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7b959be", new Object[]{aVar})).intValue() : aVar.B;
        }

        public static /* synthetic */ String B(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("233d99b6", new Object[]{aVar}) : aVar.C;
        }

        public static /* synthetic */ String C(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("148f2937", new Object[]{aVar}) : aVar.D;
        }

        public static /* synthetic */ int D(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("814328db", new Object[]{aVar})).intValue() : aVar.A;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2cca5af", new Object[]{aVar})).booleanValue() : aVar.f14656a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e0a53ffd", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7dda6d", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ AspectRatio d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AspectRatio) ipChange.ipc$dispatch("fa02239", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a2f0f2b", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9807a98a", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5e043d8", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3b8de37", new Object[]{aVar})).intValue() : aVar.i;
        }

        public static /* synthetic */ BitmapSize i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BitmapSize) ipChange.ipc$dispatch("9347c9f5", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ boolean j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f6a1306", new Object[]{aVar})).booleanValue() : aVar.j;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d42ad65", new Object[]{aVar})).booleanValue() : aVar.k;
        }

        public static /* synthetic */ int l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab1b47b3", new Object[]{aVar})).intValue() : aVar.l;
        }

        public static /* synthetic */ boolean m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8f3e223", new Object[]{aVar})).booleanValue() : aVar.m;
        }

        public static /* synthetic */ String n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9d4243e2", new Object[]{aVar}) : aVar.n;
        }

        public static /* synthetic */ boolean o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34a516e1", new Object[]{aVar})).booleanValue() : aVar.o;
        }

        public static /* synthetic */ int p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("627db12f", new Object[]{aVar})).intValue() : aVar.p;
        }

        public static /* synthetic */ List q(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("88c17d4c", new Object[]{aVar}) : aVar.q;
        }

        public static /* synthetic */ boolean r(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be2ee5fe", new Object[]{aVar})).booleanValue() : aVar.r;
        }

        public static /* synthetic */ String s(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53da1167", new Object[]{aVar}) : aVar.s;
        }

        public static /* synthetic */ boolean t(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19e01abc", new Object[]{aVar})).booleanValue() : aVar.t;
        }

        public static /* synthetic */ boolean u(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47b8b51b", new Object[]{aVar})).booleanValue() : aVar.u;
        }

        public static /* synthetic */ String v(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27cebfea", new Object[]{aVar}) : aVar.v;
        }

        public static /* synthetic */ String w(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("19204f6b", new Object[]{aVar}) : aVar.w;
        }

        public static /* synthetic */ String x(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a71deec", new Object[]{aVar}) : aVar.x;
        }

        public static /* synthetic */ String y(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbc36e6d", new Object[]{aVar}) : aVar.y;
        }

        public static /* synthetic */ int z(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2cf3b8e5", new Object[]{aVar})).intValue() : aVar.z;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c5213af", new Object[]{this, new Boolean(z)});
            }
            this.u = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff3e21f5", new Object[]{this, str});
            }
            this.D = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f08fb176", new Object[]{this, str});
            }
            this.C = str;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a2aae0e", new Object[]{this, new Boolean(z)});
            }
            this.t = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e1e140f7", new Object[]{this, str});
            }
            this.y = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d332d078", new Object[]{this, str});
            }
            this.w = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c4845ff9", new Object[]{this, str});
            }
            this.v = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b5d5ef7a", new Object[]{this, str});
            }
            this.x = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("242ed99e", new Object[]{this, new Integer(i)});
            }
            this.B = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("520773fd", new Object[]{this, new Integer(i)});
            }
            this.z = i;
            return this;
        }

        public a h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("651b1237", new Object[]{this, new Integer(i)});
            }
            this.A = i;
            return this;
        }

        public a a(AspectRatio aspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("38c88156", new Object[]{this, aspectRatio});
            }
            this.d = aspectRatio;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7803486d", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a5dbe2cc", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d3b47d2b", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("18d178a", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7fe00e5c", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("adb8a8bb", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2f65b1e9", new Object[]{this, new Boolean(z)});
            }
            this.f14656a = z;
            return this;
        }

        public a a(BitmapSize bitmapSize) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a56300fd", new Object[]{this, bitmapSize});
            }
            this.h = bitmapSize;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db91431a", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5d3e4c48", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8b16e6a7", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("969dd79", new Object[]{this, new Integer(i)});
            }
            this.l = i;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a7277efb", new Object[]{this, str});
            }
            this.n = str;
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b8ef8106", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public a g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("374277d8", new Object[]{this, new Integer(i)});
            }
            this.p = i;
            return this;
        }

        public Config a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("7d308008", new Object[]{this}) : new Config(this);
        }
    }
}
