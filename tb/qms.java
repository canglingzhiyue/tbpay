package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.a;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.r;
import tb.eyy;

/* loaded from: classes4.dex */
public class qms<CD extends eyy> {
    public static final String $_MODEL = "$model";
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMPONENT = "component";
    public static final String KEY_IF = "if";
    public static final String KEY_PROPS = "props";
    public static final String KEY_TYPE = "type";
    public static final String TYPE_NORMAL = "normal";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f32944a;
    public plc b;
    public String c;
    public String d = "normal";
    public String e;
    public String f;
    public CD g;
    public qpj h;
    public d i;
    public View p;

    static {
        kge.a(1094711573);
    }

    public qms(JSONObject jSONObject, plc plcVar) {
        a(jSONObject);
        this.b = plcVar;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f32944a = jSONObject;
        this.c = jSONObject.getString("component");
        this.d = jSONObject.getString("type");
        if (StringUtils.isEmpty(this.d)) {
            this.d = "normal";
        }
        this.e = jSONObject.getString("if");
        this.f = jSONObject.getString("props");
    }

    public CD a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CD) ipChange.ipc$dispatch("f046379", new Object[]{this});
        }
        if (this.g == null) {
            this.g = b(this.f);
        }
        return this.g;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        eyy componentData = this.i.getComponentData();
        return componentData != null && StringUtils.equals(str, componentData.r());
    }

    public <C extends d> C a(String str, a aVar) {
        CD a2;
        d a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("e9051890", new Object[]{this, str, aVar});
        }
        if (this.i != null) {
            if (!c(str)) {
                return null;
            }
            return (C) this.i;
        } else if (aVar == null || (a2 = a()) == null || (a3 = aVar.a(a2, new DataEntry[0])) == null) {
            return null;
        } else {
            this.i = a3;
            if (this.i != null && c(str)) {
                return (C) this.i;
            }
            return null;
        }
    }

    public <C extends d> C a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str});
        }
        d dVar = this.i;
        if (dVar == null || !StringUtils.equals(str, dVar.getComponentData().b())) {
            return null;
        }
        return (C) this.i;
    }

    public synchronized <C extends d> C a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("4bceb046", new Object[]{this, aVar});
        } else if (this.i != null) {
            return (C) this.i;
        } else if (aVar == null) {
            return null;
        } else {
            CD a2 = a();
            if (a2 == null) {
                return null;
            }
            C c = (C) aVar.a(a2, new DataEntry[0]);
            if (c == null) {
                return null;
            }
            this.i = c;
            return c;
        }
    }

    public d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c7b5e7b9", new Object[]{this}) : this.i;
    }

    public CD b(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (CD) ipChange.ipc$dispatch("7d1bb80e", new Object[]{this, str});
        }
        if (this.b == null || str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split == null) {
            i.a("Node", "parsePrototypeProps() split return null, the prototypeProps：" + str + " does not container . symbol");
        } else if (split.length < 2) {
            i.a("Node", "parsePrototypeProps() split result < 2, the prototypeProps：" + str);
        } else if (!StringUtils.equals($_MODEL, split[0])) {
            i.a("Node", "parsePrototypeProps() failure, the prototypeProps：" + str + " does not container $model");
        } else {
            z = true;
        }
        if (z) {
            return (CD) this.b.a((String[]) r.a(split, 1, split.length));
        }
        return null;
    }

    public View b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc71907e", new Object[]{this, aVar});
        }
        d a2 = a(aVar);
        if (a2 == null) {
            return null;
        }
        View componentView = a2.getComponentView(this.p);
        if (componentView == null) {
            i.a("Node", "getNodeView return null for single componentData: " + a());
        }
        this.p = componentView;
        return componentView;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Node{mData=" + this.f32944a + '}';
    }
}
