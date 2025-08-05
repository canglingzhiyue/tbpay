package com.taobao.message.chatv2.viewcenter.monitor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class WhiteMonitorResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final double monitorCountRate;
    private final double monitorErrorRate;
    private int totalChildViewCount;
    private int totalViewCount;
    private int validChildViewCount;
    private List<WhiteMonitorError> errors = new ArrayList();
    private List<String> contentList = new ArrayList();

    static {
        kge.a(1301921048);
    }

    public WhiteMonitorResult(String str) {
        String value = ConfigUtil.getValue("tb_message_stable_probe", "white_space_element_rate", "{\"default\":50}");
        String value2 = ConfigUtil.getValue("tb_message_stable_probe", "white_space_error_rate", "{\"default\":20}");
        JSONObject parseObject = JSONObject.parseObject(value);
        JSONObject parseObject2 = JSONObject.parseObject(value2);
        if (parseObject.containsKey(str)) {
            this.monitorCountRate = parseObject.getDoubleValue(str);
        } else {
            this.monitorCountRate = parseObject.getDoubleValue("default");
        }
        if (parseObject2.containsKey(str)) {
            this.monitorErrorRate = parseObject2.getDoubleValue(str);
        } else {
            this.monitorErrorRate = parseObject2.getDoubleValue("default");
        }
    }

    public void addValidChildView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534e89cd", new Object[]{this});
            return;
        }
        this.validChildViewCount++;
        this.totalChildViewCount++;
        this.totalViewCount++;
    }

    public void addValidContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218e9c2f", new Object[]{this, str});
        } else {
            this.contentList.add(str);
        }
    }

    public void addValidViewGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237f5a46", new Object[]{this});
        } else {
            this.totalViewCount++;
        }
    }

    public void addChildViewError(WhiteMonitorError whiteMonitorError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a23a211", new Object[]{this, whiteMonitorError});
            return;
        }
        this.errors.add(whiteMonitorError);
        this.totalViewCount++;
        this.totalChildViewCount++;
    }

    public void addViewGroupError(WhiteMonitorError whiteMonitorError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8827d38", new Object[]{this, whiteMonitorError});
            return;
        }
        this.errors.add(whiteMonitorError);
        this.totalViewCount++;
    }

    public boolean hasError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue() : ((double) this.validChildViewCount) / ((double) this.totalChildViewCount) < this.monitorCountRate / 100.0d || ((double) this.errors.size()) / ((double) this.totalViewCount) > this.monitorErrorRate / 100.0d;
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : ((double) this.validChildViewCount) / ((double) this.totalChildViewCount) < this.monitorCountRate / 100.0d ? "101" : "102";
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        if (this.validChildViewCount / this.totalChildViewCount < this.monitorCountRate / 100.0d) {
            return "元素数过少:" + this.validChildViewCount;
        }
        return "可见区域过少:" + (this.errors.size() / this.totalViewCount);
    }

    public Object getErrorDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46d21228", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        for (WhiteMonitorError whiteMonitorError : this.errors) {
            jSONArray.add(JSONObject.toJSON(whiteMonitorError));
        }
        return jSONArray;
    }

    public List<String> getContentList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87a839bf", new Object[]{this}) : this.contentList;
    }
}
