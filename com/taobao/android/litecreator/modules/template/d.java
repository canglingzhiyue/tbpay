package com.taobao.android.litecreator.modules.template;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.File;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    static {
        kge.a(839973807);
    }

    public static /* synthetic */ void a(d dVar, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d5d6c1", new Object[]{dVar, str, aVar});
        } else {
            dVar.a(str, aVar);
        }
    }

    public void a(Context context, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd436ac9", new Object[]{this, context, aVar});
        } else {
            MtopBusiness.build(Mtop.instance((String) null, context), new UserAvatarRequestParams()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.modules.template.UserAvatarRequester$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    String retMsg = mtopResponse != null ? mtopResponse.getRetMsg() : "";
                    aVar.a("mtop_system_error", retMsg);
                    u.d("LC_UserAvatarRequester", "mtop_system_error " + retMsg);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    u.b("LC_UserAvatarRequester", "onSuccess " + mtopResponse.toString());
                    if (mtopResponse.getDataJsonObject() != null) {
                        try {
                            d.a(d.this, mtopResponse.getDataJsonObject().getString("avatar"), aVar);
                            return;
                        } catch (JSONException e) {
                            aVar.a("json_parse_error", e.getMessage());
                            return;
                        }
                    }
                    aVar.a("mtop_error", "response is empty");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    String retMsg = mtopResponse != null ? mtopResponse.getRetMsg() : "";
                    aVar.a("mtop_error", retMsg);
                    u.d("LC_UserAvatarRequester", "mtop_error " + retMsg);
                }
            }).startRequest();
        }
    }

    private void a(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268ac237", new Object[]{this, str, aVar});
            return;
        }
        final String a2 = a(str);
        if (k.a(a2)) {
            aVar.a(a2);
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.litecreator.modules.template.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                        com.taobao.android.litecreator.util.c.a(succPhenixEvent.getDrawable().getBitmap(), a2);
                        aVar.a(a2);
                    } else {
                        aVar.a("get bitmap fail", Constants.ErrorDesc.downloadError);
                        TLog.loge("LC", "preloadUserHeadPic Fail ,download error");
                    }
                    return true;
                }
            }).fetch();
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String str2 = Globals.getApplication().getCacheDir() + File.separator + "guangguang";
        k.g(str2);
        if (TextUtils.isEmpty(str)) {
            return str2 + File.separator + "user_head_default.jpg";
        }
        return str2 + File.separator + "user_head_" + str.hashCode() + ".jpg";
    }
}
