package com.taobao.live.home.dinamic.ability;

import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dkx;
import tb.dky;
import tb.dkz;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.nmf;

/* loaded from: classes7.dex */
public class e extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLFOLLOW = 2368429612251409246L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, final dle dleVar, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar != null && dlhVar.c() != null) {
            JSONObject c = dlhVar.c();
            String string = c.getString("liveFollow");
            String string2 = c.getString("accountId");
            c.getString("sourcePage");
            boolean parseBoolean = Boolean.parseBoolean(c.getString(nmf.MTOP_ISFOLLOW));
            final boolean parseBoolean2 = Boolean.parseBoolean(c.getString("notToast"));
            c.getJSONObject("extParams");
            if (TextUtils.isEmpty(string2)) {
                return new dky();
            }
            if (!Boolean.parseBoolean(string)) {
                if (parseBoolean) {
                    new com.taobao.live.home.dinamic.ability.business.a(new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.ability.TBLFollowAbility$1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                dllVar.callback("failure", new dkz());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(nmf.MTOP_ISFOLLOW, (Object) "true");
                            if (!parseBoolean2) {
                                Toast.makeText(dleVar.a(), "关注成功", 1).show();
                            }
                            dllVar.callback("success", new dla(jSONObject));
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                dllVar.callback("failure", new dkz());
                            }
                        }
                    }).a(string2);
                } else {
                    new com.taobao.live.home.dinamic.ability.business.a(new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.ability.TBLFollowAbility$2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                dllVar.callback("failure", new dkz());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(nmf.MTOP_ISFOLLOW, (Object) "false");
                            if (!parseBoolean2) {
                                Toast.makeText(dleVar.a(), "取消关注成功", 1).show();
                            }
                            dllVar.callback("success", new dla(jSONObject));
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                dllVar.callback("failure", new dkz());
                            }
                        }
                    }).b(string2);
                }
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

        public e a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("a22bfe81", new Object[]{this, obj}) : new e();
        }
    }
}
