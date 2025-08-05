package com.taobao.android.dinamicx.widget.scroller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1482336006);
    }

    public static View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a97f025", new Object[]{context, new Integer(i)});
        }
        if (i > 0) {
            return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        }
        return null;
    }
}
