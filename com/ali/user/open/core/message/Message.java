package com.ali.user.open.core.message;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes2.dex */
public class Message implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int code;
    public String message;

    static {
        kge.a(-1904110929);
        kge.a(-723128125);
    }

    public static Message create(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("24968e45", new Object[]{new Integer(i), objArr}) : MessageUtils.createMessage(i, objArr);
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }
}
