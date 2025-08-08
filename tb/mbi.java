package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.search.common.util.k;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class mbi implements kfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<String, Boolean> f31014a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final mbi f31015a;

        static {
            kge.a(-1729734684);
            f31015a = new mbi();
        }

        public static /* synthetic */ mbi a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mbi) ipChange.ipc$dispatch("f07ae2a", new Object[0]) : f31015a;
        }
    }

    static {
        kge.a(-1459031791);
        kge.a(-580457140);
    }

    public static mbi a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mbi) ipChange.ipc$dispatch("f07ae2a", new Object[0]) : a.a();
    }

    private String a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{this, activity}) : Integer.toHexString(activity.hashCode());
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity != null) {
            String a2 = a(currentActivity);
            Boolean bool = this.f31014a.get(a2);
            c.a("linkx", String.format("BrowserPageTouchListener.isCurrentBrowserNotTouched.mOpenedUrlNotTouched=%s.webViewActivityHashCode=%s.touched=%s.", this.f31014a, a2, bool));
            if (bool != null && !bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.kfa
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        c.a("linkx", String.format("BrowserPageTouchListener.onPageStarted.activityCode=%s === url=%s", str, str2));
        this.f31014a.put(str, false);
    }

    @Override // tb.kfa
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            c.a("linkx", String.format("BrowserPageTouchListener.onPageFinished.activityCode=%s === url=%s", str, str2));
        }
    }

    @Override // tb.kfa
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        c.a("linkx", String.format("BrowserPageTouchListener.onTouchPage.activityCode=%s === url=%s", str, str2));
        this.f31014a.put(str, true);
    }

    @Override // tb.kfa
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        c.a("linkx", String.format("BrowserPageTouchListener.onRedirectUrl.activityCode=%s === originUrl=%s === targetUrl=%s", str, str2, str3));
        if (StringUtils.isEmpty(str3)) {
            return;
        }
        if (!str3.startsWith(k.HTTP_PREFIX) && !str3.startsWith(k.HTTPS_PREFIX)) {
            return;
        }
        this.f31014a.put(str, false);
    }

    @Override // tb.kfa
    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        c.a("linkx", String.format("BrowserPageTouchListener.onDestroy.activityCode=%s === url=%s === isFinishing=%s", str, str2, Boolean.valueOf(z)));
        if (!z || StringUtils.isEmpty(str)) {
            return;
        }
        Iterator<Map.Entry<String, Boolean>> it = this.f31014a.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (!StringUtils.isEmpty(key) && key.equals(str)) {
                it.remove();
            }
        }
    }
}
