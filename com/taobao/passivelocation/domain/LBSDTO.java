package com.taobao.passivelocation.domain;

import android.location.Location;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class LBSDTO implements Comparable<LBSDTO>, IMTOPDataObject {
    public static final Short CELL_TYPE_CDMA;
    public static final Short CELL_TYPE_GSM;
    public Integer accuracy;
    public String address;
    public Double altitude;
    public String area;
    public String areaCode;
    public Short cellMCC;
    public Short cellMNC;
    public Short cellNum;
    public Short cellType;
    public LBSCellDTO[] cells;
    public String city;
    public String cityCode;
    public short gatherType;
    public Boolean hasLocation;
    public Short iBeaconCount;
    public LBSIBeaconDTO[] iBeacons;
    public String imei;
    public String ip;
    public boolean isTimeOnly;
    public Double latitude;
    public Double longitude;
    public Long macAddr;
    public String province;
    public String provinceCode;
    public long time;
    public String utdid;
    public int version;
    public Boolean wifiConn;
    public Short wifiNum;
    public LBSWifiDTO[] wifis;

    static {
        kge.a(1949676647);
        kge.a(415966670);
        kge.a(-350052935);
        CELL_TYPE_GSM = (short) 0;
        CELL_TYPE_CDMA = (short) 1;
    }

    public void setGatherType(short s) {
        this.gatherType = s;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public String getUtdid() {
        return this.utdid;
    }

    public void setUtdId(String str) {
        this.utdid = str;
    }

    public int getVersion() {
        return this.version;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public boolean isTimeOnly() {
        return this.isTimeOnly;
    }

    public void setTimeOnly(boolean z) {
        this.isTimeOnly = z;
    }

    public Boolean getHasLocation() {
        return this.hasLocation;
    }

    public void setHasLocation(Boolean bool) {
        this.hasLocation = bool;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double d) {
        this.longitude = d;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double d) {
        this.latitude = d;
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(Integer num) {
        this.accuracy = num;
    }

    public Short getWifiNum() {
        return this.wifiNum;
    }

    public LBSWifiDTO[] getWifis() {
        return this.wifis;
    }

    public Short getCellNum() {
        return this.cellNum;
    }

    public void setCellNum(Short sh) {
        this.cellNum = sh;
    }

    public Short getCellMCC() {
        return this.cellMCC;
    }

    public void setCellMCC(Short sh) {
        this.cellMCC = sh;
    }

    public Short getCellMNC() {
        return this.cellMNC;
    }

    public void setCellMNC(Short sh) {
        this.cellMNC = sh;
    }

    public LBSCellDTO[] getCells() {
        return this.cells;
    }

    public void setCells(LBSCellDTO[] lBSCellDTOArr) {
        this.cells = lBSCellDTOArr;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public Short getCellType() {
        return this.cellType;
    }

    public void setCellType(Short sh) {
        this.cellType = sh;
    }

    public Boolean getWifiConn() {
        return this.wifiConn;
    }

    public void setWifiConn(Boolean bool) {
        this.wifiConn = bool;
    }

    public Long getMacAddr() {
        return this.macAddr;
    }

    public void setMacAddr(Long l) {
        this.macAddr = l;
    }

    public void setAltitude(Double d) {
        this.altitude = d;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(LBSDTO lbsdto) {
        boolean z;
        if (lbsdto == null) {
            return -1;
        }
        Short sh = this.wifiNum;
        boolean z2 = true;
        if (sh != null && sh.equals(lbsdto.wifiNum) && this.wifiNum.shortValue() != 0) {
            for (int i = 0; i < this.wifiNum.shortValue(); i++) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.wifiNum.shortValue()) {
                        z = false;
                        break;
                    } else if (lbsdto.wifis[i2].getMac().longValue() == this.wifis[i].getMac().longValue()) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    return -1;
                }
            }
        }
        Short sh2 = this.cellNum;
        if (sh2 != null && sh2.equals(lbsdto.cellNum) && this.cellNum.shortValue() != 0) {
            for (int i3 = 0; i3 < this.cellNum.shortValue(); i3++) {
                if (lbsdto.cells[i3].compareTo(this.cells[i3]) != 0) {
                    return -1;
                }
            }
        }
        Double d = lbsdto.latitude;
        if (d != null && lbsdto.longitude != null && this.latitude != null && this.longitude != null) {
            float[] fArr = new float[1];
            Location.distanceBetween(d.doubleValue(), lbsdto.longitude.doubleValue(), this.latitude.doubleValue(), this.longitude.doubleValue(), fArr);
            if (fArr[0] > 100.0f) {
                return -1;
            }
        } else {
            boolean z3 = lbsdto.latitude == null;
            if (this.latitude != null) {
                z2 = false;
            }
            if (!(z3 & z2)) {
                return -1;
            }
        }
        return 0;
    }
}
