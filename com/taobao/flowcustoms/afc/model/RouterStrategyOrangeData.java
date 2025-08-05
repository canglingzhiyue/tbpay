package com.taobao.flowcustoms.afc.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class RouterStrategyOrangeData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> bizCode;
    private List<H5urlBean> h5url;
    private List<Object> query;

    static {
        kge.a(-49646535);
        kge.a(1028243835);
    }

    /* loaded from: classes7.dex */
    public static class H5urlBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String host;
        private String path;
        private List<Object> query;

        static {
            kge.a(91859335);
            kge.a(1028243835);
        }

        public String getHost() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.host;
        }

        public void setHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
            } else {
                this.host = str;
            }
        }

        public String getPath() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this}) : this.path;
        }

        public void setPath(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("600486f8", new Object[]{this, str});
            } else {
                this.path = str;
            }
        }

        public List<Object> getQuery() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1de9c28e", new Object[]{this}) : this.query;
        }

        public void setQuery(List<Object> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3d4fdfe", new Object[]{this, list});
            } else {
                this.query = list;
            }
        }
    }

    public List<String> getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("10a1d936", new Object[]{this}) : this.bizCode;
    }

    public void setBizCode(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66b6f56", new Object[]{this, list});
        } else {
            this.bizCode = list;
        }
    }

    public List<Object> getQuery() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1de9c28e", new Object[]{this}) : this.query;
    }

    public void setQuery(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d4fdfe", new Object[]{this, list});
        } else {
            this.query = list;
        }
    }

    public List<H5urlBean> getH5url() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5a993394", new Object[]{this}) : this.h5url;
    }

    public void setH5url(List<H5urlBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d13adb8", new Object[]{this, list});
        } else {
            this.h5url = list;
        }
    }
}
