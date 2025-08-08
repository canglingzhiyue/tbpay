package com.tmall.android.dai.internal.usertrack;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.internal.util.f;
import com.tmall.android.dai.internal.util.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.rkq;
import tb.rkr;

/* loaded from: classes9.dex */
public class c extends com.ut.mini.module.plugin.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f23709a = a();

    static {
        kge.a(914362410);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1666655856) {
            return super.onEventDispatch((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3], (String) objArr[4]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ut.mini.module.plugin.a
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : com.tmall.android.dai.trigger.b.CONFIG_GROUP_WALLE;
    }

    private Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("SDKTYPE");
        hashSet.add("PAGE");
        hashSet.add("ARG1");
        hashSet.add("ARG2");
        hashSet.add("ARG3");
        hashSet.add("EVENTID");
        hashSet.add("_priority");
        return hashSet;
    }

    public c() {
        b.a();
    }

    @Override // com.ut.mini.module.plugin.a
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this}) : rkq.d().i();
    }

    public Map<String, String> a(String str, int i, String str2, String str3, String str4, Map<String, String> map, DAICallback dAICallback) {
        HashMap<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("305d34c7", new Object[]{this, str, new Integer(i), str2, str3, str4, map, dAICallback});
        }
        try {
        } catch (Throwable th) {
            com.taobao.mrt.utils.a.b("UserTrackPlugin", th.getMessage(), th);
        }
        if (!rkq.d().h()) {
            return super.onEventDispatch(str, i, str2, str3, str4);
        }
        UserTrackDO userTrackDO = new UserTrackDO();
        userTrackDO.setPageName(str);
        userTrackDO.setEventId(i);
        userTrackDO.setArg1(str2);
        userTrackDO.setArg2(str3);
        userTrackDO.setArg3(str4);
        if (i == 2001) {
            userTrackDO.setPageStayTime(h.a(str4, 0L));
        }
        if (map != null) {
            HashMap hashMap = new HashMap();
            String str5 = map.get("ARGS");
            if (!StringUtils.isEmpty(str5) && (a2 = f.a(str5, ",", "=", true)) != null) {
                userTrackDO.setAuctionId(h.a(a2.get("item_id"), 0L));
                hashMap.putAll(a2);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!this.f23709a.contains(entry.getKey())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            userTrackDO.setArgs(hashMap);
            if (userTrackDO.getAuctionId() <= 0) {
                userTrackDO.setAuctionId(h.a(map.get("item_id"), 0L));
            }
        }
        userTrackDO.setCreateTime(System.currentTimeMillis());
        if (rkr.a() != null) {
            userTrackDO.setOwnerId(rkr.a().getUserId());
        }
        b.a().a(userTrackDO);
        return super.onEventDispatch(str, i, str2, str3, str4);
    }

    @Override // com.ut.mini.module.plugin.a
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map}) : a(str, i, str2, str3, str4, map, null);
    }
}
