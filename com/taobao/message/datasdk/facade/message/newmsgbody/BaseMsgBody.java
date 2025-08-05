package com.taobao.message.datasdk.facade.message.newmsgbody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class BaseMsgBody implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseMsgBody";
    public static final String TEMPLATE_DYNAMIC_EXT = "templateDynamicData";
    public Map<String, Object> msgExt;
    public Map<String, Object> originData;

    static {
        kge.a(-627561527);
        kge.a(1028243835);
    }

    public BaseMsgBody(Map<String, Object> map) {
        this.originData = map;
    }

    public BaseMsgBody(Map<String, Object> map, Map<String, Object> map2) {
        this.originData = map;
        this.msgExt = map2;
    }

    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this}) : this.originData;
    }

    public Map<String, Object> getDynamicExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f40b05d4", new Object[]{this}) : getTemplateDynamicExt(this.msgExt);
    }

    public void setDynamicExt(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77412f91", new Object[]{this, str, obj});
        } else {
            setTemplateDynamicExt(this, str, obj);
        }
    }

    public Map<String, Object> getMsgExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cd9ce6d2", new Object[]{this}) : this.msgExt;
    }

    public void setMsgExt(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278df2fc", new Object[]{this, map});
        } else {
            this.msgExt = map;
        }
    }

    public Map<String, Object> getBodyExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1e15af25", new Object[]{this}) : (Map) this.originData.get("ext");
    }

    public static void setTemplateDynamicExt(BaseMsgBody baseMsgBody, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb967f1", new Object[]{baseMsgBody, str, obj});
            return;
        }
        if (baseMsgBody.getMsgExt() == null) {
            baseMsgBody.setMsgExt(new HashMap());
        }
        Map map = (Map) baseMsgBody.getMsgExt().get(TEMPLATE_DYNAMIC_EXT);
        if (map == null) {
            map = new HashMap();
            baseMsgBody.getMsgExt().put(TEMPLATE_DYNAMIC_EXT, map);
        }
        map.put(str, obj);
    }

    public static Map<String, Object> getTemplateDynamicExt(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b67e04a1", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        if (map.get(TEMPLATE_DYNAMIC_EXT) instanceof Map) {
            return (Map) map.get(TEMPLATE_DYNAMIC_EXT);
        }
        if (map.get(TEMPLATE_DYNAMIC_EXT) instanceof String) {
            try {
                return JSON.parseObject((String) map.get(TEMPLATE_DYNAMIC_EXT));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static List<GoodsInfo> getGoodsInfo(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d71c2557", new Object[]{map});
        }
        if (!map.containsKey("goods")) {
            return null;
        }
        try {
            return JSON.parseArray(((JSONArray) map.get("goods")).toJSONString(), GoodsInfo.class);
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("NewImageMsgBody", th.getMessage());
            return null;
        }
    }

    public static boolean hasGoodsInfo(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97762438", new Object[]{map})).booleanValue();
        }
        List<GoodsInfo> goodsInfo = getGoodsInfo(map);
        return map.containsKey("goods") && goodsInfo != null && goodsInfo.size() > 0;
    }
}
