package com.taobao.android.detail.ttdetail.bizmessage;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class ShowLightOffMessage extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Source f10500a;
    private String b;
    private Rect c;

    /* loaded from: classes4.dex */
    public enum Source {
        MINI_VIDEO,
        VIDEO_COMPONENT,
        IMAGE_COMPONENT
    }

    static {
        kge.a(-387582391);
    }

    public ShowLightOffMessage(Source source, String str, Rect rect) {
        this.f10500a = source;
        this.b = str;
        this.c = rect;
    }

    public Source a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Source) ipChange.ipc$dispatch("d71bad67", new Object[]{this}) : this.f10500a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public Rect c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("61daa133", new Object[]{this}) : this.c;
    }
}
