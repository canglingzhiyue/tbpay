package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.utils.d;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pgb extends sig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_TIMESHIFT_CUSTOM = -2907519151949712733L;

    static {
        kge.a(-1976656228);
    }

    public static /* synthetic */ Object ipc$super(pgb pgbVar, String str, Object... objArr) {
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

    @Override // tb.sig
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624b20cd", new Object[]{this, dXEvent, objArr, dXRuntimeContext, aVar});
            return;
        }
        LiveTimemovingModel liveTimemovingModel = null;
        try {
            if (objArr[0] != null && !StringUtils.isEmpty(objArr[0].toString())) {
                liveTimemovingModel = (LiveTimemovingModel) pqj.a(((JSONObject) objArr[0]).toJSONString(), LiveTimemovingModel.class);
            }
            String str = (String) objArr[1];
            Context m = dXRuntimeContext.m();
            pfb a2 = pfb.a(aVar);
            if ("addToCard".equals(str) && liveTimemovingModel != null) {
                com.taobao.taolive.movehighlight.utils.a.a(liveTimemovingModel, m, aVar);
            } else if ("goToDetail".equals(str) && liveTimemovingModel != null) {
                com.taobao.taolive.movehighlight.utils.a.b(liveTimemovingModel, m, aVar);
            } else if ("rightInfoAction".equals(str) && liveTimemovingModel != null) {
                if (a2.e() == null) {
                    return;
                }
                a2.e().a(liveTimemovingModel);
            } else if ("backtoLive".equals(str)) {
                if (a2.c() == null) {
                    return;
                }
                a2.c().a();
            } else if ("normalCardClick".equals(str)) {
                int intValue = ((Integer) objArr[2]).intValue();
                if (liveTimemovingModel == null || a2.e() == null || a2.e().b() == null) {
                    return;
                }
                a2.e().b().a(liveTimemovingModel, intValue, dXRuntimeContext);
            } else if ("goPlaybackButton".equals(str)) {
                String str2 = (String) objArr[2];
                if (!StringUtils.isEmpty(str2)) {
                    d.a(str2, aVar);
                    return;
                }
                VideoInfo u = poy.u(aVar);
                if (u == null || StringUtils.isEmpty(u.liveId)) {
                    return;
                }
                d.a(u.liveId, aVar);
            } else if ("unsubscribe".equals(str)) {
                if (a2.c() == null) {
                    return;
                }
                a2.c().c();
            } else if ("subscribe".equals(str)) {
                if (a2.c() == null) {
                    return;
                }
                a2.c().b();
            } else if ("jumpUrl".equals(str)) {
                if (liveTimemovingModel == null || l.e(liveTimemovingModel.collectUrl)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("collection_name", liveTimemovingModel.collectName);
                o.a(aVar, "timemove_collection_click", (Map<String, String>) hashMap);
                Nav.from(dXRuntimeContext.m()).toUri(liveTimemovingModel.collectUrl);
            } else if ("showGoodsListAction".equals(str)) {
                if (a2.l() == null) {
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("glopenfrom", "timemoveclass_simple");
                a2.l().o(aVar, hashMap2);
            } else if ("subscribeItem".equals(str)) {
                if (a2.e() == null) {
                    return;
                }
                a2.e().a(liveTimemovingModel, dXRuntimeContext);
            } else if ("cliclShowButton".equals(str)) {
                ibr.a(dXRuntimeContext.m(), aVar);
            } else if (!"clickMuteButton".equals(str) || a2.e() == null) {
            } else {
                a2.e().a(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
