package com.taobao.uikit.extend.feature.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.material.TBCircularProgressDrawable;
import tb.kge;

/* loaded from: classes9.dex */
public class TZoomPagerItem extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TZoomPagerItem";
    private LinearLayout mErrorView;
    private TZoomImageView mImageView;
    private ImageView mProgressBar;
    private TBCircularProgressDrawable mProgressDrawable;

    static {
        kge.a(-263281109);
    }

    public static /* synthetic */ Object ipc$super(TZoomPagerItem tZoomPagerItem, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 949399698) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetachedFromWindow();
            return null;
        }
    }

    public static /* synthetic */ ImageView access$000(TZoomPagerItem tZoomPagerItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("facbb451", new Object[]{tZoomPagerItem}) : tZoomPagerItem.mProgressBar;
    }

    public static /* synthetic */ TBCircularProgressDrawable access$100(TZoomPagerItem tZoomPagerItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("20e275c4", new Object[]{tZoomPagerItem}) : tZoomPagerItem.mProgressDrawable;
    }

    public static /* synthetic */ LinearLayout access$200(TZoomPagerItem tZoomPagerItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("7eac26b4", new Object[]{tZoomPagerItem}) : tZoomPagerItem.mErrorView;
    }

    public TZoomPagerItem(Context context) {
        super(context);
        init(context);
    }

    public TZoomPagerItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TZoomPagerItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.uik_zoom_page_item, this);
        this.mImageView = (TZoomImageView) inflate.findViewById(R.id.img);
        this.mProgressBar = (ImageView) inflate.findViewById(R.id.progressbar);
        this.mProgressDrawable = new TBCircularProgressDrawable(-1, 4.0f);
        this.mProgressDrawable.start();
        this.mProgressBar.setImageDrawable(this.mProgressDrawable);
        this.mErrorView = (LinearLayout) inflate.findViewById(R.id.error_view);
        this.mImageView.succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.uikit.extend.feature.view.TZoomPagerItem.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                TZoomPagerItem.access$000(TZoomPagerItem.this).setVisibility(8);
                if (TZoomPagerItem.access$100(TZoomPagerItem.this) != null) {
                    TZoomPagerItem.access$100(TZoomPagerItem.this).stop();
                }
                TZoomPagerItem.access$200(TZoomPagerItem.this).setVisibility(8);
                return false;
            }
        });
        this.mImageView.failListener(new a<FailPhenixEvent>() { // from class: com.taobao.uikit.extend.feature.view.TZoomPagerItem.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                TZoomPagerItem.access$000(TZoomPagerItem.this).setVisibility(8);
                if (TZoomPagerItem.access$100(TZoomPagerItem.this) != null) {
                    TZoomPagerItem.access$100(TZoomPagerItem.this).stop();
                }
                TZoomPagerItem.access$200(TZoomPagerItem.this).setVisibility(0);
                return false;
            }
        });
    }

    public TZoomImageView getImageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TZoomImageView) ipChange.ipc$dispatch("38a7e56d", new Object[]{this}) : this.mImageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        TBCircularProgressDrawable tBCircularProgressDrawable = this.mProgressDrawable;
        if (tBCircularProgressDrawable == null) {
            return;
        }
        tBCircularProgressDrawable.stop();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.mProgressDrawable == null) {
            return;
        }
        if (isShown() && this.mProgressBar.getVisibility() == 0) {
            this.mProgressDrawable.start();
        } else {
            this.mProgressDrawable.stop();
        }
    }
}
