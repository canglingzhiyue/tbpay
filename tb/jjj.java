package tb;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.b;
import com.taobao.android.tracker.util.TrackerType;
import com.taobao.android.tracker.util.a;
import com.taobao.android.tracker.util.g;
import com.taobao.android.tracker.util.i;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class jjj extends jjh implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "pageName";
    public static final String PAGE_URL = "url";
    public static final String SPM_A = "spmA";
    public static final String SPM_B = "spmB";
    public static final int TAG_DYNAMIC_TRACKER_VIEW_ENABLE_MATCH_KEY = -1091012;
    private Map<String, b.a> b = new HashMap();
    private Set<String> d = new HashSet();
    private Map<String, jjl> e = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public jix f29581a = new jiz();
    private jiv c = new jiv(Looper.getMainLooper());

    static {
        kge.a(-1033336496);
        kge.a(-587527200);
    }

    public static /* synthetic */ Object ipc$super(jjj jjjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(jjj jjjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4bf5b8", new Object[]{jjjVar, str});
        } else {
            jjjVar.d(str);
        }
    }

    @Override // tb.jjh
    public void a(jiy jiyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef76457e", new Object[]{this, jiyVar});
            return;
        }
        jix jixVar = this.f29581a;
        if (jixVar == null) {
            return;
        }
        jixVar.a();
        this.f29581a.a(jiyVar);
    }

    @Override // tb.jjh
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        jix jixVar = this.f29581a;
        if (jixVar == null) {
            return false;
        }
        return jixVar.b();
    }

    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else if (message == null || message.obj == null) {
        } else {
            String b = a.b(message.obj.toString());
            if (TextUtils.isEmpty(b)) {
                return;
            }
            a(b);
        }
    }

    public void a(String str, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795c762c", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str) || aVar == null) {
        } else {
            String b = a.b(str);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            this.b.put(b, aVar);
        }
    }

    private b.a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("910c6a5c", new Object[]{this, str});
        }
        Map<String, b.a> map = this.b;
        if (map != null && map.containsKey(str)) {
            return this.b.get(str);
        }
        return null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Map<String, b.a> map = this.b;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.b.remove(str);
    }

    public void b(String str, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b0cb6d", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str) || aVar == null) {
        } else {
            final String b = a.b(str);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            jjl b2 = b(b);
            if (b2 != null && b2.b() && b2.d()) {
                this.b.put(b, aVar);
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    d(b);
                    return;
                } else {
                    this.c.post(new Runnable() { // from class: tb.jjj.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                jjj.a(jjj.this, b);
                            }
                        }
                    });
                    return;
                }
            }
            this.b.put(b, aVar);
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        b.a c = c(str);
        if (c == null) {
            return;
        }
        c.a(str);
        a(str);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        jix jixVar = this.f29581a;
        return jixVar != null && jixVar.c();
    }

    private boolean e(String str) {
        jjl b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && b() && (b = b(str)) != null && b.h();
    }

    private boolean f(String str) {
        jjl b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && (b = b(str)) != null && b.i();
    }

    @Override // tb.jjh
    public boolean isExposureView(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec7c8cf", new Object[]{this, str, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str = i.d(view);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b = a.b(str);
        if (!g(b)) {
            return false;
        }
        boolean e = e(b);
        view.setTag(TAG_DYNAMIC_TRACKER_VIEW_ENABLE_MATCH_KEY, Boolean.valueOf(e));
        return i.a(str, view, e);
    }

    @Override // tb.jjh
    public com.ut.mini.internal.b getExposureViewTag(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.ut.mini.internal.b) ipChange.ipc$dispatch("5d54bfd6", new Object[]{this, str, view});
        }
        if (TextUtils.isEmpty(str)) {
            str = i.d(view);
        }
        String b = a.b(str);
        com.ut.mini.internal.b bVar = null;
        if (!TextUtils.isEmpty(b)) {
            jjl b2 = b(b);
            if (b2 == null) {
                return null;
            }
            if (!b2.c() && view != null && view.getTag(-1091011) != null) {
                Object tag = view.getTag(-1091011);
                if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                    return null;
                }
            }
            jjk a2 = a(b2, b, view, TrackerType.TrackerType_Exposure);
            if (a2 == null) {
                return null;
            }
            bVar = g.a(a2);
            if (f(b)) {
                String str2 = bVar.block;
                if (!this.d.contains(str2)) {
                    UTAnalytics.getInstance().getDefaultTracker().setCommitImmediatelyExposureBlock(str2);
                    this.d.add(str2);
                }
            }
        }
        return bVar;
    }

    @Override // tb.jjh
    public Map<String, String> getExposureViewProperties(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21fe9e1", new Object[]{this, str, view});
        }
        a.a();
        Map<String, String> a2 = a(str, view, "spm");
        if (a2 != null && view != null) {
            view.setTag(-1091011, true);
        }
        return a2;
    }

    private Map<String, String> a(String str, View view, String str2) {
        jjl b;
        jjk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b709ddf", new Object[]{this, str, view, str2});
        }
        if (TextUtils.isEmpty(str)) {
            str = i.d(view);
        }
        String b2 = a.b(str);
        if (TextUtils.isEmpty(b2) || (b = b(b2)) == null || !b.b() || (a2 = a(b, str, view, TrackerType.TrackerType_Exposure)) == null) {
            return null;
        }
        return a.a(a2.g, a2.j);
    }

    public void b(Message message) {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
        } else if (!a() || message == null || message.getData() == null) {
        } else {
            String string = message.getData().getString(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID);
            String string2 = message.getData().getString("page_config");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                return;
            }
            final String b = a.b(string);
            if (TextUtils.isEmpty(b) || !(a2 = a(b, string2))) {
                return;
            }
            if (Looper.getMainLooper().getThread() == Thread.currentThread() && a2) {
                d(b);
            } else {
                this.c.post(new Runnable() { // from class: tb.jjj.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            jjj.a(jjj.this, b);
                        }
                    }
                });
            }
        }
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (b(str) != null) {
                this.e.remove(str);
            }
            jjl jjlVar = new jjl();
            jjlVar.a();
            jjlVar.a(str2);
            if (jjlVar.d()) {
                c();
                this.e.put(str, jjlVar);
                return true;
            }
        }
        return false;
    }

    private void c() {
        Map.Entry<String, jjl> next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Map<String, jjl> map = this.e;
        if (map == null || map.size() < 5 || (next = this.e.entrySet().iterator().next()) == null || next.getKey() == null) {
            return;
        }
        this.e.remove(next.getKey());
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || !map.containsKey("url")) {
        } else {
            String b = a.b(map.get("url"));
            if (TextUtils.isEmpty(b)) {
                return;
            }
            jjl b2 = b(b);
            if (b2 != null) {
                b2.a(map);
            } else {
                new jjl().a(map);
            }
        }
    }

    public jjl b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjl) ipChange.ipc$dispatch("7d1dc407", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }

    private boolean g(String str) {
        jjl b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && (b = b(str)) != null && b.d();
    }

    public jjk a(jjl jjlVar, String str, View view, TrackerType trackerType) {
        jjk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjk) ipChange.ipc$dispatch("1daa6465", new Object[]{this, jjlVar, str, view, trackerType});
        }
        if ((jjlVar != null && view != null && !jjlVar.b()) || (a2 = jjlVar.a(view, str, trackerType)) == null || !g.a(trackerType, a2.k)) {
            return null;
        }
        return a2;
    }

    @Override // com.ut.mini.internal.c
    public void onExposureDataCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c8a743", new Object[]{this});
        } else {
            this.d.clear();
        }
    }
}
