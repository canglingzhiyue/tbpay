package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.acj;

/* loaded from: classes8.dex */
public class ooe extends acj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<SectionModel> f32224a;
    public List<SectionModel> b;

    static {
        kge.a(692910464);
    }

    public static /* synthetic */ Object ipc$super(ooe ooeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ooe(List<SectionModel> list, List<SectionModel> list2) {
        this.f32224a = list2;
        this.b = list;
    }

    @Override // tb.acj.a
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        List<SectionModel> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.acj.a
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
        }
        List<SectionModel> list = this.f32224a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.acj.a
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        JSONObject a2 = a(this.b, i);
        JSONObject a3 = a(this.f32224a, i2);
        return a2 == a3 || !(a2 == null || a3 == null || !TextUtils.equals(a2.getString("sectionBizCode"), a3.getString("sectionBizCode")));
    }

    @Override // tb.acj.a
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        JSONObject a2 = a(this.b, i);
        JSONObject a3 = a(this.f32224a, i2);
        return a2 == a3 || (a2 != null && a2.equals(a3));
    }

    private JSONObject a(List<SectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9f4977ea", new Object[]{this, list, new Integer(i)});
        }
        if (list != null && !list.isEmpty() && i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
