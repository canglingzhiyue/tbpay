package com.taobao.message.datasdk.facade.message.newmsgbody;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SystemMsgBody extends BaseMsgBody {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-540839701);
    }

    public SystemMsgBody(Map<String, Object> map) {
        super(map);
    }

    public String getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this}) : ValueUtil.getString(this.originData, "content");
    }

    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.originData.put("content", str);
        }
    }

    public String getTemplateContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81748630", new Object[]{this}) : ValueUtil.getString(this.originData, "templateContent");
    }

    public void setTemplateContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674414ae", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.originData.put("templateContent", str);
        }
    }

    public List<ActivePart> getActiveContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d007e8e3", new Object[]{this}) : getActiveContent(this.originData, "activeContent");
    }

    public void setActiveContent(List<ActivePart> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea5ee49", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.originData.put("activeContent", list);
        }
    }

    public static List<ActivePart> getActiveContent(Map<String, Object> map, String str) {
        String jSONString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3bcd313c", new Object[]{map, str});
        }
        if (map != null) {
            try {
                if (TextUtils.isEmpty(str) || !map.containsKey(str)) {
                    return null;
                }
                Object obj = map.get(str);
                if (List.class.isAssignableFrom(obj.getClass())) {
                    List list = (List) obj;
                    if (list.size() == 0) {
                        return null;
                    }
                    if (ActivePart.class.isAssignableFrom(list.get(0).getClass())) {
                        return (List) obj;
                    }
                }
                if (String.class.isAssignableFrom(obj.getClass())) {
                    jSONString = (String) obj;
                } else {
                    jSONString = JSON.toJSONString(obj);
                }
                return JSON.parseArray(jSONString, ActivePart.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
