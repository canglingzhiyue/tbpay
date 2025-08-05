package com.taobao.android.detail.core.standard.mainpic.weex;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.ado;
import tb.emd;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryLightOffPicComponent extends WXComponent<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLAZZ_NAME = "lightOffPic";
    private static Map<String, WeakReference<TouchImageView>> PICGALLERY_PIC_LIST = null;
    private static final String TAG = "PicGalleryLightOffPicComponent";
    private TouchImageView mImageView;
    private String mImgUrl;

    public static /* synthetic */ Object ipc$super(PicGalleryLightOffPicComponent picGalleryLightOffPicComponent, String str, Object... objArr) {
        if (str.hashCode() == -17468269) {
            super.onActivityDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @JSMethod
    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        }
    }

    public static /* synthetic */ TouchImageView access$000(PicGalleryLightOffPicComponent picGalleryLightOffPicComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TouchImageView) ipChange.ipc$dispatch("b979286d", new Object[]{picGalleryLightOffPicComponent}) : picGalleryLightOffPicComponent.mImageView;
    }

    static {
        kge.a(742572279);
        PICGALLERY_PIC_LIST = new HashMap();
    }

    public PicGalleryLightOffPicComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        initLayout();
    }

    public PicGalleryLightOffPicComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
        initLayout();
    }

    private void initLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        this.mImageView = new TouchImageView(getContext());
        emu.a("com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffPicComponent");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView */
    public View mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        if (this.mImageView.getParent() != null) {
            ((ViewGroup) this.mImageView.getParent()).removeView(this.mImageView);
        }
        return this.mImageView;
    }

    @WXComponentProp(name = "url")
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            return;
        }
        this.mImgUrl = str;
        PICGALLERY_PIC_LIST.put(getImageKey(this.mImgUrl), new WeakReference<>(this.mImageView));
        epj.b().a(emd.a(this.mImgUrl), getContext(), -1, new c.a() { // from class: com.taobao.android.detail.core.standard.mainpic.weex.PicGalleryLightOffPicComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
            public void a(Drawable drawable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    return;
                }
                PicGalleryLightOffPicComponent.access$000(PicGalleryLightOffPicComponent.this).setImageDrawable(drawable);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PicGalleryLightOffPicComponent.access$000(PicGalleryLightOffPicComponent.this).getLayoutParams();
                PicGalleryLightOffPicComponent.access$000(PicGalleryLightOffPicComponent.this).setScaleType(ImageView.ScaleType.FIT_CENTER);
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.leftMargin = 0;
                layoutParams.topMargin = 0;
            }
        });
    }

    @JSMethod
    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else {
            if (this.mImgUrl == null) {
            }
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        PICGALLERY_PIC_LIST.clear();
    }

    private static String getImageKey(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58b6075", new Object[]{str}) : TextUtils.isEmpty(str) ? "" : str.indexOf(ado.URL_SEPARATOR) >= 0 ? str.substring(str.indexOf(ado.URL_SEPARATOR) + 2) : str;
    }

    public static TouchImageView getTouchImageView(String str) {
        WeakReference<TouchImageView> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TouchImageView) ipChange.ipc$dispatch("68cb0ac2", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (weakReference = PICGALLERY_PIC_LIST.get(getImageKey(str))) != null && weakReference.get() != null) {
            return weakReference.get();
        }
        return null;
    }
}
