package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class PublishConfig implements Parcelable {
    public static final Parcelable.Creator<PublishConfig> CREATOR;
    private AspectRatio aspectRatio;
    private String bizCode;
    private String bizLine;
    private String bizScene;
    private boolean enablePosture;
    private int facing;
    private String finishButtonText;
    private boolean isAutoUpload;
    private boolean isMultiable;
    private boolean isRequestCompress;
    private boolean isRequestCrop;
    private boolean isRequestFilter;
    private boolean isRequestGraffiti;
    private boolean isRequestMosaic;
    private boolean isRequestOriginal;
    private boolean isRequestSticker;
    private boolean isRequestThumbnail;
    private boolean isUseNewUi;
    private int maxImageSize;
    private int maxMultiCount;
    private int maxStickerCount;
    private int maxVideoDuration;
    private int maxVideoSize;
    private String mediaType;
    private String mode;
    private BitmapSize targetSize;
    private BitmapSize thumbSize;
    private String version;
    private String videoBizCode;
    private int windowMode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PublishConfig() {
        this.targetSize = new BitmapSize();
        this.thumbSize = new BitmapSize();
        this.isUseNewUi = false;
        this.mediaType = "image";
        this.maxVideoSize = 104857600;
        this.maxImageSize = com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE;
        this.maxVideoDuration = -1;
    }

    public PublishConfig(a aVar) {
        this.targetSize = new BitmapSize();
        this.thumbSize = new BitmapSize();
        this.isUseNewUi = false;
        this.mediaType = "image";
        this.maxVideoSize = 104857600;
        this.maxImageSize = com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE;
        this.maxVideoDuration = -1;
        this.isRequestCrop = a.a(aVar);
        this.isRequestFilter = a.b(aVar);
        this.isRequestThumbnail = a.c(aVar);
        this.targetSize = a.d(aVar);
        this.thumbSize = a.e(aVar);
        this.isRequestCompress = a.f(aVar);
        this.isMultiable = a.g(aVar);
        this.maxMultiCount = a.h(aVar);
        this.aspectRatio = a.i(aVar);
        this.bizCode = a.j(aVar);
        this.isRequestSticker = a.k(aVar);
        this.maxStickerCount = a.l(aVar);
        this.isRequestOriginal = a.m(aVar);
        this.isRequestGraffiti = a.n(aVar);
        this.isRequestMosaic = a.o(aVar);
        this.version = a.p(aVar);
        this.facing = a.q(aVar);
        this.enablePosture = a.r(aVar);
        this.windowMode = a.s(aVar);
        this.isAutoUpload = a.t(aVar);
        this.isUseNewUi = a.u(aVar);
        this.bizLine = a.v(aVar);
        this.bizScene = a.w(aVar);
        this.videoBizCode = a.x(aVar);
        this.mediaType = a.y(aVar);
        this.maxVideoSize = a.z(aVar);
        this.maxImageSize = a.A(aVar);
        this.maxVideoDuration = a.B(aVar);
        this.mode = a.C(aVar);
        this.finishButtonText = a.D(aVar);
    }

    public String getFinishButtonText() {
        return this.finishButtonText;
    }

    public void setFinishButtonText(String str) {
        this.finishButtonText = str;
    }

    public int getMaxImageSize() {
        return this.maxImageSize;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public int getMaxVideoDuration() {
        return this.maxVideoDuration;
    }

    public int getMaxVideoSize() {
        return this.maxVideoSize;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMode() {
        return this.mode;
    }

    public String getVideoBizCode() {
        return this.videoBizCode;
    }

    public boolean isAutoUpload() {
        return this.isAutoUpload;
    }

    public boolean isUseNewUi() {
        return this.isUseNewUi;
    }

    public boolean isRequestCrop() {
        return this.isRequestCrop;
    }

    public void setRequestCrop(boolean z) {
        this.isRequestCrop = z;
    }

    public boolean isRequestFilter() {
        return this.isRequestFilter;
    }

    public void setRequestFilter(boolean z) {
        this.isRequestFilter = z;
    }

    public boolean isRequestCompress() {
        return this.isRequestCompress;
    }

    @Deprecated
    public void setRequestCompress(boolean z) {
        this.isRequestCompress = z;
    }

    public boolean isRequestThumbnail() {
        return this.isRequestThumbnail;
    }

    @Deprecated
    public void setRequestThumbnail(boolean z) {
        this.isRequestThumbnail = z;
    }

    public BitmapSize getTargetSize() {
        return this.targetSize;
    }

    public void setTargetSize(BitmapSize bitmapSize) {
        this.targetSize = bitmapSize;
    }

    public BitmapSize getThumbSize() {
        return this.thumbSize;
    }

    @Deprecated
    public void setThumbSize(BitmapSize bitmapSize) {
        this.thumbSize = bitmapSize;
    }

    public boolean isMultiable() {
        return this.isMultiable;
    }

    public void setMultiable(boolean z) {
        this.isMultiable = z;
    }

    public int getMaxMultiCount() {
        return this.maxMultiCount;
    }

    public void setMaxMultiCount(int i) {
        this.maxMultiCount = i;
    }

    public AspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public boolean isRequestSticker() {
        return this.isRequestSticker;
    }

    public void setRequestSticker(boolean z) {
        this.isRequestSticker = z;
    }

    public int getMaxStickerCount() {
        return this.maxStickerCount;
    }

    public void setMaxStickerCount(int i) {
        this.maxStickerCount = i;
    }

    public void setRequestOriginal(boolean z) {
        this.isRequestOriginal = z;
    }

    public boolean isRequestOriginal() {
        return this.isRequestOriginal;
    }

    public boolean isRequestGraffiti() {
        return this.isRequestGraffiti;
    }

    public void setRequestGraffiti(boolean z) {
        this.isRequestGraffiti = z;
    }

    public boolean isRequestMosaic() {
        return this.isRequestMosaic;
    }

    public void setRequestMosaic(boolean z) {
        this.isRequestMosaic = z;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public int getFacing() {
        return this.facing;
    }

    public void setFacing(int i) {
        this.facing = i;
    }

    public boolean isEnablePosture() {
        return this.enablePosture;
    }

    public void setEnablePosture(boolean z) {
        this.enablePosture = z;
    }

    public int getWindowMode() {
        return this.windowMode;
    }

    public void setWindowMode(int i) {
        this.windowMode = i;
    }

    public static PublishConfig createDefault() {
        return new PublishConfig(new a());
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String A;
        private int B;
        private boolean C;
        private int D;

        /* renamed from: a  reason: collision with root package name */
        private boolean f17609a;
        private String c;
        private String d;
        private String e;
        private String f;
        private String k;
        private String l;
        private int t;
        private AspectRatio u;
        private boolean b = false;
        private String g = "image";
        private int h = com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE;
        private int i = 104857600;
        private int j = -1;
        private boolean m = true;
        private boolean n = true;
        private boolean o = true;
        private BitmapSize p = new BitmapSize();
        private BitmapSize q = new BitmapSize();
        private boolean r = true;
        private boolean s = false;
        private boolean v = false;
        private int w = 5;
        private boolean x = false;
        private boolean y = false;
        private boolean z = false;

        static {
            kge.a(-488564248);
        }

        public static /* synthetic */ int A(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64d9069e", new Object[]{aVar})).intValue() : aVar.h;
        }

        public static /* synthetic */ int B(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1c61dbd", new Object[]{aVar})).intValue() : aVar.j;
        }

        public static /* synthetic */ String C(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("319c0ed7", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ String D(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("654a3998", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27bea8f", new Object[]{aVar})).booleanValue() : aVar.m;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f6901ae", new Object[]{aVar})).booleanValue() : aVar.n;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c5618cd", new Object[]{aVar})).booleanValue() : aVar.o;
        }

        public static /* synthetic */ BitmapSize d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BitmapSize) ipChange.ipc$dispatch("6964bad", new Object[]{aVar}) : aVar.p;
        }

        public static /* synthetic */ BitmapSize e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BitmapSize) ipChange.ipc$dispatch("a1deeae", new Object[]{aVar}) : aVar.q;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c31d5e2a", new Object[]{aVar})).booleanValue() : aVar.r;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("500a7549", new Object[]{aVar})).booleanValue() : aVar.s;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dcf78c57", new Object[]{aVar})).intValue() : aVar.t;
        }

        public static /* synthetic */ AspectRatio i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AspectRatio) ipChange.ipc$dispatch("e67a02a1", new Object[]{aVar}) : aVar.u;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1124923e", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83bed1c5", new Object[]{aVar})).booleanValue() : aVar.v;
        }

        public static /* synthetic */ int l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10abe8d3", new Object[]{aVar})).intValue() : aVar.w;
        }

        public static /* synthetic */ boolean m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d990003", new Object[]{aVar})).booleanValue() : aVar.x;
        }

        public static /* synthetic */ boolean n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a861722", new Object[]{aVar})).booleanValue() : aVar.y;
        }

        public static /* synthetic */ boolean o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7732e41", new Object[]{aVar})).booleanValue() : aVar.z;
        }

        public static /* synthetic */ String p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("473992c4", new Object[]{aVar}) : aVar.A;
        }

        public static /* synthetic */ int q(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d14d5c6e", new Object[]{aVar})).intValue() : aVar.B;
        }

        public static /* synthetic */ boolean r(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e3a739e", new Object[]{aVar})).booleanValue() : aVar.C;
        }

        public static /* synthetic */ int s(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb278aac", new Object[]{aVar})).intValue() : aVar.D;
        }

        public static /* synthetic */ boolean t(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7814a1dc", new Object[]{aVar})).booleanValue() : aVar.f17609a;
        }

        public static /* synthetic */ boolean u(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("501b8fb", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ String v(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d4e934a", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String w(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b0fcbe0b", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String x(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4aae8cc", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String y(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1859138d", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ int z(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5a32c85", new Object[]{aVar})).intValue() : aVar.i;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c012fcf", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6c1ef195", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9fcd1c56", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e8ee46ee", new Object[]{this, new Boolean(z)});
            }
            this.f17609a = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("75db5e0d", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d37b4717", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("72971d8", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3ad79c99", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e85c75a", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9d67867e", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a549d9d", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b741b4bc", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2c8752c", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        @Deprecated
        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8fb58c4b", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public a a(BitmapSize bitmapSize) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ce73550a", new Object[]{this, bitmapSize});
            }
            this.p = bitmapSize;
            return this;
        }

        @Deprecated
        public a b(BitmapSize bitmapSize) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d1faf80b", new Object[]{this, bitmapSize});
            }
            this.o = true;
            this.q = bitmapSize;
            return this;
        }

        @Deprecated
        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1ca2a36a", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a98fba89", new Object[]{this, new Boolean(z)});
            }
            this.s = z;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("442ecbdb", new Object[]{this, new Integer(i)});
            }
            this.t = i;
            return this;
        }

        public a a(AspectRatio aspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eb1ee769", new Object[]{this, aspectRatio});
            }
            this.u = aspectRatio;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a233f21b", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("367cd1a8", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c369e8c7", new Object[]{this, new Boolean(z)});
            }
            this.y = z;
            return this;
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5056ffe6", new Object[]{this, new Boolean(z)});
            }
            this.z = z;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d11be2fa", new Object[]{this, new Integer(i)});
            }
            this.B = i;
            return this;
        }

        public PublishConfig a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PublishConfig) ipChange.ipc$dispatch("6d97f728", new Object[]{this}) : new PublishConfig(this);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isRequestCrop ? 1 : 0);
        parcel.writeInt(this.isRequestFilter ? 1 : 0);
        parcel.writeInt(this.isRequestCompress ? 1 : 0);
        parcel.writeInt(this.isRequestThumbnail ? 1 : 0);
        parcel.writeParcelable(this.targetSize, 1);
        parcel.writeParcelable(this.thumbSize, 1);
        parcel.writeInt(this.isMultiable ? 1 : 0);
        parcel.writeInt(this.maxMultiCount);
        parcel.writeParcelable(this.aspectRatio, 1);
        parcel.writeString(this.bizCode);
        parcel.writeInt(this.isRequestSticker ? 1 : 0);
        parcel.writeInt(this.maxStickerCount);
        parcel.writeInt(this.isRequestOriginal ? 1 : 0);
        parcel.writeInt(this.isRequestGraffiti ? 1 : 0);
        parcel.writeInt(this.isRequestMosaic ? 1 : 0);
        parcel.writeString(this.version);
        parcel.writeInt(this.facing);
        parcel.writeInt(this.enablePosture ? 1 : 0);
        parcel.writeInt(this.windowMode);
    }

    static {
        kge.a(-53287919);
        kge.a(1630535278);
        CREATOR = new Parcelable.Creator<PublishConfig>() { // from class: com.taobao.interact.publish.service.PublishConfig.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.interact.publish.service.PublishConfig] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ PublishConfig createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c057b5b", new Object[]{this, parcel}) : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], com.taobao.interact.publish.service.PublishConfig[]] */
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ PublishConfig[] newArray(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("aaa7de04", new Object[]{this, new Integer(i)}) : a(i);
            }

            public PublishConfig[] a(int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (PublishConfig[]) ipChange.ipc$dispatch("f11a7bf6", new Object[]{this, new Integer(i)}) : new PublishConfig[i];
            }

            public PublishConfig a(Parcel parcel) {
                IpChange ipChange = $ipChange;
                boolean z = false;
                if (ipChange instanceof IpChange) {
                    return (PublishConfig) ipChange.ipc$dispatch("a6472805", new Object[]{this, parcel});
                }
                PublishConfig publishConfig = new PublishConfig();
                publishConfig.isRequestCrop = parcel.readInt() == 1;
                publishConfig.isRequestFilter = parcel.readInt() == 1;
                publishConfig.isRequestCompress = parcel.readInt() == 1;
                publishConfig.isRequestThumbnail = parcel.readInt() == 1;
                publishConfig.targetSize = (BitmapSize) parcel.readParcelable(BitmapSize.class.getClassLoader());
                publishConfig.thumbSize = (BitmapSize) parcel.readParcelable(BitmapSize.class.getClassLoader());
                publishConfig.isMultiable = parcel.readInt() == 1;
                publishConfig.maxMultiCount = parcel.readInt();
                publishConfig.aspectRatio = (AspectRatio) parcel.readParcelable(AspectRatio.class.getClassLoader());
                publishConfig.bizCode = parcel.readString();
                publishConfig.isRequestSticker = parcel.readInt() == 1;
                publishConfig.maxStickerCount = parcel.readInt();
                publishConfig.isRequestOriginal = parcel.readInt() == 1;
                publishConfig.isRequestGraffiti = parcel.readInt() == 1;
                publishConfig.isRequestMosaic = parcel.readInt() == 1;
                publishConfig.version = parcel.readString();
                publishConfig.facing = parcel.readInt();
                if (parcel.readInt() == 1) {
                    z = true;
                }
                publishConfig.enablePosture = z;
                publishConfig.windowMode = parcel.readInt();
                return publishConfig;
            }
        };
    }
}
