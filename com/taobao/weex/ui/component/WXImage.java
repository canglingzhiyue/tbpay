package com.taobao.weex.ui.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXImageSharpen;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.dom.WXImageQuality;
import com.taobao.weex.performance.e;
import com.taobao.weex.performance.f;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.view.IRenderStatus;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.ImageDrawable;
import com.taobao.weex.utils.ImgURIUtil;
import com.taobao.weex.utils.SingleFunctionParser;
import com.taobao.weex.utils.WXDomUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import com.taobao.weex.utils.WXViewToImageUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kge;

@Component(lazyload = false)
/* loaded from: classes9.dex */
public class WXImage extends WXComponent<ImageView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static SingleFunctionParser.FlatMapper<Integer> BLUR_RADIUS_MAPPER = null;
    public static final String ERRORDESC = "errorDesc";
    public static final String SUCCEED = "success";
    private static final int WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 2;
    private boolean enablePinch;
    private boolean mAutoRecycle;
    private int mBlurRadius;
    private String mSrc;
    private String preImgUrlStr;

    /* loaded from: classes9.dex */
    public interface Measurable {
        int getNaturalHeight();

        int getNaturalWidth();
    }

    public static /* synthetic */ Object ipc$super(WXImage wXImage, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -889414749:
                super.onFinishLayout();
                return null;
            case -713828414:
                super.updateProperties((Map) objArr[0]);
                return null;
            case -631469807:
                super.refreshData((WXComponent) objArr[0]);
                return null;
            case -415570888:
                super.recycled();
                return null;
            case -39247480:
                return new Boolean(super.setProperty((String) objArr[0], objArr[1]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(WXImage wXImage, ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16924d02", new Object[]{wXImage, imageView, str});
        } else {
            wXImage.monitorImgSize(imageView, str);
        }
    }

    static {
        kge.a(95035304);
        BLUR_RADIUS_MAPPER = new SingleFunctionParser.FlatMapper<Integer>() { // from class: com.taobao.weex.ui.component.WXImage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.taobao.weex.utils.SingleFunctionParser.FlatMapper
            /* renamed from: map */
            public Integer mo1597map(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("930bd0d4", new Object[]{this, str}) : WXUtils.getInteger(str, 0);
            }
        };
    }

    /* loaded from: classes9.dex */
    public static class Creator implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1909104880);
            kge.a(1901682895);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) throws IllegalAccessException, InvocationTargetException, InstantiationException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData}) : new WXImage(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    @Deprecated
    public WXImage(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public WXImage(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mAutoRecycle = true;
        this.enablePinch = false;
        this.preImgUrlStr = "";
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public ImageView mo1592initComponentHostView(Context context) {
        try {
            ImageView imageView = (ImageView) Class.forName("com.taobao.weex.ui.view.WXImageView").getConstructor(Context.class).newInstance(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            if (Build.VERSION.SDK_INT >= 16) {
                imageView.setCropToPadding(true);
            }
            ((IRenderStatus) imageView).holdComponent(this);
            return imageView;
        } catch (Throwable th) {
            WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r7.equals("src") != false) goto L11;
     */
    @Override // com.taobao.weex.ui.component.WXComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setProperty(java.lang.String r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXImage.setProperty(java.lang.String, java.lang.Object):boolean");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void refreshData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5c8911", new Object[]{this, wXComponent});
            return;
        }
        super.refreshData(wXComponent);
        if (!(wXComponent instanceof WXImage)) {
            return;
        }
        setSrc(wXComponent.getAttrs().getImageSrc());
    }

    @WXComponentProp(name = Constants.Name.RESIZE_MODE)
    public void setResizeMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423a004a", new Object[]{this, str});
            return;
        }
        mo1286getHostView().setScaleType(getResizeMode(str));
        mo1286getHostView().setImageDrawable(mo1286getHostView().getDrawable());
    }

    public ImageView.ScaleType getResizeMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("43237972", new Object[]{this, str});
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (TextUtils.isEmpty(str)) {
            return scaleType;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1881872635) {
            if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    c = 1;
                }
            } else if (str.equals("cover")) {
                c = 0;
            }
        } else if (str.equals("stretch")) {
            c = 2;
        }
        if (c == 0) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (c == 1) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        return c != 2 ? scaleType : ImageView.ScaleType.FIT_XY;
    }

    @WXComponentProp(name = Constants.Name.RESIZE)
    public void setResize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626fe1c7", new Object[]{this, str});
        } else {
            setResizeMode(str);
        }
    }

    private void setLocalSrc(Uri uri) {
        ImageView hostView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89738185", new Object[]{this, uri});
            return;
        }
        Drawable drawableFromLoaclSrc = ImgURIUtil.getDrawableFromLoaclSrc(getContext(), uri);
        if (drawableFromLoaclSrc == null || (hostView = mo1286getHostView()) == null) {
            return;
        }
        hostView.setImageDrawable(drawableFromLoaclSrc);
    }

    private void setPinch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9875fcb5", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enablePinch = z;
        if (!(mo1286getHostView() instanceof IWXImageView)) {
            return;
        }
        ((IWXImageView) mo1286getHostView()).setPinch(z);
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else if (str == null) {
        } else {
            ImageView hostView = mo1286getHostView();
            if ("".equals(str) && hostView != null) {
                hostView.setImageDrawable(null);
                return;
            }
            if (hostView != null && hostView.getDrawable() != null && !TextUtils.equals(this.mSrc, str)) {
                hostView.setImageDrawable(null);
            }
            this.mSrc = str;
            Uri a2 = getInstance().a(Uri.parse(str), "image");
            if ("local".equals(a2.getScheme())) {
                setLocalSrc(a2);
            } else {
                setRemoteSrc(a2, parseBlurRadius(getStyles().getBlur()));
            }
        }
    }

    private void setBlurRadius(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837bbe57", new Object[]{this, str, new Integer(i)});
        } else if (getInstance() == null || i == this.mBlurRadius) {
        } else {
            Uri a2 = getInstance().a(Uri.parse(str), "image");
            if ("local".equals(a2.getScheme())) {
                return;
            }
            setRemoteSrc(a2, i);
        }
    }

    private int parseBlurRadius(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a4d470", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            List parse = new SingleFunctionParser(str, BLUR_RADIUS_MAPPER).parse(Constants.Event.BLUR);
            if (parse != null && !parse.isEmpty()) {
                return ((Integer) parse.get(0)).intValue();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        super.recycled();
        if (getInstance().R() != null) {
            getInstance().R().setImage(null, (ImageView) this.mHost, null, null);
        } else if (WXEnvironment.isApkDebugable()) {
            throw new WXRuntimeException("getImgLoaderAdapter() == null");
        } else {
            WXLogUtils.e("Error getImgLoaderAdapter() == null");
        }
    }

    public void autoReleaseImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578cfbea", new Object[]{this});
        } else if (!this.mAutoRecycle || mo1286getHostView() == null || getInstance().R() == null) {
        } else {
            getInstance().R().setImage(null, (ImageView) this.mHost, null, null);
        }
    }

    public void autoRecoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caaaf2d", new Object[]{this});
        } else if (!this.mAutoRecycle) {
        } else {
            setSrc(this.mSrc);
        }
    }

    private void setRemoteSrc(Uri uri, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87b63df", new Object[]{this, uri, new Integer(i)});
            return;
        }
        WXImageStrategy wXImageStrategy = new WXImageStrategy(getInstanceId());
        wXImageStrategy.isClipping = true;
        if (getAttrs().getImageSharpen() != WXImageSharpen.SHARPEN) {
            z = false;
        }
        wXImageStrategy.isSharpen = z;
        wXImageStrategy.blurRadius = Math.max(0, i);
        this.mBlurRadius = i;
        String uri2 = uri.toString();
        wXImageStrategy.setImageListener(new MyImageListener(this, uri2));
        String str = null;
        if (getAttrs().containsKey("placeholder")) {
            str = (String) getAttrs().get("placeholder");
        } else if (getAttrs().containsKey(Constants.Name.PLACE_HOLDER)) {
            str = (String) getAttrs().get(Constants.Name.PLACE_HOLDER);
        }
        if (str != null) {
            wXImageStrategy.placeHolder = getInstance().a(Uri.parse(str), "image").toString();
        }
        wXImageStrategy.instanceId = getInstanceId();
        IWXImgLoaderAdapter R = getInstance().R();
        if (R == null) {
            return;
        }
        R.setImage(uri2, mo1286getHostView(), getImageQuality(), wXImageStrategy);
    }

    public WXImageQuality getImageQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXImageQuality) ipChange.ipc$dispatch("87c9c717", new Object[]{this}) : getAttrs().getImageQuality();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onFinishLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc9ba3", new Object[]{this});
            return;
        }
        super.onFinishLayout();
        updateBorderRadius();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
            return;
        }
        super.updateProperties(map);
        updateBorderRadius();
    }

    private void updateBorderRadius() {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2772c4e", new Object[]{this});
        } else if (!(mo1286getHostView() instanceof IWXImageView)) {
        } else {
            IWXImageView iWXImageView = (IWXImageView) mo1286getHostView();
            BorderDrawable borderDrawable = WXViewInnerUtils.getBorderDrawable(mo1286getHostView());
            if (borderDrawable != null) {
                fArr = borderDrawable.getBorderInnerRadius(new RectF(0.0f, 0.0f, WXDomUtils.getContentWidth(this), WXDomUtils.getContentHeight(this)));
            } else {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            iWXImageView.setBorderRadius(fArr);
            ImageView imageView = (ImageView) iWXImageView;
            if (!(imageView.getDrawable() instanceof ImageDrawable)) {
                return;
            }
            ImageDrawable imageDrawable = (ImageDrawable) imageView.getDrawable();
            if (Arrays.equals(imageDrawable.getCornerRadii(), fArr)) {
                return;
            }
            imageDrawable.setCornerRadii(fArr);
        }
    }

    @JSMethod(uiThread = false)
    public void save(final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6552284", new Object[]{this, jSCallback});
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && (getContext() instanceof Activity)) {
                ActivityCompat.requestPermissions((Activity) getContext(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            }
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                if (jSCallback == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("success", false);
                hashMap.put(ERRORDESC, "Permission denied: android.permission.WRITE_EXTERNAL_STORAGE");
                jSCallback.invoke(hashMap);
                return;
            }
        }
        if (this.mHost == 0) {
            if (jSCallback == null) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("success", false);
            hashMap2.put(ERRORDESC, "Image component not initialized");
            jSCallback.invoke(hashMap2);
            return;
        }
        String str = this.mSrc;
        if (str != null && !str.equals("")) {
            WXViewToImageUtil.generateImage(this.mHost, 0, -460552, new WXViewToImageUtil.OnImageSavedCallback() { // from class: com.taobao.weex.ui.component.WXImage.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.utils.WXViewToImageUtil.OnImageSavedCallback
                public void onSaveSucceed(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e60280b7", new Object[]{this, str2});
                    } else if (jSCallback == null) {
                    } else {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("success", true);
                        jSCallback.invoke(hashMap3);
                    }
                }

                @Override // com.taobao.weex.utils.WXViewToImageUtil.OnImageSavedCallback
                public void onSaveFailed(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99a9112a", new Object[]{this, str2});
                    } else if (jSCallback == null) {
                    } else {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("success", false);
                        hashMap3.put(WXImage.ERRORDESC, str2);
                        jSCallback.invoke(hashMap3);
                    }
                }
            });
        } else if (jSCallback == null) {
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("success", false);
            hashMap3.put(ERRORDESC, "Image does not have the correct src");
            jSCallback.invoke(hashMap3);
        }
    }

    private void monitorImgSize(ImageView imageView, String str) {
        WXSDKInstance wXImage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b77a8b5", new Object[]{this, imageView, str});
        } else if (imageView == null || (wXImage = getInstance()) == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Drawable drawable = imageView.getDrawable();
            if (layoutParams == null || drawable == null) {
                return;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (this.preImgUrlStr.equals(str)) {
                return;
            }
            this.preImgUrlStr = str;
            if (intrinsicHeight > 1081 && intrinsicWidth > 721) {
                wXImage.ar().c(f.KEY_PAGE_STATS_LARGE_IMG_COUNT, 1.0d);
                if (e.f23516a) {
                    e.a(getInstanceId(), "details", f.KEY_PAGE_STATS_LARGE_IMG_COUNT, intrinsicWidth + "*" + intrinsicHeight + "," + str);
                }
            }
            long j = intrinsicHeight * intrinsicWidth;
            long measuredHeight = imageView.getMeasuredHeight() * imageView.getMeasuredWidth();
            if (measuredHeight == 0 || j / measuredHeight <= 1.2d || j - measuredHeight <= 1600) {
                return;
            }
            wXImage.aq().wrongImgSizeCount += 1.0d;
            wXImage.ar().c(f.KEY_PAGE_STATS_WRONG_IMG_SIZE_COUNT, 1.0d);
            if (!e.f23516a) {
                return;
            }
            e.a(getInstanceId(), "details", f.KEY_PAGE_STATS_WRONG_IMG_SIZE_COUNT, String.format(Locale.ROOT, "imgSize:[%d,%d],viewSize:[%d,%d],urL:%s", Integer.valueOf(intrinsicWidth), Integer.valueOf(intrinsicHeight), Integer.valueOf(imageView.getMeasuredWidth()), Integer.valueOf(imageView.getMeasuredHeight()), str));
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if ((mo1286getHostView() instanceof IWXImageView) && getInstance().R() != null) {
            getInstance().R().setImage(null, (ImageView) this.mHost, null, null);
        }
        super.destroy();
    }

    /* loaded from: classes9.dex */
    public static class MyImageListener implements WXImageStrategy.ImageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String rewritedStr;
        private WeakReference<WXImage> wxImageWeakReference;

        static {
            kge.a(1168620487);
            kge.a(632072847);
        }

        public MyImageListener(WXImage wXImage, String str) {
            this.wxImageWeakReference = new WeakReference<>(wXImage);
            this.rewritedStr = str;
        }

        @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
        public void onImageFinish(String str, ImageView imageView, boolean z, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView, new Boolean(z), map});
                return;
            }
            WXImage wXImage = this.wxImageWeakReference.get();
            if (wXImage == null) {
                return;
            }
            if (wXImage.getEvents().contains("load")) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap(2);
                if (imageView != null && (imageView instanceof Measurable)) {
                    Measurable measurable = (Measurable) imageView;
                    hashMap2.put("naturalWidth", Integer.valueOf(measurable.getNaturalWidth()));
                    hashMap2.put("naturalHeight", Integer.valueOf(measurable.getNaturalHeight()));
                } else {
                    hashMap2.put("naturalWidth", 0);
                    hashMap2.put("naturalHeight", 0);
                }
                if (wXImage.containsEvent("load")) {
                    hashMap.put("success", Boolean.valueOf(z));
                    hashMap.put("size", hashMap2);
                    wXImage.fireEvent("load", hashMap);
                }
            }
            WXImage.access$000(wXImage, imageView, this.rewritedStr);
        }
    }
}
