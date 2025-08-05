package com.alibaba.ability.localization;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.localization.constants.Location;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qgq;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b INSTANCE;
    public static final String LOG_MODULE = "Localization";

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.d f1972a;
    private static volatile Language b;
    private static volatile Location c;
    private static final kotlin.d d;
    private static final Object e;
    private static final Object f;
    private static final Object g;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Language language, String str);
    }

    /* renamed from: com.alibaba.ability.localization.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0059b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f1973a;
        public final /* synthetic */ Language b;
        public final /* synthetic */ Location c;

        public RunnableC0059b(a aVar, Language language, Location location) {
            this.f1973a = aVar;
            this.b = language;
            this.c = location;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f1973a.a(this.b, this.c.getCode());
            } catch (Exception e) {
                TLog.loge(b.LOG_MODULE, b.LOG_MODULE, "dispatch locale change event, " + e.getMessage());
            }
        }
    }

    private final Handler g() {
        IpChange ipChange = $ipChange;
        return (Handler) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("98203298", new Object[]{this}) : f1972a.getValue());
    }

    private final ConcurrentSkipListSet<a> h() {
        IpChange ipChange = $ipChange;
        return (ConcurrentSkipListSet) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("eb64b700", new Object[]{this}) : d.getValue());
    }

    static {
        kge.a(-1855276855);
        INSTANCE = new b();
        e = new Object();
        f = new Object();
        g = new Object();
        f1972a = e.a(Localization$mainHandler$2.INSTANCE);
        d = e.a(Localization$localeChangeListeners$2.INSTANCE);
    }

    private b() {
    }

    @JvmStatic
    public static final Language a() {
        Language language;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("3b0f4051", new Object[0]);
        }
        Language language2 = b;
        if (language2 != null) {
            return language2;
        }
        synchronized (f) {
            language = b;
            if (language == null) {
                language = Language.Companion.a(qgq.INSTANCE.a(c.INSTANCE.b()));
                if (language == null) {
                    language = Language.SIMPLIFIED_CHINESE;
                }
                b = language;
            }
        }
        return language;
    }

    @JvmStatic
    public static final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String str = null;
        try {
            Context b2 = c.INSTANCE.b();
            if (b2 != null) {
                c.INSTANCE.b(b2, a());
                Resources resources = b2.getResources();
                if (resources != null) {
                    str = resources.getString(i);
                }
            }
        } catch (Exception e2) {
            TLog.loge(LOG_MODULE, LOG_MODULE, String.valueOf(e2.getMessage()));
        }
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final String a(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{name});
        }
        q.d(name, "name");
        Context b2 = c.INSTANCE.b();
        if (b2 != null) {
            c.INSTANCE.b(b2, a());
            Resources resources = b2.getResources();
            String str = null;
            if (resources != null) {
                try {
                    int identifier = resources.getIdentifier(name, "string", b2.getPackageName());
                    if (identifier != 0) {
                        str = resources.getString(identifier);
                    }
                } catch (Exception e2) {
                    TLog.loge(LOG_MODULE, LOG_MODULE, String.valueOf(e2.getMessage()));
                }
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a() == Language.SIMPLIFIED_CHINESE;
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : !b() && !INSTANCE.c(e());
    }

    @JvmStatic
    public static final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd215ce8", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            INSTANCE.h().add(aVar);
        }
    }

    @JvmStatic
    public static final void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b262cba9", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            INSTANCE.h().remove(aVar);
        }
    }

    @JvmStatic
    public static final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : e().getCode();
    }

    @JvmStatic
    public static final Location e() {
        Location location;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Location) ipChange.ipc$dispatch("2f83e398", new Object[0]);
        }
        Location location2 = c;
        if (location2 != null) {
            return location2;
        }
        synchronized (g) {
            location = c;
            if (location == null) {
                Location.a aVar = Location.Companion;
                String b2 = qgq.INSTANCE.b(c.INSTANCE.b());
                if (b2 == null) {
                    b2 = qgq.INSTANCE.c(c.INSTANCE.b());
                    qgq.INSTANCE.b(c.INSTANCE.b(), b2);
                    TLog.loge(LOG_MODULE, LOG_MODULE, "migrate edition switcher location data, edition code: " + b2);
                }
                location = aVar.a(b2);
                if (location == null) {
                    location = Location.CN;
                }
                c = location;
            }
        }
        return location;
    }

    @JvmStatic
    public static final void a(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd1914", new Object[]{location});
        } else if (location == null) {
        } else {
            a(a(), location);
        }
    }

    @JvmStatic
    public static final void a(Language language, Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2148ae8b", new Object[]{language, location});
        } else if (language == null || location == null) {
            TLog.loge(LOG_MODULE, LOG_MODULE, "setLocale fail, language is null or location is null");
        } else {
            synchronized (e) {
                Language a2 = a();
                Location e2 = e();
                Language c2 = INSTANCE.c(language, location);
                if (a2 != c2 || e2 != location) {
                    INSTANCE.a(c2);
                    INSTANCE.b(location);
                    INSTANCE.b(c2, location);
                }
                t tVar = t.INSTANCE;
            }
        }
    }

    @JvmStatic
    public static final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : INSTANCE.c(e());
    }

    private final void a(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52db5e91", new Object[]{this, language});
        } else if (a() == language) {
        } else {
            TLog.loge(LOG_MODULE, LOG_MODULE, "change language from: " + a() + " to " + language);
            b = language;
            qgq.INSTANCE.a(c.INSTANCE.b(), language.getTag());
            c cVar = c.INSTANCE;
            cVar.a(cVar.b(), language);
        }
    }

    private final void b(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ca3033", new Object[]{this, location});
        } else if (e() == location) {
        } else {
            TLog.loge(LOG_MODULE, LOG_MODULE, "change location from: " + d() + " to " + location);
            c = location;
            qgq.INSTANCE.b(c.INSTANCE.b(), location.name());
        }
    }

    private final void b(Language language, Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0304ccc", new Object[]{this, language, location});
            return;
        }
        Iterator<a> it = h().iterator();
        while (it.hasNext()) {
            g().post(new RunnableC0059b(it.next(), language, location));
        }
    }

    private final boolean c(Location location) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3b74756", new Object[]{this, location})).booleanValue() : location == Location.CN;
    }

    private final Language c(Language language, Location location) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Language) ipChange.ipc$dispatch("ef6c2676", new Object[]{this, language, location}) : c(location) ? Language.SIMPLIFIED_CHINESE : language;
    }
}
