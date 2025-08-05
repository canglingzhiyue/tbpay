package com.taobao.tbliveinteractive.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolivecontainer.TBLiveWebView;
import com.taobao.tbliveinteractive.business.tradetrack.MtopContentlivekitComponentTradeTrackResponse;
import com.taobao.tbliveinteractive.business.tradetrack.b;
import java.util.HashMap;
import tb.kge;
import tb.pqq;
import tb.qnb;
import tb.qne;
import tb.sem;

/* loaded from: classes8.dex */
public class TaoLiveTradeTrack extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1146586002);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveTradeTrack taoLiveTradeTrack, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        final com.taobao.tbliveinteractive.container.h5.e eVar = new com.taobao.tbliveinteractive.container.h5.e(str, str2, wVCallBackContext);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1165330890) {
            if (hashCode == 743269003 && str.equals("getTradeSign")) {
                c = 1;
            }
        } else if (str.equals("requestTradeTrack")) {
            c = 0;
        }
        if (c == 0) {
            HashMap hashMap = (HashMap) qnb.a(str2);
            if (hashMap != null && qne.p()) {
                String str3 = (String) hashMap.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                String str4 = (String) hashMap.get("itemId");
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    new com.taobao.tbliveinteractive.business.tradetrack.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.tbliveinteractive.jsbridge.TaoLiveTradeTrack.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                            } else if (!(netBaseOutDo instanceof MtopContentlivekitComponentTradeTrackResponse)) {
                            } else {
                                eVar.a(((MtopContentlivekitComponentTradeTrackResponse) netBaseOutDo).mo1437getData());
                            }
                        }

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                            } else {
                                eVar.b();
                            }
                        }

                        @Override // com.taobao.taolive.sdk.adapter.network.d
                        public void onSystemError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                            } else {
                                eVar.b();
                            }
                        }
                    }).a(str3, str4, (String) hashMap.get("spmUrl"), (String) hashMap.get("entrySpm"), (String) hashMap.get(pqq.KEY_LIVE_SOURCE), (String) hashMap.get("entryLiveSource"), (String) hashMap.get("sign"));
                    return true;
                }
            }
            eVar.b();
            return false;
        } else if (c == 1) {
            e liveApiEngine = getLiveApiEngine();
            if (liveApiEngine != null && liveApiEngine.a() != null) {
                if (liveApiEngine.a().a(new b.a() { // from class: com.taobao.tbliveinteractive.jsbridge.TaoLiveTradeTrack.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tbliveinteractive.business.tradetrack.b.a
                    public void a(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str5});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("result", (Object) str5);
                        eVar.a(jSONObject.toJSONString());
                    }
                })) {
                    return true;
                }
                eVar.b();
                return false;
            }
            eVar.b();
            return false;
        } else {
            eVar.b();
            return false;
        }
    }

    private e getLiveApiEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9f14ed30", new Object[]{this});
        }
        if (!(this.mWebView instanceof TBLiveWebView)) {
            return null;
        }
        Object webViewToken = ((TBLiveWebView) this.mWebView).getWebViewToken();
        if (!(webViewToken instanceof sem)) {
            return null;
        }
        return ((sem) webViewToken).a();
    }
}
