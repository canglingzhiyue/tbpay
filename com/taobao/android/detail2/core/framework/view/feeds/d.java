package com.taobao.android.detail2.core.framework.view.feeds;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.navbar.n;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.h;
import com.taobao.ask.ASK_CONST;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.ctu;
import tb.fij;
import tb.fil;
import tb.fim;
import tb.fiq;
import tb.fjg;
import tb.fjp;
import tb.fjr;
import tb.fjs;
import tb.fjt;
import tb.fkr;
import tb.fkt;
import tb.flz;
import tb.fmd;
import tb.gkl;
import tb.ipa;
import tb.kge;
import tb.pqq;

/* loaded from: classes5.dex */
public abstract class d<T extends com.taobao.android.detail2.core.framework.data.model.d, E extends fiq> extends RecyclerView.ViewHolder implements j<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPEAR_SCENE_DISMISS = "dismiss";
    public static final String APPEAR_SCENE_FOREGROUND = "foreground";
    public static final String APPEAR_SCENE_REFRESH = "refresh";
    public static final String APPEAR_SCENE_SCROLL = "scroll";
    public static final String DISAPPEAR_SCENE_BACKGROUND = "background";
    public static final String DISAPPEAR_SCENE_DISMISS = "dismiss";
    public static final String DISAPPEAR_SCENE_REFRESH = "refresh";
    public static final String DISAPPEAR_SCENE_SCROLL = "scroll";
    public static final String KEY_CARD_EXTRA_DATA = "cardExtraData";
    public static final String KEY_CURRENT_SHOW_INDEX = "currentShowIndex";
    public static final String KEY_INDEX = "index";
    public static final String KEY_IS_HALF_SCREEN = "isHalfScreen";
    public static final String KEY_IS_NON_FULL_SCREEN = "isNonFullScreen";
    public static final String KEY_POSITION = "position";
    public static final String KEY_PRE_IS_HALF_SCREEN = "preIsHalfScreen";
    public static final String KEY_PRE_IS_NON_FULL_SCREEN = "preIsNonFullScreen";
    public static final String KEY_SCROLL_ENABLE = "scrollEnable";
    public static final String KEY_TYPE = "type";
    public static final String TAG_VIEW_HOLDER = "tag_view_holder";
    public static final String VALUE_SCROLL_ENABLE_FROM_MAIN_PAGE = "MainPageFloatAppear";

    /* renamed from: a  reason: collision with root package name */
    private List<String> f11591a;
    private boolean b;
    private List<com.taobao.android.detail2.core.framework.base.weex.c> c;
    private int d;
    private RoundRectCardRoot e;
    private boolean f;
    public boolean h;
    public T i;
    public com.taobao.android.detail2.core.framework.b j;
    public fmd k;
    public a l;
    public String m;
    public TBErrorView n;
    public boolean w;
    public com.taobao.android.detail2.core.framework.view.feeds.visibility.a x;

    static {
        kge.a(841934985);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract i a(E e);

    public abstract void a();

    public abstract void a(String str);

    public abstract boolean a(T t);

    public abstract void b();

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract int j();

    public abstract Map<String, String> k();

    public TBErrorView l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("4672730c", new Object[]{this});
        }
        return null;
    }

    public HashMap<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("83012018", new Object[]{this});
        }
        return null;
    }

    public HashMap<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("cd32b959", new Object[]{this});
        }
        return null;
    }

    public abstract JSONObject p();

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : b((d<T, E>) ((fiq) event));
    }

    public d(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        super((ViewGroup) viewGroup.getParent());
        this.h = false;
        this.w = false;
        this.f11591a = new ArrayList();
        this.c = new ArrayList();
        this.d = 0;
        this.f = false;
        this.j = bVar;
        this.k = fmdVar;
        this.m = UUID.randomUUID().toString();
        this.e = (RoundRectCardRoot) this.itemView.findViewById(R.id.half_screen_round_root);
        this.l = new a(this.k, this.j, this);
        this.x = new com.taobao.android.detail2.core.framework.view.feeds.visibility.a(this.k, this.j);
        fim.a(this.j.f(), this.j.h().y(), fil.a(fiq.class, this.m), this);
        this.itemView.setTag(TAG_VIEW_HOLDER.hashCode(), this);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        fmd fmdVar = this.k;
        if (fmdVar == null || fmdVar.q() == null) {
            return;
        }
        this.f11591a.add(G());
        this.k.q().a(this, jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        fmd fmdVar = this.k;
        if (fmdVar == null || fmdVar.q() == null) {
            return;
        }
        this.f11591a.add(str);
        this.k.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(T r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.d.b(com.taobao.android.detail2.core.framework.data.model.d):void");
    }

    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            View j = cVar.j();
            if (j != null) {
                j.setTranslationY(-((int) (j() * d)));
            }
        }
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            if (cVar != null) {
                cVar.a(str, jSONObject);
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            View j = cVar.j();
            if (j != null) {
                j.setTranslationY(i);
                fjt.a(fjt.TAG_HALF_SCREEN, "设置卡片" + this.i.f + "的topmargin: " + i);
            }
        }
    }

    public void a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c197633", new Object[]{this, fArr});
            return;
        }
        this.e.setCornerRadius(fArr);
        this.e.invalidate();
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, i);
        } else {
            layoutParams.height = i;
        }
        this.itemView.setLayoutParams(layoutParams);
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.e.setLayoutParams(marginLayoutParams);
    }

    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        } else {
            this.itemView.setTag(i, obj);
        }
    }

    public Object f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1099cb3c", new Object[]{this, new Integer(i)}) : this.itemView.getTag(i);
    }

    public Rect q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("84498bc1", new Object[]{this});
        }
        Rect rect = new Rect();
        this.itemView.getGlobalVisibleRect(rect);
        return rect;
    }

    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue();
        }
        if (this.itemView != null) {
            return this.itemView.isAttachedToWindow();
        }
        return false;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            if (cVar != null) {
                cVar.e();
            }
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            if (cVar != null) {
                fjt.a(fjt.TAG_RENDER, getAdapterPosition() + "triggerRender，生命周期，nid=" + G());
                cVar.f();
            }
        }
    }

    private boolean c(com.taobao.android.detail2.core.framework.data.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184f38c4", new Object[]{this, dVar})).booleanValue();
        }
        if (dVar.y) {
            if (dVar.f == 0 && !this.f) {
                c();
                b(0);
                fjp.a("eventProcess", fjp.UMBRELLA_TAG_ERROR_PAGE, (Map<String, String>) null);
                fjp.b(dVar, "recommend", fjp.ERROR_CODE_RECOMMEND_FIRST_CARD_ERROR_SHOW, "NewDetail进入错误重试页面：" + this.j.h().f() + ", 当前id：" + dVar.k, true);
            } else if (this.h) {
                fjt.a("new_detail异常", "数据获取出错");
            }
        } else {
            b(8);
        }
        return dVar.y;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.n != null) {
        } else {
            this.n = l();
            TBErrorView tBErrorView = this.n;
            if (tBErrorView == null) {
                return;
            }
            this.e.addView(tBErrorView);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        TBErrorView tBErrorView = this.n;
        if (tBErrorView == null) {
            return;
        }
        tBErrorView.setVisibility(i);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.i == null) {
        } else {
            Activity g = this.j.g();
            fjt.a(g, fjt.TAG_RENDER, "VerticalAbsViewHolder appear" + getAdapterPosition() + "，nid=" + G());
            if (!this.i.C) {
                Activity g2 = this.j.g();
                fjt.a(g2, fjt.TAG_UT, getAdapterPosition() + "appear执行，命中!isPreload");
                this.i.D = false;
                K();
            } else if (this.i.F) {
                Activity g3 = this.j.g();
                fjt.a(g3, fjt.TAG_UT, getAdapterPosition() + "appear执行，命中mIsPreloadNeedUT");
                T t = this.i;
                t.D = false;
                t.E = true;
                K();
            } else {
                Activity g4 = this.j.g();
                fjt.a(g4, fjt.TAG_UT, getAdapterPosition() + "appear执行，命中isPreload");
                this.i.D = true;
            }
            this.h = true;
            a(str);
        }
    }

    private fkt m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("6b586323", new Object[]{this}) : this.j.h().b();
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        fjt.a(this.j.g(), fjt.TAG_UT, "handleAppearWhenNotPreload执行");
        this.k.y().b(this.i.g, n(), this.i);
        this.k.y().b(this.i.g, "NewDetail", "", "", o(), this.i);
        a(true, (fij.a) null, "");
        com.taobao.android.detail2.core.framework.b bVar = this.j;
        if (bVar == null || !bVar.h().b().ae()) {
            return;
        }
        d(this.i);
    }

    private void d(com.taobao.android.detail2.core.framework.data.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c4d941", new Object[]{this, dVar});
        } else if (this.j == null || dVar == null) {
        } else {
            if (fjs.a((Map<String, Object>) dVar.H(), fjr.KEY_FEATURE_DISABLE_SCREEN_RECORD)) {
                fjr.c(this.j.g());
            } else {
                fjr.a(this.j.g());
            }
        }
    }

    private void c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79270aa0", new Object[]{this, str, new Boolean(z)});
            return;
        }
        HashMap<String, String> w = H().w();
        HashMap hashMap = (w == null || w.isEmpty()) ? null : new HashMap(w);
        if (this.i.y && fkr.NO_ID_DEFAULT.equals(this.i.k)) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put("nd_card_type", "error");
            hashMap.put("nd_card_subtype", "miss");
            this.k.y().a(this.i.g, hashMap);
        } else if (hashMap != null) {
            this.k.y().a(this.i.g, hashMap);
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entrySpm", (Object) this.j.h().c());
            jSONObject.put(pqq.KEY_ENTRY_SCM, (Object) this.j.h().d());
            jSONObject.put("entryUtparam", (Object) this.j.h().g());
            this.k.y().a(this.i.g, jSONObject);
        }
        this.k.y().a(this.i.g);
        a(false, (fij.a) null, str);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        a(false);
        f();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        a(true);
        e();
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("show", (Object) Boolean.valueOf(z));
            T t = this.i;
            if (t != null) {
                jSONObject.put("index", (Object) String.valueOf(t.f));
                jSONObject.put("position", (Object) String.valueOf(this.k.f(G())));
            }
            jSONObject.put("scene", (Object) "scroll");
            cVar.a("willExposureStatus", jSONObject);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            b(str, false);
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            c(str);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            d();
        }
    }

    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
        } else if (this.i == null) {
        } else {
            Activity g = this.j.g();
            fjt.a(g, fjt.TAG_RENDER, "VerticalAbsViewHolder disappear" + getAdapterPosition() + "，nid=" + G());
            a(false, "disappear");
            b(str);
            if (!this.i.C || this.i.F) {
                c(str, z);
            }
            this.h = false;
            this.w = false;
            T t = this.i;
            if (t != null) {
                t.A.add(this.i.x().getString("nid"));
                if (this.i.q()) {
                    this.i.z = true;
                }
            }
            T t2 = this.i;
            if (t2 != null) {
                t2.u();
                this.i.v();
            }
            L();
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "卡片显示，生命周期，nid=" + G() + ",mIsCardDisplay:" + this.w + "，position:" + getAdapterPosition());
        if (this.w) {
            return;
        }
        a(F(), E(), true);
        this.w = true;
    }

    public List<com.taobao.android.detail2.core.framework.base.weex.c> Y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("256755e7", new Object[]{this}) : this.c;
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "卡片结束显示，生命周期，nid=" + G() + ",mIsCardDisplay:" + this.w + "，position:" + getAdapterPosition());
        if (!this.w) {
            return;
        }
        a(F(), E(), false);
        this.w = false;
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (this.k != null) {
            com.alibaba.android.spindle.stage.b i = this.j.i();
            for (d.a aVar : this.i.w) {
                if (aVar != null) {
                    if (aVar.c) {
                        i.c(aVar.f11524a, aVar.b);
                    } else {
                        i.b(aVar.f11524a, aVar.b);
                    }
                }
            }
            this.i.w.clear();
            for (Map.Entry<String, String> entry : this.i.x.entrySet()) {
                if (entry != null) {
                    i.a(entry.getKey(), entry.getValue());
                }
            }
            this.i.x.clear();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("simpleData", (Object) "true");
            if (this.i.p == null) {
                jSONObject.put(InputFrame3.TYPE_RESPONSE, (Object) "simpleInfo is null");
            } else {
                jSONObject.put(InputFrame3.TYPE_RESPONSE, (Object) this.i.p);
            }
            i.a(jSONObject);
            i.b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r0.equals(tb.fiq.OPERATE_GET_EXPOSURE_STATE) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.trade.event.i b(E r7) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.d.b(tb.fiq):com.taobao.android.trade.event.i");
    }

    private void a(JSONObject jSONObject, fij.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199c9874", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null || this.i == null) {
        } else {
            if (!StringUtils.equals(jSONObject.getString("nid"), this.i.k)) {
                a(false, "20803", "nid unmatch", aVar);
            } else if (this.k.m() == null || this.k.m().size() <= 1) {
                a(false, "20804", "only one card", aVar);
            } else {
                if (F() == 0) {
                    Intent intent = new Intent();
                    intent.putExtra("passParam", this.j.h().k().U);
                    Activity g = this.j.g();
                    if (g != null) {
                        g.setResult(-1, intent);
                    }
                }
                this.k.a(this.i.k);
                a(true, "", "", aVar);
            }
        }
    }

    private void a(boolean z, String str, String str2, fij.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e8096c", new Object[]{this, new Boolean(z), str, str2, aVar});
        } else if (aVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) (z ? "success" : "fail"));
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMsg", (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dismissCardStatus", (Object) jSONObject);
            aVar.a(jSONObject2);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (this.i == null) {
            fjt.a(fjt.TAG_RENDER, "currentNode为空，不上报切换埋点");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tempArgs");
            if (jSONObject2 == null) {
                fjt.a(fjt.TAG_RENDER, "tempArgs为空，不上报切换埋点");
                return;
            }
            String string = this.i.x().getString("nid");
            if (!StringUtils.isEmpty(string)) {
                this.i.A.add(string);
            }
            this.i.c(jSONObject2);
            this.k.y().a(this.i.g);
            this.k.y().b(this.i.g, n(), this.i);
            this.k.y().b(this.i.g, "NewDetail", "", "", o(), this.i);
            fjt.a(fjt.TAG_RENDER, "handlePageTrace, index: " + this.i.f + ", nid: " + this.i.k + ", tempArgs: " + jSONObject2.toJSONString() + ", cardType: " + this.i.g);
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            if (cVar != null) {
                cVar.a(fiq.OPERATE_SHOW_WEEX_POP, jSONObject);
            }
        }
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else {
            this.j.f().finishNewDetailContainer();
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            a("true".equals(jSONObject.getString("prevent")), "event");
        }
    }

    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.b = z;
        fjt.a(fjt.TAG_RENDER, "setNeedpreventBack from: " + str);
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.k == null) {
        } else {
            String string = jSONObject.getString(KEY_SCROLL_ENABLE);
            if (StringUtils.isEmpty(string) || !this.k.b("true".equals(string)) || ipa.B()) {
                return;
            }
            fjt.a(fjt.TAG_SET_SCROLL_ENABLE, fjt.a("", jSONObject, this.k));
        }
    }

    private void a(fij.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b27154", new Object[]{this, aVar});
        } else if (this.i == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (this.i.p != null) {
                jSONObject2.putAll(this.i.p);
                Activity g = this.j.g();
                fjt.a(g, fjt.TAG_RENDER, "weex数据流 info put recommend , itemid: " + this.i.k + ", cardindex: " + this.i.f);
            } else if (this.i.t != null) {
                jSONObject2.putAll(this.i.t);
                Activity g2 = this.j.g();
                fjt.a(g2, fjt.TAG_RENDER, "weex数据流 info put openImmediately, itemid: " + this.i.k + ", cardindex: " + this.i.f);
            }
            jSONObject2.put("navStart", (Object) Long.valueOf(this.j.h().j()));
            jSONObject2.put(ASK_CONST.KEY_IS_IMMERSIVE, (Object) true);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cardnum", (Object) String.valueOf(this.i.f));
            jSONObject2.put(KEY_CARD_EXTRA_DATA, (Object) jSONObject3);
            JSONObject p = p();
            if (p != null) {
                jSONObject2.putAll(p);
            }
            jSONObject.put("detailDataRefresh", (Object) jSONObject2);
            aVar.a(jSONObject);
            Activity g3 = this.j.g();
            fjt.a(g3, fjt.TAG_RENDER, "weex数据流 getdetaildata给回调啦, itemid: " + this.i.k + ", cardindex: " + this.i.f);
        }
    }

    public void a(boolean z, fij.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5769e722", new Object[]{this, new Boolean(z), aVar, str});
            return;
        }
        ctu.a("sendExposureStatusWithUT");
        Map<String, String> k = k();
        if (this.k != null) {
            k = fjg.a(this.j.f(), this.j.h(), k, this.i);
        }
        if (aVar == null) {
            if (this.c.size() == 0) {
                ctu.a();
                return;
            }
            for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
                if (z) {
                    cVar.a("detailUTParams", a(k));
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("show", (Object) String.valueOf(z));
                if (!z) {
                    jSONObject.put("scene", (Object) str);
                }
                jSONObject.put("index", (Object) String.valueOf(F()));
                jSONObject.put("position", (Object) String.valueOf(this.k.f(G())));
                jSONObject.put(KEY_CURRENT_SHOW_INDEX, (Object) String.valueOf(this.k.e()));
                cVar.a("exposureStatus", jSONObject);
                cVar.a("weexPassGlobalParams", this.j.h().v());
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("show", (Object) String.valueOf(this.h));
            if (z) {
                jSONObject2.put("detailUTParams", (Object) a(k));
            } else {
                jSONObject2.put("scene", (Object) str);
            }
            jSONObject2.put("exposureStatus", (Object) jSONObject3);
            jSONObject2.put("weexPassGlobalParams", (Object) this.j.h().v());
            aVar.a(jSONObject2);
        }
        ctu.a();
    }

    private JSONObject a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3729093d", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(map);
        T t = this.i;
        if (t != null) {
            jSONObject.put("cardUTArgs", (Object) t.K());
        }
        return jSONObject;
    }

    private void a(fij fijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89c1171", new Object[]{this, fijVar});
        } else if (fijVar.i == null || this.k == null) {
        } else {
            JSONObject v = this.j.h().v();
            JSONArray a2 = this.k.a(fijVar.i, this.k.f(G()));
            if (a2 == null) {
                return;
            }
            JSONObject a3 = a(fijVar.i, v, a2);
            if (fijVar.g == null || a3 == null) {
                return;
            }
            fijVar.g.a(a3);
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("880974b0", new Object[]{this, jSONObject, jSONObject2, jSONArray});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.put("weexPassList", (Object) jSONArray);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject.put("weexPassGlobalParams", (Object) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("recommendWeexPassParams", (Object) jSONObject);
        return jSONObject3;
    }

    private void b(JSONObject jSONObject, fij.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53673a53", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            a(aVar, "updateDetailResult", false, "20001", "originalNid为空");
        } else {
            String string = jSONObject.getString("originalNid");
            String string2 = jSONObject.getString("targetNid");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
            if (StringUtils.isEmpty(string)) {
                a(aVar, "updateDetailResult", false, "20001", "originalNid为空");
            } else if (StringUtils.isEmpty(string2)) {
                a(aVar, "updateDetailResult", false, "20002", "targetNid为空");
            } else {
                if (string.equals(string2)) {
                    a(jSONObject2);
                } else {
                    a(string2, jSONObject2);
                }
                a(aVar, "updateDetailResult", true, "", "");
            }
        }
    }

    private void a(fij.a aVar, String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6283ba8a", new Object[]{this, aVar, str, new Boolean(z), str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            jSONObject.put("errorCode", (Object) str2);
            jSONObject.put("errorMsg", (Object) str3);
        }
        a(aVar, str, z, jSONObject);
    }

    private void a(fij.a aVar, String str, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dea993a", new Object[]{this, aVar, str, new Boolean(z), jSONObject});
        } else if (aVar == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(fij.CALLBACK_EVENT_KEY, (Object) str);
            jSONObject2.put(fij.CALLBACK_IS_SUCCESS, (Object) Boolean.valueOf(z));
            jSONObject2.put(str, (Object) jSONObject);
            aVar.a(jSONObject2);
        }
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("type");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != 107332) {
                if (hashCode != 1236319578) {
                    if (hashCode == 1669433176 && string.equals("quickTrace")) {
                        c = 0;
                    }
                } else if (string.equals("monitor")) {
                    c = 1;
                }
            } else if (string.equals("log")) {
                c = 2;
            }
            if (c == 0) {
                i(jSONObject);
            } else if (c == 1) {
                h(jSONObject);
            } else if (c != 2) {
            } else {
                g(jSONObject);
            }
        }
    }

    private void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("logData");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("codeMsg");
        String string2 = jSONObject2.getString("event");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("ext");
        fjp.a("NewDetail_Front", string2, string, TraceLogEventType.COMMON, jSONObject3 != null ? jSONObject3.toJSONString() : "");
    }

    private void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba943e1", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("monitorData");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("monitorType");
        String string2 = jSONObject2.getString("scene");
        String string3 = jSONObject2.getString("errorCode");
        String string4 = jSONObject2.getString("errorMsg");
        if ("dataParser".equals(string)) {
            fjp.a(this.i, string2, string3, string4);
        } else if (!"componentRender".equals(string)) {
        } else {
            fjp.b(this.i, string2, string3, string4);
        }
    }

    private void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbe080", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("quickTraceData");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("quickTraceType");
        if ("error".equals(string)) {
            fjp.a(this.i, jSONObject2.getString("errorCode"), jSONObject2.getString("errorMsg"), Boolean.getBoolean(jSONObject2.getString("needSecondaryData")));
        } else if (!gkl.DP_BIZ_CONTEXT.equals(string)) {
        } else {
            fjp.a(this.i, jSONObject2.getString("bizContextKey"), jSONObject2.getString("bizContextValue"));
        }
    }

    private i j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("86169ff0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return i.FAILURE;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("cusNaviSource");
            if (jSONArray == null) {
                return i.FAILURE;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    n nVar = new n();
                    nVar.a(jSONObject2.getString("ndType"));
                    nVar.b(jSONObject2.getString("iconFontName"));
                    nVar.c(jSONObject2.getString("title"));
                    arrayList.add(nVar);
                }
            }
            T t = this.i;
            if (t != null) {
                t.S = arrayList;
                fmd fmdVar = this.k;
                if (fmdVar != null) {
                    fmdVar.x();
                }
            }
            return i.SUCCESS;
        } catch (Exception e) {
            fjt.a("new_detail异常", "addNaviItem参数解析异常", e);
            return i.FAILURE;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        this.l.e();
        g();
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            h();
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            i();
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.b;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        a(false, "preventBackExecute");
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            cVar.a("onUserBack", new JSONObject());
        }
    }

    public void a(com.taobao.android.detail2.core.framework.base.weex.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41f6006", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.c.add(cVar);
            cVar.a(this.l);
        }
    }

    public void B() {
        com.taobao.android.detail2.core.framework.base.weex.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            if (cVar.d() == null || (d = cVar.d()) == null || d.m() == null || d.n()) {
                return;
            }
            d.a(true);
            if (m().q()) {
                h renderComponent = d.m().getRenderComponent();
                if (renderComponent == null) {
                    return;
                }
                renderComponent.n();
                ((MUSDKInstance) d.m()).refreshPixelCheckTime();
            } else if (m().b()) {
                d.m().onScreenRendering();
            }
        }
    }

    public void C() {
        com.taobao.android.detail2.core.framework.base.weex.a d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            if (cVar.d() == null || (d = cVar.d()) == null || d.m() == null || !d.n()) {
                return;
            }
            d.a(false);
            if (m().q()) {
                h renderComponent = d.m().getRenderComponent();
                if (renderComponent == null) {
                    return;
                }
                renderComponent.m();
                if (!m().b()) {
                    renderComponent.q();
                } else {
                    renderComponent.u();
                }
            } else if (!m().b()) {
                continue;
            } else if (d.m() == null) {
                return;
            } else {
                d.m().offScreenRendering();
            }
        }
    }

    public void c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a262bc", new Object[]{this, str, jSONObject});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
            cVar.a(str, jSONObject);
        }
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue() : this.h;
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this});
        }
        T t = this.i;
        return t == null ? "" : t.g;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue();
        }
        T t = this.i;
        if (t != null) {
            return t.f;
        }
        return -1;
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("661f112", new Object[]{this});
        }
        T t = this.i;
        return t == null ? "" : t.k;
    }

    public com.taobao.android.detail2.core.framework.data.model.d H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.data.model.d) ipChange.ipc$dispatch("14cec13d", new Object[]{this}) : this.i;
    }

    public com.taobao.android.detail2.core.framework.b I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("6224397f", new Object[]{this}) : this.j;
    }

    public flz J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (flz) ipChange.ipc$dispatch("5e0ecba1", new Object[]{this}) : this.k.y();
    }

    public void a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (this.c.size() != 0) {
            boolean b = this.j.h().b(i, str);
            a aVar = this.l;
            if (aVar != null) {
                z2 = aVar.g();
            }
            fjt.a(fjt.TAG_RENDER, getAdapterPosition() + "sendCardAppearStatus,appear 生命周期,isCardAppear:" + z);
            for (com.taobao.android.detail2.core.framework.base.weex.c cVar : this.c) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) (z ? "appear" : "disappear"));
                jSONObject.put(KEY_IS_HALF_SCREEN, (Object) String.valueOf(b));
                jSONObject.put(KEY_PRE_IS_HALF_SCREEN, (Object) String.valueOf(z2));
                jSONObject.put(KEY_IS_NON_FULL_SCREEN, (Object) String.valueOf(b));
                jSONObject.put(KEY_PRE_IS_NON_FULL_SCREEN, (Object) String.valueOf(z2));
                cVar.a("appearStatus", jSONObject);
            }
        }
    }
}
