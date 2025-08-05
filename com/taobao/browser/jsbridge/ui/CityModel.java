package com.taobao.browser.jsbridge.ui;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class CityModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private String CityId;
    private String CityName;
    private String Latitude;
    private String Longitude;
    private String NameSort;

    static {
        kge.a(-1115328890);
        kge.a(1028243835);
    }

    public String getCityName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec11d66d", new Object[]{this}) : this.CityName;
    }

    public void setCityName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210651a9", new Object[]{this, str});
        } else {
            this.CityName = str;
        }
    }

    public String getNameSort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("279bb81a", new Object[]{this}) : this.NameSort;
    }

    public void setNameSort(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b8a59c", new Object[]{this, str});
        } else {
            this.NameSort = str;
        }
    }

    public String getCityId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e15c399d", new Object[]{this}) : this.CityId;
    }

    public void setCityId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d4e779", new Object[]{this, str});
        } else {
            this.CityId = str;
        }
    }

    public String getLongitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16d079a0", new Object[]{this}) : this.Longitude;
    }

    public void setLongitude(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457c763e", new Object[]{this, str});
        } else {
            this.Longitude = str;
        }
    }

    public String getLatitude() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f4fa657", new Object[]{this}) : this.Latitude;
    }

    public void setLatitude(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5827eff", new Object[]{this, str});
        } else {
            this.Latitude = str;
        }
    }
}
