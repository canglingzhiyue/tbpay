package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends com.taobao.android.detail.ttdetail.component.module.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f10944a;
    private ImageView b;
    private TextView c;
    private int d;
    private a e;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(851395880);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3899c06a", new Object[]{dVar})).intValue() : dVar.d;
    }

    public static /* synthetic */ a b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("12ff8748", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ int c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61169fa8", new Object[]{dVar})).intValue();
        }
        int i = dVar.d;
        dVar.d = i + 1;
        return i;
    }

    public d(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : a(view);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f10944a.setVisibility(0);
        this.b.setVisibility(8);
        this.c.setText("正在加载推荐的宝贝");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f10944a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setText("已浏览完所有推荐商品");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f10944a.setVisibility(8);
        this.b.setVisibility(0);
        this.c.setText("猜中你的喜好有点难度呢，点我再尝试下吧");
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (d.a(d.this) >= 4) {
                    d.this.b();
                    if (d.b(d.this) == null) {
                        return;
                    }
                    d.b(d.this).b();
                } else {
                    d.this.a();
                    if (d.b(d.this) != null) {
                        d.b(d.this).a();
                    }
                    d.c(d.this);
                }
            }
        });
        q.a(this.b, "https://img.alicdn.com/imgextra/i3/O1CN01Q24JaH1l4QDVegPB5_!!6000000004765-2-tps-40-40.png");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780076da", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    private View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.tt_detail_recommend_load_more) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_item_load_more, (ViewGroup) null, false);
        }
        this.f10944a = (ProgressBar) view.findViewById(R.id.pb_detail_item_load);
        this.b = (ImageView) view.findViewById(R.id.iv_detail_item_load);
        this.c = (TextView) view.findViewById(R.id.tv_detail_item_load);
        return view;
    }
}
