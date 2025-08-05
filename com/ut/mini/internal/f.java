package com.ut.mini.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.analytics.core.logbuilder.g;
import com.alibaba.analytics.core.sync.i;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.any;
import tb.apb;
import tb.apr;
import tb.aqb;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f24122a;
    private List<a> b = new ArrayList();

    /* loaded from: classes9.dex */
    public interface a {
        void onH5JSCall(Object obj, Map<String, String> map);
    }

    public void initialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0ba15b", new Object[]{this});
        }
    }

    static {
        kge.a(2072161673);
        f24122a = null;
    }

    public static synchronized f getInstance() {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("aeb4cd49", new Object[0]);
            }
            if (f24122a == null) {
                f24122a = new f();
            }
            return f24122a;
        }
    }

    public void turnOnRealTimeDebug(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee88af2", new Object[]{this, map});
            return;
        }
        apr.b("UTTeamWork", "", map.entrySet().toArray());
        UTAnalytics.getInstance().turnOnRealTimeDebug(map);
    }

    public void turnOffRealTimeDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f108167d", new Object[]{this});
            return;
        }
        apr.d();
        UTAnalytics.getInstance().turnOffRealTimeDebug();
    }

    public void dispatchLocalHits() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2516edf8", new Object[]{this});
        } else {
            UTAnalytics.getInstance().dispatchLocalHits();
        }
    }

    public void saveCacheDataToLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb3568", new Object[]{this});
        } else {
            UTAnalytics.getInstance().saveCacheDataToLocal();
        }
    }

    public void setToAliyunOsPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53712f", new Object[]{this});
        } else {
            UTAnalytics.getInstance().setToAliyunOsPlatform();
        }
    }

    public void closeAuto1010Track() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b3cd0d", new Object[]{this});
        } else {
            any.d().f();
        }
    }

    public String getUtsid() {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f70c80", new Object[]{this});
        }
        Context e = any.d().e();
        if (e == null) {
            return null;
        }
        try {
            c = AnalyticsMgr.c("session_timestamp");
        } catch (Exception e2) {
            apr.a("", e2, new Object[0]);
        }
        if (aqc.e(c)) {
            return null;
        }
        long parseLong = Long.parseLong(c);
        String c2 = any.d().c();
        String utdid = UTDevice.getUtdid(e);
        if (!aqc.e(c2) && !aqc.e(utdid)) {
            return utdid + "_" + c2 + "_" + parseLong;
        }
        return null;
    }

    public void setStaticHostPort4Tnet(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43c267c", new Object[]{this, context, str, new Integer(i)});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            aqb.a(context, apb.TAG_STATIC_TNET_HOST_PORT, str + ":" + i);
        }
    }

    public void clearStaticHostPort4Tnet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997944c8", new Object[]{this, context});
        } else if (context == null) {
        } else {
            aqb.a(context, apb.TAG_STATIC_TNET_HOST_PORT, null);
        }
    }

    public void setHostPort4Tnet(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d921d4ca", new Object[]{this, context, str, new Integer(i)});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            aqb.a(context, i.TAG_TNET_HOST_PORT, str + ":" + i);
        }
    }

    public void clearHostPort4Tnet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584f197a", new Object[]{this, context});
        } else if (context == null) {
        } else {
            aqb.a(context, i.TAG_TNET_HOST_PORT, null);
        }
    }

    public void setHostPort4TnetIpv6(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851b13d1", new Object[]{this, context, str, new Integer(i)});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            aqb.a(context, "utanalytics_tnet_host_port_ipv6", str + ":" + i);
        }
    }

    public void clearHostPort4TnetIpv6(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d05453", new Object[]{this, context});
        } else if (context == null) {
        } else {
            aqb.a(context, "utanalytics_tnet_host_port_ipv6", null);
        }
    }

    public void setHost4Https(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934df3ca", new Object[]{this, context, str});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            aqb.a(context, com.alibaba.analytics.core.sync.c.TAG_HTTPS_HOST_PORT, str);
        }
    }

    public void clearHost4Https(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c94db5", new Object[]{this, context});
        } else if (context == null) {
        } else {
            aqb.a(context, com.alibaba.analytics.core.sync.c.TAG_HTTPS_HOST_PORT, null);
        }
    }

    public void setHostPort4Http(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f331c79a", new Object[]{this, context, str});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            aqb.a(context, "http_host", str);
        }
    }

    public void clearHostPort4Http(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da44d5fb", new Object[]{this, context});
        } else if (context == null) {
        } else {
            aqb.a(context, "http_host", null);
        }
    }

    public void setHost4TimeAdjustService(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce1b19c", new Object[]{this, context, str});
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            aqb.a(context, g.TAG_TIME_ADJUST_HOST_PORT, str);
        }
    }

    public void clearHost4TimeAdjustService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9605487", new Object[]{this, context});
        } else if (context == null) {
        } else {
            aqb.a(context, g.TAG_TIME_ADJUST_HOST_PORT, null);
        }
    }

    public void registerExposureViewHandler(com.ut.mini.internal.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d42502c", new Object[]{this, aVar});
        } else {
            com.ut.mini.exposure.e.getInstance().registerExposureViewHandler(aVar);
        }
    }

    public void unRegisterExposureViewHandler(com.ut.mini.internal.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b76153", new Object[]{this, aVar});
        } else {
            com.ut.mini.exposure.e.getInstance().unRegisterExposureViewHandler(aVar);
        }
    }

    public com.ut.mini.internal.a getExposureViewHandler(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.ut.mini.internal.a) ipChange.ipc$dispatch("c620381f", new Object[]{this, activity}) : com.ut.mini.exposure.e.getInstance().getExposureViewHandle();
    }

    public void setExposureTagForWeex(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d290f2", new Object[]{this, view});
        } else {
            com.ut.mini.exposure.c.setExposureForWeex(view);
        }
    }

    public boolean startExpoTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34463e14", new Object[]{this, activity})).booleanValue() : com.ut.mini.exposure.e.getInstance().addToTrack(activity);
    }

    public boolean stopExpoTrack(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75ff5674", new Object[]{this, activity})).booleanValue() : com.ut.mini.exposure.e.getInstance().removeToTrack(activity);
    }

    public void setIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91698b5c", new Object[]{this, view});
        } else {
            com.ut.mini.exposure.c.setIgnoreTagForExposureView(view);
        }
    }

    public void clearIgnoreTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21db0a11", new Object[]{this, view});
        } else {
            com.ut.mini.exposure.c.clearIgnoreTagForExposureView(view);
        }
    }

    public void setViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f69018", new Object[]{this, view});
        } else {
            com.ut.mini.exposure.c.setViewGroupTagForExposureView(view);
        }
    }

    public void clearViewGroupTagForExposureView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7e9943", new Object[]{this, view});
        } else {
            com.ut.mini.exposure.c.clearViewGroupTagForExposureView(view);
        }
    }

    public void registerH5JSCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606b2ed", new Object[]{this, aVar});
        } else if (aVar == null || this.b.contains(aVar)) {
        } else {
            this.b.add(aVar);
        }
    }

    public void unRegisterH5JSCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca974566", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.remove(aVar);
        }
    }

    public void dispatchH5JSCall(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323f8454", new Object[]{this, obj, map});
            return;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.b.get(i).onH5JSCall(obj, map);
        }
    }
}
