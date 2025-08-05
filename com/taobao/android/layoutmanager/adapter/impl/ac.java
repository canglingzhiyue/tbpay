package com.taobao.android.layoutmanager.adapter.impl;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.a;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tjy;

/* loaded from: classes5.dex */
public class ac implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(756582845);
        kge.a(2105756955);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strArr});
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, strArr);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(d(obj), str);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(d(obj));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26bde0f", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(d(obj), str);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
            return;
        }
        Object d = d(obj);
        if (map == null) {
            map = new HashMap<>();
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t h = h(obj);
        if (h != null) {
            map.putAll(h.a());
        }
        if (obj instanceof com.taobao.tao.flexbox.layoutmanager.core.aa) {
            TrackerModule.addDSLInfo(map, (com.taobao.tao.flexbox.layoutmanager.core.aa) obj);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(d, map);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public Map<String, String> g(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b8c6d27f", new Object[]{this, obj}) : UTAnalytics.getInstance().getDefaultTracker().getPageProperties(d(obj));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public Map<String, String> a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4282aa6f", new Object[]{this, activity}) : UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties(activity);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(map));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0c0910", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(d(obj), Uri.parse(str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void b(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71381560", new Object[]{this, obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(d(obj), JSON.toJSONString(map));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            a(null, str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void a(Object obj, String str, int i, Object obj2, Object obj3, Object obj4, String... strArr) {
        String[] strArr2;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4473c3f6", new Object[]{this, obj, str, new Integer(i), obj2, obj3, obj4, strArr});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t h = h(obj);
        if (h != null) {
            Map<String, String> a2 = h.a();
            int length = strArr != null ? strArr.length : 0;
            String[] strArr3 = new String[a2.size() + length];
            if (length > 0) {
                System.arraycopy(strArr, 0, strArr3, 0, length);
            }
            for (Map.Entry<String, String> entry : a2.entrySet()) {
                strArr3[length + i2] = entry.getKey() + "=" + entry.getValue();
                i2++;
            }
            strArr2 = strArr3;
        } else {
            strArr2 = strArr;
        }
        TBS.Ext.commitEvent(str, i, obj2, obj3, obj4, strArr2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(d(obj));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public void d(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac3411", new Object[]{this, obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(d(obj), str);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public String[] c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("52d6b315", new Object[]{this, obj});
        }
        if (d(obj) instanceof Activity) {
            Activity activity = (Activity) obj;
            return new String[]{UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(activity), UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre(activity)};
        }
        return new String[]{null, null};
    }

    private static Object d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9cf2280b", new Object[]{obj});
        }
        if (obj instanceof com.taobao.tao.flexbox.layoutmanager.core.aa) {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) obj;
            ab k = aaVar.k();
            if (k == null) {
                return obj;
            }
            Object c = k.c(R.id.layout_manager_engine_utobject_tag);
            if (c != null) {
                return c;
            }
            Object g = k.g();
            if (g instanceof com.taobao.tao.flexbox.layoutmanager.container.f) {
                return ((com.taobao.tao.flexbox.layoutmanager.container.f) g).getUTObject();
            }
            return aaVar.N();
        } else if (obj instanceof com.taobao.tao.flexbox.layoutmanager.container.f) {
            return ((com.taobao.tao.flexbox.layoutmanager.container.f) obj).getUTObject();
        } else {
            return obj instanceof Fragment ? ((Fragment) obj).getActivity() : obj;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public String e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6d2f658", new Object[]{this, obj});
        }
        a.C0513a a2 = com.taobao.android.layoutmanager.module.a.a(obj);
        if (a2 == null) {
            return null;
        }
        return a2.a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u
    public String f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3df0e737", new Object[]{this, obj});
        }
        a.C0513a a2 = com.taobao.android.layoutmanager.module.a.a(obj);
        if (a2 == null) {
            return null;
        }
        return a2.b();
    }

    private com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t) ipChange.ipc$dispatch("e9b174", new Object[]{this, obj});
        }
        if (obj instanceof tjy) {
            return (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t) obj;
        }
        if (obj instanceof com.taobao.tao.flexbox.layoutmanager.core.aa) {
            return ((com.taobao.tao.flexbox.layoutmanager.core.aa) obj).k().W();
        }
        if (obj instanceof ab) {
            return ((ab) obj).W();
        }
        return tjy.c();
    }
}
