package com.taobao.android.diagnose.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class NetInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String operator;
    private int status;
    private int type;

    static {
        kge.a(-1750563097);
    }

    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    public void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public String getOperator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5b77d1f", new Object[]{this}) : this.operator;
    }

    public void setOperator(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c158137", new Object[]{this, str});
        } else {
            this.operator = str;
        }
    }

    public NetInfo() {
        this(0, 0);
    }

    public NetInfo(int i, int i2) {
        this(i, i2, "");
    }

    public NetInfo(int i, int i2, String str) {
        this.status = i;
        this.type = i2;
        this.operator = str;
    }
}
