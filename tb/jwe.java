package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.message_open_api.core.IObserver;
import com.taobao.message.message_open_api.util.CallUtil;

/* loaded from: classes4.dex */
public class jwe extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TOPICSUBSCRIBE = 3011044036626969295L;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29826a;

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f29826a;
    }

    static {
        kge.a(15436885);
        f29826a = jwe.class.getSimpleName();
    }

    public jwe() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.floatView.TopicSubscribeAbility");
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
            Uri.Builder buildUpon = Uri.parse("openapi://" + epw.a(string)).buildUpon();
            buildUpon.appendQueryParameter("data", jSONObject);
            String builder = buildUpon.toString();
            String str = f29826a;
            i.d(str, "url : " + Uri.decode(builder));
            CallUtil.callFromUrl(dleVar.a(), builder, new IObserver<SubScribeCenterResultDTO>() { // from class: tb.jwe.1
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
                    String d = jwe.d();
                    i.d(d, "onNext : " + parseObject.toString());
                    dllVar.callback("dataCallback", new dla(parseObject));
                }

                public void onError(CallException callException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6bd57c7", new Object[]{this, callException});
                        return;
                    }
                    String d = jwe.d();
                    i.a(d, "onError : " + callException.toString());
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
            String str2 = f29826a;
            i.a(str2, "onError : " + e.toString());
            dllVar.callback("onError", new dla());
        }
        return new dla();
    }

    /* loaded from: classes4.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1711325652);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public jwe a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jwe) ipChange.ipc$dispatch("16bcea0a", new Object[]{this, obj}) : new jwe();
        }
    }
}
