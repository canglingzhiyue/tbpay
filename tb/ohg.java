package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.f;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class ohg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f32056a;
    private static ohg b;
    private final HashMap<String, List<a>> e = new HashMap<>();
    private final Map<String, String> f = new HashMap();
    private Set<String> g = new HashSet();
    private final SharedPreferences c = ab.a().getSharedPreferences("tnode_orange_sp", 0);
    private final d d = new d() { // from class: tb.ohg.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.orange.d
        public void onConfigUpdate(final String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                ohg.a(ohg.this, str, map);
                if (oeb.I()) {
                    ohg.b(ohg.this, str, map);
                } else {
                    ohg.c(ohg.this, str, map);
                }
            } catch (Exception e) {
                ogg.a("TNodeOrange", e.getMessage());
            }
            oec.a(new Runnable() { // from class: tb.ohg.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ohg.a(ohg.this, str);
                    }
                }
            }, true);
        }
    };

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str, String str2, String str3);
    }

    public static /* synthetic */ void a(ohg ohgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135f5db4", new Object[]{ohgVar, str});
        } else {
            ohgVar.a(str);
        }
    }

    public static /* synthetic */ void a(ohg ohgVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33cdf51", new Object[]{ohgVar, str, map});
        } else {
            ohgVar.a(str, map);
        }
    }

    public static /* synthetic */ void b(ohg ohgVar, String str, Map map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb46cf0", new Object[]{ohgVar, str, map});
        } else {
            ohgVar.c(str, map);
        }
    }

    public static /* synthetic */ void c(ohg ohgVar, String str, Map map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262bfa8f", new Object[]{ohgVar, str, map});
        } else {
            ohgVar.b(str, map);
        }
    }

    static {
        kge.a(-1626720512);
        f32056a = new String[]{"weitao_switch", "tnode", "ShortVideo", f.UGC_ORANGE_GROUP};
        b = new ohg();
    }

    public static ohg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ohg) ipChange.ipc$dispatch("f08ad30", new Object[0]) : b;
    }

    private ohg() {
        a(f32056a);
    }

    public Map<String, String> b() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        synchronized (this.f) {
            hashMap = new HashMap(this.f);
        }
        return hashMap;
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        synchronized (this.g) {
            ArrayList arrayList = new ArrayList();
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if (!this.g.contains(str)) {
                        this.g.add(str);
                        arrayList.add(str);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                OrangeConfig.getInstance().registerListener((String[]) arrayList.toArray(new String[arrayList.size()]), this.d, true);
            }
        }
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        synchronized (this.f) {
            this.f.put(str, map.get("configVersion"));
        }
    }

    private void b(String str, Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            String string = this.c.getString(str, null);
            String str2 = map.get("configVersion");
            if (configs == null || TextUtils.equals(string, str2)) {
                return;
            }
            SharedPreferences.Editor edit = this.c.edit();
            if (c(str)) {
                for (Map.Entry<String, String> entry : configs.entrySet()) {
                    edit.putString(a(str, entry.getKey()), entry.getValue());
                }
            }
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e) {
            throw e;
        }
    }

    private void c(String str, Map<String, String> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{this, str, map});
            return;
        }
        try {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            String string = this.c.getString(str, null);
            String str2 = map.get("configVersion");
            if (configs == null || TextUtils.equals(string, str2)) {
                return;
            }
            Map<String, ?> all = this.c.getAll();
            SharedPreferences.Editor edit = this.c.edit();
            if (c(str)) {
                LinkedList linkedList = new LinkedList();
                String concat = str.concat(".");
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    if (key.startsWith(concat)) {
                        linkedList.add(key);
                    }
                }
                for (int i = 0; i < linkedList.size(); i++) {
                    edit.remove((String) linkedList.get(i));
                }
                linkedList.clear();
                for (Map.Entry<String, String> entry2 : configs.entrySet()) {
                    edit.putString(a(str, entry2.getKey()), entry2.getValue());
                }
            }
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception e) {
            throw e;
        }
    }

    public synchronized String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        try {
            String a2 = ogy.a(str, str2);
            if (a2 != null) {
                return a2;
            }
            String a3 = a(str, str2);
            String string = this.c.getString(a3, str3);
            String config = OrangeConfig.getInstance().getConfig(str, str2, str3);
            if (TextUtils.equals(string, config)) {
                return config;
            }
            if (TextUtils.equals(config, str3)) {
                return string;
            }
            this.c.edit().putString(a3, config).apply();
            return config;
        } catch (Exception e) {
            ogg.a("TNodeOrange", e.getMessage());
            return str3;
        }
    }

    public void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8c1821", new Object[]{this, str, str2, aVar});
            return;
        }
        String a2 = a(str, str2);
        List<a> list = this.e.get(a2);
        if (list == null) {
            list = new ArrayList<>();
            this.e.put(a2, list);
        }
        if (list.contains(aVar)) {
            return;
        }
        list.add(aVar);
    }

    public void b(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01735e2", new Object[]{this, str, str2, aVar});
            return;
        }
        List<a> list = this.e.get(a(str, str2));
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    private void a(String str) {
        List<a> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap<String, List<a>> hashMap = this.e;
        if (hashMap == null) {
            return;
        }
        for (Map.Entry<String, List<a>> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (value = entry.getValue()) != null && !value.isEmpty()) {
                String[] b2 = b(key);
                String config = OrangeConfig.getInstance().getConfig(b2[0], b2[1], null);
                for (a aVar : value) {
                    aVar.a(b2[0], b2[1], config);
                }
            }
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        return str + "." + str2;
    }

    private String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{this, str});
        }
        String[] strArr = new String[2];
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            strArr[0] = str.substring(0, indexOf);
            strArr[1] = str.substring(indexOf + 1);
        } else {
            strArr[0] = "tnode";
            strArr[1] = str;
        }
        return strArr;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : f32056a) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
