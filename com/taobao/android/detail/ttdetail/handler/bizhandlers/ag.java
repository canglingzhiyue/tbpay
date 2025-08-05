package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ag implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "titleLongClick";

    /* renamed from: a  reason: collision with root package name */
    private Activity f10678a;
    private eyx b;
    private PopupWindow c;
    private View d;
    private int e;
    private int f;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10680a;
        public JSONArray b;
        public JSONArray c;
        public String d;
        public String e;

        static {
            kge.a(777938445);
        }

        public a() {
        }
    }

    static {
        kge.a(-597759865);
        kge.a(1967244270);
    }

    public static /* synthetic */ PopupWindow a(ag agVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("2df1e00c", new Object[]{agVar}) : agVar.c;
    }

    public static /* synthetic */ void a(ag agVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27385b4", new Object[]{agVar, str, str2, jSONObject});
        } else {
            agVar.a(str, str2, jSONObject);
        }
    }

    public ag(Context context, eyx eyxVar) {
        if (context instanceof Activity) {
            this.f10678a = (Activity) context;
        }
        this.b = eyxVar;
        this.e = com.taobao.android.detail.ttdetail.utils.f.a(this.f10678a);
        this.f = com.taobao.android.detail.ttdetail.utils.f.b(this.f10678a);
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.component.module.d a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr);
        if (a2 == null || (d = a2.getComponentData().d()) == null) {
            return false;
        }
        a(d.getJSONArray("titleTapMenus"), com.taobao.android.detail.ttdetail.utils.a.c(runtimeAbilityParamArr));
        return true;
    }

    private void a(JSONArray jSONArray, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5948942", new Object[]{this, jSONArray, view});
        } else if (jSONArray != null) {
            ArrayList<a> arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(a(jSONArray.getJSONObject(i)));
            }
            if (this.c == null) {
                a(arrayList);
                this.d.measure(View.MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f / 3, Integer.MIN_VALUE));
                View view2 = this.d;
                this.c = new PopupWindow(view2, view2.getMeasuredWidth(), this.d.getMeasuredHeight());
            }
            if (this.c.isShowing()) {
                this.c.dismiss();
                this.c.setFocusable(false);
                return;
            }
            if (!this.f10678a.isFinishing()) {
                this.c.showAsDropDown(view, (this.e - this.c.getWidth()) / 2, -(view.getHeight() + this.c.getHeight()));
                this.c.setFocusable(true);
                this.c.update();
            }
            for (a aVar : arrayList) {
                JSONArray jSONArray2 = aVar.c;
                if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        b(jSONArray2.getJSONObject(i2));
                    }
                }
            }
        }
    }

    private void a(List<a> list) {
        TextView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.d = LayoutInflater.from(this.f10678a).inflate(R.layout.tt_detail_main_title_copypopup_new, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) this.d.findViewById(R.id.ll_tab_container);
        this.d.findViewById(R.id.v_triangle).setBackgroundDrawable(new com.taobao.android.detail.ttdetail.widget.a(Color.parseColor("#dd000000")));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = list.get(i);
            if (aVar != null && (a2 = a(aVar)) != null) {
                linearLayout.addView(a2);
                if (i != size - 1) {
                    linearLayout.addView(a());
                }
            }
        }
    }

    private View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        View view = new View(this.f10678a);
        view.setLayoutParams(new LinearLayout.LayoutParams(1, -1));
        view.setBackgroundColor(-1);
        return view;
    }

    private TextView a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ff01213f", new Object[]{this, aVar});
        }
        if (aVar == null || aVar.f10680a == null) {
            return null;
        }
        TextView textView = new TextView(this.f10678a);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        int a2 = com.taobao.android.sku.utils.m.a(this.f10678a, 15.0f);
        int a3 = com.taobao.android.sku.utils.m.a(this.f10678a, 8.0f);
        textView.setPadding(a2, a3, a2, a3);
        textView.setText(aVar.f10680a);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.ag.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (aVar.b == null) {
                    ag.a(ag.this).dismiss();
                } else {
                    String str = aVar.d;
                    String str2 = aVar.e;
                    JSONArray jSONArray = aVar.b;
                    for (int i = 0; i < jSONArray.size(); i++) {
                        ag.a(ag.this, str, str2, jSONArray.getJSONObject(i));
                    }
                    ag.a(ag.this).dismiss();
                }
            }
        });
        return textView;
    }

    private a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9531942b", new Object[]{this, jSONObject});
        }
        a aVar = new a();
        aVar.f10680a = jSONObject.getString("actionTitle");
        aVar.d = jSONObject.getString("actionType");
        aVar.e = jSONObject.getString("itemId");
        aVar.b = jSONObject.getJSONObject("events").getJSONArray("clickMenu");
        aVar.c = jSONObject.getJSONArray(AURAEventKey.exposureItem);
        return aVar;
    }

    private void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        String string = jSONObject.getString("type");
        final JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (string.equals("share")) {
            this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$2
                {
                    put("type", "openShare");
                    put("fields", (Object) jSONObject2);
                }
            }), new RuntimeAbilityParam[0]);
        }
        if (jSONObject2 == null) {
            return;
        }
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != -1263203643) {
            if (hashCode != 328712004) {
                if (hashCode == 329301056 && string.equals("userTrack")) {
                    c = 2;
                }
            } else if (string.equals("copyContent")) {
                c = 0;
            }
        } else if (string.equals("openUrl")) {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                com.taobao.android.detail.ttdetail.utils.l.a(this.f10678a, jSONObject2.getString("url"));
                return;
            } else if (c != 2) {
                return;
            } else {
                this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$3
                    {
                        put("type", "userTrack");
                        put("fields", (Object) jSONObject2);
                    }
                }), new RuntimeAbilityParam[0]);
                return;
            }
        }
        com.taobao.android.detail.ttdetail.utils.u.a(this.f10678a, jSONObject2.getString("content"));
        if (str2 == null) {
            return;
        }
        if ("CopyTitle".equals(str)) {
            AlimamaAdvertising.instance().commitCpsInitiativeAction(str2, "1", "1", null);
        } else if (!"CopyLink".equals(str)) {
        } else {
            AlimamaAdvertising.instance().commitCpsInitiativeAction(str2, "1", "2", null);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            final String string = jSONObject.getString("type");
            final JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.TitleLongClickImplementor$4
                {
                    put("type", (Object) string);
                    put("fields", (Object) jSONObject2);
                }
            }), new RuntimeAbilityParam[0]);
        }
    }
}
