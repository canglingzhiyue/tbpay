package com.taobao.taolive.sdk.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.pnn;
import tb.pqj;
import tb.qnb;
import tb.tih;
import tb.tii;
import tb.tjv;
import tb.tmc;

/* loaded from: classes8.dex */
public class TBLiveGlobalWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";

    static {
        kge.a(-364374941);
    }

    public static /* synthetic */ Object ipc$super(TBLiveGlobalWVPlugin tBLiveGlobalWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        com.taobao.tbliveinteractive.container.h5.e eVar = new com.taobao.tbliveinteractive.container.h5.e(str, str2, wVCallBackContext);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2028796003) {
            if (hashCode != -378835195) {
                if (hashCode == 338667365 && str.equals("stopSubscribePM")) {
                    c = 2;
                }
            } else if (str.equals("startSubscribePM")) {
                c = 1;
            }
        } else if (str.equals("preloadLiveMediaInfo")) {
            c = 0;
        }
        if (c == 0) {
            if (!tmc.c()) {
                eVar.a(new r("Orange Close"));
                return true;
            }
            JSONObject b = pqj.b(str2);
            if (b != null && b.containsKey("url")) {
                String string = b.getString("url");
                tlog("", "直播间预创建：" + string);
                tjv.a().a(this.mContext, string);
                wVCallBackContext.success();
                return true;
            }
            wVCallBackContext.error(new r("no url"));
            return true;
        } else if (c == 1) {
            tlog("startSubscribePM", str2);
            String startSubscribePM = startSubscribePM(pqj.b(str2));
            if (startSubscribePM != null) {
                r rVar = new r();
                rVar.a("pmSession", startSubscribePM);
                eVar.a(rVar);
            } else {
                eVar.b("startSubscribePM fail");
                tlog("startSubscribePM", "SubscribePM Failure openPmSession=" + startSubscribePM);
            }
            return true;
        } else if (c == 2) {
            tlog("stopSubscribePM", str2);
            JSONObject b2 = pqj.b(str2);
            if (b2 != null && b2.containsKey("pmSession")) {
                tih.a(b2.getString("pmSession"));
                eVar.a();
                return true;
            }
            eVar.b("stopSubscribePM fail");
            tlog("stopSubscribePM", "parseObject fail");
            return false;
        } else {
            eVar.a(NO_FUNCTION);
            return true;
        }
    }

    private String startSubscribePM(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("979c05bc", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("channel");
            boolean equals = "1".equals(jSONObject.getString("roomStatus"));
            if (jSONObject.getString("roomStatus") != null && !equals) {
                return null;
            }
            String string2 = jSONObject.getString("topic");
            String string3 = jSONObject.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                final Map<String, String> a2 = qnb.a(jSONObject);
                tii tiiVar = new tii(string, equals, string2, string3, new pnn() { // from class: com.taobao.taolive.sdk.jsbridge.TBLiveGlobalWVPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pnn
                    public Map<String, String> getHeartParams() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("ab918d32", new Object[]{this}) : a2;
                    }
                });
                String string4 = jSONObject.getString("subscriberDelay");
                if (string4 != null) {
                    try {
                        tiiVar.g = Integer.parseInt(string4);
                    } catch (NumberFormatException e) {
                        tlog("startSubscribePM", e.getMessage());
                    }
                }
                return tih.d(tiiVar);
            }
        }
        return null;
    }

    private void tlog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{this, str, str2});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a("TBLiveGlobalWVPlugin" + str, str2);
        }
    }
}
