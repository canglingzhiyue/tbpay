package tb;

import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.c;
import com.taobao.search.common.util.i;
import com.taobao.search.mmd.util.j;

/* loaded from: classes8.dex */
public class nts implements jyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-645382271);
        kge.a(1258503788);
    }

    @Override // tb.jyw
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : i.MODULE_NAME;
    }

    @Override // tb.jyw
    public void a(DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e8454c", new Object[]{this, dimensionSet});
            return;
        }
        dimensionSet.addDimension("grayLayerBucket");
        dimensionSet.addDimension("device_level");
        dimensionSet.addDimension("good_price");
        dimensionSet.addDimension("bucket");
    }

    @Override // tb.jyw
    public void a(DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14306d91", new Object[]{this, dimensionValueSet});
            return;
        }
        dimensionValueSet.setValue("grayLayerBucket", ntz.INSTANCE.c("grayLayerBucket"));
        String c = ntz.INSTANCE.c("base_optimize");
        if (c == null) {
            c = "-1";
        }
        dimensionValueSet.setValue("bucket", c);
        dimensionValueSet.setValue("device_level", c.a());
        dimensionValueSet.setValue("good_price", String.valueOf(j.INSTANCE.c()));
    }

    @Override // tb.jyw
    public String a(com.taobao.android.searchbaseframe.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dacdb4ee", new Object[]{this, cVar}) : cVar != null ? cVar.getTrackingName() : "search";
    }
}
