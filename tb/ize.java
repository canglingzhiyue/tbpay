package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;
import com.taobao.android.taopai.charge.net.ChargeReportBusiness;
import com.taobao.android.taopai.charge.net.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class ize implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final izf f29420a = new izf();
    private int b = izg.a(2);

    static {
        kge.a(1334023504);
        kge.a(-1930001879);
        kge.a(1921046590);
    }

    public void a(TpChargeBean tpChargeBean) {
        List<TpChargeBean> subList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4f42a7", new Object[]{this, tpChargeBean});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f29420a.a());
        arrayList.add(tpChargeBean);
        if (arrayList.size() >= this.b) {
            int size = arrayList.size() / this.b;
            for (int i = 1; i <= size; i++) {
                if (i != size) {
                    int i2 = this.b;
                    subList = arrayList.subList((i - 1) * i2, i2 * i);
                } else {
                    subList = arrayList.subList(this.b * (i - 1), arrayList.size());
                }
                a(subList);
            }
            this.f29420a.b();
            return;
        }
        this.f29420a.a().add(tpChargeBean);
        this.f29420a.c();
    }

    @Override // com.taobao.android.taopai.charge.net.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (izk.d()) {
        } else {
            String str2 = "onSuccess , traceId = " + str;
        }
    }

    @Override // com.taobao.android.taopai.charge.net.a
    public void a(List<TpChargeBean> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2065ed", new Object[]{this, list, str, str2});
            return;
        }
        if (!izk.d()) {
            Log.e("TaopaiCharge", "onFail, error = " + str + " | " + str2);
        }
        if (!izg.b() || !TextUtils.equals(str, ChargeReportBusiness.CODE_ERROR_SYSTEM) || list.size() >= 50) {
            return;
        }
        this.f29420a.a(list);
        this.f29420a.c();
    }

    private void a(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            new ChargeReportBusiness(list, this).start();
        }
    }
}
