package tb;

import com.alibaba.android.ultron.engine.model.Block;
import com.alibaba.android.ultron.engine.model.Template;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.alibaba.android.ultron.engine.model.TemplateHierarchy;
import com.alibaba.android.ultron.engine.utils.h;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Template f25942a;
    public Map<String, bjh> b = new HashMap();
    public Map<String, List<Block>> c = new HashMap();
    public bjh d;

    static {
        kge.a(-1732252090);
    }

    public bjq(Template template) {
        this.f25942a = template;
    }

    public bjh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bjh) ipChange.ipc$dispatch("f02cbfe", new Object[]{this}) : this.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d();
        e();
    }

    public Template c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Template) ipChange.ipc$dispatch("386c86a8", new Object[]{this}) : this.f25942a;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (Block block : this.f25942a.blocks) {
            List<Block> list = this.c.get(block.position);
            if (list == null) {
                list = new ArrayList<>();
                this.c.put(block.position, list);
            }
            list.add(block);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TemplateHierarchy templateHierarchy = this.f25942a.hierarchy;
        String str = templateHierarchy.root;
        bjh bjhVar = new bjh();
        TemplateHierarchy.Node node = templateHierarchy.nodes.get(str);
        if (node == null) {
            node = new TemplateHierarchy.Node();
            node.position = str;
            node.tag = str;
        }
        bjhVar.a(node, str);
        this.d = bjhVar;
        this.b.put(str, this.d);
        Iterator<Object> it = templateHierarchy.structure.getJSONArray(str).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof String)) {
                return;
            }
            a(templateHierarchy, (String) next, bjhVar);
        }
    }

    private void a(TemplateHierarchy templateHierarchy, String str, bjh bjhVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d866951", new Object[]{this, templateHierarchy, str, bjhVar});
            return;
        }
        JSONObject jSONObject = templateHierarchy.structure;
        Map<String, TemplateHierarchy.Node> map = templateHierarchy.nodes;
        if (!map.containsKey(str)) {
            return;
        }
        bjh bjhVar2 = new bjh();
        bjhVar2.a(map.get(str), str);
        bjhVar2.b(bjhVar);
        bjhVar.a(bjhVar2);
        this.b.put(str, bjhVar2);
        if (this.c.containsKey(str)) {
            for (Block block : this.c.get(str)) {
                if (block != null) {
                    String str2 = block.name;
                    bjh bjhVar3 = new bjh();
                    bjhVar3.a(block, str2);
                    bjhVar3.b(bjhVar);
                    bjhVar2.a(bjhVar3);
                    this.b.put(str2, bjhVar3);
                    for (TemplateComponent templateComponent : block.components) {
                        if (templateComponent != null) {
                            bjh bjhVar4 = new bjh();
                            bjhVar4.a(templateComponent);
                            bjhVar4.b(bjhVar3);
                            bjhVar3.a(bjhVar4);
                            this.b.put(h.a(templateComponent), bjhVar4);
                            if (templateComponent.children != null && !templateComponent.children.isEmpty()) {
                                for (TemplateComponent templateComponent2 : templateComponent.children) {
                                    bjh bjhVar5 = new bjh();
                                    bjhVar5.a(templateComponent2);
                                    bjhVar5.b(bjhVar4);
                                    bjhVar4.a(bjhVar5);
                                    this.b.put(h.a(templateComponent2), bjhVar5);
                                }
                            }
                        }
                    }
                }
            }
        } else if (jSONObject.containsKey(str) && (jSONArray = jSONObject.getJSONArray(str)) != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof String)) {
                    return;
                }
                a(templateHierarchy, (String) next, bjhVar2);
            }
        }
    }
}
