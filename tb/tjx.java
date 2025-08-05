package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.a;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;

/* loaded from: classes8.dex */
public class tjx implements tnk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1601672647);
        kge.a(-1844543642);
    }

    @Override // tb.tnk
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        tno tnoVar = new tno();
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("id");
        if (!tnn.a().c(queryParameter)) {
            tnn.a().b(context, queryParameter);
            return;
        }
        JSONObject b = pqj.b(parse.getQueryParameter(aw.PARAM_CUSTOM_PLAY_CTRL));
        if (b == null) {
            return;
        }
        MediaData a2 = a.a(b);
        tnoVar.f34232a = queryParameter;
        tnoVar.b = a2;
        f a3 = new tla().a(context, a2);
        if (a3 != null) {
            tnoVar.c = a3.L();
        }
        tnn.a().a(queryParameter, tnoVar);
    }
}
