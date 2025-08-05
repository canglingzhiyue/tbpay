package com.taobao.activelocation.report.service;

import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.domain.LBSCellDTO;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ndy;
import tb.ndz;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1926317018);
    }

    public static void a(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bf1e90", new Object[]{lbsdto});
            return;
        }
        try {
            lbsdto.setImei(ndz.e());
        } catch (Exception unused) {
        }
    }

    public static void b(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93944d1", new Object[]{lbsdto});
        } else {
            lbsdto.wifiNum = (short) 0;
        }
    }

    public static void c(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb36b12", new Object[]{lbsdto});
            return;
        }
        LBSCellDTO[] f = ndz.f();
        if (f != null) {
            TelephonyManager telephonyManager = (TelephonyManager) Globals.getApplication().getSystemService("phone");
            String networkOperator = telephonyManager == null ? null : telephonyManager.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() == 5) {
                lbsdto.setCellMCC(Short.valueOf(Short.parseShort(networkOperator.substring(0, 3))));
                lbsdto.setCellMNC(Short.valueOf(Short.parseShort(networkOperator.substring(3, 5))));
            }
            lbsdto.setCellType(f[0].getBaseStationId() == null ? LBSDTO.CELL_TYPE_GSM : LBSDTO.CELL_TYPE_CDMA);
            lbsdto.setCells(f);
            lbsdto.setCellNum(Short.valueOf((short) f.length));
        } else {
            lbsdto.setCellNum((short) 0);
        }
        lbsdto.setUtdId(ndz.c());
        lbsdto.setIp(ndz.a());
        if (ndz.b() != null) {
            lbsdto.setMacAddr(Long.valueOf(ndy.a(ndz.b(), ":").a()));
        } else {
            lbsdto.setMacAddr(-1L);
        }
    }
}
