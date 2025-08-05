package com.taobao.android.tracker;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.util.TrackerType;
import com.taobao.android.tracker.util.c;
import com.taobao.android.tracker.util.f;
import com.taobao.android.tracker.util.h;
import com.taobao.android.tracker.util.i;
import tb.jiu;
import tb.jjb;
import tb.jjc;
import tb.jjj;
import tb.jjk;
import tb.jjl;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jjc f15577a;
    private jjb b = new jjb() { // from class: com.taobao.android.tracker.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jjb
        public void a(String str, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
                return;
            }
            try {
                com.taobao.android.tracker.util.a.a();
                String b = com.taobao.android.tracker.util.a.b(i.d(view));
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                com.taobao.android.tracker.util.a.a(com.taobao.android.tracker.util.a.a());
                long a2 = com.taobao.android.tracker.util.a.a();
                jjk jjkVar = null;
                jjj d = com.taobao.android.tracker.a.a().d();
                if (d != null) {
                    jjl b2 = d.b(b);
                    if (b2 == null) {
                        return;
                    }
                    jjkVar = d.a(b2, b, view, TrackerType.TrackerType_Click);
                }
                com.taobao.android.tracker.util.a.a(a2);
                if (jjkVar == null) {
                    return;
                }
                h.a(jjkVar);
            } catch (Exception e) {
                e.printStackTrace();
                jiu.a("catch_crash", "TrackerManager.onRealClick", "-999", e.getMessage());
            }
        }
    };

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(-582010945);
    }

    public void a(final Activity activity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
            return;
        }
        try {
            jjj d = com.taobao.android.tracker.a.a().d();
            if (d == null || !d.a()) {
                return;
            }
            d.a(str, new a() { // from class: com.taobao.android.tracker.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tracker.b.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    c.a("onUpdateConfigEnd");
                    Activity activity2 = activity;
                    if (activity2 == null) {
                        return;
                    }
                    b.this.c(activity2, str);
                    c.a("initCustomIntercept  end");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            jiu.a("catch_crash", "TrackerManager.init", "-999", e.getMessage());
        }
    }

    public void b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("635bd785", new Object[]{this, activity, str});
            return;
        }
        try {
            b(activity);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.obj = str;
            com.taobao.android.tracker.a.a().a("action_weex_uninit", obtain);
        } catch (Exception e) {
            jiu.a("catch_crash", "TrackerManager.unInit", "-999", e.getMessage());
            e.printStackTrace();
        }
    }

    public void c(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfc9a06", new Object[]{this, activity, str});
            return;
        }
        f.a("TrackerManager:initIntercept");
        if (this.f15577a != null) {
            return;
        }
        this.f15577a = new jjc();
        this.f15577a.a(this.b);
        this.f15577a.a(activity, str);
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        f.a("TrackerManager:unInitIntercept");
        jjc jjcVar = this.f15577a;
        if (jjcVar == null) {
            return;
        }
        jjcVar.a((jjb) null);
        this.f15577a.a(activity);
    }

    public static b a(Activity activity) {
        View c;
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("75754db3", new Object[]{activity});
        }
        if (activity != null && (c = c(activity)) != null && (tag = c.getTag(-1091013)) != null && (tag instanceof b)) {
            return (b) tag;
        }
        return null;
    }

    private static View c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23b6087e", new Object[]{activity});
        }
        if (activity == null) {
            return null;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            if (viewGroup == null) {
                return null;
            }
            return viewGroup;
        } catch (Exception e) {
            f.b(e.toString());
            return null;
        }
    }

    public static void a(Activity activity, b bVar) {
        View c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923de7d1", new Object[]{activity, bVar});
        } else if (activity == null || bVar == null || (c = c(activity)) == null) {
        } else {
            c.setTag(-1091013, bVar);
        }
    }
}
