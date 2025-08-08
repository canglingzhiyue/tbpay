package org.android.agoo.common;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class MsgDO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean agooFlag;
    public String body;
    public String dataId;
    public String errorCode;
    public int evokeAppStatus;
    public String extData;
    public String fromAppkey;
    public String fromPkg;
    public boolean isGlobalClick;
    public long lastActiveTime;
    public String messageSource;
    public String msgIds;
    public String msgStatus;
    public String notifyEnable;
    public String pack;
    public String removePacks;
    public String reportStr;
    public String type;
    public boolean isStartProc = false;
    public int triggerType = 0;
    public boolean isFromCache = false;

    /* loaded from: classes.dex */
    public interface EvokeStatus {
        public static final int ACTIVE_PULL_UP = 3;
        public static final int COLD_PULL_UP = 2;
        public static final int FG_PULL_UP = 1;
        public static final int FIRST_PULL_UP = 4;
    }

    static {
        kge.a(2098299494);
    }

    public String getMsgInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8318500", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msgIds", this.msgIds);
        hashMap.put(AgooConstants.MESSAGE_EXT, this.extData);
        hashMap.put(AgooConstants.MESSAGE_BODY, this.body);
        hashMap.put("dataId", this.dataId);
        hashMap.put("pack", this.pack);
        hashMap.put(SimpleMessageListData.SOURCE_NAME_MESSAGE, this.messageSource);
        if (!StringUtils.isEmpty(this.removePacks)) {
            hashMap.put("removePacks", this.removePacks);
        }
        if (!StringUtils.isEmpty(this.errorCode)) {
            hashMap.put("errorCode", this.errorCode);
        }
        if (!StringUtils.isEmpty(this.type)) {
            hashMap.put("type", this.type);
        }
        return new JSONObject(hashMap).toString();
    }
}
