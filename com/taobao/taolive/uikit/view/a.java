package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.mtop.GoodItem;
import com.taobao.uikit.extend.feature.view.TPriceTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.prd;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f22050a;
    private boolean b = false;
    private View c;
    private TUrlImageView d;
    private TextView e;
    private TPriceTextView f;

    static {
        kge.a(1855594148);
    }

    public a(Context context) {
        this.f22050a = context;
    }

    public void a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a16adc", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.tbliveuikit_bubble_good_frame);
            this.c = viewStub.inflate();
            this.d = (TUrlImageView) this.c.findViewById(R.id.taolive_video_item_good_pic);
            this.e = (TextView) this.c.findViewById(R.id.taolive_video_item_good_name);
            this.f = (TPriceTextView) this.c.findViewById(R.id.taolive_video_item_good_price);
        }
    }

    public void a(GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bcd001", new Object[]{this, goodItem});
            return;
        }
        this.d.setImageUrl(goodItem.itemImg);
        this.f.setPrice(goodItem.price);
        this.e.setText(goodItem.itemTitle);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = false;
        this.c.setVisibility(4);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            prd.b(this.c);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            prd.a(this.c);
        }
    }
}
