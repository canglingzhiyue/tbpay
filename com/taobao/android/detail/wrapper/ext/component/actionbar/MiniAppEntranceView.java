package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.imagecompat.AliImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import tb.emu;
import tb.fpr;
import tb.kge;

/* loaded from: classes5.dex */
public class MiniAppEntranceView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appID;
    private AliImageView ivAppIcon;
    private int originWidth;
    private RelativeLayout rlContainer;
    private TextView tvAppName;

    static {
        kge.a(1105038892);
    }

    public MiniAppEntranceView(Context context) {
        super(context);
        this.originWidth = -1;
        init();
    }

    public MiniAppEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.originWidth = -1;
        init();
    }

    public MiniAppEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.originWidth = -1;
        init();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.MiniAppEntranceView");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.x_detail_lightapp_entrance, (ViewGroup) this, true);
        this.rlContainer = (RelativeLayout) inflate.findViewById(R.id.rl_app);
        this.ivAppIcon = (AliImageView) inflate.findViewById(R.id.iv_app_icon);
        ImageShapeFeature imageShapeFeature = (ImageShapeFeature) this.ivAppIcon.findFeature(ImageShapeFeature.class);
        if (imageShapeFeature == null) {
            imageShapeFeature = new ImageShapeFeature();
            this.ivAppIcon.addFeature(imageShapeFeature);
        }
        float a2 = fpr.a(getContext(), 12.5f);
        imageShapeFeature.setCornerRadius(a2, a2, a2, a2);
        imageShapeFeature.setShape(0);
        this.tvAppName = (TextView) inflate.findViewById(R.id.tv_app_name);
        this.tvAppName.setTextColor(-1);
        setVisibility(8);
    }

    public void setAppID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531292cb", new Object[]{this, str});
        } else {
            this.appID = str;
        }
    }

    public void updateViewStatus(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22784379", new Object[]{this, new Float(f)});
            return;
        }
        if (f > 0.99d) {
            f = 1.0f;
        }
        if (f < 0.02d) {
            f = 0.0f;
        }
        if (this.originWidth < 0) {
            this.originWidth = this.rlContainer.getWidth();
        }
        ViewGroup.LayoutParams layoutParams = this.rlContainer.getLayoutParams();
        int i = this.originWidth;
        layoutParams.width = i - ((int) ((i - fpr.a(getContext(), 31.0f)) * f));
        this.rlContainer.setLayoutParams(layoutParams);
        Drawable drawable = getResources().getDrawable(R.drawable.x_detail_actionbar_miniapp_bg);
        float f2 = 1.0f - f;
        drawable.setAlpha((int) (255.0f * f2));
        this.rlContainer.setBackgroundDrawable(drawable);
        float f3 = (f2 * 4.0f) - 3.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        this.tvAppName.setAlpha(f3);
    }

    public static String getAppID(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23fef256", new Object[]{intent});
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        return data.getQueryParameter("miniAppId");
    }
}
