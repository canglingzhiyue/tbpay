package com.taobao.unit.center.mtop;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class UnitCenterLayoutInfoModel implements IMTOPDataObject {
    public List<String> appkey;
    public String downgrade;
    public String env;
    public String group;
    public String layoutData;
    public String layoutId;
    public int layoutType;
    public String nameSpace;
    public long updateTime;
    public int version;

    static {
        kge.a(139005011);
        kge.a(-350052935);
    }

    public String toString() {
        return "UnitCenterLayoutInfoModel{group='" + this.group + "', layoutData='" + this.layoutData + "', layoutId='" + this.layoutId + "', layoutType=" + this.layoutType + ", nameSpace='" + this.nameSpace + "', version=" + this.version + ", updateTime=" + this.updateTime + ", downgrade='" + this.downgrade + "', appkey=" + this.appkey + '}';
    }
}
