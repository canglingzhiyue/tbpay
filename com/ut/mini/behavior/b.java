package com.ut.mini.behavior;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.h;
import com.ut.mini.i;
import java.util.Map;
import tb.apr;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f24081a = "";

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f24082a;

        static {
            kge.a(2031666808);
            f24082a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e01a4902", new Object[0]) : f24082a;
        }
    }

    static {
        kge.a(1643317157);
    }

    public static b getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3efdbd18", new Object[0]) : a.a();
    }

    public synchronized void beginScroll(String str, int i, int i2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcbbb1e", new Object[]{this, str, new Integer(i), new Integer(i2), map});
            return;
        }
        apr.b("UTScrollTracker", "beginScroll scrollKey", str, "scrollX", Integer.valueOf(i), "scrollY", Integer.valueOf(i2), "properties", map);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!StringUtils.isEmpty(this.f24081a)) {
            if (this.f24081a.equals(str)) {
                apr.c("UTScrollTracker", "repeat beginScroll", str);
                return;
            }
            a();
        }
        this.f24081a = str;
        h eventByKey = i.getInstance().getEventByKey(str);
        eventByKey.setEventId(UTEventId.SCROLL.getEventId());
        eventByKey.setPageName(str);
        eventByKey.setScrollPosition(i, i2);
        eventByKey.updateProperties(map);
        eventByKey.setToLog(false);
        i.getInstance().beginEvent(eventByKey);
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        apr.b("UTScrollTracker", "endScroll scrollKey", this.f24081a);
        if (StringUtils.isEmpty(this.f24081a)) {
            return;
        }
        i.getInstance().endEvent(i.getInstance().getEventByKey(this.f24081a));
        this.f24081a = "";
    }

    public synchronized void endScroll(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f82e39", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        apr.b("UTScrollTracker", "endScroll scrollKey", str, "scrollX", Integer.valueOf(i), "scrollY", Integer.valueOf(i2));
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!str.equals(this.f24081a)) {
            apr.c("UTScrollTracker", "miss beginScroll scrollKey", str);
            return;
        }
        h eventByKey = i.getInstance().getEventByKey(this.f24081a);
        eventByKey.setScrollPosition(i, i2);
        i.getInstance().endEvent(eventByKey);
        this.f24081a = "";
    }
}
