package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.k;
import com.taobao.android.detail.core.detail.kit.utils.m;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.AutoWrapLineLayoutForDinamic;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import tb.dzd;
import tb.dzh;
import tb.emu;
import tb.enz;
import tb.epo;
import tb.fpz;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class XCommentTagViewV3 extends AutoWrapLineLayoutForDinamic implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAIN_RATEINFO_TAG_ID = 16666;
    public static final int TAG_PADDING;
    private Context mContext;
    private int mLineNum;
    private int normalTagColor;
    private int normalTextColor;
    private ArrayList<RateNode.RateKeyword> tagList;

    static {
        kge.a(1477966603);
        kge.a(-1201612728);
        TAG_PADDING = epo.i;
    }

    public XCommentTagViewV3(Context context) {
        super(context);
        this.mLineNum = 1;
        this.normalTextColor = 0;
        this.normalTagColor = 0;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XCommentTagViewV3");
    }

    public XCommentTagViewV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLineNum = 1;
        this.normalTextColor = 0;
        this.normalTagColor = 0;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XCommentTagViewV3");
    }

    public void setTagList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fc7f45", new Object[]{this, jSONArray});
            return;
        }
        this.tagList = new ArrayList<>();
        if (jSONArray == null) {
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it != null && it.hasNext()) {
            Object next = it.next();
            if (next != null && (next instanceof JSONObject)) {
                this.tagList.add(new RateNode.RateKeyword((JSONObject) next));
            }
        }
        setDataObject(this.tagList);
    }

    public void setLineNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef9852c", new Object[]{this, new Integer(i)});
        } else {
            setLineNum(new Integer(i).toString());
        }
    }

    public void setLineNum(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f8ec1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                this.mLineNum = Integer.parseInt(str);
                if (this.mLineNum <= 0) {
                    return;
                }
                setSimplifiedMode(true, this.mLineNum);
            } catch (Exception e) {
                i.a("DetailCommentTagsView", "解析LineNum失败");
                e.printStackTrace();
            }
        }
    }

    public void setDataObject(ArrayList<RateNode.RateKeyword> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41442458", new Object[]{this, arrayList});
            return;
        }
        if (arrayList != null && !arrayList.isEmpty() && getChildCount() == 0) {
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(epo.h);
            int width = getWidth();
            if (width <= 0) {
                width = epo.b - (dzd.DETAIL_HMARGIN * 2);
            }
            int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, (int) (epo.f27511a * 30.0f));
            for (int i = 0; i < arrayList.size(); i++) {
                String str = arrayList.get(i).f9993a;
                int a2 = m.a(arrayList.get(i).b);
                if (!TextUtils.isEmpty(str) && a2 > 0) {
                    SpannableString spannableString = new SpannableString(str + riy.BRACKET_START_STR + k.a(a2) + riy.BRACKET_END_STR);
                    spannableString.setSpan(absoluteSizeSpan, str.length(), spannableString.length(), 33);
                    TextView textView = new TextView(this.mContext);
                    textView.setTextColor(this.normalTextColor > 0 ? this.normalTagColor : getResources().getColor(R.color.detail_action_bar_fg));
                    textView.setId(i + MAIN_RATEINFO_TAG_ID);
                    int i2 = TAG_PADDING;
                    textView.setPadding(i2, 0, i2, 0);
                    textView.setMaxWidth(paddingLeft);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    textView.setIncludeFontPadding(false);
                    textView.setTextSize(1, 12.0f);
                    textView.setText(spannableString);
                    textView.setGravity(16);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.detail_d15));
                    if (arrayList.get(i).d == RateNode.RateKeyword.RateKeywordType.POSITIVE) {
                        int i3 = this.normalTagColor;
                        if (i3 <= 0) {
                            i3 = getResources().getColor(R.color.detail_rate_tag_positive);
                        }
                        gradientDrawable.setColor(i3);
                    } else {
                        gradientDrawable.setColor(getResources().getColor(R.color.detail_rate_tag_negative));
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        textView.setBackground(gradientDrawable);
                    } else {
                        textView.setBackgroundDrawable(gradientDrawable);
                    }
                    textView.setOnClickListener(this);
                    addView(textView, layoutParams);
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
        } else {
            removeAllViews();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (MAIN_RATEINFO_TAG_ID > id) {
            return;
        }
        ArrayList<RateNode.RateKeyword> arrayList = this.tagList;
        if (arrayList != null) {
            i = arrayList.size();
        }
        if (id >= i + MAIN_RATEINFO_TAG_ID) {
            return;
        }
        dzh.d(fpz.c(this.mContext));
        f.a(fpz.c(this.mContext), new enz(this.tagList.get(id - MAIN_RATEINFO_TAG_ID)));
    }

    public void setNormalTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e3172f", new Object[]{this, new Integer(i)});
        } else {
            this.normalTextColor = i;
        }
    }

    public void setNormalTagColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638d57aa", new Object[]{this, new Integer(i)});
        } else {
            this.normalTagColor = i;
        }
    }
}
