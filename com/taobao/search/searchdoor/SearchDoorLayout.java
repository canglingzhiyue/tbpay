package com.taobao.search.searchdoor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.taobao.android.searchbaseframe.uikit.ImmersiveRelativeLayout;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes7.dex */
public final class SearchDoorLayout extends ImmersiveRelativeLayout {
    private final FrameLayout activateContainer;
    private final TUrlImageView atmosphereImg;
    private final TUrlImageView headerImg;
    private final LinearLayout searchBarContainer;
    private final FrameLayout speechContainer;
    private final FrameLayout suggestContainer;

    static {
        kge.a(-1780727419);
    }

    public SearchDoorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.headerImg = new TUrlImageView(context);
        this.searchBarContainer = new LinearLayout(context);
        this.atmosphereImg = new TUrlImageView(context);
        this.activateContainer = new FrameLayout(context);
        this.suggestContainer = new FrameLayout(context);
        this.speechContainer = new FrameLayout(context);
        setId(R.id.tbsearch_searchdoor);
        this.headerImg.setId(R.id.imv_searchdoor_header);
        this.headerImg.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.headerImg.setLayoutParams(new RelativeLayout.LayoutParams(-1, j.a(150.0f)));
        addView(this.headerImg);
        this.searchBarContainer.setId(R.id.tbsearch_searchbar_container);
        this.searchBarContainer.setOrientation(1);
        addView(this.searchBarContainer, new RelativeLayout.LayoutParams(-1, -2));
        this.atmosphereImg.setId(R.id.tbsearch_atmosphere_logo);
        this.atmosphereImg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.atmosphereImg.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, R.id.tbsearch_searchbar_container);
        addView(this.atmosphereImg, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, R.id.tbsearch_atmosphere_logo);
        this.activateContainer.setId(R.id.tbsearch_activate_container);
        this.activateContainer.setBackgroundResource(R.drawable.tbsearch_sortbar_background);
        addView(this.activateContainer, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, R.id.tbsearch_atmosphere_logo);
        this.suggestContainer.setId(R.id.tbsearch_suggest_container);
        addView(this.suggestContainer, layoutParams3);
        this.speechContainer.setId(R.id.tbsearch_realtime_speech_container);
        addView(this.speechContainer, new RelativeLayout.LayoutParams(-1, -1));
    }
}
