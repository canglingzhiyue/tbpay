package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.mnn.d;
import com.etao.feimagesearch.mnn.utils.a;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class dgh extends BaseMnnRunUnit<aml, czv> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_INFO = "extraInfo";
    public static final String KEY_RESULT_CODE = "result_code";
    public static final String TASK_NAME = "plt_query_quality_check";
    public static final String VALUE_NORMAL_RESULT = "A00099";

    /* renamed from: a  reason: collision with root package name */
    private static volatile dgh f26721a;

    public static /* synthetic */ Object ipc$super(dgh dghVar, String str, Object... objArr) {
        if (str.hashCode() == -345197764) {
            super.a((dgh) objArr[0], objArr[1], (d) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, d dVar) {
        a((aml) obj, obj2, (d<czv>) dVar);
    }

    static {
        kge.a(-201141851);
        f26721a = null;
    }

    private dgh() {
        super(TASK_NAME);
    }

    public static dgh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgh) ipChange.ipc$dispatch("f03a979", new Object[0]);
        }
        if (f26721a == null) {
            synchronized (dgh.class) {
                if (f26721a == null) {
                    f26721a = new dgh();
                }
            }
        }
        return f26721a;
    }

    public void a(aml amlVar, Object obj, final d<czv> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338c4610", new Object[]{this, amlVar, obj, dVar});
            return;
        }
        super.a((dgh) amlVar, obj, (d) dVar);
        HashMap<String, Object> a2 = a.a(amlVar.a());
        if (a2 == null) {
            dVar.a(new RuntimeException("params illegal"));
            return;
        }
        a2.put("_check_type", Integer.valueOf(amlVar.b()));
        coy.a("Page_PhotoSearchResult", "startQualityCheck", 19999, new String[0]);
        a(a2, false, new MNNCVExecutor.b() { // from class: tb.dgh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.mnncv.MNNCVExecutor.b
            public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                } else if (mRTRuntimeException != null) {
                    dVar.a((Throwable) mRTRuntimeException);
                } else {
                    Object obj2 = map.get("result_code");
                    Object obj3 = map.get("extraInfo");
                    if (!(obj2 instanceof String) || !(obj3 instanceof String)) {
                        dVar.a((Throwable) new RuntimeException(JSON.toJSONString(map)));
                    } else {
                        dVar.a((d) new czv((String) obj2, (String) obj3));
                    }
                }
            }
        });
    }
}
