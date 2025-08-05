package tb;

import android.app.Activity;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.Choreographer;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.g;
import com.taobao.android.tschedule.i;
import java.util.ArrayList;
import java.util.List;
import tb.jmb;

/* loaded from: classes6.dex */
public class jly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29620a = false;

    static {
        kge.a(1018556632);
    }

    public static /* synthetic */ boolean a(jly jlyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471a6f7", new Object[]{jlyVar, new Boolean(z)})).booleanValue();
        }
        jlyVar.f29620a = z;
        return z;
    }

    private List<String> a(String str) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        String a2 = jmh.a(str, "");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(a2) && (parseArray = JSONObject.parseArray(a2, String.class)) != null) {
            arrayList.addAll(parseArray);
        }
        return arrayList;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        try {
            if (!c()) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName();
            if (!TextUtils.equals(simpleName, "TBMainActivity") && !TextUtils.equals(simpleName, "Welcome")) {
                a(a(jmg.CONFIG_KEY_ACTIVITIES), simpleName);
            }
        } catch (Throwable th) {
            jkq.a("TS.IdleTrigger", "onActivityResumed(): resumePredict error", th);
        }
    }

    public void a(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d51079", new Object[]{this, fragmentManager, fragment});
            return;
        }
        try {
            if (!c()) {
                return;
            }
            a(a(jmg.CONFIG_KEY_FRAGMENTS), fragment.getClass().getSimpleName());
        } catch (Throwable th) {
            jkq.a("TS.IdleTrigger", "onActivityResumed(): resumePredict error", th);
        }
    }

    public void a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if (TextUtils.isEmpty(str) || !list.contains(str) || Build.VERSION.SDK_INT < 16) {
        } else {
            jmb jmbVar = new jmb();
            jmbVar.a(new jmb.a() { // from class: tb.jly.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jmb.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        i.b().a(new Runnable() { // from class: tb.jly.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    jly.this.b();
                                }
                            }
                        });
                    }
                }
            });
            Choreographer.getInstance().postFrameCallback(jmbVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f29620a || Build.VERSION.SDK_INT < 16) {
        } else {
            jmb jmbVar = new jmb();
            jmbVar.a(new jmb.a() { // from class: tb.jly.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jmb.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        List<String> c = g.c();
                        if (c != null && !c.isEmpty()) {
                            for (String str : c) {
                                if (TSchedule.preload("idle", str, new Object[0])) {
                                    jmc.a("downgrade", str, "1", "TSchedule", "reload_result", null);
                                } else {
                                    jmc.a("downgrade", str, "1", "TSchedule", "reload_result", null, "TS_RELOAD_EMPTY", "");
                                }
                                g.b(str);
                            }
                            jly.a(jly.this, false);
                            return;
                        }
                        jly.a(jly.this, false);
                    } catch (Throwable unused) {
                        jly.a(jly.this, false);
                    }
                }
            });
            Choreographer.getInstance().postFrameCallback(jmbVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!jkt.a().b() || !c()) {
        } else {
            jkq.a("TS.IdleTrigger", "已是闲时环境，开始触发闲时任务");
            i.b().a(new Runnable() { // from class: tb.jly.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        new jma().a();
                    }
                }
            });
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (jmi.a(e.b())) {
            return jmh.b(e.b());
        }
        return false;
    }
}
