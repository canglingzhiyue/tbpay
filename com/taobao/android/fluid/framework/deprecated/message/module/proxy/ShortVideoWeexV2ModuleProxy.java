package com.taobao.android.fluid.framework.deprecated.message.module.proxy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import java.io.Serializable;
import java.util.HashMap;
import tb.jwl;
import tb.kge;
import tb.oec;
import tb.ohd;
import tb.sly;
import tb.sma;
import tb.soh;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class ShortVideoWeexV2ModuleProxy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoWeexV2ModuleProxy";
    private final MUSModule mMUSModule;

    static {
        kge.a(-578192867);
        kge.a(1028243835);
    }

    public ShortVideoWeexV2ModuleProxy(MUSModule mUSModule) {
        this.mMUSModule = mUSModule;
        spz.c(TAG, "新架构初始化 ShortVideoWeexV2ModuleProxy");
    }

    private static boolean checkNotifyValid(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e49860bf", new Object[]{pVar})).booleanValue();
        }
        if (pVar == null || pVar.isDestroyed() || pVar.isInvalid()) {
            return false;
        }
        return !(pVar.getUIContext() instanceof Activity) || !((Activity) pVar.getContext().a()).isFinishing();
    }

    private static void putIntentExtra(Intent intent, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939caf", new Object[]{intent, str, obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Integer) {
                intent.putExtra(str, ((Integer) obj).intValue());
            } else if (obj instanceof Float) {
                intent.putExtra(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                intent.putExtra(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                intent.putExtra(str, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                intent.putExtra(str, ((Short) obj).shortValue());
            } else if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof CharSequence) {
                intent.putExtra(str, (CharSequence) obj);
            } else if (obj instanceof Character) {
                intent.putExtra(str, ((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                intent.putExtra(str, ((Byte) obj).byteValue());
            } else {
                intent.putExtra(str, obj.toString());
            }
        }
    }

    public void sendMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6326634a", new Object[]{this, jSONObject});
        } else {
            sendMessageAsync(jSONObject, null);
        }
    }

    public void sendMessageAsync(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb05123", new Object[]{this, jSONObject, bVar});
        } else if (!isFluidArchitecture()) {
        } else {
            sly slyVar = null;
            if (bVar != null) {
                slyVar = new sly(bVar);
            }
            spy spyVar = new spy(jSONObject, slyVar);
            ((sma) this.mMUSModule.getInstance().getRenderRoot().getTag()).sendMessage(spyVar);
            spz.c(TAG, "新架构 Weex 2 页面发送消息 sendMessageAsync: " + spyVar);
        }
    }

    public void postNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d380e0", new Object[]{this, jSONObject});
        } else if (isFluidArchitecture()) {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                Intent intent = new Intent(string);
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (oec.a(jSONObject.get("appear"), false) && !checkNotifyValid(this.mMUSModule.getInstance())) {
                    return;
                }
                if (jSONObject2 != null && jSONObject2.keySet() != null) {
                    for (String str : jSONObject2.keySet()) {
                        putIntentExtra(intent, str, jSONObject2.get(str));
                    }
                }
                LocalBroadcastManager.getInstance(this.mMUSModule.getInstance().getUIContext()).sendBroadcast(intent);
            }
            spz.c(TAG, "新架构 Weex 2 页面发送通知 postNotify : " + string);
        }
    }

    public void onNotify(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f5bcd8", new Object[]{this, jSONObject, bVar});
        } else if (!isFluidArchitecture()) {
        } else {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                a.C0495a c0495a = new a.C0495a(bVar);
                if (oec.a((Object) Integer.valueOf(jSONObject.getIntValue("cnt")), 0) > 0) {
                    c0495a.a(jSONObject.getIntValue("cnt"));
                }
                a.a().a(this.mMUSModule.getInstance(), string, c0495a);
            }
            spz.c(TAG, "新架构 Weex 2 页面注册通知 onNotify : " + string);
        }
    }

    public void offNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4b20b1", new Object[]{this, jSONObject});
        } else if (!isFluidArchitecture()) {
        } else {
            String string = jSONObject.getString("name");
            if (!TextUtils.isEmpty(string)) {
                a.a().a(this.mMUSModule.getInstance(), string);
            }
            spz.c(TAG, "新架构 Weex 2 页面解注册通知 offNotify : " + string);
        }
    }

    public void snapShotVideo(JSONObject jSONObject, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502015c9", new Object[]{this, jSONObject, bVar});
        } else if (!isFluidArchitecture()) {
        } else {
            soh.INSTANCE.a((ViewGroup) soh.INSTANCE.a(this.mMUSModule.getInstance().getRenderView().getParent()), new soh.a() { // from class: com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoWeexV2ModuleProxy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.soh.a
                public void a(Bitmap bitmap, View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8d0544c", new Object[]{this, bitmap, view});
                        return;
                    }
                    HashMap hashMap = new HashMap(5);
                    if (bitmap != null && view != null) {
                        Context context = view.getContext();
                        float e = ohd.e(context, (int) view.getX());
                        float e2 = ohd.e(context, (int) view.getY());
                        int e3 = ohd.e(context, view.getWidth());
                        int e4 = ohd.e(context, view.getHeight());
                        String str = "video_" + System.currentTimeMillis();
                        jwl.a().a(str, bitmap);
                        hashMap.put("view_x", Float.valueOf(e));
                        hashMap.put("view_y", Float.valueOf(e2));
                        hashMap.put("view_w", Integer.valueOf(e3));
                        hashMap.put("view_h", Integer.valueOf(e4));
                        hashMap.put("container_w", Integer.valueOf(e3));
                        hashMap.put("container_h", Integer.valueOf(e4));
                        hashMap.put("file_name", str);
                        spz.c(ShortVideoWeexV2ModuleProxy.TAG, "videoX=" + e + " " + e2 + " " + e3 + " " + e4 + " ;fileName=" + str);
                    }
                    bVar.a(MUSValue.ofJSON(hashMap));
                }
            });
            spz.c(TAG, "新架构 Weex 2 页面截图 snapShotVideo");
        }
    }

    private boolean isFluidArchitecture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("daeb73e", new Object[]{this})).booleanValue() : this.mMUSModule.getInstance().getRenderRoot().getTag() instanceof sma;
    }
}
