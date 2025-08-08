package com.taobao.android.fluid.framework.adapter.image;

import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.esr;
import tb.kge;
import tb.oeb;
import tb.ohd;
import tb.sjq;
import tb.spz;

/* loaded from: classes5.dex */
public class ImageAdapter implements IImageAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IMAGE_ORIGIN_MODE_BIZ = "fullPageShortVideo";
    public static final int IMAGE_ORIGIN_MODE_NORMAL_BIZID = 9102;
    public static final int IMAGE_ORIGIN_MODE_TEST_BIZID = 9101;
    public static final String IMAGE_QUALITY_Q90 = "q90";
    private static final String TAG = "ImageAdapter";
    private ImageLoader.a mImageConfigInfo;

    static {
        kge.a(321329009);
        kge.a(1519707412);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IImageAdapter.ADAPTER_NAME;
    }

    public ImageAdapter() {
        initImageConfigInfo();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public String decideUrl(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df670908", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        ImageStrategyConfig imageStrategyConfig = getImageStrategyConfig();
        if (imageStrategyConfig != null) {
            return ImageStrategyDecider.decideUrl(str, 1200, 1200, imageStrategyConfig);
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), null);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public ImageLoader.a getImageConfigInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageLoader.a) ipChange.ipc$dispatch("950ba9ae", new Object[]{this}) : this.mImageConfigInfo;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public void load(String str, final ImageView imageView) {
        ImageLoader.a imageConfigInfo;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517e3f1", new Object[]{this, str, imageView});
            return;
        }
        if (getImageConfigInfo() != null) {
            str2 = imageConfigInfo.f + "";
        } else {
            str2 = null;
        }
        if (StringUtils.isEmpty(str2) || StringUtils.equals(str2, "0")) {
            z = false;
        }
        PhenixCreator a2 = b.h().a(str);
        if (!z) {
            str2 = null;
        }
        a2.addLoaderExtra(esr.BUNDLE_BIZ_CODE, str2).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.android.fluid.framework.adapter.image.ImageAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null) {
                    if (drawable instanceof com.taobao.phenix.animate.b) {
                        ((com.taobao.phenix.animate.b) drawable).a(Integer.MAX_VALUE);
                    }
                    ImageView imageView2 = imageView;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(drawable);
                    }
                }
                return true;
            }
        }).fetch();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public void load(String str, final ImageView imageView, final com.taobao.android.fluid.core.a<d> aVar) {
        ImageLoader.a imageConfigInfo;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea05d27", new Object[]{this, str, imageView, aVar});
            return;
        }
        if (getImageConfigInfo() != null) {
            str2 = imageConfigInfo.f + "";
        } else {
            str2 = null;
        }
        if (StringUtils.isEmpty(str2) || StringUtils.equals(str2, "0")) {
            z = false;
        }
        PhenixCreator a2 = b.h().a(str);
        if (!z) {
            str2 = null;
        }
        a2.addLoaderExtra(esr.BUNDLE_BIZ_CODE, str2).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.android.fluid.framework.adapter.image.ImageAdapter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null) {
                    if (drawable instanceof com.taobao.phenix.animate.b) {
                        ((com.taobao.phenix.animate.b) drawable).a(Integer.MAX_VALUE);
                    }
                    ImageView imageView2 = imageView;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(drawable);
                    }
                }
                com.taobao.android.fluid.core.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(d.f12462a);
                }
                return true;
            }
        }).failListener(new a<FailPhenixEvent>() { // from class: com.taobao.android.fluid.framework.adapter.image.ImageAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                com.taobao.android.fluid.core.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(d.b);
                }
                return true;
            }
        }).fetch();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public void load(final String str, final com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable> aVar) {
        ImageLoader.a imageConfigInfo;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6d8b47", new Object[]{this, str, aVar});
            return;
        }
        if (getImageConfigInfo() != null) {
            str2 = imageConfigInfo.f + "";
        } else {
            str2 = null;
        }
        if (StringUtils.isEmpty(str2) || StringUtils.equals(str2, "0")) {
            z = false;
        }
        PhenixCreator a2 = b.h().a(str);
        if (!z) {
            str2 = null;
        }
        a2.addLoaderExtra(esr.BUNDLE_BIZ_CODE, str2).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.android.fluid.framework.adapter.image.ImageAdapter.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null) {
                    aVar.a(str, drawable);
                } else {
                    aVar.a(str, null);
                }
                return true;
            }
        }).failListener(new a<FailPhenixEvent>() { // from class: com.taobao.android.fluid.framework.adapter.image.ImageAdapter.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
            }

            public boolean a(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                aVar.a(str, null);
                return true;
            }
        }).fetch();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public boolean isEnableImageOriginMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d4907a2", new Object[]{this})).booleanValue() : isEnalbeImageOriginMode() && imageOriginModeAB();
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public ImageStrategyConfig getImageStrategyConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("3cbb9008", new Object[]{this}) : getImageStrategyConfig(null);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IImageAdapter
    public ImageStrategyConfig getImageStrategyConfig(sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("2620e292", new Object[]{this, sjqVar});
        }
        if (!isEnalbeImageOriginMode()) {
            return null;
        }
        ImageLoader.a imageConfigInfo = getImageConfigInfo();
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a(IMAGE_ORIGIN_MODE_BIZ, String.valueOf((int) IMAGE_ORIGIN_MODE_NORMAL_BIZID));
        if (imageConfigInfo != null) {
            a2 = ImageStrategyConfig.a(imageConfigInfo.e, String.valueOf(imageConfigInfo.f));
            if (StringUtils.equals(imageConfigInfo.b, IMAGE_QUALITY_Q90)) {
                a2.a(TaobaoImageUrlStrategy.ImageQuality.q90);
                builderImgWidthAndHeight(a2, sjqVar);
            }
        }
        return a2.a();
    }

    private ImageStrategyConfig.a builderImgWidthAndHeight(ImageStrategyConfig.a aVar, sjq sjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig.a) ipChange.ipc$dispatch("b1b926f9", new Object[]{this, aVar, sjqVar});
        }
        if (sjqVar != null) {
            spz.c(TAG, "封面图优化开启使用dp值");
            aVar.a(ohd.e(FluidSDK.getContext(), sjqVar.d));
            aVar.b(ohd.e(FluidSDK.getContext(), sjqVar.c));
        } else {
            spz.c(TAG, "videoCommentSizeObject为null，使用默认值");
            aVar.a(1200);
            aVar.b(1200);
        }
        return aVar;
    }

    private boolean imageOriginModeAB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a7a4f2d0", new Object[]{this})).booleanValue() : com.taobao.android.fluid.framework.adapter.remoteconfig.a.a("Android_guangguang", "imagetest", "shortVideoDisableOrigin", true);
    }

    private void initImageConfigInfo() {
        ImageLoader.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c8aa2", new Object[]{this});
        } else if (!isEnalbeImageOriginMode()) {
        } else {
            if (imageOriginModeAB()) {
                a2 = ImageLoader.a.a(0, IMAGE_QUALITY_Q90, "", "", IMAGE_ORIGIN_MODE_BIZ, 9101);
            } else {
                a2 = ImageLoader.a.a(0, "", "", "", IMAGE_ORIGIN_MODE_BIZ, IMAGE_ORIGIN_MODE_NORMAL_BIZID);
            }
            spz.c("原图实验", a2.toString());
            this.mImageConfigInfo = a2;
        }
    }

    private boolean isEnalbeImageOriginMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3088bace", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableImageOriginMode", true);
    }
}
