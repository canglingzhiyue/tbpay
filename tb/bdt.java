package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes2.dex */
public class bdt extends bdr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(413104518);
    }

    @Override // tb.bdr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "groupRecommendItems";
    }

    public bdt(bbz bbzVar, int i) {
        super(bbzVar, i);
    }

    @Override // tb.bdr
    public List<Object> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        IDMComponent iDMComponent = null;
        for (IDMComponent iDMComponent2 : list) {
            if (StringUtils.equals("groupExtendBody", iDMComponent2.getTag())) {
                iDMComponent = iDMComponent2;
            }
        }
        if (iDMComponent != null) {
            return iDMComponent.getFields().getJSONArray("items");
        }
        return null;
    }
}
