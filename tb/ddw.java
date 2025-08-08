package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class ddw implements ddu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f26712a;
    private static ddw c;
    private CopyOnWriteArrayList<ddv> b = new CopyOnWriteArrayList<>();

    static {
        kge.a(-2013102019);
        kge.a(1719617790);
    }

    public static ddw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddw) ipChange.ipc$dispatch("f03a007", new Object[0]);
        }
        if (c == null) {
            synchronized (ddw.class) {
                if (c == null) {
                    c = new ddw();
                    f26712a = u.aJ();
                }
            }
        }
        return c;
    }

    private ddw() {
    }

    @Override // tb.ddu
    public void a(ddv ddvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f15f22", new Object[]{this, ddvVar});
            return;
        }
        if (ddvVar != null && !this.b.contains(ddvVar)) {
            this.b.add(ddvVar);
        }
        if (!b.d(pmd.a().u().c()) || ddvVar == null) {
            return;
        }
        ddvVar.observeUniqueIdentification();
        ddvVar.bizCode();
    }

    @Override // tb.ddu
    public void b(ddv ddvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37465a3", new Object[]{this, ddvVar});
        } else if (ddvVar == null || !this.b.contains(ddvVar)) {
        } else {
            this.b.remove(ddvVar);
            if (!this.b.isEmpty()) {
                return;
            }
            b();
        }
    }

    public void b(String str, Object obj) {
        String[] observeEvents;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
            return;
        }
        Iterator<ddv> it = this.b.iterator();
        while (it.hasNext()) {
            ddv next = it.next();
            if (next != null && (observeEvents = next.observeEvents()) != null && observeEvents.length > 0) {
                int length = observeEvents.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (str.equals(observeEvents[i])) {
                        next.onEvent(str, obj);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        CopyOnWriteArrayList<ddv> copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        c = null;
    }

    @Override // tb.ddu
    @Deprecated
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, null);
        }
    }

    @Override // tb.ddu
    @Deprecated
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            b(str, obj);
        }
    }

    @Override // tb.ddu
    public void a(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2ef5d8", new Object[]{this, str, obj, str2});
        } else {
            b(str, obj, str2);
        }
    }

    public void b(String str, Object obj, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe4c299", new Object[]{this, str, obj, str2});
            return;
        }
        Iterator<ddv> it = this.b.iterator();
        while (it.hasNext()) {
            ddv next = it.next();
            if (next != null) {
                String observeUniqueIdentification = next.observeUniqueIdentification();
                boolean contains = (StringUtils.isEmpty(str2) || StringUtils.isEmpty(observeUniqueIdentification)) ? true : observeUniqueIdentification.contains(str2);
                if (u.aO() || contains || ((list = f26712a) != null && list.contains(next.bizCode()))) {
                    String[] observeEvents = next.observeEvents();
                    if (observeEvents != null && observeEvents.length > 0) {
                        int length = observeEvents.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (str.equals(observeEvents[i])) {
                                next.onEvent(str, obj);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(Activity activity) {
        BaseFrame baseFrame;
        ArrayList arrayList = new ArrayList();
        Iterator<ddv> it = this.b.iterator();
        while (it.hasNext()) {
            ddv next = it.next();
            if (next instanceof BaseFrame) {
                if (activity == ((BaseFrame) next).mContext) {
                    arrayList.add(next);
                    q.a("TBLiveEventCenter", "内存泄漏优化，兜底移除：" + baseFrame.getComponentName());
                }
            } else {
                try {
                    Class<?> cls = next.getClass();
                    MemCheck memCheck = (MemCheck) cls.getAnnotation(MemCheck.class);
                    if (memCheck != null) {
                        Field declaredField = cls.getDeclaredField(memCheck.field());
                        declaredField.setAccessible(true);
                        if (((Context) declaredField.get(next)) == activity) {
                            arrayList.add(next);
                            q.a("TBLiveEventCenter", "内存泄漏优化，兜底移除：" + cls.getName());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        String str = "泄漏组件个数：" + arrayList.size();
        this.b.removeAll(arrayList);
    }
}
