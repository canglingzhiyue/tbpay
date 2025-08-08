package com.loc;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import mtopsdk.common.util.StringUtils;
import anet.channel.Constants;
import com.uc.webview.base.cyclone.BSError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class fb {
    TelephonyManager b;
    SignalStrength d;
    private Context h;
    private ez m;
    private TelephonyManager.CellInfoCallback q;
    private es u;
    private boolean i = false;
    private boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<fa> f7783a = new ArrayList<>();
    private String k = null;
    private ArrayList<fa> l = new ArrayList<>();
    private long n = 0;
    PhoneStateListener c = null;
    private boolean o = false;
    private Object p = new Object();
    private boolean r = false;
    boolean e = false;
    StringBuilder f = null;
    private String s = null;
    private String t = null;
    String g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends TelephonyManager.CellInfoCallback {
        a() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public final void onCellInfo(List<CellInfo> list) {
            try {
                if (fy.b() - fb.this.n < 500) {
                    return;
                }
                fb.this.r = true;
                fb.this.a(fb.this.t());
                fb.this.a(list);
                fb.this.n = fy.b();
            } catch (SecurityException e) {
                fb.this.g = e.getMessage();
            } catch (Throwable th) {
                fr.a(th, "Cgi", "cellInfo");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends PhoneStateListener {
        b() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellInfoChanged(List<CellInfo> list) {
            try {
                if (fb.this.u != null) {
                    fb.this.u.c();
                }
                if (fy.b() - fb.this.n < 500) {
                    return;
                }
                fb.this.a(fb.this.t());
                fb.this.a(list);
                fb.this.n = fy.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onCellLocationChanged(CellLocation cellLocation) {
            if (fy.b() - fb.this.n < 500) {
                return;
            }
            try {
                fb.this.a(cellLocation);
                fb.this.a(fb.this.u());
                fb.this.n = fy.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onDataConnectionStateChanged(int i) {
            super.onDataConnectionStateChanged(i);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(ServiceState serviceState) {
            try {
                int state = serviceState.getState();
                if (state == 0) {
                    fb.this.a(false, false);
                } else if (state != 1) {
                } else {
                    fb.this.j();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthChanged(int i) {
            super.onSignalStrengthChanged(i);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (signalStrength == null) {
                return;
            }
            fb fbVar = fb.this;
            fbVar.d = signalStrength;
            try {
                if (fbVar.u == null) {
                    return;
                }
                fb.this.u.c();
            } catch (Throwable unused) {
            }
        }
    }

    public fb(Context context, Handler handler) {
        this.b = null;
        this.m = null;
        this.h = context;
        if (this.b == null) {
            this.b = (TelephonyManager) fy.a(this.h, "phone");
        }
        o();
        this.m = new ez(context, "cellAge", handler);
        this.m.a();
    }

    private static fa a(int i, boolean z, int i2, int i3, int i4, int i5, int i6) {
        fa faVar = new fa(i, z);
        faVar.f7782a = i2;
        faVar.b = i3;
        faVar.c = i4;
        faVar.d = i5;
        faVar.k = i6;
        return faVar;
    }

    private fa a(CellInfoCdma cellInfoCdma, boolean z) {
        int i;
        int i2;
        int i3;
        if (cellInfoCdma != null && cellInfoCdma.getCellIdentity() != null) {
            CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
            if (cellIdentity.getSystemId() > 0 && cellIdentity.getNetworkId() >= 0 && cellIdentity.getBasestationId() >= 0) {
                CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                String[] a2 = fy.a(this.b);
                try {
                    i = Integer.parseInt(a2[0]);
                    try {
                        i3 = Integer.parseInt(a2[1]);
                        i2 = i;
                    } catch (Throwable unused) {
                        i2 = i;
                        i3 = 0;
                        fa a3 = a(2, z, i2, i3, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                        a3.h = cellIdentity2.getSystemId();
                        a3.i = cellIdentity2.getNetworkId();
                        a3.j = cellIdentity2.getBasestationId();
                        a3.f = cellIdentity2.getLatitude();
                        a3.g = cellIdentity2.getLongitude();
                        a3.s = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                        return a3;
                    }
                } catch (Throwable unused2) {
                    i = 0;
                }
                fa a32 = a(2, z, i2, i3, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                a32.h = cellIdentity2.getSystemId();
                a32.i = cellIdentity2.getNetworkId();
                a32.j = cellIdentity2.getBasestationId();
                a32.f = cellIdentity2.getLatitude();
                a32.g = cellIdentity2.getLongitude();
                a32.s = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                return a32;
            }
        }
        return null;
    }

    private static fa a(CellInfoGsm cellInfoGsm, boolean z) {
        if (cellInfoGsm == null || cellInfoGsm.getCellIdentity() == null) {
            return null;
        }
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        fa a2 = a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
        a2.o = cellInfoGsm.getCellIdentity().getBsic();
        a2.p = cellInfoGsm.getCellIdentity().getArfcn();
        a2.q = cellInfoGsm.getCellSignalStrength().getTimingAdvance();
        a2.s = cellInfoGsm.getCellSignalStrength().getDbm();
        return a2;
    }

    private static fa a(CellInfoLte cellInfoLte, boolean z) {
        if (cellInfoLte == null || cellInfoLte.getCellIdentity() == null) {
            return null;
        }
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        fa a2 = a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
        a2.o = cellIdentity.getPci();
        if (Build.VERSION.SDK_INT >= 24) {
            a2.p = cellIdentity.getEarfcn();
        }
        a2.q = cellInfoLte.getCellSignalStrength().getTimingAdvance();
        a2.s = cellInfoLte.getCellSignalStrength().getDbm();
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.loc.fa a(android.telephony.CellInfoNr r14, boolean r15) {
        /*
            if (r14 == 0) goto L93
            android.telephony.CellIdentity r0 = r14.getCellIdentity()
            if (r0 != 0) goto La
            goto L93
        La:
            android.telephony.CellIdentity r0 = r14.getCellIdentity()
            android.telephony.CellIdentityNr r0 = (android.telephony.CellIdentityNr) r0
            int r1 = r0.getTac()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r1 != r2) goto L31
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "HUAWEI"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L31
            java.lang.String r2 = "getHwTac"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2d
            int r1 = com.loc.fu.b(r0, r2, r4)     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r2 = move-exception
            r2.printStackTrace()
        L31:
            long r4 = r0.getNci()
            java.lang.String r2 = r0.getMccString()     // Catch: java.lang.Throwable -> L4a
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = r0.getMncString()     // Catch: java.lang.Throwable -> L48
            int r3 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L48
            r9 = r2
            r10 = r3
            goto L51
        L48:
            r6 = move-exception
            goto L4c
        L4a:
            r6 = move-exception
            r2 = 0
        L4c:
            r6.printStackTrace()
            r9 = r2
            r10 = 0
        L51:
            android.telephony.CellSignalStrength r2 = r14.getCellSignalStrength()
            android.telephony.CellSignalStrengthNr r2 = (android.telephony.CellSignalStrengthNr) r2
            int r13 = r2.getSsRsrp()
            r7 = 5
            int r11 = r0.getTac()
            r12 = 0
            r8 = r15
            com.loc.fa r15 = a(r7, r8, r9, r10, r11, r12, r13)
            r15.e = r4
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 <= r2) goto L73
            r15.c = r3
            goto L7c
        L73:
            if (r1 <= r3) goto L7a
            r15.c = r3
            r15.q = r1
            goto L7c
        L7a:
            r15.c = r1
        L7c:
            int r1 = r0.getPci()
            r15.o = r1
            int r0 = r0.getNrarfcn()
            r15.p = r0
            android.telephony.CellSignalStrength r14 = r14.getCellSignalStrength()
            int r14 = r14.getDbm()
            r15.s = r14
            return r15
        L93:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fb.a(android.telephony.CellInfoNr, boolean):com.loc.fa");
    }

    private static fa a(CellInfoWcdma cellInfoWcdma, boolean z) {
        if (cellInfoWcdma == null || cellInfoWcdma.getCellIdentity() == null) {
            return null;
        }
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        fa a2 = a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
        a2.o = cellIdentity.getPsc();
        a2.p = cellInfoWcdma.getCellIdentity().getUarfcn();
        a2.s = cellInfoWcdma.getCellSignalStrength().getDbm();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(CellLocation cellLocation) {
        String[] a2 = fy.a(this.b);
        this.f7783a.clear();
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            fa faVar = new fa(1, true);
            faVar.f7782a = fy.e(a2[0]);
            faVar.b = fy.e(a2[1]);
            faVar.c = gsmCellLocation.getLac();
            faVar.d = gsmCellLocation.getCid();
            if (this.d != null) {
                int gsmSignalStrength = this.d.getGsmSignalStrength();
                faVar.s = gsmSignalStrength == 99 ? Integer.MAX_VALUE : b(gsmSignalStrength);
            }
            faVar.r = false;
            this.m.a((ez) faVar);
            this.f7783a.add(faVar);
            return;
        }
        if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            fa faVar2 = new fa(2, true);
            faVar2.f7782a = Integer.parseInt(a2[0]);
            faVar2.b = Integer.parseInt(a2[1]);
            faVar2.f = cdmaCellLocation.getBaseStationLatitude();
            faVar2.g = cdmaCellLocation.getBaseStationLongitude();
            faVar2.h = cdmaCellLocation.getSystemId();
            faVar2.i = cdmaCellLocation.getNetworkId();
            faVar2.j = cdmaCellLocation.getBaseStationId();
            if (this.d != null) {
                faVar2.s = this.d.getCdmaDbm();
            }
            faVar2.r = false;
            this.m.a((ez) faVar2);
            this.f7783a.add(faVar2);
        }
    }

    public static boolean a(int i) {
        return i > 0 && i <= 15;
    }

    private static int b(int i) {
        return (i * 2) + BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA;
    }

    private void b(boolean z, boolean z2) {
        if (!this.e && this.b != null && Build.VERSION.SDK_INT >= 29 && this.h.getApplicationInfo().targetSdkVersion >= 29) {
            if (this.q == null) {
                this.q = new a();
            }
            this.b.requestCellInfoUpdate(cr.a().b(), this.q);
            if (z2 || z) {
                for (int i = 0; !this.r && i < 20; i++) {
                    try {
                        Thread.sleep(5L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        this.j = false;
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null) {
            this.k = telephonyManager.getNetworkOperator();
            if (!StringUtils.isEmpty(this.k)) {
                this.j = true;
            }
        }
        this.n = fy.b();
    }

    private void o() {
        if (this.b == null) {
            return;
        }
        p();
    }

    private void p() {
        try {
            if (this.c == null) {
                this.c = new b();
            }
            String str = "hasFineLocPerm";
            int i = 336;
            if (Build.VERSION.SDK_INT >= 31) {
                if (this.h.checkSelfPermission(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) == 0) {
                    this.t = str;
                } else {
                    this.t = "hasNoFineLocPerm";
                    i = 320;
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                if (Build.VERSION.SDK_INT >= 31) {
                    boolean z = true;
                    boolean z2 = this.h.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                    if (this.h.checkSelfPermission(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) != 0) {
                        z = false;
                    }
                    if (z2 && z) {
                        i |= 1024;
                    }
                    this.s = z2 ? "hasReadPhoneStatePerm" : "hasNoReadPhoneStatePerm";
                    if (!z) {
                        str = "hasNoFineLocPerm";
                    }
                    this.t = str;
                    StringBuilder sb = new StringBuilder("CgiManager | mLFLPerm = ");
                    sb.append(this.t);
                    sb.append(";mLRPSPerm = ");
                    sb.append(this.s);
                } else {
                    i |= 1024;
                }
            }
            if (this.c == null) {
                return;
            }
            this.b.listen(this.c, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int q() {
        fa e = e();
        if (e != null) {
            return e.l;
        }
        return 0;
    }

    private CellLocation r() {
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                this.g = null;
                return cellLocation;
            } catch (SecurityException e) {
                this.g = e.getMessage();
            } catch (Throwable th) {
                this.g = null;
                fr.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private boolean s() {
        return !this.e && fy.b() - this.n >= Constants.MAX_SESSION_IDLE_TIME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CellLocation t() {
        if (this.b == null) {
            return null;
        }
        return r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CellInfo> u() {
        List<CellInfo> list;
        try {
            if (fy.c() < 18 || this.b == null) {
                return null;
            }
            try {
                list = this.b.getAllCellInfo();
            } catch (SecurityException e) {
                e = e;
                list = null;
            }
            try {
                this.g = null;
            } catch (SecurityException e2) {
                e = e2;
                this.g = e.getMessage();
                return list;
            }
            return list;
        } catch (Throwable th) {
            fr.a(th, "Cgi", "getNewCells");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<dz> a() {
        ea eaVar;
        eb ebVar;
        ArrayList arrayList = new ArrayList();
        List<CellInfo> allCellInfo = this.b.getAllCellInfo();
        if (Build.VERSION.SDK_INT >= 17 && allCellInfo != null) {
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo instanceof CellInfoCdma) {
                    CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                    CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                    ea eaVar2 = new ea(cellInfo.isRegistered(), true);
                    eaVar2.m = cellIdentity.getLatitude();
                    eaVar2.n = cellIdentity.getLongitude();
                    eaVar2.j = cellIdentity.getSystemId();
                    eaVar2.k = cellIdentity.getNetworkId();
                    eaVar2.l = cellIdentity.getBasestationId();
                    eaVar2.d = cellInfoCdma.getCellSignalStrength().getAsuLevel();
                    eaVar2.c = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                    eaVar = eaVar2;
                } else {
                    if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        eb ebVar2 = new eb(cellInfo.isRegistered(), true);
                        ebVar2.f7753a = String.valueOf(cellIdentity2.getMcc());
                        ebVar2.b = String.valueOf(cellIdentity2.getMnc());
                        ebVar2.j = cellIdentity2.getLac();
                        ebVar2.k = cellIdentity2.getCid();
                        ebVar2.c = cellInfoGsm.getCellSignalStrength().getDbm();
                        ebVar2.d = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                        ebVar = ebVar2;
                        if (Build.VERSION.SDK_INT >= 24) {
                            ebVar2.m = cellIdentity2.getArfcn();
                            ebVar2.n = cellIdentity2.getBsic();
                            ebVar = ebVar2;
                        }
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        ec ecVar = new ec(cellInfo.isRegistered());
                        ecVar.f7753a = String.valueOf(cellIdentity3.getMcc());
                        ecVar.b = String.valueOf(cellIdentity3.getMnc());
                        ecVar.l = cellIdentity3.getPci();
                        ecVar.d = cellInfoLte.getCellSignalStrength().getAsuLevel();
                        ecVar.k = cellIdentity3.getCi();
                        ecVar.j = cellIdentity3.getTac();
                        ecVar.n = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                        ecVar.c = cellInfoLte.getCellSignalStrength().getDbm();
                        eaVar = ecVar;
                        if (Build.VERSION.SDK_INT >= 24) {
                            ecVar.m = cellIdentity3.getEarfcn();
                            eaVar = ecVar;
                        }
                    } else if (Build.VERSION.SDK_INT >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                        ed edVar = new ed(cellInfo.isRegistered(), true);
                        edVar.f7753a = String.valueOf(cellIdentity4.getMcc());
                        edVar.b = String.valueOf(cellIdentity4.getMnc());
                        edVar.j = cellIdentity4.getLac();
                        edVar.k = cellIdentity4.getCid();
                        edVar.l = cellIdentity4.getPsc();
                        edVar.d = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                        edVar.c = cellInfoWcdma.getCellSignalStrength().getDbm();
                        ebVar = edVar;
                        if (Build.VERSION.SDK_INT >= 24) {
                            edVar.m = cellIdentity4.getUarfcn();
                            ebVar = edVar;
                        }
                    }
                    arrayList.add(ebVar);
                }
                arrayList.add(eaVar);
            }
        }
        return arrayList;
    }

    public final void a(es esVar) {
        this.u = esVar;
    }

    final synchronized void a(List<CellInfo> list) {
        if (this.l != null) {
            this.l.clear();
        }
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                CellInfo cellInfo = list.get(i);
                if (cellInfo != null) {
                    fa faVar = null;
                    boolean isRegistered = cellInfo.isRegistered();
                    if (cellInfo instanceof CellInfoCdma) {
                        faVar = a((CellInfoCdma) cellInfo, isRegistered);
                    } else if (cellInfo instanceof CellInfoGsm) {
                        faVar = a((CellInfoGsm) cellInfo, isRegistered);
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        faVar = a((CellInfoWcdma) cellInfo, isRegistered);
                    } else if (cellInfo instanceof CellInfoLte) {
                        faVar = a((CellInfoLte) cellInfo, isRegistered);
                    } else if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
                        faVar = a((CellInfoNr) cellInfo, isRegistered);
                    }
                    if (faVar != null) {
                        this.m.a((ez) faVar);
                        faVar.m = (short) Math.min(65535L, this.m.e((ez) faVar));
                        faVar.r = true;
                        this.l.add(faVar);
                    }
                }
            }
            this.i = false;
            if (this.l != null && this.l.size() > 0) {
                this.i = true;
            }
        }
    }

    public final void a(boolean z) {
        PhoneStateListener phoneStateListener;
        this.m.a(z);
        this.n = 0L;
        synchronized (this.p) {
            this.o = true;
        }
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null && (phoneStateListener = this.c) != null) {
            try {
                telephonyManager.listen(phoneStateListener, 0);
            } catch (Throwable th) {
                fr.a(th, "CgiManager", "destroy");
            }
        }
        this.c = null;
        this.d = null;
        this.b = null;
    }

    public final void a(boolean z, boolean z2) {
        try {
            this.e = fy.a(this.h);
            if (s()) {
                b(z, z2);
                a(t());
                a(u());
            }
            if (!this.e) {
                return;
            }
            j();
        } catch (SecurityException e) {
            this.g = e.getMessage();
        } catch (Throwable th) {
            fr.a(th, "CgiManager", "refresh");
        }
    }

    public final void b() {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            String str = this.h.checkSelfPermission(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) == 0 ? "hasFineLocPerm" : "hasNoFineLocPerm";
            String str2 = this.h.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0 ? "hasReadPhoneStatePerm" : "hasNoReadPhoneStatePerm";
            if (!StringUtils.isEmpty(this.t) && !this.t.equals(str)) {
                z = true;
            }
            if (!StringUtils.isEmpty(this.s) && !this.s.equals(str2)) {
                z = true;
            }
            if (!z) {
                return;
            }
            p();
        } catch (Throwable unused) {
        }
    }

    public final synchronized ArrayList<fa> c() {
        ArrayList<fa> arrayList;
        arrayList = new ArrayList<>();
        if (this.f7783a != null) {
            Iterator<fa> it = this.f7783a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList<fa> d() {
        ArrayList<fa> arrayList;
        arrayList = new ArrayList<>();
        if (this.l != null) {
            Iterator<fa> it = this.l.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().clone());
            }
        }
        return arrayList;
    }

    public final synchronized fa e() {
        if (this.e) {
            return null;
        }
        ArrayList<fa> arrayList = this.f7783a;
        if (arrayList.size() <= 0) {
            return null;
        }
        return arrayList.get(0).clone();
    }

    public final synchronized fa f() {
        if (this.e) {
            return null;
        }
        ArrayList<fa> arrayList = this.l;
        if (arrayList.size() <= 0) {
            return null;
        }
        Iterator<fa> it = arrayList.iterator();
        while (it.hasNext()) {
            fa next = it.next();
            if (next.n) {
                return next.clone();
            }
        }
        return arrayList.get(0).clone();
    }

    public final int g() {
        int i = 0;
        int q = q() | (this.i ? 4 : 0);
        if (this.j) {
            i = 8;
        }
        return q | i;
    }

    public final int h() {
        return q() & 3;
    }

    public final TelephonyManager i() {
        return this.b;
    }

    final synchronized void j() {
        this.g = null;
        this.f7783a.clear();
        this.l.clear();
        this.i = false;
        this.j = false;
    }

    public final String k() {
        return this.g;
    }

    public final String l() {
        return this.k;
    }

    public final synchronized String m() {
        if (this.e) {
            j();
        }
        if (this.f == null) {
            this.f = new StringBuilder();
        } else {
            this.f.delete(0, this.f.length());
        }
        if (h() == 1) {
            for (int i = 1; i < this.f7783a.size(); i++) {
                StringBuilder sb = this.f;
                sb.append("#");
                sb.append(this.f7783a.get(i).b);
                StringBuilder sb2 = this.f;
                sb2.append("|");
                sb2.append(this.f7783a.get(i).c);
                StringBuilder sb3 = this.f;
                sb3.append("|");
                sb3.append(this.f7783a.get(i).d);
            }
        }
        for (int i2 = 1; i2 < this.l.size(); i2++) {
            fa faVar = this.l.get(i2);
            if (faVar.l != 1 && faVar.l != 3 && faVar.l != 4 && faVar.l != 5) {
                if (faVar.l == 2) {
                    StringBuilder sb4 = this.f;
                    sb4.append("#");
                    sb4.append(faVar.l);
                    StringBuilder sb5 = this.f;
                    sb5.append("|");
                    sb5.append(faVar.f7782a);
                    StringBuilder sb6 = this.f;
                    sb6.append("|");
                    sb6.append(faVar.h);
                    StringBuilder sb7 = this.f;
                    sb7.append("|");
                    sb7.append(faVar.i);
                    StringBuilder sb8 = this.f;
                    sb8.append("|");
                    sb8.append(faVar.j);
                }
            }
            StringBuilder sb9 = this.f;
            sb9.append("#");
            sb9.append(faVar.l);
            StringBuilder sb10 = this.f;
            sb10.append("|");
            sb10.append(faVar.f7782a);
            StringBuilder sb11 = this.f;
            sb11.append("|");
            sb11.append(faVar.b);
            StringBuilder sb12 = this.f;
            sb12.append("|");
            sb12.append(faVar.c);
            StringBuilder sb13 = this.f;
            sb13.append("|");
            sb13.append(faVar.a());
        }
        if (this.f.length() > 0) {
            this.f.deleteCharAt(0);
        }
        return this.f.toString();
    }

    public final boolean n() {
        try {
            if (this.b != null) {
                if (!StringUtils.isEmpty(this.b.getSimOperator())) {
                    return true;
                }
                if (!StringUtils.isEmpty(this.b.getSimCountryIso())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            int a2 = fy.a(fy.c(this.h));
            return a2 == 0 || a2 == 4 || a2 == 2 || a2 == 5 || a2 == 3;
        } catch (Throwable unused2) {
            return false;
        }
    }
}
