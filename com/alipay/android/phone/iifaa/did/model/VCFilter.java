package com.alipay.android.phone.iifaa.did.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class VCFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String desc;
    public String isNeedAudited;
    public String issuer;
    public List<VCItem> items;
    public List<String> type;

    /* loaded from: classes3.dex */
    public static class VCItem {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String desc;
        public String key;
        public List<String> valueFilter;

        public String getDesc() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this}) : this.desc;
        }

        public String getKey() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
        }

        public List<String> getValueFilter() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bc7d60ed", new Object[]{this}) : this.valueFilter;
        }

        public void setDesc(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb9c4864", new Object[]{this, str});
            } else {
                this.desc = str;
            }
        }

        public void setKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
            } else {
                this.key = str;
            }
        }

        public void setValueFilter(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b66047f", new Object[]{this, list});
            } else {
                this.valueFilter = list;
            }
        }
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this}) : this.desc;
    }

    public String getIsNeedAudited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d27e875", new Object[]{this}) : this.isNeedAudited;
    }

    public String getIssuer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50464caa", new Object[]{this}) : this.issuer;
    }

    public List<VCItem> getItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this}) : this.items;
    }

    public List<String> getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8797d930", new Object[]{this}) : this.type;
    }

    public void setDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c4864", new Object[]{this, str});
        } else {
            this.desc = str;
        }
    }

    public void setIsNeedAudited(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c750809", new Object[]{this, str});
        } else {
            this.isNeedAudited = str;
        }
    }

    public void setIssuer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582d360c", new Object[]{this, str});
        } else {
            this.issuer = str;
        }
    }

    public void setItems(List<VCItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
        } else {
            this.items = list;
        }
    }

    public void setType(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ea2c34", new Object[]{this, list});
        } else {
            this.type = list;
        }
    }
}
