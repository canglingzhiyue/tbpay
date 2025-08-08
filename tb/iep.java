package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;

/* loaded from: classes6.dex */
public class iep extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_LOPENCHANNEL = -4425606707209420349L;

    static {
        kge.a(-329972002);
    }

    public static /* synthetic */ Object ipc$super(iep iepVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 1 || dXRuntimeContext.m() == null || (jSONObject = (JSONObject) objArr[0]) == null) {
        } else {
            if (jSONObject.get("channelId") != null) {
                JSONObject jSONObject3 = (JSONObject) objArr[1];
                if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(d.CLICK_MAIDIAN)) != null && jSONObject2.get("params") != null) {
                    String string = jSONObject3.getString("trackInfo");
                    if (!StringUtils.isEmpty(string)) {
                        String string2 = jSONObject2.getString("name");
                        g.a(string2, jSONObject2.getString("params") + ",trackInfo=" + string);
                    } else {
                        g.a(jSONObject2.getString("name"), jSONObject2.getString("params"));
                    }
                }
                mfl.a(dXRuntimeContext.m(), "https://h5.m.taobao.com/live/channel.html?channelId=" + jSONObject.getIntValue("channelId") + "&title=" + jSONObject.getString("channelTitle") + "&feedId=" + jSONObject.getString("feedId") + "&itemId=" + jSONObject.getString("itemId"));
                return;
            }
            g.a(k.CLICK_CHANNEL, "all=true,spm-cnt=a2141.8001240");
            mfg.a().b("com.taobao.taolive.homepage.open.sub.channel.list");
        }
    }
}
