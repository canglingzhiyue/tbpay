package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class eoi extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TitleViewModel.ShareType f27500a;
    public Map<String, String> b;
    public String c;

    static {
        kge.a(-312948687);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public eoi() {
        emu.a("com.taobao.android.detail.datasdk.event.title.ShareEvent");
    }

    public eoi(TitleViewModel.ShareType shareType) {
        this.f27500a = shareType;
        emu.a("com.taobao.android.detail.datasdk.event.title.ShareEvent");
    }

    public eoi(TitleViewModel.ShareType shareType, JSONObject jSONObject) {
        this.f27500a = shareType;
        this.c = jSONObject.getString("detailShareScene");
        JSONObject jSONObject2 = jSONObject.getJSONObject("detailShareParams");
        if (jSONObject2 != null) {
            this.b = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.b.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        emu.a("com.taobao.android.detail.datasdk.event.title.ShareEvent");
    }
}
