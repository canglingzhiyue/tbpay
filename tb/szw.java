package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.w;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class szw extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailDivision";
    private String b;
    private View c;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private String l;

    static {
        kge.a(1342273548);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    public szw(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.f = false;
        this.b = "";
        this.mContext = context;
        d a2 = d.a(context);
        if (a2 != null) {
            this.c = a2.a(context, R.layout.tt_detail_container_divider, null, true);
        } else {
            this.c = LayoutInflater.from(context).inflate(R.layout.tt_detail_container_divider, (ViewGroup) null);
        }
        a(eyyVar);
    }

    public void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
            return;
        }
        JSONObject d = eyyVar.d();
        if (d == null) {
            return;
        }
        d.getString("name");
        this.b = d.getString("bizId");
        JSONObject jSONObject = d.getJSONObject("payload");
        if (jSONObject == null) {
            return;
        }
        this.g = jSONObject.getString("displayType");
        this.h = jSONObject.getString("iconUrl");
        this.i = jSONObject.getString("title");
        this.j = jSONObject.getString("fgcolor");
        this.k = jSONObject.getIntValue("height");
        this.l = jSONObject.getString("bgcolor");
        c();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if ("text".equals(this.g) || "textHighlight".equals(this.g)) {
            ((TextView) this.c.findViewById(R.id.divider_text)).setText(this.i);
        } else if ("gone".equals(this.g)) {
            this.c.findViewById(R.id.divider_center).setVisibility(8);
            this.c.findViewById(R.id.divider_line).setVisibility(8);
            if (this.k >= 0) {
                View view = new View(y.a(this.c));
                if (this.c instanceof FrameLayout) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, this.k));
                    ((FrameLayout) this.c).addView(view);
                }
                String str = this.l;
                if (str != null) {
                    view.setBackgroundColor(w.a(str));
                }
            }
        }
        this.f = true;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public TTDetailScrollerLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("c38f45ed", new Object[]{this}) : new TTDetailScrollerLayout.LayoutParams(-1, -2);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f) {
        } else {
            a();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.c;
    }
}
