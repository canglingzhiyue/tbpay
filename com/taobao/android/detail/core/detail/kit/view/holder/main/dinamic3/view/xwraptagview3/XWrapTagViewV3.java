package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.trade.event.f;
import java.util.ArrayList;
import tb.ehk;
import tb.ehq;
import tb.emu;
import tb.epj;
import tb.epl;
import tb.epo;
import tb.fpz;
import tb.kge;

/* loaded from: classes4.dex */
public class XWrapTagViewV3 extends AutoWrapLayoutV3 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAIN_RATEINFO_TAG_ID = 26666;
    private int containerHeight;
    private int contentPaddingBottom;
    private int contentPaddingLeft;
    private int contentPaddingRight;
    private int contentPaddingTop;
    private String fixTagString;
    private Context mContext;
    private int mLineNum;
    private View mRateTagsView;
    private AutoWrapLayoutV3 mTagContainer;
    private int maxTagWidth;
    private int spaceBetweenTags;
    private int tagBackgroundColor;
    private int tagHeight;
    private int textColor;
    private int textSize;

    static {
        kge.a(-1738754179);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(XWrapTagViewV3 xWrapTagViewV3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1007119314) {
            super.setItemSpacing(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != -364667690) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.addLayoutEndView((View) objArr[0]);
            return null;
        }
    }

    public XWrapTagViewV3(Context context) {
        super(context);
        this.containerHeight = 0;
        this.contentPaddingLeft = 0;
        this.contentPaddingRight = 0;
        this.contentPaddingTop = 0;
        this.contentPaddingBottom = 0;
        this.maxTagWidth = 0;
        this.spaceBetweenTags = 0;
        this.textSize = 0;
        this.textColor = 0;
        this.tagBackgroundColor = -592138;
        this.tagHeight = 0;
        this.mLineNum = 1;
        this.mTagContainer = null;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.XWrapTagViewV3");
    }

    public XWrapTagViewV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.containerHeight = 0;
        this.contentPaddingLeft = 0;
        this.contentPaddingRight = 0;
        this.contentPaddingTop = 0;
        this.contentPaddingBottom = 0;
        this.maxTagWidth = 0;
        this.spaceBetweenTags = 0;
        this.textSize = 0;
        this.textColor = 0;
        this.tagBackgroundColor = -592138;
        this.tagHeight = 0;
        this.mLineNum = 1;
        this.mTagContainer = null;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.XWrapTagViewV3");
    }

    public void setLineNumAndOpenSimplifiedMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb34b7d", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                this.mLineNum = Integer.parseInt(str);
                if (this.mLineNum <= 0) {
                    return;
                }
                setSimplifiedMode(true, this.mLineNum);
            } catch (Exception e) {
                i.a("DetailCommentTagsView", "解析LineNum失败", e);
            }
        }
    }

    public void setTagList(ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8a3ad", new Object[]{this, arrayList});
            return;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                String str = arrayList.get(i).b;
                String str2 = arrayList.get(i).f9585a;
                int i2 = i + MAIN_RATEINFO_TAG_ID;
                if (!TextUtils.isEmpty(str2)) {
                    int i3 = this.tagHeight;
                    ModifiableRoundRadiusImageView createImageTag = createImageTag(i2, i3, i3, str2);
                    int i4 = this.tagHeight;
                    addView(createImageTag, new ViewGroup.LayoutParams(i4, i4));
                } else if (!TextUtils.isEmpty(str)) {
                    addView(createTextTag(i2, this.maxTagWidth, str));
                }
            }
        }
        if (getChildCount() == 0) {
            hideContentView();
        }
        requestLayout();
    }

    public void hideContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3262a3", new Object[]{this});
        } else if (!(this instanceof ViewGroup)) {
        } else {
            removeAllViews();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.AutoWrapLayoutV3
    public void addLayoutEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea439cd6", new Object[]{this, view});
            return;
        }
        super.addLayoutEndView(view);
        if (view != null) {
            view.setOnClickListener(this);
        }
        requestLayout();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        view.getId();
        f.a(fpz.c(this.mContext), new OpenSkuEvent(SkuBottomBarStyleDTO.ADD_CART_AND_BUY));
    }

    private TextView createTextTag(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("a53e4736", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        TextView textView = new TextView(this.mContext);
        textView.setId(i);
        textView.setPadding(com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b.TAG_LEFT_RIGHT_PADDING, com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b.TAG_TOP_BOTTOM_PADDING, com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b.TAG_LEFT_RIGHT_PADDING, com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b.TAG_TOP_BOTTOM_PADDING);
        textView.setMaxWidth(i2);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(0, this.textSize);
        textView.setTextColor(this.textColor);
        textView.setText(str);
        textView.setGravity(16);
        textView.setBackgroundDrawable(b.a(((int) epo.f27511a) * 6, this.tagBackgroundColor));
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, this.tagHeight));
        textView.setOnClickListener(this);
        return textView;
    }

    private ModifiableRoundRadiusImageView createImageTag(int i, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModifiableRoundRadiusImageView) ipChange.ipc$dispatch("19eaaf5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), str});
        }
        ModifiableRoundRadiusImageView modifiableRoundRadiusImageView = new ModifiableRoundRadiusImageView(this.mContext);
        modifiableRoundRadiusImageView.setBorderRadius(((int) epo.f27511a) * 6);
        modifiableRoundRadiusImageView.setId(i);
        modifiableRoundRadiusImageView.setPadding(0, 0, 0, 0);
        modifiableRoundRadiusImageView.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
        ehq d = ehk.d();
        if (d != null) {
            modifiableRoundRadiusImageView.setImageDrawable(getResources().getDrawable(d.a()));
        }
        modifiableRoundRadiusImageView.setBackgroundDrawable(b.a(((int) epo.f27511a) * 6, this.tagBackgroundColor));
        modifiableRoundRadiusImageView.setOnClickListener(this);
        epl.a aVar = new epl.a();
        aVar.c(true);
        epj.b().a(str, modifiableRoundRadiusImageView, new epl(aVar));
        return modifiableRoundRadiusImageView;
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textColor = i;
        }
    }

    public int getTextColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue() : this.textColor;
    }

    public void setTextSizeInPixel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bef850b", new Object[]{this, new Integer(i)});
            return;
        }
        this.textSize = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextSize(0, i);
            }
        }
        requestLayout();
    }

    public void setTagHeightInPixel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50c9405a", new Object[]{this, new Integer(i)});
            return;
        }
        this.tagHeight = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-2, i);
                } else {
                    layoutParams.height = i;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
        requestLayout();
    }

    public int getTextSizePixel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("976c581c", new Object[]{this})).intValue() : this.textSize;
    }

    public int getContainerHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue() : this.containerHeight;
    }

    public void setContainerHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a6aad6", new Object[]{this, new Integer(i)});
        } else {
            this.containerHeight = i;
        }
    }

    public int getContentPaddingLeft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc82216f", new Object[]{this})).intValue() : this.contentPaddingLeft;
    }

    public void setContentPaddingLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f2667b", new Object[]{this, new Integer(i)});
        } else {
            this.contentPaddingLeft = i;
        }
    }

    public int getContentPaddingRight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d12a8de8", new Object[]{this})).intValue() : this.contentPaddingRight;
    }

    public void setContentPaddingRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f46cba", new Object[]{this, new Integer(i)});
        } else {
            this.contentPaddingRight = i;
        }
    }

    public int getContentPaddingTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34717521", new Object[]{this})).intValue() : this.contentPaddingTop;
    }

    public void setContentPaddingTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c013fa1", new Object[]{this, new Integer(i)});
        } else {
            this.contentPaddingTop = i;
        }
    }

    public int getContentPaddingBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45570613", new Object[]{this})).intValue() : this.contentPaddingBottom;
    }

    public void setContentPaddingBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af568957", new Object[]{this, new Integer(i)});
        } else {
            this.contentPaddingBottom = i;
        }
    }

    public int getMaxTagWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("380e8214", new Object[]{this})).intValue() : this.maxTagWidth;
    }

    public void setMaxTagWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbeca0e", new Object[]{this, new Integer(i)});
        } else {
            this.maxTagWidth = i;
        }
    }

    public int getSpaceBetweenTags() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb7ae2cb", new Object[]{this})).intValue() : this.spaceBetweenTags;
    }

    public void setSpaceBetweenTags(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f49d9f", new Object[]{this, new Integer(i)});
            return;
        }
        this.spaceBetweenTags = i;
        super.setItemSpacing(this.spaceBetweenTags);
    }

    public int getTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abe", new Object[]{this})).intValue() : this.textSize;
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
        } else {
            this.textSize = i;
        }
    }

    public int getTagBackgroundColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50c91dcb", new Object[]{this})).intValue() : this.tagBackgroundColor;
    }

    public void setTagBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8af59f", new Object[]{this, new Integer(i)});
        } else {
            this.tagBackgroundColor = i;
        }
    }

    public String getFixTagString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f96a44d", new Object[]{this}) : this.fixTagString;
    }

    public void setFixTagString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43dc59c9", new Object[]{this, str});
        } else {
            this.fixTagString = str;
        }
    }

    public int getTagHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("72a749a5", new Object[]{this})).intValue() : this.tagHeight;
    }

    public void setTagHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa38c79d", new Object[]{this, new Integer(i)});
        } else {
            this.tagHeight = i;
        }
    }
}
