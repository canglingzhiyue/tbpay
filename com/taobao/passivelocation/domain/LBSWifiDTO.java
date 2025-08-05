package com.taobao.passivelocation.domain;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class LBSWifiDTO implements Comparable<LBSWifiDTO>, IMTOPDataObject {
    private Long mac;
    private Short rssi;
    private String ssid;

    static {
        kge.a(1380463890);
        kge.a(415966670);
        kge.a(-350052935);
    }

    public String getSsid() {
        return this.ssid;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public Long getMac() {
        return this.mac;
    }

    public void setMac(Long l) {
        this.mac = l;
    }

    public Short getRssi() {
        return this.rssi;
    }

    public void setRssi(Short sh) {
        this.rssi = sh;
    }

    @Override // java.lang.Comparable
    public int compareTo(LBSWifiDTO lBSWifiDTO) {
        return (lBSWifiDTO == null || this.mac == null || lBSWifiDTO.getMac() == null || lBSWifiDTO.getMac().longValue() != this.mac.longValue()) ? -1 : 0;
    }
}
