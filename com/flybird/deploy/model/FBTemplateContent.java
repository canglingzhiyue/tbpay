package com.flybird.deploy.model;

import android.text.TextUtils;
import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cun;
import tb.idx;
import tb.idy;
import tb.iec;
import tb.ivx;

/* loaded from: classes4.dex */
public class FBTemplateContent extends FBFullTplInfo implements Serializable, idx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1299969776034610457L;
    private final CustomInfoMap _do_not_use_local_map = CustomInfoMap.a();
    public Long dataChecksum;
    public String noBundledCheckedPackageVersionName;
    private iec parsedIdParts;

    private FBTemplateContent() {
    }

    public static void _fromJSONObject(JSONObject jSONObject, FBTemplateContent fBTemplateContent) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037d330", new Object[]{jSONObject, fBTemplateContent});
            return;
        }
        FBFullTplInfo._fromJSONObject(jSONObject, fBTemplateContent);
        fBTemplateContent.noBundledCheckedPackageVersionName = jSONObject.optString("_checkedPackageVersionName_", null);
    }

    public static FBFullTplInfo asFullTplInfo(FBTemplateContent fBTemplateContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBFullTplInfo) ipChange.ipc$dispatch("a760d082", new Object[]{fBTemplateContent});
        }
        fBTemplateContent.data = null;
        return fBTemplateContent;
    }

    public static FBTemplateContent fromDataObject(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBTemplateContent) ipChange.ipc$dispatch("d77d0389", new Object[]{obj}) : fromJsonString(com.flybird.support.basics.b.f7231a.a(obj, (Object) null));
    }

    public static FBTemplateContent fromJSONObject(JSONObject jSONObject) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBTemplateContent) ipChange.ipc$dispatch("4670b179", new Object[]{jSONObject});
        }
        FBTemplateContent fBTemplateContent = new FBTemplateContent();
        _fromJSONObject(jSONObject, fBTemplateContent);
        return fBTemplateContent;
    }

    public static FBTemplateContent fromJsonString(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBTemplateContent) ipChange.ipc$dispatch("c0d2bf4b", new Object[]{str}) : fromJSONObject(new JSONObject(str));
    }

    public static /* synthetic */ Object ipc$super(FBTemplateContent fBTemplateContent, String str, Object... objArr) {
        if (str.hashCode() == -143816359) {
            return new Long(super.toChecksum());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static a toBasicTplInfo(FBTemplateContent fBTemplateContent) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8659f346", new Object[]{fBTemplateContent});
        }
        a aVar = new a();
        aVar.b = fBTemplateContent.tplId;
        aVar.f7220a = fBTemplateContent.tag;
        aVar.f = fBTemplateContent.time;
        aVar.d = fBTemplateContent.tplHash;
        aVar.c = fBTemplateContent.tplVersion;
        aVar.e = fBTemplateContent.publishVersion;
        return aVar;
    }

    public final void a() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.metaInfo == null && !this.triedLoadCompatMetaInfoOnUsage) {
            synchronized (this) {
                try {
                    String str = this.data;
                    if (str == null) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = ConnectionUtils.d(str);
                        } catch (Throwable th) {
                            cun.a(com.alibaba.security.realidentity.b.f3363a, "optJson error", th);
                            jSONObject = new JSONObject();
                        }
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("children");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            try {
                                jSONObject2 = optJSONArray.optJSONObject(i);
                            } catch (Throwable th2) {
                                cun.a(com.alibaba.security.realidentity.b.f3363a, "error while findJSONObjectFromArray", th2);
                            }
                            if (TextUtils.equals(jSONObject2.optString("tag"), ivx.IMAGE_TYPE_HEAD)) {
                                break;
                            }
                        }
                    }
                    jSONObject2 = null;
                    if (jSONObject2 != null) {
                        JSONArray optJSONArray2 = jSONObject2.optJSONArray("children");
                        ArrayList arrayList = new ArrayList();
                        if (optJSONArray2 != null) {
                            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                try {
                                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                                    if (TextUtils.equals(optJSONObject.optString("tag"), "meta")) {
                                        arrayList.add(optJSONObject);
                                    }
                                } catch (Throwable th3) {
                                    cun.a(com.alibaba.security.realidentity.b.f3363a, "error while findJSONObjectFromArray", th3);
                                }
                            }
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObject4 = (JSONObject) it.next();
                            jSONObject3.put(jSONObject4.optString("name"), jSONObject4.optString("content"));
                        }
                        this.metaInfo = jSONObject3;
                    }
                    this.triedLoadCompatMetaInfoOnUsage = true;
                }
            }
        }
    }

    public void addToLocalMap(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63278a28", new Object[]{this, str, str2});
        } else {
            this._do_not_use_local_map.putPreDefEntry(str, str2);
        }
    }

    public void fillTplTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b33b4e9", new Object[]{this, str});
        } else {
            this.tplTrace = str;
        }
    }

    public void generateDataChecksum() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be5eba9", new Object[]{this});
        } else {
            this.dataChecksum = Long.valueOf(idy.a(this.data));
        }
    }

    public Map<String, String> getAllMetaInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8fd2fada", new Object[]{this});
        }
        a();
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            if (jSONObject == null) {
                return new HashMap();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        }
        return new HashMap();
    }

    public String[] getMetaInfoAsList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d3a63a39", new Object[]{this, str});
        }
        a();
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject == null) {
            return null;
        }
        return TextUtils.split(jSONObject.optString(str, ""), ";");
    }

    public String getMetaInfoAsStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c66119", new Object[]{this, str});
        }
        a();
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public String getNoBundledCheckedPkgVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd7006c6", new Object[]{this}) : this.noBundledCheckedPackageVersionName;
    }

    public String getTplName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a334c34", new Object[]{this});
        }
        if (this.parsedIdParts == null) {
            this.parsedIdParts = ConnectionUtils.c(getTplId());
        }
        return this.parsedIdParts.c;
    }

    public boolean hasDataChecksum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27f27ed2", new Object[]{this})).booleanValue() : this.dataChecksum != null;
    }

    public String optFromLocalMap(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b08fa861", new Object[]{this, str}) : this._do_not_use_local_map.optPreDefEntry(str, "");
    }

    public void setNoBundledCheckedPkgVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b2770", new Object[]{this, str});
        } else {
            this.noBundledCheckedPackageVersionName = str;
        }
    }

    @Override // com.flybird.deploy.model.FBFullTplInfo, tb.idx
    public long toChecksum() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f76d8959", new Object[]{this})).longValue() : this.dataChecksum == null ? idy.a(String.valueOf(super.toChecksum()), this.noBundledCheckedPackageVersionName) : idy.a(String.valueOf(super.toChecksum()), this.noBundledCheckedPackageVersionName, String.valueOf(this.dataChecksum));
    }

    @Override // com.flybird.deploy.model.FBFullTplInfo
    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FBTemplateContent{noBundledCheckedPackageVersionName='");
        sb.append(this.noBundledCheckedPackageVersionName);
        sb.append('\'');
        sb.append(", dataChkSum=");
        sb.append(this.dataChecksum);
        sb.append(", tag='");
        sb.append(this.tag);
        sb.append('\'');
        sb.append(", tplId='");
        sb.append(this.tplId);
        sb.append('\'');
        sb.append(", tplVersion='");
        sb.append(this.tplVersion);
        sb.append('\'');
        sb.append(", publishVersion='");
        sb.append(this.publishVersion);
        sb.append('\'');
        sb.append(", time='");
        sb.append(this.time);
        sb.append('\'');
        sb.append(", tplHash='");
        sb.append(this.tplHash);
        sb.append('\'');
        sb.append(", data='");
        String str2 = "null";
        if (this.data == null) {
            str = str2;
        } else {
            str = this.data.length() + "chars";
        }
        sb.append(str);
        sb.append('\'');
        sb.append(", metaInfo='");
        if (this.metaInfo != null) {
            str2 = this.metaInfo.length() + "items";
        }
        sb.append(str2);
        sb.append('\'');
        sb.append(", ... }");
        return sb.toString();
    }

    public boolean verifyDataChecksumIfPreset() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("869e92d", new Object[]{this})).booleanValue();
        }
        Long l = this.dataChecksum;
        if (l == null) {
            cun.b("FBTemplateContent", "verifyDataChecksum: missing checksum");
            return true;
        }
        return idy.a(true, l.longValue(), this.data);
    }
}
