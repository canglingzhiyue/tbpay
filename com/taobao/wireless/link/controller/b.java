package com.taobao.wireless.link.controller;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.MessageData;
import tb.kge;
import tb.rka;

/* loaded from: classes9.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(49929575);
    }

    public abstract void a(Context context, MessageData messageData);

    public static b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2720b8e6", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return com.taobao.wireless.link.notification.a.a();
        }
        return rka.a();
    }
}
