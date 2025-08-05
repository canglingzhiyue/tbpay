package tb;

import com.alibaba.security.realidentity.o;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J:\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ:\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ]\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\u0010\u0017J:\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ0\u0010\u0018\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fJ$\u0010\u001a\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J0\u0010\u001d\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¨\u0006\u001e"}, d2 = {"Lcom/taobao/taolive/lpm_android/api/UserActionObserver;", "", "()V", "pageDisAppear", "", "bizID", "", "var1", "track4Click", "page", "arg1", "map", "", "track4Show", "key", "params", "trackCustom", "aPage", "aEventId", "", "aArg1", "aArg2", "aArg3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "trackPage", "pageName", "updatePageName", o.b, "s", m.UPDATE_PAGE_PROPERTIES, "lpm-android_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes8.dex */
public final class pcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().d.a(str, str2, str3, map);
        } catch (Exception unused) {
        }
    }

    public final void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10af9e", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().d.b(str, str2, str3, map);
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String str2, Integer num, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bceeb4c", new Object[]{this, str, str2, num, str3, str4, str5, map});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().d.a(str, str2, num, str3, str4, str5, map);
        } catch (Exception unused) {
        }
    }

    public final void c(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4581a8bd", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().d.c(str, str2, str3, map);
        } catch (Exception unused) {
        }
    }

    public final void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a();
        } catch (Exception unused) {
        }
    }

    public final void a(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2ef5d8", new Object[]{this, str, obj, str2});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a();
        } catch (Exception unused) {
        }
    }

    public final void a(String str, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b43a37", new Object[]{this, str, obj, map});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a();
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        try {
            pbt a2 = pbt.a();
            q.a((Object) a2, "Lpm.instance()");
            if (!a2.c()) {
                return;
            }
            LpmImpl.a().d.a(str, str2, map);
        } catch (Exception unused) {
        }
    }
}
