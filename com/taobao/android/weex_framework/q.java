package com.taobao.android.weex_framework;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexFactoryImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.jvb;
import tb.jvw;
import tb.kge;
import tb.tbt;

@Deprecated
/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile ConcurrentHashMap<String, ConcurrentLinkedQueue<MUSDKInstance>> f16071a;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static q f16072a;

        static {
            kge.a(-1091332630);
            f16072a = new q();
        }

        public static /* synthetic */ q a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("8088e604", new Object[0]) : f16072a;
        }
    }

    static {
        kge.a(514915910);
    }

    private q() {
        this.f16071a = new ConcurrentHashMap<>();
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("8088e604", new Object[0]) : a.a();
    }

    public p a(Context context, MUSInstanceConfig mUSInstanceConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("92f74098", new Object[]{this, context, mUSInstanceConfig}) : b(context, mUSInstanceConfig);
    }

    private p b(Context context, MUSInstanceConfig mUSInstanceConfig) {
        boolean z;
        boolean z2;
        WeexInstanceMode weexInstanceMode;
        WeexRenderType weexRenderType;
        String str;
        b bVar;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("6cc10dd9", new Object[]{this, context, mUSInstanceConfig});
        }
        jvb jvbVar = new jvb(context, mUSInstanceConfig);
        WeexInstanceMode weexInstanceMode2 = WeexInstanceMode.MUS;
        WeexRenderType weexRenderType2 = WeexRenderType.NONE;
        MUSInstanceConfig.MUSRenderType mUSRenderType = MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnspecific;
        if (mUSInstanceConfig != null) {
            mUSInstanceConfig.j();
            z3 = mUSInstanceConfig.e();
            z = mUSInstanceConfig.f();
            z2 = mUSInstanceConfig.g();
        } else {
            z = false;
            z2 = false;
        }
        if (z2) {
            weexInstanceMode = WeexInstanceMode.SCRIPT;
            weexRenderType = WeexRenderType.NONE;
        } else if (z) {
            weexInstanceMode = WeexInstanceMode.XR;
            weexRenderType = WeexRenderType.UNICORN;
        } else if (z3) {
            weexInstanceMode = WeexInstanceMode.DOM;
            weexRenderType = WeexRenderType.UNICORN;
        } else {
            weexInstanceMode = WeexInstanceMode.MUS;
            weexRenderType = WeexRenderType.UIKIT;
        }
        WeexInstanceMode weexInstanceMode3 = weexInstanceMode;
        WeexRenderType weexRenderType3 = weexRenderType;
        b bVar2 = null;
        if (mUSInstanceConfig != null) {
            String c = mUSInstanceConfig.c();
            if (weexRenderType3 == WeexRenderType.UNICORN) {
                bVar2 = new b();
                WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
                bVar2.a(weexUnicornConfig);
                bVar2.a(mUSInstanceConfig.b());
                HashMap<String, String> y = mUSInstanceConfig.y();
                if (y != null) {
                    weexUnicornConfig.c().putAll(y);
                }
                weexUnicornConfig.a(mUSInstanceConfig.m());
                weexUnicornConfig.a(true ^ mUSInstanceConfig.i());
                weexUnicornConfig.a(WeexUnicornConfig.RenderMode.values()[mUSInstanceConfig.l().ordinal()]);
            } else if (weexInstanceMode3 == WeexInstanceMode.MUS) {
                bVar2 = new b();
                com.taobao.android.weex.config.c cVar = new com.taobao.android.weex.config.c();
                bVar2.a(cVar);
                bVar2.a(bVar2.c());
                cVar.a(mUSInstanceConfig.n());
                cVar.b(mUSInstanceConfig.p());
            }
            bVar = bVar2;
            str = c;
        } else {
            str = null;
            bVar = null;
        }
        ((WeexFactoryImpl) com.taobao.android.weex.a.getInstance()).createInstanceInternal(context, str, weexInstanceMode3, weexRenderType3, null, bVar, jvbVar, false);
        return jvbVar;
    }

    public p a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("78df41dd", new Object[]{this, context}) : b(context, null);
    }

    public void a(Context context, MUSInstanceConfig mUSInstanceConfig, JSONObject jSONObject, int i, int i2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec769cd5", new Object[]{this, context, mUSInstanceConfig, jSONObject, new Integer(i), new Integer(i2)});
        } else if (context == null) {
        } else {
            String string = jSONObject.getString("bizName");
            if (TextUtils.isEmpty(string)) {
                com.taobao.android.weex_framework.util.g.d("preLoadWeexInstance failed, bizName is null");
                return;
            }
            if (this.f16071a.get(string) == null) {
                this.f16071a.put(string, new ConcurrentLinkedQueue<>());
            }
            jSONObject.getString("wlmUrl");
            String string2 = jSONObject.getString("bundleUrl");
            JSONObject jSONObject2 = jSONObject.getJSONObject("initData");
            JSONObject jSONObject3 = jSONObject.getJSONObject("options");
            boolean z = jSONObject.containsKey(tbt.PRE_RENDER) && jSONObject.getBoolean(tbt.PRE_RENDER).booleanValue();
            boolean z2 = jSONObject.containsKey("onlyInit") && jSONObject.getBoolean("onlyInit").booleanValue();
            if (!TextUtils.isEmpty(string2) && (parse = Uri.parse(string2)) != null && parse.isHierarchical()) {
                string2 = parse.buildUpon().appendQueryParameter("isPreload", "true").build().toString();
            }
            ConcurrentLinkedQueue<MUSDKInstance> concurrentLinkedQueue = this.f16071a.get(string);
            if (concurrentLinkedQueue == null) {
                return;
            }
            com.taobao.android.weex_framework.util.g.b("preInitWithUrl size---->" + concurrentLinkedQueue.size());
            if (concurrentLinkedQueue.size() > 0) {
                return;
            }
            if (mUSInstanceConfig == null) {
                mUSInstanceConfig = new MUSInstanceConfig();
            }
            if (TextUtils.isEmpty(mUSInstanceConfig.c())) {
                mUSInstanceConfig.c(string2);
            }
            mUSInstanceConfig.a(true);
            MUSDKInstance mUSDKInstance = (MUSDKInstance) a(context, mUSInstanceConfig);
            if (z) {
                mUSDKInstance.onPreRendering(i, i2);
            }
            if (i != 0 && i2 != 0) {
                mUSDKInstance.setConstrainedSize(new com.taobao.android.weex_framework.ui.a(i, i2));
            }
            mUSDKInstance.initWithURL(Uri.parse(string2));
            if (z || !z2) {
                mUSDKInstance.render(jSONObject2, jSONObject3);
                mUSDKInstance.fireGlobalEvent(Constants.Event.RESUME_EVENT, new Object[0]);
                if (mUSDKInstance.getWeexInstanceApm() != null) {
                    mUSDKInstance.getWeexInstanceApm().a(jvw.KEY_PAGE_PROPERTIES_INSTANCE_PRE_RENDER, "true");
                }
            }
            com.taobao.android.weex_framework.util.g.b("preInitWithUrl 创建---->" + mUSDKInstance.getInstanceId());
            concurrentLinkedQueue.add(mUSDKInstance);
        }
    }

    public MUSDKInstance a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("f81e36a4", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.android.weex_framework.util.g.d("getReadyInstance failed, bizName is null");
            return null;
        }
        boolean z = jSONObject.containsKey(tbt.PRE_RENDER) && jSONObject.getBoolean(tbt.PRE_RENDER).booleanValue();
        ConcurrentLinkedQueue<MUSDKInstance> concurrentLinkedQueue = this.f16071a.get(str);
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        com.taobao.android.weex_framework.util.g.b("getCacheInstanceWithURL size---->" + concurrentLinkedQueue.size());
        MUSDKInstance poll = concurrentLinkedQueue.poll();
        if (poll != null) {
            if (poll.isInvalid()) {
                poll.destroy();
                return null;
            }
            poll.fireGlobalEvent("onPageOpen", jSONObject);
        }
        if (z && poll != null) {
            com.taobao.android.weex_framework.util.g.b("getCacheInstanceWithURL 获取---->" + poll.getInstanceId());
            poll.fireEvent(0, "load", new JSONObject());
            poll.onScreenRendering();
        }
        return poll;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f16071a != null) {
            for (String str : this.f16071a.keySet()) {
                ConcurrentLinkedQueue<MUSDKInstance> concurrentLinkedQueue = this.f16071a.get(str);
                if (concurrentLinkedQueue != null) {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        MUSDKInstance poll = concurrentLinkedQueue.poll();
                        if (poll != null) {
                            poll.destroy();
                        }
                    }
                }
            }
        }
    }
}
