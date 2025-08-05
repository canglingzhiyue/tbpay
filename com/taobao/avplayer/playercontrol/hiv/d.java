package com.taobao.avplayer.playercontrol.hiv;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kcl;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DWContext f16583a;
    private View b;
    private RecyclerView c;
    private LinearLayoutManager d;
    private c e;
    private ContentDetailData f;
    private a g;
    private Animation h;
    private Animation i;
    private Animation j;
    private Animation k;

    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(1541424099);
    }

    public static /* synthetic */ DWContext a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("639dcb23", new Object[]{dVar}) : dVar.f16583a;
    }

    public d(DWContext dWContext, ContentDetailData contentDetailData) {
        this.f16583a = dWContext;
        this.f = contentDetailData;
        c();
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_HivPopGoodsController);
    }

    private void c() {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f == null || (dWContext = this.f16583a) == null) {
        } else {
            if (dWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                this.b = LayoutInflater.from(this.f16583a.getActivity()).inflate(R.layout.dw_hiv_pop_goods, (ViewGroup) null);
                this.j = AnimationUtils.loadAnimation(this.f16583a.getActivity(), R.anim.goods_open_right_to_left);
                this.k = AnimationUtils.loadAnimation(this.f16583a.getActivity(), R.anim.goods_close_left_to_right);
            } else if (this.f16583a.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                this.b = LayoutInflater.from(this.f16583a.getActivity()).inflate(R.layout.dw_hiv_pop_goods_portrait, (ViewGroup) null);
                View findViewById = this.b.findViewById(R.id.fl_hiv_goods_root);
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).height = kcl.b() / 2;
                findViewById.invalidate();
                this.h = AnimationUtils.loadAnimation(this.f16583a.getActivity(), R.anim.goods_open_to_up);
                this.i = AnimationUtils.loadAnimation(this.f16583a.getActivity(), R.anim.goods_close_to_down);
            }
            this.c = (RecyclerView) this.b.findViewById(R.id.recycler_view);
            this.d = new LinearLayoutManager(this.f16583a.getActivity());
            this.c.setLayoutManager(this.d);
            this.c.setHasFixedSize(true);
            this.e = new c(this.f16583a, this.f);
            this.c.setAdapter(this.e);
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.hiv.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    d.this.a();
                    if (d.a(d.this) == null || d.a(d.this).screenType() != DWVideoScreenType.NORMAL || d.a(d.this).getVideo() == null || d.a(d.this).getVideo().t() != 1) {
                        return;
                    }
                    d.a(d.this).getVideo().s();
                }
            });
        }
    }

    public void a() {
        View view;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Animation animation = this.i;
        if (animation != null && (view2 = this.b) != null) {
            view2.startAnimation(animation);
        }
        Animation animation2 = this.k;
        if (animation2 != null && (view = this.b) != null) {
            view.startAnimation(animation2);
        }
        View view3 = this.b;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public void b() {
        View view;
        View view2;
        View view3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Animation animation = this.h;
        if (animation != null && (view3 = this.b) != null) {
            view3.startAnimation(animation);
        }
        Animation animation2 = this.j;
        if (animation2 != null && (view2 = this.b) != null) {
            view2.startAnimation(animation2);
        }
        if (this.f != null && (view = this.b) != null) {
            view.setVisibility(0);
        }
        a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public void a(ViewGroup viewGroup) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (viewGroup == null || this.b == null || (dWContext = this.f16583a) == null || dWContext.getActivity() == null) {
        } else {
            if (this.b.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            viewGroup.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4d706b", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }
}
