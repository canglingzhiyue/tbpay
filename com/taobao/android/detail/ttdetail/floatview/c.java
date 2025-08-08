package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.c;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.br;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.widget.LiveIconAnimaView;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.taobao.R;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTReplaceLiveFloatController";

    /* renamed from: a  reason: collision with root package name */
    private Context f10648a;
    private eyx b;
    private View c;
    private LiveIconAnimaView d;
    private TextView e;
    private TextView f;
    private View g;
    private boolean h;

    /* renamed from: com.taobao.android.detail.ttdetail.floatview.c$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10649a;
        public final /* synthetic */ JSONObject c;

        public AnonymousClass1(String str, JSONObject jSONObject) {
            this.f10649a = str;
            this.c = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c.a(c.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTReplaceLiveFloatController$1$1
                {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTReplaceLiveFloatController$1$1.1
                        {
                            put("url", (Object) c.AnonymousClass1.this.f10649a);
                        }
                    });
                }
            }), new RuntimeAbilityParam[0]);
            m.b(2101, "Page_Detail_Button_NativeReplaceLive", this.c);
        }
    }

    static {
        kge.a(-583806471);
        kge.a(-1624068689);
    }

    public static /* synthetic */ eyx a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("81bc502d", new Object[]{cVar}) : cVar.b;
    }

    public c(Context context, eyx eyxVar) {
        this.f10648a = context;
        this.b = eyxVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.g != null) {
        } else {
            com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.f10648a);
            if (a2 != null) {
                this.g = a2.a(this.f10648a, R.layout.tt_detail_replace_live_float, null, true);
            } else {
                this.g = LayoutInflater.from(this.f10648a).inflate(R.layout.tt_detail_replace_live_float, (ViewGroup) null);
            }
            this.c = this.g.findViewById(R.id.ll_live_float_content);
            this.d = (LiveIconAnimaView) this.g.findViewById(R.id.live_img);
            this.e = (TextView) this.g.findViewById(R.id.live_text);
            this.f = (TextView) this.g.findViewById(R.id.live_sub_text);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.floatview.h
    public boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params").getJSONArray("infos").getJSONObject(0).getJSONObject("bizDataExt");
            String string = jSONObject2.getString("title");
            String string2 = jSONObject2.getString("jumpUrl");
            String string3 = jSONObject2.getString("icon");
            String string4 = jSONObject2.getString(SimpleProfile.KEY_DISPLAYNAME);
            if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string3) || StringUtils.isEmpty(string2)) {
                return false;
            }
            a();
            this.e.setText(string);
            this.f.setText(string4);
            boolean isEmpty = StringUtils.isEmpty(string4);
            TextView textView = this.f;
            if (isEmpty) {
                i = 8;
            }
            textView.setVisibility(i);
            this.e.setTextColor(Color.parseColor(isEmpty ? "#111111" : "#FF0040"));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.topMargin = com.taobao.android.detail.ttdetail.utils.f.a(isEmpty ? 8.0f : 3.0f);
            this.e.setLayoutParams(layoutParams);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("title", (Object) string);
            jSONObject3.put("jumpUrl", (Object) string2);
            this.c.setOnClickListener(new AnonymousClass1(string2, jSONObject3));
            this.d.startAnimation();
            m.b(2201, "Page_Detail_Show_NativeReplaceLive", jSONObject3);
            if (!this.h) {
                br.a(this.f10648a, string2);
                this.h = true;
            }
            return true;
        } catch (Exception e) {
            i.a(TAG, "refresh parse error", e);
            return false;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.floatview.h
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.g;
    }
}
