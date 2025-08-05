package com.taobao.homepage.pop.model.pop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class PopConfig implements IPopConfig, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject bizParams;
    private List<String> deltaWhiteList;
    private boolean enablePopControl;
    private String fatigueStyle;
    private PopPoint point;
    private String scrollToSection;
    private int selectMaxCount;
    private int selectMinCount;
    private int showMaxCount;
    private String weexUrl;
    private int trigger = 1;
    private int popContentType = 1;
    private int hierarchy = 2;
    private String popHierarchyName = "home";
    private String requestType = "popDataDeltaRequest";
    private long showTimeMills = 0;
    private long refreshInterval = 1000;
    private int pointY = 1;
    private boolean sideslipHidden = true;
    private boolean tabSwitchHidden = true;
    private boolean pageSwitchHidden = true;
    private boolean popLayerHidden = true;
    private boolean interceptClick = true;
    private boolean forceUpdate = true;
    private boolean isPopMessage = false;

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getTrigger() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b12d84fc", new Object[]{this})).intValue() : this.trigger;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getPopContentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e94e51b2", new Object[]{this})).intValue() : this.popContentType;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getHierarchy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eed9b079", new Object[]{this})).intValue() : this.hierarchy;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public String getPopHierarchyName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eca1e514", new Object[]{this}) : this.popHierarchyName;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public String getRequestType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this}) : this.requestType;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public IPopPoint getPoint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopPoint) ipChange.ipc$dispatch("8f03fab", new Object[]{this}) : this.point;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public long getShowTimeMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bfd23d2", new Object[]{this})).longValue() : this.showTimeMills;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public long getRefreshInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8dd4d205", new Object[]{this})).longValue() : this.refreshInterval;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public List<String> getDeltaWhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9fc51a3b", new Object[]{this}) : this.deltaWhiteList;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getPointY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39450cb9", new Object[]{this})).intValue() : this.pointY;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isSideslipHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d5d3e76", new Object[]{this})).booleanValue() : this.sideslipHidden;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isTabSwitchHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9afc5fb4", new Object[]{this})).booleanValue() : this.tabSwitchHidden;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isPageSwitchHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("99bf1082", new Object[]{this})).booleanValue() : this.pageSwitchHidden;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isPopLayerHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("461dc99f", new Object[]{this})).booleanValue() : this.popLayerHidden;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public String getWeexUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this}) : this.weexUrl;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isForceUpdate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ebe9f95", new Object[]{this})).booleanValue() : this.forceUpdate;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isInterceptClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7745923b", new Object[]{this})).booleanValue() : this.interceptClick;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public JSONObject getBizParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("851967ea", new Object[]{this}) : this.bizParams;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public String getScrollToSection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f79abf2", new Object[]{this}) : this.scrollToSection;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getShowMaxCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("510a0418", new Object[]{this})).intValue() : this.showMaxCount;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getSelectMinCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ee47ce9", new Object[]{this})).intValue() : this.selectMinCount;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public int getSelectMaxCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("429d5217", new Object[]{this})).intValue() : this.selectMaxCount;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean isPopMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f88b9cb", new Object[]{this})).booleanValue() : this.isPopMessage;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public String getFatigueReportStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f37b0ed", new Object[]{this}) : this.fatigueStyle;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopConfig
    public boolean enablePopControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16698cba", new Object[]{this})).booleanValue() : this.enablePopControl;
    }

    public void setEnablePopControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9287419c", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePopControl = z;
        }
    }

    public void setFatigueStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7770ee3d", new Object[]{this, str});
        } else {
            this.fatigueStyle = str;
        }
    }

    public void setTrigger(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacc8a26", new Object[]{this, new Integer(i)});
        } else {
            this.trigger = i;
        }
    }

    public void setPopContentType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec11898", new Object[]{this, new Integer(i)});
        } else {
            this.popContentType = i;
        }
    }

    public void setHierarchy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4533b49", new Object[]{this, new Integer(i)});
        } else {
            this.hierarchy = i;
        }
    }

    public void setPopHierarchyName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3dd4be2", new Object[]{this, str});
        } else {
            this.popHierarchyName = str;
        }
    }

    public void setRequestType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88303f8", new Object[]{this, str});
        } else {
            this.requestType = str;
        }
    }

    public void setPoint(PopPoint popPoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40169df5", new Object[]{this, popPoint});
        } else {
            this.point = popPoint;
        }
    }

    public void setShowTimeMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad350b2", new Object[]{this, new Long(j)});
        } else {
            this.showTimeMills = j;
        }
    }

    public void setRefreshInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71915df", new Object[]{this, new Long(j)});
        } else {
            this.refreshInterval = j;
        }
    }

    public void setDeltaWhiteList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f762d89", new Object[]{this, list});
        } else {
            this.deltaWhiteList = list;
        }
    }

    public void setPointY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c27271", new Object[]{this, new Integer(i)});
        } else {
            this.pointY = i;
        }
    }

    public void setSideslipHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319c186a", new Object[]{this, new Boolean(z)});
        } else {
            this.sideslipHidden = z;
        }
    }

    public void setTabSwitchHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a2c5c", new Object[]{this, new Boolean(z)});
        } else {
            this.tabSwitchHidden = z;
        }
    }

    public void setPageSwitchHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309635de", new Object[]{this, new Boolean(z)});
        } else {
            this.pageSwitchHidden = z;
        }
    }

    public void setPopLayerHidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ecf261", new Object[]{this, new Boolean(z)});
        } else {
            this.popLayerHidden = z;
        }
    }

    public void setWeexUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bdac7d", new Object[]{this, str});
        } else {
            this.weexUrl = str;
        }
    }

    public void setInterceptClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94be3d45", new Object[]{this, new Boolean(z)});
        } else {
            this.interceptClick = z;
        }
    }

    public void setForceUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b02449b", new Object[]{this, new Boolean(z)});
        } else {
            this.forceUpdate = z;
        }
    }

    public void setBizParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e4f72", new Object[]{this, jSONObject});
        } else {
            this.bizParams = jSONObject;
        }
    }

    public void setScrollToSection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e3a72c", new Object[]{this, str});
        } else {
            this.scrollToSection = str;
        }
    }

    public void setShowMaxCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abccfff2", new Object[]{this, new Integer(i)});
        } else {
            this.showMaxCount = i;
        }
    }

    public void setSelectMinCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf05441", new Object[]{this, new Integer(i)});
        } else {
            this.selectMinCount = i;
        }
    }

    public void setSelectMaxCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5224d3", new Object[]{this, new Integer(i)});
        } else {
            this.selectMaxCount = i;
        }
    }

    public void setPopMessage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e022bb5", new Object[]{this, new Boolean(z)});
        } else {
            this.isPopMessage = z;
        }
    }
}
