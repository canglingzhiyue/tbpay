package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.model.TemplateHierarchy;
import com.alibaba.android.ultron.engine.protocol.ComponentView;
import com.alibaba.android.ultron.engine.utils.h;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjh implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bji f25939a;
    public ComponentView b;
    public bjh h;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public List<bjh> i = new ArrayList();

    static {
        kge.a(1469142252);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : a();
    }

    public bjh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bjh) ipChange.ipc$dispatch("f02cbfe", new Object[]{this});
        }
        bjh bjhVar = new bjh();
        bji bjiVar = this.f25939a;
        bjhVar.f25939a = bjiVar != null ? bjiVar.a() : null;
        bjhVar.b = this.b;
        bjhVar.c = this.c;
        bjhVar.d = this.d;
        bjhVar.e = this.e;
        bjhVar.f = this.f;
        return bjhVar;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public void a(TemplateComponent templateComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b8c72f", new Object[]{this, templateComponent});
            return;
        }
        this.e = true;
        bji bjiVar = new bji();
        bjiVar.f25940a = String.valueOf(templateComponent.id);
        bjiVar.c = templateComponent.tag;
        bjiVar.b = templateComponent.tag;
        bjiVar.i = templateComponent.tag;
        bjiVar.d = new JSONObject();
        bjiVar.d.putAll(templateComponent.data);
        String str = templateComponent.filter;
        if (!TextUtils.isEmpty(str)) {
            bjiVar.d.put("filter", (Object) str);
            bjiVar.k = true;
        }
        bjiVar.e = templateComponent.event;
        bjiVar.f = templateComponent.supportEvent;
        bjiVar.n = templateComponent.rule;
        bjiVar.l = h.a(bjiVar);
        this.f25939a = bjiVar;
        ComponentView componentView = new ComponentView();
        componentView.name = templateComponent.frontComponentName;
        componentView.version = templateComponent.frontComponentVersion;
        Map<String, String> map = templateComponent.frontComponentAddress;
        Map<String, String> map2 = templateComponent.frontComponentMD5;
        if (map != null && map2 != null) {
            String str2 = map.get("android");
            if (TextUtils.isEmpty(str2)) {
                str2 = map.get("resource");
            }
            componentView.url = str2;
            componentView.md5 = map2.get("android");
        }
        componentView.id = String.valueOf(templateComponent.templateId);
        componentView.containerType = templateComponent.type;
        HashSet hashSet = new HashSet();
        hashSet.add(bjiVar.c);
        componentView.type = hashSet;
        this.b = componentView;
    }

    public void a(TemplateHierarchy.Node node, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b378fd", new Object[]{this, node, str});
            return;
        }
        bji bjiVar = new bji();
        this.d = true;
        bjiVar.c = node.tag;
        bjiVar.i = node.position;
        bjiVar.b = node.tag;
        bjiVar.j = node.style != null ? node.style.getString("cardGroup") : null;
        if (node.data != null) {
            bjiVar.d = new JSONObject();
            bjiVar.d.putAll(node.data);
        }
        bjiVar.l = str;
        this.f25939a = bjiVar;
    }

    public void a(Block block, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a583dd8f", new Object[]{this, block, str});
            return;
        }
        bji bjiVar = new bji();
        this.c = true;
        this.f = block.blockTypeEnum;
        bjiVar.c = str;
        bjiVar.b = str;
        bjiVar.l = str;
        bjiVar.m = block.description;
        bjiVar.i = block.position;
        this.f25939a = bjiVar;
    }

    public void a(bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d5ddb8", new Object[]{this, bjhVar});
        } else {
            this.i.add(bjhVar);
        }
    }

    public void b(bjh bjhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d058e439", new Object[]{this, bjhVar});
        } else {
            this.h = bjhVar;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f25939a.l;
    }

    public bji h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bji) ipChange.ipc$dispatch("44de51b6", new Object[]{this}) : this.f25939a;
    }

    public ComponentView i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComponentView) ipChange.ipc$dispatch("2af08397", new Object[]{this}) : this.b;
    }

    public bjh j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bjh) ipChange.ipc$dispatch("54419c55", new Object[]{this}) : this.h;
    }

    public List<bjh> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ec86895", new Object[]{this}) : this.i;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        bji bjiVar = this.f25939a;
        return bjiVar != null && bjiVar.k;
    }
}
