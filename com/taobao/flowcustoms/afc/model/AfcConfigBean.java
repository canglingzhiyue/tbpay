package com.taobao.flowcustoms.afc.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class AfcConfigBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> disableOptimizeLinks;
    private RouterRulesBean routerRules;
    private List<String> transferToAfcLinks;

    static {
        kge.a(-1729791893);
        kge.a(1028243835);
    }

    public RouterRulesBean getRouterRules() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RouterRulesBean) ipChange.ipc$dispatch("2b516e21", new Object[]{this}) : this.routerRules;
    }

    public void setRouterRules(RouterRulesBean routerRulesBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954732dd", new Object[]{this, routerRulesBean});
        } else {
            this.routerRules = routerRulesBean;
        }
    }

    public List<String> getTransferToAfcLinks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9c77b429", new Object[]{this}) : this.transferToAfcLinks;
    }

    public void setTransferToAfcLinks(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64baeb5b", new Object[]{this, list});
        } else {
            this.transferToAfcLinks = list;
        }
    }

    public List<String> getDisableOptimizeLinks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("691c1556", new Object[]{this}) : this.disableOptimizeLinks;
    }

    public void setDisableOptimizeLinks(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5431dcce", new Object[]{this, list});
        } else {
            this.disableOptimizeLinks = list;
        }
    }

    /* loaded from: classes7.dex */
    public static class RouterRulesBean implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<String> asyncRequestBlackList;
        private List<String> asyncRequestPathWhiteList;
        private List<String> bcFlsrc;
        private List<String> routerWhiteList;

        static {
            kge.a(-151104091);
            kge.a(1028243835);
        }

        public List<String> getRouterWhiteList() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89fee4f8", new Object[]{this}) : this.routerWhiteList;
        }

        public void setRouterWhiteList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("207727d4", new Object[]{this, list});
            } else {
                this.routerWhiteList = list;
            }
        }

        public List<String> getBcFlsrc() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a4513c19", new Object[]{this}) : this.bcFlsrc;
        }

        public void setBcFlsrc(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8a868d3", new Object[]{this, list});
            } else {
                this.bcFlsrc = list;
            }
        }

        public List<String> getAsyncRequestPathWhiteList() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("729310e7", new Object[]{this}) : this.asyncRequestPathWhiteList;
        }

        public void setAsyncRequestPathWhiteList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7008b8c5", new Object[]{this, list});
            } else {
                this.asyncRequestPathWhiteList = list;
            }
        }

        public List<String> getAsyncRequestBlackList() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("aad8ca0c", new Object[]{this}) : this.asyncRequestBlackList;
        }

        public void setAsyncRequestBlackList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0f7e40", new Object[]{this, list});
            } else {
                this.asyncRequestBlackList = list;
            }
        }
    }
}
