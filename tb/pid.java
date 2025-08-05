package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public class pid extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_ROOM_SET_FAVORITE = -5524427611287014876L;

    static {
        kge.a(1108887628);
    }

    public static /* synthetic */ Object ipc$super(pid pidVar, String str, Object... objArr) {
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
    public void handleEvent(DXEvent dXEvent, Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0 || (videoInfo = (VideoInfo) pqj.a(((JSONObject) objArr[0]).toJSONString(), VideoInfo.class)) == null || videoInfo.broadCaster == null) {
        } else {
            pmp pmpVar = new pmp();
            pmpVar.f32762a = videoInfo.broadCaster.accountId;
            pmd.a().C().a(pmpVar, new pms() { // from class: tb.pid.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pms
                public void a(pmq pmqVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9e81444", new Object[]{this, pmqVar});
                        return;
                    }
                    aj.a(dXRuntimeContext.m(), dXRuntimeContext.m().getString(R.string.taolive_user_favorite_success));
                    ddw.a().a(xkw.EVENT_CLOSE_FAVORITE_GUIDE_DIALOG, null, (phg.b() == null || phg.b().a() == null) ? null : phg.b().a().G());
                }

                @Override // tb.pms
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        aj.a(dXRuntimeContext.m(), str2);
                    }
                }
            });
            phg.a().a("LayerThickness_Favor", new String[0]);
        }
    }
}
