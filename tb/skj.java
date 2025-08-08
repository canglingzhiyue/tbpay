package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.w;

/* loaded from: classes5.dex */
public class skj extends ezq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33655a;
    private eyx b;
    private w c;

    static {
        kge.a(-1013313605);
    }

    public skj(Context context, eyx eyxVar) {
        this.f33655a = context;
        this.b = eyxVar;
        this.c = new w(this.f33655a, this.b, new pif(new JSONObject()), new DataEntry[0]);
    }

    @Override // tb.ezq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.c();
        }
    }

    @Override // tb.ezq
    public <C extends d> C a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str});
        }
        if (StringUtils.equals("mainScreen", str)) {
            return this.c;
        }
        return (C) this.c.findComponent(str);
    }

    @Override // tb.ezq
    public <C extends d> C b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("e0897dfe", new Object[]{this, str}) : (C) this.c.findComponentByUltronName(str);
    }

    @Override // tb.ezq
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.c.getComponentView(null);
    }

    @Override // tb.ezq
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.c.destroy();
        }
    }
}
