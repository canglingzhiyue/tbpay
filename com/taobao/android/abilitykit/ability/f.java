package com.taobao.android.abilitykit.ability;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Queue;
import java.util.StringTokenizer;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.dlq;
import tb.dmp;
import tb.kge;

/* loaded from: classes4.dex */
public class f extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long UPDATE_COMPONENT_KEY = -1873721510059931067L;

    static {
        kge.a(30765557);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null) {
            return a("params is null", true);
        }
        if (dleVar == null) {
            return a("abilityRuntimeContext is null", true);
        }
        dlq c = dleVar.c();
        if (c == null) {
            return a("abilityRuntimeContext.getViewModel() is null", true);
        }
        Object f = dlhVar.f("data");
        if (!(f instanceof JSONObject)) {
            return a("params.data is not JSONObject", true);
        }
        Object f2 = dlhVar.f(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS);
        if (!(f2 instanceof JSONArray)) {
            return a("params.actions is not JSONArray", true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll((JSONObject) f);
            return a(dleVar, c, jSONObject, (JSONArray) f2);
        } catch (Throwable th) {
            return a("executeUpdateActions error " + th.getMessage(), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.dkx a(tb.dle r20, tb.dlq r21, com.alibaba.fastjson.JSONObject r22, com.alibaba.fastjson.JSONArray r23) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.f.a(tb.dle, tb.dlq, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONArray):tb.dkx");
    }

    private void a(String str, Queue<String> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0aab7e", new Object[]{this, str, queue});
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreTokens()) {
            queue.offer(stringTokenizer.nextToken());
        }
    }

    private dkw a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkw) ipChange.ipc$dispatch("5f2b9c94", new Object[]{this, str, new Boolean(z)});
        }
        Log.e(getClass().getSimpleName(), str);
        return new dkw(new dkv(20000, str), z);
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2080799796);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : new f();
        }
    }
}
