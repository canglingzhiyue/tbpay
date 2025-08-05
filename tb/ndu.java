package tb;

import android.location.Location;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.domain.LBSCellDTO;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class ndu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1945852428);
    }

    public static LBSDTO a(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("ef421f54", new Object[]{location});
        }
        LBSDTO lbsdto = new LBSDTO();
        if (location != null) {
            lbsdto.setAccuracy(Integer.valueOf((int) location.getAccuracy()));
            lbsdto.setHasLocation(true);
            lbsdto.setLatitude(Double.valueOf(location.getLatitude()));
            lbsdto.setLongitude(Double.valueOf(location.getLongitude()));
            lbsdto.setAltitude(Double.valueOf(location.getAltitude()));
        } else {
            lbsdto.setHasLocation(false);
        }
        lbsdto.setTime(System.currentTimeMillis());
        lbsdto.setVersion(1);
        LBSCellDTO[] a2 = a();
        if (a2 != null) {
            String networkOperator = ((TelephonyManager) Globals.getApplication().getSystemService("phone")).getNetworkOperator();
            if (networkOperator != null && networkOperator.length() == 5) {
                lbsdto.setCellMCC(Short.valueOf(Short.parseShort(networkOperator.substring(0, 3))));
                lbsdto.setCellMNC(Short.valueOf(Short.parseShort(networkOperator.substring(3, 5))));
            }
            lbsdto.setCellType(a2[0].getBaseStationId() == null ? LBSDTO.CELL_TYPE_GSM : LBSDTO.CELL_TYPE_CDMA);
            lbsdto.setCells(a2);
            lbsdto.setCellNum(Short.valueOf((short) a2.length));
        } else {
            lbsdto.setCellNum((short) 0);
        }
        lbsdto.wifiNum = (short) 0;
        lbsdto.setUtdId(ndz.c());
        lbsdto.setIp(ndz.a());
        if (ndz.b() != null) {
            lbsdto.setMacAddr(Long.valueOf(ndy.a(ndz.b(), ":").a()));
        } else {
            lbsdto.setMacAddr(-1L);
        }
        return lbsdto;
    }

    private static LBSCellDTO[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LBSCellDTO[]) ipChange.ipc$dispatch("15051a17", new Object[0]) : ndz.f();
    }
}
