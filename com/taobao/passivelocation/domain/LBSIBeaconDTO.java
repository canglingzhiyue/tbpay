package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class LBSIBeaconDTO implements Comparable<LBSIBeaconDTO>, IMTOPDataObject {
    public Short major;
    public Short minor;
    public Integer rssi;
    public String uuid;

    static {
        kge.a(1975881994);
        kge.a(415966670);
        kge.a(-350052935);
    }

    public String getUuid() {
        return this.uuid;
    }

    public Short getMajor() {
        return this.major;
    }

    public Short getMinor() {
        return this.minor;
    }

    public Integer getRssi() {
        return this.rssi;
    }

    @Override // java.lang.Comparable
    public int compareTo(LBSIBeaconDTO lBSIBeaconDTO) {
        Short sh;
        return (lBSIBeaconDTO == null || (sh = this.major) == null || lBSIBeaconDTO.major == null || sh.shortValue() != lBSIBeaconDTO.major.shortValue()) ? -1 : 0;
    }
}
