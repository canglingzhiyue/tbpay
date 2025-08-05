package com.taobao.android.litecreator.base.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.d;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\u001f\u0010\t\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0012\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R5\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/taobao/android/litecreator/base/data/meta/UGCBase;", "Lcom/taobao/android/litecreator/base/data/meta/IMeta;", "Lcom/taobao/android/litecreator/base/data/meta/IStatInfo;", "Ljava/io/Serializable;", "()V", "meta", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getMeta", "()Ljava/util/HashMap;", "addExtraInfoMeta", "", "key", "value", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "removeExtraInfoMeta", "setMeta", "statInfo", "Lcom/taobao/android/litecreator/base/data/meta/MediaStatInfo;", d.PARAM_SESSION_ID, "litecreator_protocol_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class UGCBase implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HashMap<String, Serializable> meta = new HashMap<>();

    static {
        kge.a(602164835);
        kge.a(-524208593);
        kge.a(-44855220);
        kge.a(1028243835);
    }

    public final HashMap<String, Serializable> getMeta() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3ef5e665", new Object[]{this}) : this.meta;
    }

    @Override // com.taobao.android.litecreator.base.data.meta.a
    public void setMeta(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0456ec", new Object[]{this, str, serializable});
        } else {
            this.meta.put(str, serializable);
        }
    }

    @Override // com.taobao.android.litecreator.base.data.meta.a
    public void addExtraInfoMeta(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2b09c7", new Object[]{this, str, serializable});
            return;
        }
        JSONObject jSONObject = (JSONObject) getMeta("extraInfo");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put((JSONObject) str, (String) serializable);
        setMeta("extraInfo", jSONObject);
    }

    @Override // com.taobao.android.litecreator.base.data.meta.a
    public void removeExtraInfoMeta(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4233f730", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = (JSONObject) getMeta("extraInfo");
        if (jSONObject == null) {
            return;
        }
        jSONObject.remove(str);
    }

    @Override // com.taobao.android.litecreator.base.data.meta.a
    public <T> T getMeta(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a306ade6", new Object[]{this, str});
        }
        if (!this.meta.containsKey(str)) {
            return null;
        }
        T t = (T) this.meta.get(str);
        if (t instanceof Object) {
            return t;
        }
        return null;
    }

    public MediaStatInfo statInfo(String sessionID) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaStatInfo) ipChange.ipc$dispatch("91c60b7d", new Object[]{this, sessionID});
        }
        q.d(sessionID, "sessionID");
        MediaStatInfo mediaStatInfo = (MediaStatInfo) getMeta("mediaStatInfo");
        if (mediaStatInfo != null) {
            return mediaStatInfo;
        }
        MediaStatInfo mediaStatInfo2 = new MediaStatInfo(sessionID);
        setMeta("mediaStatInfo", mediaStatInfo2);
        return mediaStatInfo2;
    }

    public MediaStatInfo statInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaStatInfo) ipChange.ipc$dispatch("772354f3", new Object[]{this}) : statInfo("");
    }
}
