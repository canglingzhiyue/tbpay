package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.l;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class nhb implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1141970739);
        kge.a(299480238);
    }

    @Override // com.taobao.pha.core.l
    public void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        } else if (TextUtils.isEmpty(str)) {
            ngr.d("DefaultUserTrack", "Param pageName shouldn't be empty.");
        } else if (i <= 0) {
            ngr.d("DefaultUserTrack", "Param eventId should > 0.");
        } else {
            a().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        }
    }

    @Override // com.taobao.pha.core.l
    public void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(map);
        a().send(uTCustomHitBuilder.build());
    }

    @Override // com.taobao.pha.core.l
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = TextUtils.isEmpty(str) ? new UTHitBuilders.UTControlHitBuilder(str2) : new UTHitBuilders.UTControlHitBuilder(str, str2);
        uTControlHitBuilder.setProperties(map);
        a().send(uTControlHitBuilder.build());
    }

    @Override // com.taobao.pha.core.l
    public void b(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32eba328", new Object[]{this, context, uri});
        } else {
            a().updatePageUrl(context, uri);
        }
    }

    @Override // com.taobao.pha.core.l
    public void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else {
            a().updatePageName(context, str);
        }
    }

    @Override // com.taobao.pha.core.l
    public void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
        } else {
            a().updatePageProperties(context, map);
        }
    }

    @Override // com.taobao.pha.core.l
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            a().updatePageUtparam(context, str);
        }
    }

    @Override // com.taobao.pha.core.l
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            a().updateNextPageProperties(map);
        }
    }

    @Override // com.taobao.pha.core.l
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a().updateNextPageUtparam(str);
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else {
            a().pageAppearDonotSkip(context);
        }
    }

    @Override // com.taobao.pha.core.l
    public void a(Context context, Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd717ce7", new Object[]{this, context, uri});
            return;
        }
        c(context);
        a().updatePageUrl(context, uri);
        if (!uri.isHierarchical() || (queryParameter = uri.getQueryParameter("scm")) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scm", queryParameter);
        a().updatePageProperties(context, hashMap);
    }

    @Override // com.taobao.pha.core.l
    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
        } else if (z) {
            a().pageAppearDonotSkip(context);
        } else {
            a().pageAppear(context);
        }
    }

    @Override // com.taobao.pha.core.l
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            a().pageDisAppear(context);
        }
    }

    @Override // com.taobao.pha.core.l
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            a().skipPage(context);
        }
    }

    private static UTTracker a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTTracker) ipChange.ipc$dispatch("b5e60636", new Object[0]) : UTAnalytics.getInstance().getDefaultTracker();
    }
}
