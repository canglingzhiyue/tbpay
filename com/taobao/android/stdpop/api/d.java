package com.taobao.android.stdpop.api;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.viewpager.CustomTabLayout;
import com.taobao.android.stdpop.api.viewpager.PanelViewPagerFragment;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dms;
import tb.ffz;
import tb.kge;
import tb.scr;
import tb.scs;

/* loaded from: classes6.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private PopGravity d;
    private String e;
    private int f;

    /* renamed from: a  reason: collision with root package name */
    private float f15275a = 0.75f;
    private b c = new b(0.0f, 0.0f, 0.0f, 0.0f);
    private String g = String.valueOf(System.currentTimeMillis());
    private int h = ffz.b();

    /* loaded from: classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public a(Activity activity) {
            this.b = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                scs.a(this.b, d.a(d.this));
            }
        }
    }

    static {
        kge.a(2099800076);
    }

    public static final /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa8d02e8", new Object[]{dVar}) : dVar.g;
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f15275a = f;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e458ffa", new Object[]{this, bVar});
            return;
        }
        q.d(bVar, "<set-?>");
        this.c = bVar;
    }

    public final void a(PopGravity popGravity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f50077", new Object[]{this, popGravity});
        } else {
            this.d = popGravity;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final scr a(Activity act, List<com.taobao.android.stdpop.api.viewpager.a> dataSource, com.taobao.android.stdpop.api.a aVar, CustomTabLayout.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scr) ipChange.ipc$dispatch("dda8f29", new Object[]{this, act, dataSource, aVar, aVar2});
        }
        q.d(act, "act");
        q.d(dataSource, "dataSource");
        PanelViewPagerFragment panelViewPagerFragment = new PanelViewPagerFragment();
        panelViewPagerFragment.setDataSource(dataSource);
        panelViewPagerFragment.setInitialTabIndex(this.f);
        if (aVar2 != null) {
            panelViewPagerFragment.setOnTabSelectedListener(aVar2);
        }
        panelViewPagerFragment.setOnCloseClickListener(new a(act));
        if (this.f15275a == 1.0f) {
            this.h = 0;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "maxHeight", (String) Float.valueOf(this.f15275a));
        jSONObject2.put((JSONObject) "maxWidth", (String) 1);
        jSONObject2.put((JSONObject) "panEnable", (String) Boolean.valueOf(this.b));
        jSONObject2.put((JSONObject) "leftMargin", (String) Float.valueOf(this.c.a()));
        jSONObject2.put((JSONObject) "rightMargin", (String) Float.valueOf(this.c.c()));
        jSONObject2.put((JSONObject) "topMargin", (String) Float.valueOf(this.c.b()));
        PopGravity popGravity = this.d;
        jSONObject2.put((JSONObject) "gravity", popGravity != null ? popGravity.getValue() : null);
        jSONObject2.put((JSONObject) "bottomMargin", (String) Float.valueOf(this.c.d()));
        Activity activity = act;
        jSONObject2.put((JSONObject) "autoRotate", (String) Boolean.valueOf(dms.b(activity)));
        jSONObject2.put((JSONObject) "cornerRadius", (String) Integer.valueOf(this.h));
        if (this.e != null) {
            jSONObject2.put((JSONObject) "backgroundMode", "color");
            jSONObject2.put((JSONObject) "backgroundStyle", this.e);
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject);
        jSONObject4.put((JSONObject) "popId", this.g);
        t tVar = t.INSTANCE;
        return scs.a(activity, panelViewPagerFragment, jSONObject3, aVar);
    }
}
