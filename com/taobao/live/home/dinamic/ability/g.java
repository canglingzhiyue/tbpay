package com.taobao.live.home.dinamic.ability;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
import tb.arz;
import tb.dkx;
import tb.dky;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;

/* loaded from: classes7.dex */
public class g extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLSUBSCRIBE = -4209146844715361136L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public interface b {
        void a();

        void a(JSONObject jSONObject);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar != null && dlhVar.c() != null) {
            JSONObject c = dlhVar.c();
            String string = c.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
            String string2 = c.getString("subFrom");
            String string3 = c.getString("activityType");
            boolean parseBoolean = Boolean.parseBoolean(c.getString("isSubscribe"));
            if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3)) {
                return new dky();
            }
            if (parseBoolean) {
                a(string, string2, string3, new b() { // from class: com.taobao.live.home.dinamic.ability.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.live.home.dinamic.ability.g.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("isSubscribe", (Object) "true");
                        dllVar.callback("success", new dla(jSONObject));
                    }

                    @Override // com.taobao.live.home.dinamic.ability.g.b
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        } else {
                            dllVar.callback("failure", new dla(jSONObject));
                        }
                    }
                });
            } else {
                b(string, string2, string3, new b() { // from class: com.taobao.live.home.dinamic.ability.g.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.live.home.dinamic.ability.g.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("isSubscribe", (Object) "false");
                        dllVar.callback("success", new dla(jSONObject));
                    }

                    @Override // com.taobao.live.home.dinamic.ability.g.b
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        } else {
                            dllVar.callback("failure", new dla(jSONObject));
                        }
                    }
                });
            }
        }
        return new dky();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public g a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a22bfebf", new Object[]{this, obj}) : new g();
        }
    }

    private static void a(String str, String str2, String str3, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a089835", new Object[]{str, str2, str3, bVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            SubscribeUtils.INSTANCE.doSubscribe(str, str3, null, str2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.live.home.dinamic.ability.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    String str4 = "subscribeLiveTopic onNext getRetCode = " + subScribeCenterResultDTO.getRetCode();
                    if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                        b bVar2 = b.this;
                        if (bVar2 == null) {
                            return;
                        }
                        try {
                            bVar2.a();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("retCode", (Object) subScribeCenterResultDTO.getRetCode());
                    jSONObject.put(arz.KEY_RET_MSG, (Object) subScribeCenterResultDTO.getRetMsg());
                    b.this.a(jSONObject);
                }
            });
        }
    }

    private static void b(String str, String str2, String str3, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8313e3b6", new Object[]{str, str2, str3, bVar});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
        } else {
            SubscribeUtils.INSTANCE.cancelSubscribe(str, str3, null, str2, new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.live.home.dinamic.ability.g.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    String str4 = "cancelSubscribe onNext getRetCode = " + subScribeCenterResultDTO.getRetCode();
                    if ("SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                        b bVar2 = b.this;
                        if (bVar2 == null) {
                            return;
                        }
                        try {
                            bVar2.a();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("retCode", (Object) subScribeCenterResultDTO.getRetCode());
                    jSONObject.put(arz.KEY_RET_MSG, (Object) subScribeCenterResultDTO.getRetMsg());
                    b.this.a(jSONObject);
                }
            });
        }
    }
}
