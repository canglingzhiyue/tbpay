package com.taobao.android.interactive_common.view;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.video.b;
import com.taobao.android.interactive_common.view.photoview.PhotoView;
import com.taobao.android.interactive_common.view.photoview.g;
import com.taobao.android.interactive_common.view.photoview.j;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.taobao.uikit.feature.features.ImageSaveFeature;
import tb.grt;

/* loaded from: classes5.dex */
public class PageViewItemLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PhotoView photoView;
    private TBProgressBar progressBar;
    private View videoLayout;
    private String waterMarkIconUrl;
    private String waterMarkText;

    /* loaded from: classes5.dex */
    public interface a {
        void onLoad();
    }

    public static /* synthetic */ TBProgressBar access$000(PageViewItemLayout pageViewItemLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBProgressBar) ipChange.ipc$dispatch("1bd0b363", new Object[]{pageViewItemLayout}) : pageViewItemLayout.progressBar;
    }

    public static /* synthetic */ PhotoView access$100(PageViewItemLayout pageViewItemLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoView) ipChange.ipc$dispatch("d85f617a", new Object[]{pageViewItemLayout}) : pageViewItemLayout.photoView;
    }

    public PageViewItemLayout(Context context) {
        super(context);
        init(context);
    }

    public PageViewItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public PageViewItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.videoLayout;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.videoLayout = LayoutInflater.from(context).inflate(R.layout.cx_rate_preview_video_layout, this);
        this.photoView = (PhotoView) this.videoLayout.findViewById(R.id.rate_image_preview);
        this.progressBar = (TBProgressBar) this.videoLayout.findViewById(R.id.rate_loading_progress);
    }

    public PhotoView initPhotoView(String str, ImageView.ScaleType scaleType, String str2, String str3, final a aVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoView) ipChange.ipc$dispatch("e7f980cf", new Object[]{this, str, scaleType, str2, str3, aVar, gVar});
        }
        this.photoView.setVisibility(0);
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.photoView.setScaleType(scaleType);
        if (!StringUtils.isEmpty(str) && str.endsWith(".gif")) {
            if (grt.b()) {
                this.photoView.setSkipAutoSize(false);
            } else {
                this.photoView.setSkipAutoSize(true);
            }
        } else {
            this.photoView.setSkipAutoSize(false);
        }
        if (b.c()) {
            final ImageSaveFeature imageSaveFeature = new ImageSaveFeature();
            this.photoView.addFeature(imageSaveFeature);
            this.photoView.setOnLongClickListener(new j() { // from class: com.taobao.android.interactive_common.view.PageViewItemLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.interactive_common.view.photoview.j
                public boolean a(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("ff88d03", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    imageSaveFeature.beforeOnTouchEvent(motionEvent);
                    imageSaveFeature.beforePerformLongClick();
                    return false;
                }
            });
        } else {
            final LocalImageSaveFeature localImageSaveFeature = new LocalImageSaveFeature();
            localImageSaveFeature.setWater(str2, str3);
            this.photoView.addFeature(localImageSaveFeature);
            this.photoView.setOnLongClickListener(new j() { // from class: com.taobao.android.interactive_common.view.PageViewItemLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.interactive_common.view.photoview.j
                public boolean a(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("ff88d03", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    localImageSaveFeature.beforeOnTouchEvent(motionEvent);
                    localImageSaveFeature.beforePerformLongClick();
                    return false;
                }
            });
        }
        this.photoView.setOnScaleChangeListener(gVar);
        this.photoView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.interactive_common.view.PageViewItemLayout.3
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
                if (succPhenixEvent != null) {
                    if (PageViewItemLayout.access$000(PageViewItemLayout.this) != null) {
                        PageViewItemLayout.access$000(PageViewItemLayout.this).setVisibility(8);
                    }
                    if (succPhenixEvent.getDrawable() != null && PageViewItemLayout.access$100(PageViewItemLayout.this) != null) {
                        PageViewItemLayout.access$100(PageViewItemLayout.this).setBackgroundColor(0);
                    }
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.onLoad();
                    }
                }
                return false;
            }
        });
        TBProgressBar tBProgressBar = this.progressBar;
        if (tBProgressBar != null) {
            tBProgressBar.setVisibility(0);
        }
        this.photoView.setImageUrl(str);
        return this.photoView;
    }
}
