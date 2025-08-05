package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.image.d;
import com.taobao.tao.util.TaobaoImageUrlStrategy;

@Deprecated
/* loaded from: classes8.dex */
public class TBImageUrlStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String END_IMAGE_URL = "END_IMAGE_URL";

    /* renamed from: com.taobao.tao.util.TBImageUrlStrategy$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21170a = new int[CutType.values().length];

        static {
            try {
                f21170a[CutType.xz.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum CutType {
        xz("xz"),
        non("");
        
        String mCutType;

        CutType(String str) {
            this.mCutType = "";
            this.mCutType = str;
        }

        public String getCutType() {
            return this.mCutType;
        }
    }

    /* loaded from: classes8.dex */
    public enum ImageQuality {
        q90(ImageAdapter.IMAGE_QUALITY_Q90),
        q75("q75"),
        q60("q60"),
        q50("q50"),
        q30("q30"),
        non("");
        
        String mImageQuality;

        ImageQuality(String str) {
            this.mImageQuality = "";
            this.mImageQuality = str;
        }

        public String getImageQuality() {
            return this.mImageQuality;
        }
    }

    /* loaded from: classes8.dex */
    public enum ImageSharpen {
        s100("s100"),
        s110("s110"),
        s120("s120"),
        s130("s130"),
        s140("s140"),
        s150("s150"),
        non("");
        
        String mImageSharpen;

        ImageSharpen(String str) {
            this.mImageSharpen = "";
            this.mImageSharpen = str;
        }

        public String getImageSharpen() {
            return this.mImageSharpen;
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static final TBImageUrlStrategy instance = new TBImageUrlStrategy(null);
    }

    public void setQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aa2133f", new Object[]{this, new Integer(i)});
        }
    }

    public /* synthetic */ TBImageUrlStrategy(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* loaded from: classes8.dex */
    public static class Area {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String mArea;
        public static final Area search = new Area("search");
        public static final Area detail = new Area("detail");
        public static final Area shop = new Area("shop");
        public static final Area weitao = new Area(ImageStrategyConfig.WEITAO);
        public static final Area weapp = new Area(ImageStrategyConfig.WEAPP);
        public static final Area weappsharpen = new Area(ImageStrategyConfig.WEAPPSHARPEN);
        public static final Area bala = new Area(ImageStrategyConfig.BALA);
        public static final Area home = new Area("home");
        public static final Area tbchannel = new Area(ImageStrategyConfig.TBCHANNEL);
        public static final Area guangguang = new Area("guangguang");
        public static final Area non = new Area("default");

        private Area(String str) {
            this.mArea = "";
            this.mArea = str;
        }

        public String getArea() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("160cc5d6", new Object[]{this}) : this.mArea;
        }
    }

    private TBImageUrlStrategy() {
    }

    public static TBImageUrlStrategy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBImageUrlStrategy) ipChange.ipc$dispatch("db9db891", new Object[0]) : a.instance;
    }

    public String decideUrl10000Height(String str, int i, Area area, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96c548ed", new Object[]{this, str, new Integer(i), area, new Long(j)}) : decideUrl(str, i, area, j, 0, 10000, CutType.non);
    }

    public String decideUrl10000Width(String str, int i, Area area, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad69d278", new Object[]{this, str, new Integer(i), area, new Long(j)}) : decideUrl(str, i, area, j, 10000, 0, CutType.non);
    }

    @Deprecated
    public String decideLowNetUrl(String str, int i, Area area, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e9a5c06d", new Object[]{this, str, new Integer(i), area, cutType}) : decideUrl(str, i, area, 0L, -1, -1, cutType, true, true, true);
    }

    @Deprecated
    public String decideLowNetUrl(String str, int i, Area area, CutType cutType, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d373b359", new Object[]{this, str, new Integer(i), area, cutType, str2, str3}) : decideUrl(str, i, area, 0L, -1, -1, cutType, true, true, true);
    }

    @Deprecated
    public String decideLowNetUrl(String str, int i, Area area, CutType cutType, long j, int i2, int i3, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8dd4a51", new Object[]{this, str, new Integer(i), area, cutType, new Long(j), new Integer(i2), new Integer(i3), str2, str3, new Boolean(z)}) : decideUrl(str, i, area, j, i2, i3, cutType, z, true, true);
    }

    public String decideUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57aca635", new Object[]{this, str, new Integer(i)}) : decideUrl(str, i, Area.non, 0L, -1, -1, CutType.non);
    }

    public String decideUrl(String str, int i, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26c06a20", new Object[]{this, str, new Integer(i), cutType}) : decideUrl(str, i, Area.non, 0L, -1, -1, cutType);
    }

    public String decideUrl(String str, int i, Area area) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6e261b9", new Object[]{this, str, new Integer(i), area}) : decideUrl(str, i, area, 0L, -1, -1, CutType.non);
    }

    public String decideUrl(String str, int i, Area area, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e8a9463", new Object[]{this, str, new Integer(i), area, new Long(j)}) : decideUrl(str, i, area, j, -1, -1, CutType.non);
    }

    public String decideUrl(String str, int i, Area area, long j, int i2, int i3, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8104b2e", new Object[]{this, str, new Integer(i), area, new Long(j), new Integer(i2), new Integer(i3), cutType}) : decideUrl(str, i, area, j, i2, i3, cutType, true, true, true);
    }

    public String decideUrl(String str, int i, Area area, long j, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14b72429", new Object[]{this, str, new Integer(i), area, new Long(j), new Boolean(z), new Boolean(z2), new Boolean(z3)}) : decideUrl(str, i, area, j, -1, -1, CutType.non, z, z2, z3);
    }

    private String decideUrl(String str, int i, Area area, long j, int i2, int i3, CutType cutType, boolean z, boolean z2, boolean z3) {
        TaobaoImageUrlStrategy.CutType cutType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e429f57e", new Object[]{this, str, new Integer(i), area, new Long(j), new Integer(i2), new Integer(i3), cutType, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (!TaobaoImageUrlStrategy.getInstance().isCdnImage(str)) {
            d.c(d.COMMON_TAG, "origin not cdn url:%s", str);
            return str;
        }
        if (AnonymousClass1.f21170a[cutType.ordinal()] == 1) {
            cutType2 = TaobaoImageUrlStrategy.CutType.xz;
        } else {
            cutType2 = TaobaoImageUrlStrategy.CutType.non;
        }
        TaobaoImageUrlStrategy.CutType cutType3 = cutType2;
        return TaobaoImageUrlStrategy.getInstance().decideUrl(str, i, area.getArea(), cutType3, i2, i3, z, z2, z3) + "END_IMAGE_URL";
    }

    public String convergenceUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e88631", new Object[]{this, str}) : TaobaoImageUrlStrategy.getInstance().convergenceUrl(str);
    }
}
