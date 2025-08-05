package com.taobao.search.common.uikit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.uikit.RoundedCornersBitmapProcessor;
import com.taobao.search.common.util.q;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes7.dex */
public class SearchUrlImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "SearchUrlImageView";
    public static final ImageStrategyConfig STRATEGY_CONFIG;
    public static final ImageStrategyConfig STRATEGY_MAIN_SEARCH_AUCTION;
    public static final ImageStrategyConfig STRATEGY_P4P_AUCTION;
    private static final int TYPE_ALL = 0;
    private static final int TYPE_BOTTOM = 2;
    private static final int TYPE_LEFT = 3;
    private static final int TYPE_RIGHT = 4;
    private static final int TYPE_TOP = 1;
    private static boolean sIsFadeInEnabled;
    private int mCornerRadius;
    private int mCornerType;

    public static /* synthetic */ Object ipc$super(SearchUrlImageView searchUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == -826210649) {
            super.setImageUrl((String) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1076830602);
        sIsFadeInEnabled = false;
        STRATEGY_CONFIG = ImageStrategyConfig.a("search", 89).a();
        STRATEGY_MAIN_SEARCH_AUCTION = ImageStrategyConfig.a("search", 8910).a();
        STRATEGY_P4P_AUCTION = ImageStrategyConfig.a("search", 8911).a();
    }

    public SearchUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    public SearchUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public SearchUrlImageView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        setStrategyConfig(STRATEGY_CONFIG);
        setFadeIn(sIsFadeInEnabled);
        if (attributeSet == null || (obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SearchUrlImageView, 0, 0)) == null) {
            return;
        }
        this.mCornerType = obtainStyledAttributes.getInt(R.styleable.SearchUrlImageView_corner_type, -1);
        this.mCornerRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SearchUrlImageView_corner_radius, 0);
        obtainStyledAttributes.recycle();
    }

    public static void setFadeInEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05d63ef", new Object[]{new Boolean(z)});
            return;
        }
        sIsFadeInEnabled = z;
        q.i(LOG_TAG, "setFadeInEnabled:" + z);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setImageUrl(String str) {
        RoundedCornersBitmapProcessor roundedCornersBitmapProcessor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else if (this.mCornerType < 0 || this.mCornerRadius <= 0) {
            super.setImageUrl(str);
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                super.setImageUrl(str);
                return;
            }
            int width = layoutParams.width < 0 ? getWidth() : layoutParams.width;
            int height = layoutParams.height < 0 ? getHeight() : layoutParams.height;
            int i = this.mCornerType;
            if (i == 0) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(width, height, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.ALL, getScaleType());
            } else if (i == 1) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(width, height, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.TOP, getScaleType());
            } else if (i == 2) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(width, height, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.BOTTOM, getScaleType());
            } else if (i == 3) {
                roundedCornersBitmapProcessor = new RoundedCornersBitmapProcessor(width, height, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.LEFT, getScaleType());
            } else {
                roundedCornersBitmapProcessor = i != 4 ? null : new RoundedCornersBitmapProcessor(width, height, this.mCornerRadius, 0, RoundedCornersBitmapProcessor.CornerType.RIGHT, getScaleType());
            }
            if (roundedCornersBitmapProcessor == null) {
                super.setImageUrl(str);
            } else {
                setImageUrl(str, new PhenixOptions().bitmapProcessors(roundedCornersBitmapProcessor));
            }
        }
    }
}
