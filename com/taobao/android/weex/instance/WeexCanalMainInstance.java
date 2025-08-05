package com.taobao.android.weex.instance;

import android.content.Context;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.g;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.u;
import com.taobao.android.weex_framework.util.t;
import java.util.ArrayList;
import java.util.HashMap;
import tb.juc;
import tb.juh;
import tb.juk;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexCanalMainInstance extends WeexScriptOnlyInstance implements juc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private u.b f15867a;
    private final ArrayList<String> b;

    static {
        kge.a(255111433);
        kge.a(-2005205855);
    }

    public static /* synthetic */ Object ipc$super(WeexCanalMainInstance weexCanalMainInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 743373420) {
            if (hashCode != 939513102) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDestroyStart();
            return null;
        }
        return super.getExtend((Class) objArr[0]);
    }

    public static WeexCanalMainInstance create(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCanalMainInstance) ipChange.ipc$dispatch("2e3ec2a", new Object[]{gVar});
        }
        WeexCanalMainInstance weexCanalMainInstance = new WeexCanalMainInstance(gVar);
        postInstanceCreate(weexCanalMainInstance, gVar.l);
        t.a(weexCanalMainInstance.getInstanceId(), e.RECORD_CREATE_CANAL_MAIN_INSTANCE, gVar.b, gVar.f);
        return weexCanalMainInstance;
    }

    private WeexCanalMainInstance(g gVar) {
        super(gVar);
        this.b = new ArrayList<>();
        HashMap hashMap = new HashMap();
        hashMap.put("enable-share-thread", "false");
        ArrayList<String> arrayList = this.b;
        juk.a(arrayList, (HashMap<String, String>) hashMap, getInstanceId() + "", true);
        this.b.addAll(getRenderEngineOptions());
    }

    @Override // com.taobao.android.weex.instance.WeexScriptOnlyInstance, com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls}) : cls == juc.class ? this : (T) super.getExtend(cls);
    }

    public u.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u.b) ipChange.ipc$dispatch("81e8fc42", new Object[]{this}) : this.f15867a;
    }

    public void a(u.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41eda782", new Object[]{this, bVar});
        } else {
            this.f15867a = bVar;
        }
    }

    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("2f3d5943", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
            return;
        }
        u.b bVar = this.f15867a;
        if (bVar != null) {
            bVar.a();
        }
        super.onDestroyStart();
    }

    @Override // tb.juc
    public WeexInstance a(Context context, String str, JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("a134aa4f", new Object[]{this, context, str, jSONObject, bVar});
        }
        Pair<String, String> a2 = com.taobao.android.weex.util.b.a(str);
        WeexCanalSubInstance a3 = WeexCanalSubInstance.a(context, (String) a2.first, (String) a2.second, this, jSONObject, bVar, new jvb(context, null), null, 0);
        t.a(a3.getInstanceId(), e.RECORD_CREATE_CANAL_CHILD_INSTANCE, Integer.valueOf(getInstanceId()), str, jSONObject, a3);
        t.a(a3.getInstanceId(), "environment", null, null, m.e());
        return a3;
    }

    @Override // tb.juc
    public WeexInstance a(Context context, String str, JSONObject jSONObject, b bVar, WeexInstance weexInstance, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("286957b4", new Object[]{this, context, str, jSONObject, bVar, weexInstance, new Integer(i)});
        }
        Pair<String, String> a2 = com.taobao.android.weex.util.b.a(str);
        juk jukVar = (juk) weexInstance.getExtend(juh.class);
        WeexCanalSubInstance a3 = WeexCanalSubInstance.a(context, (String) a2.first, (String) a2.second, this, jSONObject, bVar, new jvb(context, null), (WeexInstanceImpl) weexInstance, i);
        jukVar.a(i, a3);
        return a3;
    }

    @Override // tb.juc
    public void registerSourceMapURL(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648f8dcc", new Object[]{this, str, str2});
        } else if (isDestroyed()) {
        } else {
            WeexPlatformInstanceBridge.registerSourceMapURL(this.mNativePtr, str, str2);
        }
    }
}
