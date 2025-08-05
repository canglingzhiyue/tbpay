package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.debug.a;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.fragment.desc.video.view.MinVideoFrameLayout;
import com.taobao.android.detail.core.detail.kit.view.widget.FoldableButton;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.NativeFloatButtonNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dyy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_VIDEO_AREAR_CHILD_COUNT = 1;

    /* renamed from: a  reason: collision with root package name */
    public dyp f27125a;
    private Context d;
    private LinearLayout e;
    private TUrlImageView f;
    private TUrlImageView g;
    private FrameLayout h;
    private FoldableButton i;
    private FrameLayout j;
    private FrameLayout k;
    private FrameLayout l;
    private FrameLayout m;
    private TUrlImageView n;
    private View.OnClickListener p;
    private View.OnClickListener q;
    private int r;
    private boolean b = true;
    private boolean c = true;
    private int o = 101;

    static {
        kge.a(962352954);
    }

    public static /* synthetic */ Context a(dyy dyyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f2fbcccc", new Object[]{dyyVar}) : dyyVar.d;
    }

    public dyy(Context context) {
        this.d = context;
        this.e = (LinearLayout) View.inflate(context, R.layout.x_detail_desc_floating_view, null);
        this.m = (FrameLayout) this.e.findViewById(R.id.ttelevator);
        this.n = (TUrlImageView) this.e.findViewById(R.id.btnTalkGroup);
        this.n.setVisibility(8);
        this.f = (TUrlImageView) this.e.findViewById(R.id.btnGoTop);
        this.f.setImageUrl(b.c() ? "https://gw.alicdn.com/imgextra/i2/O1CN01lb3JAm1I3OTNwONVu_!!6000000000837-2-tps-88-88.png" : "https://img.alicdn.com/imgextra/i1/O1CN01999pXz1FcFkNNsP07_!!6000000000507-2-tps-88-88.png");
        this.f.setVisibility(8);
        if (b.c()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f.getLayoutParams());
            layoutParams.setMargins(0, 0, f.a(8.0f), f.a(85.0f));
            this.f.setLayoutParams(layoutParams);
        }
        this.g = (TUrlImageView) this.e.findViewById(R.id.btnStoreCategory);
        this.g.setVisibility(8);
        this.i = (FoldableButton) this.e.findViewById(R.id.btnSendGift);
        this.i.setVisibility(8);
        this.h = (FrameLayout) this.e.findViewById(R.id.flbBottomDx);
        l();
        m();
        n();
        o();
        this.f.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.dyy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                a.e(view.getContext());
                a.f(view.getContext());
                a.i(view.getContext());
                a.j(view.getContext());
                return false;
            }
        });
        emu.a("com.taobao.android.detail.core.detail.fragment.desc.view.DescFloatingViewHolder");
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : this.m;
    }

    public FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("cec35b50", new Object[]{this}) : this.h;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.l = (FrameLayout) d.b(this.d, R.layout.x_detail_activity_minivideo_container);
        this.j = (FrameLayout) this.l.findViewById(R.id.flVideoArea);
        this.j.setVisibility(8);
        this.k = (FrameLayout) this.l.findViewById(R.id.fl_close_min_video);
        ((DetailCoreActivity) this.d).b.x().addView(this.l);
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        layoutParams.width = -1;
        this.l.setLayoutParams(layoutParams);
    }

    private void m() {
        VerticalNode g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (!(context instanceof DetailCoreActivity) || this.i == null) {
            return;
        }
        try {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
            if (detailCoreActivity.y().t == null || (g = eqb.g(detailCoreActivity.y().t.f10055a)) == null || g.bubbleNode == null) {
                return;
            }
            egw egwVar = new egw(g.bubbleNode, detailCoreActivity.y().t.f10055a);
            if (this.f27125a != null) {
                return;
            }
            this.f27125a = new dyp(detailCoreActivity, this.i, egwVar, detailCoreActivity.y().t);
        } catch (Exception e) {
            i.a("DescFloatingViewHolder", "updateSendGiftButton", e);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        NativeFloatButtonNode.a b = com.taobao.android.detail.core.utils.d.b(this.d);
        if (b == null) {
            return;
        }
        this.g.setImageUrl(b.b());
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        final NativeFloatButtonNode.a c = com.taobao.android.detail.core.utils.d.c(this.d);
        if (c == null) {
            i.a(com.taobao.android.detail.core.performance.i.a("DescFloatingViewHolder", BTags.TalkGroup), "updateTalkGroupButton no detailTalkGroup data");
            return;
        }
        this.n.setImageUrl(c.b());
        this.n.setOnClickListener(new View.OnClickListener() { // from class: tb.dyy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                String c2 = com.taobao.android.detail.core.utils.d.c(c);
                NativeFloatButtonNode.a.C0384a b = com.taobao.android.detail.core.utils.d.b(c);
                if (!"event".equals(c2) || b == null || b.b() == null) {
                    String a2 = com.taobao.android.detail.core.performance.i.a("DescFloatingViewHolder", BTags.TalkGroup);
                    i.a(a2, "onClick no event data. actionType:" + c2 + ", floatActionData:" + b);
                    return;
                }
                com.taobao.android.detail.datasdk.factory.manager.a n = emx.a(dyy.a(dyy.this)).b().n();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) b.a());
                jSONObject.put("fields", (Object) b.b());
                com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = (!(dyy.a(dyy.this) instanceof DetailCoreActivity) || ((DetailCoreActivity) dyy.a(dyy.this)).C() == null) ? null : ((DetailCoreActivity) dyy.a(dyy.this)).C().f10055a;
                ActionModel actionModel = new ActionModel(jSONObject);
                com.taobao.android.trade.event.f.a(dyy.a(dyy.this), n.a(actionModel, bVar, null, null));
                String a3 = com.taobao.android.detail.core.performance.i.a("DescFloatingViewHolder", BTags.TalkGroup);
                i.a(a3, "onClick post event:" + actionModel.type + ", floatActionData:" + b.b());
                String e = com.taobao.android.detail.core.utils.d.e(c);
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(e)) {
                    hashMap.put("url", e);
                }
                ecf.c(dyy.a(dyy.this), hashMap);
            }
        });
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.n.getVisibility() != i) {
            this.n.setVisibility(i);
            String a2 = com.taobao.android.detail.core.performance.i.a("DescFloatingViewHolder", BTags.TalkGroup);
            i.d(a2, "setBtnTalkGroupVisible:" + i);
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.g.getVisibility() != i) {
            this.g.setVisibility(i);
            String a2 = com.taobao.android.detail.core.performance.i.a("DescFloatingViewHolder", BTags.Category);
            i.d(a2, "setBtnCategoryVisible:" + i);
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.c) {
            this.g.setVisibility(i);
        } else if (this.g.getVisibility() != 0) {
        } else {
            this.g.setVisibility(8);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else if (onClickListener == null) {
        } else {
            this.q = onClickListener;
            this.g.setOnClickListener(this.q);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        this.r = i;
        p();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        m();
        n();
        o();
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.r == 0) {
            e();
            dyp dypVar = this.f27125a;
            if (dypVar == null) {
                return;
            }
            dypVar.b();
        } else {
            if (this.b) {
                f();
            }
            dyp dypVar2 = this.f27125a;
            if (dypVar2 == null) {
                return;
            }
            dypVar2.a();
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.o = i;
        int i2 = this.o;
        if (101 != i2 && 102 != i2) {
            return;
        }
        this.j.setVisibility(8);
    }

    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
            return;
        }
        this.p = onClickListener;
        View.OnClickListener onClickListener2 = this.p;
        if (onClickListener2 != null) {
            this.f.setOnClickListener(onClickListener2);
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        if (z && this.r > 0) {
            f();
        } else {
            e();
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        c(8);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f.getVisibility() != 0) {
        } else {
            this.f.setVisibility(8);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f.getVisibility() == 0) {
        } else {
            this.f.setVisibility(0);
        }
    }

    public View g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d6895230", new Object[]{this}) : this.e;
    }

    public FrameLayout h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ffe4da8a", new Object[]{this}) : this.j;
    }

    public View i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this}) : this.k;
    }

    public void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (this.j.getChildCount() > 1) {
        } else {
            if (view.getParent() != null) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup.getAnimation() != null) {
                    viewGroup.getAnimation().cancel();
                }
                viewGroup.setLayoutTransition(null);
                ((ViewGroup) view.getParent()).removeView(view);
            }
            MinVideoFrameLayout minVideoFrameLayout = new MinVideoFrameLayout(this.d);
            this.j.addView(minVideoFrameLayout, 0, new FrameLayout.LayoutParams(-1, -1));
            minVideoFrameLayout.addView(view, new FrameLayout.LayoutParams(i, i2));
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            this.l.bringToFront();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        if (this.j.getChildCount() > 1) {
            this.j.removeViewAt(0);
        }
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.j.getChildCount() > 1;
    }
}
