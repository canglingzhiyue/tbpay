package com.taobao.tao.sharepanel.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.d;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.structure.BubbleTipsBean;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.kge;
import tb.nyl;
import tb.nyq;
import tb.nzn;
import tb.obi;
import tb.ouc;
import tb.ouj;

/* loaded from: classes8.dex */
public class a implements ouj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21055a;
    private RecyclerView b;
    private RecyclerView c;
    private ouc d;
    private View e;
    private View f;
    private TextView g;
    private View h;
    private View i;
    private View j;
    private TUrlImageView k;
    private TextView l;
    private String m;
    private boolean n;
    private boolean o;
    private RelativeLayout p;
    private RelativeLayout q;
    private nzn r;
    private TextView s;
    private View t;
    private int u;

    static {
        kge.a(-347096403);
        kge.a(1547584775);
    }

    @Override // tb.ouj
    public Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ouj
    public Bitmap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("e5c3e7c7", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ nzn a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzn) ipChange.ipc$dispatch("b0df8300", new Object[]{aVar}) : aVar.r;
    }

    public static /* synthetic */ void a(a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b9ac69", new Object[]{aVar, new Integer(i), str});
        } else {
            aVar.a(i, str);
        }
    }

    public static /* synthetic */ Context b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6e992ebb", new Object[]{aVar}) : aVar.f21055a;
    }

    public static /* synthetic */ RecyclerView c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("7bb17822", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ View d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("92893e03", new Object[]{aVar}) : aVar.t;
    }

    public void a(nzn nznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7343776", new Object[]{this, nznVar});
        } else {
            this.r = nznVar;
        }
    }

    @Override // tb.ouj
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.f21055a = context;
        this.t = LayoutInflater.from(context).inflate(R.layout.share_new_channel_layout, (ViewGroup) null);
        this.h = this.t.findViewById(R.id.share_channel_items_layout);
        this.q = (RelativeLayout) this.t.findViewById(R.id.rl_share_detail);
        this.b = (RecyclerView) this.t.findViewById(R.id.share_new_chanel_view);
        this.c = (RecyclerView) this.t.findViewById(R.id.share_new_contact_view);
        this.p = (RelativeLayout) this.t.findViewById(R.id.rl_contacts);
        this.e = this.t.findViewById(R.id.share_contact_loading);
        this.f = this.t.findViewById(R.id.share_contact_no_login);
        this.g = (TextView) this.t.findViewById(R.id.share_contact_no_login_tips);
        this.i = this.t.findViewById(R.id.share_save_img_state_layout);
        this.l = (TextView) this.t.findViewById(R.id.share_save_img_tips_view);
        this.j = this.t.findViewById(R.id.share_save_img_progressbar);
        this.k = (TUrlImageView) this.t.findViewById(R.id.share_save_img_finish);
        this.s = (TextView) this.t.findViewById(R.id.tv_cancel_share_common);
        this.u = this.o ? 0 : 55;
        if (TextUtils.equals(this.m, "common")) {
            this.s.setVisibility(0);
            if (this.n) {
                this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, nyq.a(context, 208.0f)));
                this.h.setPadding(0, nyq.a(context, 15.0f), 0, 0);
                this.p.setVisibility(0);
            } else {
                j();
            }
        } else {
            this.s.setVisibility(0);
            if (!this.n) {
                k();
            } else {
                this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, nyq.a(context, 260 - this.u)));
                this.h.setPadding(0, nyq.a(context, this.o ? 60.0f : 0.0f), 0, 0);
            }
        }
        int b = obi.b.b();
        if (b != -1) {
            Drawable indeterminateDrawable = ((ProgressBar) this.j).getIndeterminateDrawable();
            DrawableCompat.setTint(indeterminateDrawable, b);
            ((ProgressBar) this.j).setIndeterminateDrawable(indeterminateDrawable);
        }
        String a2 = obi.b.a();
        if (!TextUtils.isEmpty(a2)) {
            this.k.setImageUrl(a2);
        }
        return this.t;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, nyq.a(this.f21055a, 137.0f)));
        this.h.setPadding(0, nyq.a(this.f21055a, 5.0f), 0, 0);
        this.p.setVisibility(8);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.p.setVisibility(8);
        this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, nyq.a(this.f21055a, 177 - (this.o ? 0 : 45))));
        this.h.setPadding(0, nyq.a(this.f21055a, this.o ? 45.0f : 0.0f), 0, 0);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.n = false;
        if (TextUtils.equals(this.m, "common")) {
            this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, nyq.a(this.f21055a, 137.0f)));
            this.h.setPadding(0, nyq.a(this.f21055a, 5.0f), 0, 0);
            this.p.setVisibility(8);
            return;
        }
        k();
    }

    public void a(List<com.taobao.share.globalmodel.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
            this.b.setVisibility(8);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f21055a);
            linearLayoutManager.setOrientation(0);
            this.b.setLayoutManager(linearLayoutManager);
            this.d = new ouc(this.f21055a, list);
            this.b.setAdapter(this.d);
            this.d.notifyDataSetChanged();
        }
    }

    public void a(List<com.taobao.share.globalmodel.b> list, BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee1863", new Object[]{this, list, bubbleTipsBean});
            return;
        }
        if (this.n) {
            if (TextUtils.isEmpty(ShareBizAdapter.getInstance().getLogin().a())) {
                this.f.setVisibility(0);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.sharepanel.normal.view.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (a.a(a.this) == null) {
                        } else {
                            a.a(a.this).a(new d(ComponentType.CONTACT_ITEM.desc, null), a.b(a.this), 0);
                        }
                    }
                });
                this.c.setVisibility(4);
                this.e.setVisibility(8);
                return;
            } else if (list != null && list.size() > 0) {
                this.c.setVisibility(0);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f21055a);
                linearLayoutManager.setOrientation(0);
                this.c.setLayoutManager(linearLayoutManager);
                this.c.setAdapter(new ouc(this.f21055a, list));
                this.e.setVisibility(8);
                this.f.setVisibility(8);
            } else {
                this.e.setVisibility(8);
                this.f.setVisibility(0);
                this.f.setOnClickListener(null);
                this.g.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17886));
            }
        } else {
            this.e.setVisibility(8);
        }
        a(bubbleTipsBean);
    }

    private void a(BubbleTipsBean bubbleTipsBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a720b4", new Object[]{this, bubbleTipsBean});
        } else if (bubbleTipsBean == null || !nyl.c() || this.c == null) {
        } else {
            String index = bubbleTipsBean.getIndex();
            final String text = bubbleTipsBean.getText();
            try {
                final int parseInt = Integer.parseInt(index);
                if (TextUtils.isEmpty(text) || parseInt < 0) {
                    return;
                }
                this.c.post(new Runnable() { // from class: com.taobao.tao.sharepanel.normal.view.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this, parseInt, text);
                        }
                    }
                });
                this.c.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.sharepanel.normal.view.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                        int hashCode = str.hashCode();
                        if (hashCode == 806944192) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        } else if (hashCode != 2142696127) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        } else {
                            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        }
                    }

                    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                            return;
                        }
                        super.onScrollStateChanged(recyclerView, i);
                        if (i != 0) {
                            return;
                        }
                        RecyclerView.LayoutManager layoutManager = a.c(a.this).getLayoutManager();
                        if (!(layoutManager instanceof LinearLayoutManager)) {
                            return;
                        }
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                        int i2 = parseInt;
                        if (i2 < findFirstCompletelyVisibleItemPosition || i2 > findLastCompletelyVisibleItemPosition) {
                            return;
                        }
                        a.a(a.this, i2 - findFirstCompletelyVisibleItemPosition, text);
                    }

                    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        if (i <= 0) {
                            return;
                        }
                        ((BubbleContainer) a.d(a.this)).hideBubble(0L);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private void a(int i, String str) {
        int bottom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (i < 0 || i >= this.c.getChildCount()) {
        } else {
            View childAt = this.c.getChildAt(i);
            int left = (childAt.getLeft() + (childAt.getWidth() / 2)) - nyq.a(com.taobao.tao.config.a.a().getApplicationContext(), 26.0f);
            if (TextUtils.equals(this.m, "common")) {
                bottom = nyq.a(com.taobao.tao.config.a.a().getApplicationContext(), 0.0f);
            } else {
                bottom = this.p.getBottom();
            }
            ((BubbleContainer) this.t).showBubble(left, bottom, str);
            ((BubbleContainer) this.t).hideBubble(5000L);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.h.setVisibility(4);
        this.i.setVisibility(0);
        String a2 = obi.b.a(1);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        this.l.setText(a2);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = obi.b.a(2);
        if (TextUtils.isEmpty(a2)) {
            this.l.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17879));
        } else {
            this.l.setText(a2);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String a2 = obi.b.a(3);
        if (TextUtils.isEmpty(a2)) {
            this.l.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17881));
        } else {
            this.l.setText(a2);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        String a2 = obi.b.a(4);
        if (TextUtils.isEmpty(a2)) {
            this.l.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17839));
        } else {
            this.l.setText(a2);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        String a2 = obi.b.a(1);
        if (TextUtils.isEmpty(a2)) {
            this.l.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17881));
        } else {
            this.l.setText(a2);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        String c = obi.b.c();
        if (TextUtils.isEmpty(c)) {
            this.l.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_17839));
        } else {
            this.l.setText(c);
        }
    }

    public void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.m = str;
        this.n = z;
        this.o = z2;
    }
}
