package com.taobao.tao.channel;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.d;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.obg;

/* loaded from: classes8.dex */
public class ShareToChannelHandler implements obg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUSTOM_COPY_KEY = "customCopy";
    private static final String TAG = "ShareToChannelHandler";
    private static final String TYPE_KEY = "type";

    static {
        kge.a(-2075521931);
        kge.a(-763908423);
    }

    @Override // tb.obg.a
    public void shareToChannel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1bc2000", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("type");
        String string2 = jSONObject.getString(CUSTOM_COPY_KEY);
        com.taobao.share.ui.engine.structure.a channelView = getChannelView(string);
        if (channelView == null) {
            return;
        }
        channelView.c = jSONObject;
        if (channelView.d().j()) {
            com.taobao.share.taopassword.constants.a.c = StringUtils.equals("true", string2);
        } else {
            com.taobao.share.taopassword.constants.a.b = StringUtils.equals("true", string2);
        }
        ((com.taobao.tao.sharepanel.weex.a) ShareBizAdapter.getInstance().getShareEngine().mo1241getCurSharePanel()).getShareActionDispatcher().a(new d(channelView.c().desc, channelView), ShareBizAdapter.getInstance().getAppEnv().b(), 0);
    }

    private com.taobao.share.ui.engine.structure.a getChannelView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.ui.engine.structure.a) ipChange.ipc$dispatch("93050c72", new Object[]{this, str});
        }
        List<com.taobao.share.globalmodel.b> b = b.a().b();
        if (b == null) {
            return null;
        }
        Iterator<com.taobao.share.globalmodel.b> it = b.iterator();
        while (it.hasNext()) {
            com.taobao.share.ui.engine.structure.a aVar = (com.taobao.share.ui.engine.structure.a) it.next();
            if (StringUtils.equals(aVar.d().c(), str)) {
                return aVar;
            }
        }
        return null;
    }
}
