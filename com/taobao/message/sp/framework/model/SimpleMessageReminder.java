package com.taobao.message.sp.framework.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageReminder implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "remindBehavior")
    private int remindBehavior;
    @JSONField(name = "remindType")
    private int remindType;

    static {
        kge.a(716124537);
        kge.a(1028243835);
    }

    public SimpleMessageReminder() {
    }

    public SimpleMessageReminder(int i, int i2) {
        this.remindBehavior = i;
        this.remindType = i2;
    }

    public int getRemindBehavior() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb6f567", new Object[]{this})).intValue() : this.remindBehavior;
    }

    public void setRemindBehavior(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96ceb83", new Object[]{this, new Integer(i)});
        } else {
            this.remindBehavior = i;
        }
    }

    public int getRemindType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b34023cf", new Object[]{this})).intValue() : this.remindType;
    }

    public void setRemindType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9b641b", new Object[]{this, new Integer(i)});
        } else {
            this.remindType = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageReminder{remindBehavior=" + this.remindBehavior + ", remindType=" + this.remindType + '}';
    }
}
