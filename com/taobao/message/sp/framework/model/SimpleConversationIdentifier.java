package com.taobao.message.sp.framework.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleConversationIdentifier implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bizType;
    private Map<String, Object> createContext = new HashMap();
    private String entityType;
    private SimpleTarget target;

    static {
        kge.a(1358347692);
        kge.a(1028243835);
    }

    public SimpleConversationIdentifier() {
    }

    public SimpleConversationIdentifier(SimpleTarget simpleTarget, String str, String str2) {
        this.target = simpleTarget;
        this.bizType = str;
        this.entityType = str2;
    }

    public SimpleTarget getTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("9c76a0a6", new Object[]{this}) : this.target;
    }

    public void setTarget(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480ce878", new Object[]{this, simpleTarget});
        } else {
            this.target = simpleTarget;
        }
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.bizType;
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    public String getEntityType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f36bd726", new Object[]{this}) : this.entityType;
    }

    public void setEntityType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f89510", new Object[]{this, str});
        } else {
            this.entityType = str;
        }
    }

    public Map<String, Object> getCreateContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1bedf699", new Object[]{this}) : this.createContext;
    }

    public void setCreateContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb80ad", new Object[]{this, map});
        } else {
            this.createContext = map;
        }
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
            SimpleConversationIdentifier simpleConversationIdentifier = (SimpleConversationIdentifier) obj;
            SimpleTarget simpleTarget = this.target;
            if (simpleTarget == null ? simpleConversationIdentifier.target != null : !simpleTarget.equals(simpleConversationIdentifier.target)) {
                return false;
            }
            String str = this.bizType;
            if (str != null) {
                if (str.equals(simpleConversationIdentifier.bizType)) {
                    String str2 = this.entityType;
                    return str2 != null ? str2.equals(simpleConversationIdentifier.entityType) : simpleConversationIdentifier.entityType == null;
                }
            } else if (simpleConversationIdentifier.bizType == null) {
                String str3 = this.entityType;
                if (str3 != null) {
                    return str3.equals(simpleConversationIdentifier.entityType);
                }
                if (simpleConversationIdentifier.entityType == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        SimpleTarget simpleTarget = this.target;
        int hashCode = (simpleTarget != null ? simpleTarget.hashCode() : 0) * 31;
        String str = this.bizType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.entityType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConversationIdentifier{target=" + this.target + ", bizType='" + this.bizType + "', entityType='" + this.entityType + "', createCtx=" + this.createContext + '}';
    }
}
