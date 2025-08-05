package com.taobao.detail.domain.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class Area implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String areaId;
    private List<Area> areas;
    private String name;

    static {
        kge.a(1796028427);
        kge.a(1028243835);
    }

    public Area() {
    }

    public Area(String str, String str2) {
        this.name = str;
        this.areaId = str2;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public String getAreaId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("20641c3b", new Object[]{this}) : this.areaId;
    }

    public void setAreaId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc9589b", new Object[]{this, str});
        } else {
            this.areaId = str;
        }
    }

    public List<Area> getAreas() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3b48b510", new Object[]{this}) : this.areas;
    }

    public void setAreas(List<Area> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52545bbc", new Object[]{this, list});
        } else {
            this.areas = list;
        }
    }

    public void addSubArea(Area area) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761c5357", new Object[]{this, area});
            return;
        }
        if (getAreas() == null) {
            this.areas = new ArrayList();
        }
        this.areas.add(area);
    }
}
