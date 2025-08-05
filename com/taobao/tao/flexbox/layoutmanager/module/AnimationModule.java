package com.taobao.tao.flexbox.layoutmanager.module;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.oek;
import tb.oel;
import tb.ofh;
import tb.ogg;

/* loaded from: classes8.dex */
public class AnimationModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1792473642);
        kge.a(-818961104);
    }

    private static void executeAnimation(g.c cVar, AnimatorSet animatorSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e506508", new Object[]{cVar, animatorSet});
        } else if (animatorSet == null || animatorSet.getChildAnimations().isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) false);
            cVar.c.a(cVar, jSONObject);
        } else {
            animatorSet.start();
        }
    }

    public static void animate(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62f9297", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) cVar.b;
            int intValue = jSONObject.getIntValue("target");
            Object obj = jSONObject.get("options");
            if (isLottieAnimation(obj)) {
                executeLottieAnimation(cVar, intValue, obj);
                return;
            }
            AnimatorSet animatorSet = null;
            try {
                if (obj instanceof JSONArray) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = true;
                    for (int i = 0; i < ((JSONArray) obj).size(); i++) {
                        JSONObject jSONObject2 = ((JSONArray) obj).getJSONObject(i);
                        if (oec.a(jSONObject2.get("group"), false)) {
                            z = false;
                        }
                        arrayList.add(oek.a(cVar.f19938a, cVar.a(), intValue, jSONObject2));
                    }
                    animatorSet = oel.a(cVar.f19938a, intValue, arrayList, z, new oel.b(new oel.a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AnimationModule.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.oel.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("succeed", (Object) true);
                            g.c.this.c.a(g.c.this, jSONObject3);
                        }
                    }));
                } else {
                    animatorSet = oel.a(cVar.f19938a, intValue, oek.a(cVar.f19938a, cVar.a(), intValue, jSONObject.getJSONObject("options")), new oel.b(new oel.a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.AnimationModule.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.oel.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("succeed", (Object) true);
                            g.c.this.c.a(g.c.this, jSONObject3);
                        }
                    }));
                }
            } catch (Exception e) {
                ogg.a("Animation", e.getMessage());
            }
            executeAnimation(cVar, animatorSet);
        }
    }

    private static void executeLottieAnimation(g.c cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31eb7437", new Object[]{cVar, new Integer(i), obj});
        } else {
            new ofh(cVar, i, obj).a();
        }
    }

    private static boolean isLottieAnimation(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9547ea82", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 0) {
                Object obj2 = list.get(0);
                if (obj2 instanceof Map) {
                    return isLottieType((Map) obj2);
                }
                return false;
            }
        }
        if (obj instanceof Map) {
            return isLottieType((Map) obj);
        }
        return false;
    }

    private static boolean isLottieType(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c37caff", new Object[]{map})).booleanValue() : TextUtils.equals(oec.a(map.get("type"), (String) null), "lottie");
    }
}
