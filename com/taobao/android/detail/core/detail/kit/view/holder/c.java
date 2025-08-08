package com.taobao.android.detail.core.detail.kit.view.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.model.datamodel.node.TraceDatasNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.trade.event.Event;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import tb.eaz;
import tb.ecu;
import tb.ehs;
import tb.emu;
import tb.emx;
import tb.eoy;
import tb.epo;
import tb.epx;
import tb.epz;
import tb.eqb;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public abstract class c<T extends com.taobao.android.detail.datasdk.model.viewmodel.main.b> implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ThreadFactory h;
    private static final BlockingQueue<Runnable> i;

    /* renamed from: a  reason: collision with root package name */
    public Context f9568a;
    public volatile View b;
    public volatile T c;
    public volatile T d;
    public boolean e = false;
    public boolean f;
    private Map g;

    public abstract View a(Context context, ViewGroup viewGroup);

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public abstract void a(T t);

    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.DetailViewHolder";
    }

    static {
        kge.a(1989676045);
        kge.a(345226328);
        h = new ThreadFactory() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f9569a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "DetailExposureComponent #" + this.f9569a.getAndIncrement());
            }
        };
        i = new LinkedBlockingQueue(Integer.MAX_VALUE);
    }

    public c(Context context) {
        emu.a(q());
        this.f9568a = context;
    }

    public View a(T t, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f720f411", new Object[]{this, t, viewGroup});
        }
        try {
            this.c = t;
            View a2 = a(this.f9568a, viewGroup);
            if (com.taobao.android.detail.core.debug.a.a(this.f9568a) && TStudioHelper.a().b() && a2 != null && (a2 instanceof DXRootView)) {
                a2 = TStudioHelper.a().a(a2);
            }
            this.b = a2;
        } catch (Exception e) {
            i.a("DetailViewHolder", "Detail view holder get view error:", e);
            this.b = null;
        }
        return this.b;
    }

    public boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5839c995", new Object[]{this, t})).booleanValue();
        }
        this.c = t;
        if (com.taobao.android.detail.core.debug.a.a(this.f9568a) && TStudioHelper.a().b() && this.b != null) {
            TStudioHelper.a().a(this.b, t);
        }
        if (this.c != null && this.c.component != null) {
            d(this.c);
            com.taobao.android.detail.core.detail.kit.utils.d.a(this.f9568a, this.c, this.b, this.c.events);
            if (this.b != null && this.c.component.mapping != null && this.c.component.mapping.containsKey("accessHint")) {
                String string = this.c.component.mapping.getString("accessHint");
                if (!StringUtils.isEmpty(string)) {
                    this.b.setContentDescription(string);
                }
            }
        } else {
            c(t);
        }
        if (this.b != null && this.c != null) {
            a((c<T>) this.c);
            if (ecu.h) {
                a(this.b);
            }
        }
        return true;
    }

    private void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc94dd2", new Object[]{this, t});
        } else if (this.c == null || this.c.dmComponent == null) {
        } else {
            d(this.c);
            com.taobao.android.detail.core.detail.kit.utils.d.a(this.f9568a, this.c, this.b, this.c.events);
            if (com.taobao.android.detail.core.debug.a.a(this.f9568a) && TStudioHelper.a().b() && this.b != null) {
                TStudioHelper.a().a(this.b, t);
            }
            if (this.b == null || this.c.dmComponent.getFields() == null || !this.c.dmComponent.getFields().containsKey("accessHint")) {
                return;
            }
            String string = this.c.component.mapping.getString("accessHint");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            this.b.setContentDescription(string);
        }
    }

    private void d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f58d213", new Object[]{this, t});
        } else if (!t.equals(this.d)) {
            this.d = t;
            t.events.clear();
            ComponentModel componentModel = t.component;
            if (componentModel == null || componentModel.actionModelList == null || componentModel.actionModelList.isEmpty()) {
                e(t);
                return;
            }
            for (ActionModel actionModel : componentModel.actionModelList) {
                JSONObject jSONObject = actionModel.params;
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        entry.setValue(epz.a(t.mNodeBundle.a(), entry.getValue()));
                    }
                }
                Event a2 = ehs.a(this.f9568a, actionModel, t.mNodeBundle, null, null);
                if (a2 != null) {
                    t.events.add(a2);
                }
            }
        }
    }

    private void e(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e85654", new Object[]{this, t});
            return;
        }
        this.d = t;
        t.events.clear();
        IDMComponent iDMComponent = t.dmComponent;
        if (iDMComponent == null || iDMComponent.getEvents() == null || iDMComponent.getEvents().isEmpty() || "dinamicx".equals(iDMComponent.getContainerType()) || "dinamic".equals(iDMComponent.getContainerType())) {
            return;
        }
        JSONObject events = iDMComponent.getEvents();
        JSONArray jSONArray = null;
        for (String str : events.keySet()) {
            Object obj = events.get(str);
            if (obj instanceof JSONArray) {
                jSONArray = (JSONArray) obj;
            }
            if (jSONArray == null || jSONArray.size() == 0) {
                return;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    ActionModel actionModel = new ActionModel((JSONObject) next);
                    JSONObject jSONObject = actionModel.params;
                    if (jSONObject != null) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            Object value = entry.getValue();
                            if (t.mNodeBundle.b) {
                                entry.setValue(epz.a(t.mNodeBundle.a(), value, true));
                            } else {
                                entry.setValue(epz.a(t.mNodeBundle.a(), value));
                            }
                        }
                    }
                    Event a2 = ehs.a(this.f9568a, actionModel, t.mNodeBundle, null, null);
                    if (a2 != null) {
                        t.events.add(a2);
                    }
                }
            }
        }
    }

    private void a(View view) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.c == null) {
        } else {
            if ((this.c instanceof com.taobao.android.detail.core.model.viewmodel.main.c) && (view instanceof ViewGroup) && (childAt = ((ViewGroup) view).getChildAt(0)) != null) {
                view = childAt;
            }
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    String str;
                    String format;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                    }
                    ComponentModel componentModel = c.this.c.component;
                    if (componentModel == null) {
                        IDMComponent iDMComponent = c.this.c.dmComponent;
                        if (iDMComponent != null) {
                            if (c.this.c instanceof com.taobao.android.detail.core.model.viewmodel.main.c) {
                                String str2 = eaz.a(c.this.f9568a) ? "容器v3" : "容器v2";
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(eaz.a(((com.taobao.android.detail.core.model.viewmodel.main.c) c.this.c).d.b) ? ",组件v3" : ",组件v2");
                                str = sb.toString();
                            } else {
                                str = "";
                            }
                            format = String.format("奥创:%s: \r\n %s(%s)", str, eoy.a(iDMComponent), eoy.b(iDMComponent));
                        }
                        return true;
                    }
                    format = String.format("%s(%s)", componentModel.key, componentModel.ruleId);
                    Toast.makeText(view2.getContext(), format, 0).show();
                    return true;
                }
            });
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        if (!this.e) {
            g();
        }
        this.e = true;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.e || this.f || this.g == null) {
        } else {
            this.f = true;
            epx.a(emx.c(this.f9568a), this.g);
        }
    }

    public void g() {
        TraceDatasNode r;
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.g = null;
        if (this.c == null || this.c.mNodeBundle == null || (r = eqb.r(this.c.mNodeBundle)) == null) {
            return;
        }
        if (this.c.component != null) {
            str = this.c.component.key + riy.PLUS + this.c.component.ruleId;
        } else if (this.c.dmComponent != null) {
            str = eoy.a(this.c.dmComponent) + riy.PLUS + eoy.b(this.c.dmComponent);
        } else {
            str = "";
        }
        Iterator<String> it = r.trackData.keySet().iterator();
        while (it.hasNext() && !(z = str.equalsIgnoreCase(it.next()))) {
        }
        if (!z) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<String, String>() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.DetailViewHolder$3
            {
                put("itemId", eqb.c(c.this.c.mNodeBundle).itemId);
                put("userId", epo.g().e());
            }
        };
        hashMap.put("module", str);
        this.g = hashMap;
        Context context = this.f9568a;
        epx.a(context, emx.c(context), hashMap);
    }
}
