package com.taobao.android.tbabilitykit.weex.pop.render;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.jal;
import tb.kge;

/* loaded from: classes.dex */
public class TAKAbilityHubModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1039107770);
    }

    public static /* synthetic */ Object ipc$super(TAKAbilityHubModule tAKAbilityHubModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TAKAbilityHubModule tAKAbilityHubModule, String str, int i, String str2, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7060c9", new Object[]{tAKAbilityHubModule, str, new Integer(i), str2, jSCallback});
        } else {
            tAKAbilityHubModule.errorCallback(str, i, str2, jSCallback);
        }
    }

    public static /* synthetic */ void access$100(TAKAbilityHubModule tAKAbilityHubModule, String str, Object obj, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad9a9bf", new Object[]{tAKAbilityHubModule, str, obj, jSCallback});
        } else {
            tAKAbilityHubModule.successCallback(str, obj, jSCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @com.taobao.weex.annotation.JSMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatch(java.lang.String r6, com.alibaba.fastjson.JSONObject r7, final com.taobao.weex.bridge.JSCallback r8) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            r6 = 3
            r1[r6] = r8
            java.lang.String r6 = "59bf01a3"
            r0.ipc$dispatch(r6, r1)
            return
        L1b:
            com.taobao.weex.WXSDKInstance r0 = r5.mWXSDKInstance
            if (r0 != 0) goto L29
            r6 = -1
            java.lang.String r7 = ""
            java.lang.String r0 = "内部错误"
            r5.errorCallback(r7, r6, r0, r8)
            return
        L29:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L3a
            java.lang.String r1 = "type"
            r0.put(r1, r6)
        L3a:
            if (r7 == 0) goto L42
            java.lang.String r6 = "params"
            r0.put(r6, r7)
        L42:
            com.taobao.weex.WXSDKInstance r6 = r5.mWXSDKInstance
            android.view.View r6 = r6.am()
            r7 = 0
            if (r6 == 0) goto L58
            int r1 = com.taobao.taobao.R.id.tak_pop_ability_engine_tag
            java.lang.Object r1 = r6.getTag(r1)
            boolean r2 = r1 instanceof tb.dkt
            if (r2 == 0) goto L58
            tb.dkt r1 = (tb.dkt) r1
            goto L59
        L58:
            r1 = r7
        L59:
            if (r1 != 0) goto L6a
            tb.dkt r1 = new tb.dkt
            tb.alr r2 = new tb.alr
            java.lang.String r3 = "AbilityKit"
            java.lang.String r4 = "weex_hub"
            r2.<init>(r3, r4)
            r1.<init>(r2, r7)
        L6a:
            tb.dlr r7 = new tb.dlr
            r7.<init>()
            com.taobao.weex.WXSDKInstance r2 = r5.mWXSDKInstance
            android.content.Context r2 = r2.M()
            r7.a(r2)
            r7.a(r6)
            tb.dlh r6 = new tb.dlh
            r6.<init>(r0)
            com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule$1 r0 = new com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule$1
            r0.<init>()
            r1.a(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule.dispatch(java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.weex.bridge.JSCallback):void");
    }

    private void successCallback(String str, Object obj, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cf4ed3", new Object[]{this, str, obj, jSCallback});
        } else if (jSCallback == null) {
        } else {
            jSCallback.invoke(jal.a(str, obj));
        }
    }

    private void errorCallback(String str, int i, String str2, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afecfa19", new Object[]{this, str, new Integer(i), str2, jSCallback});
        } else if (jSCallback == null) {
        } else {
            jSCallback.invoke(jal.a(str, i, str2));
        }
    }
}
