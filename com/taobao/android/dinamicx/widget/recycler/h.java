package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.as;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.fqi;
import tb.fuw;
import tb.fuz;
import tb.fzy;
import tb.gbf;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends com.taobao.android.dinamicx.widget.recycler.a implements gbf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOADMORE_TITLE = "load_more_title";
    public static final String TAG = "RecyclerAdapter";
    public static final int TYPE_FOOTER_VIEW = -1;
    private boolean b;
    public as c;
    public Context d;
    public fzy f;
    public DXRecyclerLayout g;
    public View i;
    public DXAbsOnLoadMoreView j;
    public boolean k;
    private TextView l;
    private ProgressBar m;
    public ArrayList<DXWidgetNode> e = new ArrayList<>();
    public DXViewEvent h = new DXViewEvent(-8975334121118753601L);

    /* renamed from: a  reason: collision with root package name */
    private DXViewEvent f12139a = new DXViewEvent(-5201408949358043646L);
    private String n = "太火爆啦，点我再尝试下吧";
    private String o = "";
    private String p = "亲，已经到底了哦";
    private int q = 0;
    private int r = 0;
    private int u = 1;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private Map<String, Integer> s = new HashMap();
    private Map<Integer, String> t = new HashMap();

    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public DXWidgetNode f12141a;

        static {
            kge.a(-494508272);
        }

        public a(View view) {
            super(view);
        }
    }

    static {
        kge.a(837073752);
        kge.a(1251810611);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == -1324657775) {
            super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(h hVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1dba969", new Object[]{hVar, view});
        } else {
            hVar.a(view);
        }
    }

    public h(Context context, boolean z, boolean z2) {
        this.d = context;
        this.b = z;
        if (this.b) {
            this.i = new LinearLayout(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int a2 = (int) a(context, 10.0f);
            this.i.setPadding(a2, a2, a2, a2);
            ((LinearLayout) this.i).setGravity(17);
            this.i.setLayoutParams(layoutParams);
            this.m = new ProgressBar(context);
            int a3 = (int) a(context, 20.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a3, a3);
            layoutParams2.rightMargin = a2;
            this.m.setVisibility(8);
            ((LinearLayout) this.i).addView(this.m, layoutParams2);
            this.l = new TextView(context);
            this.l.setTextSize(14.0f);
            this.l.setTextColor(Color.parseColor("#A5A5A5"));
            ((LinearLayout) this.i).addView(this.l, new LinearLayout.LayoutParams(-2, -2));
        }
        this.k = z2;
    }

    private float a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f50", new Object[]{this, context, new Float(f)})).floatValue() : TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void a(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28c884", new Object[]{this, dXRecyclerLayout});
            return;
        }
        this.g = dXRecyclerLayout;
        if (dXRecyclerLayout == null || this.c != null) {
            return;
        }
        this.c = new as(dXRecyclerLayout.getDXRuntimeContext().C(), 3, UUID.randomUUID().toString(), dXRecyclerLayout.u());
        DXEngineConfig a2 = dXRecyclerLayout.getDXRuntimeContext().C().a();
        if (a2 != null && a2.k() != null) {
            this.j = a2.k().getOnLoadMoreView(dXRecyclerLayout.getUserId());
        }
        this.x = fqi.C(dXRecyclerLayout.getDXRuntimeContext().A());
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DXWidgetNode n = n(i);
        if (n instanceof ac) {
            ((ac) n).a(i, z);
        }
        this.g.a(i, z);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.k) {
            fzy fzyVar = this.f;
            return fzyVar == null || fzyVar.g() <= 0;
        }
        ArrayList<DXWidgetNode> arrayList = this.e;
        return arrayList == null || arrayList.isEmpty();
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (3 != this.u) {
        } else {
            h(-1);
        }
    }

    public void h(int i) {
        int i2;
        DXRecyclerLayout dXRecyclerLayout;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else if (!this.b || (i2 = this.u) == 2 || i2 == 5 || d() || (dXRecyclerLayout = this.g) == null || (i3 = this.u) == 6 || i3 == 2) {
        } else {
            if (i < 0) {
                dXRecyclerLayout.b();
            } else if (i <= 0 || getItemCount() - (i + 1) > this.g.e()) {
            } else {
                this.g.b();
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.u;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else if (!this.b || this.u == i) {
        } else {
            this.u = i;
            int i2 = this.q;
            if (i2 != 0) {
                this.l.setTextColor(i2);
            }
            int i3 = this.r;
            if (i3 != 0) {
                this.l.setTextSize(0, i3);
            }
            switch (i) {
                case 1:
                case 6:
                    if (this.j != null) {
                        this.j.onLoadMoreStatusUpdate(i, new JSONObject());
                        break;
                    } else {
                        this.m.setVisibility(8);
                        this.l.setText("");
                        break;
                    }
                case 2:
                    if (this.j != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("load_more_title", (Object) this.o);
                        this.j.onLoadMoreStatusUpdate(i, jSONObject);
                        break;
                    } else {
                        this.m.setVisibility(0);
                        this.l.setVisibility(0);
                        this.l.setText(this.o);
                        break;
                    }
                case 3:
                    if (this.j != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("load_more_title", (Object) this.n);
                        this.j.onLoadMoreStatusUpdate(i, jSONObject2);
                        break;
                    } else {
                        this.m.setVisibility(8);
                        this.l.setVisibility(0);
                        this.l.setText(this.n);
                        break;
                    }
                case 4:
                    if (this.j != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("load_more_title", (Object) "");
                        this.j.onLoadMoreStatusUpdate(i, jSONObject3);
                        break;
                    } else {
                        this.m.setVisibility(8);
                        this.l.setVisibility(0);
                        this.l.setText("");
                        break;
                    }
                case 5:
                    if (this.j != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("load_more_title", (Object) this.p);
                        this.j.onLoadMoreStatusUpdate(i, jSONObject4);
                        break;
                    } else {
                        this.m.setVisibility(8);
                        this.l.setVisibility(0);
                        this.l.setText(this.p);
                        break;
                    }
            }
            DXRecyclerLayout dXRecyclerLayout = this.g;
            if (dXRecyclerLayout == null || !fqi.e(dXRecyclerLayout.getDXRuntimeContext().A()) || this.i == null) {
                return;
            }
            fuw.d("RLLoadMore", "HitRLLoadMoreGone");
            if (i == 6 || i == 4 || (i == 5 && StringUtils.isEmpty(this.p))) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
            }
        }
    }

    private int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : (!this.b || d()) ? 0 : 1;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void a(ArrayList<DXWidgetNode> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.e = arrayList;
        c();
    }

    public void a(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            a((ArrayList) list);
        }
    }

    public void a(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9927293", new Object[]{this, fzyVar});
            return;
        }
        this.f = fzyVar;
        c();
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    private boolean f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0a9ceba", new Object[]{this, new Integer(i)})).booleanValue() : this.b && i >= getItemCount() - e();
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        DXWidgetNode n = n(i);
        if (!(n instanceof ac)) {
            return false;
        }
        return ((ac) n).c();
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.e
    public int e(int i) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aef4f60a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (d(i)) {
            DXWidgetNode n = n(i);
            if (n instanceof ac) {
                return ((ac) n).i();
            }
        } else if (c(i) && (b = b(i)) >= 0) {
            DXWidgetNode n2 = n(b);
            if (n2 instanceof ac) {
                return ((ac) n2).i();
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        as asVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == -1) {
            RelativeLayout relativeLayout = new RelativeLayout(this.d);
            DXAbsOnLoadMoreView dXAbsOnLoadMoreView = this.j;
            if (dXAbsOnLoadMoreView != null) {
                relativeLayout.addView(dXAbsOnLoadMoreView, new ViewGroup.LayoutParams(-1, -2));
            } else {
                View view = this.i;
                if (view != null) {
                    relativeLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
                }
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
            layoutParams.bottomMargin = i();
            layoutParams.setFullSpan(true);
            relativeLayout.setLayoutParams(layoutParams);
            a aVar = new a(relativeLayout);
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.recycler.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        h.a(h.this, view2);
                    }
                }
            });
            return aVar;
        }
        View m = m(i);
        if (m == null) {
            if (!this.g.u() || (asVar = this.c) == null) {
                m = new DXNativeFrameLayout(this.d);
            } else {
                m = asVar.a(this.d);
            }
        }
        m.setLayoutParams(new StaggeredGridLayoutManager.LayoutParams(-2, -2));
        return new a(m);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.a
    public void a(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb19487e", new Object[]{this, viewHolder, new Integer(i)});
        } else {
            c(viewHolder, i);
        }
    }

    public void c(RecyclerView.ViewHolder viewHolder, int i) {
        DXWidgetNode c;
        a aVar;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36415a80", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (getItemViewType(i) != -1) {
            com.taobao.analysis.v3.h hVar = null;
            try {
                c = c(i, true);
                aVar = (a) viewHolder;
                if (c instanceof ac) {
                    z = ((ac) c).d();
                    hVar = ((ac) c).k();
                    str = ((ac) c).o();
                } else {
                    str = "";
                }
                str2 = str;
            } finally {
                try {
                } finally {
                }
            }
            if (c != null && this.c != null) {
                a(i, c, hVar, str2, aVar);
                a(i, c, z, aVar);
                a(i, c, hVar, aVar);
            }
            fuw.d(TAG, "get item null!");
            fuz.b(hVar, "get item null!");
            return;
        }
        h(i);
    }

    private void a(DXWidgetNode dXWidgetNode, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38492d", new Object[]{this, dXWidgetNode, aVar});
        } else if (!(dXWidgetNode instanceof ac) || aVar == null || aVar.itemView == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
            if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                return;
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            layoutParams2.topMargin = dXWidgetNode.getMarginTop();
            layoutParams2.bottomMargin = dXWidgetNode.getMarginBottom();
            layoutParams2.leftMargin = dXWidgetNode.getMarginLeft();
            layoutParams2.rightMargin = dXWidgetNode.getMarginRight();
        }
    }

    @Override // tb.gbf.a
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        DXWidgetNode n = n(i);
        return n != null && n.getDXRuntimeContext().v() == null;
    }

    @Override // tb.gbf.a
    public View a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b6e872f", new Object[]{this, recyclerView, new Integer(i)});
        }
        try {
            if (getItemViewType(i) == -1) {
                return null;
            }
            a aVar = (a) mo1596onCreateViewHolder(recyclerView, i);
            DXWidgetNode c = c(i, true);
            if ((c instanceof ac) && ((ac) c).d()) {
                z = true;
            }
            a(i, c, z, aVar);
            return aVar.itemView;
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            return null;
        }
    }

    public void a(int i, DXWidgetNode dXWidgetNode, com.taobao.analysis.v3.h hVar, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e2f9d", new Object[]{this, new Integer(i), dXWidgetNode, hVar, str, aVar});
            return;
        }
        fuz.a(hVar, "onBindStart-cellInfo", "  pos  " + i + "  itemInfo  " + str + "  rlId  " + this.g.getUserId());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r19, com.taobao.android.dinamicx.widget.DXWidgetNode r20, boolean r21, com.taobao.android.dinamicx.widget.recycler.h.a r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.recycler.h.a(int, com.taobao.android.dinamicx.widget.DXWidgetNode, boolean, com.taobao.android.dinamicx.widget.recycler.h$a):void");
    }

    public void a(int i, DXWidgetNode dXWidgetNode, com.taobao.analysis.v3.h hVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95292e7", new Object[]{this, new Integer(i), dXWidgetNode, hVar, aVar});
            return;
        }
        aVar.f12141a = dXWidgetNode;
        this.h.setItemIndex(i);
        if (dXWidgetNode.getBindingXExecutingMap() != null) {
            dXWidgetNode.getBindingXExecutingMap().clear();
        }
        if (!this.v) {
            dXWidgetNode.sendBroadcastEvent(this.h);
        }
        this.g.postEvent(this.h);
        this.g.b(dXWidgetNode);
        if (aVar.itemView == null || (!(aVar.itemView instanceof ViewGroup) && ((ViewGroup) aVar.itemView).getChildCount() > 0)) {
            this.g.a(s.DX_ERROR_CODE_RECYCLER_LAYOUT_ON_BINDHOLDER, "onbindViewholder返回的view是空");
            fuz.b(hVar, "onbindViewholder返回的view是空: " + i);
        }
        fuz.a(hVar, "onBindEnd", System.currentTimeMillis());
        if (dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext().G()) {
            dXWidgetNode.updateRefreshType(0);
        }
        l(i);
    }

    public void l(int i) {
        gbf A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6e270", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.g;
        if (dXRecyclerLayout == null || (A = dXRecyclerLayout.A()) == null) {
            return;
        }
        A.b(i);
    }

    public View m(int i) {
        gbf A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16bd4d91", new Object[]{this, new Integer(i)});
        }
        DXRecyclerLayout dXRecyclerLayout = this.g;
        if (dXRecyclerLayout != null && (A = dXRecyclerLayout.A()) != null) {
            return A.a(i);
        }
        return null;
    }

    public DXRuntimeContext b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("683fc0e1", new Object[]{this, dXWidgetNode});
        }
        DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
        s sVar = new s(a2.A());
        sVar.b = a2.c();
        a2.a(sVar);
        return a2;
    }

    public DXWidgetNode n(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("8ef0fccd", new Object[]{this, new Integer(i)}) : c(i, false);
    }

    public DXWidgetNode c(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("1977043a", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (this.k) {
            fzy fzyVar = this.f;
            if (fzyVar == null) {
                return null;
            }
            DXWidgetNode b = fzyVar.b(i);
            if (b == null && z && this.g != null && this.f.d() != null) {
                if (i >= 0 && i < this.f.d().size()) {
                    Object obj = this.f.d().get(i);
                    fzy fzyVar2 = this.f;
                    b = fzyVar2.a(this.g, obj, fzyVar2.d(), this.g.x(), i, (n) null);
                    this.g.a(b, i, true);
                    if (b == null || this.f.b(i, b)) {
                    }
                }
                return null;
            }
            return b;
        }
        ArrayList<DXWidgetNode> arrayList = this.e;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return this.e.get(i);
        }
        return null;
    }

    public void a(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7041c4f4", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (this.k) {
            fzy fzyVar = this.f;
            if (fzyVar == null) {
                return;
            }
            fzyVar.c(i, dXWidgetNode);
        } else {
            ArrayList<DXWidgetNode> arrayList = this.e;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return;
            }
            this.e.set(i, dXWidgetNode);
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        if (this.k) {
            fzy fzyVar = this.f;
            if (fzyVar != null) {
                return fzyVar.g();
            }
            return 0;
        }
        ArrayList<DXWidgetNode> arrayList = this.e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        String o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (f(i)) {
            return -1;
        }
        DXWidgetNode c = c(i, true);
        if (c instanceof ac) {
            ac acVar = (ac) c;
            if (!StringUtils.isEmpty(acVar.r())) {
                o = acVar.r();
            } else {
                o = acVar.o();
            }
            if (this.s.containsKey(o)) {
                return this.s.get(o).intValue();
            }
            int size = this.s.size();
            this.s.put(o, Integer.valueOf(size));
            this.t.put(Integer.valueOf(size), o);
            return size;
        } else if (this.s.containsKey("default")) {
            return this.s.get("default").intValue();
        } else {
            int size2 = this.s.size();
            this.s.put("default", Integer.valueOf(size2));
            this.t.put(Integer.valueOf(size2), "default");
            return size2;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        int g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.k) {
            fzy fzyVar = this.f;
            if (fzyVar == null || (g = fzyVar.g()) <= 0) {
                return 0;
            }
            return g + e();
        }
        ArrayList<DXWidgetNode> arrayList = this.e;
        if (arrayList != null && !arrayList.isEmpty()) {
            return this.e.size() + e();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        DXWidgetNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        if (f(i)) {
            return 2147483647L;
        }
        DXRecyclerLayout dXRecyclerLayout = this.g;
        return (dXRecyclerLayout == null || dXRecyclerLayout.getDXRuntimeContext() == null || !fqi.x(this.g.getDXRuntimeContext().A()) || (c = c(i, true)) == null) ? i : c.getAutoId();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        this.f12139a.setItemIndex(viewHolder.getAdapterPosition());
        this.g.postEvent(this.f12139a);
        a aVar = (a) viewHolder;
        if (aVar == null || aVar.f12141a == null) {
            return;
        }
        if (!this.w) {
            aVar.f12141a.sendBroadcastEvent(this.f12139a);
        }
        this.g.c(aVar.f12141a);
        if (aVar.f12141a.getDXRuntimeContext() == null || aVar.f12141a.getDXRuntimeContext().C() == null || aVar.f12141a.getDXRuntimeContext().C().b() == null || aVar.f12141a.getDXRuntimeContext().C().b().e() == null) {
            return;
        }
        aVar.f12141a.getDXRuntimeContext().C().b().e().a(aVar.f12141a.getDXRuntimeContext().h());
    }

    private int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        DXRecyclerLayout dXRecyclerLayout = this.g;
        if (dXRecyclerLayout != null && dXRecyclerLayout.getDXRuntimeContext() != null && this.g.getDXRuntimeContext().s() != null && this.g.getDXRuntimeContext().s().getDxNestedScrollerView(this.g.getDXRuntimeContext()) != null && this.g.getDXRuntimeContext().s().getDxNestedScrollerView(this.g.getDXRuntimeContext()).getmChildList() != null) {
            return this.g.getDXRuntimeContext().s().getDxNestedScrollerView(this.g.getDXRuntimeContext()).getStickyHeight();
        }
        return 0;
    }
}
