package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class iye {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f29406a;
    private e b;
    private iyc c;
    private JSONObject d = new JSONObject();
    private List e = new ArrayList();
    private List f = new ArrayList();
    private JSONObject g;

    static {
        kge.a(319263431);
    }

    public iye(e eVar, iyc iycVar) {
        this.b = eVar;
        this.f29406a = this.b.a();
        this.c = iycVar;
        a(eVar);
    }

    private void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        b bVar = (b) eVar.i();
        if (bVar == null || TextUtils.isEmpty(bVar.getType())) {
            return;
        }
        IDMComponent d = eVar.d();
        if (d != null) {
            this.g = d.getData();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) bVar.getType());
        JSONObject fields = bVar.getFields();
        if (fields != null) {
            fields = JSONObject.parseObject(fields.toJSONString());
        }
        jSONObject.put("fields", (Object) fields);
        ArrayList arrayList = null;
        Object[] objArr = (Object[]) eVar.d("extraParams");
        if (objArr != null && objArr.length > 1) {
            arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 1; i < length; i++) {
                arrayList.add(objArr[i]);
            }
        }
        List list = (List) eVar.d("viewParams");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.d = jSONObject;
        this.e = arrayList;
        this.f = list;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f29406a;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.d;
    }

    public List c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.e;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.g;
    }
}
