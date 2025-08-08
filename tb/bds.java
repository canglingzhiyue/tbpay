package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class bds extends bdr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Object> d;
    private boolean e;
    private IDMComponent f;

    static {
        kge.a(83588492);
    }

    public static /* synthetic */ Object ipc$super(bds bdsVar, String str, Object... objArr) {
        if (str.hashCode() == 1482661191) {
            return super.a((List) objArr[0], (IDMComponent) objArr[1], (JSONArray) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bdr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "icartCalculate4Column";
    }

    public bds(bbz bbzVar, int i) {
        super(bbzVar, i);
    }

    @Override // tb.bdr
    public void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            IDMComponent iDMComponent = list.get(i);
            if (StringUtils.equals(iDMComponent.getTag(), "checkedItemList")) {
                JSONObject fields = iDMComponent.getFields();
                if (fields == null) {
                    fields = new JSONObject();
                }
                JSONArray jSONArray = fields.getJSONArray("items");
                if (jSONArray != null) {
                    this.d = new ArrayList(jSONArray);
                }
                this.f = iDMComponent;
                this.e = iDMComponent.getFields().getBooleanValue("isExpanded");
                return;
            }
        }
    }

    @Override // tb.bdr
    public List<Object> a(List<IDMComponent> list) {
        List<Object> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        List<Object> list3 = this.d;
        if (list3 == null) {
            return null;
        }
        if (list3.size() > this.b) {
            if (this.e) {
                list2 = this.d;
            } else {
                list2 = this.d.subList(0, this.b - 1);
            }
            list2.add("EXPAND_BUTTON");
        } else {
            list2 = this.d;
        }
        IDMComponent iDMComponent = this.f;
        if (iDMComponent != null) {
            iDMComponent.getData().put("status", (Object) "hidden");
        }
        return list2;
    }

    @Override // tb.bdr
    public IDMComponent a(List<IDMComponent> list, IDMComponent iDMComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("585f9d47", new Object[]{this, list, iDMComponent, jSONArray});
        }
        IDMComponent a2 = super.a(list, iDMComponent, jSONArray);
        if (this.e) {
            a2.getFields().put("isExpanded", (Object) true);
        }
        return a2;
    }
}
