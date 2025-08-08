package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

@TableName("stat_temp")
/* loaded from: classes.dex */
public class btg extends bte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("dimension_values")

    /* renamed from: a  reason: collision with root package name */
    private String f26127a;
    @Column("measure_values")
    private String b;

    static {
        kge.a(576670857);
    }

    public btg() {
    }

    public btg(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet, String str3, String str4) {
        super(str, str2, str3, str4);
        this.f26127a = JSON.toJSONString(dimensionValueSet);
        this.b = JSON.toJSONString(measureValueSet);
    }

    public MeasureValueSet a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("267e3d5f", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.b)) {
            return null;
        }
        return (MeasureValueSet) JSON.parseObject(this.b, MeasureValueSet.class);
    }

    public DimensionValueSet b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("268a2076", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.f26127a)) {
            return null;
        }
        return (DimensionValueSet) JSON.parseObject(this.f26127a, DimensionValueSet.class);
    }

    @Override // tb.bte
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TempStat{module='" + this.f + "'monitorPoint='" + this.g + "'dimension_values='" + this.f26127a + "', measure_values='" + this.b + "'}";
    }
}
