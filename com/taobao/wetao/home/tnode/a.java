package com.taobao.wetao.home.tnode;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        StringBuilder sb = new StringBuilder("https://h5.m.taobao.com/tnode/index.htm?tnode=");
        sb.append(Uri.encode("page_guangguang?preload=true&initDataKey=guangguang&hideNav=true&pageTrack=false"));
        sb.append("&tnodeTime=" + System.nanoTime());
        return sb.toString();
    }
}
