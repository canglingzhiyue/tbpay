package com.taobao.android.searchbaseframe.datasource.impl.cell;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.xsl.section.h;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseCellBean extends BaseTypedBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.meta.data.a combo;
    public int comboIndex;
    public int comboRealIndex;
    public String comboType;
    public String[] curItemIds;
    public String[] curP4pIds;
    public Map<String, Object> extraStatus;
    public boolean forceUpdate;
    public boolean isDynamicLandP4p;
    public boolean isP4p;
    public String itemId;
    public h ownedSectionStyle;
    public int pageNo = 0;
    public int pagePos = 0;
    public int pageSize = 0;
    public int originPageNo = -1;
    public int originPagePos = -1;
    public int originPageSize = -1;
    public int sectionPos = -1;
    public int nextSectionPos = -1;
    public boolean isSection = false;
    public int clipHeight = 0;
    public boolean barrier = false;
    public boolean isFullspan = false;
    public boolean comboFullSpan = false;
    public boolean isExposed = false;

    static {
        kge.a(600305533);
    }

    public void copyCellData(BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a883e99a", new Object[]{this, baseCellBean});
        }
    }

    public int getOriginPageNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1396c66", new Object[]{this})).intValue() : this.originPageNo;
    }

    public void setOriginPageNo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118aa164", new Object[]{this, new Integer(i)});
        } else if (this.originPageNo >= 0) {
        } else {
            this.originPageNo = i;
        }
    }

    public int getOriginPagePos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a38f9f83", new Object[]{this})).intValue() : this.originPagePos;
    }

    public void setOriginPagePos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6590477f", new Object[]{this, new Integer(i)});
        } else if (this.originPagePos >= 0) {
        } else {
            this.originPagePos = i;
        }
    }

    public int getOriginPageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d79e1fe6", new Object[]{this})).intValue() : this.originPageSize;
    }

    public void setOriginPageSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6b10e4", new Object[]{this, new Integer(i)});
        } else if (this.originPageSize >= 0) {
        } else {
            this.originPageSize = i;
        }
    }

    public boolean isSectionClip() {
        h hVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f8a9f56", new Object[]{this})).booleanValue() : this.isSection && (hVar = this.ownedSectionStyle) != null && hVar.e();
    }

    /* renamed from: copyCellBean */
    public <T extends BaseCellBean> T mo1014copyCellBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8656331a", new Object[]{this}) : (T) new BaseCellBean();
    }

    /* renamed from: copy */
    public <T extends BaseCellBean> T mo1013copy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cd22362c", new Object[]{this});
        }
        T t = (T) mo1014copyCellBean();
        t.pageNo = this.pageNo;
        t.pagePos = this.pagePos;
        t.pageSize = this.pageSize;
        t.originPageNo = this.originPageNo;
        t.originPagePos = this.originPagePos;
        t.originPageSize = this.originPageSize;
        t.isP4p = this.isP4p;
        t.isDynamicLandP4p = this.isDynamicLandP4p;
        t.itemId = this.itemId;
        t.curItemIds = this.curItemIds;
        t.curP4pIds = this.curP4pIds;
        t.isSection = this.isSection;
        t.isFullspan = this.isFullspan;
        t.comboFullSpan = this.comboFullSpan;
        t.isExposed = this.isExposed;
        t.type = this.type;
        t.rn = this.rn;
        t.abtest = this.abtest;
        t.pageType = this.pageType;
        t.clickTrace = this.clickTrace;
        t.cardType = this.cardType;
        h hVar = this.ownedSectionStyle;
        if (hVar != null) {
            t.ownedSectionStyle = hVar.g();
        }
        Map<String, Object> map = this.extraStatus;
        if (map != null) {
            t.extraStatus = new HashMap(map);
        }
        t.combo = this.combo;
        return t;
    }
}
