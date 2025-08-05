package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public class pes {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FULL_LINK_SPLIT = ":";
    public static final String SOURCE_CDN = "cdn";
    public static final int SOURCE_INDEX_CDN = 1;
    public static final int SOURCE_INDEX_MTOP = 3;
    public static final int SOURCE_INDEX_PM = 2;
    public static final int SOURCE_INDEX_PROVIDER = 100;
    public static final String SOURCE_MTOP = "MTOP";
    public static final String SOURCE_PM = "pm";
    private Map<Integer, Integer> b;
    private HashSet<String> c = new HashSet<>();
    private boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Integer> f32576a = new HashMap();

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        pex.a("FullLinkManager", "SetStopReport stopSaveReport: " + this.d);
    }

    public pes(Map<Integer, Integer> map) {
        this.b = map;
    }

    public boolean a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba950b", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        Integer num = this.f32576a.get(Integer.valueOf(i));
        if (num == null) {
            num = this.b.get(Integer.valueOf(i));
        }
        if (num != null && !TextUtils.isEmpty(str)) {
            if (Math.abs((str2 + str).hashCode()) % 100000 < num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public void a(int i, String str, TLiveMsg tLiveMsg, pee peeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e073e4", new Object[]{this, new Integer(i), str, tLiveMsg, peeVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msgStep", String.valueOf(i));
        hashMap.put("msgSource", str);
        hashMap.put(RemoteMessageConst.MSGID, tLiveMsg.messageId);
        hashMap.put("msgSubtype", String.valueOf(tLiveMsg.type));
        String valueOf = String.valueOf(pmd.a().w().a());
        hashMap.put("timestamp", valueOf);
        hashMap.put("bizCode", String.valueOf(peeVar.d));
        hashMap.put("topic", peeVar.e);
        hashMap.put("channel", peeVar.f);
        hashMap.put("from", peeVar.g);
        hashMap.put("deviceId", peeVar.c);
        if (tLiveMsg.sendFullTags) {
            if (peeVar.b.s && pmd.a().e() != null) {
                pmd.a().e().a("Page_TaobaoLiveWatch", "LiveMessageSDK_fullLink", hashMap);
            }
            a(i, tLiveMsg.messageId, tLiveMsg.type, valueOf);
        }
        String str2 = null;
        try {
            str2 = JSON.toJSONString(hashMap);
        } catch (Exception unused) {
        }
        pex.a("FullLinkManager", "subType: " + tLiveMsg.type + " colorRate: " + this.f32576a.get(Integer.valueOf(tLiveMsg.type)) + " msg.sendFullTags: " + tLiveMsg.sendFullTags + " trackFullLink: " + str2);
    }

    private synchronized void a(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41448148", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
            return;
        }
        pex.a("FullLinkManager", "trackFullLinkJson stopSaveReport: " + this.d);
        if (!this.d) {
            HashSet<String> hashSet = this.c;
            hashSet.add(i + ":" + str + ":" + i2 + ":" + str2);
        }
    }

    public synchronized HashSet<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("be7f2185", new Object[]{this});
        }
        HashSet<String> hashSet = this.c;
        this.c = new HashSet<>();
        pex.a("FullLinkManager", "getTrackFullLinkJson: " + hashSet);
        return hashSet;
    }

    public void a(Map<Integer, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f32576a.putAll(map);
        }
    }
}
