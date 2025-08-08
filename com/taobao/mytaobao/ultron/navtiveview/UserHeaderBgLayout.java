package com.taobao.mytaobao.ultron.navtiveview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.c;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.mytaobao.homepage.busniess.model.SkinData;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.gbg;
import tb.jpw;
import tb.kge;
import tb.mxa;
import tb.mxo;
import tb.mxq;
import tb.xoy;

/* loaded from: classes7.dex */
public class UserHeaderBgLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int headerItemHeight;
    private int mBlurHeight;
    private TUrlImageView mImageHeaderBg;
    private Runnable mOnCreateRunnable;
    private int mParentScrollY;
    private int mRecycleViewScrollY;
    private final SparseIntArray mRecyclerItemHeight;
    private RecyclerView mRecyclerView;
    public RecyclerView.OnScrollListener mScrollListener;
    private int mScrollY;
    private ThemeFrameLayout mThemeView;
    private int mantleBlurHeight;
    private View rootView;

    static {
        kge.a(705082499);
    }

    public static /* synthetic */ Object ipc$super(UserHeaderBgLayout userHeaderBgLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(UserHeaderBgLayout userHeaderBgLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177e6b75", new Object[]{userHeaderBgLayout, recyclerView});
        } else {
            userHeaderBgLayout.onScroll(recyclerView);
        }
    }

    public UserHeaderBgLayout(Context context) {
        this(context, null);
    }

    public UserHeaderBgLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UserHeaderBgLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollY = 0;
        this.mParentScrollY = 0;
        this.mRecycleViewScrollY = 0;
        this.mBlurHeight = 0;
        this.mRecyclerItemHeight = new SparseIntArray();
        this.mScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i2)});
                } else {
                    UserHeaderBgLayout.access$000(UserHeaderBgLayout.this, recyclerView);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                } else {
                    UserHeaderBgLayout.access$000(UserHeaderBgLayout.this, recyclerView);
                }
            }
        };
    }

    public void considerLazyInitThemeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbc4d18", new Object[]{this});
        } else if (this.mThemeView != null) {
        } else {
            if (mxa.c()) {
                initThemeView(getContext());
            } else {
                initView(getContext(), this);
            }
        }
    }

    private void initView(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6425ab", new Object[]{this, context, viewGroup});
            return;
        }
        this.rootView = LayoutInflater.from(context).inflate(R.layout.mtb_user_header_bg_layout, viewGroup, false);
        this.mImageHeaderBg = (TUrlImageView) this.rootView.findViewById(R.id.img_header_bg);
        this.mImageHeaderBg.setAutoRelease(false);
        this.mImageHeaderBg.setWhenNullClearImg(false);
        Runnable runnable = this.mOnCreateRunnable;
        if (runnable != null) {
            runnable.run();
            this.mOnCreateRunnable = null;
        }
        this.headerItemHeight = mxq.b(190);
        updateHeaderBgHeight(this.headerItemHeight);
        addView(this.rootView);
    }

    private void initThemeView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282d03", new Object[]{this, context});
            return;
        }
        this.mantleBlurHeight = gbg.a(context, jpw.a("mtbMantleBlurHeight", 80));
        this.headerItemHeight = mxq.b(210);
        this.mBlurHeight = mxq.b(30);
        g gVar = new g("mytaobao", gbg.c(context));
        gVar.d = this.headerItemHeight;
        gVar.h = ((gbg.c(context) - this.headerItemHeight) - this.mBlurHeight) + this.mantleBlurHeight;
        gVar.g = c.a("#f2f2f2");
        gVar.f = true;
        gVar.i = true;
        gVar.j = this.mBlurHeight;
        gVar.k = this.mantleBlurHeight;
        this.mThemeView = j.a().a(context, gVar);
        addView(this.mThemeView, -1, -1);
    }

    private void updateHeaderBgHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b69b7fa", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mImageHeaderBg.getLayoutParams();
        layoutParams.height = i;
        this.mImageHeaderBg.setLayoutParams(layoutParams);
    }

    public void setParentListView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39a064", new Object[]{this, recyclerView});
            return;
        }
        this.mRecyclerView = recyclerView;
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
    }

    public void processOnScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d29721", new Object[]{this, new Integer(i)});
            return;
        }
        notifyScroll(this.mRecycleViewScrollY + i);
        this.mParentScrollY = i;
    }

    public void updateThemeHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75c43f5", new Object[]{this, new Integer(i)});
        } else if (!mxa.c() || this.mThemeView == null) {
        } else {
            int c = ((gbg.c(getContext()) - this.mBlurHeight) - i) + this.mantleBlurHeight;
            if (l.b(getContext())) {
                c -= gbg.a(getContext(), 60.0f);
            }
            this.mThemeView.updateCoverHeight(c);
        }
    }

    public void loadData(SkinData skinData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b8e393", new Object[]{this, skinData});
        } else if (skinData == null) {
        } else {
            int b = mxq.b(xoy.a(skinData.bgHeight, skinData.horizontalBgHeight, 280));
            if (b != this.headerItemHeight) {
                this.headerItemHeight = b;
                updateHeaderBgHeight(b);
            }
            String str = skinData.skinColor;
            String str2 = skinData.skinPic;
            if ("normal".equals(skinData.vipType) && mxo.d()) {
                if (!StringUtils.isEmpty(skinData.whiteSkinColor)) {
                    str = skinData.whiteSkinColor;
                }
                if (!StringUtils.isEmpty(skinData.whiteSkinPic)) {
                    str2 = skinData.whiteSkinPic;
                }
            }
            if (!StringUtils.isEmpty(str)) {
                ColorDrawable colorDrawable = new ColorDrawable(mxq.b(str));
                this.mImageHeaderBg.setBackgroundDrawable(colorDrawable);
                this.mImageHeaderBg.setPlaceHoldForeground(colorDrawable);
            }
            this.mImageHeaderBg.setImageUrl(str2);
        }
    }

    private void onScroll(RecyclerView recyclerView) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d44e41", new Object[]{this, recyclerView});
            return;
        }
        int firstVisibleItemPosition = getFirstVisibleItemPosition(recyclerView);
        View childAt2 = recyclerView.getChildAt(0);
        if (childAt2 == null || childAt2.getHeight() <= 0 || (childAt = recyclerView.getLayoutManager().getChildAt(0)) == null) {
            return;
        }
        int i = -childAt.getTop();
        this.mRecyclerItemHeight.put(firstVisibleItemPosition, childAt.getHeight());
        for (int i2 = 0; i2 < firstVisibleItemPosition; i2++) {
            i += this.mRecyclerItemHeight.get(i2);
        }
        this.mRecycleViewScrollY = i;
        notifyScroll(i + this.mParentScrollY);
    }

    private int getFirstVisibleItemPosition(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("815e2c3c", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
    }

    private void notifyScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597ca9a6", new Object[]{this, new Integer(i)});
        } else if (i == this.mScrollY) {
        } else {
            if (i == Integer.MAX_VALUE) {
                i = -getTop();
            }
            this.mScrollY = i;
            if (mxa.c()) {
                ThemeFrameLayout themeFrameLayout = this.mThemeView;
                if (themeFrameLayout == null) {
                    return;
                }
                themeFrameLayout.setOnScrollY(this.mScrollY);
                return;
            }
            setTranslationY(-i);
        }
    }
}
