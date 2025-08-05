package com.taobao.android.interactive_common.component;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.model.CXImgModel;
import com.taobao.android.interactive_common.view.PageViewItemLayout;
import com.taobao.android.interactive_common.view.photoview.PhotoView;
import com.taobao.android.interactive_common.view.photoview.g;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.Map;
import tb.grr;

/* loaded from: classes5.dex */
public class CXPhotoViewComponent extends WXComponent<FrameLayout> implements PageViewItemLayout.a, g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String RESIZE_CONTAIN = "contain";
    private static final String RESIZE_COVER = "cover";
    private static final String RESIZE_STRETCH = "stretch";
    private static final float SCALE_MAX = 1.05f;
    private static final float SCALE_MIN = 0.95f;
    private boolean isScaleChange;
    private CXImgModel mImgModel;
    private PhotoView mPhotoView;

    public static /* synthetic */ Object ipc$super(CXPhotoViewComponent cXPhotoViewComponent, String str, Object... objArr) {
        if (str.hashCode() == -134451675) {
            super.updateAttrs((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CXPhotoViewComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.isScaleChange = false;
        constructorFlowStatisticsTrack();
        initComponentData(basicComponentData);
    }

    public CXPhotoViewComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
        this.isScaleChange = false;
        constructorFlowStatisticsTrack();
        initComponentData(basicComponentData);
    }

    private void constructorFlowStatisticsTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f713107", new Object[]{this});
        } else {
            grr.a("CXPhotoViewComponent_constructor", null);
        }
    }

    private void initComponentData(BasicComponentData basicComponentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd331bbb", new Object[]{this, basicComponentData});
        } else if (basicComponentData == null) {
        } else {
            WXAttr attrs = basicComponentData.getAttrs();
            this.mImgModel = new CXImgModel();
            this.mImgModel.imgUrl = (String) attrs.get("src");
            this.mImgModel.resize = (String) attrs.get(Constants.Name.RESIZE);
            this.mImgModel.waterMarkText = (String) attrs.get("waterMarkText");
            this.mImgModel.waterMarkIconUrl = (String) attrs.get("waterMarkIconUrl");
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateAttrs(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fc6e25", new Object[]{this, map});
            return;
        }
        super.updateAttrs(map);
        setScrollEnabled(map.get("scrollEnabled"));
    }

    private void setScrollEnabled(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128c4d95", new Object[]{this, obj});
            return;
        }
        try {
            if ("true".equals(obj) || "false".equals(obj)) {
                this.mImgModel.scrollEnabled = Boolean.parseBoolean((String) obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        PhotoView photoView = this.mPhotoView;
        if (photoView == null) {
            return;
        }
        photoView.setZoomable(this.mImgModel.scrollEnabled);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: avoid collision after fix types in other method */
    public FrameLayout mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            grr.a((Activity) context, "CXPhotoViewComponent_initComponentHostView", null);
        }
        PageViewItemLayout pageViewItemLayout = new PageViewItemLayout(context);
        this.mPhotoView = pageViewItemLayout.initPhotoView(this.mImgModel.imgUrl, getScaleTypeByResize(this.mImgModel.resize), this.mImgModel.waterMarkText, this.mImgModel.waterMarkIconUrl, this, this);
        this.mPhotoView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.interactive_common.component.CXPhotoViewComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CXPhotoViewComponent.this.fireEvent("singleTap");
                }
            }
        });
        return pageViewItemLayout;
    }

    private ImageView.ScaleType getScaleTypeByResize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("1ae55066", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return ImageView.ScaleType.FIT_XY;
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
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (c == 1) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if (c == 2) {
            return ImageView.ScaleType.FIT_XY;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    @Override // com.taobao.android.interactive_common.view.PageViewItemLayout.a
    public void onLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
        } else {
            fireEvent("load");
        }
    }

    @Override // com.taobao.android.interactive_common.view.photoview.g
    public void onScaleChange(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945cef3e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (f > SCALE_MIN && f < SCALE_MAX) {
            if (!this.isScaleChange) {
                return;
            }
            this.isScaleChange = false;
            fireEvent("scalerecover");
        } else if (this.isScaleChange) {
        } else {
            this.isScaleChange = true;
            fireEvent("scalechange");
        }
    }
}
