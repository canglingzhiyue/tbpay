package com.taobao.tinct.impl.collect;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ChangeRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "orange")
    public ConcurrentHashMap<String, OrangeChangeInfo> orangeChangeMap = new ConcurrentHashMap<>();
    @JSONField(deserialize = false, name = TBSearchChiTuJSBridge.ABTEST, serialize = false)
    public ConcurrentHashMap<Integer, ABChangeInfo> abInfoMap = new ConcurrentHashMap<>();
    @JSONField(deserialize = false, name = Baggage.Amnet.SECURITY_INSTANT, serialize = false)
    public InstantPatchChangeInfo instantPatchInfo = null;
    @JSONField(deserialize = false, name = com.taobao.android.weex_framework.util.a.ATOM_EXT_inline, serialize = false)
    public com.taobao.tinct.model.b inlinePatchInfo = null;
    @JSONField(deserialize = false, name = "ts", serialize = false)
    public ConcurrentHashMap<String, List<com.taobao.tinct.model.c>> touchStoneInfo = new ConcurrentHashMap<>();
    @JSONField(name = "custom")
    public Map<String, CustomChangeInfo> customInfo = new ConcurrentHashMap();
    @JSONField(deserialize = false, name = "dynamic", serialize = false)
    public com.taobao.tinct.model.a dynamicChangeInfo = null;

    @JSONField(serialize = false)
    public String getCustomTinctTag() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3eaf9362", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<com.taobao.tinct.model.c>> entry : this.touchStoneInfo.entrySet()) {
            for (com.taobao.tinct.model.c cVar : entry.getValue()) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(cVar.getTinctTag());
                z = false;
            }
        }
        for (CustomChangeInfo customChangeInfo : this.customInfo.values()) {
            if (!customChangeInfo.isExpire()) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(customChangeInfo.getTinctTag());
                z = false;
            }
        }
        com.taobao.tinct.model.b bVar = this.inlinePatchInfo;
        if (bVar != null && !TextUtils.isEmpty(bVar.getVersion())) {
            if (!z) {
                sb.append("^");
            }
            sb.append(this.inlinePatchInfo.getTinctTag());
            z = false;
        }
        com.taobao.tinct.model.a aVar = this.dynamicChangeInfo;
        if (aVar != null && aVar.a()) {
            if (!z) {
                sb.append("^");
            }
            sb.append(this.dynamicChangeInfo.getTinctTag());
        }
        return sb.toString();
    }
}
