package com.taobao.taolive.room.ui.fanslevel;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.taolive.room.business.fanslevel.GetFansLevelDetailData;
import com.taobao.taolive.sdk.model.d;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FANS_LEVEL_DIA = "2";
    public static final String FANS_LEVEL_IRON = "1";
    public static final String FANS_LEVEL_NEW = "0";
    public static final String FANS_LEVEL_RENDER = "fanLevel";
    public static final String ICON_RENDER = "icons";
    public static final String TASK_TYPE_LEVEL = "level";
    public static final String TASK_TYPE_NORMAL = "normal";
    private static a d;

    /* renamed from: a  reason: collision with root package name */
    private GetFansLevelDetailData f21708a = null;
    private HashMap<String, String> c = new HashMap<>();
    private String e;
    private String f;
    private com.taobao.taolive.room.business.fanslevel.a g;
    private Map<String, Map<String, String>> h;

    static {
        kge.a(1469802092);
        d = null;
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("379dfa02", new Object[0]);
        }
        if (d == null) {
            d = new a();
        }
        return d;
    }

    public String a(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Map<String, Map<String, String>> map2 = this.h;
        if (map2 != null && (map = map2.get(str)) != null) {
            return map.get("iconSmall");
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = this.c;
        if (hashMap == null) {
            return;
        }
        hashMap.put(FANS_LEVEL_RENDER, str);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        HashMap<String, String> hashMap = this.c;
        if (hashMap != null && hashMap.get(FANS_LEVEL_RENDER) != null) {
            return this.c.get(FANS_LEVEL_RENDER);
        }
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        d.i = UUID.randomUUID().toString();
        HashMap<String, String> hashMap = this.c;
        if (hashMap == null) {
            return;
        }
        hashMap.put("userToken", d.i);
    }

    public String c(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (this.h != null && !StringUtils.isEmpty(str) && (map = this.h.get(str)) != null) {
            return map.get(e.KEY_BG_COLOR);
        }
        return null;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("31745610", new Object[]{this}) : this.c;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f21708a = null;
        this.c.clear();
        com.taobao.taolive.room.business.fanslevel.a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
