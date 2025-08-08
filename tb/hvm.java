package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.ei;

/* loaded from: classes6.dex */
public class hvm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CUSTOM = 4;
    public static final int TYPE_DEFAULT = 1;
    public static final int TYPE_FAILED = 3;
    public static final int TYPE_SUCCESS = 2;

    public static void a(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74de81ad", new Object[]{context, new Integer(i), str});
        } else {
            a(context, i, str, null);
        }
    }

    public static void a(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93897a37", new Object[]{context, new Integer(i), str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                ei a2 = ei.a(str);
                if (i == 1) {
                    a2.d = "텪";
                } else if (i == 2) {
                    a2.e = "https://gw.alicdn.com/imgextra/i3/O1CN01jGbZS61RZkzF4hLoJ_!!6000000002126-2-tps-48-48.png";
                } else if (i != 3 && i == 4) {
                    a2.d = str2;
                }
                jao.a().a(a2, new jzb() { // from class: tb.hvm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jzb, tb.gml
                    public void a(ErrorResult errorResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        } else {
                            jpr.a(jpu.a("iCart").c("showToastError").b(errorResult.b()));
                        }
                    }
                });
            } catch (Throwable th) {
                jpr.a(jpu.a("iCart").c("showToastError").b(th.getMessage()));
            }
        }
    }
}
