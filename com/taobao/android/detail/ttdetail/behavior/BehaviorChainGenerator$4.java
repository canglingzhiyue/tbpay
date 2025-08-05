package com.taobao.android.detail.ttdetail.behavior;

import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: classes4.dex */
public class BehaviorChainGenerator$4 extends JSONObject {
    public final /* synthetic */ int val$floatBehaviorType;
    public final /* synthetic */ Map val$floatContentInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BehaviorChainGenerator$4(boolean z, int i, Map map) {
        super(z);
        this.val$floatBehaviorType = i;
        this.val$floatContentInfo = map;
        put("behavior_type", (Object) a.f(this.val$floatBehaviorType));
        put("time_stamp", (Object) String.valueOf(System.currentTimeMillis()));
        Map map2 = this.val$floatContentInfo;
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        put("content_info", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.behavior.BehaviorChainGenerator$4.1
            {
                putAll(BehaviorChainGenerator$4.this.val$floatContentInfo);
            }
        });
    }
}
