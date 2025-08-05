package com.taobao.search.jarvis.rcmd.cell;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.taobao.R;
import tb.itd;
import tb.ium;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends itd<XslDegradeCellBean, Void> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f19067a;
    private TextView e;
    private TextView f;
    private XslUrlImageView g;
    private XslDegradeCellBean h;

    static {
        kge.a(361487540);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(View view, Activity activity, ium iumVar, ListStyle listStyle, int i) {
        super(view, activity, iumVar, listStyle, i, null);
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g = (XslUrlImageView) this.itemView.findViewById(R.id.iv_auction);
        this.f19067a = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.e = (TextView) this.itemView.findViewById(R.id.tv_price);
        this.f = (TextView) this.itemView.findViewById(R.id.tv_sold_cnt);
        this.g.setPlaceHoldImageResId(R.drawable.tbsearch_android_wf_img_placeholder);
        this.itemView.setOnClickListener(this);
    }

    @Override // tb.itd
    public void a(int i, XslDegradeCellBean xslDegradeCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f225f53", new Object[]{this, new Integer(i), xslDegradeCellBean});
        } else if (this.h == xslDegradeCellBean) {
        } else {
            this.h = xslDegradeCellBean;
            this.g.setRatio(c());
            this.g.setImageUrl(this.h.imageUrl);
            this.f19067a.setText(this.h.title);
            this.e.setText(this.h.price);
            this.f.setText(this.h.soldCount);
        }
    }

    private float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        int i = this.h.width;
        int i2 = this.h.height;
        if (i == 0) {
            i = 1;
        }
        return (i2 * 1.0f) / i;
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : getClass().getSimpleName();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.h == null) {
        } else {
            Nav.from(getActivity()).toUri(this.h.itemUrl);
        }
    }
}
