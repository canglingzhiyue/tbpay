package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import java.util.List;

/* loaded from: classes4.dex */
public class enz extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RateNode.RateKeyword f27485a;
    public List<RateNode.RateKeyword> b;
    public String c;
    public long d;
    public JSONObject e;
    public int f = -1;
    private JSONObject g;

    static {
        kge.a(1218140943);
    }

    public enz() {
        emu.a("com.taobao.android.detail.datasdk.event.comment.OpenCommentViewEvent");
    }

    public enz(JSONObject jSONObject) {
        a(this, jSONObject);
        emu.a("com.taobao.android.detail.datasdk.event.comment.OpenCommentViewEvent");
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.g;
    }

    public enz(RateNode.RateKeyword rateKeyword) {
        this.f27485a = rateKeyword;
        emu.a("com.taobao.android.detail.datasdk.event.comment.OpenCommentViewEvent");
    }

    public enz(RateNode.RateKeyword rateKeyword, List<RateNode.RateKeyword> list) {
        this.f27485a = rateKeyword;
        this.b = list;
        emu.a("com.taobao.android.detail.datasdk.event.comment.OpenCommentViewEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27485a;
    }

    public static void a(enz enzVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b72b89", new Object[]{enzVar, jSONObject});
            return;
        }
        enzVar.g = jSONObject;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.getString("feedId");
        if (!StringUtils.isEmpty(string)) {
            try {
                enzVar.d = Long.parseLong(string);
            } catch (Throwable unused) {
            }
        }
        enzVar.c = jSONObject.getString("skuVids");
        String string2 = jSONObject.getString("invokeSource");
        if (!StringUtils.isEmpty(string2)) {
            try {
                enzVar.f = Integer.parseInt(string2);
            } catch (Throwable unused2) {
            }
        }
        enzVar.e = jSONObject.getJSONObject("exParams");
        jSONObject.put("exParams", (Object) enzVar.e);
    }
}
