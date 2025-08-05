package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.BubbleNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import java.util.Map;

/* loaded from: classes4.dex */
public class egw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27300a;
    public String b;
    public String c;
    public String d;
    public String e;
    public JSONObject f;
    public JSONObject g;
    public b h;

    static {
        kge.a(1580825963);
    }

    public egw(BubbleNode bubbleNode, b bVar) {
        this.f27300a = bubbleNode.tip;
        this.b = bubbleNode.link;
        this.c = bubbleNode.picIcon;
        this.d = bubbleNode.status;
        this.e = bubbleNode.buttonText;
        if (bubbleNode.ut != null) {
            this.f = bubbleNode.ut.getJSONObject("event");
            this.g = bubbleNode.ut.getJSONObject("track");
        }
        this.h = bVar;
        a();
        emu.a("com.taobao.android.detail.core.model.viewmodel.bubble.BubbleViewModel");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f;
        if (jSONObject != null) {
            a(jSONObject);
        }
        JSONObject jSONObject2 = this.g;
        if (jSONObject2 == null) {
            return;
        }
        a(jSONObject2);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.getJSONObject("params").entrySet()) {
            entry.setValue(epz.a(this.h.a(), entry.getValue()));
        }
    }
}
