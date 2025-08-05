package tb;

import android.content.res.Resources;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.model.theme.ThemeType;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<String> b = new ArrayList<>();
    private boolean c = false;
    private int d = 3;
    private String e = "#FFFFFF";

    /* renamed from: a  reason: collision with root package name */
    private a f27132a = new a();

    /* loaded from: classes4.dex */
    public static class b {
        public static final dzj instance;

        static {
            kge.a(-1232233480);
            instance = new dzj();
        }
    }

    static {
        kge.a(-997680580);
    }

    public dzj() {
        emu.a("com.taobao.android.detail.core.detail.kit.theme.ThemeManager");
    }

    public static dzj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dzj) ipChange.ipc$dispatch("f03f10a", new Object[0]) : b.instance;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || this.f27132a.a(str) == null) {
            this.c = false;
        } else {
            String[] a2 = this.f27132a.a(str);
            if (a2.length != this.d) {
                throw new RuntimeException("the them color size is not 3, theme name " + str);
            }
            this.b.clear();
            for (String str2 : a2) {
                this.b.add(str2);
            }
            this.c = true;
        }
    }

    /* loaded from: classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public HashMap<String, String[]> f27133a = new HashMap<>();
        public Resources b = ehk.a().b().getResources();

        static {
            kge.a(-539532373);
        }

        public a() {
            a();
        }

        private void a() {
            ThemeType[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            for (ThemeType themeType : ThemeType.values()) {
                this.f27133a.put(themeType.name, this.b.getStringArray(themeType.resId));
            }
        }

        public String[] a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{this, str}) : this.f27133a.get(str);
        }
    }
}
