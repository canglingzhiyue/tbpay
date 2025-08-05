package com.taobao.android.detail.mainpic.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.model.LocatorsModel;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.eue;
import tb.euf;
import tb.eug;
import tb.eup;

/* loaded from: classes4.dex */
public class LocatorsView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView highlightBgImageView;
    public ImageView locatorBgImageView;
    public LinearLayout locatorsView;
    public Context mContext;
    public LocatorsModel mLocatorsModel;
    public a mOnLocatorClickListener;

    /* loaded from: classes4.dex */
    public interface a {
        void a(LocatorsModel.LocatorItemModel locatorItemModel);
    }

    public static /* synthetic */ Object ipc$super(LocatorsView locatorsView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(LocatorsView locatorsView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad5044c", new Object[]{locatorsView, view});
        } else {
            locatorsView.updateHighlightBgImageView(view);
        }
    }

    public LocatorsView(Context context) {
        super(context);
        init(context);
    }

    public LocatorsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LocatorsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.locatorBgImageView = new ImageView(this.mContext);
        this.locatorBgImageView.setImageDrawable(this.mContext.getResources().getDrawable(R.drawable.main_pic_locator_bg));
        addView(this.locatorBgImageView, new FrameLayout.LayoutParams(-2, -2));
        this.highlightBgImageView = new ImageView(this.mContext);
        this.highlightBgImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.main_pic_locator_item_bg));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.highlightBgImageView.setVisibility(4);
        addView(this.highlightBgImageView, layoutParams);
        this.locatorsView = new LinearLayout(context);
        this.locatorsView.setOrientation(0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = (int) this.mContext.getResources().getDimension(R.dimen.main_pic_locatorbg_stroke_width);
        addView(this.locatorsView, layoutParams2);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.mainpic.widget.LocatorsView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                LocatorsView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int a2 = LocatorsView.this.mLocatorsModel.a();
                if (a2 >= 0 && a2 < LocatorsView.this.locatorsView.getChildCount()) {
                    View childAt = LocatorsView.this.locatorsView.getChildAt(a2);
                    int left = childAt.getLeft() + LocatorsView.this.locatorsView.getLeft();
                    int width = childAt.getWidth();
                    int height = childAt.getHeight();
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) LocatorsView.this.highlightBgImageView.getLayoutParams();
                    layoutParams3.leftMargin = left;
                    layoutParams3.width = width;
                    layoutParams3.height = height;
                    layoutParams3.gravity = 16;
                    LocatorsView.this.highlightBgImageView.setLayoutParams(layoutParams3);
                }
                int height2 = LocatorsView.this.locatorsView.getHeight() + (((int) LocatorsView.this.mContext.getResources().getDimension(R.dimen.main_pic_locatorbg_stroke_width)) << 1);
                int width2 = LocatorsView.this.locatorsView.getWidth() + (((int) LocatorsView.this.mContext.getResources().getDimension(R.dimen.main_pic_locatorbg_stroke_width)) << 1);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) LocatorsView.this.locatorBgImageView.getLayoutParams();
                layoutParams4.width = width2;
                layoutParams4.height = height2;
                LocatorsView.this.locatorBgImageView.setLayoutParams(layoutParams4);
            }
        });
    }

    public void bindLocators(LocatorsModel locatorsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295741c3", new Object[]{this, locatorsModel});
        } else if (locatorsModel != null) {
            this.mLocatorsModel = locatorsModel;
            for (LocatorsModel.LocatorItemModel locatorItemModel : this.mLocatorsModel.c()) {
                if (locatorItemModel.show) {
                    this.locatorsView.addView(generateLocatorItemView(locatorItemModel));
                }
            }
        }
    }

    private View generateLocatorItemView(LocatorsModel.LocatorItemModel locatorItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5ae6152a", new Object[]{this, locatorItemModel});
        }
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.main_pic_locator_item, (ViewGroup) this, false);
        inflate.setTag(locatorItemModel);
        TextView textView = (TextView) inflate.findViewById(R.id.locator_text);
        textView.setTextColor(Color.parseColor(this.mLocatorsModel.e));
        TIconFontTextView tIconFontTextView = (TIconFontTextView) inflate.findViewById(R.id.locator_iconFont);
        tIconFontTextView.setTextColor(Color.parseColor(this.mLocatorsModel.e));
        textView.setText(locatorItemModel.text);
        if (locatorItemModel.icon != null) {
            tIconFontTextView.setText(locatorItemModel.icon);
        } else {
            tIconFontTextView.setText(R.string.main_pic_iconfont_locator);
        }
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.widget.LocatorsView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (LocatorsView.this.mOnLocatorClickListener == null) {
                } else {
                    LocatorsView.this.mOnLocatorClickListener.a((LocatorsModel.LocatorItemModel) view.getTag());
                }
            }
        });
        return inflate;
    }

    public void refreshLocators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2881b1f", new Object[]{this});
        } else if (eup.a()) {
            refreshLocatorsWithAutoScroll();
        } else {
            startAnimation(this.mLocatorsModel.b(), this.mLocatorsModel.a());
        }
    }

    private void refreshLocatorsWithAutoScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9847b01", new Object[]{this});
            return;
        }
        boolean a2 = eup.a();
        boolean booleanValue = ((Boolean) eue.a(euf.class, Boolean.class, false)).booleanValue();
        int intValue = ((Integer) eue.a(eug.class, Integer.class, -1)).intValue();
        if (booleanValue && -1 != intValue) {
            startAnimation(this.mLocatorsModel.b(), intValue, true);
            eue.a(eug.class);
            return;
        }
        int a3 = this.mLocatorsModel.a();
        int b = this.mLocatorsModel.b();
        if (a2) {
            eue.a(new eug(Integer.valueOf(a3)));
        }
        startAnimation(b, a3);
    }

    public void startAnimation(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4aae9", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            startAnimation(i, i2, false);
        }
    }

    private void startAnimation(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe1650b", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (i == i2) {
        } else {
            if (i2 >= 0) {
                try {
                    if (i2 < this.locatorsView.getChildCount()) {
                        final View childAt = this.locatorsView.getChildAt(i2);
                        if (z) {
                            childAt.post(new Runnable() { // from class: com.taobao.android.detail.mainpic.widget.LocatorsView.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        LocatorsView.access$000(LocatorsView.this, childAt);
                                    }
                                }
                            });
                        } else {
                            updateHighlightBgImageView(childAt);
                        }
                        if (i < 0 || i >= this.locatorsView.getChildCount()) {
                        }
                        View childAt2 = this.locatorsView.getChildAt(i);
                        ((TextView) childAt2.findViewById(R.id.locator_text)).setTextColor(Color.parseColor(this.mLocatorsModel.e));
                        ((TIconFontTextView) childAt2.findViewById(R.id.locator_iconFont)).setTextColor(Color.parseColor(this.mLocatorsModel.e));
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.highlightBgImageView.setVisibility(8);
            if (i < 0) {
            }
        }
    }

    private void updateHighlightBgImageView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5eddfb", new Object[]{this, view});
            return;
        }
        ((TextView) view.findViewById(R.id.locator_text)).setTextColor(Color.parseColor(this.mLocatorsModel.d));
        ((TIconFontTextView) view.findViewById(R.id.locator_iconFont)).setTextColor(Color.parseColor(this.mLocatorsModel.d));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.highlightBgImageView.getLayoutParams();
        layoutParams.leftMargin = view.getLeft() + this.locatorsView.getLeft();
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        this.highlightBgImageView.setLayoutParams(layoutParams);
        this.highlightBgImageView.setVisibility(0);
    }

    public void setOnLocatorClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636be2d2", new Object[]{this, aVar});
        } else {
            this.mOnLocatorClickListener = aVar;
        }
    }
}
