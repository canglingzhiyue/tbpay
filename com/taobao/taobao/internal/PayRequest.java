package com.taobao.taobao.internal;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes8.dex */
public class PayRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALL_ALIPAY_SDK = "CALL_ALIPAY_SDK";
    public static final String CALL_WEIXIN_SDK = "CALL_WEIXIN_SDK";
    private static final String KEY_NUM_TRUE = "1";
    private static final String KEY_TRUE = "true";
    private String actionParams;
    private Map<String, String> extAttrMap;
    private String from;
    private String nextAction;
    private String orderIds;
    private String successUrl;
    private String unSuccessUrl;

    public String getNextAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a62e95a", new Object[]{this}) : this.nextAction;
    }

    public void setNextAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e3c95c", new Object[]{this, str});
        } else {
            this.nextAction = str;
        }
    }

    public String getActionParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80cd7067", new Object[]{this}) : this.actionParams;
    }

    public void setActionParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f10ef", new Object[]{this, str});
        } else {
            this.actionParams = str;
        }
    }

    public String getSuccessUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("267fbdd7", new Object[]{this}) : this.successUrl;
    }

    public void setSuccessUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2061847f", new Object[]{this, str});
        } else {
            this.successUrl = str;
        }
    }

    public String getOrderIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f5584f9", new Object[]{this}) : this.orderIds;
    }

    public void setOrderIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2638749d", new Object[]{this, str});
        } else {
            this.orderIds = str;
        }
    }

    public String getUnSuccessUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b72c97e", new Object[]{this}) : this.unSuccessUrl;
    }

    public void setUnSuccessUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7384dab8", new Object[]{this, str});
        } else {
            this.unSuccessUrl = str;
        }
    }

    public void setFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac98bd", new Object[]{this, str});
        } else {
            this.from = str;
        }
    }

    public String getFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this}) : this.from;
    }

    public Map<String, String> getExtAttrMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("852f9ebc", new Object[]{this}) : this.extAttrMap;
    }

    public void setExtAttrMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac8de52", new Object[]{this, map});
        } else {
            this.extAttrMap = map;
        }
    }

    public boolean isCallAlipaySDK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15ad6053", new Object[]{this})).booleanValue() : StringUtils.equals(this.nextAction, CALL_ALIPAY_SDK);
    }

    public boolean isCallWXSDK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f3ff3fc", new Object[]{this})).booleanValue() : StringUtils.equals(this.nextAction, CALL_WEIXIN_SDK);
    }

    public boolean isSingleTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9b41cee", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.extAttrMap;
        if (map == null) {
            return false;
        }
        String str = map.get(CashdeskConstants.KEY_SINGLE_TOP);
        return "true".equals(str) || "1".equals(str);
    }

    public boolean isNeedPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65c49d5c", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.extAttrMap;
        if (map == null) {
            return false;
        }
        String str = map.get(CashdeskConstants.KEY_NEED_POP);
        return "true".equals(str) || "1".equals(str);
    }
}
