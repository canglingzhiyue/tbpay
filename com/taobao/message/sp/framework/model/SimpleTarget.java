package com.taobao.message.sp.framework.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleTarget implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVALID_TARGET_TYPE = "-1";
    private static final long serialVersionUID = -6919461967497580385L;
    private String targetId;
    @JSONField(name = "type")
    private String targetType;

    static {
        kge.a(-1969450575);
        kge.a(1028243835);
    }

    public SimpleTarget() {
    }

    private SimpleTarget(String str, String str2) {
        this.targetId = str;
        this.targetType = str2;
    }

    public String getTargetId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ee30c37", new Object[]{this}) : this.targetId;
    }

    public String getTargetType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b0a6938", new Object[]{this}) : this.targetType;
    }

    public void setTargetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385bd51f", new Object[]{this, str});
        } else {
            this.targetId = str;
        }
    }

    public void setTargetType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2c453e", new Object[]{this, str});
        } else {
            this.targetType = str;
        }
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.targetId);
    }

    public static SimpleTarget obtain(SimpleTarget simpleTarget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("7563b22a", new Object[]{simpleTarget}) : simpleTarget == null ? new SimpleTarget(null, "-1") : new SimpleTarget(simpleTarget.getTargetId(), simpleTarget.getTargetType());
    }

    public static SimpleTarget obtain(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("26fd03be", new Object[]{str}) : new SimpleTarget(str, "-1");
    }

    public static SimpleTarget obtain(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleTarget) ipChange.ipc$dispatch("f3deab34", new Object[]{str, str2}) : StringUtils.isEmpty(str) ? obtain(str2) : new SimpleTarget(str2, str);
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
            SimpleTarget simpleTarget = (SimpleTarget) obj;
            if (!StringUtils.isEmpty(this.targetId)) {
                if (StringUtils.equals(this.targetId, simpleTarget.getTargetId())) {
                    return !StringUtils.isEmpty(this.targetType) ? StringUtils.equals(this.targetType, simpleTarget.targetType) : StringUtils.isEmpty(simpleTarget.targetType);
                }
            } else if (StringUtils.isEmpty(simpleTarget.getTargetId())) {
                return !StringUtils.isEmpty(this.targetType) ? StringUtils.equals(this.targetType, simpleTarget.targetType) : StringUtils.isEmpty(simpleTarget.targetType);
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
        String str = this.targetId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.targetType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Target{targetId='" + this.targetId + "', targetType=" + this.targetType + '}';
    }
}
