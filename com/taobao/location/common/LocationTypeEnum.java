package com.taobao.location.common;

/* loaded from: classes7.dex */
public enum LocationTypeEnum {
    NOLOCATION(0),
    GDLOCATION(1),
    NoNetwork(2),
    WIFILOCATION(3),
    NLPLOCATION(4),
    MEMORYLOCATION(5),
    GPSLOCATION(6);
    
    int type;

    LocationTypeEnum(int i) {
        this.type = i;
    }

    public static LocationTypeEnum valueOfType(int i) {
        LocationTypeEnum[] values;
        for (LocationTypeEnum locationTypeEnum : values()) {
            if (locationTypeEnum.getType() == i) {
                return locationTypeEnum;
            }
        }
        return null;
    }

    public int getType() {
        return this.type;
    }
}
