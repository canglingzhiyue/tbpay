package com.taobao.detail.rate.widget.delegate.tag;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import tb.kil;
import tb.kqe;
import tb.kqf;
import tb.kqh;

/* loaded from: classes7.dex */
public class AssociationTagItemView extends LinearLayout implements kqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mCountText;
    private int mIndex;
    private boolean mIsSelected;
    private AssociationTagItem mItemTag;
    private kqe mStyle;
    private TextView mTitleText;

    public static /* synthetic */ Object ipc$super(AssociationTagItemView associationTagItemView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ AssociationTagItem access$000(AssociationTagItemView associationTagItemView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AssociationTagItem) ipChange.ipc$dispatch("5f85e4f1", new Object[]{associationTagItemView}) : associationTagItemView.mItemTag;
    }

    public AssociationTagItemView(Context context) {
        super(context);
        initView();
    }

    public AssociationTagItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public AssociationTagItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setOrientation(0);
        this.mTitleText = new TextView(getContext());
        this.mTitleText.setGravity(17);
        this.mCountText = new TextView(getContext());
        this.mCountText.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = kil.a(3.86f);
        TextView textView = this.mCountText;
        textView.setPadding(textView.getPaddingLeft(), com.taobao.android.litecreator.localization.a.a() ? 5 : 2, this.mCountText.getPaddingRight(), this.mCountText.getPaddingBottom());
        addView(this.mTitleText, layoutParams);
        addView(this.mCountText, layoutParams2);
    }

    private void refreshViewState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8fbd7c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mStyle.a(this.mTitleText, getIndex(), z);
        this.mStyle.b(this.mCountText, getIndex(), z);
        GradientDrawable a2 = this.mStyle.a(z);
        if (a2 == null) {
            return;
        }
        setBackgroundDrawable(a2);
    }

    private void settingTextView(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f40e405", new Object[]{this, textView, str});
        } else if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    public void bindData(kqe kqeVar, AssociationTagItem associationTagItem, int i, final kqh<AssociationTagItem> kqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27eb2b6", new Object[]{this, kqeVar, associationTagItem, new Integer(i), kqhVar});
            return;
        }
        this.mStyle = kqeVar;
        this.mItemTag = associationTagItem;
        setIndex(i);
        settingTextView(this.mTitleText, associationTagItem.title);
        settingTextView(this.mCountText, associationTagItem.fuzzyCount);
        this.mStyle.a(this);
        refreshViewState(false);
        setOnClickListener(new View.OnClickListener() { // from class: com.taobao.detail.rate.widget.delegate.tag.AssociationTagItemView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    kqhVar.a(AssociationTagItemView.this.getIndex(), AssociationTagItemView.access$000(AssociationTagItemView.this));
                }
            }
        });
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.mIndex = i;
        }
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.mIndex;
    }

    @Override // tb.kqf
    public void setSelectedStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca8491e", new Object[]{this, new Boolean(z)});
        } else if (z == this.mIsSelected) {
        } else {
            this.mIsSelected = z;
            refreshViewState(z);
        }
    }

    public boolean isSelectedStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b46e2742", new Object[]{this})).booleanValue() : this.mIsSelected;
    }
}
