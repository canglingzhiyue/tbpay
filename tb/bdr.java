package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.a;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.android.xsearchplugin.weex.weex.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class bdr implements bdu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f25824a;
    public int b;
    public bbz c;
    private final String d = getClass().getSimpleName();

    static {
        kge.a(-165845608);
        kge.a(-612830897);
    }

    public abstract String a();

    public abstract List<Object> a(List<IDMComponent> list);

    public void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        }
    }

    public bdr(bbz bbzVar, int i) {
        this.c = bbzVar;
        this.b = i;
    }

    @Override // tb.bdu
    public final Pair<Integer, List<IDMComponent>> b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ef17cea4", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            UnifyLog.d(this.d, "addColumnComponents popComponents is empty");
            return null;
        }
        e(list);
        Pair<IDMComponent, Integer> d = d(list);
        if (d == null) {
            UnifyLog.d(this.d, "addColumnComponents clone pair null");
            return null;
        }
        c(list);
        this.f25824a = (IDMComponent) d.first;
        Integer num = (Integer) d.second;
        if (num == null || num.intValue() < 0 || num.intValue() >= list.size()) {
            String str = this.d;
            UnifyLog.d(str, "addColumnComponents getToIndex error index=" + num);
            return null;
        }
        List<Object> a2 = a(list);
        if (a2 == null || a2.isEmpty()) {
            UnifyLog.d(this.d, "addColumnComponents itemKeys is empty");
            return null;
        }
        List<IDMComponent> a3 = a(list, a2);
        String str2 = this.d;
        UnifyLog.b(str2, "componentsInColumnByKeys=" + a3);
        return new Pair<>(num, a3);
    }

    public Pair<IDMComponent, Integer> d(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8119bd26", new Object[]{this, list});
        }
        Pair<IDMComponent, Integer> pair = null;
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (StringUtils.equals(iDMComponent.getTag(), a())) {
                pair = new Pair<>(iDMComponent, Integer.valueOf(i));
            }
        }
        return pair;
    }

    public void e(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
        } else if (list == null) {
        } else {
            Iterator<IDMComponent> it = list.iterator();
            while (it.hasNext()) {
                IDMComponent next = it.next();
                if (next != null && next.getTag() != null && next.getTag().contains("_multiple_local")) {
                    it.remove();
                }
            }
        }
    }

    public IDMComponent a(List<IDMComponent> list, IDMComponent iDMComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("585f9d47", new Object[]{this, list, iDMComponent, jSONArray});
        }
        JSONObject parseObject = JSONObject.parseObject(iDMComponent.getData().toJSONString());
        parseObject.put("status", (Object) "normal");
        parseObject.put("tag", (Object) (iDMComponent.getTag() + "_multiple_local"));
        DMComponent a2 = a.a((b) this.c.H(), parseObject, iDMComponent.getTag() + "_multiple_local" + parseObject.hashCode());
        JSONObject fields = a2.getFields();
        if (jSONArray != null) {
            fields.put("items", (Object) jSONArray);
            JSONObject a3 = abh.a(this.c, this.b, b());
            if (a3 != null) {
                fields.putAll(a3);
            }
        }
        return a2;
    }

    public List<IDMComponent> a(List<IDMComponent> list, List<Object> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66db90bd", new Object[]{this, list, list2});
        }
        ArrayList arrayList = new ArrayList();
        if (list2 != null && this.b != 0) {
            int ceil = (int) Math.ceil(list2.size() / this.b);
            JSONArray jSONArray = null;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                Object obj = list2.get(i3);
                if (i == 0) {
                    jSONArray = new JSONArray();
                    IDMComponent a2 = a(list, this.f25824a, jSONArray);
                    if (a2 != null) {
                        arrayList.add(a2);
                        a2.getFields().put(i.INDEX_KEY, (Object) Integer.valueOf(i2));
                        a2.getFields().put("_length", (Object) Integer.valueOf(ceil));
                    }
                    i2++;
                }
                jSONArray.add(obj);
                i++;
                if (i >= this.b) {
                    i = 0;
                }
            }
        }
        return arrayList;
    }

    public int b() {
        bby d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        bbz bbzVar = this.c;
        if (bbzVar != null && (d = bbzVar.x().d()) != null) {
            return d.x();
        }
        return 0;
    }
}
