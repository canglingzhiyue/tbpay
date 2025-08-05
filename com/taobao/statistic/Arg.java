package com.taobao.statistic;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class Arg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object mArg1;
    private Object mArg2;
    private Object mArg3;
    private String[] mArgs;

    static {
        kge.a(83446180);
    }

    public Arg(Object obj, Object obj2, Object obj3, String... strArr) {
        this.mArg1 = obj;
        this.mArg2 = obj2;
        this.mArg3 = obj3;
        this.mArgs = strArr;
    }

    public Object getArg1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7e9a1d1a", new Object[]{this}) : this.mArg1;
    }

    public void setArg1(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1405d00", new Object[]{this, obj});
        } else {
            this.mArg1 = obj;
        }
    }

    public Object getArg2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("51fd7b9", new Object[]{this}) : this.mArg2;
    }

    public void setArg2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b71f641", new Object[]{this, obj});
        } else {
            this.mArg2 = obj;
        }
    }

    public Object getArg3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8ba59258", new Object[]{this}) : this.mArg3;
    }

    public void setArg3(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a38f82", new Object[]{this, obj});
        } else {
            this.mArg3 = obj;
        }
    }

    public String[] getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("53970da9", new Object[]{this}) : this.mArgs;
    }

    public void setArgs(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46751f9", new Object[]{this, strArr});
        } else {
            this.mArgs = strArr;
        }
    }
}
