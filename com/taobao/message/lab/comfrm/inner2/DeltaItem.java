package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public final class DeltaItem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CUSTOM_INPUT = 102;
    public static final int CUSTOM_RESOURCE = 101;
    public static final int LIST = 1;
    public static final int SIMPLE_MAP = 2;
    public static final int UNKNOW = 0;
    private Object dataChange;
    private int dataType;
    private Object reasons;

    static {
        kge.a(-413329494);
    }

    public DeltaItem(int i, Object obj) {
        this.dataType = i;
        this.dataChange = obj;
    }

    public DeltaItem(int i, Object obj, Object obj2) {
        this.dataType = i;
        this.dataChange = obj;
        this.reasons = obj2;
    }

    public int getDataType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87ac82f4", new Object[]{this})).intValue() : this.dataType;
    }

    public Object getDataChange() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8b24e79b", new Object[]{this}) : this.dataChange;
    }

    public Object getReasons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("938ed4b2", new Object[]{this}) : this.reasons;
    }
}
