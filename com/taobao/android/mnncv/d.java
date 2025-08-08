package com.taobao.android.mnncv;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f14403a;
    private final ConcurrentHashMap<String, MRTTaskDescription> b = new ConcurrentHashMap<>();
    private final Set<String> c = Collections.synchronizedSet(new HashSet());

    private d() {
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.c.remove(str);
        }
    }

    public static d a() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1293e95b", new Object[0]);
        }
        synchronized (d.class) {
            if (f14403a == null) {
                f14403a = new d();
            }
            dVar = f14403a;
        }
        return dVar;
    }

    public MRTTaskDescription b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("82dee595", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        MRTTaskDescription c = c(str);
        if (c != null) {
            this.b.put(str, c);
        }
        return c;
    }

    public boolean a(String str, MNNCVExecutor.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27bf7195", new Object[]{this, str, cVar})).booleanValue();
        }
        MRTTaskDescription b = g.a().b(str);
        if (b == null) {
            if (cVar != null) {
                cVar.a("remote task desc not exist");
            }
            return false;
        }
        MRTTaskDescription b2 = b(str);
        if (b2 != null && StringUtils.equals(b.cid, b2.cid)) {
            return true;
        }
        JSONObject jSONObjet = b.toJSONObjet();
        jSONObjet.put("n", (Object) (b.name + "_" + b.cid));
        try {
            MRTTaskDescription a2 = com.taobao.android.mnncv.mtop.d.a(jSONObjet);
            if (!a(str, a2, cVar)) {
                return false;
            }
            boolean b3 = b(str, a2, cVar);
            if (b3) {
                this.b.remove(str);
            }
            return b3;
        } catch (MRTRuntimeException unused) {
            return false;
        }
    }

    public void a(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abea84d", new Object[]{this, str, set});
        } else if (str == null) {
        } else {
            a(com.taobao.mrt.task.e.b, str, set);
            a(com.taobao.mrt.task.e.c, str, set);
        }
    }

    private void a(String str, String str2, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8d69c3", new Object[]{this, str, str2, set});
            return;
        }
        File file = new File(str);
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str3 : list) {
            if (!this.c.contains(str3) && (set == null || !set.contains(str3))) {
                if (str3.startsWith(str2 + "_")) {
                    com.taobao.mrt.task.e.d(new File(file, str3));
                }
            }
        }
    }

    private boolean b(String str, MRTTaskDescription mRTTaskDescription, MNNCVExecutor.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3148202", new Object[]{this, str, mRTTaskDescription, cVar})).booleanValue();
        }
        String str2 = com.taobao.mrt.task.e.d;
        com.taobao.mrt.task.e.b(mRTTaskDescription.toJSONObjet().toString(), new File(str2, str + "_cache.json"));
        return true;
    }

    private MRTTaskDescription c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("5ea06156", new Object[]{this, str});
        }
        File file = new File(com.taobao.mrt.task.e.d);
        if (!file.isDirectory()) {
            return null;
        }
        File file2 = new File(file, str + "_cache.json");
        if (!file2.exists()) {
            return null;
        }
        String c = com.taobao.mrt.task.e.c(file2);
        if (StringUtils.isEmpty(c)) {
            return null;
        }
        try {
            MRTTaskDescription a2 = com.taobao.android.mnncv.mtop.d.a(JSONObject.parseObject(c));
            if (a2 == null) {
                return null;
            }
            if (a2.model != null && com.taobao.mrt.task.e.a(a2.model) != 0) {
                return null;
            }
            if (a2.resource != null && com.taobao.mrt.task.e.a(a2.resource) != 0) {
                return null;
            }
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean a(String str, MRTTaskDescription mRTTaskDescription, MNNCVExecutor.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82996c63", new Object[]{this, str, mRTTaskDescription, cVar})).booleanValue();
        }
        String str2 = mRTTaskDescription.name;
        File file = new File(com.taobao.mrt.task.e.b, str);
        File file2 = new File(com.taobao.mrt.task.e.b, str2);
        if (file.exists()) {
            if (file2.exists()) {
                com.taobao.mrt.task.e.d(file2);
            }
            try {
                boolean b = com.taobao.mrt.task.e.b(file, file2);
                com.taobao.mrt.task.e.b(mRTTaskDescription.model);
                if (!b) {
                    return false;
                }
            } catch (Exception e) {
                if (cVar != null) {
                    cVar.a("copy model file" + e.getMessage());
                }
                return false;
            }
        }
        File file3 = new File(com.taobao.mrt.task.e.c, str);
        File file4 = new File(com.taobao.mrt.task.e.c, str2);
        if (file3.exists()) {
            if (file4.exists()) {
                com.taobao.mrt.task.e.d(file4);
            }
            if (!com.taobao.mrt.task.e.b(file3, file4)) {
                if (cVar != null) {
                    cVar.a("copy resource file ");
                }
                return false;
            }
            com.taobao.mrt.task.e.b(mRTTaskDescription.resource);
        }
        return true;
    }
}
