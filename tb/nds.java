package tb;

import android.content.Context;
import android.content.Intent;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.passivelocation.gathering.service.LocationGatheringService;

/* loaded from: classes7.dex */
public class nds extends PhoneStateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static short f31373a;
    private Context b;

    static {
        kge.a(1046362692);
    }

    public static /* synthetic */ Object ipc$super(nds ndsVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2058329889) {
            super.onSignalStrengthsChanged((SignalStrength) objArr[0]);
            return null;
        } else if (hashCode != -565358330) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCellLocationChanged((CellLocation) objArr[0]);
            return null;
        }
    }

    public nds(Context context) {
        nea.c("lbs_passive.loc_MyPhoneStateListener", "MyPhoneStateListener init");
        this.b = context;
        AppMonitor.Counter.commit("passivelocation", "MyPhoneStateListener", 1.0d);
    }

    @Override // android.telephony.PhoneStateListener
    public void onCellLocationChanged(CellLocation cellLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4d5106", new Object[]{this, cellLocation});
            return;
        }
        nea.c("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged]");
        super.onCellLocationChanged(cellLocation);
        try {
            if (cellLocation instanceof GsmCellLocation) {
                nea.d("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] cid = " + ((GsmCellLocation) cellLocation).getCid());
            } else if (cellLocation instanceof CdmaCellLocation) {
                nea.d("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] baseStationId = " + ((CdmaCellLocation) cellLocation).getBaseStationId());
            }
            LBSDTO a2 = ndp.a();
            if (cellLocation instanceof GsmCellLocation) {
                nea.c("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] current CellLocation is GsmCellLocation");
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                if (a2 != null && a2.getCells() != null && a2.getCells().length > 0 && a2.getCells()[0] != null && gsmCellLocation != null && a2.getCells()[0].getCellId().intValue() == gsmCellLocation.getCid()) {
                    return;
                }
            } else if (cellLocation instanceof CdmaCellLocation) {
                nea.c("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] current CellLocation is CdmaCellLocation");
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                if (a2 != null && a2.getCells() != null && a2.getCells().length > 0 && a2.getCells()[0] != null && cdmaCellLocation != null && a2.getCells()[0].getBaseStationId().intValue() == cdmaCellLocation.getBaseStationId()) {
                    return;
                }
            } else {
                nea.c("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] current CellLocation is other unknown CellLocation: " + cellLocation);
            }
            Intent intent = new Intent(LocationGatheringService.LOCATION_CHANGED_ACTION);
            intent.setPackage(this.b.getPackageName());
            intent.putExtra("location_source_key", "MyPhoneStateListener");
            this.b.startService(intent);
        } catch (Exception e) {
            nea.a("lbs_passive.loc_MyPhoneStateListener", "[onCellLocationChanged] processing error: " + e.getMessage());
        }
    }

    @Override // android.telephony.PhoneStateListener
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855060df", new Object[]{this, signalStrength});
            return;
        }
        nea.c("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged]");
        super.onSignalStrengthsChanged(signalStrength);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ndw.f31376a.getSystemService("phone");
            if (telephonyManager.getSimState() == 5) {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                if (cellLocation instanceof GsmCellLocation) {
                    nea.c("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] GsmCellLocation signalStrength: " + signalStrength.getGsmSignalStrength());
                    f31373a = (short) signalStrength.getGsmSignalStrength();
                } else if (cellLocation instanceof CdmaCellLocation) {
                    nea.c("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] CdmaCellLocation signalStrength: " + signalStrength.getCdmaDbm());
                    f31373a = (short) signalStrength.getCdmaDbm();
                } else {
                    nea.d("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] other type CellLocation: " + cellLocation);
                }
            } else {
                nea.b("lbs_passive.loc_MyPhoneStateListener", "[onSignalStrengthsChanged] SIM state is not ok!");
            }
        } catch (Exception unused) {
        }
    }
}
