package com.taobao.search.jarvis.action;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import kotlin.jvm.internal.q;
import tb.jxs;
import tb.jxt;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class a implements jxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject mActionObject;
    public jxs mJarvisKit;

    /* renamed from: com.taobao.search.jarvis.action.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0761a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jxt b;
        public final /* synthetic */ JSONObject c;

        public RunnableC0761a(jxt jxtVar, JSONObject jSONObject) {
            this.b = jxtVar;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.b.processAction(a.this.getMJarvisKit(), this.c, "");
            }
        }
    }

    static {
        kge.a(1159769615);
        kge.a(-294247333);
    }

    public final jxs getMJarvisKit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jxs) ipChange.ipc$dispatch("85b8c520", new Object[]{this});
        }
        jxs jxsVar = this.mJarvisKit;
        if (jxsVar == null) {
            q.b("mJarvisKit");
        }
        return jxsVar;
    }

    public final void setMJarvisKit(jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821c7078", new Object[]{this, jxsVar});
            return;
        }
        q.c(jxsVar, "<set-?>");
        this.mJarvisKit = jxsVar;
    }

    public final JSONObject getMActionObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("13107013", new Object[]{this});
        }
        JSONObject jSONObject = this.mActionObject;
        if (jSONObject == null) {
            q.b("mActionObject");
        }
        return jSONObject;
    }

    public final void setMActionObject(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd56669", new Object[]{this, jSONObject});
            return;
        }
        q.c(jSONObject, "<set-?>");
        this.mActionObject = jSONObject;
    }

    @Override // tb.jxt
    public void processAction(jxs jarvis, JSONObject actionResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9695ac63", new Object[]{this, jarvis, actionResult, str});
            return;
        }
        q.c(jarvis, "jarvis");
        q.c(actionResult, "actionResult");
        this.mJarvisKit = jarvis;
        this.mActionObject = actionResult;
    }

    public final void triggerSubActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b523487c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mActionObject;
        if (jSONObject == null) {
            q.b("mActionObject");
        }
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "sub_actions");
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = a2.getJSONObject(i);
            String string = jSONObject2.getString("action");
            if (!TextUtils.isEmpty(string)) {
                jxs jxsVar = this.mJarvisKit;
                if (jxsVar == null) {
                    q.b("mJarvisKit");
                }
                jxt a3 = com.taobao.android.xsearchplugin.jarvis.utils.b.a(string, jxsVar);
                if (a3 != null) {
                    q.a((Object) a3, "JarvisKitUtils.getTarget…, mJarvisKit) ?: continue");
                    if (q.a(Looper.myLooper(), Looper.getMainLooper())) {
                        Coordinator.execute(new RunnableC0761a(a3, jSONObject2));
                    } else {
                        jxs jxsVar2 = this.mJarvisKit;
                        if (jxsVar2 == null) {
                            q.b("mJarvisKit");
                        }
                        a3.processAction(jxsVar2, jSONObject2, "");
                    }
                }
            }
        }
    }
}
