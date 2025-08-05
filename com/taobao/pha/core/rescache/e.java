package com.taobao.pha.core.rescache;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import tb.kge;
import tb.ngr;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18785a;
    private final List<Pattern> b = new ArrayList();
    private final String[] c;
    private final String[] d;

    static {
        kge.a(1953908474);
        f18785a = e.class.getSimpleName();
    }

    public e(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.b.add(Pattern.compile(str));
                } catch (Exception e) {
                    ngr.b(f18785a, e.toString());
                }
            }
        }
        this.c = b("offline_resource_black_list");
        String[] b = b("offline_resource_url_suffix");
        this.d = b == null ? new String[]{"javascript", "css", "html"} : b;
    }

    private static String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{str});
        }
        try {
            String a2 = p.c().a(str);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            return a2.split(",");
        } catch (Exception unused) {
            String str2 = f18785a;
            ngr.b(str2, "Get config list fail. configName = " + str);
            return null;
        }
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : str.contains("??");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.b.isEmpty() || c(str) || d(str) || !e(str)) {
            return false;
        }
        return f(str);
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        String[] strArr = this.c;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        String[] strArr = this.d;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        for (Pattern pattern : this.b) {
            if (pattern != null && pattern.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }
}
