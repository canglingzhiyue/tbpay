package com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import tb.emu;
import tb.epo;
import tb.fcc;
import tb.fcm;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPPopupView extends PopupLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView currSelectIV;
    private fcc.b currSelectItem;
    private TextView currSelectTV;
    private int highlightMenuColor;
    private ViewGroup itemViewGroup;
    private int normalMenuColor;
    private a onClickItemListener;

    /* loaded from: classes5.dex */
    public interface a {
    }

    static {
        kge.a(1077828525);
    }

    public static /* synthetic */ Object ipc$super(KAPPopupView kAPPopupView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3c945d", new Object[]{kAPPopupView});
        } else {
            kAPPopupView.showLaudListUT();
        }
    }

    public static /* synthetic */ int access$100(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d3a40d2f", new Object[]{kAPPopupView})).intValue() : kAPPopupView.highlightMenuColor;
    }

    public static /* synthetic */ int access$200(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd0b860e", new Object[]{kAPPopupView})).intValue() : kAPPopupView.normalMenuColor;
    }

    public static /* synthetic */ a access$300(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2486bf41", new Object[]{kAPPopupView}) : kAPPopupView.onClickItemListener;
    }

    public static /* synthetic */ fcc.b access$400(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fcc.b) ipChange.ipc$dispatch("ed873609", new Object[]{kAPPopupView}) : kAPPopupView.currSelectItem;
    }

    public static /* synthetic */ fcc.b access$402(KAPPopupView kAPPopupView, fcc.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcc.b) ipChange.ipc$dispatch("ef87595f", new Object[]{kAPPopupView, bVar});
        }
        kAPPopupView.currSelectItem = bVar;
        return bVar;
    }

    public static /* synthetic */ TUrlImageView access$500(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("6327c844", new Object[]{kAPPopupView}) : kAPPopupView.currSelectIV;
    }

    public static /* synthetic */ TUrlImageView access$502(KAPPopupView kAPPopupView, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("3b5da8a0", new Object[]{kAPPopupView, tUrlImageView});
        }
        kAPPopupView.currSelectIV = tUrlImageView;
        return tUrlImageView;
    }

    public static /* synthetic */ TextView access$600(KAPPopupView kAPPopupView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("78c47d0b", new Object[]{kAPPopupView}) : kAPPopupView.currSelectTV;
    }

    public static /* synthetic */ TextView access$602(KAPPopupView kAPPopupView, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("72d4883", new Object[]{kAPPopupView, textView});
        }
        kAPPopupView.currSelectTV = textView;
        return textView;
    }

    public KAPPopupView(Context context) {
        this(context, null);
    }

    public KAPPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KAPPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.x_detail_main_interaction_bar_like_popwindow, this);
        this.itemViewGroup = (ViewGroup) findViewById(R.id.detail_like_layout);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPPopupView");
    }

    public void setNormalMenuColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c6d0e1", new Object[]{this, new Integer(i)});
        } else {
            this.normalMenuColor = i;
        }
    }

    public void setHighlightMenuColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba54d7aa", new Object[]{this, new Integer(i)});
        } else {
            this.highlightMenuColor = i;
        }
    }

    public void bindData(List<fcc.b> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06a2389", new Object[]{this, list, str});
        } else {
            initView(list, str);
        }
    }

    private void initView(final List<fcc.b> list, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62bee357", new Object[]{this, list, str});
            return;
        }
        this.itemViewGroup.removeAllViews();
        View findViewById = findViewById(R.id.detail_divider);
        ImageView imageView = (ImageView) findViewById(R.id.detail_like_list);
        if (!TextUtils.isEmpty(str)) {
            findViewById(R.id.detail_like_list_layout).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPPopupView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    f.a(fpz.b(KAPPopupView.this.getContext())).a(new fcm(str, "0"));
                    KAPPopupView.access$000(KAPPopupView.this);
                }
            });
            findViewById.setVisibility(0);
            imageView.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
            imageView.setVisibility(8);
        }
        if (list == null) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int i = 0; i < list.size(); i++) {
            final fcc.b bVar = list.get(i);
            View inflate = from.inflate(R.layout.x_detail_main_interaction_bar_like_item, this.itemViewGroup, false);
            final TextView textView = (TextView) inflate.findViewById(R.id.detail_like_item_tv);
            textView.setText(bVar.d);
            inflate.setContentDescription(bVar.d);
            final TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.detail_like_item_iv);
            if (bVar.f27784a) {
                tUrlImageView.setImageUrl(bVar.c);
                textView.setTextColor(this.highlightMenuColor);
                this.currSelectItem = bVar;
                this.currSelectIV = tUrlImageView;
                this.currSelectTV = textView;
            } else {
                tUrlImageView.setImageUrl(bVar.b);
                textView.setTextColor(this.normalMenuColor);
            }
            this.itemViewGroup.addView(inflate);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPPopupView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    fcc.b bVar2 = bVar;
                    bVar2.f27784a = !bVar2.f27784a;
                    tUrlImageView.setImageUrl(bVar.f27784a ? bVar.c : bVar.b);
                    textView.setTextColor(bVar.f27784a ? KAPPopupView.access$100(KAPPopupView.this) : KAPPopupView.access$200(KAPPopupView.this));
                    if (KAPPopupView.access$300(KAPPopupView.this) != null) {
                        KAPPopupView.access$300(KAPPopupView.this);
                    }
                    if (bVar.f27784a && bVar != list.get(0)) {
                        tUrlImageView.setScaleX(0.7f);
                        tUrlImageView.setScaleY(0.7f);
                        tUrlImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).start();
                    }
                    if (KAPPopupView.access$400(KAPPopupView.this) != null && KAPPopupView.access$400(KAPPopupView.this) != bVar) {
                        KAPPopupView.access$400(KAPPopupView.this).f27784a = false;
                        if (KAPPopupView.access$500(KAPPopupView.this) != null) {
                            KAPPopupView.access$500(KAPPopupView.this).setImageUrl(KAPPopupView.access$400(KAPPopupView.this).b);
                        }
                        if (KAPPopupView.access$600(KAPPopupView.this) != null) {
                            KAPPopupView.access$600(KAPPopupView.this).setTextColor(KAPPopupView.access$200(KAPPopupView.this));
                        }
                    }
                    KAPPopupView.access$402(KAPPopupView.this, bVar);
                    KAPPopupView.access$502(KAPPopupView.this, tUrlImageView);
                    KAPPopupView.access$602(KAPPopupView.this, textView);
                }
            });
        }
    }

    public void setOnClickItemListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446163c2", new Object[]{this, aVar});
        } else {
            this.onClickItemListener = aVar;
        }
    }

    public void performClickOfFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfe19f9", new Object[]{this});
        } else {
            this.itemViewGroup.getChildAt(0).performClick();
        }
    }

    private void showLaudListUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee65c05", new Object[]{this});
            return;
        }
        try {
            c cVar = ((DetailActivity) fpz.b(getContext())).y().t;
            String e = epo.g().e();
            HashMap hashMap = new HashMap(3);
            hashMap.put("item_id", cVar.i());
            hashMap.put("seller_id", cVar.h());
            hashMap.put("userid", e);
            b.a("Page_Detail_Button-LaudList", hashMap);
        } catch (Exception unused) {
        }
    }
}
