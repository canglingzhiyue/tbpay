package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.IObserver;
import com.taobao.message.message_open_api.util.CallUtil;

/* loaded from: classes4.dex */
public class kxe extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ABILITY_ID;
    public static final String MEGA_NAME = "abilityHub";
    public static final String NAME = "topicSubscribe";

    static {
        kge.a(-1560960929);
        DX_ABILITY_ID = fxa.a(NAME);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dlhVar == null || dlhVar.c() == null) {
            return new dkw(new dkv(90030, "params is null"), true);
        }
        try {
            JSONObject c = dlhVar.c();
            String string = c.getString("dataAPI");
            String jSONObject = c.getJSONObject("data").toString();
            StringBuilder sb = new StringBuilder();
            sb.append("openapi://");
            if (StringUtils.isEmpty(string)) {
                string = "";
            }
            sb.append(string);
            Uri.Builder buildUpon = Uri.parse(sb.toString()).buildUpon();
            buildUpon.appendQueryParameter("data", jSONObject);
            String builder = buildUpon.toString();
            i.a("TopicSubscribeAbility", "url : " + Uri.decode(builder));
            CallUtil.callFromUrl(dleVar.a(), builder, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.kxe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public /* synthetic */ void onNext(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    } else {
                        a((SubScribeCenterResultDTO) obj);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    JSONObject parseObject = JSONObject.parseObject(JSONObject.toJSONString(subScribeCenterResultDTO));
                    i.a("TopicSubscribeAbility", "onNext : " + parseObject.toString());
                    dllVar.callback("dataCallback", new dla(parseObject));
                }

                public void onError(CallException callException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6bd57c7", new Object[]{this, callException});
                        return;
                    }
                    i.a("TopicSubscribeAbility", "onError : ", callException);
                    dllVar.callback("onError", new dla());
                }

                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    } else {
                        dllVar.callback("onComplete", new dla());
                    }
                }
            });
        } catch (Exception e) {
            i.a("TopicSubscribeAbility", "onError : ", e);
            dllVar.callback("onError", new dla());
        }
        return new dla();
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1251891146);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public kxe a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kxe) ipChange.ipc$dispatch("16bd622a", new Object[]{this, obj}) : new kxe();
        }
    }
}
