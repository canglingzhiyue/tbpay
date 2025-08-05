package com.taobao.android.order.bundle.ultron.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.ActivityLifecycleObserver;
import com.taobao.android.order.bundle.dinamicX.module.CatapultComponent;
import com.taobao.android.order.bundle.widget.TBOrderWeexView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.appfram.storage.b;
import java.util.HashMap;
import java.util.Map;
import tb.bny;
import tb.dcn;
import tb.hyk;
import tb.hyn;
import tb.hyo;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends com.alibaba.android.ultron.vfw.viewholder.b implements ActivityLifecycleObserver.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TAG = "native$catapult";
    public static final e CREATOR;
    public static final int LOAD_STATE_BEGIN = 2;
    public static final int LOAD_STATE_ERROR = 3;
    public static final int LOAD_STATE_FINISH = 4;
    public static final int LOAD_STATE_INIT = 1;
    private static String f;
    public int e;
    private Context g;
    private TBOrderWeexView h;
    private TBOrderWeexView.a i;
    private ViewGroup j;
    private View k;
    private TextView l;
    private TextView m;
    private View n;
    private CatapultComponent o;
    private Map<String, String> p;
    private JSONObject q;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ TBOrderWeexView.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBOrderWeexView.a) ipChange.ipc$dispatch("c1b2c34", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ void a(a aVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ace7fe", new Object[]{aVar, new Boolean(z), str});
        } else {
            aVar.a(z, str);
        }
    }

    public static /* synthetic */ ViewGroup b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5736ad36", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ Map c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b0d4ce13", new Object[]{aVar}) : aVar.p;
    }

    public static /* synthetic */ Context d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("87ab8ab5", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ CatapultComponent e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CatapultComponent) ipChange.ipc$dispatch("4e368b9e", new Object[]{aVar}) : aVar.o;
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : f;
    }

    static {
        kge.a(1888025356);
        kge.a(-426227017);
        f = a.class.getSimpleName();
        CREATOR = new e() { // from class: com.taobao.android.order.bundle.ultron.view.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new a(bnyVar);
            }
        };
    }

    public a(bny bnyVar) {
        super(bnyVar);
        this.p = new HashMap();
        this.e = 1;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.g = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.g).inflate(R.layout.layout_order_detail_weex_card, viewGroup, false);
        if (dcn.a()) {
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, 0);
            } else {
                layoutParams.height = 0;
            }
            viewGroup2.setLayoutParams(layoutParams);
            return viewGroup2;
        }
        this.h = (TBOrderWeexView) viewGroup2.findViewById(R.id.order_detail_weex_card);
        this.h.setOnLoadListener(new b());
        this.j = (ViewGroup) viewGroup2.findViewById(R.id.order_detail_weex_plugin_view);
        Context context = this.g;
        if ((context instanceof AppCompatActivity) && ((AppCompatActivity) context).getLifecycle() != null) {
            ((AppCompatActivity) this.g).getLifecycle().addObserver(new ActivityLifecycleObserver(this));
        }
        return viewGroup2;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (dcn.a()) {
        } else {
            String str = null;
            if (iDMComponent == null && iDMComponent.getFields() == null) {
                hyq.b(this.g, f, "fields no data", null);
            } else if (iDMComponent.getFields() == this.q) {
            } else {
                this.q = iDMComponent.getFields();
                this.o = (CatapultComponent) JSONObject.toJavaObject(iDMComponent.getFields(), CatapultComponent.class);
                CatapultComponent catapultComponent = this.o;
                if (catapultComponent != null) {
                    a(b(catapultComponent.getPageHeight()));
                    if (this.o.getData() != null) {
                        str = this.o.getData().toJSONString();
                    }
                    a(this.o.getBusinessGroup(), str);
                    int i = this.e;
                    if (i != 1 && i != 3) {
                        return;
                    }
                    a(this.o.getUrl(), this.o.getUrl(), this.o.getMd5());
                    return;
                }
                hyq.b(this.g, f, "catapultComponent", "catapultComponent 为空");
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        g();
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.l.setVisibility(0);
        this.j.removeAllViews();
        this.j.addView(this.k);
        this.j.setVisibility(0);
    }

    private void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        g();
        this.l.setVisibility(8);
        this.m.setVisibility(0);
        this.j.removeAllViews();
        this.j.addView(this.k);
        this.j.setVisibility(0);
        this.m.setText(str);
        if (z) {
            this.n.setVisibility(0);
            this.n.setOnClickListener(new View$OnClickListenerC0559a());
            return;
        }
        this.n.setVisibility(8);
        this.n.setOnClickListener(null);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.k != null) {
        } else {
            this.k = LayoutInflater.from(this.g).inflate(R.layout.order_detail_weex_extra_view, this.j, false);
            this.l = (TextView) this.k.findViewById(R.id.tv_order_detail_weex_loading);
            this.m = (TextView) this.k.findViewById(R.id.tv_order_detail_weex_fail_tip);
            this.n = this.k.findViewById(R.id.layout_order_detail_weex_fail_reload);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TBOrderWeexView tBOrderWeexView = this.h;
        if (tBOrderWeexView != null && i > 0) {
            ViewGroup.LayoutParams layoutParams = tBOrderWeexView.getLayoutParams();
            layoutParams.height = i;
            this.h.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        layoutParams2.height = i;
        this.j.setLayoutParams(layoutParams2);
    }

    public void a(final String str, String str2) {
        com.taobao.weex.appfram.storage.b iWXStorageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || (iWXStorageAdapter = WXSDKEngine.getIWXStorageAdapter()) == null) {
        } else {
            iWXStorageAdapter.a(str, str2, new b.a() { // from class: com.taobao.android.order.bundle.ultron.view.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.appfram.storage.b.a
                public void a(Map<String, Object> map) {
                    Object obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || !map.containsKey(str) || (obj = map.get(str)) == null) {
                    } else {
                        a.e();
                        String str3 = "Storage:" + obj.toString();
                    }
                }
            });
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        f();
        this.p.put("weexName", str);
        this.p.put("weexUrl", str2);
        this.p.put("weexMd5", str3);
        TBOrderWeexView tBOrderWeexView = this.h;
        if (tBOrderWeexView != null) {
            try {
                tBOrderWeexView.loadCard(str, str2, str3);
                return;
            } catch (Throwable unused) {
                hyq.b(this.g, f, "渲染失败");
                return;
            }
        }
        hyq.b(this.g, f, "orderWeexView", null);
    }

    @Override // com.taobao.android.order.bundle.base.ActivityLifecycleObserver.a
    public void at_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67ed913", new Object[]{this});
        } else if (this.h == null || !hyk.D()) {
        } else {
            try {
                this.h.onDestroy();
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b implements TBOrderWeexView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2071770706);
            kge.a(805150313);
        }

        private b() {
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            a.this.e = 2;
            hyn.a("WeexOnLoadListener", "onLoadBegin", "callback", "onLoadBegin", str);
            if (a.a(a.this) == null) {
                return;
            }
            a.a(a.this).a(str);
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            a.this.e = 2;
            hyn.a("WeexOnLoadListener", "onLoadData", "callback", "onLoadData", str);
            if (a.a(a.this) == null) {
                return;
            }
            a.a(a.this).b(str);
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.a
        public void a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
                return;
            }
            a.this.e = 4;
            hyn.a("WeexOnLoadListener", "onLoadFinish", "callback", "onLoadFinish", "loadTime = " + j + "");
            a.b(a.this).setVisibility(8);
            if (a.a(a.this) == null) {
                return;
            }
            a.a(a.this).a(str, j);
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.a
        public void a(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            a aVar = a.this;
            aVar.e = 3;
            if (2 == i || 4 == i || 8 == i) {
                a.a(a.this, true, com.alibaba.ability.localization.b.a(R.string.order_biz_load_fail));
            } else {
                a.a(aVar, false, com.alibaba.ability.localization.b.a(R.string.order_biz_load_error));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("私域卡片加载失败,Code = ");
            sb.append(i);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(",");
                sb.append(str2);
            }
            Map c = a.c(a.this);
            c.put("errorCode", i + "");
            a.c(a.this).put("url", str);
            a.c(a.this).put("errorMsg", str2);
            a.c(a.this).put(RVStartParams.KEY_FROM_TYPE, "babelOrder");
            hyq.b(a.d(a.this), "WeexOnLoadListener", "onLoadError", sb.toString(), a.c(a.this));
            if (a.a(a.this) == null) {
                return;
            }
            a.a(a.this).a(str, i, str2);
        }
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        int a2 = hyo.a(this.g);
        return a2 > 0 ? (int) (i * (a2 / 750.0f)) : i;
    }

    /* renamed from: com.taobao.android.order.bundle.ultron.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC0559a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1486652716);
            kge.a(-1201612728);
        }

        public View$OnClickListenerC0559a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.e(a.this) == null) {
            } else {
                a aVar = a.this;
                aVar.a(a.e(aVar).getUrl(), a.e(a.this).getUrl(), a.e(a.this).getMd5());
            }
        }
    }
}
