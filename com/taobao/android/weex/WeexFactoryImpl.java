package com.taobao.android.weex;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.android.weex.instance.WeexCanalMainInstance;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex.instance.WeexMUSInstance;
import com.taobao.android.weex.instance.WeexScriptOnlyInstance;
import com.taobao.android.weex.instance.WeexXRInstance;
import com.taobao.android.weex_framework.MUSEngine;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import tb.jtz;
import tb.jvb;
import tb.jvw;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexFactoryImpl extends a implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int mMaxSingleUrlInstanceQueueSize = 1;
    private HashMap<String, LinkedList<WeexInstance>> mWeexInstanceQueuesMap = new HashMap<>();

    /* renamed from: com.taobao.android.weex.WeexFactoryImpl$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15835a = new int[WeexInstanceMode.values().length];

        static {
            try {
                f15835a[WeexInstanceMode.DOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15835a[WeexInstanceMode.MUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15835a[WeexInstanceMode.XR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15835a[WeexInstanceMode.CANAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15835a[WeexInstanceMode.SCRIPT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(1199501486);
        kge.a(1028243835);
    }

    public WeexInstance createInstanceInternal(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar, jvb jvbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("e4fe39ce", new Object[]{this, context, str, weexInstanceMode, weexRenderType, jSONObject, bVar, jvbVar, new Boolean(z)});
        }
        MUSEngine.isInitDone();
        jvb jvbVar2 = jvbVar == null ? new jvb(context, null) : jvbVar;
        Pair<String, String> a2 = com.taobao.android.weex.util.b.a(str);
        g gVar = new g(context, (String) a2.first, (String) a2.second, null, null);
        gVar.f = jSONObject;
        gVar.g = bVar;
        gVar.l = jvbVar2;
        gVar.k = z;
        int i = AnonymousClass1.f15835a[weexInstanceMode.ordinal()];
        if (i == 1) {
            gVar.d = WeexInstanceInternalMode.DOM;
            gVar.e = WeexRenderType.UNICORN;
            return WeexDOMInstance.create(gVar);
        } else if (i == 2) {
            gVar.d = WeexInstanceInternalMode.MUS;
            gVar.e = WeexRenderType.UIKIT;
            return WeexMUSInstance.create(gVar);
        } else if (i == 3) {
            gVar.d = WeexInstanceInternalMode.XR;
            gVar.e = WeexRenderType.UNICORN;
            return WeexXRInstance.create(gVar);
        } else if (i == 4) {
            gVar.d = WeexInstanceInternalMode.CANAL_MAIN;
            gVar.e = WeexRenderType.NONE;
            return WeexCanalMainInstance.create(gVar);
        } else if (i != 5) {
            return null;
        } else {
            gVar.d = WeexInstanceInternalMode.SCRIPT;
            gVar.e = WeexRenderType.NONE;
            return WeexScriptOnlyInstance.create(gVar);
        }
    }

    @Override // com.taobao.android.weex.a
    public WeexInstance createInstance(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("e31e401d", new Object[]{this, context, str, weexInstanceMode, weexRenderType, jSONObject, bVar}) : createInstanceInternal(context, str, weexInstanceMode, weexRenderType, jSONObject, bVar, null, false);
    }

    @Override // com.taobao.android.weex.a
    public q createInstanceAsync(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("1dc45c0c", new Object[]{this, context, str, weexInstanceMode, weexRenderType, jSONObject, bVar}) : new r(context, str, weexInstanceMode, weexRenderType, jSONObject, bVar);
    }

    @Override // com.taobao.android.weex.a
    public j getDownloader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("7412e7d4", new Object[]{this}) : k.a();
    }

    @Override // com.taobao.android.weex.a
    public l getValueFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("5dc45eb6", new Object[]{this}) : m.a();
    }

    @Override // com.taobao.android.weex.a
    public c getEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("46bd2448", new Object[]{this}) : d.a();
    }

    @Override // com.taobao.android.weex.a
    public e.a preCreateInstance(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, com.taobao.android.weex.config.b bVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e.a) ipChange.ipc$dispatch("9f5e8868", new Object[]{this, context, str, jSONObject, jSONObject2, bVar, hVar});
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.android.weex_framework.util.g.d("preCreateInstance failed, url is null");
            return new e.a(false, "preCreateInstance failed, url is null");
        }
        Pair<String, String> a2 = com.taobao.android.weex.util.b.a(str);
        String b = com.taobao.android.weex.util.b.b(str);
        LinkedList<WeexInstance> linkedList = this.mWeexInstanceQueuesMap.get(b);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.mWeexInstanceQueuesMap.put(b, linkedList);
        } else if (linkedList.size() > 0) {
            com.taobao.android.weex_framework.util.g.b("queue is full , size = 1");
            return new e.a(false, "queue is full , size = 1");
        }
        LinkedList<WeexInstance> linkedList2 = linkedList;
        g gVar = new g(context, (String) a2.first, (String) a2.second, WeexInstanceInternalMode.DOM, WeexRenderType.UNICORN);
        gVar.f = jSONObject;
        gVar.g = bVar;
        gVar.l = new jvb(context, null);
        WeexDOMInstance create = WeexDOMInstance.create(gVar);
        create.initWithURL(str);
        create.render(e.b().a(jSONObject2));
        if (hVar != null) {
            create.addInstanceListener(hVar);
        }
        jtz jtzVar = (jtz) create.getExtend(jtz.class);
        if (jtzVar != null) {
            jtzVar.a(jvw.KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER, "true");
        }
        com.taobao.android.weex_framework.util.g.b("preCreateInstance 创建完毕:" + create.getInstanceId());
        linkedList2.add(create);
        return new e.a(true, "");
    }

    @Override // com.taobao.android.weex.a
    public WeexInstance getPreInstance(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("a7f90fcb", new Object[]{this, context, str});
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.android.weex_framework.util.g.d("getPreInstance failed, bundleUrl is null");
            return null;
        }
        LinkedList<WeexInstance> linkedList = this.mWeexInstanceQueuesMap.get(str);
        if (linkedList == null || linkedList.size() <= 0) {
            return null;
        }
        com.taobao.android.weex_framework.util.g.b("getPreInstance size---->" + linkedList.size());
        WeexInstance poll = linkedList.poll();
        if (poll != null) {
            WeexInstanceStatus instanceStatus = poll.getInstanceStatus();
            if (instanceStatus == WeexInstanceStatus.INVALID || instanceStatus == WeexInstanceStatus.DESTROYED) {
                poll.destroy();
            } else {
                poll.resetContext(context);
            }
        }
        return poll;
    }

    @Override // com.taobao.android.weex.a
    public void destroyPreInstanceWithUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8926453c", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.android.weex_framework.util.g.d("clearPreInstanceWithUrl failed, bundleUrl is null");
        }
        LinkedList<WeexInstance> linkedList = this.mWeexInstanceQueuesMap.get(str);
        if (linkedList == null) {
            return;
        }
        while (!linkedList.isEmpty()) {
            WeexInstance poll = linkedList.poll();
            if (poll != null) {
                poll.destroy();
            }
        }
    }
}
