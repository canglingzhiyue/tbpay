package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbreachflow.shortcuts.config.ShortcutConfig;
import com.taobao.tbreachflow.shortcuts.config.ShortcutControlConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class qod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f32973a = false;
    public static boolean b = false;
    public static String c = "";
    public static boolean d = false;
    public static long e = -1;
    public static List<String> f;
    private boolean g = true;
    private boolean h = false;
    private String i = "";
    private Map<String, ShortcutConfig> j = new HashMap();
    private Map<String, ShortcutControlConfig> k = new HashMap();

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final qod f32974a = new qod();

        public static /* synthetic */ qod a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (qod) ipChange.ipc$dispatch("f09afd8", new Object[0]) : f32974a;
        }
    }

    public static qod a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qod) ipChange.ipc$dispatch("f09afd8", new Object[0]) : a.a();
    }

    public Map<String, ShortcutConfig> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.j;
    }

    public void a(Map<String, ShortcutConfig> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public Map<String, ShortcutControlConfig> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.k;
    }

    public void b(Map<String, ShortcutControlConfig> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.k = map;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.i;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.h;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }
}
