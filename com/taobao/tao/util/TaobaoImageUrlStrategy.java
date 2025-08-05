package com.taobao.tao.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import anet.channel.util.HttpConstant;
import com.alibaba.security.realidentity.x2;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.image.c;
import com.taobao.tao.util.ImageStrategyExtra;
import java.util.HashMap;
import tb.ado;
import tb.jzk;
import tb.mto;

/* loaded from: classes.dex */
public class TaobaoImageUrlStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AVIF_DOMAIN_DEST = "avif.picasso.taobao.com";
    private static final float DEFAULT_LEVEL_RATIO = 0.1f;
    private static final String HEIF_DOMAIN_DEST = "heic.alicdn.com";
    private static final String SHORT_SCALE = "O1CN";
    private static final String SPECIAL_DOMAIN_DEST = "picasso.alicdn.com";
    private int[] mAvifBizWhiteList;
    private int[] mHeifBizWhiteList;
    private boolean mIsNetworkSlow;
    private long mLastUpdateTime;
    private HashMap<String, ServiceImageSwitch> mServiceImageSwitchList;
    private static final int[] CDN = {16, 20, 24, 30, 32, 36, 40, 48, 50, 60, 64, 70, 72, 80, 88, 90, 100, 110, 120, 125, 128, 130, jzk.INSTALL_PROVIDER, 160, 170, 180, 190, 200, 210, 220, 230, 234, 240, 250, 270, Result.ALIPAY_GENERATE_UNREG_NODE_FAILED, 300, 310, 315, 320, 336, 350, 360, 400, 430, 460, 468, 480, 490, x2.o, 560, 570, 580, 600, 640, 670, 720, 728, 760, 960, 970};
    private static final int[] CDN10000Width = {110, 150, 170, 220, 240, Result.ALIPAY_GENERATE_UNREG_NODE_FAILED, 450, 570, 580, 620, 790};
    private static final int[] CDN10000Height = {170, 220, 340, 500};
    private static final int[] XZCDN = {72, 88, 90, 100, 110, 120, jzk.INSTALL_PROVIDER, 160, 170, 180, 200, 230, 240, 270, Result.ALIPAY_GENERATE_UNREG_NODE_FAILED, 310, 320, 360, 430, 460, 580, 640};
    private static final int[] LEVEL_MODEL_CDN = {90, 110, 200, 320, 460, 600, 760, 960, 1200};
    private static final int[] LEVEL_MODEL_XZCDN = {90, 110, 200, 320, 460, 640};
    private static final String[] FUZZY_EXCLUDE_PATH = {"getAvatar"};
    private static final String DOMAIN_DEST = "gw.alicdn.com";
    private static final String[] DEFAULT_CDN_DOMAIN_WHITE_LIST = {DOMAIN_DEST};
    private static final String[] LOOSE_CDN_DOMAIN_WHITE_LIST = {".alicdn.com", ".tbcdn.cn", ".taobaocdn.com", ".wimg.taobao.com", "img.taobao.com", "i.mmcdn.cn"};
    private static final String[] LOOSE_CDN_DOMAIN_BLACK_LIST = {"a.tbcdn.cn", "b.tbcdn.cn", "gqrcode.alicdn.com", "g.tbcdn.cn", "m.alicdn.com", "assets.alicdn.com", "g.alicdn.com", "ag.alicdn.com", "a.dd.alicdn.com", "uaction.alicdn.com", "wwc.alicdn.com", "osdes.alicdn.com", "download.taobaocdn.com", "gtb-fun.alicdn.com", "qianniu.alicdn.com", "gamc.alicdn.com", "glife-img.alicdn.com", "ossgw.alicdn.com", "gjusp.alicdn.com", "alchemy-img.alicdn.com", "alpha.alicdn.com", "h5.m.taobao.com", "nonpublic.alicdn.com"};
    private static final String[] LOOSE_CONVERGENCE_BLACK_LIST = {"i.mmcdn.cn", "cbu01.alicdn.com", "ilce.alicdn.com"};
    private static final String[] STRICT_CDN_DOMAIN_WHITE_LIST = {".tbcdn.cn", ".taobaocdn.com", ".wimg.taobao.com", "img.taobao.com", "i.mmcdn.cn", DOMAIN_DEST, "img.alicdn.com", "gtms03.alicdn.com", "ilce.alicdn.com"};
    private static final String[] STRICT_CDN_DOMAIN_BLACK_LIST = {"a.tbcdn.cn", "b.tbcdn.cn", "g.tbcdn.cn", "download.taobaocdn.com"};
    private static final String[] STRICT_CONVERGENCE_BLACK_LIST = {"i.mmcdn.cn", "ilce.alicdn.com"};
    private static final String[] H5_HEIF_WHITE_LIST = {"-yinhe"};
    private static final String[] H5_HEIF_SOURCE_WHITE_LIST = new String[0];
    private static HashMap<String, Boolean> sStringBooleanHashMap = new HashMap<>();
    private int[] mCdn10000Width = CDN10000Width;
    private int[] mCdn10000Height = CDN10000Height;
    private int[] mCdnSizes = CDN;
    private int[] mXzCdnSizes = XZCDN;
    private int[] mLevelModelCdnSizes = LEVEL_MODEL_CDN;
    private int[] mLevelModelXzCdnSizes = LEVEL_MODEL_XZCDN;
    private String[] mLooseCDNDomainWhiteList = LOOSE_CDN_DOMAIN_WHITE_LIST;
    private String[] mLooseCDNDomainBlackList = LOOSE_CDN_DOMAIN_BLACK_LIST;
    private String[] mLooseConvergenceBlackList = LOOSE_CONVERGENCE_BLACK_LIST;
    private String[] mFuzzyExcludePath = FUZZY_EXCLUDE_PATH;
    private String mDoMainDest = DOMAIN_DEST;
    private String mHeifImageDomain = HEIF_DOMAIN_DEST;
    private String mAvifImageDomain = AVIF_DOMAIN_DEST;
    private String mSpecialDomain = SPECIAL_DOMAIN_DEST;
    private String[] mStrictCDNDomainWhiteList = STRICT_CDN_DOMAIN_WHITE_LIST;
    private String[] mStrictCDNDomainBlackList = STRICT_CDN_DOMAIN_BLACK_LIST;
    private String[] mStrictConvergenceBlackList = STRICT_CONVERGENCE_BLACK_LIST;
    private String[] mH5HeifWhiteList = H5_HEIF_WHITE_LIST;
    private String[] mH5HeifSourceWhiteList = H5_HEIF_SOURCE_WHITE_LIST;
    private String[] mDefaultCDNDomainWhiteList = DEFAULT_CDN_DOMAIN_WHITE_LIST;
    private boolean mGlobalSwitch = true;
    private boolean mDomainSwitch = true;
    private float mDip = 1.0f;
    private boolean mWebpOn = true;
    private boolean mIsLowQuality = false;
    private float mLevelRatio = 0.1f;
    private int mDeviceLevel = 0;

    /* loaded from: classes8.dex */
    public enum CutType {
        xz("xz", "1c"),
        non("", "");
        
        String ossCut;
        String tfsCut;

        CutType(String str, String str2) {
            this.tfsCut = "";
            this.ossCut = "";
            this.tfsCut = str;
            this.ossCut = str2;
        }

        public String getCutType() {
            return this.tfsCut;
        }

        public String getOssCut() {
            return this.ossCut;
        }
    }

    /* loaded from: classes8.dex */
    public enum ImageBlur {
        b10("b10"),
        b20("b20"),
        b30("b30"),
        b40("b40"),
        b50("b50"),
        b100("b100"),
        b150("b150"),
        b200("b200"),
        b250("b250");
        
        String mImageBlur;

        ImageBlur(String str) {
            this.mImageBlur = "";
            this.mImageBlur = str;
        }

        public String getImageBlur() {
            return this.mImageBlur;
        }
    }

    /* loaded from: classes8.dex */
    public enum ImageQuality {
        q90(ImageAdapter.IMAGE_QUALITY_Q90, "90q"),
        q75("q75", "75q"),
        q60("q60", "60q"),
        q50("q50", "50q"),
        q30("q30", "30q"),
        non("", "");
        
        String ossQ;
        String tfsQ;

        ImageQuality(String str, String str2) {
            this.tfsQ = "";
            this.ossQ = "";
            this.tfsQ = str;
            this.ossQ = str2;
        }

        public String getImageQuality() {
            return this.tfsQ;
        }

        public String getOssQuality() {
            return this.ossQ;
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
    public static class ImageSize {
        public int height;
        public boolean keep;
        public boolean limitWH;
        public int width;

        public ImageSize(int i, int i2) {
            this(false, false, i, i2);
        }

        public ImageSize(boolean z, boolean z2, int i, int i2) {
            this.keep = z;
            this.limitWH = z2;
            this.width = i;
            this.height = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static final TaobaoImageUrlStrategy instance = new TaobaoImageUrlStrategy();
    }

    static {
        for (String str : DEFAULT_CDN_DOMAIN_WHITE_LIST) {
            sStringBooleanHashMap.put(str, true);
        }
    }

    public float getDip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a129074c", new Object[]{this})).floatValue() : this.mDip;
    }

    public synchronized void initImageUrlStrategy(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, HashMap<String, ServiceImageSwitch> hashMap, String str, String str2, String str3, String str4, int[] iArr7, int[] iArr8, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, boolean z, boolean z2, String str5, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee80c25", new Object[]{this, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, hashMap, str, str2, str3, str4, iArr7, iArr8, strArr, strArr2, strArr3, strArr4, new Boolean(z), new Boolean(z2), str5, new Boolean(z3)});
            return;
        }
        this.mWebpOn = z3;
        this.mGlobalSwitch = z;
        if (!this.mGlobalSwitch) {
            return;
        }
        setAliCdnDomain(strArr2);
        setCdnSize(iArr);
        setCdn10000WidthSize(iArr2);
        setCdn10000HeightSize(iArr3);
        setXzCdnSize(iArr4);
        setLevelModelCdnSize(iArr5);
        setLevelModelXzCdnSize(iArr6);
        setLevelRatio(str5);
        setServiceIamgeSwitch(hashMap);
        setDoMainDest(str);
        this.mDomainSwitch = z2;
        setExactExcludeDomain(strArr3);
        setFuzzyExcludePath(strArr4);
        setExcludeDomainPath(strArr);
        this.mHeifImageDomain = TextUtils.isEmpty(str2) ? HEIF_DOMAIN_DEST : str2;
        this.mHeifBizWhiteList = iArr7;
        this.mAvifImageDomain = TextUtils.isEmpty(str3) ? AVIF_DOMAIN_DEST : str3;
        this.mAvifBizWhiteList = iArr8;
        this.mSpecialDomain = TextUtils.isEmpty(str4) ? SPECIAL_DOMAIN_DEST : str4;
    }

    public boolean isDomainSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc48caed", new Object[]{this})).booleanValue() : this.mDomainSwitch;
    }

    public void initDip(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5fb1a6", new Object[]{this, context});
        } else if (context == null) {
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay();
            if (defaultDisplay == null) {
                return;
            }
            defaultDisplay.getMetrics(displayMetrics);
            this.mDip = displayMetrics.density;
            if (this.mDip <= 2.0f) {
                z = false;
            }
            this.mIsLowQuality = z;
        }
    }

    public TaobaoImageUrlStrategy setAliCdnDomain(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("1c93fbe0", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            this.mLooseCDNDomainWhiteList = strArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setExactExcludeDomain(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("e2e428c", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            this.mLooseCDNDomainBlackList = strArr;
        } else {
            this.mLooseCDNDomainBlackList = LOOSE_CDN_DOMAIN_BLACK_LIST;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setExcludeDomainPath(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("4bac904c", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            this.mLooseConvergenceBlackList = strArr;
        }
        return this;
    }

    public void updateStrictCDNDomainWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead28b90", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length <= 0) {
        } else {
            this.mStrictCDNDomainWhiteList = strArr;
        }
    }

    public void updateStrictCDNDomainBlackList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b311fa", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length <= 0) {
        } else {
            this.mStrictCDNDomainBlackList = strArr;
        }
    }

    public void updateStrictConvergenceBlackList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68a449a", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length <= 0) {
        } else {
            this.mStrictConvergenceBlackList = strArr;
        }
    }

    public TaobaoImageUrlStrategy setFuzzyExcludePath(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("6a42b7c2", new Object[]{this, strArr});
        }
        if (strArr != null && strArr.length > 0) {
            this.mFuzzyExcludePath = strArr;
        } else {
            this.mFuzzyExcludePath = FUZZY_EXCLUDE_PATH;
        }
        return this;
    }

    public void updateH5HeifWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea46a481", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length <= 0) {
        } else {
            this.mH5HeifWhiteList = strArr;
        }
    }

    public String[] getH5HeifWhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("483aadc0", new Object[]{this}) : this.mH5HeifWhiteList;
    }

    public void updateH5HeifSourceWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda9f8bc", new Object[]{this, strArr});
        } else if (strArr == null || strArr.length <= 0) {
        } else {
            this.mH5HeifSourceWhiteList = strArr;
        }
    }

    public void updateDefaultCDNDomainWhiteList(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59faa0a", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length != 0) {
            synchronized (sStringBooleanHashMap) {
                this.mDefaultCDNDomainWhiteList = strArr;
                for (String str : this.mDefaultCDNDomainWhiteList) {
                    sStringBooleanHashMap.put(str, true);
                }
            }
        }
    }

    public String[] getH5HeifSourceWhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("d08cabe5", new Object[]{this}) : this.mH5HeifSourceWhiteList;
    }

    public String getHeifImageDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("73cf5ca", new Object[]{this}) : this.mHeifImageDomain;
    }

    public TaobaoImageUrlStrategy setDoMainDest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("b16b4eaa", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            this.mDoMainDest = str;
        } else {
            this.mDoMainDest = DOMAIN_DEST;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("c1403e02", new Object[]{this, iArr});
        }
        if (iArr != null && iArr.length > 0) {
            this.mCdnSizes = iArr;
        } else {
            this.mCdnSizes = CDN;
        }
        return this;
    }

    private boolean isValidSizes(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fefe3899", new Object[]{this, iArr})).booleanValue();
        }
        if (iArr == null || iArr.length == 0) {
            return false;
        }
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            if (i2 >= i3) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    public TaobaoImageUrlStrategy setLevelModelCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("130856a7", new Object[]{this, iArr});
        }
        if (isValidSizes(iArr)) {
            this.mLevelModelCdnSizes = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setLevelModelXzCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("addeee09", new Object[]{this, iArr});
        }
        if (isValidSizes(iArr)) {
            this.mLevelModelXzCdnSizes = iArr;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setLevelRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("79b0d189", new Object[]{this, str});
        }
        try {
            this.mLevelRatio = Float.parseFloat(str);
        } catch (Exception unused) {
        }
        float f = this.mLevelRatio;
        if (f < 0.0f || f > 1.0f) {
            this.mLevelRatio = 0.1f;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setCdn10000WidthSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("da89ca4d", new Object[]{this, iArr});
        }
        if (iArr != null && iArr.length > 0) {
            this.mCdn10000Width = iArr;
        } else {
            this.mCdn10000Width = CDN10000Width;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setCdn10000HeightSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("8b319cc0", new Object[]{this, iArr});
        }
        if (iArr != null && iArr.length > 0) {
            this.mCdn10000Height = iArr;
        } else {
            this.mCdn10000Height = CDN10000Height;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setXzCdnSize(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("adba6aa4", new Object[]{this, iArr});
        }
        if (iArr != null && iArr.length > 0) {
            this.mXzCdnSizes = iArr;
        } else {
            this.mXzCdnSizes = XZCDN;
        }
        return this;
    }

    public TaobaoImageUrlStrategy setServiceIamgeSwitch(HashMap<String, ServiceImageSwitch> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("7fad334b", new Object[]{this, hashMap});
        }
        this.mServiceImageSwitchList = hashMap;
        return this;
    }

    public int matchSize(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c12eba9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mCdnSizes.length <= 0) {
            return i;
        }
        while (true) {
            int[] iArr = this.mCdnSizes;
            if (i2 < iArr.length - 1) {
                int i3 = iArr[i2];
                i2++;
                int i4 = iArr[i2];
                int i5 = i - i3;
                int i6 = i4 - i;
                if (i5 >= 0 && i6 >= 0) {
                    return i5 < i6 ? i3 : i4;
                }
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    public int taobaoCDNPatten(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e4755c4", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : taobaoCDNPatten(i, z, true);
    }

    public int taoXZCDN(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("768e4346", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z2) {
            int[] iArr = this.mLevelModelXzCdnSizes;
            return findBestLevel(iArr, iArr.length / 2, i);
        }
        int[] iArr2 = this.mXzCdnSizes;
        return iArr2[binarySearch(iArr2, i, z)];
    }

    public int taobaoCDNPatten(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9aa41716", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (z2) {
            int[] iArr = this.mLevelModelCdnSizes;
            return findBestLevel(iArr, iArr.length / 2, i);
        }
        int[] iArr2 = this.mCdnSizes;
        return iArr2[binarySearch(iArr2, i, z)];
    }

    private int findBestLevel(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a40b442f", new Object[]{this, iArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int length = iArr.length;
        char c = 65535;
        while (i >= 0 && i < length) {
            int i4 = iArr[i];
            if (i2 > i4) {
                if (c >= 0) {
                    if (c == 2) {
                        break;
                    }
                } else {
                    c = 1;
                }
                i++;
            } else if (i2 >= i4) {
                break;
            } else {
                if (c >= 0) {
                    if (c == 1) {
                        break;
                    }
                } else {
                    c = 2;
                }
                i--;
            }
        }
        if (i >= 0) {
            if (i >= length) {
                i3 = length - 1;
            } else if (c != 1 || i2 > iArr[i - 1] * (this.mLevelRatio + 1.0f)) {
                i3 = (c != 2 || ((float) i2) <= ((float) iArr[i]) * (this.mLevelRatio + 1.0f)) ? i : i + 1;
            } else {
                i3 = i - 1;
            }
        }
        return iArr[i3];
    }

    public int taobaoCDN10000Width(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5a1df", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : this.mCdn10000Width[binarySearch(this.mCdn10000Width, i, z)];
    }

    public int taobaoCDN10000Height(int i, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1221eae4", new Object[]{this, new Integer(i), new Boolean(z)})).intValue() : this.mCdn10000Height[binarySearch(this.mCdn10000Height, i, z)];
    }

    public boolean isInCDN(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dbe1062", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.mCdnSizes;
            if (i2 >= iArr.length) {
                return false;
            }
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
        }
    }

    public String decideUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57aca635", new Object[]{this, str, new Integer(i)}) : decideUrl(str, i, "", CutType.non);
    }

    public String decideUrl(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("191bae6b", new Object[]{this, str, new Integer(i), str2}) : decideUrl(str, i, "", CutType.non);
    }

    @Deprecated
    public String decideUrl(String str, int i, String str2, CutType cutType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f4d20b6", new Object[]{this, str, new Integer(i), str2, cutType}) : decideUrl(str, i, str2, cutType, -1, -1, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x024e, code lost:
        if (getDeviceLevel() == 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String optDecideUrl(java.lang.String r39, int r40, com.taobao.tao.image.ImageStrategyConfig r41) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.optDecideUrl(java.lang.String, int, com.taobao.tao.image.ImageStrategyConfig):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0241, code lost:
        if (getDeviceLevel() == 3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String decideUrl(java.lang.String r38, int r39, com.taobao.tao.image.ImageStrategyConfig r40) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.decideUrl(java.lang.String, int, com.taobao.tao.image.ImageStrategyConfig):java.lang.String");
    }

    private boolean isHeifAllowedWithBiz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c45ca117", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int[] iArr = this.mHeifBizWhiteList;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isAvifAllowedWithBiz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe2d4df", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int[] iArr = this.mAvifBizWhiteList;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x023d  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String decideUrl(java.lang.String r46, int r47, java.lang.String r48, com.taobao.tao.util.TaobaoImageUrlStrategy.CutType r49, int r50, int r51, boolean r52, boolean r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.TaobaoImageUrlStrategy.decideUrl(java.lang.String, int, java.lang.String, com.taobao.tao.util.TaobaoImageUrlStrategy$CutType, int, int, boolean, boolean, boolean):java.lang.String");
    }

    private int getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[]{this})).intValue();
        }
        if (this.mDeviceLevel == 0) {
            this.mDeviceLevel = SceneIdentifier.getDeviceLevel();
        }
        return this.mDeviceLevel;
    }

    private boolean decideUrlWH(boolean z, StringBuffer stringBuffer, ImageStrategyExtra.ImageUrlInfo imageUrlInfo, int i, int i2, double d, double d2, int i3, CutType cutType, boolean z2, double d3, double d4, double d5) {
        int taobaoCDNPatten;
        int i4 = i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c84b01b", new Object[]{this, new Boolean(z), stringBuffer, imageUrlInfo, new Integer(i), new Integer(i2), new Double(d), new Double(d2), new Integer(i4), cutType, new Boolean(z2), new Double(d3), new Double(d4), new Double(d5)})).booleanValue();
        }
        if (i4 > 0) {
            double d6 = isNetworkSlow() ? d : d2;
            if (c.a() != null && c.a().e()) {
                int deviceLevel = getDeviceLevel();
                d6 = Math.min(d6, deviceLevel != 1 ? deviceLevel != 2 ? deviceLevel != 3 ? 1.0d : d5 : d4 : d3);
            }
            if (getDeviceLevel() == 3 && c.a() != null && c.a().f()) {
                d6 = Math.min(0.8d, d6);
            }
            i4 = (int) (i4 * d6);
        }
        ImageSize imageSize = null;
        if (i4 < 0) {
            if (imageUrlInfo != null && imageUrlInfo.width > 0 && imageUrlInfo.height > 0) {
                imageSize = new ImageSize(true, false, imageUrlInfo.width, imageUrlInfo.height);
            }
        } else if (i >= 0 && i2 >= 0) {
            imageSize = matchWH2CDN10000(i, i2, i4, z2);
            imageSize.keep = false;
        } else if (imageUrlInfo != null && imageUrlInfo.width > 0 && imageUrlInfo.height > 0) {
            imageSize = matchWH2CDN10000(imageUrlInfo.width, imageUrlInfo.height, i4, z2);
        } else {
            if (cutType != null && cutType != CutType.non) {
                taobaoCDNPatten = taoXZCDN((int) (i4 * this.mDip), true, z2);
            } else {
                taobaoCDNPatten = taobaoCDNPatten((int) (i4 * this.mDip), true, z2);
            }
            imageSize = new ImageSize(taobaoCDNPatten, taobaoCDNPatten);
        }
        if (imageSize == null) {
            return false;
        }
        if (!z) {
            stringBuffer.append('_');
        }
        if (getDeviceLevel() == 3 && imageSize.width == 1200 && imageSize.height == 1200) {
            stringBuffer.append(960);
            stringBuffer.append('x');
            stringBuffer.append(960);
        } else {
            stringBuffer.append(imageSize.width);
            stringBuffer.append('x');
            stringBuffer.append(imageSize.height);
        }
        if (imageSize.keep && imageUrlInfo != null) {
            stringBuffer.append(imageUrlInfo.cj);
            return true;
        } else if (imageSize.limitWH || cutType == null) {
            return true;
        } else {
            stringBuffer.append(cutType.getCutType());
            return true;
        }
    }

    private boolean decideValueByNetwork(boolean z, StringBuffer stringBuffer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a109a81", new Object[]{this, new Boolean(z), stringBuffer, str, str2})).booleanValue();
        }
        if (!isNetworkSlow()) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!z) {
            stringBuffer.append('_');
        }
        stringBuffer.append(str);
        return true;
    }

    private void decideUrlSuffix(boolean z, StringBuffer stringBuffer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e62f809", new Object[]{this, new Boolean(z), stringBuffer, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append(str);
            z = true;
        }
        if (!z) {
            return;
        }
        stringBuffer.append(".jpg");
    }

    private void decideUrlWebP(StringBuffer stringBuffer, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b7ff74", new Object[]{this, stringBuffer, new Boolean(z), new Boolean(z2)});
        } else if (!z && (!z2 || !this.mWebpOn || !isSupportWebP())) {
        } else {
            stringBuffer.append("_.webp");
        }
    }

    private ImageSize matchWH2CDN10000(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageSize) ipChange.ipc$dispatch("263fc56f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)}) : matchWH2CDN10000(i, i2, i3, true);
    }

    private ImageSize matchWH2CDN10000(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            return (ImageSize) ipChange.ipc$dispatch("93e2b53", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        }
        if ((i == 10000 && i2 == 10000) || (i == 0 && i2 == 0)) {
            i = taobaoCDNPatten((int) (i3 * this.mDip), true, z);
            i2 = i;
        } else {
            if (i2 == 10000) {
                i = taobaoCDN10000Width((int) (i3 * this.mDip), true);
                i2 = 10000;
            } else if (i == 10000) {
                i2 = taobaoCDN10000Height((int) (i3 * this.mDip), true);
                i = 10000;
            } else {
                z2 = true;
            }
            return new ImageSize(z2, z3, i, i2);
        }
        z3 = false;
        return new ImageSize(z2, z3, i, i2);
    }

    private String changeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8675edb0", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(124);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        return str.replace(" ", "");
    }

    private boolean isExcludeUrl(String[] strArr, String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("163154f1", new Object[]{this, strArr, str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (strArr != null) {
            if (str2 == null && (parse = Uri.parse(str)) != null) {
                str2 = parse.getHost();
            }
            for (String str3 : strArr) {
                if (str3.equals(str2)) {
                    return true;
                }
            }
        }
        if (this.mFuzzyExcludePath != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.mFuzzyExcludePath;
                if (i >= strArr2.length) {
                    break;
                } else if (str.indexOf(strArr2[i]) >= 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private String[] convergenceUrl(String[] strArr, String[] strArr2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("9ac300ca", new Object[]{this, strArr, strArr2, str, str2, new Boolean(z)}) : convergenceUrl(strArr, strArr2, str, str2, this.mDoMainDest, z);
    }

    private String[] convergenceUrl(String[] strArr, String[] strArr2, String str, String str2, String str3, boolean z) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ba078300", new Object[]{this, strArr, strArr2, str, str2, str3, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            return new String[]{str, str2};
        }
        if (str2 == null && (parse = Uri.parse(str)) != null) {
            str2 = parse.getHost();
        }
        if (str2 == null || str2.equals(str3)) {
            return new String[]{str, str2};
        }
        int length = strArr2 != null ? strArr2.length : 0;
        for (int i = 0; i < length; i++) {
            if (str2.indexOf(strArr2[i]) >= 0) {
                return new String[]{str, str2};
            }
        }
        if (z) {
            int length2 = strArr != null ? strArr.length : 0;
            int i2 = 0;
            while (i2 < length2 && str2.indexOf(strArr[i2]) < 0) {
                i2++;
            }
            if (i2 >= length2) {
                return new String[]{str, str2};
            }
        }
        return new String[]{str.replaceFirst(str2, str3), str3};
    }

    public String[] convergenceUrl(UriCDNInfo uriCDNInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("a3d51af8", new Object[]{this, uriCDNInfo, new Boolean(z)}) : convergenceUrl(this.mLooseCDNDomainWhiteList, this.mLooseConvergenceBlackList, uriCDNInfo.url, uriCDNInfo.host, z);
    }

    public String convergenceUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e88631", new Object[]{this, str}) : convergenceUrl(this.mLooseCDNDomainWhiteList, this.mLooseConvergenceBlackList, str, null, true)[0];
    }

    public String strictConvergenceUrl(UriCDNInfo uriCDNInfo, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eafffce", new Object[]{this, uriCDNInfo, new Boolean(z)}) : convergenceUrl(this.mStrictCDNDomainWhiteList, this.mStrictConvergenceBlackList, uriCDNInfo.url, uriCDNInfo.host, z)[0];
    }

    public String strictConvergenceUrl(UriCDNInfo uriCDNInfo, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("701aee98", new Object[]{this, uriCDNInfo, str, new Boolean(z)}) : convergenceUrl(this.mStrictCDNDomainWhiteList, this.mStrictConvergenceBlackList, uriCDNInfo.url, uriCDNInfo.host, str, z)[0];
    }

    public boolean isOptCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0fb49f6", new Object[]{this, uriCDNInfo})).booleanValue();
        }
        String[] strArr = this.mFuzzyExcludePath;
        if (strArr != null) {
            for (String str : strArr) {
                if (uriCDNInfo.url.contains(str)) {
                    return false;
                }
            }
        }
        try {
            Boolean bool = sStringBooleanHashMap.get(uriCDNInfo.host);
            if (bool != null) {
                if (bool.booleanValue()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public boolean isCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70ceda55", new Object[]{this, uriCDNInfo})).booleanValue() : isCdnImage(uriCDNInfo.url, uriCDNInfo.host);
    }

    public boolean isCdnImage(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c394050d", new Object[]{this, str})).booleanValue() : isCdnImage(str, null);
    }

    private boolean isCdnImage(String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983f5e97", new Object[]{this, str, str2})).booleanValue();
        }
        if (isExcludeUrl(this.mLooseCDNDomainBlackList, str, str2)) {
            return false;
        }
        if (str2 == null && (parse = Uri.parse(str)) != null) {
            str2 = parse.getHost();
        }
        if (str2 != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mLooseCDNDomainWhiteList;
                if (i >= strArr.length) {
                    break;
                } else if (str2.indexOf(strArr[i]) >= 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public boolean isStrictCdnImage(UriCDNInfo uriCDNInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88b63a4c", new Object[]{this, uriCDNInfo})).booleanValue();
        }
        String str = uriCDNInfo.host;
        if (!isExcludeUrl(this.mStrictCDNDomainBlackList, uriCDNInfo.url, str) && str != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mStrictCDNDomainWhiteList;
                if (i >= strArr.length) {
                    break;
                } else if (str.indexOf(strArr[i]) >= 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public boolean isExcludeUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3afe8754", new Object[]{this, str})).booleanValue() : isExcludeUrl(this.mLooseCDNDomainBlackList, str, null);
    }

    private int binarySearch(int[] iArr, int i, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8610cc2", new Object[]{this, iArr, new Integer(i), new Boolean(z)})).intValue();
        }
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) / 2;
            if (i == iArr[i4]) {
                return i4;
            }
            if (i < iArr[i4]) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        if (length < 0) {
            return 0;
        }
        return (!z || (i2 = length + 1) > iArr.length - 1) ? length : i2;
    }

    public boolean isSupportWebP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcb21c6c", new Object[]{this})).booleanValue() : c.a() != null && c.a().c().a();
    }

    public boolean isNetworkSlow() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a227a7d0", new Object[]{this})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (nanoTime - this.mLastUpdateTime > 2000000000) {
            if (c.a() != null && c.a().c().b()) {
                z = true;
            }
            this.mIsNetworkSlow = z;
            this.mLastUpdateTime = nanoTime;
        }
        return this.mIsNetworkSlow;
    }

    public static TaobaoImageUrlStrategy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoImageUrlStrategy) ipChange.ipc$dispatch("a92d0431", new Object[0]) : a.instance;
    }

    /* loaded from: classes8.dex */
    public static class ServiceImageSwitch {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String areaName;
        private String suffix;
        private boolean useWebp = true;
        private String lowNetQ = ImageQuality.q75.getImageQuality();
        private String highNetQ = ImageQuality.q90.getImageQuality();
        private String lowNetSharpen = ImageSharpen.non.getImageSharpen();
        private String highNetSharpen = ImageSharpen.non.getImageSharpen();
        private double lowNetScale = 1.0d;
        private double highNetScale = 1.0d;
        private double lowDeviceScale = 1.0d;
        private double midDeviceScale = 1.0d;
        private double highDeviceScale = 1.0d;
        private boolean useCdnSizes = false;

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "areaName =" + this.areaName + " useWebp =" + this.useWebp + " lowNetQ =" + this.lowNetQ + " highNetQ =" + this.highNetQ + " lowNetSharpen =" + this.lowNetSharpen + " highNetSharpen =" + this.highNetSharpen + " lowNetScale =" + this.lowNetScale + " highNetScale =" + this.highNetScale + " useCdnSizes=" + this.useCdnSizes;
        }

        public String getAreaName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88ab898b", new Object[]{this}) : this.areaName;
        }

        public void setAreaName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17a3024b", new Object[]{this, str});
            } else {
                this.areaName = str;
            }
        }

        public boolean isUseWebp() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce4e4544", new Object[]{this})).booleanValue() : this.useWebp;
        }

        public void setUseWebp(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c017b0cc", new Object[]{this, new Boolean(z)});
            } else {
                this.useWebp = z;
            }
        }

        public boolean isUseCdnSizes() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8aca070d", new Object[]{this})).booleanValue() : this.useCdnSizes;
        }

        public void useCdnSizes(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("248ecfa1", new Object[]{this, new Boolean(z)});
            } else {
                this.useCdnSizes = z;
            }
        }

        public String getSuffix() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66811712", new Object[]{this}) : this.suffix;
        }

        public void setSuffix(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bb8a4", new Object[]{this, str});
            } else {
                this.suffix = str;
            }
        }

        public String getLowNetQ() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("339f6aa7", new Object[]{this}) : this.lowNetQ;
        }

        public void setLowNetQ(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47517317", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = ImageQuality.q75.getImageQuality();
            }
            this.lowNetQ = str;
        }

        public String getHighNetQ() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2703c5ed", new Object[]{this}) : this.highNetQ;
        }

        public void setHighNetQ(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44525229", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = ImageQuality.q90.getImageQuality();
            }
            this.highNetQ = str;
        }

        public String getLowNetSharpen() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b7e53f05", new Object[]{this}) : this.lowNetSharpen;
        }

        public void setLowNetSharpen(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79628379", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.lowNetSharpen;
            }
            this.lowNetSharpen = str;
        }

        public String getHighNetSharpen() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de4d8dcb", new Object[]{this}) : this.highNetSharpen;
        }

        public void setHighNetSharpen(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc304d0b", new Object[]{this, str});
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = this.highNetSharpen;
            }
            this.highNetSharpen = str;
        }

        public double getLowNetScale() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a183ae0", new Object[]{this})).doubleValue() : this.lowNetScale;
        }

        public void setLowNetScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cec1898", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                d = this.lowNetScale;
            }
            this.lowNetScale = d;
        }

        public double getHighNetScale() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("baa305da", new Object[]{this})).doubleValue() : this.highNetScale;
        }

        public void setHighNetScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75542446", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                d = this.highNetScale;
            }
            this.highNetScale = d;
        }

        public void setMidDeviceScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47151f29", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                d = this.midDeviceScale;
            }
            this.midDeviceScale = d;
        }

        public double getMidDeviceScale() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("806b597", new Object[]{this})).doubleValue() : this.midDeviceScale;
        }

        public void setHighDeviceScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558b1c7", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                d = this.highDeviceScale;
            }
            this.highDeviceScale = d;
        }

        public double getHighDeviceScale() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acbe19d1", new Object[]{this})).doubleValue() : this.highDeviceScale;
        }

        public void setLowDeviceScale(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11718435", new Object[]{this, new Double(d)});
                return;
            }
            if (d <= mto.a.GEO_NOT_SUPPORT) {
                d = this.lowDeviceScale;
            }
            this.lowDeviceScale = d;
        }

        public double getLowDeviceScale() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5437f0b", new Object[]{this})).doubleValue() : this.lowDeviceScale;
        }
    }

    /* loaded from: classes8.dex */
    public static class UriCDNInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String host;
        public Uri uri;
        public final String url;

        public UriCDNInfo(String str) {
            this.url = str;
            if (ImageStrategyConfig.f20621a) {
                this.host = getHostFromPath(str);
                return;
            }
            this.uri = Uri.parse(str);
            Uri uri = this.uri;
            if (uri != null && uri.getHost() != null) {
                this.host = this.uri.getHost();
            } else {
                this.host = "";
            }
        }

        public UriCDNInfo(String str, boolean z) {
            this.url = str;
            this.host = getHostFromPath(str);
        }

        private static String getHostFromPath(String str) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18d3b662", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (str.startsWith(ado.URL_SEPARATOR)) {
                i = 2;
            } else {
                int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
                i = indexOf < 0 ? 0 : indexOf + 3;
            }
            if (i >= str.length()) {
                return "";
            }
            int indexOf2 = str.indexOf(47, i);
            if (indexOf2 < 0) {
                indexOf2 = str.length();
            }
            return str.substring(i, indexOf2);
        }
    }
}
