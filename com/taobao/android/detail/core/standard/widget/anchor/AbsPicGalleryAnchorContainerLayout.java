package com.taobao.android.detail.core.standard.widget.anchor;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsPicGalleryAnchorContainerLayout extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAnchorListener;
    private TextView mViewForMeasure;

    /* loaded from: classes4.dex */
    public interface a {
        void onAnchorClick(View view);
    }

    static {
        kge.a(1812448280);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(AbsPicGalleryAnchorContainerLayout absPicGalleryAnchorContainerLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void updateAnchors(c cVar, List<b> list);

    public AbsPicGalleryAnchorContainerLayout(Context context) {
        this(context, null);
    }

    public AbsPicGalleryAnchorContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsPicGalleryAnchorContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.AbsPicGalleryAnchorContainerLayout");
    }

    public void setAnchorListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8872cc", new Object[]{this, aVar});
        } else {
            this.mAnchorListener = aVar;
        }
    }

    public TextView createAnchor(c cVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("87a1272d", new Object[]{this, cVar, bVar});
        }
        String a2 = bVar.a();
        int e = cVar.e();
        TextView createImmersiveAnchor = cVar.j() ? createImmersiveAnchor() : new TextView(getContext());
        createImmersiveAnchor.setLayoutParams(new LinearLayout.LayoutParams(((int) measureTextWidth(a2, cVar.b())) + (e * 2), cVar.a()));
        createImmersiveAnchor.setText(a2);
        createImmersiveAnchor.setTextSize(1, cVar.b());
        createImmersiveAnchor.setTextColor(Color.parseColor(cVar.d()));
        createImmersiveAnchor.setPadding(e, 0, e, 0);
        createImmersiveAnchor.setGravity(17);
        createImmersiveAnchor.setBackgroundDrawable(null);
        createImmersiveAnchor.setOnClickListener(this);
        createImmersiveAnchor.setTag(R.id.standard_detail_gallery_tag_gallery_anchor_view_model, bVar);
        return createImmersiveAnchor;
    }

    private TextView createImmersiveAnchor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f69312af", new Object[]{this}) : (TextView) LayoutInflater.from(getContext()).inflate(R.layout.pic_gallery_anchor_text_view, (ViewGroup) null);
    }

    public float measureTextWidth(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db5fe804", new Object[]{this, str, new Float(f)})).floatValue();
        }
        if (this.mViewForMeasure == null) {
            this.mViewForMeasure = new TextView(getContext());
            this.mViewForMeasure.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.mViewForMeasure.setTextSize(1, f);
        return this.mViewForMeasure.getPaint().measureText(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        a aVar = this.mAnchorListener;
        if (aVar == null) {
            return;
        }
        aVar.onAnchorClick(view);
    }
}
