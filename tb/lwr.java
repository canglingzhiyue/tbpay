package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;

/* loaded from: classes7.dex */
public class lwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lws f30952a;

    static {
        kge.a(2067990975);
    }

    public lwr(lwz lwzVar) {
        this.f30952a = new lws(lwzVar);
    }

    public void a(AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab53f9d", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData == null || awesomeGetData.getContainers() == null || awesomeGetData.getContainers().isEmpty()) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f30952a.a(awesomeGetData);
            lxl.c("DataPreProcess", "DataPreProcess TabProtocolProcess use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
        }
    }
}
