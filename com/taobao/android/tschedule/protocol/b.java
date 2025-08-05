package com.taobao.android.tschedule.protocol;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleStatusService;
import com.taobao.android.tscheduleprotocol.MultiProcessScheduleProtocol;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.TScheduleHTTPProtocol;
import java.util.HashMap;
import java.util.Map;
import tb.jkq;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROTOCOL_BIZ_CODE_H5 = "h5";
    public static final String PROTOCOL_BIZ_CODE_MINIAPP = "miniApp";
    public static final String PROTOCOL_BIZ_CODE_PHA = "pha";
    public static final String PROTOCOL_TYPE_MULTI = "multiProcess";
    public static final String PROTOCOL_TYPE_RENDER = "render";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f15667a;
    private Map<String, String> b;
    private Map<String, RenderScheduleProtocol> c;
    private Map<String, MultiProcessScheduleProtocol> d;
    private TScheduleHTTPProtocol e;

    /* loaded from: classes6.dex */
    public static class a {
        public static final b instance;

        static {
            kge.a(884619446);
            instance = new b();
        }
    }

    static {
        kge.a(1905047011);
    }

    private b() {
        this.f15667a = new HashMap(4);
        this.b = new HashMap(4);
        this.c = new HashMap(4);
        this.d = new HashMap(4);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ef4ccb57", new Object[0]) : a.instance;
    }

    public synchronized RenderScheduleProtocol a(String str) {
        String str2;
        String str3;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RenderScheduleProtocol renderScheduleProtocol = this.c.get(str);
        if (renderScheduleProtocol == null) {
            String str4 = this.f15667a.get(str);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName(str4);
                if (cls != null) {
                    obj = cls.newInstance();
                }
                if (obj instanceof RenderScheduleProtocol) {
                    RenderScheduleProtocol renderScheduleProtocol2 = (RenderScheduleProtocol) obj;
                    try {
                        this.c.put(str, renderScheduleProtocol2);
                        renderScheduleProtocol = renderScheduleProtocol2;
                    } catch (Throwable th) {
                        th = th;
                        renderScheduleProtocol = renderScheduleProtocol2;
                        jkq.a("TS.protocol", "new instance error", th);
                        if (renderScheduleProtocol == null) {
                            this.f15667a.remove(str);
                            str2 = "TS.protocol";
                            str3 = "create render instance protocol faild, clear class";
                            jkq.a(str2, str3);
                        }
                        return renderScheduleProtocol;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (renderScheduleProtocol == null) {
                this.f15667a.remove(str);
                str2 = "TS.protocol";
                str3 = "create render instance protocol faild, clear class";
                jkq.a(str2, str3);
            }
        }
        return renderScheduleProtocol;
    }

    public synchronized MultiProcessScheduleProtocol b(String str) {
        String str2;
        String str3;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        MultiProcessScheduleProtocol multiProcessScheduleProtocol = this.d.get(str);
        if (multiProcessScheduleProtocol == null) {
            String str4 = this.b.get(str);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName(str4);
                if (cls != null) {
                    obj = cls.newInstance();
                }
                if (obj instanceof MultiProcessScheduleProtocol) {
                    MultiProcessScheduleProtocol multiProcessScheduleProtocol2 = (MultiProcessScheduleProtocol) obj;
                    try {
                        this.d.put(str, multiProcessScheduleProtocol2);
                        multiProcessScheduleProtocol = multiProcessScheduleProtocol2;
                    } catch (Throwable th) {
                        th = th;
                        multiProcessScheduleProtocol = multiProcessScheduleProtocol2;
                        jkq.a("TS.protocol", "new instance error", th);
                        if (multiProcessScheduleProtocol == null) {
                            this.b.remove(str);
                            str2 = "TS.protocol";
                            str3 = "create multiprocess instance faild, clear class";
                            jkq.a(str2, str3);
                        }
                        return multiProcessScheduleProtocol;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (multiProcessScheduleProtocol == null) {
                this.b.remove(str);
                str2 = "TS.protocol";
                str3 = "create multiprocess instance faild, clear class";
                jkq.a(str2, str3);
            }
        }
        return multiProcessScheduleProtocol;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(this.f15667a.get(str), str2)) {
        } else {
            this.f15667a.put(str, str2);
            this.c.remove(str);
            com.taobao.android.tschedule.protocol.a.a(str, str2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.c != null && !this.c.isEmpty()) {
                for (RenderScheduleProtocol renderScheduleProtocol : this.c.values()) {
                    renderScheduleProtocol.clearPreloadedInstances();
                }
            }
            TScheduleStatusService.c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.equals(this.b.get(str), str2)) {
        } else {
            this.b.put(str, str2);
            this.d.remove(str);
            com.taobao.android.tschedule.protocol.a.b(str, str2);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        this.f15667a.put(str, str2);
        this.c.remove(str);
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        this.b.put(str, str2);
        this.d.remove(str);
    }

    public synchronized TScheduleHTTPProtocol c() {
        if (this.e == null) {
            Class<?> cls = Class.forName("com.alibaba.triver.kit.alibaba.prefetch.HeaderGetter");
            if (cls == null) {
                return null;
            }
            Object newInstance = cls.newInstance();
            if (newInstance instanceof TScheduleHTTPProtocol) {
                this.e = (TScheduleHTTPProtocol) newInstance;
            }
        }
        return this.e;
    }
}
