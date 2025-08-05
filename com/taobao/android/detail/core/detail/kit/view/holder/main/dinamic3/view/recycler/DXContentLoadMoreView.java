package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.recycler;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DXContentLoadMoreView extends DXAbsOnLoadMoreView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String iconUrl;
    private DetailImageView mLoadMoreIcon;
    private TextView mLoadMoreText;
    private View mLoadMoreView;
    private ObjectAnimator mRotation;

    static {
        kge.a(-1014274945);
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
        this.mLoadMoreView = inflate(context, R.layout.x_detail_content_load_more, this);
        this.mLoadMoreIcon = (DetailImageView) this.mLoadMoreView.findViewById(R.id.detail_content_load_more_icon);
        this.mLoadMoreText = (TextView) this.mLoadMoreView.findViewById(R.id.detail_content_load_more_text);
        f.a(context).a(this.mLoadMoreIcon, this.iconUrl);
        this.mRotation = animatorInit(this.mLoadMoreIcon);
        this.mRotation.start();
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.recycler.DXContentLoadMoreView");
    }

    private ObjectAnimator animatorInit(DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("80ae0535", new Object[]{this, detailImageView});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(detailImageView, "rotation", 0.0f, 360.0f);
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
