package com.taobao.android.searchbaseframe.track;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class XSWeexRenderTrackEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERR_DEGRADE = 4;
    public static final int ERR_TEMPLATE = 3;
    public static final int ERR_WEEX_EXCEPTION = 2;
    public static final int SUCC_REFRESH = 1;
    public static final int SUCC_RENDER = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f15006a;
    public String b;
    public String c;
    public TemplateBean d;
    public String e;
    public String f;
    public double g;
    public boolean h = true;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface EventType {
    }

    static {
        kge.a(1111667507);
    }

    public static XSWeexRenderTrackEvent a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("5929f862", new Object[]{activity, str});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f15006a = 3;
        xSWeexRenderTrackEvent.b = str;
        a(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("bba6b0da", new Object[]{str, str2});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f15006a = 4;
        xSWeexRenderTrackEvent.b = str;
        xSWeexRenderTrackEvent.f = str2;
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent a(Activity activity, TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("45619326", new Object[]{activity, templateBean, str, str2});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f15006a = 2;
        xSWeexRenderTrackEvent.d = templateBean;
        xSWeexRenderTrackEvent.e = str;
        xSWeexRenderTrackEvent.f = str2;
        a(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent a(Activity activity, TemplateBean templateBean, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("a737c568", new Object[]{activity, templateBean, new Double(d)});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f15006a = 0;
        xSWeexRenderTrackEvent.d = templateBean;
        xSWeexRenderTrackEvent.g = d;
        a(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static XSWeexRenderTrackEvent b(Activity activity, TemplateBean templateBean, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSWeexRenderTrackEvent) ipChange.ipc$dispatch("bb49007", new Object[]{activity, templateBean, new Double(d)});
        }
        XSWeexRenderTrackEvent xSWeexRenderTrackEvent = new XSWeexRenderTrackEvent();
        xSWeexRenderTrackEvent.f15006a = 1;
        xSWeexRenderTrackEvent.d = templateBean;
        xSWeexRenderTrackEvent.g = d;
        a(activity, xSWeexRenderTrackEvent);
        return xSWeexRenderTrackEvent;
    }

    public static void a(Activity activity, XSWeexRenderTrackEvent xSWeexRenderTrackEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c1134", new Object[]{activity, xSWeexRenderTrackEvent});
            return;
        }
        try {
            Uri data = activity.getIntent().getData();
            xSWeexRenderTrackEvent.c = data == null ? "" : data.toString();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
