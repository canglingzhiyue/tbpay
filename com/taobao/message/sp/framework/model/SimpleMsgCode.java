package com.taobao.message.sp.framework.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMsgCode implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static Map<String, Integer> linkIdMap = null;
    public static Map<String, Integer> onlyClientIdMap = null;
    private static final long serialVersionUID = 6915441367497580675L;
    private int cacheHashCode;
    private String clientId;
    private String messageId;

    static {
        kge.a(1958085870);
        kge.a(1028243835);
        onlyClientIdMap = new ConcurrentHashMap();
        linkIdMap = new ConcurrentHashMap();
    }

    public SimpleMsgCode() {
    }

    public SimpleMsgCode(String str) {
        this(str, null);
    }

    public SimpleMsgCode(String str, String str2) {
        this.messageId = str;
        this.clientId = str2;
        if (TextUtils.isEmpty(this.messageId) && !TextUtils.isEmpty(this.clientId)) {
            onlyClientIdMap.put(str2, 1);
        }
        if (!TextUtils.isEmpty(this.messageId) && !TextUtils.isEmpty(this.clientId) && onlyClientIdMap.containsKey(str2) && !linkIdMap.containsKey(str)) {
            linkIdMap.put(str, 0);
        }
        this.cacheHashCode = calcHashCode();
    }

    public String getMessageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this}) : this.messageId;
    }

    public void setMessageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68101fd1", new Object[]{this, str});
        } else {
            this.messageId = str;
        }
    }

    public String getClientId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67b6a8bd", new Object[]{this}) : this.clientId;
    }

    public boolean isNull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f04d5dc", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.messageId) && TextUtils.isEmpty(this.clientId);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SimpleMsgCode simpleMsgCode = (SimpleMsgCode) obj;
            if (TextUtils.isEmpty(this.messageId) || TextUtils.isEmpty(simpleMsgCode.messageId)) {
                if (TextUtils.isEmpty(this.clientId) && TextUtils.isEmpty(simpleMsgCode.clientId)) {
                    return true;
                }
                if (!TextUtils.isEmpty(this.clientId) && !TextUtils.isEmpty(simpleMsgCode.clientId) && this.clientId.equals(simpleMsgCode.clientId)) {
                    return true;
                }
            }
            if (!TextUtils.isEmpty(this.messageId) && !TextUtils.isEmpty(simpleMsgCode.messageId) && this.messageId.equals(simpleMsgCode.messageId)) {
                return true;
            }
        }
        return false;
    }

    private int calcHashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b3da20a", new Object[]{this})).intValue();
        }
        if (TextUtils.isEmpty(this.messageId)) {
            if (!TextUtils.isEmpty(this.clientId)) {
                return this.clientId.hashCode();
            }
            return 0;
        } else if (linkIdMap.containsKey(this.messageId)) {
            if (TextUtils.isEmpty(this.clientId)) {
                return linkIdMap.get(this.messageId).intValue();
            }
            int hashCode = this.clientId.hashCode();
            linkIdMap.put(this.messageId, Integer.valueOf(hashCode));
            return hashCode;
        } else {
            return this.messageId.hashCode();
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.cacheHashCode;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MsgCode{messageId='" + this.messageId + "', clientId='" + this.clientId + "'}";
    }

    public static SimpleMsgCode obtain(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMsgCode) ipChange.ipc$dispatch("544263c3", new Object[]{str, str2}) : new SimpleMsgCode(str, str2);
    }
}
