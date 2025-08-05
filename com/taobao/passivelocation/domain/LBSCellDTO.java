package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class LBSCellDTO implements Comparable<LBSCellDTO>, IMTOPDataObject {
    private Integer baseStationId;
    private Integer cellId;
    private Integer lac;
    private Integer networkId;
    private Short rssi;
    private Integer systemId;

    static {
        kge.a(701373349);
        kge.a(415966670);
        kge.a(-350052935);
    }

    public Integer getCellId() {
        return this.cellId;
    }

    public void setCellId(Integer num) {
        this.cellId = num;
    }

    public Integer getLac() {
        return this.lac;
    }

    public void setLac(Integer num) {
        this.lac = num;
    }

    public Short getRssi() {
        return this.rssi;
    }

    public void setRssi(Short sh) {
        this.rssi = sh;
    }

    public Integer getBaseStationId() {
        return this.baseStationId;
    }

    public void setBaseStationId(Integer num) {
        this.baseStationId = num;
    }

    public Integer getNetworkId() {
        return this.networkId;
    }

    public void setNetworkId(Integer num) {
        this.networkId = num;
    }

    public Integer getSystemId() {
        return this.systemId;
    }

    public void setSystemId(Integer num) {
        this.systemId = num;
    }

    @Override // java.lang.Comparable
    public int compareTo(LBSCellDTO lBSCellDTO) {
        if (lBSCellDTO == null) {
            return -1;
        }
        if (lBSCellDTO.getCellId() != null && getCellId() != null && lBSCellDTO.getCellId().longValue() == getCellId().longValue()) {
            return 0;
        }
        if (lBSCellDTO.getBaseStationId() != null && getBaseStationId() != null && lBSCellDTO.getBaseStationId().longValue() == getBaseStationId().longValue()) {
            return 0;
        }
        return (lBSCellDTO.getCellId() == null && lBSCellDTO.getBaseStationId() == null && getCellId() == null && getBaseStationId() == null) ? 0 : -1;
    }
}
