package com.taobao.android.tbtheme.kit;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.i;
import com.taobao.android.tbtheme.p;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.gbg;
import tb.jdk;
import tb.jdl;
import tb.kge;
import tb.mxf;

/* loaded from: classes6.dex */
public class ThemeFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private FrameLayout mBgImageContainerLayout;
    private View mBlurView;
    private int mScrollY;
    private g mThemeConfig;
    private ThemeData mThemeData;
    private int mTranslateY;
    private TUrlImageView mUrlIvBg;
    private LinearLayout mViewMantle;
    private View mViewMantleBG;
    private View mViewMantleBlur;

    static {
        kge.a(-1482160786);
    }

    public static /* synthetic */ Object ipc$super(ThemeFrameLayout themeFrameLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f9bf87", new Object[]{themeFrameLayout, new Integer(i)});
        } else {
            themeFrameLayout.setBlurColor(i);
        }
    }

    public static /* synthetic */ void access$100(ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688dc888", new Object[]{themeFrameLayout, new Integer(i)});
        } else {
            themeFrameLayout.setPicColor(i);
        }
    }

    public static /* synthetic */ void access$200(ThemeFrameLayout themeFrameLayout, SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff326042", new Object[]{themeFrameLayout, succPhenixEvent});
        } else {
            themeFrameLayout.resizeImageViewWhenPictureSuccessDownloaded(succPhenixEvent);
        }
    }

    public ThemeFrameLayout(Context context) {
        this(context, null, 0);
    }

    public ThemeFrameLayout(Context context, g gVar) {
        this(context, null, 0, gVar);
    }

    public ThemeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThemeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public ThemeFrameLayout(Context context, AttributeSet attributeSet, int i, g gVar) {
        super(context, attributeSet, i);
        this.TAG = "ThemeFrameLayout";
        this.mScrollY = 0;
        this.mTranslateY = 0;
        m.a("ThemeFrameLayout", "ThemeFrameLayout", "create");
        initView(gVar);
        if (jdk.a(context)) {
            jdl.a(this, gVar);
        }
        loadData();
    }

    private void initView(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc5c1e4", new Object[]{this, gVar});
            return;
        }
        Context context = getContext();
        this.mUrlIvBg = new TUrlImageView(context);
        this.mUrlIvBg.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mUrlIvBg.setAutoRelease(false);
        this.mUrlIvBg.setWhenNullClearImg(true);
        this.mBgImageContainerLayout = new FrameLayout(context);
        this.mBgImageContainerLayout.addView(this.mUrlIvBg, -1, -1);
        initMantle();
        this.mBlurView = new View(context);
        this.mBlurView.setVisibility(8);
        addView(this.mBgImageContainerLayout, -1, -1);
        addView(this.mBlurView, -1, 0);
        addView(this.mViewMantle, -1, 0);
        setSkinViewConfig(gVar);
        m.a("ThemeFrameLayout", mxf.initView, mxf.initView);
    }

    private void initMantle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cbb58a", new Object[]{this});
            return;
        }
        this.mViewMantle = new LinearLayout(getContext());
        this.mViewMantle.setOrientation(1);
        this.mViewMantleBlur = new View(getContext());
        this.mViewMantleBG = new View(getContext());
        this.mViewMantleBG.setBackgroundColor(c.F2COLOR);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{c.F2COLOR_TRANSPARENT, c.F2COLOR});
        this.mViewMantleBlur.setBackground(gradientDrawable);
        this.mViewMantle.addView(this.mViewMantleBlur, -1, gbg.a(getContext(), 20.0f));
        this.mViewMantle.addView(this.mViewMantleBG, -1, -1);
    }

    public void setSkinViewConfig(g gVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec8e9f5", new Object[]{this, gVar});
        } else if (gVar == null) {
        } else {
            m.a("ThemeFrameLayout", "setSkinViewConfig", "Convert-skinHeight=" + gVar.f + gVar.d);
            this.mThemeConfig = gVar;
            if (gVar.f) {
                this.mViewMantle.setVisibility(0);
                this.mViewMantleBG.setBackgroundColor(gVar.g);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mViewMantle.getLayoutParams();
                layoutParams.height = gVar.h;
                layoutParams.gravity = 80;
                this.mViewMantle.setLayoutParams(layoutParams);
            } else {
                this.mViewMantle.setVisibility(8);
            }
            if (this.mThemeConfig.d > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.mBgImageContainerLayout.getLayoutParams();
                layoutParams2.height = this.mThemeConfig.d;
                this.mBgImageContainerLayout.setLayoutParams(layoutParams2);
            }
            if (this.mThemeConfig.k > 0) {
                ViewGroup.LayoutParams layoutParams3 = this.mViewMantleBlur.getLayoutParams();
                layoutParams3.height = this.mThemeConfig.k;
                this.mViewMantleBlur.setLayoutParams(layoutParams3);
            }
            if (this.mThemeConfig.i) {
                this.mBlurView.setVisibility(0);
                if (this.mThemeConfig.j <= 0) {
                    this.mThemeConfig.j = gbg.a(getContext(), 20.0f);
                }
                int i2 = this.mThemeConfig.j;
                if (this.mThemeConfig.d > 0) {
                    i = (this.mThemeConfig.d - i2) + 2;
                }
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.mBlurView.getLayoutParams();
                layoutParams4.height = i2;
                if (i > 0) {
                    layoutParams4.topMargin = i;
                } else {
                    layoutParams4.gravity = 80;
                }
                this.mBlurView.setLayoutParams(layoutParams4);
            }
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            if (layoutParams5 == null) {
                layoutParams5 = new ViewGroup.LayoutParams(-1, gVar.c);
            } else {
                layoutParams5.height = gVar.c;
            }
            setLayoutParams(layoutParams5);
        }
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        g gVar = this.mThemeConfig;
        if (gVar == null) {
            return null;
        }
        return gVar.f15437a;
    }

    public void updateHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb3d60c", new Object[]{this, new Integer(i)});
            return;
        }
        m.a("ThemeFrameLayout", "updateHeight", "Height=" + i);
        g gVar = this.mThemeConfig;
        if (gVar != null) {
            gVar.c = i;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public void updateImageHeight(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d78123", new Object[]{this, new Integer(i)});
            return;
        }
        m.a("ThemeFrameLayout", "updateImageHeight", "Height=" + i);
        g gVar = this.mThemeConfig;
        if (gVar != null) {
            gVar.d = i;
        }
        ViewGroup.LayoutParams layoutParams = this.mBgImageContainerLayout.getLayoutParams();
        layoutParams.height = i;
        this.mBgImageContainerLayout.setLayoutParams(layoutParams);
        g gVar2 = this.mThemeConfig;
        if (gVar2 == null || !gVar2.i) {
            return;
        }
        this.mBlurView.setVisibility(0);
        if (this.mThemeConfig.j <= 0) {
            this.mThemeConfig.j = gbg.a(getContext(), 20.0f);
        }
        int i3 = this.mThemeConfig.j;
        if (this.mThemeConfig.d > 0) {
            i2 = (this.mThemeConfig.d - i3) + 2;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mBlurView.getLayoutParams();
        layoutParams2.height = i3;
        if (i2 > 0) {
            layoutParams2.topMargin = i2;
        } else {
            layoutParams2.gravity = 80;
        }
        this.mBlurView.setLayoutParams(layoutParams2);
    }

    public void updateCoverHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11540547", new Object[]{this, new Integer(i)});
            return;
        }
        g gVar = this.mThemeConfig;
        if (gVar == null || !gVar.f) {
            return;
        }
        this.mThemeConfig.h = i;
        ViewGroup.LayoutParams layoutParams = this.mViewMantle.getLayoutParams();
        layoutParams.height = i;
        this.mViewMantle.setLayoutParams(layoutParams);
    }

    private void loadData() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
        } else if (this.mThemeData == null) {
        } else {
            m.a("ThemeFrameLayout", "loadData", "skinColor=" + this.mThemeData.skinColor + this.mThemeData.skinPic);
            String str = this.mThemeData.skinColor;
            String str2 = this.mThemeData.skinPic;
            if (this.mThemeConfig.b == 1) {
                str = this.mThemeData.actionBarBackgroundColor;
                str2 = this.mThemeData.actionBarBackgroundImage;
            }
            if (!TextUtils.isEmpty(str) && !p.a(getContext())) {
                i = c.a(str);
                this.mUrlIvBg.setBackgroundColor(i);
            }
            doImageResizeAfterPictureDownload();
            if (!p.a(getContext())) {
                this.mUrlIvBg.setImageUrl(str2);
                setBlurColor(i);
            }
            if (this.mThemeConfig.d <= 0) {
                return;
            }
            setPicColor(i);
            if (TextUtils.isEmpty(str2) || this.mThemeData.ignoreImageColor) {
                return;
            }
            j.a().a(str2, new i.a() { // from class: com.taobao.android.tbtheme.kit.ThemeFrameLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbtheme.kit.i.a
                public void a(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    ThemeFrameLayout.access$000(ThemeFrameLayout.this, i2);
                    ThemeFrameLayout.access$100(ThemeFrameLayout.this, i2);
                }
            });
        }
    }

    private void doImageResizeAfterPictureDownload() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d806a35", new Object[]{this});
        } else if (this.mThemeConfig == null || this.mUrlIvBg == null || !f.a(f.ORANGE_KEY_RESIZE_IMAGE_VIEW, true)) {
        } else {
            if (this.mThemeConfig.d > 0) {
                z = true;
            }
            if (!z) {
                return;
            }
            this.mUrlIvBg.succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.android.tbtheme.kit.ThemeFrameLayout.2
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
                    ThemeFrameLayout.access$200(ThemeFrameLayout.this, succPhenixEvent);
                    return false;
                }
            });
        }
    }

    private void resizeImageViewWhenPictureSuccessDownloaded(SuccPhenixEvent succPhenixEvent) {
        ViewGroup.LayoutParams layoutParams;
        BitmapDrawable drawable;
        int width;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15af1ec1", new Object[]{this, succPhenixEvent});
            return;
        }
        TUrlImageView tUrlImageView = this.mUrlIvBg;
        if (tUrlImageView == null || succPhenixEvent == null || (layoutParams = tUrlImageView.getLayoutParams()) == null || (drawable = succPhenixEvent.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || (width = (int) (this.mUrlIvBg.getWidth() * (intrinsicHeight / intrinsicWidth))) <= 0 || layoutParams.height == width) {
            return;
        }
        layoutParams.height = width;
        this.mUrlIvBg.setLayoutParams(layoutParams);
    }

    private void setPicColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b241c1", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(i);
        }
    }

    private void setBlurColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9fa2a2", new Object[]{this, new Integer(i)});
        } else if (!this.mThemeConfig.i) {
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (this.mThemeConfig.d > 0) {
                gradientDrawable.setColors(new int[]{c.a(0, i), i});
            } else {
                gradientDrawable.setColors(new int[]{c.F2COLOR_TRANSPARENT, c.F2COLOR});
            }
            this.mBlurView.setBackground(gradientDrawable);
        }
    }

    public void loadData(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3189973", new Object[]{this, themeData});
            return;
        }
        this.mThemeData = themeData;
        loadData();
    }

    public void onScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7c332f", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollY += i;
        LinearLayout linearLayout = this.mViewMantle;
        if (linearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams.height >= l.a() && layoutParams.height <= 0) {
            return;
        }
        layoutParams.height = this.mThemeConfig.h + (this.mScrollY > this.mThemeConfig.c ? this.mThemeConfig.c : this.mScrollY);
        this.mViewMantle.setLayoutParams(layoutParams);
        this.mViewMantle.requestLayout();
    }

    public void setOnScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a6831", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollY = i;
        LinearLayout linearLayout = this.mViewMantle;
        if (linearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams.height >= l.a() && layoutParams.height <= 0) {
            return;
        }
        layoutParams.height = this.mThemeConfig.h + (this.mScrollY > this.mThemeConfig.c ? this.mThemeConfig.c : this.mScrollY);
        this.mViewMantle.setLayoutParams(layoutParams);
    }

    public void setTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06178af", new Object[]{this, new Integer(i)});
            return;
        }
        this.mTranslateY = i;
        setTranslationY(this.mTranslateY);
    }
}
