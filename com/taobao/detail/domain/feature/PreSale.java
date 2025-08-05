package com.taobao.detail.domain.feature;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class PreSale implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Double depositPriceRatio;
    private List<PreSaleStepInfo> preSaleStepInfoList;
    public String showTime;
    private Integer type;
    private Boolean valid = true;

    static {
        kge.a(-1177403855);
        kge.a(1028243835);
    }

    public Boolean getValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("5cc00a", new Object[]{this}) : this.valid;
    }

    public void setValid(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acbb556c", new Object[]{this, bool});
        } else {
            this.valid = bool;
        }
    }

    public Integer getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("1fd3c39e", new Object[]{this}) : this.type;
    }

    public void setType(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99261054", new Object[]{this, num});
        } else {
            this.type = num;
        }
    }

    public List<PreSaleStepInfo> getPreSaleStepInfoList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a3683294", new Object[]{this}) : this.preSaleStepInfoList;
    }

    public void setPreSaleStepInfoList(List<PreSaleStepInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd16b3b8", new Object[]{this, list});
        } else {
            this.preSaleStepInfoList = list;
        }
    }

    public Double getDepositPriceRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Double) ipChange.ipc$dispatch("9ab36caf", new Object[]{this}) : this.depositPriceRatio;
    }

    public void setDepositPriceRatio(Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6a518f", new Object[]{this, d});
        } else {
            this.depositPriceRatio = d;
        }
    }

    /* loaded from: classes7.dex */
    public static class PreSaleStepInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String endTime;
        private String name;
        private String startTime;
        private Integer stepNo;

        static {
            kge.a(-1243981647);
            kge.a(1028243835);
        }

        public Integer getStepNo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("df6ef451", new Object[]{this}) : this.stepNo;
        }

        public void setStepNo(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("271be901", new Object[]{this, num});
            } else {
                this.stepNo = num;
            }
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

        public String getStartTime() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fef9d00", new Object[]{this}) : this.startTime;
        }

        public void setStartTime(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41bede", new Object[]{this, str});
            } else {
                this.startTime = str;
            }
        }

        public String getEndTime() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5b56827", new Object[]{this}) : this.endTime;
        }

        public void setEndTime(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7fb2597", new Object[]{this, str});
            } else {
                this.endTime = str;
            }
        }
    }
}
