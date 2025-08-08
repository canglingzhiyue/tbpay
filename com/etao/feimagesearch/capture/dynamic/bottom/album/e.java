package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.album.o;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes3.dex */
public class e extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TUrlImageView f6536a;
    private TextView b;
    private o c;
    private final com.etao.feimagesearch.album.thumbnail.d d;
    private TUrlImageView e;
    private View f;
    private boolean g;

    static {
        kge.a(-556675006);
    }

    public e(Context context, int i, boolean z, com.etao.feimagesearch.album.thumbnail.a aVar, View view) {
        super(view);
        this.g = z;
        int a2 = d.a(context, i);
        this.itemView.getLayoutParams().width = a2;
        this.itemView.getLayoutParams().height = a2;
        this.d = new com.etao.feimagesearch.album.thumbnail.d(aVar);
        a();
        this.f6536a.setPlaceHoldImageResId(R.color.feis_image_placeholder);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f6536a = (TUrlImageView) this.itemView.findViewById(R.id.iv_image);
        this.b = (TextView) this.itemView.findViewById(R.id.tv_duration);
        this.b.setTextSize(1, this.g ? 13.0f : 10.0f);
        this.f = this.itemView.findViewById(R.id.ll_auth_more_hint);
        this.e = (TUrlImageView) this.itemView.findViewById(R.id.iv_add_hint);
        ((TextView) this.itemView.findViewById(R.id.tv_add_hint)).setTextSize(1, this.g ? 15.0f : 12.0f);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = null;
        this.itemView.setBackgroundColor(Color.parseColor("#1F1F1F"));
        this.f6536a.setVisibility(8);
        this.b.setVisibility(8);
        this.f.setVisibility(0);
        this.e.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01QUbazh1IHagZinAox_!!6000000000868-49-tps-120-120.webp");
        this.itemView.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18922) + "，" + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
    }

    public void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d8ad7", new Object[]{this, oVar});
            return;
        }
        this.f.setVisibility(8);
        if (oVar == null || this.c == oVar) {
            return;
        }
        this.f6536a.setVisibility(0);
        this.f6536a.setImageBitmap(null);
        this.c = oVar;
        this.d.a(oVar, this.f6536a);
        if (oVar.c()) {
            this.b.setText(oVar.d());
            this.b.setVisibility(0);
        } else {
            this.b.setVisibility(8);
        }
        StringBuilder sb = new StringBuilder();
        if (oVar.c()) {
            sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_item_video));
            sb.append("，");
        } else {
            sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_item_image));
            sb.append("，");
        }
        String a2 = com.etao.feimagesearch.util.b.a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19906), Long.valueOf(oVar.f()));
        if (StringUtils.isEmpty(a2)) {
            sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_unknown_time));
        } else {
            sb.append(a2);
        }
        sb.append("，");
        sb.append(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_append_take_pic));
        this.itemView.setContentDescription(sb.toString());
    }
}
