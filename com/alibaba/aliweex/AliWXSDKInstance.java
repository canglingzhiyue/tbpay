package com.alibaba.aliweex;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.aliweex.bundle.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.EmbedManager;
import com.taobao.weex.ui.component.IWXEmbed;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.xstate.a;
import tb.amt;
import tb.ann;
import tb.kge;

/* loaded from: classes2.dex */
public class AliWXSDKInstance extends WXSDKInstance implements EmbedManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f2002a;
    private Map<String, IWXEmbed> b;
    private j c;
    private String v;
    private amt w;
    private Map<String, Object> x;

    static {
        kge.a(-355328991);
        kge.a(-1233721658);
    }

    public static /* synthetic */ Object ipc$super(AliWXSDKInstance aliWXSDKInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else if (hashCode != 94685804) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.e();
            return null;
        }
    }

    public AliWXSDKInstance(String str) {
        this.b = new HashMap();
        this.v = "AliWXSDKInstance";
        this.x = new ConcurrentHashMap();
    }

    public AliWXSDKInstance(Context context, String str) {
        super(context);
        this.b = new HashMap();
        this.v = "AliWXSDKInstance";
        this.x = new ConcurrentHashMap();
        this.w = new ann();
        this.f2002a = str;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f2002a = str;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2002a;
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4080569", new Object[]{this, jVar});
        } else {
            this.c = jVar;
        }
    }

    public amt b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (amt) ipChange.ipc$dispatch("16b409b5", new Object[]{this}) : this.w;
    }

    public void a(amt amtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e050c010", new Object[]{this, amtVar});
        } else {
            this.w = amtVar;
        }
    }

    public j c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("41703ed", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.weex.WXSDKInstance, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        this.c = null;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        e l = d.a().l();
        if (l == null || !TextUtils.equals(l.getConfig(this.v, "reset_mtop_pagename_and_pageurl", "true"), "true")) {
            return;
        }
        a.c("PageName", "");
        a.c("PageUrl", "");
    }

    @Override // com.taobao.weex.WXSDKInstance
    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        h();
    }

    @Override // com.taobao.weex.WXSDKInstance
    public WXSDKInstance f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("79f1320b", new Object[]{this});
        }
        AliWXSDKInstance aliWXSDKInstance = new AliWXSDKInstance(O(), this.f2002a);
        aliWXSDKInstance.a(this.c);
        return aliWXSDKInstance;
    }

    @Override // com.taobao.weex.ui.component.EmbedManager
    public IWXEmbed getEmbed(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXEmbed) ipChange.ipc$dispatch("bc959b24", new Object[]{this, str}) : this.b.get(str);
    }

    @Override // com.taobao.weex.ui.component.EmbedManager
    public void putEmbed(String str, IWXEmbed iWXEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7a5fc5", new Object[]{this, str, iWXEmbed});
        } else {
            this.b.put(str, iWXEmbed);
        }
    }

    public void putExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a756e", new Object[]{this, str, obj});
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            this.x.put(str, obj);
        }
    }

    public void removeExtra(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67551f7d", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.x.remove(str);
        }
    }

    @Deprecated
    public Object getExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ab8f58b", new Object[]{this, str, obj}) : getExtra(str);
    }

    public Object getExtra(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("91ec6527", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (map = this.x) == null) {
            return null;
        }
        return map.get(str);
    }
}
