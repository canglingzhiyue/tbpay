package tb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess.OrderFinishedBroadcastReceiver;

@AURAExtensionImpl(code = "tbbuy.impl.nextrpc.infoFlow.preload")
/* loaded from: classes6.dex */
public final class icy extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f28918a;

    static {
        kge.a(304968585);
    }

    public static /* synthetic */ Object ipc$super(icy icyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.asf, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f28918a = qVar;
        }
    }

    @Override // tb.asf, tb.asg
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{this, aVar});
        } else if (!aVar.d()) {
        } else {
            a(aVar.f());
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (bau.a(jSONObject)) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (bau.a(jSONObject2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            String string = jSONObject2.getString(FullPage.PARAM_BACK2Tab2URL);
            if (StringUtils.isEmpty(string)) {
                return;
            }
            jSONObject3.put(FullPage.PARAM_BACK2Tab2URL, (Object) string);
            a(this.f28918a.e(), jSONObject3.toJSONString());
        }
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(OrderFinishedBroadcastReceiver.ACTION_ORDER_DID_FINISHED);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("params", str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
