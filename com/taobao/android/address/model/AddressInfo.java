package com.taobao.android.address.model;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class AddressInfo implements Serializable {
    public String addressId;
    public String area;
    public String areaDivisionCode;
    public String city;
    public String cityDivisionCode;
    public String detailText;
    public Map<String, String> extMap;
    public String lat;
    public String lng;
    public String province;
    public String provinceDivisionCode;
    public String town;
    public String townDivisionCode;
    public String type;
}
