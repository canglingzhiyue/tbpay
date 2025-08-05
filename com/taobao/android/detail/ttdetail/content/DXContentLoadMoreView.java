package com.taobao.android.detail.ttdetail.content;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes4.dex */
public class DXContentLoadMoreView extends DXAbsOnLoadMoreView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String iconUrl;
    private ImageView mLoadMoreIcon;
    private TextView mLoadMoreText;
    private View mLoadMoreView;
    private ObjectAnimator mRotation;

    static {
        kge.a(339118140);
    }

    public static /* synthetic */ Object ipc$super(DXContentLoadMoreView dXContentLoadMoreView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXContentLoadMoreView(Context context) {
        super(context);
        this.iconUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01kBqOxq1fNl95fpJWn_!!6000000003995-2-tps-72-72.png";
        init(context);
    }

    public DXContentLoadMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.iconUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01kBqOxq1fNl95fpJWn_!!6000000003995-2-tps-72-72.png";
        init(context);
    }

    public DXContentLoadMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iconUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01kBqOxq1fNl95fpJWn_!!6000000003995-2-tps-72-72.png";
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mLoadMoreView = inflate(context, R.layout.tt_detail_content_load_more, this);
        this.mLoadMoreIcon = (ImageView) this.mLoadMoreView.findViewById(R.id.detail_content_load_more_icon);
        this.mLoadMoreText = (TextView) this.mLoadMoreView.findViewById(R.id.detail_content_load_more_text);
        q.a(this.mLoadMoreIcon, this.iconUrl);
        this.mRotation = animatorInit(this.mLoadMoreIcon);
        this.mRotation.start();
    }

    private ObjectAnimator animatorInit(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("b12e1f5c", new Object[]{this, imageView});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView
    public void onLoadMoreStatusUpdate(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b6d829", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 6:
                this.mLoadMoreIcon.setVisibility(8);
                this.mLoadMoreText.setVisibility(8);
                return;
            case 2:
                this.mLoadMoreIcon.setVisibility(0);
                this.mLoadMoreText.setVisibility(8);
                return;
            case 5:
                this.mLoadMoreIcon.setVisibility(8);
                this.mLoadMoreText.setVisibility(0);
                return;
            default:
                return;
        }
    }
}
